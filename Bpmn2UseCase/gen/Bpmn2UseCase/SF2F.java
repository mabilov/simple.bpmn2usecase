/**
 */
package Bpmn2UseCase;

import SimpleBPMN.SequenceFlow;

import SimpleUseCase.Flow;

import TGGRuntime.AbstractCorrespondence;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SF2F</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Bpmn2UseCase.SF2F#getSource <em>Source</em>}</li>
 *   <li>{@link Bpmn2UseCase.SF2F#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getSF2F()
 * @model
 * @generated
 */
public interface SF2F extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SequenceFlow)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getSF2F_Source()
	 * @model required="true"
	 * @generated
	 */
	SequenceFlow getSource();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.SF2F#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SequenceFlow value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Flow)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getSF2F_Target()
	 * @model required="true"
	 * @generated
	 */
	Flow getTarget();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.SF2F#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Flow value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SF2F
