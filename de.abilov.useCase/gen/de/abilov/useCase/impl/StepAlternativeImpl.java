/**
 */
package de.abilov.useCase.impl;

import de.abilov.useCase.AlternativeFlow;
import de.abilov.useCase.ChoiceStep;
import de.abilov.useCase.Step;
import de.abilov.useCase.StepAlternative;
import de.abilov.useCase.UseCasePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.abilov.useCase.impl.StepAlternativeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link de.abilov.useCase.impl.StepAlternativeImpl#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link de.abilov.useCase.impl.StepAlternativeImpl#get__hasContinue <em>has Continue</em>}</li>
 *   <li>{@link de.abilov.useCase.impl.StepAlternativeImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepAlternativeImpl extends EObjectImpl implements StepAlternative {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected AlternativeFlow ref;

	/**
	 * The cached value of the '{@link #getContinuation() <em>Continuation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuation()
	 * @generated
	 * @ordered
	 */
	protected Step continuation;

	/**
	 * The cached value of the '{@link #get__hasContinue() <em>has Continue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__hasContinue()
	 * @generated
	 * @ordered
	 */
	protected ChoiceStep __hasContinue;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepAlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasePackage.Literals.STEP_ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeFlow getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject) ref;
			ref = (AlternativeFlow) eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UseCasePackage.STEP_ALTERNATIVE__REF,
							oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeFlow basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(AlternativeFlow newRef) {
		AlternativeFlow oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.STEP_ALTERNATIVE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getContinuation() {
		if (continuation != null && continuation.eIsProxy()) {
			InternalEObject oldContinuation = (InternalEObject) continuation;
			continuation = (Step) eResolveProxy(oldContinuation);
			if (continuation != oldContinuation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UseCasePackage.STEP_ALTERNATIVE__CONTINUATION, oldContinuation, continuation));
			}
		}
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetContinuation() {
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuation(Step newContinuation) {
		Step oldContinuation = continuation;
		continuation = newContinuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.STEP_ALTERNATIVE__CONTINUATION,
					oldContinuation, continuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceStep get__hasContinue() {
		if (__hasContinue != null && __hasContinue.eIsProxy()) {
			InternalEObject old__hasContinue = (InternalEObject) __hasContinue;
			__hasContinue = (ChoiceStep) eResolveProxy(old__hasContinue);
			if (__hasContinue != old__hasContinue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UseCasePackage.STEP_ALTERNATIVE__HAS_CONTINUE, old__hasContinue, __hasContinue));
			}
		}
		return __hasContinue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceStep basicGet__hasContinue() {
		return __hasContinue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__hasContinue(ChoiceStep new__hasContinue) {
		ChoiceStep old__hasContinue = __hasContinue;
		__hasContinue = new__hasContinue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.STEP_ALTERNATIVE__HAS_CONTINUE,
					old__hasContinue, __hasContinue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.STEP_ALTERNATIVE__CONDITION,
					oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UseCasePackage.STEP_ALTERNATIVE__REF:
			if (resolve)
				return getRef();
			return basicGetRef();
		case UseCasePackage.STEP_ALTERNATIVE__CONTINUATION:
			if (resolve)
				return getContinuation();
			return basicGetContinuation();
		case UseCasePackage.STEP_ALTERNATIVE__HAS_CONTINUE:
			if (resolve)
				return get__hasContinue();
			return basicGet__hasContinue();
		case UseCasePackage.STEP_ALTERNATIVE__CONDITION:
			return getCondition();
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
		case UseCasePackage.STEP_ALTERNATIVE__REF:
			setRef((AlternativeFlow) newValue);
			return;
		case UseCasePackage.STEP_ALTERNATIVE__CONTINUATION:
			setContinuation((Step) newValue);
			return;
		case UseCasePackage.STEP_ALTERNATIVE__HAS_CONTINUE:
			set__hasContinue((ChoiceStep) newValue);
			return;
		case UseCasePackage.STEP_ALTERNATIVE__CONDITION:
			setCondition((String) newValue);
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
		case UseCasePackage.STEP_ALTERNATIVE__REF:
			setRef((AlternativeFlow) null);
			return;
		case UseCasePackage.STEP_ALTERNATIVE__CONTINUATION:
			setContinuation((Step) null);
			return;
		case UseCasePackage.STEP_ALTERNATIVE__HAS_CONTINUE:
			set__hasContinue((ChoiceStep) null);
			return;
		case UseCasePackage.STEP_ALTERNATIVE__CONDITION:
			setCondition(CONDITION_EDEFAULT);
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
		case UseCasePackage.STEP_ALTERNATIVE__REF:
			return ref != null;
		case UseCasePackage.STEP_ALTERNATIVE__CONTINUATION:
			return continuation != null;
		case UseCasePackage.STEP_ALTERNATIVE__HAS_CONTINUE:
			return __hasContinue != null;
		case UseCasePackage.STEP_ALTERNATIVE__CONDITION:
			return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //StepAlternativeImpl
