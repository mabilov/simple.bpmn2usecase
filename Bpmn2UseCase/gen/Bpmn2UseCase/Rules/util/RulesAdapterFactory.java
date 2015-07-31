/**
 */
package bpmn2UseCase.Rules.util;

import TGGRuntime.AbstractRule;

import bpmn2UseCase.Rules.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bpmn2UseCase.Rules.RulesPackage
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
		public Adapter caseTask2Step(Task2Step object) {
			return createTask2StepAdapter();
		}

		@Override
		public Adapter caseSplit(Split object) {
			return createSplitAdapter();
		}

		@Override
		public Adapter caseSplitAfterSplit(SplitAfterSplit object) {
			return createSplitAfterSplitAdapter();
		}

		@Override
		public Adapter caseTask2StepSeq(Task2StepSeq object) {
			return createTask2StepSeqAdapter();
		}

		@Override
		public Adapter caseTask2StepFirst(Task2StepFirst object) {
			return createTask2StepFirstAdapter();
		}

		@Override
		public Adapter caseSplitSeq(SplitSeq object) {
			return createSplitSeqAdapter();
		}

		@Override
		public Adapter caseSplitFirst(SplitFirst object) {
			return createSplitFirstAdapter();
		}

		@Override
		public Adapter caseTerminationFirst(TerminationFirst object) {
			return createTerminationFirstAdapter();
		}

		@Override
		public Adapter caseTask2StepAfterSplit(Task2StepAfterSplit object) {
			return createTask2StepAfterSplitAdapter();
		}

		@Override
		public Adapter caseTermination(Termination object) {
			return createTerminationAdapter();
		}

		@Override
		public Adapter caseTerminationSeq(TerminationSeq object) {
			return createTerminationSeqAdapter();
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
		public Adapter caseChoice(Choice object) {
			return createChoiceAdapter();
		}

		@Override
		public Adapter caseTask2StepAfterMerge(Task2StepAfterMerge object) {
			return createTask2StepAfterMergeAdapter();
		}

		@Override
		public Adapter caseChoiceSeq(ChoiceSeq object) {
			return createChoiceSeqAdapter();
		}

		@Override
		public Adapter caseChoiceFirst(ChoiceFirst object) {
			return createChoiceFirstAdapter();
		}

		@Override
		public Adapter caseChoiceAfterSplit(ChoiceAfterSplit object) {
			return createChoiceAfterSplitAdapter();
		}

		@Override
		public Adapter caseTask2StepAfterChoiceDef(Task2StepAfterChoiceDef object) {
			return createTask2StepAfterChoiceDefAdapter();
		}

		@Override
		public Adapter caseTask2StepAfterChoice(Task2StepAfterChoice object) {
			return createTask2StepAfterChoiceAdapter();
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
		public Adapter caseSplitAfterMerge(SplitAfterMerge object) {
			return createSplitAfterMergeAdapter();
		}

		@Override
		public Adapter caseChoiceAfterMerge(ChoiceAfterMerge object) {
			return createChoiceAfterMergeAdapter();
		}

		@Override
		public Adapter caseLastStepInAltFlow(LastStepInAltFlow object) {
			return createLastStepInAltFlowAdapter();
		}

		@Override
		public Adapter caseSplitAfterChoiceDef(SplitAfterChoiceDef object) {
			return createSplitAfterChoiceDefAdapter();
		}

		@Override
		public Adapter caseSplitAfterChoice(SplitAfterChoice object) {
			return createSplitAfterChoiceAdapter();
		}

		@Override
		public Adapter caseChoiceAfterChoiceDef(ChoiceAfterChoiceDef object) {
			return createChoiceAfterChoiceDefAdapter();
		}

		@Override
		public Adapter caseChoiceAfterChoice(ChoiceAfterChoice object) {
			return createChoiceAfterChoiceAdapter();
		}

		@Override
		public Adapter caseTerminationAfterMerge(TerminationAfterMerge object) {
			return createTerminationAfterMergeAdapter();
		}

		@Override
		public Adapter caseTask2StepAfterEmptyDef(Task2StepAfterEmptyDef object) {
			return createTask2StepAfterEmptyDefAdapter();
		}

		@Override
		public Adapter caseSplitAfterEmptyDef(SplitAfterEmptyDef object) {
			return createSplitAfterEmptyDefAdapter();
		}

		@Override
		public Adapter caseChoiceAfterEmptyDef(ChoiceAfterEmptyDef object) {
			return createChoiceAfterEmptyDefAdapter();
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
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Process2UseCase <em>Process2 Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Process2UseCase
	 * @generated
	 */
	public Adapter createProcess2UseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Task2Step <em>Task2 Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Task2Step
	 * @generated
	 */
	public Adapter createTask2StepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Split
	 * @generated
	 */
	public Adapter createSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.SplitAfterSplit <em>Split After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.SplitAfterSplit
	 * @generated
	 */
	public Adapter createSplitAfterSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Task2StepSeq <em>Task2 Step Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Task2StepSeq
	 * @generated
	 */
	public Adapter createTask2StepSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Task2StepFirst <em>Task2 Step First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Task2StepFirst
	 * @generated
	 */
	public Adapter createTask2StepFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.SplitSeq <em>Split Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.SplitSeq
	 * @generated
	 */
	public Adapter createSplitSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.SplitFirst <em>Split First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.SplitFirst
	 * @generated
	 */
	public Adapter createSplitFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.TerminationFirst <em>Termination First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.TerminationFirst
	 * @generated
	 */
	public Adapter createTerminationFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Task2StepAfterSplit <em>Task2 Step After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Task2StepAfterSplit
	 * @generated
	 */
	public Adapter createTask2StepAfterSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Termination <em>Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Termination
	 * @generated
	 */
	public Adapter createTerminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.TerminationSeq <em>Termination Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.TerminationSeq
	 * @generated
	 */
	public Adapter createTerminationSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.LastStepInFlow <em>Last Step In Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.LastStepInFlow
	 * @generated
	 */
	public Adapter createLastStepInFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.LastStepInPFlow <em>Last Step In PFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.LastStepInPFlow
	 * @generated
	 */
	public Adapter createLastStepInPFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Task2StepAfterMerge <em>Task2 Step After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Task2StepAfterMerge
	 * @generated
	 */
	public Adapter createTask2StepAfterMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.ChoiceSeq <em>Choice Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.ChoiceSeq
	 * @generated
	 */
	public Adapter createChoiceSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.ChoiceFirst <em>Choice First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.ChoiceFirst
	 * @generated
	 */
	public Adapter createChoiceFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.ChoiceAfterSplit <em>Choice After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.ChoiceAfterSplit
	 * @generated
	 */
	public Adapter createChoiceAfterSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Task2StepAfterChoiceDef <em>Task2 Step After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Task2StepAfterChoiceDef
	 * @generated
	 */
	public Adapter createTask2StepAfterChoiceDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Task2StepAfterChoice <em>Task2 Step After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Task2StepAfterChoice
	 * @generated
	 */
	public Adapter createTask2StepAfterChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.EmptyDefaulFlow <em>Empty Defaul Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.EmptyDefaulFlow
	 * @generated
	 */
	public Adapter createEmptyDefaulFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.LastStepInDefaultFlow <em>Last Step In Default Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.LastStepInDefaultFlow
	 * @generated
	 */
	public Adapter createLastStepInDefaultFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.SplitAfterMerge <em>Split After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.SplitAfterMerge
	 * @generated
	 */
	public Adapter createSplitAfterMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.ChoiceAfterMerge <em>Choice After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.ChoiceAfterMerge
	 * @generated
	 */
	public Adapter createChoiceAfterMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.LastStepInAltFlow <em>Last Step In Alt Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.LastStepInAltFlow
	 * @generated
	 */
	public Adapter createLastStepInAltFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.SplitAfterChoiceDef <em>Split After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.SplitAfterChoiceDef
	 * @generated
	 */
	public Adapter createSplitAfterChoiceDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.SplitAfterChoice <em>Split After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.SplitAfterChoice
	 * @generated
	 */
	public Adapter createSplitAfterChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.ChoiceAfterChoiceDef <em>Choice After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.ChoiceAfterChoiceDef
	 * @generated
	 */
	public Adapter createChoiceAfterChoiceDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.ChoiceAfterChoice <em>Choice After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.ChoiceAfterChoice
	 * @generated
	 */
	public Adapter createChoiceAfterChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.TerminationAfterMerge <em>Termination After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.TerminationAfterMerge
	 * @generated
	 */
	public Adapter createTerminationAfterMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.Task2StepAfterEmptyDef <em>Task2 Step After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.Task2StepAfterEmptyDef
	 * @generated
	 */
	public Adapter createTask2StepAfterEmptyDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.SplitAfterEmptyDef <em>Split After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.SplitAfterEmptyDef
	 * @generated
	 */
	public Adapter createSplitAfterEmptyDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bpmn2UseCase.Rules.ChoiceAfterEmptyDef <em>Choice After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bpmn2UseCase.Rules.ChoiceAfterEmptyDef
	 * @generated
	 */
	public Adapter createChoiceAfterEmptyDefAdapter() {
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
