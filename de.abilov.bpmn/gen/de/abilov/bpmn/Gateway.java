/**
 */
package de.abilov.bpmn;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.abilov.bpmn.Gateway#get__conv <em>conv</em>}</li>
 *   <li>{@link de.abilov.bpmn.Gateway#isIsDiverging <em>Is Diverging</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.abilov.bpmn.BpmnPackage#getGateway()
 * @model abstract="true"
 * @generated
 */
public interface Gateway extends FlowNode {
	/**
	 * Returns the value of the '<em><b>conv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>conv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>conv</em>' reference.
	 * @see #set__conv(Gateway)
	 * @see de.abilov.bpmn.BpmnPackage#getGateway___conv()
	 * @model
	 * @generated
	 */
	Gateway get__conv();

	/**
	 * Sets the value of the '{@link de.abilov.bpmn.Gateway#get__conv <em>conv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>conv</em>' reference.
	 * @see #get__conv()
	 * @generated
	 */
	void set__conv(Gateway value);

	/**
	 * Returns the value of the '<em><b>Is Diverging</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Diverging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Diverging</em>' attribute.
	 * @see #setIsDiverging(boolean)
	 * @see de.abilov.bpmn.BpmnPackage#getGateway_IsDiverging()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDiverging();

	/**
	 * Sets the value of the '{@link de.abilov.bpmn.Gateway#isIsDiverging <em>Is Diverging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Diverging</em>' attribute.
	 * @see #isIsDiverging()
	 * @generated
	 */
	void setIsDiverging(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Gateway
