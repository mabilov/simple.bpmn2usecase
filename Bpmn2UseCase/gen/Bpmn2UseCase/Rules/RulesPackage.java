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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 147</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_147__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 47</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_47__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 48</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_48__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 148</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_148__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 149</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_149__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 150</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_150__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 49</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_49__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 50</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_50__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 51</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_51__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 151</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_151__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 152</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_152__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 153</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_153__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 154</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_154__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 155</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_155__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 52</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_52__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 53</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_53__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 156</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_156__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 157</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_157__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 158</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_158__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 159</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_159__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 160</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_160__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 161</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_161__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 54</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_54__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 162</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_162__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 163</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_163__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 164</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_164__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 165</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_165__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 166</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_166__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 167</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_167__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 55</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_55__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 56</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_56__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 168</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_168__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 169</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_169__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 170</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_170__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 171</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_171__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 172</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_172__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 173</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_173__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 174</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_174__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 175</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_175__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 57</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_57__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 176</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_176__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 177</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_177__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 178</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_178__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 179</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_179__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 180</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_180__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 181</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_181__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 182</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_182__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 183</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_183__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 184</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_184__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 185</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_185__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 186</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_186__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 187</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_187__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 58</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_58__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 188</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_188__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 189</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_189__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 190</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_190__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 191</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_191__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 59</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_59__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 192</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_192__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 60</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_60__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 61</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_61__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 193</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_193__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 194</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_194__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 195</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_195__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 62</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_62__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 63</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_63__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 196</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_196__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 197</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_197__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 198</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_198__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 199</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_199__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 200</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_200__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 201</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_201__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 202</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_202__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 203</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_203__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 204</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_204__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 205</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_205__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 206</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_206__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 64</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_64__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 65</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_65__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 66</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_66__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 207</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_207__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 208</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_208__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 209</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_209__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 210</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_210__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 211</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_211__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 212</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_212__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 213</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_213__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 214</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_214__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 67</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_67__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 215</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_215__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 216</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_216__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 217</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_217__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 218</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_218__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 219</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_219__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 220</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_220__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 221</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_221__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 222</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_222__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 223</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_223__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 68</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_68__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 224</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_224__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 225</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_225__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 69</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_69__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 70</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_70__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 226</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_226__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 227</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_227__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 228</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_228__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 229</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_229__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 230</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_230__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 71</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_71__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 231</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_231__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 232</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_232__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 233</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_233__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 72</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_72__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 234</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_234__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 235</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_235__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 236</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_236__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 237</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_237__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_NORMALSTEP_ALTERNATIVEFLOW_PROCESS_USECASE_P2UC_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 238</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_238__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 239</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_239__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 73</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_73__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 74</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_74__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 240</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_240__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 75</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_75__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 76</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_76__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 241</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_241__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 242</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_242__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 243</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_243__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_SEQUENCEFLOW_NORMALSTEP_ALTERNATIVEFLOW_PROCESS_USECASE_P2UC_STEPALTERNATIVE_FLOW_TASK_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int TASK2_NORMAL_STEP_AFTER_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 77</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_BWD_EMOFLON_EDGE_77__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 244</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_244__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 245</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_245__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 246</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_246__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 247</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_247__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 248</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_248__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 78</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_78__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 249</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_249__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 250</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_250__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 251</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_251__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 252</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_252__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 253</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_253__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 79</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_79__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 254</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_254__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 255</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_255__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 256</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_256__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 80</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_80__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 81</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_81__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 257</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_257__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 258</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_258__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 259</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_259__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 260</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_260__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 261</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_261__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 262</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_262__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_ALTERNATIVEFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 82</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_82__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 263</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_263__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 83</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_83__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 264</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_264__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 265</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_265__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 84</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_84__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 85</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_85__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 266</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_266__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 267</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_267__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 268</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_268__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 269</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_269__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 270</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_270__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_SEQUENCEFLOW_ALTERNATIVEFLOW_PARALLELSTEP_PARALLELGATEWAY_PARALLELGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int PG2_PARALLEL_STEP_AFTER_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 271</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_271__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 272</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_272__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 273</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_273__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 86</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_86__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 87</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_87__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 274</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_274__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 275</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_275__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 276</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_276__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 277</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_277__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 278</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_278__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 279</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_DEF_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_279__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_EG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_SEQUENCEFLOW_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_EG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_SEQUENCEFLOW_ALTERNATIVEFLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_EG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 88</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_88__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 280</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_280__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 89</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_89__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 90</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_90__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 281</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_281__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 282</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_282__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 91</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_91__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 283</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_283__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 284</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_284__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 285</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_285__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 286</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_286__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 287</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_287__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_EG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_SEQUENCEFLOW_SEQUENCEFLOW_ALTERNATIVEFLOW_CHOICESTEP_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_MATCH_MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int EG2_CHOICE_STEP_AFTER_EG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_SEQUENCEFLOW_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 92</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_92__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 93</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_93__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 288</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_288__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 289</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_289__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 290</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_290__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 291</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_291__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 292</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_292__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 293</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_293__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 147</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 147</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_147__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_47(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 47</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 47</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_47(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_47__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_48(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 48</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 48</em>' operation.
	 * @see Bpmn2UseCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_48(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_48__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 148</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 148</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_148__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 149</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 149</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_149__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 150</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 150</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_150__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_49(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 49</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 49</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_49(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_49__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_50(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 50</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 50</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_50(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_50__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_51(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 51</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 51</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_BWD_EMoflonEdge_51(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_51__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 151</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 151</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_151__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 152</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 152</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_152__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 153</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 153</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_153__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_154(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 154</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 154</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_154(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_154__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_155(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 155</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 155</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG#isAppropriate_FWD_EMoflonEdge_155(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_155__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_52(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 52</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 52</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_52(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_52__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_53(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 53</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 53</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_BWD_EMoflonEdge_53(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_53__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_156(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 156</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 156</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_156(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_156__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_157(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 157</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 157</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_157(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_157__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_158(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 158</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 158</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_158(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_158__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_159(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 159</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 159</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_159(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_159__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_160(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 160</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 160</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_160(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_160__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_161(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 161</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 161</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq#isAppropriate_FWD_EMoflonEdge_161(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_161__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_BWD_EMoflonEdge_54(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 54</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 54</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_BWD_EMoflonEdge_54(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_BWD_EMoflonEdge_54__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_162(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 162</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 162</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_162(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_162__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_163(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 163</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 163</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_163(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_163__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_164(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 164</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 164</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_164(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_164__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_165(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 165</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 165</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_165(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_165__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_166(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 166</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 166</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_166(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_166__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_167(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 167</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 167</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst#isAppropriate_FWD_EMoflonEdge_167(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_167__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_55(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 55</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 55</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_55(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_55__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_56(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 56</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 56</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_BWD_EMoflonEdge_56(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_56__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_168(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 168</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 168</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_168(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_168__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_169(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 169</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 169</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_169(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_169__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_170(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 170</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 170</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_170(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_170__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_171(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 171</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 171</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_171(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_171__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_172(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 172</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 172</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_172(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_172__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_173(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 173</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 173</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_173(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_173__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_174(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 174</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 174</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_174(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_174__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_175(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 175</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 175</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq#isAppropriate_FWD_EMoflonEdge_175(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_175__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_BWD_EMoflonEdge_57(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 57</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 57</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_BWD_EMoflonEdge_57(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_176(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 176</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 176</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_176(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_176__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_177(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 177</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 177</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_177(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_177__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_178(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 178</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 178</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_178(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_178__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_179(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 179</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 179</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_179(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_179__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_180(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 180</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 180</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_180(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_180__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_181(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 181</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 181</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_181(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_181__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_182(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 182</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 182</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_182(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_182__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_183(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 183</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 183</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst#isAppropriate_FWD_EMoflonEdge_183(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_183__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_184(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 184</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 184</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_184(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_184__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_185(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 185</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 185</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_185(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_185__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_186(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 186</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 186</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_186(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_186__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_187(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 187</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 187</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_187(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_187__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD_EMoflonEdge_58(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 58</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 58</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_BWD_EMoflonEdge_58(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_188(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 188</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 188</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_188(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_188__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_189(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 189</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 189</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst#isAppropriate_FWD_EMoflonEdge_189(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_189__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_190(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 190</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 190</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_190(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_190__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_191(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 191</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 191</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_191(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_191__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_59(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 59</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 59</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_59(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_59__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_192(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 192</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 192</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_192(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_192__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_60(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 60</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 60</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_60(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_60__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_61(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 61</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 61</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_BWD_EMoflonEdge_61(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_61__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_193(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 193</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 193</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_193(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_193__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_194(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 194</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 194</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_194(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_194__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_195(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 195</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 195</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG#isAppropriate_FWD_EMoflonEdge_195(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_195__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_62(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 62</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 62</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_62(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD_EMoflonEdge_62__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_63(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 63</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 63</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_BWD_EMoflonEdge_63(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD_EMoflonEdge_63__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_196(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 196</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 196</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_196(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_196__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_197(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 197</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 197</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_197(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_197__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_198(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 198</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 198</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_198(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_198__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_199(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 199</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 199</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_199(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_199__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_200(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 200</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 200</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_200(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_200__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_201(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 201</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 201</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq#isAppropriate_FWD_EMoflonEdge_201(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_201__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_202(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 202</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 202</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_202(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_202__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_203(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 203</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 203</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_203(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_203__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_204(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 204</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 204</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_204(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_204__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_205(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 205</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 205</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_205(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_205__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_206(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 206</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 206</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_206(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_206__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_64(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 64</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 64</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_64(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_BWD_EMoflonEdge_64__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_65(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 65</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 65</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_65(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_BWD_EMoflonEdge_65__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_66(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 66</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 66</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_BWD_EMoflonEdge_66(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_BWD_EMoflonEdge_66__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_207(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 207</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 207</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_207(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_207__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_208(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 208</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 208</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_208(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_208__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_209(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 209</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 209</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_209(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_209__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_210(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 210</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 210</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_210(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_210__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_211(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 211</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 211</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_211(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_211__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_212(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 212</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 212</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_212(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_212__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_213(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 213</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 213</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_213(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_213__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_214(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 214</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 214</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq#isAppropriate_FWD_EMoflonEdge_214(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_214__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_BWD_EMoflonEdge_67(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 67</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 67</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_BWD_EMoflonEdge_67(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_BWD_EMoflonEdge_67__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_215(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 215</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 215</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_215(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_215__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_216(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 216</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 216</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_216(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_216__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_217(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 217</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 217</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_217(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_217__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_218(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 218</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 218</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_218(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_218__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_219(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 219</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 219</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_219(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_219__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_220(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 220</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 220</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_220(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_220__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_221(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 221</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 221</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_221(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_221__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_222(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 222</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 222</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst#isAppropriate_FWD_EMoflonEdge_222(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_222__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_223(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 223</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 223</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_223(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_223__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_68(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 68</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 68</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_68(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_68__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_224(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 224</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 224</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_224(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_224__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_225(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 225</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 225</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_225(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_225__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_69(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 69</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 69</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_69(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_69__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_70(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 70</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 70</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_BWD_EMoflonEdge_70(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_70__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_226(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 226</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 226</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_226(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_226__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_227(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 227</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 227</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_227(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_227__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_228(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 228</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 228</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_228(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_228__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_229(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 229</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 229</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_229(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_229__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_230(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 230</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 230</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG#isAppropriate_FWD_EMoflonEdge_230(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_230__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_71(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 71</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 71</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_71(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_71__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_231(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 231</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 231</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_231(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_231__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_232(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 232</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 232</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_232(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_232__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_233(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 233</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 233</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_233(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_233__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_72(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 72</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 72</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_72(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_72__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_234(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 234</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 234</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_234(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_234__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_235(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 235</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 235</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_235(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_235__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_236(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 236</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 236</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_236(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_236__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_237(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 237</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 237</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_237(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_237__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_SequenceFlow_Process_Task();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_SequenceFlow_Process_Task();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.Task)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_SequenceFlow_Process_UseCase_P2UC_Flow_Task();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.StepAlternative, SimpleUseCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.StepAlternative, SimpleUseCase.Flow)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_NormalStep_AlternativeFlow_Process_UseCase_P2UC_StepAlternative_Flow();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_238(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 238</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 238</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_238(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_238__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_239(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 239</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 239</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_239(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_239__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_73(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 73</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 73</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_73(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_73__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_74(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 74</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 74</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_74(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_74__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_240(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 240</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 240</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_240(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_240__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_75(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 75</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 75</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_75(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_75__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_76(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 76</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 76</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_BWD_EMoflonEdge_76(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_76__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_241(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 241</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 241</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_241(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_241__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_242(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 242</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 242</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_242(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_242__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_243(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 243</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 243</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isAppropriate_FWD_EMoflonEdge_243(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_243__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.StepAlternative, SimpleUseCase.Flow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleUseCase.NormalStep, SimpleUseCase.AlternativeFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.StepAlternative, SimpleUseCase.Flow, SimpleBPMN.Task, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_SequenceFlow_NormalStep_AlternativeFlow_Process_UseCase_P2UC_StepAlternative_Flow_Task_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getTask2NormalStepAfterEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_UseCase_P2UC_Flow_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_BWD_EMoflonEdge_77(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 77</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 77</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_BWD_EMoflonEdge_77(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_BWD_EMoflonEdge_77__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_244(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 244</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 244</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_244(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_244__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_245(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 245</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 245</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_245(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_245__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_246(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 246</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 246</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_246(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_246__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_247(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 247</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 247</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_247(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_247__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_248(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 248</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 248</em>' operation.
	 * @see Bpmn2UseCase.Rules.Class1#isAppropriate_FWD_EMoflonEdge_248(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_248__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_78(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 78</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 78</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_78(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_78__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_249(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 249</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 249</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_249(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_249__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_250(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 250</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 250</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_250(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_250__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_251(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 251</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 251</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_251(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_251__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_252(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 252</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 252</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_252(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_252__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_253(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 253</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 253</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_253(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_253__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_79(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 79</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 79</em>' operation.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_79(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_79__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_254(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 254</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 254</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_254(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_254__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_255(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 255</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 255</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_255(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_255__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_256(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 256</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 256</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_256(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_256__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_80(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 80</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 80</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_80(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_80__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_81(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 81</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 81</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_81(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_81__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_257(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 257</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 257</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_257(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_257__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_258(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 258</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 258</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_258(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_258__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_259(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 259</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 259</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_259(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_259__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_260(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 260</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 260</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_260(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_260__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_261(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 261</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 261</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_261(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_261__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_262(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 262</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 262</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_262(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_262__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_SequenceFlow_ParallelGateway_ParallelGateway();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_SequenceFlow_ParallelGateway_ParallelGateway();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_SequenceFlow_ParallelGateway_ParallelGateway();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_AlternativeFlow_ParallelStep();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_82(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 82</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 82</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_82(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_82__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_263(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 263</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 263</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_263(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_263__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_83(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 83</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 83</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_83(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_83__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_264(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 264</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 264</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_264(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_264__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_265(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 265</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 265</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_265(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_265__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_84(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 84</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 84</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_84(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_84__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_85(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 85</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 85</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_BWD_EMoflonEdge_85(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_85__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_266(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 266</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 266</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_266(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_266__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_267(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 267</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 267</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_267(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_267__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_268(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 268</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 268</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_268(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_268__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_269(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 269</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 269</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_269(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_269__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_270(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 270</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 270</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isAppropriate_FWD_EMoflonEdge_270(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_270__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ParallelStep, SimpleBPMN.ParallelGateway, SimpleBPMN.ParallelGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StepAlternative_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_SequenceFlow_AlternativeFlow_ParallelStep_ParallelGateway_ParallelGateway_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleBPMN.ExclusiveGateway, SimpleUseCase.ChoiceStep, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getPG2ParallelStepAfterEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_271(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 271</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 271</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_271(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_271__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_272(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 272</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 272</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_272(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_272__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_273(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 273</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 273</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_273(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_273__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_86(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 86</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 86</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_86(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_86__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_87(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 87</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 87</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_BWD_EMoflonEdge_87(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_87__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_274(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 274</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 274</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_274(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_274__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_275(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 275</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 275</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_275(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_275__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_276(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 276</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 276</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_276(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_276__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_277(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 277</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 277</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_277(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_277__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_278(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 278</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 278</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_278(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_278__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_279(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 279</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 279</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG#isAppropriate_FWD_EMoflonEdge_279(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_279__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjectsToMatch_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_solveCsp_FWD(TGGRuntime.Match, SimpleBPMN.Process, SimpleBPMN.ExclusiveGateway, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_AlternativeFlow_ChoiceStep();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_88(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 88</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 88</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_88(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_88__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_280(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 280</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 280</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_280(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_280__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_89(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 89</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 89</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_89(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_89__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 90</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 90</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_90(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_90__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_281(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 281</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 281</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_281(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_281__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_282(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 282</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 282</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_282(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_282__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 91</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 91</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_BWD_EMoflonEdge_91(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_91__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_283(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 283</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 283</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_283(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_283__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_284(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 284</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 284</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_284(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_284__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_285(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 285</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 285</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_285(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_285__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_286(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 286</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 286</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_286(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_286__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_287(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 287</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 287</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isAppropriate_FWD_EMoflonEdge_287(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_287__EMoflonEdge();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#isApplicable_solveCsp_CC(TGGRuntime.IsApplicableMatchCC, SimpleUseCase.StepAlternative, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, SimpleBPMN.SequenceFlow, SimpleUseCase.AlternativeFlow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, SimpleBPMN.ExclusiveGateway, TGGRuntime.Match, TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StepAlternative_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_SequenceFlow_AlternativeFlow_ChoiceStep_ExclusiveGateway_ExclusiveGateway_Match_Match();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, SimpleBPMN.Process, SimpleUseCase.UseCase, Bpmn2UseCase.P2UC, SimpleUseCase.Flow, SimpleUseCase.ChoiceStep, SimpleBPMN.ExclusiveGateway, Bpmn2UseCase.GW2S, SimpleBPMN.SequenceFlow, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEG2ChoiceStepAfterEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_ModelgeneratorRuleResult();

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
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_92(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 92</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 92</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_92(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD_EMoflonEdge_92__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_93(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 93</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 93</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_BWD_EMoflonEdge_93(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD_EMoflonEdge_93__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_288(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 288</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 288</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_288(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_288__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_289(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 289</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 289</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_289(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_289__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_290(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 290</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 290</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_290(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_290__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_291(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 291</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 291</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_291(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_291__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_292(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 292</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 292</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_292(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_292__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_293(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 293</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 293</em>' operation.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq#isAppropriate_FWD_EMoflonEdge_293(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_293__EMoflonEdge();

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
