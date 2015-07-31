package org.moflon.tie;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EObject;
import org.moflon.ide.debug.DebugSynchronizationHelper;

import de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage;
import de.abilov.bpmn.Process;
import de.abilov.useCase.UseCase;

public class Bpmn2useCaseTrafo extends DebugSynchronizationHelper {

	private static String FORWARD_FOLDER = "instances/fwd/bpmn/";

	private static String BACKWARD_FOLDER = "instances/bwd/usecase/";

	public Bpmn2useCaseTrafo() {
		super(Bpmn2useCasePackage.eINSTANCE, ".");
		// Set up logging
		BasicConfigurator.configure();

		// Need to get exact list of ignored elements
		this.verbose = true;
	}

	private static void __perform(String direction, String test) {
		Bpmn2useCaseTrafo helper = new Bpmn2useCaseTrafo();
		helper.perform(direction, test);
	}

	public static void main(String[] args) throws IOException {
		// Which test file to transform?
		String testName = args[0];

		// Which direction to use?
		String direction = args[1];

		if (testName.equalsIgnoreCase("all")) {
			__perform(direction, "Empty");
			__perform(direction, "Sequence");
			__perform(direction, "ParallelSplitSynchronization");
			__perform(direction, "SequenceInParallel");
			__perform(direction, "ParallelConvTask");
			__perform(direction, "Recursive1Parallel");
			__perform(direction, "ChoiceMerge");
			__perform(direction, "SequenceInAlternative");
			__perform(direction, "EmptyDefaultFlow");
			__perform(direction, "TaskAfterMerge");
		} else {
			__perform(direction, testName);
		}
	}

	private String _testName;

	public void performForward() {
		de.abilov.bpmn.util.SynchronizationHelper.discoverConverging((Process) this.src);
		integrateForward();
		de.abilov.useCase.util.SynchronizationHelper.postprocess((UseCase) this.trg);

		saveTrg("instances/fwd/usecase/" + _testName + ".xmi");
		saveCorr("instances/fwd/corr/" + _testName + ".xmi");
		saveSynchronizationProtocol("instances/fwd/protocol/" + _testName + ".xmi");

		System.out.println("Completed forward transformation for test " + _testName + "!");
	}

	public void performForward(EObject srcModel) {
		setSrc(srcModel);
		performForward();
	}

	public void perform(String direction, String testName) {
		this._testName = testName;
		if (direction.equalsIgnoreCase("forward")) {
			this.performForward(FORWARD_FOLDER + testName + ".xmi");
		} else {
			this.performBackward(BACKWARD_FOLDER + testName + ".xmi");
		}
	}

	public void performForward(String source) {
		try {
			loadSrc(source);
			performForward();
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load " + source + ", " + iae.getMessage());
			return;
		}
	}

	public void performBackward() {
		de.abilov.useCase.util.SynchronizationHelper.preprocess((UseCase) this.trg);

		integrateBackward();

		de.abilov.bpmn.util.SynchronizationHelper.postprocess((Process) this.src);

		saveSrc("instances/bwd/bpmn/" + _testName + ".xmi");
		saveCorr("instances/bwd/corr/" + _testName + ".xmi");
		saveSynchronizationProtocol("instances/bwd/protocol/" + _testName + ".xmi");

		System.out.println("Completed backward transformation for test " + _testName + "!");
	}

	public void performBackward(EObject targetModel) {
		setTrg(targetModel);
		performBackward();
	}

	public void performBackward(String target) {
		try {
			loadTrg(target);
			performBackward();
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load " + target + ", " + iae.getMessage());
			return;
		}
	}
}