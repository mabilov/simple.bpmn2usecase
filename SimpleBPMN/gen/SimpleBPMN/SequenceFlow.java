/**
 */
package SimpleBPMN;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Sequence Flow</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link SimpleBPMN.SequenceFlow#getSourceRef <em>Source Ref</em>}</li>
 * <li>{@link SimpleBPMN.SequenceFlow#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleBPMN.SimpleBPMNPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference. It is
	 * bidirectional and its opposite is '{@link SimpleBPMN.FlowNode#getOutgoing
	 * <em>Outgoing</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(FlowNode)
	 * @see SimpleBPMN.SimpleBPMNPackage#getSequenceFlow_SourceRef()
	 * @see SimpleBPMN.FlowNode#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	FlowNode getSourceRef();

	/**
	 * Sets the value of the '{@link SimpleBPMN.SequenceFlow#getSourceRef
	 * <em>Source Ref</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference. It is
	 * bidirectional and its opposite is '{@link SimpleBPMN.FlowNode#getIncoming
	 * <em>Incoming</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(FlowNode)
	 * @see SimpleBPMN.SimpleBPMNPackage#getSequenceFlow_TargetRef()
	 * @see SimpleBPMN.FlowNode#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	FlowNode getTargetRef();

	/**
	 * Sets the value of the '{@link SimpleBPMN.SequenceFlow#getTargetRef
	 * <em>Target Ref</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(FlowNode value);

	// <-- [user code injected with eMoflon]
	/**
	 * Check if the sequence flow has already been exported
	 * 
	 * @return
	 */
	boolean isExported();
	// [user code injected with eMoflon] -->
} // SequenceFlow
