/**
 */
package de.abilov.tgg.bpmn2useCase.Rules.impl;

import TGGLanguage.TGGLanguagePackage;

import de.abilov.bpmn.BpmnPackage;

import de.abilov.tgg.bpmn2useCase.Bpmn2useCasePackage;

import de.abilov.tgg.bpmn2useCase.Rules.RulesFactory;
import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;

import de.abilov.tgg.bpmn2useCase.impl.Bpmn2useCasePackageImpl;

import de.abilov.useCase.UseCasePackage;

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
	private EClass task2StepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitAfterSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2StepSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2StepFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2StepAfterSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationSeqEClass = null;

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
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2StepAfterMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceAfterSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2StepAfterChoiceDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2StepAfterChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyDefaulFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStepInDefaultFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitAfterMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceAfterMergeEClass = null;

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
	private EClass splitAfterChoiceDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitAfterChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceAfterChoiceDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceAfterChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminationAfterMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass task2StepAfterEmptyDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitAfterEmptyDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceAfterEmptyDefEClass = null;

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
	 * @see de.abilov.tgg.bpmn2useCase.Rules.RulesPackage#eNS_URI
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
		BpmnPackage.eINSTANCE.eClass();
		UseCasePackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Bpmn2useCasePackageImpl theBpmn2useCasePackage = (Bpmn2useCasePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Bpmn2useCasePackage.eNS_URI) instanceof Bpmn2useCasePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(Bpmn2useCasePackage.eNS_URI)
						: Bpmn2useCasePackage.eINSTANCE);

		// Load packages
		theBpmn2useCasePackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theBpmn2useCasePackage.fixPackageContents();

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
	public EOperation getProcess2UseCase__IsAppropriate_FWD_EMoflonEdge_788__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_242__EMoflonEdge() {
		return getProcess2UseCase().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess2UseCase__IsAppropriate_BWD_EMoflonEdge_243__EMoflonEdge() {
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
	public EClass getTask2Step() {
		if (task2StepEClass == null) {
			task2StepEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(1);
		}
		return task2StepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplit() {
		if (splitEClass == null) {
			splitEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(2);
		}
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitAfterSplit() {
		if (splitAfterSplitEClass == null) {
			splitAfterSplitEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return splitAfterSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterSplit().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__Perform_FWD__IsApplicableMatch() {
		return getSplitAfterSplit().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsApplicable_FWD__Match() {
		return getSplitAfterSplit().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterSplit().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterSplit().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_checkCsp_FWD__CSP() {
		return getSplitAfterSplit().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_SequenceFlow_Flow_ParallelGateway_ParallelGateway() {
		return getSplitAfterSplit().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsApplicable_checkCsp_FWD__CSP() {
		return getSplitAfterSplit().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterSplit().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__CheckTypes_FWD__Match() {
		return getSplitAfterSplit().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow() {
		return getSplitAfterSplit().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__Perform_BWD__IsApplicableMatch() {
		return getSplitAfterSplit().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsApplicable_BWD__Match() {
		return getSplitAfterSplit().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__RegisterObjectsToMatch_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow() {
		return getSplitAfterSplit().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_solveCsp_BWD__Match_UseCase_ParallelStep_ParallelFlow_ParallelStep_Flow() {
		return getSplitAfterSplit().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_checkCsp_BWD__CSP() {
		return getSplitAfterSplit().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_ParallelGateway_UseCase_P2UC_ParallelStep_GW2S_ParallelFlow_ParallelStep_Flow() {
		return getSplitAfterSplit().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsApplicable_checkCsp_BWD__CSP() {
		return getSplitAfterSplit().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterSplit().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__CheckTypes_BWD__Match() {
		return getSplitAfterSplit().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_789__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_790__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_791__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_BWD_EMoflonEdge_244__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_BWD_EMoflonEdge_245__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_BWD_EMoflonEdge_246__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_792__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_793__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_794__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_795__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__IsAppropriate_FWD_EMoflonEdge_796__EMoflonEdge() {
		return getSplitAfterSplit().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__CheckAttributes_FWD__TripleMatch() {
		return getSplitAfterSplit().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterSplit__CheckAttributes_BWD__TripleMatch() {
		return getSplitAfterSplit().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2StepSeq() {
		if (task2StepSeqEClass == null) {
			task2StepSeqEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(4);
		}
		return task2StepSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2StepSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__Perform_FWD__IsApplicableMatch() {
		return getTask2StepSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsApplicable_FWD__Match() {
		return getTask2StepSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2StepSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2StepSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2StepSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_Process_SequenceFlow_Task() {
		return getTask2StepSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2StepSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__CheckTypes_FWD__Match() {
		return getTask2StepSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_BWD__Match_Flow_Step_NormalStep() {
		return getTask2StepSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__Perform_BWD__IsApplicableMatch() {
		return getTask2StepSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsApplicable_BWD__Match() {
		return getTask2StepSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__RegisterObjectsToMatch_BWD__Match_Flow_Step_NormalStep() {
		return getTask2StepSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_solveCsp_BWD__Match_Flow_Step_NormalStep() {
		return getTask2StepSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2StepSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_FlowNode_Flow_Step_NormalStep_Process() {
		return getTask2StepSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2StepSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__CheckTypes_BWD__Match() {
		return getTask2StepSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_BWD_EMoflonEdge_247__EMoflonEdge() {
		return getTask2StepSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_BWD_EMoflonEdge_248__EMoflonEdge() {
		return getTask2StepSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_797__EMoflonEdge() {
		return getTask2StepSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_798__EMoflonEdge() {
		return getTask2StepSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_799__EMoflonEdge() {
		return getTask2StepSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_800__EMoflonEdge() {
		return getTask2StepSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_801__EMoflonEdge() {
		return getTask2StepSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__IsAppropriate_FWD_EMoflonEdge_802__EMoflonEdge() {
		return getTask2StepSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__CheckAttributes_FWD__TripleMatch() {
		return getTask2StepSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepSeq__CheckAttributes_BWD__TripleMatch() {
		return getTask2StepSeq().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2StepFirst() {
		if (task2StepFirstEClass == null) {
			task2StepFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return task2StepFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2StepFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__Perform_FWD__IsApplicableMatch() {
		return getTask2StepFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsApplicable_FWD__Match() {
		return getTask2StepFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2StepFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_Task() {
		return getTask2StepFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2StepFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_SequenceFlow_Task() {
		return getTask2StepFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2StepFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__CheckTypes_FWD__Match() {
		return getTask2StepFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_BWD__Match_NormalStep_Flow() {
		return getTask2StepFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__Perform_BWD__IsApplicableMatch() {
		return getTask2StepFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsApplicable_BWD__Match() {
		return getTask2StepFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow() {
		return getTask2StepFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow() {
		return getTask2StepFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2StepFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_NormalStep_FlowNode_Flow_Process() {
		return getTask2StepFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2StepFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__CheckTypes_BWD__Match() {
		return getTask2StepFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_BWD_EMoflonEdge_249__EMoflonEdge() {
		return getTask2StepFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_803__EMoflonEdge() {
		return getTask2StepFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_804__EMoflonEdge() {
		return getTask2StepFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_805__EMoflonEdge() {
		return getTask2StepFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_806__EMoflonEdge() {
		return getTask2StepFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_807__EMoflonEdge() {
		return getTask2StepFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__IsAppropriate_FWD_EMoflonEdge_808__EMoflonEdge() {
		return getTask2StepFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__CheckAttributes_FWD__TripleMatch() {
		return getTask2StepFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepFirst__CheckAttributes_BWD__TripleMatch() {
		return getTask2StepFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitSeq() {
		if (splitSeqEClass == null) {
			splitSeqEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(6);
		}
		return splitSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__Perform_FWD__IsApplicableMatch() {
		return getSplitSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsApplicable_FWD__Match() {
		return getSplitSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getSplitSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getSplitSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__CheckTypes_FWD__Match() {
		return getSplitSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_BWD__Match_Flow_Step_ParallelStep() {
		return getSplitSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__Perform_BWD__IsApplicableMatch() {
		return getSplitSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsApplicable_BWD__Match() {
		return getSplitSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__RegisterObjectsToMatch_BWD__Match_Flow_Step_ParallelStep() {
		return getSplitSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_solveCsp_BWD__Match_Flow_Step_ParallelStep() {
		return getSplitSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getSplitSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2S_Flow_FlowNode_Step_ParallelStep_Process() {
		return getSplitSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getSplitSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__CheckTypes_BWD__Match() {
		return getSplitSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_BWD_EMoflonEdge_250__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_BWD_EMoflonEdge_251__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_809__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_810__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_811__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_812__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_813__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_814__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_815__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__IsAppropriate_FWD_EMoflonEdge_816__EMoflonEdge() {
		return getSplitSeq().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__CheckAttributes_FWD__TripleMatch() {
		return getSplitSeq().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitSeq__CheckAttributes_BWD__TripleMatch() {
		return getSplitSeq().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitFirst() {
		if (splitFirstEClass == null) {
			splitFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(7);
		}
		return splitFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__Perform_FWD__IsApplicableMatch() {
		return getSplitFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsApplicable_FWD__Match() {
		return getSplitFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getSplitFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_FlowNode_Flow_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getSplitFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__CheckTypes_FWD__Match() {
		return getSplitFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_BWD__Match_ParallelStep_Flow() {
		return getSplitFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__Perform_BWD__IsApplicableMatch() {
		return getSplitFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsApplicable_BWD__Match() {
		return getSplitFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__RegisterObjectsToMatch_BWD__Match_ParallelStep_Flow() {
		return getSplitFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_solveCsp_BWD__Match_ParallelStep_Flow() {
		return getSplitFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getSplitFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_ParallelStep_FlowNode_Flow_Process() {
		return getSplitFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getSplitFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__CheckTypes_BWD__Match() {
		return getSplitFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_BWD_EMoflonEdge_252__EMoflonEdge() {
		return getSplitFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_817__EMoflonEdge() {
		return getSplitFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_818__EMoflonEdge() {
		return getSplitFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_819__EMoflonEdge() {
		return getSplitFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_820__EMoflonEdge() {
		return getSplitFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_821__EMoflonEdge() {
		return getSplitFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_822__EMoflonEdge() {
		return getSplitFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_823__EMoflonEdge() {
		return getSplitFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__IsAppropriate_FWD_EMoflonEdge_824__EMoflonEdge() {
		return getSplitFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__CheckAttributes_FWD__TripleMatch() {
		return getSplitFirst().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitFirst__CheckAttributes_BWD__TripleMatch() {
		return getSplitFirst().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminationFirst() {
		if (terminationFirstEClass == null) {
			terminationFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return terminationFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getTerminationFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__Perform_FWD__IsApplicableMatch() {
		return getTerminationFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsApplicable_FWD__Match() {
		return getTerminationFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getTerminationFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getTerminationFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getTerminationFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_SequenceFlow_EndEvent() {
		return getTerminationFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getTerminationFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTerminationFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__CheckTypes_FWD__Match() {
		return getTerminationFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_BWD__Match_Flow_UCCondition() {
		return getTerminationFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__Perform_BWD__IsApplicableMatch() {
		return getTerminationFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsApplicable_BWD__Match() {
		return getTerminationFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__RegisterObjectsToMatch_BWD__Match_Flow_UCCondition() {
		return getTerminationFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_solveCsp_BWD__Match_Flow_UCCondition() {
		return getTerminationFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getTerminationFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FN2F_Flow_FlowNode_Process_UCCondition() {
		return getTerminationFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getTerminationFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTerminationFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__CheckTypes_BWD__Match() {
		return getTerminationFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_825__EMoflonEdge() {
		return getTerminationFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_826__EMoflonEdge() {
		return getTerminationFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_827__EMoflonEdge() {
		return getTerminationFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_828__EMoflonEdge() {
		return getTerminationFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_BWD_EMoflonEdge_253__EMoflonEdge() {
		return getTerminationFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_829__EMoflonEdge() {
		return getTerminationFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__IsAppropriate_FWD_EMoflonEdge_830__EMoflonEdge() {
		return getTerminationFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__CheckAttributes_FWD__TripleMatch() {
		return getTerminationFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationFirst__CheckAttributes_BWD__TripleMatch() {
		return getTerminationFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2StepAfterSplit() {
		if (task2StepAfterSplitEClass == null) {
			task2StepAfterSplitEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return task2StepAfterSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_FWD__Match_ParallelGateway_SequenceFlow_Process_Task() {
		return getTask2StepAfterSplit().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__Perform_FWD__IsApplicableMatch() {
		return getTask2StepAfterSplit().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsApplicable_FWD__Match() {
		return getTask2StepAfterSplit().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__RegisterObjectsToMatch_FWD__Match_ParallelGateway_SequenceFlow_Process_Task() {
		return getTask2StepAfterSplit().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_solveCsp_FWD__Match_ParallelGateway_SequenceFlow_Process_Task() {
		return getTask2StepAfterSplit().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2StepAfterSplit().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsApplicable_solveCsp_FWD__IsApplicableMatch_GW2S_ParallelGateway_ParallelStep_SequenceFlow_Process_UseCase_P2UC_Flow_Task() {
		return getTask2StepAfterSplit().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2StepAfterSplit().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterSplit().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__CheckTypes_FWD__Match() {
		return getTask2StepAfterSplit().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow() {
		return getTask2StepAfterSplit().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__Perform_BWD__IsApplicableMatch() {
		return getTask2StepAfterSplit().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsApplicable_BWD__Match() {
		return getTask2StepAfterSplit().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__RegisterObjectsToMatch_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow() {
		return getTask2StepAfterSplit().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_solveCsp_BWD__Match_NormalStep_ParallelStep_UseCase_ParallelFlow_Flow() {
		return getTask2StepAfterSplit().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2StepAfterSplit().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_GW2S_ParallelGateway_ParallelStep_Process_UseCase_P2UC_ParallelFlow_Flow() {
		return getTask2StepAfterSplit().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2StepAfterSplit().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterSplit().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__CheckTypes_BWD__Match() {
		return getTask2StepAfterSplit().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_831__EMoflonEdge() {
		return getTask2StepAfterSplit().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_832__EMoflonEdge() {
		return getTask2StepAfterSplit().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_BWD_EMoflonEdge_254__EMoflonEdge() {
		return getTask2StepAfterSplit().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_833__EMoflonEdge() {
		return getTask2StepAfterSplit().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_BWD_EMoflonEdge_255__EMoflonEdge() {
		return getTask2StepAfterSplit().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_BWD_EMoflonEdge_256__EMoflonEdge() {
		return getTask2StepAfterSplit().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_834__EMoflonEdge() {
		return getTask2StepAfterSplit().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_835__EMoflonEdge() {
		return getTask2StepAfterSplit().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__IsAppropriate_FWD_EMoflonEdge_836__EMoflonEdge() {
		return getTask2StepAfterSplit().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__CheckAttributes_FWD__TripleMatch() {
		return getTask2StepAfterSplit().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterSplit__CheckAttributes_BWD__TripleMatch() {
		return getTask2StepAfterSplit().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermination() {
		if (terminationEClass == null) {
			terminationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return terminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminationSeq() {
		if (terminationSeqEClass == null) {
			terminationSeqEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return terminationSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getTerminationSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__Perform_FWD__IsApplicableMatch() {
		return getTerminationSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsApplicable_FWD__Match() {
		return getTerminationSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getTerminationSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_EndEvent() {
		return getTerminationSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getTerminationSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_Step_FlowNode_Flow_FN2S_Process_SequenceFlow_EndEvent() {
		return getTerminationSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getTerminationSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTerminationSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__CheckTypes_FWD__Match() {
		return getTerminationSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_BWD__Match_UCCondition_Step_Flow() {
		return getTerminationSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__Perform_BWD__IsApplicableMatch() {
		return getTerminationSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsApplicable_BWD__Match() {
		return getTerminationSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__RegisterObjectsToMatch_BWD__Match_UCCondition_Step_Flow() {
		return getTerminationSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_solveCsp_BWD__Match_UCCondition_Step_Flow() {
		return getTerminationSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getTerminationSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_UCCondition_Step_FlowNode_Flow_FN2S_Process() {
		return getTerminationSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getTerminationSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTerminationSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__CheckTypes_BWD__Match() {
		return getTerminationSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_BWD_EMoflonEdge_257__EMoflonEdge() {
		return getTerminationSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_BWD_EMoflonEdge_258__EMoflonEdge() {
		return getTerminationSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_837__EMoflonEdge() {
		return getTerminationSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_838__EMoflonEdge() {
		return getTerminationSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_839__EMoflonEdge() {
		return getTerminationSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_840__EMoflonEdge() {
		return getTerminationSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_841__EMoflonEdge() {
		return getTerminationSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__IsAppropriate_FWD_EMoflonEdge_842__EMoflonEdge() {
		return getTerminationSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__CheckAttributes_FWD__TripleMatch() {
		return getTerminationSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationSeq__CheckAttributes_BWD__TripleMatch() {
		return getTerminationSeq().getEOperations().get(29);
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
	public EOperation getLastStepInPFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_UseCase_P2UC() {
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
	public EOperation getLastStepInPFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getLastStepInPFlow__IsAppropriate_BWD__Match_ParallelStep_ParallelFlow_Step_UseCase() {
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
	public EOperation getLastStepInPFlow__RegisterObjectsToMatch_BWD__Match_ParallelStep_ParallelFlow_Step_UseCase() {
		return getLastStepInPFlow().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_solveCsp_BWD__Match_ParallelStep_ParallelFlow_Step_UseCase() {
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
	public EOperation getLastStepInPFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ParallelStep_ParallelFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_UseCase_P2UC() {
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
	public EOperation getLastStepInPFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_843__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_844__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_845__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_846__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_FWD_EMoflonEdge_847__EMoflonEdge() {
		return getLastStepInPFlow().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInPFlow__IsAppropriate_BWD_EMoflonEdge_259__EMoflonEdge() {
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
	public EClass getChoice() {
		if (choiceEClass == null) {
			choiceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(14);
		}
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2StepAfterMerge() {
		if (task2StepAfterMergeEClass == null) {
			task2StepAfterMergeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(15);
		}
		return task2StepAfterMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_Task() {
		return getTask2StepAfterMerge().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__Perform_FWD__IsApplicableMatch() {
		return getTask2StepAfterMerge().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsApplicable_FWD__Match() {
		return getTask2StepAfterMerge().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_Task() {
		return getTask2StepAfterMerge().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_Task() {
		return getTask2StepAfterMerge().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2StepAfterMerge().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_SequenceFlow_FlowNode_FN2S_Process_SequenceFlow_Task() {
		return getTask2StepAfterMerge().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2StepAfterMerge().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterMerge().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__CheckTypes_FWD__Match() {
		return getTask2StepAfterMerge().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_NormalStep() {
		return getTask2StepAfterMerge().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__Perform_BWD__IsApplicableMatch() {
		return getTask2StepAfterMerge().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsApplicable_BWD__Match() {
		return getTask2StepAfterMerge().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_NormalStep() {
		return getTask2StepAfterMerge().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_NormalStep() {
		return getTask2StepAfterMerge().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2StepAfterMerge().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_NormalStep_SequenceFlow_FlowNode_FN2S_Process() {
		return getTask2StepAfterMerge().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2StepAfterMerge().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterMerge().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__CheckTypes_BWD__Match() {
		return getTask2StepAfterMerge().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_BWD_EMoflonEdge_260__EMoflonEdge() {
		return getTask2StepAfterMerge().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_BWD_EMoflonEdge_261__EMoflonEdge() {
		return getTask2StepAfterMerge().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_848__EMoflonEdge() {
		return getTask2StepAfterMerge().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_849__EMoflonEdge() {
		return getTask2StepAfterMerge().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_850__EMoflonEdge() {
		return getTask2StepAfterMerge().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_851__EMoflonEdge() {
		return getTask2StepAfterMerge().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_852__EMoflonEdge() {
		return getTask2StepAfterMerge().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__IsAppropriate_FWD_EMoflonEdge_853__EMoflonEdge() {
		return getTask2StepAfterMerge().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__CheckAttributes_FWD__TripleMatch() {
		return getTask2StepAfterMerge().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterMerge__CheckAttributes_BWD__TripleMatch() {
		return getTask2StepAfterMerge().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceSeq() {
		if (choiceSeqEClass == null) {
			choiceSeqEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(16);
		}
		return choiceSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceSeq().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__Perform_FWD__IsApplicableMatch() {
		return getChoiceSeq().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsApplicable_FWD__Match() {
		return getChoiceSeq().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceSeq().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceSeq().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_checkCsp_FWD__CSP() {
		return getChoiceSeq().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsApplicable_solveCsp_FWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceSeq().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsApplicable_checkCsp_FWD__CSP() {
		return getChoiceSeq().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceSeq().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__CheckTypes_FWD__Match() {
		return getChoiceSeq().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_BWD__Match_Step_Flow_ChoiceStep() {
		return getChoiceSeq().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__Perform_BWD__IsApplicableMatch() {
		return getChoiceSeq().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsApplicable_BWD__Match() {
		return getChoiceSeq().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__RegisterObjectsToMatch_BWD__Match_Step_Flow_ChoiceStep() {
		return getChoiceSeq().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_solveCsp_BWD__Match_Step_Flow_ChoiceStep() {
		return getChoiceSeq().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_checkCsp_BWD__CSP() {
		return getChoiceSeq().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsApplicable_solveCsp_BWD__IsApplicableMatch_FlowNode_Step_FN2S_Flow_ChoiceStep_Process() {
		return getChoiceSeq().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsApplicable_checkCsp_BWD__CSP() {
		return getChoiceSeq().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceSeq().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__CheckTypes_BWD__Match() {
		return getChoiceSeq().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_BWD_EMoflonEdge_262__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_BWD_EMoflonEdge_263__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_854__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_855__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_856__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_857__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_858__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_859__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_860__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__IsAppropriate_FWD_EMoflonEdge_861__EMoflonEdge() {
		return getChoiceSeq().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__CheckAttributes_FWD__TripleMatch() {
		return getChoiceSeq().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceSeq__CheckAttributes_BWD__TripleMatch() {
		return getChoiceSeq().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceFirst() {
		if (choiceFirstEClass == null) {
			choiceFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(17);
		}
		return choiceFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__Perform_FWD__IsApplicableMatch() {
		return getChoiceFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsApplicable_FWD__Match() {
		return getChoiceFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__RegisterObjectsToMatch_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_solveCsp_FWD__Match_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getChoiceFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_FlowNode_Flow_FN2F_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getChoiceFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__CheckTypes_FWD__Match() {
		return getChoiceFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_BWD__Match_Flow_ChoiceStep() {
		return getChoiceFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__Perform_BWD__IsApplicableMatch() {
		return getChoiceFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsApplicable_BWD__Match() {
		return getChoiceFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__RegisterObjectsToMatch_BWD__Match_Flow_ChoiceStep() {
		return getChoiceFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_solveCsp_BWD__Match_Flow_ChoiceStep() {
		return getChoiceFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getChoiceFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_FlowNode_Flow_FN2F_ChoiceStep_Process() {
		return getChoiceFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getChoiceFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__CheckTypes_BWD__Match() {
		return getChoiceFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_BWD_EMoflonEdge_264__EMoflonEdge() {
		return getChoiceFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_862__EMoflonEdge() {
		return getChoiceFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_863__EMoflonEdge() {
		return getChoiceFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_864__EMoflonEdge() {
		return getChoiceFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_865__EMoflonEdge() {
		return getChoiceFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_866__EMoflonEdge() {
		return getChoiceFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_867__EMoflonEdge() {
		return getChoiceFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_868__EMoflonEdge() {
		return getChoiceFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__IsAppropriate_FWD_EMoflonEdge_869__EMoflonEdge() {
		return getChoiceFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__CheckAttributes_FWD__TripleMatch() {
		return getChoiceFirst().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceFirst__CheckAttributes_BWD__TripleMatch() {
		return getChoiceFirst().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceAfterSplit() {
		if (choiceAfterSplitEClass == null) {
			choiceAfterSplitEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(18);
		}
		return choiceAfterSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterSplit().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__Perform_FWD__IsApplicableMatch() {
		return getChoiceAfterSplit().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsApplicable_FWD__Match() {
		return getChoiceAfterSplit().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__RegisterObjectsToMatch_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterSplit().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_solveCsp_FWD__Match_Process_ParallelGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterSplit().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_checkCsp_FWD__CSP() {
		return getChoiceAfterSplit().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_SequenceFlow_Flow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterSplit().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsApplicable_checkCsp_FWD__CSP() {
		return getChoiceAfterSplit().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterSplit().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__CheckTypes_FWD__Match() {
		return getChoiceAfterSplit().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow() {
		return getChoiceAfterSplit().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__Perform_BWD__IsApplicableMatch() {
		return getChoiceAfterSplit().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsApplicable_BWD__Match() {
		return getChoiceAfterSplit().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__RegisterObjectsToMatch_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow() {
		return getChoiceAfterSplit().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_solveCsp_BWD__Match_UseCase_ParallelStep_ParallelFlow_ChoiceStep_Flow() {
		return getChoiceAfterSplit().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_checkCsp_BWD__CSP() {
		return getChoiceAfterSplit().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsApplicable_solveCsp_BWD__IsApplicableMatch_Process_UseCase_P2UC_ParallelGateway_ParallelStep_GW2S_ParallelFlow_ChoiceStep_Flow() {
		return getChoiceAfterSplit().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsApplicable_checkCsp_BWD__CSP() {
		return getChoiceAfterSplit().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterSplit().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__CheckTypes_BWD__Match() {
		return getChoiceAfterSplit().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_870__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_BWD_EMoflonEdge_265__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_871__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_872__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_BWD_EMoflonEdge_266__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_BWD_EMoflonEdge_267__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_873__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_874__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_875__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_876__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__IsAppropriate_FWD_EMoflonEdge_877__EMoflonEdge() {
		return getChoiceAfterSplit().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__CheckAttributes_FWD__TripleMatch() {
		return getChoiceAfterSplit().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterSplit__CheckAttributes_BWD__TripleMatch() {
		return getChoiceAfterSplit().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2StepAfterChoiceDef() {
		if (task2StepAfterChoiceDefEClass == null) {
			task2StepAfterChoiceDefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(19);
		}
		return task2StepAfterChoiceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2StepAfterChoiceDef().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__Perform_FWD__IsApplicableMatch() {
		return getTask2StepAfterChoiceDef().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsApplicable_FWD__Match() {
		return getTask2StepAfterChoiceDef().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2StepAfterChoiceDef().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2StepAfterChoiceDef().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2StepAfterChoiceDef().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_Task() {
		return getTask2StepAfterChoiceDef().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2StepAfterChoiceDef().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterChoiceDef().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__CheckTypes_FWD__Match() {
		return getTask2StepAfterChoiceDef().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_BWD__Match_NormalStep_Flow_ChoiceStep() {
		return getTask2StepAfterChoiceDef().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__Perform_BWD__IsApplicableMatch() {
		return getTask2StepAfterChoiceDef().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsApplicable_BWD__Match() {
		return getTask2StepAfterChoiceDef().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_ChoiceStep() {
		return getTask2StepAfterChoiceDef().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_ChoiceStep() {
		return getTask2StepAfterChoiceDef().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2StepAfterChoiceDef().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_NormalStep_Flow_ExclusiveGateway_ChoiceStep_GW2S_Process() {
		return getTask2StepAfterChoiceDef().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2StepAfterChoiceDef().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterChoiceDef().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__CheckTypes_BWD__Match() {
		return getTask2StepAfterChoiceDef().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_268__EMoflonEdge() {
		return getTask2StepAfterChoiceDef().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_878__EMoflonEdge() {
		return getTask2StepAfterChoiceDef().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_879__EMoflonEdge() {
		return getTask2StepAfterChoiceDef().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_880__EMoflonEdge() {
		return getTask2StepAfterChoiceDef().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_269__EMoflonEdge() {
		return getTask2StepAfterChoiceDef().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_881__EMoflonEdge() {
		return getTask2StepAfterChoiceDef().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_882__EMoflonEdge() {
		return getTask2StepAfterChoiceDef().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_883__EMoflonEdge() {
		return getTask2StepAfterChoiceDef().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_884__EMoflonEdge() {
		return getTask2StepAfterChoiceDef().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__CheckAttributes_FWD__TripleMatch() {
		return getTask2StepAfterChoiceDef().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoiceDef__CheckAttributes_BWD__TripleMatch() {
		return getTask2StepAfterChoiceDef().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2StepAfterChoice() {
		if (task2StepAfterChoiceEClass == null) {
			task2StepAfterChoiceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(20);
		}
		return task2StepAfterChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2StepAfterChoice().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__Perform_FWD__IsApplicableMatch() {
		return getTask2StepAfterChoice().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsApplicable_FWD__Match() {
		return getTask2StepAfterChoice().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2StepAfterChoice().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_Task() {
		return getTask2StepAfterChoice().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2StepAfterChoice().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Process_UseCase_P2UC_Flow_Task() {
		return getTask2StepAfterChoice().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2StepAfterChoice().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterChoice().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__CheckTypes_FWD__Match() {
		return getTask2StepAfterChoice().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow() {
		return getTask2StepAfterChoice().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__Perform_BWD__IsApplicableMatch() {
		return getTask2StepAfterChoice().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsApplicable_BWD__Match() {
		return getTask2StepAfterChoice().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__RegisterObjectsToMatch_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow() {
		return getTask2StepAfterChoice().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_NormalStep_AlternativeFlow_UseCase_StepAlternative_Flow() {
		return getTask2StepAfterChoice().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2StepAfterChoice().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_NormalStep_AlternativeFlow_Process_UseCase_P2UC_StepAlternative_Flow() {
		return getTask2StepAfterChoice().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2StepAfterChoice().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterChoice().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__CheckTypes_BWD__Match() {
		return getTask2StepAfterChoice().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_885__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_886__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_BWD_EMoflonEdge_270__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_BWD_EMoflonEdge_271__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_887__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_BWD_EMoflonEdge_272__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_BWD_EMoflonEdge_273__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_888__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_889__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__IsAppropriate_FWD_EMoflonEdge_890__EMoflonEdge() {
		return getTask2StepAfterChoice().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__CheckAttributes_FWD__TripleMatch() {
		return getTask2StepAfterChoice().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterChoice__CheckAttributes_BWD__TripleMatch() {
		return getTask2StepAfterChoice().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyDefaulFlow() {
		if (emptyDefaulFlowEClass == null) {
			emptyDefaulFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(21);
		}
		return emptyDefaulFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_FWD__Match_ExclusiveGateway_Process_ExclusiveGateway_SequenceFlow() {
		return getEmptyDefaulFlow().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__Perform_FWD__IsApplicableMatch() {
		return getEmptyDefaulFlow().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsApplicable_FWD__Match() {
		return getEmptyDefaulFlow().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_Process_ExclusiveGateway_SequenceFlow() {
		return getEmptyDefaulFlow().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_Process_ExclusiveGateway_SequenceFlow() {
		return getEmptyDefaulFlow().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_checkCsp_FWD__CSP() {
		return getEmptyDefaulFlow().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_Process_UseCase_P2UC_Flow_GW2S_ExclusiveGateway_SequenceFlow() {
		return getEmptyDefaulFlow().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsApplicable_checkCsp_FWD__CSP() {
		return getEmptyDefaulFlow().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEmptyDefaulFlow().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__CheckTypes_FWD__Match() {
		return getEmptyDefaulFlow().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_BWD__Match_ChoiceStep_UseCase_Flow() {
		return getEmptyDefaulFlow().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__Perform_BWD__IsApplicableMatch() {
		return getEmptyDefaulFlow().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsApplicable_BWD__Match() {
		return getEmptyDefaulFlow().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__RegisterObjectsToMatch_BWD__Match_ChoiceStep_UseCase_Flow() {
		return getEmptyDefaulFlow().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_UseCase_Flow() {
		return getEmptyDefaulFlow().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_checkCsp_BWD__CSP() {
		return getEmptyDefaulFlow().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_Process_UseCase_P2UC_Flow_GW2S_ExclusiveGateway() {
		return getEmptyDefaulFlow().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsApplicable_checkCsp_BWD__CSP() {
		return getEmptyDefaulFlow().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEmptyDefaulFlow().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__CheckTypes_BWD__Match() {
		return getEmptyDefaulFlow().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_891__EMoflonEdge() {
		return getEmptyDefaulFlow().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_892__EMoflonEdge() {
		return getEmptyDefaulFlow().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_893__EMoflonEdge() {
		return getEmptyDefaulFlow().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_BWD_EMoflonEdge_274__EMoflonEdge() {
		return getEmptyDefaulFlow().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_894__EMoflonEdge() {
		return getEmptyDefaulFlow().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_895__EMoflonEdge() {
		return getEmptyDefaulFlow().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__IsAppropriate_FWD_EMoflonEdge_896__EMoflonEdge() {
		return getEmptyDefaulFlow().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__CheckAttributes_FWD__TripleMatch() {
		return getEmptyDefaulFlow().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmptyDefaulFlow__CheckAttributes_BWD__TripleMatch() {
		return getEmptyDefaulFlow().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStepInDefaultFlow() {
		if (lastStepInDefaultFlowEClass == null) {
			lastStepInDefaultFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(22);
		}
		return lastStepInDefaultFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getLastStepInDefaultFlow().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__Perform_FWD__IsApplicableMatch() {
		return getLastStepInDefaultFlow().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsApplicable_FWD__Match() {
		return getLastStepInDefaultFlow().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__RegisterObjectsToMatch_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getLastStepInDefaultFlow().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_solveCsp_FWD__Match_Process_Gateway_Gateway_FlowNode_SequenceFlow() {
		return getLastStepInDefaultFlow().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_checkCsp_FWD__CSP() {
		return getLastStepInDefaultFlow().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_SequenceFlow_FN2S_GW2S_UseCase_P2UC() {
		return getLastStepInDefaultFlow().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsApplicable_checkCsp_FWD__CSP() {
		return getLastStepInDefaultFlow().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLastStepInDefaultFlow().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__CheckTypes_FWD__Match() {
		return getLastStepInDefaultFlow().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_UseCase() {
		return getLastStepInDefaultFlow().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__Perform_BWD__IsApplicableMatch() {
		return getLastStepInDefaultFlow().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsApplicable_BWD__Match() {
		return getLastStepInDefaultFlow().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_UseCase() {
		return getLastStepInDefaultFlow().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_UseCase() {
		return getLastStepInDefaultFlow().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_checkCsp_BWD__CSP() {
		return getLastStepInDefaultFlow().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_ChoiceStep_Step_Flow_Process_Gateway_Gateway_FlowNode_FN2S_GW2S_UseCase_P2UC() {
		return getLastStepInDefaultFlow().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsApplicable_checkCsp_BWD__CSP() {
		return getLastStepInDefaultFlow().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLastStepInDefaultFlow().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__CheckTypes_BWD__Match() {
		return getLastStepInDefaultFlow().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_BWD_EMoflonEdge_275__EMoflonEdge() {
		return getLastStepInDefaultFlow().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_897__EMoflonEdge() {
		return getLastStepInDefaultFlow().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_898__EMoflonEdge() {
		return getLastStepInDefaultFlow().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_899__EMoflonEdge() {
		return getLastStepInDefaultFlow().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_900__EMoflonEdge() {
		return getLastStepInDefaultFlow().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__IsAppropriate_FWD_EMoflonEdge_901__EMoflonEdge() {
		return getLastStepInDefaultFlow().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__CheckAttributes_FWD__TripleMatch() {
		return getLastStepInDefaultFlow().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInDefaultFlow__CheckAttributes_BWD__TripleMatch() {
		return getLastStepInDefaultFlow().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitAfterMerge() {
		if (splitAfterMergeEClass == null) {
			splitAfterMergeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(23);
		}
		return splitAfterMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterMerge().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__Perform_FWD__IsApplicableMatch() {
		return getSplitAfterMerge().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsApplicable_FWD__Match() {
		return getSplitAfterMerge().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterMerge().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterMerge().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_checkCsp_FWD__CSP() {
		return getSplitAfterMerge().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_SequenceFlow_FlowNode_FN2S_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterMerge().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsApplicable_checkCsp_FWD__CSP() {
		return getSplitAfterMerge().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterMerge().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__CheckTypes_FWD__Match() {
		return getSplitAfterMerge().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_ParallelStep() {
		return getSplitAfterMerge().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__Perform_BWD__IsApplicableMatch() {
		return getSplitAfterMerge().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsApplicable_BWD__Match() {
		return getSplitAfterMerge().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_ParallelStep() {
		return getSplitAfterMerge().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_ParallelStep() {
		return getSplitAfterMerge().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_checkCsp_BWD__CSP() {
		return getSplitAfterMerge().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_ParallelStep_SequenceFlow_FlowNode_FN2S_Process() {
		return getSplitAfterMerge().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsApplicable_checkCsp_BWD__CSP() {
		return getSplitAfterMerge().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterMerge().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__CheckTypes_BWD__Match() {
		return getSplitAfterMerge().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_BWD_EMoflonEdge_276__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_BWD_EMoflonEdge_277__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_902__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_903__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_904__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_905__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_906__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_907__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_908__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__IsAppropriate_FWD_EMoflonEdge_909__EMoflonEdge() {
		return getSplitAfterMerge().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__CheckAttributes_FWD__TripleMatch() {
		return getSplitAfterMerge().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterMerge__CheckAttributes_BWD__TripleMatch() {
		return getSplitAfterMerge().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceAfterMerge() {
		if (choiceAfterMergeEClass == null) {
			choiceAfterMergeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return choiceAfterMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterMerge().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__Perform_FWD__IsApplicableMatch() {
		return getChoiceAfterMerge().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsApplicable_FWD__Match() {
		return getChoiceAfterMerge().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterMerge().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_FlowNode_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterMerge().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_checkCsp_FWD__CSP() {
		return getChoiceAfterMerge().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_SequenceFlow_FlowNode_FN2S_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterMerge().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsApplicable_checkCsp_FWD__CSP() {
		return getChoiceAfterMerge().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterMerge().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__CheckTypes_FWD__Match() {
		return getChoiceAfterMerge().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_BWD__Match_ChoiceStep_Step_Flow_NormalStep() {
		return getChoiceAfterMerge().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__Perform_BWD__IsApplicableMatch() {
		return getChoiceAfterMerge().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsApplicable_BWD__Match() {
		return getChoiceAfterMerge().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__RegisterObjectsToMatch_BWD__Match_ChoiceStep_Step_Flow_NormalStep() {
		return getChoiceAfterMerge().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_Step_Flow_NormalStep() {
		return getChoiceAfterMerge().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_checkCsp_BWD__CSP() {
		return getChoiceAfterMerge().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Step_Flow_NormalStep_SequenceFlow_FlowNode_FN2S_Process() {
		return getChoiceAfterMerge().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsApplicable_checkCsp_BWD__CSP() {
		return getChoiceAfterMerge().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterMerge().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__CheckTypes_BWD__Match() {
		return getChoiceAfterMerge().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_BWD_EMoflonEdge_278__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_BWD_EMoflonEdge_279__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_910__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_911__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_912__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_913__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_914__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_915__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_916__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__IsAppropriate_FWD_EMoflonEdge_917__EMoflonEdge() {
		return getChoiceAfterMerge().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__CheckAttributes_FWD__TripleMatch() {
		return getChoiceAfterMerge().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterMerge__CheckAttributes_BWD__TripleMatch() {
		return getChoiceAfterMerge().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStepInAltFlow() {
		if (lastStepInAltFlowEClass == null) {
			lastStepInAltFlowEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(25);
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
	public EOperation getLastStepInAltFlow__IsApplicable_solveCsp_FWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_SequenceFlow_Step_FN2S_GW2S_UseCase_P2UC() {
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
	public EOperation getLastStepInAltFlow__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getLastStepInAltFlow__IsAppropriate_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step_UseCase() {
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
	public EOperation getLastStepInAltFlow__RegisterObjectsToMatch_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step_UseCase() {
		return getLastStepInAltFlow().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_solveCsp_BWD__Match_StepAlternative_ChoiceStep_AlternativeFlow_Step_UseCase() {
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
	public EOperation getLastStepInAltFlow__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_ChoiceStep_AlternativeFlow_Process_Gateway_Gateway_FlowNode_Step_FN2S_GW2S_UseCase_P2UC() {
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
	public EOperation getLastStepInAltFlow__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
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
	public EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_280__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_918__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_919__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_920__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_921__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_FWD_EMoflonEdge_922__EMoflonEdge() {
		return getLastStepInAltFlow().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLastStepInAltFlow__IsAppropriate_BWD_EMoflonEdge_281__EMoflonEdge() {
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
	public EClass getSplitAfterChoiceDef() {
		if (splitAfterChoiceDefEClass == null) {
			splitAfterChoiceDefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(26);
		}
		return splitAfterChoiceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway() {
		return getSplitAfterChoiceDef().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__Perform_FWD__IsApplicableMatch() {
		return getSplitAfterChoiceDef().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsApplicable_FWD__Match() {
		return getSplitAfterChoiceDef().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway() {
		return getSplitAfterChoiceDef().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ParallelGateway_ParallelGateway() {
		return getSplitAfterChoiceDef().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_checkCsp_FWD__CSP() {
		return getSplitAfterChoiceDef().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Flow_Process_ParallelGateway_ParallelGateway() {
		return getSplitAfterChoiceDef().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsApplicable_checkCsp_FWD__CSP() {
		return getSplitAfterChoiceDef().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterChoiceDef().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__CheckTypes_FWD__Match() {
		return getSplitAfterChoiceDef().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_BWD__Match_ChoiceStep_ParallelStep_Flow() {
		return getSplitAfterChoiceDef().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__Perform_BWD__IsApplicableMatch() {
		return getSplitAfterChoiceDef().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsApplicable_BWD__Match() {
		return getSplitAfterChoiceDef().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__RegisterObjectsToMatch_BWD__Match_ChoiceStep_ParallelStep_Flow() {
		return getSplitAfterChoiceDef().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_ParallelStep_Flow() {
		return getSplitAfterChoiceDef().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_checkCsp_BWD__CSP() {
		return getSplitAfterChoiceDef().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_ParallelStep_Flow_Process() {
		return getSplitAfterChoiceDef().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsApplicable_checkCsp_BWD__CSP() {
		return getSplitAfterChoiceDef().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterChoiceDef().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__CheckTypes_BWD__Match() {
		return getSplitAfterChoiceDef().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_923__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_924__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_925__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_282__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_283__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_926__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_927__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_928__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_929__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_930__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_931__EMoflonEdge() {
		return getSplitAfterChoiceDef().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__CheckAttributes_FWD__TripleMatch() {
		return getSplitAfterChoiceDef().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoiceDef__CheckAttributes_BWD__TripleMatch() {
		return getSplitAfterChoiceDef().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitAfterChoice() {
		if (splitAfterChoiceEClass == null) {
			splitAfterChoiceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(27);
		}
		return splitAfterChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterChoice().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__Perform_FWD__IsApplicableMatch() {
		return getSplitAfterChoice().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsApplicable_FWD__Match() {
		return getSplitAfterChoice().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterChoice().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterChoice().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_checkCsp_FWD__CSP() {
		return getSplitAfterChoice().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterChoice().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsApplicable_checkCsp_FWD__CSP() {
		return getSplitAfterChoice().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterChoice().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__CheckTypes_FWD__Match() {
		return getSplitAfterChoice().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep() {
		return getSplitAfterChoice().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__Perform_BWD__IsApplicableMatch() {
		return getSplitAfterChoice().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsApplicable_BWD__Match() {
		return getSplitAfterChoice().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__RegisterObjectsToMatch_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep() {
		return getSplitAfterChoice().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_solveCsp_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ParallelStep() {
		return getSplitAfterChoice().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_checkCsp_BWD__CSP() {
		return getSplitAfterChoice().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ExclusiveGateway_ChoiceStep_GW2S_AlternativeFlow_ParallelStep() {
		return getSplitAfterChoice().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsApplicable_checkCsp_BWD__CSP() {
		return getSplitAfterChoice().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterChoice().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__CheckTypes_BWD__Match() {
		return getSplitAfterChoice().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_284__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_932__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_285__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_933__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_934__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_286__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_BWD_EMoflonEdge_287__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_935__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_936__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_937__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_938__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__IsAppropriate_FWD_EMoflonEdge_939__EMoflonEdge() {
		return getSplitAfterChoice().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__CheckAttributes_FWD__TripleMatch() {
		return getSplitAfterChoice().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterChoice__CheckAttributes_BWD__TripleMatch() {
		return getSplitAfterChoice().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceAfterChoiceDef() {
		if (choiceAfterChoiceDefEClass == null) {
			choiceAfterChoiceDefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(28);
		}
		return choiceAfterChoiceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterChoiceDef().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__Perform_FWD__IsApplicableMatch() {
		return getChoiceAfterChoiceDef().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsApplicable_FWD__Match() {
		return getChoiceAfterChoiceDef().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterChoiceDef().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_SequenceFlow_Process_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterChoiceDef().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_checkCsp_FWD__CSP() {
		return getChoiceAfterChoiceDef().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_SequenceFlow_Flow_Process_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterChoiceDef().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsApplicable_checkCsp_FWD__CSP() {
		return getChoiceAfterChoiceDef().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterChoiceDef().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__CheckTypes_FWD__Match() {
		return getChoiceAfterChoiceDef().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_BWD__Match_ChoiceStep_ChoiceStep_Flow() {
		return getChoiceAfterChoiceDef().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__Perform_BWD__IsApplicableMatch() {
		return getChoiceAfterChoiceDef().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsApplicable_BWD__Match() {
		return getChoiceAfterChoiceDef().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__RegisterObjectsToMatch_BWD__Match_ChoiceStep_ChoiceStep_Flow() {
		return getChoiceAfterChoiceDef().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_ChoiceStep_Flow() {
		return getChoiceAfterChoiceDef().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_checkCsp_BWD__CSP() {
		return getChoiceAfterChoiceDef().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_ChoiceStep_Flow_Process() {
		return getChoiceAfterChoiceDef().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsApplicable_checkCsp_BWD__CSP() {
		return getChoiceAfterChoiceDef().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterChoiceDef().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__CheckTypes_BWD__Match() {
		return getChoiceAfterChoiceDef().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_940__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_941__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_942__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_288__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_BWD_EMoflonEdge_289__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_943__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_944__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_945__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_946__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_947__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__IsAppropriate_FWD_EMoflonEdge_948__EMoflonEdge() {
		return getChoiceAfterChoiceDef().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__CheckAttributes_FWD__TripleMatch() {
		return getChoiceAfterChoiceDef().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoiceDef__CheckAttributes_BWD__TripleMatch() {
		return getChoiceAfterChoiceDef().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceAfterChoice() {
		if (choiceAfterChoiceEClass == null) {
			choiceAfterChoiceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(29);
		}
		return choiceAfterChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterChoice().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__Perform_FWD__IsApplicableMatch() {
		return getChoiceAfterChoice().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsApplicable_FWD__Match() {
		return getChoiceAfterChoice().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__RegisterObjectsToMatch_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterChoice().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_solveCsp_FWD__Match_Process_ExclusiveGateway_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterChoice().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_checkCsp_FWD__CSP() {
		return getChoiceAfterChoice().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsApplicable_solveCsp_FWD__IsApplicableMatch_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterChoice().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsApplicable_checkCsp_FWD__CSP() {
		return getChoiceAfterChoice().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterChoice().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__CheckTypes_FWD__Match() {
		return getChoiceAfterChoice().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep() {
		return getChoiceAfterChoice().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__Perform_BWD__IsApplicableMatch() {
		return getChoiceAfterChoice().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsApplicable_BWD__Match() {
		return getChoiceAfterChoice().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__RegisterObjectsToMatch_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep() {
		return getChoiceAfterChoice().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_solveCsp_BWD__Match_StepAlternative_UseCase_Flow_ChoiceStep_AlternativeFlow_ChoiceStep() {
		return getChoiceAfterChoice().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_checkCsp_BWD__CSP() {
		return getChoiceAfterChoice().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsApplicable_solveCsp_BWD__IsApplicableMatch_StepAlternative_Process_UseCase_P2UC_Flow_ChoiceStep_ExclusiveGateway_GW2S_AlternativeFlow_ChoiceStep() {
		return getChoiceAfterChoice().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsApplicable_checkCsp_BWD__CSP() {
		return getChoiceAfterChoice().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterChoice().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__CheckTypes_BWD__Match() {
		return getChoiceAfterChoice().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_290__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_949__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_291__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_292__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_950__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_951__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_BWD_EMoflonEdge_293__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_952__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_953__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_954__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_955__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__IsAppropriate_FWD_EMoflonEdge_956__EMoflonEdge() {
		return getChoiceAfterChoice().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__CheckAttributes_FWD__TripleMatch() {
		return getChoiceAfterChoice().getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterChoice__CheckAttributes_BWD__TripleMatch() {
		return getChoiceAfterChoice().getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminationAfterMerge() {
		if (terminationAfterMergeEClass == null) {
			terminationAfterMergeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(30);
		}
		return terminationAfterMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_FWD__Match_ExclusiveGateway_Process_SequenceFlow_EndEvent() {
		return getTerminationAfterMerge().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__Perform_FWD__IsApplicableMatch() {
		return getTerminationAfterMerge().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsApplicable_FWD__Match() {
		return getTerminationAfterMerge().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__RegisterObjectsToMatch_FWD__Match_ExclusiveGateway_Process_SequenceFlow_EndEvent() {
		return getTerminationAfterMerge().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_solveCsp_FWD__Match_ExclusiveGateway_Process_SequenceFlow_EndEvent() {
		return getTerminationAfterMerge().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_checkCsp_FWD__CSP() {
		return getTerminationAfterMerge().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process_SequenceFlow_EndEvent() {
		return getTerminationAfterMerge().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsApplicable_checkCsp_FWD__CSP() {
		return getTerminationAfterMerge().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTerminationAfterMerge().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__CheckTypes_FWD__Match() {
		return getTerminationAfterMerge().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_BWD__Match_UCCondition_ChoiceStep_Flow() {
		return getTerminationAfterMerge().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__Perform_BWD__IsApplicableMatch() {
		return getTerminationAfterMerge().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsApplicable_BWD__Match() {
		return getTerminationAfterMerge().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__RegisterObjectsToMatch_BWD__Match_UCCondition_ChoiceStep_Flow() {
		return getTerminationAfterMerge().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_solveCsp_BWD__Match_UCCondition_ChoiceStep_Flow() {
		return getTerminationAfterMerge().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_checkCsp_BWD__CSP() {
		return getTerminationAfterMerge().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsApplicable_solveCsp_BWD__IsApplicableMatch_UCCondition_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process() {
		return getTerminationAfterMerge().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsApplicable_checkCsp_BWD__CSP() {
		return getTerminationAfterMerge().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTerminationAfterMerge().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__CheckTypes_BWD__Match() {
		return getTerminationAfterMerge().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_BWD_EMoflonEdge_294__EMoflonEdge() {
		return getTerminationAfterMerge().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_BWD_EMoflonEdge_295__EMoflonEdge() {
		return getTerminationAfterMerge().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_957__EMoflonEdge() {
		return getTerminationAfterMerge().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_958__EMoflonEdge() {
		return getTerminationAfterMerge().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_959__EMoflonEdge() {
		return getTerminationAfterMerge().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_960__EMoflonEdge() {
		return getTerminationAfterMerge().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_961__EMoflonEdge() {
		return getTerminationAfterMerge().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__IsAppropriate_FWD_EMoflonEdge_962__EMoflonEdge() {
		return getTerminationAfterMerge().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__CheckAttributes_FWD__TripleMatch() {
		return getTerminationAfterMerge().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminationAfterMerge__CheckAttributes_BWD__TripleMatch() {
		return getTerminationAfterMerge().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask2StepAfterEmptyDef() {
		if (task2StepAfterEmptyDefEClass == null) {
			task2StepAfterEmptyDefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(31);
		}
		return task2StepAfterEmptyDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_Task() {
		return getTask2StepAfterEmptyDef().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__Perform_FWD__IsApplicableMatch() {
		return getTask2StepAfterEmptyDef().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsApplicable_FWD__Match() {
		return getTask2StepAfterEmptyDef().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_Task() {
		return getTask2StepAfterEmptyDef().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_Task() {
		return getTask2StepAfterEmptyDef().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_checkCsp_FWD__CSP() {
		return getTask2StepAfterEmptyDef().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_GW2S_Flow_ChoiceStep_ExclusiveGateway_Process_SequenceFlow_Task() {
		return getTask2StepAfterEmptyDef().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsApplicable_checkCsp_FWD__CSP() {
		return getTask2StepAfterEmptyDef().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterEmptyDef().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__CheckTypes_FWD__Match() {
		return getTask2StepAfterEmptyDef().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_BWD__Match_NormalStep_Flow_ChoiceStep() {
		return getTask2StepAfterEmptyDef().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__Perform_BWD__IsApplicableMatch() {
		return getTask2StepAfterEmptyDef().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsApplicable_BWD__Match() {
		return getTask2StepAfterEmptyDef().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__RegisterObjectsToMatch_BWD__Match_NormalStep_Flow_ChoiceStep() {
		return getTask2StepAfterEmptyDef().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_solveCsp_BWD__Match_NormalStep_Flow_ChoiceStep() {
		return getTask2StepAfterEmptyDef().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_checkCsp_BWD__CSP() {
		return getTask2StepAfterEmptyDef().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_GW2S_NormalStep_Flow_ChoiceStep_ExclusiveGateway_Process() {
		return getTask2StepAfterEmptyDef().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsApplicable_checkCsp_BWD__CSP() {
		return getTask2StepAfterEmptyDef().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTask2StepAfterEmptyDef().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__CheckTypes_BWD__Match() {
		return getTask2StepAfterEmptyDef().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_296__EMoflonEdge() {
		return getTask2StepAfterEmptyDef().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_297__EMoflonEdge() {
		return getTask2StepAfterEmptyDef().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_963__EMoflonEdge() {
		return getTask2StepAfterEmptyDef().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_964__EMoflonEdge() {
		return getTask2StepAfterEmptyDef().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_965__EMoflonEdge() {
		return getTask2StepAfterEmptyDef().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_966__EMoflonEdge() {
		return getTask2StepAfterEmptyDef().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_967__EMoflonEdge() {
		return getTask2StepAfterEmptyDef().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_968__EMoflonEdge() {
		return getTask2StepAfterEmptyDef().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__CheckAttributes_FWD__TripleMatch() {
		return getTask2StepAfterEmptyDef().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask2StepAfterEmptyDef__CheckAttributes_BWD__TripleMatch() {
		return getTask2StepAfterEmptyDef().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitAfterEmptyDef() {
		if (splitAfterEmptyDefEClass == null) {
			splitAfterEmptyDefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(32);
		}
		return splitAfterEmptyDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterEmptyDef().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__Perform_FWD__IsApplicableMatch() {
		return getSplitAfterEmptyDef().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsApplicable_FWD__Match() {
		return getSplitAfterEmptyDef().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterEmptyDef().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterEmptyDef().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_checkCsp_FWD__CSP() {
		return getSplitAfterEmptyDef().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_ChoiceStep_GW2S_Flow_ExclusiveGateway_Process_SequenceFlow_ParallelGateway_ParallelGateway() {
		return getSplitAfterEmptyDef().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsApplicable_checkCsp_FWD__CSP() {
		return getSplitAfterEmptyDef().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterEmptyDef().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__CheckTypes_FWD__Match() {
		return getSplitAfterEmptyDef().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_BWD__Match_ChoiceStep_NormalStep_Flow() {
		return getSplitAfterEmptyDef().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__Perform_BWD__IsApplicableMatch() {
		return getSplitAfterEmptyDef().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsApplicable_BWD__Match() {
		return getSplitAfterEmptyDef().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__RegisterObjectsToMatch_BWD__Match_ChoiceStep_NormalStep_Flow() {
		return getSplitAfterEmptyDef().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_NormalStep_Flow() {
		return getSplitAfterEmptyDef().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_checkCsp_BWD__CSP() {
		return getSplitAfterEmptyDef().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_ChoiceStep_GW2S_NormalStep_Flow_ExclusiveGateway_Process() {
		return getSplitAfterEmptyDef().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsApplicable_checkCsp_BWD__CSP() {
		return getSplitAfterEmptyDef().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSplitAfterEmptyDef().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__CheckTypes_BWD__Match() {
		return getSplitAfterEmptyDef().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_298__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_299__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_969__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_970__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_971__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_972__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_973__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_974__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_975__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_976__EMoflonEdge() {
		return getSplitAfterEmptyDef().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__CheckAttributes_FWD__TripleMatch() {
		return getSplitAfterEmptyDef().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSplitAfterEmptyDef__CheckAttributes_BWD__TripleMatch() {
		return getSplitAfterEmptyDef().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceAfterEmptyDef() {
		if (choiceAfterEmptyDefEClass == null) {
			choiceAfterEmptyDefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(33);
		}
		return choiceAfterEmptyDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterEmptyDef().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__Perform_FWD__IsApplicableMatch() {
		return getChoiceAfterEmptyDef().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsApplicable_FWD__Match() {
		return getChoiceAfterEmptyDef().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__RegisterObjectsToMatch_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterEmptyDef().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_solveCsp_FWD__Match_SequenceFlow_ExclusiveGateway_ExclusiveGateway_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterEmptyDef().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_checkCsp_FWD__CSP() {
		return getChoiceAfterEmptyDef().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsApplicable_solveCsp_FWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_ExclusiveGateway_ChoiceStep_GW2S_Flow_Process_SequenceFlow_ExclusiveGateway_ExclusiveGateway() {
		return getChoiceAfterEmptyDef().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsApplicable_checkCsp_FWD__CSP() {
		return getChoiceAfterEmptyDef().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterEmptyDef().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__CheckTypes_FWD__Match() {
		return getChoiceAfterEmptyDef().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_BWD__Match_ChoiceStep_NormalStep_Flow() {
		return getChoiceAfterEmptyDef().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__Perform_BWD__IsApplicableMatch() {
		return getChoiceAfterEmptyDef().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsApplicable_BWD__Match() {
		return getChoiceAfterEmptyDef().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__RegisterObjectsToMatch_BWD__Match_ChoiceStep_NormalStep_Flow() {
		return getChoiceAfterEmptyDef().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_solveCsp_BWD__Match_ChoiceStep_NormalStep_Flow() {
		return getChoiceAfterEmptyDef().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_checkCsp_BWD__CSP() {
		return getChoiceAfterEmptyDef().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsApplicable_solveCsp_BWD__IsApplicableMatch_SequenceFlow_ExclusiveGateway_ExclusiveGateway_ChoiceStep_GW2S_NormalStep_Flow_Process() {
		return getChoiceAfterEmptyDef().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsApplicable_checkCsp_BWD__CSP() {
		return getChoiceAfterEmptyDef().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getChoiceAfterEmptyDef().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__CheckTypes_BWD__Match() {
		return getChoiceAfterEmptyDef().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_300__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_BWD_EMoflonEdge_301__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_977__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_978__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_979__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_980__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_981__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_982__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_983__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__IsAppropriate_FWD_EMoflonEdge_984__EMoflonEdge() {
		return getChoiceAfterEmptyDef().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__CheckAttributes_FWD__TripleMatch() {
		return getChoiceAfterEmptyDef().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoiceAfterEmptyDef__CheckAttributes_BWD__TripleMatch() {
		return getChoiceAfterEmptyDef().getEOperations().get(31);
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
			eClassifier.setInstanceClassName("de.abilov.tgg.bpmn2useCase.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
