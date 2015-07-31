/**
 */
package de.abilov.bpmn;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.abilov.bpmn.ExclusiveGateway#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.abilov.bpmn.BpmnPackage#getExclusiveGateway()
 * @model
 * @generated
 */
public interface ExclusiveGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(SequenceFlow)
	 * @see de.abilov.bpmn.BpmnPackage#getExclusiveGateway_Default()
	 * @model
	 * @generated
	 */
	SequenceFlow getDefault();

	/**
	 * Sets the value of the '{@link de.abilov.bpmn.ExclusiveGateway#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SequenceFlow value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExclusiveGateway
