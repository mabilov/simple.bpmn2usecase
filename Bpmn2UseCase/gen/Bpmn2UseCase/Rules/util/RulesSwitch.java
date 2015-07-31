/**
 */
package bpmn2UseCase.Rules.util;

import TGGRuntime.AbstractRule;

import bpmn2UseCase.Rules.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bpmn2UseCase.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.PROCESS2_USE_CASE: {
			Process2UseCase process2UseCase = (Process2UseCase) theEObject;
			T result = caseProcess2UseCase(process2UseCase);
			if (result == null)
				result = caseAbstractRule(process2UseCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_STEP: {
			Task2Step task2Step = (Task2Step) theEObject;
			T result = caseTask2Step(task2Step);
			if (result == null)
				result = caseAbstractRule(task2Step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SPLIT: {
			Split split = (Split) theEObject;
			T result = caseSplit(split);
			if (result == null)
				result = caseAbstractRule(split);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SPLIT_AFTER_SPLIT: {
			SplitAfterSplit splitAfterSplit = (SplitAfterSplit) theEObject;
			T result = caseSplitAfterSplit(splitAfterSplit);
			if (result == null)
				result = caseAbstractRule(splitAfterSplit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_STEP_SEQ: {
			Task2StepSeq task2StepSeq = (Task2StepSeq) theEObject;
			T result = caseTask2StepSeq(task2StepSeq);
			if (result == null)
				result = caseAbstractRule(task2StepSeq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_STEP_FIRST: {
			Task2StepFirst task2StepFirst = (Task2StepFirst) theEObject;
			T result = caseTask2StepFirst(task2StepFirst);
			if (result == null)
				result = caseAbstractRule(task2StepFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SPLIT_SEQ: {
			SplitSeq splitSeq = (SplitSeq) theEObject;
			T result = caseSplitSeq(splitSeq);
			if (result == null)
				result = caseAbstractRule(splitSeq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SPLIT_FIRST: {
			SplitFirst splitFirst = (SplitFirst) theEObject;
			T result = caseSplitFirst(splitFirst);
			if (result == null)
				result = caseAbstractRule(splitFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TERMINATION_FIRST: {
			TerminationFirst terminationFirst = (TerminationFirst) theEObject;
			T result = caseTerminationFirst(terminationFirst);
			if (result == null)
				result = caseAbstractRule(terminationFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_STEP_AFTER_SPLIT: {
			Task2StepAfterSplit task2StepAfterSplit = (Task2StepAfterSplit) theEObject;
			T result = caseTask2StepAfterSplit(task2StepAfterSplit);
			if (result == null)
				result = caseAbstractRule(task2StepAfterSplit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TERMINATION: {
			Termination termination = (Termination) theEObject;
			T result = caseTermination(termination);
			if (result == null)
				result = caseAbstractRule(termination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TERMINATION_SEQ: {
			TerminationSeq terminationSeq = (TerminationSeq) theEObject;
			T result = caseTerminationSeq(terminationSeq);
			if (result == null)
				result = caseAbstractRule(terminationSeq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LAST_STEP_IN_FLOW: {
			LastStepInFlow lastStepInFlow = (LastStepInFlow) theEObject;
			T result = caseLastStepInFlow(lastStepInFlow);
			if (result == null)
				result = caseAbstractRule(lastStepInFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LAST_STEP_IN_PFLOW: {
			LastStepInPFlow lastStepInPFlow = (LastStepInPFlow) theEObject;
			T result = caseLastStepInPFlow(lastStepInPFlow);
			if (result == null)
				result = caseAbstractRule(lastStepInPFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CHOICE: {
			Choice choice = (Choice) theEObject;
			T result = caseChoice(choice);
			if (result == null)
				result = caseAbstractRule(choice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_STEP_AFTER_MERGE: {
			Task2StepAfterMerge task2StepAfterMerge = (Task2StepAfterMerge) theEObject;
			T result = caseTask2StepAfterMerge(task2StepAfterMerge);
			if (result == null)
				result = caseAbstractRule(task2StepAfterMerge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CHOICE_SEQ: {
			ChoiceSeq choiceSeq = (ChoiceSeq) theEObject;
			T result = caseChoiceSeq(choiceSeq);
			if (result == null)
				result = caseAbstractRule(choiceSeq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CHOICE_FIRST: {
			ChoiceFirst choiceFirst = (ChoiceFirst) theEObject;
			T result = caseChoiceFirst(choiceFirst);
			if (result == null)
				result = caseAbstractRule(choiceFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CHOICE_AFTER_SPLIT: {
			ChoiceAfterSplit choiceAfterSplit = (ChoiceAfterSplit) theEObject;
			T result = caseChoiceAfterSplit(choiceAfterSplit);
			if (result == null)
				result = caseAbstractRule(choiceAfterSplit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_STEP_AFTER_CHOICE_DEF: {
			Task2StepAfterChoiceDef task2StepAfterChoiceDef = (Task2StepAfterChoiceDef) theEObject;
			T result = caseTask2StepAfterChoiceDef(task2StepAfterChoiceDef);
			if (result == null)
				result = caseAbstractRule(task2StepAfterChoiceDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_STEP_AFTER_CHOICE: {
			Task2StepAfterChoice task2StepAfterChoice = (Task2StepAfterChoice) theEObject;
			T result = caseTask2StepAfterChoice(task2StepAfterChoice);
			if (result == null)
				result = caseAbstractRule(task2StepAfterChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EMPTY_DEFAUL_FLOW: {
			EmptyDefaulFlow emptyDefaulFlow = (EmptyDefaulFlow) theEObject;
			T result = caseEmptyDefaulFlow(emptyDefaulFlow);
			if (result == null)
				result = caseAbstractRule(emptyDefaulFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LAST_STEP_IN_DEFAULT_FLOW: {
			LastStepInDefaultFlow lastStepInDefaultFlow = (LastStepInDefaultFlow) theEObject;
			T result = caseLastStepInDefaultFlow(lastStepInDefaultFlow);
			if (result == null)
				result = caseAbstractRule(lastStepInDefaultFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SPLIT_AFTER_MERGE: {
			SplitAfterMerge splitAfterMerge = (SplitAfterMerge) theEObject;
			T result = caseSplitAfterMerge(splitAfterMerge);
			if (result == null)
				result = caseAbstractRule(splitAfterMerge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CHOICE_AFTER_MERGE: {
			ChoiceAfterMerge choiceAfterMerge = (ChoiceAfterMerge) theEObject;
			T result = caseChoiceAfterMerge(choiceAfterMerge);
			if (result == null)
				result = caseAbstractRule(choiceAfterMerge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.LAST_STEP_IN_ALT_FLOW: {
			LastStepInAltFlow lastStepInAltFlow = (LastStepInAltFlow) theEObject;
			T result = caseLastStepInAltFlow(lastStepInAltFlow);
			if (result == null)
				result = caseAbstractRule(lastStepInAltFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF: {
			SplitAfterChoiceDef splitAfterChoiceDef = (SplitAfterChoiceDef) theEObject;
			T result = caseSplitAfterChoiceDef(splitAfterChoiceDef);
			if (result == null)
				result = caseAbstractRule(splitAfterChoiceDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SPLIT_AFTER_CHOICE: {
			SplitAfterChoice splitAfterChoice = (SplitAfterChoice) theEObject;
			T result = caseSplitAfterChoice(splitAfterChoice);
			if (result == null)
				result = caseAbstractRule(splitAfterChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF: {
			ChoiceAfterChoiceDef choiceAfterChoiceDef = (ChoiceAfterChoiceDef) theEObject;
			T result = caseChoiceAfterChoiceDef(choiceAfterChoiceDef);
			if (result == null)
				result = caseAbstractRule(choiceAfterChoiceDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CHOICE_AFTER_CHOICE: {
			ChoiceAfterChoice choiceAfterChoice = (ChoiceAfterChoice) theEObject;
			T result = caseChoiceAfterChoice(choiceAfterChoice);
			if (result == null)
				result = caseAbstractRule(choiceAfterChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TERMINATION_AFTER_MERGE: {
			TerminationAfterMerge terminationAfterMerge = (TerminationAfterMerge) theEObject;
			T result = caseTerminationAfterMerge(terminationAfterMerge);
			if (result == null)
				result = caseAbstractRule(terminationAfterMerge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF: {
			Task2StepAfterEmptyDef task2StepAfterEmptyDef = (Task2StepAfterEmptyDef) theEObject;
			T result = caseTask2StepAfterEmptyDef(task2StepAfterEmptyDef);
			if (result == null)
				result = caseAbstractRule(task2StepAfterEmptyDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF: {
			SplitAfterEmptyDef splitAfterEmptyDef = (SplitAfterEmptyDef) theEObject;
			T result = caseSplitAfterEmptyDef(splitAfterEmptyDef);
			if (result == null)
				result = caseAbstractRule(splitAfterEmptyDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF: {
			ChoiceAfterEmptyDef choiceAfterEmptyDef = (ChoiceAfterEmptyDef) theEObject;
			T result = caseChoiceAfterEmptyDef(choiceAfterEmptyDef);
			if (result == null)
				result = caseAbstractRule(choiceAfterEmptyDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process2 Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process2 Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess2UseCase(Process2UseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2Step(Task2Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplit(Split object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split After Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split After Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitAfterSplit(SplitAfterSplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Step Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Step Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2StepSeq(Task2StepSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Step First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Step First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2StepFirst(Task2StepFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitSeq(SplitSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitFirst(SplitFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationFirst(TerminationFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Step After Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Step After Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2StepAfterSplit(Task2StepAfterSplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermination(Termination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationSeq(TerminationSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Step In Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Step In Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastStepInFlow(LastStepInFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Step In PFlow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Step In PFlow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastStepInPFlow(LastStepInPFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Step After Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Step After Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2StepAfterMerge(Task2StepAfterMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceSeq(ChoiceSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceFirst(ChoiceFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice After Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice After Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceAfterSplit(ChoiceAfterSplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Step After Choice Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Step After Choice Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2StepAfterChoiceDef(Task2StepAfterChoiceDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Step After Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Step After Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2StepAfterChoice(Task2StepAfterChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Defaul Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Defaul Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyDefaulFlow(EmptyDefaulFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Step In Default Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Step In Default Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastStepInDefaultFlow(LastStepInDefaultFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split After Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split After Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitAfterMerge(SplitAfterMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice After Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice After Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceAfterMerge(ChoiceAfterMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Step In Alt Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Step In Alt Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastStepInAltFlow(LastStepInAltFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split After Choice Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split After Choice Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitAfterChoiceDef(SplitAfterChoiceDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split After Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split After Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitAfterChoice(SplitAfterChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice After Choice Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice After Choice Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceAfterChoiceDef(ChoiceAfterChoiceDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice After Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice After Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceAfterChoice(ChoiceAfterChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Termination After Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Termination After Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminationAfterMerge(TerminationAfterMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Step After Empty Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Step After Empty Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2StepAfterEmptyDef(Task2StepAfterEmptyDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split After Empty Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split After Empty Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitAfterEmptyDef(SplitAfterEmptyDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice After Empty Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice After Empty Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceAfterEmptyDef(ChoiceAfterEmptyDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
