/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.FN2S;
import Bpmn2UseCase.GW2S;

import Bpmn2UseCase.Rules.LastStepInAltFlow;
import Bpmn2UseCase.Rules.RulesPackage;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.AlternativeFlow;
import SimpleUseCase.ChoiceStep;
import SimpleUseCase.Flow;
import SimpleUseCase.Step;
import SimpleUseCase.StepAlternative;

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
 * An implementation of the model object '<em><b>Last Step In Alt Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LastStepInAltFlowImpl extends AbstractRuleImpl implements LastStepInAltFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LastStepInAltFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLastStepInAltFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			SequenceFlow sf) {
		// initial bindings
		Object[] result1_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_0_1_blackBBBBBBB(this, match, process,
				gw, gcw, node, sf);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = " + gw + ", "
							+ "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_0_2_bindingAndBlackFBBBBBBB(this, match, process, gw, gcw, node, sf);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = " + gw
					+ ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_0_4_blackBBBBBB(match, process, gw,
					gcw, node, sf);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = "
						+ gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
			}
			LastStepInAltFlowImpl.pattern_LastStepInAltFlow_0_4_greenBBBBBFFFFF(match, process, gcw, node, sf);
			// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result4_green[6];
			// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result4_green[7];
			// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_0_5_blackBBBBBB(match, process, gw,
					gcw, node, sf);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = "
						+ gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
			}
			LastStepInAltFlowImpl.pattern_LastStepInAltFlow_0_5_greenBBBBBFFFF(match, process, gw, gcw, node);
			// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge process__node____flowElements = (EMoflonEdge) result5_green[7];
			// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result5_green[8];

			// register objects to match
			LastStepInAltFlowImpl.pattern_LastStepInAltFlow_0_6_expressionBBBBBBB(this, match, process, gw, gcw, node,
					sf);
			return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_0_7_expressionF();
		} else {
			return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_1_1_bindingAndBlackFFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		StepAlternative alt = (StepAlternative) result1_bindingAndBlack[0];
		ChoiceStep gwStep = (ChoiceStep) result1_bindingAndBlack[1];
		AlternativeFlow flow = (AlternativeFlow) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		Gateway gw = (Gateway) result1_bindingAndBlack[4];
		Gateway gcw = (Gateway) result1_bindingAndBlack[5];
		FlowNode node = (FlowNode) result1_bindingAndBlack[6];
		SequenceFlow sf = (SequenceFlow) result1_bindingAndBlack[7];
		Step step = (Step) result1_bindingAndBlack[8];
		FN2S n2s = (FN2S) result1_bindingAndBlack[9];
		GW2S gw2gs = (GW2S) result1_bindingAndBlack[10];
		// CSP csp = (CSP) result1_bindingAndBlack[12];
		LastStepInAltFlowImpl.pattern_LastStepInAltFlow_1_1_greenBBBB(alt, gwStep, flow, step);

		// collect translated elements
		Object[] result2_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_1_2_blackB(sf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ".");
		}
		Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_1_2_greenFB(sf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_1_3_blackBBBBBBBBBBBB(ruleresult, alt,
				gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[alt] = " + alt + ", " + "[gwStep] = " + gwStep + ", "
					+ "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = "
					+ gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ", " + "[step] = " + step + ", "
					+ "[n2s] = " + n2s + ", " + "[gw2gs] = " + gw2gs + ".");
		}
		LastStepInAltFlowImpl.pattern_LastStepInAltFlow_1_3_greenBBBBBBBBBFFFFFFF(ruleresult, alt, gwStep, flow,
				process, gcw, node, sf, step);
				// EMoflonEdge alt__gwStep______hasContinue = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step______last = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		LastStepInAltFlowImpl.pattern_LastStepInAltFlow_1_5_expressionBBBBBBBBBBBBB(this, ruleresult, alt, gwStep, flow,
				process, gw, gcw, node, sf, step, n2s, gw2gs);
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		Gateway gw = (Gateway) result2_binding[1];
		Gateway gcw = (Gateway) result2_binding[2];
		FlowNode node = (FlowNode) result2_binding[3];
		SequenceFlow sf = (SequenceFlow) result2_binding[4];
		for (Object[] result2_black : LastStepInAltFlowImpl.pattern_LastStepInAltFlow_2_2_blackFBBBBBFFFB(process, gw,
				gcw, node, sf, match)) {
			ChoiceStep gwStep = (ChoiceStep) result2_black[0];
			Step step = (Step) result2_black[6];
			FN2S n2s = (FN2S) result2_black[7];
			GW2S gw2gs = (GW2S) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : LastStepInAltFlowImpl.pattern_LastStepInAltFlow_2_3_blackFBFBBBBBBBB(gwStep,
					process, gw, gcw, node, sf, step, n2s, gw2gs)) {
				StepAlternative alt = (StepAlternative) result3_black[0];
				AlternativeFlow flow = (AlternativeFlow) result3_black[2];
				Object[] result3_green = LastStepInAltFlowImpl
						.pattern_LastStepInAltFlow_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFF(alt, gwStep, flow, process, gw,
								gcw, node, sf, step, n2s, gw2gs);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge alt__flow____ref = (EMoflonEdge) result3_green[12];
				// EMoflonEdge gwStep__alt____stepAlternatives = (EMoflonEdge) result3_green[13];
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

				// solve CSP
				Object[] result4_bindingAndBlack = LastStepInAltFlowImpl
						.pattern_LastStepInAltFlow_2_4_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch, alt,
								gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[alt] = " + alt + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", "
							+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", "
							+ "[node] = " + node + ", " + "[sf] = " + sf + ", " + "[step] = " + step + ", " + "[n2s] = "
							+ n2s + ", " + "[gw2gs] = " + gw2gs + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, StepAlternative alt, ChoiceStep gwStep,
			AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf,
			Step step, FN2S n2s, GW2S gw2gs) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("alt", alt);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject alt, EObject gwStep, EObject flow,
			EObject process, EObject gw, EObject gcw, EObject node, EObject sf, EObject step, EObject n2s,
			EObject gw2gs) {
		ruleresult.registerObject("alt", alt);
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
	public boolean isAppropriate_BWD(Match match, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			Step step) {
		// initial bindings
		Object[] result1_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_10_1_blackBBBBBB(this, match, alt,
				gwStep, flow, step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[gwStep] = "
					+ gwStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_10_2_bindingAndBlackFBBBBBB(this, match, alt, gwStep, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[gwStep] = " + gwStep
					+ ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_10_4_blackBBBBB(match, alt, gwStep,
					flow, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[gwStep] = "
						+ gwStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			LastStepInAltFlowImpl.pattern_LastStepInAltFlow_10_4_greenBBBBBFF(match, alt, gwStep, flow, step);
			// EMoflonEdge alt__gwStep______hasContinue = (EMoflonEdge) result4_green[5];
			// EMoflonEdge flow__step______last = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_10_5_blackBBBBB(match, alt, gwStep,
					flow, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[gwStep] = "
						+ gwStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			LastStepInAltFlowImpl.pattern_LastStepInAltFlow_10_5_greenBBBBBFFF(match, alt, gwStep, flow, step);
			// EMoflonEdge alt__flow____ref = (EMoflonEdge) result5_green[5];
			// EMoflonEdge gwStep__alt____stepAlternatives = (EMoflonEdge) result5_green[6];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result5_green[7];

			// register objects to match
			LastStepInAltFlowImpl.pattern_LastStepInAltFlow_10_6_expressionBBBBBB(this, match, alt, gwStep, flow, step);
			return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_10_7_expressionF();
		} else {
			return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_11_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		StepAlternative alt = (StepAlternative) result1_bindingAndBlack[0];
		ChoiceStep gwStep = (ChoiceStep) result1_bindingAndBlack[1];
		AlternativeFlow flow = (AlternativeFlow) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		Gateway gw = (Gateway) result1_bindingAndBlack[4];
		Gateway gcw = (Gateway) result1_bindingAndBlack[5];
		FlowNode node = (FlowNode) result1_bindingAndBlack[6];
		Step step = (Step) result1_bindingAndBlack[7];
		FN2S n2s = (FN2S) result1_bindingAndBlack[8];
		GW2S gw2gs = (GW2S) result1_bindingAndBlack[9];
		// CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_11_1_greenBBBF(process, gcw, node);
		SequenceFlow sf = (SequenceFlow) result1_green[3];

		// collect translated elements
		Object[] result2_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_11_2_blackB(sf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ".");
		}
		Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_11_2_greenFB(sf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_11_3_blackBBBBBBBBBBBB(ruleresult, alt,
				gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[alt] = " + alt + ", " + "[gwStep] = " + gwStep + ", "
					+ "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = "
					+ gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ", " + "[step] = " + step + ", "
					+ "[n2s] = " + n2s + ", " + "[gw2gs] = " + gw2gs + ".");
		}
		LastStepInAltFlowImpl.pattern_LastStepInAltFlow_11_3_greenBBBBBBBBBFFFFFFF(ruleresult, alt, gwStep, flow,
				process, gcw, node, sf, step);
				// EMoflonEdge alt__gwStep______hasContinue = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step______last = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		LastStepInAltFlowImpl.pattern_LastStepInAltFlow_11_5_expressionBBBBBBBBBBBBB(this, ruleresult, alt, gwStep,
				flow, process, gw, gcw, node, sf, step, n2s, gw2gs);
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		StepAlternative alt = (StepAlternative) result2_binding[0];
		ChoiceStep gwStep = (ChoiceStep) result2_binding[1];
		AlternativeFlow flow = (AlternativeFlow) result2_binding[2];
		Step step = (Step) result2_binding[3];
		for (Object[] result2_black : LastStepInAltFlowImpl.pattern_LastStepInAltFlow_12_2_blackBBBFFBFFB(alt, gwStep,
				flow, step, match)) {
			Gateway gw = (Gateway) result2_black[3];
			FlowNode node = (FlowNode) result2_black[4];
			FN2S n2s = (FN2S) result2_black[6];
			GW2S gw2gs = (GW2S) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : LastStepInAltFlowImpl.pattern_LastStepInAltFlow_12_3_blackBBBFBFBBBB(alt,
					gwStep, flow, gw, node, step, n2s, gw2gs)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[3];
				Gateway gcw = (Gateway) result3_black[5];
				Object[] result3_green = LastStepInAltFlowImpl
						.pattern_LastStepInAltFlow_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFF(alt, gwStep, flow, process, gw,
								gcw, node, step, n2s, gw2gs);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge alt__flow____ref = (EMoflonEdge) result3_green[11];
				// EMoflonEdge alt__gwStep______hasContinue = (EMoflonEdge) result3_green[12];
				// EMoflonEdge gwStep__alt____stepAlternatives = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flow__step______last = (EMoflonEdge) result3_green[19];
				// EMoflonEdge n2s__node____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge n2s__step____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge gw2gs__gw____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge gw2gs__gwStep____target = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = LastStepInAltFlowImpl
						.pattern_LastStepInAltFlow_12_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, alt,
								gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[alt] = " + alt + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", "
							+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", "
							+ "[node] = " + node + ", " + "[step] = " + step + ", " + "[n2s] = " + n2s + ", "
							+ "[gw2gs] = " + gw2gs + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			Step step) {
		match.registerObject("alt", alt);
		match.registerObject("gwStep", gwStep);
		match.registerObject("flow", flow);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			Step step) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, StepAlternative alt, ChoiceStep gwStep,
			AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step,
			FN2S n2s, GW2S gw2gs) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("alt", alt);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject alt, EObject gwStep, EObject flow,
			EObject process, EObject gw, EObject gcw, EObject node, EObject sf, EObject step, EObject n2s,
			EObject gw2gs) {
		ruleresult.registerObject("alt", alt);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_78(EMoflonEdge _edge___hasContinue) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_20_2_blackFFFFB(_edge___hasContinue)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			ChoiceStep gwStep = (ChoiceStep) result2_black[1];
			AlternativeFlow flow = (AlternativeFlow) result2_black[2];
			Step step = (Step) result2_black[3];
			Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_20_3_expressionFBBBBBB(this, match, alt, gwStep, flow,
					step)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_249(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_21_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_21_3_expressionFBBBBBBB(this, match, process, gw, gcw,
					node, sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_250(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_22_2_blackFFFFFB(_edge_sourceRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_22_3_expressionFBBBBBBB(this, match, process, gw, gcw,
					node, sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_251(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_23_2_blackFFFFFB(_edge_outgoing)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_23_3_expressionFBBBBBBB(this, match, process, gw, gcw,
					node, sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_252(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_24_2_blackFFFFFB(_edge_targetRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_24_3_expressionFBBBBBBB(this, match, process, gw, gcw,
					node, sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_253(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_25_2_blackFFFFFB(_edge_incoming)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_25_3_expressionFBBBBBBB(this, match, process, gw, gcw,
					node, sf)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_79(EMoflonEdge _edge___last) {
		// prepare return value
		Object[] result1_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : LastStepInAltFlowImpl.pattern_LastStepInAltFlow_26_2_blackFFFFB(_edge___last)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			ChoiceStep gwStep = (ChoiceStep) result2_black[1];
			AlternativeFlow flow = (AlternativeFlow) result2_black[2];
			Step step = (Step) result2_black[3];
			Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_26_3_expressionFBBBBBB(this, match, alt, gwStep, flow,
					step)) {
				// Ensure that the correct types of elements are matched
				if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LastStepInAltFlow");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForAlt = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("alt")).findAny();
		SimpleUseCase.StepAlternative alt = (SimpleUseCase.StepAlternative) matchForAlt.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGwStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gwStep")).findAny();
		SimpleUseCase.ChoiceStep gwStep = (SimpleUseCase.ChoiceStep) matchForGwStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.AlternativeFlow flow = (SimpleUseCase.AlternativeFlow) matchForFlow.get().getNode();

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
		ruleResult.setRule("LastStepInAltFlow");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForAlt = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("alt")).findAny();
		SimpleUseCase.StepAlternative alt = (SimpleUseCase.StepAlternative) matchForAlt.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGwStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gwStep")).findAny();
		SimpleUseCase.ChoiceStep gwStep = (SimpleUseCase.ChoiceStep) matchForGwStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.AlternativeFlow flow = (SimpleUseCase.AlternativeFlow) matchForFlow.get().getNode();

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
		Object[] result1_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_29_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_29_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_29_2_bindingFFFFFFFFFBB(targetMatch,
				sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		StepAlternative alt = (StepAlternative) result2_binding[0];
		ChoiceStep gwStep = (ChoiceStep) result2_binding[1];
		AlternativeFlow flow = (AlternativeFlow) result2_binding[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[3];
		Gateway gw = (Gateway) result2_binding[4];
		Gateway gcw = (Gateway) result2_binding[5];
		FlowNode node = (FlowNode) result2_binding[6];
		SequenceFlow sf = (SequenceFlow) result2_binding[7];
		Step step = (Step) result2_binding[8];
		for (Object[] result2_black : LastStepInAltFlowImpl.pattern_LastStepInAltFlow_29_2_blackBBBBBBBBBFFBB(alt,
				gwStep, flow, process, gw, gcw, node, sf, step, sourceMatch, targetMatch)) {
			FN2S n2s = (FN2S) result2_black[9];
			GW2S gw2gs = (GW2S) result2_black[10];
			Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_29_2_greenBBBBBBBBBBBBBF(alt,
					gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[13];

			// check csp
			Object[] result3_bindingAndBlack = LastStepInAltFlowImpl
					.pattern_LastStepInAltFlow_29_3_bindingAndBlackFBBBBBBBBBBBBBBB(this, isApplicableMatch, alt,
							gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_29_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				LastStepInAltFlowImpl.pattern_LastStepInAltFlow_29_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_29_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, StepAlternative alt, ChoiceStep gwStep,
			AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf,
			Step step, FN2S n2s, GW2S gw2gs, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("alt", alt);
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
		Object[] result1_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_32_2_bindingAndBlackFFFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// StepAlternative alt = (StepAlternative) result2_bindingAndBlack[0];
		// ChoiceStep gwStep = (ChoiceStep) result2_bindingAndBlack[1];
		// AlternativeFlow flow = (AlternativeFlow) result2_bindingAndBlack[2];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[3];
		// Gateway gw = (Gateway) result2_bindingAndBlack[4];
		// Gateway gcw = (Gateway) result2_bindingAndBlack[5];
		// FlowNode node = (FlowNode) result2_bindingAndBlack[6];
		// SequenceFlow sf = (SequenceFlow) result2_bindingAndBlack[7];
		// Step step = (Step) result2_bindingAndBlack[8];
		// FN2S n2s = (FN2S) result2_bindingAndBlack[9];
		// GW2S gw2gs = (GW2S) result2_bindingAndBlack[10];
		Object[] result2_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_32_2_greenF();
		PerformRuleResult result = (PerformRuleResult) result2_green[0];

		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_32_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, FN2S n2sParameter) {
		// create result
		Object[] result1_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_33_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_33_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : LastStepInAltFlowImpl
				.pattern_LastStepInAltFlow_33_2_blackFFFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList n2sList = (RuleEntryList) result2_black[0];
			StepAlternative alt = (StepAlternative) result2_black[1];
			AlternativeFlow flow = (AlternativeFlow) result2_black[2];
			Step step = (Step) result2_black[3];
			FN2S n2s = (FN2S) result2_black[4];
			FlowNode node = (FlowNode) result2_black[5];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[6];
			Gateway gw = (Gateway) result2_black[7];
			Gateway gcw = (Gateway) result2_black[8];
			GW2S gw2gs = (GW2S) result2_black[9];
			ChoiceStep gwStep = (ChoiceStep) result2_black[10];

			// solve CSP
			Object[] result3_bindingAndBlack = LastStepInAltFlowImpl
					.pattern_LastStepInAltFlow_33_3_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch, alt, gwStep,
							flow, process, gw, gcw, node, step, n2s, gw2gs, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[alt] = " + alt + ", "
						+ "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", "
						+ "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[step] = "
						+ step + ", " + "[n2s] = " + n2s + ", " + "[gw2gs] = " + gw2gs + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (LastStepInAltFlowImpl.pattern_LastStepInAltFlow_33_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_33_5_blackBBBBBBBBBB(alt,
						gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs);
				if (result5_black != null) {

					// perform
					Object[] result6_black = LastStepInAltFlowImpl.pattern_LastStepInAltFlow_33_6_blackBBBBBBBBBBB(alt,
							gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[alt] = " + alt + ", " + "[gwStep] = " + gwStep + ", " + "[flow] = " + flow + ", "
								+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", "
								+ "[node] = " + node + ", " + "[step] = " + step + ", " + "[n2s] = " + n2s + ", "
								+ "[gw2gs] = " + gw2gs + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					LastStepInAltFlowImpl.pattern_LastStepInAltFlow_33_6_greenBBBBBBFBB(alt, gwStep, flow, process, gcw,
							node, step, ruleResult);
					// SequenceFlow sf = (SequenceFlow) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return LastStepInAltFlowImpl.pattern_LastStepInAltFlow_33_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, StepAlternative alt, ChoiceStep gwStep,
			AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step,
			FN2S n2s, GW2S gw2gs, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("alt", alt);
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
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(Gateway) arguments.get(2), (Gateway) arguments.get(3), (FlowNode) arguments.get(4),
					(SequenceFlow) arguments.get(5));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(Gateway) arguments.get(2), (Gateway) arguments.get(3), (FlowNode) arguments.get(4),
					(SequenceFlow) arguments.get(5));
			return null;
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(Gateway) arguments.get(2), (Gateway) arguments.get(3), (FlowNode) arguments.get(4),
					(SequenceFlow) arguments.get(5));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (StepAlternative) arguments.get(1),
					(ChoiceStep) arguments.get(2), (AlternativeFlow) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4), (Gateway) arguments.get(5), (Gateway) arguments.get(6),
					(FlowNode) arguments.get(7), (SequenceFlow) arguments.get(8), (Step) arguments.get(9),
					(FN2S) arguments.get(10), (GW2S) arguments.get(11));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD__MATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_STEP:
			return isAppropriate_BWD((Match) arguments.get(0), (StepAlternative) arguments.get(1),
					(ChoiceStep) arguments.get(2), (AlternativeFlow) arguments.get(3), (Step) arguments.get(4));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_STEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (StepAlternative) arguments.get(1),
					(ChoiceStep) arguments.get(2), (AlternativeFlow) arguments.get(3), (Step) arguments.get(4));
			return null;
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_STEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (StepAlternative) arguments.get(1),
					(ChoiceStep) arguments.get(2), (AlternativeFlow) arguments.get(3), (Step) arguments.get(4));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (StepAlternative) arguments.get(1),
					(ChoiceStep) arguments.get(2), (AlternativeFlow) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4), (Gateway) arguments.get(5), (Gateway) arguments.get(6),
					(FlowNode) arguments.get(7), (Step) arguments.get(8), (FN2S) arguments.get(9),
					(GW2S) arguments.get(10));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_78__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_78((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_249__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_249((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_250__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_250((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_251__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_251((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_252__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_252((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_253__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_253((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_79__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_79((EMoflonEdge) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_STEP_FN2S_GW2S_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (StepAlternative) arguments.get(1),
					(ChoiceStep) arguments.get(2), (AlternativeFlow) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4), (Gateway) arguments.get(5), (Gateway) arguments.get(6),
					(FlowNode) arguments.get(7), (SequenceFlow) arguments.get(8), (Step) arguments.get(9),
					(FN2S) arguments.get(10), (GW2S) arguments.get(11), (Match) arguments.get(12),
					(Match) arguments.get(13));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (FN2S) arguments.get(1));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_CHOICESTEP_ALTERNATIVEFLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_STEP_FN2S_GW2S_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (StepAlternative) arguments.get(1),
					(ChoiceStep) arguments.get(2), (AlternativeFlow) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4), (Gateway) arguments.get(5), (Gateway) arguments.get(6),
					(FlowNode) arguments.get(7), (Step) arguments.get(8), (FN2S) arguments.get(9),
					(GW2S) arguments.get(10), (ModelgeneratorRuleResult) arguments.get(11));
		case RulesPackage.LAST_STEP_IN_ALT_FLOW___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LastStepInAltFlow_0_1_blackBBBBBBB(LastStepInAltFlow _this, Match match,
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

	public static final Object[] pattern_LastStepInAltFlow_0_2_bindingFBBBBBBB(LastStepInAltFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, gw, gcw, node, sf);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, gw, gcw, node, sf };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInAltFlow_0_2_bindingAndBlackFBBBBBBB(LastStepInAltFlow _this,
			Match match, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		Object[] result_pattern_LastStepInAltFlow_0_2_binding = pattern_LastStepInAltFlow_0_2_bindingFBBBBBBB(_this,
				match, process, gw, gcw, node, sf);
		if (result_pattern_LastStepInAltFlow_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInAltFlow_0_2_binding[0];

			Object[] result_pattern_LastStepInAltFlow_0_2_black = pattern_LastStepInAltFlow_0_2_blackB(csp);
			if (result_pattern_LastStepInAltFlow_0_2_black != null) {

				return new Object[] { csp, _this, match, process, gw, gcw, node, sf };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInAltFlow_0_3_expressionFBB(LastStepInAltFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_0_4_blackBBBBBB(Match match, SimpleBPMN.Process process,
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

	public static final Object[] pattern_LastStepInAltFlow_0_4_greenBBBBBFFFFF(Match match, SimpleBPMN.Process process,
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

	public static final Object[] pattern_LastStepInAltFlow_0_5_blackBBBBBB(Match match, SimpleBPMN.Process process,
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

	public static final Object[] pattern_LastStepInAltFlow_0_5_greenBBBBBFFFF(Match match, SimpleBPMN.Process process,
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

	public static final void pattern_LastStepInAltFlow_0_6_expressionBBBBBBB(LastStepInAltFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		_this.registerObjectsToMatch_FWD(match, process, gw, gcw, node, sf);

	}

	public static final boolean pattern_LastStepInAltFlow_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LastStepInAltFlow_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_1_1_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("alt");
		EObject _localVariable_1 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("gw");
		EObject _localVariable_5 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_6 = isApplicableMatch.getObject("node");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf");
		EObject _localVariable_8 = isApplicableMatch.getObject("step");
		EObject _localVariable_9 = isApplicableMatch.getObject("n2s");
		EObject _localVariable_10 = isApplicableMatch.getObject("gw2gs");
		EObject tmpAlt = _localVariable_0;
		EObject tmpGwStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpGw = _localVariable_4;
		EObject tmpGcw = _localVariable_5;
		EObject tmpNode = _localVariable_6;
		EObject tmpSf = _localVariable_7;
		EObject tmpStep = _localVariable_8;
		EObject tmpN2s = _localVariable_9;
		EObject tmpGw2gs = _localVariable_10;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpGwStep instanceof ChoiceStep) {
				ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
				if (tmpFlow instanceof AlternativeFlow) {
					AlternativeFlow flow = (AlternativeFlow) tmpFlow;
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
													return new Object[] { alt, gwStep, flow, process, gw, gcw, node, sf,
															step, n2s, gw2gs, isApplicableMatch };
												}
											}
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

	public static final Object[] pattern_LastStepInAltFlow_1_1_blackBBBBBBBBBBBBFB(StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs, LastStepInAltFlow _this,
			IsApplicableMatch isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { alt, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs,
										_this, csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_1_1_bindingAndBlackFFFFFFFFFFFBFB(LastStepInAltFlow _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LastStepInAltFlow_1_1_binding = pattern_LastStepInAltFlow_1_1_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LastStepInAltFlow_1_1_binding != null) {
			StepAlternative alt = (StepAlternative) result_pattern_LastStepInAltFlow_1_1_binding[0];
			ChoiceStep gwStep = (ChoiceStep) result_pattern_LastStepInAltFlow_1_1_binding[1];
			AlternativeFlow flow = (AlternativeFlow) result_pattern_LastStepInAltFlow_1_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_LastStepInAltFlow_1_1_binding[3];
			Gateway gw = (Gateway) result_pattern_LastStepInAltFlow_1_1_binding[4];
			Gateway gcw = (Gateway) result_pattern_LastStepInAltFlow_1_1_binding[5];
			FlowNode node = (FlowNode) result_pattern_LastStepInAltFlow_1_1_binding[6];
			SequenceFlow sf = (SequenceFlow) result_pattern_LastStepInAltFlow_1_1_binding[7];
			Step step = (Step) result_pattern_LastStepInAltFlow_1_1_binding[8];
			FN2S n2s = (FN2S) result_pattern_LastStepInAltFlow_1_1_binding[9];
			GW2S gw2gs = (GW2S) result_pattern_LastStepInAltFlow_1_1_binding[10];

			Object[] result_pattern_LastStepInAltFlow_1_1_black = pattern_LastStepInAltFlow_1_1_blackBBBBBBBBBBBBFB(alt,
					gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, _this, isApplicableMatch);
			if (result_pattern_LastStepInAltFlow_1_1_black != null) {
				CSP csp = (CSP) result_pattern_LastStepInAltFlow_1_1_black[12];

				return new Object[] { alt, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_1_1_greenBBBB(StepAlternative alt, ChoiceStep gwStep,
			AlternativeFlow flow, Step step) {
		alt.set__hasContinue(gwStep);
		flow.set__last(step);
		return new Object[] { alt, gwStep, flow, step };
	}

	public static final Object[] pattern_LastStepInAltFlow_1_2_blackB(SequenceFlow sf) {
		return new Object[] { sf };
	}

	public static final Object[] pattern_LastStepInAltFlow_1_2_greenFB(SequenceFlow sf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf);
		return new Object[] { ruleresult, sf };
	}

	public static final Object[] pattern_LastStepInAltFlow_1_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject alt, EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw, EObject node,
			EObject sf, EObject step, EObject n2s, EObject gw2gs) {
		if (!alt.equals(gwStep)) {
			if (!alt.equals(flow)) {
				if (!alt.equals(process)) {
					if (!alt.equals(gw)) {
						if (!alt.equals(gcw)) {
							if (!alt.equals(node)) {
								if (!alt.equals(sf)) {
									if (!alt.equals(step)) {
										if (!alt.equals(n2s)) {
											if (!alt.equals(gw2gs)) {
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
																									if (!flow.equals(
																											gw2gs)) {
																										if (!process
																												.equals(sf)) {
																											if (!process
																													.equals(step)) {
																												if (!gw.equals(
																														gwStep)) {
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
																																																											alt,
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
											}
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

	public static final Object[] pattern_LastStepInAltFlow_1_3_greenBBBBBBBBBFFFFFFF(PerformRuleResult ruleresult,
			EObject alt, EObject gwStep, EObject flow, EObject process, EObject gcw, EObject node, EObject sf,
			EObject step) {
		EMoflonEdge alt__gwStep______hasContinue = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LastStepInAltFlow";
		String alt__gwStep______hasContinue_name_prime = "__hasContinue";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__node____sourceRef_name_prime = "sourceRef";
		String node__sf____outgoing_name_prime = "outgoing";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		String flow__step______last_name_prime = "__last";
		alt__gwStep______hasContinue.setSrc(alt);
		alt__gwStep______hasContinue.setTrg(gwStep);
		ruleresult.getCreatedEdges().add(alt__gwStep______hasContinue);
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
		alt__gwStep______hasContinue.setName(alt__gwStep______hasContinue_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__node____sourceRef.setName(sf__node____sourceRef_name_prime);
		node__sf____outgoing.setName(node__sf____outgoing_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		flow__step______last.setName(flow__step______last_name_prime);
		return new Object[] { ruleresult, alt, gwStep, flow, process, gcw, node, sf, step, alt__gwStep______hasContinue,
				process__sf____flowElements, sf__node____sourceRef, node__sf____outgoing, sf__gcw____targetRef,
				gcw__sf____incoming, flow__step______last };
	}

	public static final void pattern_LastStepInAltFlow_1_5_expressionBBBBBBBBBBBBB(LastStepInAltFlow _this,
			PerformRuleResult ruleresult, EObject alt, EObject gwStep, EObject flow, EObject process, EObject gw,
			EObject gcw, EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs) {
		_this.registerObjects_FWD(ruleresult, alt, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs);

	}

	public static final PerformRuleResult pattern_LastStepInAltFlow_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_2_1_bindingFB(LastStepInAltFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_2_1_blackFBB(EClass eClass, LastStepInAltFlow _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_2_1_bindingAndBlackFFB(LastStepInAltFlow _this) {
		Object[] result_pattern_LastStepInAltFlow_2_1_binding = pattern_LastStepInAltFlow_2_1_bindingFB(_this);
		if (result_pattern_LastStepInAltFlow_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_LastStepInAltFlow_2_1_binding[0];

			Object[] result_pattern_LastStepInAltFlow_2_1_black = pattern_LastStepInAltFlow_2_1_blackFBB(eClass, _this);
			if (result_pattern_LastStepInAltFlow_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LastStepInAltFlow_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LastStepInAltFlow";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LastStepInAltFlow_2_2_bindingFFFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_2_2_blackFBBBBBFFFB(SimpleBPMN.Process process,
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
												if (tmpGwStep instanceof ChoiceStep) {
													ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
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

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_2_3_blackFBFBBBBBBBB(ChoiceStep gwStep,
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
																					for (StepAlternative alt : gwStep
																							.getStepAlternatives()) {
																						AlternativeFlow flow = alt
																								.getRef();
																						if (flow != null) {
																							if (flow.getSteps()
																									.contains(step)) {
																								_result.add(
																										new Object[] {
																												alt,
																												gwStep,
																												flow,
																												process,
																												gw, gcw,
																												node,
																												sf,
																												step,
																												n2s,
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
		}
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFF(StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge alt__flow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gwStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String alt__flow____ref_name_prime = "ref";
		String gwStep__alt____stepAlternatives_name_prime = "stepAlternatives";
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
		isApplicableMatch.getAllContextElements().add(alt);
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
		alt__flow____ref.setSrc(alt);
		alt__flow____ref.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(alt__flow____ref);
		gwStep__alt____stepAlternatives.setSrc(gwStep);
		gwStep__alt____stepAlternatives.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(gwStep__alt____stepAlternatives);
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
		alt__flow____ref.setName(alt__flow____ref_name_prime);
		gwStep__alt____stepAlternatives.setName(gwStep__alt____stepAlternatives_name_prime);
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
		return new Object[] { alt, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, isApplicableMatch,
				alt__flow____ref, gwStep__alt____stepAlternatives, process__gw____flowElements,
				process__gcw____flowElements, process__node____flowElements, process__sf____flowElements,
				gw__gcw______conv, sf__node____sourceRef, node__sf____outgoing, sf__gcw____targetRef,
				gcw__sf____incoming, flow__step____steps, n2s__node____source, n2s__step____target, gw2gs__gw____source,
				gw2gs__gwStep____target };
	}

	public static final Object[] pattern_LastStepInAltFlow_2_4_bindingFBBBBBBBBBBBBB(LastStepInAltFlow _this,
			IsApplicableMatch isApplicableMatch, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, alt, gwStep, flow, process, gw, gcw,
				node, sf, step, n2s, gw2gs);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, sf, step,
					n2s, gw2gs };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInAltFlow_2_4_bindingAndBlackFBBBBBBBBBBBBB(LastStepInAltFlow _this,
			IsApplicableMatch isApplicableMatch, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs) {
		Object[] result_pattern_LastStepInAltFlow_2_4_binding = pattern_LastStepInAltFlow_2_4_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs);
		if (result_pattern_LastStepInAltFlow_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInAltFlow_2_4_binding[0];

			Object[] result_pattern_LastStepInAltFlow_2_4_black = pattern_LastStepInAltFlow_2_4_blackB(csp);
			if (result_pattern_LastStepInAltFlow_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, sf,
						step, n2s, gw2gs };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInAltFlow_2_5_expressionFBB(LastStepInAltFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LastStepInAltFlow_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LastStepInAltFlow";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LastStepInAltFlow_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_10_1_blackBBBBBB(LastStepInAltFlow _this, Match match,
			StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		if (!gwStep.equals(step)) {
			return new Object[] { _this, match, alt, gwStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_10_2_bindingFBBBBBB(LastStepInAltFlow _this, Match match,
			StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, alt, gwStep, flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, alt, gwStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInAltFlow_10_2_bindingAndBlackFBBBBBB(LastStepInAltFlow _this,
			Match match, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		Object[] result_pattern_LastStepInAltFlow_10_2_binding = pattern_LastStepInAltFlow_10_2_bindingFBBBBBB(_this,
				match, alt, gwStep, flow, step);
		if (result_pattern_LastStepInAltFlow_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInAltFlow_10_2_binding[0];

			Object[] result_pattern_LastStepInAltFlow_10_2_black = pattern_LastStepInAltFlow_10_2_blackB(csp);
			if (result_pattern_LastStepInAltFlow_10_2_black != null) {

				return new Object[] { csp, _this, match, alt, gwStep, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInAltFlow_10_3_expressionFBB(LastStepInAltFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_10_4_blackBBBBB(Match match, StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		if (!gwStep.equals(step)) {
			return new Object[] { match, alt, gwStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_10_4_greenBBBBBFF(Match match, StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		EMoflonEdge alt__gwStep______hasContinue = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String alt__gwStep______hasContinue_name_prime = "__hasContinue";
		String flow__step______last_name_prime = "__last";
		alt__gwStep______hasContinue.setSrc(alt);
		alt__gwStep______hasContinue.setTrg(gwStep);
		match.getToBeTranslatedEdges().add(alt__gwStep______hasContinue);
		flow__step______last.setSrc(flow);
		flow__step______last.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step______last);
		alt__gwStep______hasContinue.setName(alt__gwStep______hasContinue_name_prime);
		flow__step______last.setName(flow__step______last_name_prime);
		return new Object[] { match, alt, gwStep, flow, step, alt__gwStep______hasContinue, flow__step______last };
	}

	public static final Object[] pattern_LastStepInAltFlow_10_5_blackBBBBB(Match match, StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		if (!gwStep.equals(step)) {
			return new Object[] { match, alt, gwStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_10_5_greenBBBBBFFF(Match match, StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		EMoflonEdge alt__flow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gwStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(alt);
		match.getContextNodes().add(gwStep);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(step);
		String alt__flow____ref_name_prime = "ref";
		String gwStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String flow__step____steps_name_prime = "steps";
		alt__flow____ref.setSrc(alt);
		alt__flow____ref.setTrg(flow);
		match.getContextEdges().add(alt__flow____ref);
		gwStep__alt____stepAlternatives.setSrc(gwStep);
		gwStep__alt____stepAlternatives.setTrg(alt);
		match.getContextEdges().add(gwStep__alt____stepAlternatives);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getContextEdges().add(flow__step____steps);
		alt__flow____ref.setName(alt__flow____ref_name_prime);
		gwStep__alt____stepAlternatives.setName(gwStep__alt____stepAlternatives_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, alt, gwStep, flow, step, alt__flow____ref, gwStep__alt____stepAlternatives,
				flow__step____steps };
	}

	public static final void pattern_LastStepInAltFlow_10_6_expressionBBBBBB(LastStepInAltFlow _this, Match match,
			StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		_this.registerObjectsToMatch_BWD(match, alt, gwStep, flow, step);

	}

	public static final boolean pattern_LastStepInAltFlow_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LastStepInAltFlow_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_11_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("alt");
		EObject _localVariable_1 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("gw");
		EObject _localVariable_5 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_6 = isApplicableMatch.getObject("node");
		EObject _localVariable_7 = isApplicableMatch.getObject("step");
		EObject _localVariable_8 = isApplicableMatch.getObject("n2s");
		EObject _localVariable_9 = isApplicableMatch.getObject("gw2gs");
		EObject tmpAlt = _localVariable_0;
		EObject tmpGwStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpGw = _localVariable_4;
		EObject tmpGcw = _localVariable_5;
		EObject tmpNode = _localVariable_6;
		EObject tmpStep = _localVariable_7;
		EObject tmpN2s = _localVariable_8;
		EObject tmpGw2gs = _localVariable_9;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpGwStep instanceof ChoiceStep) {
				ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
				if (tmpFlow instanceof AlternativeFlow) {
					AlternativeFlow flow = (AlternativeFlow) tmpFlow;
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
												return new Object[] { alt, gwStep, flow, process, gw, gcw, node, step,
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

	public static final Object[] pattern_LastStepInAltFlow_11_1_blackBBBBBBBBBBBFB(StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			Step step, FN2S n2s, GW2S gw2gs, LastStepInAltFlow _this, IsApplicableMatch isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { alt, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs,
										_this, csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_11_1_bindingAndBlackFFFFFFFFFFBFB(LastStepInAltFlow _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LastStepInAltFlow_11_1_binding = pattern_LastStepInAltFlow_11_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LastStepInAltFlow_11_1_binding != null) {
			StepAlternative alt = (StepAlternative) result_pattern_LastStepInAltFlow_11_1_binding[0];
			ChoiceStep gwStep = (ChoiceStep) result_pattern_LastStepInAltFlow_11_1_binding[1];
			AlternativeFlow flow = (AlternativeFlow) result_pattern_LastStepInAltFlow_11_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_LastStepInAltFlow_11_1_binding[3];
			Gateway gw = (Gateway) result_pattern_LastStepInAltFlow_11_1_binding[4];
			Gateway gcw = (Gateway) result_pattern_LastStepInAltFlow_11_1_binding[5];
			FlowNode node = (FlowNode) result_pattern_LastStepInAltFlow_11_1_binding[6];
			Step step = (Step) result_pattern_LastStepInAltFlow_11_1_binding[7];
			FN2S n2s = (FN2S) result_pattern_LastStepInAltFlow_11_1_binding[8];
			GW2S gw2gs = (GW2S) result_pattern_LastStepInAltFlow_11_1_binding[9];

			Object[] result_pattern_LastStepInAltFlow_11_1_black = pattern_LastStepInAltFlow_11_1_blackBBBBBBBBBBBFB(
					alt, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, _this, isApplicableMatch);
			if (result_pattern_LastStepInAltFlow_11_1_black != null) {
				CSP csp = (CSP) result_pattern_LastStepInAltFlow_11_1_black[11];

				return new Object[] { alt, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_11_1_greenBBBF(SimpleBPMN.Process process, Gateway gcw,
			FlowNode node) {
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		process.getFlowElements().add(sf);
		sf.setSourceRef(node);
		sf.setTargetRef(gcw);
		return new Object[] { process, gcw, node, sf };
	}

	public static final Object[] pattern_LastStepInAltFlow_11_2_blackB(SequenceFlow sf) {
		return new Object[] { sf };
	}

	public static final Object[] pattern_LastStepInAltFlow_11_2_greenFB(SequenceFlow sf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf);
		return new Object[] { ruleresult, sf };
	}

	public static final Object[] pattern_LastStepInAltFlow_11_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject alt, EObject gwStep, EObject flow, EObject process, EObject gw, EObject gcw, EObject node,
			EObject sf, EObject step, EObject n2s, EObject gw2gs) {
		if (!alt.equals(gwStep)) {
			if (!alt.equals(flow)) {
				if (!alt.equals(process)) {
					if (!alt.equals(gw)) {
						if (!alt.equals(gcw)) {
							if (!alt.equals(node)) {
								if (!alt.equals(sf)) {
									if (!alt.equals(step)) {
										if (!alt.equals(n2s)) {
											if (!alt.equals(gw2gs)) {
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
																									if (!flow.equals(
																											gw2gs)) {
																										if (!process
																												.equals(sf)) {
																											if (!process
																													.equals(step)) {
																												if (!gw.equals(
																														gwStep)) {
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
																																																											alt,
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
											}
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

	public static final Object[] pattern_LastStepInAltFlow_11_3_greenBBBBBBBBBFFFFFFF(PerformRuleResult ruleresult,
			EObject alt, EObject gwStep, EObject flow, EObject process, EObject gcw, EObject node, EObject sf,
			EObject step) {
		EMoflonEdge alt__gwStep______hasContinue = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LastStepInAltFlow";
		String alt__gwStep______hasContinue_name_prime = "__hasContinue";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__node____sourceRef_name_prime = "sourceRef";
		String node__sf____outgoing_name_prime = "outgoing";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		String flow__step______last_name_prime = "__last";
		alt__gwStep______hasContinue.setSrc(alt);
		alt__gwStep______hasContinue.setTrg(gwStep);
		ruleresult.getTranslatedEdges().add(alt__gwStep______hasContinue);
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
		alt__gwStep______hasContinue.setName(alt__gwStep______hasContinue_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__node____sourceRef.setName(sf__node____sourceRef_name_prime);
		node__sf____outgoing.setName(node__sf____outgoing_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		flow__step______last.setName(flow__step______last_name_prime);
		return new Object[] { ruleresult, alt, gwStep, flow, process, gcw, node, sf, step, alt__gwStep______hasContinue,
				process__sf____flowElements, sf__node____sourceRef, node__sf____outgoing, sf__gcw____targetRef,
				gcw__sf____incoming, flow__step______last };
	}

	public static final void pattern_LastStepInAltFlow_11_5_expressionBBBBBBBBBBBBB(LastStepInAltFlow _this,
			PerformRuleResult ruleresult, EObject alt, EObject gwStep, EObject flow, EObject process, EObject gw,
			EObject gcw, EObject node, EObject sf, EObject step, EObject n2s, EObject gw2gs) {
		_this.registerObjects_BWD(ruleresult, alt, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs);

	}

	public static final PerformRuleResult pattern_LastStepInAltFlow_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_12_1_bindingFB(LastStepInAltFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_12_1_blackFBB(EClass eClass, LastStepInAltFlow _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_12_1_bindingAndBlackFFB(LastStepInAltFlow _this) {
		Object[] result_pattern_LastStepInAltFlow_12_1_binding = pattern_LastStepInAltFlow_12_1_bindingFB(_this);
		if (result_pattern_LastStepInAltFlow_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_LastStepInAltFlow_12_1_binding[0];

			Object[] result_pattern_LastStepInAltFlow_12_1_black = pattern_LastStepInAltFlow_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_LastStepInAltFlow_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LastStepInAltFlow_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "LastStepInAltFlow";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LastStepInAltFlow_12_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("alt");
		EObject _localVariable_1 = match.getObject("gwStep");
		EObject _localVariable_2 = match.getObject("flow");
		EObject _localVariable_3 = match.getObject("step");
		EObject tmpAlt = _localVariable_0;
		EObject tmpGwStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpGwStep instanceof ChoiceStep) {
				ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
				if (tmpFlow instanceof AlternativeFlow) {
					AlternativeFlow flow = (AlternativeFlow) tmpFlow;
					if (tmpStep instanceof Step) {
						Step step = (Step) tmpStep;
						return new Object[] { alt, gwStep, flow, step, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_12_2_blackBBBFFBFFB(StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, Step step, Match match) {
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
										_result.add(
												new Object[] { alt, gwStep, flow, gw, node, step, n2s, gw2gs, match });
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

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_12_3_blackBBBFBFBBBB(StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, Gateway gw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (flow.equals(alt.getRef())) {
					if (gwStep.equals(alt.get__hasContinue())) {
						if (gwStep.getStepAlternatives().contains(alt)) {
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
																		if (Boolean.valueOf(gcwisDiverging)
																				.equals(false)) {
																			if (Boolean.valueOf(gcwisDiverging)
																					.equals(false)) {
																				for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(gw,
																								SimpleBPMN.Process.class,
																								"flowElements")) {
																					if (process.getFlowElements()
																							.contains(gcw)) {
																						if (process.getFlowElements()
																								.contains(node)) {
																							_result.add(new Object[] {
																									alt, gwStep, flow,
																									process, gw, gcw,
																									node, step, n2s,
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

	public static final Object[] pattern_LastStepInAltFlow_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFF(StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			Step step, FN2S n2s, GW2S gw2gs) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge alt__flow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alt__gwStep______hasContinue = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gwStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String alt__flow____ref_name_prime = "ref";
		String alt__gwStep______hasContinue_name_prime = "__hasContinue";
		String gwStep__alt____stepAlternatives_name_prime = "stepAlternatives";
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
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(n2s);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		alt__flow____ref.setSrc(alt);
		alt__flow____ref.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(alt__flow____ref);
		alt__gwStep______hasContinue.setSrc(alt);
		alt__gwStep______hasContinue.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(alt__gwStep______hasContinue);
		gwStep__alt____stepAlternatives.setSrc(gwStep);
		gwStep__alt____stepAlternatives.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(gwStep__alt____stepAlternatives);
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
		alt__flow____ref.setName(alt__flow____ref_name_prime);
		alt__gwStep______hasContinue.setName(alt__gwStep______hasContinue_name_prime);
		gwStep__alt____stepAlternatives.setName(gwStep__alt____stepAlternatives_name_prime);
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
		return new Object[] { alt, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, isApplicableMatch,
				alt__flow____ref, alt__gwStep______hasContinue, gwStep__alt____stepAlternatives,
				process__gw____flowElements, process__gcw____flowElements, process__node____flowElements,
				gw__gcw______conv, flow__step____steps, flow__step______last, n2s__node____source, n2s__step____target,
				gw2gs__gw____source, gw2gs__gwStep____target };
	}

	public static final Object[] pattern_LastStepInAltFlow_12_4_bindingFBBBBBBBBBBBB(LastStepInAltFlow _this,
			IsApplicableMatch isApplicableMatch, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, alt, gwStep, flow, process, gw, gcw,
				node, step, n2s, gw2gs);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, step, n2s,
					gw2gs };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInAltFlow_12_4_bindingAndBlackFBBBBBBBBBBBB(LastStepInAltFlow _this,
			IsApplicableMatch isApplicableMatch, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs) {
		Object[] result_pattern_LastStepInAltFlow_12_4_binding = pattern_LastStepInAltFlow_12_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs);
		if (result_pattern_LastStepInAltFlow_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInAltFlow_12_4_binding[0];

			Object[] result_pattern_LastStepInAltFlow_12_4_black = pattern_LastStepInAltFlow_12_4_blackB(csp);
			if (result_pattern_LastStepInAltFlow_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, step,
						n2s, gw2gs };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInAltFlow_12_5_expressionFBB(LastStepInAltFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LastStepInAltFlow_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LastStepInAltFlow";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LastStepInAltFlow_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_20_1_bindingFB(LastStepInAltFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_20_1_blackFBB(EClass __eClass, LastStepInAltFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_20_1_bindingAndBlackFFB(LastStepInAltFlow _this) {
		Object[] result_pattern_LastStepInAltFlow_20_1_binding = pattern_LastStepInAltFlow_20_1_bindingFB(_this);
		if (result_pattern_LastStepInAltFlow_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInAltFlow_20_1_binding[0];

			Object[] result_pattern_LastStepInAltFlow_20_1_black = pattern_LastStepInAltFlow_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_LastStepInAltFlow_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInAltFlow_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_20_2_blackFFFFB(EMoflonEdge _edge___hasContinue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlt = _edge___hasContinue.getSrc();
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			EObject tmpGwStep = _edge___hasContinue.getTrg();
			if (tmpGwStep instanceof ChoiceStep) {
				ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
				if (gwStep.equals(alt.get__hasContinue())) {
					if (gwStep.getStepAlternatives().contains(alt)) {
						AlternativeFlow flow = alt.getRef();
						if (flow != null) {
							Step step = flow.get__last();
							if (step != null) {
								if (!gwStep.equals(step)) {
									if (flow.getSteps().contains(step)) {
										_result.add(new Object[] { alt, gwStep, flow, step, _edge___hasContinue });
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

	public static final Object[] pattern_LastStepInAltFlow_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInAltFlow_20_3_expressionFBBBBBB(LastStepInAltFlow _this, Match match,
			StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, gwStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInAltFlow_20_4_expressionFBB(LastStepInAltFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInAltFlow_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_21_1_bindingFB(LastStepInAltFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_21_1_blackFBB(EClass __eClass, LastStepInAltFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_21_1_bindingAndBlackFFB(LastStepInAltFlow _this) {
		Object[] result_pattern_LastStepInAltFlow_21_1_binding = pattern_LastStepInAltFlow_21_1_bindingFB(_this);
		if (result_pattern_LastStepInAltFlow_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInAltFlow_21_1_binding[0];

			Object[] result_pattern_LastStepInAltFlow_21_1_black = pattern_LastStepInAltFlow_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_LastStepInAltFlow_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInAltFlow_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_21_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw,
			Gateway gcw, FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_378971 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_378971)) {
							if (!gcw.equals(__DEC_sf_default_378971)) {
								if (!node.equals(__DEC_sf_default_378971)) {
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

	public static final Object[] pattern_LastStepInAltFlow_21_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_314501 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_314501)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_21_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
												if (pattern_LastStepInAltFlow_21_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_LastStepInAltFlow_21_2_black_nac_0BBBB(
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

	public static final Object[] pattern_LastStepInAltFlow_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInAltFlow_21_3_expressionFBBBBBBB(LastStepInAltFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInAltFlow_21_4_expressionFBB(LastStepInAltFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInAltFlow_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_22_1_bindingFB(LastStepInAltFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_22_1_blackFBB(EClass __eClass, LastStepInAltFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_22_1_bindingAndBlackFFB(LastStepInAltFlow _this) {
		Object[] result_pattern_LastStepInAltFlow_22_1_binding = pattern_LastStepInAltFlow_22_1_bindingFB(_this);
		if (result_pattern_LastStepInAltFlow_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInAltFlow_22_1_binding[0];

			Object[] result_pattern_LastStepInAltFlow_22_1_black = pattern_LastStepInAltFlow_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_LastStepInAltFlow_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInAltFlow_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_22_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw,
			Gateway gcw, FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_808609 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_808609)) {
							if (!gcw.equals(__DEC_sf_default_808609)) {
								if (!node.equals(__DEC_sf_default_808609)) {
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

	public static final Object[] pattern_LastStepInAltFlow_22_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_601755 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_601755)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_22_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
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
												if (pattern_LastStepInAltFlow_22_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_LastStepInAltFlow_22_2_black_nac_0BBBB(
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

	public static final Object[] pattern_LastStepInAltFlow_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInAltFlow_22_3_expressionFBBBBBBB(LastStepInAltFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInAltFlow_22_4_expressionFBB(LastStepInAltFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInAltFlow_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_23_1_bindingFB(LastStepInAltFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_23_1_blackFBB(EClass __eClass, LastStepInAltFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_23_1_bindingAndBlackFFB(LastStepInAltFlow _this) {
		Object[] result_pattern_LastStepInAltFlow_23_1_binding = pattern_LastStepInAltFlow_23_1_bindingFB(_this);
		if (result_pattern_LastStepInAltFlow_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInAltFlow_23_1_binding[0];

			Object[] result_pattern_LastStepInAltFlow_23_1_black = pattern_LastStepInAltFlow_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_LastStepInAltFlow_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInAltFlow_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_23_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw,
			Gateway gcw, FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_261606 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_261606)) {
							if (!gcw.equals(__DEC_sf_default_261606)) {
								if (!node.equals(__DEC_sf_default_261606)) {
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

	public static final Object[] pattern_LastStepInAltFlow_23_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_935729 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_935729)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_23_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
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
												if (pattern_LastStepInAltFlow_23_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_LastStepInAltFlow_23_2_black_nac_0BBBB(
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

	public static final Object[] pattern_LastStepInAltFlow_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInAltFlow_23_3_expressionFBBBBBBB(LastStepInAltFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInAltFlow_23_4_expressionFBB(LastStepInAltFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInAltFlow_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_24_1_bindingFB(LastStepInAltFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_24_1_blackFBB(EClass __eClass, LastStepInAltFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_24_1_bindingAndBlackFFB(LastStepInAltFlow _this) {
		Object[] result_pattern_LastStepInAltFlow_24_1_binding = pattern_LastStepInAltFlow_24_1_bindingFB(_this);
		if (result_pattern_LastStepInAltFlow_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInAltFlow_24_1_binding[0];

			Object[] result_pattern_LastStepInAltFlow_24_1_black = pattern_LastStepInAltFlow_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_LastStepInAltFlow_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInAltFlow_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_24_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw,
			Gateway gcw, FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_441589 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_441589)) {
							if (!gcw.equals(__DEC_sf_default_441589)) {
								if (!node.equals(__DEC_sf_default_441589)) {
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

	public static final Object[] pattern_LastStepInAltFlow_24_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_184158 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_184158)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_24_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
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
												if (pattern_LastStepInAltFlow_24_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_LastStepInAltFlow_24_2_black_nac_0BBBB(
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

	public static final Object[] pattern_LastStepInAltFlow_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInAltFlow_24_3_expressionFBBBBBBB(LastStepInAltFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInAltFlow_24_4_expressionFBB(LastStepInAltFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInAltFlow_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_25_1_bindingFB(LastStepInAltFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_25_1_blackFBB(EClass __eClass, LastStepInAltFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_25_1_bindingAndBlackFFB(LastStepInAltFlow _this) {
		Object[] result_pattern_LastStepInAltFlow_25_1_binding = pattern_LastStepInAltFlow_25_1_bindingFB(_this);
		if (result_pattern_LastStepInAltFlow_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInAltFlow_25_1_binding[0];

			Object[] result_pattern_LastStepInAltFlow_25_1_black = pattern_LastStepInAltFlow_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_LastStepInAltFlow_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInAltFlow_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_25_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw,
			Gateway gcw, FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_414916 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_414916)) {
							if (!gcw.equals(__DEC_sf_default_414916)) {
								if (!node.equals(__DEC_sf_default_414916)) {
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

	public static final Object[] pattern_LastStepInAltFlow_25_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_251716 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_251716)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_25_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
												if (pattern_LastStepInAltFlow_25_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_LastStepInAltFlow_25_2_black_nac_0BBBB(
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

	public static final Object[] pattern_LastStepInAltFlow_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInAltFlow_25_3_expressionFBBBBBBB(LastStepInAltFlow _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInAltFlow_25_4_expressionFBB(LastStepInAltFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInAltFlow_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_26_1_bindingFB(LastStepInAltFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_26_1_blackFBB(EClass __eClass, LastStepInAltFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_26_1_bindingAndBlackFFB(LastStepInAltFlow _this) {
		Object[] result_pattern_LastStepInAltFlow_26_1_binding = pattern_LastStepInAltFlow_26_1_bindingFB(_this);
		if (result_pattern_LastStepInAltFlow_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_LastStepInAltFlow_26_1_binding[0];

			Object[] result_pattern_LastStepInAltFlow_26_1_black = pattern_LastStepInAltFlow_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_LastStepInAltFlow_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LastStepInAltFlow_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_26_2_blackFFFFB(EMoflonEdge _edge___last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge___last.getSrc();
		if (tmpFlow instanceof AlternativeFlow) {
			AlternativeFlow flow = (AlternativeFlow) tmpFlow;
			EObject tmpStep = _edge___last.getTrg();
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (step.equals(flow.get__last())) {
						for (StepAlternative alt : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, StepAlternative.class, "ref")) {
							ChoiceStep gwStep = alt.get__hasContinue();
							if (gwStep != null) {
								if (!gwStep.equals(step)) {
									if (gwStep.getStepAlternatives().contains(alt)) {
										_result.add(new Object[] { alt, gwStep, flow, step, _edge___last });
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

	public static final Object[] pattern_LastStepInAltFlow_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LastStepInAltFlow_26_3_expressionFBBBBBB(LastStepInAltFlow _this, Match match,
			StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow, Step step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, gwStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LastStepInAltFlow_26_4_expressionFBB(LastStepInAltFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_LastStepInAltFlow_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_LastStepInAltFlow_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_29_1_blackB(LastStepInAltFlow _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LastStepInAltFlow_29_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_LastStepInAltFlow_29_2_bindingFFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("alt");
		EObject _localVariable_1 = targetMatch.getObject("gwStep");
		EObject _localVariable_2 = targetMatch.getObject("flow");
		EObject _localVariable_3 = sourceMatch.getObject("process");
		EObject _localVariable_4 = sourceMatch.getObject("gw");
		EObject _localVariable_5 = sourceMatch.getObject("gcw");
		EObject _localVariable_6 = sourceMatch.getObject("node");
		EObject _localVariable_7 = sourceMatch.getObject("sf");
		EObject _localVariable_8 = targetMatch.getObject("step");
		EObject tmpAlt = _localVariable_0;
		EObject tmpGwStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpGw = _localVariable_4;
		EObject tmpGcw = _localVariable_5;
		EObject tmpNode = _localVariable_6;
		EObject tmpSf = _localVariable_7;
		EObject tmpStep = _localVariable_8;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpGwStep instanceof ChoiceStep) {
				ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
				if (tmpFlow instanceof AlternativeFlow) {
					AlternativeFlow flow = (AlternativeFlow) tmpFlow;
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
											return new Object[] { alt, gwStep, flow, process, gw, gcw, node, sf, step,
													targetMatch, sourceMatch };
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

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_29_2_blackBBBBBBBBBFFBB(StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			SequenceFlow sf, Step step, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						if (!sourceMatch.equals(targetMatch)) {
							if (flow.equals(alt.getRef())) {
								if (gwStep.equals(alt.get__hasContinue())) {
									if (gwStep.getStepAlternatives().contains(alt)) {
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
																						.equals(Boolean
																								.valueOf(true))) {
																					boolean gcwisDiverging = gcw
																							.isIsDiverging();
																					if (Boolean.valueOf(gcwisDiverging)
																							.equals(false)) {
																						if (Boolean
																								.valueOf(gcwisDiverging)
																								.equals(false)) {
																							for (FN2S n2s : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											node,
																											FN2S.class,
																											"source")) {
																								if (step.equals(n2s
																										.getTarget())) {
																									for (GW2S gw2gs : org.moflon.core.utilities.eMoflonEMFUtil
																											.getOppositeReferenceTyped(
																													gw,
																													GW2S.class,
																													"source")) {
																										if (gwStep
																												.equals(gw2gs
																														.getTarget())) {
																											_result.add(
																													new Object[] {
																															alt,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_29_2_greenBBBBBBBBBBBBBF(StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "LastStepInAltFlow";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(sf);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(n2s);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { alt, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, sourceMatch, targetMatch,
				isApplicableMatch };
	}

	public static final Object[] pattern_LastStepInAltFlow_29_3_bindingFBBBBBBBBBBBBBBB(LastStepInAltFlow _this,
			IsApplicableMatchCC isApplicableMatch, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, alt, gwStep, flow, process, gw, gcw,
				node, sf, step, n2s, gw2gs, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, sf, step,
					n2s, gw2gs, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_29_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInAltFlow_29_3_bindingAndBlackFBBBBBBBBBBBBBBB(LastStepInAltFlow _this,
			IsApplicableMatchCC isApplicableMatch, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, Step step, FN2S n2s,
			GW2S gw2gs, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LastStepInAltFlow_29_3_binding = pattern_LastStepInAltFlow_29_3_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, sourceMatch,
				targetMatch);
		if (result_pattern_LastStepInAltFlow_29_3_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInAltFlow_29_3_binding[0];

			Object[] result_pattern_LastStepInAltFlow_29_3_black = pattern_LastStepInAltFlow_29_3_blackB(csp);
			if (result_pattern_LastStepInAltFlow_29_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, sf,
						step, n2s, gw2gs, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_29_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_LastStepInAltFlow_29_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LastStepInAltFlow";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LastStepInAltFlow_29_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_32_1_blackB(LastStepInAltFlow _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LastStepInAltFlow_32_2_bindingFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("alt");
		EObject _localVariable_1 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("gw");
		EObject _localVariable_5 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_6 = isApplicableMatch.getObject("node");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf");
		EObject _localVariable_8 = isApplicableMatch.getObject("step");
		EObject _localVariable_9 = isApplicableMatch.getObject("n2s");
		EObject _localVariable_10 = isApplicableMatch.getObject("gw2gs");
		EObject tmpAlt = _localVariable_0;
		EObject tmpGwStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpGw = _localVariable_4;
		EObject tmpGcw = _localVariable_5;
		EObject tmpNode = _localVariable_6;
		EObject tmpSf = _localVariable_7;
		EObject tmpStep = _localVariable_8;
		EObject tmpN2s = _localVariable_9;
		EObject tmpGw2gs = _localVariable_10;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpGwStep instanceof ChoiceStep) {
				ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
				if (tmpFlow instanceof AlternativeFlow) {
					AlternativeFlow flow = (AlternativeFlow) tmpFlow;
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
													return new Object[] { alt, gwStep, flow, process, gw, gcw, node, sf,
															step, n2s, gw2gs, isApplicableMatch };
												}
											}
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

	public static final Object[] pattern_LastStepInAltFlow_32_2_blackBBBBBBBBBBBB(StepAlternative alt,
			ChoiceStep gwStep, AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			SequenceFlow sf, Step step, FN2S n2s, GW2S gw2gs, IsApplicableMatchCC isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						if (flow.equals(alt.getRef())) {
							if (gwStep.equals(alt.get__hasContinue())) {
								if (gwStep.getStepAlternatives().contains(alt)) {
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
																					if (gwStep.equals(
																							gw2gs.getTarget())) {
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
																										return new Object[] {
																												alt,
																												gwStep,
																												flow,
																												process,
																												gw, gcw,
																												node,
																												sf,
																												step,
																												n2s,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_32_2_bindingAndBlackFFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_LastStepInAltFlow_32_2_binding = pattern_LastStepInAltFlow_32_2_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LastStepInAltFlow_32_2_binding != null) {
			StepAlternative alt = (StepAlternative) result_pattern_LastStepInAltFlow_32_2_binding[0];
			ChoiceStep gwStep = (ChoiceStep) result_pattern_LastStepInAltFlow_32_2_binding[1];
			AlternativeFlow flow = (AlternativeFlow) result_pattern_LastStepInAltFlow_32_2_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_LastStepInAltFlow_32_2_binding[3];
			Gateway gw = (Gateway) result_pattern_LastStepInAltFlow_32_2_binding[4];
			Gateway gcw = (Gateway) result_pattern_LastStepInAltFlow_32_2_binding[5];
			FlowNode node = (FlowNode) result_pattern_LastStepInAltFlow_32_2_binding[6];
			SequenceFlow sf = (SequenceFlow) result_pattern_LastStepInAltFlow_32_2_binding[7];
			Step step = (Step) result_pattern_LastStepInAltFlow_32_2_binding[8];
			FN2S n2s = (FN2S) result_pattern_LastStepInAltFlow_32_2_binding[9];
			GW2S gw2gs = (GW2S) result_pattern_LastStepInAltFlow_32_2_binding[10];

			Object[] result_pattern_LastStepInAltFlow_32_2_black = pattern_LastStepInAltFlow_32_2_blackBBBBBBBBBBBB(alt,
					gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs, isApplicableMatch);
			if (result_pattern_LastStepInAltFlow_32_2_black != null) {

				return new Object[] { alt, gwStep, flow, process, gw, gcw, node, sf, step, n2s, gw2gs,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_32_2_greenF() {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { result };
	}

	public static final PerformRuleResult pattern_LastStepInAltFlow_32_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_1_blackB(LastStepInAltFlow _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LastStepInAltFlow_33_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			StepAlternative alt) {
		if (ruleResult.getTargetObjects().contains(alt)) {
			return new Object[] { ruleResult, alt };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			AlternativeFlow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			Step step) {
		if (ruleResult.getTargetObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			FN2S n2s) {
		if (ruleResult.getCorrObjects().contains(n2s)) {
			return new Object[] { ruleResult, n2s };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_4BB(ModelgeneratorRuleResult ruleResult,
			FlowNode node) {
		if (ruleResult.getSourceObjects().contains(node)) {
			return new Object[] { ruleResult, node };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_5BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_6BB(ModelgeneratorRuleResult ruleResult,
			Gateway gw) {
		if (ruleResult.getSourceObjects().contains(gw)) {
			return new Object[] { ruleResult, gw };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_7BB(ModelgeneratorRuleResult ruleResult,
			Gateway gcw) {
		if (ruleResult.getSourceObjects().contains(gcw)) {
			return new Object[] { ruleResult, gcw };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_8BB(ModelgeneratorRuleResult ruleResult,
			GW2S gw2gs) {
		if (ruleResult.getCorrObjects().contains(gw2gs)) {
			return new Object[] { ruleResult, gw2gs };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_2_black_nac_9BB(ModelgeneratorRuleResult ruleResult,
			ChoiceStep gwStep) {
		if (ruleResult.getTargetObjects().contains(gwStep)) {
			return new Object[] { ruleResult, gwStep };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LastStepInAltFlow_33_2_blackFFFFFFFFFFFBB(
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
							if (pattern_LastStepInAltFlow_33_2_black_nac_3BB(ruleResult, n2s) == null) {
								if (pattern_LastStepInAltFlow_33_2_black_nac_2BB(ruleResult, step) == null) {
									if (pattern_LastStepInAltFlow_33_2_black_nac_4BB(ruleResult, node) == null) {
										for (Flow tmpFlow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(step, Flow.class, "steps")) {
											if (tmpFlow instanceof AlternativeFlow) {
												AlternativeFlow flow = (AlternativeFlow) tmpFlow;
												if (pattern_LastStepInAltFlow_33_2_black_nac_1BB(ruleResult,
														flow) == null) {
													for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(node, SimpleBPMN.Process.class,
																	"flowElements")) {
														if (pattern_LastStepInAltFlow_33_2_black_nac_5BB(ruleResult,
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
																										if (pattern_LastStepInAltFlow_33_2_black_nac_6BB(
																												ruleResult,
																												gw) == null) {
																											if (pattern_LastStepInAltFlow_33_2_black_nac_7BB(
																													ruleResult,
																													gcw) == null) {
																												for (StepAlternative alt : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																flow,
																																StepAlternative.class,
																																"ref")) {
																													if (pattern_LastStepInAltFlow_33_2_black_nac_0BB(
																															ruleResult,
																															alt) == null) {
																														for (GW2S gw2gs : org.moflon.core.utilities.eMoflonEMFUtil
																																.getOppositeReferenceTyped(
																																		gw,
																																		GW2S.class,
																																		"source")) {
																															Step tmpGwStep = gw2gs
																																	.getTarget();
																															if (tmpGwStep instanceof ChoiceStep) {
																																ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
																																if (!gwStep
																																		.equals(step)) {
																																	if (gwStep
																																			.getStepAlternatives()
																																			.contains(
																																					alt)) {
																																		if (pattern_LastStepInAltFlow_33_2_black_nac_8BB(
																																				ruleResult,
																																				gw2gs) == null) {
																																			if (pattern_LastStepInAltFlow_33_2_black_nac_9BB(
																																					ruleResult,
																																					gwStep) == null) {
																																				_result.add(
																																						new Object[] {
																																								n2sList,
																																								alt,
																																								flow,
																																								step,
																																								n2s,
																																								node,
																																								process,
																																								gw,
																																								gcw,
																																								gw2gs,
																																								gwStep,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_3_bindingFBBBBBBBBBBBBB(LastStepInAltFlow _this,
			IsApplicableMatch isApplicableMatch, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, alt, gwStep, flow, process, gw, gcw,
				node, step, n2s, gw2gs, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, step, n2s,
					gw2gs, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LastStepInAltFlow_33_3_bindingAndBlackFBBBBBBBBBBBBB(LastStepInAltFlow _this,
			IsApplicableMatch isApplicableMatch, StepAlternative alt, ChoiceStep gwStep, AlternativeFlow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step, FN2S n2s, GW2S gw2gs,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LastStepInAltFlow_33_3_binding = pattern_LastStepInAltFlow_33_3_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, step, n2s, gw2gs, ruleResult);
		if (result_pattern_LastStepInAltFlow_33_3_binding != null) {
			CSP csp = (CSP) result_pattern_LastStepInAltFlow_33_3_binding[0];

			Object[] result_pattern_LastStepInAltFlow_33_3_black = pattern_LastStepInAltFlow_33_3_blackB(csp);
			if (result_pattern_LastStepInAltFlow_33_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, alt, gwStep, flow, process, gw, gcw, node, step,
						n2s, gw2gs, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LastStepInAltFlow_33_4_expressionFBB(LastStepInAltFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LastStepInAltFlow_33_5_blackBBBBBBBBBB(StepAlternative alt, ChoiceStep gwStep,
			AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step,
			FN2S n2s, GW2S gw2gs) {
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
										return new Object[] { alt, gwStep, flow, process, gw, gcw, node, step, n2s,
												gw2gs };
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

	public static final Object[] pattern_LastStepInAltFlow_33_6_blackBBBBBBBBBBB(StepAlternative alt, ChoiceStep gwStep,
			AlternativeFlow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, Step step,
			FN2S n2s, GW2S gw2gs, ModelgeneratorRuleResult ruleResult) {
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
										return new Object[] { alt, gwStep, flow, process, gw, gcw, node, step, n2s,
												gw2gs, ruleResult };
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

	public static final Object[] pattern_LastStepInAltFlow_33_6_greenBBBBBBFBB(StepAlternative alt, ChoiceStep gwStep,
			AlternativeFlow flow, SimpleBPMN.Process process, Gateway gcw, FlowNode node, Step step,
			ModelgeneratorRuleResult ruleResult) {
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		alt.set__hasContinue(gwStep);
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
		return new Object[] { alt, gwStep, flow, process, gcw, node, sf, step, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LastStepInAltFlow_33_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LastStepInAltFlowImpl