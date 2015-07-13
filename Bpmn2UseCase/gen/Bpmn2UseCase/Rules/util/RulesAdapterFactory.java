/**
 */
package Bpmn2UseCase.Rules.util;

import Bpmn2UseCase.Rules.*;

import TGGRuntime.AbstractRule;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Bpmn2UseCase.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseProcess2UseCase(Process2UseCase object) {
			return createProcess2UseCaseAdapter();
		}

		@Override
		public Adapter caseTask2NormalStep(Task2NormalStep object) {
			return createTask2NormalStepAdapter();
		}

		@Override
		public Adapter caseParallelGateway2ParallelStep(
				ParallelGateway2ParallelStep object) {
			return createParallelGateway2ParallelStepAdapter();
		}

		@Override
		public Adapter caseTask2NormalStepSeq(Task2NormalStepSeq object) {
			return createTask2NormalStepSeqAdapter();
		}

		@Override
		public Adapter caseTask2NormalStepAfterSE(Task2NormalStepAfterSE object) {
			return createTask2NormalStepAfterSEAdapter();
		}

		@Override
		public Adapter caseTask2NormalStepAfterPG(Task2NormalStepAfterPG object) {
			return createTask2NormalStepAfterPGAdapter();
		}

		@Override
		public Adapter caseParallelGateway2ParallelStepSeq(
				ParallelGateway2ParallelStepSeq object) {
			return createParallelGateway2ParallelStepSeqAdapter();
		}

		@Override
		public Adapter caseParallelGateway2ParallelStepAfterSE(
				ParallelGateway2ParallelStepAfterSE object) {
			return createParallelGateway2ParallelStepAfterSEAdapter();
		}

		@Override
		public Adapter caseParallelGateway2ParallelStepAfterPG(
				ParallelGateway2ParallelStepAfterPG object) {
			return createParallelGateway2ParallelStepAfterPGAdapter();
		}

		@Override
		public Adapter caseSequenceFlowAfterPG2ParallelFlow(
				SequenceFlowAfterPG2ParallelFlow object) {
			return createSequenceFlowAfterPG2ParallelFlowAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.Process2UseCase <em>Process2 Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.Process2UseCase
	 * @generated
	 */
	public Adapter createProcess2UseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.Task2NormalStep <em>Task2 Normal Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.Task2NormalStep
	 * @generated
	 */
	public Adapter createTask2NormalStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStep <em>Parallel Gateway2 Parallel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStep
	 * @generated
	 */
	public Adapter createParallelGateway2ParallelStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.Task2NormalStepSeq <em>Task2 Normal Step Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepSeq
	 * @generated
	 */
	public Adapter createTask2NormalStepSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterSE <em>Task2 Normal Step After SE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterSE
	 * @generated
	 */
	public Adapter createTask2NormalStepAfterSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterPG <em>Task2 Normal Step After PG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterPG
	 * @generated
	 */
	public Adapter createTask2NormalStepAfterPGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq <em>Parallel Gateway2 Parallel Step Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepSeq
	 * @generated
	 */
	public Adapter createParallelGateway2ParallelStepSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE <em>Parallel Gateway2 Parallel Step After SE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterSE
	 * @generated
	 */
	public Adapter createParallelGateway2ParallelStepAfterSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG <em>Parallel Gateway2 Parallel Step After PG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.ParallelGateway2ParallelStepAfterPG
	 * @generated
	 */
	public Adapter createParallelGateway2ParallelStepAfterPGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow <em>Sequence Flow After PG2 Parallel Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.SequenceFlowAfterPG2ParallelFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAfterPG2ParallelFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TGGRuntime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TGGRuntime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
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

} //RulesAdapterFactory
