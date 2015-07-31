/**
 */
package de.abilov.useCase;

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
 * @see de.abilov.useCase.UseCaseFactory
 * @model kind="package"
 * @generated
 */
public interface UseCasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "de.abilov.useCase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/de.abilov.useCase/model/UseCase.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.abilov.useCase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UseCasePackage eINSTANCE = de.abilov.useCase.impl.UseCasePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.UseCaseImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 0;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__FLOWS = 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__ID = 2;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.FlowImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FINAL_STATE = 1;

	/**
	 * The feature id for the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__LAST = 2;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.BasicFlowImpl <em>Basic Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.BasicFlowImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getBasicFlow()
	 * @generated
	 */
	int BASIC_FLOW = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW__STEPS = FLOW__STEPS;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW__FINAL_STATE = FLOW__FINAL_STATE;

	/**
	 * The feature id for the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW__LAST = FLOW__LAST;

	/**
	 * The number of structural features of the '<em>Basic Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.NamedFlowImpl <em>Named Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.NamedFlowImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getNamedFlow()
	 * @generated
	 */
	int NAMED_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW__STEPS = FLOW__STEPS;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW__FINAL_STATE = FLOW__FINAL_STATE;

	/**
	 * The feature id for the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW__LAST = FLOW__LAST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW__ID = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.ParallelFlowImpl <em>Parallel Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.ParallelFlowImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getParallelFlow()
	 * @generated
	 */
	int PARALLEL_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__STEPS = NAMED_FLOW__STEPS;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__FINAL_STATE = NAMED_FLOW__FINAL_STATE;

	/**
	 * The feature id for the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__LAST = NAMED_FLOW__LAST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW__ID = NAMED_FLOW__ID;

	/**
	 * The number of structural features of the '<em>Parallel Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_FEATURE_COUNT = NAMED_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FLOW_OPERATION_COUNT = NAMED_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.StepImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NEXT = 0;

	/**
	 * The feature id for the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LAST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.NormalStepImpl <em>Normal Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.NormalStepImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getNormalStep()
	 * @generated
	 */
	int NORMAL_STEP = 5;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__NEXT = STEP__NEXT;

	/**
	 * The feature id for the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__LAST = STEP__LAST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP__ID = STEP__ID;

	/**
	 * The number of structural features of the '<em>Normal Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normal Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.ParallelStepImpl <em>Parallel Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.ParallelStepImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getParallelStep()
	 * @generated
	 */
	int PARALLEL_STEP = 6;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP__NEXT = STEP__NEXT;

	/**
	 * The feature id for the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP__LAST = STEP__LAST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP__ID = STEP__ID;

	/**
	 * The feature id for the '<em><b>Invoked Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP__INVOKED_FLOWS = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parallel Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.UCConditionImpl <em>UC Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.UCConditionImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getUCCondition()
	 * @generated
	 */
	int UC_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>UC Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>UC Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.AlternativeFlowImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getAlternativeFlow()
	 * @generated
	 */
	int ALTERNATIVE_FLOW = 9;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__STEPS = NAMED_FLOW__STEPS;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__FINAL_STATE = NAMED_FLOW__FINAL_STATE;

	/**
	 * The feature id for the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__LAST = NAMED_FLOW__LAST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__ID = NAMED_FLOW__ID;

	/**
	 * The number of structural features of the '<em>Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_FEATURE_COUNT = NAMED_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_OPERATION_COUNT = NAMED_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.ChoiceStepImpl <em>Choice Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.ChoiceStepImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getChoiceStep()
	 * @generated
	 */
	int CHOICE_STEP = 10;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP__NEXT = STEP__NEXT;

	/**
	 * The feature id for the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP__LAST = STEP__LAST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP__ID = STEP__ID;

	/**
	 * The feature id for the '<em><b>Step Alternatives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP__STEP_ALTERNATIVES = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>last In Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP__LAST_IN_DEF = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choice Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choice Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.abilov.useCase.impl.StepAlternativeImpl <em>Step Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.abilov.useCase.impl.StepAlternativeImpl
	 * @see de.abilov.useCase.impl.UseCasePackageImpl#getStepAlternative()
	 * @generated
	 */
	int STEP_ALTERNATIVE = 11;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE__REF = 0;

	/**
	 * The feature id for the '<em><b>Continuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE__CONTINUATION = 1;

	/**
	 * The feature id for the '<em><b>has Continue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE__HAS_CONTINUE = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE__CONDITION = 3;

	/**
	 * The number of structural features of the '<em>Step Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Step Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_ALTERNATIVE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see de.abilov.useCase.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the containment reference list '{@link de.abilov.useCase.UseCase#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see de.abilov.useCase.UseCase#getFlows()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Flows();

	/**
	 * Returns the meta object for the containment reference '{@link de.abilov.useCase.UseCase#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see de.abilov.useCase.UseCase#getPrecondition()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link de.abilov.useCase.UseCase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.abilov.useCase.UseCase#getId()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Id();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see de.abilov.useCase.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link de.abilov.useCase.Flow#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see de.abilov.useCase.Flow#getSteps()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link de.abilov.useCase.Flow#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final State</em>'.
	 * @see de.abilov.useCase.Flow#getFinalState()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_FinalState();

	/**
	 * Returns the meta object for the reference '{@link de.abilov.useCase.Flow#get__last <em>last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>last</em>'.
	 * @see de.abilov.useCase.Flow#get__last()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow___last();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.BasicFlow <em>Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Flow</em>'.
	 * @see de.abilov.useCase.BasicFlow
	 * @generated
	 */
	EClass getBasicFlow();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.ParallelFlow <em>Parallel Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Flow</em>'.
	 * @see de.abilov.useCase.ParallelFlow
	 * @generated
	 */
	EClass getParallelFlow();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see de.abilov.useCase.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link de.abilov.useCase.Step#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see de.abilov.useCase.Step#getNext()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Next();

	/**
	 * Returns the meta object for the reference '{@link de.abilov.useCase.Step#get__last <em>last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>last</em>'.
	 * @see de.abilov.useCase.Step#get__last()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep___last();

	/**
	 * Returns the meta object for the attribute '{@link de.abilov.useCase.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.abilov.useCase.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.NormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Step</em>'.
	 * @see de.abilov.useCase.NormalStep
	 * @generated
	 */
	EClass getNormalStep();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.ParallelStep <em>Parallel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Step</em>'.
	 * @see de.abilov.useCase.ParallelStep
	 * @generated
	 */
	EClass getParallelStep();

	/**
	 * Returns the meta object for the reference list '{@link de.abilov.useCase.ParallelStep#getInvokedFlows <em>Invoked Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoked Flows</em>'.
	 * @see de.abilov.useCase.ParallelStep#getInvokedFlows()
	 * @see #getParallelStep()
	 * @generated
	 */
	EReference getParallelStep_InvokedFlows();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.UCCondition <em>UC Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Condition</em>'.
	 * @see de.abilov.useCase.UCCondition
	 * @generated
	 */
	EClass getUCCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.abilov.useCase.UCCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.abilov.useCase.UCCondition#getName()
	 * @see #getUCCondition()
	 * @generated
	 */
	EAttribute getUCCondition_Name();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.NamedFlow <em>Named Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Flow</em>'.
	 * @see de.abilov.useCase.NamedFlow
	 * @generated
	 */
	EClass getNamedFlow();

	/**
	 * Returns the meta object for the attribute '{@link de.abilov.useCase.NamedFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.abilov.useCase.NamedFlow#getId()
	 * @see #getNamedFlow()
	 * @generated
	 */
	EAttribute getNamedFlow_Id();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.AlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Flow</em>'.
	 * @see de.abilov.useCase.AlternativeFlow
	 * @generated
	 */
	EClass getAlternativeFlow();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.ChoiceStep <em>Choice Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Step</em>'.
	 * @see de.abilov.useCase.ChoiceStep
	 * @generated
	 */
	EClass getChoiceStep();

	/**
	 * Returns the meta object for the containment reference list '{@link de.abilov.useCase.ChoiceStep#getStepAlternatives <em>Step Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Alternatives</em>'.
	 * @see de.abilov.useCase.ChoiceStep#getStepAlternatives()
	 * @see #getChoiceStep()
	 * @generated
	 */
	EReference getChoiceStep_StepAlternatives();

	/**
	 * Returns the meta object for the reference '{@link de.abilov.useCase.ChoiceStep#get__lastInDef <em>last In Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>last In Def</em>'.
	 * @see de.abilov.useCase.ChoiceStep#get__lastInDef()
	 * @see #getChoiceStep()
	 * @generated
	 */
	EReference getChoiceStep___lastInDef();

	/**
	 * Returns the meta object for class '{@link de.abilov.useCase.StepAlternative <em>Step Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Alternative</em>'.
	 * @see de.abilov.useCase.StepAlternative
	 * @generated
	 */
	EClass getStepAlternative();

	/**
	 * Returns the meta object for the reference '{@link de.abilov.useCase.StepAlternative#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see de.abilov.useCase.StepAlternative#getRef()
	 * @see #getStepAlternative()
	 * @generated
	 */
	EReference getStepAlternative_Ref();

	/**
	 * Returns the meta object for the reference '{@link de.abilov.useCase.StepAlternative#getContinuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continuation</em>'.
	 * @see de.abilov.useCase.StepAlternative#getContinuation()
	 * @see #getStepAlternative()
	 * @generated
	 */
	EReference getStepAlternative_Continuation();

	/**
	 * Returns the meta object for the reference '{@link de.abilov.useCase.StepAlternative#get__hasContinue <em>has Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>has Continue</em>'.
	 * @see de.abilov.useCase.StepAlternative#get__hasContinue()
	 * @see #getStepAlternative()
	 * @generated
	 */
	EReference getStepAlternative___hasContinue();

	/**
	 * Returns the meta object for the attribute '{@link de.abilov.useCase.StepAlternative#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.abilov.useCase.StepAlternative#getCondition()
	 * @see #getStepAlternative()
	 * @generated
	 */
	EAttribute getStepAlternative_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UseCaseFactory getUseCaseFactory();

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
		 * The meta object literal for the '{@link de.abilov.useCase.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.UseCaseImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__FLOWS = eINSTANCE.getUseCase_Flows();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__PRECONDITION = eINSTANCE.getUseCase_Precondition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__ID = eINSTANCE.getUseCase_Id();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.FlowImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__STEPS = eINSTANCE.getFlow_Steps();

		/**
		 * The meta object literal for the '<em><b>Final State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FINAL_STATE = eINSTANCE.getFlow_FinalState();

		/**
		 * The meta object literal for the '<em><b>last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__LAST = eINSTANCE.getFlow___last();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.BasicFlowImpl <em>Basic Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.BasicFlowImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getBasicFlow()
		 * @generated
		 */
		EClass BASIC_FLOW = eINSTANCE.getBasicFlow();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.ParallelFlowImpl <em>Parallel Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.ParallelFlowImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getParallelFlow()
		 * @generated
		 */
		EClass PARALLEL_FLOW = eINSTANCE.getParallelFlow();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.StepImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__NEXT = eINSTANCE.getStep_Next();

		/**
		 * The meta object literal for the '<em><b>last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__LAST = eINSTANCE.getStep___last();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.NormalStepImpl <em>Normal Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.NormalStepImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getNormalStep()
		 * @generated
		 */
		EClass NORMAL_STEP = eINSTANCE.getNormalStep();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.ParallelStepImpl <em>Parallel Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.ParallelStepImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getParallelStep()
		 * @generated
		 */
		EClass PARALLEL_STEP = eINSTANCE.getParallelStep();

		/**
		 * The meta object literal for the '<em><b>Invoked Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_STEP__INVOKED_FLOWS = eINSTANCE.getParallelStep_InvokedFlows();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.UCConditionImpl <em>UC Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.UCConditionImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getUCCondition()
		 * @generated
		 */
		EClass UC_CONDITION = eINSTANCE.getUCCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UC_CONDITION__NAME = eINSTANCE.getUCCondition_Name();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.NamedFlowImpl <em>Named Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.NamedFlowImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getNamedFlow()
		 * @generated
		 */
		EClass NAMED_FLOW = eINSTANCE.getNamedFlow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_FLOW__ID = eINSTANCE.getNamedFlow_Id();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.AlternativeFlowImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getAlternativeFlow()
		 * @generated
		 */
		EClass ALTERNATIVE_FLOW = eINSTANCE.getAlternativeFlow();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.ChoiceStepImpl <em>Choice Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.ChoiceStepImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getChoiceStep()
		 * @generated
		 */
		EClass CHOICE_STEP = eINSTANCE.getChoiceStep();

		/**
		 * The meta object literal for the '<em><b>Step Alternatives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE_STEP__STEP_ALTERNATIVES = eINSTANCE.getChoiceStep_StepAlternatives();

		/**
		 * The meta object literal for the '<em><b>last In Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE_STEP__LAST_IN_DEF = eINSTANCE.getChoiceStep___lastInDef();

		/**
		 * The meta object literal for the '{@link de.abilov.useCase.impl.StepAlternativeImpl <em>Step Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.abilov.useCase.impl.StepAlternativeImpl
		 * @see de.abilov.useCase.impl.UseCasePackageImpl#getStepAlternative()
		 * @generated
		 */
		EClass STEP_ALTERNATIVE = eINSTANCE.getStepAlternative();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_ALTERNATIVE__REF = eINSTANCE.getStepAlternative_Ref();

		/**
		 * The meta object literal for the '<em><b>Continuation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_ALTERNATIVE__CONTINUATION = eINSTANCE.getStepAlternative_Continuation();

		/**
		 * The meta object literal for the '<em><b>has Continue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_ALTERNATIVE__HAS_CONTINUE = eINSTANCE.getStepAlternative___hasContinue();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_ALTERNATIVE__CONDITION = eINSTANCE.getStepAlternative_Condition();

	}

} //UseCasePackage
