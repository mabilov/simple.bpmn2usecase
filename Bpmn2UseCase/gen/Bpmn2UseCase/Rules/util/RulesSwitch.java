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
