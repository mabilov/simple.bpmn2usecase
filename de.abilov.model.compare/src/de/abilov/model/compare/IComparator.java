package de.abilov.model.compare;

import org.eclipse.emf.ecore.EObject;

public interface IComparator {
	public boolean compare(EObject expected, EObject actual);
}
