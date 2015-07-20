package Bpmn2UseCase.test;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.moflon.testframework.tgg.IntegratorTest;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;

import Bpmn2UseCase.Bpmn2UseCasePackage;
import SimpleBPMN.Gateway;
import SimpleBPMN.Process;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNPackage;
import SimpleBPMN.util.PatternDiscovery;
import SimpleUseCase.SimpleUseCasePackage;
import SimpleUseCase.UseCase;
import TGGLanguage.algorithm.ApplicationTypes;

public class Batch extends IntegratorTest {
	public Batch() {
		super(SimpleBPMNPackage.eINSTANCE, Bpmn2UseCasePackage.eINSTANCE, SimpleUseCasePackage.eINSTANCE);
	}

	@BeforeClass
	public static void logging() {
		BasicConfigurator.configure();
	}

	@Test
	public void emptyFwd() {
		integrate("Empty_FWD");
	}

	@Test
	public void emptyBwd() {
		integrate("Empty_BWD");
	}

	@Test
	public void sequenceFwd() {
		integrate("Sequence_FWD");
	}

	@Test
	public void sequenceBwd() {
		integrate("Sequence_BWD");
	}

	@Test
	public void parallelSplitFwd() {
		integrate("ParallelSplitSynchronization_FWD");
	}

	@Test
	public void parallelSplitBwd() {
		integrate("ParallelSplitSynchronization_BWD");
	}
	
	@Test
	public void recursicve1ParallelFwd() {
		integrate("Recursive1Parallel_FWD");
	}
	
	@Test
	public void recursicve1ParallelBwd() {
		integrate("Recursive1Parallel_BWD");
	}

	@Override
	protected void setInputModel(ApplicationTypes direction, String testCaseName) {
		super.setInputModel(direction, testCaseName);
		if (direction == ApplicationTypes.FORWARD) {
			PatternDiscovery.discoverParallel((Process) helper.getSrc());
		} else {
			SimpleUseCase.util.PreProcessor.process((UseCase) helper.getTrg());
		}
	}

	@Override
	/**
	 * My best try with EMF Compare, unfortunately still unable to get good
	 * enough results
	 */
	public void compare(EObject expected, EObject actual) throws InterruptedException {
		IDiffProcessor diffProcessor = new DiffBuilder();
		IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {
					@Override
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
								return true;
							}
						});
					}

					@Override
					protected boolean isIgnoredReference(Match match, EReference reference) {
						if (reference.getName().contains("__"))
							return true;
						return false;

					}
				};
			}
		};

		IComparisonScope scope = new DefaultComparisonScope(actual, expected, null);
		IMatchEngine.Factory.Registry registry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();

		final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER);
		registry.add(matchEngineFactory);

		Comparison comparison = EMFCompare.builder().setMatchEngineFactoryRegistry(registry).setDiffEngine(diffEngine)
				.build().compare(scope);

		List<Diff> differences = comparison.getDifferences();
		Assert.assertEquals(0, differences.size());
	}

}
