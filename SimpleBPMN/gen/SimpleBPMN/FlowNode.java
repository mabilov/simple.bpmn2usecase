/**
 */
package SimpleBPMN;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleBPMN.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link SimpleBPMN.FlowNode#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleBPMN.SimpleBPMNPackage#getFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface FlowNode extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link SimpleBPMN.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link SimpleBPMN.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see SimpleBPMN.SimpleBPMNPackage#getFlowNode_Outgoing()
	 * @see SimpleBPMN.SequenceFlow#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link SimpleBPMN.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link SimpleBPMN.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see SimpleBPMN.SimpleBPMNPackage#getFlowNode_Incoming()
	 * @see SimpleBPMN.SequenceFlow#getTargetRef
	 * @model opposite="targetRef"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();
	// <-- [user code injected with eMoflon]
	String exportOutgoing();
	// [user code injected with eMoflon] -->
} // FlowNode
