/**
 */
package SimpleUseCase;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleUseCase.ChoiceStep#getStepAlternatives <em>Step Alternatives</em>}</li>
 *   <li>{@link SimpleUseCase.ChoiceStep#get__lastInDef <em>last In Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleUseCase.SimpleUseCasePackage#getChoiceStep()
 * @model
 * @generated
 */
public interface ChoiceStep extends Step {
	/**
	 * Returns the value of the '<em><b>Step Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleUseCase.StepAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Alternatives</em>' containment reference list.
	 * @see SimpleUseCase.SimpleUseCasePackage#getChoiceStep_StepAlternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<StepAlternative> getStepAlternatives();

	/**
	 * Returns the value of the '<em><b>last In Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>last In Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>last In Def</em>' reference.
	 * @see #set__lastInDef(Step)
	 * @see SimpleUseCase.SimpleUseCasePackage#getChoiceStep___lastInDef()
	 * @model
	 * @generated
	 */
	Step get__lastInDef();

	/**
	 * Sets the value of the '{@link SimpleUseCase.ChoiceStep#get__lastInDef <em>last In Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>last In Def</em>' reference.
	 * @see #get__lastInDef()
	 * @generated
	 */
	void set__lastInDef(Step value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ChoiceStep
