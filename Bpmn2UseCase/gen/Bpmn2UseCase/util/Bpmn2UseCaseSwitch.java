/**
 */
package Bpmn2UseCase.util;

import Bpmn2UseCase.*;

import TGGRuntime.AbstractCorrespondence;

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
 * @see Bpmn2UseCase.Bpmn2UseCasePackage
 * @generated
 */
public class Bpmn2UseCaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Bpmn2UseCasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2UseCaseSwitch() {
		if (modelPackage == null) {
			modelPackage = Bpmn2UseCasePackage.eINSTANCE;
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
		case Bpmn2UseCasePackage.P2UC: {
			P2UC p2UC = (P2UC) theEObject;
			T result = caseP2UC(p2UC);
			if (result == null)
				result = caseAbstractCorrespondence(p2UC);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2UseCasePackage.SF2F: {
			SF2F sf2F = (SF2F) theEObject;
			T result = caseSF2F(sf2F);
			if (result == null)
				result = caseAbstractCorrespondence(sf2F);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2UseCasePackage.SE2BF: {
			SE2BF se2BF = (SE2BF) theEObject;
			T result = caseSE2BF(se2BF);
			if (result == null)
				result = caseAbstractCorrespondence(se2BF);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2UseCasePackage.EE2FS: {
			EE2FS ee2FS = (EE2FS) theEObject;
			T result = caseEE2FS(ee2FS);
			if (result == null)
				result = caseAbstractCorrespondence(ee2FS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2UseCasePackage.FN2S: {
			FN2S fn2S = (FN2S) theEObject;
			T result = caseFN2S(fn2S);
			if (result == null)
				result = caseAbstractCorrespondence(fn2S);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P2UC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P2UC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP2UC(P2UC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SF2F</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SF2F</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSF2F(SF2F object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SE2BF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SE2BF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSE2BF(SE2BF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EE2FS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EE2FS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEE2FS(EE2FS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FN2S</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FN2S</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFN2S(FN2S object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
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

} //Bpmn2UseCaseSwitch
