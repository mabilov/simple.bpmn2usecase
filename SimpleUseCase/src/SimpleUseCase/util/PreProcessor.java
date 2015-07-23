package SimpleUseCase.util;

import SimpleUseCase.Flow;
import SimpleUseCase.Step;
import SimpleUseCase.UseCase;

public class PreProcessor {
	/**
	 * process use case so it is ready for transformation
	 * 
	 * @param model
	 */
	public static void process(UseCase model) {
		for (Flow flow : model.getFlows()) {
			// Step first = _findFirst(flow);
			// flow.set__first(first);
			Step last = flow.findLast();
			if (last == null)
				continue;
			flow.set__last(last);
			last.set__last(flow.getFinalState());
		}
	}
}
