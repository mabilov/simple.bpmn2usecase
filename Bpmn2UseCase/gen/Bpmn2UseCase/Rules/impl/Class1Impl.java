/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.FN2S;
import Bpmn2UseCase.GW2S;

import Bpmn2UseCase.Rules.Class1;
import Bpmn2UseCase.Rules.RulesPackage;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.ChoiceStep;
import SimpleUseCase.Flow;
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
 * An implementation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Class1Impl extends AbstractRuleImpl implements Class1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClass1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node,
			SequenceFlow sf) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_0_1_blackBBBBBBB(this, match, process, gw, gcw, node, sf);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = " + gw + ", "
							+ "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl.pattern_Class1_0_2_bindingAndBlackFBBBBBBB(this, match, process,
				gw, gcw, node, sf);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = " + gw
					+ ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_0_4_blackBBBBBB(match, process, gw, gcw, node, sf);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = "
						+ gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
			}
			Class1Impl.pattern_Class1_0_4_greenBBBBBFFFFF(match, process, gcw, node, sf);
			// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result4_green[6];
			// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result4_green[7];
			// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result4_green[8];
			// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_0_5_blackBBBBBB(match, process, gw, gcw, node, sf);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[gw] = "
						+ gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ".");
			}
			Class1Impl.pattern_Class1_0_5_greenBBBBBFFFF(match, process, gw, gcw, node);
			// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result5_green[5];
			// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result5_green[6];
			// EMoflonEdge process__node____flowElements = (EMoflonEdge) result5_green[7];
			// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result5_green[8];

			// register objects to match
			Class1Impl.pattern_Class1_0_6_expressionBBBBBBB(this, match, process, gw, gcw, node, sf);
			return Class1Impl.pattern_Class1_0_7_expressionF();
		} else {
			return Class1Impl.pattern_Class1_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_1_1_bindingAndBlackFFFFFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ChoiceStep gwStep = (ChoiceStep) result1_bindingAndBlack[0];
		Step step = (Step) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		Gateway gw = (Gateway) result1_bindingAndBlack[4];
		Gateway gcw = (Gateway) result1_bindingAndBlack[5];
		FlowNode node = (FlowNode) result1_bindingAndBlack[6];
		SequenceFlow sf = (SequenceFlow) result1_bindingAndBlack[7];
		FN2S n2s = (FN2S) result1_bindingAndBlack[8];
		GW2S gw2gs = (GW2S) result1_bindingAndBlack[9];
		// CSP csp = (CSP) result1_bindingAndBlack[11];
		Class1Impl.pattern_Class1_1_1_greenBB(gwStep, step);

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_1_2_blackB(sf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ".");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_1_2_greenFB(sf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl.pattern_Class1_1_3_blackBBBBBBBBBBB(ruleresult, gwStep, step, flow, process,
				gw, gcw, node, sf, n2s, gw2gs);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[gwStep] = " + gwStep + ", " + "[step] = " + step + ", "
					+ "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = "
					+ gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ", " + "[n2s] = " + n2s + ", "
					+ "[gw2gs] = " + gw2gs + ".");
		}
		Class1Impl.pattern_Class1_1_3_greenBBBBBBBFFFFFF(ruleresult, gwStep, step, process, gcw, node, sf);
		// EMoflonEdge gwStep__step______lastInDef = (EMoflonEdge) result3_green[7];
		// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[8];
		// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result3_green[10];
		// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[11];
		// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_1_5_expressionBBBBBBBBBBBB(this, ruleresult, gwStep, step, flow, process, gw, gcw,
				node, sf, n2s, gw2gs);
		return Class1Impl.pattern_Class1_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Class1Impl.pattern_Class1_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		Gateway gw = (Gateway) result2_binding[1];
		Gateway gcw = (Gateway) result2_binding[2];
		FlowNode node = (FlowNode) result2_binding[3];
		SequenceFlow sf = (SequenceFlow) result2_binding[4];
		for (Object[] result2_black : Class1Impl.pattern_Class1_2_2_blackFFBBBBBFFB(process, gw, gcw, node, sf,
				match)) {
			ChoiceStep gwStep = (ChoiceStep) result2_black[0];
			Step step = (Step) result2_black[1];
			FN2S n2s = (FN2S) result2_black[7];
			GW2S gw2gs = (GW2S) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : Class1Impl.pattern_Class1_2_3_blackBBFBBBBBBB(gwStep, step, process, gw, gcw,
					node, sf, n2s, gw2gs)) {
				Flow flow = (Flow) result3_black[2];
				Object[] result3_green = Class1Impl.pattern_Class1_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(gwStep, step,
						flow, process, gw, gcw, node, sf, n2s, gw2gs);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__gwStep____steps = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result3_green[19];
				// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[21];
				// EMoflonEdge n2s__node____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge n2s__step____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge gw2gs__gw____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge gw2gs__gwStep____target = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl.pattern_Class1_2_4_bindingAndBlackFBBBBBBBBBBBB(this,
						isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[gwStep] = " + gwStep + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", "
							+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", "
							+ "[node] = " + node + ", " + "[sf] = " + sf + ", " + "[n2s] = " + n2s + ", " + "[gw2gs] = "
							+ gw2gs + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Class1Impl.pattern_Class1_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Class1Impl.pattern_Class1_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Class1Impl.pattern_Class1_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Class1Impl.pattern_Class1_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("gwStep", gwStep);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("gw", gw);
		isApplicableMatch.registerObject("gcw", gcw);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("sf", sf);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject gwStep, EObject step, EObject flow,
			EObject process, EObject gw, EObject gcw, EObject node, EObject sf, EObject n2s, EObject gw2gs) {
		ruleresult.registerObject("gwStep", gwStep);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("gw", gw);
		ruleresult.registerObject("gcw", gcw);
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("sf", sf);
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
	public boolean isAppropriate_BWD(Match match, ChoiceStep gwStep, Step step, Flow flow) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_10_1_blackBBBBB(this, match, gwStep, step, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", "
					+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl.pattern_Class1_10_2_bindingAndBlackFBBBBB(this, match, gwStep,
				step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[step] = " + step
					+ ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_10_4_blackBBBB(match, gwStep, step, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[step] = "
						+ step + ", " + "[flow] = " + flow + ".");
			}
			Class1Impl.pattern_Class1_10_4_greenBBBF(match, gwStep, step);
			// EMoflonEdge gwStep__step______lastInDef = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_10_5_blackBBBB(match, gwStep, step, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[step] = "
						+ step + ", " + "[flow] = " + flow + ".");
			}
			Class1Impl.pattern_Class1_10_5_greenBBBBFF(match, gwStep, step, flow);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__gwStep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			Class1Impl.pattern_Class1_10_6_expressionBBBBB(this, match, gwStep, step, flow);
			return Class1Impl.pattern_Class1_10_7_expressionF();
		} else {
			return Class1Impl.pattern_Class1_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_11_1_bindingAndBlackFFFFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ChoiceStep gwStep = (ChoiceStep) result1_bindingAndBlack[0];
		Step step = (Step) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		Gateway gw = (Gateway) result1_bindingAndBlack[4];
		Gateway gcw = (Gateway) result1_bindingAndBlack[5];
		FlowNode node = (FlowNode) result1_bindingAndBlack[6];
		FN2S n2s = (FN2S) result1_bindingAndBlack[7];
		GW2S gw2gs = (GW2S) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = Class1Impl.pattern_Class1_11_1_greenBBBF(process, gcw, node);
		SequenceFlow sf = (SequenceFlow) result1_green[3];

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_11_2_blackB(sf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ".");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_11_2_greenFB(sf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl.pattern_Class1_11_3_blackBBBBBBBBBBB(ruleresult, gwStep, step, flow,
				process, gw, gcw, node, sf, n2s, gw2gs);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[gwStep] = " + gwStep + ", " + "[step] = " + step + ", "
					+ "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = "
					+ gcw + ", " + "[node] = " + node + ", " + "[sf] = " + sf + ", " + "[n2s] = " + n2s + ", "
					+ "[gw2gs] = " + gw2gs + ".");
		}
		Class1Impl.pattern_Class1_11_3_greenBBBBBBBFFFFFF(ruleresult, gwStep, step, process, gcw, node, sf);
		// EMoflonEdge gwStep__step______lastInDef = (EMoflonEdge) result3_green[7];
		// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[8];
		// EMoflonEdge sf__node____sourceRef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge node__sf____outgoing = (EMoflonEdge) result3_green[10];
		// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[11];
		// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_11_5_expressionBBBBBBBBBBBB(this, ruleresult, gwStep, step, flow, process, gw, gcw,
				node, sf, n2s, gw2gs);
		return Class1Impl.pattern_Class1_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Class1Impl.pattern_Class1_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep gwStep = (ChoiceStep) result2_binding[0];
		Step step = (Step) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : Class1Impl.pattern_Class1_12_2_blackBBBFFFFB(gwStep, step, flow, match)) {
			Gateway gw = (Gateway) result2_black[3];
			FlowNode node = (FlowNode) result2_black[4];
			FN2S n2s = (FN2S) result2_black[5];
			GW2S gw2gs = (GW2S) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : Class1Impl.pattern_Class1_12_3_blackBBBFBFBBB(gwStep, step, flow, gw, node,
					n2s, gw2gs)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[3];
				Gateway gcw = (Gateway) result3_black[5];
				Object[] result3_green = Class1Impl.pattern_Class1_12_3_greenBBBBBBBBBFFFFFFFFFFFF(gwStep, step, flow,
						process, gw, gcw, node, n2s, gw2gs);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge gwStep__step______lastInDef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__gwStep____steps = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge gw__gcw______conv = (EMoflonEdge) result3_green[16];
				// EMoflonEdge n2s__node____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge n2s__step____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge gw2gs__gw____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge gw2gs__gwStep____target = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl.pattern_Class1_12_4_bindingAndBlackFBBBBBBBBBBB(this,
						isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[gwStep] = " + gwStep + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", "
							+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", "
							+ "[node] = " + node + ", " + "[n2s] = " + n2s + ", " + "[gw2gs] = " + gw2gs + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Class1Impl.pattern_Class1_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Class1Impl.pattern_Class1_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Class1Impl.pattern_Class1_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Class1Impl.pattern_Class1_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ChoiceStep gwStep, Step step, Flow flow) {
		match.registerObject("gwStep", gwStep);
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ChoiceStep gwStep, Step step, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("gwStep", gwStep);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("gw", gw);
		isApplicableMatch.registerObject("gcw", gcw);
		isApplicableMatch.registerObject("node", node);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject gwStep, EObject step, EObject flow,
			EObject process, EObject gw, EObject gcw, EObject node, EObject sf, EObject n2s, EObject gw2gs) {
		ruleresult.registerObject("gwStep", gwStep);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("gw", gw);
		ruleresult.registerObject("gcw", gcw);
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("sf", sf);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_77(EMoflonEdge _edge___lastInDef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl.pattern_Class1_20_2_blackFFFB(_edge___lastInDef)) {
			ChoiceStep gwStep = (ChoiceStep) result2_black[0];
			Step step = (Step) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = Class1Impl.pattern_Class1_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_20_3_expressionFBBBBB(this, match, gwStep, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl.pattern_Class1_20_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Class1Impl.pattern_Class1_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_244(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl.pattern_Class1_21_2_blackFFFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = Class1Impl.pattern_Class1_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_21_3_expressionFBBBBBBB(this, match, process, gw, gcw, node, sf)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl.pattern_Class1_21_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Class1Impl.pattern_Class1_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_245(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl.pattern_Class1_22_2_blackFFFFFB(_edge_sourceRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = Class1Impl.pattern_Class1_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_22_3_expressionFBBBBBBB(this, match, process, gw, gcw, node, sf)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl.pattern_Class1_22_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Class1Impl.pattern_Class1_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_246(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl.pattern_Class1_23_2_blackFFFFFB(_edge_outgoing)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = Class1Impl.pattern_Class1_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_23_3_expressionFBBBBBBB(this, match, process, gw, gcw, node, sf)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl.pattern_Class1_23_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Class1Impl.pattern_Class1_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_247(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl.pattern_Class1_24_2_blackFFFFFB(_edge_targetRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = Class1Impl.pattern_Class1_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_24_3_expressionFBBBBBBB(this, match, process, gw, gcw, node, sf)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl.pattern_Class1_24_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Class1Impl.pattern_Class1_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_248(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl.pattern_Class1_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl.pattern_Class1_25_2_blackFFFFFB(_edge_incoming)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			Gateway gw = (Gateway) result2_black[1];
			Gateway gcw = (Gateway) result2_black[2];
			FlowNode node = (FlowNode) result2_black[3];
			SequenceFlow sf = (SequenceFlow) result2_black[4];
			Object[] result2_green = Class1Impl.pattern_Class1_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_25_3_expressionFBBBBBBB(this, match, process, gw, gcw, node, sf)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl.pattern_Class1_25_5_blackBBB(match, __performOperation,
							__result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Class1Impl.pattern_Class1_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Class1");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForGwStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gwStep")).findAny();
		SimpleUseCase.ChoiceStep gwStep = (SimpleUseCase.ChoiceStep) matchForGwStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.Step step = (SimpleUseCase.Step) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

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
		ruleResult.setRule("Class1");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForGwStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gwStep")).findAny();
		SimpleUseCase.ChoiceStep gwStep = (SimpleUseCase.ChoiceStep) matchForGwStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.Step step = (SimpleUseCase.Step) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

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
		Object[] result1_black = Class1Impl.pattern_Class1_28_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Class1Impl.pattern_Class1_28_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = Class1Impl.pattern_Class1_28_2_bindingFFFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		ChoiceStep gwStep = (ChoiceStep) result2_binding[0];
		Step step = (Step) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[3];
		Gateway gw = (Gateway) result2_binding[4];
		Gateway gcw = (Gateway) result2_binding[5];
		FlowNode node = (FlowNode) result2_binding[6];
		SequenceFlow sf = (SequenceFlow) result2_binding[7];
		for (Object[] result2_black : Class1Impl.pattern_Class1_28_2_blackBBBBBBBBFFBB(gwStep, step, flow, process, gw,
				gcw, node, sf, sourceMatch, targetMatch)) {
			FN2S n2s = (FN2S) result2_black[8];
			GW2S gw2gs = (GW2S) result2_black[9];
			Object[] result2_green = Class1Impl.pattern_Class1_28_2_greenBBBBBBBBBBBBF(gwStep, step, flow, process, gw,
					gcw, node, sf, n2s, gw2gs, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[12];

			// check csp
			Object[] result3_bindingAndBlack = Class1Impl.pattern_Class1_28_3_bindingAndBlackFBBBBBBBBBBBBBB(this,
					isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs, sourceMatch,
					targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = Class1Impl.pattern_Class1_28_4_blackBB(result, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				Class1Impl.pattern_Class1_28_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return Class1Impl.pattern_Class1_28_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("gwStep", gwStep);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("gw", gw);
		isApplicableMatch.registerObject("gcw", gcw);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("sf", sf);
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
		Object[] result1_black = Class1Impl.pattern_Class1_31_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = Class1Impl.pattern_Class1_31_2_bindingAndBlackFFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// ChoiceStep gwStep = (ChoiceStep) result2_bindingAndBlack[0];
		// Step step = (Step) result2_bindingAndBlack[1];
		// Flow flow = (Flow) result2_bindingAndBlack[2];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[3];
		// Gateway gw = (Gateway) result2_bindingAndBlack[4];
		// Gateway gcw = (Gateway) result2_bindingAndBlack[5];
		// FlowNode node = (FlowNode) result2_bindingAndBlack[6];
		// SequenceFlow sf = (SequenceFlow) result2_bindingAndBlack[7];
		// FN2S n2s = (FN2S) result2_bindingAndBlack[8];
		// GW2S gw2gs = (GW2S) result2_bindingAndBlack[9];
		Object[] result2_green = Class1Impl.pattern_Class1_31_2_greenF();
		PerformRuleResult result = (PerformRuleResult) result2_green[0];

		return Class1Impl.pattern_Class1_31_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, FN2S n2sParameter) {
		// create result
		Object[] result1_black = Class1Impl.pattern_Class1_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Class1Impl.pattern_Class1_32_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : Class1Impl.pattern_Class1_32_2_blackFFFFFFFFFFBB(ruleEntryContainer,
				ruleResult)) {
			// RuleEntryList n2sList = (RuleEntryList) result2_black[0];
			ChoiceStep gwStep = (ChoiceStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Step step = (Step) result2_black[3];
			FN2S n2s = (FN2S) result2_black[4];
			FlowNode node = (FlowNode) result2_black[5];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[6];
			Gateway gw = (Gateway) result2_black[7];
			Gateway gcw = (Gateway) result2_black[8];
			GW2S gw2gs = (GW2S) result2_black[9];

			// solve CSP
			Object[] result3_bindingAndBlack = Class1Impl.pattern_Class1_32_3_bindingAndBlackFBBBBBBBBBBBB(this,
					isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[gwStep] = " + gwStep
						+ ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", "
						+ "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", " + "[node] = " + node + ", " + "[n2s] = " + n2s
						+ ", " + "[gw2gs] = " + gw2gs + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (Class1Impl.pattern_Class1_32_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = Class1Impl.pattern_Class1_32_5_blackBBBBBBBBB(gwStep, step, flow, process, gw,
						gcw, node, n2s, gw2gs);
				if (result5_black != null) {

					// perform
					Object[] result6_black = Class1Impl.pattern_Class1_32_6_blackBBBBBBBBBB(gwStep, step, flow, process,
							gw, gcw, node, n2s, gw2gs, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[gwStep] = " + gwStep + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", "
								+ "[process] = " + process + ", " + "[gw] = " + gw + ", " + "[gcw] = " + gcw + ", "
								+ "[node] = " + node + ", " + "[n2s] = " + n2s + ", " + "[gw2gs] = " + gw2gs + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					Class1Impl.pattern_Class1_32_6_greenBBBBBFB(gwStep, step, process, gcw, node, ruleResult);
					// SequenceFlow sf = (SequenceFlow) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_32_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs,
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
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("gw", gw);
		isApplicableMatch.registerObject("gcw", gcw);
		isApplicableMatch.registerObject("node", node);
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
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(Gateway) arguments.get(2), (Gateway) arguments.get(3), (FlowNode) arguments.get(4),
					(SequenceFlow) arguments.get(5));
		case RulesPackage.CLASS1___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(Gateway) arguments.get(2), (Gateway) arguments.get(3), (FlowNode) arguments.get(4),
					(SequenceFlow) arguments.get(5));
			return null;
		case RulesPackage.CLASS1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(Gateway) arguments.get(2), (Gateway) arguments.get(3), (FlowNode) arguments.get(4),
					(SequenceFlow) arguments.get(5));
		case RulesPackage.CLASS1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_FN2S_GW2S:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ChoiceStep) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(Gateway) arguments.get(5), (Gateway) arguments.get(6), (FlowNode) arguments.get(7),
					(SequenceFlow) arguments.get(8), (FN2S) arguments.get(9), (GW2S) arguments.get(10));
		case RulesPackage.CLASS1___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.CLASS1___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1), (Step) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.CLASS1___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1), (Step) arguments.get(2),
					(Flow) arguments.get(3));
			return null;
		case RulesPackage.CLASS1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.CLASS1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_FN2S_GW2S:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ChoiceStep) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(Gateway) arguments.get(5), (Gateway) arguments.get(6), (FlowNode) arguments.get(7),
					(FN2S) arguments.get(8), (GW2S) arguments.get(9));
		case RulesPackage.CLASS1___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.CLASS1___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_BWD_EMOFLON_EDGE_77__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_77((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_244__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_244((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_245__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_245((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_246__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_246((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_247__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_247((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_EMOFLON_EDGE_248__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_248((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS1___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_SEQUENCEFLOW_FN2S_GW2S_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (ChoiceStep) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(Gateway) arguments.get(5), (Gateway) arguments.get(6), (FlowNode) arguments.get(7),
					(SequenceFlow) arguments.get(8), (FN2S) arguments.get(9), (GW2S) arguments.get(10),
					(Match) arguments.get(11), (Match) arguments.get(12));
		case RulesPackage.CLASS1___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS1___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.CLASS1___GENERATE_MODEL__RULEENTRYCONTAINER_FN2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (FN2S) arguments.get(1));
		case RulesPackage.CLASS1___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CHOICESTEP_STEP_FLOW_PROCESS_GATEWAY_GATEWAY_FLOWNODE_FN2S_GW2S_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ChoiceStep) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(Gateway) arguments.get(5), (Gateway) arguments.get(6), (FlowNode) arguments.get(7),
					(FN2S) arguments.get(8), (GW2S) arguments.get(9), (ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.CLASS1___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Class1_0_1_blackBBBBBBB(Class1 _this, Match match, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					return new Object[] { _this, match, process, gw, gcw, node, sf };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_0_2_bindingFBBBBBBB(Class1 _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, gw, gcw, node, sf);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, gw, gcw, node, sf };
		}
		return null;
	}

	public static final Object[] pattern_Class1_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_0_2_bindingAndBlackFBBBBBBB(Class1 _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		Object[] result_pattern_Class1_0_2_binding = pattern_Class1_0_2_bindingFBBBBBBB(_this, match, process, gw, gcw,
				node, sf);
		if (result_pattern_Class1_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_0_2_binding[0];

			Object[] result_pattern_Class1_0_2_black = pattern_Class1_0_2_blackB(csp);
			if (result_pattern_Class1_0_2_black != null) {

				return new Object[] { csp, _this, match, process, gw, gcw, node, sf };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_0_3_expressionFBB(Class1 _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_0_4_blackBBBBBB(Match match, SimpleBPMN.Process process, Gateway gw,
			Gateway gcw, FlowNode node, SequenceFlow sf) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					return new Object[] { match, process, gw, gcw, node, sf };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_0_4_greenBBBBBFFFFF(Match match, SimpleBPMN.Process process,
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

	public static final Object[] pattern_Class1_0_5_blackBBBBBB(Match match, SimpleBPMN.Process process, Gateway gw,
			Gateway gcw, FlowNode node, SequenceFlow sf) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					return new Object[] { match, process, gw, gcw, node, sf };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_0_5_greenBBBBBFFFF(Match match, SimpleBPMN.Process process, Gateway gw,
			Gateway gcw, FlowNode node) {
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

	public static final void pattern_Class1_0_6_expressionBBBBBBB(Class1 _this, Match match, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		_this.registerObjectsToMatch_FWD(match, process, gw, gcw, node, sf);

	}

	public static final boolean pattern_Class1_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Class1_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Class1_1_1_bindingFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("gw");
		EObject _localVariable_5 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_6 = isApplicableMatch.getObject("node");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf");
		EObject _localVariable_8 = isApplicableMatch.getObject("n2s");
		EObject _localVariable_9 = isApplicableMatch.getObject("gw2gs");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpGw = _localVariable_4;
		EObject tmpGcw = _localVariable_5;
		EObject tmpNode = _localVariable_6;
		EObject tmpSf = _localVariable_7;
		EObject tmpN2s = _localVariable_8;
		EObject tmpGw2gs = _localVariable_9;
		if (tmpGwStep instanceof ChoiceStep) {
			ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
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
										if (tmpN2s instanceof FN2S) {
											FN2S n2s = (FN2S) tmpN2s;
											if (tmpGw2gs instanceof GW2S) {
												GW2S gw2gs = (GW2S) tmpGw2gs;
												return new Object[] { gwStep, step, flow, process, gw, gcw, node, sf,
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

	public static final Object[] pattern_Class1_1_1_blackBBBBBBBBBBBFB(ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs,
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs, _this,
										csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_bindingAndBlackFFFFFFFFFFBFB(Class1 _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_1_1_binding = pattern_Class1_1_1_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_Class1_1_1_binding != null) {
			ChoiceStep gwStep = (ChoiceStep) result_pattern_Class1_1_1_binding[0];
			Step step = (Step) result_pattern_Class1_1_1_binding[1];
			Flow flow = (Flow) result_pattern_Class1_1_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Class1_1_1_binding[3];
			Gateway gw = (Gateway) result_pattern_Class1_1_1_binding[4];
			Gateway gcw = (Gateway) result_pattern_Class1_1_1_binding[5];
			FlowNode node = (FlowNode) result_pattern_Class1_1_1_binding[6];
			SequenceFlow sf = (SequenceFlow) result_pattern_Class1_1_1_binding[7];
			FN2S n2s = (FN2S) result_pattern_Class1_1_1_binding[8];
			GW2S gw2gs = (GW2S) result_pattern_Class1_1_1_binding[9];

			Object[] result_pattern_Class1_1_1_black = pattern_Class1_1_1_blackBBBBBBBBBBBFB(gwStep, step, flow,
					process, gw, gcw, node, sf, n2s, gw2gs, _this, isApplicableMatch);
			if (result_pattern_Class1_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_1_1_black[11];

				return new Object[] { gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_greenBB(ChoiceStep gwStep, Step step) {
		gwStep.set__lastInDef(step);
		return new Object[] { gwStep, step };
	}

	public static final Object[] pattern_Class1_1_2_blackB(SequenceFlow sf) {
		return new Object[] { sf };
	}

	public static final Object[] pattern_Class1_1_2_greenFB(SequenceFlow sf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf);
		return new Object[] { ruleresult, sf };
	}

	public static final Object[] pattern_Class1_1_3_blackBBBBBBBBBBB(PerformRuleResult ruleresult, EObject gwStep,
			EObject step, EObject flow, EObject process, EObject gw, EObject gcw, EObject node, EObject sf, EObject n2s,
			EObject gw2gs) {
		if (!gwStep.equals(step)) {
			if (!gwStep.equals(process)) {
				if (!gwStep.equals(node)) {
					if (!gwStep.equals(sf)) {
						if (!gwStep.equals(n2s)) {
							if (!flow.equals(gwStep)) {
								if (!flow.equals(step)) {
									if (!flow.equals(process)) {
										if (!flow.equals(gw)) {
											if (!flow.equals(gcw)) {
												if (!flow.equals(node)) {
													if (!flow.equals(sf)) {
														if (!flow.equals(n2s)) {
															if (!flow.equals(gw2gs)) {
																if (!process.equals(step)) {
																	if (!process.equals(sf)) {
																		if (!gw.equals(gwStep)) {
																			if (!gw.equals(step)) {
																				if (!gw.equals(process)) {
																					if (!gw.equals(node)) {
																						if (!gw.equals(sf)) {
																							if (!gw.equals(n2s)) {
																								if (!gw.equals(gw2gs)) {
																									if (!gcw.equals(
																											gwStep)) {
																										if (!gcw.equals(
																												step)) {
																											if (!gcw.equals(
																													process)) {
																												if (!gcw.equals(
																														gw)) {
																													if (!gcw.equals(
																															node)) {
																														if (!gcw.equals(
																																sf)) {
																															if (!gcw.equals(
																																	n2s)) {
																																if (!gcw.equals(
																																		gw2gs)) {
																																	if (!node
																																			.equals(step)) {
																																		if (!node
																																				.equals(process)) {
																																			if (!node
																																					.equals(sf)) {
																																				if (!sf.equals(
																																						step)) {
																																					if (!n2s.equals(
																																							step)) {
																																						if (!n2s.equals(
																																								process)) {
																																							if (!n2s.equals(
																																									node)) {
																																								if (!n2s.equals(
																																										sf)) {
																																									if (!gw2gs
																																											.equals(gwStep)) {
																																										if (!gw2gs
																																												.equals(step)) {
																																											if (!gw2gs
																																													.equals(process)) {
																																												if (!gw2gs
																																														.equals(node)) {
																																													if (!gw2gs
																																															.equals(sf)) {
																																														if (!gw2gs
																																																.equals(n2s)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	gwStep,
																																																	step,
																																																	flow,
																																																	process,
																																																	gw,
																																																	gcw,
																																																	node,
																																																	sf,
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

	public static final Object[] pattern_Class1_1_3_greenBBBBBBBFFFFFF(PerformRuleResult ruleresult, EObject gwStep,
			EObject step, EObject process, EObject gcw, EObject node, EObject sf) {
		EMoflonEdge gwStep__step______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String gwStep__step______lastInDef_name_prime = "__lastInDef";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__node____sourceRef_name_prime = "sourceRef";
		String node__sf____outgoing_name_prime = "outgoing";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		gwStep__step______lastInDef.setSrc(gwStep);
		gwStep__step______lastInDef.setTrg(step);
		ruleresult.getCreatedEdges().add(gwStep__step______lastInDef);
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
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		gwStep__step______lastInDef.setName(gwStep__step______lastInDef_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__node____sourceRef.setName(sf__node____sourceRef_name_prime);
		node__sf____outgoing.setName(node__sf____outgoing_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		return new Object[] { ruleresult, gwStep, step, process, gcw, node, sf, gwStep__step______lastInDef,
				process__sf____flowElements, sf__node____sourceRef, node__sf____outgoing, sf__gcw____targetRef,
				gcw__sf____incoming };
	}

	public static final void pattern_Class1_1_5_expressionBBBBBBBBBBBB(Class1 _this, PerformRuleResult ruleresult,
			EObject gwStep, EObject step, EObject flow, EObject process, EObject gw, EObject gcw, EObject node,
			EObject sf, EObject n2s, EObject gw2gs) {
		_this.registerObjects_FWD(ruleresult, gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs);

	}

	public static final PerformRuleResult pattern_Class1_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_2_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_blackFBB(EClass eClass, Class1 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_bindingAndBlackFFB(Class1 _this) {
		Object[] result_pattern_Class1_2_1_binding = pattern_Class1_2_1_bindingFB(_this);
		if (result_pattern_Class1_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Class1_2_1_binding[0];

			Object[] result_pattern_Class1_2_1_black = pattern_Class1_2_1_blackFBB(eClass, _this);
			if (result_pattern_Class1_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Class1_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Class1";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Class1_2_2_bindingFFFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_Class1_2_2_blackFFBBBBBFFB(SimpleBPMN.Process process, Gateway gw,
			Gateway gcw, FlowNode node, SequenceFlow sf, Match match) {
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
														_result.add(new Object[] { gwStep, step, process, gw, gcw, node,
																sf, n2s, gw2gs, match });
													}
												}

											}
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

	public static final Iterable<Object[]> pattern_Class1_2_3_blackBBFBBBBBBB(ChoiceStep gwStep, Step step,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs) {
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
																					for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									step, Flow.class,
																									"steps")) {
																						if (flow.getSteps()
																								.contains(gwStep)) {
																							_result.add(new Object[] {
																									gwStep, step, flow,
																									process, gw, gcw,
																									node, sf, n2s,
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

	public static final Object[] pattern_Class1_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(ChoiceStep gwStep, Step step,
			Flow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s,
			GW2S gw2gs) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__gwStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gcw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__gcw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2s__node____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gwStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String flow__step____steps_name_prime = "steps";
		String flow__gwStep____steps_name_prime = "steps";
		String process__gw____flowElements_name_prime = "flowElements";
		String process__gcw____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String process__sf____flowElements_name_prime = "flowElements";
		String gw__gcw______conv_name_prime = "__conv";
		String sf__node____sourceRef_name_prime = "sourceRef";
		String node__sf____outgoing_name_prime = "outgoing";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		String n2s__node____source_name_prime = "source";
		String n2s__step____target_name_prime = "target";
		String gw2gs__gw____source_name_prime = "source";
		String gw2gs__gwStep____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(sf);
		isApplicableMatch.getAllContextElements().add(n2s);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		flow__gwStep____steps.setSrc(flow);
		flow__gwStep____steps.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(flow__gwStep____steps);
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
		flow__step____steps.setName(flow__step____steps_name_prime);
		flow__gwStep____steps.setName(flow__gwStep____steps_name_prime);
		process__gw____flowElements.setName(process__gw____flowElements_name_prime);
		process__gcw____flowElements.setName(process__gcw____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		gw__gcw______conv.setName(gw__gcw______conv_name_prime);
		sf__node____sourceRef.setName(sf__node____sourceRef_name_prime);
		node__sf____outgoing.setName(node__sf____outgoing_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		n2s__node____source.setName(n2s__node____source_name_prime);
		n2s__step____target.setName(n2s__step____target_name_prime);
		gw2gs__gw____source.setName(gw2gs__gw____source_name_prime);
		gw2gs__gwStep____target.setName(gw2gs__gwStep____target_name_prime);
		return new Object[] { gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs, isApplicableMatch,
				flow__step____steps, flow__gwStep____steps, process__gw____flowElements, process__gcw____flowElements,
				process__node____flowElements, process__sf____flowElements, gw__gcw______conv, sf__node____sourceRef,
				node__sf____outgoing, sf__gcw____targetRef, gcw__sf____incoming, n2s__node____source,
				n2s__step____target, gw2gs__gw____source, gw2gs__gwStep____target };
	}

	public static final Object[] pattern_Class1_2_4_bindingFBBBBBBBBBBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, gwStep, step, flow, process, gw, gcw,
				node, sf, n2s, gw2gs);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, sf, n2s,
					gw2gs };
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_2_4_bindingAndBlackFBBBBBBBBBBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs) {
		Object[] result_pattern_Class1_2_4_binding = pattern_Class1_2_4_bindingFBBBBBBBBBBBB(_this, isApplicableMatch,
				gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs);
		if (result_pattern_Class1_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_2_4_binding[0];

			Object[] result_pattern_Class1_2_4_black = pattern_Class1_2_4_blackB(csp);
			if (result_pattern_Class1_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, sf,
						n2s, gw2gs };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_2_5_expressionFBB(Class1 _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Class1";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Class1_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_10_1_blackBBBBB(Class1 _this, Match match, ChoiceStep gwStep, Step step,
			Flow flow) {
		if (!gwStep.equals(step)) {
			return new Object[] { _this, match, gwStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_10_2_bindingFBBBBB(Class1 _this, Match match, ChoiceStep gwStep,
			Step step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, gwStep, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, gwStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_10_2_bindingAndBlackFBBBBB(Class1 _this, Match match, ChoiceStep gwStep,
			Step step, Flow flow) {
		Object[] result_pattern_Class1_10_2_binding = pattern_Class1_10_2_bindingFBBBBB(_this, match, gwStep, step,
				flow);
		if (result_pattern_Class1_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_10_2_binding[0];

			Object[] result_pattern_Class1_10_2_black = pattern_Class1_10_2_blackB(csp);
			if (result_pattern_Class1_10_2_black != null) {

				return new Object[] { csp, _this, match, gwStep, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_10_3_expressionFBB(Class1 _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_10_4_blackBBBB(Match match, ChoiceStep gwStep, Step step, Flow flow) {
		if (!gwStep.equals(step)) {
			return new Object[] { match, gwStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_10_4_greenBBBF(Match match, ChoiceStep gwStep, Step step) {
		EMoflonEdge gwStep__step______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String gwStep__step______lastInDef_name_prime = "__lastInDef";
		gwStep__step______lastInDef.setSrc(gwStep);
		gwStep__step______lastInDef.setTrg(step);
		match.getToBeTranslatedEdges().add(gwStep__step______lastInDef);
		gwStep__step______lastInDef.setName(gwStep__step______lastInDef_name_prime);
		return new Object[] { match, gwStep, step, gwStep__step______lastInDef };
	}

	public static final Object[] pattern_Class1_10_5_blackBBBB(Match match, ChoiceStep gwStep, Step step, Flow flow) {
		if (!gwStep.equals(step)) {
			return new Object[] { match, gwStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_10_5_greenBBBBFF(Match match, ChoiceStep gwStep, Step step, Flow flow) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__gwStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(gwStep);
		match.getContextNodes().add(step);
		match.getContextNodes().add(flow);
		String flow__step____steps_name_prime = "steps";
		String flow__gwStep____steps_name_prime = "steps";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getContextEdges().add(flow__step____steps);
		flow__gwStep____steps.setSrc(flow);
		flow__gwStep____steps.setTrg(gwStep);
		match.getContextEdges().add(flow__gwStep____steps);
		flow__step____steps.setName(flow__step____steps_name_prime);
		flow__gwStep____steps.setName(flow__gwStep____steps_name_prime);
		return new Object[] { match, gwStep, step, flow, flow__step____steps, flow__gwStep____steps };
	}

	public static final void pattern_Class1_10_6_expressionBBBBB(Class1 _this, Match match, ChoiceStep gwStep,
			Step step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, gwStep, step, flow);

	}

	public static final boolean pattern_Class1_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Class1_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Class1_11_1_bindingFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("gw");
		EObject _localVariable_5 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_6 = isApplicableMatch.getObject("node");
		EObject _localVariable_7 = isApplicableMatch.getObject("n2s");
		EObject _localVariable_8 = isApplicableMatch.getObject("gw2gs");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpGw = _localVariable_4;
		EObject tmpGcw = _localVariable_5;
		EObject tmpNode = _localVariable_6;
		EObject tmpN2s = _localVariable_7;
		EObject tmpGw2gs = _localVariable_8;
		if (tmpGwStep instanceof ChoiceStep) {
			ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpGw instanceof Gateway) {
							Gateway gw = (Gateway) tmpGw;
							if (tmpGcw instanceof Gateway) {
								Gateway gcw = (Gateway) tmpGcw;
								if (tmpNode instanceof FlowNode) {
									FlowNode node = (FlowNode) tmpNode;
									if (tmpN2s instanceof FN2S) {
										FN2S n2s = (FN2S) tmpN2s;
										if (tmpGw2gs instanceof GW2S) {
											GW2S gw2gs = (GW2S) tmpGw2gs;
											return new Object[] { gwStep, step, flow, process, gw, gcw, node, n2s,
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

	public static final Object[] pattern_Class1_11_1_blackBBBBBBBBBBFB(ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs, Class1 _this,
			IsApplicableMatch isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs, _this,
										csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_bindingAndBlackFFFFFFFFFBFB(Class1 _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_11_1_binding = pattern_Class1_11_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_Class1_11_1_binding != null) {
			ChoiceStep gwStep = (ChoiceStep) result_pattern_Class1_11_1_binding[0];
			Step step = (Step) result_pattern_Class1_11_1_binding[1];
			Flow flow = (Flow) result_pattern_Class1_11_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Class1_11_1_binding[3];
			Gateway gw = (Gateway) result_pattern_Class1_11_1_binding[4];
			Gateway gcw = (Gateway) result_pattern_Class1_11_1_binding[5];
			FlowNode node = (FlowNode) result_pattern_Class1_11_1_binding[6];
			FN2S n2s = (FN2S) result_pattern_Class1_11_1_binding[7];
			GW2S gw2gs = (GW2S) result_pattern_Class1_11_1_binding[8];

			Object[] result_pattern_Class1_11_1_black = pattern_Class1_11_1_blackBBBBBBBBBBFB(gwStep, step, flow,
					process, gw, gcw, node, n2s, gw2gs, _this, isApplicableMatch);
			if (result_pattern_Class1_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_11_1_black[10];

				return new Object[] { gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_greenBBBF(SimpleBPMN.Process process, Gateway gcw, FlowNode node) {
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		process.getFlowElements().add(sf);
		sf.setSourceRef(node);
		sf.setTargetRef(gcw);
		return new Object[] { process, gcw, node, sf };
	}

	public static final Object[] pattern_Class1_11_2_blackB(SequenceFlow sf) {
		return new Object[] { sf };
	}

	public static final Object[] pattern_Class1_11_2_greenFB(SequenceFlow sf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf);
		return new Object[] { ruleresult, sf };
	}

	public static final Object[] pattern_Class1_11_3_blackBBBBBBBBBBB(PerformRuleResult ruleresult, EObject gwStep,
			EObject step, EObject flow, EObject process, EObject gw, EObject gcw, EObject node, EObject sf, EObject n2s,
			EObject gw2gs) {
		if (!gwStep.equals(step)) {
			if (!gwStep.equals(process)) {
				if (!gwStep.equals(node)) {
					if (!gwStep.equals(sf)) {
						if (!gwStep.equals(n2s)) {
							if (!flow.equals(gwStep)) {
								if (!flow.equals(step)) {
									if (!flow.equals(process)) {
										if (!flow.equals(gw)) {
											if (!flow.equals(gcw)) {
												if (!flow.equals(node)) {
													if (!flow.equals(sf)) {
														if (!flow.equals(n2s)) {
															if (!flow.equals(gw2gs)) {
																if (!process.equals(step)) {
																	if (!process.equals(sf)) {
																		if (!gw.equals(gwStep)) {
																			if (!gw.equals(step)) {
																				if (!gw.equals(process)) {
																					if (!gw.equals(node)) {
																						if (!gw.equals(sf)) {
																							if (!gw.equals(n2s)) {
																								if (!gw.equals(gw2gs)) {
																									if (!gcw.equals(
																											gwStep)) {
																										if (!gcw.equals(
																												step)) {
																											if (!gcw.equals(
																													process)) {
																												if (!gcw.equals(
																														gw)) {
																													if (!gcw.equals(
																															node)) {
																														if (!gcw.equals(
																																sf)) {
																															if (!gcw.equals(
																																	n2s)) {
																																if (!gcw.equals(
																																		gw2gs)) {
																																	if (!node
																																			.equals(step)) {
																																		if (!node
																																				.equals(process)) {
																																			if (!node
																																					.equals(sf)) {
																																				if (!sf.equals(
																																						step)) {
																																					if (!n2s.equals(
																																							step)) {
																																						if (!n2s.equals(
																																								process)) {
																																							if (!n2s.equals(
																																									node)) {
																																								if (!n2s.equals(
																																										sf)) {
																																									if (!gw2gs
																																											.equals(gwStep)) {
																																										if (!gw2gs
																																												.equals(step)) {
																																											if (!gw2gs
																																													.equals(process)) {
																																												if (!gw2gs
																																														.equals(node)) {
																																													if (!gw2gs
																																															.equals(sf)) {
																																														if (!gw2gs
																																																.equals(n2s)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	gwStep,
																																																	step,
																																																	flow,
																																																	process,
																																																	gw,
																																																	gcw,
																																																	node,
																																																	sf,
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

	public static final Object[] pattern_Class1_11_3_greenBBBBBBBFFFFFF(PerformRuleResult ruleresult, EObject gwStep,
			EObject step, EObject process, EObject gcw, EObject node, EObject sf) {
		EMoflonEdge gwStep__step______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String gwStep__step______lastInDef_name_prime = "__lastInDef";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__node____sourceRef_name_prime = "sourceRef";
		String node__sf____outgoing_name_prime = "outgoing";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		gwStep__step______lastInDef.setSrc(gwStep);
		gwStep__step______lastInDef.setTrg(step);
		ruleresult.getTranslatedEdges().add(gwStep__step______lastInDef);
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
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		gwStep__step______lastInDef.setName(gwStep__step______lastInDef_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__node____sourceRef.setName(sf__node____sourceRef_name_prime);
		node__sf____outgoing.setName(node__sf____outgoing_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		return new Object[] { ruleresult, gwStep, step, process, gcw, node, sf, gwStep__step______lastInDef,
				process__sf____flowElements, sf__node____sourceRef, node__sf____outgoing, sf__gcw____targetRef,
				gcw__sf____incoming };
	}

	public static final void pattern_Class1_11_5_expressionBBBBBBBBBBBB(Class1 _this, PerformRuleResult ruleresult,
			EObject gwStep, EObject step, EObject flow, EObject process, EObject gw, EObject gcw, EObject node,
			EObject sf, EObject n2s, EObject gw2gs) {
		_this.registerObjects_BWD(ruleresult, gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs);

	}

	public static final PerformRuleResult pattern_Class1_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_12_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_blackFBB(EClass eClass, Class1 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_bindingAndBlackFFB(Class1 _this) {
		Object[] result_pattern_Class1_12_1_binding = pattern_Class1_12_1_bindingFB(_this);
		if (result_pattern_Class1_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Class1_12_1_binding[0];

			Object[] result_pattern_Class1_12_1_black = pattern_Class1_12_1_blackFBB(eClass, _this);
			if (result_pattern_Class1_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Class1_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Class1";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Class1_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("gwStep");
		EObject _localVariable_1 = match.getObject("step");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpGwStep instanceof ChoiceStep) {
			ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { gwStep, step, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_12_2_blackBBBFFFFB(ChoiceStep gwStep, Step step, Flow flow,
			Match match) {
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
										_result.add(new Object[] { gwStep, step, flow, gw, node, n2s, gw2gs, match });
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

	public static final Iterable<Object[]> pattern_Class1_12_3_blackBBBFBFBBB(ChoiceStep gwStep, Step step, Flow flow,
			Gateway gw, FlowNode node, FN2S n2s, GW2S gw2gs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (step.equals(gwStep.get__lastInDef())) {
					if (flow.getSteps().contains(step)) {
						if (flow.getSteps().contains(gwStep)) {
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
																							step, flow, process, gw,
																							gcw, node, n2s, gw2gs });
																				}
																			}
																		}
																	}
																}

															}
														}

													}
												}
											}

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

	public static final Object[] pattern_Class1_12_3_greenBBBBBBBBBFFFFFFFFFFFF(ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge gwStep__step______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__gwStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gcw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__gcw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2s__node____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gwStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String gwStep__step______lastInDef_name_prime = "__lastInDef";
		String flow__step____steps_name_prime = "steps";
		String flow__gwStep____steps_name_prime = "steps";
		String process__gw____flowElements_name_prime = "flowElements";
		String process__gcw____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String gw__gcw______conv_name_prime = "__conv";
		String n2s__node____source_name_prime = "source";
		String n2s__step____target_name_prime = "target";
		String gw2gs__gw____source_name_prime = "source";
		String gw2gs__gwStep____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(n2s);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		gwStep__step______lastInDef.setSrc(gwStep);
		gwStep__step______lastInDef.setTrg(step);
		isApplicableMatch.getAllContextElements().add(gwStep__step______lastInDef);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		flow__gwStep____steps.setSrc(flow);
		flow__gwStep____steps.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(flow__gwStep____steps);
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
		gwStep__step______lastInDef.setName(gwStep__step______lastInDef_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		flow__gwStep____steps.setName(flow__gwStep____steps_name_prime);
		process__gw____flowElements.setName(process__gw____flowElements_name_prime);
		process__gcw____flowElements.setName(process__gcw____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		gw__gcw______conv.setName(gw__gcw______conv_name_prime);
		n2s__node____source.setName(n2s__node____source_name_prime);
		n2s__step____target.setName(n2s__step____target_name_prime);
		gw2gs__gw____source.setName(gw2gs__gw____source_name_prime);
		gw2gs__gwStep____target.setName(gw2gs__gwStep____target_name_prime);
		return new Object[] { gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs, isApplicableMatch,
				gwStep__step______lastInDef, flow__step____steps, flow__gwStep____steps, process__gw____flowElements,
				process__gcw____flowElements, process__node____flowElements, gw__gcw______conv, n2s__node____source,
				n2s__step____target, gw2gs__gw____source, gw2gs__gwStep____target };
	}

	public static final Object[] pattern_Class1_12_4_bindingFBBBBBBBBBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, gwStep, step, flow, process, gw, gcw,
				node, n2s, gw2gs);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, n2s,
					gw2gs };
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_12_4_bindingAndBlackFBBBBBBBBBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs) {
		Object[] result_pattern_Class1_12_4_binding = pattern_Class1_12_4_bindingFBBBBBBBBBBB(_this, isApplicableMatch,
				gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs);
		if (result_pattern_Class1_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_12_4_binding[0];

			Object[] result_pattern_Class1_12_4_black = pattern_Class1_12_4_blackB(csp);
			if (result_pattern_Class1_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, n2s,
						gw2gs };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_12_5_expressionFBB(Class1 _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Class1";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Class1_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_20_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_blackFBB(EClass __eClass, Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_bindingAndBlackFFB(Class1 _this) {
		Object[] result_pattern_Class1_20_1_binding = pattern_Class1_20_1_bindingFB(_this);
		if (result_pattern_Class1_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_20_1_binding[0];

			Object[] result_pattern_Class1_20_1_black = pattern_Class1_20_1_blackFBB(__eClass, _this);
			if (result_pattern_Class1_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Class1_20_2_blackFFFB(EMoflonEdge _edge___lastInDef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGwStep = _edge___lastInDef.getSrc();
		if (tmpGwStep instanceof ChoiceStep) {
			ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
			EObject tmpStep = _edge___lastInDef.getTrg();
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (!gwStep.equals(step)) {
					if (step.equals(gwStep.get__lastInDef())) {
						for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(gwStep,
								Flow.class, "steps")) {
							if (flow.getSteps().contains(step)) {
								_result.add(new Object[] { gwStep, step, flow, _edge___lastInDef });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Class1_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_20_3_expressionFBBBBB(Class1 _this, Match match, ChoiceStep gwStep,
			Step step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, gwStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_20_4_expressionFBB(Class1 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_21_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_blackFBB(EClass __eClass, Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_bindingAndBlackFFB(Class1 _this) {
		Object[] result_pattern_Class1_21_1_binding = pattern_Class1_21_1_bindingFB(_this);
		if (result_pattern_Class1_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_21_1_binding[0];

			Object[] result_pattern_Class1_21_1_black = pattern_Class1_21_1_blackFBB(__eClass, _this);
			if (result_pattern_Class1_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_21_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_356775 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_356775)) {
							if (!gcw.equals(__DEC_sf_default_356775)) {
								if (!node.equals(__DEC_sf_default_356775)) {
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

	public static final Object[] pattern_Class1_21_2_black_nac_1BB(SequenceFlow sf, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_209437 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_209437)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_21_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
												if (pattern_Class1_21_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_Class1_21_2_black_nac_0BBBB(
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

	public static final Object[] pattern_Class1_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_21_3_expressionFBBBBBBB(Class1 _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_21_4_expressionFBB(Class1 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_22_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_22_1_blackFBB(EClass __eClass, Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_22_1_bindingAndBlackFFB(Class1 _this) {
		Object[] result_pattern_Class1_22_1_binding = pattern_Class1_22_1_bindingFB(_this);
		if (result_pattern_Class1_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_22_1_binding[0];

			Object[] result_pattern_Class1_22_1_black = pattern_Class1_22_1_blackFBB(__eClass, _this);
			if (result_pattern_Class1_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_22_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_622323 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_622323)) {
							if (!gcw.equals(__DEC_sf_default_622323)) {
								if (!node.equals(__DEC_sf_default_622323)) {
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

	public static final Object[] pattern_Class1_22_2_black_nac_1BB(SequenceFlow sf, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_545378 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_545378)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_22_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
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
												if (pattern_Class1_22_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_Class1_22_2_black_nac_0BBBB(
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

	public static final Object[] pattern_Class1_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_22_3_expressionFBBBBBBB(Class1 _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_22_4_expressionFBB(Class1 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_23_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_23_1_blackFBB(EClass __eClass, Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_23_1_bindingAndBlackFFB(Class1 _this) {
		Object[] result_pattern_Class1_23_1_binding = pattern_Class1_23_1_bindingFB(_this);
		if (result_pattern_Class1_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_23_1_binding[0];

			Object[] result_pattern_Class1_23_1_black = pattern_Class1_23_1_blackFBB(__eClass, _this);
			if (result_pattern_Class1_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_23_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_497941 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_497941)) {
							if (!gcw.equals(__DEC_sf_default_497941)) {
								if (!node.equals(__DEC_sf_default_497941)) {
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

	public static final Object[] pattern_Class1_23_2_black_nac_1BB(SequenceFlow sf, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_493149 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_493149)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_23_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
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
												if (pattern_Class1_23_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_Class1_23_2_black_nac_0BBBB(
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

	public static final Object[] pattern_Class1_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_23_3_expressionFBBBBBBB(Class1 _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_23_4_expressionFBB(Class1 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_24_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_24_1_blackFBB(EClass __eClass, Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_24_1_bindingAndBlackFFB(Class1 _this) {
		Object[] result_pattern_Class1_24_1_binding = pattern_Class1_24_1_bindingFB(_this);
		if (result_pattern_Class1_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_24_1_binding[0];

			Object[] result_pattern_Class1_24_1_black = pattern_Class1_24_1_blackFBB(__eClass, _this);
			if (result_pattern_Class1_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_24_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_144860 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_144860)) {
							if (!gcw.equals(__DEC_sf_default_144860)) {
								if (!node.equals(__DEC_sf_default_144860)) {
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

	public static final Object[] pattern_Class1_24_2_black_nac_1BB(SequenceFlow sf, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_963226 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_963226)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_24_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
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
												if (pattern_Class1_24_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_Class1_24_2_black_nac_0BBBB(
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

	public static final Object[] pattern_Class1_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_24_3_expressionFBBBBBBB(Class1 _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_24_4_expressionFBB(Class1 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_25_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_25_1_blackFBB(EClass __eClass, Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_25_1_bindingAndBlackFFB(Class1 _this) {
		Object[] result_pattern_Class1_25_1_binding = pattern_Class1_25_1_bindingFB(_this);
		if (result_pattern_Class1_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_25_1_binding[0];

			Object[] result_pattern_Class1_25_1_black = pattern_Class1_25_1_blackFBB(__eClass, _this);
			if (result_pattern_Class1_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Class1_25_2_black_nac_0BBBB(SequenceFlow sf, Gateway gw, Gateway gcw,
			FlowNode node) {
		if (!gw.equals(node)) {
			if (!gcw.equals(gw)) {
				if (!gcw.equals(node)) {
					for (ExclusiveGateway __DEC_sf_default_536380 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
						if (!gw.equals(__DEC_sf_default_536380)) {
							if (!gcw.equals(__DEC_sf_default_536380)) {
								if (!node.equals(__DEC_sf_default_536380)) {
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

	public static final Object[] pattern_Class1_25_2_black_nac_1BB(SequenceFlow sf, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_679961 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_679961)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_25_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
												if (pattern_Class1_25_2_black_nac_1BB(sf, process) == null) {
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
																				if (pattern_Class1_25_2_black_nac_0BBBB(
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

	public static final Object[] pattern_Class1_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_25_3_expressionFBBBBBBB(Class1 _this, Match match,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, gw, gcw, node, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_25_4_expressionFBB(Class1 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_28_1_blackB(Class1 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Class1_28_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Class1_28_2_bindingFFFFFFFFBB(Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("gwStep");
		EObject _localVariable_1 = targetMatch.getObject("step");
		EObject _localVariable_2 = targetMatch.getObject("flow");
		EObject _localVariable_3 = sourceMatch.getObject("process");
		EObject _localVariable_4 = sourceMatch.getObject("gw");
		EObject _localVariable_5 = sourceMatch.getObject("gcw");
		EObject _localVariable_6 = sourceMatch.getObject("node");
		EObject _localVariable_7 = sourceMatch.getObject("sf");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpGw = _localVariable_4;
		EObject tmpGcw = _localVariable_5;
		EObject tmpNode = _localVariable_6;
		EObject tmpSf = _localVariable_7;
		if (tmpGwStep instanceof ChoiceStep) {
			ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
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
										return new Object[] { gwStep, step, flow, process, gw, gcw, node, sf,
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

	public static final Iterable<Object[]> pattern_Class1_28_2_blackBBBBBBBBFFBB(ChoiceStep gwStep, Step step,
			Flow flow, SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						if (!sourceMatch.equals(targetMatch)) {
							if (step.equals(gwStep.get__lastInDef())) {
								if (flow.getSteps().contains(step)) {
									if (flow.getSteps().contains(gwStep)) {
										if (process.getFlowElements().contains(gw)) {
											if (process.getFlowElements().contains(gcw)) {
												if (process.getFlowElements().contains(node)) {
													if (process.getFlowElements().contains(sf)) {
														if (gcw.equals(gw.get__conv())) {
															if (node.equals(sf.getSourceRef())) {
																if (gcw.equals(sf.getTargetRef())) {
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
																													step,
																													flow,
																													process,
																													gw,
																													gcw,
																													node,
																													sf,
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

	public static final Object[] pattern_Class1_28_2_greenBBBBBBBBBBBBF(ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs,
			Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "Class1";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(sf);
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(n2s);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs, sourceMatch, targetMatch,
				isApplicableMatch };
	}

	public static final Object[] pattern_Class1_28_3_bindingFBBBBBBBBBBBBBB(Class1 _this,
			IsApplicableMatchCC isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, gwStep, step, flow, process, gw, gcw,
				node, sf, n2s, gw2gs, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, sf, n2s,
					gw2gs, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Class1_28_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_28_3_bindingAndBlackFBBBBBBBBBBBBBB(Class1 _this,
			IsApplicableMatchCC isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_Class1_28_3_binding = pattern_Class1_28_3_bindingFBBBBBBBBBBBBBB(_this,
				isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs, sourceMatch,
				targetMatch);
		if (result_pattern_Class1_28_3_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_28_3_binding[0];

			Object[] result_pattern_Class1_28_3_black = pattern_Class1_28_3_blackB(csp);
			if (result_pattern_Class1_28_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, sf,
						n2s, gw2gs, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_28_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_28_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Class1";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Class1_28_5_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Class1_31_1_blackB(Class1 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Class1_31_2_bindingFFFFFFFFFFB(IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("gw");
		EObject _localVariable_5 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_6 = isApplicableMatch.getObject("node");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf");
		EObject _localVariable_8 = isApplicableMatch.getObject("n2s");
		EObject _localVariable_9 = isApplicableMatch.getObject("gw2gs");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpGw = _localVariable_4;
		EObject tmpGcw = _localVariable_5;
		EObject tmpNode = _localVariable_6;
		EObject tmpSf = _localVariable_7;
		EObject tmpN2s = _localVariable_8;
		EObject tmpGw2gs = _localVariable_9;
		if (tmpGwStep instanceof ChoiceStep) {
			ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
			if (tmpStep instanceof Step) {
				Step step = (Step) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
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
										if (tmpN2s instanceof FN2S) {
											FN2S n2s = (FN2S) tmpN2s;
											if (tmpGw2gs instanceof GW2S) {
												GW2S gw2gs = (GW2S) tmpGw2gs;
												return new Object[] { gwStep, step, flow, process, gw, gcw, node, sf,
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

	public static final Object[] pattern_Class1_31_2_blackBBBBBBBBBBB(ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, SequenceFlow sf, FN2S n2s, GW2S gw2gs,
			IsApplicableMatchCC isApplicableMatch) {
		if (!gwStep.equals(step)) {
			if (!gw.equals(node)) {
				if (!gcw.equals(gw)) {
					if (!gcw.equals(node)) {
						if (step.equals(gwStep.get__lastInDef())) {
							if (flow.getSteps().contains(step)) {
								if (flow.getSteps().contains(gwStep)) {
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
																										gwStep, step,
																										flow, process,
																										gw, gcw, node,
																										sf, n2s, gw2gs,
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

	public static final Object[] pattern_Class1_31_2_bindingAndBlackFFFFFFFFFFB(IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_Class1_31_2_binding = pattern_Class1_31_2_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_Class1_31_2_binding != null) {
			ChoiceStep gwStep = (ChoiceStep) result_pattern_Class1_31_2_binding[0];
			Step step = (Step) result_pattern_Class1_31_2_binding[1];
			Flow flow = (Flow) result_pattern_Class1_31_2_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Class1_31_2_binding[3];
			Gateway gw = (Gateway) result_pattern_Class1_31_2_binding[4];
			Gateway gcw = (Gateway) result_pattern_Class1_31_2_binding[5];
			FlowNode node = (FlowNode) result_pattern_Class1_31_2_binding[6];
			SequenceFlow sf = (SequenceFlow) result_pattern_Class1_31_2_binding[7];
			FN2S n2s = (FN2S) result_pattern_Class1_31_2_binding[8];
			GW2S gw2gs = (GW2S) result_pattern_Class1_31_2_binding[9];

			Object[] result_pattern_Class1_31_2_black = pattern_Class1_31_2_blackBBBBBBBBBBB(gwStep, step, flow,
					process, gw, gcw, node, sf, n2s, gw2gs, isApplicableMatch);
			if (result_pattern_Class1_31_2_black != null) {

				return new Object[] { gwStep, step, flow, process, gw, gcw, node, sf, n2s, gw2gs, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_31_2_greenF() {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { result };
	}

	public static final PerformRuleResult pattern_Class1_31_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Class1_32_1_blackB(Class1 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Class1_32_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Class1_32_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			ChoiceStep gwStep) {
		if (ruleResult.getTargetObjects().contains(gwStep)) {
			return new Object[] { ruleResult, gwStep };
		}
		return null;
	}

	public static final Object[] pattern_Class1_32_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_Class1_32_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult, Step step) {
		if (ruleResult.getTargetObjects().contains(step)) {
			return new Object[] { ruleResult, step };
		}
		return null;
	}

	public static final Object[] pattern_Class1_32_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult, FN2S n2s) {
		if (ruleResult.getCorrObjects().contains(n2s)) {
			return new Object[] { ruleResult, n2s };
		}
		return null;
	}

	public static final Object[] pattern_Class1_32_2_black_nac_4BB(ModelgeneratorRuleResult ruleResult, FlowNode node) {
		if (ruleResult.getSourceObjects().contains(node)) {
			return new Object[] { ruleResult, node };
		}
		return null;
	}

	public static final Object[] pattern_Class1_32_2_black_nac_5BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_Class1_32_2_black_nac_6BB(ModelgeneratorRuleResult ruleResult, Gateway gw) {
		if (ruleResult.getSourceObjects().contains(gw)) {
			return new Object[] { ruleResult, gw };
		}
		return null;
	}

	public static final Object[] pattern_Class1_32_2_black_nac_7BB(ModelgeneratorRuleResult ruleResult, Gateway gcw) {
		if (ruleResult.getSourceObjects().contains(gcw)) {
			return new Object[] { ruleResult, gcw };
		}
		return null;
	}

	public static final Object[] pattern_Class1_32_2_black_nac_8BB(ModelgeneratorRuleResult ruleResult, GW2S gw2gs) {
		if (ruleResult.getCorrObjects().contains(gw2gs)) {
			return new Object[] { ruleResult, gw2gs };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_32_2_blackFFFFFFFFFFBB(RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList n2sList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpN2s : n2sList.getEntryObjects()) {
				if (tmpN2s instanceof FN2S) {
					FN2S n2s = (FN2S) tmpN2s;
					Step step = n2s.getTarget();
					if (step != null) {
						FlowNode node = n2s.getSource();
						if (node != null) {
							if (pattern_Class1_32_2_black_nac_3BB(ruleResult, n2s) == null) {
								if (pattern_Class1_32_2_black_nac_2BB(ruleResult, step) == null) {
									if (pattern_Class1_32_2_black_nac_4BB(ruleResult, node) == null) {
										for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(step, Flow.class, "steps")) {
											if (pattern_Class1_32_2_black_nac_1BB(ruleResult, flow) == null) {
												for (Step tmpGwStep : flow.getSteps()) {
													if (tmpGwStep instanceof ChoiceStep) {
														ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
														if (!gwStep.equals(step)) {
															if (pattern_Class1_32_2_black_nac_0BB(ruleResult,
																	gwStep) == null) {
																for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(node,
																				SimpleBPMN.Process.class,
																				"flowElements")) {
																	if (pattern_Class1_32_2_black_nac_5BB(ruleResult,
																			process) == null) {
																		for (FlowElement tmpGw : process
																				.getFlowElements()) {
																			if (tmpGw instanceof Gateway) {
																				Gateway gw = (Gateway) tmpGw;
																				if (!gw.equals(node)) {
																					Gateway gcw = gw.get__conv();
																					if (gcw != null) {
																						if (!gcw.equals(node)) {
																							if (!gcw.equals(gw)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												gcw)) {
																									boolean gwisDiverging = gw
																											.isIsDiverging();
																									if (Boolean
																											.valueOf(
																													gwisDiverging)
																											.equals(Boolean
																													.valueOf(
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
																													if (pattern_Class1_32_2_black_nac_6BB(
																															ruleResult,
																															gw) == null) {
																														if (pattern_Class1_32_2_black_nac_7BB(
																																ruleResult,
																																gcw) == null) {
																															for (GW2S gw2gs : org.moflon.core.utilities.eMoflonEMFUtil
																																	.getOppositeReferenceTyped(
																																			gwStep,
																																			GW2S.class,
																																			"target")) {
																																if (gw.equals(
																																		gw2gs.getSource())) {
																																	if (pattern_Class1_32_2_black_nac_8BB(
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

	public static final Object[] pattern_Class1_32_3_bindingFBBBBBBBBBBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, gwStep, step, flow, process, gw, gcw,
				node, n2s, gw2gs, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Class1_32_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_32_3_bindingAndBlackFBBBBBBBBBBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, ChoiceStep gwStep, Step step, Flow flow, SimpleBPMN.Process process,
			Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Class1_32_3_binding = pattern_Class1_32_3_bindingFBBBBBBBBBBBB(_this, isApplicableMatch,
				gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs, ruleResult);
		if (result_pattern_Class1_32_3_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_32_3_binding[0];

			Object[] result_pattern_Class1_32_3_black = pattern_Class1_32_3_blackB(csp);
			if (result_pattern_Class1_32_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gwStep, step, flow, process, gw, gcw, node, n2s,
						gw2gs, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_32_4_expressionFBB(Class1 _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_32_5_blackBBBBBBBBB(ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs) {
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
										return new Object[] { gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs };
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

	public static final Object[] pattern_Class1_32_6_blackBBBBBBBBBB(ChoiceStep gwStep, Step step, Flow flow,
			SimpleBPMN.Process process, Gateway gw, Gateway gcw, FlowNode node, FN2S n2s, GW2S gw2gs,
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
										return new Object[] { gwStep, step, flow, process, gw, gcw, node, n2s, gw2gs,
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

	public static final Object[] pattern_Class1_32_6_greenBBBBBFB(ChoiceStep gwStep, Step step,
			SimpleBPMN.Process process, Gateway gcw, FlowNode node, ModelgeneratorRuleResult ruleResult) {
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		gwStep.set__lastInDef(step);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(sf);
		sf.setSourceRef(node);
		sf.setTargetRef(gcw);
		ruleResult.getSourceObjects().add(sf);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { gwStep, step, process, gcw, node, sf, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_Class1_32_7_expressionFB(ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Class1Impl
