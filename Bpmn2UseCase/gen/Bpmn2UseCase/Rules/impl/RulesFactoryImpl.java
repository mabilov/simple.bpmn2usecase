/**
 */
package bpmn2UseCase.Rules.impl;

import bpmn2UseCase.Rules.*;

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
		case RulesPackage.SPLIT_AFTER_SPLIT:
			return createSplitAfterSplit();
		case RulesPackage.TASK2_STEP_SEQ:
			return createTask2StepSeq();
		case RulesPackage.TASK2_STEP_FIRST:
			return createTask2StepFirst();
		case RulesPackage.SPLIT_SEQ:
			return createSplitSeq();
		case RulesPackage.SPLIT_FIRST:
			return createSplitFirst();
		case RulesPackage.TERMINATION_FIRST:
			return createTerminationFirst();
		case RulesPackage.TASK2_STEP_AFTER_SPLIT:
			return createTask2StepAfterSplit();
		case RulesPackage.TERMINATION_SEQ:
			return createTerminationSeq();
		case RulesPackage.LAST_STEP_IN_PFLOW:
			return createLastStepInPFlow();
		case RulesPackage.TASK2_STEP_AFTER_MERGE:
			return createTask2StepAfterMerge();
		case RulesPackage.CHOICE_SEQ:
			return createChoiceSeq();
		case RulesPackage.CHOICE_FIRST:
			return createChoiceFirst();
		case RulesPackage.CHOICE_AFTER_SPLIT:
			return createChoiceAfterSplit();
		case RulesPackage.TASK2_STEP_AFTER_CHOICE_DEF:
			return createTask2StepAfterChoiceDef();
		case RulesPackage.TASK2_STEP_AFTER_CHOICE:
			return createTask2StepAfterChoice();
		case RulesPackage.EMPTY_DEFAUL_FLOW:
			return createEmptyDefaulFlow();
		case RulesPackage.LAST_STEP_IN_DEFAULT_FLOW:
			return createLastStepInDefaultFlow();
		case RulesPackage.SPLIT_AFTER_MERGE:
			return createSplitAfterMerge();
		case RulesPackage.CHOICE_AFTER_MERGE:
			return createChoiceAfterMerge();
		case RulesPackage.LAST_STEP_IN_ALT_FLOW:
			return createLastStepInAltFlow();
		case RulesPackage.SPLIT_AFTER_CHOICE_DEF:
			return createSplitAfterChoiceDef();
		case RulesPackage.SPLIT_AFTER_CHOICE:
			return createSplitAfterChoice();
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF:
			return createChoiceAfterChoiceDef();
		case RulesPackage.CHOICE_AFTER_CHOICE:
			return createChoiceAfterChoice();
		case RulesPackage.TERMINATION_AFTER_MERGE:
			return createTerminationAfterMerge();
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF:
			return createTask2StepAfterEmptyDef();
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF:
			return createSplitAfterEmptyDef();
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF:
			return createChoiceAfterEmptyDef();
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
	public SplitAfterSplit createSplitAfterSplit() {
		SplitAfterSplitImpl splitAfterSplit = new SplitAfterSplitImpl();
		return splitAfterSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2StepSeq createTask2StepSeq() {
		Task2StepSeqImpl task2StepSeq = new Task2StepSeqImpl();
		return task2StepSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2StepFirst createTask2StepFirst() {
		Task2StepFirstImpl task2StepFirst = new Task2StepFirstImpl();
		return task2StepFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitSeq createSplitSeq() {
		SplitSeqImpl splitSeq = new SplitSeqImpl();
		return splitSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitFirst createSplitFirst() {
		SplitFirstImpl splitFirst = new SplitFirstImpl();
		return splitFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminationFirst createTerminationFirst() {
		TerminationFirstImpl terminationFirst = new TerminationFirstImpl();
		return terminationFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2StepAfterSplit createTask2StepAfterSplit() {
		Task2StepAfterSplitImpl task2StepAfterSplit = new Task2StepAfterSplitImpl();
		return task2StepAfterSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminationSeq createTerminationSeq() {
		TerminationSeqImpl terminationSeq = new TerminationSeqImpl();
		return terminationSeq;
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
	public Task2StepAfterMerge createTask2StepAfterMerge() {
		Task2StepAfterMergeImpl task2StepAfterMerge = new Task2StepAfterMergeImpl();
		return task2StepAfterMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceSeq createChoiceSeq() {
		ChoiceSeqImpl choiceSeq = new ChoiceSeqImpl();
		return choiceSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceFirst createChoiceFirst() {
		ChoiceFirstImpl choiceFirst = new ChoiceFirstImpl();
		return choiceFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceAfterSplit createChoiceAfterSplit() {
		ChoiceAfterSplitImpl choiceAfterSplit = new ChoiceAfterSplitImpl();
		return choiceAfterSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2StepAfterChoiceDef createTask2StepAfterChoiceDef() {
		Task2StepAfterChoiceDefImpl task2StepAfterChoiceDef = new Task2StepAfterChoiceDefImpl();
		return task2StepAfterChoiceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2StepAfterChoice createTask2StepAfterChoice() {
		Task2StepAfterChoiceImpl task2StepAfterChoice = new Task2StepAfterChoiceImpl();
		return task2StepAfterChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyDefaulFlow createEmptyDefaulFlow() {
		EmptyDefaulFlowImpl emptyDefaulFlow = new EmptyDefaulFlowImpl();
		return emptyDefaulFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStepInDefaultFlow createLastStepInDefaultFlow() {
		LastStepInDefaultFlowImpl lastStepInDefaultFlow = new LastStepInDefaultFlowImpl();
		return lastStepInDefaultFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitAfterMerge createSplitAfterMerge() {
		SplitAfterMergeImpl splitAfterMerge = new SplitAfterMergeImpl();
		return splitAfterMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceAfterMerge createChoiceAfterMerge() {
		ChoiceAfterMergeImpl choiceAfterMerge = new ChoiceAfterMergeImpl();
		return choiceAfterMerge;
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
	public SplitAfterChoiceDef createSplitAfterChoiceDef() {
		SplitAfterChoiceDefImpl splitAfterChoiceDef = new SplitAfterChoiceDefImpl();
		return splitAfterChoiceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitAfterChoice createSplitAfterChoice() {
		SplitAfterChoiceImpl splitAfterChoice = new SplitAfterChoiceImpl();
		return splitAfterChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceAfterChoiceDef createChoiceAfterChoiceDef() {
		ChoiceAfterChoiceDefImpl choiceAfterChoiceDef = new ChoiceAfterChoiceDefImpl();
		return choiceAfterChoiceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceAfterChoice createChoiceAfterChoice() {
		ChoiceAfterChoiceImpl choiceAfterChoice = new ChoiceAfterChoiceImpl();
		return choiceAfterChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminationAfterMerge createTerminationAfterMerge() {
		TerminationAfterMergeImpl terminationAfterMerge = new TerminationAfterMergeImpl();
		return terminationAfterMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task2StepAfterEmptyDef createTask2StepAfterEmptyDef() {
		Task2StepAfterEmptyDefImpl task2StepAfterEmptyDef = new Task2StepAfterEmptyDefImpl();
		return task2StepAfterEmptyDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitAfterEmptyDef createSplitAfterEmptyDef() {
		SplitAfterEmptyDefImpl splitAfterEmptyDef = new SplitAfterEmptyDefImpl();
		return splitAfterEmptyDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceAfterEmptyDef createChoiceAfterEmptyDef() {
		ChoiceAfterEmptyDefImpl choiceAfterEmptyDef = new ChoiceAfterEmptyDefImpl();
		return choiceAfterEmptyDef;
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
