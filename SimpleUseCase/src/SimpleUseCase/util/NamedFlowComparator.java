package SimpleUseCase.util;

import java.util.Comparator;

import SimpleUseCase.NamedFlow;

public class NamedFlowComparator implements Comparator<NamedFlow>{

	@Override
	public int compare(NamedFlow o1, NamedFlow o2) {
		return o1.getId().compareTo(o2.getId());
	}

}
