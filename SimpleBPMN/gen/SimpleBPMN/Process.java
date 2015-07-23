/**
 */
package SimpleBPMN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleBPMN.Process#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link SimpleBPMN.Process#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleBPMN.SimpleBPMNPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleBPMN.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see SimpleBPMN.SimpleBPMNPackage#getProcess_FlowElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see SimpleBPMN.SimpleBPMNPackage#getProcess_Id()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link SimpleBPMN.Process#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);
	// <-- [user code injected with eMoflon]
	/**
	 * Export process to string so it can be compared with the another
	 * @return string representation of the process
	 */
	String export();
	
	/**
	 * Find first node in the process, which is usually a start event
	 * @return
	 */
	SimpleBPMN.FlowNode findFirst();
	// [user code injected with eMoflon] -->
} // Process
