/**
 */
package SimpleBPMN;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleBPMN.ParallelGateway#isIsDiverging <em>Is Diverging</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleBPMN.SimpleBPMNPackage#getParallelGateway()
 * @model
 * @generated
 */
public interface ParallelGateway extends FlowNode {
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
	 * @see SimpleBPMN.SimpleBPMNPackage#getParallelGateway_IsDiverging()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDiverging();

	/**
	 * Sets the value of the '{@link SimpleBPMN.ParallelGateway#isIsDiverging <em>Is Diverging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Diverging</em>' attribute.
	 * @see #isIsDiverging()
	 * @generated
	 */
	void setIsDiverging(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ParallelGateway
