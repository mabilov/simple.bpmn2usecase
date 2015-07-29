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
		case RulesPackage.EG2_CHOICE_SEQ:
			return createEG2ChoiceSeq();
		case RulesPackage.EG2_CHOICE_FIRST:
			return createEG2ChoiceFirst();
		case RulesPackage.EG2_CHOICE_AFTER_PG:
			return createEG2ChoiceAfterPG();
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_DEF_EG:
			return createTask2NormalStepAfterDefEG();
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_EG:
			return createTask2NormalStepAfterEG();
		case RulesPackage.CLASS1:
			return createClass1();
		case RulesPackage.LAST_STEP_IN_ALT_FLOW:
			return createLastStepInAltFlow();
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_DEF_EG:
			return createPG2ParallelStepAfterDefEG();
		case RulesPackage.PG2_PARALLEL_STEP_AFTER_EG:
			return createPG2ParallelStepAfterEG();
		case RulesPackage.EG2_CHOICE_STEP_AFTER_DEF_EG:
			return createEG2ChoiceStepAfterDefEG();
		case RulesPackage.EG2_CHOICE_STEP_AFTER_EG:
			return createEG2ChoiceStepAfterEG();
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ:
			return createEndEvent2FinalStateGWSeq();
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
	public EG2ChoiceSeq createEG2ChoiceSeq() {
		EG2ChoiceSeqImpl eg2ChoiceSeq = new EG2ChoiceSeqImpl();
		return eg2ChoiceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EG2ChoiceFirst createEG2ChoiceFirst() {
		EG2ChoiceFirstImpl eg2ChoiceFirst = new EG2ChoiceFirstImpl();
		return eg2ChoiceFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EG2ChoiceAfterPG createEG2ChoiceAfterPG() {
		EG2ChoiceAfterPGImpl eg2ChoiceAfterPG = new EG2ChoiceAfterPGImpl();
		return eg2ChoiceAfterPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2NormalStepAfterDefEG createTask2NormalStepAfterDefEG() {
		Task2NormalStepAfterDefEGImpl task2NormalStepAfterDefEG = new Task2NormalStepAfterDefEGImpl();
		return task2NormalStepAfterDefEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2NormalStepAfterEG createTask2NormalStepAfterEG() {
		Task2NormalStepAfterEGImpl task2NormalStepAfterEG = new Task2NormalStepAfterEGImpl();
		return task2NormalStepAfterEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class1 createClass1() {
		Class1Impl class1 = new Class1Impl();
		return class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStepInAltFlow createLastStepInAltFlow() {
		LastStepInAltFlowImpl lastStepInAltFlow = new LastStepInAltFlowImpl();
		return lastStepInAltFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PG2ParallelStepAfterDefEG createPG2ParallelStepAfterDefEG() {
		PG2ParallelStepAfterDefEGImpl pg2ParallelStepAfterDefEG = new PG2ParallelStepAfterDefEGImpl();
		return pg2ParallelStepAfterDefEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PG2ParallelStepAfterEG createPG2ParallelStepAfterEG() {
		PG2ParallelStepAfterEGImpl pg2ParallelStepAfterEG = new PG2ParallelStepAfterEGImpl();
		return pg2ParallelStepAfterEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EG2ChoiceStepAfterDefEG createEG2ChoiceStepAfterDefEG() {
		EG2ChoiceStepAfterDefEGImpl eg2ChoiceStepAfterDefEG = new EG2ChoiceStepAfterDefEGImpl();
		return eg2ChoiceStepAfterDefEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EG2ChoiceStepAfterEG createEG2ChoiceStepAfterEG() {
		EG2ChoiceStepAfterEGImpl eg2ChoiceStepAfterEG = new EG2ChoiceStepAfterEGImpl();
		return eg2ChoiceStepAfterEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent2FinalStateGWSeq createEndEvent2FinalStateGWSeq() {
		EndEvent2FinalStateGWSeqImpl endEvent2FinalStateGWSeq = new EndEvent2FinalStateGWSeqImpl();
		return endEvent2FinalStateGWSeq;
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
