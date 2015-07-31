/**
 */
package de.abilov.useCase.impl;

import de.abilov.useCase.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseFactoryImpl extends EFactoryImpl implements UseCaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UseCaseFactory init() {
		try {
			UseCaseFactory theUseCaseFactory = (UseCaseFactory) EPackage.Registry.INSTANCE
					.getEFactory(UseCasePackage.eNS_URI);
			if (theUseCaseFactory != null) {
				return theUseCaseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UseCaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UseCasePackage.USE_CASE:
			return createUseCase();
		case UseCasePackage.BASIC_FLOW:
			return createBasicFlow();
		case UseCasePackage.PARALLEL_FLOW:
			return createParallelFlow();
		case UseCasePackage.NORMAL_STEP:
			return createNormalStep();
		case UseCasePackage.PARALLEL_STEP:
			return createParallelStep();
		case UseCasePackage.UC_CONDITION:
			return createUCCondition();
		case UseCasePackage.ALTERNATIVE_FLOW:
			return createAlternativeFlow();
		case UseCasePackage.CHOICE_STEP:
			return createChoiceStep();
		case UseCasePackage.STEP_ALTERNATIVE:
			return createStepAlternative();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFlow createBasicFlow() {
		BasicFlowImpl basicFlow = new BasicFlowImpl();
		return basicFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelFlow createParallelFlow() {
		ParallelFlowImpl parallelFlow = new ParallelFlowImpl();
		return parallelFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalStep createNormalStep() {
		NormalStepImpl normalStep = new NormalStepImpl();
		return normalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelStep createParallelStep() {
		ParallelStepImpl parallelStep = new ParallelStepImpl();
		return parallelStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCCondition createUCCondition() {
		UCConditionImpl ucCondition = new UCConditionImpl();
		return ucCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeFlow createAlternativeFlow() {
		AlternativeFlowImpl alternativeFlow = new AlternativeFlowImpl();
		return alternativeFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceStep createChoiceStep() {
		ChoiceStepImpl choiceStep = new ChoiceStepImpl();
		return choiceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepAlternative createStepAlternative() {
		StepAlternativeImpl stepAlternative = new StepAlternativeImpl();
		return stepAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCasePackage getUseCasePackage() {
		return (UseCasePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UseCasePackage getPackage() {
		return UseCasePackage.eINSTANCE;
	}

} //UseCaseFactoryImpl
