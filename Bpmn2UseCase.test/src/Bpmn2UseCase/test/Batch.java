package Bpmn2UseCase.test;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EObject;
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
	public void emptyFwd() {
		integrate("Empty_FWD");
	}

	@Test
	public void emptyBwd() {
		integrate("Empty_BWD");
	}

	@Test
	public void sequenceFwd() {
		integrate("Sequence_FWD");
	}

	@Test
	public void sequenceBwd() {
		integrate("Sequence_BWD");
	}

	@Test
	public void parallelSplitFwd() {
		integrate("ParallelSplitSynchronization_FWD");
	}

	@Test
	public void parallelSplitBwd() {
		integrate("ParallelSplitSynchronization_BWD");
	}

	@Test
	public void recursicve1ParallelFwd() {
		integrate("Recursive1Parallel_FWD");
	}

	@Test
	public void recursicve1ParallelBwd() {
		integrate("Recursive1Parallel_BWD");
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

	@Override
	/**
	 * My best try with EMF Compare, unfortunately still unable to get good
	 * enough results
	 */
	public void compare(EObject expected, EObject actual) throws InterruptedException {
		CompareHelper.compare(expected, actual);
	}

}
