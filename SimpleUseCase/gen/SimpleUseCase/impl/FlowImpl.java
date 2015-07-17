/**
 */
package SimpleUseCase.impl;

import SimpleUseCase.Flow;
import SimpleUseCase.SimpleUseCasePackage;
import SimpleUseCase.Step;
import SimpleUseCase.UCCondition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleUseCase.impl.FlowImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link SimpleUseCase.impl.FlowImpl#getFinalState <em>Final State</em>}</li>
 *   <li>{@link SimpleUseCase.impl.FlowImpl#get__last <em>last</em>}</li>
 *   <li>{@link SimpleUseCase.impl.FlowImpl#is__empty <em>empty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowImpl extends EObjectImpl implements Flow {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected EList<UCCondition> finalState;

	/**
	 * The cached value of the '{@link #get__last() <em>last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__last()
	 * @generated
	 * @ordered
	 */
	protected Step __last;

	/**
	 * The default value of the '{@link #is__empty() <em>empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is__empty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean _EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is__empty() <em>empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is__empty()
	 * @generated
	 * @ordered
	 */
	protected boolean __empty = _EMPTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleUseCasePackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, SimpleUseCasePackage.FLOW__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCCondition> getFinalState() {
		if (finalState == null) {
			finalState = new EObjectContainmentEList<UCCondition>(UCCondition.class, this,
					SimpleUseCasePackage.FLOW__FINAL_STATE);
		}
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step get__last() {
		if (__last != null && __last.eIsProxy()) {
			InternalEObject old__last = (InternalEObject) __last;
			__last = (Step) eResolveProxy(old__last);
			if (__last != old__last) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleUseCasePackage.FLOW__LAST,
							old__last, __last));
			}
		}
		return __last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGet__last() {
		return __last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__last(Step new__last) {
		Step old__last = __last;
		__last = new__last;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUseCasePackage.FLOW__LAST, old__last, __last));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is__empty() {
		return getSteps() == null || getSteps().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__empty(boolean new__empty) {
		boolean old__empty = __empty;
		__empty = new__empty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUseCasePackage.FLOW__EMPTY, old__empty,
					__empty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleUseCasePackage.FLOW__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case SimpleUseCasePackage.FLOW__FINAL_STATE:
			return ((InternalEList<?>) getFinalState()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleUseCasePackage.FLOW__STEPS:
			return getSteps();
		case SimpleUseCasePackage.FLOW__FINAL_STATE:
			return getFinalState();
		case SimpleUseCasePackage.FLOW__LAST:
			if (resolve)
				return get__last();
			return basicGet__last();
		case SimpleUseCasePackage.FLOW__EMPTY:
			return is__empty();
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
		case SimpleUseCasePackage.FLOW__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case SimpleUseCasePackage.FLOW__FINAL_STATE:
			getFinalState().clear();
			getFinalState().addAll((Collection<? extends UCCondition>) newValue);
			return;
		case SimpleUseCasePackage.FLOW__LAST:
			set__last((Step) newValue);
			return;
		case SimpleUseCasePackage.FLOW__EMPTY:
			set__empty((Boolean) newValue);
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
		case SimpleUseCasePackage.FLOW__STEPS:
			getSteps().clear();
			return;
		case SimpleUseCasePackage.FLOW__FINAL_STATE:
			getFinalState().clear();
			return;
		case SimpleUseCasePackage.FLOW__LAST:
			set__last((Step) null);
			return;
		case SimpleUseCasePackage.FLOW__EMPTY:
			set__empty(_EMPTY_EDEFAULT);
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
		case SimpleUseCasePackage.FLOW__STEPS:
			return steps != null && !steps.isEmpty();
		case SimpleUseCasePackage.FLOW__FINAL_STATE:
			return finalState != null && !finalState.isEmpty();
		case SimpleUseCasePackage.FLOW__LAST:
			return __last != null;
		case SimpleUseCasePackage.FLOW__EMPTY:
			return __empty != _EMPTY_EDEFAULT;
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
		result.append(" (__empty: ");
		result.append(__empty);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FlowImpl
