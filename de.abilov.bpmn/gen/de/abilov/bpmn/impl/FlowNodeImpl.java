/**
 */
package de.abilov.bpmn.impl;

import de.abilov.bpmn.BpmnPackage;
import de.abilov.bpmn.FlowNode;
import de.abilov.bpmn.SequenceFlow;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.abilov.bpmn.impl.FlowNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.abilov.bpmn.impl.FlowNodeImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowNodeImpl extends FlowElementImpl implements FlowNode {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.FLOW_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceFlow> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this,
					BpmnPackage.FLOW_NODE__OUTGOING, BpmnPackage.SEQUENCE_FLOW__SOURCE_REF);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceFlow> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<SequenceFlow>(SequenceFlow.class, this,
					BpmnPackage.FLOW_NODE__INCOMING, BpmnPackage.SEQUENCE_FLOW__TARGET_REF);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BpmnPackage.FLOW_NODE__OUTGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd(otherEnd, msgs);
		case BpmnPackage.FLOW_NODE__INCOMING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming()).basicAdd(otherEnd, msgs);
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
		case BpmnPackage.FLOW_NODE__OUTGOING:
			return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd, msgs);
		case BpmnPackage.FLOW_NODE__INCOMING:
			return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd, msgs);
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
		case BpmnPackage.FLOW_NODE__OUTGOING:
			return getOutgoing();
		case BpmnPackage.FLOW_NODE__INCOMING:
			return getIncoming();
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
		case BpmnPackage.FLOW_NODE__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll((Collection<? extends SequenceFlow>) newValue);
			return;
		case BpmnPackage.FLOW_NODE__INCOMING:
			getIncoming().clear();
			getIncoming().addAll((Collection<? extends SequenceFlow>) newValue);
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
		case BpmnPackage.FLOW_NODE__OUTGOING:
			getOutgoing().clear();
			return;
		case BpmnPackage.FLOW_NODE__INCOMING:
			getIncoming().clear();
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
		case BpmnPackage.FLOW_NODE__OUTGOING:
			return outgoing != null && !outgoing.isEmpty();
		case BpmnPackage.FLOW_NODE__INCOMING:
			return incoming != null && !incoming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	// <-- [user code injected with eMoflon]
	public String export() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getClass().toString());
		sb.append(" ");
		sb.append(this.getId());
		sb.append(this.exportOutgoing());
		return sb.toString();
	}

	public String exportOutgoing() {
		StringBuffer sb = new StringBuffer();
		java.util.Iterator<SequenceFlow> sflows = this.getOutgoing().stream()
				.sorted(new java.util.Comparator<SequenceFlow>() {
					@Override
					public int compare(SequenceFlow arg0, SequenceFlow arg1) {
						return arg0.getId().compareTo(arg1.getId());
					}
				}).iterator();
		while (sflows.hasNext()) {
			sb.append(sflows.next().export());
		}
		return sb.toString();
	}
	// [user code injected with eMoflon] -->
} //FlowNodeImpl
