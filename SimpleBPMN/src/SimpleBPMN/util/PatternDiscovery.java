package SimpleBPMN.util;

import java.util.LinkedList;
import java.util.Stack;

import SimpleBPMN.FlowNode;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.Process;
import SimpleBPMN.SequenceFlow;

public class PatternDiscovery {

	/**
	 * Discover parallel split and synchronization pattern and connect them to
	 * be used in synchronization
	 * 
	 * @param model
	 */
	public static void discoverParallel(Process model) {
		FlowNode firstEl = model.findFirst();
		LinkedList<FlowNode> nodes = new LinkedList<FlowNode>();
		nodes.add(firstEl);
		Stack<ParallelGateway> splits = new Stack<ParallelGateway>();

		while (!nodes.isEmpty()) {
			FlowNode node = nodes.pop();
			if (node instanceof ParallelGateway) {
				if (((ParallelGateway) node).isIsDiverging()) {
					splits.push((ParallelGateway) node);
				} else if (!splits.isEmpty()) {
					splits.pop().set__conv((ParallelGateway) node);
				}
			}
			for (SequenceFlow sf : node.getOutgoing()) {
				if (sf.getTargetRef() != null)
					nodes.push(sf.getTargetRef());
			}
		}

	}
}
