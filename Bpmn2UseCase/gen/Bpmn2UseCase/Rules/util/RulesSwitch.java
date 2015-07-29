/**
 */
package Bpmn2UseCase.Rules.util;

import Bpmn2UseCase.Rules.*;

import TGGRuntime.AbstractRule;

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
 * @see Bpmn2UseCase.Rules.RulesPackage
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
		case RulesPackage.TASK2_NORMAL_STEP: {
			Task2NormalStep task2NormalStep = (Task2NormalStep) theEObject;
			T result = caseTask2NormalStep(task2NormalStep);
			if (result == null)
				result = caseAbstractRule(task2NormalStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PG2_PARALLEL_STEP: {
			PG2ParallelStep pg2ParallelStep = (PG2ParallelStep) theEObject;
			T result = casePG2ParallelStep(pg2ParallelStep);
			if (result == null)
				result = caseAbstractRule(pg2ParallelStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG: {
			PG2ParallelStepAfterPG pg2ParallelStepAfterPG = (PG2ParallelStepAfterPG) theEObject;
			T result = casePG2ParallelStepAfterPG(pg2ParallelStepAfterPG);
			if (result == null)
				result = caseAbstractRule(pg2ParallelStepAfterPG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_NORMAL_STEP_SEQ: {
			Task2NormalStepSeq task2NormalStepSeq = (Task2NormalStepSeq) theEObject;
			T result = caseTask2NormalStepSeq(task2NormalStepSeq);
			if (result == null)
				result = caseAbstractRule(task2NormalStepSeq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_NORMAL_STEP_FIRST: {
			Task2NormalStepFirst task2NormalStepFirst = (Task2NormalStepFirst) theEObject;
			T result = caseTask2NormalStepFirst(task2NormalStepFirst);
			if (result == null)
				result = caseAbstractRule(task2NormalStepFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PG2_PARALLEL_STEP_SEQ: {
			PG2ParallelStepSeq pg2ParallelStepSeq = (PG2ParallelStepSeq) theEObject;
			T result = casePG2ParallelStepSeq(pg2ParallelStepSeq);
			if (result == null)
				result = caseAbstractRule(pg2ParallelStepSeq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PG2_PARALLEL_STEP_FIRST: {
			PG2ParallelStepFirst pg2ParallelStepFirst = (PG2ParallelStepFirst) theEObject;
			T result = casePG2ParallelStepFirst(pg2ParallelStepFirst);
			if (result == null)
				result = caseAbstractRule(pg2ParallelStepFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST: {
			EndEvent2FinalStateFirst endEvent2FinalStateFirst = (EndEvent2FinalStateFirst) theEObject;
			T result = caseEndEvent2FinalStateFirst(endEvent2FinalStateFirst);
			if (result == null)
				result = caseAbstractRule(endEvent2FinalStateFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG: {
			Task2NormalStepAfterPG task2NormalStepAfterPG = (Task2NormalStepAfterPG) theEObject;
			T result = caseTask2NormalStepAfterPG(task2NormalStepAfterPG);
			if (result == null)
				result = caseAbstractRule(task2NormalStepAfterPG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.END_EVENT2_FINAL_STATE: {
			EndEvent2FinalState endEvent2FinalState = (EndEvent2FinalState) theEObject;
			T result = caseEndEvent2FinalState(endEvent2FinalState);
			if (result == null)
				result = caseAbstractRule(endEvent2FinalState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.END_EVENT2_FINAL_STATE_SEQ: {
			EndEvent2FinalStateSeq endEvent2FinalStateSeq = (EndEvent2FinalStateSeq) theEObject;
			T result = caseEndEvent2FinalStateSeq(endEvent2FinalStateSeq);
			if (result == null)
				result = caseAbstractRule(endEvent2FinalStateSeq);
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
		case RulesPackage.EG2_CHOICE: {
			EG2Choice eg2Choice = (EG2Choice) theEObject;
			T result = caseEG2Choice(eg2Choice);
			if (result == null)
				result = caseAbstractRule(eg2Choice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EG2_CHOICE_SEQ: {
			EG2ChoiceSeq eg2ChoiceSeq = (EG2ChoiceSeq) theEObject;
			T result = caseEG2ChoiceSeq(eg2ChoiceSeq);
			if (result == null)
				result = caseAbstractRule(eg2ChoiceSeq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EG2_CHOICE_FIRST: {
			EG2ChoiceFirst eg2ChoiceFirst = (EG2ChoiceFirst) theEObject;
			T result = caseEG2ChoiceFirst(eg2ChoiceFirst);
			if (result == null)
				result = caseAbstractRule(eg2ChoiceFirst);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EG2_CHOICE_AFTER_PG: {
			EG2ChoiceAfterPG eg2ChoiceAfterPG = (EG2ChoiceAfterPG) theEObject;
			T result = caseEG2ChoiceAfterPG(eg2ChoiceAfterPG);
			if (result == null)
				result = caseAbstractRule(eg2ChoiceAfterPG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_DEF_EG: {
			Task2NormalStepAfterDefEG task2NormalStepAfterDefEG = (Task2NormalStepAfterDefEG) theEObject;
			T result = caseTask2NormalStepAfterDefEG(task2NormalStepAfterDefEG);
			if (result == null)
				result = caseAbstractRule(task2NormalStepAfterDefEG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_EG: {
			Task2NormalStepAfterEG task2NormalStepAfterEG = (Task2NormalStepAfterEG) theEObject;
			T result = caseTask2NormalStepAfterEG(task2NormalStepAfterEG);
			if (result == null)
				result = caseAbstractRule(task2NormalStepAfterEG);
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
		case RulesPackage.LAST_STEP_IN_ALT_FLOW: {
			LastStepInAltFlow lastStepInAltFlow = (LastStepInAltFlow) theEObject;
			T result = caseLastStepInAltFlow(lastStepInAltFlow);
			if (result == null)
				result = caseAbstractRule(lastStepInAltFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_DEF_EG: {
			PG2ParallelStepAfterDefEG pg2ParallelStepAfterDefEG = (PG2ParallelStepAfterDefEG) theEObject;
			T result = casePG2ParallelStepAfterDefEG(pg2ParallelStepAfterDefEG);
			if (result == null)
				result = caseAbstractRule(pg2ParallelStepAfterDefEG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG: {
			PG2ParallelStepAfterEG pg2ParallelStepAfterEG = (PG2ParallelStepAfterEG) theEObject;
			T result = casePG2ParallelStepAfterEG(pg2ParallelStepAfterEG);
			if (result == null)
				result = caseAbstractRule(pg2ParallelStepAfterEG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EG2_CHOICE_STEP_AFTER_DEF_EG: {
			EG2ChoiceStepAfterDefEG eg2ChoiceStepAfterDefEG = (EG2ChoiceStepAfterDefEG) theEObject;
			T result = caseEG2ChoiceStepAfterDefEG(eg2ChoiceStepAfterDefEG);
			if (result == null)
				result = caseAbstractRule(eg2ChoiceStepAfterDefEG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.EG2_CHOICE_STEP_AFTER_EG: {
			EG2ChoiceStepAfterEG eg2ChoiceStepAfterEG = (EG2ChoiceStepAfterEG) theEObject;
			T result = caseEG2ChoiceStepAfterEG(eg2ChoiceStepAfterEG);
			if (result == null)
				result = caseAbstractRule(eg2ChoiceStepAfterEG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ: {
			EndEvent2FinalStateGWSeq endEvent2FinalStateGWSeq = (EndEvent2FinalStateGWSeq) theEObject;
			T result = caseEndEvent2FinalStateGWSeq(endEvent2FinalStateGWSeq);
			if (result == null)
				result = caseAbstractRule(endEvent2FinalStateGWSeq);
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
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Normal Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Normal Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2NormalStep(Task2NormalStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PG2 Parallel Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PG2 Parallel Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePG2ParallelStep(PG2ParallelStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PG2 Parallel Step After PG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PG2 Parallel Step After PG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePG2ParallelStepAfterPG(PG2ParallelStepAfterPG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Normal Step Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Normal Step Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2NormalStepSeq(Task2NormalStepSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Normal Step First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Normal Step First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2NormalStepFirst(Task2NormalStepFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PG2 Parallel Step Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PG2 Parallel Step Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePG2ParallelStepSeq(PG2ParallelStepSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PG2 Parallel Step First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PG2 Parallel Step First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePG2ParallelStepFirst(PG2ParallelStepFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event2 Final State First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event2 Final State First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent2FinalStateFirst(EndEvent2FinalStateFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Normal Step After PG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Normal Step After PG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2NormalStepAfterPG(Task2NormalStepAfterPG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event2 Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event2 Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent2FinalState(EndEvent2FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event2 Final State Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event2 Final State Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent2FinalStateSeq(EndEvent2FinalStateSeq object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EG2 Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EG2 Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEG2Choice(EG2Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EG2 Choice Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EG2 Choice Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEG2ChoiceSeq(EG2ChoiceSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EG2 Choice First</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EG2 Choice First</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEG2ChoiceFirst(EG2ChoiceFirst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EG2 Choice After PG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EG2 Choice After PG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEG2ChoiceAfterPG(EG2ChoiceAfterPG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Normal Step After Def EG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Normal Step After Def EG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2NormalStepAfterDefEG(Task2NormalStepAfterDefEG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task2 Normal Step After EG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task2 Normal Step After EG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask2NormalStepAfterEG(Task2NormalStepAfterEG object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>PG2 Parallel Step After Def EG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PG2 Parallel Step After Def EG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePG2ParallelStepAfterDefEG(PG2ParallelStepAfterDefEG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PG2 Parallel Step After EG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PG2 Parallel Step After EG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePG2ParallelStepAfterEG(PG2ParallelStepAfterEG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EG2 Choice Step After Def EG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EG2 Choice Step After Def EG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEG2ChoiceStepAfterDefEG(EG2ChoiceStepAfterDefEG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EG2 Choice Step After EG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EG2 Choice Step After EG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEG2ChoiceStepAfterEG(EG2ChoiceStepAfterEG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event2 Final State GW Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event2 Final State GW Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent2FinalStateGWSeq(EndEvent2FinalStateGWSeq object) {
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
