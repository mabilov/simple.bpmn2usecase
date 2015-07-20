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
import SimpleBPMN.FlowElement;
import SimpleBPMN.Process;
import SimpleUseCase.SimpleUseCasePackage;
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
		setInputModel(ApplicationTypes.FORWARD, testCaseName);

		helper.integrateForward();
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
	
	@Override
	/**
	 * My best try with EMF Compare, unfortunately still unable to get good
	 * enough results
	 */
	public void compare(EObject expected, EObject actual) throws InterruptedException {
		CompareHelper.compare(expected, actual);
	}
}
