/**
 */
package SimpleUseCase.impl;

import SimpleUseCase.ChoiceStep;
import SimpleUseCase.SimpleUseCasePackage;
import SimpleUseCase.Step;
import SimpleUseCase.StepAlternative;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleUseCase.impl.ChoiceStepImpl#getStepAlternatives <em>Step Alternatives</em>}</li>
 *   <li>{@link SimpleUseCase.impl.ChoiceStepImpl#get__lastInDef <em>last In Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceStepImpl extends StepImpl implements ChoiceStep {
	/**
	 * The cached value of the '{@link #getStepAlternatives() <em>Step Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<StepAlternative> stepAlternatives;

	/**
	 * The cached value of the '{@link #get__lastInDef() <em>last In Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__lastInDef()
	 * @generated
	 * @ordered
	 */
	protected Step __lastInDef;

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
	public EList<StepAlternative> getStepAlternatives() {
		if (stepAlternatives == null) {
			stepAlternatives = new EObjectContainmentEList<StepAlternative>(StepAlternative.class, this,
					SimpleUseCasePackage.CHOICE_STEP__STEP_ALTERNATIVES);
		}
		return stepAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step get__lastInDef() {
		if (__lastInDef != null && __lastInDef.eIsProxy()) {
			InternalEObject old__lastInDef = (InternalEObject) __lastInDef;
			__lastInDef = (Step) eResolveProxy(old__lastInDef);
			if (__lastInDef != old__lastInDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimpleUseCasePackage.CHOICE_STEP__LAST_IN_DEF, old__lastInDef, __lastInDef));
			}
		}
		return __lastInDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGet__lastInDef() {
		return __lastInDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__lastInDef(Step new__lastInDef) {
		Step old__lastInDef = __lastInDef;
		__lastInDef = new__lastInDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleUseCasePackage.CHOICE_STEP__LAST_IN_DEF,
					old__lastInDef, __lastInDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleUseCasePackage.CHOICE_STEP__STEP_ALTERNATIVES:
			return ((InternalEList<?>) getStepAlternatives()).basicRemove(otherEnd, msgs);
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
		case SimpleUseCasePackage.CHOICE_STEP__STEP_ALTERNATIVES:
			return getStepAlternatives();
		case SimpleUseCasePackage.CHOICE_STEP__LAST_IN_DEF:
			if (resolve)
				return get__lastInDef();
			return basicGet__lastInDef();
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
		case SimpleUseCasePackage.CHOICE_STEP__STEP_ALTERNATIVES:
			getStepAlternatives().clear();
			getStepAlternatives().addAll((Collection<? extends StepAlternative>) newValue);
			return;
		case SimpleUseCasePackage.CHOICE_STEP__LAST_IN_DEF:
			set__lastInDef((Step) newValue);
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
		case SimpleUseCasePackage.CHOICE_STEP__STEP_ALTERNATIVES:
			getStepAlternatives().clear();
			return;
		case SimpleUseCasePackage.CHOICE_STEP__LAST_IN_DEF:
			set__lastInDef((Step) null);
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
		case SimpleUseCasePackage.CHOICE_STEP__STEP_ALTERNATIVES:
			return stepAlternatives != null && !stepAlternatives.isEmpty();
		case SimpleUseCasePackage.CHOICE_STEP__LAST_IN_DEF:
			return __lastInDef != null;
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]
	public String export() {
		StringBuffer sb = new StringBuffer();
		sb.append(" choice step ");
		sb.append(this.getId());
		String comma = "";

		java.util.Iterator<StepAlternative> altFlows = this.getStepAlternatives().stream()
				.sorted(new java.util.Comparator<StepAlternative>() {
					@Override
					public int compare(StepAlternative o1, StepAlternative o2) {
						return o1.getCondition().compareTo(o2.getCondition());
					}
				}).iterator();
		while (altFlows.hasNext()) {
			StepAlternative alt = altFlows.next();
			sb.append(comma);
			sb.append("if " + alt.getCondition() + " then alternative flow " + alt.getRef().getId());
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
