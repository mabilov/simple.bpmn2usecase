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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 275</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_275__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 276</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_276__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 90</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_90__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 91</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_91__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 277</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_277__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 278</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_278__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_TASK_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_TASK_NORMALSTEP_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 92</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_92__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 279</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_279__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 280</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_280__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 93</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_93__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 281</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_281__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 282</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_282__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 283</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_283__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 284</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_284__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2S_TASK_NORMALSTEP_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_TASK_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 94</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_94__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 95</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_95__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 285</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_285__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 286</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_286__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 287</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_287__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 288</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_288__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 289</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_289__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 290</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_290__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 96</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_96__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 97</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_97__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 291</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_291__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 292</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_292__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 293</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_293__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 294</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_294__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 295</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_295__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 296</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_296__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_TASK_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_TASK_NORMALSTEP_PARALLELSTEP_PROCESS_FLOW_SEQUENCEFLOW_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 98</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_98__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 297</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_297__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 298</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_298__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 299</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_299__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 99</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_99__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 300</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_300__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 301</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_301__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 302</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_302__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 303</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_303__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 304</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_304__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2S_TASK_NORMALSTEP_PARALLELSTEP_PROCESS_FLOW_SEQUENCEFLOW_PARALLELGATEWAY_SF2F_PARALLELGATEWAY_SEQUENCEFLOW_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_TASK_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 100</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_100__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 101</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_101__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 305</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_305__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 306</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_306__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 307</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_307__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 308</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_308__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 309</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_309__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 310</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_310__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 311</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_311__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 312</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_312__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EndEvent2FinalStateFirstImpl <em>End Event2 Final State First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EndEvent2FinalStateFirstImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEndEvent2FinalStateFirst()
	 * @generated
	 */
	int END_EVENT2_FINAL_STATE_FIRST = 8;

	/**
	 * The number of structural features of the '<em>End Event2 Final State First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOW_STARTEVENT_PROCESS_SEQUENCEFLOW_SF2F_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_BWD__MATCH_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOW_STARTEVENT_PROCESS_SEQUENCEFLOW_SF2F_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 313</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_313__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 314</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_314__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 315</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_315__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 102</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_102__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FLOW_STARTEVENT_PROCESS_SEQUENCEFLOW_SF2F_ENDEVENT_UCCONDITION_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOW_STARTEVENT_PROCESS_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The number of operations of the '<em>End Event2 Final State First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepAfterPGImpl <em>Parallel Gateway2 Parallel Step After PG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.ParallelGateway2ParallelStepAfterPGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getParallelGateway2ParallelStepAfterPG()
	 * @generated
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG = 9;

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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 103</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_103__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 104</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_104__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 316</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_316__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 317</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_317__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 318</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_318__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 319</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_319__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 320</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_320__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 321</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_321__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 322</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_322__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 323</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_323__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW = 10;

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
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_PARALLELFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 324</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_324__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 325</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_325__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 105</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_105__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 326</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_326__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 106</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_106__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC_PARALLELFLOW_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE = 11;

	/**
	 * The number of structural features of the '<em>End Event2 Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Event2 Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EndEvent2FinalStateSeqImpl <em>End Event2 Final State Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EndEvent2FinalStateSeqImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEndEvent2FinalStateSeq()
	 * @generated
	 */
	int END_EVENT2_FINAL_STATE_SEQ = 12;

	/**
	 * The number of structural features of the '<em>End Event2 Final State Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STEP_FLOWNODE_FLOW_FN2S_PROCESS_SEQUENCEFLOW_SF2F_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_BWD__MATCH_STEP_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEP_FLOWNODE_FLOW_FN2S_PROCESS_SEQUENCEFLOW_SF2F_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 327</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_327__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 328</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_328__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 329</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_329__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 107</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_107__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STEP_FLOWNODE_FLOW_FN2S_PROCESS_SEQUENCEFLOW_SF2F_ENDEVENT_UCCONDITION_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEP_FLOWNODE_FLOW_FN2S_PROCESS_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The number of operations of the '<em>End Event2 Final State Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_275(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 275</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 275</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_275(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_275__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_276(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 276</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 276</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_276(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_276__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 90</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 90</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_90__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 91</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 91</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_91__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_277(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 277</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 277</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_277(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_277__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_278(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 278</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 278</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_278(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_278__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_Task_NormalStep_Process_Flow_SequenceFlow_Task_SequenceFlow_SF2F();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_Task_NormalStep_NormalStep_Process_Flow_SequenceFlow_SF2F();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_92(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 92</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 92</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_92(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_92__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_279(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 279</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 279</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_279(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_279__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_280(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 280</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 280</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_280(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_280__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_93(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 93</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 93</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_93(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_93__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_281(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 281</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 281</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_281(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_281__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_282(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 282</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 282</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_282(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_282__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_283(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 283</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 283</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_283(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_283__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_284(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 284</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 284</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_284(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_284__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2S_Task_NormalStep_NormalStep_Process_Flow_SequenceFlow_Task_SequenceFlow_SF2F_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2S_Task_NormalStep_Process_Flow_SequenceFlow_SF2F_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD_EMoflonEdge_94(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 94</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 94</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD_EMoflonEdge_94(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_BWD_EMoflonEdge_94__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD_EMoflonEdge_95(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 95</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 95</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_BWD_EMoflonEdge_95(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_BWD_EMoflonEdge_95__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_285(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 285</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 285</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_285(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_285__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_286(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 286</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 286</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_286(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_286__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_287(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 287</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 287</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_287(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_287__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_288(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 288</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 288</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_288(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_288__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_289(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 289</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 289</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_289(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_289__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_290(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 290</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 290</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE#isAppropriate_FWD_EMoflonEdge_290(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_290__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_96(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 96</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 96</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_96(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_96__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_97(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 97</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 97</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_97(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_97__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_291(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 291</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 291</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_291(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_291__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_292(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 292</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 292</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_292(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_292__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_293(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 293</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 293</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_293(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_293__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_294(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 294</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 294</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_294(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_294__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_295(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 295</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 295</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_295(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_295__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_296(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 296</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 296</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_296(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_296__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_Task_NormalStep_Process_Flow_SequenceFlow_ParallelGateway_SF2F_ParallelGateway_SequenceFlow();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_Task_NormalStep_ParallelStep_Process_Flow_SequenceFlow_SF2F();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_98(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 98</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 98</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_98(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_98__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_297(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 297</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 297</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_297(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_297__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_298(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 298</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 298</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_298(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_298__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_299(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 299</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 299</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_299(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_299__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_99(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 99</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 99</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_99(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_99__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_300(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 300</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 300</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_300(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_300__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_301(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 301</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 301</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_301(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_301__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_302(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 302</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 302</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_302(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_302__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_303(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 303</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 303</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_303(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_303__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_304(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 304</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 304</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_304(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_304__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, Bpmn2UseCase.SF2F, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2S_Task_NormalStep_ParallelStep_Process_Flow_SequenceFlow_ParallelGateway_SF2F_ParallelGateway_SequenceFlow_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.Task, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleUseCase.Flow, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2S_Task_NormalStep_Process_Flow_SequenceFlow_SF2F_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD_EMoflonEdge_100(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 100</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 100</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD_EMoflonEdge_100(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_BWD_EMoflonEdge_100__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD_EMoflonEdge_101(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 101</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 101</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_BWD_EMoflonEdge_101(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_BWD_EMoflonEdge_101__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_305(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 305</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 305</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_305(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_305__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_306(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 306</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 306</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_306(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_306__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_307(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 307</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 307</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_307(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_307__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_308(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 308</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 308</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_308(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_308__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_309(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 309</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 309</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_309(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_309__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_310(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 310</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 310</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_310(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_310__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_311(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 311</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 311</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_311(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_311__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_312(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 312</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 312</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE#isAppropriate_FWD_EMoflonEdge_312(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_312__EMoflonEdge();

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
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst <em>End Event2 Final State First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event2 Final State First</em>'.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst
	 * @generated
	 */
	EClass getEndEvent2FinalStateFirst();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD__Match_StartEvent_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__RegisterObjectsToMatch_FWD__Match_StartEvent_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_solveCsp_FWD__Match_StartEvent_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_Flow_StartEvent_Process_SequenceFlow_SF2F_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.UCCondition) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_BWD__Match_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.UCCondition) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__RegisterObjectsToMatch_BWD__Match_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.UCCondition) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_solveCsp_BWD__Match_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleUseCase.UCCondition) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_Flow_StartEvent_Process_SequenceFlow_SF2F_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_313(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 313</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 313</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_313(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_313__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_314(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 314</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 314</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_314(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_314__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_315(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 315</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 315</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_315(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_315__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 102</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 102</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_BWD_EMoflonEdge_102__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.Flow, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.Flow, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Flow_StartEvent_Process_SequenceFlow_SF2F_EndEvent_UCCondition_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__GenerateModel__RuleEntryContainer_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.StartEvent, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_Flow_StartEvent_Process_SequenceFlow_SF2F_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__GenerateModel_checkCsp_BWD__CSP();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 103</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 103</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_103__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 104</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 104</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_104__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_316(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 316</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 316</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_316(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_316__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_317(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 317</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 317</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_317(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_317__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_318(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 318</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 318</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_318(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_318__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_319(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 319</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 319</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_319(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_319__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_320(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 320</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 320</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_320(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_320__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_321(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 321</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 321</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_321(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_321__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_322(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 322</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 322</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_322(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_322__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_323(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 323</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 323</em>' operation.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_323(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_323__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_ParallelGateway_ParallelStep_SequenceFlow_Process_UseCase_P2UC();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_ParallelGateway_ParallelStep_Process_UseCase_P2UC_ParallelFlow();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_324(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 324</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 324</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_324(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD_EMoflonEdge_324__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_325(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 325</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 325</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_325(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD_EMoflonEdge_325__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 105</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 105</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_BWD_EMoflonEdge_105__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_326(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 326</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 326</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_FWD_EMoflonEdge_326(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD_EMoflonEdge_326__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 106</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 106</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isAppropriate_BWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_BWD_EMoflonEdge_106__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2S_ParallelGateway_ParallelStep_SequenceFlow_Process_UseCase_P2UC_ParallelFlow_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSequenceFlowAfterPG2ParallelFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2S_ParallelGateway_ParallelStep_Process_UseCase_P2UC_ModelgeneratorRuleResult();

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
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq <em>End Event2 Final State Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event2 Final State Seq</em>'.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq
	 * @generated
	 */
	EClass getEndEvent2FinalStateSeq();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_SF2F_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UCCondition) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD__Match_Step_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UCCondition) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__RegisterObjectsToMatch_BWD__Match_Step_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UCCondition) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_solveCsp_BWD__Match_Step_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleUseCase.UCCondition) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_SF2F_UCCondition();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_327(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 327</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 327</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_327(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_327__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_328(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 328</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 328</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_328(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_328__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_329(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 329</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 329</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_329(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_329__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 107</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 107</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD_EMoflonEdge_107__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, SimpleBPMN.EndEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_SF2F_EndEvent_UCCondition_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.SF2F)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__GenerateModel__RuleEntryContainer_SF2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, Bpmn2UseCase.SF2F, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_SF2F_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
