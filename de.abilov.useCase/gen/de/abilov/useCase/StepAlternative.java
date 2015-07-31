/**
 */
package de.abilov.useCase;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.abilov.useCase.StepAlternative#getRef <em>Ref</em>}</li>
 *   <li>{@link de.abilov.useCase.StepAlternative#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link de.abilov.useCase.StepAlternative#get__hasContinue <em>has Continue</em>}</li>
 *   <li>{@link de.abilov.useCase.StepAlternative#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.abilov.useCase.UseCasePackage#getStepAlternative()
 * @model
 * @generated
 */
public interface StepAlternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(AlternativeFlow)
	 * @see de.abilov.useCase.UseCasePackage#getStepAlternative_Ref()
	 * @model
	 * @generated
	 */
	AlternativeFlow getRef();

	/**
	 * Sets the value of the '{@link de.abilov.useCase.StepAlternative#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(AlternativeFlow value);

	/**
	 * Returns the value of the '<em><b>Continuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continuation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continuation</em>' reference.
	 * @see #setContinuation(Step)
	 * @see de.abilov.useCase.UseCasePackage#getStepAlternative_Continuation()
	 * @model
	 * @generated
	 */
	Step getContinuation();

	/**
	 * Sets the value of the '{@link de.abilov.useCase.StepAlternative#getContinuation <em>Continuation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation</em>' reference.
	 * @see #getContinuation()
	 * @generated
	 */
	void setContinuation(Step value);

	/**
	 * Returns the value of the '<em><b>has Continue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>has Continue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>has Continue</em>' reference.
	 * @see #set__hasContinue(ChoiceStep)
	 * @see de.abilov.useCase.UseCasePackage#getStepAlternative___hasContinue()
	 * @model
	 * @generated
	 */
	ChoiceStep get__hasContinue();

	/**
	 * Sets the value of the '{@link de.abilov.useCase.StepAlternative#get__hasContinue <em>has Continue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>has Continue</em>' reference.
	 * @see #get__hasContinue()
	 * @generated
	 */
	void set__hasContinue(ChoiceStep value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see de.abilov.useCase.UseCasePackage#getStepAlternative_Condition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link de.abilov.useCase.StepAlternative#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // StepAlternative
