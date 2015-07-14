/**
 */
package Bpmn2UseCase.Rules;

import TGGRuntime.TGGRuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see Bpmn2UseCase.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/Bpmn2UseCase/model/Bpmn2UseCase.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = Bpmn2UseCase.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Process2UseCaseImpl <em>Process2 Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Process2UseCaseImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getProcess2UseCase()
	 * @generated
	 */
	int PROCESS2_USE_CASE = 0;

	/**
	 * The number of structural features of the '<em>Process2 Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD__MATCH_PROCESS_STARTEVENT_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_STARTEVENT_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_STARTEVENT_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_STARTEVENT_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD__MATCH_USECASE_BASICFLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_BASICFLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_BASICFLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_BASICFLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 102</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_102__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 103</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_103__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 29</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_29__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 30</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 104</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_104__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 105</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_105__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PROCESS_USECASE_BASICFLOW_STARTEVENT_SEQUENCEFLOW_UCCONDITION_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___GENERATE_MODEL__RULEENTRYCONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The number of operations of the '<em>Process2 Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Task2NormalStepImpl <em>Task2 Normal Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Task2NormalStepImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getTask2NormalStep()
	 * @generated
	 */
	int TASK2_NORMAL_STEP = 1;

	/**
	 * The number of structural features of the '<em>Task2 Normal Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task2 Normal Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepImpl <em>Parallel Gateway2 Parallel Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getParallelGateway2ParallelStep()
	 * @generated
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP = 2;

	/**
	 * The number of structural features of the '<em>Parallel Gateway2 Parallel Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Gateway2 Parallel Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Task2NormalStepSeqImpl <em>Task2 Normal Step Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Task2NormalStepSeqImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getTask2NormalStepSeq()
	 * @generated
	 */
	int TASK2_NORMAL_STEP_SEQ = 3;

	/**
	 * The number of structural features of the '<em>Task2 Normal Step Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TASK_NORMALSTEP_T2NS_PROCESS_FLOW_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TASK_NORMALSTEP_T2NS_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 31</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 106</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_106__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 107</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_107__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 32</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 108</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_108__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 109</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_109__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 110</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_110__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 111</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_111__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_TASK_NORMALSTEP_T2NS_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_T2NS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TASK_NORMALSTEP_T2NS_PROCESS_FLOW_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The number of operations of the '<em>Task2 Normal Step Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Task2NormalStepAfterSEImpl <em>Task2 Normal Step After SE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Task2NormalStepAfterSEImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getTask2NormalStepAfterSE()
	 * @generated
	 */
	int TASK2_NORMAL_STEP_AFTER_SE = 4;

	/**
	 * The number of structural features of the '<em>Task2 Normal Step After SE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STARTEVENT_BASICFLOW_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_BWD__MATCH_BASICFLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BASICFLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BASICFLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STARTEVENT_BASICFLOW_NORMALSTEP_PROCESS_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 33</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_33__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 34</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_34__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 112</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_112__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 113</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_113__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 114</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_114__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 115</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_115__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 116</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_116__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 117</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_117__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STARTEVENT_BASICFLOW_NORMALSTEP_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STARTEVENT_BASICFLOW_PROCESS_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The number of operations of the '<em>Task2 Normal Step After SE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Task2NormalStepAfterPGImpl <em>Task2 Normal Step After PG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Task2NormalStepAfterPGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getTask2NormalStepAfterPG()
	 * @generated
	 */
	int TASK2_NORMAL_STEP_AFTER_PG = 5;

	/**
	 * The number of structural features of the '<em>Task2 Normal Step After PG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PARALLELFLOW_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD__MATCH_PARALLELFLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELFLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELFLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PARALLELFLOW_NORMALSTEP_PROCESS_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 35</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_35__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_36__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 118</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_118__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 119</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_119__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 120</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_120__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 121</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_121__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 122</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_122__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 123</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_123__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PARALLELGATEWAY_PARALLELFLOW_NORMALSTEP_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PARALLELFLOW_PROCESS_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The number of operations of the '<em>Task2 Normal Step After PG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepSeqImpl <em>Parallel Gateway2 Parallel Step Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepSeqImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getParallelGateway2ParallelStepSeq()
	 * @generated
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ = 6;

	/**
	 * The number of structural features of the '<em>Parallel Gateway2 Parallel Step Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TASK_NORMALSTEP_T2NS_PROCESS_FLOW_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TASK_NORMALSTEP_T2NS_PARALLELSTEP_PROCESS_FLOW_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 124</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_124__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 125</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_125__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 126</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_126__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 127</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_127__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 128</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_128__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 129</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_129__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 130</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_130__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 131</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_131__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_TASK_NORMALSTEP_T2NS_PARALLELSTEP_PROCESS_FLOW_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_T2NS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TASK_NORMALSTEP_T2NS_PROCESS_FLOW_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The number of operations of the '<em>Parallel Gateway2 Parallel Step Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepAfterSEImpl <em>Parallel Gateway2 Parallel Step After SE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepAfterSEImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getParallelGateway2ParallelStepAfterSE()
	 * @generated
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE = 7;

	/**
	 * The number of structural features of the '<em>Parallel Gateway2 Parallel Step After SE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STARTEVENT_BASICFLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_BWD__MATCH_BASICFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_BASICFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_BASICFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STARTEVENT_BASICFLOW_PARALLELSTEP_PROCESS_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_39__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 40</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_40__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 132</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_132__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 133</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_133__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 134</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_134__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 135</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_135__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 136</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_136__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 137</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_137__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 138</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_138__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 139</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_139__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STARTEVENT_BASICFLOW_PARALLELSTEP_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STARTEVENT_BASICFLOW_PROCESS_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The number of operations of the '<em>Parallel Gateway2 Parallel Step After SE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepAfterPGImpl <em>Parallel Gateway2 Parallel Step After PG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepAfterPGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getParallelGateway2ParallelStepAfterPG()
	 * @generated
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG = 8;

	/**
	 * The number of structural features of the '<em>Parallel Gateway2 Parallel Step After PG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PARALLELFLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD__MATCH_PARALLELFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PARALLELFLOW_PARALLELSTEP_PROCESS_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 41</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_41__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 42</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_42__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 140</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_140__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 141</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_141__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 142</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_142__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 143</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_143__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 144</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_144__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 145</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_145__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 146</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_146__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 147</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_147__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PARALLELGATEWAY_PARALLELFLOW_PARALLELSTEP_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PARALLELFLOW_PROCESS_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The number of operations of the '<em>Parallel Gateway2 Parallel Step After PG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.SequenceFlowAfterPG2ParallelFlowImpl <em>Sequence Flow After PG2 Parallel Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.SequenceFlowAfterPG2ParallelFlowImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getSequenceFlowAfterPG2ParallelFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW = 9;

	/**
	 * The number of structural features of the '<em>Sequence Flow After PG2 Parallel Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PARALLELSTEP_PG2PS_SEQUENCEFLOW_PROCESS_USECASE_P2UC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_USECASE_PARALLELFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_USECASE_PARALLELFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_USECASE_PARALLELFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PARALLELSTEP_PG2PS_PROCESS_USECASE_P2UC_PARALLELFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 148</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_148__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 149</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_149__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 43</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_43__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 150</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_150__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 44</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PARALLELGATEWAY_PARALLELSTEP_PG2PS_SEQUENCEFLOW_PROCESS_USECASE_P2UC_PARALLELFLOW_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___GENERATE_MODEL__RULEENTRYCONTAINER_PG2PS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_PARALLELSTEP_PG2PS_PROCESS_USECASE_P2UC_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The number of operations of the '<em>Sequence Flow After PG2 Parallel Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EndEvent2FinalStateImpl <em>End Event2 Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EndEvent2FinalStateImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEndEvent2FinalState()
	 * @generated
	 */
	int END_EVENT2_FINAL_STATE = 10;

	/**
	 * The number of structural features of the '<em>End Event2 Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_SEQUENCEFLOW_FLOW_SF2F_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_BWD__MATCH_USECASE_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_SEQUENCEFLOW_FLOW_SF2F_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 151</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_151__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 152</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_152__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 153</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_153__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 45</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_45__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PROCESS_USECASE_P2UC_SEQUENCEFLOW_FLOW_SF2F_ENDEVENT_UCCONDITION_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_SEQUENCEFLOW_FLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The number of operations of the '<em>End Event2 Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Process2UseCase <em>Process2 Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process2 Use Case</em>'.
	 * @see Bpmn2UseCase.Rules.Process2UseCase
	 * @generated
	 */
	EClass getProcess2UseCase();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD__Match_Process_StartEvent_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getProcess2UseCase__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjectsToMatch_FWD__Match_Process_StartEvent_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_solveCsp_FWD__Match_Process_StartEvent_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_StartEvent_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleUseCase.UCCondition) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD__Match_UseCase_BasicFlow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getProcess2UseCase__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleUseCase.UCCondition) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjectsToMatch_BWD__Match_UseCase_BasicFlow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleUseCase.UCCondition) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_solveCsp_BWD__Match_UseCase_BasicFlow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleUseCase.UCCondition) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_BasicFlow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 102</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 102</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_102__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 103</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 103</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_103__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_29(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 29</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 29</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_29(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_30(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 30</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 30</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_30(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 104</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 104</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_104__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 105</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 105</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_105__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getProcess2UseCase__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getProcess2UseCase__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleBPMN.StartEvent, SimpleBPMN.SequenceFlow, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Process_UseCase_BasicFlow_StartEvent_SequenceFlow_UCCondition_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getProcess2UseCase__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getProcess2UseCase__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getProcess2UseCase__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Task2NormalStep <em>Task2 Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Normal Step</em>'.
	 * @see Bpmn2UseCase.Rules.Task2NormalStep
	 * @generated
	 */
	EClass getTask2NormalStep();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStep <em>Parallel Gateway2 Parallel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway2 Parallel Step</em>'.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStep
	 * @generated
	 */
	EClass getParallelGateway2ParallelStep();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq <em>Task2 Normal Step Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Normal Step Seq</em>'.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq
	 * @generated
	 */
	EClass getTask2NormalStepSeq();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD__Match_Task_Process_SequenceFlow_Task_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__RegisterObjectsToMatch_FWD__Match_Task_Process_SequenceFlow_Task_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_solveCsp_FWD__Match_Task_Process_SequenceFlow_Task_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Task_NormalStep_T2NS_Process_Flow_SequenceFlow_Task_SequenceFlow_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD__Match_NormalStep_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__RegisterObjectsToMatch_BWD__Match_NormalStep_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_solveCsp_BWD__Match_NormalStep_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_Task_NormalStep_T2NS_NormalStep_Process_Flow_SequenceFlow_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_31(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 31</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 31</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_31(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 106</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 106</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_106__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 107</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 107</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_107__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_32(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 32</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 32</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_32(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_32__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_108(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 108</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 108</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_108(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_108__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 109</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 109</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_109__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 110</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 110</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_110__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_111(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 111</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 111</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_111(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_111__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Task_NormalStep_T2NS_NormalStep_Process_Flow_SequenceFlow_Task_SequenceFlow_SF2F_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.T2NS) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.T2NS)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__GenerateModel__RuleEntryContainer_T2NS();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_Task_NormalStep_T2NS_Process_Flow_SequenceFlow_SF2F_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE <em>Task2 Normal Step After SE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Normal Step After SE</em>'.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE
	 * @generated
	 */
	EClass getTask2NormalStepAfterSE();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD__Match_StartEvent_Process_SequenceFlow_Task_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__RegisterObjectsToMatch_FWD__Match_StartEvent_Process_SequenceFlow_Task_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_solveCsp_FWD__Match_StartEvent_Process_SequenceFlow_Task_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsApplicable_solveCsp_FWD__IsApplicableMatch_StartEvent_BasicFlow_Process_SequenceFlow_Task_SequenceFlow_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_BWD__Match_BasicFlow_NormalStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__RegisterObjectsToMatch_BWD__Match_BasicFlow_NormalStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_solveCsp_BWD__Match_BasicFlow_NormalStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsApplicable_solveCsp_BWD__IsApplicableMatch_StartEvent_BasicFlow_NormalStep_Process_SequenceFlow_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD_EMoflonEdge_33(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 33</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 33</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD_EMoflonEdge_33(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_BWD_EMoflonEdge_33__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD_EMoflonEdge_34(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 34</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 34</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD_EMoflonEdge_34(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_BWD_EMoflonEdge_34__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_112(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 112</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 112</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_112(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_112__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_113(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 113</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 113</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_113(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_113__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_114(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 114</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 114</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_114(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_114__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_115(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 115</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 115</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_115(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_115__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_116(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 116</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 116</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_116(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_116__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_117(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 117</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 117</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_117(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_117__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StartEvent_BasicFlow_NormalStep_Process_SequenceFlow_Task_SequenceFlow_SF2F_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__GenerateModel__RuleEntryContainer_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__GenerateModel_solveCsp_BWD__IsApplicableMatch_StartEvent_BasicFlow_Process_SequenceFlow_SF2F_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG <em>Task2 Normal Step After PG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Normal Step After PG</em>'.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG
	 * @generated
	 */
	EClass getTask2NormalStepAfterPG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD__Match_ParallelGateway_Process_SequenceFlow_Task_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__RegisterObjectsToMatch_FWD__Match_ParallelGateway_Process_SequenceFlow_Task_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_Process_SequenceFlow_Task_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_ParallelFlow_Process_SequenceFlow_Task_SequenceFlow_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD__Match_ParallelFlow_NormalStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__RegisterObjectsToMatch_BWD__Match_ParallelFlow_NormalStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_solveCsp_BWD__Match_ParallelFlow_NormalStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_ParallelFlow_NormalStep_Process_SequenceFlow_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_35(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 35</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 35</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_35(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_35__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_36(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 36</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_36(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_118(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 118</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 118</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_118(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_118__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_119(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 119</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 119</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_119(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_119__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_120(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 120</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 120</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_120(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_120__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_121(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 121</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 121</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_121(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_121__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_122(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 122</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 122</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_122(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_122__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_123(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 123</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 123</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_123(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_123__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ParallelGateway_ParallelFlow_NormalStep_Process_SequenceFlow_Task_SequenceFlow_SF2F_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__GenerateModel__RuleEntryContainer_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_ParallelFlow_Process_SequenceFlow_SF2F_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq <em>Parallel Gateway2 Parallel Step Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway2 Parallel Step Seq</em>'.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq
	 * @generated
	 */
	EClass getParallelGateway2ParallelStepSeq();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD__Match_Task_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__RegisterObjectsToMatch_FWD__Match_Task_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Task, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_solveCsp_FWD__Match_Task_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Task_NormalStep_T2NS_Process_Flow_SequenceFlow_ParallelGateway_SF2F_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_BWD__Match_NormalStep_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__RegisterObjectsToMatch_BWD__Match_NormalStep_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_solveCsp_BWD__Match_NormalStep_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_Task_NormalStep_T2NS_ParallelStep_Process_Flow_SequenceFlow_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_37(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 37</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_37(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 124</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 124</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_124__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 125</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 125</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_125__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 126</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 126</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_126__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_38(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 38</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_38(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 127</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 127</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_127__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 128</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 128</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_128__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 129</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 129</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_129__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 130</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 130</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_130__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 131</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 131</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_131__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Task_NormalStep_T2NS_ParallelStep_Process_Flow_SequenceFlow_ParallelGateway_SF2F_ParallelGateway_SequenceFlow_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.T2NS) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.T2NS)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__GenerateModel__RuleEntryContainer_T2NS();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Task, SimpleUseCase.NormalStep, Bpmn2UseCase.T2NS, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_Task_NormalStep_T2NS_Process_Flow_SequenceFlow_SF2F_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE <em>Parallel Gateway2 Parallel Step After SE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway2 Parallel Step After SE</em>'.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE
	 * @generated
	 */
	EClass getParallelGateway2ParallelStepAfterSE();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD__Match_StartEvent_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjectsToMatch_FWD__Match_StartEvent_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_solveCsp_FWD__Match_StartEvent_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_solveCsp_FWD__IsApplicableMatch_StartEvent_BasicFlow_Process_SequenceFlow_ParallelGateway_SF2F_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_BWD__Match_BasicFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjectsToMatch_BWD__Match_BasicFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_solveCsp_BWD__Match_BasicFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_solveCsp_BWD__IsApplicableMatch_StartEvent_BasicFlow_ParallelStep_Process_SequenceFlow_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD_EMoflonEdge_39(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 39</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD_EMoflonEdge_39(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD_EMoflonEdge_40(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 40</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 40</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD_EMoflonEdge_40(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_BWD_EMoflonEdge_40__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 132</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 132</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_132__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 133</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 133</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_133__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 134</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 134</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_134__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 135</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 135</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_135__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 136</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 136</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_136__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 137</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 137</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_137__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 138</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 138</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_138__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 139</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 139</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_139__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StartEvent_BasicFlow_ParallelStep_Process_SequenceFlow_ParallelGateway_SF2F_ParallelGateway_SequenceFlow_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__GenerateModel__RuleEntryContainer_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.StartEvent, SimpleUseCase.BasicFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__GenerateModel_solveCsp_BWD__IsApplicableMatch_StartEvent_BasicFlow_Process_SequenceFlow_SF2F_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG <em>Parallel Gateway2 Parallel Step After PG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway2 Parallel Step After PG</em>'.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG
	 * @generated
	 */
	EClass getParallelGateway2ParallelStepAfterPG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD__Match_ParallelGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjectsToMatch_FWD__Match_ParallelGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_ParallelFlow_Process_SequenceFlow_ParallelGateway_SF2F_ParallelGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_BWD__Match_ParallelFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjectsToMatch_BWD__Match_ParallelFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_solveCsp_BWD__Match_ParallelFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_ParallelFlow_ParallelStep_Process_SequenceFlow_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_41(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 41</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 41</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_41(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_41__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_42(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 42</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 42</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_42(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_42__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 140</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 140</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_140__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_141(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 141</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 141</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_141(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_141__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_142(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 142</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 142</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_142(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_142__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_143(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 143</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 143</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_143(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_143__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_144(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 144</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 144</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_144(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_144__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_145(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 145</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 145</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_145(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_145__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_146(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 146</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 146</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_146(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_146__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 147</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 147</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_147__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ParallelGateway_ParallelFlow_ParallelStep_Process_SequenceFlow_ParallelGateway_SF2F_ParallelGateway_SequenceFlow_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__GenerateModel__RuleEntryContainer_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_ParallelFlow_Process_SequenceFlow_SF2F_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow <em>Sequence Flow After PG2 Parallel Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow After PG2 Parallel Flow</em>'.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow
	 * @generated
	 */
	EClass getSequenceFlowAfterPG2ParallelFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD__Match_ParallelGateway_SequenceFlow_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__RegisterObjectsToMatch_FWD__Match_ParallelGateway_SequenceFlow_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_SequenceFlow_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.PG2PS, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.PG2PS, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_ParallelStep_PG2PS_SequenceFlow_Process_UseCase_P2UC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_BWD__Match_ParallelStep_UseCase_ParallelFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__RegisterObjectsToMatch_BWD__Match_ParallelStep_UseCase_ParallelFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_solveCsp_BWD__Match_ParallelStep_UseCase_ParallelFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.PG2PS, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.PG2PS, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_ParallelStep_PG2PS_Process_UseCase_P2UC_ParallelFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 148</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 148</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD_EMoflonEdge_148__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 149</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 149</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD_EMoflonEdge_149__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD_EMoflonEdge_43(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 43</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 43</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD_EMoflonEdge_43(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_BWD_EMoflonEdge_43__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 150</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 150</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD_EMoflonEdge_150__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD_EMoflonEdge_44(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 44</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 44</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD_EMoflonEdge_44(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_BWD_EMoflonEdge_44__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.PG2PS, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.PG2PS, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ParallelGateway_ParallelStep_PG2PS_SequenceFlow_Process_UseCase_P2UC_ParallelFlow_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.PG2PS) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.PG2PS)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__GenerateModel__RuleEntryContainer_PG2PS();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.PG2PS, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.PG2PS, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_ParallelStep_PG2PS_Process_UseCase_P2UC_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EndEvent2FinalState <em>End Event2 Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event2 Final State</em>'.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState
	 * @generated
	 */
	EClass getEndEvent2FinalState();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_FWD__Match_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__RegisterObjectsToMatch_FWD__Match_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_solveCsp_FWD__Match_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_SequenceFlow_Flow_SF2F_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.UCCondition) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_BWD__Match_UseCase_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.UCCondition) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__RegisterObjectsToMatch_BWD__Match_UseCase_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.UCCondition) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_solveCsp_BWD__Match_UseCase_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, Bpmn2UseCase.SF2F, SimpleUseCase.UCCondition) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, Bpmn2UseCase.SF2F, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_SequenceFlow_Flow_SF2F_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_FWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 151</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 151</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_FWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_FWD_EMoflonEdge_151__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_FWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 152</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 152</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_FWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_FWD_EMoflonEdge_152__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_FWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 153</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 153</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_FWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_FWD_EMoflonEdge_153__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_BWD_EMoflonEdge_45(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 45</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 45</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isAppropriate_BWD_EMoflonEdge_45(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsAppropriate_BWD_EMoflonEdge_45__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Process_UseCase_P2UC_SequenceFlow_Flow_SF2F_EndEvent_UCCondition_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__GenerateModel__RuleEntryContainer_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_SequenceFlow_Flow_SF2F_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalState#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalState__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
