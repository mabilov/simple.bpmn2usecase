/**
 */
package Bpmn2UseCase;

import SimpleUseCase.UseCase;

import TGGRuntime.AbstractCorrespondence;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>P2UC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Bpmn2UseCase.P2UC#getSource <em>Source</em>}</li>
 *   <li>{@link Bpmn2UseCase.P2UC#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getP2UC()
 * @model
 * @generated
 */
public interface P2UC extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SimpleBPMN.Process)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getP2UC_Source()
	 * @model required="true"
	 * @generated
	 */
	SimpleBPMN.Process getSource();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.P2UC#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SimpleBPMN.Process value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UseCase)
	 * @see Bpmn2UseCase.Bpmn2UseCasePackage#getP2UC_Target()
	 * @model required="true"
	 * @generated
	 */
	UseCase getTarget();

	/**
	 * Sets the value of the '{@link Bpmn2UseCase.P2UC#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UseCase value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // P2UC
