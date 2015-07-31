package de.abilov.useCase.util;

import java.util.Comparator;

import de.abilov.useCase.NamedFlow;

public class NamedFlowComparator implements Comparator<NamedFlow>{

	@Override
	public int compare(NamedFlow o1, NamedFlow o2) {
		return o1.getId().compareTo(o2.getId());
	}

}
