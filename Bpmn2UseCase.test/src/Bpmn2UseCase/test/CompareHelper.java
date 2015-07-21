package Bpmn2UseCase.test;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.EqualityHelper;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Assert;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;

import SimpleBPMN.Gateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNPackage;
import SimpleUseCase.BasicFlow;
import SimpleUseCase.Flow;
import SimpleUseCase.Step;
import SimpleUseCase.UseCase;

public class CompareHelper {
	/**
	 * My best try with EMF Compare, unfortunately still unable to get good
	 * enough results
	 */
	public static void compare(EObject expected, EObject actual) throws InterruptedException {
		IDiffEngine diffEngine = new DefaultDiffEngine(new DiffBuilder()) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {
					@Override
					/**
					 * Don't consider ordering
					 */
					public boolean checkForOrderingChanges(final EStructuralFeature feature) {
						return false;
					}

					@Override
					public Iterator<EAttribute> getAttributesToCheck(Match match) {
						final EClass clazz;
						final EObject obj;
						if (match.getLeft() != null) {
							obj = match.getLeft();
							clazz = match.getLeft().eClass();
						} else if (match.getRight() != null) {
							obj = match.getRight();
							clazz = match.getRight().eClass();
						} else {
							obj = match.getOrigin();
							clazz = match.getOrigin().eClass();
						}
						return Iterators.filter(clazz.getEAllAttributes().iterator(), new Predicate<EAttribute>() {
							public boolean apply(EAttribute attribute) {
								if (clazz.getInstanceClass() == SequenceFlow.class
										&& attribute == SimpleBPMNPackage.Literals.FLOW_ELEMENT__ID) {
									// Consider only id attributes of sequence
									// flows
									SequenceFlow sf = (SequenceFlow) obj;
									if (sf.getSourceRef() instanceof Gateway) {
										Gateway gw = (Gateway) sf.getSourceRef();
										if (gw.isIsDiverging())
											// Check IDs of sequence flows after
											// gateways
											return true;
									}
									// Don't check all other sequence flow IDs;
									return false;
								} else if (obj instanceof Gateway && !((Gateway) obj).isIsDiverging())
									// Don't check id of converging gateways
									return false;
								else if (attribute.getName().contains("__"))
									// Don't check auxiliary attributes
									return false;
								return !isIgnoredAttribute(attribute);
							}
						});
					}

					@Override
					/**
					 * Ignore auxiliary references
					 */
					protected boolean isIgnoredReference(Match match, EReference reference) {
						if (reference.getName().contains("__"))
							return true;
						return super.isIgnoredReference(match, reference);

					}
				};
			}
		};

		IMatchEngine.Factory.Registry registry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();
		registry.add(new MatchEngineFactoryImpl(
				DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE),
				new DefaultComparisonFactory(new DefaultEqualityHelperFactory() {
					@Override
					public org.eclipse.emf.compare.utils.IEqualityHelper createEqualityHelper() {
						return new EqualityHelper(EqualityHelper.createDefaultCache(getCacheBuilder())) {
							@Override
							public boolean matchingValues(Object object1, Object object2) {
								if (object1 instanceof BasicFlow && object2 instanceof BasicFlow) {
									// Very simple comparison of two basic flows
									// just by number of their steps
									EList<Step> flow1Steps = ((BasicFlow) object1).getSteps();
									EList<Step> flow2Steps = ((BasicFlow) object2).getSteps();
									if (flow1Steps != null && flow2Steps != null
											&& flow1Steps.size() != flow2Steps.size())
										return false;
									else if (flow1Steps != null && flow2Steps == null)
										return false;
									else if (flow1Steps == null && flow2Steps != null)
										return false;
									return true;
								} else if (object1 instanceof UseCase && object2 instanceof UseCase) {
									// Very simple comparison of two use cases
									// just by number its flows
									EList<Flow> useCase1Flows = ((UseCase) object1).getFlows();
									EList<Flow> useCase2Flows = ((UseCase) object2).getFlows();
									if (useCase1Flows != null && useCase2Flows != null
											&& useCase1Flows.size() != useCase2Flows.size())
										return false;
									else if (useCase1Flows != null && useCase2Flows == null)
										return false;
									else if (useCase1Flows == null && useCase2Flows != null)
										return false;
									return true;
								}
								return super.matchingValues(object1, object2);
							}
						};
					}
				})));

		Comparison comparison = EMFCompare.builder().setMatchEngineFactoryRegistry(registry).setDiffEngine(diffEngine)
				.build().compare(new DefaultComparisonScope(actual, expected, null));

		Assert.assertEquals(0, comparison.getDifferences().size());
	}
}
