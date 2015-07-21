/**
 */
package SimpleUseCase;

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
 * @see SimpleUseCase.SimpleUseCaseFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleUseCasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimpleUseCase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/SimpleUseCase/model/SimpleUseCase.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SimpleUseCase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleUseCasePackage eINSTANCE = SimpleUseCase.impl.SimpleUseCasePackageImpl.init();

	/**
	 * The meta object id for the '{@link SimpleUseCase.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.UseCaseImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getUseCase()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.FlowImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getFlow()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.BasicFlowImpl <em>Basic Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.BasicFlowImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getBasicFlow()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.NamedFlowImpl <em>Named Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.NamedFlowImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getNamedFlow()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.ParallelFlowImpl <em>Parallel Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.ParallelFlowImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getParallelFlow()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.StepImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getStep()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.NormalStepImpl <em>Normal Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.NormalStepImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getNormalStep()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.ParallelStepImpl <em>Parallel Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.ParallelStepImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getParallelStep()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.UCConditionImpl <em>UC Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.UCConditionImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getUCCondition()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.AlternativeFlowImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getAlternativeFlow()
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
	 * The meta object id for the '{@link SimpleUseCase.impl.ChoiceStepImpl <em>Choice Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleUseCase.impl.ChoiceStepImpl
	 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getChoiceStep()
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
	 * The feature id for the '<em><b>Alternative Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP__ALTERNATIVE_FLOWS = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Choice Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see SimpleUseCase.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleUseCase.UseCase#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see SimpleUseCase.UseCase#getFlows()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Flows();

	/**
	 * Returns the meta object for the containment reference '{@link SimpleUseCase.UseCase#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see SimpleUseCase.UseCase#getPrecondition()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link SimpleUseCase.UseCase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SimpleUseCase.UseCase#getId()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Id();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see SimpleUseCase.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleUseCase.Flow#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see SimpleUseCase.Flow#getSteps()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link SimpleUseCase.Flow#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final State</em>'.
	 * @see SimpleUseCase.Flow#getFinalState()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_FinalState();

	/**
	 * Returns the meta object for the reference '{@link SimpleUseCase.Flow#get__last <em>last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>last</em>'.
	 * @see SimpleUseCase.Flow#get__last()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow___last();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.BasicFlow <em>Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Flow</em>'.
	 * @see SimpleUseCase.BasicFlow
	 * @generated
	 */
	EClass getBasicFlow();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.ParallelFlow <em>Parallel Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Flow</em>'.
	 * @see SimpleUseCase.ParallelFlow
	 * @generated
	 */
	EClass getParallelFlow();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see SimpleUseCase.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link SimpleUseCase.Step#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see SimpleUseCase.Step#getNext()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Next();

	/**
	 * Returns the meta object for the reference '{@link SimpleUseCase.Step#get__last <em>last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>last</em>'.
	 * @see SimpleUseCase.Step#get__last()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep___last();

	/**
	 * Returns the meta object for the attribute '{@link SimpleUseCase.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SimpleUseCase.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.NormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Step</em>'.
	 * @see SimpleUseCase.NormalStep
	 * @generated
	 */
	EClass getNormalStep();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.ParallelStep <em>Parallel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Step</em>'.
	 * @see SimpleUseCase.ParallelStep
	 * @generated
	 */
	EClass getParallelStep();

	/**
	 * Returns the meta object for the reference list '{@link SimpleUseCase.ParallelStep#getInvokedFlows <em>Invoked Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoked Flows</em>'.
	 * @see SimpleUseCase.ParallelStep#getInvokedFlows()
	 * @see #getParallelStep()
	 * @generated
	 */
	EReference getParallelStep_InvokedFlows();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.UCCondition <em>UC Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Condition</em>'.
	 * @see SimpleUseCase.UCCondition
	 * @generated
	 */
	EClass getUCCondition();

	/**
	 * Returns the meta object for the attribute '{@link SimpleUseCase.UCCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SimpleUseCase.UCCondition#getName()
	 * @see #getUCCondition()
	 * @generated
	 */
	EAttribute getUCCondition_Name();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.NamedFlow <em>Named Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Flow</em>'.
	 * @see SimpleUseCase.NamedFlow
	 * @generated
	 */
	EClass getNamedFlow();

	/**
	 * Returns the meta object for the attribute '{@link SimpleUseCase.NamedFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SimpleUseCase.NamedFlow#getId()
	 * @see #getNamedFlow()
	 * @generated
	 */
	EAttribute getNamedFlow_Id();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.AlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Flow</em>'.
	 * @see SimpleUseCase.AlternativeFlow
	 * @generated
	 */
	EClass getAlternativeFlow();

	/**
	 * Returns the meta object for class '{@link SimpleUseCase.ChoiceStep <em>Choice Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Step</em>'.
	 * @see SimpleUseCase.ChoiceStep
	 * @generated
	 */
	EClass getChoiceStep();

	/**
	 * Returns the meta object for the reference list '{@link SimpleUseCase.ChoiceStep#getAlternativeFlows <em>Alternative Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative Flows</em>'.
	 * @see SimpleUseCase.ChoiceStep#getAlternativeFlows()
	 * @see #getChoiceStep()
	 * @generated
	 */
	EReference getChoiceStep_AlternativeFlows();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleUseCaseFactory getSimpleUseCaseFactory();

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
		 * The meta object literal for the '{@link SimpleUseCase.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.UseCaseImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getUseCase()
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
		 * The meta object literal for the '{@link SimpleUseCase.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.FlowImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getFlow()
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
		 * The meta object literal for the '{@link SimpleUseCase.impl.BasicFlowImpl <em>Basic Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.BasicFlowImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getBasicFlow()
		 * @generated
		 */
		EClass BASIC_FLOW = eINSTANCE.getBasicFlow();

		/**
		 * The meta object literal for the '{@link SimpleUseCase.impl.ParallelFlowImpl <em>Parallel Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.ParallelFlowImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getParallelFlow()
		 * @generated
		 */
		EClass PARALLEL_FLOW = eINSTANCE.getParallelFlow();

		/**
		 * The meta object literal for the '{@link SimpleUseCase.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.StepImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getStep()
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
		 * The meta object literal for the '{@link SimpleUseCase.impl.NormalStepImpl <em>Normal Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.NormalStepImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getNormalStep()
		 * @generated
		 */
		EClass NORMAL_STEP = eINSTANCE.getNormalStep();

		/**
		 * The meta object literal for the '{@link SimpleUseCase.impl.ParallelStepImpl <em>Parallel Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.ParallelStepImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getParallelStep()
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
		 * The meta object literal for the '{@link SimpleUseCase.impl.UCConditionImpl <em>UC Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.UCConditionImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getUCCondition()
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
		 * The meta object literal for the '{@link SimpleUseCase.impl.NamedFlowImpl <em>Named Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.NamedFlowImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getNamedFlow()
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
		 * The meta object literal for the '{@link SimpleUseCase.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.AlternativeFlowImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getAlternativeFlow()
		 * @generated
		 */
		EClass ALTERNATIVE_FLOW = eINSTANCE.getAlternativeFlow();

		/**
		 * The meta object literal for the '{@link SimpleUseCase.impl.ChoiceStepImpl <em>Choice Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleUseCase.impl.ChoiceStepImpl
		 * @see SimpleUseCase.impl.SimpleUseCasePackageImpl#getChoiceStep()
		 * @generated
		 */
		EClass CHOICE_STEP = eINSTANCE.getChoiceStep();

		/**
		 * The meta object literal for the '<em><b>Alternative Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE_STEP__ALTERNATIVE_FLOWS = eINSTANCE.getChoiceStep_AlternativeFlows();

	}

} //SimpleUseCasePackage
