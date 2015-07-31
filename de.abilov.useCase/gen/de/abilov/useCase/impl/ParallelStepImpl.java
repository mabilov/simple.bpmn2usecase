/**
 */
package de.abilov.useCase.impl;

import de.abilov.useCase.ParallelFlow;
import de.abilov.useCase.ParallelStep;
import de.abilov.useCase.UseCasePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.abilov.useCase.impl.ParallelStepImpl#getInvokedFlows <em>Invoked Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParallelStepImpl extends StepImpl implements ParallelStep {
	/**
	 * The cached value of the '{@link #getInvokedFlows() <em>Invoked Flows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokedFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<ParallelFlow> invokedFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasePackage.Literals.PARALLEL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParallelFlow> getInvokedFlows() {
		if (invokedFlows == null) {
			invokedFlows = new EObjectResolvingEList<ParallelFlow>(ParallelFlow.class, this,
					UseCasePackage.PARALLEL_STEP__INVOKED_FLOWS);
		}
		return invokedFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UseCasePackage.PARALLEL_STEP__INVOKED_FLOWS:
			return getInvokedFlows();
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
		case UseCasePackage.PARALLEL_STEP__INVOKED_FLOWS:
			getInvokedFlows().clear();
			getInvokedFlows().addAll((Collection<? extends ParallelFlow>) newValue);
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
		case UseCasePackage.PARALLEL_STEP__INVOKED_FLOWS:
			getInvokedFlows().clear();
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
		case UseCasePackage.PARALLEL_STEP__INVOKED_FLOWS:
			return invokedFlows != null && !invokedFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]
	public String export() {
		StringBuffer sb = new StringBuffer();
		sb.append(" parallel step ");
		sb.append(this.getId());
		String comma = "";

		java.util.Iterator<de.abilov.useCase.ParallelFlow> invokedFlows = this.getInvokedFlows().stream()
				.sorted(new de.abilov.useCase.util.NamedFlowComparator()).iterator();
		while (invokedFlows.hasNext()) {
			ParallelFlow flow = invokedFlows.next();
			sb.append(comma);
			sb.append(flow.getId());
			comma = ", ";
		}
		return sb.toString();
	}
	// [user code injected with eMoflon] -->
} //ParallelStepImpl
