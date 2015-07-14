package SimpleUseCase.util;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;

import SimpleUseCase.Flow;
import SimpleUseCase.Step;
import SimpleUseCase.UseCase;

public class PreProcessor {
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

	private static Step _findLast(Flow flow) {
		Optional<Step> step = flow.getSteps().stream().filter(s -> s.getNext() == null).findAny();
		if (step.isPresent())
			return step.get();
		else
			return null;
	}

	public static void process(UseCase model) {
		for (Flow flow : model.getFlows()) {
			if (flow.getSteps().isEmpty()) {
				flow.set__empty(true);
				continue;
			}
			Step first = _findFirst(flow);
			Step last = _findLast(flow);
			flow.set__first(first);
			flow.set__last(last);
		}
	}
}
