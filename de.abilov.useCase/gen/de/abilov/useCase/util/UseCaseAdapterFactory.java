/**
 */
package de.abilov.useCase.util;

import de.abilov.useCase.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.abilov.useCase.UseCasePackage
 * @generated
 */
public class UseCaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UseCasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UseCasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseSwitch<Adapter> modelSwitch = new UseCaseSwitch<Adapter>() {
		@Override
		public Adapter caseUseCase(UseCase object) {
			return createUseCaseAdapter();
		}

		@Override
		public Adapter caseFlow(Flow object) {
			return createFlowAdapter();
		}

		@Override
		public Adapter caseBasicFlow(BasicFlow object) {
			return createBasicFlowAdapter();
		}

		@Override
		public Adapter caseParallelFlow(ParallelFlow object) {
			return createParallelFlowAdapter();
		}

		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseNormalStep(NormalStep object) {
			return createNormalStepAdapter();
		}

		@Override
		public Adapter caseParallelStep(ParallelStep object) {
			return createParallelStepAdapter();
		}

		@Override
		public Adapter caseUCCondition(UCCondition object) {
			return createUCConditionAdapter();
		}

		@Override
		public Adapter caseNamedFlow(NamedFlow object) {
			return createNamedFlowAdapter();
		}

		@Override
		public Adapter caseAlternativeFlow(AlternativeFlow object) {
			return createAlternativeFlowAdapter();
		}

		@Override
		public Adapter caseChoiceStep(ChoiceStep object) {
			return createChoiceStepAdapter();
		}

		@Override
		public Adapter caseStepAlternative(StepAlternative object) {
			return createStepAlternativeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.UseCase
	 * @generated
	 */
	public Adapter createUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.BasicFlow <em>Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.BasicFlow
	 * @generated
	 */
	public Adapter createBasicFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.ParallelFlow <em>Parallel Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.ParallelFlow
	 * @generated
	 */
	public Adapter createParallelFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.NormalStep <em>Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.NormalStep
	 * @generated
	 */
	public Adapter createNormalStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.ParallelStep <em>Parallel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.ParallelStep
	 * @generated
	 */
	public Adapter createParallelStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.UCCondition <em>UC Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.UCCondition
	 * @generated
	 */
	public Adapter createUCConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.NamedFlow <em>Named Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.NamedFlow
	 * @generated
	 */
	public Adapter createNamedFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.AlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.AlternativeFlow
	 * @generated
	 */
	public Adapter createAlternativeFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.ChoiceStep <em>Choice Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.ChoiceStep
	 * @generated
	 */
	public Adapter createChoiceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.useCase.StepAlternative <em>Step Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.useCase.StepAlternative
	 * @generated
	 */
	public Adapter createStepAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UseCaseAdapterFactory
