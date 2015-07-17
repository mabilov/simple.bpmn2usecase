/**
 */
package SimpleUseCase.impl;

import SimpleUseCase.AlternativeFlow;
import SimpleUseCase.BasicFlow;
import SimpleUseCase.ChoiceStep;
import SimpleUseCase.Flow;
import SimpleUseCase.NamedFlow;
import SimpleUseCase.NormalStep;
import SimpleUseCase.ParallelFlow;
import SimpleUseCase.ParallelStep;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.SimpleUseCasePackage;
import SimpleUseCase.Step;
import SimpleUseCase.UCCondition;
import SimpleUseCase.UseCase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleUseCasePackageImpl extends EPackageImpl implements SimpleUseCasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SimpleUseCase.SimpleUseCasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleUseCasePackageImpl() {
		super(eNS_URI, SimpleUseCaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimpleUseCasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleUseCasePackage init() {
		if (isInited)
			return (SimpleUseCasePackage) EPackage.Registry.INSTANCE.getEPackage(SimpleUseCasePackage.eNS_URI);

		// Obtain or create and register package
		SimpleUseCasePackageImpl theSimpleUseCasePackage = (SimpleUseCasePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SimpleUseCasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SimpleUseCasePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimpleUseCasePackage.createPackageContents();

		// Initialize created meta-data
		theSimpleUseCasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleUseCasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleUseCasePackage.eNS_URI, theSimpleUseCasePackage);
		return theSimpleUseCasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Flows() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Precondition() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Steps() {
		return (EReference) flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_FinalState() {
		return (EReference) flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow___last() {
		return (EReference) flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow___empty() {
		return (EAttribute) flowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicFlow() {
		return basicFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelFlow() {
		return parallelFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Next() {
		return (EReference) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Id() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalStep() {
		return normalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelStep() {
		return parallelStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelStep_InvokedFlows() {
		return (EReference) parallelStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCCondition() {
		return ucConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUCCondition_Name() {
		return (EAttribute) ucConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedFlow() {
		return namedFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedFlow_Id() {
		return (EAttribute) namedFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeFlow() {
		return alternativeFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceStep() {
		return choiceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoiceStep_AlternativeFlows() {
		return (EReference) choiceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleUseCaseFactory getSimpleUseCaseFactory() {
		return (SimpleUseCaseFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__FLOWS);
		createEReference(useCaseEClass, USE_CASE__PRECONDITION);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__STEPS);
		createEReference(flowEClass, FLOW__FINAL_STATE);
		createEReference(flowEClass, FLOW__LAST);
		createEAttribute(flowEClass, FLOW__EMPTY);

		basicFlowEClass = createEClass(BASIC_FLOW);

		parallelFlowEClass = createEClass(PARALLEL_FLOW);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__NEXT);
		createEAttribute(stepEClass, STEP__ID);

		normalStepEClass = createEClass(NORMAL_STEP);

		parallelStepEClass = createEClass(PARALLEL_STEP);
		createEReference(parallelStepEClass, PARALLEL_STEP__INVOKED_FLOWS);

		ucConditionEClass = createEClass(UC_CONDITION);
		createEAttribute(ucConditionEClass, UC_CONDITION__NAME);

		namedFlowEClass = createEClass(NAMED_FLOW);
		createEAttribute(namedFlowEClass, NAMED_FLOW__ID);

		alternativeFlowEClass = createEClass(ALTERNATIVE_FLOW);

		choiceStepEClass = createEClass(CHOICE_STEP);
		createEReference(choiceStepEClass, CHOICE_STEP__ALTERNATIVE_FLOWS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		basicFlowEClass.getESuperTypes().add(this.getFlow());
		parallelFlowEClass.getESuperTypes().add(this.getNamedFlow());
		normalStepEClass.getESuperTypes().add(this.getStep());
		parallelStepEClass.getESuperTypes().add(this.getStep());
		namedFlowEClass.getESuperTypes().add(this.getFlow());
		alternativeFlowEClass.getESuperTypes().add(this.getNamedFlow());
		choiceStepEClass.getESuperTypes().add(this.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCase_Flows(), this.getFlow(), null, "flows", null, 0, -1, UseCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUseCase_Precondition(), this.getUCCondition(), null, "precondition", null, 0, 1,
				UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_Steps(), this.getStep(), null, "steps", null, 0, -1, Flow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFlow_FinalState(), this.getUCCondition(), null, "finalState", null, 0, -1, Flow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow___last(), this.getStep(), null, "__last", null, 0, 1, Flow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFlow___empty(), ecorePackage.getEBoolean(), "__empty", null, 1, 1, Flow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(basicFlowEClass, BasicFlow.class, "BasicFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelFlowEClass, ParallelFlow.class, "ParallelFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Next(), this.getStep(), null, "next", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(normalStepEClass, NormalStep.class, "NormalStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelStepEClass, ParallelStep.class, "ParallelStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallelStep_InvokedFlows(), this.getParallelFlow(), null, "invokedFlows", null, 0, -1,
				ParallelStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ucConditionEClass, UCCondition.class, "UCCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUCCondition_Name(), ecorePackage.getEString(), "name", null, 1, 1, UCCondition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(namedFlowEClass, NamedFlow.class, "NamedFlow", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedFlow_Id(), ecorePackage.getEString(), "id", null, 1, 1, NamedFlow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(alternativeFlowEClass, AlternativeFlow.class, "AlternativeFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(choiceStepEClass, ChoiceStep.class, "ChoiceStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoiceStep_AlternativeFlows(), this.getAlternativeFlow(), null, "alternativeFlows", null, 0,
				-1, ChoiceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleUseCasePackageImpl
