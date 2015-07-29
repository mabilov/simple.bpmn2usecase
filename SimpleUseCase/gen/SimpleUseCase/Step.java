/**
 */
package SimpleUseCase;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleUseCase.Step#getNext <em>Next</em>}</li>
 *   <li>{@link SimpleUseCase.Step#get__last <em>last</em>}</li>
 *   <li>{@link SimpleUseCase.Step#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleUseCase.SimpleUseCasePackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Step)
	 * @see SimpleUseCase.SimpleUseCasePackage#getStep_Next()
	 * @model
	 * @generated
	 */
	Step getNext();

	/**
	 * Sets the value of the '{@link SimpleUseCase.Step#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Step value);

	/**
	 * Returns the value of the '<em><b>last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>last</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>last</em>' reference.
	 * @see #set__last(UCCondition)
	 * @see SimpleUseCase.SimpleUseCasePackage#getStep___last()
	 * @model
	 * @generated
	 */
	UCCondition get__last();

	/**
	 * Sets the value of the '{@link SimpleUseCase.Step#get__last <em>last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>last</em>' reference.
	 * @see #get__last()
	 * @generated
	 */
	void set__last(UCCondition value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see SimpleUseCase.SimpleUseCasePackage#getStep_Id()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link SimpleUseCase.Step#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	// <-- [user code injected with eMoflon]
	String export();
	// [user code injected with eMoflon] -->
} // Step
