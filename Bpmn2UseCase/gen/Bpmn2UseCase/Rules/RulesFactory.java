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
	 * Returns a new object of class '<em>Task2 Normal Step Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task2 Normal Step Seq</em>'.
	 * @generated
	 */
	Task2NormalStepSeq createTask2NormalStepSeq();

	/**
	 * Returns a new object of class '<em>Task2 Normal Step After SE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task2 Normal Step After SE</em>'.
	 * @generated
	 */
	Task2NormalStepAfterSE createTask2NormalStepAfterSE();

	/**
	 * Returns a new object of class '<em>Task2 Normal Step After PG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task2 Normal Step After PG</em>'.
	 * @generated
	 */
	Task2NormalStepAfterPG createTask2NormalStepAfterPG();

	/**
	 * Returns a new object of class '<em>Parallel Gateway2 Parallel Step Seq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Gateway2 Parallel Step Seq</em>'.
	 * @generated
	 */
	ParallelGateway2ParallelStepSeq createParallelGateway2ParallelStepSeq();

	/**
	 * Returns a new object of class '<em>Parallel Gateway2 Parallel Step After SE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Gateway2 Parallel Step After SE</em>'.
	 * @generated
	 */
	ParallelGateway2ParallelStepAfterSE createParallelGateway2ParallelStepAfterSE();

	/**
	 * Returns a new object of class '<em>Parallel Gateway2 Parallel Step After PG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Gateway2 Parallel Step After PG</em>'.
	 * @generated
	 */
	ParallelGateway2ParallelStepAfterPG createParallelGateway2ParallelStepAfterPG();

	/**
	 * Returns a new object of class '<em>Sequence Flow After PG2 Parallel Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Flow After PG2 Parallel Flow</em>'.
	 * @generated
	 */
	SequenceFlowAfterPG2ParallelFlow createSequenceFlowAfterPG2ParallelFlow();

	/**
	 * Returns a new object of class '<em>End Event2 Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event2 Final State</em>'.
	 * @generated
	 */
	EndEvent2FinalState createEndEvent2FinalState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
