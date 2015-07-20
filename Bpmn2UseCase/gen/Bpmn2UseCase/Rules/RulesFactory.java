/**
 */
package Bpmn2UseCase.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Bpmn2UseCase.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = Bpmn2UseCase.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process2 Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process2 Use Case</em>'.
	 * @generated
	 */
	Process2UseCase createProcess2UseCase();

	/**
	 * Returns a new object of class '<em>PG2 Parallel Step After PG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PG2 Parallel Step After PG</em>'.
	 * @generated
	 */
	PG2ParallelStepAfterPG createPG2ParallelStepAfterPG();

	/**
	 * Returns a new object of class '<em>Task2 Normal Step Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task2 Normal Step Seq</em>'.
	 * @generated
	 */
	Task2NormalStepSeq createTask2NormalStepSeq();

	/**
	 * Returns a new object of class '<em>Task2 Normal Step First</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task2 Normal Step First</em>'.
	 * @generated
	 */
	Task2NormalStepFirst createTask2NormalStepFirst();

	/**
	 * Returns a new object of class '<em>PG2 Parallel Step Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PG2 Parallel Step Seq</em>'.
	 * @generated
	 */
	PG2ParallelStepSeq createPG2ParallelStepSeq();

	/**
	 * Returns a new object of class '<em>PG2 Parallel Step First</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PG2 Parallel Step First</em>'.
	 * @generated
	 */
	PG2ParallelStepFirst createPG2ParallelStepFirst();

	/**
	 * Returns a new object of class '<em>End Event2 Final State First</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event2 Final State First</em>'.
	 * @generated
	 */
	EndEvent2FinalStateFirst createEndEvent2FinalStateFirst();

	/**
	 * Returns a new object of class '<em>Task2 Normal Step After PG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task2 Normal Step After PG</em>'.
	 * @generated
	 */
	Task2NormalStepAfterPG createTask2NormalStepAfterPG();

	/**
	 * Returns a new object of class '<em>End Event2 Final State Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event2 Final State Seq</em>'.
	 * @generated
	 */
	EndEvent2FinalStateSeq createEndEvent2FinalStateSeq();

	/**
	 * Returns a new object of class '<em>Last Step In PFlow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Last Step In PFlow</em>'.
	 * @generated
	 */
	LastStepInPFlow createLastStepInPFlow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
