/**
 */
package de.abilov.tgg.bpmn2useCase;

import TGGRuntime.AbstractCorrespondence;

import de.abilov.bpmn.Gateway;

import de.abilov.useCase.Step;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GW2S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.abilov.tgg.bpmn2useCase.GW2S#getSource <em>Source</em>}</li>
 *   <li>{@link de.abilov.tgg.bpmn2useCase.GW2S#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage#getGW2S()
 * @model
 * @generated
 */
public interface GW2S extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Gateway)
	 * @see de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage#getGW2S_Source()
	 * @model required="true"
	 * @generated
	 */
	Gateway getSource();

	/**
	 * Sets the value of the '{@link de.abilov.tgg.bpmn2useCase.GW2S#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Gateway value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Step)
	 * @see de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage#getGW2S_Target()
	 * @model required="true"
	 * @generated
	 */
	Step getTarget();

	/**
	 * Sets the value of the '{@link de.abilov.tgg.bpmn2useCase.GW2S#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Step value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // GW2S