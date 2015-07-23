package SimpleBPMN.util;

import java.util.Random;

import SimpleBPMN.FlowElement;
import SimpleBPMN.Process;

public class PostProcessor {
	public static void process(Process model) {
		_setRandomIDs(model);
		// _conectSFToSynchronization(model);
	}

	/**
	 * Setting random IDs to elements without ones
	 * 
	 * @param model
	 */
	private static void _setRandomIDs(Process model) {
		Random r = new Random();
		// check every element
		for (FlowElement el : model.getFlowElements()) {
			if (el.getId() == null || el.getId().isEmpty()) {
				// if there is no ID set
				el.setId("fe" + r.nextInt());
			}
		}
	}
}
