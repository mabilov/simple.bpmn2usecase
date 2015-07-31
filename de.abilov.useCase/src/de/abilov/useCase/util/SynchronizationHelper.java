package de.abilov.useCase.util;

import de.abilov.useCase.ChoiceStep;
import de.abilov.useCase.Flow;
import de.abilov.useCase.Step;
import de.abilov.useCase.StepAlternative;
import de.abilov.useCase.UseCase;

public class SynchronizationHelper {
	/**
	 * Preprocess use case by creating auxiliary edges, so it is ready for
	 * synchronization run
	 * 
	 * @param model
	 */
	public static void preprocess(UseCase model) {
		for (Flow flow : model.getFlows()) {
			// Step first = _findFirst(flow);
			// flow.set__first(first);
			Step last = flow.findLast();
			if (last == null)
				continue;
			flow.set__last(last);
			last.set__last(flow.getFinalState());

			for (Step step : flow.getSteps()) {
				if (step instanceof ChoiceStep) {
					ChoiceStep cStep = (ChoiceStep) step;
					boolean lastInDefSet = false;
					for (StepAlternative alt : cStep.getStepAlternatives()) {
						// Auxiliary edge "has continue" means that after the
						// alternative flow the process should continue with the
						// basic flow, even if there is no any additional steps
						// there
						if (alt.getRef().getFinalState() == null || alt.getContinuation() != null) {
							alt.set__hasContinue(cStep);

							// Set auxiliary "last step in the default flow"
							// edge, which helps to establish where to put
							// converging gateway

							if (!lastInDefSet) {
								Step prevStep;
								if (alt.getContinuation() != null) {
									// It is the step previous to the
									// continuation point
									prevStep = __findPrev(alt.getContinuation(), flow);
								} else {
									// It is the last step in the flow
									prevStep = last;

									// If the last step in default flow is the
									// last step of the flow, we need to
									// rearrange the auxiliary last edges to
									// this choice step because it will
									// correspond to the last node in the
									// BPMN.
									last.set__last(null);
									flow.set__last(cStep);
									cStep.set__last(flow.getFinalState());
								}

								cStep.set__lastInDef(prevStep);

								// make sure that this procedure will be
								// executed only once
								lastInDefSet = true;
							}

						}
					}

				}
			}
		}
	}

	/**
	 * Find previous step of the step in the given flow
	 * 
	 * @param step
	 * @param parentFlow
	 * @return
	 */
	private static Step __findPrev(Step step, Flow parentFlow) {
		for (Step s : parentFlow.getSteps())
			if (s.getNext() == step)
				return s;
		return null;
	}

	/**
	 * Post-process use case after the synchronization run to restore missing
	 * edges
	 * 
	 * @param model
	 */
	public static void postprocess(UseCase model) {
		for (Flow flow : model.getFlows()) {
			for (Step step : flow.getSteps()) {
				if (step instanceof ChoiceStep) {
					ChoiceStep cStep = (ChoiceStep) step;
					for (StepAlternative alt : cStep.getStepAlternatives()) {
						// If the alternative flow has a continue, the
						// continuation should be set to the next step after the
						// last step in the default flow
						if (alt.get__hasContinue() != null && cStep.get__lastInDef() != null)
							alt.setContinuation(cStep.get__lastInDef().getNext());
					}
				}
			}
		}
	}
}
