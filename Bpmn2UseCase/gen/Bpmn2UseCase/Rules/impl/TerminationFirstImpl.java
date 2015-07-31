/**
 */
package bpmn2UseCase.Rules.impl;

import SimpleBPMN.EndEvent;
import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.Flow;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.Step;
import SimpleUseCase.UCCondition;
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

import bpmn2UseCase.FN2F;

import bpmn2UseCase.Rules.RulesPackage;
import bpmn2UseCase.Rules.TerminationFirst;

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
 * An implementation of the model object '<em><b>Termination First</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TerminationFirstImpl extends AbstractRuleImpl implements TerminationFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminationFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTerminationFirst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow,
			EndEvent event) {
		// initial bindings
		Object[] result1_black = TerminationFirstImpl.pattern_TerminationFirst_0_1_blackBBBBBB(this, match, prevNode,
				process, inFlow, event);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = TerminationFirstImpl
				.pattern_TerminationFirst_0_2_bindingAndBlackFBBBBBB(this, match, prevNode, process, inFlow, event);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (TerminationFirstImpl.pattern_TerminationFirst_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = TerminationFirstImpl.pattern_TerminationFirst_0_4_blackBBBBB(match, prevNode,
					process, inFlow, event);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
			}
			TerminationFirstImpl.pattern_TerminationFirst_0_4_greenBBBBBFFFFFF(match, prevNode, process, inFlow, event);
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge process__event____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result4_green[7];
			// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result4_green[8];
			// EMoflonEdge inFlow__prevNode____sourceRef = (EMoflonEdge) result4_green[9];
			// EMoflonEdge prevNode__inFlow____outgoing = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = TerminationFirstImpl.pattern_TerminationFirst_0_5_blackBBBBB(match, prevNode,
					process, inFlow, event);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
			}
			TerminationFirstImpl.pattern_TerminationFirst_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			TerminationFirstImpl.pattern_TerminationFirst_0_6_expressionBBBBBB(this, match, prevNode, process, inFlow,
					event);
			return TerminationFirstImpl.pattern_TerminationFirst_0_7_expressionF();
		} else {
			return TerminationFirstImpl.pattern_TerminationFirst_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = TerminationFirstImpl
				.pattern_TerminationFirst_1_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2F pn2f = (FN2F) result1_bindingAndBlack[0];
		Flow flow = (Flow) result1_bindingAndBlack[1];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[4];
		EndEvent event = (EndEvent) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_1_1_greenBFB(flow, csp);
		UCCondition state = (UCCondition) result1_green[1];

		// collect translated elements
		Object[] result2_black = TerminationFirstImpl.pattern_TerminationFirst_1_2_blackBBB(inFlow, event, state);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[inFlow] = " + inFlow + ", " + "[event] = " + event + ", " + "[state] = " + state + ".");
		}
		Object[] result2_green = TerminationFirstImpl.pattern_TerminationFirst_1_2_greenFBBB(inFlow, event, state);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = TerminationFirstImpl.pattern_TerminationFirst_1_3_blackBBBBBBBB(ruleresult, pn2f, flow,
				prevNode, process, inFlow, event, state);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pn2f] = " + pn2f + ", " + "[flow] = " + flow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", " + "[inFlow] = " + inFlow
					+ ", " + "[event] = " + event + ", " + "[state] = " + state + ".");
		}
		TerminationFirstImpl.pattern_TerminationFirst_1_3_greenBBBBBBBFFFFFFF(ruleresult, flow, prevNode, process,
				inFlow, event, state);
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[9];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[11];
				// EMoflonEdge inFlow__prevNode____sourceRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge prevNode__inFlow____outgoing = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		TerminationFirstImpl.pattern_TerminationFirst_1_5_expressionBBBBBBBBB(this, ruleresult, pn2f, flow, prevNode,
				process, inFlow, event, state);
		return TerminationFirstImpl.pattern_TerminationFirst_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = TerminationFirstImpl.pattern_TerminationFirst_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		FlowNode prevNode = (FlowNode) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[2];
		EndEvent event = (EndEvent) result2_binding[3];
		for (Object[] result2_black : TerminationFirstImpl.pattern_TerminationFirst_2_2_blackFFBBBBB(prevNode, process,
				inFlow, event, match)) {
			FN2F pn2f = (FN2F) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : TerminationFirstImpl.pattern_TerminationFirst_2_3_blackBBBBBB(pn2f, flow,
					prevNode, process, inFlow, event)) {
				Object[] result3_green = TerminationFirstImpl.pattern_TerminationFirst_2_3_greenBBBBBBFFFFFFFFFF(pn2f,
						flow, prevNode, process, inFlow, event);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge pn2f__prevNode____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge pn2f__flow____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlow__prevNode____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevNode__inFlow____outgoing = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = TerminationFirstImpl
						.pattern_TerminationFirst_2_4_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, pn2f, flow,
								prevNode, process, inFlow, event);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pn2f] = " + pn2f + ", "
									+ "[flow] = " + flow + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
									+ process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (TerminationFirstImpl.pattern_TerminationFirst_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = TerminationFirstImpl.pattern_TerminationFirst_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					TerminationFirstImpl.pattern_TerminationFirst_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TerminationFirstImpl.pattern_TerminationFirst_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {
		match.registerObject("prevNode", prevNode);
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("event", event);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FN2F pn2f, Flow flow, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event.id", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("String");

		// Create unbound variables
		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state.name", csp);
		var_state_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_event_id, var_state_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pn2f", pn2f);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("event", event);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pn2f, EObject flow, EObject prevNode,
			EObject process, EObject inFlow, EObject event, EObject state) {
		ruleresult.registerObject("pn2f", pn2f);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("state", state);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("inFlow").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow())
				&& match.getObject("event").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getEndEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Flow flow, UCCondition state) {
		// initial bindings
		Object[] result1_black = TerminationFirstImpl.pattern_TerminationFirst_10_1_blackBBBB(this, match, flow, state);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[state] = " + state + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_10_2_bindingAndBlackFBBBB(this,
				match, flow, state);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[state] = " + state + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (TerminationFirstImpl.pattern_TerminationFirst_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = TerminationFirstImpl.pattern_TerminationFirst_10_4_blackBBB(match, flow, state);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[state] = " + state + ".");
			}
			TerminationFirstImpl.pattern_TerminationFirst_10_4_greenBBBF(match, flow, state);
			// EMoflonEdge flow__state____finalState = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = TerminationFirstImpl.pattern_TerminationFirst_10_5_blackBBB(match, flow, state);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[flow] = " + flow + ", " + "[state] = " + state + ".");
			}
			TerminationFirstImpl.pattern_TerminationFirst_10_5_greenBB(match, flow);

			// register objects to match
			TerminationFirstImpl.pattern_TerminationFirst_10_6_expressionBBBB(this, match, flow, state);
			return TerminationFirstImpl.pattern_TerminationFirst_10_7_expressionF();
		} else {
			return TerminationFirstImpl.pattern_TerminationFirst_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = TerminationFirstImpl
				.pattern_TerminationFirst_11_1_bindingAndBlackFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2F pn2f = (FN2F) result1_bindingAndBlack[0];
		Flow flow = (Flow) result1_bindingAndBlack[1];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		UCCondition state = (UCCondition) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_11_1_greenBBFFB(prevNode, process, csp);
		SequenceFlow inFlow = (SequenceFlow) result1_green[2];
		EndEvent event = (EndEvent) result1_green[3];

		// collect translated elements
		Object[] result2_black = TerminationFirstImpl.pattern_TerminationFirst_11_2_blackBBB(inFlow, event, state);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[inFlow] = " + inFlow + ", " + "[event] = " + event + ", " + "[state] = " + state + ".");
		}
		Object[] result2_green = TerminationFirstImpl.pattern_TerminationFirst_11_2_greenFBBB(inFlow, event, state);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = TerminationFirstImpl.pattern_TerminationFirst_11_3_blackBBBBBBBB(ruleresult, pn2f,
				flow, prevNode, process, inFlow, event, state);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pn2f] = " + pn2f + ", " + "[flow] = " + flow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", " + "[inFlow] = " + inFlow
					+ ", " + "[event] = " + event + ", " + "[state] = " + state + ".");
		}
		TerminationFirstImpl.pattern_TerminationFirst_11_3_greenBBBBBBBFFFFFFF(ruleresult, flow, prevNode, process,
				inFlow, event, state);
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[9];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[11];
				// EMoflonEdge inFlow__prevNode____sourceRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge prevNode__inFlow____outgoing = (EMoflonEdge) result3_green[13];

		// perform postprocessing story node is empty
		// register objects
		TerminationFirstImpl.pattern_TerminationFirst_11_5_expressionBBBBBBBBB(this, ruleresult, pn2f, flow, prevNode,
				process, inFlow, event, state);
		return TerminationFirstImpl.pattern_TerminationFirst_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = TerminationFirstImpl.pattern_TerminationFirst_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Flow flow = (Flow) result2_binding[0];
		UCCondition state = (UCCondition) result2_binding[1];
		for (Object[] result2_black : TerminationFirstImpl.pattern_TerminationFirst_12_2_blackFBFBB(flow, state,
				match)) {
			FN2F pn2f = (FN2F) result2_black[0];
			FlowNode prevNode = (FlowNode) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : TerminationFirstImpl.pattern_TerminationFirst_12_3_blackBBBFB(pn2f, flow,
					prevNode, state)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[3];
				Object[] result3_green = TerminationFirstImpl.pattern_TerminationFirst_12_3_greenBBBBBFFFFF(pn2f, flow,
						prevNode, process, state);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge pn2f__prevNode____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge pn2f__flow____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = TerminationFirstImpl
						.pattern_TerminationFirst_12_4_bindingAndBlackFBBBBBBB(this, isApplicableMatch, pn2f, flow,
								prevNode, process, state);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pn2f] = " + pn2f + ", " + "[flow] = " + flow + ", " + "[prevNode] = " + prevNode + ", "
							+ "[process] = " + process + ", " + "[state] = " + state + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (TerminationFirstImpl.pattern_TerminationFirst_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = TerminationFirstImpl.pattern_TerminationFirst_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					TerminationFirstImpl.pattern_TerminationFirst_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TerminationFirstImpl.pattern_TerminationFirst_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Flow flow, UCCondition state) {
		match.registerObject("flow", flow);
		match.registerObject("state", state);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Flow flow, UCCondition state) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2F pn2f, Flow flow, FlowNode prevNode,
			SimpleBPMN.Process process, UCCondition state) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state.name", true, csp);
		var_state_name.setValue(state.getName());
		var_state_name.setType("String");

		// Create unbound variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event.id", csp);
		var_event_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_event_id, var_state_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pn2f", pn2f);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("state", state);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject pn2f, EObject flow, EObject prevNode,
			EObject process, EObject inFlow, EObject event, EObject state) {
		ruleresult.registerObject("pn2f", pn2f);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("state", state);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("state").eClass()
				.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getUCCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_37(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TerminationFirstImpl
				.pattern_TerminationFirst_20_2_blackFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = TerminationFirstImpl.pattern_TerminationFirst_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TerminationFirstImpl.pattern_TerminationFirst_20_3_expressionFBBBBBB(this, match, prevNode, process,
					inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (TerminationFirstImpl.pattern_TerminationFirst_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = TerminationFirstImpl.pattern_TerminationFirst_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					TerminationFirstImpl.pattern_TerminationFirst_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return TerminationFirstImpl.pattern_TerminationFirst_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_38(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TerminationFirstImpl
				.pattern_TerminationFirst_21_2_blackFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = TerminationFirstImpl.pattern_TerminationFirst_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TerminationFirstImpl.pattern_TerminationFirst_21_3_expressionFBBBBBB(this, match, prevNode, process,
					inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (TerminationFirstImpl.pattern_TerminationFirst_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = TerminationFirstImpl.pattern_TerminationFirst_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					TerminationFirstImpl.pattern_TerminationFirst_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return TerminationFirstImpl.pattern_TerminationFirst_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_39(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TerminationFirstImpl.pattern_TerminationFirst_22_2_blackFFFFB(_edge_targetRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = TerminationFirstImpl.pattern_TerminationFirst_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TerminationFirstImpl.pattern_TerminationFirst_22_3_expressionFBBBBBB(this, match, prevNode, process,
					inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (TerminationFirstImpl.pattern_TerminationFirst_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = TerminationFirstImpl.pattern_TerminationFirst_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					TerminationFirstImpl.pattern_TerminationFirst_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return TerminationFirstImpl.pattern_TerminationFirst_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_40(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TerminationFirstImpl.pattern_TerminationFirst_23_2_blackFFFFB(_edge_incoming)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = TerminationFirstImpl.pattern_TerminationFirst_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TerminationFirstImpl.pattern_TerminationFirst_23_3_expressionFBBBBBB(this, match, prevNode, process,
					inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (TerminationFirstImpl.pattern_TerminationFirst_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = TerminationFirstImpl.pattern_TerminationFirst_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					TerminationFirstImpl.pattern_TerminationFirst_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return TerminationFirstImpl.pattern_TerminationFirst_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_11(EMoflonEdge _edge_finalState) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TerminationFirstImpl.pattern_TerminationFirst_24_2_blackFFB(_edge_finalState)) {
			Flow flow = (Flow) result2_black[0];
			UCCondition state = (UCCondition) result2_black[1];
			Object[] result2_green = TerminationFirstImpl.pattern_TerminationFirst_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TerminationFirstImpl.pattern_TerminationFirst_24_3_expressionFBBBB(this, match, flow, state)) {
				// Ensure that the correct types of elements are matched
				if (TerminationFirstImpl.pattern_TerminationFirst_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = TerminationFirstImpl.pattern_TerminationFirst_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					TerminationFirstImpl.pattern_TerminationFirst_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return TerminationFirstImpl.pattern_TerminationFirst_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_41(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TerminationFirstImpl.pattern_TerminationFirst_25_2_blackFFFFB(_edge_sourceRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = TerminationFirstImpl.pattern_TerminationFirst_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TerminationFirstImpl.pattern_TerminationFirst_25_3_expressionFBBBBBB(this, match, prevNode, process,
					inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (TerminationFirstImpl.pattern_TerminationFirst_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = TerminationFirstImpl.pattern_TerminationFirst_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					TerminationFirstImpl.pattern_TerminationFirst_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return TerminationFirstImpl.pattern_TerminationFirst_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_42(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = TerminationFirstImpl.pattern_TerminationFirst_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TerminationFirstImpl.pattern_TerminationFirst_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : TerminationFirstImpl.pattern_TerminationFirst_26_2_blackFFFFB(_edge_outgoing)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = TerminationFirstImpl.pattern_TerminationFirst_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (TerminationFirstImpl.pattern_TerminationFirst_26_3_expressionFBBBBBB(this, match, prevNode, process,
					inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (TerminationFirstImpl.pattern_TerminationFirst_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = TerminationFirstImpl.pattern_TerminationFirst_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					TerminationFirstImpl.pattern_TerminationFirst_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return TerminationFirstImpl.pattern_TerminationFirst_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TerminationFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPn2f = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2f")).findAny();
		bpmn2UseCase.FN2F pn2f = (bpmn2UseCase.FN2F) matchForPn2f.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("inFlow")).findAny();
		SimpleBPMN.SequenceFlow inFlow = (SimpleBPMN.SequenceFlow) matchForInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEvent = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("event")).findAny();
		SimpleBPMN.EndEvent event = (SimpleBPMN.EndEvent) matchForEvent.get().getNode();

		Optional<TripleMatchNodeMapping> matchForState = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("state")).findAny();
		SimpleUseCase.UCCondition state = (SimpleUseCase.UCCondition) matchForState.get().getNode();

		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("String");

		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state", true, csp);
		var_state_name.setValue(state.getName());
		var_state_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("TerminationFirst");
		eq0.solve(var_event_id, var_state_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_state_name.setBound(false);
			eq0.solve(var_event_id, var_state_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				state.setName((String) var_state_name.getValue());
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
		ruleResult.setRule("TerminationFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPn2f = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2f")).findAny();
		bpmn2UseCase.FN2F pn2f = (bpmn2UseCase.FN2F) matchForPn2f.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("inFlow")).findAny();
		SimpleBPMN.SequenceFlow inFlow = (SimpleBPMN.SequenceFlow) matchForInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEvent = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("event")).findAny();
		SimpleBPMN.EndEvent event = (SimpleBPMN.EndEvent) matchForEvent.get().getNode();

		Optional<TripleMatchNodeMapping> matchForState = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("state")).findAny();
		SimpleUseCase.UCCondition state = (SimpleUseCase.UCCondition) matchForState.get().getNode();

		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("String");

		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state", true, csp);
		var_state_name.setValue(state.getName());
		var_state_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("TerminationFirst");
		eq0.solve(var_event_id, var_state_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_event_id.setBound(false);
			eq0.solve(var_event_id, var_state_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				event.setId((String) var_event_id.getValue());
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
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(EndEvent) arguments.get(4));
		case RulesPackage.TERMINATION_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(EndEvent) arguments.get(4));
			return null;
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(EndEvent) arguments.get(4));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(Flow) arguments.get(2), (FlowNode) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5), (EndEvent) arguments.get(6));
		case RulesPackage.TERMINATION_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.TERMINATION_FIRST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_BWD__MATCH_FLOW_UCCONDITION:
			return isAppropriate_BWD((Match) arguments.get(0), (Flow) arguments.get(1), (UCCondition) arguments.get(2));
		case RulesPackage.TERMINATION_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_UCCONDITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Flow) arguments.get(1),
					(UCCondition) arguments.get(2));
			return null;
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_UCCONDITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Flow) arguments.get(1),
					(UCCondition) arguments.get(2));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_FLOW_FLOWNODE_PROCESS_UCCONDITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(Flow) arguments.get(2), (FlowNode) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(UCCondition) arguments.get(5));
		case RulesPackage.TERMINATION_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.TERMINATION_FIRST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_39__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_39((EMoflonEdge) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_40__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_40((EMoflonEdge) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_41((EMoflonEdge) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_42__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_42((EMoflonEdge) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TERMINATION_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TerminationFirst_0_1_blackBBBBBB(TerminationFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		if (!event.equals(prevNode)) {
			return new Object[] { _this, match, prevNode, process, inFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_0_2_bindingFBBBBBB(TerminationFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, inFlow, event);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, inFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TerminationFirst_0_2_bindingAndBlackFBBBBBB(TerminationFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		Object[] result_pattern_TerminationFirst_0_2_binding = pattern_TerminationFirst_0_2_bindingFBBBBBB(_this, match,
				prevNode, process, inFlow, event);
		if (result_pattern_TerminationFirst_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_TerminationFirst_0_2_binding[0];

			Object[] result_pattern_TerminationFirst_0_2_black = pattern_TerminationFirst_0_2_blackB(csp);
			if (result_pattern_TerminationFirst_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, inFlow, event };
			}
		}
		return null;
	}

	public static final boolean pattern_TerminationFirst_0_3_expressionFBB(TerminationFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_0_4_blackBBBBB(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		if (!event.equals(prevNode)) {
			return new Object[] { match, prevNode, process, inFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_0_4_greenBBBBBFFFFFF(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(inFlow);
		match.getToBeTranslatedNodes().add(event);
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String inFlow__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__inFlow____outgoing_name_prime = "outgoing";
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(process__inFlow____flowElements);
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		match.getToBeTranslatedEdges().add(process__event____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		match.getToBeTranslatedEdges().add(inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(event__inFlow____incoming);
		inFlow__prevNode____sourceRef.setSrc(inFlow);
		inFlow__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(inFlow__prevNode____sourceRef);
		prevNode__inFlow____outgoing.setSrc(prevNode);
		prevNode__inFlow____outgoing.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(prevNode__inFlow____outgoing);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		inFlow__prevNode____sourceRef.setName(inFlow__prevNode____sourceRef_name_prime);
		prevNode__inFlow____outgoing.setName(prevNode__inFlow____outgoing_name_prime);
		return new Object[] { match, prevNode, process, inFlow, event, process__inFlow____flowElements,
				process__event____flowElements, inFlow__event____targetRef, event__inFlow____incoming,
				inFlow__prevNode____sourceRef, prevNode__inFlow____outgoing };
	}

	public static final Object[] pattern_TerminationFirst_0_5_blackBBBBB(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		if (!event.equals(prevNode)) {
			return new Object[] { match, prevNode, process, inFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_0_5_greenBBBF(Match match, FlowNode prevNode,
			SimpleBPMN.Process process) {
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(prevNode);
		match.getContextNodes().add(process);
		String process__prevNode____flowElements_name_prime = "flowElements";
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		match.getContextEdges().add(process__prevNode____flowElements);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { match, prevNode, process, process__prevNode____flowElements };
	}

	public static final void pattern_TerminationFirst_0_6_expressionBBBBBB(TerminationFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, inFlow, event);

	}

	public static final boolean pattern_TerminationFirst_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TerminationFirst_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_1_1_bindingFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pn2f");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("event");
		EObject tmpPn2f = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpInFlow = _localVariable_4;
		EObject tmpEvent = _localVariable_5;
		if (tmpPn2f instanceof FN2F) {
			FN2F pn2f = (FN2F) tmpPn2f;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpPrevNode instanceof FlowNode) {
					FlowNode prevNode = (FlowNode) tmpPrevNode;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpInFlow instanceof SequenceFlow) {
							SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
							if (tmpEvent instanceof EndEvent) {
								EndEvent event = (EndEvent) tmpEvent;
								return new Object[] { pn2f, flow, prevNode, process, inFlow, event, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_1_1_blackBBBBBBBFB(FN2F pn2f, Flow flow, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event, TerminationFirst _this,
			IsApplicableMatch isApplicableMatch) {
		if (!event.equals(prevNode)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { pn2f, flow, prevNode, process, inFlow, event, _this, csp, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_1_1_bindingAndBlackFFFFFFBFB(TerminationFirst _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TerminationFirst_1_1_binding = pattern_TerminationFirst_1_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TerminationFirst_1_1_binding != null) {
			FN2F pn2f = (FN2F) result_pattern_TerminationFirst_1_1_binding[0];
			Flow flow = (Flow) result_pattern_TerminationFirst_1_1_binding[1];
			FlowNode prevNode = (FlowNode) result_pattern_TerminationFirst_1_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_TerminationFirst_1_1_binding[3];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_TerminationFirst_1_1_binding[4];
			EndEvent event = (EndEvent) result_pattern_TerminationFirst_1_1_binding[5];

			Object[] result_pattern_TerminationFirst_1_1_black = pattern_TerminationFirst_1_1_blackBBBBBBBFB(pn2f, flow,
					prevNode, process, inFlow, event, _this, isApplicableMatch);
			if (result_pattern_TerminationFirst_1_1_black != null) {
				CSP csp = (CSP) result_pattern_TerminationFirst_1_1_black[7];

				return new Object[] { pn2f, flow, prevNode, process, inFlow, event, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_1_1_greenBFB(Flow flow, CSP csp) {
		UCCondition state = SimpleUseCaseFactory.eINSTANCE.createUCCondition();
		Object _localVariable_0 = csp.getValue("state", "name");
		flow.setFinalState(state);
		String state_name_prime = (String) _localVariable_0;
		state.setName(state_name_prime);
		return new Object[] { flow, state, csp };
	}

	public static final Object[] pattern_TerminationFirst_1_2_blackBBB(SequenceFlow inFlow, EndEvent event,
			UCCondition state) {
		return new Object[] { inFlow, event, state };
	}

	public static final Object[] pattern_TerminationFirst_1_2_greenFBBB(SequenceFlow inFlow, EndEvent event,
			UCCondition state) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(inFlow);
		ruleresult.getTranslatedElements().add(event);
		ruleresult.getCreatedElements().add(state);
		return new Object[] { ruleresult, inFlow, event, state };
	}

	public static final Object[] pattern_TerminationFirst_1_3_blackBBBBBBBB(PerformRuleResult ruleresult, EObject pn2f,
			EObject flow, EObject prevNode, EObject process, EObject inFlow, EObject event, EObject state) {
		if (!pn2f.equals(prevNode)) {
			if (!pn2f.equals(process)) {
				if (!pn2f.equals(state)) {
					if (!flow.equals(pn2f)) {
						if (!flow.equals(prevNode)) {
							if (!flow.equals(process)) {
								if (!flow.equals(inFlow)) {
									if (!flow.equals(state)) {
										if (!prevNode.equals(process)) {
											if (!prevNode.equals(state)) {
												if (!process.equals(state)) {
													if (!inFlow.equals(pn2f)) {
														if (!inFlow.equals(prevNode)) {
															if (!inFlow.equals(process)) {
																if (!inFlow.equals(state)) {
																	if (!event.equals(pn2f)) {
																		if (!event.equals(flow)) {
																			if (!event.equals(prevNode)) {
																				if (!event.equals(process)) {
																					if (!event.equals(inFlow)) {
																						if (!event.equals(state)) {
																							return new Object[] {
																									ruleresult, pn2f,
																									flow, prevNode,
																									process, inFlow,
																									event, state };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TerminationFirst_1_3_greenBBBBBBBFFFFFFF(PerformRuleResult ruleresult,
			EObject flow, EObject prevNode, EObject process, EObject inFlow, EObject event, EObject state) {
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TerminationFirst";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String flow__state____finalState_name_prime = "finalState";
		String inFlow__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__inFlow____outgoing_name_prime = "outgoing";
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(process__inFlow____flowElements);
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		ruleresult.getTranslatedEdges().add(process__event____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		ruleresult.getTranslatedEdges().add(inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(event__inFlow____incoming);
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		ruleresult.getCreatedEdges().add(flow__state____finalState);
		inFlow__prevNode____sourceRef.setSrc(inFlow);
		inFlow__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(inFlow__prevNode____sourceRef);
		prevNode__inFlow____outgoing.setSrc(prevNode);
		prevNode__inFlow____outgoing.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(prevNode__inFlow____outgoing);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		inFlow__prevNode____sourceRef.setName(inFlow__prevNode____sourceRef_name_prime);
		prevNode__inFlow____outgoing.setName(prevNode__inFlow____outgoing_name_prime);
		return new Object[] { ruleresult, flow, prevNode, process, inFlow, event, state,
				process__inFlow____flowElements, process__event____flowElements, inFlow__event____targetRef,
				event__inFlow____incoming, flow__state____finalState, inFlow__prevNode____sourceRef,
				prevNode__inFlow____outgoing };
	}

	public static final void pattern_TerminationFirst_1_5_expressionBBBBBBBBB(TerminationFirst _this,
			PerformRuleResult ruleresult, EObject pn2f, EObject flow, EObject prevNode, EObject process, EObject inFlow,
			EObject event, EObject state) {
		_this.registerObjects_FWD(ruleresult, pn2f, flow, prevNode, process, inFlow, event, state);

	}

	public static final PerformRuleResult pattern_TerminationFirst_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_2_1_bindingFB(TerminationFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_2_1_blackFBB(EClass eClass, TerminationFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_2_1_bindingAndBlackFFB(TerminationFirst _this) {
		Object[] result_pattern_TerminationFirst_2_1_binding = pattern_TerminationFirst_2_1_bindingFB(_this);
		if (result_pattern_TerminationFirst_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_TerminationFirst_2_1_binding[0];

			Object[] result_pattern_TerminationFirst_2_1_black = pattern_TerminationFirst_2_1_blackFBB(eClass, _this);
			if (result_pattern_TerminationFirst_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TerminationFirst_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "TerminationFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TerminationFirst_2_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("inFlow");
		EObject _localVariable_3 = match.getObject("event");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpInFlow = _localVariable_2;
		EObject tmpEvent = _localVariable_3;
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpInFlow instanceof SequenceFlow) {
					SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
					if (tmpEvent instanceof EndEvent) {
						EndEvent event = (EndEvent) tmpEvent;
						return new Object[] { prevNode, process, inFlow, event, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_2_2_blackFFBBBBB(FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!event.equals(prevNode)) {
			for (FN2F pn2f : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode, FN2F.class,
					"source")) {
				Flow flow = pn2f.getTarget();
				if (flow != null) {
					_result.add(new Object[] { pn2f, flow, prevNode, process, inFlow, event, match });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_2_3_black_nac_0B(Flow flow) {
		for (Step otherStep : flow.getSteps()) {
			return new Object[] { flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_2_3_blackBBBBBB(FN2F pn2f, Flow flow,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!event.equals(prevNode)) {
			if (prevNode.equals(pn2f.getSource())) {
				if (flow.equals(pn2f.getTarget())) {
					if (process.getFlowElements().contains(inFlow)) {
						if (process.getFlowElements().contains(event)) {
							if (process.getFlowElements().contains(prevNode)) {
								if (event.equals(inFlow.getTargetRef())) {
									if (prevNode.equals(inFlow.getSourceRef())) {
										if (pattern_TerminationFirst_2_3_black_nac_0B(flow) == null) {
											_result.add(new Object[] { pn2f, flow, prevNode, process, inFlow, event });
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

	public static final Object[] pattern_TerminationFirst_2_3_greenBBBBBBFFFFFFFFFF(FN2F pn2f, Flow flow,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pn2f__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pn2f__prevNode____source_name_prime = "source";
		String pn2f__flow____target_name_prime = "target";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String inFlow__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__inFlow____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(pn2f);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(event);
		pn2f__prevNode____source.setSrc(pn2f);
		pn2f__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2f__prevNode____source);
		pn2f__flow____target.setSrc(pn2f);
		pn2f__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(pn2f__flow____target);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(process__inFlow____flowElements);
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		isApplicableMatch.getAllContextElements().add(process__event____flowElements);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		isApplicableMatch.getAllContextElements().add(inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(event__inFlow____incoming);
		inFlow__prevNode____sourceRef.setSrc(inFlow);
		inFlow__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(inFlow__prevNode____sourceRef);
		prevNode__inFlow____outgoing.setSrc(prevNode);
		prevNode__inFlow____outgoing.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(prevNode__inFlow____outgoing);
		pn2f__prevNode____source.setName(pn2f__prevNode____source_name_prime);
		pn2f__flow____target.setName(pn2f__flow____target_name_prime);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		inFlow__prevNode____sourceRef.setName(inFlow__prevNode____sourceRef_name_prime);
		prevNode__inFlow____outgoing.setName(prevNode__inFlow____outgoing_name_prime);
		return new Object[] { pn2f, flow, prevNode, process, inFlow, event, isApplicableMatch, pn2f__prevNode____source,
				pn2f__flow____target, process__inFlow____flowElements, process__event____flowElements,
				process__prevNode____flowElements, inFlow__event____targetRef, event__inFlow____incoming,
				inFlow__prevNode____sourceRef, prevNode__inFlow____outgoing };
	}

	public static final Object[] pattern_TerminationFirst_2_4_bindingFBBBBBBBB(TerminationFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pn2f, Flow flow, FlowNode prevNode, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pn2f, flow, prevNode, process, inFlow,
				event);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pn2f, flow, prevNode, process, inFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TerminationFirst_2_4_bindingAndBlackFBBBBBBBB(TerminationFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pn2f, Flow flow, FlowNode prevNode, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {
		Object[] result_pattern_TerminationFirst_2_4_binding = pattern_TerminationFirst_2_4_bindingFBBBBBBBB(_this,
				isApplicableMatch, pn2f, flow, prevNode, process, inFlow, event);
		if (result_pattern_TerminationFirst_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_TerminationFirst_2_4_binding[0];

			Object[] result_pattern_TerminationFirst_2_4_black = pattern_TerminationFirst_2_4_blackB(csp);
			if (result_pattern_TerminationFirst_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pn2f, flow, prevNode, process, inFlow, event };
			}
		}
		return null;
	}

	public static final boolean pattern_TerminationFirst_2_5_expressionFBB(TerminationFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TerminationFirst_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TerminationFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TerminationFirst_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_10_1_blackBBBB(TerminationFirst _this, Match match, Flow flow,
			UCCondition state) {
		return new Object[] { _this, match, flow, state };
	}

	public static final Object[] pattern_TerminationFirst_10_2_bindingFBBBB(TerminationFirst _this, Match match,
			Flow flow, UCCondition state) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, flow, state);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flow, state };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TerminationFirst_10_2_bindingAndBlackFBBBB(TerminationFirst _this, Match match,
			Flow flow, UCCondition state) {
		Object[] result_pattern_TerminationFirst_10_2_binding = pattern_TerminationFirst_10_2_bindingFBBBB(_this, match,
				flow, state);
		if (result_pattern_TerminationFirst_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_TerminationFirst_10_2_binding[0];

			Object[] result_pattern_TerminationFirst_10_2_black = pattern_TerminationFirst_10_2_blackB(csp);
			if (result_pattern_TerminationFirst_10_2_black != null) {

				return new Object[] { csp, _this, match, flow, state };
			}
		}
		return null;
	}

	public static final boolean pattern_TerminationFirst_10_3_expressionFBB(TerminationFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_10_4_blackBBB(Match match, Flow flow, UCCondition state) {
		return new Object[] { match, flow, state };
	}

	public static final Object[] pattern_TerminationFirst_10_4_greenBBBF(Match match, Flow flow, UCCondition state) {
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(state);
		String flow__state____finalState_name_prime = "finalState";
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		match.getToBeTranslatedEdges().add(flow__state____finalState);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		return new Object[] { match, flow, state, flow__state____finalState };
	}

	public static final Object[] pattern_TerminationFirst_10_5_blackBBB(Match match, Flow flow, UCCondition state) {
		return new Object[] { match, flow, state };
	}

	public static final Object[] pattern_TerminationFirst_10_5_greenBB(Match match, Flow flow) {
		match.getContextNodes().add(flow);
		return new Object[] { match, flow };
	}

	public static final void pattern_TerminationFirst_10_6_expressionBBBB(TerminationFirst _this, Match match,
			Flow flow, UCCondition state) {
		_this.registerObjectsToMatch_BWD(match, flow, state);

	}

	public static final boolean pattern_TerminationFirst_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TerminationFirst_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_11_1_bindingFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pn2f");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("state");
		EObject tmpPn2f = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpState = _localVariable_4;
		if (tmpPn2f instanceof FN2F) {
			FN2F pn2f = (FN2F) tmpPn2f;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpPrevNode instanceof FlowNode) {
					FlowNode prevNode = (FlowNode) tmpPrevNode;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpState instanceof UCCondition) {
							UCCondition state = (UCCondition) tmpState;
							return new Object[] { pn2f, flow, prevNode, process, state, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_11_1_blackBBBBBBFB(FN2F pn2f, Flow flow, FlowNode prevNode,
			SimpleBPMN.Process process, UCCondition state, TerminationFirst _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pn2f, flow, prevNode, process, state, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_11_1_bindingAndBlackFFFFFBFB(TerminationFirst _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TerminationFirst_11_1_binding = pattern_TerminationFirst_11_1_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_TerminationFirst_11_1_binding != null) {
			FN2F pn2f = (FN2F) result_pattern_TerminationFirst_11_1_binding[0];
			Flow flow = (Flow) result_pattern_TerminationFirst_11_1_binding[1];
			FlowNode prevNode = (FlowNode) result_pattern_TerminationFirst_11_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_TerminationFirst_11_1_binding[3];
			UCCondition state = (UCCondition) result_pattern_TerminationFirst_11_1_binding[4];

			Object[] result_pattern_TerminationFirst_11_1_black = pattern_TerminationFirst_11_1_blackBBBBBBFB(pn2f,
					flow, prevNode, process, state, _this, isApplicableMatch);
			if (result_pattern_TerminationFirst_11_1_black != null) {
				CSP csp = (CSP) result_pattern_TerminationFirst_11_1_black[6];

				return new Object[] { pn2f, flow, prevNode, process, state, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_11_1_greenBBFFB(FlowNode prevNode, SimpleBPMN.Process process,
			CSP csp) {
		SequenceFlow inFlow = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		EndEvent event = SimpleBPMNFactory.eINSTANCE.createEndEvent();
		Object _localVariable_0 = csp.getValue("event", "id");
		process.getFlowElements().add(inFlow);
		inFlow.setSourceRef(prevNode);
		process.getFlowElements().add(event);
		inFlow.setTargetRef(event);
		String event_id_prime = (String) _localVariable_0;
		event.setId(event_id_prime);
		return new Object[] { prevNode, process, inFlow, event, csp };
	}

	public static final Object[] pattern_TerminationFirst_11_2_blackBBB(SequenceFlow inFlow, EndEvent event,
			UCCondition state) {
		return new Object[] { inFlow, event, state };
	}

	public static final Object[] pattern_TerminationFirst_11_2_greenFBBB(SequenceFlow inFlow, EndEvent event,
			UCCondition state) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(inFlow);
		ruleresult.getCreatedElements().add(event);
		ruleresult.getTranslatedElements().add(state);
		return new Object[] { ruleresult, inFlow, event, state };
	}

	public static final Object[] pattern_TerminationFirst_11_3_blackBBBBBBBB(PerformRuleResult ruleresult, EObject pn2f,
			EObject flow, EObject prevNode, EObject process, EObject inFlow, EObject event, EObject state) {
		if (!pn2f.equals(prevNode)) {
			if (!pn2f.equals(process)) {
				if (!pn2f.equals(state)) {
					if (!flow.equals(pn2f)) {
						if (!flow.equals(prevNode)) {
							if (!flow.equals(process)) {
								if (!flow.equals(inFlow)) {
									if (!flow.equals(state)) {
										if (!prevNode.equals(process)) {
											if (!prevNode.equals(state)) {
												if (!process.equals(state)) {
													if (!inFlow.equals(pn2f)) {
														if (!inFlow.equals(prevNode)) {
															if (!inFlow.equals(process)) {
																if (!inFlow.equals(state)) {
																	if (!event.equals(pn2f)) {
																		if (!event.equals(flow)) {
																			if (!event.equals(prevNode)) {
																				if (!event.equals(process)) {
																					if (!event.equals(inFlow)) {
																						if (!event.equals(state)) {
																							return new Object[] {
																									ruleresult, pn2f,
																									flow, prevNode,
																									process, inFlow,
																									event, state };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TerminationFirst_11_3_greenBBBBBBBFFFFFFF(PerformRuleResult ruleresult,
			EObject flow, EObject prevNode, EObject process, EObject inFlow, EObject event, EObject state) {
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TerminationFirst";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String flow__state____finalState_name_prime = "finalState";
		String inFlow__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__inFlow____outgoing_name_prime = "outgoing";
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(process__inFlow____flowElements);
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		ruleresult.getCreatedEdges().add(process__event____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		ruleresult.getCreatedEdges().add(inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(event__inFlow____incoming);
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		ruleresult.getTranslatedEdges().add(flow__state____finalState);
		inFlow__prevNode____sourceRef.setSrc(inFlow);
		inFlow__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(inFlow__prevNode____sourceRef);
		prevNode__inFlow____outgoing.setSrc(prevNode);
		prevNode__inFlow____outgoing.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(prevNode__inFlow____outgoing);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		inFlow__prevNode____sourceRef.setName(inFlow__prevNode____sourceRef_name_prime);
		prevNode__inFlow____outgoing.setName(prevNode__inFlow____outgoing_name_prime);
		return new Object[] { ruleresult, flow, prevNode, process, inFlow, event, state,
				process__inFlow____flowElements, process__event____flowElements, inFlow__event____targetRef,
				event__inFlow____incoming, flow__state____finalState, inFlow__prevNode____sourceRef,
				prevNode__inFlow____outgoing };
	}

	public static final void pattern_TerminationFirst_11_5_expressionBBBBBBBBB(TerminationFirst _this,
			PerformRuleResult ruleresult, EObject pn2f, EObject flow, EObject prevNode, EObject process, EObject inFlow,
			EObject event, EObject state) {
		_this.registerObjects_BWD(ruleresult, pn2f, flow, prevNode, process, inFlow, event, state);

	}

	public static final PerformRuleResult pattern_TerminationFirst_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_12_1_bindingFB(TerminationFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_12_1_blackFBB(EClass eClass, TerminationFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_12_1_bindingAndBlackFFB(TerminationFirst _this) {
		Object[] result_pattern_TerminationFirst_12_1_binding = pattern_TerminationFirst_12_1_bindingFB(_this);
		if (result_pattern_TerminationFirst_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_TerminationFirst_12_1_binding[0];

			Object[] result_pattern_TerminationFirst_12_1_black = pattern_TerminationFirst_12_1_blackFBB(eClass, _this);
			if (result_pattern_TerminationFirst_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TerminationFirst_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "TerminationFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TerminationFirst_12_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("flow");
		EObject _localVariable_1 = match.getObject("state");
		EObject tmpFlow = _localVariable_0;
		EObject tmpState = _localVariable_1;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpState instanceof UCCondition) {
				UCCondition state = (UCCondition) tmpState;
				return new Object[] { flow, state, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_12_2_blackFBFBB(Flow flow, UCCondition state,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (FN2F pn2f : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow, FN2F.class,
				"target")) {
			FlowNode prevNode = pn2f.getSource();
			if (prevNode != null) {
				_result.add(new Object[] { pn2f, flow, prevNode, state, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_12_3_blackBBBFB(FN2F pn2f, Flow flow,
			FlowNode prevNode, UCCondition state) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(pn2f.getSource())) {
			if (flow.equals(pn2f.getTarget())) {
				if (state.equals(flow.getFinalState())) {
					for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class, "flowElements")) {
						_result.add(new Object[] { pn2f, flow, prevNode, process, state });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_12_3_greenBBBBBFFFFF(FN2F pn2f, Flow flow, FlowNode prevNode,
			SimpleBPMN.Process process, UCCondition state) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pn2f__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pn2f__prevNode____source_name_prime = "source";
		String pn2f__flow____target_name_prime = "target";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String flow__state____finalState_name_prime = "finalState";
		isApplicableMatch.getAllContextElements().add(pn2f);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(state);
		pn2f__prevNode____source.setSrc(pn2f);
		pn2f__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2f__prevNode____source);
		pn2f__flow____target.setSrc(pn2f);
		pn2f__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(pn2f__flow____target);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		isApplicableMatch.getAllContextElements().add(flow__state____finalState);
		pn2f__prevNode____source.setName(pn2f__prevNode____source_name_prime);
		pn2f__flow____target.setName(pn2f__flow____target_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		return new Object[] { pn2f, flow, prevNode, process, state, isApplicableMatch, pn2f__prevNode____source,
				pn2f__flow____target, process__prevNode____flowElements, flow__state____finalState };
	}

	public static final Object[] pattern_TerminationFirst_12_4_bindingFBBBBBBB(TerminationFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pn2f, Flow flow, FlowNode prevNode, SimpleBPMN.Process process,
			UCCondition state) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pn2f, flow, prevNode, process, state);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pn2f, flow, prevNode, process, state };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TerminationFirst_12_4_bindingAndBlackFBBBBBBB(TerminationFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pn2f, Flow flow, FlowNode prevNode, SimpleBPMN.Process process,
			UCCondition state) {
		Object[] result_pattern_TerminationFirst_12_4_binding = pattern_TerminationFirst_12_4_bindingFBBBBBBB(_this,
				isApplicableMatch, pn2f, flow, prevNode, process, state);
		if (result_pattern_TerminationFirst_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_TerminationFirst_12_4_binding[0];

			Object[] result_pattern_TerminationFirst_12_4_black = pattern_TerminationFirst_12_4_blackB(csp);
			if (result_pattern_TerminationFirst_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pn2f, flow, prevNode, process, state };
			}
		}
		return null;
	}

	public static final boolean pattern_TerminationFirst_12_5_expressionFBB(TerminationFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TerminationFirst_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TerminationFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TerminationFirst_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_20_1_bindingFB(TerminationFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_20_1_blackFBB(EClass __eClass, TerminationFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_20_1_bindingAndBlackFFB(TerminationFirst _this) {
		Object[] result_pattern_TerminationFirst_20_1_binding = pattern_TerminationFirst_20_1_bindingFB(_this);
		if (result_pattern_TerminationFirst_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_TerminationFirst_20_1_binding[0];

			Object[] result_pattern_TerminationFirst_20_1_black = pattern_TerminationFirst_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_TerminationFirst_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TerminationFirst_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TerminationFirst_20_2_black_nac_0BB(SequenceFlow inFlow, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_221211 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_221211)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_20_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_918197 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_918197)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_20_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_244997 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_244997)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_20_2_blackFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpInFlow = _edge_flowElements.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (process.getFlowElements().contains(inFlow)) {
					FlowNode tmpEvent = inFlow.getTargetRef();
					if (tmpEvent instanceof EndEvent) {
						EndEvent event = (EndEvent) tmpEvent;
						if (process.getFlowElements().contains(event)) {
							FlowNode prevNode = inFlow.getSourceRef();
							if (prevNode != null) {
								if (!event.equals(prevNode)) {
									if (process.getFlowElements().contains(prevNode)) {
										if (pattern_TerminationFirst_20_2_black_nac_1BB(inFlow, process) == null) {
											if (pattern_TerminationFirst_20_2_black_nac_2BB(event, process) == null) {
												if (pattern_TerminationFirst_20_2_black_nac_0BB(inFlow,
														prevNode) == null) {
													_result.add(new Object[] { prevNode, process, inFlow, event,
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

		return _result;
	}

	public static final Object[] pattern_TerminationFirst_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TerminationFirst_20_3_expressionFBBBBBB(TerminationFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TerminationFirst_20_4_expressionFBB(TerminationFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_TerminationFirst_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_TerminationFirst_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_21_1_bindingFB(TerminationFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_21_1_blackFBB(EClass __eClass, TerminationFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_21_1_bindingAndBlackFFB(TerminationFirst _this) {
		Object[] result_pattern_TerminationFirst_21_1_binding = pattern_TerminationFirst_21_1_bindingFB(_this);
		if (result_pattern_TerminationFirst_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_TerminationFirst_21_1_binding[0];

			Object[] result_pattern_TerminationFirst_21_1_black = pattern_TerminationFirst_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_TerminationFirst_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TerminationFirst_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TerminationFirst_21_2_black_nac_0BB(SequenceFlow inFlow, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_397062 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_397062)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_21_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_382054 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_382054)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_21_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_130383 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_130383)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_21_2_blackFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpEvent = _edge_flowElements.getTrg();
			if (tmpEvent instanceof EndEvent) {
				EndEvent event = (EndEvent) tmpEvent;
				if (process.getFlowElements().contains(event)) {
					if (pattern_TerminationFirst_21_2_black_nac_2BB(event, process) == null) {
						for (FlowElement tmpInFlow : process.getFlowElements()) {
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (event.equals(inFlow.getTargetRef())) {
									FlowNode prevNode = inFlow.getSourceRef();
									if (prevNode != null) {
										if (!event.equals(prevNode)) {
											if (process.getFlowElements().contains(prevNode)) {
												if (pattern_TerminationFirst_21_2_black_nac_1BB(inFlow,
														process) == null) {
													if (pattern_TerminationFirst_21_2_black_nac_0BB(inFlow,
															prevNode) == null) {
														_result.add(new Object[] { prevNode, process, inFlow, event,
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

		return _result;
	}

	public static final Object[] pattern_TerminationFirst_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TerminationFirst_21_3_expressionFBBBBBB(TerminationFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TerminationFirst_21_4_expressionFBB(TerminationFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_TerminationFirst_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_TerminationFirst_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_22_1_bindingFB(TerminationFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_22_1_blackFBB(EClass __eClass, TerminationFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_22_1_bindingAndBlackFFB(TerminationFirst _this) {
		Object[] result_pattern_TerminationFirst_22_1_binding = pattern_TerminationFirst_22_1_bindingFB(_this);
		if (result_pattern_TerminationFirst_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_TerminationFirst_22_1_binding[0];

			Object[] result_pattern_TerminationFirst_22_1_black = pattern_TerminationFirst_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_TerminationFirst_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TerminationFirst_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TerminationFirst_22_2_black_nac_0BB(SequenceFlow inFlow, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_739691 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_739691)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_22_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_387026 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_387026)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_22_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_538679 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_538679)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_22_2_blackFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpEvent = _edge_targetRef.getTrg();
			if (tmpEvent instanceof EndEvent) {
				EndEvent event = (EndEvent) tmpEvent;
				if (event.equals(inFlow.getTargetRef())) {
					FlowNode prevNode = inFlow.getSourceRef();
					if (prevNode != null) {
						if (!event.equals(prevNode)) {
							if (pattern_TerminationFirst_22_2_black_nac_0BB(inFlow, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(event)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (pattern_TerminationFirst_22_2_black_nac_1BB(inFlow, process) == null) {
												if (pattern_TerminationFirst_22_2_black_nac_2BB(event,
														process) == null) {
													_result.add(new Object[] { prevNode, process, inFlow, event,
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

		return _result;
	}

	public static final Object[] pattern_TerminationFirst_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TerminationFirst_22_3_expressionFBBBBBB(TerminationFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TerminationFirst_22_4_expressionFBB(TerminationFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_TerminationFirst_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_TerminationFirst_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_23_1_bindingFB(TerminationFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_23_1_blackFBB(EClass __eClass, TerminationFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_23_1_bindingAndBlackFFB(TerminationFirst _this) {
		Object[] result_pattern_TerminationFirst_23_1_binding = pattern_TerminationFirst_23_1_bindingFB(_this);
		if (result_pattern_TerminationFirst_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_TerminationFirst_23_1_binding[0];

			Object[] result_pattern_TerminationFirst_23_1_black = pattern_TerminationFirst_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_TerminationFirst_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TerminationFirst_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TerminationFirst_23_2_black_nac_0BB(SequenceFlow inFlow, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_913404 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_913404)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_23_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_318552 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_318552)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_23_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_434285 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_434285)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_23_2_blackFFFFB(EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEvent = _edge_incoming.getSrc();
		if (tmpEvent instanceof EndEvent) {
			EndEvent event = (EndEvent) tmpEvent;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (event.equals(inFlow.getTargetRef())) {
					FlowNode prevNode = inFlow.getSourceRef();
					if (prevNode != null) {
						if (!event.equals(prevNode)) {
							if (pattern_TerminationFirst_23_2_black_nac_0BB(inFlow, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(inFlow)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (pattern_TerminationFirst_23_2_black_nac_1BB(inFlow, process) == null) {
												if (pattern_TerminationFirst_23_2_black_nac_2BB(event,
														process) == null) {
													_result.add(new Object[] { prevNode, process, inFlow, event,
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

		return _result;
	}

	public static final Object[] pattern_TerminationFirst_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TerminationFirst_23_3_expressionFBBBBBB(TerminationFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TerminationFirst_23_4_expressionFBB(TerminationFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_TerminationFirst_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_TerminationFirst_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_24_1_bindingFB(TerminationFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_24_1_blackFBB(EClass __eClass, TerminationFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_24_1_bindingAndBlackFFB(TerminationFirst _this) {
		Object[] result_pattern_TerminationFirst_24_1_binding = pattern_TerminationFirst_24_1_bindingFB(_this);
		if (result_pattern_TerminationFirst_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_TerminationFirst_24_1_binding[0];

			Object[] result_pattern_TerminationFirst_24_1_black = pattern_TerminationFirst_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_TerminationFirst_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TerminationFirst_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TerminationFirst_24_2_black_nac_0B(UCCondition state) {
		for (UseCase __DEC_state_precondition_933354 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, UseCase.class, "precondition")) {
			return new Object[] { state };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_24_2_black_nac_1BB(UCCondition state, Flow flow) {
		for (Flow __DEC_state_finalState_23698 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_state_finalState_23698)) {
				return new Object[] { state, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_24_2_black_nac_2B(UCCondition state) {
		for (Step __DEC_state___last_469168 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(state,
				Step.class, "__last")) {
			return new Object[] { state };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_24_2_blackFFB(EMoflonEdge _edge_finalState) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_finalState.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpState = _edge_finalState.getTrg();
			if (tmpState instanceof UCCondition) {
				UCCondition state = (UCCondition) tmpState;
				if (state.equals(flow.getFinalState())) {
					if (pattern_TerminationFirst_24_2_black_nac_0B(state) == null) {
						if (pattern_TerminationFirst_24_2_black_nac_1BB(state, flow) == null) {
							if (pattern_TerminationFirst_24_2_black_nac_2B(state) == null) {
								_result.add(new Object[] { flow, state, _edge_finalState });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TerminationFirst_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TerminationFirst_24_3_expressionFBBBB(TerminationFirst _this, Match match,
			Flow flow, UCCondition state) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow, state);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TerminationFirst_24_4_expressionFBB(TerminationFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_TerminationFirst_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_TerminationFirst_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_25_1_bindingFB(TerminationFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_25_1_blackFBB(EClass __eClass, TerminationFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_25_1_bindingAndBlackFFB(TerminationFirst _this) {
		Object[] result_pattern_TerminationFirst_25_1_binding = pattern_TerminationFirst_25_1_bindingFB(_this);
		if (result_pattern_TerminationFirst_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_TerminationFirst_25_1_binding[0];

			Object[] result_pattern_TerminationFirst_25_1_black = pattern_TerminationFirst_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_TerminationFirst_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TerminationFirst_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TerminationFirst_25_2_black_nac_0BB(SequenceFlow inFlow, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_872840 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_872840)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_25_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_745382 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_745382)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_25_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_65364 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_65364)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_25_2_blackFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_sourceRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (prevNode.equals(inFlow.getSourceRef())) {
					FlowNode tmpEvent = inFlow.getTargetRef();
					if (tmpEvent instanceof EndEvent) {
						EndEvent event = (EndEvent) tmpEvent;
						if (!event.equals(prevNode)) {
							if (pattern_TerminationFirst_25_2_black_nac_0BB(inFlow, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(event)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (pattern_TerminationFirst_25_2_black_nac_1BB(inFlow, process) == null) {
												if (pattern_TerminationFirst_25_2_black_nac_2BB(event,
														process) == null) {
													_result.add(new Object[] { prevNode, process, inFlow, event,
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

		return _result;
	}

	public static final Object[] pattern_TerminationFirst_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TerminationFirst_25_3_expressionFBBBBBB(TerminationFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TerminationFirst_25_4_expressionFBB(TerminationFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_TerminationFirst_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_TerminationFirst_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_26_1_bindingFB(TerminationFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_26_1_blackFBB(EClass __eClass, TerminationFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_26_1_bindingAndBlackFFB(TerminationFirst _this) {
		Object[] result_pattern_TerminationFirst_26_1_binding = pattern_TerminationFirst_26_1_bindingFB(_this);
		if (result_pattern_TerminationFirst_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_TerminationFirst_26_1_binding[0];

			Object[] result_pattern_TerminationFirst_26_1_black = pattern_TerminationFirst_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_TerminationFirst_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TerminationFirst_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TerminationFirst_26_2_black_nac_0BB(SequenceFlow inFlow, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_588910 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_588910)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_26_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_107713 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_107713)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_TerminationFirst_26_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_900133 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_900133)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TerminationFirst_26_2_blackFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			EObject tmpInFlow = _edge_outgoing.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (prevNode.equals(inFlow.getSourceRef())) {
					FlowNode tmpEvent = inFlow.getTargetRef();
					if (tmpEvent instanceof EndEvent) {
						EndEvent event = (EndEvent) tmpEvent;
						if (!event.equals(prevNode)) {
							if (pattern_TerminationFirst_26_2_black_nac_0BB(inFlow, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
												"flowElements")) {
									if (process.getFlowElements().contains(inFlow)) {
										if (process.getFlowElements().contains(event)) {
											if (pattern_TerminationFirst_26_2_black_nac_1BB(inFlow, process) == null) {
												if (pattern_TerminationFirst_26_2_black_nac_2BB(event,
														process) == null) {
													_result.add(new Object[] { prevNode, process, inFlow, event,
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

		return _result;
	}

	public static final Object[] pattern_TerminationFirst_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TerminationFirst_26_3_expressionFBBBBBB(TerminationFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TerminationFirst_26_4_expressionFBB(TerminationFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TerminationFirst_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_TerminationFirst_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_TerminationFirst_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TerminationFirstImpl
