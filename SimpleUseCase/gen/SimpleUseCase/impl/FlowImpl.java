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
 *   <li>{@link SimpleUseCase.impl.FlowImpl#get__first <em>first</em>}</li>
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
	 * The cached value of the '{@link #get__first() <em>first</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__first()
	 * @generated
	 * @ordered
	 */
	protected Step __first;

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
	public Step get__first() {
		if (__first != null && __first.eIsProxy()) {
			InternalEObject old__first = (InternalEObject) __first;
			__first = (Step) eResolveProxy(old__first);
			if (__first != old__first) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleUseCasePackage.FLOW__FIRST,
							old__first, __first));
			}
		}
		return __first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGet__first() {
		return __first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__first(Step new__first) {
		Step old__first = __first;
		__first = new__first;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUseCasePackage.FLOW__FIRST, old__first,
					__first));
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
		case SimpleUseCasePackage.FLOW__FIRST:
			if (resolve)
				return get__first();
			return basicGet__first();
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
		case SimpleUseCasePackage.FLOW__FIRST:
			set__first((Step) newValue);
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
		case SimpleUseCasePackage.FLOW__FIRST:
			set__first((Step) null);
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
		case SimpleUseCasePackage.FLOW__FIRST:
			return __first != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FlowImpl
