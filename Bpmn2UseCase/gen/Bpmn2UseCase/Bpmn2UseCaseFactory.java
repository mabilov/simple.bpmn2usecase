/**
 */
package Bpmn2UseCase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Bpmn2UseCase.Bpmn2UseCasePackage
 * @generated
 */
public interface Bpmn2UseCaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bpmn2UseCaseFactory eINSTANCE = Bpmn2UseCase.impl.Bpmn2UseCaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>P2UC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P2UC</em>'.
	 * @generated
	 */
	P2UC createP2UC();

	/**
	 * Returns a new object of class '<em>SF2F</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SF2F</em>'.
	 * @generated
	 */
	SF2F createSF2F();

	/**
	 * Returns a new object of class '<em>SE2BF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SE2BF</em>'.
	 * @generated
	 */
	SE2BF createSE2BF();

	/**
	 * Returns a new object of class '<em>EE2FS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EE2FS</em>'.
	 * @generated
	 */
	EE2FS createEE2FS();

	/**
	 * Returns a new object of class '<em>FN2S</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FN2S</em>'.
	 * @generated
	 */
	FN2S createFN2S();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bpmn2UseCasePackage getBpmn2UseCasePackage();

} //Bpmn2UseCaseFactory
