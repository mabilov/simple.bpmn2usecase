/**
 */
package de.abilov.useCase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.abilov.useCase.Flow#getSteps <em>Steps</em>}</li>
 *   <li>{@link de.abilov.useCase.Flow#getFinalState <em>Final State</em>}</li>
 *   <li>{@link de.abilov.useCase.Flow#get__last <em>last</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.abilov.useCase.UseCasePackage#getFlow()
 * @model abstract="true"
 * @generated
 */
public interface Flow extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link de.abilov.useCase.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see de.abilov.useCase.UseCasePackage#getFlow_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' containment reference.
	 * @see #setFinalState(UCCondition)
	 * @see de.abilov.useCase.UseCasePackage#getFlow_FinalState()
	 * @model containment="true"
	 * @generated
	 */
	UCCondition getFinalState();

	/**
	 * Sets the value of the '{@link de.abilov.useCase.Flow#getFinalState <em>Final State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final State</em>' containment reference.
	 * @see #getFinalState()
	 * @generated
	 */
	void setFinalState(UCCondition value);

	/**
	 * Returns the value of the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>last</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>last</em>' reference.
	 * @see #set__last(Step)
	 * @see de.abilov.useCase.UseCasePackage#getFlow___last()
	 * @model
	 * @generated
	 */
	Step get__last();

	/**
	 * Sets the value of the '{@link de.abilov.useCase.Flow#get__last <em>last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>last</em>' reference.
	 * @see #get__last()
	 * @generated
	 */
	void set__last(Step value);

	// <-- [user code injected with eMoflon]
	/**
	 * Export flow to string, so it can be compared to another
	 * @return string representation of the flow
	 */
	String export();

	/**
	 * Find first step in the flow, this is the one that doesn't have the precedence
	 * @return first step
	 */
	Step findFirst();

	/**
	 * Find last step in the flow, this is one that doesn't have the next
	 * @return last step
	 */
	Step findLast();
	// [user code injected with eMoflon] -->
} // Flow
