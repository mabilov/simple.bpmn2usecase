/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCasePackage;

import Bpmn2UseCase.Rules.RulesFactory;
import Bpmn2UseCase.Rules.RulesPackage;

import Bpmn2UseCase.impl.Bpmn2UseCasePackageImpl;

import SimpleBPMN.SimpleBPMNPackage;

import SimpleUseCase.SimpleUseCasePackage;

import TGGLanguage.TGGLanguagePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass process2UseCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2NormalStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pg2ParallelStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pg2ParallelStepAfterPGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2NormalStepSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2NormalStepFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pg2ParallelStepSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pg2ParallelStepFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEvent2FinalStateFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2NormalStepAfterPGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEvent2FinalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEvent2FinalStateSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStepInFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStepInPFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eg2ChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eg2ChoiceSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eg2ChoiceFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eg2ChoiceAfterPGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2NormalStepAfterDefEGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2NormalStepAfterEGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStepInAltFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pg2ParallelStepAfterDefEGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pg2ParallelStepAfterEGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eg2ChoiceStepAfterDefEGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eg2ChoiceStepAfterEGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEvent2FinalStateGWSeqEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Bpmn2UseCase.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimpleBPMNPackage.eINSTANCE.eClass();
		SimpleUseCasePackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Bpmn2UseCasePackageImpl theBpmn2UseCasePackage = (Bpmn2UseCasePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Bpmn2UseCasePackage.eNS_URI) instanceof Bpmn2UseCasePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Bpmn2UseCasePackage.eNS_URI)
						: Bpmn2UseCasePackage.eINSTANCE);

		// Load packages
		theBpmn2UseCasePackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theBpmn2UseCasePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess2UseCase() {
		if (process2UseCaseEClass == null) {
			process2UseCaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return process2UseCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_FWD__Match_Process_StartEvent() {
		return getProcess2UseCase().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__Perform_FWD__IsApplicableMatch() {
		return getProcess2UseCase().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_FWD__Match() {
		return getProcess2UseCase().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__RegisterObjectsToMatch_FWD__Match_Process_StartEvent() {
		return getProcess2UseCase().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_solveCsp_FWD__Match_Process_StartEvent() {
		return getProcess2UseCase().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_checkCsp_FWD__CSP() {
		return getProcess2UseCase().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_StartEvent() {
		return getProcess2UseCase().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_checkCsp_FWD__CSP() {
		return getProcess2UseCase().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getProcess2UseCase().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__CheckTypes_FWD__Match() {
		return getProcess2UseCase().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_BWD__Match_UseCase_BasicFlow_UCCondition() {
		return getProcess2UseCase().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__Perform_BWD__IsApplicableMatch() {
		return getProcess2UseCase().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_BWD__Match() {
		return getProcess2UseCase().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__RegisterObjectsToMatch_BWD__Match_UseCase_BasicFlow_UCCondition() {
		return getProcess2UseCase().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_solveCsp_BWD__Match_UseCase_BasicFlow_UCCondition() {
		return getProcess2UseCase().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_checkCsp_BWD__CSP() {
		return getProcess2UseCase().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_BasicFlow_UCCondition() {
		return getProcess2UseCase().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_checkCsp_BWD__CSP() {
		return getProcess2UseCase().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getProcess2UseCase().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__CheckTypes_BWD__Match() {
		return getProcess2UseCase().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_294__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_94__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_95__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__CheckAttributes_FWD__TripleMatch() {
		return getProcess2UseCase().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__CheckAttributes_BWD__TripleMatch() {
		return getProcess2UseCase().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_CC__Match_Match() {
		return getProcess2UseCase().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Process_UseCase_BasicFlow_StartEvent_UCCondition_Match_Match() {
		return getProcess2UseCase().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_checkCsp_CC__CSP() {
		return getProcess2UseCase().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__Perform_CC__IsApplicableMatchCC() {
		return getProcess2UseCase().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__GenerateModel__RuleEntryContainer() {
		return getProcess2UseCase().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getProcess2UseCase().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__GenerateModel_checkCsp_BWD__CSP() {
		return getProcess2UseCase().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2NormalStep() {
		if (task2NormalStepEClass == null) {
			task2NormalStepEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return task2NormalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPG2ParallelStep() {
		if (pg2ParallelStepEClass == null) {
			pg2ParallelStepEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return pg2ParallelStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPG2ParallelStepAfterPG() {
		if (pg2ParallelStepAfterPGEClass == null) {
			pg2ParallelStepAfterPGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return pg2ParallelStepAfterPGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterPG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__Perform_FWD__IsApplicableMatch() {
		return getPG2ParallelStepAfterPG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsApplicable_FWD__Match() {
		return getPG2ParallelStepAfterPG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterPG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterPG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_checkCsp_FWD__CSP() {
		return getPG2ParallelStepAfterPG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_SequenceFlow_Flow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterPG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsApplicable_checkCsp_FWD__CSP() {
		return getPG2ParallelStepAfterPG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepAfterPG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__CheckTypes_FWD__Match() {
		return getPG2ParallelStepAfterPG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow() {
		return getPG2ParallelStepAfterPG().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__Perform_BWD__IsApplicableMatch() {
		return getPG2ParallelStepAfterPG().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsApplicable_BWD__Match() {
		return getPG2ParallelStepAfterPG().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__RegisterObjectsToMatch_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow() {
		return getPG2ParallelStepAfterPG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_solveCsp_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow() {
		return getPG2ParallelStepAfterPG().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_checkCsp_BWD__CSP() {
		return getPG2ParallelStepAfterPG().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_ParallelFlow_ParallelStep_Flow() {
		return getPG2ParallelStepAfterPG().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsApplicable_checkCsp_BWD__CSP() {
		return getPG2ParallelStepAfterPG().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepAfterPG().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__CheckTypes_BWD__Match() {
		return getPG2ParallelStepAfterPG().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_295__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_296__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_297__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_96__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_97__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_98__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_298__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_299__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_300__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_301__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_302__EMoflonEdge() {
		return getPG2ParallelStepAfterPG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__CheckAttributes_FWD__TripleMatch() {
		return getPG2ParallelStepAfterPG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__CheckAttributes_BWD__TripleMatch() {
		return getPG2ParallelStepAfterPG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsApplicable_CC__Match_Match() {
		return getPG2ParallelStepAfterPG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_SequenceFlow_ParallelFlow_ParallelStep_Flow_ParallelGateway_ParallelGateway_Match_Match() {
		return getPG2ParallelStepAfterPG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__IsApplicable_checkCsp_CC__CSP() {
		return getPG2ParallelStepAfterPG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__Perform_CC__IsApplicableMatchCC() {
		return getPG2ParallelStepAfterPG().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__GenerateModel__RuleEntryContainer_GW2S() {
		return getPG2ParallelStepAfterPG().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_Flow_ModelgeneratorRuleResult() {
		return getPG2ParallelStepAfterPG().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterPG__GenerateModel_checkCsp_BWD__CSP() {
		return getPG2ParallelStepAfterPG().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2NormalStepSeq() {
		if (task2NormalStepSeqEClass == null) {
			task2NormalStepSeqEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return task2NormalStepSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2NormalStepSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__Perform_FWD__IsApplicableMatch() {
		return getTask2NormalStepSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsApplicable_FWD__Match() {
		return getTask2NormalStepSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2NormalStepSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2NormalStepSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2NormalStepSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_Process_SequenceFlow_Task() {
		return getTask2NormalStepSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2NormalStepSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__CheckTypes_FWD__Match() {
		return getTask2NormalStepSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_BWD__Match_Flow_Step_NormalStep() {
		return getTask2NormalStepSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__Perform_BWD__IsApplicableMatch() {
		return getTask2NormalStepSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsApplicable_BWD__Match() {
		return getTask2NormalStepSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__RegisterObjectsToMatch_BWD__Match_Flow_Step_NormalStep() {
		return getTask2NormalStepSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_solveCsp_BWD__Match_Flow_Step_NormalStep() {
		return getTask2NormalStepSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2NormalStepSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_NormalStep_Process() {
		return getTask2NormalStepSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2NormalStepSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__CheckTypes_BWD__Match() {
		return getTask2NormalStepSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_99__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_100__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_303__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_304__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_305__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_306__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_307__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_308__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__CheckAttributes_FWD__TripleMatch() {
		return getTask2NormalStepSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__CheckAttributes_BWD__TripleMatch() {
		return getTask2NormalStepSeq().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsApplicable_CC__Match_Match() {
		return getTask2NormalStepSeq().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2S_FlowNode_Flow_Step_NormalStep_Process_SequenceFlow_Task_Match_Match() {
		return getTask2NormalStepSeq().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsApplicable_checkCsp_CC__CSP() {
		return getTask2NormalStepSeq().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__Perform_CC__IsApplicableMatchCC() {
		return getTask2NormalStepSeq().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__GenerateModel__RuleEntryContainer_FN2S() {
		return getTask2NormalStepSeq().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_Process_ModelgeneratorRuleResult() {
		return getTask2NormalStepSeq().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__GenerateModel_checkCsp_BWD__CSP() {
		return getTask2NormalStepSeq().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2NormalStepFirst() {
		if (task2NormalStepFirstEClass == null) {
			task2NormalStepFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return task2NormalStepFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2NormalStepFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__Perform_FWD__IsApplicableMatch() {
		return getTask2NormalStepFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsApplicable_FWD__Match() {
		return getTask2NormalStepFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2NormalStepFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2NormalStepFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2NormalStepFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_SequenceFlow_Task() {
		return getTask2NormalStepFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2NormalStepFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__CheckTypes_FWD__Match() {
		return getTask2NormalStepFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_BWD__Match_NormalStep_Flow() {
		return getTask2NormalStepFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__Perform_BWD__IsApplicableMatch() {
		return getTask2NormalStepFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsApplicable_BWD__Match() {
		return getTask2NormalStepFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow() {
		return getTask2NormalStepFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow() {
		return getTask2NormalStepFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2NormalStepFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_NormalStep_FlowNode_Flow_Process() {
		return getTask2NormalStepFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2NormalStepFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__CheckTypes_BWD__Match() {
		return getTask2NormalStepFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_BWD_EMoflonEdge_101__EMoflonEdge() {
		return getTask2NormalStepFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_309__EMoflonEdge() {
		return getTask2NormalStepFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_310__EMoflonEdge() {
		return getTask2NormalStepFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_311__EMoflonEdge() {
		return getTask2NormalStepFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_312__EMoflonEdge() {
		return getTask2NormalStepFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_313__EMoflonEdge() {
		return getTask2NormalStepFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsAppropriate_FWD_EMoflonEdge_314__EMoflonEdge() {
		return getTask2NormalStepFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__CheckAttributes_FWD__TripleMatch() {
		return getTask2NormalStepFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__CheckAttributes_BWD__TripleMatch() {
		return getTask2NormalStepFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsApplicable_CC__Match_Match() {
		return getTask2NormalStepFirst().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2F_NormalStep_FlowNode_Flow_Process_SequenceFlow_Task_Match_Match() {
		return getTask2NormalStepFirst().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__IsApplicable_checkCsp_CC__CSP() {
		return getTask2NormalStepFirst().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__Perform_CC__IsApplicableMatchCC() {
		return getTask2NormalStepFirst().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__GenerateModel__RuleEntryContainer_FN2F() {
		return getTask2NormalStepFirst().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_ModelgeneratorRuleResult() {
		return getTask2NormalStepFirst().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepFirst__GenerateModel_checkCsp_BWD__CSP() {
		return getTask2NormalStepFirst().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPG2ParallelStepSeq() {
		if (pg2ParallelStepSeqEClass == null) {
			pg2ParallelStepSeqEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return pg2ParallelStepSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__Perform_FWD__IsApplicableMatch() {
		return getPG2ParallelStepSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsApplicable_FWD__Match() {
		return getPG2ParallelStepSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getPG2ParallelStepSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getPG2ParallelStepSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__CheckTypes_FWD__Match() {
		return getPG2ParallelStepSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_BWD__Match_Flow_Step_ParallelStep() {
		return getPG2ParallelStepSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__Perform_BWD__IsApplicableMatch() {
		return getPG2ParallelStepSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsApplicable_BWD__Match() {
		return getPG2ParallelStepSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__RegisterObjectsToMatch_BWD__Match_Flow_Step_ParallelStep() {
		return getPG2ParallelStepSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_solveCsp_BWD__Match_Flow_Step_ParallelStep() {
		return getPG2ParallelStepSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getPG2ParallelStepSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_ParallelStep_Process() {
		return getPG2ParallelStepSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getPG2ParallelStepSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__CheckTypes_BWD__Match() {
		return getPG2ParallelStepSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_102__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_103__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_315__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_316__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_317__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_318__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_319__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_320__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_321__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_322__EMoflonEdge() {
		return getPG2ParallelStepSeq().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__CheckAttributes_FWD__TripleMatch() {
		return getPG2ParallelStepSeq().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__CheckAttributes_BWD__TripleMatch() {
		return getPG2ParallelStepSeq().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsApplicable_CC__Match_Match() {
		return getPG2ParallelStepSeq().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2S_Flow_FlowNode_Step_ParallelStep_Process_SequenceFlow_ParallelGateway_ParallelGateway_Match_Match() {
		return getPG2ParallelStepSeq().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__IsApplicable_checkCsp_CC__CSP() {
		return getPG2ParallelStepSeq().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__Perform_CC__IsApplicableMatchCC() {
		return getPG2ParallelStepSeq().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__GenerateModel__RuleEntryContainer_FN2S() {
		return getPG2ParallelStepSeq().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_Process_ModelgeneratorRuleResult() {
		return getPG2ParallelStepSeq().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepSeq__GenerateModel_checkCsp_BWD__CSP() {
		return getPG2ParallelStepSeq().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPG2ParallelStepFirst() {
		if (pg2ParallelStepFirstEClass == null) {
			pg2ParallelStepFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return pg2ParallelStepFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__Perform_FWD__IsApplicableMatch() {
		return getPG2ParallelStepFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsApplicable_FWD__Match() {
		return getPG2ParallelStepFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getPG2ParallelStepFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getPG2ParallelStepFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__CheckTypes_FWD__Match() {
		return getPG2ParallelStepFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_BWD__Match_ParallelStep_Flow() {
		return getPG2ParallelStepFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__Perform_BWD__IsApplicableMatch() {
		return getPG2ParallelStepFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsApplicable_BWD__Match() {
		return getPG2ParallelStepFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__RegisterObjectsToMatch_BWD__Match_ParallelStep_Flow() {
		return getPG2ParallelStepFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_solveCsp_BWD__Match_ParallelStep_Flow() {
		return getPG2ParallelStepFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getPG2ParallelStepFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_ParallelStep_FlowNode_Flow_Process() {
		return getPG2ParallelStepFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getPG2ParallelStepFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__CheckTypes_BWD__Match() {
		return getPG2ParallelStepFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_BWD_EMoflonEdge_104__EMoflonEdge() {
		return getPG2ParallelStepFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_323__EMoflonEdge() {
		return getPG2ParallelStepFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_324__EMoflonEdge() {
		return getPG2ParallelStepFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_325__EMoflonEdge() {
		return getPG2ParallelStepFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_326__EMoflonEdge() {
		return getPG2ParallelStepFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_327__EMoflonEdge() {
		return getPG2ParallelStepFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_328__EMoflonEdge() {
		return getPG2ParallelStepFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_329__EMoflonEdge() {
		return getPG2ParallelStepFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsAppropriate_FWD_EMoflonEdge_330__EMoflonEdge() {
		return getPG2ParallelStepFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__CheckAttributes_FWD__TripleMatch() {
		return getPG2ParallelStepFirst().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__CheckAttributes_BWD__TripleMatch() {
		return getPG2ParallelStepFirst().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsApplicable_CC__Match_Match() {
		return getPG2ParallelStepFirst().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2F_ParallelStep_FlowNode_Flow_Process_SequenceFlow_ParallelGateway_ParallelGateway_Match_Match() {
		return getPG2ParallelStepFirst().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__IsApplicable_checkCsp_CC__CSP() {
		return getPG2ParallelStepFirst().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__Perform_CC__IsApplicableMatchCC() {
		return getPG2ParallelStepFirst().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__GenerateModel__RuleEntryContainer_FN2F() {
		return getPG2ParallelStepFirst().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_ModelgeneratorRuleResult() {
		return getPG2ParallelStepFirst().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepFirst__GenerateModel_checkCsp_BWD__CSP() {
		return getPG2ParallelStepFirst().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent2FinalStateFirst() {
		if (endEvent2FinalStateFirstEClass == null) {
			endEvent2FinalStateFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return endEvent2FinalStateFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__Perform_FWD__IsApplicableMatch() {
		return getEndEvent2FinalStateFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsApplicable_FWD__Match() {
		return getEndEvent2FinalStateFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getEndEvent2FinalStateFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getEndEvent2FinalStateFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEndEvent2FinalStateFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__CheckTypes_FWD__Match() {
		return getEndEvent2FinalStateFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_BWD__Match_Flow_UCCondition() {
		return getEndEvent2FinalStateFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__Perform_BWD__IsApplicableMatch() {
		return getEndEvent2FinalStateFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsApplicable_BWD__Match() {
		return getEndEvent2FinalStateFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__RegisterObjectsToMatch_BWD__Match_Flow_UCCondition() {
		return getEndEvent2FinalStateFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_solveCsp_BWD__Match_Flow_UCCondition() {
		return getEndEvent2FinalStateFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getEndEvent2FinalStateFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_UCCondition() {
		return getEndEvent2FinalStateFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getEndEvent2FinalStateFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEndEvent2FinalStateFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__CheckTypes_BWD__Match() {
		return getEndEvent2FinalStateFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_331__EMoflonEdge() {
		return getEndEvent2FinalStateFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_332__EMoflonEdge() {
		return getEndEvent2FinalStateFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_333__EMoflonEdge() {
		return getEndEvent2FinalStateFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_334__EMoflonEdge() {
		return getEndEvent2FinalStateFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_BWD_EMoflonEdge_105__EMoflonEdge() {
		return getEndEvent2FinalStateFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_335__EMoflonEdge() {
		return getEndEvent2FinalStateFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsAppropriate_FWD_EMoflonEdge_336__EMoflonEdge() {
		return getEndEvent2FinalStateFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__CheckAttributes_FWD__TripleMatch() {
		return getEndEvent2FinalStateFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__CheckAttributes_BWD__TripleMatch() {
		return getEndEvent2FinalStateFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsApplicable_CC__Match_Match() {
		return getEndEvent2FinalStateFirst().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FN2F_Flow_FlowNode_Process_SequenceFlow_EndEvent_UCCondition_Match_Match() {
		return getEndEvent2FinalStateFirst().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__IsApplicable_checkCsp_CC__CSP() {
		return getEndEvent2FinalStateFirst().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__Perform_CC__IsApplicableMatchCC() {
		return getEndEvent2FinalStateFirst().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__GenerateModel__RuleEntryContainer_FN2F() {
		return getEndEvent2FinalStateFirst().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_ModelgeneratorRuleResult() {
		return getEndEvent2FinalStateFirst().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateFirst__GenerateModel_checkCsp_BWD__CSP() {
		return getEndEvent2FinalStateFirst().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2NormalStepAfterPG() {
		if (task2NormalStepAfterPGEClass == null) {
			task2NormalStepAfterPGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return task2NormalStepAfterPGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD__Match_ParallelGateway_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterPG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__Perform_FWD__IsApplicableMatch() {
		return getTask2NormalStepAfterPG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_FWD__Match() {
		return getTask2NormalStepAfterPG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__RegisterObjectsToMatch_FWD__Match_ParallelGateway_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterPG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterPG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2NormalStepAfterPG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_GW2S_ParallelGateway_ParallelStep_SequenceFlow_Process_UseCase_P2UC_Flow_Task() {
		return getTask2NormalStepAfterPG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2NormalStepAfterPG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepAfterPG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__CheckTypes_FWD__Match() {
		return getTask2NormalStepAfterPG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow() {
		return getTask2NormalStepAfterPG().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__Perform_BWD__IsApplicableMatch() {
		return getTask2NormalStepAfterPG().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_BWD__Match() {
		return getTask2NormalStepAfterPG().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__RegisterObjectsToMatch_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow() {
		return getTask2NormalStepAfterPG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_solveCsp_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow() {
		return getTask2NormalStepAfterPG().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterPG().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_GW2S_ParallelGateway_ParallelStep_Process_UseCase_P2UC_ParallelFlow_Flow() {
		return getTask2NormalStepAfterPG().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterPG().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepAfterPG().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__CheckTypes_BWD__Match() {
		return getTask2NormalStepAfterPG().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_337__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_338__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_106__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_339__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_107__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_108__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_340__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_341__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_342__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__CheckAttributes_FWD__TripleMatch() {
		return getTask2NormalStepAfterPG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__CheckAttributes_BWD__TripleMatch() {
		return getTask2NormalStepAfterPG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_CC__Match_Match() {
		return getTask2NormalStepAfterPG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_NormalStep_GW2S_ParallelGateway_ParallelStep_SequenceFlow_Process_UseCase_P2UC_ParallelFlow_Flow_Task_Match_Match() {
		return getTask2NormalStepAfterPG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_checkCsp_CC__CSP() {
		return getTask2NormalStepAfterPG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__Perform_CC__IsApplicableMatchCC() {
		return getTask2NormalStepAfterPG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__GenerateModel__RuleEntryContainer_GW2S() {
		return getTask2NormalStepAfterPG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_GW2S_ParallelGateway_ParallelStep_Process_UseCase_P2UC_Flow_ModelgeneratorRuleResult() {
		return getTask2NormalStepAfterPG().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__GenerateModel_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterPG().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent2FinalState() {
		if (endEvent2FinalStateEClass == null) {
			endEvent2FinalStateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return endEvent2FinalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent2FinalStateSeq() {
		if (endEvent2FinalStateSeqEClass == null) {
			endEvent2FinalStateSeqEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return endEvent2FinalStateSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__Perform_FWD__IsApplicableMatch() {
		return getEndEvent2FinalStateSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsApplicable_FWD__Match() {
		return getEndEvent2FinalStateSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getEndEvent2FinalStateSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getEndEvent2FinalStateSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEndEvent2FinalStateSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__CheckTypes_FWD__Match() {
		return getEndEvent2FinalStateSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD__Match_UCCondition_Step_Flow() {
		return getEndEvent2FinalStateSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__Perform_BWD__IsApplicableMatch() {
		return getEndEvent2FinalStateSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsApplicable_BWD__Match() {
		return getEndEvent2FinalStateSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__RegisterObjectsToMatch_BWD__Match_UCCondition_Step_Flow() {
		return getEndEvent2FinalStateSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_solveCsp_BWD__Match_UCCondition_Step_Flow() {
		return getEndEvent2FinalStateSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getEndEvent2FinalStateSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_UCCondition_Step_FlowNode_Flow_FN2S_Process() {
		return getEndEvent2FinalStateSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getEndEvent2FinalStateSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEndEvent2FinalStateSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__CheckTypes_BWD__Match() {
		return getEndEvent2FinalStateSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD_EMoflonEdge_109__EMoflonEdge() {
		return getEndEvent2FinalStateSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_BWD_EMoflonEdge_110__EMoflonEdge() {
		return getEndEvent2FinalStateSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_343__EMoflonEdge() {
		return getEndEvent2FinalStateSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_344__EMoflonEdge() {
		return getEndEvent2FinalStateSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_345__EMoflonEdge() {
		return getEndEvent2FinalStateSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_346__EMoflonEdge() {
		return getEndEvent2FinalStateSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_347__EMoflonEdge() {
		return getEndEvent2FinalStateSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsAppropriate_FWD_EMoflonEdge_348__EMoflonEdge() {
		return getEndEvent2FinalStateSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__CheckAttributes_FWD__TripleMatch() {
		return getEndEvent2FinalStateSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__CheckAttributes_BWD__TripleMatch() {
		return getEndEvent2FinalStateSeq().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsApplicable_CC__Match_Match() {
		return getEndEvent2FinalStateSeq().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_UCCondition_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_EndEvent_Match_Match() {
		return getEndEvent2FinalStateSeq().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__IsApplicable_checkCsp_CC__CSP() {
		return getEndEvent2FinalStateSeq().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__Perform_CC__IsApplicableMatchCC() {
		return getEndEvent2FinalStateSeq().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__GenerateModel__RuleEntryContainer_FN2S() {
		return getEndEvent2FinalStateSeq().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_Step_FlowNode_Flow_FN2S_Process_ModelgeneratorRuleResult() {
		return getEndEvent2FinalStateSeq().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateSeq__GenerateModel_checkCsp_BWD__CSP() {
		return getEndEvent2FinalStateSeq().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStepInFlow() {
		if (lastStepInFlowEClass == null) {
			lastStepInFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return lastStepInFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStepInPFlow() {
		if (lastStepInPFlowEClass == null) {
			lastStepInPFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(13);
		}
		return lastStepInPFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getLastStepInPFlow().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__Perform_FWD__IsApplicableMatch() {
		return getLastStepInPFlow().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsApplicable_FWD__Match() {
		return getLastStepInPFlow().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getLastStepInPFlow().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getLastStepInPFlow().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_checkCsp_FWD__CSP() {
		return getLastStepInPFlow().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S() {
		return getLastStepInPFlow().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsApplicable_checkCsp_FWD__CSP() {
		return getLastStepInPFlow().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLastStepInPFlow().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__CheckTypes_FWD__Match() {
		return getLastStepInPFlow().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_BWD__Match_ParallelStep_ParallelFlow_Step() {
		return getLastStepInPFlow().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__Perform_BWD__IsApplicableMatch() {
		return getLastStepInPFlow().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsApplicable_BWD__Match() {
		return getLastStepInPFlow().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__RegisterObjectsToMatch_BWD__Match_ParallelStep_ParallelFlow_Step() {
		return getLastStepInPFlow().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_solveCsp_BWD__Match_ParallelStep_ParallelFlow_Step() {
		return getLastStepInPFlow().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_checkCsp_BWD__CSP() {
		return getLastStepInPFlow().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S() {
		return getLastStepInPFlow().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsApplicable_checkCsp_BWD__CSP() {
		return getLastStepInPFlow().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLastStepInPFlow().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__CheckTypes_BWD__Match() {
		return getLastStepInPFlow().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_349__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_350__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_351__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_352__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_353__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_BWD_EMoflonEdge_111__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__CheckAttributes_FWD__TripleMatch() {
		return getLastStepInPFlow().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__CheckAttributes_BWD__TripleMatch() {
		return getLastStepInPFlow().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsApplicable_CC__Match_Match() {
		return getLastStepInPFlow().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_Match_Match() {
		return getLastStepInPFlow().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsApplicable_checkCsp_CC__CSP() {
		return getLastStepInPFlow().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__Perform_CC__IsApplicableMatchCC() {
		return getLastStepInPFlow().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__GenerateModel__RuleEntryContainer_FN2S() {
		return getLastStepInPFlow().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_ModelgeneratorRuleResult() {
		return getLastStepInPFlow().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__GenerateModel_checkCsp_BWD__CSP() {
		return getLastStepInPFlow().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEG2Choice() {
		if (eg2ChoiceEClass == null) {
			eg2ChoiceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(14);
		}
		return eg2ChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEG2ChoiceSeq() {
		if (eg2ChoiceSeqEClass == null) {
			eg2ChoiceSeqEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(15);
		}
		return eg2ChoiceSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__Perform_FWD__IsApplicableMatch() {
		return getEG2ChoiceSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsApplicable_FWD__Match() {
		return getEG2ChoiceSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getEG2ChoiceSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getEG2ChoiceSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__CheckTypes_FWD__Match() {
		return getEG2ChoiceSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_BWD__Match_Step_Flow_ChoiceStep() {
		return getEG2ChoiceSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__Perform_BWD__IsApplicableMatch() {
		return getEG2ChoiceSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsApplicable_BWD__Match() {
		return getEG2ChoiceSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__RegisterObjectsToMatch_BWD__Match_Step_Flow_ChoiceStep() {
		return getEG2ChoiceSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_solveCsp_BWD__Match_Step_Flow_ChoiceStep() {
		return getEG2ChoiceSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getEG2ChoiceSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_ChoiceStep_Process() {
		return getEG2ChoiceSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getEG2ChoiceSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__CheckTypes_BWD__Match() {
		return getEG2ChoiceSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_BWD_EMoflonEdge_112__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_BWD_EMoflonEdge_113__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_354__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_355__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_356__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_357__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_358__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_359__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_360__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsAppropriate_FWD_EMoflonEdge_361__EMoflonEdge() {
		return getEG2ChoiceSeq().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__CheckAttributes_FWD__TripleMatch() {
		return getEG2ChoiceSeq().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__CheckAttributes_BWD__TripleMatch() {
		return getEG2ChoiceSeq().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsApplicable_CC__Match_Match() {
		return getEG2ChoiceSeq().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FlowNode_Step_FN2S_Flow_ChoiceStep_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Match_Match() {
		return getEG2ChoiceSeq().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__IsApplicable_checkCsp_CC__CSP() {
		return getEG2ChoiceSeq().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__Perform_CC__IsApplicableMatchCC() {
		return getEG2ChoiceSeq().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__GenerateModel__RuleEntryContainer_FN2S() {
		return getEG2ChoiceSeq().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_Process_ModelgeneratorRuleResult() {
		return getEG2ChoiceSeq().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceSeq__GenerateModel_checkCsp_BWD__CSP() {
		return getEG2ChoiceSeq().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEG2ChoiceFirst() {
		if (eg2ChoiceFirstEClass == null) {
			eg2ChoiceFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return eg2ChoiceFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__Perform_FWD__IsApplicableMatch() {
		return getEG2ChoiceFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsApplicable_FWD__Match() {
		return getEG2ChoiceFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getEG2ChoiceFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FlowNode_Flow_FN2F_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getEG2ChoiceFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__CheckTypes_FWD__Match() {
		return getEG2ChoiceFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_BWD__Match_Flow_ChoiceStep() {
		return getEG2ChoiceFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__Perform_BWD__IsApplicableMatch() {
		return getEG2ChoiceFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsApplicable_BWD__Match() {
		return getEG2ChoiceFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__RegisterObjectsToMatch_BWD__Match_Flow_ChoiceStep() {
		return getEG2ChoiceFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_solveCsp_BWD__Match_Flow_ChoiceStep() {
		return getEG2ChoiceFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getEG2ChoiceFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FlowNode_Flow_FN2F_ChoiceStep_Process() {
		return getEG2ChoiceFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getEG2ChoiceFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__CheckTypes_BWD__Match() {
		return getEG2ChoiceFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_BWD_EMoflonEdge_114__EMoflonEdge() {
		return getEG2ChoiceFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_362__EMoflonEdge() {
		return getEG2ChoiceFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_363__EMoflonEdge() {
		return getEG2ChoiceFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_364__EMoflonEdge() {
		return getEG2ChoiceFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_365__EMoflonEdge() {
		return getEG2ChoiceFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_366__EMoflonEdge() {
		return getEG2ChoiceFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_367__EMoflonEdge() {
		return getEG2ChoiceFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_368__EMoflonEdge() {
		return getEG2ChoiceFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsAppropriate_FWD_EMoflonEdge_369__EMoflonEdge() {
		return getEG2ChoiceFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__CheckAttributes_FWD__TripleMatch() {
		return getEG2ChoiceFirst().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__CheckAttributes_BWD__TripleMatch() {
		return getEG2ChoiceFirst().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsApplicable_CC__Match_Match() {
		return getEG2ChoiceFirst().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsApplicable_solveCsp_CC__IsApplicableMatchCC_FlowNode_Flow_FN2F_ChoiceStep_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Match_Match() {
		return getEG2ChoiceFirst().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__IsApplicable_checkCsp_CC__CSP() {
		return getEG2ChoiceFirst().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__Perform_CC__IsApplicableMatchCC() {
		return getEG2ChoiceFirst().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__GenerateModel__RuleEntryContainer_FN2F() {
		return getEG2ChoiceFirst().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_FlowNode_Flow_FN2F_Process_ModelgeneratorRuleResult() {
		return getEG2ChoiceFirst().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceFirst__GenerateModel_checkCsp_BWD__CSP() {
		return getEG2ChoiceFirst().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEG2ChoiceAfterPG() {
		if (eg2ChoiceAfterPGEClass == null) {
			eg2ChoiceAfterPGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(17);
		}
		return eg2ChoiceAfterPGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceAfterPG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__Perform_FWD__IsApplicableMatch() {
		return getEG2ChoiceAfterPG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsApplicable_FWD__Match() {
		return getEG2ChoiceAfterPG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceAfterPG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceAfterPG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_checkCsp_FWD__CSP() {
		return getEG2ChoiceAfterPG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_SequenceFlow_Flow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceAfterPG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsApplicable_checkCsp_FWD__CSP() {
		return getEG2ChoiceAfterPG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceAfterPG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__CheckTypes_FWD__Match() {
		return getEG2ChoiceAfterPG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow() {
		return getEG2ChoiceAfterPG().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__Perform_BWD__IsApplicableMatch() {
		return getEG2ChoiceAfterPG().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsApplicable_BWD__Match() {
		return getEG2ChoiceAfterPG().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__RegisterObjectsToMatch_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow() {
		return getEG2ChoiceAfterPG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_solveCsp_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow() {
		return getEG2ChoiceAfterPG().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_checkCsp_BWD__CSP() {
		return getEG2ChoiceAfterPG().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_ParallelFlow_ChoiceStep_Flow() {
		return getEG2ChoiceAfterPG().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsApplicable_checkCsp_BWD__CSP() {
		return getEG2ChoiceAfterPG().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceAfterPG().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__CheckTypes_BWD__Match() {
		return getEG2ChoiceAfterPG().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_370__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_115__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_371__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_372__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_116__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_BWD_EMoflonEdge_117__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_373__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_374__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_375__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_376__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsAppropriate_FWD_EMoflonEdge_377__EMoflonEdge() {
		return getEG2ChoiceAfterPG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__CheckAttributes_FWD__TripleMatch() {
		return getEG2ChoiceAfterPG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__CheckAttributes_BWD__TripleMatch() {
		return getEG2ChoiceAfterPG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsApplicable_CC__Match_Match() {
		return getEG2ChoiceAfterPG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_SequenceFlow_ParallelFlow_ChoiceStep_Flow_ExclusiveGateway_ExclusiveGateway_Match_Match() {
		return getEG2ChoiceAfterPG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__IsApplicable_checkCsp_CC__CSP() {
		return getEG2ChoiceAfterPG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__Perform_CC__IsApplicableMatchCC() {
		return getEG2ChoiceAfterPG().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__GenerateModel__RuleEntryContainer_GW2S() {
		return getEG2ChoiceAfterPG().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_Flow_ModelgeneratorRuleResult() {
		return getEG2ChoiceAfterPG().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceAfterPG__GenerateModel_checkCsp_BWD__CSP() {
		return getEG2ChoiceAfterPG().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2NormalStepAfterDefEG() {
		if (task2NormalStepAfterDefEGEClass == null) {
			task2NormalStepAfterDefEGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(18);
		}
		return task2NormalStepAfterDefEGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__Perform_FWD__IsApplicableMatch() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsApplicable_FWD__Match() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__CheckTypes_FWD__Match() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD__Match_NormalStep_Flow_ChoiceStep() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__Perform_BWD__IsApplicableMatch() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsApplicable_BWD__Match() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_ChoiceStep() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_ChoiceStep() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_Flow_ExclusiveGateway_ChoiceStep_GW2S_Process() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__CheckTypes_BWD__Match() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_118__EMoflonEdge() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_378__EMoflonEdge() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_379__EMoflonEdge() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_380__EMoflonEdge() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_119__EMoflonEdge() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_381__EMoflonEdge() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_382__EMoflonEdge() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_383__EMoflonEdge() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_384__EMoflonEdge() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__CheckAttributes_FWD__TripleMatch() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__CheckAttributes_BWD__TripleMatch() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsApplicable_CC__Match_Match() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_NormalStep_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_Task_Match_Match() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__IsApplicable_checkCsp_CC__CSP() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__Perform_CC__IsApplicableMatchCC() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__GenerateModel__RuleEntryContainer_GW2S() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Flow_ExclusiveGateway_ChoiceStep_GW2S_Process_ModelgeneratorRuleResult() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterDefEG__GenerateModel_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterDefEG().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2NormalStepAfterEG() {
		if (task2NormalStepAfterEGEClass == null) {
			task2NormalStepAfterEGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(19);
		}
		return task2NormalStepAfterEGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterEG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__Perform_FWD__IsApplicableMatch() {
		return getTask2NormalStepAfterEG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsApplicable_FWD__Match() {
		return getTask2NormalStepAfterEG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterEG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2NormalStepAfterEG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2NormalStepAfterEG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_UseCase_P2UC_Flow_Task() {
		return getTask2NormalStepAfterEG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2NormalStepAfterEG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepAfterEG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__CheckTypes_FWD__Match() {
		return getTask2NormalStepAfterEG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow() {
		return getTask2NormalStepAfterEG().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__Perform_BWD__IsApplicableMatch() {
		return getTask2NormalStepAfterEG().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsApplicable_BWD__Match() {
		return getTask2NormalStepAfterEG().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__RegisterObjectsToMatch_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow() {
		return getTask2NormalStepAfterEG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow() {
		return getTask2NormalStepAfterEG().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterEG().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_NormalStep_AlternativeFlow_Process_UseCase_P2UC_StepAlternative_Flow() {
		return getTask2NormalStepAfterEG().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterEG().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepAfterEG().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__CheckTypes_BWD__Match() {
		return getTask2NormalStepAfterEG().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_385__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_386__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_120__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_121__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_387__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_122__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_BWD_EMoflonEdge_123__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_388__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_389__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsAppropriate_FWD_EMoflonEdge_390__EMoflonEdge() {
		return getTask2NormalStepAfterEG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__CheckAttributes_FWD__TripleMatch() {
		return getTask2NormalStepAfterEG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__CheckAttributes_BWD__TripleMatch() {
		return getTask2NormalStepAfterEG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsApplicable_CC__Match_Match() {
		return getTask2NormalStepAfterEG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_NormalStep_AlternativeFlow_Process_UseCase_P2UC_StepAlternative_Flow_Task_Match_Match() {
		return getTask2NormalStepAfterEG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__IsApplicable_checkCsp_CC__CSP() {
		return getTask2NormalStepAfterEG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__Perform_CC__IsApplicableMatchCC() {
		return getTask2NormalStepAfterEG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__GenerateModel__RuleEntryContainer_GW2S() {
		return getTask2NormalStepAfterEG().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Process_UseCase_P2UC_Flow_ModelgeneratorRuleResult() {
		return getTask2NormalStepAfterEG().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterEG__GenerateModel_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterEG().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass1() {
		if (class1EClass == null) {
			class1EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(20);
		}
		return class1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getClass1().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__Perform_FWD__IsApplicableMatch() {
		return getClass1().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_FWD__Match() {
		return getClass1().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getClass1().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getClass1().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_checkCsp_FWD__CSP() {
		return getClass1().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_solveCsp_FWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_SequenceFlow_FN2S_GW2S() {
		return getClass1().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_checkCsp_FWD__CSP() {
		return getClass1().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClass1().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckTypes_FWD__Match() {
		return getClass1().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow() {
		return getClass1().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__Perform_BWD__IsApplicableMatch() {
		return getClass1().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_BWD__Match() {
		return getClass1().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow() {
		return getClass1().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow() {
		return getClass1().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_checkCsp_BWD__CSP() {
		return getClass1().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_solveCsp_BWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_FN2S_GW2S() {
		return getClass1().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_checkCsp_BWD__CSP() {
		return getClass1().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClass1().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckTypes_BWD__Match() {
		return getClass1().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_BWD_EMoflonEdge_124__EMoflonEdge() {
		return getClass1().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_391__EMoflonEdge() {
		return getClass1().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_392__EMoflonEdge() {
		return getClass1().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_393__EMoflonEdge() {
		return getClass1().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_394__EMoflonEdge() {
		return getClass1().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD_EMoflonEdge_395__EMoflonEdge() {
		return getClass1().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckAttributes_FWD__TripleMatch() {
		return getClass1().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckAttributes_BWD__TripleMatch() {
		return getClass1().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_CC__Match_Match() {
		return getClass1().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_SequenceFlow_FN2S_GW2S_Match_Match() {
		return getClass1().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_checkCsp_CC__CSP() {
		return getClass1().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__Perform_CC__IsApplicableMatchCC() {
		return getClass1().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__GenerateModel__RuleEntryContainer_FN2S() {
		return getClass1().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__GenerateModel_solveCsp_BWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_FN2S_GW2S_ModelgeneratorRuleResult() {
		return getClass1().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__GenerateModel_checkCsp_BWD__CSP() {
		return getClass1().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStepInAltFlow() {
		if (lastStepInAltFlowEClass == null) {
			lastStepInAltFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(21);
		}
		return lastStepInAltFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getLastStepInAltFlow().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__Perform_FWD__IsApplicableMatch() {
		return getLastStepInAltFlow().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsApplicable_FWD__Match() {
		return getLastStepInAltFlow().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getLastStepInAltFlow().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getLastStepInAltFlow().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_checkCsp_FWD__CSP() {
		return getLastStepInAltFlow().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S() {
		return getLastStepInAltFlow().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsApplicable_checkCsp_FWD__CSP() {
		return getLastStepInAltFlow().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLastStepInAltFlow().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__CheckTypes_FWD__Match() {
		return getLastStepInAltFlow().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step() {
		return getLastStepInAltFlow().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__Perform_BWD__IsApplicableMatch() {
		return getLastStepInAltFlow().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsApplicable_BWD__Match() {
		return getLastStepInAltFlow().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__RegisterObjectsToMatch_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step() {
		return getLastStepInAltFlow().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_solveCsp_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step() {
		return getLastStepInAltFlow().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_checkCsp_BWD__CSP() {
		return getLastStepInAltFlow().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S() {
		return getLastStepInAltFlow().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsApplicable_checkCsp_BWD__CSP() {
		return getLastStepInAltFlow().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLastStepInAltFlow().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__CheckTypes_BWD__Match() {
		return getLastStepInAltFlow().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_125__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_396__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_397__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_398__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_399__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_400__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_126__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__CheckAttributes_FWD__TripleMatch() {
		return getLastStepInAltFlow().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__CheckAttributes_BWD__TripleMatch() {
		return getLastStepInAltFlow().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsApplicable_CC__Match_Match() {
		return getLastStepInAltFlow().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_Match_Match() {
		return getLastStepInAltFlow().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsApplicable_checkCsp_CC__CSP() {
		return getLastStepInAltFlow().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__Perform_CC__IsApplicableMatchCC() {
		return getLastStepInAltFlow().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__GenerateModel__RuleEntryContainer_FN2S() {
		return getLastStepInAltFlow().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_ModelgeneratorRuleResult() {
		return getLastStepInAltFlow().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__GenerateModel_checkCsp_BWD__CSP() {
		return getLastStepInAltFlow().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPG2ParallelStepAfterDefEG() {
		if (pg2ParallelStepAfterDefEGEClass == null) {
			pg2ParallelStepAfterDefEGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(22);
		}
		return pg2ParallelStepAfterDefEGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__Perform_FWD__IsApplicableMatch() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsApplicable_FWD__Match() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_checkCsp_FWD__CSP() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Flow_Process_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsApplicable_checkCsp_FWD__CSP() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__CheckTypes_FWD__Match() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD__Match_ChoiceStep_ParallelStep_Flow() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__Perform_BWD__IsApplicableMatch() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsApplicable_BWD__Match() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__RegisterObjectsToMatch_BWD__Match_ChoiceStep_ParallelStep_Flow() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_ParallelStep_Flow() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_checkCsp_BWD__CSP() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_ParallelStep_Flow_Process() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsApplicable_checkCsp_BWD__CSP() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__CheckTypes_BWD__Match() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_401__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_402__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_403__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_127__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_128__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_404__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_405__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_406__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_407__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_408__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_409__EMoflonEdge() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__CheckAttributes_FWD__TripleMatch() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__CheckAttributes_BWD__TripleMatch() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsApplicable_CC__Match_Match() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_ParallelStep_Flow_Process_ParallelGateway_ParallelGateway_Match_Match() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__IsApplicable_checkCsp_CC__CSP() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__Perform_CC__IsApplicableMatchCC() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__GenerateModel__RuleEntryContainer_GW2S() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process_ModelgeneratorRuleResult() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterDefEG__GenerateModel_checkCsp_BWD__CSP() {
		return getPG2ParallelStepAfterDefEG().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPG2ParallelStepAfterEG() {
		if (pg2ParallelStepAfterEGEClass == null) {
			pg2ParallelStepAfterEGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(23);
		}
		return pg2ParallelStepAfterEGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterEG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__Perform_FWD__IsApplicableMatch() {
		return getPG2ParallelStepAfterEG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsApplicable_FWD__Match() {
		return getPG2ParallelStepAfterEG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterEG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterEG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_checkCsp_FWD__CSP() {
		return getPG2ParallelStepAfterEG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getPG2ParallelStepAfterEG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsApplicable_checkCsp_FWD__CSP() {
		return getPG2ParallelStepAfterEG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepAfterEG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__CheckTypes_FWD__Match() {
		return getPG2ParallelStepAfterEG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep() {
		return getPG2ParallelStepAfterEG().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__Perform_BWD__IsApplicableMatch() {
		return getPG2ParallelStepAfterEG().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsApplicable_BWD__Match() {
		return getPG2ParallelStepAfterEG().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__RegisterObjectsToMatch_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep() {
		return getPG2ParallelStepAfterEG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_solveCsp_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep() {
		return getPG2ParallelStepAfterEG().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_checkCsp_BWD__CSP() {
		return getPG2ParallelStepAfterEG().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_AlternativeFlow_ParallelStep() {
		return getPG2ParallelStepAfterEG().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsApplicable_checkCsp_BWD__CSP() {
		return getPG2ParallelStepAfterEG().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPG2ParallelStepAfterEG().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__CheckTypes_BWD__Match() {
		return getPG2ParallelStepAfterEG().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_129__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_410__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_130__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_411__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_412__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_131__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_BWD_EMoflonEdge_132__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_413__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_414__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_415__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_416__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsAppropriate_FWD_EMoflonEdge_417__EMoflonEdge() {
		return getPG2ParallelStepAfterEG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__CheckAttributes_FWD__TripleMatch() {
		return getPG2ParallelStepAfterEG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__CheckAttributes_BWD__TripleMatch() {
		return getPG2ParallelStepAfterEG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsApplicable_CC__Match_Match() {
		return getPG2ParallelStepAfterEG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StepAlternative_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_AlternativeFlow_ParallelStep_ParallelGateway_ParallelGateway_Match_Match() {
		return getPG2ParallelStepAfterEG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__IsApplicable_checkCsp_CC__CSP() {
		return getPG2ParallelStepAfterEG().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__Perform_CC__IsApplicableMatchCC() {
		return getPG2ParallelStepAfterEG().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__GenerateModel__RuleEntryContainer_GW2S() {
		return getPG2ParallelStepAfterEG().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_ModelgeneratorRuleResult() {
		return getPG2ParallelStepAfterEG().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPG2ParallelStepAfterEG__GenerateModel_checkCsp_BWD__CSP() {
		return getPG2ParallelStepAfterEG().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEG2ChoiceStepAfterDefEG() {
		if (eg2ChoiceStepAfterDefEGEClass == null) {
			eg2ChoiceStepAfterDefEGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return eg2ChoiceStepAfterDefEGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__Perform_FWD__IsApplicableMatch() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_FWD__Match() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_checkCsp_FWD__CSP() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Flow_Process_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_checkCsp_FWD__CSP() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__CheckTypes_FWD__Match() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD__Match_ChoiceStep_ChoiceStep_Flow() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__Perform_BWD__IsApplicableMatch() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_BWD__Match() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__RegisterObjectsToMatch_BWD__Match_ChoiceStep_ChoiceStep_Flow() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_ChoiceStep_Flow() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_checkCsp_BWD__CSP() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_ChoiceStep_Flow_Process() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_checkCsp_BWD__CSP() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__CheckTypes_BWD__Match() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_418__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_419__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_420__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_133__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_BWD_EMoflonEdge_134__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_421__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_422__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_423__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_424__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_425__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsAppropriate_FWD_EMoflonEdge_426__EMoflonEdge() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__CheckAttributes_FWD__TripleMatch() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__CheckAttributes_BWD__TripleMatch() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_CC__Match_Match() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_ChoiceStep_Flow_Process_ExclusiveGateway_ExclusiveGateway_Match_Match() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__IsApplicable_checkCsp_CC__CSP() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__Perform_CC__IsApplicableMatchCC() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__GenerateModel__RuleEntryContainer_GW2S() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process_ModelgeneratorRuleResult() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterDefEG__GenerateModel_checkCsp_BWD__CSP() {
		return getEG2ChoiceStepAfterDefEG().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEG2ChoiceStepAfterEG() {
		if (eg2ChoiceStepAfterEGEClass == null) {
			eg2ChoiceStepAfterEGEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(25);
		}
		return eg2ChoiceStepAfterEGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__Perform_FWD__IsApplicableMatch() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsApplicable_FWD__Match() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_checkCsp_FWD__CSP() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsApplicable_checkCsp_FWD__CSP() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__CheckTypes_FWD__Match() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__Perform_BWD__IsApplicableMatch() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsApplicable_BWD__Match() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__RegisterObjectsToMatch_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_solveCsp_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_checkCsp_BWD__CSP() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_AlternativeFlow_ChoiceStep() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsApplicable_checkCsp_BWD__CSP() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__CheckTypes_BWD__Match() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_135__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_427__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_136__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_137__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_428__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_429__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_BWD_EMoflonEdge_138__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_430__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_431__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_432__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_433__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsAppropriate_FWD_EMoflonEdge_434__EMoflonEdge() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__CheckAttributes_FWD__TripleMatch() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__CheckAttributes_BWD__TripleMatch() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsApplicable_CC__Match_Match() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StepAlternative_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_AlternativeFlow_ChoiceStep_ExclusiveGateway_ExclusiveGateway_Match_Match() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__IsApplicable_checkCsp_CC__CSP() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__Perform_CC__IsApplicableMatchCC() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__GenerateModel__RuleEntryContainer_GW2S() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__GenerateModel_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_ModelgeneratorRuleResult() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEG2ChoiceStepAfterEG__GenerateModel_checkCsp_BWD__CSP() {
		return getEG2ChoiceStepAfterEG().getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent2FinalStateGWSeq() {
		if (endEvent2FinalStateGWSeqEClass == null) {
			endEvent2FinalStateGWSeqEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(26);
		}
		return endEvent2FinalStateGWSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD__Match_Gateway_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__Perform_FWD__IsApplicableMatch() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsApplicable_FWD__Match() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__RegisterObjectsToMatch_FWD__Match_Gateway_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_solveCsp_FWD__Match_Gateway_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Gateway_Step_GW2S_Flow_Process_SequenceFlow_EndEvent() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__CheckTypes_FWD__Match() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD__Match_UCCondition_Step_Flow() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__Perform_BWD__IsApplicableMatch() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsApplicable_BWD__Match() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__RegisterObjectsToMatch_BWD__Match_UCCondition_Step_Flow() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_solveCsp_BWD__Match_UCCondition_Step_Flow() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_UCCondition_Gateway_Step_GW2S_Flow_Process() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__CheckTypes_BWD__Match() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD_EMoflonEdge_139__EMoflonEdge() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_BWD_EMoflonEdge_140__EMoflonEdge() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_435__EMoflonEdge() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_436__EMoflonEdge() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_437__EMoflonEdge() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_438__EMoflonEdge() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_439__EMoflonEdge() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsAppropriate_FWD_EMoflonEdge_440__EMoflonEdge() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__CheckAttributes_FWD__TripleMatch() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__CheckAttributes_BWD__TripleMatch() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsApplicable_CC__Match_Match() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_UCCondition_Gateway_Step_GW2S_Flow_Process_SequenceFlow_EndEvent_Match_Match() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__IsApplicable_checkCsp_CC__CSP() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__Perform_CC__IsApplicableMatchCC() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__GenerateModel__RuleEntryContainer_GW2S() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_Gateway_Step_GW2S_Flow_Process_ModelgeneratorRuleResult() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndEvent2FinalStateGWSeq__GenerateModel_checkCsp_BWD__CSP() {
		return getEndEvent2FinalStateGWSeq().getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("Bpmn2UseCase.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
