package SimpleBPMN.util;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Stack;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.Process;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.StartEvent;

public class PatternDiscovery {
	private static StartEvent _findFirst(Process model) {
		Optional<FlowElement> el = model.getFlowElements().stream().filter(fe -> fe instanceof StartEvent).findAny();
		if (el.isPresent())
			return (StartEvent) el.get();
		else
			return null;
	}

	public static void discoverParallel(Process model) {
		StartEvent firstEl = _findFirst(model);
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
