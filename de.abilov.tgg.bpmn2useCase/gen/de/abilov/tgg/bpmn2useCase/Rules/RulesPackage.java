/**
 */
package de.abilov.tgg.bpmn2useCase.Rules;

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
 * @see de.abilov.tgg.bpmn2useCase.Rules.RulesFactory
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
	String eNS_URI = "platform:/plugin/de.abilov.tgg.bpmn2useCase/model/Bpmn2useCase.ecore#//Rules";

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
	RulesPackage eINSTANCE = de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.Process2UseCaseImpl <em>Process2 Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.Process2UseCaseImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getProcess2UseCase()
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 788</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_788__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 242</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_242__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 243</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_243__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The number of operations of the '<em>Process2 Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepImpl <em>Task2 Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTask2Step()
	 * @generated
	 */
	int TASK2_STEP = 1;

	/**
	 * The number of structural features of the '<em>Task2 Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task2 Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.SplitImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 2;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterSplitImpl <em>Split After Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterSplitImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getSplitAfterSplit()
	 * @generated
	 */
	int SPLIT_AFTER_SPLIT = 3;

	/**
	 * The number of structural features of the '<em>Split After Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_SEQUENCEFLOW_FLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_PARALLELGATEWAY_USECASE_P2UC_PARALLELSTEP_GW2S_PARALLELFLOW_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 789</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_789__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 790</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_790__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 791</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_791__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 244</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_244__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 245</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_245__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 246</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_246__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 792</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_792__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 793</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_793__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 794</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_794__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 795</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_795__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 796</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_796__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>Split After Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepSeqImpl <em>Task2 Step Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepSeqImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTask2StepSeq()
	 * @generated
	 */
	int TASK2_STEP_SEQ = 4;

	/**
	 * The number of structural features of the '<em>Task2 Step Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_FLOWNODE_FLOW_STEP_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_FLOWNODE_FLOW_STEP_NORMALSTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 247</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_247__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 248</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_248__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 797</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_797__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 798</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_798__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 799</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_799__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 800</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_800__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 801</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_801__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 802</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_802__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Task2 Step Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepFirstImpl <em>Task2 Step First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepFirstImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTask2StepFirst()
	 * @generated
	 */
	int TASK2_STEP_FIRST = 5;

	/**
	 * The number of structural features of the '<em>Task2 Step First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_NORMALSTEP_FLOWNODE_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 249</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_249__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 803</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_803__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 804</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_804__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 805</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_805__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 806</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_806__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 807</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_807__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 808</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_808__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Task2 Step First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.SplitSeqImpl <em>Split Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.SplitSeqImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getSplitSeq()
	 * @generated
	 */
	int SPLIT_SEQ = 6;

	/**
	 * The number of structural features of the '<em>Split Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_FLOW_FLOWNODE_STEP_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_BWD__MATCH_FLOW_STEP_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_STEP_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_STEP_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_FLOW_FLOWNODE_STEP_PARALLELSTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 250</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_250__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 251</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_251__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 809</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_809__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 810</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_810__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 811</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_811__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 812</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_812__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 813</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_813__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 814</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_814__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 815</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_815__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 816</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_816__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Split Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.SplitFirstImpl <em>Split First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.SplitFirstImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getSplitFirst()
	 * @generated
	 */
	int SPLIT_FIRST = 7;

	/**
	 * The number of structural features of the '<em>Split First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_PARALLELSTEP_FLOWNODE_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 252</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_252__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 817</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_817__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 818</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_818__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 819</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_819__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 820</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_820__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 821</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_821__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 822</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_822__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 823</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_823__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 824</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_824__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>Split First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.TerminationFirstImpl <em>Termination First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.TerminationFirstImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTerminationFirst()
	 * @generated
	 */
	int TERMINATION_FIRST = 8;

	/**
	 * The number of structural features of the '<em>Termination First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_BWD__MATCH_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_FLOW_FLOWNODE_PROCESS_UCCONDITION = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 825</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_825__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 826</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_826__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 827</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_827__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 828</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_828__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 253</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_253__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 829</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_829__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 830</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_830__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Termination First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterSplitImpl <em>Task2 Step After Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterSplitImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTask2StepAfterSplit()
	 * @generated
	 */
	int TASK2_STEP_AFTER_SPLIT = 9;

	/**
	 * The number of structural features of the '<em>Task2 Step After Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GW2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_GW2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 831</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_831__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 832</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_832__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 254</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_254__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 833</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_833__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 255</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_255__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 256</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_256__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 834</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_834__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 835</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_835__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 836</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_836__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The number of operations of the '<em>Task2 Step After Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_SPLIT_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.TerminationImpl <em>Termination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.TerminationImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTermination()
	 * @generated
	 */
	int TERMINATION = 10;

	/**
	 * The number of structural features of the '<em>Termination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Termination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.TerminationSeqImpl <em>Termination Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.TerminationSeqImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTerminationSeq()
	 * @generated
	 */
	int TERMINATION_SEQ = 11;

	/**
	 * The number of structural features of the '<em>Termination Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STEP_FLOWNODE_FLOW_FN2S_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_BWD__MATCH_UCCONDITION_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_UCCONDITION_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_UCCONDITION_STEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_UCCONDITION_STEP_FLOWNODE_FLOW_FN2S_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 257</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_257__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 258</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_258__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 837</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_837__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 838</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_838__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 839</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_839__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 840</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_840__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 841</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_841__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 842</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_842__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>Termination Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.LastStepInFlowImpl <em>Last Step In Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.LastStepInFlowImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getLastStepInFlow()
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
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.LastStepInPFlowImpl <em>Last Step In PFlow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.LastStepInPFlowImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getLastStepInPFlow()
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 843</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_843__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 844</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_844__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 845</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_845__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 846</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_846__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 847</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_847__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 259</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_259__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The number of operations of the '<em>Last Step In PFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 14;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterMergeImpl <em>Task2 Step After Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterMergeImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTask2StepAfterMerge()
	 * @generated
	 */
	int TASK2_STEP_AFTER_MERGE = 15;

	/**
	 * The number of structural features of the '<em>Task2 Step After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_NORMALSTEP_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 260</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_260__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 261</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_261__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 848</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_848__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 849</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_849__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 850</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_850__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 851</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_851__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 852</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_852__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 853</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_853__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The number of operations of the '<em>Task2 Step After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_MERGE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceSeqImpl <em>Choice Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceSeqImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getChoiceSeq()
	 * @generated
	 */
	int CHOICE_SEQ = 16;

	/**
	 * The number of structural features of the '<em>Choice Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOWNODE_STEP_FN2S_FLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_BWD__MATCH_STEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOWNODE_STEP_FN2S_FLOW_CHOICESTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 262</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_262__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 263</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_263__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 854</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_854__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 855</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_855__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 856</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_856__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 857</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_857__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 858</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_858__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 859</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_859__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 860</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_860__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 861</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_861__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Choice Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceFirstImpl <em>Choice First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceFirstImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getChoiceFirst()
	 * @generated
	 */
	int CHOICE_FIRST = 17;

	/**
	 * The number of structural features of the '<em>Choice First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOWNODE_FLOW_FN2F_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_BWD__MATCH_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOWNODE_FLOW_FN2F_CHOICESTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 264</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_264__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 862</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_862__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 863</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_863__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 864</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_864__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 865</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_865__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 866</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_866__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 867</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_867__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 868</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_868__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 869</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_869__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>Choice First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterSplitImpl <em>Choice After Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterSplitImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getChoiceAfterSplit()
	 * @generated
	 */
	int CHOICE_AFTER_SPLIT = 18;

	/**
	 * The number of structural features of the '<em>Choice After Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_SEQUENCEFLOW_FLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_PARALLELFLOW_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 870</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_870__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 265</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_265__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 871</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_871__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 872</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_872__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 266</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_266__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 267</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_267__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 873</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_873__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 874</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_874__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 875</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_875__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 876</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_876__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 877</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_877__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>Choice After Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterChoiceDefImpl <em>Task2 Step After Choice Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterChoiceDefImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTask2StepAfterChoiceDef()
	 * @generated
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF = 19;

	/**
	 * The number of structural features of the '<em>Task2 Step After Choice Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 268</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_268__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 878</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_878__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 879</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_879__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 880</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_880__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 269</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_269__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 881</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_881__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 882</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_882__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 883</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_883__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 884</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_884__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The number of operations of the '<em>Task2 Step After Choice Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_DEF_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterChoiceImpl <em>Task2 Step After Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterChoiceImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTask2StepAfterChoice()
	 * @generated
	 */
	int TASK2_STEP_AFTER_CHOICE = 20;

	/**
	 * The number of structural features of the '<em>Task2 Step After Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_NORMALSTEP_ALTERNATIVEFLOW_PROCESS_USECASE_P2UC_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 885</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_885__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 886</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_886__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 270</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_270__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 271</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_271__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 887</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_887__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 272</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_272__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 273</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_273__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 888</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_888__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 889</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_889__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 890</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_890__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Task2 Step After Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_CHOICE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.EmptyDefaulFlowImpl <em>Empty Defaul Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.EmptyDefaulFlowImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getEmptyDefaulFlow()
	 * @generated
	 */
	int EMPTY_DEFAUL_FLOW = 21;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 891</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_891__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 892</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_892__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 893</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_893__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 274</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_274__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 894</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_894__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 895</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_895__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 896</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_896__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The number of operations of the '<em>Empty Defaul Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.LastStepInDefaultFlowImpl <em>Last Step In Default Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.LastStepInDefaultFlowImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getLastStepInDefaultFlow()
	 * @generated
	 */
	int LAST_STEP_IN_DEFAULT_FLOW = 22;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 275</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_275__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 897</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_897__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 898</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_898__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 899</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_899__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 900</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_900__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 901</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_901__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The number of operations of the '<em>Last Step In Default Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterMergeImpl <em>Split After Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterMergeImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getSplitAfterMerge()
	 * @generated
	 */
	int SPLIT_AFTER_MERGE = 23;

	/**
	 * The number of structural features of the '<em>Split After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_PARALLELSTEP_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 276</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_276__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 277</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_277__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 902</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_902__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 903</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_903__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 904</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_904__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 905</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_905__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 906</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_906__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 907</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_907__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 908</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_908__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 909</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_909__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Split After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterMergeImpl <em>Choice After Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterMergeImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getChoiceAfterMerge()
	 * @generated
	 */
	int CHOICE_AFTER_MERGE = 24;

	/**
	 * The number of structural features of the '<em>Choice After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_NORMALSTEP_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 278</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_278__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 279</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_279__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 910</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_910__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 911</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_911__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 912</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_912__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 913</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_913__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 914</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_914__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 915</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_915__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 916</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_916__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 917</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_917__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Choice After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.LastStepInAltFlowImpl <em>Last Step In Alt Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.LastStepInAltFlowImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getLastStepInAltFlow()
	 * @generated
	 */
	int LAST_STEP_IN_ALT_FLOW = 25;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 280</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_280__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 918</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_918__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 919</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_919__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 920</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_920__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 921</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_921__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 922</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_922__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 281</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_281__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The number of operations of the '<em>Last Step In Alt Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterChoiceDefImpl <em>Split After Choice Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterChoiceDefImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getSplitAfterChoiceDef()
	 * @generated
	 */
	int SPLIT_AFTER_CHOICE_DEF = 26;

	/**
	 * The number of structural features of the '<em>Split After Choice Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_FLOW_PROCESS_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_PARALLELSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_PARALLELSTEP_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 923</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_923__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 924</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_924__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 925</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_925__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 282</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_282__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 283</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_283__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 926</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_926__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 927</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_927__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 928</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_928__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 929</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_929__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 930</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_930__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 931</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_931__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The number of operations of the '<em>Split After Choice Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterChoiceImpl <em>Split After Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterChoiceImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getSplitAfterChoice()
	 * @generated
	 */
	int SPLIT_AFTER_CHOICE = 27;

	/**
	 * The number of structural features of the '<em>Split After Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_ALTERNATIVEFLOW_PARALLELSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 284</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_284__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 932</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_932__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 285</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_285__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 933</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_933__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 934</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_934__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 286</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_286__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 287</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_287__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 935</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_935__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 936</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_936__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 937</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_937__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 938</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_938__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 939</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_939__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The number of operations of the '<em>Split After Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterChoiceDefImpl <em>Choice After Choice Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterChoiceDefImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getChoiceAfterChoiceDef()
	 * @generated
	 */
	int CHOICE_AFTER_CHOICE_DEF = 28;

	/**
	 * The number of structural features of the '<em>Choice After Choice Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_FLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_CHOICESTEP_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 940</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_940__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 941</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_941__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 942</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_942__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 288</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_288__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 289</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_289__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 943</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_943__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 944</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_944__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 945</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_945__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 946</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_946__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 947</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_947__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 948</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_948__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 32;

	/**
	 * The number of operations of the '<em>Choice After Choice Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterChoiceImpl <em>Choice After Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterChoiceImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getChoiceAfterChoice()
	 * @generated
	 */
	int CHOICE_AFTER_CHOICE = 29;

	/**
	 * The number of structural features of the '<em>Choice After Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_ALTERNATIVEFLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 290</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_290__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 949</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_949__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 291</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_291__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 292</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_292__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 950</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_950__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 951</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_951__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 293</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_293__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 952</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_952__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 953</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_953__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 954</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_954__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 955</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_955__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 956</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_956__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 33;

	/**
	 * The number of operations of the '<em>Choice After Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 34;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.TerminationAfterMergeImpl <em>Termination After Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.TerminationAfterMergeImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTerminationAfterMerge()
	 * @generated
	 */
	int TERMINATION_AFTER_MERGE = 30;

	/**
	 * The number of structural features of the '<em>Termination After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_FLOW_PROCESS_SEQUENCEFLOW_ENDEVENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_BWD__MATCH_UCCONDITION_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_UCCONDITION_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_UCCONDITION_CHOICESTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_UCCONDITION_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 294</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_294__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 295</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_295__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 957</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_957__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 958</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_958__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 959</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_959__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 960</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_960__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 961</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_961__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 962</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_962__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The number of operations of the '<em>Termination After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterEmptyDefImpl <em>Task2 Step After Empty Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.Task2StepAfterEmptyDefImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getTask2StepAfterEmptyDef()
	 * @generated
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF = 31;

	/**
	 * The number of structural features of the '<em>Task2 Step After Empty Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_GW2S_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_GW2S_NORMALSTEP_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 296</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_296__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 297</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_297__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 963</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_963__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 964</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_964__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 965</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_965__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 966</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_966__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 967</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_967__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 968</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_968__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The number of operations of the '<em>Task2 Step After Empty Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK2_STEP_AFTER_EMPTY_DEF_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterEmptyDefImpl <em>Split After Empty Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.SplitAfterEmptyDefImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getSplitAfterEmptyDef()
	 * @generated
	 */
	int SPLIT_AFTER_EMPTY_DEF = 32;

	/**
	 * The number of structural features of the '<em>Split After Empty Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_FLOW_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_NORMALSTEP_FLOW_EXCLUSIVEGATEWAY_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 298</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_298__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 299</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_299__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 969</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_969__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 970</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_970__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 971</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_971__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 972</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_972__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 973</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_973__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 974</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_974__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 975</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_975__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 976</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_976__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Split After Empty Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterEmptyDefImpl <em>Choice After Empty Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.ChoiceAfterEmptyDefImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getChoiceAfterEmptyDef()
	 * @generated
	 */
	int CHOICE_AFTER_EMPTY_DEF = 33;

	/**
	 * The number of structural features of the '<em>Choice After Empty Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_FLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_NORMALSTEP_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 300</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_300__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 301</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_301__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 977</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_977__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 978</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_978__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 979</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_979__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 980</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_980__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 981</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_981__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 982</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_982__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 983</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_983__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 984</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_984__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Choice After Empty Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase <em>Process2 Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process2 Use Case</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase
	 * @generated
	 */
	EClass getProcess2UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.StartEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.StartEvent)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD__Match_Process_StartEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getProcess2UseCase__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.StartEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.StartEvent)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjectsToMatch_FWD__Match_Process_StartEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.StartEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.StartEvent)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_solveCsp_FWD__Match_Process_StartEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.bpmn.StartEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.bpmn.StartEvent)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_StartEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.BasicFlow, de.abilov.useCase.UCCondition) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.BasicFlow, de.abilov.useCase.UCCondition)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD__Match_UseCase_BasicFlow_UCCondition();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getProcess2UseCase__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.BasicFlow, de.abilov.useCase.UCCondition) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.BasicFlow, de.abilov.useCase.UCCondition)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjectsToMatch_BWD__Match_UseCase_BasicFlow_UCCondition();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.BasicFlow, de.abilov.useCase.UCCondition) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.BasicFlow, de.abilov.useCase.UCCondition)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_solveCsp_BWD__Match_UseCase_BasicFlow_UCCondition();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.UseCase, de.abilov.useCase.BasicFlow, de.abilov.useCase.UCCondition) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.UseCase, de.abilov.useCase.BasicFlow, de.abilov.useCase.UCCondition)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_BasicFlow_UCCondition();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProcess2UseCase__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getProcess2UseCase__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_788(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 788</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 788</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_788(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_788__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_242(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 242</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 242</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_242(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_242__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_243(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 243</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 243</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_243(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_243__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getProcess2UseCase__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getProcess2UseCase__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2Step <em>Task2 Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Step</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2Step
	 * @generated
	 */
	EClass getTask2Step();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit <em>Split After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split After Split</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit
	 * @generated
	 */
	EClass getSplitAfterSplit();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterSplit__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterSplit__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.ParallelStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Flow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.ParallelStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Flow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_SequenceFlow_Flow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterSplit__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterSplit__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterSplit__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterSplit__RegisterObjectsToMatch_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_solveCsp_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.ParallelStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.ParallelStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_ParallelFlow_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterSplit__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterSplit__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_789(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 789</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 789</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_789(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_789__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_790(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 790</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 790</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_790(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_790__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_791(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 791</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 791</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_791(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_791__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_244(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 244</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 244</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_244(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_BWD_EMoflonEdge_244__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_245(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 245</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 245</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_245(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_BWD_EMoflonEdge_245__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_246(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 246</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 246</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_246(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_BWD_EMoflonEdge_246__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_792(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 792</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 792</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_792(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_792__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_793(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 793</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 793</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_793(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_793__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_794(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 794</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 794</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_794(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_794__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_795(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 795</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 795</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_795(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_795__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_796(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 796</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 796</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_796(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_796__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterSplit__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterSplit__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq <em>Task2 Step Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Step Seq</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq
	 * @generated
	 */
	EClass getTask2StepSeq();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2StepSeq__RegisterObjectsToMatch_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_solveCsp_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_NormalStep_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_BWD_EMoflonEdge_247(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 247</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 247</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_BWD_EMoflonEdge_247(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_BWD_EMoflonEdge_247__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_BWD_EMoflonEdge_248(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 248</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 248</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_BWD_EMoflonEdge_248(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_BWD_EMoflonEdge_248__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_797(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 797</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 797</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_797(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_797__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_798(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 798</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 798</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_798(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_798__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_799(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 799</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 799</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_799(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_799__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_800(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 800</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 800</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_800(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_800__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_801(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 801</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 801</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_801(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_801__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_802(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 802</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 802</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#isAppropriate_FWD_EMoflonEdge_802(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_802__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst <em>Task2 Step First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Step First</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst
	 * @generated
	 */
	EClass getTask2StepFirst();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_BWD__Match_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepFirst__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.NormalStep, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.NormalStep, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_NormalStep_FlowNode_Flow_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_BWD_EMoflonEdge_249(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 249</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 249</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_BWD_EMoflonEdge_249(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_BWD_EMoflonEdge_249__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_803(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 803</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 803</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_803(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_803__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_804(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 804</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 804</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_804(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_804__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_805(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 805</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 805</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_805(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_805__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_806(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 806</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 806</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_806(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_806__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_807(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 807</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 807</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_807(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_807__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_808(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 808</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 808</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#isAppropriate_FWD_EMoflonEdge_808(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_808__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepFirst__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq <em>Split Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Seq</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq
	 * @generated
	 */
	EClass getSplitSeq();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.ParallelStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_BWD__Match_Flow_Step_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.ParallelStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitSeq__RegisterObjectsToMatch_BWD__Match_Flow_Step_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.ParallelStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_solveCsp_BWD__Match_Flow_Step_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.useCase.ParallelStep, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.useCase.ParallelStep, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getSplitSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_ParallelStep_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD_EMoflonEdge_250(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 250</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 250</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD_EMoflonEdge_250(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_BWD_EMoflonEdge_250__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD_EMoflonEdge_251(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 251</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 251</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD_EMoflonEdge_251(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_BWD_EMoflonEdge_251__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_809(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 809</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 809</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_809(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_809__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_810(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 810</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 810</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_810(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_810__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_811(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 811</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 811</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_811(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_811__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_812(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 812</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 812</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_812(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_812__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_813(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 813</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 813</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_813(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_813__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_814(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 814</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 814</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_814(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_814__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_815(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 815</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 815</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_815(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_815__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_816(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 816</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 816</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_816(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_816__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst <em>Split First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split First</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst
	 * @generated
	 */
	EClass getSplitFirst();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_BWD__Match_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitFirst__RegisterObjectsToMatch_BWD__Match_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_solveCsp_BWD__Match_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.ParallelStep, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.ParallelStep, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getSplitFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_ParallelStep_FlowNode_Flow_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_BWD_EMoflonEdge_252(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 252</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 252</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_BWD_EMoflonEdge_252(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_BWD_EMoflonEdge_252__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_817(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 817</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 817</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_817(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_817__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_818(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 818</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 818</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_818(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_818__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_819(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 819</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 819</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_819(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_819__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_820(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 820</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 820</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_820(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_820__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_821(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 821</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 821</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_821(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_821__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_822(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 822</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 822</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_822(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_822__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_823(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 823</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 823</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_823(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_823__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_824(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 824</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 824</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_824(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_824__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitFirst__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst <em>Termination First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination First</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst
	 * @generated
	 */
	EClass getTerminationFirst();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTerminationFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.Flow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.Flow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTerminationFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.UCCondition) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.UCCondition)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_BWD__Match_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTerminationFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.UCCondition) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.UCCondition)
	 * @generated
	 */
	EOperation getTerminationFirst__RegisterObjectsToMatch_BWD__Match_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.UCCondition) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.UCCondition)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_solveCsp_BWD__Match_Flow_UCCondition();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.Flow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.useCase.UCCondition) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.Flow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.useCase.UCCondition)
	 * @generated
	 */
	EOperation getTerminationFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_UCCondition();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTerminationFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_825(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 825</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 825</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_825(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_825__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_826(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 826</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 826</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_826(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_826__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_827(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 827</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 827</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_827(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_827__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_828(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 828</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 828</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_828(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_828__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_BWD_EMoflonEdge_253(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 253</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 253</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_BWD_EMoflonEdge_253(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_BWD_EMoflonEdge_253__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_829(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 829</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 829</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_829(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_829__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_830(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 830</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 830</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_830(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_830__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTerminationFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTerminationFirst__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit <em>Task2 Step After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Step After Split</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit
	 * @generated
	 */
	EClass getTask2StepAfterSplit();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_FWD__Match_ParallelGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__RegisterObjectsToMatch_FWD__Match_ParallelGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsApplicable_solveCsp_FWD__IsApplicableMatch_GW2S_ParallelGateway_ParallelStep_SequenceFlow_Process_UseCase_P2UC_Flow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__RegisterObjectsToMatch_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_solveCsp_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.NormalStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.NormalStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_GW2S_ParallelGateway_ParallelStep_Process_UseCase_P2UC_ParallelFlow_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_831(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 831</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 831</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_831(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_831__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_832(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 832</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 832</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_832(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_832__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_BWD_EMoflonEdge_254(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 254</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 254</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_BWD_EMoflonEdge_254(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_BWD_EMoflonEdge_254__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_833(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 833</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 833</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_833(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_833__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_BWD_EMoflonEdge_255(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 255</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 255</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_BWD_EMoflonEdge_255(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_BWD_EMoflonEdge_255__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_BWD_EMoflonEdge_256(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 256</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 256</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_BWD_EMoflonEdge_256(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_BWD_EMoflonEdge_256__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_834(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 834</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 834</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_834(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_834__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_835(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 835</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 835</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_835(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_835__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_836(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 836</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 836</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#isAppropriate_FWD_EMoflonEdge_836(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_836__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterSplit#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterSplit__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Termination <em>Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Termination
	 * @generated
	 */
	EClass getTermination();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq <em>Termination Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Seq</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq
	 * @generated
	 */
	EClass getTerminationSeq();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTerminationSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.Step, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.Step, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTerminationSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.Step, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.Step, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_BWD__Match_UCCondition_Step_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTerminationSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.Step, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.Step, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTerminationSeq__RegisterObjectsToMatch_BWD__Match_UCCondition_Step_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.Step, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.Step, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_solveCsp_BWD__Match_UCCondition_Step_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.UCCondition, de.abilov.useCase.Step, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.UCCondition, de.abilov.useCase.Step, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getTerminationSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_UCCondition_Step_FlowNode_Flow_FN2S_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTerminationSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD_EMoflonEdge_257(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 257</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 257</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD_EMoflonEdge_257(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_BWD_EMoflonEdge_257__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD_EMoflonEdge_258(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 258</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 258</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD_EMoflonEdge_258(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_BWD_EMoflonEdge_258__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_837(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 837</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 837</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_837(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_837__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_838(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 838</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 838</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_838(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_838__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_839(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 839</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 839</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_839(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_839__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_840(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 840</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 840</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_840(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_840__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_841(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 841</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 841</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_841(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_841__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_842(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 842</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 842</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_842(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_842__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTerminationSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTerminationSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInFlow <em>Last Step In Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Step In Flow</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInFlow
	 * @generated
	 */
	EClass getLastStepInFlow();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow <em>Last Step In PFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Step In PFlow</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow
	 * @generated
	 */
	EClass getLastStepInPFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInPFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_UseCase_P2UC();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_BWD__Match_ParallelStep_ParallelFlow_Step_UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInPFlow__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjectsToMatch_BWD__Match_ParallelStep_ParallelFlow_Step_UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_solveCsp_BWD__Match_ParallelStep_ParallelFlow_Step_UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_UseCase_P2UC();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInPFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInPFlow__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_843(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 843</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 843</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_843(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_843__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_844(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 844</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 844</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_844(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_844__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_845(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 845</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 845</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_845(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_845__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_846(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 846</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 846</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_846(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_846__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_847(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 847</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 847</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_847(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_847__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_259(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 259</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 259</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_259(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_BWD_EMoflonEdge_259__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInPFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInPFlow__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge <em>Task2 Step After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Step After Merge</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge
	 * @generated
	 */
	EClass getTask2StepAfterMerge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_SequenceFlow_FlowNode_FN2S_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_NormalStep_SequenceFlow_FlowNode_FN2S_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_BWD_EMoflonEdge_260(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 260</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 260</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_BWD_EMoflonEdge_260(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_BWD_EMoflonEdge_260__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_BWD_EMoflonEdge_261(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 261</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 261</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_BWD_EMoflonEdge_261(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_BWD_EMoflonEdge_261__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_848(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 848</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 848</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_848(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_848__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_849(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 849</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 849</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_849(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_849__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_850(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 850</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 850</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_850(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_850__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_851(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 851</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 851</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_851(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_851__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_852(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 852</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 852</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_852(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_852__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_853(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 853</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 853</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#isAppropriate_FWD_EMoflonEdge_853(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_853__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterMerge__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq <em>Choice Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Seq</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq
	 * @generated
	 */
	EClass getChoiceSeq();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceSeq__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceSeq__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceSeq__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceSeq__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_BWD__Match_Step_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceSeq__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceSeq__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceSeq__RegisterObjectsToMatch_BWD__Match_Step_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_solveCsp_BWD__Match_Step_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getChoiceSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_ChoiceStep_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceSeq__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceSeq__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD_EMoflonEdge_262(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 262</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 262</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD_EMoflonEdge_262(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_BWD_EMoflonEdge_262__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD_EMoflonEdge_263(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 263</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 263</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD_EMoflonEdge_263(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_BWD_EMoflonEdge_263__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_854(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 854</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 854</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_854(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_854__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_855(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 855</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 855</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_855(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_855__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_856(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 856</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 856</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_856(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_856__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_857(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 857</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 857</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_857(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_857__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_858(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 858</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 858</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_858(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_858__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_859(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 859</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 859</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_859(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_859__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_860(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 860</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 860</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_860(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_860__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_861(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 861</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 861</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_861(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_861__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceSeq__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceSeq__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst <em>Choice First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice First</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst
	 * @generated
	 */
	EClass getChoiceFirst();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FlowNode_Flow_FN2F_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_BWD__Match_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceFirst__RegisterObjectsToMatch_BWD__Match_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_solveCsp_BWD__Match_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getChoiceFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FlowNode_Flow_FN2F_ChoiceStep_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_BWD_EMoflonEdge_264(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 264</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 264</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_BWD_EMoflonEdge_264(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_BWD_EMoflonEdge_264__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_862(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 862</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 862</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_862(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_862__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_863(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 863</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 863</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_863(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_863__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_864(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 864</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 864</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_864(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_864__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_865(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 865</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 865</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_865(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_865__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_866(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 866</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 866</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_866(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_866__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_867(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 867</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 867</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_867(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_867__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_868(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 868</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 868</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_868(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_868__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_869(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 869</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 869</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_869(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_869__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceFirst__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit <em>Choice After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice After Split</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit
	 * @generated
	 */
	EClass getChoiceAfterSplit();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_SequenceFlow_Flow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__RegisterObjectsToMatch_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelStep, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_solveCsp_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.ParallelFlow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_ParallelFlow_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_870(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 870</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 870</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_870(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_870__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_265(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 265</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 265</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_265(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_BWD_EMoflonEdge_265__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_871(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 871</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 871</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_871(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_871__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_872(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 872</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 872</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_872(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_872__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_266(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 266</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 266</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_266(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_BWD_EMoflonEdge_266__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_267(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 267</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 267</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_267(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_BWD_EMoflonEdge_267__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_873(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 873</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 873</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_873(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_873__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_874(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 874</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 874</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_874(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_874__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_875(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 875</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 875</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_875(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_875__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_876(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 876</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 876</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_876(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_876__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_877(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 877</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 877</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_877(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_877__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef <em>Task2 Step After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Step After Choice Def</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef
	 * @generated
	 */
	EClass getTask2StepAfterChoiceDef();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_Flow_ExclusiveGateway_ChoiceStep_GW2S_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_268(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 268</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 268</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_268(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_268__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_878(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 878</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 878</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_878(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_878__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_879(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 879</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 879</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_879(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_879__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_880(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 880</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 880</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_880(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_880__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_269(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 269</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 269</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_269(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_269__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_881(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 881</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 881</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_881(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_881__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_882(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 882</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 882</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_882(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_882__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_883(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 883</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 883</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_883(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_883__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_884(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 884</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 884</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_884(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_884__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoiceDef#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterChoiceDef__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice <em>Task2 Step After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Step After Choice</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice
	 * @generated
	 */
	EClass getTask2StepAfterChoice();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_UseCase_P2UC_Flow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__RegisterObjectsToMatch_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_NormalStep_AlternativeFlow_Process_UseCase_P2UC_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_885(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 885</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 885</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_885(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_885__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_886(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 886</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 886</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_886(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_886__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD_EMoflonEdge_270(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 270</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 270</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD_EMoflonEdge_270(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_BWD_EMoflonEdge_270__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD_EMoflonEdge_271(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 271</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 271</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD_EMoflonEdge_271(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_BWD_EMoflonEdge_271__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_887(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 887</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 887</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_887(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_887__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD_EMoflonEdge_272(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 272</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 272</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD_EMoflonEdge_272(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_BWD_EMoflonEdge_272__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD_EMoflonEdge_273(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 273</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 273</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_BWD_EMoflonEdge_273(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_BWD_EMoflonEdge_273__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_888(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 888</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 888</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_888(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_888__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_889(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 889</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 889</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_889(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_889__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_890(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 890</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 890</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#isAppropriate_FWD_EMoflonEdge_890(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_890__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterChoice__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow <em>Empty Defaul Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Defaul Flow</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow
	 * @generated
	 */
	EClass getEmptyDefaulFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD__Match_ExclusiveGateway_Process_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_Process_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_Process_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_Process_UseCase_P2UC_Flow_GW2S_ExclusiveGateway_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.UseCase, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.UseCase, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_BWD__Match_ChoiceStep_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.UseCase, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.UseCase, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__RegisterObjectsToMatch_BWD__Match_ChoiceStep_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.UseCase, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.UseCase, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_UseCase_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ExclusiveGateway) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_Process_UseCase_P2UC_Flow_GW2S_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_891(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 891</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 891</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_891(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_891__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_892(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 892</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 892</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_892(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_892__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_893(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 893</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 893</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_893(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_893__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_BWD_EMoflonEdge_274(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 274</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 274</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_BWD_EMoflonEdge_274(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_BWD_EMoflonEdge_274__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_894(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 894</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 894</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_894(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_894__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_895(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 895</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 895</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_895(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_895__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_896(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 896</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 896</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_896(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_896__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow <em>Last Step In Default Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Step In Default Flow</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow
	 * @generated
	 */
	EClass getLastStepInDefaultFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_SequenceFlow_FN2S_GW2S_UseCase_P2UC();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.UseCase) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.UseCase) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.UseCase) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_FN2S_GW2S_UseCase_P2UC();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD_EMoflonEdge_275(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 275</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 275</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD_EMoflonEdge_275(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_BWD_EMoflonEdge_275__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_897(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 897</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 897</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_897(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_897__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_898(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 898</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 898</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_898(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_898__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_899(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 899</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 899</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_899(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_899__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_900(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 900</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 900</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_900(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_900__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_901(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 901</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 901</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_901(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_901__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge <em>Split After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split After Merge</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge
	 * @generated
	 */
	EClass getSplitAfterMerge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterMerge__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterMerge__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_SequenceFlow_FlowNode_FN2S_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterMerge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterMerge__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ParallelStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterMerge__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ParallelStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitAfterMerge__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ParallelStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ParallelStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.ParallelStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_ParallelStep_SequenceFlow_FlowNode_FN2S_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterMerge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterMerge__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD_EMoflonEdge_276(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 276</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 276</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD_EMoflonEdge_276(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_BWD_EMoflonEdge_276__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD_EMoflonEdge_277(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 277</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 277</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD_EMoflonEdge_277(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_BWD_EMoflonEdge_277__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_902(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 902</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 902</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_902(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_902__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_903(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 903</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 903</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_903(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_903__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_904(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 904</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 904</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_904(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_904__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_905(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 905</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 905</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_905(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_905__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_906(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 906</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 906</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_906(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_906__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_907(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 907</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 907</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_907(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_907__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_908(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 908</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 908</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_908(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_908__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_909(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 909</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 909</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_909(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_909__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterMerge__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterMerge__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge <em>Choice After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice After Merge</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge
	 * @generated
	 */
	EClass getChoiceAfterMerge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_SequenceFlow_FlowNode_FN2S_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_NormalStep_SequenceFlow_FlowNode_FN2S_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD_EMoflonEdge_278(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 278</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 278</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD_EMoflonEdge_278(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_BWD_EMoflonEdge_278__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD_EMoflonEdge_279(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 279</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 279</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD_EMoflonEdge_279(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_BWD_EMoflonEdge_279__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_910(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 910</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 910</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_910(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_910__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_911(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 911</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 911</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_911(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_911__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_912(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 912</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 912</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_912(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_912__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_913(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 913</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 913</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_913(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_913__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_914(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 914</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 914</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_914(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_914__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_915(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 915</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 915</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_915(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_915__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_916(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 916</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 916</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_916(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_916__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_917(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 917</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 917</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_917(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_917__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow <em>Last Step In Alt Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Step In Alt Flow</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow
	 * @generated
	 */
	EClass getLastStepInAltFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_UseCase_P2UC();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step_UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjectsToMatch_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step_UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.Step, de.abilov.useCase.UseCase)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_solveCsp_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step_UseCase();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.StepAlternative, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Gateway, de.abilov.bpmn.Gateway, de.abilov.bpmn.FlowNode, de.abilov.useCase.Step, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_UseCase_P2UC();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_280(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 280</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 280</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_280(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_280__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_918(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 918</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 918</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_918(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_918__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_919(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 919</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 919</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_919(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_919__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_920(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 920</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 920</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_920(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_920__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_921(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 921</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 921</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_921(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_921__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_922(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 922</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 922</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_922(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_922__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_281(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 281</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 281</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_281(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_281__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef <em>Split After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split After Choice Def</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef
	 * @generated
	 */
	EClass getSplitAfterChoiceDef();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Flow_Process_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_BWD__Match_ChoiceStep_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__RegisterObjectsToMatch_BWD__Match_ChoiceStep_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_ParallelStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.ParallelStep, de.abilov.useCase.Flow, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_ParallelStep_Flow_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_923(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 923</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 923</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_923(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_923__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_924(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 924</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 924</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_924(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_924__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_925(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 925</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 925</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_925(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_925__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_282(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 282</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 282</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_282(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_282__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_283(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 283</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 283</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_283(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_283__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_926(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 926</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 926</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_926(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_926__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_927(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 927</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 927</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_927(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_927__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_928(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 928</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 928</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_928(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_928__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_929(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 929</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 929</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_929(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_929__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_930(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 930</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 930</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_930(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_930__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_931(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 931</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 931</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_931(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_931__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice <em>Split After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split After Choice</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice
	 * @generated
	 */
	EClass getSplitAfterChoice();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterChoice__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterChoice__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterChoice__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterChoice__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ParallelStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterChoice__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ParallelStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitAfterChoice__RegisterObjectsToMatch_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ParallelStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_solveCsp_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.StepAlternative, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ParallelStep) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.StepAlternative, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ParallelStep)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_AlternativeFlow_ParallelStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterChoice__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterChoice__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_284(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 284</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 284</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_284(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_284__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_932(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 932</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 932</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_932(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_932__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_285(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 285</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 285</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_285(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_285__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_933(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 933</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 933</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_933(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_933__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_934(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 934</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 934</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_934(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_934__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_286(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 286</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 286</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_286(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_286__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_287(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 287</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 287</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_287(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_287__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_935(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 935</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 935</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_935(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_935__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_936(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 936</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 936</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_936(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_936__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_937(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 937</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 937</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_937(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_937__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_938(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 938</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 938</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_938(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_938__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_939(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 939</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 939</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_939(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_939__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterChoice__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterChoice__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef <em>Choice After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice After Choice Def</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef
	 * @generated
	 */
	EClass getChoiceAfterChoiceDef();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Flow_Process_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_BWD__Match_ChoiceStep_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__RegisterObjectsToMatch_BWD__Match_ChoiceStep_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_ChoiceStep_Flow_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_940(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 940</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 940</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_940(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_940__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_941(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 941</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 941</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_941(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_941__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_942(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 942</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 942</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_942(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_942__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_288(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 288</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 288</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_288(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_288__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_289(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 289</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 289</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_289(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_289__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_943(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 943</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 943</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_943(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_943__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_944(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 944</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 944</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_944(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_944__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_945(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 945</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 945</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_945(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_945__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_946(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 946</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 946</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_946(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_946__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_947(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 947</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 947</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_947(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_947__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_948(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 948</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 948</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_948(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_948__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice <em>Choice After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice After Choice</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice
	 * @generated
	 */
	EClass getChoiceAfterChoice();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Process, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__RegisterObjectsToMatch_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.StepAlternative, de.abilov.useCase.UseCase, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_solveCsp_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.StepAlternative, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ChoiceStep) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.StepAlternative, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_AlternativeFlow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_290(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 290</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 290</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_290(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_290__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_949(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 949</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 949</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_949(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_949__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_291(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 291</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 291</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_291(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_291__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_292(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 292</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 292</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_292(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_292__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_950(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 950</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 950</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_950(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_950__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_951(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 951</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 951</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_951(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_951__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_293(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 293</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 293</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_293(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_293__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_952(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 952</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 952</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_952(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_952__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_953(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 953</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 953</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_953(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_953__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_954(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 954</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 954</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_954(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_954__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_955(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 955</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 955</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_955(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_955__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_956(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 956</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 956</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_956(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_956__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge <em>Termination After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination After Merge</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge
	 * @generated
	 */
	EClass getTerminationAfterMerge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD__Match_ExclusiveGateway_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.EndEvent)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process_SequenceFlow_EndEvent();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_BWD__Match_UCCondition_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__RegisterObjectsToMatch_BWD__Match_UCCondition_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.UCCondition, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_solveCsp_BWD__Match_UCCondition_ChoiceStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.UCCondition, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.UCCondition, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsApplicable_solveCsp_BWD__IsApplicableMatch_UCCondition_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD_EMoflonEdge_294(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 294</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 294</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD_EMoflonEdge_294(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_BWD_EMoflonEdge_294__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD_EMoflonEdge_295(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 295</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 295</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD_EMoflonEdge_295(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_BWD_EMoflonEdge_295__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_957(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 957</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 957</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_957(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_957__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_958(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 958</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 958</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_958(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_958__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_959(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 959</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 959</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_959(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_959__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_960(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 960</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 960</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_960(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_960__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_961(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 961</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 961</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_961(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_961__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_962(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 962</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 962</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_962(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_962__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef <em>Task2 Step After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task2 Step After Empty Def</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef
	 * @generated
	 */
	EClass getTask2StepAfterEmptyDef();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_GW2S_Flow_ChoiceStep_ExclusiveGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_GW2S_NormalStep_Flow_ChoiceStep_ExclusiveGateway_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_296(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 296</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 296</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_296(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_296__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_297(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 297</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 297</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_297(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_297__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_963(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 963</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 963</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_963(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_963__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_964(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 964</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 964</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_964(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_964__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_965(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 965</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 965</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_965(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_965__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_966(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 966</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 966</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_966(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_966__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_967(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 967</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 967</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_967(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_967__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_968(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 968</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 968</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_968(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_968__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getTask2StepAfterEmptyDef__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef <em>Split After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split After Empty Def</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef
	 * @generated
	 */
	EClass getSplitAfterEmptyDef();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.ParallelGateway)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_ChoiceStep_GW2S_Flow_ExclusiveGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_BWD__Match_ChoiceStep_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__RegisterObjectsToMatch_BWD__Match_ChoiceStep_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_ChoiceStep_GW2S_NormalStep_Flow_ExclusiveGateway_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_298(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 298</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 298</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_298(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_298__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_299(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 299</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 299</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_299(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_299__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_969(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 969</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 969</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_969(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_969__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_970(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 970</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 970</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_970(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_970__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_971(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 971</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 971</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_971(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_971__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_972(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 972</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 972</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_972(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_972__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_973(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 973</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 973</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_973(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_973__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_974(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 974</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 974</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_974(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_974__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_975(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 975</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 975</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_975(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_975__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_976(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 976</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 976</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_976(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_976__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef <em>Choice After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice After Empty Def</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef
	 * @generated
	 */
	EClass getChoiceAfterEmptyDef();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_BWD__Match_ChoiceStep_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__RegisterObjectsToMatch_BWD__Match_ChoiceStep_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_ExclusiveGateway_ChoiceStep_GW2S_NormalStep_Flow_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_300(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 300</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 300</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_300(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_300__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_301(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 301</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 301</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_301(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_301__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_977(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 977</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 977</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_977(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_977__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_978(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 978</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 978</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_978(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_978__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_979(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 979</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 979</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_979(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_979__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_980(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 980</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 980</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_980(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_980__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_981(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 981</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 981</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_981(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_981__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_982(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 982</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 982</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_982(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_982__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_983(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 983</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 983</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_983(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_983__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_984(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 984</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 984</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_984(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_984__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
