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
	 * The cached value of the '{@link #getFinalState() <em>Final State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalState()
	 * @generated
	 * @ordered
	 */
	protected UCCondition finalState;

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
	public UCCondition getFinalState() {
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalState(UCCondition newFinalState, NotificationChain msgs) {
		UCCondition oldFinalState = finalState;
		finalState = newFinalState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimpleUseCasePackage.FLOW__FINAL_STATE, oldFinalState, newFinalState);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalState(UCCondition newFinalState) {
		if (newFinalState != finalState) {
			NotificationChain msgs = null;
			if (finalState != null)
				msgs = ((InternalEObject) finalState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SimpleUseCasePackage.FLOW__FINAL_STATE, null, msgs);
			if (newFinalState != null)
				msgs = ((InternalEObject) newFinalState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SimpleUseCasePackage.FLOW__FINAL_STATE, null, msgs);
			msgs = basicSetFinalState(newFinalState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUseCasePackage.FLOW__FINAL_STATE, newFinalState,
					newFinalState));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleUseCasePackage.FLOW__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case SimpleUseCasePackage.FLOW__FINAL_STATE:
			return basicSetFinalState(null, msgs);
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
			setFinalState((UCCondition) newValue);
			return;
		case SimpleUseCasePackage.FLOW__LAST:
			set__last((Step) newValue);
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
			setFinalState((UCCondition) null);
			return;
		case SimpleUseCasePackage.FLOW__LAST:
			set__last((Step) null);
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
			return finalState != null;
		case SimpleUseCasePackage.FLOW__LAST:
			return __last != null;
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]
	public String export() {
		StringBuffer sb = new StringBuffer();
		if (this.getFinalState() != null) {
			sb.append(" final state ");
			sb.append(this.getFinalState().getName());
		}

		Step first = null;
		for (Step step : this.getSteps()) {
			java.util.Optional<Step> prev = this.getSteps().stream().filter(s -> s.getNext() == step).findAny();
			if (!prev.isPresent()) {
				first = step;
				break;
			}
		}
		if (first != null) {
			sb.append(first.export());
			Step current = first;
			while (current.getNext() != null) {
				current = current.getNext();
				sb.append(current.export());
			}
		}
		return sb.toString();
	}

	public Step findFirst() {
		org.eclipse.emf.common.util.EList<Step> els = this.getSteps();
		for (Step el : els) {
			boolean first = true;
			for (Step el1 : els) {
				if (el1.getNext() == el) {
					first = false;
					break;
				}
			}
			if (first) {
				return el;
			}
		}
		return null;
	}

	public Step findLast() {
		java.util.Optional<Step> step = this.getSteps().stream().filter(s -> s.getNext() == null).findAny();

		if (step.isPresent())
			return step.get();
		else
			return null;
	}
	// [user code injected with eMoflon] -->
} //FlowImpl
