/**
 */
package de.abilov.bpmn.impl;

import de.abilov.bpmn.BpmnPackage;
import de.abilov.bpmn.Event;

import org.eclipse.emf.ecore.EClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class EventImpl extends FlowNodeImpl implements Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnPackage.Literals.EVENT;
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EventImpl
