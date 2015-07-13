/**
 */
package SimpleBPMN.impl;

import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SimpleBPMNPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleBPMN.impl.ParallelGatewayImpl#isIsDiverging <em>Is Diverging</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParallelGatewayImpl extends FlowNodeImpl implements
		ParallelGateway {
	/**
	 * The default value of the '{@link #isIsDiverging() <em>Is Diverging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDiverging()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIVERGING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsDiverging() <em>Is Diverging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDiverging()
	 * @generated
	 * @ordered
	 */
	protected boolean isDiverging = IS_DIVERGING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleBPMNPackage.Literals.PARALLEL_GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDiverging() {
		return isDiverging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDiverging(boolean newIsDiverging) {
		boolean oldIsDiverging = isDiverging;
		isDiverging = newIsDiverging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimpleBPMNPackage.PARALLEL_GATEWAY__IS_DIVERGING,
					oldIsDiverging, isDiverging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleBPMNPackage.PARALLEL_GATEWAY__IS_DIVERGING:
			return isIsDiverging();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimpleBPMNPackage.PARALLEL_GATEWAY__IS_DIVERGING:
			setIsDiverging((Boolean) newValue);
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
		case SimpleBPMNPackage.PARALLEL_GATEWAY__IS_DIVERGING:
			setIsDiverging(IS_DIVERGING_EDEFAULT);
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
		case SimpleBPMNPackage.PARALLEL_GATEWAY__IS_DIVERGING:
			return isDiverging != IS_DIVERGING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDiverging: ");
		result.append(isDiverging);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParallelGatewayImpl
