/**
 */
package de.abilov.tgg.bpmn2useCase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage
 * @generated
 */
public interface Bpmn2useCaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bpmn2useCaseFactory eINSTANCE = de.abilov.tgg.bpmn2useCase.impl.Bpmn2useCaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>P2UC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P2UC</em>'.
	 * @generated
	 */
	P2UC createP2UC();

	/**
	 * Returns a new object of class '<em>FN2F</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FN2F</em>'.
	 * @generated
	 */
	FN2F createFN2F();

	/**
	 * Returns a new object of class '<em>GW2S</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GW2S</em>'.
	 * @generated
	 */
	GW2S createGW2S();

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
	Bpmn2useCasePackage getBpmn2useCasePackage();

} //Bpmn2useCaseFactory
