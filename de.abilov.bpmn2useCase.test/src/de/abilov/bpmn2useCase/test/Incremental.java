package de.abilov.bpmn2useCase.test;

import java.util.Optional;
import java.util.function.Consumer;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EObject;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.moflon.testframework.tgg.IncrementalIntegratorTest;

import de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage;
import de.abilov.bpmn.SequenceFlow;
import de.abilov.bpmn.BpmnFactory;
import de.abilov.bpmn.BpmnPackage;
import de.abilov.bpmn.StartEvent;
import de.abilov.bpmn.Task;
import de.abilov.bpmn.EndEvent;
import de.abilov.bpmn.FlowElement;
import de.abilov.bpmn.ParallelGateway;
import de.abilov.bpmn.Process;
import de.abilov.useCase.UseCasePackage;
import de.abilov.useCase.UseCase;
import TGGLanguage.algorithm.ApplicationTypes;
import de.abilov.bpmn.util.SynchronizationHelper;
import de.abilov.model.compare.IComparator;

public class Incremental extends IncrementalIntegratorTest {
	public Incremental() {
		super(BpmnPackage.eINSTANCE, Bpmn2useCasePackage.eINSTANCE, UseCasePackage.eINSTANCE);
	}

	@BeforeClass
	public static void logging() {
		BasicConfigurator.configure();
	}

	@Override
	public void compare(EObject expected, EObject actual) throws InterruptedException {
		IComparator comparator = new de.abilov.model.compare.str.Comparator();
		Assert.assertEquals(true, comparator.compare(expected, actual));
	}

	@Test
	public void deltaTask() throws InterruptedException {
		delta("DeltaTask", root -> {
			Process proc = (Process) root;
			Optional<FlowElement> fe = proc.getFlowElements().stream().filter(f -> f instanceof StartEvent).findAny();
			if (!fe.isPresent())
				return;

			StartEvent se = (StartEvent) fe.get();
			SequenceFlow sf1 = se.getOutgoing().get(0);

			SequenceFlow sf2 = BpmnFactory.eINSTANCE.createSequenceFlow();
			sf2.setId("sf2");
			proc.getFlowElements().add(sf2);

			Task t1 = BpmnFactory.eINSTANCE.createTask();
			t1.setId("t1");
			proc.getFlowElements().add(t1);

			sf2.setSourceRef(t1);
			sf2.setTargetRef(sf1.getTargetRef());

			sf1.setTargetRef(t1);
		});
	}

	@Test
	public void deltaParallel() throws InterruptedException {
		delta("DeltaParallel", root -> {
			Process proc = (Process) root;
			Optional<FlowElement> fe = proc.getFlowElements().stream().filter(f -> f instanceof Task).findAny();
			if (!fe.isPresent())
				return;

			Task t1 = (Task) fe.get();
			SequenceFlow sf2 = t1.getOutgoing().get(0);
			EndEvent ee1 = (EndEvent) sf2.getTargetRef();

			ParallelGateway pg1 = BpmnFactory.eINSTANCE.createParallelGateway();
			pg1.setId("pg1");
			pg1.setIsDiverging(true);
			proc.getFlowElements().add(pg1);
			sf2.setTargetRef(pg1);

			SequenceFlow sf3 = BpmnFactory.eINSTANCE.createSequenceFlow();
			sf3.setId("sf3");
			proc.getFlowElements().add(sf3);
			sf3.setSourceRef(pg1);

			Task t2 = BpmnFactory.eINSTANCE.createTask();
			t2.setId("t2");
			proc.getFlowElements().add(t2);
			sf3.setTargetRef(t2);

			SequenceFlow sf4 = BpmnFactory.eINSTANCE.createSequenceFlow();
			sf4.setId("sf4");
			proc.getFlowElements().add(sf4);
			sf4.setSourceRef(t2);

			ParallelGateway pcg1 = BpmnFactory.eINSTANCE.createParallelGateway();
			pcg1.setId("pcg1");
			pcg1.setIsDiverging(false);
			proc.getFlowElements().add(pcg1);
			sf4.setTargetRef(pcg1);

			SequenceFlow sf5 = BpmnFactory.eINSTANCE.createSequenceFlow();
			sf5.setId("sf5");
			proc.getFlowElements().add(sf5);
			sf5.setSourceRef(pcg1);
			sf5.setTargetRef(ee1);

			// pre-process
			SynchronizationHelper.discoverConverging(proc);
		});
	}

	@Test
	public void deltaThread() throws InterruptedException {
		delta("DeltaThread", root -> {
			Process proc = (Process) root;
			Optional<FlowElement> fe1 = proc.getFlowElements().stream()
					.filter(f -> f instanceof ParallelGateway && ((ParallelGateway) f).isIsDiverging()).findAny();
			Optional<FlowElement> fe2 = proc.getFlowElements().stream()
					.filter(f -> f instanceof ParallelGateway && !((ParallelGateway) f).isIsDiverging()).findAny();
			if (!fe1.isPresent() || !fe2.isPresent())
				return;
			ParallelGateway pg = (ParallelGateway) fe1.get();
			ParallelGateway pcg = (ParallelGateway) fe2.get();

			SequenceFlow sf6 = BpmnFactory.eINSTANCE.createSequenceFlow();
			sf6.setId("sf6");
			sf6.setSourceRef(pg);
			proc.getFlowElements().add(sf6);

			Task t3 = BpmnFactory.eINSTANCE.createTask();
			t3.setId("t3");
			proc.getFlowElements().add(t3);
			sf6.setTargetRef(t3);

			SequenceFlow sf7 = BpmnFactory.eINSTANCE.createSequenceFlow();
			sf7.setId("sf7");
			sf7.setSourceRef(t3);
			sf7.setTargetRef(pcg);
			proc.getFlowElements().add(sf7);

			// pre-process
			SynchronizationHelper.discoverConverging(proc);
		});
	}

	@Test
	public void deltaTaskInThread() throws InterruptedException {
		delta("DeltaTaskInThread", root -> {
			Process proc = (Process) root;
			Optional<FlowElement> feSF7 = proc.getFlowElements().stream()
					.filter(f -> f instanceof SequenceFlow
							&& ((SequenceFlow) f).getTargetRef() instanceof ParallelGateway
							&& !((ParallelGateway) ((SequenceFlow) f).getTargetRef()).isIsDiverging()
							&& ((SequenceFlow) f).getSourceRef() instanceof Task
							&& ((Task) ((SequenceFlow) f).getSourceRef()).getId().equalsIgnoreCase("t3"))
					.findAny();
			Optional<FlowElement> feSF5 = proc.getFlowElements().stream()
					.filter(f -> f instanceof SequenceFlow && ((SequenceFlow) f).getTargetRef() instanceof EndEvent)
					.findAny();
			if (!feSF7.isPresent() || !feSF5.isPresent())
				return;
			SequenceFlow sf7 = (SequenceFlow) feSF7.get();
			ParallelGateway pcgw = (ParallelGateway) sf7.getTargetRef();

			SequenceFlow sf5 = (SequenceFlow) feSF5.get();
			EndEvent ee = (EndEvent) sf5.getTargetRef();

			Task t4 = BpmnFactory.eINSTANCE.createTask();
			t4.setId("t4");
			sf7.setTargetRef(t4);
			proc.getFlowElements().add(t4);

			SequenceFlow sf8 = BpmnFactory.eINSTANCE.createSequenceFlow();
			sf8.setId("sf8");
			sf8.setSourceRef(t4);
			sf8.setTargetRef(pcgw);
			proc.getFlowElements().add(sf8);

			Task t5 = BpmnFactory.eINSTANCE.createTask();
			t5.setId("t5");
			sf5.setTargetRef(t5);
			proc.getFlowElements().add(t5);

			SequenceFlow sf9 = BpmnFactory.eINSTANCE.createSequenceFlow();
			sf9.setId("sf9");
			sf9.setSourceRef(t5);
			sf9.setTargetRef(ee);
			proc.getFlowElements().add(sf9);

			// pre-process
			SynchronizationHelper.discoverConverging(proc);
		});
	}

	private void delta(String testCaseName, final Consumer<EObject> changeSrc) throws InterruptedException {
		setInputModel(ApplicationTypes.BACKWARD, testCaseName);
		de.abilov.useCase.util.SynchronizationHelper.preprocess((UseCase) helper.getTrg());

		helper.integrateBackward();
		helper.setChangeSrc(changeSrc);
		helper.integrateForward();

		saveOutput(testCaseName, helper.getTrg());
		reportOutputModelSaved();

		compareWithExpected(testCaseName, ApplicationTypes.FORWARD, helper.getTrg());
	}
}
