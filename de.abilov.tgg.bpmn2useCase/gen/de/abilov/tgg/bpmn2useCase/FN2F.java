/**
 */
package de.abilov.tgg.bpmn2useCase;

import TGGRuntime.AbstractCorrespondence;

import de.abilov.bpmn.FlowNode;

import de.abilov.useCase.Flow;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FN2F</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.abilov.tgg.bpmn2useCase.FN2F#getSource <em>Source</em>}</li>
 *   <li>{@link de.abilov.tgg.bpmn2useCase.FN2F#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage#getFN2F()
 * @model
 * @generated
 */
public interface FN2F extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(FlowNode)
	 * @see de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage#getFN2F_Source()
	 * @model required="true"
	 * @generated
	 */
	FlowNode getSource();

	/**
	 * Sets the value of the '{@link de.abilov.tgg.bpmn2useCase.FN2F#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FlowNode value);

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
	 * @see de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage#getFN2F_Target()
	 * @model required="true"
	 * @generated
	 */
	Flow getTarget();

	/**
	 * Sets the value of the '{@link de.abilov.tgg.bpmn2useCase.FN2F#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Flow value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // FN2F
