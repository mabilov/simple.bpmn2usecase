/**
 */
package Bpmn2UseCase;

import SimpleBPMN.StartEvent;

import SimpleUseCase.BasicFlow;

import TGGRuntime.AbstractCorrespondence;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SE2BF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Bpmn2UseCase.SE2BF#getSource <em>Source</em>}</li>
 *   <li>{@link Bpmn2UseCase.SE2BF#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getSE2BF()
 * @model
 * @generated
 */
public interface SE2BF extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StartEvent)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getSE2BF_Source()
	 * @model required="true"
	 * @generated
	 */
	StartEvent getSource();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.SE2BF#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StartEvent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(BasicFlow)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getSE2BF_Target()
	 * @model required="true"
	 * @generated
	 */
	BasicFlow getTarget();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.SE2BF#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(BasicFlow value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SE2BF
