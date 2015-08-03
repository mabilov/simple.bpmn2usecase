/**
 */
package de.abilov.tgg.bpmn2useCase.Rules.impl;

import de.abilov.tgg.bpmn2useCase.Rules.*;

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
		case RulesPackage.T2S_FIRST:
			return createT2SFirst();
		case RulesPackage.SPLIT_SEQ:
			return createSplitSeq();
		case RulesPackage.SPLIT_FIRST:
			return createSplitFirst();
		case RulesPackage.TERMINATION_FIRST:
			return createTerminationFirst();
		case RulesPackage.T2S_AFTER_SPLIT:
			return createT2SAfterSplit();
		case RulesPackage.TERMINATION_SEQ:
			return createTerminationSeq();
		case RulesPackage.LAST_STEP_IN_PFLOW:
			return createLastStepInPFlow();
		case RulesPackage.T2S_AFTER_MERGE:
			return createT2SAfterMerge();
		case RulesPackage.CHOICE_SEQ:
			return createChoiceSeq();
		case RulesPackage.CHOICE_FIRST:
			return createChoiceFirst();
		case RulesPackage.CHOICE_AFTER_SPLIT:
			return createChoiceAfterSplit();
		case RulesPackage.T2S_AFTER_CHOICE_DEF:
			return createT2SAfterChoiceDef();
		case RulesPackage.T2S_AFTER_CHOICE:
			return createT2SAfterChoice();
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
		case RulesPackage.T2S_AFTER_EMPTY_DEF:
			return createT2SAfterEmptyDef();
		case RulesPackage.SPLIT_AFTER_EMPTY_DEF:
			return createSplitAfterEmptyDef();
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF:
			return createChoiceAfterEmptyDef();
		case RulesPackage.T2S_AFTER_TASK:
			return createT2SAfterTask();
		case RulesPackage.T2S_AFTER_SYNC:
			return createT2SAfterSync();
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
	public T2SFirst createT2SFirst() {
		T2SFirstImpl t2SFirst = new T2SFirstImpl();
		return t2SFirst;
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
	public T2SAfterSplit createT2SAfterSplit() {
		T2SAfterSplitImpl t2SAfterSplit = new T2SAfterSplitImpl();
		return t2SAfterSplit;
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
	public T2SAfterMerge createT2SAfterMerge() {
		T2SAfterMergeImpl t2SAfterMerge = new T2SAfterMergeImpl();
		return t2SAfterMerge;
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
	public T2SAfterChoiceDef createT2SAfterChoiceDef() {
		T2SAfterChoiceDefImpl t2SAfterChoiceDef = new T2SAfterChoiceDefImpl();
		return t2SAfterChoiceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2SAfterChoice createT2SAfterChoice() {
		T2SAfterChoiceImpl t2SAfterChoice = new T2SAfterChoiceImpl();
		return t2SAfterChoice;
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
	public T2SAfterEmptyDef createT2SAfterEmptyDef() {
		T2SAfterEmptyDefImpl t2SAfterEmptyDef = new T2SAfterEmptyDefImpl();
		return t2SAfterEmptyDef;
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
	public T2SAfterTask createT2SAfterTask() {
		T2SAfterTaskImpl t2SAfterTask = new T2SAfterTaskImpl();
		return t2SAfterTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T2SAfterSync createT2SAfterSync() {
		T2SAfterSyncImpl t2SAfterSync = new T2SAfterSyncImpl();
		return t2SAfterSync;
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
