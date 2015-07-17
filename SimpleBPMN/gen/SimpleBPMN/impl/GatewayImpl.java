/**
 */
package SimpleBPMN.impl;

import SimpleBPMN.Gateway;
import SimpleBPMN.SimpleBPMNPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleBPMN.impl.GatewayImpl#get__conv <em>conv</em>}</li>
 *   <li>{@link SimpleBPMN.impl.GatewayImpl#isIsDiverging <em>Is Diverging</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GatewayImpl extends FlowNodeImpl implements Gateway {
	/**
	 * The cached value of the '{@link #get__conv() <em>conv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__conv()
	 * @generated
	 * @ordered
	 */
	protected Gateway __conv;

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
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleBPMNPackage.Literals.GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway get__conv() {
		if (__conv != null && __conv.eIsProxy()) {
			InternalEObject old__conv = (InternalEObject) __conv;
			__conv = (Gateway) eResolveProxy(old__conv);
			if (__conv != old__conv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleBPMNPackage.GATEWAY__CONV,
							old__conv, __conv));
			}
		}
		return __conv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway basicGet__conv() {
		return __conv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__conv(Gateway new__conv) {
		Gateway old__conv = __conv;
		__conv = new__conv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleBPMNPackage.GATEWAY__CONV, old__conv, __conv));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleBPMNPackage.GATEWAY__IS_DIVERGING,
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
		case SimpleBPMNPackage.GATEWAY__CONV:
			if (resolve)
				return get__conv();
			return basicGet__conv();
		case SimpleBPMNPackage.GATEWAY__IS_DIVERGING:
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
		case SimpleBPMNPackage.GATEWAY__CONV:
			set__conv((Gateway) newValue);
			return;
		case SimpleBPMNPackage.GATEWAY__IS_DIVERGING:
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
		case SimpleBPMNPackage.GATEWAY__CONV:
			set__conv((Gateway) null);
			return;
		case SimpleBPMNPackage.GATEWAY__IS_DIVERGING:
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
		case SimpleBPMNPackage.GATEWAY__CONV:
			return __conv != null;
		case SimpleBPMNPackage.GATEWAY__IS_DIVERGING:
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
} //GatewayImpl
