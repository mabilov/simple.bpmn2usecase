package SimpleUseCase.util;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;

import SimpleUseCase.Flow;
import SimpleUseCase.Step;
import SimpleUseCase.UseCase;

public class PreProcessor {
	/**
	 * Find first step in the flow
	 * 
	 * @param flow
	 * @return first step
	 */
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

	/**
	 * Find last step in the flow
	 * 
	 * @param flow
	 * @return last step
	 */
	private static Step _findLast(Flow flow) {
		Optional<Step> step = flow.getSteps().stream().filter(s -> s.getNext() == null).findAny();

		if (step.isPresent())
			return step.get();
		else
			return null;
	}

	/**
	 * process use case so it is ready for transformation
	 * 
	 * @param model
	 */
	public static void process(UseCase model) {
		for (Flow flow : model.getFlows()) {
			// Step first = _findFirst(flow);
			// flow.set__first(first);
			Step last = _findLast(flow);
			if (last == null)
				continue;
			flow.set__last(last);
			last.set__last(flow.getFinalState());
		}
	}
}
