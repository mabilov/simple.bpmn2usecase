package org.moflon.tie;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EObject;
import org.moflon.ide.debug.DebugSynchronizationHelper;

import Bpmn2UseCase.Bpmn2UseCasePackage;
import SimpleBPMN.Process;
import SimpleBPMN.util.PatternDiscovery;
import SimpleUseCase.UseCase;

public class Bpmn2UseCaseTrafo extends DebugSynchronizationHelper {

	private static String FORWARD_FOLDER = "instances/fwd/bpmn/";

	private static String BACKWARD_FOLDER = "instances/bwd/usecase/";

	public Bpmn2UseCaseTrafo() {
		super(Bpmn2UseCasePackage.eINSTANCE, ".");
		// Set up logging
		BasicConfigurator.configure();

		// Need to get exact list of ignored elements
		this.verbose = true;
	}

	public static void main(String[] args) throws IOException {

		// Forward Transformation
		Bpmn2UseCaseTrafo helper = new Bpmn2UseCaseTrafo();

		// Which pattern to transform?
		String patternName = args[0];

		// Which direction to use?
		String direction = args[1];

		if (patternName.equalsIgnoreCase("all")) {
			helper.perform(direction, "Empty");
			helper.perform(direction, "Sequence");
			helper.perform(direction, "ParallelSplitSynchronization");
			helper.perform(direction, "SequenceInParallel");
			helper.perform(direction, "ParallelConvTask");
			helper.perform(direction, "Recursive1Parallel");
		} else {
			helper.perform(direction, patternName);
		}
	}

	private String _patterName;

	public void performForward() {
		PatternDiscovery.discoverParallel((Process) this.src);
		integrateForward();

		saveTrg("instances/fwd/usecase/" + _patterName + ".xmi");
		saveCorr("instances/fwd/corr/" + _patterName + ".xmi");
		saveSynchronizationProtocol("instances/fwd/protocol/" + _patterName + ".xmi");

		System.out.println("Completed forward transformation for pattern " + _patterName + "!");
	}

	public void performForward(EObject srcModel) {
		setSrc(srcModel);
		performForward();
	}

	public void perform(String direction, String patterName) {
		this._patterName = patterName;
		if (direction.equalsIgnoreCase("forward")) {
			this.performForward(FORWARD_FOLDER + patterName + ".xmi");
		} else {
			this.performBackward(BACKWARD_FOLDER + patterName + ".xmi");
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
		SimpleUseCase.util.PreProcessor.process((UseCase) this.trg);

		integrateBackward();

		SimpleBPMN.util.PostProcessor.process((Process) this.src);

		saveSrc("instances/bwd/bpmn/" + _patterName + ".xmi");
		saveCorr("instances/bwd/corr/" + _patterName + ".xmi");
		saveSynchronizationProtocol("instances/bwd/protocol/" + _patterName + ".xmi");

		System.out.println("Completed backward transformation for pattern " + _patterName + "!");
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