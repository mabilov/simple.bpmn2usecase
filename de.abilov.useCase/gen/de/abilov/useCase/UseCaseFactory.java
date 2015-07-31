/**
 */
package de.abilov.useCase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.abilov.useCase.UseCasePackage
 * @generated
 */
public interface UseCaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UseCaseFactory eINSTANCE = de.abilov.useCase.impl.UseCaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case</em>'.
	 * @generated
	 */
	UseCase createUseCase();

	/**
	 * Returns a new object of class '<em>Basic Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Flow</em>'.
	 * @generated
	 */
	BasicFlow createBasicFlow();

	/**
	 * Returns a new object of class '<em>Parallel Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Flow</em>'.
	 * @generated
	 */
	ParallelFlow createParallelFlow();

	/**
	 * Returns a new object of class '<em>Normal Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Step</em>'.
	 * @generated
	 */
	NormalStep createNormalStep();

	/**
	 * Returns a new object of class '<em>Parallel Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Step</em>'.
	 * @generated
	 */
	ParallelStep createParallelStep();

	/**
	 * Returns a new object of class '<em>UC Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UC Condition</em>'.
	 * @generated
	 */
	UCCondition createUCCondition();

	/**
	 * Returns a new object of class '<em>Alternative Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Flow</em>'.
	 * @generated
	 */
	AlternativeFlow createAlternativeFlow();

	/**
	 * Returns a new object of class '<em>Choice Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Step</em>'.
	 * @generated
	 */
	ChoiceStep createChoiceStep();

	/**
	 * Returns a new object of class '<em>Step Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Alternative</em>'.
	 * @generated
	 */
	StepAlternative createStepAlternative();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UseCasePackage getUseCasePackage();

} //UseCaseFactory
