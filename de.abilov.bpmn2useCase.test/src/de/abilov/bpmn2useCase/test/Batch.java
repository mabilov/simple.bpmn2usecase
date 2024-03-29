package de.abilov.bpmn2useCase.test;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.moflon.testframework.tgg.IntegratorTest;

import de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage;
import de.abilov.bpmn.Process;
import de.abilov.bpmn.BpmnPackage;
import de.abilov.useCase.UseCasePackage;
import de.abilov.useCase.UseCase;
import TGGLanguage.algorithm.ApplicationTypes;
import de.abilov.model.compare.IComparator;
import org.junit.Assert;

public class Batch extends IntegratorTest {
	public Batch() {
		super(BpmnPackage.eINSTANCE, Bpmn2useCasePackage.eINSTANCE, UseCasePackage.eINSTANCE);
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

	@Test
	public void choiceMergeFwd() {
		integrate("ChoiceMerge_FWD");
	}

	@Test
	public void choiceMergeBwd() {
		integrate("ChoiceMerge_BWD");
	}

	@Test
	public void sequenceInAlternativeFwd() {
		integrate("SequenceInAlternative_FWD");
	}

	@Test
	public void sequenceInAlternativeBwd() {
		integrate("SequenceInAlternative_BWD");
	}
	
	@Test
	public void emptyDefaultFwd() {
		integrate("EmptyDefaultFlow_FWD");
	}
	
	@Test
	public void emptyDefaultBwd() {
		integrate("EmptyDefaultFlow_BWD");
	}
	
	@Test
	public void taskAfterMergeFwd() {
		integrate("TaskAfterMerge_FWD");
	}
	
	@Test
	public void taskAfterMergeBwd() {
		integrate("TaskAfterMerge_BWD");
	}

	@Override
	protected void setInputModel(ApplicationTypes direction, String testCaseName) {
		super.setInputModel(direction, testCaseName);
		if (direction == ApplicationTypes.FORWARD) {
			de.abilov.bpmn.util.SynchronizationHelper.discoverConverging((Process) helper.getSrc());
		} else {
			de.abilov.useCase.util.SynchronizationHelper.preprocess((UseCase) helper.getTrg());
		}
	}

	@Override
	public void postProcessing(EObject created) {
		if (created instanceof UseCase) {
			de.abilov.useCase.util.SynchronizationHelper.postprocess((UseCase) created);
		} else if (created instanceof Process) {
			de.abilov.bpmn.util.SynchronizationHelper.postprocess((Process)created);
		}
	}

	@Override
	public void compare(EObject expected, EObject actual) throws InterruptedException {
		IComparator comparator = new de.abilov.model.compare.str.Comparator();
		Assert.assertEquals(true, comparator.compare(expected, actual));
	}
}
