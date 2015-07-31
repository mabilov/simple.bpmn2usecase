/**
 */
package de.abilov.bpmn.impl;

import de.abilov.bpmn.BpmnPackage;
import de.abilov.bpmn.FlowNode;
import de.abilov.bpmn.SequenceFlow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.abilov.bpmn.impl.SequenceFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link de.abilov.bpmn.impl.SequenceFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link de.abilov.bpmn.impl.SequenceFlowImpl#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceFlowImpl extends FlowElementImpl implements SequenceFlow {
	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected FlowNode sourceRef;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected FlowNode targetRef;

	/**
	 * The default value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected String conditionExpression = CONDITION_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.SEQUENCE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getSourceRef() {
		if (sourceRef != null && sourceRef.eIsProxy()) {
			InternalEObject oldSourceRef = (InternalEObject) sourceRef;
			sourceRef = (FlowNode) eResolveProxy(oldSourceRef);
			if (sourceRef != oldSourceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnPackage.SEQUENCE_FLOW__SOURCE_REF,
							oldSourceRef, sourceRef));
			}
		}
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRef(FlowNode newSourceRef, NotificationChain msgs) {
		FlowNode oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BpmnPackage.SEQUENCE_FLOW__SOURCE_REF, oldSourceRef, newSourceRef);
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
	public void setSourceRef(FlowNode newSourceRef) {
		if (newSourceRef != sourceRef) {
			NotificationChain msgs = null;
			if (sourceRef != null)
				msgs = ((InternalEObject) sourceRef).eInverseRemove(this, BpmnPackage.FLOW_NODE__OUTGOING,
						FlowNode.class, msgs);
			if (newSourceRef != null)
				msgs = ((InternalEObject) newSourceRef).eInverseAdd(this, BpmnPackage.FLOW_NODE__OUTGOING,
						FlowNode.class, msgs);
			msgs = basicSetSourceRef(newSourceRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.SEQUENCE_FLOW__SOURCE_REF, newSourceRef,
					newSourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getTargetRef() {
		if (targetRef != null && targetRef.eIsProxy()) {
			InternalEObject oldTargetRef = (InternalEObject) targetRef;
			targetRef = (FlowNode) eResolveProxy(oldTargetRef);
			if (targetRef != oldTargetRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnPackage.SEQUENCE_FLOW__TARGET_REF,
							oldTargetRef, targetRef));
			}
		}
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetTargetRef() {
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRef(FlowNode newTargetRef, NotificationChain msgs) {
		FlowNode oldTargetRef = targetRef;
		targetRef = newTargetRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BpmnPackage.SEQUENCE_FLOW__TARGET_REF, oldTargetRef, newTargetRef);
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
	public void setTargetRef(FlowNode newTargetRef) {
		if (newTargetRef != targetRef) {
			NotificationChain msgs = null;
			if (targetRef != null)
				msgs = ((InternalEObject) targetRef).eInverseRemove(this, BpmnPackage.FLOW_NODE__INCOMING,
						FlowNode.class, msgs);
			if (newTargetRef != null)
				msgs = ((InternalEObject) newTargetRef).eInverseAdd(this, BpmnPackage.FLOW_NODE__INCOMING,
						FlowNode.class, msgs);
			msgs = basicSetTargetRef(newTargetRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.SEQUENCE_FLOW__TARGET_REF, newTargetRef,
					newTargetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionExpression() {
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(String newConditionExpression) {
		String oldConditionExpression = conditionExpression;
		conditionExpression = newConditionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnPackage.SEQUENCE_FLOW__CONDITION_EXPRESSION,
					oldConditionExpression, conditionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BpmnPackage.SEQUENCE_FLOW__SOURCE_REF:
			if (sourceRef != null)
				msgs = ((InternalEObject) sourceRef).eInverseRemove(this, BpmnPackage.FLOW_NODE__OUTGOING,
						FlowNode.class, msgs);
			return basicSetSourceRef((FlowNode) otherEnd, msgs);
		case BpmnPackage.SEQUENCE_FLOW__TARGET_REF:
			if (targetRef != null)
				msgs = ((InternalEObject) targetRef).eInverseRemove(this, BpmnPackage.FLOW_NODE__INCOMING,
						FlowNode.class, msgs);
			return basicSetTargetRef((FlowNode) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BpmnPackage.SEQUENCE_FLOW__SOURCE_REF:
			return basicSetSourceRef(null, msgs);
		case BpmnPackage.SEQUENCE_FLOW__TARGET_REF:
			return basicSetTargetRef(null, msgs);
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
		case BpmnPackage.SEQUENCE_FLOW__SOURCE_REF:
			if (resolve)
				return getSourceRef();
			return basicGetSourceRef();
		case BpmnPackage.SEQUENCE_FLOW__TARGET_REF:
			if (resolve)
				return getTargetRef();
			return basicGetTargetRef();
		case BpmnPackage.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			return getConditionExpression();
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
		case BpmnPackage.SEQUENCE_FLOW__SOURCE_REF:
			setSourceRef((FlowNode) newValue);
			return;
		case BpmnPackage.SEQUENCE_FLOW__TARGET_REF:
			setTargetRef((FlowNode) newValue);
			return;
		case BpmnPackage.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			setConditionExpression((String) newValue);
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
		case BpmnPackage.SEQUENCE_FLOW__SOURCE_REF:
			setSourceRef((FlowNode) null);
			return;
		case BpmnPackage.SEQUENCE_FLOW__TARGET_REF:
			setTargetRef((FlowNode) null);
			return;
		case BpmnPackage.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			setConditionExpression(CONDITION_EXPRESSION_EDEFAULT);
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
		case BpmnPackage.SEQUENCE_FLOW__SOURCE_REF:
			return sourceRef != null;
		case BpmnPackage.SEQUENCE_FLOW__TARGET_REF:
			return targetRef != null;
		case BpmnPackage.SEQUENCE_FLOW__CONDITION_EXPRESSION:
			return CONDITION_EXPRESSION_EDEFAULT == null ? conditionExpression != null
					: !CONDITION_EXPRESSION_EDEFAULT.equals(conditionExpression);
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
		result.append(" (conditionExpression: ");
		result.append(conditionExpression);
		result.append(')');
		return result.toString();
	}

	// <-- [user code injected with eMoflon]
	private boolean _exported = false;

	public String export() {
		StringBuffer sb = new StringBuffer();
		sb.append(" sequence flow ");
		//sb.append(this.getId());
		if (this.getTargetRef() != null) {
			sb.append(this.getTargetRef().export());
		}
		this._exported = true;
		return sb.toString();
	}

	public boolean isExported() {
		return this._exported;
	}
	// [user code injected with eMoflon] -->
} //SequenceFlowImpl
