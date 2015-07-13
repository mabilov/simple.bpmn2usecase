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
	private EClass parallelGateway2ParallelStepEClass = null;

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
	private EClass task2NormalStepAfterSEEClass = null;

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
	private EClass parallelGateway2ParallelStepSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGateway2ParallelStepAfterSEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGateway2ParallelStepAfterPGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowAfterPG2ParallelFlowEClass = null;

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
			return (RulesPackage) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimpleBPMNPackage.eINSTANCE.eClass();
		SimpleUseCasePackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Bpmn2UseCasePackageImpl theBpmn2UseCasePackage = (Bpmn2UseCasePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Bpmn2UseCasePackage.eNS_URI) instanceof Bpmn2UseCasePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Bpmn2UseCasePackage.eNS_URI)
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
			process2UseCaseEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return process2UseCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_FWD__Match_Process_StartEvent_SequenceFlow() {
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
	public EOperation getProcess2UseCase__RegisterObjectsToMatch_FWD__Match_Process_StartEvent_SequenceFlow() {
		return getProcess2UseCase().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_solveCsp_FWD__Match_Process_StartEvent_SequenceFlow() {
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
	public EOperation getProcess2UseCase__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_StartEvent_SequenceFlow() {
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
	public EOperation getProcess2UseCase__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getProcess2UseCase__IsAppropriate_BWD__Match_UseCase_BasicFlow() {
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
	public EOperation getProcess2UseCase__RegisterObjectsToMatch_BWD__Match_UseCase_BasicFlow() {
		return getProcess2UseCase().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_solveCsp_BWD__Match_UseCase_BasicFlow() {
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
	public EOperation getProcess2UseCase__IsApplicable_solveCsp_BWD__IsApplicableMatch_UseCase_BasicFlow() {
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
	public EOperation getProcess2UseCase__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_249__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_250__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_75__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_251__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_252__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__CheckAttributes_FWD__TripleMatch() {
		return getProcess2UseCase().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__CheckAttributes_BWD__TripleMatch() {
		return getProcess2UseCase().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_CC__Match_Match() {
		return getProcess2UseCase().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Process_UseCase_BasicFlow_StartEvent_SequenceFlow_Match_Match() {
		return getProcess2UseCase().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsApplicable_checkCsp_CC__CSP() {
		return getProcess2UseCase().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__Perform_CC__IsApplicableMatchCC() {
		return getProcess2UseCase().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__GenerateModel__RuleEntryContainer() {
		return getProcess2UseCase().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getProcess2UseCase().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__GenerateModel_checkCsp_BWD__CSP() {
		return getProcess2UseCase().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2NormalStep() {
		if (task2NormalStepEClass == null) {
			task2NormalStepEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(1);
		}
		return task2NormalStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGateway2ParallelStep() {
		if (parallelGateway2ParallelStepEClass == null) {
			parallelGateway2ParallelStepEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return parallelGateway2ParallelStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2NormalStepSeq() {
		if (task2NormalStepSeqEClass == null) {
			task2NormalStepSeqEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return task2NormalStepSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD__Match_Task_Process_SequenceFlow_Task_SequenceFlow() {
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
	public EOperation getTask2NormalStepSeq__RegisterObjectsToMatch_FWD__Match_Task_Process_SequenceFlow_Task_SequenceFlow() {
		return getTask2NormalStepSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_solveCsp_FWD__Match_Task_Process_SequenceFlow_Task_SequenceFlow() {
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
	public EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Task_NormalStep_T2NS_Process_Flow_SequenceFlow_Task_SequenceFlow_SF2F() {
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
	public EOperation getTask2NormalStepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getTask2NormalStepSeq__IsAppropriate_BWD__Match_NormalStep_NormalStep_Flow() {
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
	public EOperation getTask2NormalStepSeq__RegisterObjectsToMatch_BWD__Match_NormalStep_NormalStep_Flow() {
		return getTask2NormalStepSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_solveCsp_BWD__Match_NormalStep_NormalStep_Flow() {
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
	public EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_Task_NormalStep_T2NS_NormalStep_Process_Flow_SequenceFlow_SF2F() {
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
	public EOperation getTask2NormalStepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_76__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_253__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_254__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_BWD_EMoflonEdge_77__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_255__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_256__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_257__EMoflonEdge() {
		return getTask2NormalStepSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__IsAppropriate_FWD_EMoflonEdge_258__EMoflonEdge() {
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
	public EOperation getTask2NormalStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Task_NormalStep_T2NS_NormalStep_Process_Flow_SequenceFlow_Task_SequenceFlow_SF2F_Match_Match() {
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
	public EOperation getTask2NormalStepSeq__GenerateModel__RuleEntryContainer_T2NS() {
		return getTask2NormalStepSeq().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_Task_NormalStep_T2NS_Process_Flow_SequenceFlow_SF2F_ModelgeneratorRuleResult() {
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
	public EClass getTask2NormalStepAfterSE() {
		if (task2NormalStepAfterSEEClass == null) {
			task2NormalStepAfterSEEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return task2NormalStepAfterSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD__Match_StartEvent_Process_SequenceFlow_Task_SequenceFlow() {
		return getTask2NormalStepAfterSE().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__Perform_FWD__IsApplicableMatch() {
		return getTask2NormalStepAfterSE().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsApplicable_FWD__Match() {
		return getTask2NormalStepAfterSE().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__RegisterObjectsToMatch_FWD__Match_StartEvent_Process_SequenceFlow_Task_SequenceFlow() {
		return getTask2NormalStepAfterSE().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_solveCsp_FWD__Match_StartEvent_Process_SequenceFlow_Task_SequenceFlow() {
		return getTask2NormalStepAfterSE().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2NormalStepAfterSE().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsApplicable_solveCsp_FWD__IsApplicableMatch_StartEvent_Process_Flow_SequenceFlow_Task_SequenceFlow_SF2F() {
		return getTask2NormalStepAfterSE().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2NormalStepAfterSE().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepAfterSE().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__CheckTypes_FWD__Match() {
		return getTask2NormalStepAfterSE().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_BWD__Match_Flow_NormalStep() {
		return getTask2NormalStepAfterSE().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__Perform_BWD__IsApplicableMatch() {
		return getTask2NormalStepAfterSE().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsApplicable_BWD__Match() {
		return getTask2NormalStepAfterSE().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__RegisterObjectsToMatch_BWD__Match_Flow_NormalStep() {
		return getTask2NormalStepAfterSE().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_solveCsp_BWD__Match_Flow_NormalStep() {
		return getTask2NormalStepAfterSE().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterSE().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsApplicable_solveCsp_BWD__IsApplicableMatch_StartEvent_Process_Flow_SequenceFlow_NormalStep_SF2F() {
		return getTask2NormalStepAfterSE().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterSE().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2NormalStepAfterSE().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__CheckTypes_BWD__Match() {
		return getTask2NormalStepAfterSE().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_259__EMoflonEdge() {
		return getTask2NormalStepAfterSE().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_260__EMoflonEdge() {
		return getTask2NormalStepAfterSE().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_BWD_EMoflonEdge_78__EMoflonEdge() {
		return getTask2NormalStepAfterSE().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_261__EMoflonEdge() {
		return getTask2NormalStepAfterSE().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_262__EMoflonEdge() {
		return getTask2NormalStepAfterSE().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_263__EMoflonEdge() {
		return getTask2NormalStepAfterSE().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsAppropriate_FWD_EMoflonEdge_264__EMoflonEdge() {
		return getTask2NormalStepAfterSE().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__CheckAttributes_FWD__TripleMatch() {
		return getTask2NormalStepAfterSE().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__CheckAttributes_BWD__TripleMatch() {
		return getTask2NormalStepAfterSE().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsApplicable_CC__Match_Match() {
		return getTask2NormalStepAfterSE().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StartEvent_Process_Flow_SequenceFlow_Task_NormalStep_SequenceFlow_SF2F_Match_Match() {
		return getTask2NormalStepAfterSE().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__IsApplicable_checkCsp_CC__CSP() {
		return getTask2NormalStepAfterSE().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__Perform_CC__IsApplicableMatchCC() {
		return getTask2NormalStepAfterSE().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__GenerateModel__RuleEntryContainer_SF2F() {
		return getTask2NormalStepAfterSE().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__GenerateModel_solveCsp_BWD__IsApplicableMatch_StartEvent_Process_Flow_SequenceFlow_SF2F_ModelgeneratorRuleResult() {
		return getTask2NormalStepAfterSE().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterSE__GenerateModel_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterSE().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2NormalStepAfterPG() {
		if (task2NormalStepAfterPGEClass == null) {
			task2NormalStepAfterPGEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(5);
		}
		return task2NormalStepAfterPGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD__Match_ParallelGateway_Process_SequenceFlow_Task_SequenceFlow() {
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
	public EOperation getTask2NormalStepAfterPG__RegisterObjectsToMatch_FWD__Match_ParallelGateway_Process_SequenceFlow_Task_SequenceFlow() {
		return getTask2NormalStepAfterPG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_Process_SequenceFlow_Task_SequenceFlow() {
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
	public EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_Process_Flow_SequenceFlow_Task_SequenceFlow_SF2F() {
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
	public EOperation getTask2NormalStepAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD__Match_Flow_NormalStep() {
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
	public EOperation getTask2NormalStepAfterPG__RegisterObjectsToMatch_BWD__Match_Flow_NormalStep() {
		return getTask2NormalStepAfterPG().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_solveCsp_BWD__Match_Flow_NormalStep() {
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
	public EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Process_Flow_SequenceFlow_NormalStep_SF2F() {
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
	public EOperation getTask2NormalStepAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_265__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_266__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_BWD_EMoflonEdge_79__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_267__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_268__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_269__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsAppropriate_FWD_EMoflonEdge_270__EMoflonEdge() {
		return getTask2NormalStepAfterPG().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__CheckAttributes_FWD__TripleMatch() {
		return getTask2NormalStepAfterPG().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__CheckAttributes_BWD__TripleMatch() {
		return getTask2NormalStepAfterPG().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_CC__Match_Match() {
		return getTask2NormalStepAfterPG().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ParallelGateway_Process_Flow_SequenceFlow_Task_NormalStep_SequenceFlow_SF2F_Match_Match() {
		return getTask2NormalStepAfterPG().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__IsApplicable_checkCsp_CC__CSP() {
		return getTask2NormalStepAfterPG().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__Perform_CC__IsApplicableMatchCC() {
		return getTask2NormalStepAfterPG().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__GenerateModel__RuleEntryContainer_SF2F() {
		return getTask2NormalStepAfterPG().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Process_Flow_SequenceFlow_SF2F_ModelgeneratorRuleResult() {
		return getTask2NormalStepAfterPG().getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2NormalStepAfterPG__GenerateModel_checkCsp_BWD__CSP() {
		return getTask2NormalStepAfterPG().getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGateway2ParallelStepSeq() {
		if (parallelGateway2ParallelStepSeqEClass == null) {
			parallelGateway2ParallelStepSeqEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(6);
		}
		return parallelGateway2ParallelStepSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD__Match_Task_Process_SequenceFlow_ParallelGateway() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__Perform_FWD__IsApplicableMatch() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsApplicable_FWD__Match() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__RegisterObjectsToMatch_FWD__Match_Task_Process_SequenceFlow_ParallelGateway() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_solveCsp_FWD__Match_Task_Process_SequenceFlow_ParallelGateway() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Task_NormalStep_T2NS_Process_BasicFlow_SequenceFlow_ParallelGateway_SF2F() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__CheckTypes_FWD__Match() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_BWD__Match_NormalStep_ParallelStep_BasicFlow() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__Perform_BWD__IsApplicableMatch() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsApplicable_BWD__Match() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__RegisterObjectsToMatch_BWD__Match_NormalStep_ParallelStep_BasicFlow() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_solveCsp_BWD__Match_NormalStep_ParallelStep_BasicFlow() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_Task_NormalStep_T2NS_ParallelStep_Process_BasicFlow_SequenceFlow_SF2F() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__CheckTypes_BWD__Match() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_80__EMoflonEdge() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_271__EMoflonEdge() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_BWD_EMoflonEdge_81__EMoflonEdge() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_272__EMoflonEdge() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsAppropriate_FWD_EMoflonEdge_273__EMoflonEdge() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__CheckAttributes_FWD__TripleMatch() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__CheckAttributes_BWD__TripleMatch() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsApplicable_CC__Match_Match() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsApplicable_solveCsp_CC__IsApplicableMatchCC_Task_NormalStep_T2NS_ParallelStep_Process_BasicFlow_SequenceFlow_ParallelGateway_SF2F_Match_Match() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__IsApplicable_checkCsp_CC__CSP() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__Perform_CC__IsApplicableMatchCC() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__GenerateModel__RuleEntryContainer_T2NS() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__GenerateModel_solveCsp_BWD__IsApplicableMatch_Task_NormalStep_T2NS_Process_BasicFlow_SequenceFlow_SF2F_ModelgeneratorRuleResult() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepSeq__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelGateway2ParallelStepSeq().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGateway2ParallelStepAfterSE() {
		if (parallelGateway2ParallelStepAfterSEEClass == null) {
			parallelGateway2ParallelStepAfterSEEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(7);
		}
		return parallelGateway2ParallelStepAfterSEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD__Match_StartEvent_Process_SequenceFlow_ParallelGateway() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__Perform_FWD__IsApplicableMatch() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_FWD__Match() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjectsToMatch_FWD__Match_StartEvent_Process_SequenceFlow_ParallelGateway() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_solveCsp_FWD__Match_StartEvent_Process_SequenceFlow_ParallelGateway() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_checkCsp_FWD__CSP() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_solveCsp_FWD__IsApplicableMatch_StartEvent_Process_BasicFlow_SequenceFlow_ParallelGateway_SF2F() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_checkCsp_FWD__CSP() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__CheckTypes_FWD__Match() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_BWD__Match_BasicFlow_ParallelStep() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__Perform_BWD__IsApplicableMatch() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_BWD__Match() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjectsToMatch_BWD__Match_BasicFlow_ParallelStep() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_solveCsp_BWD__Match_BasicFlow_ParallelStep() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_checkCsp_BWD__CSP() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_solveCsp_BWD__IsApplicableMatch_StartEvent_Process_BasicFlow_SequenceFlow_ParallelStep_SF2F() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_checkCsp_BWD__CSP() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__CheckTypes_BWD__Match() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_274__EMoflonEdge() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_BWD_EMoflonEdge_82__EMoflonEdge() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_275__EMoflonEdge() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsAppropriate_FWD_EMoflonEdge_276__EMoflonEdge() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__CheckAttributes_FWD__TripleMatch() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__CheckAttributes_BWD__TripleMatch() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_CC__Match_Match() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_solveCsp_CC__IsApplicableMatchCC_StartEvent_Process_BasicFlow_SequenceFlow_ParallelGateway_ParallelStep_SF2F_Match_Match() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__IsApplicable_checkCsp_CC__CSP() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__Perform_CC__IsApplicableMatchCC() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__GenerateModel__RuleEntryContainer_SF2F() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__GenerateModel_solveCsp_BWD__IsApplicableMatch_StartEvent_Process_BasicFlow_SequenceFlow_SF2F_ModelgeneratorRuleResult() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterSE__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelGateway2ParallelStepAfterSE().getEOperations()
				.get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGateway2ParallelStepAfterPG() {
		if (parallelGateway2ParallelStepAfterPGEClass == null) {
			parallelGateway2ParallelStepAfterPGEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return parallelGateway2ParallelStepAfterPGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD__Match_ParallelGateway_Process_SequenceFlow_ParallelGateway() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__Perform_FWD__IsApplicableMatch() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_FWD__Match() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjectsToMatch_FWD__Match_ParallelGateway_Process_SequenceFlow_ParallelGateway() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_Process_SequenceFlow_ParallelGateway() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_checkCsp_FWD__CSP() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_Process_BasicFlow_SequenceFlow_ParallelGateway_SF2F() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_checkCsp_FWD__CSP() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__CheckTypes_FWD__Match() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_BWD__Match_BasicFlow_ParallelStep() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__Perform_BWD__IsApplicableMatch() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_BWD__Match() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjectsToMatch_BWD__Match_BasicFlow_ParallelStep() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_solveCsp_BWD__Match_BasicFlow_ParallelStep() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_checkCsp_BWD__CSP() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Process_BasicFlow_SequenceFlow_ParallelStep_SF2F() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_checkCsp_BWD__CSP() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__CheckTypes_BWD__Match() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_277__EMoflonEdge() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_BWD_EMoflonEdge_83__EMoflonEdge() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_278__EMoflonEdge() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsAppropriate_FWD_EMoflonEdge_279__EMoflonEdge() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__CheckAttributes_FWD__TripleMatch() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__CheckAttributes_BWD__TripleMatch() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_CC__Match_Match() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ParallelGateway_Process_BasicFlow_SequenceFlow_ParallelGateway_ParallelStep_SF2F_Match_Match() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__IsApplicable_checkCsp_CC__CSP() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__Perform_CC__IsApplicableMatchCC() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__GenerateModel__RuleEntryContainer_SF2F() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_Process_BasicFlow_SequenceFlow_SF2F_ModelgeneratorRuleResult() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParallelGateway2ParallelStepAfterPG__GenerateModel_checkCsp_BWD__CSP() {
		return getParallelGateway2ParallelStepAfterPG().getEOperations()
				.get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceFlowAfterPG2ParallelFlow() {
		if (sequenceFlowAfterPG2ParallelFlowEClass == null) {
			sequenceFlowAfterPG2ParallelFlowEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return sequenceFlowAfterPG2ParallelFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD__Match_ParallelGateway_SequenceFlow_Process() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__Perform_FWD__IsApplicableMatch() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_FWD__Match() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__RegisterObjectsToMatch_FWD__Match_ParallelGateway_SequenceFlow_Process() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_SequenceFlow_Process() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_checkCsp_FWD__CSP() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelGateway_ParallelStep_PG2PS_SequenceFlow_Process_UseCase_P2UC() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_checkCsp_FWD__CSP() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__CheckTypes_FWD__Match() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_BWD__Match_ParallelStep_UseCase_ParallelFlow() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__Perform_BWD__IsApplicableMatch() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_BWD__Match() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__RegisterObjectsToMatch_BWD__Match_ParallelStep_UseCase_ParallelFlow() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_solveCsp_BWD__Match_ParallelStep_UseCase_ParallelFlow() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_checkCsp_BWD__CSP() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelGateway_ParallelStep_PG2PS_Process_UseCase_P2UC_ParallelFlow() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_checkCsp_BWD__CSP() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__CheckTypes_BWD__Match() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD_EMoflonEdge_280__EMoflonEdge() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD_EMoflonEdge_281__EMoflonEdge() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_BWD_EMoflonEdge_84__EMoflonEdge() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_FWD_EMoflonEdge_282__EMoflonEdge() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsAppropriate_BWD_EMoflonEdge_85__EMoflonEdge() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__CheckAttributes_FWD__TripleMatch() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__CheckAttributes_BWD__TripleMatch() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_CC__Match_Match() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_solveCsp_CC__IsApplicableMatchCC_ParallelGateway_ParallelStep_PG2PS_SequenceFlow_Process_UseCase_P2UC_ParallelFlow_Match_Match() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__IsApplicable_checkCsp_CC__CSP() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__Perform_CC__IsApplicableMatchCC() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__GenerateModel__RuleEntryContainer_PG2PS() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__GenerateModel_solveCsp_BWD__IsApplicableMatch_ParallelGateway_ParallelStep_PG2PS_Process_UseCase_P2UC_ModelgeneratorRuleResult() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlowAfterPG2ParallelFlow__GenerateModel_checkCsp_BWD__CSP() {
		return getSequenceFlowAfterPG2ParallelFlow().getEOperations().get(33);
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
			eClassifier.setInstanceClassName("Bpmn2UseCase.Rules."
					+ eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
