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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1190</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1190__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 381</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_381__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 382</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_382__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1191</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1191__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1192</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1192__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1193</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1193__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 383</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_383__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 384</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_384__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 385</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_385__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1194</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1194__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1195</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1195__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1196</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1196__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1197</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1197__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1198</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1198__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 386</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_386__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 387</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_387__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1199</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1199__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1200</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1200__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1201</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1201__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1202</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1202__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1203</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1203__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1204</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1204__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 388</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_388__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1205</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1205__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1206</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1206__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1207</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1207__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1208</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1208__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1209</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1209__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1210</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1210__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 389</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_389__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 390</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_390__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1211</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1211__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1212</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1212__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1213</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1213__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1214</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1214__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1215</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1215__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1216</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1216__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1217</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1217__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1218</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1218__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 391</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_391__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1219</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1219__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1220</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1220__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1221</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1221__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1222</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1222__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1223</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1223__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1224</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1224__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1225</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1225__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1226</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1226__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1227</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1227__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1228</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1228__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1229</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1229__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1230</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1230__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 392</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_392__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1231</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1231__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1232</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1232__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1233</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1233__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1234</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1234__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 393</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_393__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1235</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1235__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 394</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_394__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 395</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_395__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1236</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1236__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1237</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1237__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1238</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1238__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 396</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_396__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 397</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_397__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1239</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1239__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1240</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1240__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1241</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1241__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1242</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1242__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1243</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1243__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1244</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1244__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S_USECASE_P2UC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S_USECASE_P2UC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1245</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1245__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1246</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1246__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1247</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1247__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1248</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1248__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1249</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1249__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 398</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_398__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S_USECASE_P2UC_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_PFLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S_USECASE_P2UC_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 399</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_399__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 400</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_400__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1250</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1250__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1251</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1251__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1252</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1252__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1253</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1253__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1254</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1254__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1255</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1255__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1256</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1256__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1257</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1257__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 401</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_401__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1258</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1258__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1259</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1259__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1260</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1260__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1261</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1261__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1262</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1262__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1263</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1263__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1264</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1264__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1265</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1265__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1266</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1266__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 402</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_402__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1267</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1267__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1268</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1268__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 403</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_403__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 404</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_404__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1269</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1269__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1270</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1270__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1271</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1271__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1272</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1272__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1273</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1273__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 405</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_405__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1274</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1274__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1275</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1275__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1276</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1276__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 406</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_406__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1277</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1277__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1278</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1278__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1279</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1279__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1280</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1280__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1281</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1281__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1282</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1282__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 407</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_407__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 408</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_408__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1283</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1283__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 409</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_409__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 410</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_410__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1284</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1284__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1285</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1285__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1286</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1286__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.EmptyDefaulFlowImpl <em>Empty Defaul Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.EmptyDefaulFlowImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getEmptyDefaulFlow()
	 * @generated
	 */
	int EMPTY_DEFAUL_FLOW = 20;

	/**
	 * The number of structural features of the '<em>Empty Defaul Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_PROCESS_USECASE_P2UC_FLOW_GW2S_EXCLUSIVEGATEWAY_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_USECASE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_USECASE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_USECASE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_PROCESS_USECASE_P2UC_FLOW_GW2S_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1287</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1287__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1288</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1288__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1289</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1289__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 411</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_411__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1290</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1290__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1291</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1291__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1292</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1292__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_EXCLUSIVEGATEWAY_CHOICESTEP_PROCESS_USECASE_P2UC_FLOW_GW2S_EXCLUSIVEGATEWAY_SEQUENCEFLOW_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___GENERATE_MODEL__RULEENTRYCONTAINER_P2UC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_PROCESS_USECASE_P2UC_FLOW_GW2S_EXCLUSIVEGATEWAY_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The number of operations of the '<em>Empty Defaul Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 36;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.LastStepInDefaultFlowImpl <em>Last Step In Default Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.LastStepInDefaultFlowImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getLastStepInDefaultFlow()
	 * @generated
	 */
	int LAST_STEP_IN_DEFAULT_FLOW = 21;

	/**
	 * The number of structural features of the '<em>Last Step In Default Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_FN2S_GW2S_USECASE_P2UC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_FN2S_GW2S_USECASE_P2UC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 412</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_412__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1293</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1293__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1294</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1294__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1295</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1295__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1296</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1296__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1297</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1297__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPLICABLE_CC__MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_FN2S_GW2S_USECASE_P2UC_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPLICABLE_CHECK_CSP_CC__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Perform CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___PERFORM_CC__ISAPPLICABLEMATCHCC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_FN2S_GW2S_USECASE_P2UC_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 33;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 34;

	/**
	 * The number of operations of the '<em>Last Step In Default Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 35;

	/**
	 * The meta object id for the '{@link Bpmn2UseCase.Rules.impl.LastStepInAltFlowImpl <em>Last Step In Alt Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Bpmn2UseCase.Rules.impl.LastStepInAltFlowImpl
	 * @see Bpmn2UseCase.Rules.impl.RulesPackageImpl#getLastStepInAltFlow()
	 * @generated
	 */
	int LAST_STEP_IN_ALT_FLOW = 22;

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
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S_USECASE_P2UC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD__MATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_STEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_STEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_STEP_USECASE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S_USECASE_P2UC = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 413</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_413__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1298</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1298__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1299</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1299__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1300</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1300__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1301</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1301__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1302</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1302__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 414</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_414__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S_USECASE_P2UC_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int LAST_STEP_IN_ALT_FLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S_USECASE_P2UC_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_DEF_EG = 23;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1303</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1303__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1304</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1304__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1305</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1305__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 415</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_415__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 416</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_416__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1306</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1306__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1307</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1307__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1308</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1308__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1309</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1309__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1310</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1310__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1311</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1311__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_EG = 24;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 417</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_417__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1312</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1312__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 418</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_418__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1313</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1313__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1314</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1314__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 419</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_419__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 420</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_420__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1315</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1315__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1316</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1316__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1317</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1317__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1318</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1318__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1319</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1319__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_DEF_EG = 25;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1320</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1320__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1321</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1321__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1322</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1322__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 421</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_421__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 422</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_422__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1323</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1323__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1324</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1324__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1325</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1325__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1326</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1326__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1327</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1327__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1328</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1328__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_EG = 26;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 423</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_423__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1329</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1329__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 424</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_424__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 425</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_425__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1330</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1330__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1331</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1331__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 426</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_426__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1332</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1332__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1333</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1333__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1334</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1334__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1335</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1335__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1336</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1336__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int END_EVENT2_FINAL_STATE_GW_SEQ = 27;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 427</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_427__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 428</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_428__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1337</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1337__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1338</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1338__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1339</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1339__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1340</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1340__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1341</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1341__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1342</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1342__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_1190(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1190</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1190</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_1190(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_1190__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_381(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 381</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 381</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_381(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_381__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_382(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 382</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 382</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_382(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_382__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1191(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1191</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1191</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1191(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1191__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1192(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1192</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1192</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1192(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1192__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1193(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1193</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1193</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1193(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1193__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_383(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 383</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 383</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_383(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_383__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_384(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 384</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 384</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_384(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_384__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_385(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 385</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 385</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_385(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_385__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1194(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1194</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1194</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1194(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1194__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1195(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1195</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1195</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1195(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1195__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1196(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1196</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1196</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1196(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1196__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1197(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1197</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1197</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1197(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1197__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1198(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1198</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1198</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_1198(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1198__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_386(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 386</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 386</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_386(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_386__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_387(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 387</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 387</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_387(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_387__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1199(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1199</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1199</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1199(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_1199__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1200(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1200</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1200</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1200(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_1200__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1201(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1201</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1201</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1201(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_1201__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1202(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1202</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1202</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1202(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_1202__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1203(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1203</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1203</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1203(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_1203__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1204(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1204</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1204</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_1204(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_1204__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_BWD_EMoflonEdge_388(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 388</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 388</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_BWD_EMoflonEdge_388(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_BWD_EMoflonEdge_388__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1205(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1205</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1205</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1205(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_1205__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1206(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1206</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1206</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1206(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_1206__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1207(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1207</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1207</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1207(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_1207__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1208(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1208</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1208</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1208(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_1208__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1209(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1209</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1209</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1209(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_1209__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1210(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1210</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1210</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_1210(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_1210__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_389(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 389</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 389</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_389(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_389__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_390(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 390</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 390</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_390(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_390__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1211(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1211</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1211</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1211(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_1211__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1212(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1212</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1212</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1212(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_1212__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1213(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1213</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1213</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1213(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_1213__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1214(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1214</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1214</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1214(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_1214__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1215(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1215</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1215</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1215(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_1215__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1216(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1216</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1216</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1216(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_1216__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1217(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1217</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1217</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1217(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_1217__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1218(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1218</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1218</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_1218(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_1218__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_BWD_EMoflonEdge_391(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 391</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 391</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_BWD_EMoflonEdge_391(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_BWD_EMoflonEdge_391__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1219(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1219</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1219</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1219(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_1219__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1220(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1220</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1220</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1220(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_1220__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1221(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1221</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1221</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1221(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_1221__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1222(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1222</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1222</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1222(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_1222__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1223(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1223</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1223</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1223(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_1223__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1224(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1224</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1224</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1224(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_1224__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1225(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1225</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1225</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1225(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_1225__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1226(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1226</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1226</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_1226(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_1226__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1227(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1227</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1227</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1227(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_1227__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1228(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1228</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1228</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1228(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_1228__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1229(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1229</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1229</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1229(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_1229__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1230(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1230</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1230</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1230(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_1230__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD_EMoflonEdge_392(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 392</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 392</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD_EMoflonEdge_392(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_BWD_EMoflonEdge_392__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1231(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1231</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1231</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1231(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_1231__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1232(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1232</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1232</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_1232(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_1232__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1233(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1233</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1233</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1233(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1233__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1234(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1234</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1234</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1234(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1234__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_393(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 393</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 393</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_393(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_393__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1235(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1235</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1235</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1235(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1235__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_394(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 394</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 394</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_394(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_394__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_395(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 395</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 395</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_395(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_395__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1236(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1236</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1236</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1236(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1236__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1237(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1237</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1237</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1237(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1237__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1238(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1238</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1238</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_1238(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_1238__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_396(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 396</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 396</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_396(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD_EMoflonEdge_396__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_397(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 397</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 397</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_397(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD_EMoflonEdge_397__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1239(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1239</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1239</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1239(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_1239__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1240(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1240</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1240</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1240(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_1240__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1241(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1241</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1241</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1241(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_1241__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1242(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1242</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1242</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1242(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_1242__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1243(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1243</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1243</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1243(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_1243__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1244(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1244</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1244</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_1244(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_1244__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_UseCase_P2UC();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step, SimpleUseCase.UseCase) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step, SimpleUseCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_BWD__Match_ParallelStep_ParallelFlow_Step_UseCase();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step, SimpleUseCase.UseCase) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step, SimpleUseCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjectsToMatch_BWD__Match_ParallelStep_ParallelFlow_Step_UseCase();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step, SimpleUseCase.UseCase) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleUseCase.Step, SimpleUseCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_solveCsp_BWD__Match_ParallelStep_ParallelFlow_Step_UseCase();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_UseCase_P2UC();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1245(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1245</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1245</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1245(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_1245__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1246(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1246</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1246</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1246(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_1246__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1247(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1247</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1247</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1247(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_1247__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1248(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1248</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1248</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1248(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_1248__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1249(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1249</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1249</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_1249(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_1249__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_398(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 398</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 398</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_398(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_BWD_EMoflonEdge_398__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_UseCase_P2UC_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ParallelStep, SimpleUseCase.ParallelFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getLastStepInPFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_UseCase_P2UC_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_399(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 399</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 399</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_399(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_BWD_EMoflonEdge_399__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_400(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 400</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 400</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_400(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_BWD_EMoflonEdge_400__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1250(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1250</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1250</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1250(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_1250__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1251(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1251</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1251</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1251(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_1251__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1252(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1252</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1252</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1252(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_1252__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1253(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1253</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1253</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1253(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_1253__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1254(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1254</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1254</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1254(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_1254__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1255(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1255</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1255</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1255(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_1255__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1256(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1256</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1256</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1256(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_1256__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1257(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1257</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1257</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_1257(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_1257__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_BWD_EMoflonEdge_401(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 401</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 401</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_BWD_EMoflonEdge_401(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_BWD_EMoflonEdge_401__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1258(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1258</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1258</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1258(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_1258__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1259(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1259</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1259</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1259(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_1259__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1260(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1260</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1260</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1260(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_1260__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1261(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1261</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1261</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1261(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_1261__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1262(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1262</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1262</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1262(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_1262__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1263(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1263</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1263</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1263(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_1263__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1264(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1264</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1264</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1264(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_1264__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1265(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1265</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1265</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_1265(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_1265__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1266(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1266</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1266</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1266(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_1266__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_402(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 402</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 402</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_402(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_402__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1267(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1267</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1267</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1267(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_1267__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1268(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1268</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1268</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1268(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_1268__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_403(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 403</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 403</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_403(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_403__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_404(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 404</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 404</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_404(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_404__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1269(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1269</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1269</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1269(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_1269__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1270(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1270</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1270</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1270(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_1270__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1271(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1271</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1271</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1271(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_1271__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1272(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1272</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1272</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1272(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_1272__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1273(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1273</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1273</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_1273(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_1273__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_405(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 405</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 405</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_405(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_405__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1274(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1274</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1274</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1274(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1274__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1275(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1275</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1275</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1275(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1275__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1276(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1276</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1276</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1276(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1276__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_406(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 406</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 406</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_406(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_406__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1277(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1277</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1277</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1277(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1277__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1278(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1278</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1278</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1278(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1278__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1279(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1279</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1279</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1279(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1279__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1280(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1280</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1280</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1280(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1280__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1281(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1281</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1281</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1281(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1281__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1282(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1282</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1282</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1282(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1282__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_407(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 407</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 407</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_407(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_407__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_408(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 408</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 408</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_408(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_408__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1283(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1283</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1283</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1283(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1283__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_409(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 409</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 409</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_409(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_409__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_410(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 410</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 410</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_410(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_410__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1284(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1284</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1284</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1284(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1284__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1285(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1285</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1285</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1285(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1285__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1286(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1286</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1286</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_1286(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1286__EMoflonEdge();

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
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow <em>Empty Defaul Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Defaul Flow</em>'.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow
	 * @generated
	 */
	EClass getEmptyDefaulFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD__Match_ExclusiveGateway_Process_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_Process_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_Process_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, Bpmn2UseCase.GW2S, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, Bpmn2UseCase.GW2S, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_Process_UseCase_P2UC_Flow_GW2S_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.UseCase, SimpleUseCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.UseCase, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_BWD__Match_ChoiceStep_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.UseCase, SimpleUseCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.UseCase, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__RegisterObjectsToMatch_BWD__Match_ChoiceStep_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.UseCase, SimpleUseCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.UseCase, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, Bpmn2UseCase.GW2S, SimpleBPMN.ExclusiveGateway) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, Bpmn2UseCase.GW2S, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_Process_UseCase_P2UC_Flow_GW2S_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1287(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1287</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1287</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1287(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_1287__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1288(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1288</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1288</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1288(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_1288__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1289(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1289</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1289</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1289(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_1289__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_BWD_EMoflonEdge_411(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 411</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 411</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_BWD_EMoflonEdge_411(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_BWD_EMoflonEdge_411__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1290(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1290</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1290</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1290(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_1290__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1291(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1291</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1291</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1291(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_1291__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1292(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1292</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1292</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_1292(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_1292__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, Bpmn2UseCase.GW2S, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, Bpmn2UseCase.GW2S, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ExclusiveGateway_ChoiceStep_Process_UseCase_P2UC_Flow_GW2S_ExclusiveGateway_SequenceFlow_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.P2UC) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.P2UC)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__GenerateModel__RuleEntryContainer_P2UC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, Bpmn2UseCase.GW2S, SimpleBPMN.ExclusiveGateway, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, Bpmn2UseCase.GW2S, SimpleBPMN.ExclusiveGateway, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_Process_UseCase_P2UC_Flow_GW2S_ExclusiveGateway_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow <em>Last Step In Default Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Step In Default Flow</em>'.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow
	 * @generated
	 */
	EClass getLastStepInDefaultFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_SequenceFlow_FN2S_GW2S_UseCase_P2UC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UseCase) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UseCase) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UseCase) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleUseCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_FN2S_GW2S_UseCase_P2UC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD_EMoflonEdge_412(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 412</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 412</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD_EMoflonEdge_412(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_BWD_EMoflonEdge_412__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1293(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1293</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1293</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1293(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_1293__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1294(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1294</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1294</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1294(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_1294__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1295(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1295</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1295</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1295(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_1295__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1296(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1296</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1296</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1296(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_1296__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1297(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1297</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1297</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_1297(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_1297__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_CC(TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_SequenceFlow_FN2S_GW2S_UseCase_P2UC_Match_Match();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_CC(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#perform_CC(TGGRuntime.IsApplicableMatchCC) <em>Perform CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#perform_CC(TGGRuntime.IsApplicableMatchCC)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__Perform_CC__IsApplicableMatchCC();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, Bpmn2UseCase.FN2S)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__GenerateModel__RuleEntryContainer_FN2S();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.ChoiceStep, SimpleUseCase.Step, SimpleUseCase.Flow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_FN2S_GW2S_UseCase_P2UC_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__GenerateModel_checkCsp_BWD__CSP();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_UseCase_P2UC();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step, SimpleUseCase.UseCase) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step, SimpleUseCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step_UseCase();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step, SimpleUseCase.UseCase) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step, SimpleUseCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjectsToMatch_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step_UseCase();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step, SimpleUseCase.UseCase) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleUseCase.Step, SimpleUseCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_solveCsp_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step_UseCase();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_UseCase_P2UC();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_413(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 413</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 413</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_413(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_413__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1298(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1298</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1298</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1298(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_1298__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1299(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1299</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1299</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1299(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_1299__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1300(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1300</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1300</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1300(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_1300__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1301(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1301</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1301</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1301(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_1301__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1302(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1302</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1302</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_1302(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_1302__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_414(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 414</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 414</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_414(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_414__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleBPMN.SequenceFlow, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_UseCase_P2UC_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleUseCase.ChoiceStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleBPMN.Gateway, SimpleBPMN.Gateway, SimpleBPMN.FlowNode, SimpleUseCase.Step, Bpmn2UseCase.FN2S, Bpmn2UseCase.GW2S, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_UseCase_P2UC_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1303(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1303</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1303</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1303(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1303__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1304(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1304</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1304</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1304(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1304__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1305(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1305</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1305</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1305(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1305__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_415(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 415</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 415</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_415(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_415__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_416(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 416</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 416</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_416(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_416__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1306(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1306</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1306</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1306(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1306__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1307(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1307</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1307</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1307(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1307__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1308(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1308</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1308</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1308(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1308__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1309(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1309</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1309</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1309(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1309__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1310(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1310</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1310</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1310(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1310__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1311(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1311</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1311</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1311(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1311__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_417(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 417</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 417</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_417(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_417__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1312(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1312</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1312</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1312(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1312__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_418(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 418</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 418</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_418(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_418__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1313(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1313</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1313</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1313(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1313__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1314(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1314</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1314</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1314(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1314__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_419(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 419</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 419</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_419(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_419__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_420(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 420</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 420</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_420(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_420__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1315(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1315</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1315</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1315(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1315__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1316(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1316</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1316</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1316(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1316__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1317(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1317</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1317</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1317(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1317__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1318(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1318</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1318</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1318(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1318__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1319(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1319</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1319</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_1319(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1319__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1320(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1320</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1320</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1320(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1320__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1321(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1321</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1321</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1321(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1321__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1322(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1322</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1322</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1322(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1322__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_421(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 421</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 421</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_421(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_421__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_422(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 422</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 422</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_422(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_422__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1323(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1323</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1323</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1323(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1323__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1324(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1324</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1324</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1324(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1324__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1325(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1325</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1325</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1325(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1325__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1326(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1326</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1326</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1326(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1326__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1327(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1327</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1327</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1327(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1327__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1328(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1328</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1328</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_1328(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_1328__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_423(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 423</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 423</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_423(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_423__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1329(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1329</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1329</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1329(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1329__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 424</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 424</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_424__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 425</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 425</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_425__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1330(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1330</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1330</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1330(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1330__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1331(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1331</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1331</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1331(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1331__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 426</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 426</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_426__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1332(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1332</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1332</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1332(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1332__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1333(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1333</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1333</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1333(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1333__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1334(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1334</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1334</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1334(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1334__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1335(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1335</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1335</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1335(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1335__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1336(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1336</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1336</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_1336(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_1336__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 427</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 427</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD_EMoflonEdge_427__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 428</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 428</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD_EMoflonEdge_428__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1337(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1337</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1337</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1337(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_1337__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1338(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1338</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1338</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1338(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_1338__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1339(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1339</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1339</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1339(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_1339__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1340(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1340</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1340</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1340(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_1340__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1341(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1341</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1341</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1341(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_1341__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1342(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1342</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1342</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_1342(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_1342__EMoflonEdge();

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
