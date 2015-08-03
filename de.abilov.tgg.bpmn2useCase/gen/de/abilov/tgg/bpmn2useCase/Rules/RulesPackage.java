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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 406</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_406__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 124</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_124__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 125</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_125__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 407</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_407__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 408</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_408__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 409</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_409__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 126</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_126__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 127</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_127__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 128</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_128__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 410</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_410__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 411</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_411__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 412</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_412__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 413</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_413__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 414</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_414__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.T2SSeqImpl <em>T2S Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.T2SSeqImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getT2SSeq()
	 * @generated
	 */
	int T2S_SEQ = 4;

	/**
	 * The number of structural features of the '<em>T2S Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_SEQ_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>T2S Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_SEQ_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.T2SFirstImpl <em>T2S First</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.T2SFirstImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getT2SFirst()
	 * @generated
	 */
	int T2S_FIRST = 5;

	/**
	 * The number of structural features of the '<em>T2S First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_NORMALSTEP_FLOWNODE_FLOW_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 129</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_129__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 415</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_415__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 416</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_416__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 417</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_417__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 418</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_418__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 419</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_419__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 420</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_420__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>T2S First</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_FIRST_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 130</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_130__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 131</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_131__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 421</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_421__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 422</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_422__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 423</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_423__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 424</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_424__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 425</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_425__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 426</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_426__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 427</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_427__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 428</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_428__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 132</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_132__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 429</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_429__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 430</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_430__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 431</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_431__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 432</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_432__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 433</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_433__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 434</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_434__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 435</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_435__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 436</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_436__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 437</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_437__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 438</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_438__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 439</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_439__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 440</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_440__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 133</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_133__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 441</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_441__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 442</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_442__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterSplitImpl <em>T2S After Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterSplitImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getT2SAfterSplit()
	 * @generated
	 */
	int T2S_AFTER_SPLIT = 9;

	/**
	 * The number of structural features of the '<em>T2S After Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GW2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_GW2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_PARALLELFLOW_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 443</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_443__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 444</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_444__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 134</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_134__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 445</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_445__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 135</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_135__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 136</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_136__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 446</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_446__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 447</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_447__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 448</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_448__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>T2S After Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SPLIT_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 137</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_137__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 138</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_138__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 449</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_449__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 450</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_450__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 451</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_451__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 452</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_452__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 453</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_453__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 454</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_454__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 455</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_455__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 456</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_456__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 457</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_457__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 458</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_458__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 459</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_459__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 139</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_139__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterMergeImpl <em>T2S After Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterMergeImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getT2SAfterMerge()
	 * @generated
	 */
	int T2S_AFTER_MERGE = 15;

	/**
	 * The number of structural features of the '<em>T2S After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_NORMALSTEP_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 140</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_140__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 141</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_141__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 460</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_460__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 461</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_461__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 462</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_462__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 463</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_463__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 464</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_464__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 465</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_465__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>T2S After Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_MERGE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 142</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_142__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 143</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_143__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 466</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_466__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 467</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_467__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 468</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_468__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 469</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_469__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 470</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_470__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 471</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_471__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 472</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_472__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 473</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_473__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 144</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_144__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 474</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_474__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 475</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_475__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 476</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_476__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 477</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_477__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 478</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_478__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 479</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_479__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 480</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_480__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 481</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_481__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 482</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_482__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 145</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_145__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 483</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_483__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 484</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_484__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 146</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_146__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 147</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_147__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 485</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_485__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 486</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_486__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 487</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_487__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 488</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_488__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 489</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_489__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterChoiceDefImpl <em>T2S After Choice Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterChoiceDefImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getT2SAfterChoiceDef()
	 * @generated
	 */
	int T2S_AFTER_CHOICE_DEF = 19;

	/**
	 * The number of structural features of the '<em>T2S After Choice Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 148</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_148__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 490</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_490__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 491</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_491__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 492</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_492__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 149</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_149__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 493</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_493__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 494</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_494__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 495</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_495__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 496</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_496__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The number of operations of the '<em>T2S After Choice Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_DEF_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterChoiceImpl <em>T2S After Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterChoiceImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getT2SAfterChoice()
	 * @generated
	 */
	int T2S_AFTER_CHOICE = 20;

	/**
	 * The number of structural features of the '<em>T2S After Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_NORMALSTEP_ALTERNATIVEFLOW_PROCESS_USECASE_P2UC_STEPALTERNATIVE_FLOW = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 497</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_497__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 498</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_498__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 150</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_150__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 151</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_151__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 499</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_499__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 152</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_152__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 153</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_153__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 500</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_500__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 501</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_501__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 502</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_502__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>T2S After Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_CHOICE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 503</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_503__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 504</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_504__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 505</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_505__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 154</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_154__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 506</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_506__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 507</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_507__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 508</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_508__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 155</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_155__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 509</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_509__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 510</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_510__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 511</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_511__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 512</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_512__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 513</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_DEFAULT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_513__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 156</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_156__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 157</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_157__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 514</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_514__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 515</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_515__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 516</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_516__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 517</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_517__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 518</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_518__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 519</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_519__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 520</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_520__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 521</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_521__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 158</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_158__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 159</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_159__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 522</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_522__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 523</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_523__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 524</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_524__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 525</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_525__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 526</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_526__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 527</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_527__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 528</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_528__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 529</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_529__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 160</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_160__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 530</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_530__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 531</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_531__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 532</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_532__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 533</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_533__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 534</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_534__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 161</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_161__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 535</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_535__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 536</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_536__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 537</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_537__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 162</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_162__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 163</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_163__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 538</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_538__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 539</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_539__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 540</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_540__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 541</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_541__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 542</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_542__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 543</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_543__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 164</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_164__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 544</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_544__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 165</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_165__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 545</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_545__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 546</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_546__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 166</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_166__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 167</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_167__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 547</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_547__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 548</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_548__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 549</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_549__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 550</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_550__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 551</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_551__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 552</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_552__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 553</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_553__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 554</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_554__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 168</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_168__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 169</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_169__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 555</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_555__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 556</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_556__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 557</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_557__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 558</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_558__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 559</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_559__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 560</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_560__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 170</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_170__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 561</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_561__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 171</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_171__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 172</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_172__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 562</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_562__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 563</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_563__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 173</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_173__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 564</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_564__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 565</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_565__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 566</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_566__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 567</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_567__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 568</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_568__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 174</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_174__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 175</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_175__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 569</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_569__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 570</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_570__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 571</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_571__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 572</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_572__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 573</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_573__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 574</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_574__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterEmptyDefImpl <em>T2S After Empty Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterEmptyDefImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getT2SAfterEmptyDef()
	 * @generated
	 */
	int T2S_AFTER_EMPTY_DEF = 31;

	/**
	 * The number of structural features of the '<em>T2S After Empty Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_GW2S_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_GW2S_NORMALSTEP_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 176</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_176__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 177</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_177__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 575</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_575__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 576</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_576__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 577</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_577__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 578</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_578__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 579</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_579__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 580</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_580__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>T2S After Empty Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_EMPTY_DEF_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 178</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_178__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 179</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_179__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 581</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_581__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 582</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_582__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 583</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_583__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 584</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_584__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 585</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_585__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 586</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_586__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 587</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_587__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 588</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_588__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 180</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_180__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 181</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_181__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 589</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_589__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 590</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_590__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 591</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_591__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 592</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_592__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 593</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_593__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 594</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_594__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 595</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_595__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 596</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_596__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterTaskImpl <em>T2S After Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterTaskImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getT2SAfterTask()
	 * @generated
	 */
	int T2S_AFTER_TASK = 34;

	/**
	 * The number of structural features of the '<em>T2S After Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TASK_FN2S_FLOW_STEP_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TASK_FN2S_FLOW_STEP_NORMALSTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 182</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_182__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 183</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_183__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 597</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_597__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 598</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_598__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 599</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_599__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 600</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_600__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 601</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_601__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 602</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_602__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>T2S After Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_TASK_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

	/**
	 * The meta object id for the '{@link de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterSyncImpl <em>T2S After Sync</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.T2SAfterSyncImpl
	 * @see de.abilov.tgg.bpmn2useCase.Rules.impl.RulesPackageImpl#getT2SAfterSync()
	 * @generated
	 */
	int T2S_AFTER_SYNC = 35;

	/**
	 * The number of structural features of the '<em>T2S After Sync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_FN2S_FLOW_STEP_PROCESS_SEQUENCEFLOW_TASK = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_STEP_NORMALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELGATEWAY_FN2S_FLOW_STEP_NORMALSTEP_PROCESS = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 184</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_184__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 185</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_BWD_EMOFLON_EDGE_185__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 603</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_603__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 604</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_604__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 605</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_605__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 606</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_606__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 607</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_607__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 608</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___IS_APPROPRIATE_FWD_EMOFLON_EDGE_608__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The number of operations of the '<em>T2S After Sync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int T2S_AFTER_SYNC_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 30;

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_406(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 406</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 406</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_FWD_EMoflonEdge_406(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_406__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 124</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 124</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_124(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_124__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 125</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 125</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase#isAppropriate_BWD_EMoflonEdge_125(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_125__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_407(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 407</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 407</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_407(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_407__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_408(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 408</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 408</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_408(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_408__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_409(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 409</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 409</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_409(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_409__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 126</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 126</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_126(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_BWD_EMoflonEdge_126__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 127</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 127</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_127(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_BWD_EMoflonEdge_127__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 128</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 128</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_BWD_EMoflonEdge_128(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_BWD_EMoflonEdge_128__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_410(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 410</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 410</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_410(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_410__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_411(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 411</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 411</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_411(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_411__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_412(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 412</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 412</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_412(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_412__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_413(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 413</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 413</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_413(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_413__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_414(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 414</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 414</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit#isAppropriate_FWD_EMoflonEdge_414(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_414__EMoflonEdge();

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
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SSeq <em>T2S Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2S Seq</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SSeq
	 * @generated
	 */
	EClass getT2SSeq();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst <em>T2S First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2S First</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst
	 * @generated
	 */
	EClass getT2SFirst();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SFirst__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SFirst__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SFirst__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SFirst__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_BWD__Match_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SFirst__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SFirst__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SFirst__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.NormalStep, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.FN2F, de.abilov.useCase.NormalStep, de.abilov.bpmn.FlowNode, de.abilov.useCase.Flow, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getT2SFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_NormalStep_FlowNode_Flow_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SFirst__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SFirst__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_BWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 129</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 129</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_BWD_EMoflonEdge_129(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_BWD_EMoflonEdge_129__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_415(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 415</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 415</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_415(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_FWD_EMoflonEdge_415__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_416(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 416</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 416</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_416(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_FWD_EMoflonEdge_416__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_417(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 417</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 417</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_417(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_FWD_EMoflonEdge_417__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_418(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 418</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 418</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_418(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_FWD_EMoflonEdge_418__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_419(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 419</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 419</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_419(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_FWD_EMoflonEdge_419__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_420(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 420</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 420</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#isAppropriate_FWD_EMoflonEdge_420(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SFirst__IsAppropriate_FWD_EMoflonEdge_420__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SFirst__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SFirst__CheckAttributes_BWD__TripleMatch();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 130</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 130</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD_EMoflonEdge_130(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_BWD_EMoflonEdge_130__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 131</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 131</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_BWD_EMoflonEdge_131(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_BWD_EMoflonEdge_131__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_421(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 421</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 421</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_421(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_421__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_422(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 422</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 422</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_422(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_422__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_423(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 423</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 423</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_423(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_423__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 424</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 424</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_424(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_424__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 425</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 425</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_425(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_425__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 426</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 426</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_426(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_426__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 427</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 427</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_427(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_427__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 428</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 428</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq#isAppropriate_FWD_EMoflonEdge_428(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_428__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_BWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 132</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 132</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_BWD_EMoflonEdge_132(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_BWD_EMoflonEdge_132__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_429(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 429</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 429</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_429(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_429__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_430(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 430</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 430</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_430(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_430__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_431(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 431</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 431</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_431(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_431__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_432(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 432</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 432</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_432(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_432__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_433(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 433</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 433</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_433(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_433__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_434(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 434</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 434</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_434(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_434__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_435(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 435</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 435</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_435(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_435__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_436(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 436</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 436</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst#isAppropriate_FWD_EMoflonEdge_436(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_436__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_437(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 437</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 437</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_437(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_437__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_438(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 438</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 438</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_438(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_438__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_439(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 439</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 439</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_439(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_439__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_440(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 440</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 440</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_440(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_440__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_BWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 133</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 133</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_BWD_EMoflonEdge_133(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_BWD_EMoflonEdge_133__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_441(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 441</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 441</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_441(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_441__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_442(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 442</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 442</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst#isAppropriate_FWD_EMoflonEdge_442(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_442__EMoflonEdge();

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
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit <em>T2S After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2S After Split</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit
	 * @generated
	 */
	EClass getT2SAfterSplit();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_FWD__Match_ParallelGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterSplit__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterSplit__RegisterObjectsToMatch_FWD__Match_ParallelGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsApplicable_solveCsp_FWD__IsApplicableMatch_GW2S_ParallelGateway_ParallelStep_SequenceFlow_Process_UseCase_P2UC_Flow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterSplit__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterSplit__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterSplit__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SAfterSplit__RegisterObjectsToMatch_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.ParallelStep, de.abilov.useCase.UseCase, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_solveCsp_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.NormalStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.NormalStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.ParallelGateway, de.abilov.useCase.ParallelStep, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.ParallelFlow, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_GW2S_ParallelGateway_ParallelStep_Process_UseCase_P2UC_ParallelFlow_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterSplit__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterSplit__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_443(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 443</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 443</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_443(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_FWD_EMoflonEdge_443__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_444(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 444</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 444</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_444(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_FWD_EMoflonEdge_444__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_BWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 134</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 134</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_BWD_EMoflonEdge_134(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_BWD_EMoflonEdge_134__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_445(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 445</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 445</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_445(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_FWD_EMoflonEdge_445__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_BWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 135</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 135</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_BWD_EMoflonEdge_135(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_BWD_EMoflonEdge_135__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_BWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 136</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 136</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_BWD_EMoflonEdge_136(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_BWD_EMoflonEdge_136__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_446(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 446</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 446</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_446(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_FWD_EMoflonEdge_446__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_447(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 447</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 447</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_447(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_FWD_EMoflonEdge_447__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_448(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 448</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 448</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#isAppropriate_FWD_EMoflonEdge_448(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSplit__IsAppropriate_FWD_EMoflonEdge_448__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterSplit__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterSplit__CheckAttributes_BWD__TripleMatch();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 137</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 137</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD_EMoflonEdge_137(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_BWD_EMoflonEdge_137__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 138</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 138</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_BWD_EMoflonEdge_138(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_BWD_EMoflonEdge_138__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_449(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 449</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 449</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_449(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_449__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_450(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 450</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 450</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_450(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_450__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_451(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 451</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 451</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_451(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_451__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_452(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 452</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 452</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_452(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_452__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_453(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 453</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 453</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_453(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_453__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_454(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 454</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 454</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq#isAppropriate_FWD_EMoflonEdge_454(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_454__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_455(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 455</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 455</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_455(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_455__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_456(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 456</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 456</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_456(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_456__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_457(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 457</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 457</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_457(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_457__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_458(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 458</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 458</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_458(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_458__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_459(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 459</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 459</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_FWD_EMoflonEdge_459(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_459__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 139</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 139</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow#isAppropriate_BWD_EMoflonEdge_139(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInPFlow__IsAppropriate_BWD_EMoflonEdge_139__EMoflonEdge();

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
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge <em>T2S After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2S After Merge</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge
	 * @generated
	 */
	EClass getT2SAfterMerge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterMerge__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterMerge__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_SequenceFlow_FlowNode_FN2S_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterMerge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterMerge__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterMerge__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getT2SAfterMerge__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Step, de.abilov.useCase.Flow, de.abilov.useCase.NormalStep, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.FlowNode, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_NormalStep_SequenceFlow_FlowNode_FN2S_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterMerge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterMerge__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_BWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 140</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 140</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_BWD_EMoflonEdge_140(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_BWD_EMoflonEdge_140__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_BWD_EMoflonEdge_141(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 141</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 141</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_BWD_EMoflonEdge_141(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_BWD_EMoflonEdge_141__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_460(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 460</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 460</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_460(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_FWD_EMoflonEdge_460__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_461(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 461</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 461</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_461(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_FWD_EMoflonEdge_461__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_462(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 462</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 462</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_462(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_FWD_EMoflonEdge_462__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_463(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 463</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 463</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_463(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_FWD_EMoflonEdge_463__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_464(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 464</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 464</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_464(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_FWD_EMoflonEdge_464__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_465(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 465</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 465</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#isAppropriate_FWD_EMoflonEdge_465(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterMerge__IsAppropriate_FWD_EMoflonEdge_465__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterMerge__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterMerge__CheckAttributes_BWD__TripleMatch();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD_EMoflonEdge_142(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 142</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 142</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD_EMoflonEdge_142(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_BWD_EMoflonEdge_142__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD_EMoflonEdge_143(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 143</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 143</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_BWD_EMoflonEdge_143(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_BWD_EMoflonEdge_143__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_466(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 466</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 466</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_466(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_466__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_467(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 467</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 467</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_467(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_467__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_468(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 468</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 468</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_468(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_468__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_469(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 469</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 469</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_469(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_469__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_470(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 470</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 470</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_470(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_470__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_471(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 471</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 471</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_471(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_471__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_472(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 472</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 472</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_472(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_472__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_473(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 473</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 473</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq#isAppropriate_FWD_EMoflonEdge_473(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_473__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_BWD_EMoflonEdge_144(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 144</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 144</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_BWD_EMoflonEdge_144(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_BWD_EMoflonEdge_144__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_474(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 474</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 474</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_474(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_474__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_475(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 475</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 475</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_475(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_475__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_476(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 476</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 476</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_476(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_476__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_477(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 477</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 477</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_477(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_477__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_478(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 478</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 478</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_478(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_478__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_479(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 479</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 479</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_479(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_479__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_480(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 480</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 480</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_480(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_480__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_481(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 481</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 481</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst#isAppropriate_FWD_EMoflonEdge_481(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_481__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_482(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 482</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 482</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_482(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_482__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_145(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 145</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 145</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_145(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_BWD_EMoflonEdge_145__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_483(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 483</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 483</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_483(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_483__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_484(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 484</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 484</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_484(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_484__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_146(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 146</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 146</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_146(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_BWD_EMoflonEdge_146__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 147</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 147</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_BWD_EMoflonEdge_147(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_BWD_EMoflonEdge_147__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_485(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 485</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 485</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_485(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_485__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_486(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 486</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 486</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_486(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_486__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_487(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 487</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 487</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_487(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_487__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_488(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 488</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 488</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_488(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_488__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_489(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 489</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 489</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit#isAppropriate_FWD_EMoflonEdge_489(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_489__EMoflonEdge();

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
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef <em>T2S After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2S After Choice Def</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef
	 * @generated
	 */
	EClass getT2SAfterChoiceDef();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_Flow_ExclusiveGateway_ChoiceStep_GW2S_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 148</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 148</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_148(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_148__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_490(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 490</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 490</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_490(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_490__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_491(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 491</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 491</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_491(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_491__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_492(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 492</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 492</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_492(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_492__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 149</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 149</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_149(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_149__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_493(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 493</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 493</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_493(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_493__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_494(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 494</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 494</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_494(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_494__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_495(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 495</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 495</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_495(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_495__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_496(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 496</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 496</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_496(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_496__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterChoiceDef__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice <em>T2S After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2S After Choice</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice
	 * @generated
	 */
	EClass getT2SAfterChoice();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterChoice__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterChoice__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.Flow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_UseCase_P2UC_Flow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterChoice__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterChoice__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterChoice__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SAfterChoice__RegisterObjectsToMatch_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.ChoiceStep, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.useCase.UseCase, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ExclusiveGateway, de.abilov.useCase.ChoiceStep, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.AlternativeFlow, de.abilov.bpmn.Process, de.abilov.useCase.UseCase, de.abilov.tgg.bpmn2useCase.P2UC, de.abilov.useCase.StepAlternative, de.abilov.useCase.Flow)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_NormalStep_AlternativeFlow_Process_UseCase_P2UC_StepAlternative_Flow();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterChoice__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterChoice__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_497(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 497</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 497</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_497(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_FWD_EMoflonEdge_497__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_498(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 498</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 498</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_498(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_FWD_EMoflonEdge_498__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 150</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 150</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD_EMoflonEdge_150(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_BWD_EMoflonEdge_150__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 151</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 151</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD_EMoflonEdge_151(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_BWD_EMoflonEdge_151__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_499(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 499</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 499</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_499(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_FWD_EMoflonEdge_499__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 152</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 152</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD_EMoflonEdge_152(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_BWD_EMoflonEdge_152__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 153</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 153</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_BWD_EMoflonEdge_153(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_BWD_EMoflonEdge_153__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_500(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 500</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 500</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_500(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_FWD_EMoflonEdge_500__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_501(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 501</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 501</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_501(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_FWD_EMoflonEdge_501__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_502(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 502</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 502</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#isAppropriate_FWD_EMoflonEdge_502(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterChoice__IsAppropriate_FWD_EMoflonEdge_502__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterChoice__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterChoice__CheckAttributes_BWD__TripleMatch();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_503(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 503</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 503</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_503(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_503__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_504(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 504</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 504</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_504(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_504__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_505(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 505</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 505</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_505(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_505__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_BWD_EMoflonEdge_154(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 154</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 154</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_BWD_EMoflonEdge_154(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_BWD_EMoflonEdge_154__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_506(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 506</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 506</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_506(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_506__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_507(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 507</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 507</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_507(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_507__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_508(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 508</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 508</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow#isAppropriate_FWD_EMoflonEdge_508(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_508__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD_EMoflonEdge_155(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 155</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 155</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_BWD_EMoflonEdge_155(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_BWD_EMoflonEdge_155__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_509(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 509</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 509</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_509(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_509__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_510(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 510</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 510</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_510(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_510__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_511(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 511</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 511</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_511(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_511__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_512(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 512</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 512</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_512(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_512__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_513(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 513</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 513</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow#isAppropriate_FWD_EMoflonEdge_513(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_513__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD_EMoflonEdge_156(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 156</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 156</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD_EMoflonEdge_156(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_BWD_EMoflonEdge_156__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD_EMoflonEdge_157(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 157</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 157</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_BWD_EMoflonEdge_157(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_BWD_EMoflonEdge_157__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_514(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 514</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 514</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_514(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_514__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_515(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 515</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 515</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_515(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_515__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_516(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 516</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 516</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_516(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_516__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_517(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 517</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 517</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_517(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_517__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_518(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 518</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 518</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_518(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_518__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_519(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 519</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 519</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_519(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_519__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_520(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 520</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 520</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_520(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_520__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_521(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 521</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 521</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge#isAppropriate_FWD_EMoflonEdge_521(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_521__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD_EMoflonEdge_158(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 158</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 158</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD_EMoflonEdge_158(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_BWD_EMoflonEdge_158__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD_EMoflonEdge_159(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 159</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 159</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_BWD_EMoflonEdge_159(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_BWD_EMoflonEdge_159__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_522(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 522</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 522</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_522(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_522__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_523(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 523</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 523</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_523(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_523__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_524(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 524</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 524</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_524(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_524__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_525(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 525</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 525</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_525(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_525__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_526(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 526</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 526</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_526(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_526__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_527(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 527</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 527</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_527(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_527__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_528(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 528</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 528</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_528(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_528__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_529(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 529</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 529</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge#isAppropriate_FWD_EMoflonEdge_529(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_529__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_160(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 160</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 160</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_160(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_160__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_530(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 530</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 530</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_530(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_530__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_531(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 531</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 531</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_531(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_531__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_532(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 532</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 532</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_532(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_532__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_533(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 533</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 533</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_533(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_533__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_534(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 534</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 534</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_FWD_EMoflonEdge_534(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_534__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_161(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 161</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 161</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow#isAppropriate_BWD_EMoflonEdge_161(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_161__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_535(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 535</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 535</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_535(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_535__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_536(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 536</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 536</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_536(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_536__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_537(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 537</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 537</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_537(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_537__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_162(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 162</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 162</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_162(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_162__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_163(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 163</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 163</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_163(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_163__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_538(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 538</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 538</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_538(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_538__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_539(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 539</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 539</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_539(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_539__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_540(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 540</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 540</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_540(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_540__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_541(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 541</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 541</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_541(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_541__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_542(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 542</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 542</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_542(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_542__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_543(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 543</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 543</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_543(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_543__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_164(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 164</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 164</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_164(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_164__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_544(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 544</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 544</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_544(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_544__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_165(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 165</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 165</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_165(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_165__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_545(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 545</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 545</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_545(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_545__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_546(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 546</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 546</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_546(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_546__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_166(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 166</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 166</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_166(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_166__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_167(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 167</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 167</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_BWD_EMoflonEdge_167(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_167__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_547(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 547</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 547</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_547(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_547__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_548(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 548</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 548</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_548(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_548__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_549(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 549</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 549</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_549(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_549__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_550(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 550</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 550</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_550(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_550__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_551(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 551</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 551</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice#isAppropriate_FWD_EMoflonEdge_551(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_551__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_552(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 552</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 552</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_552(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_552__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_553(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 553</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 553</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_553(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_553__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_554(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 554</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 554</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_554(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_554__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_168(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 168</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 168</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_168(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_168__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_169(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 169</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 169</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_BWD_EMoflonEdge_169(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_169__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_555(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 555</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 555</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_555(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_555__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_556(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 556</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 556</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_556(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_556__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_557(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 557</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 557</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_557(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_557__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_558(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 558</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 558</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_558(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_558__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_559(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 559</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 559</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_559(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_559__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_560(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 560</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 560</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef#isAppropriate_FWD_EMoflonEdge_560(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_560__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_170(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 170</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 170</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_170(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_170__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_561(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 561</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 561</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_561(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_561__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_171(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 171</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 171</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_171(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_171__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_172(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 172</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 172</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_172(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_172__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_562(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 562</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 562</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_562(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_562__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_563(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 563</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 563</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_563(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_563__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_173(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 173</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 173</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_BWD_EMoflonEdge_173(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_173__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_564(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 564</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 564</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_564(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_564__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_565(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 565</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 565</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_565(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_565__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_566(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 566</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 566</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_566(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_566__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_567(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 567</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 567</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_567(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_567__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_568(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 568</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 568</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice#isAppropriate_FWD_EMoflonEdge_568(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_568__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD_EMoflonEdge_174(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 174</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 174</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD_EMoflonEdge_174(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_BWD_EMoflonEdge_174__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD_EMoflonEdge_175(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 175</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 175</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_BWD_EMoflonEdge_175(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_BWD_EMoflonEdge_175__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_569(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 569</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 569</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_569(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_569__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_570(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 570</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 570</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_570(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_570__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_571(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 571</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 571</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_571(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_571__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_572(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 572</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 572</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_572(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_572__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_573(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 573</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 573</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_573(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_573__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_574(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 574</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 574</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge#isAppropriate_FWD_EMoflonEdge_574(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_574__EMoflonEdge();

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
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef <em>T2S After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2S After Empty Def</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef
	 * @generated
	 */
	EClass getT2SAfterEmptyDef();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_GW2S_Flow_ChoiceStep_ExclusiveGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_ChoiceStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.ExclusiveGateway, de.abilov.tgg.bpmn2useCase.GW2S, de.abilov.useCase.NormalStep, de.abilov.useCase.Flow, de.abilov.useCase.ChoiceStep, de.abilov.bpmn.ExclusiveGateway, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_GW2S_NormalStep_Flow_ChoiceStep_ExclusiveGateway_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_176(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 176</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 176</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_176(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_176__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_177(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 177</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 177</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_177(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_177__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_575(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 575</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 575</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_575(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_575__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_576(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 576</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 576</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_576(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_576__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_577(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 577</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 577</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_577(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_577__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_578(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 578</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 578</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_578(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_578__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_579(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 579</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 579</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_579(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_579__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_580(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 580</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 580</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_580(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_580__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterEmptyDef__CheckAttributes_BWD__TripleMatch();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_178(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 178</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 178</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_178(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_178__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_179(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 179</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 179</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_179(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_179__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_581(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 581</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 581</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_581(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_581__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_582(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 582</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 582</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_582(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_582__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_583(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 583</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 583</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_583(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_583__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_584(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 584</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 584</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_584(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_584__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_585(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 585</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 585</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_585(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_585__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_586(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 586</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 586</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_586(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_586__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_587(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 587</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 587</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_587(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_587__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_588(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 588</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 588</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_588(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_588__EMoflonEdge();

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
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_180(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 180</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 180</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_180(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_180__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_181(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 181</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 181</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_BWD_EMoflonEdge_181(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_181__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_589(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 589</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 589</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_589(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_589__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_590(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 590</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 590</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_590(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_590__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_591(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 591</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 591</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_591(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_591__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_592(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 592</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 592</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_592(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_592__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_593(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 593</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 593</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_593(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_593__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_594(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 594</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 594</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_594(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_594__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_595(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 595</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 595</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_595(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_595__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_596(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 596</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 596</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef#isAppropriate_FWD_EMoflonEdge_596(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_596__EMoflonEdge();

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
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask <em>T2S After Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2S After Task</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask
	 * @generated
	 */
	EClass getT2SAfterTask();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Task, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.Task, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_FWD__Match_Task_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterTask__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Task, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.Task, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterTask__RegisterObjectsToMatch_FWD__Match_Task_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Task, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.Task, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_solveCsp_FWD__Match_Task_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Task, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Task, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsApplicable_solveCsp_FWD__IsApplicableMatch_Task_FN2S_Flow_Step_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterTask__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterTask__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterTask__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getT2SAfterTask__RegisterObjectsToMatch_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_solveCsp_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Task, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.Task, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsApplicable_solveCsp_BWD__IsApplicableMatch_Task_FN2S_Flow_Step_NormalStep_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterTask__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterTask__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_BWD_EMoflonEdge_182(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 182</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 182</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_BWD_EMoflonEdge_182(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_BWD_EMoflonEdge_182__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_BWD_EMoflonEdge_183(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 183</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 183</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_BWD_EMoflonEdge_183(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_BWD_EMoflonEdge_183__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_597(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 597</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 597</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_597(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_FWD_EMoflonEdge_597__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_598(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 598</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 598</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_598(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_FWD_EMoflonEdge_598__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_599(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 599</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 599</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_599(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_FWD_EMoflonEdge_599__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_600(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 600</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 600</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_600(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_FWD_EMoflonEdge_600__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_601(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 601</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 601</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_601(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_FWD_EMoflonEdge_601__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_602(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 602</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 602</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#isAppropriate_FWD_EMoflonEdge_602(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterTask__IsAppropriate_FWD_EMoflonEdge_602__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterTask__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterTask__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync <em>T2S After Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>T2S After Sync</em>'.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync
	 * @generated
	 */
	EClass getT2SAfterSync();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_FWD__Match_ParallelGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterSync__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#registerObjectsToMatch_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterSync__RegisterObjectsToMatch_FWD__Match_ParallelGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_solveCsp_FWD(TGGRuntime.Match, de.abilov.bpmn.ParallelGateway, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ParallelGateway, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ParallelGateway, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.bpmn.Process, de.abilov.bpmn.SequenceFlow, de.abilov.bpmn.Task)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_FN2S_Flow_Step_Process_SequenceFlow_Task();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterSync__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterSync__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getT2SAfterSync__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#registerObjectsToMatch_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getT2SAfterSync__RegisterObjectsToMatch_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_solveCsp_BWD(TGGRuntime.Match, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_solveCsp_BWD__Match_Flow_Step_NormalStep();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ParallelGateway, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep, de.abilov.bpmn.Process) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, de.abilov.bpmn.ParallelGateway, de.abilov.tgg.bpmn2useCase.FN2S, de.abilov.useCase.Flow, de.abilov.useCase.Step, de.abilov.useCase.NormalStep, de.abilov.bpmn.Process)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_FN2S_Flow_Step_NormalStep_Process();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getT2SAfterSync__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getT2SAfterSync__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_BWD_EMoflonEdge_184(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 184</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 184</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_BWD_EMoflonEdge_184(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_BWD_EMoflonEdge_184__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_BWD_EMoflonEdge_185(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 185</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 185</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_BWD_EMoflonEdge_185(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_BWD_EMoflonEdge_185__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_603(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 603</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 603</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_603(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_FWD_EMoflonEdge_603__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_604(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 604</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 604</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_604(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_FWD_EMoflonEdge_604__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_605(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 605</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 605</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_605(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_FWD_EMoflonEdge_605__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_606(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 606</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 606</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_606(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_FWD_EMoflonEdge_606__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_607(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 607</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 607</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_607(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_FWD_EMoflonEdge_607__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_608(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 608</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 608</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#isAppropriate_FWD_EMoflonEdge_608(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getT2SAfterSync__IsAppropriate_FWD_EMoflonEdge_608__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterSync__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getT2SAfterSync__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
