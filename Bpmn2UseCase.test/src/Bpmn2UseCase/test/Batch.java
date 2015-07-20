package Bpmn2UseCase.test;

import org.apache.log4j.BasicConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.moflon.testframework.tgg.IntegratorTest;

import Bpmn2UseCase.Bpmn2UseCasePackage;
import SimpleBPMN.Process;
import SimpleBPMN.SimpleBPMNPackage;
import SimpleBPMN.util.PatternDiscovery;
import SimpleUseCase.SimpleUseCasePackage;
import SimpleUseCase.UseCase;
import TGGLanguage.algorithm.ApplicationTypes;

public class Batch extends IntegratorTest {
	public Batch() {
		super(SimpleBPMNPackage.eINSTANCE, Bpmn2UseCasePackage.eINSTANCE, SimpleUseCasePackage.eINSTANCE);
	}
	
	@BeforeClass
	public static void logging() {
		BasicConfigurator.configure();
	}
	
	@Test
	public void testEmpty() {
		integrate("Empty_FWD");
	}

	@Test
	public void testSequenceFwd() {
		integrate("Sequence_FWD");
	}
	
	@Test
	public void testParallelSplitFwd() {
		integrate("ParallelSplitSynchronization_FWD");
	}

	@Override
	protected void setInputModel(ApplicationTypes direction, String testCaseName) {
		super.setInputModel(direction, testCaseName);
		if (direction == ApplicationTypes.FORWARD) {
			PatternDiscovery.discoverParallel((Process) helper.getSrc());
		} else {
			SimpleUseCase.util.PreProcessor.process((UseCase) helper.getTrg());
		}
	}

}
