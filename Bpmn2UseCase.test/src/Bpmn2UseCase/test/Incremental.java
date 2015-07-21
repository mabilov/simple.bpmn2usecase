package Bpmn2UseCase.test;

import java.util.Optional;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.moflon.testframework.tgg.IncrementalIntegratorTest;

import Bpmn2UseCase.Bpmn2UseCasePackage;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;
import SimpleBPMN.SimpleBPMNPackage;
import SimpleBPMN.StartEvent;
import SimpleBPMN.Task;
import SimpleBPMN.util.PatternDiscovery;
import SimpleBPMN.EndEvent;
import SimpleBPMN.FlowElement;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.Process;
import SimpleUseCase.SimpleUseCasePackage;
import SimpleUseCase.UseCase;
import TGGLanguage.algorithm.ApplicationTypes;

public class Incremental extends IncrementalIntegratorTest {
	public Incremental() {
		super(SimpleBPMNPackage.eINSTANCE, Bpmn2UseCasePackage.eINSTANCE, SimpleUseCasePackage.eINSTANCE);
	}

	@BeforeClass
	public static void logging() {
		BasicConfigurator.configure();
	}

	@Test
	public void empty2Task() throws InterruptedException {
		String testCaseName = "Empty2Task";
		setInputModel(ApplicationTypes.BACKWARD, testCaseName);

		helper.integrateBackward();
		helper.setChangeSrc(root -> {
			Process proc = (Process) root;
			Optional<FlowElement> fe = proc.getFlowElements().stream().filter(f -> f instanceof StartEvent).findAny();
			if (!fe.isPresent())
				return;

			StartEvent se = (StartEvent) fe.get();
			SequenceFlow sf1 = se.getOutgoing().get(0);

			SequenceFlow sf2 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
			sf2.setId("sf2");
			proc.getFlowElements().add(sf2);

			Task t1 = SimpleBPMNFactory.eINSTANCE.createTask();
			t1.setId("t1");
			proc.getFlowElements().add(t1);

			sf2.setSourceRef(t1);
			sf2.setTargetRef(sf1.getTargetRef());

			sf1.setTargetRef(t1);
		});
		helper.integrateForward();
		compareWithExpected(testCaseName, ApplicationTypes.FORWARD, helper.getTrg());
	}

	@Test
	public void task2Parallel() throws InterruptedException {
		String testCaseName = "Task2Parallel";
		setInputModel(ApplicationTypes.BACKWARD, testCaseName);
		SimpleUseCase.util.PreProcessor.process((UseCase) helper.getTrg());

		helper.integrateBackward();
		helper.setChangeSrc(root -> {
			Process proc = (Process) root;
			Optional<FlowElement> fe = proc.getFlowElements().stream().filter(f -> f instanceof Task).findAny();
			if (!fe.isPresent())
				return;

			Task t1 = (Task) fe.get();
			SequenceFlow sf2 = t1.getOutgoing().get(0);
			EndEvent ee1 = (EndEvent) sf2.getTargetRef();

			ParallelGateway pg1 = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
			pg1.setId("pg1");
			pg1.setIsDiverging(true);
			proc.getFlowElements().add(pg1);
			sf2.setTargetRef(pg1);

			SequenceFlow sf3 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
			sf3.setId("sf3");
			proc.getFlowElements().add(sf3);
			sf3.setSourceRef(pg1);

			Task t2 = SimpleBPMNFactory.eINSTANCE.createTask();
			t2.setId("t2");
			proc.getFlowElements().add(t2);
			sf3.setTargetRef(t2);

			SequenceFlow sf4 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
			sf4.setId("sf4");
			proc.getFlowElements().add(sf4);
			sf4.setSourceRef(t2);

			ParallelGateway pcg1 = SimpleBPMNFactory.eINSTANCE.createParallelGateway();
			pcg1.setId("pcg1");
			pcg1.setIsDiverging(false);
			proc.getFlowElements().add(pcg1);
			sf4.setTargetRef(pcg1);

			SequenceFlow sf5 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
			sf5.setId("sf5");
			proc.getFlowElements().add(sf5);
			sf5.setSourceRef(pcg1);
			sf5.setTargetRef(ee1);

			// pre-process
			PatternDiscovery.discoverParallel(proc);
		});
		helper.integrateForward();

		saveOutput(testCaseName, helper.getTrg());
		reportOutputModelSaved();

		compareWithExpected(testCaseName, ApplicationTypes.FORWARD, helper.getTrg());
	}

	@Override
	public void compare(EObject expected, EObject actual) throws InterruptedException {
		CompareHelper.compare(expected, actual);
	}
}
