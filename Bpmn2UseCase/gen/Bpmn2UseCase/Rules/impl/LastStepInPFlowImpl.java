/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.FN2S;
import Bpmn2UseCase.GW2S;

import Bpmn2UseCase.Rules.LastStepInPFlow;
import Bpmn2UseCase.Rules.RulesPackage;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.Flow;
import SimpleUseCase.ParallelFlow;
import SimpleUseCase.ParallelStep;
import SimpleUseCase.Step;

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
				.pattern_LastStepInPFlow_1_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
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
		// CSP csp = (CSP) result1_bindingAndBlack[11];
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
		Object[] result3_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_1_3_blackBBBBBBBBBBB(ruleresult, gwStep,
				flow, process, gw, gcw, node, sf, step, n2s, gw2gs);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", "
					+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = "
					+ node + ", " + "[sf] = " + sf + ", " + "[step] = " + step + ", " + "[n2s] = " + n2s + ", "
					+ "[gw2gs] = " + gw2gs + ".");
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
		LastStepInPFlowImpl.pattern_LastStepInPFlow_1_5_expressionBBBBBBBBBBBB(this, ruleresult, gwStep, flow, process,
				gw, gcw, node, sf, step, n2s, gw2gs);
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
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_2_2_blackFBBBBBFFFB(process, gw, gcw,
				node, sf, match)) {
			ParallelStep gwStep = (ParallelStep) result2_black[0];
			Step step = (Step) result2_black[6];
			FN2S n2s = (FN2S) result2_black[7];
			GW2S gw2gs = (GW2S) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_2_3_blackBFBBBBBBBB(gwStep,
					process, gw, gcw, node, sf, step, n2s, gw2gs)) {
				ParallelFlow flow = (ParallelFlow) result3_black[1];
				Object[] result3_green = LastStepInPFlowImpl
						.pattern_LastStepInPFlow_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(gwStep, flow, process, gw, gcw,
								node, sf, step, n2s, gw2gs);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge gwStep__flow____invokedFlows = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[20];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[21];
				// EMoflonEdge n2s__node____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge n2s__step____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge gw2gs__gw____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge gw2gs__gwStep____target = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = LastStepInPFlowImpl
						.pattern_LastStepInPFlow_2_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, gwStep, flow,
								process, gw, gcw, node, sf, step, n2s, gw2gs);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", " + "[process] = " + process
							+ ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", "
							+ "[sf] = " + sf + ", " + "[step] = " + step + ", " + "[n2s] = " + n2s + ", " + "[gw2gs] = "
							+ gw2gs + ".");
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
			GW2S gw2gs) {// Create CSP
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
			EObject gw, EObject gcw, EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs) {
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
	public boolean isAppropriate_BWD(Match match, ParallelStep gwStep, ParallelFlow flow, Step step) {
		// initial bindings
		Object[] result1_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_10_1_blackBBBBB(this, match, gwStep, flow,
				step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", "
					+ "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LastStepInPFlowImpl.pattern_LastStepInPFlow_10_2_bindingAndBlackFBBBBB(this,
				match, gwStep, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = " + flow
					+ ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LastStepInPFlowImpl.pattern_LastStepInPFlow_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_10_4_blackBBBB(match, gwStep, flow,
					step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = "
						+ flow + ", " + "[step] = " + step + ".");
			}
			LastStepInPFlowImpl.pattern_LastStepInPFlow_10_4_greenBBBF(match, flow, step);
			// EMoflonEdge flow__step______last = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_10_5_blackBBBB(match, gwStep, flow,
					step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = "
						+ flow + ", " + "[step] = " + step + ".");
			}
			LastStepInPFlowImpl.pattern_LastStepInPFlow_10_5_greenBBBBFF(match, gwStep, flow, step);
			// EMoflonEdge gwStep__flow____invokedFlows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			LastStepInPFlowImpl.pattern_LastStepInPFlow_10_6_expressionBBBBB(this, match, gwStep, flow, step);
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
				.pattern_LastStepInPFlow_11_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
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
		// CSP csp = (CSP) result1_bindingAndBlack[10];
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
		Object[] result3_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_11_3_blackBBBBBBBBBBB(ruleresult, gwStep,
				flow, process, gw, gcw, node, sf, step, n2s, gw2gs);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", "
					+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = "
					+ node + ", " + "[sf] = " + sf + ", " + "[step] = " + step + ", " + "[n2s] = " + n2s + ", "
					+ "[gw2gs] = " + gw2gs + ".");
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
		LastStepInPFlowImpl.pattern_LastStepInPFlow_11_5_expressionBBBBBBBBBBBB(this, ruleresult, gwStep, flow, process,
				gw, gcw, node, sf, step, n2s, gw2gs);
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
		Object[] result2_binding = LastStepInPFlowImpl.pattern_LastStepInPFlow_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ParallelStep gwStep = (ParallelStep) result2_binding[0];
		ParallelFlow flow = (ParallelFlow) result2_binding[1];
		Step step = (Step) result2_binding[2];
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_12_2_blackBBFFBFFB(gwStep, flow, step,
				match)) {
			Gateway gw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			FN2S n2s = (FN2S) result2_black[5];
			GW2S gw2gs = (GW2S) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_12_3_blackBBFBFBBBB(gwStep, flow,
					gw, node, step, n2s, gw2gs)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[2];
				Gateway gcw = (Gateway) result3_black[4];
				Object[] result3_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_12_3_greenBBBBBBBBBFFFFFFFFFFFF(
						gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge gwStep__flow____invokedFlows = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge flow__step______last = (EMoflonEdge) result3_green[16];
				// EMoflonEdge n2s__node____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge n2s__step____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge gw2gs__gw____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge gw2gs__gwStep____target = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = LastStepInPFlowImpl
						.pattern_LastStepInPFlow_12_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, gwStep, flow,
								process, gw, gcw, node, step, n2s, gw2gs);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", " + "[process] = " + process
							+ ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", "
							+ "[step] = " + step + ", " + "[n2s] = " + n2s + ", " + "[gw2gs] = " + gw2gs + ".");
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
	public void registerObjectsToMatch_BWD(Match match, ParallelStep gwStep, ParallelFlow flow, Step step) {
		match.registerObject("gwStep", gwStep);
		match.registerObject("flow", flow);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ParallelStep gwStep, ParallelFlow flow, Step step) {// Create CSP
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
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs) {// Create CSP
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
			EObject gw, EObject gcw, EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs) {
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
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_25_2_blackFFFB(_edge___last)) {
			ParallelStep gwStep = (ParallelStep) result2_black[0];
			ParallelFlow flow = (ParallelFlow) result2_black[1];
			Step step = (Step) result2_black[2];
			Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInPFlowImpl.pattern_LastStepInPFlow_25_3_expressionFBBBBB(this, match, gwStep, flow, step)) {
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
		Bpmn2UseCase.FN2S n2s = (Bpmn2UseCase.FN2S) matchForN2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGw2gs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw2gs")).findAny();
		Bpmn2UseCase.GW2S gw2gs = (Bpmn2UseCase.GW2S) matchForGw2gs.get().getNode();

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
		Bpmn2UseCase.FN2S n2s = (Bpmn2UseCase.FN2S) matchForN2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGw2gs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw2gs")).findAny();
		Bpmn2UseCase.GW2S gw2gs = (Bpmn2UseCase.GW2S) matchForGw2gs.get().getNode();

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
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_28_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_28_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = LastStepInPFlowImpl.pattern_LastStepInPFlow_28_2_bindingFFFFFFFFBB(targetMatch,
				sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		ParallelStep gwStep = (ParallelStep) result2_binding[0];
		ParallelFlow flow = (ParallelFlow) result2_binding[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[2];
		Gateway gw = (Gateway) result2_binding[3];
		Gateway gcw = (Gateway) result2_binding[4];
		FlowNode node = (FlowNode) result2_binding[5];
		SequenceFlow sf = (SequenceFlow) result2_binding[6];
		Step step = (Step) result2_binding[7];
		for (Object[] result2_black : LastStepInPFlowImpl.pattern_LastStepInPFlow_28_2_blackBBBBBBBBFFBB(gwStep, flow,
				process, gw, gcw, node, sf, step, sourceMatch, targetMatch)) {
			FN2S n2s = (FN2S) result2_black[8];
			GW2S gw2gs = (GW2S) result2_black[9];
			Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_28_2_greenBBBBBBBBBBBBF(gwStep, flow,
					process, gw, gcw, node, sf, step, n2s, gw2gs, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[12];

			// check csp
			Object[] result3_bindingAndBlack = LastStepInPFlowImpl
					.pattern_LastStepInPFlow_28_3_bindingAndBlackFBBBBBBBBBBBBBB(this, isApplicableMatch, gwStep, flow,
							process, gw, gcw, node, sf, step, n2s, gw2gs, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_28_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				LastStepInPFlowImpl.pattern_LastStepInPFlow_28_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_28_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs, Match sourceMatch, Match targetMatch) {// Create CSP
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
		Object[] result1_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_31_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = LastStepInPFlowImpl
				.pattern_LastStepInPFlow_31_2_bindingAndBlackFFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// ParallelStep gwStep = (ParallelStep) result2_bindingAndBlack[0];
		// ParallelFlow flow = (ParallelFlow) result2_bindingAndBlack[1];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[2];
		// Gateway gw = (Gateway) result2_bindingAndBlack[3];
		// Gateway gcw = (Gateway) result2_bindingAndBlack[4];
		// FlowNode node = (FlowNode) result2_bindingAndBlack[5];
		// SequenceFlow sf = (SequenceFlow) result2_bindingAndBlack[6];
		// Step step = (Step) result2_bindingAndBlack[7];
		// FN2S n2s = (FN2S) result2_bindingAndBlack[8];
		// GW2S gw2gs = (GW2S) result2_bindingAndBlack[9];
		Object[] result2_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_31_2_greenF();
		PerformRuleResult result = (PerformRuleResult) result2_green[0];

		return LastStepInPFlowImpl.pattern_LastStepInPFlow_31_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, FN2S n2sParameter) {
		// create result
		Object[] result1_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LastStepInPFlowImpl.pattern_LastStepInPFlow_32_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : LastStepInPFlowImpl
				.pattern_LastStepInPFlow_32_2_blackFFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList n2sList = (RuleEntryList) result2_black[0];
			ParallelStep gwStep = (ParallelStep) result2_black[1];
			ParallelFlow flow = (ParallelFlow) result2_black[2];
			Step step = (Step) result2_black[3];
			FN2S n2s = (FN2S) result2_black[4];
			FlowNode node = (FlowNode) result2_black[5];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[6];
			Gateway gw = (Gateway) result2_black[7];
			Gateway gcw = (Gateway) result2_black[8];
			GW2S gw2gs = (GW2S) result2_black[9];

			// solve CSP
			Object[] result3_bindingAndBlack = LastStepInPFlowImpl
					.pattern_LastStepInPFlow_32_3_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, gwStep, flow,
							process, gw, gcw, node, step, n2s, gw2gs, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[gwStep] = " + gwStep
						+ ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[gw] = " + gw + ", "
						+ "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[step] = " + step + ", " + "[n2s] = "
						+ n2s + ", " + "[gw2gs] = " + gw2gs + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (LastStepInPFlowImpl.pattern_LastStepInPFlow_32_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_32_5_blackBBBBBBBBB(gwStep, flow,
						process, gw, gcw, node, step, n2s, gw2gs);
				if (result5_black != null) {

					// perform
					Object[] result6_black = LastStepInPFlowImpl.pattern_LastStepInPFlow_32_6_blackBBBBBBBBBB(gwStep,
							flow, process, gw, gcw, node, step, n2s, gw2gs, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", " + "[process] = " + process
								+ ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", "
								+ "[step] = " + step + ", " + "[n2s] = " + n2s + ", " + "[gw2gs] = " + gw2gs + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					LastStepInPFlowImpl.pattern_LastStepInPFlow_32_6_greenBBBBFBB(flow, process, gcw, node, step,
							ruleResult);
					// SequenceFlow sf = (SequenceFlow) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return LastStepInPFlowImpl.pattern_LastStepInPFlow_32_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (Gateway) arguments.get(4),
					(Gateway) arguments.get(5), (FlowNode) arguments.get(6), (SequenceFlow) arguments.get(7),
					(Step) arguments.get(8), (FN2S) arguments.get(9), (GW2S) arguments.get(10));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.LAST_STEP_IN_PFLOW___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP:
			return isAppropriate_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (Step) arguments.get(3));
		case RulesPackage.LAST_STEP_IN_PFLOW___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (Step) arguments.get(3));
			return null;
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARALLELSTEP_PARALLELFLOW_STEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (Step) arguments.get(3));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (Gateway) arguments.get(4),
					(Gateway) arguments.get(5), (FlowNode) arguments.get(6), (Step) arguments.get(7),
					(FN2S) arguments.get(8), (GW2S) arguments.get(9));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
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
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (Gateway) arguments.get(4),
					(Gateway) arguments.get(5), (FlowNode) arguments.get(6), (SequenceFlow) arguments.get(7),
					(Step) arguments.get(8), (FN2S) arguments.get(9), (GW2S) arguments.get(10),
					(Match) arguments.get(11), (Match) arguments.get(12));
		case RulesPackage.LAST_STEP_IN_PFLOW___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_PFLOW___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (FN2S) arguments.get(1));
		case RulesPackage.LAST_STEP_IN_PFLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARALLELSTEP_PARALLELFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ParallelStep) arguments.get(1),
					(ParallelFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (Gateway) arguments.get(4),
					(Gateway) arguments.get(5), (FlowNode) arguments.get(6), (Step) arguments.get(7),
					(FN2S) arguments.get(8), (GW2S) arguments.get(9), (ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.LAST_STEP_IN_PFLOW___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
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

	public static final Object[] pattern_LastStepInPFlow_1_1_bindingFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
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
												return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step,
														n2s, gw2gs, isApplicableMatch };
											}
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

	public static final Object[] pattern_LastStepInPFlow_1_1_blackBBBBBBBBBBBFB(ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs, LastStepInPFlow _this, IsApplicableMatch isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, _this,
										csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_1_1_bindingAndBlackFFFFFFFFFFBFB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LastStepInPFlow_1_1_binding = pattern_LastStepInPFlow_1_1_bindingFFFFFFFFFFB(
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

			Object[] result_pattern_LastStepInPFlow_1_1_black = pattern_LastStepInPFlow_1_1_blackBBBBBBBBBBBFB(gwStep,
					flow, process, gw, gcw, node, sf, step, n2s, gw2gs, _this, isApplicableMatch);
			if (result_pattern_LastStepInPFlow_1_1_black != null) {
				CSP csp = (CSP) result_pattern_LastStepInPFlow_1_1_black[11];

				return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, _this, csp,
						isApplicableMatch };
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

	public static final Object[] pattern_LastStepInPFlow_1_3_blackBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw, EObject node, EObject sf,
			EObject step, EObject n2s, EObject gw2gs) {
		if (!gwStep.equals(process)) {
			if (!gwStep.equals(node)) {
				if (!gwStep.equals(sf)) {
					if (!gwStep.equals(step)) {
						if (!gwStep.equals(n2s)) {
							if (!flow.equals(gwStep)) {
								if (!flow.equals(process)) {
									if (!flow.equals(gw)) {
										if (!flow.equals(gcw)) {
											if (!flow.equals(node)) {
												if (!flow.equals(sf)) {
													if (!flow.equals(step)) {
														if (!flow.equals(n2s)) {
															if (!flow.equals(gw2gs)) {
																if (!process.equals(sf)) {
																	if (!process.equals(step)) {
																		if (!gw.equals(gwStep)) {
																			if (!gw.equals(process)) {
																				if (!gw.equals(node)) {
																					if (!gw.equals(sf)) {
																						if (!gw.equals(step)) {
																							if (!gw.equals(n2s)) {
																								if (!gw.equals(gw2gs)) {
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
																																	if (!node
																																			.equals(process)) {
																																		if (!node
																																				.equals(sf)) {
																																			if (!node
																																					.equals(step)) {
																																				if (!sf.equals(
																																						step)) {
																																					if (!n2s.equals(
																																							process)) {
																																						if (!n2s.equals(
																																								node)) {
																																							if (!n2s.equals(
																																									sf)) {
																																								if (!n2s.equals(
																																										step)) {
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
																																																	gw2gs };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final void pattern_LastStepInPFlow_1_5_expressionBBBBBBBBBBBB(LastStepInPFlow _this,
			PerformRuleResult ruleresult, EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw,
			EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs) {
		_this.registerObjects_FWD(ruleresult, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs);

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

	public static final Iterable<Object[]> pattern_LastStepInPFlow_2_2_blackFBBBBBFFFB(SimpleBPMN.Process process,
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
														_result.add(new Object[] { gwStep, process, gw, gcw, node, sf,
																step, n2s, gw2gs, match });
													}
												}

											}
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

	public static final Iterable<Object[]> pattern_LastStepInPFlow_2_3_blackBFBBBBBBBB(ParallelStep gwStep,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs) {
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
																	boolean gwisDiverging = gw.isIsDiverging();
																	if (Boolean.valueOf(gwisDiverging)
																			.equals(Boolean.valueOf(true))) {
																		if (Boolean.valueOf(gwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			boolean gcwisDiverging = gcw
																					.isIsDiverging();
																			if (Boolean.valueOf(gcwisDiverging)
																					.equals(false)) {
																				if (Boolean.valueOf(gcwisDiverging)
																						.equals(false)) {
																					for (ParallelFlow flow : gwStep
																							.getInvokedFlows()) {
																						if (flow.getSteps()
																								.contains(step)) {
																							_result.add(new Object[] {
																									gwStep, flow,
																									process, gw, gcw,
																									node, sf, step, n2s,
																									gw2gs });
																						}
																					}
																				}
																			}

																		}
																	}

																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LastStepInPFlow_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(ParallelStep gwStep,
			ParallelFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf,
			Step step, FN2S n2s, GW2S gw2gs) {
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
		return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, isApplicableMatch,
				gwStep__flow____invokedFlows, process__gw____flowElements, process__gcw____flowElements,
				process__node____flowElements, process__sf____flowElements, gw__gcw______conv, sf__node____sourceRef,
				node__sf____outgoing, sf__gcw____targetRef, gcw__sf____incoming, flow__step____steps,
				n2s__node____source, n2s__step____target, gw2gs__gw____source, gw2gs__gwStep____target };
	}

	public static final Object[] pattern_LastStepInPFlow_2_4_bindingFBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, gwStep, flow, process, gw, gcw, node,
				sf, step, n2s, gw2gs);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, sf, step, n2s,
					gw2gs };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInPFlow_2_4_bindingAndBlackFBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs) {
		Object[] result_pattern_LastStepInPFlow_2_4_binding = pattern_LastStepInPFlow_2_4_bindingFBBBBBBBBBBBB(_this,
				isApplicableMatch, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs);
		if (result_pattern_LastStepInPFlow_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInPFlow_2_4_binding[0];

			Object[] result_pattern_LastStepInPFlow_2_4_black = pattern_LastStepInPFlow_2_4_blackB(csp);
			if (result_pattern_LastStepInPFlow_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, sf, step,
						n2s, gw2gs };
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

	public static final Object[] pattern_LastStepInPFlow_10_1_blackBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step) {
		if (!gwStep.equals(step)) {
			return new Object[] { _this, match, gwStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_10_2_bindingFBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, gwStep, flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, gwStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInPFlow_10_2_bindingAndBlackFBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step) {
		Object[] result_pattern_LastStepInPFlow_10_2_binding = pattern_LastStepInPFlow_10_2_bindingFBBBBB(_this, match,
				gwStep, flow, step);
		if (result_pattern_LastStepInPFlow_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInPFlow_10_2_binding[0];

			Object[] result_pattern_LastStepInPFlow_10_2_black = pattern_LastStepInPFlow_10_2_blackB(csp);
			if (result_pattern_LastStepInPFlow_10_2_black != null) {

				return new Object[] { csp, _this, match, gwStep, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInPFlow_10_3_expressionFBB(LastStepInPFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_10_4_blackBBBB(Match match, ParallelStep gwStep,
			ParallelFlow flow, Step step) {
		if (!gwStep.equals(step)) {
			return new Object[] { match, gwStep, flow, step };
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

	public static final Object[] pattern_LastStepInPFlow_10_5_blackBBBB(Match match, ParallelStep gwStep,
			ParallelFlow flow, Step step) {
		if (!gwStep.equals(step)) {
			return new Object[] { match, gwStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_10_5_greenBBBBFF(Match match, ParallelStep gwStep,
			ParallelFlow flow, Step step) {
		EMoflonEdge gwStep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(gwStep);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(step);
		String gwStep__flow____invokedFlows_name_prime = "invokedFlows";
		String flow__step____steps_name_prime = "steps";
		gwStep__flow____invokedFlows.setSrc(gwStep);
		gwStep__flow____invokedFlows.setTrg(flow);
		match.getContextEdges().add(gwStep__flow____invokedFlows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getContextEdges().add(flow__step____steps);
		gwStep__flow____invokedFlows.setName(gwStep__flow____invokedFlows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, gwStep, flow, step, gwStep__flow____invokedFlows, flow__step____steps };
	}

	public static final void pattern_LastStepInPFlow_10_6_expressionBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step) {
		_this.registerObjectsToMatch_BWD(match, gwStep, flow, step);

	}

	public static final boolean pattern_LastStepInPFlow_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LastStepInPFlow_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_11_1_bindingFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("gw");
		EObject _localVariable_4 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_5 = isApplicableMatch.getObject("node");
		EObject _localVariable_6 = isApplicableMatch.getObject("step");
		EObject _localVariable_7 = isApplicableMatch.getObject("n2s");
		EObject _localVariable_8 = isApplicableMatch.getObject("gw2gs");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpGw = _localVariable_3;
		EObject tmpGcw = _localVariable_4;
		EObject tmpNode = _localVariable_5;
		EObject tmpStep = _localVariable_6;
		EObject tmpN2s = _localVariable_7;
		EObject tmpGw2gs = _localVariable_8;
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
											return new Object[] { gwStep, flow, process, gw, gcw, node, step, n2s,
													gw2gs, isApplicableMatch };
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

	public static final Object[] pattern_LastStepInPFlow_11_1_blackBBBBBBBBBBFB(ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs,
			LastStepInPFlow _this, IsApplicableMatch isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, _this,
										csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_11_1_bindingAndBlackFFFFFFFFFBFB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LastStepInPFlow_11_1_binding = pattern_LastStepInPFlow_11_1_bindingFFFFFFFFFB(
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

			Object[] result_pattern_LastStepInPFlow_11_1_black = pattern_LastStepInPFlow_11_1_blackBBBBBBBBBBFB(gwStep,
					flow, process, gw, gcw, node, step, n2s, gw2gs, _this, isApplicableMatch);
			if (result_pattern_LastStepInPFlow_11_1_black != null) {
				CSP csp = (CSP) result_pattern_LastStepInPFlow_11_1_black[10];

				return new Object[] { gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, _this, csp,
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

	public static final Object[] pattern_LastStepInPFlow_11_3_blackBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw, EObject node, EObject sf,
			EObject step, EObject n2s, EObject gw2gs) {
		if (!gwStep.equals(process)) {
			if (!gwStep.equals(node)) {
				if (!gwStep.equals(sf)) {
					if (!gwStep.equals(step)) {
						if (!gwStep.equals(n2s)) {
							if (!flow.equals(gwStep)) {
								if (!flow.equals(process)) {
									if (!flow.equals(gw)) {
										if (!flow.equals(gcw)) {
											if (!flow.equals(node)) {
												if (!flow.equals(sf)) {
													if (!flow.equals(step)) {
														if (!flow.equals(n2s)) {
															if (!flow.equals(gw2gs)) {
																if (!process.equals(sf)) {
																	if (!process.equals(step)) {
																		if (!gw.equals(gwStep)) {
																			if (!gw.equals(process)) {
																				if (!gw.equals(node)) {
																					if (!gw.equals(sf)) {
																						if (!gw.equals(step)) {
																							if (!gw.equals(n2s)) {
																								if (!gw.equals(gw2gs)) {
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
																																	if (!node
																																			.equals(process)) {
																																		if (!node
																																				.equals(sf)) {
																																			if (!node
																																					.equals(step)) {
																																				if (!sf.equals(
																																						step)) {
																																					if (!n2s.equals(
																																							process)) {
																																						if (!n2s.equals(
																																								node)) {
																																							if (!n2s.equals(
																																									sf)) {
																																								if (!n2s.equals(
																																										step)) {
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
																																																	gw2gs };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final void pattern_LastStepInPFlow_11_5_expressionBBBBBBBBBBBB(LastStepInPFlow _this,
			PerformRuleResult ruleresult, EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw,
			EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs) {
		_this.registerObjects_BWD(ruleresult, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs);

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

	public static final Object[] pattern_LastStepInPFlow_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("gwStep");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("step");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		if (tmpGwStep instanceof ParallelStep) {
			ParallelStep gwStep = (ParallelStep) tmpGwStep;
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (tmpStep instanceof Step) {
					Step step = (Step) tmpStep;
					return new Object[] { gwStep, flow, step, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_12_2_blackBBFFBFFB(ParallelStep gwStep,
			ParallelFlow flow, Step step, Match match) {
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
										_result.add(new Object[] { gwStep, flow, gw, node, step, n2s, gw2gs, match });
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

	public static final Iterable<Object[]> pattern_LastStepInPFlow_12_3_blackBBFBFBBBB(ParallelStep gwStep,
			ParallelFlow flow, Gateway gw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (gwStep.getInvokedFlows().contains(flow)) {
					if (flow.getSteps().contains(step)) {
						if (step.equals(flow.get__last())) {
							if (node.equals(n2s.getSource())) {
								if (step.equals(n2s.getTarget())) {
									if (gw.equals(gw2gs.getSource())) {
										if (gwStep.equals(gw2gs.getTarget())) {
											Gateway gcw = gw.get__conv();
											if (gcw != null) {
												if (!gcw.equals(gw)) {
													if (!gcw.equals(node)) {
														boolean gwisDiverging = gw.isIsDiverging();
														if (Boolean.valueOf(gwisDiverging)
																.equals(Boolean.valueOf(true))) {
															if (Boolean.valueOf(gwisDiverging)
																	.equals(Boolean.valueOf(true))) {
																boolean gcwisDiverging = gcw.isIsDiverging();
																if (Boolean.valueOf(gcwisDiverging).equals(false)) {
																	if (Boolean.valueOf(gcwisDiverging).equals(false)) {
																		for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(gw,
																						SimpleBPMN.Process.class,
																						"flowElements")) {
																			if (process.getFlowElements()
																					.contains(gcw)) {
																				if (process.getFlowElements()
																						.contains(node)) {
																					_result.add(new Object[] { gwStep,
																							flow, process, gw, gcw,
																							node, step, n2s, gw2gs });
																				}
																			}
																		}
																	}
																}

															}
														}

													}
												}
											}

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

	public static final Object[] pattern_LastStepInPFlow_12_3_greenBBBBBBBBBFFFFFFFFFFFF(ParallelStep gwStep,
			ParallelFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s,
			GW2S gw2gs) {
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
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(n2s);
		isApplicableMatch.getAllContextElements().add(gw2gs);
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
		return new Object[] { gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, isApplicableMatch,
				gwStep__flow____invokedFlows, process__gw____flowElements, process__gcw____flowElements,
				process__node____flowElements, gw__gcw______conv, flow__step____steps, flow__step______last,
				n2s__node____source, n2s__step____target, gw2gs__gw____source, gw2gs__gwStep____target };
	}

	public static final Object[] pattern_LastStepInPFlow_12_4_bindingFBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, gwStep, flow, process, gw, gcw, node,
				step, n2s, gw2gs);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, step, n2s,
					gw2gs };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInPFlow_12_4_bindingAndBlackFBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs) {
		Object[] result_pattern_LastStepInPFlow_12_4_binding = pattern_LastStepInPFlow_12_4_bindingFBBBBBBBBBBB(_this,
				isApplicableMatch, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs);
		if (result_pattern_LastStepInPFlow_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInPFlow_12_4_binding[0];

			Object[] result_pattern_LastStepInPFlow_12_4_black = pattern_LastStepInPFlow_12_4_blackB(csp);
			if (result_pattern_LastStepInPFlow_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, step, n2s,
						gw2gs };
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

	public static final Object[] pattern_LastStepInPFlow_20_2_black_nac_0BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_125125 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_125125)) {
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
												if (pattern_LastStepInPFlow_20_2_black_nac_0BB(sf, process) == null) {
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
																				_result.add(new Object[] { process, gw,
																						gcw, node, sf,
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

	public static final Object[] pattern_LastStepInPFlow_21_2_black_nac_0BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_548268 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_548268)) {
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
												if (pattern_LastStepInPFlow_21_2_black_nac_0BB(sf, process) == null) {
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
																				_result.add(new Object[] { process, gw,
																						gcw, node, sf,
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

	public static final Object[] pattern_LastStepInPFlow_22_2_black_nac_0BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_844247 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_844247)) {
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
												if (pattern_LastStepInPFlow_22_2_black_nac_0BB(sf, process) == null) {
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
																				_result.add(new Object[] { process, gw,
																						gcw, node, sf,
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

	public static final Object[] pattern_LastStepInPFlow_23_2_black_nac_0BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_89522 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_89522)) {
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
												if (pattern_LastStepInPFlow_23_2_black_nac_0BB(sf, process) == null) {
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
																				_result.add(new Object[] { process, gw,
																						gcw, node, sf,
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

	public static final Object[] pattern_LastStepInPFlow_24_2_black_nac_0BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_467719 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_467719)) {
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
												if (pattern_LastStepInPFlow_24_2_black_nac_0BB(sf, process) == null) {
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
																				_result.add(new Object[] { process, gw,
																						gcw, node, sf,
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

	public static final Iterable<Object[]> pattern_LastStepInPFlow_25_2_blackFFFB(EMoflonEdge _edge___last) {
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
								_result.add(new Object[] { gwStep, flow, step, _edge___last });
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

	public static final boolean pattern_LastStepInPFlow_25_3_expressionFBBBBB(LastStepInPFlow _this, Match match,
			ParallelStep gwStep, ParallelFlow flow, Step step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, gwStep, flow, step);
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

	public static final Object[] pattern_LastStepInPFlow_28_1_blackB(LastStepInPFlow _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LastStepInPFlow_28_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_LastStepInPFlow_28_2_bindingFFFFFFFFBB(Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("gwStep");
		EObject _localVariable_1 = targetMatch.getObject("flow");
		EObject _localVariable_2 = sourceMatch.getObject("process");
		EObject _localVariable_3 = sourceMatch.getObject("gw");
		EObject _localVariable_4 = sourceMatch.getObject("gcw");
		EObject _localVariable_5 = sourceMatch.getObject("node");
		EObject _localVariable_6 = sourceMatch.getObject("sf");
		EObject _localVariable_7 = targetMatch.getObject("step");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpGw = _localVariable_3;
		EObject tmpGcw = _localVariable_4;
		EObject tmpNode = _localVariable_5;
		EObject tmpSf = _localVariable_6;
		EObject tmpStep = _localVariable_7;
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
										return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step,
												targetMatch, sourceMatch };
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

	public static final Iterable<Object[]> pattern_LastStepInPFlow_28_2_blackBBBBBBBBFFBB(ParallelStep gwStep,
			ParallelFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf,
			Step step, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						if (!sourceMatch.equals(targetMatch)) {
							if (gwStep.getInvokedFlows().contains(flow)) {
								if (process.getFlowElements().contains(gw)) {
									if (process.getFlowElements().contains(gcw)) {
										if (process.getFlowElements().contains(node)) {
											if (process.getFlowElements().contains(sf)) {
												if (gcw.equals(gw.get__conv())) {
													if (node.equals(sf.getSourceRef())) {
														if (gcw.equals(sf.getTargetRef())) {
															if (flow.getSteps().contains(step)) {
																if (step.equals(flow.get__last())) {
																	boolean gwisDiverging = gw.isIsDiverging();
																	if (Boolean.valueOf(gwisDiverging)
																			.equals(Boolean.valueOf(true))) {
																		if (Boolean.valueOf(gwisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			boolean gcwisDiverging = gcw
																					.isIsDiverging();
																			if (Boolean.valueOf(gcwisDiverging)
																					.equals(false)) {
																				if (Boolean.valueOf(gcwisDiverging)
																						.equals(false)) {
																					for (FN2S n2s : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									node, FN2S.class,
																									"source")) {
																						if (step.equals(
																								n2s.getTarget())) {
																							for (GW2S gw2gs : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											gw,
																											GW2S.class,
																											"source")) {
																								if (gwStep.equals(gw2gs
																										.getTarget())) {
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
		}
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_28_2_greenBBBBBBBBBBBBF(ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "LastStepInPFlow";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(sf);
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(n2s);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, sourceMatch, targetMatch,
				isApplicableMatch };
	}

	public static final Object[] pattern_LastStepInPFlow_28_3_bindingFBBBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatchCC isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, gwStep, flow, process, gw, gcw, node,
				sf, step, n2s, gw2gs, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, sf, step, n2s,
					gw2gs, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_28_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInPFlow_28_3_bindingAndBlackFBBBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatchCC isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_LastStepInPFlow_28_3_binding = pattern_LastStepInPFlow_28_3_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, sourceMatch,
				targetMatch);
		if (result_pattern_LastStepInPFlow_28_3_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInPFlow_28_3_binding[0];

			Object[] result_pattern_LastStepInPFlow_28_3_black = pattern_LastStepInPFlow_28_3_blackB(csp);
			if (result_pattern_LastStepInPFlow_28_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, sf, step,
						n2s, gw2gs, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_28_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_LastStepInPFlow_28_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LastStepInPFlow";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LastStepInPFlow_28_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_31_1_blackB(LastStepInPFlow _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LastStepInPFlow_31_2_bindingFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
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
												return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step,
														n2s, gw2gs, isApplicableMatch };
											}
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

	public static final Object[] pattern_LastStepInPFlow_31_2_blackBBBBBBBBBBB(ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs, IsApplicableMatchCC isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						if (gwStep.getInvokedFlows().contains(flow)) {
							if (process.getFlowElements().contains(gw)) {
								if (process.getFlowElements().contains(gcw)) {
									if (process.getFlowElements().contains(node)) {
										if (process.getFlowElements().contains(sf)) {
											if (gcw.equals(gw.get__conv())) {
												if (node.equals(sf.getSourceRef())) {
													if (gcw.equals(sf.getTargetRef())) {
														if (flow.getSteps().contains(step)) {
															if (step.equals(flow.get__last())) {
																if (node.equals(n2s.getSource())) {
																	if (step.equals(n2s.getTarget())) {
																		if (gw.equals(gw2gs.getSource())) {
																			if (gwStep.equals(gw2gs.getTarget())) {
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
																								return new Object[] {
																										gwStep, flow,
																										process, gw,
																										gcw, node, sf,
																										step, n2s,
																										gw2gs,
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
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_31_2_bindingAndBlackFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_LastStepInPFlow_31_2_binding = pattern_LastStepInPFlow_31_2_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LastStepInPFlow_31_2_binding != null) {
			ParallelStep gwStep = (ParallelStep) result_pattern_LastStepInPFlow_31_2_binding[0];
			ParallelFlow flow = (ParallelFlow) result_pattern_LastStepInPFlow_31_2_binding[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_LastStepInPFlow_31_2_binding[2];
			Gateway gw = (Gateway) result_pattern_LastStepInPFlow_31_2_binding[3];
			Gateway gcw = (Gateway) result_pattern_LastStepInPFlow_31_2_binding[4];
			FlowNode node = (FlowNode) result_pattern_LastStepInPFlow_31_2_binding[5];
			SequenceFlow sf = (SequenceFlow) result_pattern_LastStepInPFlow_31_2_binding[6];
			Step step = (Step) result_pattern_LastStepInPFlow_31_2_binding[7];
			FN2S n2s = (FN2S) result_pattern_LastStepInPFlow_31_2_binding[8];
			GW2S gw2gs = (GW2S) result_pattern_LastStepInPFlow_31_2_binding[9];

			Object[] result_pattern_LastStepInPFlow_31_2_black = pattern_LastStepInPFlow_31_2_blackBBBBBBBBBBB(gwStep,
					flow, process, gw, gcw, node, sf, step, n2s, gw2gs, isApplicableMatch);
			if (result_pattern_LastStepInPFlow_31_2_black != null) {

				return new Object[] { gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_31_2_greenF() {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { result };
	}

	public static final PerformRuleResult pattern_LastStepInPFlow_31_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_32_1_blackB(LastStepInPFlow _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LastStepInPFlow_32_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LastStepInPFlow_32_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			ParallelStep gwStep) {
		if (ruleResult.getTargetObjects().contains(gwStep)) {
			return new Object[] { ruleResult, gwStep };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_32_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			ParallelFlow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_32_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			Step step) {
		if (ruleResult.getTargetObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_32_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			FN2S n2s) {
		if (ruleResult.getCorrObjects().contains(n2s)) {
			return new Object[] { ruleResult, n2s };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_32_2_black_nac_4BB(ModelgeneratorRuleResult ruleResult,
			FlowNode node) {
		if (ruleResult.getSourceObjects().contains(node)) {
			return new Object[] { ruleResult, node };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_32_2_black_nac_5BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_32_2_black_nac_6BB(ModelgeneratorRuleResult ruleResult,
			Gateway gw) {
		if (ruleResult.getSourceObjects().contains(gw)) {
			return new Object[] { ruleResult, gw };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_32_2_black_nac_7BB(ModelgeneratorRuleResult ruleResult,
			Gateway gcw) {
		if (ruleResult.getSourceObjects().contains(gcw)) {
			return new Object[] { ruleResult, gcw };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_32_2_black_nac_8BB(ModelgeneratorRuleResult ruleResult,
			GW2S gw2gs) {
		if (ruleResult.getCorrObjects().contains(gw2gs)) {
			return new Object[] { ruleResult, gw2gs };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInPFlow_32_2_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList n2sList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpN2s : n2sList.getEntryObjects()) {
				if (tmpN2s instanceof FN2S) {
					FN2S n2s = (FN2S) tmpN2s;
					Step step = n2s.getTarget();
					if (step != null) {
						FlowNode node = n2s.getSource();
						if (node != null) {
							if (pattern_LastStepInPFlow_32_2_black_nac_3BB(ruleResult, n2s) == null) {
								if (pattern_LastStepInPFlow_32_2_black_nac_2BB(ruleResult, step) == null) {
									if (pattern_LastStepInPFlow_32_2_black_nac_4BB(ruleResult, node) == null) {
										for (Flow tmpFlow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(step, Flow.class, "steps")) {
											if (tmpFlow instanceof ParallelFlow) {
												ParallelFlow flow = (ParallelFlow) tmpFlow;
												if (pattern_LastStepInPFlow_32_2_black_nac_1BB(ruleResult,
														flow) == null) {
													for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(node, SimpleBPMN.Process.class,
																	"flowElements")) {
														if (pattern_LastStepInPFlow_32_2_black_nac_5BB(ruleResult,
																process) == null) {
															for (FlowElement tmpGw : process.getFlowElements()) {
																if (tmpGw instanceof Gateway) {
																	Gateway gw = (Gateway) tmpGw;
																	if (!gw.equals(node)) {
																		Gateway gcw = gw.get__conv();
																		if (gcw != null) {
																			if (!gcw.equals(node)) {
																				if (!gcw.equals(gw)) {
																					if (process.getFlowElements()
																							.contains(gcw)) {
																						boolean gwisDiverging = gw
																								.isIsDiverging();
																						if (Boolean
																								.valueOf(gwisDiverging)
																								.equals(Boolean.valueOf(
																										true))) {
																							if (Boolean
																									.valueOf(
																											gwisDiverging)
																									.equals(Boolean
																											.valueOf(
																													true))) {
																								boolean gcwisDiverging = gcw
																										.isIsDiverging();
																								if (Boolean
																										.valueOf(
																												gcwisDiverging)
																										.equals(false)) {
																									if (Boolean
																											.valueOf(
																													gcwisDiverging)
																											.equals(false)) {
																										if (pattern_LastStepInPFlow_32_2_black_nac_6BB(
																												ruleResult,
																												gw) == null) {
																											if (pattern_LastStepInPFlow_32_2_black_nac_7BB(
																													ruleResult,
																													gcw) == null) {
																												for (ParallelStep gwStep : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																flow,
																																ParallelStep.class,
																																"invokedFlows")) {
																													if (!gwStep
																															.equals(step)) {
																														if (pattern_LastStepInPFlow_32_2_black_nac_0BB(
																																ruleResult,
																																gwStep) == null) {
																															for (GW2S gw2gs : org.moflon.core.utilities.eMoflonEMFUtil
																																	.getOppositeReferenceTyped(
																																			gw,
																																			GW2S.class,
																																			"source")) {
																																if (gwStep
																																		.equals(gw2gs
																																				.getTarget())) {
																																	if (pattern_LastStepInPFlow_32_2_black_nac_8BB(
																																			ruleResult,
																																			gw2gs) == null) {
																																		_result.add(
																																				new Object[] {
																																						n2sList,
																																						gwStep,
																																						flow,
																																						step,
																																						n2s,
																																						node,
																																						process,
																																						gw,
																																						gcw,
																																						gw2gs,
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
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LastStepInPFlow_32_3_bindingFBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, gwStep, flow, process, gw, gcw, node,
				step, n2s, gw2gs, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInPFlow_32_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInPFlow_32_3_bindingAndBlackFBBBBBBBBBBBB(LastStepInPFlow _this,
			IsApplicableMatch isApplicableMatch, ParallelStep gwStep, ParallelFlow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LastStepInPFlow_32_3_binding = pattern_LastStepInPFlow_32_3_bindingFBBBBBBBBBBBB(_this,
				isApplicableMatch, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, ruleResult);
		if (result_pattern_LastStepInPFlow_32_3_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInPFlow_32_3_binding[0];

			Object[] result_pattern_LastStepInPFlow_32_3_black = pattern_LastStepInPFlow_32_3_blackB(csp);
			if (result_pattern_LastStepInPFlow_32_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, flow, process, gw, gcw, node, step, n2s,
						gw2gs, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInPFlow_32_4_expressionFBB(LastStepInPFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInPFlow_32_5_blackBBBBBBBBB(ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						boolean gwisDiverging = gw.isIsDiverging();
						if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
							if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
								boolean gcwisDiverging = gcw.isIsDiverging();
								if (Boolean.valueOf(gcwisDiverging).equals(false)) {
									if (Boolean.valueOf(gcwisDiverging).equals(false)) {
										return new Object[] { gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs };
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

	public static final Object[] pattern_LastStepInPFlow_32_6_blackBBBBBBBBBB(ParallelStep gwStep, ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs,
			ModelgeneratorRuleResult ruleResult) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						boolean gwisDiverging = gw.isIsDiverging();
						if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
							if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
								boolean gcwisDiverging = gcw.isIsDiverging();
								if (Boolean.valueOf(gcwisDiverging).equals(false)) {
									if (Boolean.valueOf(gcwisDiverging).equals(false)) {
										return new Object[] { gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs,
												ruleResult };
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

	public static final Object[] pattern_LastStepInPFlow_32_6_greenBBBBFBB(ParallelFlow flow,
			SimpleBPMN.Process process, Gateway gcw, FlowNode node, Step step, ModelgeneratorRuleResult ruleResult) {
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		flow.set__last(step);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(sf);
		sf.setSourceRef(node);
		sf.setTargetRef(gcw);
		ruleResult.getSourceObjects().add(sf);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { flow, process, gcw, node, sf, step, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LastStepInPFlow_32_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LastStepInPFlowImpl