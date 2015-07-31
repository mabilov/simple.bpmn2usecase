package de.abilov.model.compare.emf;

import java.util.Iterator;

import org.eclipse.emf.compare.Match;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;

import de.abilov.bpmn.Gateway;
import de.abilov.bpmn.SequenceFlow;
import de.abilov.bpmn.BpmnPackage;

public class FeatureFilter extends org.eclipse.emf.compare.diff.FeatureFilter {
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
						&& attribute == BpmnPackage.Literals.FLOW_ELEMENT__ID) {
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
}
