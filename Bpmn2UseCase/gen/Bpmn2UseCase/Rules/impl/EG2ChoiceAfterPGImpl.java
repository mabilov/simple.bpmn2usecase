/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.GW2S;
import Bpmn2UseCase.P2UC;

import Bpmn2UseCase.Rules.EG2ChoiceAfterPG;
import Bpmn2UseCase.Rules.RulesPackage;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.ChoiceStep;
import SimpleUseCase.Flow;
import SimpleUseCase.ParallelFlow;
import SimpleUseCase.ParallelStep;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.Step;
import SimpleUseCase.UseCase;

import TGGLanguage.csp.CSP;

import TGGLanguage.modelgenerator.RuleEntryContainer;
import TGGLanguage.modelgenerator.RuleEntryList;

import TGGRuntime.AttributeConstraintsRuleResult;
import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableMatchCC;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.ModelgeneratorRuleResult;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;

import TGGRuntime.impl.AbstractRuleImpl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;
import TGGRuntime.TripleMatchNodeMapping;
import java.util.Optional;
import TGGRuntime.TripleMatchNodeMapping;
import java.util.Optional;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EG2 Choice After PG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EG2ChoiceAfterPGImpl extends AbstractRuleImpl implements EG2ChoiceAfterPG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EG2ChoiceAfterPGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEG2ChoiceAfterPG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SimpleBPMN.Process process, ParallelGateway prevNode,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		// initial bindings
		Object[] result1_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_0_1_blackBBBBBBB(this, match, process,
				prevNode, sf1, egw, ecgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode
							+ ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_0_2_bindingAndBlackFBBBBBBB(this, match, process, prevNode, sf1, egw, ecgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_0_4_blackBBBBBB(match, process,
					prevNode, sf1, egw, ecgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", "
						+ "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", "
						+ "[ecgw] = " + ecgw + ".");
			}
			EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_0_4_greenBBBBBBFFFFFFFF(match, process, prevNode, sf1, egw,
					ecgw);
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[7];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[8];
					// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result4_green[9];
					// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result4_green[10];
					// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result4_green[11];
					// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result4_green[12];
					// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_0_5_blackBBBBBB(match, process,
					prevNode, sf1, egw, ecgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", "
								+ "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
			}
			EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_0_5_greenBBBF(match, process, prevNode);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_0_6_expressionBBBBBBB(this, match, process, prevNode, sf1,
					egw, ecgw);
			return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_0_7_expressionF();
		} else {
			return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_1_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[2];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[3];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[4];
		GW2S pg2ps = (GW2S) result1_bindingAndBlack[5];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[6];
		Flow flow = (Flow) result1_bindingAndBlack[7];
		ExclusiveGateway egw = (ExclusiveGateway) result1_bindingAndBlack[8];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_1_1_greenBBFFBFBFB(useCase, pstep, egw,
				ecgw, csp);
		ParallelFlow pflow = (ParallelFlow) result1_green[2];
		ChoiceStep step = (ChoiceStep) result1_green[3];
		GW2S egwToStep = (GW2S) result1_green[5];
		GW2S ecgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_1_2_blackBBBBBBB(sf1, pflow, step, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[egw] = "
					+ egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = "
					+ ecgwToStep + ".");
		}
		Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_1_2_greenFBBBBBBB(sf1, pflow, step, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_1_3_blackBBBBBBBBBBBBBBB(ruleresult,
				process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, egwToStep, ecgw,
				ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[p2uc] = " + p2uc + ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", "
					+ "[pg2ps] = " + pg2ps + ", " + "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = "
					+ step + ", " + "[flow] = " + flow + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep
					+ ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, process, useCase,
				prevNode, pstep, sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[21];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[22];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_1_5_expressionBBBBBBBBBBBBBBBB(this, ruleresult, process, useCase,
				p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, egwToStep, ecgw, ecgwToStep);
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		ParallelGateway prevNode = (ParallelGateway) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[3];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[4];
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_2_2_blackBFFBFFBBBB(process,
				prevNode, sf1, egw, ecgw, match)) {
			UseCase useCase = (UseCase) result2_black[1];
			P2UC p2uc = (P2UC) result2_black[2];
			ParallelStep pstep = (ParallelStep) result2_black[4];
			GW2S pg2ps = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_2_3_blackBBBBBBBFBB(process,
					useCase, p2uc, prevNode, pstep, pg2ps, sf1, egw, ecgw)) {
				Flow flow = (Flow) result3_black[7];
				Object[] result3_green = EG2ChoiceAfterPGImpl
						.pattern_EG2ChoiceAfterPG_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(process, useCase, p2uc, prevNode,
								pstep, pg2ps, sf1, flow, egw, ecgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pg2ps__prevNode____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge pg2ps__pstep____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[22];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[24];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = EG2ChoiceAfterPGImpl
						.pattern_EG2ChoiceAfterPG_2_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, process,
								useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc
							+ ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[pg2ps] = "
							+ pg2ps + ", " + "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", " + "[egw] = " + egw
							+ ", " + "[ecgw] = " + ecgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SimpleBPMN.Process process, ParallelGateway prevNode,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		match.registerObject("process", process);
		match.registerObject("prevNode", prevNode);
		match.registerObject("sf1", sf1);
		match.registerObject("egw", egw);
		match.registerObject("ecgw", ecgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SimpleBPMN.Process process, ParallelGateway prevNode,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1,
			Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		// Create unbound variables
		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow.id", csp);
		var_pflow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_pflow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_egw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pg2ps", pg2ps);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("egw", egw);
		isApplicableMatch.registerObject("ecgw", ecgw);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject process, EObject useCase, EObject p2uc,
			EObject prevNode, EObject pstep, EObject pg2ps, EObject sf1, EObject pflow, EObject step, EObject flow,
			EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("pg2ps", pg2ps);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pflow", pflow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("egw", egw);
		ruleresult.registerObject("egwToStep", egwToStep);
		ruleresult.registerObject("ecgw", ecgw);
		ruleresult.registerObject("ecgwToStep", ecgwToStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("sf1").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow())
				&& match.getObject("egw").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getExclusiveGateway())
				&& match.getObject("ecgw").eClass()
						.equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getExclusiveGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_10_1_blackBBBBBBB(this, match, useCase,
				pstep, pflow, step, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", "
					+ "[pstep] = " + pstep + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", "
					+ "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_10_2_bindingAndBlackFBBBBBBB(this, match, useCase, pstep, pflow, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = " + pstep
					+ ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_10_4_blackBBBBBB(match, useCase,
					pstep, pflow, step, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = "
						+ pstep + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = " + flow
						+ ".");
			}
			EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_10_4_greenBBBBBFFF(match, useCase, pstep, pflow, step);
			// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result4_green[5];
			// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result4_green[6];
			// EMoflonEdge pflow__step____steps = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_10_5_blackBBBBBB(match, useCase,
					pstep, pflow, step, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[useCase] = " + useCase + ", " + "[pstep] = " + pstep + ", "
								+ "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_10_5_greenBBBBFF(match, useCase, pstep, flow);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_10_6_expressionBBBBBBB(this, match, useCase, pstep, pflow,
					step, flow);
			return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_10_7_expressionF();
		} else {
			return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_11_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[2];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[3];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[4];
		GW2S pg2ps = (GW2S) result1_bindingAndBlack[5];
		ParallelFlow pflow = (ParallelFlow) result1_bindingAndBlack[6];
		ChoiceStep step = (ChoiceStep) result1_bindingAndBlack[7];
		Flow flow = (Flow) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_11_1_greenBBFBFFFFB(process, prevNode,
				step, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[2];
		ExclusiveGateway egw = (ExclusiveGateway) result1_green[4];
		GW2S egwToStep = (GW2S) result1_green[5];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_green[6];
		GW2S ecgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_11_2_blackBBBBBBB(sf1, pflow, step, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[egw] = "
					+ egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = "
					+ ecgwToStep + ".");
		}
		Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_11_2_greenFBBBBBBB(sf1, pflow, step, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_11_3_blackBBBBBBBBBBBBBBB(ruleresult,
				process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, egwToStep, ecgw,
				ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[p2uc] = " + p2uc + ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", "
					+ "[pg2ps] = " + pg2ps + ", " + "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[step] = "
					+ step + ", " + "[flow] = " + flow + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep
					+ ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, process,
				useCase, prevNode, pstep, sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[21];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[22];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[24];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[26];

		// perform postprocessing story node is empty
		// register objects
		EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_11_5_expressionBBBBBBBBBBBBBBBB(this, ruleresult, process,
				useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, egwToStep, ecgw, ecgwToStep);
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		ParallelStep pstep = (ParallelStep) result2_binding[1];
		ParallelFlow pflow = (ParallelFlow) result2_binding[2];
		ChoiceStep step = (ChoiceStep) result2_binding[3];
		Flow flow = (Flow) result2_binding[4];
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_2_blackFBFFBFBBBB(useCase, pstep,
				pflow, step, flow, match)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			P2UC p2uc = (P2UC) result2_black[2];
			ParallelGateway prevNode = (ParallelGateway) result2_black[3];
			GW2S pg2ps = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_3_blackBBBBBBBBB(process,
					useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow)) {
				Object[] result3_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_3_greenBBBBBBBBBFFFFFFFFFFF(
						process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pg2ps__prevNode____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pg2ps__pstep____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = EG2ChoiceAfterPGImpl
						.pattern_EG2ChoiceAfterPG_12_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, process,
								useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc
							+ ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[pg2ps] = "
							+ pg2ps + ", " + "[pflow] = " + pflow + ", " + "[step] = " + step + ", " + "[flow] = "
							+ flow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {
		match.registerObject("useCase", useCase);
		match.registerObject("pstep", pstep);
		match.registerObject("pflow", pflow);
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow.id", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", csp);
		var_sf1_id.setType("String");
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", csp);
		var_egw_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_pflow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_egw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pg2ps", pg2ps);
		isApplicableMatch.registerObject("pflow", pflow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("flow", flow);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject process, EObject useCase, EObject p2uc,
			EObject prevNode, EObject pstep, EObject pg2ps, EObject sf1, EObject pflow, EObject step, EObject flow,
			EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("pg2ps", pg2ps);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pflow", pflow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("egw", egw);
		ruleresult.registerObject("egwToStep", egwToStep);
		ruleresult.registerObject("ecgw", ecgw);
		ruleresult.registerObject("ecgwToStep", ecgwToStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("pflow").eClass()
						.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getParallelFlow())
				&& match.getObject("step").eClass()
						.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getChoiceStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1266(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_20_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_20_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_402(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_21_2_blackFFFFFB(_edge_flows)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow pflow = (ParallelFlow) result2_black[2];
			ChoiceStep step = (ChoiceStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_21_3_expressionFBBBBBBB(this, match, useCase, pstep,
					pflow, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1267(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_22_2_blackFFFFFB(_edge_sourceRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_22_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1268(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_23_2_blackFFFFFB(_edge_outgoing)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_23_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_403(EMoflonEdge _edge_invokedFlows) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_24_2_blackFFFFFB(_edge_invokedFlows)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow pflow = (ParallelFlow) result2_black[2];
			ChoiceStep step = (ChoiceStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_24_3_expressionFBBBBBBB(this, match, useCase, pstep,
					pflow, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_404(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_25_2_blackFFFFFB(_edge_steps)) {
			UseCase useCase = (UseCase) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			ParallelFlow pflow = (ParallelFlow) result2_black[2];
			ChoiceStep step = (ChoiceStep) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_25_3_expressionFBBBBBBB(this, match, useCase, pstep,
					pflow, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1269(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_26_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_26_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1270(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_27_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_27_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1271(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_28_2_blackFFFFFB(_edge_targetRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_28_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1272(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_29_2_blackFFFFFB(_edge_incoming)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_29_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_29_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1273(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_30_2_blackFFFFFB(_edge___conv)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			ParallelGateway prevNode = (ParallelGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_30_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_30_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_30_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_30_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EG2ChoiceAfterPG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		Bpmn2UseCase.P2UC p2uc = (Bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.ParallelGateway prevNode = (SimpleBPMN.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		SimpleUseCase.ParallelStep pstep = (SimpleUseCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPg2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pg2ps")).findAny();
		Bpmn2UseCase.GW2S pg2ps = (Bpmn2UseCase.GW2S) matchForPg2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPflow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pflow")).findAny();
		SimpleUseCase.ParallelFlow pflow = (SimpleUseCase.ParallelFlow) matchForPflow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ChoiceStep step = (SimpleUseCase.ChoiceStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egw")).findAny();
		SimpleBPMN.ExclusiveGateway egw = (SimpleBPMN.ExclusiveGateway) matchForEgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egwToStep")).findAny();
		Bpmn2UseCase.GW2S egwToStep = (Bpmn2UseCase.GW2S) matchForEgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgw")).findAny();
		SimpleBPMN.ExclusiveGateway ecgw = (SimpleBPMN.ExclusiveGateway) matchForEcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgwToStep")).findAny();
		Bpmn2UseCase.GW2S ecgwToStep = (Bpmn2UseCase.GW2S) matchForEcgwToStep.get().getNode();

		if (!(prevNode.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(egw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(ecgw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");

		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("EG2ChoiceAfterPG");
		eq0.solve(var_sf1_id, var_pflow_id);

		eq1.setRuleName("EG2ChoiceAfterPG");
		eq1.solve(var_egw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_pflow_id.setBound(false);
			var_step_id.setBound(false);
			eq0.solve(var_sf1_id, var_pflow_id);
			eq1.solve(var_egw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				pflow.setId((String) var_pflow_id.getValue());
				step.setId((String) var_step_id.getValue());
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EG2ChoiceAfterPG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		Bpmn2UseCase.P2UC p2uc = (Bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.ParallelGateway prevNode = (SimpleBPMN.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		SimpleUseCase.ParallelStep pstep = (SimpleUseCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPg2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pg2ps")).findAny();
		Bpmn2UseCase.GW2S pg2ps = (Bpmn2UseCase.GW2S) matchForPg2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPflow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pflow")).findAny();
		SimpleUseCase.ParallelFlow pflow = (SimpleUseCase.ParallelFlow) matchForPflow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.ChoiceStep step = (SimpleUseCase.ChoiceStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egw")).findAny();
		SimpleBPMN.ExclusiveGateway egw = (SimpleBPMN.ExclusiveGateway) matchForEgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egwToStep")).findAny();
		Bpmn2UseCase.GW2S egwToStep = (Bpmn2UseCase.GW2S) matchForEgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgw")).findAny();
		SimpleBPMN.ExclusiveGateway ecgw = (SimpleBPMN.ExclusiveGateway) matchForEcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgwToStep")).findAny();
		Bpmn2UseCase.GW2S ecgwToStep = (Bpmn2UseCase.GW2S) matchForEcgwToStep.get().getNode();

		if (!(prevNode.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(egw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(ecgw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");

		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("EG2ChoiceAfterPG");
		eq0.solve(var_sf1_id, var_pflow_id);

		eq1.setRuleName("EG2ChoiceAfterPG");
		eq1.solve(var_egw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf1_id.setBound(false);
			var_egw_id.setBound(false);
			eq0.solve(var_sf1_id, var_pflow_id);
			eq1.solve(var_egw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				sf1.setId((String) var_sf1_id.getValue());
				egw.setId((String) var_egw_id.getValue());
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_33_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_33_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_33_2_bindingFFFFFFFFFFBB(sourceMatch,
				targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		ParallelGateway prevNode = (ParallelGateway) result2_binding[2];
		ParallelStep pstep = (ParallelStep) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		ParallelFlow pflow = (ParallelFlow) result2_binding[5];
		ChoiceStep step = (ChoiceStep) result2_binding[6];
		Flow flow = (Flow) result2_binding[7];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[8];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[9];
		for (Object[] result2_black : EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_33_2_blackBBFBBFBBBBBBBB(process,
				useCase, prevNode, pstep, sf1, pflow, step, flow, egw, ecgw, sourceMatch, targetMatch)) {
			P2UC p2uc = (P2UC) result2_black[2];
			GW2S pg2ps = (GW2S) result2_black[5];
			Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_33_2_greenBBBBBBBBBBBBBBF(process,
					useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, ecgw, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[14];

			// check csp
			Object[] result3_bindingAndBlack = EG2ChoiceAfterPGImpl
					.pattern_EG2ChoiceAfterPG_33_3_bindingAndBlackFBBBBBBBBBBBBBBBB(this, isApplicableMatch, process,
							useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, ecgw, sourceMatch,
							targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_33_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_33_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_33_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1,
			ParallelFlow pflow, ChoiceStep step, Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");
		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow.id", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_pflow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_egw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pg2ps", pg2ps);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("pflow", pflow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("egw", egw);
		isApplicableMatch.registerObject("ecgw", ecgw);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_CC(IsApplicableMatchCC isApplicableMatch) {
		// prepare
		Object[] result1_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_36_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_36_2_bindingAndBlackFFFFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[0];
		// UseCase useCase = (UseCase) result2_bindingAndBlack[1];
		// P2UC p2uc = (P2UC) result2_bindingAndBlack[2];
		// ParallelGateway prevNode = (ParallelGateway) result2_bindingAndBlack[3];
		// ParallelStep pstep = (ParallelStep) result2_bindingAndBlack[4];
		// GW2S pg2ps = (GW2S) result2_bindingAndBlack[5];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[6];
		// ParallelFlow pflow = (ParallelFlow) result2_bindingAndBlack[7];
		ChoiceStep step = (ChoiceStep) result2_bindingAndBlack[8];
		// Flow flow = (Flow) result2_bindingAndBlack[9];
		ExclusiveGateway egw = (ExclusiveGateway) result2_bindingAndBlack[10];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_bindingAndBlack[11];
		Object[] result2_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_36_2_greenBBBFFF(step, egw, ecgw);
		PerformRuleResult result = (PerformRuleResult) result2_green[3];
		// GW2S egwToStep = (GW2S) result2_green[4];
		// GW2S ecgwToStep = (GW2S) result2_green[5];

		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_36_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, GW2S pg2psParameter) {
		// create result
		Object[] result1_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_37_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_37_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EG2ChoiceAfterPGImpl
				.pattern_EG2ChoiceAfterPG_37_2_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList pg2psList = (RuleEntryList) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			ParallelGateway prevNode = (ParallelGateway) result2_black[2];
			GW2S pg2ps = (GW2S) result2_black[3];
			ParallelStep pstep = (ParallelStep) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			UseCase useCase = (UseCase) result2_black[6];
			P2UC p2uc = (P2UC) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = EG2ChoiceAfterPGImpl
					.pattern_EG2ChoiceAfterPG_37_3_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, process, useCase,
							p2uc, prevNode, pstep, pg2ps, flow, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[process] = " + process
						+ ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[prevNode] = "
						+ prevNode + ", " + "[pstep] = " + pstep + ", " + "[pg2ps] = " + pg2ps + ", " + "[flow] = "
						+ flow + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_37_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_37_5_blackBBBBBBB(process,
						useCase, p2uc, prevNode, pstep, pg2ps, flow);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_37_6_blackBBBBBBBB(process,
							useCase, p2uc, prevNode, pstep, pg2ps, flow, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc
								+ ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[pg2ps] = "
								+ pg2ps + ", " + "[flow] = " + flow + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_37_6_greenBBBBFFFFFFFBB(process, useCase, prevNode,
							pstep, ruleResult, csp);
					// SequenceFlow sf1 = (SequenceFlow) result6_green[4];
					// ParallelFlow pflow = (ParallelFlow) result6_green[5];
					// ChoiceStep step = (ChoiceStep) result6_green[6];
					// ExclusiveGateway egw = (ExclusiveGateway) result6_green[7];
					// GW2S egwToStep = (GW2S) result6_green[8];
					// ExclusiveGateway ecgw = (ExclusiveGateway) result6_green[9];
					// GW2S ecgwToStep = (GW2S) result6_green[10];

				} else {
				}

			} else {
			}

		}
		return EG2ChoiceAfterPGImpl.pattern_EG2ChoiceAfterPG_37_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, Flow flow,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", csp);
		var_sf1_id.setType("String");
		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow.id", csp);
		var_pflow_id.setType("String");
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", csp);
		var_egw_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_pflow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_egw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("pg2ps", pg2ps);
		isApplicableMatch.registerObject("flow", flow);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.EG2_CHOICE_AFTER_PG___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
			return null;
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_PARALLELGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(ParallelGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_SEQUENCEFLOW_FLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelStep) arguments.get(5), (GW2S) arguments.get(6),
					(SequenceFlow) arguments.get(7), (Flow) arguments.get(8), (ExclusiveGateway) arguments.get(9),
					(ExclusiveGateway) arguments.get(10));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.EG2_CHOICE_AFTER_PG___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(Flow) arguments.get(5));
		case RulesPackage.EG2_CHOICE_AFTER_PG___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(Flow) arguments.get(5));
			return null;
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_PARALLELSTEP_PARALLELFLOW_CHOICESTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(ParallelStep) arguments.get(2), (ParallelFlow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(Flow) arguments.get(5));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_PARALLELFLOW_CHOICESTEP_FLOW:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelStep) arguments.get(5), (GW2S) arguments.get(6),
					(ParallelFlow) arguments.get(7), (ChoiceStep) arguments.get(8), (Flow) arguments.get(9));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.EG2_CHOICE_AFTER_PG___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1266__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1266((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_402__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_402((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1267__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1267((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1268__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1268((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_403__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_403((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_404__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_404((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1269__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1269((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1270__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1270((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1271__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1271((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1272__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1272((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1273__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1273((EMoflonEdge) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_SEQUENCEFLOW_PARALLELFLOW_CHOICESTEP_FLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelStep) arguments.get(5), (GW2S) arguments.get(6),
					(SequenceFlow) arguments.get(7), (ParallelFlow) arguments.get(8), (ChoiceStep) arguments.get(9),
					(Flow) arguments.get(10), (ExclusiveGateway) arguments.get(11),
					(ExclusiveGateway) arguments.get(12), (Match) arguments.get(13), (Match) arguments.get(14));
		case RulesPackage.EG2_CHOICE_AFTER_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.EG2_CHOICE_AFTER_PG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (GW2S) arguments.get(1));
		case RulesPackage.EG2_CHOICE_AFTER_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_PARALLELGATEWAY_PARALLELSTEP_GW2S_FLOW_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(ParallelGateway) arguments.get(4), (ParallelStep) arguments.get(5), (GW2S) arguments.get(6),
					(Flow) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.EG2_CHOICE_AFTER_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_0_1_blackBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			return new Object[] { _this, match, process, prevNode, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_0_2_bindingFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, prevNode, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, prevNode, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_0_2_bindingAndBlackFBBBBBBB(EG2ChoiceAfterPG _this,
			Match match, SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		Object[] result_pattern_EG2ChoiceAfterPG_0_2_binding = pattern_EG2ChoiceAfterPG_0_2_bindingFBBBBBBB(_this,
				match, process, prevNode, sf1, egw, ecgw);
		if (result_pattern_EG2ChoiceAfterPG_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceAfterPG_0_2_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_0_2_black = pattern_EG2ChoiceAfterPG_0_2_blackB(csp);
			if (result_pattern_EG2ChoiceAfterPG_0_2_black != null) {

				return new Object[] { csp, _this, match, process, prevNode, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_0_3_expressionFBB(EG2ChoiceAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_0_4_blackBBBBBB(Match match, SimpleBPMN.Process process,
			ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			return new Object[] { match, process, prevNode, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_0_4_greenBBBBBBFFFFFFFF(Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(egw);
		match.getToBeTranslatedNodes().add(ecgw);
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getToBeTranslatedEdges().add(process__sf1____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		match.getToBeTranslatedEdges().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		match.getToBeTranslatedEdges().add(process__ecgw____flowElements);
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		match.getToBeTranslatedEdges().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		match.getToBeTranslatedEdges().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		match.getToBeTranslatedEdges().add(egw__ecgw______conv);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { match, process, prevNode, sf1, egw, ecgw, process__sf1____flowElements,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, process__egw____flowElements,
				process__ecgw____flowElements, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_0_5_blackBBBBBB(Match match, SimpleBPMN.Process process,
			ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			return new Object[] { match, process, prevNode, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_0_5_greenBBBF(Match match, SimpleBPMN.Process process,
			ParallelGateway prevNode) {
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(prevNode);
		String process__prevNode____flowElements_name_prime = "flowElements";
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		match.getContextEdges().add(process__prevNode____flowElements);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { match, process, prevNode, process__prevNode____flowElements };
	}

	public static final void pattern_EG2ChoiceAfterPG_0_6_expressionBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		_this.registerObjectsToMatch_FWD(match, process, prevNode, sf1, egw, ecgw);

	}

	public static final boolean pattern_EG2ChoiceAfterPG_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_1_1_bindingFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pg2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("egw");
		EObject _localVariable_9 = isApplicableMatch.getObject("ecgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpP2uc = _localVariable_2;
		EObject tmpPrevNode = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPg2ps = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpEgw = _localVariable_8;
		EObject tmpEcgw = _localVariable_9;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpP2uc instanceof P2UC) {
					P2UC p2uc = (P2UC) tmpP2uc;
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							if (tmpPg2ps instanceof GW2S) {
								GW2S pg2ps = (GW2S) tmpPg2ps;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpEgw instanceof ExclusiveGateway) {
											ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
											if (tmpEcgw instanceof ExclusiveGateway) {
												ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
												return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps,
														sf1, flow, egw, ecgw, isApplicableMatch };
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_1_1_blackBBBBBBBBBBBFB(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1,
			Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw, EG2ChoiceAfterPG _this,
			IsApplicableMatch isApplicableMatch) {
		if (!ecgw.equals(egw)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw, _this,
							csp, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_1_1_bindingAndBlackFFFFFFFFFFBFB(EG2ChoiceAfterPG _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EG2ChoiceAfterPG_1_1_binding = pattern_EG2ChoiceAfterPG_1_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EG2ChoiceAfterPG_1_1_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EG2ChoiceAfterPG_1_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_EG2ChoiceAfterPG_1_1_binding[1];
			P2UC p2uc = (P2UC) result_pattern_EG2ChoiceAfterPG_1_1_binding[2];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_EG2ChoiceAfterPG_1_1_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_EG2ChoiceAfterPG_1_1_binding[4];
			GW2S pg2ps = (GW2S) result_pattern_EG2ChoiceAfterPG_1_1_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_EG2ChoiceAfterPG_1_1_binding[6];
			Flow flow = (Flow) result_pattern_EG2ChoiceAfterPG_1_1_binding[7];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_EG2ChoiceAfterPG_1_1_binding[8];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_EG2ChoiceAfterPG_1_1_binding[9];

			Object[] result_pattern_EG2ChoiceAfterPG_1_1_black = pattern_EG2ChoiceAfterPG_1_1_blackBBBBBBBBBBBFB(
					process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw, _this, isApplicableMatch);
			if (result_pattern_EG2ChoiceAfterPG_1_1_black != null) {
				CSP csp = (CSP) result_pattern_EG2ChoiceAfterPG_1_1_black[11];

				return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_1_1_greenBBFFBFBFB(UseCase useCase, ParallelStep pstep,
			ExclusiveGateway egw, ExclusiveGateway ecgw, CSP csp) {
		ParallelFlow pflow = SimpleUseCaseFactory.eINSTANCE.createParallelFlow();
		ChoiceStep step = SimpleUseCaseFactory.eINSTANCE.createChoiceStep();
		GW2S egwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		GW2S ecgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("pflow", "id");
		Object _localVariable_1 = csp.getValue("step", "id");
		useCase.getFlows().add(pflow);
		pstep.getInvokedFlows().add(pflow);
		pflow.getSteps().add(step);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		String pflow_id_prime = (String) _localVariable_0;
		String step_id_prime = (String) _localVariable_1;
		pflow.setId(pflow_id_prime);
		step.setId(step_id_prime);
		return new Object[] { useCase, pstep, pflow, step, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_1_2_blackBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_1_2_greenFBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(pflow);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getTranslatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_1_3_blackBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject p2uc, EObject prevNode, EObject pstep, EObject pg2ps, EObject sf1,
			EObject pflow, EObject step, EObject flow, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		if (!process.equals(useCase)) {
			if (!process.equals(pstep)) {
				if (!process.equals(sf1)) {
					if (!process.equals(step)) {
						if (!p2uc.equals(process)) {
							if (!p2uc.equals(useCase)) {
								if (!p2uc.equals(prevNode)) {
									if (!p2uc.equals(pstep)) {
										if (!p2uc.equals(pg2ps)) {
											if (!p2uc.equals(sf1)) {
												if (!p2uc.equals(pflow)) {
													if (!p2uc.equals(step)) {
														if (!prevNode.equals(process)) {
															if (!prevNode.equals(useCase)) {
																if (!prevNode.equals(pstep)) {
																	if (!prevNode.equals(sf1)) {
																		if (!prevNode.equals(step)) {
																			if (!pstep.equals(useCase)) {
																				if (!pstep.equals(sf1)) {
																					if (!pstep.equals(step)) {
																						if (!pg2ps.equals(process)) {
																							if (!pg2ps
																									.equals(useCase)) {
																								if (!pg2ps.equals(
																										prevNode)) {
																									if (!pg2ps.equals(
																											pstep)) {
																										if (!pg2ps
																												.equals(sf1)) {
																											if (!pg2ps
																													.equals(step)) {
																												if (!sf1.equals(
																														useCase)) {
																													if (!sf1.equals(
																															step)) {
																														if (!pflow
																																.equals(process)) {
																															if (!pflow
																																	.equals(useCase)) {
																																if (!pflow
																																		.equals(prevNode)) {
																																	if (!pflow
																																			.equals(pstep)) {
																																		if (!pflow
																																				.equals(pg2ps)) {
																																			if (!pflow
																																					.equals(sf1)) {
																																				if (!pflow
																																						.equals(step)) {
																																					if (!step
																																							.equals(useCase)) {
																																						if (!flow
																																								.equals(process)) {
																																							if (!flow
																																									.equals(useCase)) {
																																								if (!flow
																																										.equals(p2uc)) {
																																									if (!flow
																																											.equals(prevNode)) {
																																										if (!flow
																																												.equals(pstep)) {
																																											if (!flow
																																													.equals(pg2ps)) {
																																												if (!flow
																																														.equals(sf1)) {
																																													if (!flow
																																															.equals(pflow)) {
																																														if (!flow
																																																.equals(step)) {
																																															if (!egw.equals(
																																																	process)) {
																																																if (!egw.equals(
																																																		useCase)) {
																																																	if (!egw.equals(
																																																			p2uc)) {
																																																		if (!egw.equals(
																																																				prevNode)) {
																																																			if (!egw.equals(
																																																					pstep)) {
																																																				if (!egw.equals(
																																																						pg2ps)) {
																																																					if (!egw.equals(
																																																							sf1)) {
																																																						if (!egw.equals(
																																																								pflow)) {
																																																							if (!egw.equals(
																																																									step)) {
																																																								if (!egw.equals(
																																																										flow)) {
																																																									if (!egw.equals(
																																																											egwToStep)) {
																																																										if (!egwToStep
																																																												.equals(process)) {
																																																											if (!egwToStep
																																																													.equals(useCase)) {
																																																												if (!egwToStep
																																																														.equals(p2uc)) {
																																																													if (!egwToStep
																																																															.equals(prevNode)) {
																																																														if (!egwToStep
																																																																.equals(pstep)) {
																																																															if (!egwToStep
																																																																	.equals(pg2ps)) {
																																																																if (!egwToStep
																																																																		.equals(sf1)) {
																																																																	if (!egwToStep
																																																																			.equals(pflow)) {
																																																																		if (!egwToStep
																																																																				.equals(step)) {
																																																																			if (!egwToStep
																																																																					.equals(flow)) {
																																																																				if (!ecgw
																																																																						.equals(process)) {
																																																																					if (!ecgw
																																																																							.equals(useCase)) {
																																																																						if (!ecgw
																																																																								.equals(p2uc)) {
																																																																							if (!ecgw
																																																																									.equals(prevNode)) {
																																																																								if (!ecgw
																																																																										.equals(pstep)) {
																																																																									if (!ecgw
																																																																											.equals(pg2ps)) {
																																																																										if (!ecgw
																																																																												.equals(sf1)) {
																																																																											if (!ecgw
																																																																													.equals(pflow)) {
																																																																												if (!ecgw
																																																																														.equals(step)) {
																																																																													if (!ecgw
																																																																															.equals(flow)) {
																																																																														if (!ecgw
																																																																																.equals(egw)) {
																																																																															if (!ecgw
																																																																																	.equals(egwToStep)) {
																																																																																if (!ecgw
																																																																																		.equals(ecgwToStep)) {
																																																																																	if (!ecgwToStep
																																																																																			.equals(process)) {
																																																																																		if (!ecgwToStep
																																																																																				.equals(useCase)) {
																																																																																			if (!ecgwToStep
																																																																																					.equals(p2uc)) {
																																																																																				if (!ecgwToStep
																																																																																						.equals(prevNode)) {
																																																																																					if (!ecgwToStep
																																																																																							.equals(pstep)) {
																																																																																						if (!ecgwToStep
																																																																																								.equals(pg2ps)) {
																																																																																							if (!ecgwToStep
																																																																																									.equals(sf1)) {
																																																																																								if (!ecgwToStep
																																																																																										.equals(pflow)) {
																																																																																									if (!ecgwToStep
																																																																																											.equals(step)) {
																																																																																										if (!ecgwToStep
																																																																																												.equals(flow)) {
																																																																																											if (!ecgwToStep
																																																																																													.equals(egw)) {
																																																																																												if (!ecgwToStep
																																																																																														.equals(egwToStep)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															process,
																																																																																															useCase,
																																																																																															p2uc,
																																																																																															prevNode,
																																																																																															pstep,
																																																																																															pg2ps,
																																																																																															sf1,
																																																																																															pflow,
																																																																																															step,
																																																																																															flow,
																																																																																															egw,
																																																																																															egwToStep,
																																																																																															ecgw,
																																																																																															ecgwToStep };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_1_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject prevNode, EObject pstep,
			EObject sf1, EObject pflow, EObject step, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EG2ChoiceAfterPG";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pflow__step____steps_name_prime = "steps";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		ruleresult.getCreatedEdges().add(useCase__pflow____flows);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		ruleresult.getCreatedEdges().add(pstep__pflow____invokedFlows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(pflow__step____steps);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		ruleresult.getTranslatedEdges().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		ruleresult.getTranslatedEdges().add(process__ecgw____flowElements);
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		ruleresult.getTranslatedEdges().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		ruleresult.getTranslatedEdges().add(egw__ecgw______conv);
		egwToStep__egw____source.setSrc(egwToStep);
		egwToStep__egw____source.setTrg(egw);
		ruleresult.getCreatedEdges().add(egwToStep__egw____source);
		egwToStep__step____target.setSrc(egwToStep);
		egwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(egwToStep__step____target);
		ecgwToStep__ecgw____source.setSrc(ecgwToStep);
		ecgwToStep__ecgw____source.setTrg(ecgw);
		ruleresult.getCreatedEdges().add(ecgwToStep__ecgw____source);
		ecgwToStep__step____target.setSrc(ecgwToStep);
		ecgwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(ecgwToStep__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, process, useCase, prevNode, pstep, sf1, pflow, step, egw, egwToStep, ecgw,
				ecgwToStep, process__sf1____flowElements, useCase__pflow____flows, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, pstep__pflow____invokedFlows, pflow__step____steps,
				process__egw____flowElements, process__ecgw____flowElements, sf1__egw____targetRef,
				egw__sf1____incoming, egw__ecgw______conv, egwToStep__egw____source, egwToStep__step____target,
				ecgwToStep__ecgw____source, ecgwToStep__step____target };
	}

	public static final void pattern_EG2ChoiceAfterPG_1_5_expressionBBBBBBBBBBBBBBBB(EG2ChoiceAfterPG _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject p2uc, EObject prevNode,
			EObject pstep, EObject pg2ps, EObject sf1, EObject pflow, EObject step, EObject flow, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_FWD(ruleresult, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow,
				egw, egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_EG2ChoiceAfterPG_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_1_blackFBB(EClass eClass, EG2ChoiceAfterPG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_2_1_binding = pattern_EG2ChoiceAfterPG_2_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EG2ChoiceAfterPG_2_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_2_1_black = pattern_EG2ChoiceAfterPG_2_1_blackFBB(eClass, _this);
			if (result_pattern_EG2ChoiceAfterPG_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EG2ChoiceAfterPG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("prevNode");
		EObject _localVariable_2 = match.getObject("sf1");
		EObject _localVariable_3 = match.getObject("egw");
		EObject _localVariable_4 = match.getObject("ecgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpSf1 = _localVariable_2;
		EObject tmpEgw = _localVariable_3;
		EObject tmpEcgw = _localVariable_4;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (tmpSf1 instanceof SequenceFlow) {
					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
					if (tmpEgw instanceof ExclusiveGateway) {
						ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
						if (tmpEcgw instanceof ExclusiveGateway) {
							ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
							return new Object[] { process, prevNode, sf1, egw, ecgw, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_2_2_blackBFFBFFBBBB(SimpleBPMN.Process process,
			ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!ecgw.equals(egw)) {
			boolean prevNodeisDiverging = prevNode.isIsDiverging();
			if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
				boolean egwisDiverging = egw.isIsDiverging();
				if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
					boolean ecgwisDiverging = ecgw.isIsDiverging();
					if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
						for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(process,
								P2UC.class, "source")) {
							UseCase useCase = p2uc.getTarget();
							if (useCase != null) {
								for (GW2S pg2ps : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, GW2S.class, "source")) {
									Step tmpPstep = pg2ps.getTarget();
									if (tmpPstep instanceof ParallelStep) {
										ParallelStep pstep = (ParallelStep) tmpPstep;
										_result.add(new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1,
												egw, ecgw, match });
									}

								}
							}

						}
					}

				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_2_3_blackBBBBBBBFBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!ecgw.equals(egw)) {
			if (process.getFlowElements().contains(prevNode)) {
				if (process.getFlowElements().contains(sf1)) {
					if (process.equals(p2uc.getSource())) {
						if (useCase.equals(p2uc.getTarget())) {
							if (prevNode.equals(sf1.getSourceRef())) {
								if (prevNode.equals(pg2ps.getSource())) {
									if (pstep.equals(pg2ps.getTarget())) {
										if (process.getFlowElements().contains(egw)) {
											if (process.getFlowElements().contains(ecgw)) {
												if (egw.equals(sf1.getTargetRef())) {
													if (ecgw.equals(egw.get__conv())) {
														boolean prevNodeisDiverging = prevNode.isIsDiverging();
														if (Boolean.valueOf(prevNodeisDiverging)
																.equals(Boolean.valueOf(true))) {
															boolean egwisDiverging = egw.isIsDiverging();
															if (Boolean.valueOf(egwisDiverging)
																	.equals(Boolean.valueOf(true))) {
																boolean ecgwisDiverging = ecgw.isIsDiverging();
																if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
																	for (Flow flow : useCase.getFlows()) {
																		if (flow.getSteps().contains(pstep)) {
																			_result.add(new Object[] { process, useCase,
																					p2uc, prevNode, pstep, pg2ps, sf1,
																					flow, egw, ecgw });
																		}
																	}
																}

															}

														}

													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep,
			GW2S pg2ps, SequenceFlow sf1, Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pg2ps__prevNode____source_name_prime = "source";
		String pg2ps__pstep____target_name_prime = "target";
		String flow__pstep____steps_name_prime = "steps";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(pg2ps);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(egw);
		isApplicableMatch.getAllContextElements().add(ecgw);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		pg2ps__prevNode____source.setSrc(pg2ps);
		pg2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pg2ps__prevNode____source);
		pg2ps__pstep____target.setSrc(pg2ps);
		pg2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pg2ps__pstep____target);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(flow__pstep____steps);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		isApplicableMatch.getAllContextElements().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		isApplicableMatch.getAllContextElements().add(process__ecgw____flowElements);
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		isApplicableMatch.getAllContextElements().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		isApplicableMatch.getAllContextElements().add(egw__ecgw______conv);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pg2ps__prevNode____source.setName(pg2ps__prevNode____source_name_prime);
		pg2ps__pstep____target.setName(pg2ps__pstep____target_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw, isApplicableMatch,
				process__prevNode____flowElements, process__sf1____flowElements, useCase__flow____flows,
				p2uc__process____source, p2uc__useCase____target, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				pg2ps__prevNode____source, pg2ps__pstep____target, flow__pstep____steps, process__egw____flowElements,
				process__ecgw____flowElements, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_4_bindingFBBBBBBBBBBBB(EG2ChoiceAfterPG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1, Flow flow, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, process, useCase, p2uc, prevNode,
				pstep, pg2ps, sf1, flow, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1,
					flow, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_4_bindingAndBlackFBBBBBBBBBBBB(EG2ChoiceAfterPG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1, Flow flow, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		Object[] result_pattern_EG2ChoiceAfterPG_2_4_binding = pattern_EG2ChoiceAfterPG_2_4_bindingFBBBBBBBBBBBB(_this,
				isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, flow, egw, ecgw);
		if (result_pattern_EG2ChoiceAfterPG_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceAfterPG_2_4_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_2_4_black = pattern_EG2ChoiceAfterPG_2_4_blackB(csp);
			if (result_pattern_EG2ChoiceAfterPG_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps,
						sf1, flow, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_2_5_expressionFBB(EG2ChoiceAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EG2ChoiceAfterPG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EG2ChoiceAfterPG_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_10_1_blackBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		if (!flow.equals(pflow)) {
			return new Object[] { _this, match, useCase, pstep, pflow, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_10_2_bindingFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, useCase, pstep, pflow, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, pstep, pflow, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_10_2_bindingAndBlackFBBBBBBB(EG2ChoiceAfterPG _this,
			Match match, UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		Object[] result_pattern_EG2ChoiceAfterPG_10_2_binding = pattern_EG2ChoiceAfterPG_10_2_bindingFBBBBBBB(_this,
				match, useCase, pstep, pflow, step, flow);
		if (result_pattern_EG2ChoiceAfterPG_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceAfterPG_10_2_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_10_2_black = pattern_EG2ChoiceAfterPG_10_2_blackB(csp);
			if (result_pattern_EG2ChoiceAfterPG_10_2_black != null) {

				return new Object[] { csp, _this, match, useCase, pstep, pflow, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_10_3_expressionFBB(EG2ChoiceAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_10_4_blackBBBBBB(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		if (!flow.equals(pflow)) {
			return new Object[] { match, useCase, pstep, pflow, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_10_4_greenBBBBBFFF(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ChoiceStep step) {
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(pflow);
		match.getToBeTranslatedNodes().add(step);
		String useCase__pflow____flows_name_prime = "flows";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pflow__step____steps_name_prime = "steps";
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		match.getToBeTranslatedEdges().add(useCase__pflow____flows);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		match.getToBeTranslatedEdges().add(pstep__pflow____invokedFlows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(pflow__step____steps);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		return new Object[] { match, useCase, pstep, pflow, step, useCase__pflow____flows, pstep__pflow____invokedFlows,
				pflow__step____steps };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_10_5_blackBBBBBB(Match match, UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		if (!flow.equals(pflow)) {
			return new Object[] { match, useCase, pstep, pflow, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_10_5_greenBBBBFF(Match match, UseCase useCase,
			ParallelStep pstep, Flow flow) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(pstep);
		match.getContextNodes().add(flow);
		String useCase__flow____flows_name_prime = "flows";
		String flow__pstep____steps_name_prime = "steps";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		match.getContextEdges().add(flow__pstep____steps);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		return new Object[] { match, useCase, pstep, flow, useCase__flow____flows, flow__pstep____steps };
	}

	public static final void pattern_EG2ChoiceAfterPG_10_6_expressionBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, useCase, pstep, pflow, step, flow);

	}

	public static final boolean pattern_EG2ChoiceAfterPG_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_11_1_bindingFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pg2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("pflow");
		EObject _localVariable_7 = isApplicableMatch.getObject("step");
		EObject _localVariable_8 = isApplicableMatch.getObject("flow");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpP2uc = _localVariable_2;
		EObject tmpPrevNode = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPg2ps = _localVariable_5;
		EObject tmpPflow = _localVariable_6;
		EObject tmpStep = _localVariable_7;
		EObject tmpFlow = _localVariable_8;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpP2uc instanceof P2UC) {
					P2UC p2uc = (P2UC) tmpP2uc;
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							if (tmpPg2ps instanceof GW2S) {
								GW2S pg2ps = (GW2S) tmpPg2ps;
								if (tmpPflow instanceof ParallelFlow) {
									ParallelFlow pflow = (ParallelFlow) tmpPflow;
									if (tmpStep instanceof ChoiceStep) {
										ChoiceStep step = (ChoiceStep) tmpStep;
										if (tmpFlow instanceof Flow) {
											Flow flow = (Flow) tmpFlow;
											return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow,
													step, flow, isApplicableMatch };
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_11_1_blackBBBBBBBBBBFB(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow,
			ChoiceStep step, Flow flow, EG2ChoiceAfterPG _this, IsApplicableMatch isApplicableMatch) {
		if (!flow.equals(pflow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_11_1_bindingAndBlackFFFFFFFFFBFB(EG2ChoiceAfterPG _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EG2ChoiceAfterPG_11_1_binding = pattern_EG2ChoiceAfterPG_11_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EG2ChoiceAfterPG_11_1_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EG2ChoiceAfterPG_11_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_EG2ChoiceAfterPG_11_1_binding[1];
			P2UC p2uc = (P2UC) result_pattern_EG2ChoiceAfterPG_11_1_binding[2];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_EG2ChoiceAfterPG_11_1_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_EG2ChoiceAfterPG_11_1_binding[4];
			GW2S pg2ps = (GW2S) result_pattern_EG2ChoiceAfterPG_11_1_binding[5];
			ParallelFlow pflow = (ParallelFlow) result_pattern_EG2ChoiceAfterPG_11_1_binding[6];
			ChoiceStep step = (ChoiceStep) result_pattern_EG2ChoiceAfterPG_11_1_binding[7];
			Flow flow = (Flow) result_pattern_EG2ChoiceAfterPG_11_1_binding[8];

			Object[] result_pattern_EG2ChoiceAfterPG_11_1_black = pattern_EG2ChoiceAfterPG_11_1_blackBBBBBBBBBBFB(
					process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow, _this, isApplicableMatch);
			if (result_pattern_EG2ChoiceAfterPG_11_1_black != null) {
				CSP csp = (CSP) result_pattern_EG2ChoiceAfterPG_11_1_black[10];

				return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_11_1_greenBBFBFFFFB(SimpleBPMN.Process process,
			ParallelGateway prevNode, ChoiceStep step, CSP csp) {
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ExclusiveGateway egw = SimpleBPMNFactory.eINSTANCE.createExclusiveGateway();
		GW2S egwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ExclusiveGateway ecgw = SimpleBPMNFactory.eINSTANCE.createExclusiveGateway();
		GW2S ecgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("sf1", "id");
		boolean egw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_1 = csp.getValue("egw", "id");
		boolean ecgw_isDiverging_prime = false;
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		process.getFlowElements().add(egw);
		sf1.setTargetRef(egw);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		process.getFlowElements().add(ecgw);
		egw.set__conv(ecgw);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		String sf1_id_prime = (String) _localVariable_0;
		egw.setIsDiverging(Boolean.valueOf(egw_isDiverging_prime));
		String egw_id_prime = (String) _localVariable_1;
		ecgw.setIsDiverging(Boolean.valueOf(ecgw_isDiverging_prime));
		sf1.setId(sf1_id_prime);
		egw.setId(egw_id_prime);
		return new Object[] { process, prevNode, sf1, step, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_11_2_blackBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_11_2_greenFBBBBBBB(SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(pflow);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getCreatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_11_3_blackBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject p2uc, EObject prevNode, EObject pstep, EObject pg2ps, EObject sf1,
			EObject pflow, EObject step, EObject flow, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		if (!process.equals(useCase)) {
			if (!process.equals(pstep)) {
				if (!process.equals(sf1)) {
					if (!process.equals(step)) {
						if (!p2uc.equals(process)) {
							if (!p2uc.equals(useCase)) {
								if (!p2uc.equals(prevNode)) {
									if (!p2uc.equals(pstep)) {
										if (!p2uc.equals(pg2ps)) {
											if (!p2uc.equals(sf1)) {
												if (!p2uc.equals(pflow)) {
													if (!p2uc.equals(step)) {
														if (!prevNode.equals(process)) {
															if (!prevNode.equals(useCase)) {
																if (!prevNode.equals(pstep)) {
																	if (!prevNode.equals(sf1)) {
																		if (!prevNode.equals(step)) {
																			if (!pstep.equals(useCase)) {
																				if (!pstep.equals(sf1)) {
																					if (!pstep.equals(step)) {
																						if (!pg2ps.equals(process)) {
																							if (!pg2ps
																									.equals(useCase)) {
																								if (!pg2ps.equals(
																										prevNode)) {
																									if (!pg2ps.equals(
																											pstep)) {
																										if (!pg2ps
																												.equals(sf1)) {
																											if (!pg2ps
																													.equals(step)) {
																												if (!sf1.equals(
																														useCase)) {
																													if (!sf1.equals(
																															step)) {
																														if (!pflow
																																.equals(process)) {
																															if (!pflow
																																	.equals(useCase)) {
																																if (!pflow
																																		.equals(prevNode)) {
																																	if (!pflow
																																			.equals(pstep)) {
																																		if (!pflow
																																				.equals(pg2ps)) {
																																			if (!pflow
																																					.equals(sf1)) {
																																				if (!pflow
																																						.equals(step)) {
																																					if (!step
																																							.equals(useCase)) {
																																						if (!flow
																																								.equals(process)) {
																																							if (!flow
																																									.equals(useCase)) {
																																								if (!flow
																																										.equals(p2uc)) {
																																									if (!flow
																																											.equals(prevNode)) {
																																										if (!flow
																																												.equals(pstep)) {
																																											if (!flow
																																													.equals(pg2ps)) {
																																												if (!flow
																																														.equals(sf1)) {
																																													if (!flow
																																															.equals(pflow)) {
																																														if (!flow
																																																.equals(step)) {
																																															if (!egw.equals(
																																																	process)) {
																																																if (!egw.equals(
																																																		useCase)) {
																																																	if (!egw.equals(
																																																			p2uc)) {
																																																		if (!egw.equals(
																																																				prevNode)) {
																																																			if (!egw.equals(
																																																					pstep)) {
																																																				if (!egw.equals(
																																																						pg2ps)) {
																																																					if (!egw.equals(
																																																							sf1)) {
																																																						if (!egw.equals(
																																																								pflow)) {
																																																							if (!egw.equals(
																																																									step)) {
																																																								if (!egw.equals(
																																																										flow)) {
																																																									if (!egw.equals(
																																																											egwToStep)) {
																																																										if (!egwToStep
																																																												.equals(process)) {
																																																											if (!egwToStep
																																																													.equals(useCase)) {
																																																												if (!egwToStep
																																																														.equals(p2uc)) {
																																																													if (!egwToStep
																																																															.equals(prevNode)) {
																																																														if (!egwToStep
																																																																.equals(pstep)) {
																																																															if (!egwToStep
																																																																	.equals(pg2ps)) {
																																																																if (!egwToStep
																																																																		.equals(sf1)) {
																																																																	if (!egwToStep
																																																																			.equals(pflow)) {
																																																																		if (!egwToStep
																																																																				.equals(step)) {
																																																																			if (!egwToStep
																																																																					.equals(flow)) {
																																																																				if (!ecgw
																																																																						.equals(process)) {
																																																																					if (!ecgw
																																																																							.equals(useCase)) {
																																																																						if (!ecgw
																																																																								.equals(p2uc)) {
																																																																							if (!ecgw
																																																																									.equals(prevNode)) {
																																																																								if (!ecgw
																																																																										.equals(pstep)) {
																																																																									if (!ecgw
																																																																											.equals(pg2ps)) {
																																																																										if (!ecgw
																																																																												.equals(sf1)) {
																																																																											if (!ecgw
																																																																													.equals(pflow)) {
																																																																												if (!ecgw
																																																																														.equals(step)) {
																																																																													if (!ecgw
																																																																															.equals(flow)) {
																																																																														if (!ecgw
																																																																																.equals(egw)) {
																																																																															if (!ecgw
																																																																																	.equals(egwToStep)) {
																																																																																if (!ecgw
																																																																																		.equals(ecgwToStep)) {
																																																																																	if (!ecgwToStep
																																																																																			.equals(process)) {
																																																																																		if (!ecgwToStep
																																																																																				.equals(useCase)) {
																																																																																			if (!ecgwToStep
																																																																																					.equals(p2uc)) {
																																																																																				if (!ecgwToStep
																																																																																						.equals(prevNode)) {
																																																																																					if (!ecgwToStep
																																																																																							.equals(pstep)) {
																																																																																						if (!ecgwToStep
																																																																																								.equals(pg2ps)) {
																																																																																							if (!ecgwToStep
																																																																																									.equals(sf1)) {
																																																																																								if (!ecgwToStep
																																																																																										.equals(pflow)) {
																																																																																									if (!ecgwToStep
																																																																																											.equals(step)) {
																																																																																										if (!ecgwToStep
																																																																																												.equals(flow)) {
																																																																																											if (!ecgwToStep
																																																																																													.equals(egw)) {
																																																																																												if (!ecgwToStep
																																																																																														.equals(egwToStep)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															process,
																																																																																															useCase,
																																																																																															p2uc,
																																																																																															prevNode,
																																																																																															pstep,
																																																																																															pg2ps,
																																																																																															sf1,
																																																																																															pflow,
																																																																																															step,
																																																																																															flow,
																																																																																															egw,
																																																																																															egwToStep,
																																																																																															ecgw,
																																																																																															ecgwToStep };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_11_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject prevNode, EObject pstep,
			EObject sf1, EObject pflow, EObject step, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EG2ChoiceAfterPG";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pflow__step____steps_name_prime = "steps";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		ruleresult.getTranslatedEdges().add(useCase__pflow____flows);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		ruleresult.getTranslatedEdges().add(pstep__pflow____invokedFlows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(pflow__step____steps);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		ruleresult.getCreatedEdges().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		ruleresult.getCreatedEdges().add(process__ecgw____flowElements);
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		ruleresult.getCreatedEdges().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		ruleresult.getCreatedEdges().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		ruleresult.getCreatedEdges().add(egw__ecgw______conv);
		egwToStep__egw____source.setSrc(egwToStep);
		egwToStep__egw____source.setTrg(egw);
		ruleresult.getCreatedEdges().add(egwToStep__egw____source);
		egwToStep__step____target.setSrc(egwToStep);
		egwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(egwToStep__step____target);
		ecgwToStep__ecgw____source.setSrc(ecgwToStep);
		ecgwToStep__ecgw____source.setTrg(ecgw);
		ruleresult.getCreatedEdges().add(ecgwToStep__ecgw____source);
		ecgwToStep__step____target.setSrc(ecgwToStep);
		ecgwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(ecgwToStep__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, process, useCase, prevNode, pstep, sf1, pflow, step, egw, egwToStep, ecgw,
				ecgwToStep, process__sf1____flowElements, useCase__pflow____flows, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, pstep__pflow____invokedFlows, pflow__step____steps,
				process__egw____flowElements, process__ecgw____flowElements, sf1__egw____targetRef,
				egw__sf1____incoming, egw__ecgw______conv, egwToStep__egw____source, egwToStep__step____target,
				ecgwToStep__ecgw____source, ecgwToStep__step____target };
	}

	public static final void pattern_EG2ChoiceAfterPG_11_5_expressionBBBBBBBBBBBBBBBB(EG2ChoiceAfterPG _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject p2uc, EObject prevNode,
			EObject pstep, EObject pg2ps, EObject sf1, EObject pflow, EObject step, EObject flow, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_BWD(ruleresult, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow,
				egw, egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_EG2ChoiceAfterPG_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_1_blackFBB(EClass eClass, EG2ChoiceAfterPG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_12_1_binding = pattern_EG2ChoiceAfterPG_12_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EG2ChoiceAfterPG_12_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_12_1_black = pattern_EG2ChoiceAfterPG_12_1_blackFBB(eClass, _this);
			if (result_pattern_EG2ChoiceAfterPG_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EG2ChoiceAfterPG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("pstep");
		EObject _localVariable_2 = match.getObject("pflow");
		EObject _localVariable_3 = match.getObject("step");
		EObject _localVariable_4 = match.getObject("flow");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpPstep = _localVariable_1;
		EObject tmpPflow = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpPstep instanceof ParallelStep) {
				ParallelStep pstep = (ParallelStep) tmpPstep;
				if (tmpPflow instanceof ParallelFlow) {
					ParallelFlow pflow = (ParallelFlow) tmpPflow;
					if (tmpStep instanceof ChoiceStep) {
						ChoiceStep step = (ChoiceStep) tmpStep;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							return new Object[] { useCase, pstep, pflow, step, flow, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_12_2_blackFBFFBFBBBB(UseCase useCase,
			ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(pflow)) {
			for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase, P2UC.class,
					"target")) {
				SimpleBPMN.Process process = p2uc.getSource();
				if (process != null) {
					for (GW2S pg2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pstep,
							GW2S.class, "target")) {
						Gateway tmpPrevNode = pg2ps.getSource();
						if (tmpPrevNode instanceof ParallelGateway) {
							ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								_result.add(new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step,
										flow, match });
							}

						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_12_3_blackBBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(pflow)) {
			if (process.getFlowElements().contains(prevNode)) {
				if (useCase.getFlows().contains(pflow)) {
					if (useCase.getFlows().contains(flow)) {
						if (process.equals(p2uc.getSource())) {
							if (useCase.equals(p2uc.getTarget())) {
								if (pstep.getInvokedFlows().contains(pflow)) {
									if (prevNode.equals(pg2ps.getSource())) {
										if (pstep.equals(pg2ps.getTarget())) {
											if (pflow.getSteps().contains(step)) {
												if (flow.getSteps().contains(pstep)) {
													boolean prevNodeisDiverging = prevNode.isIsDiverging();
													if (Boolean.valueOf(prevNodeisDiverging)
															.equals(Boolean.valueOf(true))) {
														_result.add(new Object[] { process, useCase, p2uc, prevNode,
																pstep, pg2ps, pflow, step, flow });
													}

												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_3_greenBBBBBBBBBFFFFFFFFFFF(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow,
			ChoiceStep step, Flow flow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__prevNode____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String pg2ps__prevNode____source_name_prime = "source";
		String pg2ps__pstep____target_name_prime = "target";
		String pflow__step____steps_name_prime = "steps";
		String flow__pstep____steps_name_prime = "steps";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(pg2ps);
		isApplicableMatch.getAllContextElements().add(pflow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		isApplicableMatch.getAllContextElements().add(useCase__pflow____flows);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		isApplicableMatch.getAllContextElements().add(pstep__pflow____invokedFlows);
		pg2ps__prevNode____source.setSrc(pg2ps);
		pg2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pg2ps__prevNode____source);
		pg2ps__pstep____target.setSrc(pg2ps);
		pg2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pg2ps__pstep____target);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(pflow__step____steps);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(flow__pstep____steps);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		pg2ps__prevNode____source.setName(pg2ps__prevNode____source_name_prime);
		pg2ps__pstep____target.setName(pg2ps__pstep____target_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow, isApplicableMatch,
				process__prevNode____flowElements, useCase__pflow____flows, useCase__flow____flows,
				p2uc__process____source, p2uc__useCase____target, pstep__pflow____invokedFlows,
				pg2ps__prevNode____source, pg2ps__pstep____target, pflow__step____steps, flow__pstep____steps };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_4_bindingFBBBBBBBBBBB(EG2ChoiceAfterPG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, process, useCase, p2uc, prevNode,
				pstep, pg2ps, pflow, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, pflow,
					step, flow };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_4_bindingAndBlackFBBBBBBBBBBB(EG2ChoiceAfterPG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		Object[] result_pattern_EG2ChoiceAfterPG_12_4_binding = pattern_EG2ChoiceAfterPG_12_4_bindingFBBBBBBBBBBB(_this,
				isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, pflow, step, flow);
		if (result_pattern_EG2ChoiceAfterPG_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceAfterPG_12_4_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_12_4_black = pattern_EG2ChoiceAfterPG_12_4_blackB(csp);
			if (result_pattern_EG2ChoiceAfterPG_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps,
						pflow, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_12_5_expressionFBB(EG2ChoiceAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EG2ChoiceAfterPG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EG2ChoiceAfterPG_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_20_1_binding = pattern_EG2ChoiceAfterPG_20_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_20_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_20_1_black = pattern_EG2ChoiceAfterPG_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_925962 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_925962)) {
					if (!ecgw.equals(__DEC_sf1_default_925962)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_952952 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_952952)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_849734 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_849734)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_9621 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(egw,
					Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_9621)) {
					if (!prevNode.equals(__DEC_egw___conv_9621)) {
						if (!ecgw.equals(__DEC_egw___conv_9621)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_235878 = ecgw.get__conv();
			if (__DEC_ecgw___conv_235878 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_235878)) {
					if (!prevNode.equals(__DEC_ecgw___conv_235878)) {
						if (!egw.equals(__DEC_ecgw___conv_235878)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_121225 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_121225)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_364988 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_364988)) {
					if (!prevNode.equals(__DEC_ecgw___conv_364988)) {
						if (!egw.equals(__DEC_ecgw___conv_364988)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_20_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						if (process.getFlowElements().contains(prevNode)) {
							FlowNode tmpEgw = sf1.getTargetRef();
							if (tmpEgw instanceof ExclusiveGateway) {
								ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
								if (process.getFlowElements().contains(egw)) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										Gateway tmpEcgw = egw.get__conv();
										if (tmpEcgw instanceof ExclusiveGateway) {
											ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
											if (!ecgw.equals(egw)) {
												if (process.getFlowElements().contains(ecgw)) {
													boolean egwisDiverging = egw.isIsDiverging();
													if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
														boolean ecgwisDiverging = ecgw.isIsDiverging();
														if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
															if (pattern_EG2ChoiceAfterPG_20_2_black_nac_1BB(sf1,
																	process) == null) {
																if (pattern_EG2ChoiceAfterPG_20_2_black_nac_2BB(egw,
																		process) == null) {
																	if (pattern_EG2ChoiceAfterPG_20_2_black_nac_7BB(egw,
																			sf1) == null) {
																		if (pattern_EG2ChoiceAfterPG_20_2_black_nac_9BB(
																				prevNode, egw) == null) {
																			if (pattern_EG2ChoiceAfterPG_20_2_black_nac_0BBB(
																					sf1, egw, ecgw) == null) {
																				if (pattern_EG2ChoiceAfterPG_20_2_black_nac_3BBB(
																						egw, prevNode, ecgw) == null) {
																					if (pattern_EG2ChoiceAfterPG_20_2_black_nac_4BBB(
																							ecgw, prevNode,
																							egw) == null) {
																						if (pattern_EG2ChoiceAfterPG_20_2_black_nac_5BB(
																								ecgw,
																								process) == null) {
																							if (pattern_EG2ChoiceAfterPG_20_2_black_nac_6BBB(
																									ecgw, prevNode,
																									egw) == null) {
																								if (pattern_EG2ChoiceAfterPG_20_2_black_nac_8BB(
																										ecgw,
																										sf1) == null) {
																									if (pattern_EG2ChoiceAfterPG_20_2_black_nac_10BB(
																											ecgw,
																											prevNode) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
																														sf1,
																														egw,
																														ecgw,
																														_edge_flowElements });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}

													}

												}
											}
										}

									}

								}
							}

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_20_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_20_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_21_1_binding = pattern_EG2ChoiceAfterPG_21_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_21_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_21_1_black = pattern_EG2ChoiceAfterPG_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_2_black_nac_0BB(ParallelFlow pflow, ParallelStep pstep) {
		for (ParallelStep __DEC_pflow_invokedFlows_584630 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_pflow_invokedFlows_584630)) {
				return new Object[] { pflow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_2_black_nac_1BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_369023 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_369023)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_2_black_nac_2BBB(ChoiceStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_377702 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_377702)) {
					if (!flow.equals(__DEC_step_steps_377702)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_2_black_nac_3BB(ChoiceStep step, ParallelStep pstep) {
		for (Step __DEC_step_next_595453 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_595453)) {
				if (!pstep.equals(__DEC_step_next_595453)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_2_black_nac_4BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_2_black_nac_5BB(ParallelStep pstep, ChoiceStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_21_2_blackFFFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpPflow = _edge_flows.getTrg();
			if (tmpPflow instanceof ParallelFlow) {
				ParallelFlow pflow = (ParallelFlow) tmpPflow;
				if (useCase.getFlows().contains(pflow)) {
					if (pattern_EG2ChoiceAfterPG_21_2_black_nac_1BB(pflow, useCase) == null) {
						for (Flow flow : useCase.getFlows()) {
							if (!flow.equals(pflow)) {
								for (Step tmpStep : pflow.getSteps()) {
									if (tmpStep instanceof ChoiceStep) {
										ChoiceStep step = (ChoiceStep) tmpStep;
										if (pattern_EG2ChoiceAfterPG_21_2_black_nac_2BBB(step, pflow, flow) == null) {
											if (pattern_EG2ChoiceAfterPG_21_2_black_nac_4BB(flow, step) == null) {
												for (Step tmpPstep : flow.getSteps()) {
													if (tmpPstep instanceof ParallelStep) {
														ParallelStep pstep = (ParallelStep) tmpPstep;
														if (pstep.getInvokedFlows().contains(pflow)) {
															if (pattern_EG2ChoiceAfterPG_21_2_black_nac_0BB(pflow,
																	pstep) == null) {
																if (pattern_EG2ChoiceAfterPG_21_2_black_nac_3BB(step,
																		pstep) == null) {
																	if (pattern_EG2ChoiceAfterPG_21_2_black_nac_5BB(
																			pstep, step) == null) {
																		_result.add(new Object[] { useCase, pstep,
																				pflow, step, flow, _edge_flows });
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_21_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, pflow, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_21_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_22_1_binding = pattern_EG2ChoiceAfterPG_22_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_22_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_22_1_black = pattern_EG2ChoiceAfterPG_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_396666 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_396666)) {
					if (!ecgw.equals(__DEC_sf1_default_396666)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_994136 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_994136)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_220375 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_220375)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_428615 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_428615)) {
					if (!prevNode.equals(__DEC_egw___conv_428615)) {
						if (!ecgw.equals(__DEC_egw___conv_428615)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_942831 = ecgw.get__conv();
			if (__DEC_ecgw___conv_942831 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_942831)) {
					if (!prevNode.equals(__DEC_ecgw___conv_942831)) {
						if (!egw.equals(__DEC_ecgw___conv_942831)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_121372 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_121372)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_953940 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_953940)) {
					if (!prevNode.equals(__DEC_ecgw___conv_953940)) {
						if (!egw.equals(__DEC_ecgw___conv_953940)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_22_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					FlowNode tmpEgw = sf1.getTargetRef();
					if (tmpEgw instanceof ExclusiveGateway) {
						ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							Gateway tmpEcgw = egw.get__conv();
							if (tmpEcgw instanceof ExclusiveGateway) {
								ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
								if (!ecgw.equals(egw)) {
									boolean egwisDiverging = egw.isIsDiverging();
									if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
										boolean ecgwisDiverging = ecgw.isIsDiverging();
										if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
											if (pattern_EG2ChoiceAfterPG_22_2_black_nac_7BB(egw, sf1) == null) {
												if (pattern_EG2ChoiceAfterPG_22_2_black_nac_9BB(prevNode,
														egw) == null) {
													if (pattern_EG2ChoiceAfterPG_22_2_black_nac_0BBB(sf1, egw,
															ecgw) == null) {
														if (pattern_EG2ChoiceAfterPG_22_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_EG2ChoiceAfterPG_22_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_EG2ChoiceAfterPG_22_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceAfterPG_22_2_black_nac_8BB(
																			ecgw, sf1) == null) {
																		if (pattern_EG2ChoiceAfterPG_22_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(sf1,
																							SimpleBPMN.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(egw)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_EG2ChoiceAfterPG_22_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_EG2ChoiceAfterPG_22_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_EG2ChoiceAfterPG_22_2_black_nac_5BB(
																											ecgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
																														sf1,
																														egw,
																														ecgw,
																														_edge_sourceRef });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

									}

								}
							}

						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_22_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_22_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_23_1_binding = pattern_EG2ChoiceAfterPG_23_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_23_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_23_1_black = pattern_EG2ChoiceAfterPG_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_842474 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_842474)) {
					if (!ecgw.equals(__DEC_sf1_default_842474)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_339036 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_339036)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_338592 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_338592)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_838575 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_838575)) {
					if (!prevNode.equals(__DEC_egw___conv_838575)) {
						if (!ecgw.equals(__DEC_egw___conv_838575)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_348143 = ecgw.get__conv();
			if (__DEC_ecgw___conv_348143 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_348143)) {
					if (!prevNode.equals(__DEC_ecgw___conv_348143)) {
						if (!egw.equals(__DEC_ecgw___conv_348143)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_292013 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_292013)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_160079 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_160079)) {
					if (!prevNode.equals(__DEC_ecgw___conv_160079)) {
						if (!egw.equals(__DEC_ecgw___conv_160079)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_23_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof ParallelGateway) {
			ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
						FlowNode tmpEgw = sf1.getTargetRef();
						if (tmpEgw instanceof ExclusiveGateway) {
							ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
							Gateway tmpEcgw = egw.get__conv();
							if (tmpEcgw instanceof ExclusiveGateway) {
								ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
								if (!ecgw.equals(egw)) {
									boolean egwisDiverging = egw.isIsDiverging();
									if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
										boolean ecgwisDiverging = ecgw.isIsDiverging();
										if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
											if (pattern_EG2ChoiceAfterPG_23_2_black_nac_7BB(egw, sf1) == null) {
												if (pattern_EG2ChoiceAfterPG_23_2_black_nac_9BB(prevNode,
														egw) == null) {
													if (pattern_EG2ChoiceAfterPG_23_2_black_nac_0BBB(sf1, egw,
															ecgw) == null) {
														if (pattern_EG2ChoiceAfterPG_23_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_EG2ChoiceAfterPG_23_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_EG2ChoiceAfterPG_23_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceAfterPG_23_2_black_nac_8BB(
																			ecgw, sf1) == null) {
																		if (pattern_EG2ChoiceAfterPG_23_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(prevNode,
																							SimpleBPMN.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(sf1)) {
																					if (process.getFlowElements()
																							.contains(egw)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_EG2ChoiceAfterPG_23_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_EG2ChoiceAfterPG_23_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_EG2ChoiceAfterPG_23_2_black_nac_5BB(
																											ecgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
																														sf1,
																														egw,
																														ecgw,
																														_edge_outgoing });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

									}

								}
							}

						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_23_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_23_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_24_1_binding = pattern_EG2ChoiceAfterPG_24_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_24_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_24_1_black = pattern_EG2ChoiceAfterPG_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_2_black_nac_0BB(ParallelFlow pflow, ParallelStep pstep) {
		for (ParallelStep __DEC_pflow_invokedFlows_868742 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_pflow_invokedFlows_868742)) {
				return new Object[] { pflow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_2_black_nac_1BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_428503 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_428503)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_2_black_nac_2BBB(ChoiceStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_551886 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_551886)) {
					if (!flow.equals(__DEC_step_steps_551886)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_2_black_nac_3BB(ChoiceStep step, ParallelStep pstep) {
		for (Step __DEC_step_next_60847 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_60847)) {
				if (!pstep.equals(__DEC_step_next_60847)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_2_black_nac_4BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_2_black_nac_5BB(ParallelStep pstep, ChoiceStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_24_2_blackFFFFFB(EMoflonEdge _edge_invokedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPstep = _edge_invokedFlows.getSrc();
		if (tmpPstep instanceof ParallelStep) {
			ParallelStep pstep = (ParallelStep) tmpPstep;
			EObject tmpPflow = _edge_invokedFlows.getTrg();
			if (tmpPflow instanceof ParallelFlow) {
				ParallelFlow pflow = (ParallelFlow) tmpPflow;
				if (pstep.getInvokedFlows().contains(pflow)) {
					if (pattern_EG2ChoiceAfterPG_24_2_black_nac_0BB(pflow, pstep) == null) {
						for (Step tmpStep : pflow.getSteps()) {
							if (tmpStep instanceof ChoiceStep) {
								ChoiceStep step = (ChoiceStep) tmpStep;
								if (pattern_EG2ChoiceAfterPG_24_2_black_nac_3BB(step, pstep) == null) {
									if (pattern_EG2ChoiceAfterPG_24_2_black_nac_5BB(pstep, step) == null) {
										for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(pstep, Flow.class, "steps")) {
											if (!flow.equals(pflow)) {
												if (pattern_EG2ChoiceAfterPG_24_2_black_nac_2BBB(step, pflow,
														flow) == null) {
													if (pattern_EG2ChoiceAfterPG_24_2_black_nac_4BB(flow,
															step) == null) {
														for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(pflow, UseCase.class,
																		"flows")) {
															if (useCase.getFlows().contains(flow)) {
																if (pattern_EG2ChoiceAfterPG_24_2_black_nac_1BB(pflow,
																		useCase) == null) {
																	_result.add(new Object[] { useCase, pstep, pflow,
																			step, flow, _edge_invokedFlows });
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_24_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, pflow, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_24_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_25_1_binding = pattern_EG2ChoiceAfterPG_25_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_25_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_25_1_black = pattern_EG2ChoiceAfterPG_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_2_black_nac_0BB(ParallelFlow pflow, ParallelStep pstep) {
		for (ParallelStep __DEC_pflow_invokedFlows_628444 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_pflow_invokedFlows_628444)) {
				return new Object[] { pflow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_2_black_nac_1BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_739912 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_739912)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_2_black_nac_2BBB(ChoiceStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_895740 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_895740)) {
					if (!flow.equals(__DEC_step_steps_895740)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_2_black_nac_3BB(ChoiceStep step, ParallelStep pstep) {
		for (Step __DEC_step_next_633933 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_633933)) {
				if (!pstep.equals(__DEC_step_next_633933)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_2_black_nac_4BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_2_black_nac_5BB(ParallelStep pstep, ChoiceStep step) {
		if (step.equals(pstep.getNext())) {
			return new Object[] { pstep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_25_2_blackFFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPflow = _edge_steps.getSrc();
		if (tmpPflow instanceof ParallelFlow) {
			ParallelFlow pflow = (ParallelFlow) tmpPflow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ChoiceStep) {
				ChoiceStep step = (ChoiceStep) tmpStep;
				if (pflow.getSteps().contains(step)) {
					for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pflow,
							UseCase.class, "flows")) {
						if (pattern_EG2ChoiceAfterPG_25_2_black_nac_1BB(pflow, useCase) == null) {
							for (Flow flow : useCase.getFlows()) {
								if (!flow.equals(pflow)) {
									if (pattern_EG2ChoiceAfterPG_25_2_black_nac_2BBB(step, pflow, flow) == null) {
										if (pattern_EG2ChoiceAfterPG_25_2_black_nac_4BB(flow, step) == null) {
											for (Step tmpPstep : flow.getSteps()) {
												if (tmpPstep instanceof ParallelStep) {
													ParallelStep pstep = (ParallelStep) tmpPstep;
													if (pstep.getInvokedFlows().contains(pflow)) {
														if (pattern_EG2ChoiceAfterPG_25_2_black_nac_0BB(pflow,
																pstep) == null) {
															if (pattern_EG2ChoiceAfterPG_25_2_black_nac_3BB(step,
																	pstep) == null) {
																if (pattern_EG2ChoiceAfterPG_25_2_black_nac_5BB(pstep,
																		step) == null) {
																	_result.add(new Object[] { useCase, pstep, pflow,
																			step, flow, _edge_steps });
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_25_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			UseCase useCase, ParallelStep pstep, ParallelFlow pflow, ChoiceStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, pstep, pflow, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_25_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_26_1_binding = pattern_EG2ChoiceAfterPG_26_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_26_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_26_1_black = pattern_EG2ChoiceAfterPG_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_916455 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_916455)) {
					if (!ecgw.equals(__DEC_sf1_default_916455)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_286339 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_286339)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_642836 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_642836)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_578593 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_578593)) {
					if (!prevNode.equals(__DEC_egw___conv_578593)) {
						if (!ecgw.equals(__DEC_egw___conv_578593)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_738353 = ecgw.get__conv();
			if (__DEC_ecgw___conv_738353 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_738353)) {
					if (!prevNode.equals(__DEC_ecgw___conv_738353)) {
						if (!egw.equals(__DEC_ecgw___conv_738353)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_123951 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_123951)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_808563 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_808563)) {
					if (!prevNode.equals(__DEC_ecgw___conv_808563)) {
						if (!egw.equals(__DEC_ecgw___conv_808563)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_26_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpEgw = _edge_flowElements.getTrg();
			if (tmpEgw instanceof ExclusiveGateway) {
				ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
				if (process.getFlowElements().contains(egw)) {
					Gateway tmpEcgw = egw.get__conv();
					if (tmpEcgw instanceof ExclusiveGateway) {
						ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
						if (!ecgw.equals(egw)) {
							if (process.getFlowElements().contains(ecgw)) {
								boolean egwisDiverging = egw.isIsDiverging();
								if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
									boolean ecgwisDiverging = ecgw.isIsDiverging();
									if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
										if (pattern_EG2ChoiceAfterPG_26_2_black_nac_2BB(egw, process) == null) {
											if (pattern_EG2ChoiceAfterPG_26_2_black_nac_5BB(ecgw, process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof ParallelGateway) {
														ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
														boolean prevNodeisDiverging = prevNode.isIsDiverging();
														if (Boolean.valueOf(prevNodeisDiverging)
																.equals(Boolean.valueOf(true))) {
															if (pattern_EG2ChoiceAfterPG_26_2_black_nac_3BBB(egw,
																	prevNode, ecgw) == null) {
																if (pattern_EG2ChoiceAfterPG_26_2_black_nac_4BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceAfterPG_26_2_black_nac_6BBB(
																			ecgw, prevNode, egw) == null) {
																		if (pattern_EG2ChoiceAfterPG_26_2_black_nac_9BB(
																				prevNode, egw) == null) {
																			if (pattern_EG2ChoiceAfterPG_26_2_black_nac_10BB(
																					ecgw, prevNode) == null) {
																				for (FlowElement tmpSf1 : process
																						.getFlowElements()) {
																					if (tmpSf1 instanceof SequenceFlow) {
																						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																						if (prevNode.equals(
																								sf1.getSourceRef())) {
																							if (egw.equals(sf1
																									.getTargetRef())) {
																								if (pattern_EG2ChoiceAfterPG_26_2_black_nac_0BBB(
																										sf1, egw,
																										ecgw) == null) {
																									if (pattern_EG2ChoiceAfterPG_26_2_black_nac_1BB(
																											sf1,
																											process) == null) {
																										if (pattern_EG2ChoiceAfterPG_26_2_black_nac_7BB(
																												egw,
																												sf1) == null) {
																											if (pattern_EG2ChoiceAfterPG_26_2_black_nac_8BB(
																													ecgw,
																													sf1) == null) {
																												_result.add(
																														new Object[] {
																																process,
																																prevNode,
																																sf1,
																																egw,
																																ecgw,
																																_edge_flowElements });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}

													}
												}
											}
										}
									}

								}

							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_26_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_26_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_27_1_binding = pattern_EG2ChoiceAfterPG_27_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_27_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_27_1_black = pattern_EG2ChoiceAfterPG_27_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_904092 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_904092)) {
					if (!ecgw.equals(__DEC_sf1_default_904092)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_821759 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_821759)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_409036 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_409036)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_266890 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_266890)) {
					if (!prevNode.equals(__DEC_egw___conv_266890)) {
						if (!ecgw.equals(__DEC_egw___conv_266890)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_816740 = ecgw.get__conv();
			if (__DEC_ecgw___conv_816740 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_816740)) {
					if (!prevNode.equals(__DEC_ecgw___conv_816740)) {
						if (!egw.equals(__DEC_ecgw___conv_816740)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_27003 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_27003)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_763308 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_763308)) {
					if (!prevNode.equals(__DEC_ecgw___conv_763308)) {
						if (!egw.equals(__DEC_ecgw___conv_763308)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_27_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpEcgw = _edge_flowElements.getTrg();
			if (tmpEcgw instanceof ExclusiveGateway) {
				ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
				if (process.getFlowElements().contains(ecgw)) {
					boolean ecgwisDiverging = ecgw.isIsDiverging();
					if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
						if (pattern_EG2ChoiceAfterPG_27_2_black_nac_5BB(ecgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof ParallelGateway) {
									ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										if (pattern_EG2ChoiceAfterPG_27_2_black_nac_10BB(ecgw, prevNode) == null) {
											for (FlowElement tmpSf1 : process.getFlowElements()) {
												if (tmpSf1 instanceof SequenceFlow) {
													SequenceFlow sf1 = (SequenceFlow) tmpSf1;
													if (prevNode.equals(sf1.getSourceRef())) {
														FlowNode tmpEgw = sf1.getTargetRef();
														if (tmpEgw instanceof ExclusiveGateway) {
															ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
															if (!ecgw.equals(egw)) {
																if (process.getFlowElements().contains(egw)) {
																	if (ecgw.equals(egw.get__conv())) {
																		boolean egwisDiverging = egw.isIsDiverging();
																		if (Boolean.valueOf(egwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (pattern_EG2ChoiceAfterPG_27_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_EG2ChoiceAfterPG_27_2_black_nac_8BB(
																						ecgw, sf1) == null) {
																					if (pattern_EG2ChoiceAfterPG_27_2_black_nac_0BBB(
																							sf1, egw, ecgw) == null) {
																						if (pattern_EG2ChoiceAfterPG_27_2_black_nac_2BB(
																								egw, process) == null) {
																							if (pattern_EG2ChoiceAfterPG_27_2_black_nac_3BBB(
																									egw, prevNode,
																									ecgw) == null) {
																								if (pattern_EG2ChoiceAfterPG_27_2_black_nac_4BBB(
																										ecgw, prevNode,
																										egw) == null) {
																									if (pattern_EG2ChoiceAfterPG_27_2_black_nac_6BBB(
																											ecgw,
																											prevNode,
																											egw) == null) {
																										if (pattern_EG2ChoiceAfterPG_27_2_black_nac_7BB(
																												egw,
																												sf1) == null) {
																											if (pattern_EG2ChoiceAfterPG_27_2_black_nac_9BB(
																													prevNode,
																													egw) == null) {
																												_result.add(
																														new Object[] {
																																process,
																																prevNode,
																																sf1,
																																egw,
																																ecgw,
																																_edge_flowElements });
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}

																	}
																}
															}
														}

													}
												}
											}
										}
									}

								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_27_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_27_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_28_1_binding = pattern_EG2ChoiceAfterPG_28_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_28_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_28_1_black = pattern_EG2ChoiceAfterPG_28_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_710064 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_710064)) {
					if (!ecgw.equals(__DEC_sf1_default_710064)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_247145 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_247145)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_897512 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_897512)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_997985 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_997985)) {
					if (!prevNode.equals(__DEC_egw___conv_997985)) {
						if (!ecgw.equals(__DEC_egw___conv_997985)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_769467 = ecgw.get__conv();
			if (__DEC_ecgw___conv_769467 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_769467)) {
					if (!prevNode.equals(__DEC_ecgw___conv_769467)) {
						if (!egw.equals(__DEC_ecgw___conv_769467)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_870105 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_870105)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_122538 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_122538)) {
					if (!prevNode.equals(__DEC_ecgw___conv_122538)) {
						if (!egw.equals(__DEC_ecgw___conv_122538)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_28_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpEgw = _edge_targetRef.getTrg();
			if (tmpEgw instanceof ExclusiveGateway) {
				ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
				if (egw.equals(sf1.getTargetRef())) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						Gateway tmpEcgw = egw.get__conv();
						if (tmpEcgw instanceof ExclusiveGateway) {
							ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
							if (!ecgw.equals(egw)) {
								boolean egwisDiverging = egw.isIsDiverging();
								if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										boolean ecgwisDiverging = ecgw.isIsDiverging();
										if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
											if (pattern_EG2ChoiceAfterPG_28_2_black_nac_7BB(egw, sf1) == null) {
												if (pattern_EG2ChoiceAfterPG_28_2_black_nac_9BB(prevNode,
														egw) == null) {
													if (pattern_EG2ChoiceAfterPG_28_2_black_nac_0BBB(sf1, egw,
															ecgw) == null) {
														if (pattern_EG2ChoiceAfterPG_28_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_EG2ChoiceAfterPG_28_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_EG2ChoiceAfterPG_28_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceAfterPG_28_2_black_nac_8BB(
																			ecgw, sf1) == null) {
																		if (pattern_EG2ChoiceAfterPG_28_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(sf1,
																							SimpleBPMN.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(egw)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_EG2ChoiceAfterPG_28_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_EG2ChoiceAfterPG_28_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_EG2ChoiceAfterPG_28_2_black_nac_5BB(
																											ecgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
																														sf1,
																														egw,
																														ecgw,
																														_edge_targetRef });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

									}

								}

							}
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_28_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_28_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_29_1_binding = pattern_EG2ChoiceAfterPG_29_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_29_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_29_1_black = pattern_EG2ChoiceAfterPG_29_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_211707 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_211707)) {
					if (!ecgw.equals(__DEC_sf1_default_211707)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_392998 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_392998)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_771364 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_771364)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_869397 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_869397)) {
					if (!prevNode.equals(__DEC_egw___conv_869397)) {
						if (!ecgw.equals(__DEC_egw___conv_869397)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_157204 = ecgw.get__conv();
			if (__DEC_ecgw___conv_157204 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_157204)) {
					if (!prevNode.equals(__DEC_ecgw___conv_157204)) {
						if (!egw.equals(__DEC_ecgw___conv_157204)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_462053 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_462053)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_623433 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_623433)) {
					if (!prevNode.equals(__DEC_ecgw___conv_623433)) {
						if (!egw.equals(__DEC_ecgw___conv_623433)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_29_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEgw = _edge_incoming.getSrc();
		if (tmpEgw instanceof ExclusiveGateway) {
			ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
			EObject tmpSf1 = _edge_incoming.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (egw.equals(sf1.getTargetRef())) {
					Gateway tmpEcgw = egw.get__conv();
					if (tmpEcgw instanceof ExclusiveGateway) {
						ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
						if (!ecgw.equals(egw)) {
							boolean egwisDiverging = egw.isIsDiverging();
							if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
								FlowNode tmpPrevNode = sf1.getSourceRef();
								if (tmpPrevNode instanceof ParallelGateway) {
									ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
									boolean ecgwisDiverging = ecgw.isIsDiverging();
									if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_EG2ChoiceAfterPG_29_2_black_nac_7BB(egw, sf1) == null) {
												if (pattern_EG2ChoiceAfterPG_29_2_black_nac_0BBB(sf1, egw,
														ecgw) == null) {
													if (pattern_EG2ChoiceAfterPG_29_2_black_nac_8BB(ecgw,
															sf1) == null) {
														if (pattern_EG2ChoiceAfterPG_29_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_EG2ChoiceAfterPG_29_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_EG2ChoiceAfterPG_29_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceAfterPG_29_2_black_nac_9BB(
																			prevNode, egw) == null) {
																		if (pattern_EG2ChoiceAfterPG_29_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(egw,
																							SimpleBPMN.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(sf1)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_EG2ChoiceAfterPG_29_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_EG2ChoiceAfterPG_29_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_EG2ChoiceAfterPG_29_2_black_nac_5BB(
																											ecgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
																														sf1,
																														egw,
																														ecgw,
																														_edge_incoming });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

									}

								}

							}

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_29_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_29_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_1_bindingFB(EG2ChoiceAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_1_blackFBB(EClass __eClass, EG2ChoiceAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_1_bindingAndBlackFFB(EG2ChoiceAfterPG _this) {
		Object[] result_pattern_EG2ChoiceAfterPG_30_1_binding = pattern_EG2ChoiceAfterPG_30_1_bindingFB(_this);
		if (result_pattern_EG2ChoiceAfterPG_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EG2ChoiceAfterPG_30_1_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_30_1_black = pattern_EG2ChoiceAfterPG_30_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EG2ChoiceAfterPG_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EG2ChoiceAfterPG_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (ExclusiveGateway __DEC_sf1_default_783241 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!egw.equals(__DEC_sf1_default_783241)) {
					if (!ecgw.equals(__DEC_sf1_default_783241)) {
						return new Object[] { sf1, egw, ecgw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_557789 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_557789)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_675092 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_675092)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_3BBB(ExclusiveGateway egw,
			ParallelGateway prevNode, ExclusiveGateway ecgw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_egw___conv_346946 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
				if (!egw.equals(__DEC_egw___conv_346946)) {
					if (!prevNode.equals(__DEC_egw___conv_346946)) {
						if (!ecgw.equals(__DEC_egw___conv_346946)) {
							return new Object[] { egw, prevNode, ecgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			Gateway __DEC_ecgw___conv_949418 = ecgw.get__conv();
			if (__DEC_ecgw___conv_949418 != null) {
				if (!ecgw.equals(__DEC_ecgw___conv_949418)) {
					if (!prevNode.equals(__DEC_ecgw___conv_949418)) {
						if (!egw.equals(__DEC_ecgw___conv_949418)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_747108 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_747108)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ParallelGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(egw)) {
			for (Gateway __DEC_ecgw___conv_925019 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
				if (!ecgw.equals(__DEC_ecgw___conv_925019)) {
					if (!prevNode.equals(__DEC_ecgw___conv_925019)) {
						if (!egw.equals(__DEC_ecgw___conv_925019)) {
							return new Object[] { ecgw, prevNode, egw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_7BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_8BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_9BB(ParallelGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_black_nac_10BB(ExclusiveGateway ecgw,
			ParallelGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_30_2_blackFFFFFB(EMoflonEdge _edge___conv) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEgw = _edge___conv.getSrc();
		if (tmpEgw instanceof ExclusiveGateway) {
			ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
			EObject tmpEcgw = _edge___conv.getTrg();
			if (tmpEcgw instanceof ExclusiveGateway) {
				ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
				if (!ecgw.equals(egw)) {
					if (ecgw.equals(egw.get__conv())) {
						boolean egwisDiverging = egw.isIsDiverging();
						if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
							boolean ecgwisDiverging = ecgw.isIsDiverging();
							if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
								for (SequenceFlow sf1 : egw.getIncoming()) {
									FlowNode tmpPrevNode = sf1.getSourceRef();
									if (tmpPrevNode instanceof ParallelGateway) {
										ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_EG2ChoiceAfterPG_30_2_black_nac_0BBB(sf1, egw, ecgw) == null) {
												if (pattern_EG2ChoiceAfterPG_30_2_black_nac_7BB(egw, sf1) == null) {
													if (pattern_EG2ChoiceAfterPG_30_2_black_nac_8BB(ecgw,
															sf1) == null) {
														if (pattern_EG2ChoiceAfterPG_30_2_black_nac_3BBB(egw, prevNode,
																ecgw) == null) {
															if (pattern_EG2ChoiceAfterPG_30_2_black_nac_4BBB(ecgw,
																	prevNode, egw) == null) {
																if (pattern_EG2ChoiceAfterPG_30_2_black_nac_6BBB(ecgw,
																		prevNode, egw) == null) {
																	if (pattern_EG2ChoiceAfterPG_30_2_black_nac_9BB(
																			prevNode, egw) == null) {
																		if (pattern_EG2ChoiceAfterPG_30_2_black_nac_10BB(
																				ecgw, prevNode) == null) {
																			for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(egw,
																							SimpleBPMN.Process.class,
																							"flowElements")) {
																				if (process.getFlowElements()
																						.contains(prevNode)) {
																					if (process.getFlowElements()
																							.contains(sf1)) {
																						if (process.getFlowElements()
																								.contains(ecgw)) {
																							if (pattern_EG2ChoiceAfterPG_30_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_EG2ChoiceAfterPG_30_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_EG2ChoiceAfterPG_30_2_black_nac_5BB(
																											ecgw,
																											process) == null) {
																										_result.add(
																												new Object[] {
																														process,
																														prevNode,
																														sf1,
																														egw,
																														ecgw,
																														_edge___conv });
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

									}

								}
							}

						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EG2ChoiceAfterPG_30_3_expressionFBBBBBBB(EG2ChoiceAfterPG _this, Match match,
			SimpleBPMN.Process process, ParallelGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_30_4_expressionFBB(EG2ChoiceAfterPG _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_30_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EG2ChoiceAfterPG_30_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_33_1_blackB(EG2ChoiceAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_33_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_33_2_bindingFFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("process");
		EObject _localVariable_1 = targetMatch.getObject("useCase");
		EObject _localVariable_2 = sourceMatch.getObject("prevNode");
		EObject _localVariable_3 = targetMatch.getObject("pstep");
		EObject _localVariable_4 = sourceMatch.getObject("sf1");
		EObject _localVariable_5 = targetMatch.getObject("pflow");
		EObject _localVariable_6 = targetMatch.getObject("step");
		EObject _localVariable_7 = targetMatch.getObject("flow");
		EObject _localVariable_8 = sourceMatch.getObject("egw");
		EObject _localVariable_9 = sourceMatch.getObject("ecgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpPstep = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpPflow = _localVariable_5;
		EObject tmpStep = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpEgw = _localVariable_8;
		EObject tmpEcgw = _localVariable_9;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpPrevNode instanceof ParallelGateway) {
					ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
					if (tmpPstep instanceof ParallelStep) {
						ParallelStep pstep = (ParallelStep) tmpPstep;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpPflow instanceof ParallelFlow) {
								ParallelFlow pflow = (ParallelFlow) tmpPflow;
								if (tmpStep instanceof ChoiceStep) {
									ChoiceStep step = (ChoiceStep) tmpStep;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpEgw instanceof ExclusiveGateway) {
											ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
											if (tmpEcgw instanceof ExclusiveGateway) {
												ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
												return new Object[] { process, useCase, prevNode, pstep, sf1, pflow,
														step, flow, egw, ecgw, sourceMatch, targetMatch };
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_33_2_blackBBFBBFBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(pflow)) {
			if (!ecgw.equals(egw)) {
				if (!sourceMatch.equals(targetMatch)) {
					if (process.getFlowElements().contains(prevNode)) {
						if (process.getFlowElements().contains(sf1)) {
							if (useCase.getFlows().contains(pflow)) {
								if (useCase.getFlows().contains(flow)) {
									if (prevNode.equals(sf1.getSourceRef())) {
										if (pstep.getInvokedFlows().contains(pflow)) {
											if (pflow.getSteps().contains(step)) {
												if (flow.getSteps().contains(pstep)) {
													if (process.getFlowElements().contains(egw)) {
														if (process.getFlowElements().contains(ecgw)) {
															if (egw.equals(sf1.getTargetRef())) {
																if (ecgw.equals(egw.get__conv())) {
																	boolean prevNodeisDiverging = prevNode
																			.isIsDiverging();
																	if (Boolean.valueOf(prevNodeisDiverging)
																			.equals(Boolean.valueOf(true))) {
																		boolean egwisDiverging = egw.isIsDiverging();
																		if (Boolean.valueOf(egwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			boolean ecgwisDiverging = ecgw
																					.isIsDiverging();
																			if (Boolean.valueOf(ecgwisDiverging)
																					.equals(false)) {
																				for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								process, P2UC.class,
																								"source")) {
																					if (useCase
																							.equals(p2uc.getTarget())) {
																						for (GW2S pg2ps : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										prevNode,
																										GW2S.class,
																										"source")) {
																							if (pstep.equals(pg2ps
																									.getTarget())) {
																								_result.add(
																										new Object[] {
																												process,
																												useCase,
																												p2uc,
																												prevNode,
																												pstep,
																												pg2ps,
																												sf1,
																												pflow,
																												step,
																												flow,
																												egw,
																												ecgw,
																												sourceMatch,
																												targetMatch });
																							}
																						}
																					}
																				}
																			}

																		}

																	}

																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_33_2_greenBBBBBBBBBBBBBBF(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1,
			ParallelFlow pflow, ChoiceStep step, Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw,
			Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "EG2ChoiceAfterPG";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(egw);
		isApplicableMatch.getAllContextElements().add(ecgw);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(pflow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(pg2ps);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, ecgw,
				sourceMatch, targetMatch, isApplicableMatch };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_33_3_bindingFBBBBBBBBBBBBBBBB(EG2ChoiceAfterPG _this,
			IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, process, useCase, p2uc, prevNode,
				pstep, pg2ps, sf1, pflow, step, flow, egw, ecgw, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1,
					pflow, step, flow, egw, ecgw, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_33_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_33_3_bindingAndBlackFBBBBBBBBBBBBBBBB(EG2ChoiceAfterPG _this,
			IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1, ParallelFlow pflow,
			ChoiceStep step, Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_EG2ChoiceAfterPG_33_3_binding = pattern_EG2ChoiceAfterPG_33_3_bindingFBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw,
				ecgw, sourceMatch, targetMatch);
		if (result_pattern_EG2ChoiceAfterPG_33_3_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceAfterPG_33_3_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_33_3_black = pattern_EG2ChoiceAfterPG_33_3_blackB(csp);
			if (result_pattern_EG2ChoiceAfterPG_33_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps,
						sf1, pflow, step, flow, egw, ecgw, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_33_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_33_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EG2ChoiceAfterPG";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EG2ChoiceAfterPG_33_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_36_1_blackB(EG2ChoiceAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_36_2_bindingFFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_4 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_5 = isApplicableMatch.getObject("pg2ps");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("pflow");
		EObject _localVariable_8 = isApplicableMatch.getObject("step");
		EObject _localVariable_9 = isApplicableMatch.getObject("flow");
		EObject _localVariable_10 = isApplicableMatch.getObject("egw");
		EObject _localVariable_11 = isApplicableMatch.getObject("ecgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpP2uc = _localVariable_2;
		EObject tmpPrevNode = _localVariable_3;
		EObject tmpPstep = _localVariable_4;
		EObject tmpPg2ps = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpPflow = _localVariable_7;
		EObject tmpStep = _localVariable_8;
		EObject tmpFlow = _localVariable_9;
		EObject tmpEgw = _localVariable_10;
		EObject tmpEcgw = _localVariable_11;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpP2uc instanceof P2UC) {
					P2UC p2uc = (P2UC) tmpP2uc;
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							if (tmpPg2ps instanceof GW2S) {
								GW2S pg2ps = (GW2S) tmpPg2ps;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmpPflow instanceof ParallelFlow) {
										ParallelFlow pflow = (ParallelFlow) tmpPflow;
										if (tmpStep instanceof ChoiceStep) {
											ChoiceStep step = (ChoiceStep) tmpStep;
											if (tmpFlow instanceof Flow) {
												Flow flow = (Flow) tmpFlow;
												if (tmpEgw instanceof ExclusiveGateway) {
													ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
													if (tmpEcgw instanceof ExclusiveGateway) {
														ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
														return new Object[] { process, useCase, p2uc, prevNode, pstep,
																pg2ps, sf1, pflow, step, flow, egw, ecgw,
																isApplicableMatch };
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_36_2_blackBBBBBBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, SequenceFlow sf1,
			ParallelFlow pflow, ChoiceStep step, Flow flow, ExclusiveGateway egw, ExclusiveGateway ecgw,
			IsApplicableMatchCC isApplicableMatch) {
		if (!flow.equals(pflow)) {
			if (!ecgw.equals(egw)) {
				if (process.getFlowElements().contains(prevNode)) {
					if (process.getFlowElements().contains(sf1)) {
						if (useCase.getFlows().contains(pflow)) {
							if (useCase.getFlows().contains(flow)) {
								if (process.equals(p2uc.getSource())) {
									if (useCase.equals(p2uc.getTarget())) {
										if (prevNode.equals(sf1.getSourceRef())) {
											if (pstep.getInvokedFlows().contains(pflow)) {
												if (prevNode.equals(pg2ps.getSource())) {
													if (pstep.equals(pg2ps.getTarget())) {
														if (pflow.getSteps().contains(step)) {
															if (flow.getSteps().contains(pstep)) {
																if (process.getFlowElements().contains(egw)) {
																	if (process.getFlowElements().contains(ecgw)) {
																		if (egw.equals(sf1.getTargetRef())) {
																			if (ecgw.equals(egw.get__conv())) {
																				boolean prevNodeisDiverging = prevNode
																						.isIsDiverging();
																				if (Boolean.valueOf(prevNodeisDiverging)
																						.equals(Boolean
																								.valueOf(true))) {
																					boolean egwisDiverging = egw
																							.isIsDiverging();
																					if (Boolean.valueOf(egwisDiverging)
																							.equals(Boolean
																									.valueOf(true))) {
																						boolean ecgwisDiverging = ecgw
																								.isIsDiverging();
																						if (Boolean
																								.valueOf(
																										ecgwisDiverging)
																								.equals(false)) {
																							return new Object[] {
																									process, useCase,
																									p2uc, prevNode,
																									pstep, pg2ps, sf1,
																									pflow, step, flow,
																									egw, ecgw,
																									isApplicableMatch };
																						}

																					}

																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_36_2_bindingAndBlackFFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_EG2ChoiceAfterPG_36_2_binding = pattern_EG2ChoiceAfterPG_36_2_bindingFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EG2ChoiceAfterPG_36_2_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EG2ChoiceAfterPG_36_2_binding[0];
			UseCase useCase = (UseCase) result_pattern_EG2ChoiceAfterPG_36_2_binding[1];
			P2UC p2uc = (P2UC) result_pattern_EG2ChoiceAfterPG_36_2_binding[2];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_EG2ChoiceAfterPG_36_2_binding[3];
			ParallelStep pstep = (ParallelStep) result_pattern_EG2ChoiceAfterPG_36_2_binding[4];
			GW2S pg2ps = (GW2S) result_pattern_EG2ChoiceAfterPG_36_2_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_EG2ChoiceAfterPG_36_2_binding[6];
			ParallelFlow pflow = (ParallelFlow) result_pattern_EG2ChoiceAfterPG_36_2_binding[7];
			ChoiceStep step = (ChoiceStep) result_pattern_EG2ChoiceAfterPG_36_2_binding[8];
			Flow flow = (Flow) result_pattern_EG2ChoiceAfterPG_36_2_binding[9];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_EG2ChoiceAfterPG_36_2_binding[10];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_EG2ChoiceAfterPG_36_2_binding[11];

			Object[] result_pattern_EG2ChoiceAfterPG_36_2_black = pattern_EG2ChoiceAfterPG_36_2_blackBBBBBBBBBBBBB(
					process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, ecgw,
					isApplicableMatch);
			if (result_pattern_EG2ChoiceAfterPG_36_2_black != null) {

				return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, sf1, pflow, step, flow, egw, ecgw,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_36_2_greenBBBFFF(ChoiceStep step, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		GW2S egwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		GW2S ecgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		result.getCreatedElements().add(egwToStep);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		result.getCreatedElements().add(ecgwToStep);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		return new Object[] { step, egw, ecgw, result, egwToStep, ecgwToStep };
	}

	public static final PerformRuleResult pattern_EG2ChoiceAfterPG_36_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_1_blackB(EG2ChoiceAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			ParallelGateway prevNode) {
		if (ruleResult.getSourceObjects().contains(prevNode)) {
			return new Object[] { ruleResult, prevNode };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			GW2S pg2ps) {
		if (ruleResult.getCorrObjects().contains(pg2ps)) {
			return new Object[] { ruleResult, pg2ps };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			ParallelStep pstep) {
		if (ruleResult.getTargetObjects().contains(pstep)) {
			return new Object[] { ruleResult, pstep };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_2_black_nac_4BB(ModelgeneratorRuleResult ruleResult,
			Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_2_black_nac_5BB(ModelgeneratorRuleResult ruleResult,
			UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_2_black_nac_6BB(ModelgeneratorRuleResult ruleResult,
			P2UC p2uc) {
		if (ruleResult.getCorrObjects().contains(p2uc)) {
			return new Object[] { ruleResult, p2uc };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EG2ChoiceAfterPG_37_2_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList pg2psList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpPg2ps : pg2psList.getEntryObjects()) {
				if (tmpPg2ps instanceof GW2S) {
					GW2S pg2ps = (GW2S) tmpPg2ps;
					Gateway tmpPrevNode = pg2ps.getSource();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						Step tmpPstep = pg2ps.getTarget();
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								if (pattern_EG2ChoiceAfterPG_37_2_black_nac_2BB(ruleResult, pg2ps) == null) {
									if (pattern_EG2ChoiceAfterPG_37_2_black_nac_1BB(ruleResult, prevNode) == null) {
										if (pattern_EG2ChoiceAfterPG_37_2_black_nac_3BB(ruleResult, pstep) == null) {
											for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
															"flowElements")) {
												if (pattern_EG2ChoiceAfterPG_37_2_black_nac_0BB(ruleResult,
														process) == null) {
													for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(pstep, Flow.class, "steps")) {
														if (pattern_EG2ChoiceAfterPG_37_2_black_nac_4BB(ruleResult,
																flow) == null) {
															for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(process, P2UC.class,
																			"source")) {
																UseCase useCase = p2uc.getTarget();
																if (useCase != null) {
																	if (useCase.getFlows().contains(flow)) {
																		if (pattern_EG2ChoiceAfterPG_37_2_black_nac_6BB(
																				ruleResult, p2uc) == null) {
																			if (pattern_EG2ChoiceAfterPG_37_2_black_nac_5BB(
																					ruleResult, useCase) == null) {
																				_result.add(new Object[] { pg2psList,
																						process, prevNode, pg2ps, pstep,
																						flow, useCase, p2uc,
																						ruleEntryContainer,
																						ruleResult });
																			}
																		}
																	}
																}

															}
														}
													}
												}
											}
										}
									}
								}
							}

						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_3_bindingFBBBBBBBBBB(EG2ChoiceAfterPG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, Flow flow, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, process, useCase, p2uc, prevNode,
				pstep, pg2ps, flow, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, flow,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_3_bindingAndBlackFBBBBBBBBBB(EG2ChoiceAfterPG _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, Flow flow, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EG2ChoiceAfterPG_37_3_binding = pattern_EG2ChoiceAfterPG_37_3_bindingFBBBBBBBBBB(_this,
				isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps, flow, ruleResult);
		if (result_pattern_EG2ChoiceAfterPG_37_3_binding != null) {
			CSP csp = (CSP) result_pattern_EG2ChoiceAfterPG_37_3_binding[0];

			Object[] result_pattern_EG2ChoiceAfterPG_37_3_black = pattern_EG2ChoiceAfterPG_37_3_blackB(csp);
			if (result_pattern_EG2ChoiceAfterPG_37_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, prevNode, pstep, pg2ps,
						flow, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EG2ChoiceAfterPG_37_4_expressionFBB(EG2ChoiceAfterPG _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_5_blackBBBBBBB(SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, Flow flow) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, flow };
		}

		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_6_blackBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, ParallelGateway prevNode, ParallelStep pstep, GW2S pg2ps, Flow flow,
			ModelgeneratorRuleResult ruleResult) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { process, useCase, p2uc, prevNode, pstep, pg2ps, flow, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_EG2ChoiceAfterPG_37_6_greenBBBBFFFFFFFBB(SimpleBPMN.Process process,
			UseCase useCase, ParallelGateway prevNode, ParallelStep pstep, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ParallelFlow pflow = SimpleUseCaseFactory.eINSTANCE.createParallelFlow();
		ChoiceStep step = SimpleUseCaseFactory.eINSTANCE.createChoiceStep();
		ExclusiveGateway egw = SimpleBPMNFactory.eINSTANCE.createExclusiveGateway();
		GW2S egwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ExclusiveGateway ecgw = SimpleBPMNFactory.eINSTANCE.createExclusiveGateway();
		GW2S ecgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("sf1", "id");
		Object _localVariable_1 = csp.getValue("pflow", "id");
		Object _localVariable_2 = csp.getValue("step", "id");
		boolean egw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_3 = csp.getValue("egw", "id");
		boolean ecgw_isDiverging_prime = false;
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		ruleResult.getSourceObjects().add(sf1);
		useCase.getFlows().add(pflow);
		pstep.getInvokedFlows().add(pflow);
		ruleResult.getTargetObjects().add(pflow);
		pflow.getSteps().add(step);
		ruleResult.getTargetObjects().add(step);
		process.getFlowElements().add(egw);
		sf1.setTargetRef(egw);
		ruleResult.getSourceObjects().add(egw);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		ruleResult.getCorrObjects().add(egwToStep);
		process.getFlowElements().add(ecgw);
		egw.set__conv(ecgw);
		ruleResult.getSourceObjects().add(ecgw);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		ruleResult.getCorrObjects().add(ecgwToStep);
		String sf1_id_prime = (String) _localVariable_0;
		String pflow_id_prime = (String) _localVariable_1;
		String step_id_prime = (String) _localVariable_2;
		egw.setIsDiverging(Boolean.valueOf(egw_isDiverging_prime));
		String egw_id_prime = (String) _localVariable_3;
		ecgw.setIsDiverging(Boolean.valueOf(ecgw_isDiverging_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		sf1.setId(sf1_id_prime);
		pflow.setId(pflow_id_prime);
		step.setId(step_id_prime);
		egw.setId(egw_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, useCase, prevNode, pstep, sf1, pflow, step, egw, egwToStep, ecgw, ecgwToStep,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EG2ChoiceAfterPG_37_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EG2ChoiceAfterPGImpl
