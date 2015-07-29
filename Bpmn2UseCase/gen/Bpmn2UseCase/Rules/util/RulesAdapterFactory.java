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
		public Adapter casePG2ParallelStep(PG2ParallelStep object) {
			return createPG2ParallelStepAdapter();
		}

		@Override
		public Adapter casePG2ParallelStepAfterPG(PG2ParallelStepAfterPG object) {
			return createPG2ParallelStepAfterPGAdapter();
		}

		@Override
		public Adapter caseTask2NormalStepSeq(Task2NormalStepSeq object) {
			return createTask2NormalStepSeqAdapter();
		}

		@Override
		public Adapter caseTask2NormalStepFirst(Task2NormalStepFirst object) {
			return createTask2NormalStepFirstAdapter();
		}

		@Override
		public Adapter casePG2ParallelStepSeq(PG2ParallelStepSeq object) {
			return createPG2ParallelStepSeqAdapter();
		}

		@Override
		public Adapter casePG2ParallelStepFirst(PG2ParallelStepFirst object) {
			return createPG2ParallelStepFirstAdapter();
		}

		@Override
		public Adapter caseEndEvent2FinalStateFirst(EndEvent2FinalStateFirst object) {
			return createEndEvent2FinalStateFirstAdapter();
		}

		@Override
		public Adapter caseTask2NormalStepAfterPG(Task2NormalStepAfterPG object) {
			return createTask2NormalStepAfterPGAdapter();
		}

		@Override
		public Adapter caseEndEvent2FinalState(EndEvent2FinalState object) {
			return createEndEvent2FinalStateAdapter();
		}

		@Override
		public Adapter caseEndEvent2FinalStateSeq(EndEvent2FinalStateSeq object) {
			return createEndEvent2FinalStateSeqAdapter();
		}

		@Override
		public Adapter caseLastStepInFlow(LastStepInFlow object) {
			return createLastStepInFlowAdapter();
		}

		@Override
		public Adapter caseLastStepInPFlow(LastStepInPFlow object) {
			return createLastStepInPFlowAdapter();
		}

		@Override
		public Adapter caseEG2Choice(EG2Choice object) {
			return createEG2ChoiceAdapter();
		}

		@Override
		public Adapter caseEG2ChoiceSeq(EG2ChoiceSeq object) {
			return createEG2ChoiceSeqAdapter();
		}

		@Override
		public Adapter caseEG2ChoiceFirst(EG2ChoiceFirst object) {
			return createEG2ChoiceFirstAdapter();
		}

		@Override
		public Adapter caseEG2ChoiceAfterPG(EG2ChoiceAfterPG object) {
			return createEG2ChoiceAfterPGAdapter();
		}

		@Override
		public Adapter caseTask2NormalStepAfterDefEG(Task2NormalStepAfterDefEG object) {
			return createTask2NormalStepAfterDefEGAdapter();
		}

		@Override
		public Adapter caseTask2NormalStepAfterEG(Task2NormalStepAfterEG object) {
			return createTask2NormalStepAfterEGAdapter();
		}

		@Override
		public Adapter caseEmptyDefaulFlow(EmptyDefaulFlow object) {
			return createEmptyDefaulFlowAdapter();
		}

		@Override
		public Adapter caseLastStepInDefaultFlow(LastStepInDefaultFlow object) {
			return createLastStepInDefaultFlowAdapter();
		}

		@Override
		public Adapter caseLastStepInAltFlow(LastStepInAltFlow object) {
			return createLastStepInAltFlowAdapter();
		}

		@Override
		public Adapter casePG2ParallelStepAfterDefEG(PG2ParallelStepAfterDefEG object) {
			return createPG2ParallelStepAfterDefEGAdapter();
		}

		@Override
		public Adapter casePG2ParallelStepAfterEG(PG2ParallelStepAfterEG object) {
			return createPG2ParallelStepAfterEGAdapter();
		}

		@Override
		public Adapter caseEG2ChoiceStepAfterDefEG(EG2ChoiceStepAfterDefEG object) {
			return createEG2ChoiceStepAfterDefEGAdapter();
		}

		@Override
		public Adapter caseEG2ChoiceStepAfterEG(EG2ChoiceStepAfterEG object) {
			return createEG2ChoiceStepAfterEGAdapter();
		}

		@Override
		public Adapter caseEndEvent2FinalStateGWSeq(EndEvent2FinalStateGWSeq object) {
			return createEndEvent2FinalStateGWSeqAdapter();
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
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.PG2ParallelStep <em>PG2 Parallel Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStep
	 * @generated
	 */
	public Adapter createPG2ParallelStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterPG <em>PG2 Parallel Step After PG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterPG
	 * @generated
	 */
	public Adapter createPG2ParallelStepAfterPGAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.Task2NormalStepFirst <em>Task2 Normal Step First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepFirst
	 * @generated
	 */
	public Adapter createTask2NormalStepFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.PG2ParallelStepSeq <em>PG2 Parallel Step Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepSeq
	 * @generated
	 */
	public Adapter createPG2ParallelStepSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.PG2ParallelStepFirst <em>PG2 Parallel Step First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepFirst
	 * @generated
	 */
	public Adapter createPG2ParallelStepFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateFirst <em>End Event2 Final State First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateFirst
	 * @generated
	 */
	public Adapter createEndEvent2FinalStateFirstAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EndEvent2FinalState <em>End Event2 Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalState
	 * @generated
	 */
	public Adapter createEndEvent2FinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateSeq <em>End Event2 Final State Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateSeq
	 * @generated
	 */
	public Adapter createEndEvent2FinalStateSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.LastStepInFlow <em>Last Step In Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.LastStepInFlow
	 * @generated
	 */
	public Adapter createLastStepInFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.LastStepInPFlow <em>Last Step In PFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.LastStepInPFlow
	 * @generated
	 */
	public Adapter createLastStepInPFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EG2Choice <em>EG2 Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EG2Choice
	 * @generated
	 */
	public Adapter createEG2ChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EG2ChoiceSeq <em>EG2 Choice Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceSeq
	 * @generated
	 */
	public Adapter createEG2ChoiceSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EG2ChoiceFirst <em>EG2 Choice First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceFirst
	 * @generated
	 */
	public Adapter createEG2ChoiceFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EG2ChoiceAfterPG <em>EG2 Choice After PG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceAfterPG
	 * @generated
	 */
	public Adapter createEG2ChoiceAfterPGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG <em>Task2 Normal Step After Def EG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterDefEG
	 * @generated
	 */
	public Adapter createTask2NormalStepAfterDefEGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.Task2NormalStepAfterEG <em>Task2 Normal Step After EG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.Task2NormalStepAfterEG
	 * @generated
	 */
	public Adapter createTask2NormalStepAfterEGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EmptyDefaulFlow <em>Empty Defaul Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EmptyDefaulFlow
	 * @generated
	 */
	public Adapter createEmptyDefaulFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.LastStepInDefaultFlow <em>Last Step In Default Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.LastStepInDefaultFlow
	 * @generated
	 */
	public Adapter createLastStepInDefaultFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.LastStepInAltFlow <em>Last Step In Alt Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.LastStepInAltFlow
	 * @generated
	 */
	public Adapter createLastStepInAltFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG <em>PG2 Parallel Step After Def EG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterDefEG
	 * @generated
	 */
	public Adapter createPG2ParallelStepAfterDefEGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.PG2ParallelStepAfterEG <em>PG2 Parallel Step After EG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.PG2ParallelStepAfterEG
	 * @generated
	 */
	public Adapter createPG2ParallelStepAfterEGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG <em>EG2 Choice Step After Def EG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterDefEG
	 * @generated
	 */
	public Adapter createEG2ChoiceStepAfterDefEGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG <em>EG2 Choice Step After EG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EG2ChoiceStepAfterEG
	 * @generated
	 */
	public Adapter createEG2ChoiceStepAfterEGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq <em>End Event2 Final State GW Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq
	 * @generated
	 */
	public Adapter createEndEvent2FinalStateGWSeqAdapter() {
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
