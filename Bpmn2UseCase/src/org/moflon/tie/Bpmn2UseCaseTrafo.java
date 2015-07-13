package org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.ide.debug.DebugSynchronizationHelper;
import org.eclipse.emf.ecore.EObject;

import Bpmn2UseCase.Bpmn2UseCasePackage;

public class Bpmn2UseCaseTrafo extends DebugSynchronizationHelper {

	public Bpmn2UseCaseTrafo() {
		super(Bpmn2UseCasePackage.eINSTANCE, ".");
	}

	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		// Forward Transformation
		Bpmn2UseCaseTrafo helper = new Bpmn2UseCaseTrafo();

		// Which pattern to transform?
		helper._patterName = args[0];

		// Which direction to use?
		String direction = args[1];
		
		//Need to get exact list of ignored elements
		helper.verbose = true;

		if (direction.equalsIgnoreCase("forward")) {
			helper.performForward("instances/fwd/bpmn/" + helper._patterName
					+ ".xmi");
		} else {
			helper.performBackward("instances/bwd/usecase/" + helper._patterName
					+ ".xmi");
		}
	}

	private String _patterName;

	public void performForward() {
		integrateForward();

		saveTrg("instances/fwd/usecase/" + _patterName + ".xmi");
		saveCorr("instances/fwd/corr/" + _patterName + ".xmi");
		saveSynchronizationProtocol("instances/fwd/protocol/" + _patterName
				+ ".xmi");

		System.out.println("Completed forward transformation for pattern "
				+ _patterName + "!");
	}

	public void performForward(EObject srcModel) {
		setSrc(srcModel);
		performForward();
	}

	public void performForward(String source) {
		try {
			loadSrc(source);
			performForward();
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load " + source + ", "
					+ iae.getMessage());
			return;
		}
	}

	public void performBackward() {
		integrateBackward();

		saveSrc("instances/bwd/bpmn/" + _patterName + ".xmi");
		saveCorr("instances/bwd/corr/" + _patterName + ".xmi");
		saveSynchronizationProtocol("instances/bwd/protocol/" + _patterName + ".xmi");

		System.out.println("Completed backward transformation!");
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
			System.err.println("Unable to load " + target + ", "
					+ iae.getMessage());
			return;
		}
	}
}