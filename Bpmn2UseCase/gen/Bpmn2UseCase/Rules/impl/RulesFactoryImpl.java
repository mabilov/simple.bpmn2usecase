/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Rules.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RulesPackage.PROCESS2_USE_CASE:
			return createProcess2UseCase();
		case RulesPackage.TASK2_NORMAL_STEP_SEQ:
			return createTask2NormalStepSeq();
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_SE:
			return createTask2NormalStepAfterSE();
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG:
			return createTask2NormalStepAfterPG();
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_SEQ:
			return createParallelGateway2ParallelStepSeq();
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_SE:
			return createParallelGateway2ParallelStepAfterSE();
		case RulesPackage.PARALLEL_GATEWAY2_PARALLEL_STEP_AFTER_PG:
			return createParallelGateway2ParallelStepAfterPG();
		case RulesPackage.SEQUENCE_FLOW_AFTER_PG2_PARALLEL_FLOW:
			return createSequenceFlowAfterPG2ParallelFlow();
		case RulesPackage.END_EVENT2_FINAL_STATE:
			return createEndEvent2FinalState();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Process2UseCase createProcess2UseCase() {
		Process2UseCaseImpl process2UseCase = new Process2UseCaseImpl();
		return process2UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2NormalStepSeq createTask2NormalStepSeq() {
		Task2NormalStepSeqImpl task2NormalStepSeq = new Task2NormalStepSeqImpl();
		return task2NormalStepSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2NormalStepAfterSE createTask2NormalStepAfterSE() {
		Task2NormalStepAfterSEImpl task2NormalStepAfterSE = new Task2NormalStepAfterSEImpl();
		return task2NormalStepAfterSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2NormalStepAfterPG createTask2NormalStepAfterPG() {
		Task2NormalStepAfterPGImpl task2NormalStepAfterPG = new Task2NormalStepAfterPGImpl();
		return task2NormalStepAfterPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway2ParallelStepSeq createParallelGateway2ParallelStepSeq() {
		ParallelGateway2ParallelStepSeqImpl parallelGateway2ParallelStepSeq = new ParallelGateway2ParallelStepSeqImpl();
		return parallelGateway2ParallelStepSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway2ParallelStepAfterSE createParallelGateway2ParallelStepAfterSE() {
		ParallelGateway2ParallelStepAfterSEImpl parallelGateway2ParallelStepAfterSE = new ParallelGateway2ParallelStepAfterSEImpl();
		return parallelGateway2ParallelStepAfterSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway2ParallelStepAfterPG createParallelGateway2ParallelStepAfterPG() {
		ParallelGateway2ParallelStepAfterPGImpl parallelGateway2ParallelStepAfterPG = new ParallelGateway2ParallelStepAfterPGImpl();
		return parallelGateway2ParallelStepAfterPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlowAfterPG2ParallelFlow createSequenceFlowAfterPG2ParallelFlow() {
		SequenceFlowAfterPG2ParallelFlowImpl sequenceFlowAfterPG2ParallelFlow = new SequenceFlowAfterPG2ParallelFlowImpl();
		return sequenceFlowAfterPG2ParallelFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent2FinalState createEndEvent2FinalState() {
		EndEvent2FinalStateImpl endEvent2FinalState = new EndEvent2FinalStateImpl();
		return endEvent2FinalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
