package SimpleBPMN.util;

import java.util.LinkedList;
import java.util.Random;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.Process;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.StartEvent;

public class PostProcessor {
	public static void process(Process model) {
		_setRandomIDs(model);
		_conectSFToSynchronization(model);
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

	/**
	 * Recursive connection of dangling sequence flows spawned by split to its
	 * join Returns the element right after the join
	 * 
	 * @param split
	 */
	private static void _connect(ParallelGateway split) {
		Gateway join = split.get__conv();
		if (join == null)
			// basically should not happen, but the method can be called for
			// unprocessed BP
			return;

		// Need a queue to ensure all sequence flow will be processed in the
		// right order
		LinkedList<SequenceFlow> list = new LinkedList<SequenceFlow>();

		for (SequenceFlow sf : split.getOutgoing()) {
			list.push(sf);
		}

		while (!list.isEmpty()) {
			SequenceFlow sf = list.pop();
			if (sf.getTargetRef() == null) {
				// here is a dangling sequence flow, it should be connected to
				// the most current join
				sf.setTargetRef(join);
			} else if (sf.getTargetRef() == join) {
				// reached the join - don't follow further, cannot break here,
				// because there can be other dangling sequence flows left
				continue;
			} else if (sf.getTargetRef() instanceof ParallelGateway
					&& ((ParallelGateway) sf.getTargetRef()).isIsDiverging()) {
				// one more split inside - need to process it through recursion
				ParallelGateway newSplit = (ParallelGateway) sf.getTargetRef();
				Gateway newJoin = newSplit.get__conv();
				if (newJoin != null) { // if there is a join
					// skip all sequence flow after it, because they will be
					// processed by the recursion
					for (SequenceFlow nextSf : newJoin.getOutgoing()) {
						list.push(nextSf);
					}
					_connect(newSplit);
				}

			} else { // normal element - need to proceed further in the control
						// flow
				for (SequenceFlow nextSf : sf.getTargetRef().getOutgoing()) {
					list.push(nextSf);
				}
			}
		}
	}

	/**
	 * Connecting dangling sequence flows to parallel converging gateway
	 * 
	 * @param model
	 */
	private static void _conectSFToSynchronization(Process model) {

		StartEvent firstEl = PatternDiscovery.findFirst(model);
		LinkedList<FlowNode> nodes = new LinkedList<FlowNode>();
		nodes.add(firstEl);

		while (!nodes.isEmpty()) {
			FlowNode node = nodes.pop();
			if (node instanceof ParallelGateway && ((ParallelGateway) node).isIsDiverging()) {
				// only splits are processed
				ParallelGateway split = (ParallelGateway) node;
				_connect(split);
				if (split.get__conv() != null) {
					// if there is a join proceed further after it
					nodes.push(split.get__conv());
				}
			} else {
				// proceed further
				for (SequenceFlow sf : node.getOutgoing()) {
					if (sf.getTargetRef() != null)
						nodes.push(sf.getTargetRef());
				}
			}
		}
	}
}
