/**
 */
package Bpmn2UseCase;

import SimpleBPMN.ParallelGateway;

import SimpleUseCase.ParallelStep;

import TGGRuntime.AbstractCorrespondence;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PG2PS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Bpmn2UseCase.PG2PS#getSource <em>Source</em>}</li>
 *   <li>{@link Bpmn2UseCase.PG2PS#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getPG2PS()
 * @model
 * @generated
 */
public interface PG2PS extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ParallelGateway)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getPG2PS_Source()
	 * @model required="true"
	 * @generated
	 */
	ParallelGateway getSource();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.PG2PS#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ParallelGateway value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ParallelStep)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getPG2PS_Target()
	 * @model required="true"
	 * @generated
	 */
	ParallelStep getTarget();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.PG2PS#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ParallelStep value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // PG2PS
