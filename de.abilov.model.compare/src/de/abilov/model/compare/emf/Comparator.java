package de.abilov.model.compare.emf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;

import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;

import de.abilov.model.compare.IComparator;

/**
 * My best try with EMF Compare, unfortunately still unable to get good enough
 * results
 */
public class Comparator implements IComparator {
	public boolean compare(EObject expected, EObject actual) {
		IDiffEngine diffEngine = new DefaultDiffEngine(new DiffBuilder()) {
			@Override
			protected org.eclipse.emf.compare.diff.FeatureFilter createFeatureFilter() {
				return new FeatureFilter();
			}
		};

		IMatchEngine.Factory.Registry registry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();
		registry.add(new MatchEngineFactoryImpl(DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER),
				new DefaultComparisonFactory(new EqualityHelperFactory())));

		EMFCompare compare = EMFCompare.builder().setMatchEngineFactoryRegistry(registry).setDiffEngine(diffEngine)
				.build();
		EList<Diff> differences = compare.compare(new DefaultComparisonScope(actual, expected, null)).getDifferences();

		return differences.size() == 0;
	}
}
