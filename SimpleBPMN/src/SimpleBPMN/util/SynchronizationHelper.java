package SimpleBPMN.util;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.Process;
import SimpleBPMN.SequenceFlow;

public class SynchronizationHelper {

	/**
	 * Discover converging gateways for diverging ones and connect them to be
	 * used in synchronization
	 * 
	 * @param model
	 */
	public static void discoverConverging(Process model) {
		FlowNode firstEl = model.findFirst();
		LinkedList<FlowNode> nodes = new LinkedList<FlowNode>();
		nodes.add(firstEl);
		Stack<ParallelGateway> splits = new Stack<ParallelGateway>();
		Stack<ExclusiveGateway> choices = new Stack<ExclusiveGateway>();

		while (!nodes.isEmpty()) {
			FlowNode node = nodes.pop();
			if (node instanceof ParallelGateway) {
				if (((ParallelGateway) node).isIsDiverging()) {
					splits.push((ParallelGateway) node);
				} else if (!splits.isEmpty()) {
					splits.pop().set__conv((ParallelGateway) node);
				}
			} else if (node instanceof ExclusiveGateway) {
				if (((ExclusiveGateway) node).isIsDiverging()) {
					choices.push((ExclusiveGateway) node);
				} else if (!choices.isEmpty()) {
					choices.pop().set__conv((ExclusiveGateway) node);
				}
			}
			for (SequenceFlow sf : node.getOutgoing()) {
				if (sf.getTargetRef() != null)
					nodes.push(sf.getTargetRef());
			}
		}
	}

	public static void postprocess(Process model) {
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
