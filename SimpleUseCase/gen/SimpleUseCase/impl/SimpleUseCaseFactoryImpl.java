/**
 */
package SimpleUseCase.impl;

import SimpleUseCase.*;

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
public class SimpleUseCaseFactoryImpl extends EFactoryImpl implements SimpleUseCaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleUseCaseFactory init() {
		try {
			SimpleUseCaseFactory theSimpleUseCaseFactory = (SimpleUseCaseFactory) EPackage.Registry.INSTANCE
					.getEFactory(SimpleUseCasePackage.eNS_URI);
			if (theSimpleUseCaseFactory != null) {
				return theSimpleUseCaseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleUseCaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleUseCaseFactoryImpl() {
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
		case SimpleUseCasePackage.USE_CASE:
			return createUseCase();
		case SimpleUseCasePackage.BASIC_FLOW:
			return createBasicFlow();
		case SimpleUseCasePackage.PARALLEL_FLOW:
			return createParallelFlow();
		case SimpleUseCasePackage.NORMAL_STEP:
			return createNormalStep();
		case SimpleUseCasePackage.PARALLEL_STEP:
			return createParallelStep();
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
	public SimpleUseCasePackage getSimpleUseCasePackage() {
		return (SimpleUseCasePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleUseCasePackage getPackage() {
		return SimpleUseCasePackage.eINSTANCE;
	}

} //SimpleUseCaseFactoryImpl
