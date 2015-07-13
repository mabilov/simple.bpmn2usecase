/**
 */
package Bpmn2UseCase;

import SimpleBPMN.Task;

import SimpleUseCase.NormalStep;

import TGGRuntime.AbstractCorrespondence;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>T2NS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Bpmn2UseCase.T2NS#getSource <em>Source</em>}</li>
 *   <li>{@link Bpmn2UseCase.T2NS#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getT2NS()
 * @model
 * @generated
 */
public interface T2NS extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Task)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getT2NS_Source()
	 * @model required="true"
	 * @generated
	 */
	Task getSource();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.T2NS#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Task value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NormalStep)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getT2NS_Target()
	 * @model required="true"
	 * @generated
	 */
	NormalStep getTarget();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.T2NS#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NormalStep value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // T2NS
