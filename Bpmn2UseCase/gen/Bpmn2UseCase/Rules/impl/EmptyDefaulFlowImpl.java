/**
 */
package bpmn2UseCase.Rules.impl;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.ChoiceStep;
import SimpleUseCase.Flow;
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

import bpmn2UseCase.GW2S;
import bpmn2UseCase.P2UC;

import bpmn2UseCase.Rules.EmptyDefaulFlow;
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
 * An implementation of the model object '<em><b>Empty Defaul Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EmptyDefaulFlowImpl extends AbstractRuleImpl implements EmptyDefaulFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmptyDefaulFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEmptyDefaulFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw,
			SequenceFlow sf) {
		// initial bindings
		Object[] result1_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_1_blackBBBBBB(this, match, gw, process,
				gcw, sf);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[gw] = " + gw + ", " + "[process] = "
					+ process + ", " + "[gcw] = " + gcw + ", " + "[sf] = " + sf + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_2_bindingAndBlackFBBBBBB(this,
				match, gw, process, gcw, sf);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[gw] = " + gw + ", " + "[process] = " + process
					+ ", " + "[gcw] = " + gcw + ", " + "[sf] = " + sf + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_4_blackBBBBB(match, gw, process, gcw,
					sf);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gw] = " + gw + ", " + "[process] = "
						+ process + ", " + "[gcw] = " + gcw + ", " + "[sf] = " + sf + ".");
			}
			EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_4_greenBBBBBFFFFFF(match, gw, process, gcw, sf);
			// EMoflonEdge sf__gw____sourceRef = (EMoflonEdge) result4_green[5];
			// EMoflonEdge gw__sf____outgoing = (EMoflonEdge) result4_green[6];
			// EMoflonEdge gw__sf____default = (EMoflonEdge) result4_green[7];
			// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result4_green[8];
			// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result4_green[9];
			// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_5_blackBBBBB(match, gw, process, gcw,
					sf);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gw] = " + gw + ", " + "[process] = "
						+ process + ", " + "[gcw] = " + gcw + ", " + "[sf] = " + sf + ".");
			}
			EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_5_greenBBBBFF(match, gw, process, gcw);
			// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result5_green[4];
			// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result5_green[5];

			// register objects to match
			EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_6_expressionBBBBBB(this, match, gw, process, gcw, sf);
			return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_7_expressionF();
		} else {
			return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl
				.pattern_EmptyDefaulFlow_1_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway gw = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep gwStep = (ChoiceStep) result1_bindingAndBlack[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[2];
		UseCase useCase = (UseCase) result1_bindingAndBlack[3];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		GW2S gw2gs = (GW2S) result1_bindingAndBlack[6];
		ExclusiveGateway gcw = (ExclusiveGateway) result1_bindingAndBlack[7];
		SequenceFlow sf = (SequenceFlow) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[10];
		EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_1_1_greenB(gwStep);

		// collect translated elements
		Object[] result2_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_1_2_blackB(sf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ".");
		}
		Object[] result2_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_1_2_greenFB(sf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_1_3_blackBBBBBBBBBB(ruleresult, gw, gwStep,
				process, useCase, p2uc, flow, gw2gs, gcw, sf);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[gw] = " + gw + ", " + "[gwStep] = " + gwStep + ", "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", "
					+ "[flow] = " + flow + ", " + "[gw2gs] = " + gw2gs + ", " + "[gcw] = " + gcw + ", " + "[sf] = " + sf
					+ ".");
		}
		EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_1_3_greenBBBBBBFFFFFFF(ruleresult, gw, gwStep, process, gcw, sf);
		// EMoflonEdge sf__gw____sourceRef = (EMoflonEdge) result3_green[6];
		// EMoflonEdge gw__sf____outgoing = (EMoflonEdge) result3_green[7];
		// EMoflonEdge gw__sf____default = (EMoflonEdge) result3_green[8];
		// EMoflonEdge gwStep__gwStep______lastInDef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[10];
		// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[11];
		// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_1_5_expressionBBBBBBBBBBB(this, ruleresult, gw, gwStep, process,
				useCase, p2uc, flow, gw2gs, gcw, sf);
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway gw = (ExclusiveGateway) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		ExclusiveGateway gcw = (ExclusiveGateway) result2_binding[2];
		SequenceFlow sf = (SequenceFlow) result2_binding[3];
		for (Object[] result2_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_2_blackBFBFFFBBB(gw, process, gcw,
				sf, match)) {
			ChoiceStep gwStep = (ChoiceStep) result2_black[1];
			UseCase useCase = (UseCase) result2_black[3];
			P2UC p2uc = (P2UC) result2_black[4];
			GW2S gw2gs = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_3_blackBBBBBFBBB(gw, gwStep,
					process, useCase, p2uc, gw2gs, gcw, sf)) {
				Flow flow = (Flow) result3_black[5];
				Object[] result3_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_3_greenBBBBBBBBBFFFFFFFFFFFFFFF(
						gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, sf);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge sf__gw____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge gw__sf____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge gw__sf____default = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flow__gwStep____steps = (EMoflonEdge) result3_green[19];
				// EMoflonEdge gw2gs__gw____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge gw2gs__gwStep____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[22];
				// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = EmptyDefaulFlowImpl
						.pattern_EmptyDefaulFlow_2_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, gw, gwStep,
								process, useCase, p2uc, flow, gw2gs, gcw, sf);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[gw] = " + gw + ", " + "[gwStep] = " + gwStep + ", " + "[process] = " + process + ", "
							+ "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", "
							+ "[gw2gs] = " + gw2gs + ", " + "[gcw] = " + gcw + ", " + "[sf] = " + sf + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ExclusiveGateway gw, SimpleBPMN.Process process,
			ExclusiveGateway gcw, SequenceFlow sf) {
		match.registerObject("gw", gw);
		match.registerObject("process", process);
		match.registerObject("gcw", gcw);
		match.registerObject("sf", sf);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ExclusiveGateway gw, SimpleBPMN.Process process,
			ExclusiveGateway gcw, SequenceFlow sf) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ExclusiveGateway gw, ChoiceStep gwStep,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs, ExclusiveGateway gcw,
			SequenceFlow sf) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("gw", gw);
		isApplicableMatch.registerObject("gwStep", gwStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("gw2gs", gw2gs);
		isApplicableMatch.registerObject("gcw", gcw);
		isApplicableMatch.registerObject("sf", sf);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject gw, EObject gwStep, EObject process,
			EObject useCase, EObject p2uc, EObject flow, EObject gw2gs, EObject gcw, EObject sf) {
		ruleresult.registerObject("gw", gw);
		ruleresult.registerObject("gwStep", gwStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("gw2gs", gw2gs);
		ruleresult.registerObject("gcw", gcw);
		ruleresult.registerObject("sf", sf);

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
	public boolean isAppropriate_BWD(Match match, ChoiceStep gwStep, UseCase useCase, Flow flow) {
		// initial bindings
		Object[] result1_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_1_blackBBBBB(this, match, gwStep,
				useCase, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", "
					+ "[useCase] = " + useCase + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_2_bindingAndBlackFBBBBB(this,
				match, gwStep, useCase, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[useCase] = "
					+ useCase + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_4_blackBBBB(match, gwStep, useCase,
					flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[useCase] = "
						+ useCase + ", " + "[flow] = " + flow + ".");
			}
			EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_4_greenBBF(match, gwStep);
			// EMoflonEdge gwStep__gwStep______lastInDef = (EMoflonEdge) result4_green[2];

			// collect context elements
			Object[] result5_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_5_blackBBBB(match, gwStep, useCase,
					flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[gwStep] = " + gwStep + ", " + "[useCase] = "
						+ useCase + ", " + "[flow] = " + flow + ".");
			}
			EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_5_greenBBBBFF(match, gwStep, useCase, flow);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__gwStep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_6_expressionBBBBB(this, match, gwStep, useCase, flow);
			return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_7_expressionF();
		} else {
			return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl
				.pattern_EmptyDefaulFlow_11_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway gw = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep gwStep = (ChoiceStep) result1_bindingAndBlack[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[2];
		UseCase useCase = (UseCase) result1_bindingAndBlack[3];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		GW2S gw2gs = (GW2S) result1_bindingAndBlack[6];
		ExclusiveGateway gcw = (ExclusiveGateway) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_11_1_greenBBBF(gw, process, gcw);
		SequenceFlow sf = (SequenceFlow) result1_green[3];

		// collect translated elements
		Object[] result2_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_11_2_blackB(sf);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf] = " + sf + ".");
		}
		Object[] result2_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_11_2_greenFB(sf);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_11_3_blackBBBBBBBBBB(ruleresult, gw,
				gwStep, process, useCase, p2uc, flow, gw2gs, gcw, sf);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[gw] = " + gw + ", " + "[gwStep] = " + gwStep + ", "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", "
					+ "[flow] = " + flow + ", " + "[gw2gs] = " + gw2gs + ", " + "[gcw] = " + gcw + ", " + "[sf] = " + sf
					+ ".");
		}
		EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_11_3_greenBBBBBBFFFFFFF(ruleresult, gw, gwStep, process, gcw, sf);
		// EMoflonEdge sf__gw____sourceRef = (EMoflonEdge) result3_green[6];
		// EMoflonEdge gw__sf____outgoing = (EMoflonEdge) result3_green[7];
		// EMoflonEdge gw__sf____default = (EMoflonEdge) result3_green[8];
		// EMoflonEdge gwStep__gwStep______lastInDef = (EMoflonEdge) result3_green[9];
		// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[10];
		// EMoflonEdge sf__gcw____targetRef = (EMoflonEdge) result3_green[11];
		// EMoflonEdge gcw__sf____incoming = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_11_5_expressionBBBBBBBBBBB(this, ruleresult, gw, gwStep, process,
				useCase, p2uc, flow, gw2gs, gcw, sf);
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep gwStep = (ChoiceStep) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_2_blackFBFBFBFB(gwStep, useCase,
				flow, match)) {
			ExclusiveGateway gw = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			P2UC p2uc = (P2UC) result2_black[4];
			GW2S gw2gs = (GW2S) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_3_blackBBBBBBBF(gw, gwStep,
					process, useCase, p2uc, flow, gw2gs)) {
				ExclusiveGateway gcw = (ExclusiveGateway) result3_black[7];
				Object[] result3_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_3_greenBBBBBBBBFFFFFFFFFF(gw,
						gwStep, process, useCase, p2uc, flow, gw2gs, gcw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge gwStep__gwStep______lastInDef = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__gw____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__gcw____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__gwStep____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge gw2gs__gw____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge gw2gs__gwStep____target = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = EmptyDefaulFlowImpl
						.pattern_EmptyDefaulFlow_12_4_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, gw, gwStep,
								process, useCase, p2uc, flow, gw2gs, gcw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[gw] = " + gw + ", " + "[gwStep] = " + gwStep + ", " + "[process] = " + process + ", "
							+ "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", "
							+ "[gw2gs] = " + gw2gs + ", " + "[gcw] = " + gcw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ChoiceStep gwStep, UseCase useCase, Flow flow) {
		match.registerObject("gwStep", gwStep);
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ChoiceStep gwStep, UseCase useCase, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ExclusiveGateway gw, ChoiceStep gwStep,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs, ExclusiveGateway gcw) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("gw", gw);
		isApplicableMatch.registerObject("gwStep", gwStep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("gw2gs", gw2gs);
		isApplicableMatch.registerObject("gcw", gcw);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject gw, EObject gwStep, EObject process,
			EObject useCase, EObject p2uc, EObject flow, EObject gw2gs, EObject gcw, EObject sf) {
		ruleresult.registerObject("gw", gw);
		ruleresult.registerObject("gwStep", gwStep);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("gw2gs", gw2gs);
		ruleresult.registerObject("gcw", gcw);
		ruleresult.registerObject("sf", sf);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_103(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_20_2_blackFFFFB(_edge_sourceRef)) {
			ExclusiveGateway gw = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			ExclusiveGateway gcw = (ExclusiveGateway) result2_black[2];
			SequenceFlow sf = (SequenceFlow) result2_black[3];
			Object[] result2_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_20_3_expressionFBBBBBB(this, match, gw, process, gcw, sf)) {
				// Ensure that the correct types of elements are matched
				if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_104(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_21_2_blackFFFFB(_edge_outgoing)) {
			ExclusiveGateway gw = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			ExclusiveGateway gcw = (ExclusiveGateway) result2_black[2];
			SequenceFlow sf = (SequenceFlow) result2_black[3];
			Object[] result2_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_21_3_expressionFBBBBBB(this, match, gw, process, gcw, sf)) {
				// Ensure that the correct types of elements are matched
				if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_105(EMoflonEdge _edge_default) {
		// prepare return value
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_22_2_blackFFFFB(_edge_default)) {
			ExclusiveGateway gw = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			ExclusiveGateway gcw = (ExclusiveGateway) result2_black[2];
			SequenceFlow sf = (SequenceFlow) result2_black[3];
			Object[] result2_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_22_3_expressionFBBBBBB(this, match, gw, process, gcw, sf)) {
				// Ensure that the correct types of elements are matched
				if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_32(EMoflonEdge _edge___lastInDef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_23_2_blackFFFB(_edge___lastInDef)) {
			ChoiceStep gwStep = (ChoiceStep) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_23_3_expressionFBBBBB(this, match, gwStep, useCase, flow)) {
				// Ensure that the correct types of elements are matched
				if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_106(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_24_2_blackFFFFB(_edge_flowElements)) {
			ExclusiveGateway gw = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			ExclusiveGateway gcw = (ExclusiveGateway) result2_black[2];
			SequenceFlow sf = (SequenceFlow) result2_black[3];
			Object[] result2_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_24_3_expressionFBBBBBB(this, match, gw, process, gcw, sf)) {
				// Ensure that the correct types of elements are matched
				if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_107(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_25_2_blackFFFFB(_edge_targetRef)) {
			ExclusiveGateway gw = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			ExclusiveGateway gcw = (ExclusiveGateway) result2_black[2];
			SequenceFlow sf = (SequenceFlow) result2_black[3];
			Object[] result2_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_25_3_expressionFBBBBBB(this, match, gw, process, gcw, sf)) {
				// Ensure that the correct types of elements are matched
				if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_108(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_26_2_blackFFFFB(_edge_incoming)) {
			ExclusiveGateway gw = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			ExclusiveGateway gcw = (ExclusiveGateway) result2_black[2];
			SequenceFlow sf = (SequenceFlow) result2_black[3];
			Object[] result2_green = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_26_3_expressionFBBBBBB(this, match, gw, process, gcw, sf)) {
				// Ensure that the correct types of elements are matched
				if (EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EmptyDefaulFlowImpl.pattern_EmptyDefaulFlow_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EmptyDefaulFlow");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForGw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw")).findAny();
		SimpleBPMN.ExclusiveGateway gw = (SimpleBPMN.ExclusiveGateway) matchForGw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGwStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gwStep")).findAny();
		SimpleUseCase.ChoiceStep gwStep = (SimpleUseCase.ChoiceStep) matchForGwStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		bpmn2UseCase.P2UC p2uc = (bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGw2gs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw2gs")).findAny();
		bpmn2UseCase.GW2S gw2gs = (bpmn2UseCase.GW2S) matchForGw2gs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGcw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gcw")).findAny();
		SimpleBPMN.ExclusiveGateway gcw = (SimpleBPMN.ExclusiveGateway) matchForGcw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf")).findAny();
		SimpleBPMN.SequenceFlow sf = (SimpleBPMN.SequenceFlow) matchForSf.get().getNode();

		if (!(gw.isIsDiverging() == true)) {
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
		ruleResult.setRule("EmptyDefaulFlow");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForGw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw")).findAny();
		SimpleBPMN.ExclusiveGateway gw = (SimpleBPMN.ExclusiveGateway) matchForGw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGwStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gwStep")).findAny();
		SimpleUseCase.ChoiceStep gwStep = (SimpleUseCase.ChoiceStep) matchForGwStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		bpmn2UseCase.P2UC p2uc = (bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGw2gs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gw2gs")).findAny();
		bpmn2UseCase.GW2S gw2gs = (bpmn2UseCase.GW2S) matchForGw2gs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForGcw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("gcw")).findAny();
		SimpleBPMN.ExclusiveGateway gcw = (SimpleBPMN.ExclusiveGateway) matchForGcw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf")).findAny();
		SimpleBPMN.SequenceFlow sf = (SimpleBPMN.SequenceFlow) matchForSf.get().getNode();

		if (!(gw.isIsDiverging() == true)) {
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
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.EMPTY_DEFAUL_FLOW___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
			return null;
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(SequenceFlow) arguments.get(4));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_PROCESS_USECASE_P2UC_FLOW_GW2S_EXCLUSIVEGATEWAY_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (UseCase) arguments.get(4),
					(P2UC) arguments.get(5), (Flow) arguments.get(6), (GW2S) arguments.get(7),
					(ExclusiveGateway) arguments.get(8), (SequenceFlow) arguments.get(9));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.EMPTY_DEFAUL_FLOW___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_USECASE_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(UseCase) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.EMPTY_DEFAUL_FLOW___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_USECASE_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(UseCase) arguments.get(2), (Flow) arguments.get(3));
			return null;
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_USECASE_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(UseCase) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_PROCESS_USECASE_P2UC_FLOW_GW2S_EXCLUSIVEGATEWAY:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (UseCase) arguments.get(4),
					(P2UC) arguments.get(5), (Flow) arguments.get(6), (GW2S) arguments.get(7),
					(ExclusiveGateway) arguments.get(8));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.EMPTY_DEFAUL_FLOW___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_103__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_103((EMoflonEdge) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_104__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_104((EMoflonEdge) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_105__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_105((EMoflonEdge) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_32((EMoflonEdge) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_106__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_106((EMoflonEdge) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_107__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_107((EMoflonEdge) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___IS_APPROPRIATE_FWD_EMOFLON_EDGE_108__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_108((EMoflonEdge) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EMPTY_DEFAUL_FLOW___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EmptyDefaulFlow_0_1_blackBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		if (!gcw.equals(gw)) {
			return new Object[] { _this, match, gw, process, gcw, sf };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_0_2_bindingFBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, gw, process, gcw, sf);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, gw, process, gcw, sf };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EmptyDefaulFlow_0_2_bindingAndBlackFBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		Object[] result_pattern_EmptyDefaulFlow_0_2_binding = pattern_EmptyDefaulFlow_0_2_bindingFBBBBBB(_this, match,
				gw, process, gcw, sf);
		if (result_pattern_EmptyDefaulFlow_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_EmptyDefaulFlow_0_2_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_0_2_black = pattern_EmptyDefaulFlow_0_2_blackB(csp);
			if (result_pattern_EmptyDefaulFlow_0_2_black != null) {

				return new Object[] { csp, _this, match, gw, process, gcw, sf };
			}
		}
		return null;
	}

	public static final boolean pattern_EmptyDefaulFlow_0_3_expressionFBB(EmptyDefaulFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_0_4_blackBBBBB(Match match, ExclusiveGateway gw,
			SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		if (!gcw.equals(gw)) {
			return new Object[] { match, gw, process, gcw, sf };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_0_4_greenBBBBBFFFFFF(Match match, ExclusiveGateway gw,
			SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		EMoflonEdge sf__gw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__sf____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf);
		String sf__gw____sourceRef_name_prime = "sourceRef";
		String gw__sf____outgoing_name_prime = "outgoing";
		String gw__sf____default_name_prime = "default";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		sf__gw____sourceRef.setSrc(sf);
		sf__gw____sourceRef.setTrg(gw);
		match.getToBeTranslatedEdges().add(sf__gw____sourceRef);
		gw__sf____outgoing.setSrc(gw);
		gw__sf____outgoing.setTrg(sf);
		match.getToBeTranslatedEdges().add(gw__sf____outgoing);
		gw__sf____default.setSrc(gw);
		gw__sf____default.setTrg(sf);
		match.getToBeTranslatedEdges().add(gw__sf____default);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		match.getToBeTranslatedEdges().add(process__sf____flowElements);
		sf__gcw____targetRef.setSrc(sf);
		sf__gcw____targetRef.setTrg(gcw);
		match.getToBeTranslatedEdges().add(sf__gcw____targetRef);
		gcw__sf____incoming.setSrc(gcw);
		gcw__sf____incoming.setTrg(sf);
		match.getToBeTranslatedEdges().add(gcw__sf____incoming);
		sf__gw____sourceRef.setName(sf__gw____sourceRef_name_prime);
		gw__sf____outgoing.setName(gw__sf____outgoing_name_prime);
		gw__sf____default.setName(gw__sf____default_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		return new Object[] { match, gw, process, gcw, sf, sf__gw____sourceRef, gw__sf____outgoing, gw__sf____default,
				process__sf____flowElements, sf__gcw____targetRef, gcw__sf____incoming };
	}

	public static final Object[] pattern_EmptyDefaulFlow_0_5_blackBBBBB(Match match, ExclusiveGateway gw,
			SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		if (!gcw.equals(gw)) {
			return new Object[] { match, gw, process, gcw, sf };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_0_5_greenBBBBFF(Match match, ExclusiveGateway gw,
			SimpleBPMN.Process process, ExclusiveGateway gcw) {
		EMoflonEdge process__gw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gcw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(gw);
		match.getContextNodes().add(process);
		match.getContextNodes().add(gcw);
		String process__gw____flowElements_name_prime = "flowElements";
		String process__gcw____flowElements_name_prime = "flowElements";
		process__gw____flowElements.setSrc(process);
		process__gw____flowElements.setTrg(gw);
		match.getContextEdges().add(process__gw____flowElements);
		process__gcw____flowElements.setSrc(process);
		process__gcw____flowElements.setTrg(gcw);
		match.getContextEdges().add(process__gcw____flowElements);
		process__gw____flowElements.setName(process__gw____flowElements_name_prime);
		process__gcw____flowElements.setName(process__gcw____flowElements_name_prime);
		return new Object[] { match, gw, process, gcw, process__gw____flowElements, process__gcw____flowElements };
	}

	public static final void pattern_EmptyDefaulFlow_0_6_expressionBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		_this.registerObjectsToMatch_FWD(match, gw, process, gcw, sf);

	}

	public static final boolean pattern_EmptyDefaulFlow_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EmptyDefaulFlow_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_1_1_bindingFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("gw");
		EObject _localVariable_1 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_4 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("gw2gs");
		EObject _localVariable_7 = isApplicableMatch.getObject("gcw");
		EObject _localVariable_8 = isApplicableMatch.getObject("sf");
		EObject tmpGw = _localVariable_0;
		EObject tmpGwStep = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		EObject tmpP2uc = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpGw2gs = _localVariable_6;
		EObject tmpGcw = _localVariable_7;
		EObject tmpSf = _localVariable_8;
		if (tmpGw instanceof ExclusiveGateway) {
			ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
			if (tmpGwStep instanceof ChoiceStep) {
				ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						if (tmpP2uc instanceof P2UC) {
							P2UC p2uc = (P2UC) tmpP2uc;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpGw2gs instanceof GW2S) {
									GW2S gw2gs = (GW2S) tmpGw2gs;
									if (tmpGcw instanceof ExclusiveGateway) {
										ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
										if (tmpSf instanceof SequenceFlow) {
											SequenceFlow sf = (SequenceFlow) tmpSf;
											return new Object[] { gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw,
													sf, isApplicableMatch };
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

	public static final Object[] pattern_EmptyDefaulFlow_1_1_blackBBBBBBBBBBFB(ExclusiveGateway gw, ChoiceStep gwStep,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs, ExclusiveGateway gcw,
			SequenceFlow sf, EmptyDefaulFlow _this, IsApplicableMatch isApplicableMatch) {
		if (!gcw.equals(gw)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, sf, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_1_1_bindingAndBlackFFFFFFFFFBFB(EmptyDefaulFlow _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EmptyDefaulFlow_1_1_binding = pattern_EmptyDefaulFlow_1_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EmptyDefaulFlow_1_1_binding != null) {
			ExclusiveGateway gw = (ExclusiveGateway) result_pattern_EmptyDefaulFlow_1_1_binding[0];
			ChoiceStep gwStep = (ChoiceStep) result_pattern_EmptyDefaulFlow_1_1_binding[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EmptyDefaulFlow_1_1_binding[2];
			UseCase useCase = (UseCase) result_pattern_EmptyDefaulFlow_1_1_binding[3];
			P2UC p2uc = (P2UC) result_pattern_EmptyDefaulFlow_1_1_binding[4];
			Flow flow = (Flow) result_pattern_EmptyDefaulFlow_1_1_binding[5];
			GW2S gw2gs = (GW2S) result_pattern_EmptyDefaulFlow_1_1_binding[6];
			ExclusiveGateway gcw = (ExclusiveGateway) result_pattern_EmptyDefaulFlow_1_1_binding[7];
			SequenceFlow sf = (SequenceFlow) result_pattern_EmptyDefaulFlow_1_1_binding[8];

			Object[] result_pattern_EmptyDefaulFlow_1_1_black = pattern_EmptyDefaulFlow_1_1_blackBBBBBBBBBBFB(gw,
					gwStep, process, useCase, p2uc, flow, gw2gs, gcw, sf, _this, isApplicableMatch);
			if (result_pattern_EmptyDefaulFlow_1_1_black != null) {
				CSP csp = (CSP) result_pattern_EmptyDefaulFlow_1_1_black[10];

				return new Object[] { gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, sf, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_1_1_greenB(ChoiceStep gwStep) {
		gwStep.set__lastInDef(gwStep);
		return new Object[] { gwStep };
	}

	public static final Object[] pattern_EmptyDefaulFlow_1_2_blackB(SequenceFlow sf) {
		return new Object[] { sf };
	}

	public static final Object[] pattern_EmptyDefaulFlow_1_2_greenFB(SequenceFlow sf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf);
		return new Object[] { ruleresult, sf };
	}

	public static final Object[] pattern_EmptyDefaulFlow_1_3_blackBBBBBBBBBB(PerformRuleResult ruleresult, EObject gw,
			EObject gwStep, EObject process, EObject useCase, EObject p2uc, EObject flow, EObject gw2gs, EObject gcw,
			EObject sf) {
		if (!gw.equals(gwStep)) {
			if (!gw.equals(process)) {
				if (!gw.equals(useCase)) {
					if (!gw.equals(p2uc)) {
						if (!gw.equals(gw2gs)) {
							if (!gw.equals(sf)) {
								if (!gwStep.equals(process)) {
									if (!gwStep.equals(useCase)) {
										if (!gwStep.equals(p2uc)) {
											if (!gwStep.equals(sf)) {
												if (!process.equals(useCase)) {
													if (!process.equals(sf)) {
														if (!p2uc.equals(process)) {
															if (!p2uc.equals(useCase)) {
																if (!p2uc.equals(sf)) {
																	if (!flow.equals(gw)) {
																		if (!flow.equals(gwStep)) {
																			if (!flow.equals(process)) {
																				if (!flow.equals(useCase)) {
																					if (!flow.equals(p2uc)) {
																						if (!flow.equals(gw2gs)) {
																							if (!flow.equals(gcw)) {
																								if (!flow.equals(sf)) {
																									if (!gw2gs.equals(
																											gwStep)) {
																										if (!gw2gs
																												.equals(process)) {
																											if (!gw2gs
																													.equals(useCase)) {
																												if (!gw2gs
																														.equals(p2uc)) {
																													if (!gw2gs
																															.equals(sf)) {
																														if (!gcw.equals(
																																gw)) {
																															if (!gcw.equals(
																																	gwStep)) {
																																if (!gcw.equals(
																																		process)) {
																																	if (!gcw.equals(
																																			useCase)) {
																																		if (!gcw.equals(
																																				p2uc)) {
																																			if (!gcw.equals(
																																					gw2gs)) {
																																				if (!gcw.equals(
																																						sf)) {
																																					if (!sf.equals(
																																							useCase)) {
																																						return new Object[] {
																																								ruleresult,
																																								gw,
																																								gwStep,
																																								process,
																																								useCase,
																																								p2uc,
																																								flow,
																																								gw2gs,
																																								gcw,
																																								sf };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EmptyDefaulFlow_1_3_greenBBBBBBFFFFFFF(PerformRuleResult ruleresult,
			EObject gw, EObject gwStep, EObject process, EObject gcw, EObject sf) {
		EMoflonEdge sf__gw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__sf____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gwStep__gwStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EmptyDefaulFlow";
		String sf__gw____sourceRef_name_prime = "sourceRef";
		String gw__sf____outgoing_name_prime = "outgoing";
		String gw__sf____default_name_prime = "default";
		String gwStep__gwStep______lastInDef_name_prime = "__lastInDef";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		sf__gw____sourceRef.setSrc(sf);
		sf__gw____sourceRef.setTrg(gw);
		ruleresult.getTranslatedEdges().add(sf__gw____sourceRef);
		gw__sf____outgoing.setSrc(gw);
		gw__sf____outgoing.setTrg(sf);
		ruleresult.getTranslatedEdges().add(gw__sf____outgoing);
		gw__sf____default.setSrc(gw);
		gw__sf____default.setTrg(sf);
		ruleresult.getTranslatedEdges().add(gw__sf____default);
		gwStep__gwStep______lastInDef.setSrc(gwStep);
		gwStep__gwStep______lastInDef.setTrg(gwStep);
		ruleresult.getCreatedEdges().add(gwStep__gwStep______lastInDef);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		ruleresult.getTranslatedEdges().add(process__sf____flowElements);
		sf__gcw____targetRef.setSrc(sf);
		sf__gcw____targetRef.setTrg(gcw);
		ruleresult.getTranslatedEdges().add(sf__gcw____targetRef);
		gcw__sf____incoming.setSrc(gcw);
		gcw__sf____incoming.setTrg(sf);
		ruleresult.getTranslatedEdges().add(gcw__sf____incoming);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sf__gw____sourceRef.setName(sf__gw____sourceRef_name_prime);
		gw__sf____outgoing.setName(gw__sf____outgoing_name_prime);
		gw__sf____default.setName(gw__sf____default_name_prime);
		gwStep__gwStep______lastInDef.setName(gwStep__gwStep______lastInDef_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		return new Object[] { ruleresult, gw, gwStep, process, gcw, sf, sf__gw____sourceRef, gw__sf____outgoing,
				gw__sf____default, gwStep__gwStep______lastInDef, process__sf____flowElements, sf__gcw____targetRef,
				gcw__sf____incoming };
	}

	public static final void pattern_EmptyDefaulFlow_1_5_expressionBBBBBBBBBBB(EmptyDefaulFlow _this,
			PerformRuleResult ruleresult, EObject gw, EObject gwStep, EObject process, EObject useCase, EObject p2uc,
			EObject flow, EObject gw2gs, EObject gcw, EObject sf) {
		_this.registerObjects_FWD(ruleresult, gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, sf);

	}

	public static final PerformRuleResult pattern_EmptyDefaulFlow_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_1_bindingFB(EmptyDefaulFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_1_blackFBB(EClass eClass, EmptyDefaulFlow _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_1_bindingAndBlackFFB(EmptyDefaulFlow _this) {
		Object[] result_pattern_EmptyDefaulFlow_2_1_binding = pattern_EmptyDefaulFlow_2_1_bindingFB(_this);
		if (result_pattern_EmptyDefaulFlow_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EmptyDefaulFlow_2_1_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_2_1_black = pattern_EmptyDefaulFlow_2_1_blackFBB(eClass, _this);
			if (result_pattern_EmptyDefaulFlow_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EmptyDefaulFlow_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EmptyDefaulFlow";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("gw");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("gcw");
		EObject _localVariable_3 = match.getObject("sf");
		EObject tmpGw = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpGcw = _localVariable_2;
		EObject tmpSf = _localVariable_3;
		if (tmpGw instanceof ExclusiveGateway) {
			ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpGcw instanceof ExclusiveGateway) {
					ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
					if (tmpSf instanceof SequenceFlow) {
						SequenceFlow sf = (SequenceFlow) tmpSf;
						return new Object[] { gw, process, gcw, sf, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_2_2_blackBFBFFFBBB(ExclusiveGateway gw,
			SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gcw.equals(gw)) {
			boolean gwisDiverging = gw.isIsDiverging();
			if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
				boolean gcwisDiverging = gcw.isIsDiverging();
				if (Boolean.valueOf(gcwisDiverging).equals(false)) {
					for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(process,
							P2UC.class, "source")) {
						UseCase useCase = p2uc.getTarget();
						if (useCase != null) {
							for (GW2S gw2gs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(gw,
									GW2S.class, "source")) {
								Step tmpGwStep = gw2gs.getTarget();
								if (tmpGwStep instanceof ChoiceStep) {
									ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
									_result.add(
											new Object[] { gw, gwStep, process, useCase, p2uc, gw2gs, gcw, sf, match });
								}

							}
						}

					}
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_2_3_blackBBBBBFBBB(ExclusiveGateway gw,
			ChoiceStep gwStep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, GW2S gw2gs, ExclusiveGateway gcw,
			SequenceFlow sf) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!gcw.equals(gw)) {
			if (gw.equals(sf.getSourceRef())) {
				if (sf.equals(gw.getDefault())) {
					if (process.getFlowElements().contains(gw)) {
						if (process.getFlowElements().contains(sf)) {
							if (process.getFlowElements().contains(gcw)) {
								if (process.equals(p2uc.getSource())) {
									if (useCase.equals(p2uc.getTarget())) {
										if (gw.equals(gw2gs.getSource())) {
											if (gwStep.equals(gw2gs.getTarget())) {
												if (gcw.equals(sf.getTargetRef())) {
													boolean gwisDiverging = gw.isIsDiverging();
													if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
														boolean gcwisDiverging = gcw.isIsDiverging();
														if (Boolean.valueOf(gcwisDiverging).equals(false)) {
															for (Flow flow : useCase.getFlows()) {
																if (flow.getSteps().contains(gwStep)) {
																	_result.add(new Object[] { gw, gwStep, process,
																			useCase, p2uc, flow, gw2gs, gcw, sf });
																}
															}
														}

													}

												}
											}
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

	public static final Object[] pattern_EmptyDefaulFlow_2_3_greenBBBBBBBBBFFFFFFFFFFFFFFF(ExclusiveGateway gw,
			ChoiceStep gwStep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs,
			ExclusiveGateway gcw, SequenceFlow sf) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge sf__gw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__sf____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gcw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__gwStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gwStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String sf__gw____sourceRef_name_prime = "sourceRef";
		String gw__sf____outgoing_name_prime = "outgoing";
		String gw__sf____default_name_prime = "default";
		String process__gw____flowElements_name_prime = "flowElements";
		String process__sf____flowElements_name_prime = "flowElements";
		String process__gcw____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String flow__gwStep____steps_name_prime = "steps";
		String gw2gs__gw____source_name_prime = "source";
		String gw2gs__gwStep____target_name_prime = "target";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		isApplicableMatch.getAllContextElements().add(gcw);
		isApplicableMatch.getAllContextElements().add(sf);
		sf__gw____sourceRef.setSrc(sf);
		sf__gw____sourceRef.setTrg(gw);
		isApplicableMatch.getAllContextElements().add(sf__gw____sourceRef);
		gw__sf____outgoing.setSrc(gw);
		gw__sf____outgoing.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(gw__sf____outgoing);
		gw__sf____default.setSrc(gw);
		gw__sf____default.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(gw__sf____default);
		process__gw____flowElements.setSrc(process);
		process__gw____flowElements.setTrg(gw);
		isApplicableMatch.getAllContextElements().add(process__gw____flowElements);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(process__sf____flowElements);
		process__gcw____flowElements.setSrc(process);
		process__gcw____flowElements.setTrg(gcw);
		isApplicableMatch.getAllContextElements().add(process__gcw____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		flow__gwStep____steps.setSrc(flow);
		flow__gwStep____steps.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(flow__gwStep____steps);
		gw2gs__gw____source.setSrc(gw2gs);
		gw2gs__gw____source.setTrg(gw);
		isApplicableMatch.getAllContextElements().add(gw2gs__gw____source);
		gw2gs__gwStep____target.setSrc(gw2gs);
		gw2gs__gwStep____target.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(gw2gs__gwStep____target);
		sf__gcw____targetRef.setSrc(sf);
		sf__gcw____targetRef.setTrg(gcw);
		isApplicableMatch.getAllContextElements().add(sf__gcw____targetRef);
		gcw__sf____incoming.setSrc(gcw);
		gcw__sf____incoming.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(gcw__sf____incoming);
		sf__gw____sourceRef.setName(sf__gw____sourceRef_name_prime);
		gw__sf____outgoing.setName(gw__sf____outgoing_name_prime);
		gw__sf____default.setName(gw__sf____default_name_prime);
		process__gw____flowElements.setName(process__gw____flowElements_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		process__gcw____flowElements.setName(process__gcw____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		flow__gwStep____steps.setName(flow__gwStep____steps_name_prime);
		gw2gs__gw____source.setName(gw2gs__gw____source_name_prime);
		gw2gs__gwStep____target.setName(gw2gs__gwStep____target_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		return new Object[] { gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, sf, isApplicableMatch,
				sf__gw____sourceRef, gw__sf____outgoing, gw__sf____default, process__gw____flowElements,
				process__sf____flowElements, process__gcw____flowElements, useCase__flow____flows,
				p2uc__process____source, p2uc__useCase____target, flow__gwStep____steps, gw2gs__gw____source,
				gw2gs__gwStep____target, sf__gcw____targetRef, gcw__sf____incoming };
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_4_bindingFBBBBBBBBBBB(EmptyDefaulFlow _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway gw, ChoiceStep gwStep, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs, ExclusiveGateway gcw, SequenceFlow sf) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, gw, gwStep, process, useCase, p2uc,
				flow, gw2gs, gcw, sf);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw,
					sf };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_4_bindingAndBlackFBBBBBBBBBBB(EmptyDefaulFlow _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway gw, ChoiceStep gwStep, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs, ExclusiveGateway gcw, SequenceFlow sf) {
		Object[] result_pattern_EmptyDefaulFlow_2_4_binding = pattern_EmptyDefaulFlow_2_4_bindingFBBBBBBBBBBB(_this,
				isApplicableMatch, gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, sf);
		if (result_pattern_EmptyDefaulFlow_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_EmptyDefaulFlow_2_4_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_2_4_black = pattern_EmptyDefaulFlow_2_4_blackB(csp);
			if (result_pattern_EmptyDefaulFlow_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gw, gwStep, process, useCase, p2uc, flow, gw2gs,
						gcw, sf };
			}
		}
		return null;
	}

	public static final boolean pattern_EmptyDefaulFlow_2_5_expressionFBB(EmptyDefaulFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EmptyDefaulFlow_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EmptyDefaulFlow";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EmptyDefaulFlow_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_10_1_blackBBBBB(EmptyDefaulFlow _this, Match match,
			ChoiceStep gwStep, UseCase useCase, Flow flow) {
		return new Object[] { _this, match, gwStep, useCase, flow };
	}

	public static final Object[] pattern_EmptyDefaulFlow_10_2_bindingFBBBBB(EmptyDefaulFlow _this, Match match,
			ChoiceStep gwStep, UseCase useCase, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, gwStep, useCase, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, gwStep, useCase, flow };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EmptyDefaulFlow_10_2_bindingAndBlackFBBBBB(EmptyDefaulFlow _this, Match match,
			ChoiceStep gwStep, UseCase useCase, Flow flow) {
		Object[] result_pattern_EmptyDefaulFlow_10_2_binding = pattern_EmptyDefaulFlow_10_2_bindingFBBBBB(_this, match,
				gwStep, useCase, flow);
		if (result_pattern_EmptyDefaulFlow_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_EmptyDefaulFlow_10_2_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_10_2_black = pattern_EmptyDefaulFlow_10_2_blackB(csp);
			if (result_pattern_EmptyDefaulFlow_10_2_black != null) {

				return new Object[] { csp, _this, match, gwStep, useCase, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_EmptyDefaulFlow_10_3_expressionFBB(EmptyDefaulFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_10_4_blackBBBB(Match match, ChoiceStep gwStep, UseCase useCase,
			Flow flow) {
		return new Object[] { match, gwStep, useCase, flow };
	}

	public static final Object[] pattern_EmptyDefaulFlow_10_4_greenBBF(Match match, ChoiceStep gwStep) {
		EMoflonEdge gwStep__gwStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String gwStep__gwStep______lastInDef_name_prime = "__lastInDef";
		gwStep__gwStep______lastInDef.setSrc(gwStep);
		gwStep__gwStep______lastInDef.setTrg(gwStep);
		match.getToBeTranslatedEdges().add(gwStep__gwStep______lastInDef);
		gwStep__gwStep______lastInDef.setName(gwStep__gwStep______lastInDef_name_prime);
		return new Object[] { match, gwStep, gwStep__gwStep______lastInDef };
	}

	public static final Object[] pattern_EmptyDefaulFlow_10_5_blackBBBB(Match match, ChoiceStep gwStep, UseCase useCase,
			Flow flow) {
		return new Object[] { match, gwStep, useCase, flow };
	}

	public static final Object[] pattern_EmptyDefaulFlow_10_5_greenBBBBFF(Match match, ChoiceStep gwStep,
			UseCase useCase, Flow flow) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__gwStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(gwStep);
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		String useCase__flow____flows_name_prime = "flows";
		String flow__gwStep____steps_name_prime = "steps";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		flow__gwStep____steps.setSrc(flow);
		flow__gwStep____steps.setTrg(gwStep);
		match.getContextEdges().add(flow__gwStep____steps);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__gwStep____steps.setName(flow__gwStep____steps_name_prime);
		return new Object[] { match, gwStep, useCase, flow, useCase__flow____flows, flow__gwStep____steps };
	}

	public static final void pattern_EmptyDefaulFlow_10_6_expressionBBBBB(EmptyDefaulFlow _this, Match match,
			ChoiceStep gwStep, UseCase useCase, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, gwStep, useCase, flow);

	}

	public static final boolean pattern_EmptyDefaulFlow_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EmptyDefaulFlow_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_11_1_bindingFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("gw");
		EObject _localVariable_1 = isApplicableMatch.getObject("gwStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_4 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("gw2gs");
		EObject _localVariable_7 = isApplicableMatch.getObject("gcw");
		EObject tmpGw = _localVariable_0;
		EObject tmpGwStep = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		EObject tmpP2uc = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpGw2gs = _localVariable_6;
		EObject tmpGcw = _localVariable_7;
		if (tmpGw instanceof ExclusiveGateway) {
			ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
			if (tmpGwStep instanceof ChoiceStep) {
				ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						if (tmpP2uc instanceof P2UC) {
							P2UC p2uc = (P2UC) tmpP2uc;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpGw2gs instanceof GW2S) {
									GW2S gw2gs = (GW2S) tmpGw2gs;
									if (tmpGcw instanceof ExclusiveGateway) {
										ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
										return new Object[] { gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw,
												isApplicableMatch };
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

	public static final Object[] pattern_EmptyDefaulFlow_11_1_blackBBBBBBBBBFB(ExclusiveGateway gw, ChoiceStep gwStep,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs, ExclusiveGateway gcw,
			EmptyDefaulFlow _this, IsApplicableMatch isApplicableMatch) {
		if (!gcw.equals(gw)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_11_1_bindingAndBlackFFFFFFFFBFB(EmptyDefaulFlow _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EmptyDefaulFlow_11_1_binding = pattern_EmptyDefaulFlow_11_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EmptyDefaulFlow_11_1_binding != null) {
			ExclusiveGateway gw = (ExclusiveGateway) result_pattern_EmptyDefaulFlow_11_1_binding[0];
			ChoiceStep gwStep = (ChoiceStep) result_pattern_EmptyDefaulFlow_11_1_binding[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EmptyDefaulFlow_11_1_binding[2];
			UseCase useCase = (UseCase) result_pattern_EmptyDefaulFlow_11_1_binding[3];
			P2UC p2uc = (P2UC) result_pattern_EmptyDefaulFlow_11_1_binding[4];
			Flow flow = (Flow) result_pattern_EmptyDefaulFlow_11_1_binding[5];
			GW2S gw2gs = (GW2S) result_pattern_EmptyDefaulFlow_11_1_binding[6];
			ExclusiveGateway gcw = (ExclusiveGateway) result_pattern_EmptyDefaulFlow_11_1_binding[7];

			Object[] result_pattern_EmptyDefaulFlow_11_1_black = pattern_EmptyDefaulFlow_11_1_blackBBBBBBBBBFB(gw,
					gwStep, process, useCase, p2uc, flow, gw2gs, gcw, _this, isApplicableMatch);
			if (result_pattern_EmptyDefaulFlow_11_1_black != null) {
				CSP csp = (CSP) result_pattern_EmptyDefaulFlow_11_1_black[9];

				return new Object[] { gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_11_1_greenBBBF(ExclusiveGateway gw, SimpleBPMN.Process process,
			ExclusiveGateway gcw) {
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		sf.setSourceRef(gw);
		gw.setDefault(sf);
		process.getFlowElements().add(sf);
		sf.setTargetRef(gcw);
		return new Object[] { gw, process, gcw, sf };
	}

	public static final Object[] pattern_EmptyDefaulFlow_11_2_blackB(SequenceFlow sf) {
		return new Object[] { sf };
	}

	public static final Object[] pattern_EmptyDefaulFlow_11_2_greenFB(SequenceFlow sf) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf);
		return new Object[] { ruleresult, sf };
	}

	public static final Object[] pattern_EmptyDefaulFlow_11_3_blackBBBBBBBBBB(PerformRuleResult ruleresult, EObject gw,
			EObject gwStep, EObject process, EObject useCase, EObject p2uc, EObject flow, EObject gw2gs, EObject gcw,
			EObject sf) {
		if (!gw.equals(gwStep)) {
			if (!gw.equals(process)) {
				if (!gw.equals(useCase)) {
					if (!gw.equals(p2uc)) {
						if (!gw.equals(gw2gs)) {
							if (!gw.equals(sf)) {
								if (!gwStep.equals(process)) {
									if (!gwStep.equals(useCase)) {
										if (!gwStep.equals(p2uc)) {
											if (!gwStep.equals(sf)) {
												if (!process.equals(useCase)) {
													if (!process.equals(sf)) {
														if (!p2uc.equals(process)) {
															if (!p2uc.equals(useCase)) {
																if (!p2uc.equals(sf)) {
																	if (!flow.equals(gw)) {
																		if (!flow.equals(gwStep)) {
																			if (!flow.equals(process)) {
																				if (!flow.equals(useCase)) {
																					if (!flow.equals(p2uc)) {
																						if (!flow.equals(gw2gs)) {
																							if (!flow.equals(gcw)) {
																								if (!flow.equals(sf)) {
																									if (!gw2gs.equals(
																											gwStep)) {
																										if (!gw2gs
																												.equals(process)) {
																											if (!gw2gs
																													.equals(useCase)) {
																												if (!gw2gs
																														.equals(p2uc)) {
																													if (!gw2gs
																															.equals(sf)) {
																														if (!gcw.equals(
																																gw)) {
																															if (!gcw.equals(
																																	gwStep)) {
																																if (!gcw.equals(
																																		process)) {
																																	if (!gcw.equals(
																																			useCase)) {
																																		if (!gcw.equals(
																																				p2uc)) {
																																			if (!gcw.equals(
																																					gw2gs)) {
																																				if (!gcw.equals(
																																						sf)) {
																																					if (!sf.equals(
																																							useCase)) {
																																						return new Object[] {
																																								ruleresult,
																																								gw,
																																								gwStep,
																																								process,
																																								useCase,
																																								p2uc,
																																								flow,
																																								gw2gs,
																																								gcw,
																																								sf };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EmptyDefaulFlow_11_3_greenBBBBBBFFFFFFF(PerformRuleResult ruleresult,
			EObject gw, EObject gwStep, EObject process, EObject gcw, EObject sf) {
		EMoflonEdge sf__gw____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw__sf____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gwStep__gwStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__gcw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gcw__sf____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EmptyDefaulFlow";
		String sf__gw____sourceRef_name_prime = "sourceRef";
		String gw__sf____outgoing_name_prime = "outgoing";
		String gw__sf____default_name_prime = "default";
		String gwStep__gwStep______lastInDef_name_prime = "__lastInDef";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__gcw____targetRef_name_prime = "targetRef";
		String gcw__sf____incoming_name_prime = "incoming";
		sf__gw____sourceRef.setSrc(sf);
		sf__gw____sourceRef.setTrg(gw);
		ruleresult.getCreatedEdges().add(sf__gw____sourceRef);
		gw__sf____outgoing.setSrc(gw);
		gw__sf____outgoing.setTrg(sf);
		ruleresult.getCreatedEdges().add(gw__sf____outgoing);
		gw__sf____default.setSrc(gw);
		gw__sf____default.setTrg(sf);
		ruleresult.getCreatedEdges().add(gw__sf____default);
		gwStep__gwStep______lastInDef.setSrc(gwStep);
		gwStep__gwStep______lastInDef.setTrg(gwStep);
		ruleresult.getTranslatedEdges().add(gwStep__gwStep______lastInDef);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		ruleresult.getCreatedEdges().add(process__sf____flowElements);
		sf__gcw____targetRef.setSrc(sf);
		sf__gcw____targetRef.setTrg(gcw);
		ruleresult.getCreatedEdges().add(sf__gcw____targetRef);
		gcw__sf____incoming.setSrc(gcw);
		gcw__sf____incoming.setTrg(sf);
		ruleresult.getCreatedEdges().add(gcw__sf____incoming);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sf__gw____sourceRef.setName(sf__gw____sourceRef_name_prime);
		gw__sf____outgoing.setName(gw__sf____outgoing_name_prime);
		gw__sf____default.setName(gw__sf____default_name_prime);
		gwStep__gwStep______lastInDef.setName(gwStep__gwStep______lastInDef_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__gcw____targetRef.setName(sf__gcw____targetRef_name_prime);
		gcw__sf____incoming.setName(gcw__sf____incoming_name_prime);
		return new Object[] { ruleresult, gw, gwStep, process, gcw, sf, sf__gw____sourceRef, gw__sf____outgoing,
				gw__sf____default, gwStep__gwStep______lastInDef, process__sf____flowElements, sf__gcw____targetRef,
				gcw__sf____incoming };
	}

	public static final void pattern_EmptyDefaulFlow_11_5_expressionBBBBBBBBBBB(EmptyDefaulFlow _this,
			PerformRuleResult ruleresult, EObject gw, EObject gwStep, EObject process, EObject useCase, EObject p2uc,
			EObject flow, EObject gw2gs, EObject gcw, EObject sf) {
		_this.registerObjects_BWD(ruleresult, gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, sf);

	}

	public static final PerformRuleResult pattern_EmptyDefaulFlow_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_1_bindingFB(EmptyDefaulFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_1_blackFBB(EClass eClass, EmptyDefaulFlow _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_1_bindingAndBlackFFB(EmptyDefaulFlow _this) {
		Object[] result_pattern_EmptyDefaulFlow_12_1_binding = pattern_EmptyDefaulFlow_12_1_bindingFB(_this);
		if (result_pattern_EmptyDefaulFlow_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EmptyDefaulFlow_12_1_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_12_1_black = pattern_EmptyDefaulFlow_12_1_blackFBB(eClass, _this);
			if (result_pattern_EmptyDefaulFlow_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EmptyDefaulFlow_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EmptyDefaulFlow";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("gwStep");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpGwStep = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpGwStep instanceof ChoiceStep) {
			ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { gwStep, useCase, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_12_2_blackFBFBFBFB(ChoiceStep gwStep,
			UseCase useCase, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase, P2UC.class,
				"target")) {
			SimpleBPMN.Process process = p2uc.getSource();
			if (process != null) {
				for (GW2S gw2gs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(gwStep, GW2S.class,
						"target")) {
					Gateway tmpGw = gw2gs.getSource();
					if (tmpGw instanceof ExclusiveGateway) {
						ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
						boolean gwisDiverging = gw.isIsDiverging();
						if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
							_result.add(new Object[] { gw, gwStep, process, useCase, p2uc, flow, gw2gs, match });
						}

					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_12_3_blackBBBBBBBF(ExclusiveGateway gw,
			ChoiceStep gwStep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (gwStep.equals(gwStep.get__lastInDef())) {
			if (process.getFlowElements().contains(gw)) {
				if (useCase.getFlows().contains(flow)) {
					if (process.equals(p2uc.getSource())) {
						if (useCase.equals(p2uc.getTarget())) {
							if (flow.getSteps().contains(gwStep)) {
								if (gw.equals(gw2gs.getSource())) {
									if (gwStep.equals(gw2gs.getTarget())) {
										boolean gwisDiverging = gw.isIsDiverging();
										if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
											for (FlowElement tmpGcw : process.getFlowElements()) {
												if (tmpGcw instanceof ExclusiveGateway) {
													ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
													if (!gcw.equals(gw)) {
														boolean gcwisDiverging = gcw.isIsDiverging();
														if (Boolean.valueOf(gcwisDiverging).equals(false)) {
															_result.add(new Object[] { gw, gwStep, process, useCase,
																	p2uc, flow, gw2gs, gcw });
														}

													}
												}
											}
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

	public static final Object[] pattern_EmptyDefaulFlow_12_3_greenBBBBBBBBFFFFFFFFFF(ExclusiveGateway gw,
			ChoiceStep gwStep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs,
			ExclusiveGateway gcw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge gwStep__gwStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__gcw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__gwStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge gw2gs__gwStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String gwStep__gwStep______lastInDef_name_prime = "__lastInDef";
		String process__gw____flowElements_name_prime = "flowElements";
		String process__gcw____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String flow__gwStep____steps_name_prime = "steps";
		String gw2gs__gw____source_name_prime = "source";
		String gw2gs__gwStep____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(gw);
		isApplicableMatch.getAllContextElements().add(gwStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(gw2gs);
		isApplicableMatch.getAllContextElements().add(gcw);
		gwStep__gwStep______lastInDef.setSrc(gwStep);
		gwStep__gwStep______lastInDef.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(gwStep__gwStep______lastInDef);
		process__gw____flowElements.setSrc(process);
		process__gw____flowElements.setTrg(gw);
		isApplicableMatch.getAllContextElements().add(process__gw____flowElements);
		process__gcw____flowElements.setSrc(process);
		process__gcw____flowElements.setTrg(gcw);
		isApplicableMatch.getAllContextElements().add(process__gcw____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		flow__gwStep____steps.setSrc(flow);
		flow__gwStep____steps.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(flow__gwStep____steps);
		gw2gs__gw____source.setSrc(gw2gs);
		gw2gs__gw____source.setTrg(gw);
		isApplicableMatch.getAllContextElements().add(gw2gs__gw____source);
		gw2gs__gwStep____target.setSrc(gw2gs);
		gw2gs__gwStep____target.setTrg(gwStep);
		isApplicableMatch.getAllContextElements().add(gw2gs__gwStep____target);
		gwStep__gwStep______lastInDef.setName(gwStep__gwStep______lastInDef_name_prime);
		process__gw____flowElements.setName(process__gw____flowElements_name_prime);
		process__gcw____flowElements.setName(process__gcw____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		flow__gwStep____steps.setName(flow__gwStep____steps_name_prime);
		gw2gs__gw____source.setName(gw2gs__gw____source_name_prime);
		gw2gs__gwStep____target.setName(gw2gs__gwStep____target_name_prime);
		return new Object[] { gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw, isApplicableMatch,
				gwStep__gwStep______lastInDef, process__gw____flowElements, process__gcw____flowElements,
				useCase__flow____flows, p2uc__process____source, p2uc__useCase____target, flow__gwStep____steps,
				gw2gs__gw____source, gw2gs__gwStep____target };
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_4_bindingFBBBBBBBBBB(EmptyDefaulFlow _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway gw, ChoiceStep gwStep, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs, ExclusiveGateway gcw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, gw, gwStep, process, useCase, p2uc,
				flow, gw2gs, gcw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_4_bindingAndBlackFBBBBBBBBBB(EmptyDefaulFlow _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway gw, ChoiceStep gwStep, SimpleBPMN.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, GW2S gw2gs, ExclusiveGateway gcw) {
		Object[] result_pattern_EmptyDefaulFlow_12_4_binding = pattern_EmptyDefaulFlow_12_4_bindingFBBBBBBBBBB(_this,
				isApplicableMatch, gw, gwStep, process, useCase, p2uc, flow, gw2gs, gcw);
		if (result_pattern_EmptyDefaulFlow_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_EmptyDefaulFlow_12_4_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_12_4_black = pattern_EmptyDefaulFlow_12_4_blackB(csp);
			if (result_pattern_EmptyDefaulFlow_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, gw, gwStep, process, useCase, p2uc, flow, gw2gs,
						gcw };
			}
		}
		return null;
	}

	public static final boolean pattern_EmptyDefaulFlow_12_5_expressionFBB(EmptyDefaulFlow _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EmptyDefaulFlow_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EmptyDefaulFlow";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EmptyDefaulFlow_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_1_bindingFB(EmptyDefaulFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_1_blackFBB(EClass __eClass, EmptyDefaulFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_1_bindingAndBlackFFB(EmptyDefaulFlow _this) {
		Object[] result_pattern_EmptyDefaulFlow_20_1_binding = pattern_EmptyDefaulFlow_20_1_bindingFB(_this);
		if (result_pattern_EmptyDefaulFlow_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EmptyDefaulFlow_20_1_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_20_1_black = pattern_EmptyDefaulFlow_20_1_blackFBB(__eClass, _this);
			if (result_pattern_EmptyDefaulFlow_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EmptyDefaulFlow_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_2_black_nac_0BBB(SequenceFlow sf, ExclusiveGateway gw,
			ExclusiveGateway gcw) {
		if (!gcw.equals(gw)) {
			for (ExclusiveGateway __DEC_sf_default_915218 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
				if (!gw.equals(__DEC_sf_default_915218)) {
					if (!gcw.equals(__DEC_sf_default_915218)) {
						return new Object[] { sf, gw, gcw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_759358 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_759358)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_2_black_nac_2BB(ExclusiveGateway gcw, SequenceFlow sf) {
		if (sf.equals(gcw.getDefault())) {
			return new Object[] { gcw, sf };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_20_2_blackFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf = _edge_sourceRef.getSrc();
		if (tmpSf instanceof SequenceFlow) {
			SequenceFlow sf = (SequenceFlow) tmpSf;
			EObject tmpGw = _edge_sourceRef.getTrg();
			if (tmpGw instanceof ExclusiveGateway) {
				ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
				if (gw.equals(sf.getSourceRef())) {
					if (sf.equals(gw.getDefault())) {
						FlowNode tmpGcw = sf.getTargetRef();
						if (tmpGcw instanceof ExclusiveGateway) {
							ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
							if (!gcw.equals(gw)) {
								boolean gwisDiverging = gw.isIsDiverging();
								if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
									boolean gcwisDiverging = gcw.isIsDiverging();
									if (Boolean.valueOf(gcwisDiverging).equals(false)) {
										if (pattern_EmptyDefaulFlow_20_2_black_nac_0BBB(sf, gw, gcw) == null) {
											if (pattern_EmptyDefaulFlow_20_2_black_nac_2BB(gcw, sf) == null) {
												for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class,
																"flowElements")) {
													if (process.getFlowElements().contains(gw)) {
														if (process.getFlowElements().contains(gcw)) {
															if (pattern_EmptyDefaulFlow_20_2_black_nac_1BB(sf,
																	process) == null) {
																_result.add(new Object[] { gw, process, gcw, sf,
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

		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EmptyDefaulFlow_20_3_expressionFBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, gw, process, gcw, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EmptyDefaulFlow_20_4_expressionFBB(EmptyDefaulFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EmptyDefaulFlow_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_1_bindingFB(EmptyDefaulFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_1_blackFBB(EClass __eClass, EmptyDefaulFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_1_bindingAndBlackFFB(EmptyDefaulFlow _this) {
		Object[] result_pattern_EmptyDefaulFlow_21_1_binding = pattern_EmptyDefaulFlow_21_1_bindingFB(_this);
		if (result_pattern_EmptyDefaulFlow_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EmptyDefaulFlow_21_1_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_21_1_black = pattern_EmptyDefaulFlow_21_1_blackFBB(__eClass, _this);
			if (result_pattern_EmptyDefaulFlow_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EmptyDefaulFlow_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_2_black_nac_0BBB(SequenceFlow sf, ExclusiveGateway gw,
			ExclusiveGateway gcw) {
		if (!gcw.equals(gw)) {
			for (ExclusiveGateway __DEC_sf_default_942574 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
				if (!gw.equals(__DEC_sf_default_942574)) {
					if (!gcw.equals(__DEC_sf_default_942574)) {
						return new Object[] { sf, gw, gcw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_277424 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_277424)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_2_black_nac_2BB(ExclusiveGateway gcw, SequenceFlow sf) {
		if (sf.equals(gcw.getDefault())) {
			return new Object[] { gcw, sf };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_21_2_blackFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGw = _edge_outgoing.getSrc();
		if (tmpGw instanceof ExclusiveGateway) {
			ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
			EObject tmpSf = _edge_outgoing.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (gw.equals(sf.getSourceRef())) {
					if (sf.equals(gw.getDefault())) {
						boolean gwisDiverging = gw.isIsDiverging();
						if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
							FlowNode tmpGcw = sf.getTargetRef();
							if (tmpGcw instanceof ExclusiveGateway) {
								ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
								if (!gcw.equals(gw)) {
									boolean gcwisDiverging = gcw.isIsDiverging();
									if (Boolean.valueOf(gcwisDiverging).equals(false)) {
										if (pattern_EmptyDefaulFlow_21_2_black_nac_0BBB(sf, gw, gcw) == null) {
											if (pattern_EmptyDefaulFlow_21_2_black_nac_2BB(gcw, sf) == null) {
												for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(gw, SimpleBPMN.Process.class,
																"flowElements")) {
													if (process.getFlowElements().contains(sf)) {
														if (process.getFlowElements().contains(gcw)) {
															if (pattern_EmptyDefaulFlow_21_2_black_nac_1BB(sf,
																	process) == null) {
																_result.add(new Object[] { gw, process, gcw, sf,
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

		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EmptyDefaulFlow_21_3_expressionFBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, gw, process, gcw, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EmptyDefaulFlow_21_4_expressionFBB(EmptyDefaulFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EmptyDefaulFlow_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_22_1_bindingFB(EmptyDefaulFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_22_1_blackFBB(EClass __eClass, EmptyDefaulFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_22_1_bindingAndBlackFFB(EmptyDefaulFlow _this) {
		Object[] result_pattern_EmptyDefaulFlow_22_1_binding = pattern_EmptyDefaulFlow_22_1_bindingFB(_this);
		if (result_pattern_EmptyDefaulFlow_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EmptyDefaulFlow_22_1_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_22_1_black = pattern_EmptyDefaulFlow_22_1_blackFBB(__eClass, _this);
			if (result_pattern_EmptyDefaulFlow_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EmptyDefaulFlow_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_22_2_black_nac_0BBB(SequenceFlow sf, ExclusiveGateway gw,
			ExclusiveGateway gcw) {
		if (!gcw.equals(gw)) {
			for (ExclusiveGateway __DEC_sf_default_178251 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
				if (!gw.equals(__DEC_sf_default_178251)) {
					if (!gcw.equals(__DEC_sf_default_178251)) {
						return new Object[] { sf, gw, gcw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_22_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_574015 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_574015)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_22_2_black_nac_2BB(ExclusiveGateway gcw, SequenceFlow sf) {
		if (sf.equals(gcw.getDefault())) {
			return new Object[] { gcw, sf };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_22_2_blackFFFFB(EMoflonEdge _edge_default) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGw = _edge_default.getSrc();
		if (tmpGw instanceof ExclusiveGateway) {
			ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
			EObject tmpSf = _edge_default.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (gw.equals(sf.getSourceRef())) {
					if (sf.equals(gw.getDefault())) {
						boolean gwisDiverging = gw.isIsDiverging();
						if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
							FlowNode tmpGcw = sf.getTargetRef();
							if (tmpGcw instanceof ExclusiveGateway) {
								ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
								if (!gcw.equals(gw)) {
									boolean gcwisDiverging = gcw.isIsDiverging();
									if (Boolean.valueOf(gcwisDiverging).equals(false)) {
										if (pattern_EmptyDefaulFlow_22_2_black_nac_0BBB(sf, gw, gcw) == null) {
											if (pattern_EmptyDefaulFlow_22_2_black_nac_2BB(gcw, sf) == null) {
												for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(gw, SimpleBPMN.Process.class,
																"flowElements")) {
													if (process.getFlowElements().contains(sf)) {
														if (process.getFlowElements().contains(gcw)) {
															if (pattern_EmptyDefaulFlow_22_2_black_nac_1BB(sf,
																	process) == null) {
																_result.add(new Object[] { gw, process, gcw, sf,
																		_edge_default });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EmptyDefaulFlow_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EmptyDefaulFlow_22_3_expressionFBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, gw, process, gcw, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EmptyDefaulFlow_22_4_expressionFBB(EmptyDefaulFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EmptyDefaulFlow_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_23_1_bindingFB(EmptyDefaulFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_23_1_blackFBB(EClass __eClass, EmptyDefaulFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_23_1_bindingAndBlackFFB(EmptyDefaulFlow _this) {
		Object[] result_pattern_EmptyDefaulFlow_23_1_binding = pattern_EmptyDefaulFlow_23_1_bindingFB(_this);
		if (result_pattern_EmptyDefaulFlow_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EmptyDefaulFlow_23_1_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_23_1_black = pattern_EmptyDefaulFlow_23_1_blackFBB(__eClass, _this);
			if (result_pattern_EmptyDefaulFlow_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EmptyDefaulFlow_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_23_2_blackFFFB(EMoflonEdge _edge___lastInDef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGwStep = _edge___lastInDef.getSrc();
		if (tmpGwStep instanceof ChoiceStep) {
			ChoiceStep gwStep = (ChoiceStep) tmpGwStep;
			if (gwStep.equals(gwStep.get__lastInDef())) {
				if (gwStep.equals(_edge___lastInDef.getTrg())) {
					for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(gwStep,
							Flow.class, "steps")) {
						for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
								UseCase.class, "flows")) {
							_result.add(new Object[] { gwStep, useCase, flow, _edge___lastInDef });
						}
					}
				}
			}
		}

		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EmptyDefaulFlow_23_3_expressionFBBBBB(EmptyDefaulFlow _this, Match match,
			ChoiceStep gwStep, UseCase useCase, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, gwStep, useCase, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EmptyDefaulFlow_23_4_expressionFBB(EmptyDefaulFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EmptyDefaulFlow_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_1_bindingFB(EmptyDefaulFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_1_blackFBB(EClass __eClass, EmptyDefaulFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_1_bindingAndBlackFFB(EmptyDefaulFlow _this) {
		Object[] result_pattern_EmptyDefaulFlow_24_1_binding = pattern_EmptyDefaulFlow_24_1_bindingFB(_this);
		if (result_pattern_EmptyDefaulFlow_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EmptyDefaulFlow_24_1_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_24_1_black = pattern_EmptyDefaulFlow_24_1_blackFBB(__eClass, _this);
			if (result_pattern_EmptyDefaulFlow_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EmptyDefaulFlow_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_2_black_nac_0BBB(SequenceFlow sf, ExclusiveGateway gw,
			ExclusiveGateway gcw) {
		if (!gcw.equals(gw)) {
			for (ExclusiveGateway __DEC_sf_default_425961 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
				if (!gw.equals(__DEC_sf_default_425961)) {
					if (!gcw.equals(__DEC_sf_default_425961)) {
						return new Object[] { sf, gw, gcw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_873579 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_873579)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_2_black_nac_2BB(ExclusiveGateway gcw, SequenceFlow sf) {
		if (sf.equals(gcw.getDefault())) {
			return new Object[] { gcw, sf };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_24_2_blackFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf = _edge_flowElements.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (process.getFlowElements().contains(sf)) {
					FlowNode tmpGw = sf.getSourceRef();
					if (tmpGw instanceof ExclusiveGateway) {
						ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
						if (sf.equals(gw.getDefault())) {
							if (process.getFlowElements().contains(gw)) {
								FlowNode tmpGcw = sf.getTargetRef();
								if (tmpGcw instanceof ExclusiveGateway) {
									ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
									if (!gcw.equals(gw)) {
										if (process.getFlowElements().contains(gcw)) {
											boolean gwisDiverging = gw.isIsDiverging();
											if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
												boolean gcwisDiverging = gcw.isIsDiverging();
												if (Boolean.valueOf(gcwisDiverging).equals(false)) {
													if (pattern_EmptyDefaulFlow_24_2_black_nac_1BB(sf,
															process) == null) {
														if (pattern_EmptyDefaulFlow_24_2_black_nac_0BBB(sf, gw,
																gcw) == null) {
															if (pattern_EmptyDefaulFlow_24_2_black_nac_2BB(gcw,
																	sf) == null) {
																_result.add(new Object[] { gw, process, gcw, sf,
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

		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EmptyDefaulFlow_24_3_expressionFBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, gw, process, gcw, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EmptyDefaulFlow_24_4_expressionFBB(EmptyDefaulFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EmptyDefaulFlow_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_1_bindingFB(EmptyDefaulFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_1_blackFBB(EClass __eClass, EmptyDefaulFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_1_bindingAndBlackFFB(EmptyDefaulFlow _this) {
		Object[] result_pattern_EmptyDefaulFlow_25_1_binding = pattern_EmptyDefaulFlow_25_1_bindingFB(_this);
		if (result_pattern_EmptyDefaulFlow_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EmptyDefaulFlow_25_1_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_25_1_black = pattern_EmptyDefaulFlow_25_1_blackFBB(__eClass, _this);
			if (result_pattern_EmptyDefaulFlow_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EmptyDefaulFlow_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_2_black_nac_0BBB(SequenceFlow sf, ExclusiveGateway gw,
			ExclusiveGateway gcw) {
		if (!gcw.equals(gw)) {
			for (ExclusiveGateway __DEC_sf_default_612999 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
				if (!gw.equals(__DEC_sf_default_612999)) {
					if (!gcw.equals(__DEC_sf_default_612999)) {
						return new Object[] { sf, gw, gcw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_971149 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_971149)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_2_black_nac_2BB(ExclusiveGateway gcw, SequenceFlow sf) {
		if (sf.equals(gcw.getDefault())) {
			return new Object[] { gcw, sf };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_25_2_blackFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf = _edge_targetRef.getSrc();
		if (tmpSf instanceof SequenceFlow) {
			SequenceFlow sf = (SequenceFlow) tmpSf;
			EObject tmpGcw = _edge_targetRef.getTrg();
			if (tmpGcw instanceof ExclusiveGateway) {
				ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
				if (gcw.equals(sf.getTargetRef())) {
					FlowNode tmpGw = sf.getSourceRef();
					if (tmpGw instanceof ExclusiveGateway) {
						ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
						if (!gcw.equals(gw)) {
							if (sf.equals(gw.getDefault())) {
								boolean gcwisDiverging = gcw.isIsDiverging();
								if (Boolean.valueOf(gcwisDiverging).equals(false)) {
									boolean gwisDiverging = gw.isIsDiverging();
									if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
										if (pattern_EmptyDefaulFlow_25_2_black_nac_2BB(gcw, sf) == null) {
											if (pattern_EmptyDefaulFlow_25_2_black_nac_0BBB(sf, gw, gcw) == null) {
												for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class,
																"flowElements")) {
													if (process.getFlowElements().contains(gw)) {
														if (process.getFlowElements().contains(gcw)) {
															if (pattern_EmptyDefaulFlow_25_2_black_nac_1BB(sf,
																	process) == null) {
																_result.add(new Object[] { gw, process, gcw, sf,
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

		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EmptyDefaulFlow_25_3_expressionFBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, gw, process, gcw, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EmptyDefaulFlow_25_4_expressionFBB(EmptyDefaulFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EmptyDefaulFlow_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_1_bindingFB(EmptyDefaulFlow _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_1_blackFBB(EClass __eClass, EmptyDefaulFlow _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_1_bindingAndBlackFFB(EmptyDefaulFlow _this) {
		Object[] result_pattern_EmptyDefaulFlow_26_1_binding = pattern_EmptyDefaulFlow_26_1_bindingFB(_this);
		if (result_pattern_EmptyDefaulFlow_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EmptyDefaulFlow_26_1_binding[0];

			Object[] result_pattern_EmptyDefaulFlow_26_1_black = pattern_EmptyDefaulFlow_26_1_blackFBB(__eClass, _this);
			if (result_pattern_EmptyDefaulFlow_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EmptyDefaulFlow_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_2_black_nac_0BBB(SequenceFlow sf, ExclusiveGateway gw,
			ExclusiveGateway gcw) {
		if (!gcw.equals(gw)) {
			for (ExclusiveGateway __DEC_sf_default_2089 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf, ExclusiveGateway.class, "default")) {
				if (!gw.equals(__DEC_sf_default_2089)) {
					if (!gcw.equals(__DEC_sf_default_2089)) {
						return new Object[] { sf, gw, gcw };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_2_black_nac_1BB(SequenceFlow sf,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf_flowElements_837277 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf_flowElements_837277)) {
				return new Object[] { sf, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_2_black_nac_2BB(ExclusiveGateway gcw, SequenceFlow sf) {
		if (sf.equals(gcw.getDefault())) {
			return new Object[] { gcw, sf };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EmptyDefaulFlow_26_2_blackFFFFB(EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGcw = _edge_incoming.getSrc();
		if (tmpGcw instanceof ExclusiveGateway) {
			ExclusiveGateway gcw = (ExclusiveGateway) tmpGcw;
			EObject tmpSf = _edge_incoming.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (gcw.equals(sf.getTargetRef())) {
					boolean gcwisDiverging = gcw.isIsDiverging();
					if (Boolean.valueOf(gcwisDiverging).equals(false)) {
						FlowNode tmpGw = sf.getSourceRef();
						if (tmpGw instanceof ExclusiveGateway) {
							ExclusiveGateway gw = (ExclusiveGateway) tmpGw;
							if (!gcw.equals(gw)) {
								if (sf.equals(gw.getDefault())) {
									boolean gwisDiverging = gw.isIsDiverging();
									if (Boolean.valueOf(gwisDiverging).equals(Boolean.valueOf(true))) {
										if (pattern_EmptyDefaulFlow_26_2_black_nac_2BB(gcw, sf) == null) {
											if (pattern_EmptyDefaulFlow_26_2_black_nac_0BBB(sf, gw, gcw) == null) {
												for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(gcw, SimpleBPMN.Process.class,
																"flowElements")) {
													if (process.getFlowElements().contains(gw)) {
														if (process.getFlowElements().contains(sf)) {
															if (pattern_EmptyDefaulFlow_26_2_black_nac_1BB(sf,
																	process) == null) {
																_result.add(new Object[] { gw, process, gcw, sf,
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

		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EmptyDefaulFlow_26_3_expressionFBBBBBB(EmptyDefaulFlow _this, Match match,
			ExclusiveGateway gw, SimpleBPMN.Process process, ExclusiveGateway gcw, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, gw, process, gcw, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EmptyDefaulFlow_26_4_expressionFBB(EmptyDefaulFlow _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EmptyDefaulFlow_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EmptyDefaulFlow_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EmptyDefaulFlowImpl
