package org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.ide.debug.DebugSynchronizationHelper;


import org.eclipse.emf.common.util.URI;
import TGGRuntime.CorrespondenceModel;

import de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage;


public class Bpmn2useCaseSync extends DebugSynchronizationHelper{

   public Bpmn2useCaseSync()
   {
      super(Bpmn2useCasePackage.eINSTANCE, ".");
   }
	
	public static void main(String[] args) throws IOException {
		// Set up logging
        BasicConfigurator.configure();

		// Propagate changes made to source
        Bpmn2useCaseSync helper = new Bpmn2useCaseSync();
		helper.syncForward("instances/fwd.corr.xmi");
		
		// Propagate changes made to target
        helper = new Bpmn2useCaseSync();
		helper.syncBackward("instances/fwd.corr.xmi");
	}

	public void syncForward(String corr) {
		setChangeSrc(root -> {});
		loadTriple(corr);
		loadSynchronizationProtocol("instances/fwd.protocol.xmi");
		integrateForward();
		saveResult("fwd");
		
		System.out.println("Completed forward synchronization");
	}
	
	public void syncBackward(String corr) {
		setChangeTrg(root -> {});
		loadTriple(corr);
		loadSynchronizationProtocol("instances/fwd.protocol.xmi");
		integrateBackward();
		saveResult("bwd");
		
		System.out.println("Completed backward synchronization");
	}
	
	private void loadTriple(String corr){ 
		try {
			loadCorr(corr);
			CorrespondenceModel corrModel = (CorrespondenceModel) getCorr();
			setSrc(corrModel.getSource());
			setTrg(corrModel.getTarget());
		} catch (IllegalArgumentException iae) {
			System.err.println("Unable to load input triple for " + corr
					+ ", " + iae.getMessage());
		}
	}
	
	private void saveResult(String direction){ 
		getSrc().eResource().setURI(URI.createFileURI("sync." + direction + ".src.xmi"));
		getTrg().eResource().setURI(URI.createFileURI("sync." + direction + ".trg.xmi"));
		getCorr().eResource().setURI(URI.createFileURI("sync." + direction + ".corr.xmi"));
		
		saveSrc("instances/sync." + direction + ".src.xmi");
		saveTrg("instances/sync." + direction + ".trg.xmi");
		saveCorr("instances/sync." + direction + ".corr.xmi");
		saveSynchronizationProtocol("instances/sync." + direction + ".protocol.xmi");
	}
}