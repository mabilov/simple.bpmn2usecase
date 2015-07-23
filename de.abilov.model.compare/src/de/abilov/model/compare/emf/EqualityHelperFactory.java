package de.abilov.model.compare.emf;

import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;

public class EqualityHelperFactory extends DefaultEqualityHelperFactory {
	@Override
	public org.eclipse.emf.compare.utils.IEqualityHelper createEqualityHelper() {
		return new EqualityHelper(getCacheBuilder());
	}
}
