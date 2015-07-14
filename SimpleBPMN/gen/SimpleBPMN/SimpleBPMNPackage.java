/**
 */
package SimpleBPMN;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SimpleBPMN.SimpleBPMNFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleBPMNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimpleBPMN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/SimpleBPMN/model/SimpleBPMN.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SimpleBPMN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleBPMNPackage eINSTANCE = SimpleBPMN.impl.SimpleBPMNPackageImpl.init();

	/**
	 * The meta object id for the '{@link SimpleBPMN.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleBPMN.impl.ProcessImpl
	 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FLOW_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SimpleBPMN.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleBPMN.impl.FlowElementImpl
	 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SimpleBPMN.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleBPMN.impl.FlowNodeImpl
	 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__OUTGOING = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__INCOMING = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleBPMN.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleBPMN.impl.SequenceFlowImpl
	 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__SOURCE_REF = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TARGET_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleBPMN.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleBPMN.impl.TaskImpl
	 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleBPMN.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleBPMN.impl.ParallelGatewayImpl
	 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getParallelGateway()
	 * @generated
	 */
	int PARALLEL_GATEWAY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>conv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__CONV = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Diverging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__IS_DIVERGING = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleBPMN.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleBPMN.impl.StartEventImpl
	 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link SimpleBPMN.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see SimpleBPMN.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleBPMN.Process#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
	 * @see SimpleBPMN.Process#getFlowElements()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FlowElements();

	/**
	 * Returns the meta object for class '{@link SimpleBPMN.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see SimpleBPMN.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the attribute '{@link SimpleBPMN.FlowElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SimpleBPMN.FlowElement#getId()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Id();

	/**
	 * Returns the meta object for class '{@link SimpleBPMN.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see SimpleBPMN.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the reference list '{@link SimpleBPMN.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see SimpleBPMN.FlowNode#getOutgoing()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link SimpleBPMN.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see SimpleBPMN.FlowNode#getIncoming()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Incoming();

	/**
	 * Returns the meta object for class '{@link SimpleBPMN.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see SimpleBPMN.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for the reference '{@link SimpleBPMN.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see SimpleBPMN.SequenceFlow#getSourceRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link SimpleBPMN.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see SimpleBPMN.SequenceFlow#getTargetRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_TargetRef();

	/**
	 * Returns the meta object for class '{@link SimpleBPMN.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see SimpleBPMN.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link SimpleBPMN.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway</em>'.
	 * @see SimpleBPMN.ParallelGateway
	 * @generated
	 */
	EClass getParallelGateway();

	/**
	 * Returns the meta object for the reference '{@link SimpleBPMN.ParallelGateway#get__conv <em>conv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>conv</em>'.
	 * @see SimpleBPMN.ParallelGateway#get__conv()
	 * @see #getParallelGateway()
	 * @generated
	 */
	EReference getParallelGateway___conv();

	/**
	 * Returns the meta object for the attribute '{@link SimpleBPMN.ParallelGateway#isIsDiverging <em>Is Diverging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Diverging</em>'.
	 * @see SimpleBPMN.ParallelGateway#isIsDiverging()
	 * @see #getParallelGateway()
	 * @generated
	 */
	EAttribute getParallelGateway_IsDiverging();

	/**
	 * Returns the meta object for class '{@link SimpleBPMN.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see SimpleBPMN.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleBPMNFactory getSimpleBPMNFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SimpleBPMN.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleBPMN.impl.ProcessImpl
		 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Flow Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FLOW_ELEMENTS = eINSTANCE.getProcess_FlowElements();

		/**
		 * The meta object literal for the '{@link SimpleBPMN.impl.FlowElementImpl <em>Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleBPMN.impl.FlowElementImpl
		 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__ID = eINSTANCE.getFlowElement_Id();

		/**
		 * The meta object literal for the '{@link SimpleBPMN.impl.FlowNodeImpl <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleBPMN.impl.FlowNodeImpl
		 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__OUTGOING = eINSTANCE.getFlowNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__INCOMING = eINSTANCE.getFlowNode_Incoming();

		/**
		 * The meta object literal for the '{@link SimpleBPMN.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleBPMN.impl.SequenceFlowImpl
		 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getSequenceFlow()
		 * @generated
		 */
		EClass SEQUENCE_FLOW = eINSTANCE.getSequenceFlow();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__SOURCE_REF = eINSTANCE.getSequenceFlow_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__TARGET_REF = eINSTANCE.getSequenceFlow_TargetRef();

		/**
		 * The meta object literal for the '{@link SimpleBPMN.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleBPMN.impl.TaskImpl
		 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link SimpleBPMN.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleBPMN.impl.ParallelGatewayImpl
		 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getParallelGateway()
		 * @generated
		 */
		EClass PARALLEL_GATEWAY = eINSTANCE.getParallelGateway();

		/**
		 * The meta object literal for the '<em><b>conv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_GATEWAY__CONV = eINSTANCE.getParallelGateway___conv();

		/**
		 * The meta object literal for the '<em><b>Is Diverging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL_GATEWAY__IS_DIVERGING = eINSTANCE.getParallelGateway_IsDiverging();

		/**
		 * The meta object literal for the '{@link SimpleBPMN.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleBPMN.impl.StartEventImpl
		 * @see SimpleBPMN.impl.SimpleBPMNPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

	}

} //SimpleBPMNPackage
