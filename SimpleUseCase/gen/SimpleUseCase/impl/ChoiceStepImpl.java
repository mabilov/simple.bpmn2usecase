/**
 */
package SimpleUseCase.impl;

import SimpleUseCase.AlternativeFlow;
import SimpleUseCase.ChoiceStep;
import SimpleUseCase.SimpleUseCasePackage;
import SimpleUseCase.util.NamedFlowComparator;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleUseCase.impl.ChoiceStepImpl#getAlternativeFlows <em>Alternative Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceStepImpl extends StepImpl implements ChoiceStep {
	/**
	 * The cached value of the '{@link #getAlternativeFlows() <em>Alternative Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<AlternativeFlow> alternativeFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUseCasePackage.Literals.CHOICE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlternativeFlow> getAlternativeFlows() {
		if (alternativeFlows == null) {
			alternativeFlows = new EObjectResolvingEList<AlternativeFlow>(AlternativeFlow.class, this,
					SimpleUseCasePackage.CHOICE_STEP__ALTERNATIVE_FLOWS);
		}
		return alternativeFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleUseCasePackage.CHOICE_STEP__ALTERNATIVE_FLOWS:
			return getAlternativeFlows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimpleUseCasePackage.CHOICE_STEP__ALTERNATIVE_FLOWS:
			getAlternativeFlows().clear();
			getAlternativeFlows().addAll((Collection<? extends AlternativeFlow>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimpleUseCasePackage.CHOICE_STEP__ALTERNATIVE_FLOWS:
			getAlternativeFlows().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimpleUseCasePackage.CHOICE_STEP__ALTERNATIVE_FLOWS:
			return alternativeFlows != null && !alternativeFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]
	public String export() {
		StringBuffer sb = new StringBuffer();
		sb.append(" choice step ");
		sb.append(this.getId());
		String comma = "";

		Iterator<AlternativeFlow> altFlows = this.getAlternativeFlows().stream().sorted(new NamedFlowComparator())
				.iterator();
		while (altFlows.hasNext()) {
			AlternativeFlow flow = altFlows.next();
			sb.append(comma);
			sb.append(flow.getId());
			comma = ", ";
		}
		
		if (this.getNext() != null) {
			sb.append(" next ");
			sb.append(this.getNext().getId());
		}
		
		return sb.toString();
	}
	// [user code injected with eMoflon] -->
} //ChoiceStepImpl
