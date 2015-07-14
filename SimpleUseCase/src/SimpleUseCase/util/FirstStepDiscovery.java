package SimpleUseCase.util;

import org.eclipse.emf.common.util.EList;

import SimpleUseCase.Flow;
import SimpleUseCase.Step;
import SimpleUseCase.UseCase;

public class FirstStepDiscovery {
	private static Step _findFirst(Flow flow) {
		EList<Step> els = flow.getSteps();
		for (Step el : els) {
			boolean first = true;
			for (Step el1 : els) {
				if (el1.getNext() == el) {
					first = false;
					break;
				}
			}
			if (first) {
				return el;
			}
		}
		return null;
	}

	public static void discover(UseCase model) {
		for (Flow flow : model.getFlows()) {
			Step first = _findFirst(flow);
			flow.set__first(first);
		}
	}
}
