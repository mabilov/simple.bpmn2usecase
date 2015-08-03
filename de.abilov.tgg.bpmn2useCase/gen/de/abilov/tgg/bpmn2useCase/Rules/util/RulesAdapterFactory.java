/**
 */
package de.abilov.tgg.bpmn2useCase.Rules.util;

import TGGRuntime.AbstractRule;

import de.abilov.tgg.bpmn2useCase.Rules.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.abilov.tgg.bpmn2useCase.Rules.RulesPackage
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
		public Adapter caseT2SSeq(T2SSeq object) {
			return createT2SSeqAdapter();
		}

		@Override
		public Adapter caseT2SFirst(T2SFirst object) {
			return createT2SFirstAdapter();
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
		public Adapter caseT2SAfterSplit(T2SAfterSplit object) {
			return createT2SAfterSplitAdapter();
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
		public Adapter caseT2SAfterMerge(T2SAfterMerge object) {
			return createT2SAfterMergeAdapter();
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
		public Adapter caseT2SAfterChoiceDef(T2SAfterChoiceDef object) {
			return createT2SAfterChoiceDefAdapter();
		}

		@Override
		public Adapter caseT2SAfterChoice(T2SAfterChoice object) {
			return createT2SAfterChoiceAdapter();
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
		public Adapter caseT2SAfterEmptyDef(T2SAfterEmptyDef object) {
			return createT2SAfterEmptyDefAdapter();
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
		public Adapter caseT2SAfterTask(T2SAfterTask object) {
			return createT2SAfterTaskAdapter();
		}

		@Override
		public Adapter caseT2SAfterSync(T2SAfterSync object) {
			return createT2SAfterSyncAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase <em>Process2 Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase
	 * @generated
	 */
	public Adapter createProcess2UseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.Task2Step <em>Task2 Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Task2Step
	 * @generated
	 */
	public Adapter createTask2StepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Split
	 * @generated
	 */
	public Adapter createSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit <em>Split After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterSplit
	 * @generated
	 */
	public Adapter createSplitAfterSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SSeq <em>T2S Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SSeq
	 * @generated
	 */
	public Adapter createT2SSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SFirst <em>T2S First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SFirst
	 * @generated
	 */
	public Adapter createT2SFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitSeq <em>Split Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitSeq
	 * @generated
	 */
	public Adapter createSplitSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitFirst <em>Split First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitFirst
	 * @generated
	 */
	public Adapter createSplitFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst <em>Termination First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationFirst
	 * @generated
	 */
	public Adapter createTerminationFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit <em>T2S After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit
	 * @generated
	 */
	public Adapter createT2SAfterSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.Termination <em>Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Termination
	 * @generated
	 */
	public Adapter createTerminationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq <em>Termination Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationSeq
	 * @generated
	 */
	public Adapter createTerminationSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInFlow <em>Last Step In Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInFlow
	 * @generated
	 */
	public Adapter createLastStepInFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow <em>Last Step In PFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInPFlow
	 * @generated
	 */
	public Adapter createLastStepInPFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge <em>T2S After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge
	 * @generated
	 */
	public Adapter createT2SAfterMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq <em>Choice Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceSeq
	 * @generated
	 */
	public Adapter createChoiceSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst <em>Choice First</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceFirst
	 * @generated
	 */
	public Adapter createChoiceFirstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit <em>Choice After Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterSplit
	 * @generated
	 */
	public Adapter createChoiceAfterSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef <em>T2S After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef
	 * @generated
	 */
	public Adapter createT2SAfterChoiceDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice <em>T2S After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoice
	 * @generated
	 */
	public Adapter createT2SAfterChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow <em>Empty Defaul Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.EmptyDefaulFlow
	 * @generated
	 */
	public Adapter createEmptyDefaulFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow <em>Last Step In Default Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInDefaultFlow
	 * @generated
	 */
	public Adapter createLastStepInDefaultFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge <em>Split After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge
	 * @generated
	 */
	public Adapter createSplitAfterMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge <em>Choice After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge
	 * @generated
	 */
	public Adapter createChoiceAfterMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow <em>Last Step In Alt Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.LastStepInAltFlow
	 * @generated
	 */
	public Adapter createLastStepInAltFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef <em>Split After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoiceDef
	 * @generated
	 */
	public Adapter createSplitAfterChoiceDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice <em>Split After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterChoice
	 * @generated
	 */
	public Adapter createSplitAfterChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef <em>Choice After Choice Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef
	 * @generated
	 */
	public Adapter createChoiceAfterChoiceDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice <em>Choice After Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice
	 * @generated
	 */
	public Adapter createChoiceAfterChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge <em>Termination After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.TerminationAfterMerge
	 * @generated
	 */
	public Adapter createTerminationAfterMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef <em>T2S After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterEmptyDef
	 * @generated
	 */
	public Adapter createT2SAfterEmptyDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef <em>Split After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.SplitAfterEmptyDef
	 * @generated
	 */
	public Adapter createSplitAfterEmptyDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef <em>Choice After Empty Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef
	 * @generated
	 */
	public Adapter createChoiceAfterEmptyDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask <em>T2S After Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterTask
	 * @generated
	 */
	public Adapter createT2SAfterTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync <em>T2S After Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSync
	 * @generated
	 */
	public Adapter createT2SAfterSyncAdapter() {
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
