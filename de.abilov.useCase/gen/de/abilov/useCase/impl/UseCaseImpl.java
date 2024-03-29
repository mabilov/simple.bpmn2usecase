/**
 */
package de.abilov.useCase.impl;

import de.abilov.useCase.Flow;
import de.abilov.useCase.UCCondition;
import de.abilov.useCase.UseCase;
import de.abilov.useCase.UseCasePackage;

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
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.abilov.useCase.impl.UseCaseImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link de.abilov.useCase.impl.UseCaseImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link de.abilov.useCase.impl.UseCaseImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends EObjectImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> flows;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected UCCondition precondition;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasePackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList<Flow>(Flow.class, this, UseCasePackage.USE_CASE__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCCondition getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(UCCondition newPrecondition, NotificationChain msgs) {
		UCCondition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UseCasePackage.USE_CASE__PRECONDITION, oldPrecondition, newPrecondition);
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
	public void setPrecondition(UCCondition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject) precondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UseCasePackage.USE_CASE__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject) newPrecondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UseCasePackage.USE_CASE__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.USE_CASE__PRECONDITION,
					newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasePackage.USE_CASE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UseCasePackage.USE_CASE__FLOWS:
			return ((InternalEList<?>) getFlows()).basicRemove(otherEnd, msgs);
		case UseCasePackage.USE_CASE__PRECONDITION:
			return basicSetPrecondition(null, msgs);
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
		case UseCasePackage.USE_CASE__FLOWS:
			return getFlows();
		case UseCasePackage.USE_CASE__PRECONDITION:
			return getPrecondition();
		case UseCasePackage.USE_CASE__ID:
			return getId();
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
		case UseCasePackage.USE_CASE__FLOWS:
			getFlows().clear();
			getFlows().addAll((Collection<? extends Flow>) newValue);
			return;
		case UseCasePackage.USE_CASE__PRECONDITION:
			setPrecondition((UCCondition) newValue);
			return;
		case UseCasePackage.USE_CASE__ID:
			setId((String) newValue);
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
		case UseCasePackage.USE_CASE__FLOWS:
			getFlows().clear();
			return;
		case UseCasePackage.USE_CASE__PRECONDITION:
			setPrecondition((UCCondition) null);
			return;
		case UseCasePackage.USE_CASE__ID:
			setId(ID_EDEFAULT);
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
		case UseCasePackage.USE_CASE__FLOWS:
			return flows != null && !flows.isEmpty();
		case UseCasePackage.USE_CASE__PRECONDITION:
			return precondition != null;
		case UseCasePackage.USE_CASE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	// <-- [user code injected with eMoflon]
	public String export() {
		StringBuffer sb = new StringBuffer();
		sb.append("use case ");
		sb.append(this.getId());
		if (this.getPrecondition() != null) {
			sb.append(" precondition ");
			sb.append(this.getPrecondition().getName());
		}
		java.util.Optional<Flow> basicFlowOptional = this.getFlows().stream()
				.filter(f -> f instanceof de.abilov.useCase.BasicFlow).findAny();
		if (basicFlowOptional.isPresent()) {
			de.abilov.useCase.BasicFlow bFlow = (de.abilov.useCase.BasicFlow) basicFlowOptional.get();
			sb.append(" basic flow");
			sb.append(bFlow.export());
		}

		java.util.Iterator<de.abilov.useCase.NamedFlow> sortedFlows = this.getFlows().stream()
				.filter(f -> f instanceof de.abilov.useCase.NamedFlow)
				.map(new java.util.function.Function<de.abilov.useCase.Flow, de.abilov.useCase.NamedFlow>() {
					@Override
					public de.abilov.useCase.NamedFlow apply(Flow t) {
						return (de.abilov.useCase.NamedFlow) t;
					}
				}).sorted(new de.abilov.useCase.util.NamedFlowComparator()).iterator();

		while (sortedFlows.hasNext()) {
			Flow flow = sortedFlows.next();
			if (flow instanceof de.abilov.useCase.BasicFlow)
				continue;
			else if (flow instanceof de.abilov.useCase.ParallelFlow) {
				sb.append(" parallel flow ");
				sb.append(flow.export());
			} else if (flow instanceof de.abilov.useCase.AlternativeFlow) {
				sb.append(" alternative flow ");
				sb.append(flow.export());
			}
		}
		return sb.toString();
	}
	// [user code injected with eMoflon] -->
} //UseCaseImpl
