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
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD__MATCH_PROCESS_STARTEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PROCESS2_USE_CASE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_STARTEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_STARTEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PROCESS2_USE_CASE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_STARTEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PROCESS2_USE_CASE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PROCESS2_USE_CASE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 294</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_294__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 94</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_94__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 95</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_95__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PROCESS_USECASE_BASICFLOW_STARTEVENT_UCCONDITION_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___GENERATE_MODEL__RULEENTRYCONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Process2 Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

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
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.PG2ParallelStepImpl <em>PG2 Parallel Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.PG2ParallelStepImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getPG2ParallelStep()
	 * @generated
	 */
	int PG2_PARALLEL_STEP = 2;

	/**
	 * The number of structural features of the '<em>PG2 Parallel Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PG2 Parallel Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.PG2ParallelStepAfterPGImpl <em>PG2 Parallel Step After PG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.PG2ParallelStepAfterPGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getPG2ParallelStepAfterPG()
	 * @generated
	 */
	int PG2_PARALLEL_STEP_AFTER_PG = 3;

	/**
	 * The number of structural features of the '<em>PG2 Parallel Step After PG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_SEQUENCEFLOW_FLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_PARALLELFLOW_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 295</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_295__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 296</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_296__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 297</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_297__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 96</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_96__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 97</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_97__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 98</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_98__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 298</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_298__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 299</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_299__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 300</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_300__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 301</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_301__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 302</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_302__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_SEQUENCEFLOW_PARALLELFLOW_PARALLELSTEP_FLOW_PARALLELGATEWAY_PARALLELGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 39;

	/**
	 * The number of operations of the '<em>PG2 Parallel Step After PG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Task2NormalStepSeqImpl <em>Task2 Normal Step Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Task2NormalStepSeqImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getTask2NormalStepSeq()
	 * @generated
	 */
	int TASK2_NORMAL_STEP_SEQ = 4;

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
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_FLOWNODE_FLOW_STEP_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_FLOWNODE_FLOW_STEP_NORMALSTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 99</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_99__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 100</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_100__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 303</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_303__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 304</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_304__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 305</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_305__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 306</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_306__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 307</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_307__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 308</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_308__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2S_FLOWNODE_FLOW_STEP_NORMALSTEP_PROCESS_SEQUENCEFLOW_TASK_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_FLOWNODE_FLOW_STEP_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Task2NormalStepFirstImpl <em>Task2 Normal Step First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Task2NormalStepFirstImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getTask2NormalStepFirst()
	 * @generated
	 */
	int TASK2_NORMAL_STEP_FIRST = 5;

	/**
	 * The number of structural features of the '<em>Task2 Normal Step First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_NORMALSTEP_FLOWNODE_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 101</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_101__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 309</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_309__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 310</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_310__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 311</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_311__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 312</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_312__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 313</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_313__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 314</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_314__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2F_NORMALSTEP_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_TASK_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_FN2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The number of operations of the '<em>Task2 Normal Step First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.PG2ParallelStepSeqImpl <em>PG2 Parallel Step Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.PG2ParallelStepSeqImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getPG2ParallelStepSeq()
	 * @generated
	 */
	int PG2_PARALLEL_STEP_SEQ = 6;

	/**
	 * The number of structural features of the '<em>PG2 Parallel Step Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_FLOW_FLOWNODE_STEP_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD__MATCH_FLOW_STEP_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_STEP_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_STEP_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_FLOW_FLOWNODE_STEP_PARALLELSTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 102</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_102__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 103</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_103__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 315</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_315__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 316</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_316__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 317</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_317__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 318</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_318__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 319</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_319__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 320</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_320__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 321</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_321__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 322</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_322__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2S_FLOW_FLOWNODE_STEP_PARALLELSTEP_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_FLOW_FLOWNODE_STEP_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The number of operations of the '<em>PG2 Parallel Step Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.PG2ParallelStepFirstImpl <em>PG2 Parallel Step First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.PG2ParallelStepFirstImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getPG2ParallelStepFirst()
	 * @generated
	 */
	int PG2_PARALLEL_STEP_FIRST = 7;

	/**
	 * The number of structural features of the '<em>PG2 Parallel Step First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_PARALLELSTEP_FLOWNODE_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 104</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_104__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 323</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_323__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 324</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_324__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 325</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_325__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 326</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_326__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 327</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_327__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 328</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_328__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 329</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_329__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 330</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_330__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2F_PARALLELSTEP_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_FN2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The number of operations of the '<em>PG2 Parallel Step First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

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
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_FLOW_FLOWNODE_PROCESS_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 331</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_331__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 332</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_332__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 333</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_333__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 334</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_334__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 105</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_105__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 335</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_335__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 336</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_336__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2F_FLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT_UCCONDITION_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_FN2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_FLOW_FLOWNODE_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The number of operations of the '<em>End Event2 Final State First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Task2NormalStepAfterPGImpl <em>Task2 Normal Step After PG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Task2NormalStepAfterPGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getTask2NormalStepAfterPG()
	 * @generated
	 */
	int TASK2_NORMAL_STEP_AFTER_PG = 9;

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
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GW2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_GW2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 337</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_337__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 338</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_338__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 106</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_106__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 339</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_339__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 107</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_107__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 108</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_108__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 340</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_340__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 341</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_341__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 342</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_342__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_NORMALSTEP_GW2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC_PARALLELFLOW_FLOW_TASK_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_GW2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The number of operations of the '<em>Task2 Normal Step After PG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

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
	int END_EVENT2_FINAL_STATE_SEQ = 11;

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
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STEP_FLOWNODE_FLOW_FN2S_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_BWD__MATCH_UCCONDITION_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_UCCONDITION_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_UCCONDITION_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_UCCONDITION_STEP_FLOWNODE_FLOW_FN2S_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 109</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_109__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 110</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_110__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 343</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_343__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 344</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_344__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 345</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_345__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 346</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_346__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 347</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_347__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 348</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_348__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_UCCONDITION_STEP_FLOWNODE_FLOW_FN2S_PROCESS_SEQUENCEFLOW_ENDEVENT_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEP_FLOWNODE_FLOW_FN2S_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The number of operations of the '<em>End Event2 Final State Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.LastStepInFlowImpl <em>Last Step In Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.LastStepInFlowImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getLastStepInFlow()
	 * @generated
	 */
	int LAST_STEP_IN_FLOW = 12;

	/**
	 * The number of structural features of the '<em>Last Step In Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Last Step In Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.LastStepInPFlowImpl <em>Last Step In PFlow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.LastStepInPFlowImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getLastStepInPFlow()
	 * @generated
	 */
	int LAST_STEP_IN_PFLOW = 13;

	/**
	 * The number of structural features of the '<em>Last Step In PFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 349</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_349__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 350</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_350__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 351</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_351__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 352</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_352__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 353</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_353__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 111</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_111__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The number of operations of the '<em>Last Step In PFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EG2ChoiceImpl <em>EG2 Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EG2ChoiceImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEG2Choice()
	 * @generated
	 */
	int EG2_CHOICE = 14;

	/**
	 * The number of structural features of the '<em>EG2 Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EG2 Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EG2ChoiceSeqImpl <em>EG2 Choice Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EG2ChoiceSeqImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEG2ChoiceSeq()
	 * @generated
	 */
	int EG2_CHOICE_SEQ = 15;

	/**
	 * The number of structural features of the '<em>EG2 Choice Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOWNODE_STEP_FN2S_FLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD__MATCH_STEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOWNODE_STEP_FN2S_FLOW_CHOICESTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 112</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_112__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 113</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_113__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 354</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_354__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 355</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_355__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 356</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_356__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 357</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_357__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 358</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_358__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 359</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_359__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 360</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_360__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 361</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_361__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FLOWNODE_STEP_FN2S_FLOW_CHOICESTEP_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOWNODE_STEP_FN2S_FLOW_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The number of operations of the '<em>EG2 Choice Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EG2ChoiceFirstImpl <em>EG2 Choice First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EG2ChoiceFirstImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEG2ChoiceFirst()
	 * @generated
	 */
	int EG2_CHOICE_FIRST = 16;

	/**
	 * The number of structural features of the '<em>EG2 Choice First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOWNODE_FLOW_FN2F_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_BWD__MATCH_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOWNODE_FLOW_FN2F_CHOICESTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 114</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_114__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 362</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_362__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 363</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_363__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 364</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_364__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 365</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_365__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 366</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_366__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 367</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_367__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 368</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_368__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 369</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_369__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FLOWNODE_FLOW_FN2F_CHOICESTEP_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_FN2F = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOWNODE_FLOW_FN2F_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

	/**
	 * The number of operations of the '<em>EG2 Choice First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EG2ChoiceAfterPGImpl <em>EG2 Choice After PG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EG2ChoiceAfterPGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEG2ChoiceAfterPG()
	 * @generated
	 */
	int EG2_CHOICE_AFTER_PG = 17;

	/**
	 * The number of structural features of the '<em>EG2 Choice After PG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_SEQUENCEFLOW_FLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_PARALLELFLOW_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 370</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_370__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 115</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_115__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 371</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_371__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 372</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_372__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 116</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_116__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 117</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_117__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 373</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_373__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 374</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_374__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 375</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_375__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 376</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_376__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 377</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_377__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_SEQUENCEFLOW_PARALLELFLOW_CHOICESTEP_FLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The number of operations of the '<em>EG2 Choice After PG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Task2NormalStepAfterDefEGImpl <em>Task2 Normal Step After Def EG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Task2NormalStepAfterDefEGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getTask2NormalStepAfterDefEG()
	 * @generated
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG = 18;

	/**
	 * The number of structural features of the '<em>Task2 Normal Step After Def EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 118</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_118__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 378</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_378__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 379</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_379__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 380</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_380__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 119</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_119__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 381</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_381__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 382</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_382__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 383</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_383__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 384</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_384__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_NORMALSTEP_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_TASK_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The number of operations of the '<em>Task2 Normal Step After Def EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 38;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Task2NormalStepAfterEGImpl <em>Task2 Normal Step After EG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Task2NormalStepAfterEGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getTask2NormalStepAfterEG()
	 * @generated
	 */
	int TASK2_NORMAL_STEP_AFTER_EG = 19;

	/**
	 * The number of structural features of the '<em>Task2 Normal Step After EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_NORMALSTEP_ALTERNATIVEFLOW_PROCESS_USECASE_P2UC_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 385</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_385__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 386</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_386__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 120</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_120__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 121</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_121__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 387</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_387__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 122</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_122__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 123</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_123__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 388</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_388__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 389</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_389__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 390</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_390__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_NORMALSTEP_ALTERNATIVEFLOW_PROCESS_USECASE_P2UC_STEPALTERNATIVE_FLOW_TASK_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_PROCESS_USECASE_P2UC_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The number of operations of the '<em>Task2 Normal Step After EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 39;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.Class1Impl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getClass1()
	 * @generated
	 */
	int CLASS1 = 20;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_FN2S_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_FN2S_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 124</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_BWD_EMOFLON_EDGE_124__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 391</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_391__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 392</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_392__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 393</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_393__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 394</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_394__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 395</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_395__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_FN2S_GW2S_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_FN2S_GW2S_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The number of operations of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.LastStepInAltFlowImpl <em>Last Step In Alt Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.LastStepInAltFlowImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getLastStepInAltFlow()
	 * @generated
	 */
	int LAST_STEP_IN_ALT_FLOW = 21;

	/**
	 * The number of structural features of the '<em>Last Step In Alt Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD__MATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 125</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_125__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 396</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_396__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 397</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_397__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 398</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_398__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 399</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_399__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 400</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_400__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 126</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_126__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The number of operations of the '<em>Last Step In Alt Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.PG2ParallelStepAfterDefEGImpl <em>PG2 Parallel Step After Def EG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.PG2ParallelStepAfterDefEGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getPG2ParallelStepAfterDefEG()
	 * @generated
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG = 22;

	/**
	 * The number of structural features of the '<em>PG2 Parallel Step After Def EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_FLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_PARALLELSTEP_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 401</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_401__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 402</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_402__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 403</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_403__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 127</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_127__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 128</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_128__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 404</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_404__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 405</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_405__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 406</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_406__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 407</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_407__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 408</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_408__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 409</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_409__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PARALLELSTEP_FLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_FLOW_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 39;

	/**
	 * The number of operations of the '<em>PG2 Parallel Step After Def EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.PG2ParallelStepAfterEGImpl <em>PG2 Parallel Step After EG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.PG2ParallelStepAfterEGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getPG2ParallelStepAfterEG()
	 * @generated
	 */
	int PG2_PARALLEL_STEP_AFTER_EG = 23;

	/**
	 * The number of structural features of the '<em>PG2 Parallel Step After EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_ALTERNATIVEFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 129</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_129__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 410</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_410__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 130</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_130__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 411</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_411__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 412</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_412__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 131</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_131__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 132</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_132__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 413</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_413__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 414</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_414__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 415</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_415__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 416</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_416__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 417</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_417__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_ALTERNATIVEFLOW_PARALLELSTEP_PARALLELGATEWAY_PARALLELGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 39;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 40;

	/**
	 * The number of operations of the '<em>PG2 Parallel Step After EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EG2ChoiceStepAfterDefEGImpl <em>EG2 Choice Step After Def EG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EG2ChoiceStepAfterDefEGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEG2ChoiceStepAfterDefEG()
	 * @generated
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG = 24;

	/**
	 * The number of structural features of the '<em>EG2 Choice Step After Def EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_FLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_CHOICESTEP_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 418</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_418__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 419</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_419__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 420</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_420__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 133</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_133__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 134</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_134__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 421</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_421__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 422</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_422__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 423</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_423__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 424</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_424__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 425</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_425__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 426</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_426__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_CHOICESTEP_FLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_FLOW_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 39;

	/**
	 * The number of operations of the '<em>EG2 Choice Step After Def EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 40;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EG2ChoiceStepAfterEGImpl <em>EG2 Choice Step After EG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EG2ChoiceStepAfterEGImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEG2ChoiceStepAfterEG()
	 * @generated
	 */
	int EG2_CHOICE_STEP_AFTER_EG = 25;

	/**
	 * The number of structural features of the '<em>EG2 Choice Step After EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_ALTERNATIVEFLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 135</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_135__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 427</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_427__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 136</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_136__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 137</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_137__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 428</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_428__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 429</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_429__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 138</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_138__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 430</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_430__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 431</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_431__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 432</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_432__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 433</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_433__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 434</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_434__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_SEQUENCEFLOW_ALTERNATIVEFLOW_CHOICESTEP_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 37;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 38;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 39;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 40;

	/**
	 * The number of operations of the '<em>EG2 Choice Step After EG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 41;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EndEvent2FinalStateGWSeqImpl <em>End Event2 Final State GW Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EndEvent2FinalStateGWSeqImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEndEvent2FinalStateGWSeq()
	 * @generated
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ = 26;

	/**
	 * The number of structural features of the '<em>End Event2 Final State GW Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD__MATCH_GATEWAY_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GATEWAY_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GATEWAY_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GATEWAY_STEP_GW2S_FLOW_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD__MATCH_UCCONDITION_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_UCCONDITION_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_UCCONDITION_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_UCCONDITION_GATEWAY_STEP_GW2S_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 139</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_139__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 140</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_140__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 435</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_435__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 436</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_436__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 437</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_437__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 438</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_438__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 439</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_439__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 440</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_440__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_UCCONDITION_GATEWAY_STEP_GW2S_FLOW_PROCESS_SEQUENCEFLOW_ENDEVENT_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_GATEWAY_STEP_GW2S_FLOW_PROCESS_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 35;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 36;

	/**
	 * The number of operations of the '<em>End Event2 Final State GW Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 37;

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD__Match_Process_StartEvent();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjectsToMatch_FWD__Match_Process_StartEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.StartEvent)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_solveCsp_FWD__Match_Process_StartEvent();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.StartEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.StartEvent)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_StartEvent();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_294(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 294</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 294</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_294(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_294__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_94(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 94</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 94</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_94(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_94__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_95(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 95</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 95</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_95(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_95__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleBPMN.StartEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleUseCase.UseCase, SimpleUseCase.BasicFlow, SimpleBPMN.StartEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Process_UseCase_BasicFlow_StartEvent_UCCondition_Match_Match();

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
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.PG2ParallelStep <em>PG2 Parallel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PG2 Parallel Step</em>'.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStep
	 * @generated
	 */
	EClass getPG2ParallelStep();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG <em>PG2 Parallel Step After PG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PG2 Parallel Step After PG</em>'.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG
	 * @generated
	 */
	EClass getPG2ParallelStepAfterPG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_SequenceFlow_Flow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__RegisterObjectsToMatch_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_solveCsp_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_ParallelFlow_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_295(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 295</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 295</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_295(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_295__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_296(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 296</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 296</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_296(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_296__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_297(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 297</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 297</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_297(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_297__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_96(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 96</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 96</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_96(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_96__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_97(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 97</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 97</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_97(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_97__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_98(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 98</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 98</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_98(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_98__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_298(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 298</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 298</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_298(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_298__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_299(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 299</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 299</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_299(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_299__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_300(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 300</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 300</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_300(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_300__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_301(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 301</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 301</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_301(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_301__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_302(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 302</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 302</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_302(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_302__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.ParallelFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_SequenceFlow_ParallelFlow_ParallelStep_Flow_ParallelGateway_ParallelGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_Flow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__GenerateModel_checkCsp_BWD__CSP();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_Task();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_Task();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_Process_SequenceFlow_Task();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD__Match_Flow_Step_NormalStep();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__RegisterObjectsToMatch_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_solveCsp_BWD__Match_Flow_Step_NormalStep();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_NormalStep_Process();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_99(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 99</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 99</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_99(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_99__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_100(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 100</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 100</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_100(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_100__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_303(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 303</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 303</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_303(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_303__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_304(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 304</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 304</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_304(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_304__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_305(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 305</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 305</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_305(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_305__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_306(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 306</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 306</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_306(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_306__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_307(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 307</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 307</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_307(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_307__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_308(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 308</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 308</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_308(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_308__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.NormalStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2S_FlowNode_Flow_Step_NormalStep_Process_SequenceFlow_Task_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_Process_ModelgeneratorRuleResult();

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
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst <em>Task2 Normal Step First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Normal Step First</em>'.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst
	 * @generated
	 */
	EClass getTask2NormalStepFirst();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_BWD__Match_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.NormalStep, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.NormalStep, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_NormalStep_FlowNode_Flow_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_BWD_EMoflonEdge_101(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 101</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 101</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_BWD_EMoflonEdge_101(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_BWD_EMoflonEdge_101__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_309(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 309</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 309</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_309(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_309__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_310(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 310</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 310</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_310(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_310__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_311(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 311</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 311</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_311(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_311__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_312(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 312</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 312</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_312(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_312__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_313(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 313</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 313</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_313(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_313__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_314(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 314</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 314</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_314(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_314__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2F, SimpleUseCase.NormalStep, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2F, SimpleUseCase.NormalStep, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2F_NormalStep_FlowNode_Flow_Process_SequenceFlow_Task_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2F)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__GenerateModel__RuleEntryContainer_FN2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq <em>PG2 Parallel Step Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PG2 Parallel Step Seq</em>'.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq
	 * @generated
	 */
	EClass getPG2ParallelStepSeq();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleUseCase.Step, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleUseCase.Step, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.ParallelStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_BWD__Match_Flow_Step_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.ParallelStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__RegisterObjectsToMatch_BWD__Match_Flow_Step_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.ParallelStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.Step, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_solveCsp_BWD__Match_Flow_Step_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleUseCase.Step, SimpleUseCase.ParallelStep, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleUseCase.Step, SimpleUseCase.ParallelStep, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_ParallelStep_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 102</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 102</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_102(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_102__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 103</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 103</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_103(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_103__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_315(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 315</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 315</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_315(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_315__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_316(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 316</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 316</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_316(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_316__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_317(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 317</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 317</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_317(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_317__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_318(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 318</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 318</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_318(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_318__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_319(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 319</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 319</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_319(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_319__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_320(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 320</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 320</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_320(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_320__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_321(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 321</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 321</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_321(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_321__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_322(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 322</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 322</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_322(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_322__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleUseCase.Step, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleUseCase.Step, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2S_Flow_FlowNode_Step_ParallelStep_Process_SequenceFlow_ParallelGateway_ParallelGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleUseCase.Step, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleUseCase.Step, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_Process_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst <em>PG2 Parallel Step First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PG2 Parallel Step First</em>'.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst
	 * @generated
	 */
	EClass getPG2ParallelStepFirst();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_BWD__Match_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__RegisterObjectsToMatch_BWD__Match_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_solveCsp_BWD__Match_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.ParallelStep, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.ParallelStep, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_ParallelStep_FlowNode_Flow_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_BWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 104</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 104</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_BWD_EMoflonEdge_104(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_BWD_EMoflonEdge_104__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_323(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 323</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 323</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_323(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_323__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_324(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 324</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 324</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_324(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_324__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_325(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 325</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 325</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_325(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_325__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_326(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 326</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 326</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_326(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_326__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_327(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 327</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 327</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_327(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_327__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_328(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 328</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 328</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_328(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_328__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_329(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 329</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 329</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_329(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_329__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_330(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 330</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 330</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_330(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_330__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2F, SimpleUseCase.ParallelStep, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2F, SimpleUseCase.ParallelStep, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2F_ParallelStep_FlowNode_Flow_Process_SequenceFlow_ParallelGateway_ParallelGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2F)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__GenerateModel__RuleEntryContainer_FN2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleBPMN.FlowNode, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__GenerateModel_checkCsp_BWD__CSP();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_SequenceFlow_EndEvent();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleUseCase.UCCondition) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleUseCase.UCCondition)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_UCCondition();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_331(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 331</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 331</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_331(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_331__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_332(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 332</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 332</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_332(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_332__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_333(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 333</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 333</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_333(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_333__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_334(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 334</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 334</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_334(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_334__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 105</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 105</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD_EMoflonEdge_105(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_BWD_EMoflonEdge_105__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_335(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 335</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 335</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_335(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_335__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_336(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 336</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 336</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_336(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_336__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2F, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, Bpmn2UseCase.FN2F, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent, SimpleUseCase.UCCondition, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2F_Flow_FlowNode_Process_SequenceFlow_EndEvent_UCCondition_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2F)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__GenerateModel__RuleEntryContainer_FN2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.FN2F, SimpleUseCase.Flow, SimpleBPMN.FlowNode, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_ModelgeneratorRuleResult();

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
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG <em>Task2 Normal Step After PG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Normal Step After PG</em>'.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG
	 * @generated
	 */
	EClass getTask2NormalStepAfterPG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD__Match_ParallelGateway_SequenceFlow_Process_Task();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__RegisterObjectsToMatch_FWD__Match_ParallelGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_SequenceFlow_Process_Task();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.GW2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.GW2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_GW2S_ParallelGateway_ParallelStep_SequenceFlow_Process_UseCase_P2UC_Flow_Task();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__RegisterObjectsToMatch_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.ParallelStep, SimpleUseCase.UseCase, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_solveCsp_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.NormalStep, Bpmn2UseCase.GW2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.NormalStep, Bpmn2UseCase.GW2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_GW2S_ParallelGateway_ParallelStep_Process_UseCase_P2UC_ParallelFlow_Flow();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_337(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 337</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 337</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_337(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_337__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_338(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 338</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 338</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_338(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_338__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 106</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 106</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_106(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_106__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_339(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 339</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 339</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_339(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_339__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 107</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 107</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_107(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_107__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_108(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 108</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 108</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_108(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_108__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_340(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 340</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 340</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_340(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_340__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_341(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 341</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 341</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_341(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_341__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_342(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 342</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 342</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_342(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_342__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.NormalStep, Bpmn2UseCase.GW2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.NormalStep, Bpmn2UseCase.GW2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.ParallelFlow, SimpleUseCase.Flow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_NormalStep_GW2S_ParallelGateway_ParallelStep_SequenceFlow_Process_UseCase_P2UC_ParallelFlow_Flow_Task_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.GW2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Bpmn2UseCase.GW2S, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_GW2S_ParallelGateway_ParallelStep_Process_UseCase_P2UC_Flow_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_EndEvent();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD__Match_UCCondition_Step_Flow();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__RegisterObjectsToMatch_BWD__Match_UCCondition_Step_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_solveCsp_BWD__Match_UCCondition_Step_Flow();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_UCCondition_Step_FlowNode_Flow_FN2S_Process();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 109</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 109</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_109(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD_EMoflonEdge_109__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 110</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 110</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_110(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD_EMoflonEdge_110__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_343(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 343</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 343</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_343(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_343__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_344(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 344</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 344</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_344(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_344__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_345(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 345</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 345</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_345(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_345__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_346(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 346</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 346</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_346(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_346__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_347(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 347</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 347</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_347(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_347__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_348(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 348</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 348</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_348(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_348__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_UCCondition_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_EndEvent_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Step, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2S, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_Step_FlowNode_Flow_FN2S_Process_ModelgeneratorRuleResult();

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
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.LastStepInFlow <em>Last Step In Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Step In Flow</em>'.
	 * @see Bpmn2UseCase.Rules.LastStepInFlow
	 * @generated
	 */
	EClass getLastStepInFlow();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.LastStepInPFlow <em>Last Step In PFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Step In PFlow</em>'.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow
	 * @generated
	 */
	EClass getLastStepInPFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInPFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_BWD__Match_ParallelStep_ParallelFlow_Step();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInPFlow__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjectsToMatch_BWD__Match_ParallelStep_ParallelFlow_Step();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_solveCsp_BWD__Match_ParallelStep_ParallelFlow_Step();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_349(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 349</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 349</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_349(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_349__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_350(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 350</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 350</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_350(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_350__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_351(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 351</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 351</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_351(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_351__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_352(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 352</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 352</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_352(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_352__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_353(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 353</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 353</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_353(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_353__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_111(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 111</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 111</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_111(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_BWD_EMoflonEdge_111__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInPFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInPFlow__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getLastStepInPFlow__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getLastStepInPFlow__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getLastStepInPFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EG2Choice <em>EG2 Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG2 Choice</em>'.
	 * @see Bpmn2UseCase.Rules.EG2Choice
	 * @generated
	 */
	EClass getEG2Choice();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq <em>EG2 Choice Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG2 Choice Seq</em>'.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq
	 * @generated
	 */
	EClass getEG2ChoiceSeq();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_BWD__Match_Step_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__RegisterObjectsToMatch_BWD__Match_Step_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_solveCsp_BWD__Match_Step_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_ChoiceStep_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_112(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 112</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 112</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_112(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_BWD_EMoflonEdge_112__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_113(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 113</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 113</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_113(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_BWD_EMoflonEdge_113__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_354(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 354</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 354</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_354(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_354__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_355(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 355</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 355</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_355(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_355__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_356(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 356</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 356</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_356(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_356__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_357(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 357</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 357</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_357(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_357__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_358(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 358</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 358</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_358(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_358__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_359(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 359</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 359</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_359(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_359__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_360(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 360</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 360</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_360(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_360__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_361(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 361</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 361</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_361(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_361__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FlowNode_Step_FN2S_Flow_ChoiceStep_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_Process_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst <em>EG2 Choice First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG2 Choice First</em>'.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst
	 * @generated
	 */
	EClass getEG2ChoiceFirst();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.FlowNode, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2F, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2F, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FlowNode_Flow_FN2F_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_BWD__Match_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__RegisterObjectsToMatch_BWD__Match_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_solveCsp_BWD__Match_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2F, SimpleUseCase.ChoiceStep, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2F, SimpleUseCase.ChoiceStep, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FlowNode_Flow_FN2F_ChoiceStep_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_BWD_EMoflonEdge_114(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 114</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 114</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_BWD_EMoflonEdge_114(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_BWD_EMoflonEdge_114__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_362(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 362</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 362</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_362(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_362__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_363(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 363</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 363</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_363(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_363__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_364(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 364</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 364</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_364(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_364__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_365(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 365</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 365</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_365(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_365__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_366(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 366</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 366</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_366(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_366__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_367(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 367</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 367</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_367(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_367__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_368(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 368</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 368</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_368(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_368__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_369(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 369</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 369</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_369(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_369__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2F, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2F, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FlowNode_Flow_FN2F_ChoiceStep_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2F) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2F)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__GenerateModel__RuleEntryContainer_FN2F();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2F, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.FlowNode, SimpleUseCase.Flow, Bpmn2UseCase.FN2F, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_FlowNode_Flow_FN2F_Process_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG <em>EG2 Choice After PG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG2 Choice After PG</em>'.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG
	 * @generated
	 */
	EClass getEG2ChoiceAfterPG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_SequenceFlow_Flow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__RegisterObjectsToMatch_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UseCase, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_solveCsp_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_ParallelFlow_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_370(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 370</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 370</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_370(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_370__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_115(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 115</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 115</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_115(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_115__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_371(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 371</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 371</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_371(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_371__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_372(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 372</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 372</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_372(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_372__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_116(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 116</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 116</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_116(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_116__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_117(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 117</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 117</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_117(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_117__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_373(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 373</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 373</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_373(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_373__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_374(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 374</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 374</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_374(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_374__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_375(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 375</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 375</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_375(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_375__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_376(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 376</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 376</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_376(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_376__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_377(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 377</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 377</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_377(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_377__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.ParallelFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_SequenceFlow_ParallelFlow_ChoiceStep_Flow_ExclusiveGateway_ExclusiveGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleBPMN.ParallelGateway, SimpleUseCase.ParallelStep, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_Flow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG <em>Task2 Normal Step After Def EG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Normal Step After Def EG</em>'.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG
	 * @generated
	 */
	EClass getTask2NormalStepAfterDefEG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_Flow_ExclusiveGateway_ChoiceStep_GW2S_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_118(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 118</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 118</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_118(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_118__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_378(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 378</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 378</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_378(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_378__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_379(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 379</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 379</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_379(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_379__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_380(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 380</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 380</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_380(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_380__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_119(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 119</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 119</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_119(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_119__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_381(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 381</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 381</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_381(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_381__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_382(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 382</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 382</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_382(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_382__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_383(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 383</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 383</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_383(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_383__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_384(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 384</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 384</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_384(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_384__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.NormalStep, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_NormalStep_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_Task_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Flow_ExclusiveGateway_ChoiceStep_GW2S_Process_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG <em>Task2 Normal Step After EG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Normal Step After EG</em>'.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG
	 * @generated
	 */
	EClass getTask2NormalStepAfterEG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_UseCase_P2UC_Flow_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.UseCase, SimpleUseCase.StepAlternative, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.UseCase, SimpleUseCase.StepAlternative, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.UseCase, SimpleUseCase.StepAlternative, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.UseCase, SimpleUseCase.StepAlternative, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__RegisterObjectsToMatch_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.UseCase, SimpleUseCase.StepAlternative, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.UseCase, SimpleUseCase.StepAlternative, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.StepAlternative, SimpleUseCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.StepAlternative, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_NormalStep_AlternativeFlow_Process_UseCase_P2UC_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_385(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 385</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 385</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_385(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_385__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_386(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 386</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 386</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_386(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_386__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_120(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 120</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 120</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_120(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_120__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_121(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 121</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 121</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_121(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_121__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_387(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 387</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 387</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_387(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_387__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_122(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 122</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 122</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_122(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_122__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_123(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 123</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 123</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_123(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_123__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_388(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 388</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 388</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_388(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_388__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_389(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 389</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 389</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_389(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_389__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_390(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 390</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 390</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_390(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_390__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.StepAlternative, SimpleUseCase.Flow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.StepAlternative, SimpleUseCase.Flow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_NormalStep_AlternativeFlow_Process_UseCase_P2UC_StepAlternative_Flow_Task_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Process_UseCase_P2UC_Flow_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see Bpmn2UseCase.Rules.Class1
	 * @generated
	 */
	EClass getClass1();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getClass1__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getClass1__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_solveCsp_FWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_SequenceFlow_FN2S_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getClass1__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getClass1__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getClass1__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_solveCsp_BWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_FN2S_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getClass1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_BWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 124</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 124</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_BWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_BWD_EMoflonEdge_124__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_391(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 391</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 391</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_391(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_391__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_392(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 392</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 392</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_392(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_392__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_393(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 393</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 393</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_393(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_393__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_394(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 394</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 394</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_394(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_394__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_395(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 395</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 395</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_395(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_395__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getClass1__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getClass1__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_SequenceFlow_FN2S_GW2S_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getClass1__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getClass1__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getClass1__GenerateModel_solveCsp_BWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_FN2S_GW2S_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.LastStepInAltFlow <em>Last Step In Alt Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Step In Alt Flow</em>'.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow
	 * @generated
	 */
	EClass getLastStepInAltFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjectsToMatch_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_solveCsp_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 125</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 125</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_125__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_396(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 396</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 396</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_396(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_396__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_397(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 397</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 397</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_397(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_397__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_398(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 398</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 398</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_398(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_398__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_399(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 399</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 399</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_399(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_399__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_400(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 400</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 400</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_400(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_400__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 126</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 126</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_126__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG <em>PG2 Parallel Step After Def EG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PG2 Parallel Step After Def EG</em>'.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG
	 * @generated
	 */
	EClass getPG2ParallelStepAfterDefEG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Flow_Process_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD__Match_ChoiceStep_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__RegisterObjectsToMatch_BWD__Match_ChoiceStep_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ParallelStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.ParallelStep, SimpleUseCase.Flow, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.ParallelStep, SimpleUseCase.Flow, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_ParallelStep_Flow_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_401(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 401</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 401</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_401(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_401__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_402(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 402</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 402</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_402(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_402__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_403(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 403</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 403</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_403(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_403__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 127</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 127</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_127__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 128</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 128</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_128__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_404(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 404</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 404</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_404(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_404__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_405(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 405</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 405</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_405(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_405__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_406(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 406</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 406</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_406(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_406__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_407(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 407</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 407</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_407(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_407__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_408(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 408</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 408</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_408(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_408__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_409(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 409</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 409</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_409(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_409__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.ParallelStep, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_ParallelStep_Flow_Process_ParallelGateway_ParallelGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG <em>PG2 Parallel Step After EG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PG2 Parallel Step After EG</em>'.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG
	 * @generated
	 */
	EClass getPG2ParallelStepAfterEG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__RegisterObjectsToMatch_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_solveCsp_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_AlternativeFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 129</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 129</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_129__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_410(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 410</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 410</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_410(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_410__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 130</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 130</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_130__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_411(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 411</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 411</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_411(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_411__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_412(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 412</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 412</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_412(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_412__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 131</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 131</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_131__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 132</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 132</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_132__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_413(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 413</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 413</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_413(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_413__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_414(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 414</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 414</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_414(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_414__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_415(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 415</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 415</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_415(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_415__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_416(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 416</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 416</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_416(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_416__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_417(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 417</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 417</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_417(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_417__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StepAlternative_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_AlternativeFlow_ParallelStep_ParallelGateway_ParallelGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG <em>EG2 Choice Step After Def EG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG2 Choice Step After Def EG</em>'.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG
	 * @generated
	 */
	EClass getEG2ChoiceStepAfterDefEG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Flow_Process_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD__Match_ChoiceStep_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__RegisterObjectsToMatch_BWD__Match_ChoiceStep_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_ChoiceStep_Flow_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_418(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 418</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 418</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_418(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_418__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_419(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 419</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 419</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_419(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_419__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_420(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 420</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 420</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_420(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_420__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 133</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 133</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_133__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 134</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 134</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_134__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_421(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 421</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 421</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_421(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_421__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_422(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 422</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 422</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_422(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_422__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_423(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 423</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 423</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_423(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_423__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 424</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 424</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_424__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 425</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 425</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_425__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 426</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 426</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_426__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.ChoiceStep, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_ChoiceStep_Flow_Process_ExclusiveGateway_ExclusiveGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG <em>EG2 Choice Step After EG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EG2 Choice Step After EG</em>'.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG
	 * @generated
	 */
	EClass getEG2ChoiceStepAfterEG();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__RegisterObjectsToMatch_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.UseCase, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_solveCsp_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_AlternativeFlow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 135</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 135</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_135__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 427</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 427</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_427__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 136</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 136</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_136__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 137</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 137</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_137__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 428</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 428</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_428__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_429(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 429</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 429</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_429(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_429__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 138</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 138</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_138__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_430(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 430</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 430</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_430(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_430__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_431(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 431</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 431</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_431(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_431__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_432(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 432</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 432</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_432(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_432__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_433(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 433</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 433</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_433(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_433__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_434(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 434</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 434</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_434(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_434__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StepAlternative_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_AlternativeFlow_ChoiceStep_ExclusiveGateway_ExclusiveGateway_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq <em>End Event2 Final State GW Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event2 Final State GW Seq</em>'.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq
	 * @generated
	 */
	EClass getEndEvent2FinalStateGWSeq();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Gateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Gateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD__Match_Gateway_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Gateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Gateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__RegisterObjectsToMatch_FWD__Match_Gateway_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Gateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Gateway, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_solveCsp_FWD__Match_Gateway_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Gateway, SimpleUseCase.Step, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Gateway, SimpleUseCase.Step, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Gateway_Step_GW2S_Flow_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD__Match_UCCondition_Step_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__RegisterObjectsToMatch_BWD__Match_UCCondition_Step_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.UCCondition, SimpleUseCase.Step, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_solveCsp_BWD__Match_UCCondition_Step_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.UCCondition, SimpleBPMN.Gateway, SimpleUseCase.Step, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.UCCondition, SimpleBPMN.Gateway, SimpleUseCase.Step, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_UCCondition_Gateway_Step_GW2S_Flow_Process();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 139</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 139</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD_EMoflonEdge_139__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 140</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 140</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD_EMoflonEdge_140__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_435(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 435</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 435</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_435(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_435__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_436(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 436</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 436</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_436(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_436__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_437(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 437</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 437</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_437(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_437__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_438(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 438</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 438</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_438(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_438__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_439(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 439</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 439</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_439(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_439__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_440(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 440</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 440</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_440(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_440__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.UCCondition, SimpleBPMN.Gateway, SimpleUseCase.Step, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.UCCondition, SimpleBPMN.Gateway, SimpleUseCase.Step, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.SequenceFlow, SimpleBPMN.EndEvent, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_UCCondition_Gateway_Step_GW2S_Flow_Process_SequenceFlow_EndEvent_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.GW2S)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__GenerateModel__RuleEntryContainer_GW2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Gateway, SimpleUseCase.Step, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Gateway, SimpleUseCase.Step, Bpmn2UseCase.GW2S, SimpleUseCase.Flow, SimpleBPMN.Process, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_Gateway_Step_GW2S_Flow_Process_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
