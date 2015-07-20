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
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_PG:
			return createPG2ParallelStepAfterPG();
		case RulesPackage.TASK2_NORMAL_STEP_SEQ:
			return createTask2NormalStepSeq();
		case RulesPackage.TASK2_NORMAL_STEP_FIRST:
			return createTask2NormalStepFirst();
		case RulesPackage.PG2_PARALLEL_STEP_SEQ:
			return createPG2ParallelStepSeq();
		case RulesPackage.PG2_PARALLEL_STEP_FIRST:
			return createPG2ParallelStepFirst();
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST:
			return createEndEvent2FinalStateFirst();
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG:
			return createTask2NormalStepAfterPG();
		case RulesPackage.END_EVENT2_FINAL_STATE_SEQ:
			return createEndEvent2FinalStateSeq();
		case RulesPackage.LAST_STEP_IN_PFLOW:
			return createLastStepInPFlow();
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
	public PG2ParallelStepAfterPG createPG2ParallelStepAfterPG() {
		PG2ParallelStepAfterPGImpl pg2ParallelStepAfterPG = new PG2ParallelStepAfterPGImpl();
		return pg2ParallelStepAfterPG;
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
	public Task2NormalStepFirst createTask2NormalStepFirst() {
		Task2NormalStepFirstImpl task2NormalStepFirst = new Task2NormalStepFirstImpl();
		return task2NormalStepFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PG2ParallelStepSeq createPG2ParallelStepSeq() {
		PG2ParallelStepSeqImpl pg2ParallelStepSeq = new PG2ParallelStepSeqImpl();
		return pg2ParallelStepSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PG2ParallelStepFirst createPG2ParallelStepFirst() {
		PG2ParallelStepFirstImpl pg2ParallelStepFirst = new PG2ParallelStepFirstImpl();
		return pg2ParallelStepFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent2FinalStateFirst createEndEvent2FinalStateFirst() {
		EndEvent2FinalStateFirstImpl endEvent2FinalStateFirst = new EndEvent2FinalStateFirstImpl();
		return endEvent2FinalStateFirst;
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
	public EndEvent2FinalStateSeq createEndEvent2FinalStateSeq() {
		EndEvent2FinalStateSeqImpl endEvent2FinalStateSeq = new EndEvent2FinalStateSeqImpl();
		return endEvent2FinalStateSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStepInPFlow createLastStepInPFlow() {
		LastStepInPFlowImpl lastStepInPFlow = new LastStepInPFlowImpl();
		return lastStepInPFlow;
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
