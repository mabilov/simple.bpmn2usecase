package SimpleBPMN.util;

import java.util.Random;

import SimpleBPMN.FlowElement;
import SimpleBPMN.Process;

public class PostProcessor {
	public static void process(Process model) {
		Random r = new Random();
		
		//Setting random ids to elements without ones
		for (FlowElement el : model.getFlowElements()) {
			if (el.getId() == null || el.getId().isEmpty()) {
				el.setId("fe" + r.nextInt());
			}
		}
	}
}
