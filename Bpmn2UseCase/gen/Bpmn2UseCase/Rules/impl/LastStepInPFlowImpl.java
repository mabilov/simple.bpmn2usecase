/**
 */
package bpmn2UseCase.Rules.impl;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.ParallelFlow;
import SimpleUseCase.ParallelStep;
import SimpleUseCase.Step;
import SimpleUseCase.UseCase;

import TGGLanguage.csp.CSP;

import TGGRuntime.AttributeConstraintsRuleResult;
import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;

import TGGRuntime.impl.AbstractRuleImpl;

import bpmn2UseCase.FN2S;
import bpmn2UseCase.GW2S;
import bpmn2UseCase.P2UC;

import bpmn2UseCase.Rules.LastStepInPFlow;
import bpmn2UseCase.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Last Step In PFlow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LastStepInPFlowImpl extends AbstractRuleImpl implements LastStepInPFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LastStepInPFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLastStepInPFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			SequenceFlow sf) {
		// initial bindings
		Object[] result1_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_0_1_blackBBBBBBB(this, match, process, gw,
				gcw, node, sf);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = " + gw + ", "
							+ "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_0_2_bindingAndBlackFBBBBBBB(this,
				match, process, gw, gcw, node, sf);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = " + gw
					+ ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LastStepInPFlowImpl.pattern_LastStepInPFlow_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_0_4_blackBBBBBB(match, process, gw,
					gcw, node, sf);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = "
						+ gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
			}
			LastStepInPFlowImpl.pattern_LastStepInPFlow_0_4_greenBBBBBFFFFF(match, process, gcw, node, sf);
			// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result4_green[6];
			// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result4_green[7];
			// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_0_5_blackBBBBBB(match, process, gw,
					gcw, node, sf);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = "
						+ gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
			}
			LastStepInPFlowImpl.pattern_LastStepInPFlow_0_5_greenBBBBBFFFF(match, process, gw, gcw, node);
			// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge process__node____flowElements = (EMoflonEdge) result5_green[7];
			// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result5_green[8];

			// register objects to match
			LastStepInPFlowImpl.pattern_LastStepInPFlow_0_6_expressionBBBBBBB(this, match, process, gw, gcw, node, sf);
			return LastStepInPFlowImpl.pattern_LastStepInPFlow_0_7_expressionF();
		} else {
			return LastStepInPFlowImpl.pattern_LastStepInPFlow_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl
				.pattern_LastStepInPFlow_1_1_bindingAndBlackFFFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ParallelStep gwStep = (ParallelStep) result1_bindingAndBlack[0];
		ParallelFlow flow = (ParallelFlow) result1_bindingAndBlack[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[2];
		Gateway gw = (Gateway) result1_bindingAndBlack[3];
		Gateway gcw = (Gateway) result1_bindingAndBlack[4];
		FlowNode node = (FlowNode) result1_bindingAndBlack[5];
		SequenceFlow sf = (SequenceFlow) result1_bindingAndBlack[6];
		Step step = (Step) result1_bindingAndBlack[7];
		FN2S n2s = (FN2S) result1_bindingAndBlack[8];
		GW2S gw2gs = (GW2S) result1_bindingAndBlack[9];
		UseCase useCase = (UseCase) result1_bindingAndBlack[10];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[11];
		// CSP csp = (CSP) result1_bindingAndBlack[13];
		LastStepInPFlowImpl.pattern_LastStepInPFlow_1_1_greenBB(flow, step);

		// collect translated elements
		Object[] result2_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_1_2_blackB(sf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ".");
		}
		Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_1_2_greenFB(sf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_1_3_blackBBBBBBBBBBBBB(ruleresult, gwStep,
				flow, process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", "
					+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = "
					+ node + ", " + "[sf] = " + sf + ", " + "[step] = " + step + ", " + "[n2s] = " + n2s + ", "
					+ "[gw2gs] = " + gw2gs + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ".");
		}
		LastStepInPFlowImpl.pattern_LastStepInPFlow_1_3_greenBBBBBBBFFFFFF(ruleresult, flow, process, gcw, node, sf,
				step);
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result3_green[9];
				// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step______last = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		LastStepInPFlowImpl.pattern_LastStepInPFlow_1_5_expressionBBBBBBBBBBBBBB(this, ruleresult, gwStep, flow,
				process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc);
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LastStepInPFlowImpl.pattern_LastStepInPFlow_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		Gateway gw = (Gateway) result2_binding[1];
		Gateway gcw = (Gateway) result2_binding[2];
		FlowNode node = (FlowNode) result2_binding[3];
		SequenceFlow sf = (SequenceFlow) result2_binding[4];
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_2_2_blackFBBBBBFFFFFB(process, gw,
				gcw, node, sf, match)) {
			ParallelStep gwStep = (ParallelStep) result2_black[0];
			Step step = (Step) result2_black[6];
			FN2S n2s = (FN2S) result2_black[7];
			GW2S gw2gs = (GW2S) result2_black[8];
			UseCase useCase = (UseCase) result2_black[9];
			P2UC p2uc = (P2UC) result2_black[10];
			// ForEach find context
			for (Object[] result3_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_2_3_blackBFBBBBBBBBBB(gwStep,
					process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc)) {
				ParallelFlow flow = (ParallelFlow) result3_black[1];
				Object[] result3_green = LastStepInPFlowImpl
						.pattern_LastStepInPFlow_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(gwStep, flow, process, gw,
								gcw, node, sf, step, n2s, gw2gs, useCase, p2uc);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge gwStep__flow____invokedFlows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[22];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[23];
				// EMoflonEdge n2s__node____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge n2s__step____target = (EMoflonEdge) result3_green[25];
				// EMoflonEdge gw2gs__gw____source = (EMoflonEdge) result3_green[26];
				// EMoflonEdge gw2gs__gwStep____target = (EMoflonEdge) result3_green[27];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[28];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[29];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[30];

				// solve CSP
				Object[] result4_bindingAndBlack = LastStepInPFlowImpl
						.pattern_LastStepInPFlow_2_4_bindingAndBlackFBBBBBBBBBBBBBB(this, isApplicableMatch, gwStep,
								flow, process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", " + "[process] = " + process
							+ ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", "
							+ "[sf] = " + sf + ", " + "[step] = " + step + ", " + "[n2s] = " + n2s + ", " + "[gw2gs] = "
							+ gw2gs + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LastStepInPFlowImpl.pattern_LastStepInPFlow_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LastStepInPFlowImpl.pattern_LastStepInPFlow_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SimpleBPMN.Process process, Gateway gw, Gateway gcw,
			FlowNode node, SequenceFlow sf) {
		match.registerObject("process", process);
		match.registerObject("gw", gw);
		match.registerObject("gcw", gcw);
		match.registerObject("node", node);
		match.registerObject("sf", sf);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SimpleBPMN.Process process, Gateway gw, Gateway gcw,
			FlowNode node, SequenceFlow sf) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs, UseCase useCase, P2UC p2uc) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("gwStep", gwStep);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("gw", gw);
		isApplicableMatch.registerObject("gcw", gcw);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("sf", sf);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("n2s", n2s);
		isApplicableMatch.registerObject("gw2gs", gw2gs);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject gwStep, EObject flow, EObject process,
			EObject gw, EObject gcw, EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs,
			EObject useCase, EObject p2uc) {
		ruleresult.registerObject("gwStep", gwStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("gw", gw);
		ruleresult.registerObject("gcw", gcw);
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("sf", sf);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("n2s", n2s);
		ruleresult.registerObject("gw2gs", gw2gs);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("sf").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, ParallelStep gwStep, ParallelFlow flow, Step step, UseCase useCase) {
		// initial bindings
		Object[] result1_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_10_1_blackBBBBBB(this, match, gwStep, flow,
				step, useCase);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", "
					+ "[flow] = " + flow + ", " + "[step] = " + step + ", " + "[useCase] = " + useCase + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_10_2_bindingAndBlackFBBBBBB(this,
				match, gwStep, flow, step, useCase);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = " + flow
					+ ", " + "[step] = " + step + ", " + "[useCase] = " + useCase + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LastStepInPFlowImpl.pattern_LastStepInPFlow_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_10_4_blackBBBBB(match, gwStep, flow,
					step, useCase);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = "
						+ flow + ", " + "[step] = " + step + ", " + "[useCase] = " + useCase + ".");
			}
			LastStepInPFlowImpl.pattern_LastStepInPFlow_10_4_greenBBBF(match, flow, step);
			// EMoflonEdge flow__step______last = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_10_5_blackBBBBB(match, gwStep, flow,
					step, useCase);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = "
						+ flow + ", " + "[step] = " + step + ", " + "[useCase] = " + useCase + ".");
			}
			LastStepInPFlowImpl.pattern_LastStepInPFlow_10_5_greenBBBBBFFF(match, gwStep, flow, step, useCase);
			// EMoflonEdge gwStep__flow____invokedFlows = (EMoflonEdge) result5_green[5];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result5_green[6];
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[7];

			// register objects to match
			LastStepInPFlowImpl.pattern_LastStepInPFlow_10_6_expressionBBBBBB(this, match, gwStep, flow, step, useCase);
			return LastStepInPFlowImpl.pattern_LastStepInPFlow_10_7_expressionF();
		} else {
			return LastStepInPFlowImpl.pattern_LastStepInPFlow_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl
				.pattern_LastStepInPFlow_11_1_bindingAndBlackFFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ParallelStep gwStep = (ParallelStep) result1_bindingAndBlack[0];
		ParallelFlow flow = (ParallelFlow) result1_bindingAndBlack[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[2];
		Gateway gw = (Gateway) result1_bindingAndBlack[3];
		Gateway gcw = (Gateway) result1_bindingAndBlack[4];
		FlowNode node = (FlowNode) result1_bindingAndBlack[5];
		Step step = (Step) result1_bindingAndBlack[6];
		FN2S n2s = (FN2S) result1_bindingAndBlack[7];
		GW2S gw2gs = (GW2S) result1_bindingAndBlack[8];
		UseCase useCase = (UseCase) result1_bindingAndBlack[9];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[10];
		// CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_11_1_greenBBBF(process, gcw, node);
		SequenceFlow sf = (SequenceFlow) result1_green[3];

		// collect translated elements
		Object[] result2_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_11_2_blackB(sf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ".");
		}
		Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_11_2_greenFB(sf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_11_3_blackBBBBBBBBBBBBB(ruleresult, gwStep,
				flow, process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", "
					+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = "
					+ node + ", " + "[sf] = " + sf + ", " + "[step] = " + step + ", " + "[n2s] = " + n2s + ", "
					+ "[gw2gs] = " + gw2gs + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ".");
		}
		LastStepInPFlowImpl.pattern_LastStepInPFlow_11_3_greenBBBBBBBFFFFFF(ruleresult, flow, process, gcw, node, sf,
				step);
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result3_green[9];
				// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step______last = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		LastStepInPFlowImpl.pattern_LastStepInPFlow_11_5_expressionBBBBBBBBBBBBBB(this, ruleresult, gwStep, flow,
				process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc);
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LastStepInPFlowImpl.pattern_LastStepInPFlow_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ParallelStep gwStep = (ParallelStep) result2_binding[0];
		ParallelFlow flow = (ParallelFlow) result2_binding[1];
		Step step = (Step) result2_binding[2];
		UseCase useCase = (UseCase) result2_binding[3];
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_12_2_blackBBFFFBFFBFB(gwStep, flow,
				step, useCase, match)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Gateway gw = (Gateway) result2_black[3];
			FlowNode node = (FlowNode) result2_black[4];
			FN2S n2s = (FN2S) result2_black[6];
			GW2S gw2gs = (GW2S) result2_black[7];
			P2UC p2uc = (P2UC) result2_black[9];
			// ForEach find context
			for (Object[] result3_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_12_3_blackBBBBFBBBBBB(gwStep,
					flow, process, gw, node, step, n2s, gw2gs, useCase, p2uc)) {
				Gateway gcw = (Gateway) result3_black[4];
				Object[] result3_green = LastStepInPFlowImpl
						.pattern_LastStepInPFlow_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(gwStep, flow, process, gw, gcw,
								node, step, n2s, gw2gs, useCase, p2uc);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge gwStep__flow____invokedFlows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flow__step______last = (EMoflonEdge) result3_green[18];
				// EMoflonEdge n2s__node____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge n2s__step____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge gw2gs__gw____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge gw2gs__gwStep____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[23];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = LastStepInPFlowImpl
						.pattern_LastStepInPFlow_12_4_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch, gwStep,
								flow, process, gw, gcw, node, step, n2s, gw2gs, useCase, p2uc);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", " + "[process] = " + process
							+ ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", "
							+ "[step] = " + step + ", " + "[n2s] = " + n2s + ", " + "[gw2gs] = " + gw2gs + ", "
							+ "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LastStepInPFlowImpl.pattern_LastStepInPFlow_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LastStepInPFlowImpl.pattern_LastStepInPFlow_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ParallelStep gwStep, ParallelFlow flow, Step step,
			UseCase useCase) {
		match.registerObject("gwStep", gwStep);
		match.registerObject("flow", flow);
		match.registerObject("step", step);
		match.registerObject("useCase", useCase);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ParallelStep gwStep, ParallelFlow flow, Step step,
			UseCase useCase) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs,
			UseCase useCase, P2UC p2uc) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("gwStep", gwStep);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("gw", gw);
		isApplicableMatch.registerObject("gcw", gcw);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("n2s", n2s);
		isApplicableMatch.registerObject("gw2gs", gw2gs);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject gwStep, EObject flow, EObject process,
			EObject gw, EObject gcw, EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs,
			EObject useCase, EObject p2uc) {
		ruleresult.registerObject("gwStep", gwStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("gw", gw);
		ruleresult.registerObject("gcw", gcw);
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("sf", sf);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("n2s", n2s);
		ruleresult.registerObject("gw2gs", gw2gs);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_55(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInPFlowImpl
				.pattern_LastStepInPFlow_20_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInPFlowImpl.pattern_LastStepInPFlow_20_3_expressionFBBBBBBB(this, match, process, gw, gcw, node,
					sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInPFlowImpl.pattern_LastStepInPFlow_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInPFlowImpl.pattern_LastStepInPFlow_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_56(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_21_2_blackFFFFFB(_edge_sourceRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInPFlowImpl.pattern_LastStepInPFlow_21_3_expressionFBBBBBBB(this, match, process, gw, gcw, node,
					sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInPFlowImpl.pattern_LastStepInPFlow_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInPFlowImpl.pattern_LastStepInPFlow_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_57(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_22_2_blackFFFFFB(_edge_outgoing)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInPFlowImpl.pattern_LastStepInPFlow_22_3_expressionFBBBBBBB(this, match, process, gw, gcw, node,
					sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInPFlowImpl.pattern_LastStepInPFlow_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInPFlowImpl.pattern_LastStepInPFlow_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_58(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_23_2_blackFFFFFB(_edge_targetRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInPFlowImpl.pattern_LastStepInPFlow_23_3_expressionFBBBBBBB(this, match, process, gw, gcw, node,
					sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInPFlowImpl.pattern_LastStepInPFlow_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInPFlowImpl.pattern_LastStepInPFlow_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_59(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_24_2_blackFFFFFB(_edge_incoming)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInPFlowImpl.pattern_LastStepInPFlow_24_3_expressionFBBBBBBB(this, match, process, gw, gcw, node,
					sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInPFlowImpl.pattern_LastStepInPFlow_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInPFlowImpl.pattern_LastStepInPFlow_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_17(EMoflonEdge _edge___last) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_25_2_blackFFFFB(_edge___last)) {
			ParallelStep gwStep = (ParallelStep) result2_black[0];
			ParallelFlow flow = (ParallelFlow) result2_black[1];
			Step step = (Step) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInPFlowImpl.pattern_LastStepInPFlow_25_3_expressionFBBBBBB(this, match, gwStep, flow, step,
					useCase)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInPFlowImpl.pattern_LastStepInPFlow_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInPFlowImpl.pattern_LastStepInPFlow_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LastStepInPFlow");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForGwStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gwStep")).findAny();
		SimpleUseCase.ParallelStep gwStep = (SimpleUseCase.ParallelStep) matchForGwStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.ParallelFlow flow = (SimpleUseCase.ParallelFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw")).findAny();
		SimpleBPMN.Gateway gw = (SimpleBPMN.Gateway) matchForGw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGcw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gcw")).findAny();
		SimpleBPMN.Gateway gcw = (SimpleBPMN.Gateway) matchForGcw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.FlowNode node = (SimpleBPMN.FlowNode) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf")).findAny();
		SimpleBPMN.SequenceFlow sf = (SimpleBPMN.SequenceFlow) matchForSf.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.Step step = (SimpleUseCase.Step) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForN2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("n2s")).findAny();
		bpmn2UseCase.FN2S n2s = (bpmn2UseCase.FN2S) matchForN2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGw2gs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw2gs")).findAny();
		bpmn2UseCase.GW2S gw2gs = (bpmn2UseCase.GW2S) matchForGw2gs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		bpmn2UseCase.P2UC p2uc = (bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		if (!(gw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(gw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(gcw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(gcw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
		ruleResult.setRule("LastStepInPFlow");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForGwStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gwStep")).findAny();
		SimpleUseCase.ParallelStep gwStep = (SimpleUseCase.ParallelStep) matchForGwStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.ParallelFlow flow = (SimpleUseCase.ParallelFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw")).findAny();
		SimpleBPMN.Gateway gw = (SimpleBPMN.Gateway) matchForGw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGcw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gcw")).findAny();
		SimpleBPMN.Gateway gcw = (SimpleBPMN.Gateway) matchForGcw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.FlowNode node = (SimpleBPMN.FlowNode) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf")).findAny();
		SimpleBPMN.SequenceFlow sf = (SimpleBPMN.SequenceFlow) matchForSf.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.Step step = (SimpleUseCase.Step) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForN2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("n2s")).findAny();
		bpmn2UseCase.FN2S n2s = (bpmn2UseCase.FN2S) matchForN2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGw2gs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw2gs")).findAny();
		bpmn2UseCase.GW2S gw2gs = (bpmn2UseCase.GW2S) matchForGw2gs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		bpmn2UseCase.P2UC p2uc = (bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		if (!(gw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(gw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(gcw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(gcw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(Gateway) arguments.get(2), (Gateway) arguments.get(3), (FlowNode) arguments.get(4),
					(SequenceFlow) arguments.get(5));
		case RulesPackage.LAST_STEP_IN_PFLOW___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(Gateway) arguments.get(2), (Gateway) arguments.get(3), (FlowNode) arguments.get(4),
					(SequenceFlow) arguments.get(5));
			return null;
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(Gateway) arguments.get(2), (Gateway) arguments.get(3), (FlowNode) arguments.get(4),
					(SequenceFlow) arguments.get(5));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S_USECASE_P2UC:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (Gateway) arguments.get(4),
					(Gateway) arguments.get(5), (FlowNode) arguments.get(6), (SequenceFlow) arguments.get(7),
					(Step) arguments.get(8), (FN2S) arguments.get(9), (GW2S) arguments.get(10),
					(UseCase) arguments.get(11), (P2UC) arguments.get(12));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.LAST_STEP_IN_PFLOW___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP_USECASE:
			return isAppropriate_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (Step) arguments.get(3), (UseCase) arguments.get(4));
		case RulesPackage.LAST_STEP_IN_PFLOW___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP_USECASE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (Step) arguments.get(3), (UseCase) arguments.get(4));
			return null;
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP_USECASE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (Step) arguments.get(3), (UseCase) arguments.get(4));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S_USECASE_P2UC:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (Gateway) arguments.get(4),
					(Gateway) arguments.get(5), (FlowNode) arguments.get(6), (Step) arguments.get(7),
					(FN2S) arguments.get(8), (GW2S) arguments.get(9), (UseCase) arguments.get(10),
					(P2UC) arguments.get(11));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.LAST_STEP_IN_PFLOW___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_55__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_55((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_56__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_56((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_57__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_57((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_58__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_58((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_59__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_59((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_17((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LastStepInPFlow_0_1_blackBBBBBBB(LastStepInPFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					return new Object[] { _this, match, process, gw, gcw, node, sf };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_0_2_bindingFBBBBBBB(LastStepInPFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, gw, gcw, node, sf);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, gw, gcw, node, sf };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInPFlow_0_2_bindingAndBlackFBBBBBBB(LastStepInPFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		Object[] result_pattern_LastStepInPFlow_0_2_binding = pattern_LastStepInPFlow_0_2_bindingFBBBBBBB(_this, match,
				process, gw, gcw, node, sf);
		if (result_pattern_LastStepInPFlow_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInPFlow_0_2_binding[0];

			Object[] result_pattern_LastStepInPFlow_0_2_black = pattern_LastStepInPFlow_0_2_blackB(csp);
			if (result_pattern_LastStepInPFlow_0_2_black != null) {

				return new Object[] { csp, _this, match, process, gw, gcw, node, sf };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInPFlow_0_3_expressionFBB(LastStepInPFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_0_4_blackBBBBBB(Match match, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					return new Object[] { match, process, gw, gcw, node, sf };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_0_4_greenBBBBBFFFFF(Match match, SimpleBPMN.Process process,
			Gateway gcw, FlowNode node, SequenceFlow sf) {
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf);
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__node____sourceRef_name_prime = "sourceRef";
		String node__sf____outgoing_name_prime = "outgoing";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		match.getToBeTranslatedEdges().add(process__sf____flowElements);
		sf__node____sourceRef.setSrc(sf);
		sf__node____sourceRef.setTrg(node);
		match.getToBeTranslatedEdges().add(sf__node____sourceRef);
		node__sf____outgoing.setSrc(node);
		node__sf____outgoing.setTrg(sf);
		match.getToBeTranslatedEdges().add(node__sf____outgoing);
		sf__gcw____targetRef.setSrc(sf);
		sf__gcw____targetRef.setTrg(gcw);
		match.getToBeTranslatedEdges().add(sf__gcw____targetRef);
		gcw__sf____incoming.setSrc(gcw);
		gcw__sf____incoming.setTrg(sf);
		match.getToBeTranslatedEdges().add(gcw__sf____incoming);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__node____sourceRef.setName(sf__node____sourceRef_name_prime);
		node__sf____outgoing.setName(node__sf____outgoing_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		return new Object[] { match, process, gcw, node, sf, process__sf____flowElements, sf__node____sourceRef,
				node__sf____outgoing, sf__gcw____targetRef, gcw__sf____incoming };
	}

	public static final Object[] pattern_LastStepInPFlow_0_5_blackBBBBBB(Match match, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					return new Object[] { match, process, gw, gcw, node, sf };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_0_5_greenBBBBBFFFF(Match match, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node) {
		EMoflonEdge process__gw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gcw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__gcw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(gw);
		match.getContextNodes().add(gcw);
		match.getContextNodes().add(node);
		String process__gw____flowElements_name_prime = "flowElements";
		String process__gcw____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String gw__gcw______conv_name_prime = "__conv";
		process__gw____flowElements.setSrc(process);
		process__gw____flowElements.setTrg(gw);
		match.getContextEdges().add(process__gw____flowElements);
		process__gcw____flowElements.setSrc(process);
		process__gcw____flowElements.setTrg(gcw);
		match.getContextEdges().add(process__gcw____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		match.getContextEdges().add(process__node____flowElements);
		gw__gcw______conv.setSrc(gw);
		gw__gcw______conv.setTrg(gcw);
		match.getContextEdges().add(gw__gcw______conv);
		process__gw____flowElements.setName(process__gw____flowElements_name_prime);
		process__gcw____flowElements.setName(process__gcw____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		gw__gcw______conv.setName(gw__gcw______conv_name_prime);
		return new Object[] { match, process, gw, gcw, node, process__gw____flowElements, process__gcw____flowElements,
				process__node____flowElements, gw__gcw______conv };
	}

	public static final void pattern_LastStepInPFlow_0_6_expressionBBBBBBB(LastStepInPFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		_this.registerObjectsToMatch_FWD(match, process, gw, gcw, node, sf);

	}

	public static final boolean pattern_LastStepInPFlow_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LastStepInPFlow_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_1_1_bindingFFFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("gw");
		EObject _localVariable_4 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_5 = isApplicableMatch.getObject("node");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf");
		EObject _localVariable_7 = isApplicableMatch.getObject("step");
		EObject _localVariable_8 = isApplicableMatch.getObject("n2s");
		EObject _localVariable_9 = isApplicableMatch.getObject("gw2gs");
		EObject _localVariable_10 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_11 = isApplicableMatch.getObject("p2uc");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpGw = _localVariable_3;
		EObject tmpGcw = _localVariable_4;
		EObject tmpNode = _localVariable_5;
		EObject tmpSf = _localVariable_6;
		EObject tmpStep = _localVariable_7;
		EObject tmpN2s = _localVariable_8;
		EObject tmpGw2gs = _localVariable_9;
		EObject tmpUseCase = _localVariable_10;
		EObject tmpP2uc = _localVariable_11;
		if (tmpGwStep instanceof ParallelStep) {
			ParallelStep gwStep = (ParallelStep) tmpGwStep;
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpGw instanceof Gateway) {
						Gateway gw = (Gateway) tmpGw;
						if (tmpGcw instanceof Gateway) {
							Gateway gcw = (Gateway) tmpGcw;
							if (tmpNode instanceof FlowNode) {
								FlowNode node = (FlowNode) tmpNode;
								if (tmpSf instanceof SequenceFlow) {
									SequenceFlow sf = (SequenceFlow) tmpSf;
									if (tmpStep instanceof Step) {
										Step step = (Step) tmpStep;
										if (tmpN2s instanceof FN2S) {
											FN2S n2s = (FN2S) tmpN2s;
											if (tmpGw2gs instanceof GW2S) {
												GW2S gw2gs = (GW2S) tmpGw2gs;
												if (tmpUseCase instanceof UseCase) {
													UseCase useCase = (UseCase) tmpUseCase;
													if (tmpP2uc instanceof P2UC) {
														P2UC p2uc = (P2UC) tmpP2uc;
														return new Object[] { gwStep, flow, process, gw, gcw, node, sf,
																step, n2s, gw2gs, useCase, p2uc, isApplicableMatch };
													}
												}
											}
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

	public static final Object[] pattern_LastStepInPFlow_1_1_blackBBBBBBBBBBBBBFB(ParallelStep gwStep,
			ParallelFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf,
			Step step, FN2S n2s, GW2S gw2gs, UseCase useCase, P2UC p2uc, LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs,
										useCase, p2uc, _this, csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_1_1_bindingAndBlackFFFFFFFFFFFFBFB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LastStepInPFlow_1_1_binding = pattern_LastStepInPFlow_1_1_bindingFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LastStepInPFlow_1_1_binding != null) {
			ParallelStep gwStep = (ParallelStep) result_pattern_LastStepInPFlow_1_1_binding[0];
			ParallelFlow flow = (ParallelFlow) result_pattern_LastStepInPFlow_1_1_binding[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_LastStepInPFlow_1_1_binding[2];
			Gateway gw = (Gateway) result_pattern_LastStepInPFlow_1_1_binding[3];
			Gateway gcw = (Gateway) result_pattern_LastStepInPFlow_1_1_binding[4];
			FlowNode node = (FlowNode) result_pattern_LastStepInPFlow_1_1_binding[5];
			SequenceFlow sf = (SequenceFlow) result_pattern_LastStepInPFlow_1_1_binding[6];
			Step step = (Step) result_pattern_LastStepInPFlow_1_1_binding[7];
			FN2S n2s = (FN2S) result_pattern_LastStepInPFlow_1_1_binding[8];
			GW2S gw2gs = (GW2S) result_pattern_LastStepInPFlow_1_1_binding[9];
			UseCase useCase = (UseCase) result_pattern_LastStepInPFlow_1_1_binding[10];
			P2UC p2uc = (P2UC) result_pattern_LastStepInPFlow_1_1_binding[11];

			Object[] result_pattern_LastStepInPFlow_1_1_black = pattern_LastStepInPFlow_1_1_blackBBBBBBBBBBBBBFB(gwStep,
					flow, process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc, _this, isApplicableMatch);
			if (result_pattern_LastStepInPFlow_1_1_black != null) {
				CSP csp = (CSP) result_pattern_LastStepInPFlow_1_1_black[13];

				return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc, _this,
						csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_1_1_greenBB(ParallelFlow flow, Step step) {
		flow.set__last(step);
		return new Object[] { flow, step };
	}

	public static final Object[] pattern_LastStepInPFlow_1_2_blackB(SequenceFlow sf) {
		return new Object[] { sf };
	}

	public static final Object[] pattern_LastStepInPFlow_1_2_greenFB(SequenceFlow sf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf);
		return new Object[] { ruleresult, sf };
	}

	public static final Object[] pattern_LastStepInPFlow_1_3_blackBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw, EObject node, EObject sf,
			EObject step, EObject n2s, EObject gw2gs, EObject useCase, EObject p2uc) {
		if (!gwStep.equals(process)) {
			if (!gwStep.equals(node)) {
				if (!gwStep.equals(sf)) {
					if (!gwStep.equals(step)) {
						if (!gwStep.equals(n2s)) {
							if (!gwStep.equals(useCase)) {
								if (!gwStep.equals(p2uc)) {
									if (!flow.equals(gwStep)) {
										if (!flow.equals(process)) {
											if (!flow.equals(gw)) {
												if (!flow.equals(gcw)) {
													if (!flow.equals(node)) {
														if (!flow.equals(sf)) {
															if (!flow.equals(step)) {
																if (!flow.equals(n2s)) {
																	if (!flow.equals(gw2gs)) {
																		if (!flow.equals(useCase)) {
																			if (!flow.equals(p2uc)) {
																				if (!process.equals(sf)) {
																					if (!process.equals(step)) {
																						if (!process.equals(useCase)) {
																							if (!gw.equals(gwStep)) {
																								if (!gw.equals(
																										process)) {
																									if (!gw.equals(
																											node)) {
																										if (!gw.equals(
																												sf)) {
																											if (!gw.equals(
																													step)) {
																												if (!gw.equals(
																														n2s)) {
																													if (!gw.equals(
																															gw2gs)) {
																														if (!gw.equals(
																																useCase)) {
																															if (!gw.equals(
																																	p2uc)) {
																																if (!gcw.equals(
																																		gwStep)) {
																																	if (!gcw.equals(
																																			process)) {
																																		if (!gcw.equals(
																																				gw)) {
																																			if (!gcw.equals(
																																					node)) {
																																				if (!gcw.equals(
																																						sf)) {
																																					if (!gcw.equals(
																																							step)) {
																																						if (!gcw.equals(
																																								n2s)) {
																																							if (!gcw.equals(
																																									gw2gs)) {
																																								if (!gcw.equals(
																																										useCase)) {
																																									if (!gcw.equals(
																																											p2uc)) {
																																										if (!node
																																												.equals(process)) {
																																											if (!node
																																													.equals(sf)) {
																																												if (!node
																																														.equals(step)) {
																																													if (!node
																																															.equals(useCase)) {
																																														if (!node
																																																.equals(p2uc)) {
																																															if (!sf.equals(
																																																	step)) {
																																																if (!sf.equals(
																																																		useCase)) {
																																																	if (!step
																																																			.equals(useCase)) {
																																																		if (!n2s.equals(
																																																				process)) {
																																																			if (!n2s.equals(
																																																					node)) {
																																																				if (!n2s.equals(
																																																						sf)) {
																																																					if (!n2s.equals(
																																																							step)) {
																																																						if (!n2s.equals(
																																																								useCase)) {
																																																							if (!n2s.equals(
																																																									p2uc)) {
																																																								if (!gw2gs
																																																										.equals(gwStep)) {
																																																									if (!gw2gs
																																																											.equals(process)) {
																																																										if (!gw2gs
																																																												.equals(node)) {
																																																											if (!gw2gs
																																																													.equals(sf)) {
																																																												if (!gw2gs
																																																														.equals(step)) {
																																																													if (!gw2gs
																																																															.equals(n2s)) {
																																																														if (!gw2gs
																																																																.equals(useCase)) {
																																																															if (!gw2gs
																																																																	.equals(p2uc)) {
																																																																if (!p2uc
																																																																		.equals(process)) {
																																																																	if (!p2uc
																																																																			.equals(sf)) {
																																																																		if (!p2uc
																																																																				.equals(step)) {
																																																																			if (!p2uc
																																																																					.equals(useCase)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						gwStep,
																																																																						flow,
																																																																						process,
																																																																						gw,
																																																																						gcw,
																																																																						node,
																																																																						sf,
																																																																						step,
																																																																						n2s,
																																																																						gw2gs,
																																																																						useCase,
																																																																						p2uc };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LastStepInPFlow_1_3_greenBBBBBBBFFFFFF(PerformRuleResult ruleresult,
			EObject flow, EObject process, EObject gcw, EObject node, EObject sf, EObject step) {
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LastStepInPFlow";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__node____sourceRef_name_prime = "sourceRef";
		String node__sf____outgoing_name_prime = "outgoing";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		String flow__step______last_name_prime = "__last";
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		ruleresult.getTranslatedEdges().add(process__sf____flowElements);
		sf__node____sourceRef.setSrc(sf);
		sf__node____sourceRef.setTrg(node);
		ruleresult.getTranslatedEdges().add(sf__node____sourceRef);
		node__sf____outgoing.setSrc(node);
		node__sf____outgoing.setTrg(sf);
		ruleresult.getTranslatedEdges().add(node__sf____outgoing);
		sf__gcw____targetRef.setSrc(sf);
		sf__gcw____targetRef.setTrg(gcw);
		ruleresult.getTranslatedEdges().add(sf__gcw____targetRef);
		gcw__sf____incoming.setSrc(gcw);
		gcw__sf____incoming.setTrg(sf);
		ruleresult.getTranslatedEdges().add(gcw__sf____incoming);
		flow__step______last.setSrc(flow);
		flow__step______last.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step______last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__node____sourceRef.setName(sf__node____sourceRef_name_prime);
		node__sf____outgoing.setName(node__sf____outgoing_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		flow__step______last.setName(flow__step______last_name_prime);
		return new Object[] { ruleresult, flow, process, gcw, node, sf, step, process__sf____flowElements,
				sf__node____sourceRef, node__sf____outgoing, sf__gcw____targetRef, gcw__sf____incoming,
				flow__step______last };
	}

	public static final void pattern_LastStepInPFlow_1_5_expressionBBBBBBBBBBBBBB(LastStepInPFlow _this,
			PerformRuleResult ruleresult, EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw,
			EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs, EObject useCase, EObject p2uc) {
		_this.registerObjects_FWD(ruleresult, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, useCase,
				p2uc);

	}

	public static final PerformRuleResult pattern_LastStepInPFlow_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_2_1_bindingFB(LastStepInPFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_2_1_blackFBB(EClass eClass, LastStepInPFlow _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_2_1_bindingAndBlackFFB(LastStepInPFlow _this) {
		Object[] result_pattern_LastStepInPFlow_2_1_binding = pattern_LastStepInPFlow_2_1_bindingFB(_this);
		if (result_pattern_LastStepInPFlow_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_LastStepInPFlow_2_1_binding[0];

			Object[] result_pattern_LastStepInPFlow_2_1_black = pattern_LastStepInPFlow_2_1_blackFBB(eClass, _this);
			if (result_pattern_LastStepInPFlow_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LastStepInPFlow_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LastStepInPFlow";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LastStepInPFlow_2_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("gw");
		EObject _localVariable_2 = match.getObject("gcw");
		EObject _localVariable_3 = match.getObject("node");
		EObject _localVariable_4 = match.getObject("sf");
		EObject tmpProcess = _localVariable_0;
		EObject tmpGw = _localVariable_1;
		EObject tmpGcw = _localVariable_2;
		EObject tmpNode = _localVariable_3;
		EObject tmpSf = _localVariable_4;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpGw instanceof Gateway) {
				Gateway gw = (Gateway) tmpGw;
				if (tmpGcw instanceof Gateway) {
					Gateway gcw = (Gateway) tmpGcw;
					if (tmpNode instanceof FlowNode) {
						FlowNode node = (FlowNode) tmpNode;
						if (tmpSf instanceof SequenceFlow) {
							SequenceFlow sf = (SequenceFlow) tmpSf;
							return new Object[] { process, gw, gcw, node, sf, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_2_2_blackFBBBBBFFFFFB(SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					boolean gwisDiverging = gw.isIsDiverging();
					if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
						if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
							boolean gcwisDiverging = gcw.isIsDiverging();
							if (Boolean.valueOf(gcwisDiverging).equals(false)) {
								if (Boolean.valueOf(gcwisDiverging).equals(false)) {
									for (FN2S n2s : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(node, FN2S.class, "source")) {
										Step step = n2s.getTarget();
										if (step != null) {
											for (GW2S gw2gs : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(gw, GW2S.class, "source")) {
												Step tmpGwStep = gw2gs.getTarget();
												if (tmpGwStep instanceof ParallelStep) {
													ParallelStep gwStep = (ParallelStep) tmpGwStep;
													if (!gwStep.equals(step)) {
														for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(process, P2UC.class,
																		"source")) {
															UseCase useCase = p2uc.getTarget();
															if (useCase != null) {
																_result.add(new Object[] { gwStep, process, gw, gcw,
																		node, sf, step, n2s, gw2gs, useCase, p2uc,
																		match });
															}

														}
													}
												}

											}
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

	public static final Iterable<Object[]> pattern_LastStepInPFlow_2_3_blackBFBBBBBBBBBB(ParallelStep gwStep,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs, UseCase useCase, P2UC p2uc) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						if (process.getFlowElements().contains(gw)) {
							if (process.getFlowElements().contains(gcw)) {
								if (process.getFlowElements().contains(node)) {
									if (process.getFlowElements().contains(sf)) {
										if (gcw.equals(gw.get__conv())) {
											if (node.equals(sf.getSourceRef())) {
												if (gcw.equals(sf.getTargetRef())) {
													if (node.equals(n2s.getSource())) {
														if (step.equals(n2s.getTarget())) {
															if (gw.equals(gw2gs.getSource())) {
																if (gwStep.equals(gw2gs.getTarget())) {
																	if (process.equals(p2uc.getSource())) {
																		if (useCase.equals(p2uc.getTarget())) {
																			boolean gwisDiverging = gw.isIsDiverging();
																			if (Boolean.valueOf(gwisDiverging)
																					.equals(Boolean.valueOf(true))) {
																				if (Boolean.valueOf(gwisDiverging)
																						.equals(Boolean
																								.valueOf(true))) {
																					boolean gcwisDiverging = gcw
																							.isIsDiverging();
																					if (Boolean.valueOf(gcwisDiverging)
																							.equals(false)) {
																						if (Boolean
																								.valueOf(gcwisDiverging)
																								.equals(false)) {
																							for (ParallelFlow flow : gwStep
																									.getInvokedFlows()) {
																								if (flow.getSteps()
																										.contains(
																												step)) {
																									if (useCase
																											.getFlows()
																											.contains(
																													flow)) {
																										_result.add(
																												new Object[] {
																														gwStep,
																														flow,
																														process,
																														gw,
																														gcw,
																														node,
																														sf,
																														step,
																														n2s,
																														gw2gs,
																														useCase,
																														p2uc });
																									}
																								}
																							}
																						}
																					}

																				}
																			}

																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LastStepInPFlow_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ParallelStep gwStep,
			ParallelFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf,
			Step step, FN2S n2s, GW2S gw2gs, UseCase useCase, P2UC p2uc) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge gwStep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gcw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__gcw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2s__node____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gwStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String gwStep__flow____invokedFlows_name_prime = "invokedFlows";
		String process__gw____flowElements_name_prime = "flowElements";
		String process__gcw____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String process__sf____flowElements_name_prime = "flowElements";
		String gw__gcw______conv_name_prime = "__conv";
		String sf__node____sourceRef_name_prime = "sourceRef";
		String node__sf____outgoing_name_prime = "outgoing";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		String flow__step____steps_name_prime = "steps";
		String n2s__node____source_name_prime = "source";
		String n2s__step____target_name_prime = "target";
		String gw2gs__gw____source_name_prime = "source";
		String gw2gs__gwStep____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(sf);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(n2s);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		gwStep__flow____invokedFlows.setSrc(gwStep);
		gwStep__flow____invokedFlows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(gwStep__flow____invokedFlows);
		process__gw____flowElements.setSrc(process);
		process__gw____flowElements.setTrg(gw);
		isApplicableMatch.getAllContextElements().add(process__gw____flowElements);
		process__gcw____flowElements.setSrc(process);
		process__gcw____flowElements.setTrg(gcw);
		isApplicableMatch.getAllContextElements().add(process__gcw____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(process__node____flowElements);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(process__sf____flowElements);
		gw__gcw______conv.setSrc(gw);
		gw__gcw______conv.setTrg(gcw);
		isApplicableMatch.getAllContextElements().add(gw__gcw______conv);
		sf__node____sourceRef.setSrc(sf);
		sf__node____sourceRef.setTrg(node);
		isApplicableMatch.getAllContextElements().add(sf__node____sourceRef);
		node__sf____outgoing.setSrc(node);
		node__sf____outgoing.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(node__sf____outgoing);
		sf__gcw____targetRef.setSrc(sf);
		sf__gcw____targetRef.setTrg(gcw);
		isApplicableMatch.getAllContextElements().add(sf__gcw____targetRef);
		gcw__sf____incoming.setSrc(gcw);
		gcw__sf____incoming.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(gcw__sf____incoming);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		n2s__node____source.setSrc(n2s);
		n2s__node____source.setTrg(node);
		isApplicableMatch.getAllContextElements().add(n2s__node____source);
		n2s__step____target.setSrc(n2s);
		n2s__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(n2s__step____target);
		gw2gs__gw____source.setSrc(gw2gs);
		gw2gs__gw____source.setTrg(gw);
		isApplicableMatch.getAllContextElements().add(gw2gs__gw____source);
		gw2gs__gwStep____target.setSrc(gw2gs);
		gw2gs__gwStep____target.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(gw2gs__gwStep____target);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		gwStep__flow____invokedFlows.setName(gwStep__flow____invokedFlows_name_prime);
		process__gw____flowElements.setName(process__gw____flowElements_name_prime);
		process__gcw____flowElements.setName(process__gcw____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		gw__gcw______conv.setName(gw__gcw______conv_name_prime);
		sf__node____sourceRef.setName(sf__node____sourceRef_name_prime);
		node__sf____outgoing.setName(node__sf____outgoing_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		n2s__node____source.setName(n2s__node____source_name_prime);
		n2s__step____target.setName(n2s__step____target_name_prime);
		gw2gs__gw____source.setName(gw2gs__gw____source_name_prime);
		gw2gs__gwStep____target.setName(gw2gs__gwStep____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc,
				isApplicableMatch, gwStep__flow____invokedFlows, process__gw____flowElements,
				process__gcw____flowElements, process__node____flowElements, process__sf____flowElements,
				gw__gcw______conv, sf__node____sourceRef, node__sf____outgoing, sf__gcw____targetRef,
				gcw__sf____incoming, flow__step____steps, n2s__node____source, n2s__step____target, gw2gs__gw____source,
				gw2gs__gwStep____target, useCase__flow____flows, p2uc__process____source, p2uc__useCase____target };
	}

	public static final Object[] pattern_LastStepInPFlow_2_4_bindingFBBBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs, UseCase useCase,
			P2UC p2uc) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, gwStep, flow, process, gw, gcw, node,
				sf, step, n2s, gw2gs, useCase, p2uc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, sf, step, n2s,
					gw2gs, useCase, p2uc };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInPFlow_2_4_bindingAndBlackFBBBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs, UseCase useCase,
			P2UC p2uc) {
		Object[] result_pattern_LastStepInPFlow_2_4_binding = pattern_LastStepInPFlow_2_4_bindingFBBBBBBBBBBBBBB(_this,
				isApplicableMatch, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, useCase, p2uc);
		if (result_pattern_LastStepInPFlow_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInPFlow_2_4_binding[0];

			Object[] result_pattern_LastStepInPFlow_2_4_black = pattern_LastStepInPFlow_2_4_blackB(csp);
			if (result_pattern_LastStepInPFlow_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, sf, step,
						n2s, gw2gs, useCase, p2uc };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInPFlow_2_5_expressionFBB(LastStepInPFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LastStepInPFlow_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LastStepInPFlow";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LastStepInPFlow_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_10_1_blackBBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step, UseCase useCase) {
		if (!gwStep.equals(step)) {
			return new Object[] { _this, match, gwStep, flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_10_2_bindingFBBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step, UseCase useCase) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, gwStep, flow, step, useCase);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, gwStep, flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInPFlow_10_2_bindingAndBlackFBBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step, UseCase useCase) {
		Object[] result_pattern_LastStepInPFlow_10_2_binding = pattern_LastStepInPFlow_10_2_bindingFBBBBBB(_this, match,
				gwStep, flow, step, useCase);
		if (result_pattern_LastStepInPFlow_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInPFlow_10_2_binding[0];

			Object[] result_pattern_LastStepInPFlow_10_2_black = pattern_LastStepInPFlow_10_2_blackB(csp);
			if (result_pattern_LastStepInPFlow_10_2_black != null) {

				return new Object[] { csp, _this, match, gwStep, flow, step, useCase };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInPFlow_10_3_expressionFBB(LastStepInPFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_10_4_blackBBBBB(Match match, ParallelStep gwStep,
			ParallelFlow flow, Step step, UseCase useCase) {
		if (!gwStep.equals(step)) {
			return new Object[] { match, gwStep, flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_10_4_greenBBBF(Match match, ParallelFlow flow, Step step) {
		EMoflonEdge flow__step______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String flow__step______last_name_prime = "__last";
		flow__step______last.setSrc(flow);
		flow__step______last.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step______last);
		flow__step______last.setName(flow__step______last_name_prime);
		return new Object[] { match, flow, step, flow__step______last };
	}

	public static final Object[] pattern_LastStepInPFlow_10_5_blackBBBBB(Match match, ParallelStep gwStep,
			ParallelFlow flow, Step step, UseCase useCase) {
		if (!gwStep.equals(step)) {
			return new Object[] { match, gwStep, flow, step, useCase };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_10_5_greenBBBBBFFF(Match match, ParallelStep gwStep,
			ParallelFlow flow, Step step, UseCase useCase) {
		EMoflonEdge gwStep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(gwStep);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(step);
		match.getContextNodes().add(useCase);
		String gwStep__flow____invokedFlows_name_prime = "invokedFlows";
		String flow__step____steps_name_prime = "steps";
		String useCase__flow____flows_name_prime = "flows";
		gwStep__flow____invokedFlows.setSrc(gwStep);
		gwStep__flow____invokedFlows.setTrg(flow);
		match.getContextEdges().add(gwStep__flow____invokedFlows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getContextEdges().add(flow__step____steps);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		gwStep__flow____invokedFlows.setName(gwStep__flow____invokedFlows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		return new Object[] { match, gwStep, flow, step, useCase, gwStep__flow____invokedFlows, flow__step____steps,
				useCase__flow____flows };
	}

	public static final void pattern_LastStepInPFlow_10_6_expressionBBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step, UseCase useCase) {
		_this.registerObjectsToMatch_BWD(match, gwStep, flow, step, useCase);

	}

	public static final boolean pattern_LastStepInPFlow_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LastStepInPFlow_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_11_1_bindingFFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("gw");
		EObject _localVariable_4 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_5 = isApplicableMatch.getObject("node");
		EObject _localVariable_6 = isApplicableMatch.getObject("step");
		EObject _localVariable_7 = isApplicableMatch.getObject("n2s");
		EObject _localVariable_8 = isApplicableMatch.getObject("gw2gs");
		EObject _localVariable_9 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_10 = isApplicableMatch.getObject("p2uc");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpGw = _localVariable_3;
		EObject tmpGcw = _localVariable_4;
		EObject tmpNode = _localVariable_5;
		EObject tmpStep = _localVariable_6;
		EObject tmpN2s = _localVariable_7;
		EObject tmpGw2gs = _localVariable_8;
		EObject tmpUseCase = _localVariable_9;
		EObject tmpP2uc = _localVariable_10;
		if (tmpGwStep instanceof ParallelStep) {
			ParallelStep gwStep = (ParallelStep) tmpGwStep;
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpGw instanceof Gateway) {
						Gateway gw = (Gateway) tmpGw;
						if (tmpGcw instanceof Gateway) {
							Gateway gcw = (Gateway) tmpGcw;
							if (tmpNode instanceof FlowNode) {
								FlowNode node = (FlowNode) tmpNode;
								if (tmpStep instanceof Step) {
									Step step = (Step) tmpStep;
									if (tmpN2s instanceof FN2S) {
										FN2S n2s = (FN2S) tmpN2s;
										if (tmpGw2gs instanceof GW2S) {
											GW2S gw2gs = (GW2S) tmpGw2gs;
											if (tmpUseCase instanceof UseCase) {
												UseCase useCase = (UseCase) tmpUseCase;
												if (tmpP2uc instanceof P2UC) {
													P2UC p2uc = (P2UC) tmpP2uc;
													return new Object[] { gwStep, flow, process, gw, gcw, node, step,
															n2s, gw2gs, useCase, p2uc, isApplicableMatch };
												}
											}
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

	public static final Object[] pattern_LastStepInPFlow_11_1_blackBBBBBBBBBBBBFB(ParallelStep gwStep,
			ParallelFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s,
			GW2S gw2gs, UseCase useCase, P2UC p2uc, LastStepInPFlow _this, IsApplicableMatch isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, useCase,
										p2uc, _this, csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_11_1_bindingAndBlackFFFFFFFFFFFBFB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LastStepInPFlow_11_1_binding = pattern_LastStepInPFlow_11_1_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LastStepInPFlow_11_1_binding != null) {
			ParallelStep gwStep = (ParallelStep) result_pattern_LastStepInPFlow_11_1_binding[0];
			ParallelFlow flow = (ParallelFlow) result_pattern_LastStepInPFlow_11_1_binding[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_LastStepInPFlow_11_1_binding[2];
			Gateway gw = (Gateway) result_pattern_LastStepInPFlow_11_1_binding[3];
			Gateway gcw = (Gateway) result_pattern_LastStepInPFlow_11_1_binding[4];
			FlowNode node = (FlowNode) result_pattern_LastStepInPFlow_11_1_binding[5];
			Step step = (Step) result_pattern_LastStepInPFlow_11_1_binding[6];
			FN2S n2s = (FN2S) result_pattern_LastStepInPFlow_11_1_binding[7];
			GW2S gw2gs = (GW2S) result_pattern_LastStepInPFlow_11_1_binding[8];
			UseCase useCase = (UseCase) result_pattern_LastStepInPFlow_11_1_binding[9];
			P2UC p2uc = (P2UC) result_pattern_LastStepInPFlow_11_1_binding[10];

			Object[] result_pattern_LastStepInPFlow_11_1_black = pattern_LastStepInPFlow_11_1_blackBBBBBBBBBBBBFB(
					gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, useCase, p2uc, _this, isApplicableMatch);
			if (result_pattern_LastStepInPFlow_11_1_black != null) {
				CSP csp = (CSP) result_pattern_LastStepInPFlow_11_1_black[12];

				return new Object[] { gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, useCase, p2uc, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_11_1_greenBBBF(SimpleBPMN.Process process, Gateway gcw,
			FlowNode node) {
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		process.getFlowElements().add(sf);
		sf.setSourceRef(node);
		sf.setTargetRef(gcw);
		return new Object[] { process, gcw, node, sf };
	}

	public static final Object[] pattern_LastStepInPFlow_11_2_blackB(SequenceFlow sf) {
		return new Object[] { sf };
	}

	public static final Object[] pattern_LastStepInPFlow_11_2_greenFB(SequenceFlow sf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf);
		return new Object[] { ruleresult, sf };
	}

	public static final Object[] pattern_LastStepInPFlow_11_3_blackBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw, EObject node, EObject sf,
			EObject step, EObject n2s, EObject gw2gs, EObject useCase, EObject p2uc) {
		if (!gwStep.equals(process)) {
			if (!gwStep.equals(node)) {
				if (!gwStep.equals(sf)) {
					if (!gwStep.equals(step)) {
						if (!gwStep.equals(n2s)) {
							if (!gwStep.equals(useCase)) {
								if (!gwStep.equals(p2uc)) {
									if (!flow.equals(gwStep)) {
										if (!flow.equals(process)) {
											if (!flow.equals(gw)) {
												if (!flow.equals(gcw)) {
													if (!flow.equals(node)) {
														if (!flow.equals(sf)) {
															if (!flow.equals(step)) {
																if (!flow.equals(n2s)) {
																	if (!flow.equals(gw2gs)) {
																		if (!flow.equals(useCase)) {
																			if (!flow.equals(p2uc)) {
																				if (!process.equals(sf)) {
																					if (!process.equals(step)) {
																						if (!process.equals(useCase)) {
																							if (!gw.equals(gwStep)) {
																								if (!gw.equals(
																										process)) {
																									if (!gw.equals(
																											node)) {
																										if (!gw.equals(
																												sf)) {
																											if (!gw.equals(
																													step)) {
																												if (!gw.equals(
																														n2s)) {
																													if (!gw.equals(
																															gw2gs)) {
																														if (!gw.equals(
																																useCase)) {
																															if (!gw.equals(
																																	p2uc)) {
																																if (!gcw.equals(
																																		gwStep)) {
																																	if (!gcw.equals(
																																			process)) {
																																		if (!gcw.equals(
																																				gw)) {
																																			if (!gcw.equals(
																																					node)) {
																																				if (!gcw.equals(
																																						sf)) {
																																					if (!gcw.equals(
																																							step)) {
																																						if (!gcw.equals(
																																								n2s)) {
																																							if (!gcw.equals(
																																									gw2gs)) {
																																								if (!gcw.equals(
																																										useCase)) {
																																									if (!gcw.equals(
																																											p2uc)) {
																																										if (!node
																																												.equals(process)) {
																																											if (!node
																																													.equals(sf)) {
																																												if (!node
																																														.equals(step)) {
																																													if (!node
																																															.equals(useCase)) {
																																														if (!node
																																																.equals(p2uc)) {
																																															if (!sf.equals(
																																																	step)) {
																																																if (!sf.equals(
																																																		useCase)) {
																																																	if (!step
																																																			.equals(useCase)) {
																																																		if (!n2s.equals(
																																																				process)) {
																																																			if (!n2s.equals(
																																																					node)) {
																																																				if (!n2s.equals(
																																																						sf)) {
																																																					if (!n2s.equals(
																																																							step)) {
																																																						if (!n2s.equals(
																																																								useCase)) {
																																																							if (!n2s.equals(
																																																									p2uc)) {
																																																								if (!gw2gs
																																																										.equals(gwStep)) {
																																																									if (!gw2gs
																																																											.equals(process)) {
																																																										if (!gw2gs
																																																												.equals(node)) {
																																																											if (!gw2gs
																																																													.equals(sf)) {
																																																												if (!gw2gs
																																																														.equals(step)) {
																																																													if (!gw2gs
																																																															.equals(n2s)) {
																																																														if (!gw2gs
																																																																.equals(useCase)) {
																																																															if (!gw2gs
																																																																	.equals(p2uc)) {
																																																																if (!p2uc
																																																																		.equals(process)) {
																																																																	if (!p2uc
																																																																			.equals(sf)) {
																																																																		if (!p2uc
																																																																				.equals(step)) {
																																																																			if (!p2uc
																																																																					.equals(useCase)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						gwStep,
																																																																						flow,
																																																																						process,
																																																																						gw,
																																																																						gcw,
																																																																						node,
																																																																						sf,
																																																																						step,
																																																																						n2s,
																																																																						gw2gs,
																																																																						useCase,
																																																																						p2uc };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LastStepInPFlow_11_3_greenBBBBBBBFFFFFF(PerformRuleResult ruleresult,
			EObject flow, EObject process, EObject gcw, EObject node, EObject sf, EObject step) {
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LastStepInPFlow";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__node____sourceRef_name_prime = "sourceRef";
		String node__sf____outgoing_name_prime = "outgoing";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		String flow__step______last_name_prime = "__last";
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		ruleresult.getCreatedEdges().add(process__sf____flowElements);
		sf__node____sourceRef.setSrc(sf);
		sf__node____sourceRef.setTrg(node);
		ruleresult.getCreatedEdges().add(sf__node____sourceRef);
		node__sf____outgoing.setSrc(node);
		node__sf____outgoing.setTrg(sf);
		ruleresult.getCreatedEdges().add(node__sf____outgoing);
		sf__gcw____targetRef.setSrc(sf);
		sf__gcw____targetRef.setTrg(gcw);
		ruleresult.getCreatedEdges().add(sf__gcw____targetRef);
		gcw__sf____incoming.setSrc(gcw);
		gcw__sf____incoming.setTrg(sf);
		ruleresult.getCreatedEdges().add(gcw__sf____incoming);
		flow__step______last.setSrc(flow);
		flow__step______last.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step______last);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__node____sourceRef.setName(sf__node____sourceRef_name_prime);
		node__sf____outgoing.setName(node__sf____outgoing_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		flow__step______last.setName(flow__step______last_name_prime);
		return new Object[] { ruleresult, flow, process, gcw, node, sf, step, process__sf____flowElements,
				sf__node____sourceRef, node__sf____outgoing, sf__gcw____targetRef, gcw__sf____incoming,
				flow__step______last };
	}

	public static final void pattern_LastStepInPFlow_11_5_expressionBBBBBBBBBBBBBB(LastStepInPFlow _this,
			PerformRuleResult ruleresult, EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw,
			EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs, EObject useCase, EObject p2uc) {
		_this.registerObjects_BWD(ruleresult, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, useCase,
				p2uc);

	}

	public static final PerformRuleResult pattern_LastStepInPFlow_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_12_1_bindingFB(LastStepInPFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_12_1_blackFBB(EClass eClass, LastStepInPFlow _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_12_1_bindingAndBlackFFB(LastStepInPFlow _this) {
		Object[] result_pattern_LastStepInPFlow_12_1_binding = pattern_LastStepInPFlow_12_1_bindingFB(_this);
		if (result_pattern_LastStepInPFlow_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_LastStepInPFlow_12_1_binding[0];

			Object[] result_pattern_LastStepInPFlow_12_1_black = pattern_LastStepInPFlow_12_1_blackFBB(eClass, _this);
			if (result_pattern_LastStepInPFlow_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LastStepInPFlow_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LastStepInPFlow";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LastStepInPFlow_12_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("gwStep");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("step");
		EObject _localVariable_3 = match.getObject("useCase");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		if (tmpGwStep instanceof ParallelStep) {
			ParallelStep gwStep = (ParallelStep) tmpGwStep;
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (tmpStep instanceof Step) {
					Step step = (Step) tmpStep;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						return new Object[] { gwStep, flow, step, useCase, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_12_2_blackBBFFFBFFBFB(ParallelStep gwStep,
			ParallelFlow flow, Step step, UseCase useCase, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gwStep.equals(step)) {
			for (FN2S n2s : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step, FN2S.class,
					"target")) {
				FlowNode node = n2s.getSource();
				if (node != null) {
					for (GW2S gw2gs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(gwStep,
							GW2S.class, "target")) {
						Gateway gw = gw2gs.getSource();
						if (gw != null) {
							if (!gw.equals(node)) {
								boolean gwisDiverging = gw.isIsDiverging();
								if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
									if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
										for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(useCase, P2UC.class, "target")) {
											SimpleBPMN.Process process = p2uc.getSource();
											if (process != null) {
												_result.add(new Object[] { gwStep, flow, process, gw, node, step, n2s,
														gw2gs, useCase, p2uc, match });
											}

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

	public static final Iterable<Object[]> pattern_LastStepInPFlow_12_3_blackBBBBFBBBBBB(ParallelStep gwStep,
			ParallelFlow flow, SimpleBPMN.Process process, Gateway gw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs,
			UseCase useCase, P2UC p2uc) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (gwStep.getInvokedFlows().contains(flow)) {
					if (process.getFlowElements().contains(gw)) {
						if (process.getFlowElements().contains(node)) {
							if (flow.getSteps().contains(step)) {
								if (step.equals(flow.get__last())) {
									if (node.equals(n2s.getSource())) {
										if (step.equals(n2s.getTarget())) {
											if (gw.equals(gw2gs.getSource())) {
												if (gwStep.equals(gw2gs.getTarget())) {
													if (useCase.getFlows().contains(flow)) {
														if (process.equals(p2uc.getSource())) {
															if (useCase.equals(p2uc.getTarget())) {
																Gateway gcw = gw.get__conv();
																if (gcw != null) {
																	if (!gcw.equals(gw)) {
																		if (!gcw.equals(node)) {
																			if (process.getFlowElements()
																					.contains(gcw)) {
																				boolean gwisDiverging = gw
																						.isIsDiverging();
																				if (Boolean.valueOf(gwisDiverging)
																						.equals(Boolean
																								.valueOf(true))) {
																					if (Boolean.valueOf(gwisDiverging)
																							.equals(Boolean
																									.valueOf(true))) {
																						boolean gcwisDiverging = gcw
																								.isIsDiverging();
																						if (Boolean
																								.valueOf(gcwisDiverging)
																								.equals(false)) {
																							if (Boolean
																									.valueOf(
																											gcwisDiverging)
																									.equals(false)) {
																								_result.add(
																										new Object[] {
																												gwStep,
																												flow,
																												process,
																												gw, gcw,
																												node,
																												step,
																												n2s,
																												gw2gs,
																												useCase,
																												p2uc });
																							}
																						}

																					}
																				}

																			}
																		}
																	}
																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LastStepInPFlow_12_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(ParallelStep gwStep,
			ParallelFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s,
			GW2S gw2gs, UseCase useCase, P2UC p2uc) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge gwStep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gcw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__gcw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2s__node____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gwStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String gwStep__flow____invokedFlows_name_prime = "invokedFlows";
		String process__gw____flowElements_name_prime = "flowElements";
		String process__gcw____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String gw__gcw______conv_name_prime = "__conv";
		String flow__step____steps_name_prime = "steps";
		String flow__step______last_name_prime = "__last";
		String n2s__node____source_name_prime = "source";
		String n2s__step____target_name_prime = "target";
		String gw2gs__gw____source_name_prime = "source";
		String gw2gs__gwStep____target_name_prime = "target";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(n2s);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		gwStep__flow____invokedFlows.setSrc(gwStep);
		gwStep__flow____invokedFlows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(gwStep__flow____invokedFlows);
		process__gw____flowElements.setSrc(process);
		process__gw____flowElements.setTrg(gw);
		isApplicableMatch.getAllContextElements().add(process__gw____flowElements);
		process__gcw____flowElements.setSrc(process);
		process__gcw____flowElements.setTrg(gcw);
		isApplicableMatch.getAllContextElements().add(process__gcw____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(process__node____flowElements);
		gw__gcw______conv.setSrc(gw);
		gw__gcw______conv.setTrg(gcw);
		isApplicableMatch.getAllContextElements().add(gw__gcw______conv);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		flow__step______last.setSrc(flow);
		flow__step______last.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step______last);
		n2s__node____source.setSrc(n2s);
		n2s__node____source.setTrg(node);
		isApplicableMatch.getAllContextElements().add(n2s__node____source);
		n2s__step____target.setSrc(n2s);
		n2s__step____target.setTrg(step);
		isApplicableMatch.getAllContextElements().add(n2s__step____target);
		gw2gs__gw____source.setSrc(gw2gs);
		gw2gs__gw____source.setTrg(gw);
		isApplicableMatch.getAllContextElements().add(gw2gs__gw____source);
		gw2gs__gwStep____target.setSrc(gw2gs);
		gw2gs__gwStep____target.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(gw2gs__gwStep____target);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		gwStep__flow____invokedFlows.setName(gwStep__flow____invokedFlows_name_prime);
		process__gw____flowElements.setName(process__gw____flowElements_name_prime);
		process__gcw____flowElements.setName(process__gcw____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		gw__gcw______conv.setName(gw__gcw______conv_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		flow__step______last.setName(flow__step______last_name_prime);
		n2s__node____source.setName(n2s__node____source_name_prime);
		n2s__step____target.setName(n2s__step____target_name_prime);
		gw2gs__gw____source.setName(gw2gs__gw____source_name_prime);
		gw2gs__gwStep____target.setName(gw2gs__gwStep____target_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		return new Object[] { gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, useCase, p2uc, isApplicableMatch,
				gwStep__flow____invokedFlows, process__gw____flowElements, process__gcw____flowElements,
				process__node____flowElements, gw__gcw______conv, flow__step____steps, flow__step______last,
				n2s__node____source, n2s__step____target, gw2gs__gw____source, gw2gs__gwStep____target,
				useCase__flow____flows, p2uc__process____source, p2uc__useCase____target };
	}

	public static final Object[] pattern_LastStepInPFlow_12_4_bindingFBBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs, UseCase useCase, P2UC p2uc) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, gwStep, flow, process, gw, gcw, node,
				step, n2s, gw2gs, useCase, p2uc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs,
					useCase, p2uc };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInPFlow_12_4_bindingAndBlackFBBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs, UseCase useCase, P2UC p2uc) {
		Object[] result_pattern_LastStepInPFlow_12_4_binding = pattern_LastStepInPFlow_12_4_bindingFBBBBBBBBBBBBB(_this,
				isApplicableMatch, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, useCase, p2uc);
		if (result_pattern_LastStepInPFlow_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInPFlow_12_4_binding[0];

			Object[] result_pattern_LastStepInPFlow_12_4_black = pattern_LastStepInPFlow_12_4_blackB(csp);
			if (result_pattern_LastStepInPFlow_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, step, n2s,
						gw2gs, useCase, p2uc };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInPFlow_12_5_expressionFBB(LastStepInPFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LastStepInPFlow_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LastStepInPFlow";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LastStepInPFlow_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_20_1_bindingFB(LastStepInPFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_20_1_blackFBB(EClass __eClass, LastStepInPFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_20_1_bindingAndBlackFFB(LastStepInPFlow _this) {
		Object[] result_pattern_LastStepInPFlow_20_1_binding = pattern_LastStepInPFlow_20_1_bindingFB(_this);
		if (result_pattern_LastStepInPFlow_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInPFlow_20_1_binding[0];

			Object[] result_pattern_LastStepInPFlow_20_1_black = pattern_LastStepInPFlow_20_1_blackFBB(__eClass, _this);
			if (result_pattern_LastStepInPFlow_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInPFlow_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInPFlow_20_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_618521 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_618521)) {
							if (!gcw.equals(__DEC_sf_default_618521)) {
								if (!node.equals(__DEC_sf_default_618521)) {
									return new Object[] { sf, gw, gcw, node };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_20_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_44191 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_44191)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_20_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf = _edge_flowElements.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (process.getFlowElements().contains(sf)) {
					FlowNode node = sf.getSourceRef();
					if (node != null) {
						if (process.getFlowElements().contains(node)) {
							FlowNode tmpGcw = sf.getTargetRef();
							if (tmpGcw instanceof Gateway) {
								Gateway gcw = (Gateway) tmpGcw;
								if (!gcw.equals(node)) {
									if (process.getFlowElements().contains(gcw)) {
										boolean gcwisDiverging = gcw.isIsDiverging();
										if (Boolean.valueOf(gcwisDiverging).equals(false)) {
											if (Boolean.valueOf(gcwisDiverging).equals(false)) {
												if (pattern_LastStepInPFlow_20_2_black_nac_1BB(sf, process) == null) {
													for (FlowElement tmpGw : process.getFlowElements()) {
														if (tmpGw instanceof Gateway) {
															Gateway gw = (Gateway) tmpGw;
															if (!gw.equals(node)) {
																if (!gcw.equals(gw)) {
																	if (gcw.equals(gw.get__conv())) {
																		boolean gwisDiverging = gw.isIsDiverging();
																		if (Boolean.valueOf(gwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (Boolean.valueOf(gwisDiverging)
																					.equals(Boolean.valueOf(true))) {
																				if (pattern_LastStepInPFlow_20_2_black_nac_0BBBB(
																						sf, gw, gcw, node) == null) {
																					_result.add(new Object[] { process,
																							gw, gcw, node, sf,
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

		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInPFlow_20_3_expressionFBBBBBBB(LastStepInPFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInPFlow_20_4_expressionFBB(LastStepInPFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInPFlow_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInPFlow_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_21_1_bindingFB(LastStepInPFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_21_1_blackFBB(EClass __eClass, LastStepInPFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_21_1_bindingAndBlackFFB(LastStepInPFlow _this) {
		Object[] result_pattern_LastStepInPFlow_21_1_binding = pattern_LastStepInPFlow_21_1_bindingFB(_this);
		if (result_pattern_LastStepInPFlow_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInPFlow_21_1_binding[0];

			Object[] result_pattern_LastStepInPFlow_21_1_black = pattern_LastStepInPFlow_21_1_blackFBB(__eClass, _this);
			if (result_pattern_LastStepInPFlow_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInPFlow_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInPFlow_21_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_237507 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_237507)) {
							if (!gcw.equals(__DEC_sf_default_237507)) {
								if (!node.equals(__DEC_sf_default_237507)) {
									return new Object[] { sf, gw, gcw, node };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_21_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_56910 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_56910)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_21_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf = _edge_sourceRef.getSrc();
		if (tmpSf instanceof SequenceFlow) {
			SequenceFlow sf = (SequenceFlow) tmpSf;
			EObject tmpNode = _edge_sourceRef.getTrg();
			if (tmpNode instanceof FlowNode) {
				FlowNode node = (FlowNode) tmpNode;
				if (node.equals(sf.getSourceRef())) {
					FlowNode tmpGcw = sf.getTargetRef();
					if (tmpGcw instanceof Gateway) {
						Gateway gcw = (Gateway) tmpGcw;
						if (!gcw.equals(node)) {
							boolean gcwisDiverging = gcw.isIsDiverging();
							if (Boolean.valueOf(gcwisDiverging).equals(false)) {
								if (Boolean.valueOf(gcwisDiverging).equals(false)) {
									for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
										if (process.getFlowElements().contains(gcw)) {
											if (process.getFlowElements().contains(node)) {
												if (pattern_LastStepInPFlow_21_2_black_nac_1BB(sf, process) == null) {
													for (FlowElement tmpGw : process.getFlowElements()) {
														if (tmpGw instanceof Gateway) {
															Gateway gw = (Gateway) tmpGw;
															if (!gw.equals(node)) {
																if (!gcw.equals(gw)) {
																	if (gcw.equals(gw.get__conv())) {
																		boolean gwisDiverging = gw.isIsDiverging();
																		if (Boolean.valueOf(gwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (Boolean.valueOf(gwisDiverging)
																					.equals(Boolean.valueOf(true))) {
																				if (pattern_LastStepInPFlow_21_2_black_nac_0BBBB(
																						sf, gw, gcw, node) == null) {
																					_result.add(new Object[] { process,
																							gw, gcw, node, sf,
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

		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInPFlow_21_3_expressionFBBBBBBB(LastStepInPFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInPFlow_21_4_expressionFBB(LastStepInPFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInPFlow_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInPFlow_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_22_1_bindingFB(LastStepInPFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_22_1_blackFBB(EClass __eClass, LastStepInPFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_22_1_bindingAndBlackFFB(LastStepInPFlow _this) {
		Object[] result_pattern_LastStepInPFlow_22_1_binding = pattern_LastStepInPFlow_22_1_bindingFB(_this);
		if (result_pattern_LastStepInPFlow_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInPFlow_22_1_binding[0];

			Object[] result_pattern_LastStepInPFlow_22_1_black = pattern_LastStepInPFlow_22_1_blackFBB(__eClass, _this);
			if (result_pattern_LastStepInPFlow_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInPFlow_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInPFlow_22_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_863209 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_863209)) {
							if (!gcw.equals(__DEC_sf_default_863209)) {
								if (!node.equals(__DEC_sf_default_863209)) {
									return new Object[] { sf, gw, gcw, node };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_22_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_180244 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_180244)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_22_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpNode = _edge_outgoing.getSrc();
		if (tmpNode instanceof FlowNode) {
			FlowNode node = (FlowNode) tmpNode;
			EObject tmpSf = _edge_outgoing.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (node.equals(sf.getSourceRef())) {
					FlowNode tmpGcw = sf.getTargetRef();
					if (tmpGcw instanceof Gateway) {
						Gateway gcw = (Gateway) tmpGcw;
						if (!gcw.equals(node)) {
							boolean gcwisDiverging = gcw.isIsDiverging();
							if (Boolean.valueOf(gcwisDiverging).equals(false)) {
								if (Boolean.valueOf(gcwisDiverging).equals(false)) {
									for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(node, SimpleBPMN.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(gcw)) {
											if (process.getFlowElements().contains(sf)) {
												if (pattern_LastStepInPFlow_22_2_black_nac_1BB(sf, process) == null) {
													for (FlowElement tmpGw : process.getFlowElements()) {
														if (tmpGw instanceof Gateway) {
															Gateway gw = (Gateway) tmpGw;
															if (!gw.equals(node)) {
																if (!gcw.equals(gw)) {
																	if (gcw.equals(gw.get__conv())) {
																		boolean gwisDiverging = gw.isIsDiverging();
																		if (Boolean.valueOf(gwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (Boolean.valueOf(gwisDiverging)
																					.equals(Boolean.valueOf(true))) {
																				if (pattern_LastStepInPFlow_22_2_black_nac_0BBBB(
																						sf, gw, gcw, node) == null) {
																					_result.add(new Object[] { process,
																							gw, gcw, node, sf,
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

		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInPFlow_22_3_expressionFBBBBBBB(LastStepInPFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInPFlow_22_4_expressionFBB(LastStepInPFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInPFlow_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInPFlow_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_23_1_bindingFB(LastStepInPFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_23_1_blackFBB(EClass __eClass, LastStepInPFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_23_1_bindingAndBlackFFB(LastStepInPFlow _this) {
		Object[] result_pattern_LastStepInPFlow_23_1_binding = pattern_LastStepInPFlow_23_1_bindingFB(_this);
		if (result_pattern_LastStepInPFlow_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInPFlow_23_1_binding[0];

			Object[] result_pattern_LastStepInPFlow_23_1_black = pattern_LastStepInPFlow_23_1_blackFBB(__eClass, _this);
			if (result_pattern_LastStepInPFlow_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInPFlow_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInPFlow_23_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_699038 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_699038)) {
							if (!gcw.equals(__DEC_sf_default_699038)) {
								if (!node.equals(__DEC_sf_default_699038)) {
									return new Object[] { sf, gw, gcw, node };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_23_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_129578 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_129578)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_23_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf = _edge_targetRef.getSrc();
		if (tmpSf instanceof SequenceFlow) {
			SequenceFlow sf = (SequenceFlow) tmpSf;
			EObject tmpGcw = _edge_targetRef.getTrg();
			if (tmpGcw instanceof Gateway) {
				Gateway gcw = (Gateway) tmpGcw;
				if (gcw.equals(sf.getTargetRef())) {
					FlowNode node = sf.getSourceRef();
					if (node != null) {
						if (!gcw.equals(node)) {
							boolean gcwisDiverging = gcw.isIsDiverging();
							if (Boolean.valueOf(gcwisDiverging).equals(false)) {
								if (Boolean.valueOf(gcwisDiverging).equals(false)) {
									for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
										if (process.getFlowElements().contains(gcw)) {
											if (process.getFlowElements().contains(node)) {
												if (pattern_LastStepInPFlow_23_2_black_nac_1BB(sf, process) == null) {
													for (FlowElement tmpGw : process.getFlowElements()) {
														if (tmpGw instanceof Gateway) {
															Gateway gw = (Gateway) tmpGw;
															if (!gw.equals(node)) {
																if (!gcw.equals(gw)) {
																	if (gcw.equals(gw.get__conv())) {
																		boolean gwisDiverging = gw.isIsDiverging();
																		if (Boolean.valueOf(gwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (Boolean.valueOf(gwisDiverging)
																					.equals(Boolean.valueOf(true))) {
																				if (pattern_LastStepInPFlow_23_2_black_nac_0BBBB(
																						sf, gw, gcw, node) == null) {
																					_result.add(new Object[] { process,
																							gw, gcw, node, sf,
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

		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInPFlow_23_3_expressionFBBBBBBB(LastStepInPFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInPFlow_23_4_expressionFBB(LastStepInPFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInPFlow_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInPFlow_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_24_1_bindingFB(LastStepInPFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_24_1_blackFBB(EClass __eClass, LastStepInPFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_24_1_bindingAndBlackFFB(LastStepInPFlow _this) {
		Object[] result_pattern_LastStepInPFlow_24_1_binding = pattern_LastStepInPFlow_24_1_bindingFB(_this);
		if (result_pattern_LastStepInPFlow_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInPFlow_24_1_binding[0];

			Object[] result_pattern_LastStepInPFlow_24_1_black = pattern_LastStepInPFlow_24_1_blackFBB(__eClass, _this);
			if (result_pattern_LastStepInPFlow_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInPFlow_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInPFlow_24_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_720733 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_720733)) {
							if (!gcw.equals(__DEC_sf_default_720733)) {
								if (!node.equals(__DEC_sf_default_720733)) {
									return new Object[] { sf, gw, gcw, node };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_24_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_896530 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_896530)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_24_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGcw = _edge_incoming.getSrc();
		if (tmpGcw instanceof Gateway) {
			Gateway gcw = (Gateway) tmpGcw;
			EObject tmpSf = _edge_incoming.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (gcw.equals(sf.getTargetRef())) {
					boolean gcwisDiverging = gcw.isIsDiverging();
					if (Boolean.valueOf(gcwisDiverging).equals(false)) {
						if (Boolean.valueOf(gcwisDiverging).equals(false)) {
							FlowNode node = sf.getSourceRef();
							if (node != null) {
								if (!gcw.equals(node)) {
									for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(gcw, SimpleBPMN.Process.class, "flowElements")) {
										if (process.getFlowElements().contains(node)) {
											if (process.getFlowElements().contains(sf)) {
												if (pattern_LastStepInPFlow_24_2_black_nac_1BB(sf, process) == null) {
													for (FlowElement tmpGw : process.getFlowElements()) {
														if (tmpGw instanceof Gateway) {
															Gateway gw = (Gateway) tmpGw;
															if (!gw.equals(node)) {
																if (!gcw.equals(gw)) {
																	if (gcw.equals(gw.get__conv())) {
																		boolean gwisDiverging = gw.isIsDiverging();
																		if (Boolean.valueOf(gwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (Boolean.valueOf(gwisDiverging)
																					.equals(Boolean.valueOf(true))) {
																				if (pattern_LastStepInPFlow_24_2_black_nac_0BBBB(
																						sf, gw, gcw, node) == null) {
																					_result.add(new Object[] { process,
																							gw, gcw, node, sf,
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

		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInPFlow_24_3_expressionFBBBBBBB(LastStepInPFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInPFlow_24_4_expressionFBB(LastStepInPFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInPFlow_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInPFlow_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_25_1_bindingFB(LastStepInPFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_25_1_blackFBB(EClass __eClass, LastStepInPFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_25_1_bindingAndBlackFFB(LastStepInPFlow _this) {
		Object[] result_pattern_LastStepInPFlow_25_1_binding = pattern_LastStepInPFlow_25_1_bindingFB(_this);
		if (result_pattern_LastStepInPFlow_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInPFlow_25_1_binding[0];

			Object[] result_pattern_LastStepInPFlow_25_1_black = pattern_LastStepInPFlow_25_1_blackFBB(__eClass, _this);
			if (result_pattern_LastStepInPFlow_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInPFlow_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_25_2_blackFFFFB(EMoflonEdge _edge___last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge___last.getSrc();
		if (tmpFlow instanceof ParallelFlow) {
			ParallelFlow flow = (ParallelFlow) tmpFlow;
			EObject tmpStep = _edge___last.getTrg();
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (step.equals(flow.get__last())) {
						for (ParallelStep gwStep : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
							if (!gwStep.equals(step)) {
								for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(flow, UseCase.class, "flows")) {
									_result.add(new Object[] { gwStep, flow, step, useCase, _edge___last });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInPFlow_25_3_expressionFBBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step, UseCase useCase) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, gwStep, flow, step, useCase);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInPFlow_25_4_expressionFBB(LastStepInPFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInPFlow_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInPFlow_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LastStepInPFlowImpl
