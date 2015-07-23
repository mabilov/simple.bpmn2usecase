package de.abilov.model.compare.emf;

import org.eclipse.emf.common.util.EList;

import com.google.common.cache.CacheBuilder;

import SimpleUseCase.BasicFlow;
import SimpleUseCase.Flow;
import SimpleUseCase.Step;
import SimpleUseCase.UseCase;

public class EqualityHelper extends org.eclipse.emf.compare.utils.EqualityHelper {
	public EqualityHelper(CacheBuilder<Object, Object> cacheBuilder) {
		super(org.eclipse.emf.compare.utils.EqualityHelper.createDefaultCache(cacheBuilder));
	}

	@Override
	public boolean matchingValues(Object object1, Object object2) {
		if (object1 instanceof BasicFlow && object2 instanceof BasicFlow) {
			// Very simple comparison of two basic flows just by number of their
			// steps
			EList<Step> flow1Steps = ((BasicFlow) object1).getSteps();
			EList<Step> flow2Steps = ((BasicFlow) object2).getSteps();
			if (flow1Steps != null && flow2Steps != null && flow1Steps.size() != flow2Steps.size())
				return false;
			else if (flow1Steps != null && flow2Steps == null)
				return false;
			else if (flow1Steps == null && flow2Steps != null)
				return false;
			return true;
		} else if (object1 instanceof UseCase && object2 instanceof UseCase) {
			// Very simple comparison of two use cases just by number of its
			// flows
			EList<Flow> useCase1Flows = ((UseCase) object1).getFlows();
			EList<Flow> useCase2Flows = ((UseCase) object2).getFlows();
			if (useCase1Flows != null && useCase2Flows != null && useCase1Flows.size() != useCase2Flows.size())
				return false;
			else if (useCase1Flows != null && useCase2Flows == null)
				return false;
			else if (useCase1Flows == null && useCase2Flows != null)
				return false;
			return true;
		}
		return super.matchingValues(object1, object2);
	}
}
