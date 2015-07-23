package de.abilov.model.compare.str;

import org.eclipse.emf.ecore.EObject;

import SimpleUseCase.UseCase;
import SimpleBPMN.Process;
import de.abilov.model.compare.IComparator;

public class Comparator implements IComparator {
	public boolean compare(EObject expected, EObject actual) {
		if (expected instanceof UseCase && actual instanceof UseCase) {
			UseCase expUseCase = (UseCase) expected;
			UseCase actUseCase = (UseCase) actual;
			return expUseCase.export().equalsIgnoreCase(actUseCase.export());
		} else if (expected instanceof Process && actual instanceof Process) {
			Process expProcess = (Process) expected;
			Process actProcess = (Process) actual;
			return expProcess.export().equalsIgnoreCase(actProcess.export());
		} else {
			return expected.toString().equalsIgnoreCase(actual.toString());
		}
	}
}
