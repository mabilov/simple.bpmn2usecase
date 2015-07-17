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
 *   <li>{@link SimpleUseCase.ChoiceStep#getAlternativeFlows <em>Alternative Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleUseCase.SimpleUseCasePackage#getChoiceStep()
 * @model
 * @generated
 */
public interface ChoiceStep extends Step {
	/**
	 * Returns the value of the '<em><b>Alternative Flows</b></em>' reference list.
	 * The list contents are of type {@link SimpleUseCase.AlternativeFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Flows</em>' reference list.
	 * @see SimpleUseCase.SimpleUseCasePackage#getChoiceStep_AlternativeFlows()
	 * @model
	 * @generated
	 */
	EList<AlternativeFlow> getAlternativeFlows();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ChoiceStep
