/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.EE2FS;

import Bpmn2UseCase.Rules.EndEvent2FinalStateFirst;
import Bpmn2UseCase.Rules.RulesPackage;

import Bpmn2UseCase.SF2F;

import SimpleBPMN.EndEvent;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;
import SimpleBPMN.StartEvent;

import SimpleUseCase.Flow;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.UCCondition;
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
 * An implementation of the model object '<em><b>End Event2 Final State First</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EndEvent2FinalStateFirstImpl extends AbstractRuleImpl implements EndEvent2FinalStateFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEvent2FinalStateFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEndEvent2FinalStateFirst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow inFlow,
			EndEvent event) {
		// initial bindings
		Object[] result1_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_0_1_blackBBBBBB(this,
				match, node, process, inFlow, event);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[node] = " + node + ", "
					+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_0_2_bindingAndBlackFBBBBBB(this, match, node, process, inFlow, event);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[node] = " + node + ", " + "[process] = " + process
					+ ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_0_4_blackBBBBB(match,
					node, process, inFlow, event);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[node] = " + node + ", " + "[process] = "
						+ process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
			}
			EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_0_4_greenBBBBFFF(match, process, inFlow,
					event);
					// EMoflonEdge process__event____flowElements = (EMoflonEdge) result4_green[4];
					// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result4_green[5];
					// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_0_5_blackBBBBB(match,
					node, process, inFlow, event);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[node] = " + node + ", " + "[process] = "
						+ process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
			}
			EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_0_5_greenBBBBFFFF(match, node, process,
					inFlow);
					// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[4];
					// EMoflonEdge process__node____flowElements = (EMoflonEdge) result5_green[5];
					// EMoflonEdge inFlow__node____sourceRef = (EMoflonEdge) result5_green[6];
					// EMoflonEdge node__inFlow____outgoing = (EMoflonEdge) result5_green[7];

			// register objects to match
			EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_0_6_expressionBBBBBB(this, match, node,
					process, inFlow, event);
			return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_0_7_expressionF();
		} else {
			return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_1_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Flow flow = (Flow) result1_bindingAndBlack[0];
		StartEvent node = (StartEvent) result1_bindingAndBlack[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[2];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[3];
		SF2F _if2f = (SF2F) result1_bindingAndBlack[4];
		EndEvent event = (EndEvent) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_1_1_greenBBFFB(flow,
				event, csp);
		UCCondition state = (UCCondition) result1_green[2];
		EE2FS _e2s = (EE2FS) result1_green[3];

		// collect translated elements
		Object[] result2_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_1_2_blackBBB(event,
				state, _e2s);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[event] = " + event + ", " + "[state] = " + state + ", " + "[_e2s] = " + _e2s + ".");
		}
		Object[] result2_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_1_2_greenFBBB(event,
				state, _e2s);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_1_3_blackBBBBBBBBB(
				ruleresult, flow, node, process, inFlow, _if2f, event, state, _e2s);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[flow] = " + flow + ", " + "[node] = " + node + ", "
					+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[_if2f] = " + _if2f + ", "
					+ "[event] = " + event + ", " + "[state] = " + state + ", " + "[_e2s] = " + _e2s + ".");
		}
		EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_1_3_greenBBBBBBBFFFFFF(ruleresult, flow, process,
				inFlow, event, state, _e2s);
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _e2s__event____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _e2s__state____target = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_1_5_expressionBBBBBBBBBB(this, ruleresult, flow,
				node, process, inFlow, _if2f, event, state, _e2s);
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		StartEvent node = (StartEvent) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[2];
		EndEvent event = (EndEvent) result2_binding[3];
		for (Object[] result2_black : EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_2_2_blackFBBBFBB(node, process, inFlow, event, match)) {
			Flow flow = (Flow) result2_black[0];
			SF2F _if2f = (SF2F) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : EndEvent2FinalStateFirstImpl
					.pattern_EndEvent2FinalStateFirst_2_3_blackBBBBBB(flow, node, process, inFlow, _if2f, event)) {
				Object[] result3_green = EndEvent2FinalStateFirstImpl
						.pattern_EndEvent2FinalStateFirst_2_3_greenBBBBBBFFFFFFFFFF(flow, node, process, inFlow, _if2f,
								event);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[9];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _if2f__inFlow____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge _if2f__flow____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlow__node____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge node__inFlow____outgoing = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = EndEvent2FinalStateFirstImpl
						.pattern_EndEvent2FinalStateFirst_2_4_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, flow,
								node, process, inFlow, _if2f, event);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[flow] = " + flow + ", " + "[node] = " + node + ", " + "[process] = " + process + ", "
							+ "[inFlow] = " + inFlow + ", " + "[_if2f] = " + _if2f + ", " + "[event] = " + event + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EndEvent2FinalStateFirstImpl
							.pattern_EndEvent2FinalStateFirst_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {
		match.registerObject("node", node);
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("event", event);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow inFlow,
			EndEvent event) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event) {// Create CSP
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
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("_if2f", _if2f);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject flow, EObject node, EObject process,
			EObject inFlow, EObject _if2f, EObject event, EObject state, EObject _e2s) {
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("_if2f", _if2f);
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("state", state);
		ruleresult.registerObject("_e2s", _e2s);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("event").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getEndEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Flow flow, UCCondition state) {
		// initial bindings
		Object[] result1_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_10_1_blackBBBB(this,
				match, flow, state);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[state] = " + state + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_10_2_bindingAndBlackFBBBB(this, match, flow, state);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[state] = " + state + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_10_4_blackBBB(match,
					flow, state);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[state] = " + state + ".");
			}
			EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_10_4_greenBBBF(match, flow, state);
			// EMoflonEdge flow__state____finalState = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_10_5_blackBBB(match,
					flow, state);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[flow] = " + flow + ", " + "[state] = " + state + ".");
			}
			EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_10_5_greenBB(match, flow);

			// register objects to match
			EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_10_6_expressionBBBB(this, match, flow, state);
			return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_10_7_expressionF();
		} else {
			return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_11_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Flow flow = (Flow) result1_bindingAndBlack[0];
		StartEvent node = (StartEvent) result1_bindingAndBlack[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[2];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[3];
		SF2F _if2f = (SF2F) result1_bindingAndBlack[4];
		UCCondition state = (UCCondition) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_11_1_greenBBFBFB(process,
				inFlow, state, csp);
		EndEvent event = (EndEvent) result1_green[2];
		EE2FS _e2s = (EE2FS) result1_green[4];

		// collect translated elements
		Object[] result2_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_11_2_blackBBB(event,
				state, _e2s);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[event] = " + event + ", " + "[state] = " + state + ", " + "[_e2s] = " + _e2s + ".");
		}
		Object[] result2_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_11_2_greenFBBB(event,
				state, _e2s);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_11_3_blackBBBBBBBBB(
				ruleresult, flow, node, process, inFlow, _if2f, event, state, _e2s);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[flow] = " + flow + ", " + "[node] = " + node + ", "
					+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[_if2f] = " + _if2f + ", "
					+ "[event] = " + event + ", " + "[state] = " + state + ", " + "[_e2s] = " + _e2s + ".");
		}
		EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_11_3_greenBBBBBBBFFFFFF(ruleresult, flow, process,
				inFlow, event, state, _e2s);
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _e2s__event____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _e2s__state____target = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_11_5_expressionBBBBBBBBBB(this, ruleresult, flow,
				node, process, inFlow, _if2f, event, state, _e2s);
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Flow flow = (Flow) result2_binding[0];
		UCCondition state = (UCCondition) result2_binding[1];
		for (Object[] result2_black : EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_12_2_blackBFFBB(flow, state, match)) {
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			SF2F _if2f = (SF2F) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : EndEvent2FinalStateFirstImpl
					.pattern_EndEvent2FinalStateFirst_12_3_blackBFFBBB(flow, inFlow, _if2f, state)) {
				StartEvent node = (StartEvent) result3_black[1];
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[2];
				Object[] result3_green = EndEvent2FinalStateFirstImpl
						.pattern_EndEvent2FinalStateFirst_12_3_greenBBBBBBFFFFFFFF(flow, node, process, inFlow, _if2f,
								state);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[9];
				// EMoflonEdge _if2f__inFlow____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _if2f__flow____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge inFlow__node____sourceRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge node__inFlow____outgoing = (EMoflonEdge) result3_green[13];

				// solve CSP
				Object[] result4_bindingAndBlack = EndEvent2FinalStateFirstImpl
						.pattern_EndEvent2FinalStateFirst_12_4_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, flow,
								node, process, inFlow, _if2f, state);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[flow] = " + flow + ", " + "[node] = " + node + ", " + "[process] = " + process + ", "
							+ "[inFlow] = " + inFlow + ", " + "[_if2f] = " + _if2f + ", " + "[state] = " + state + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EndEvent2FinalStateFirstImpl
							.pattern_EndEvent2FinalStateFirst_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_12_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, UCCondition state) {// Create CSP
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
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("_if2f", _if2f);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject flow, EObject node, EObject process,
			EObject inFlow, EObject _if2f, EObject event, EObject state, EObject _e2s) {
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("_if2f", _if2f);
		ruleresult.registerObject("event", event);
		ruleresult.registerObject("state", state);
		ruleresult.registerObject("_e2s", _e2s);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_313(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_20_2_blackFFFFB(_edge_flowElements)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateFirstImpl
					.pattern_EndEvent2FinalStateFirst_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_20_3_expressionFBBBBBB(this, match, node,
					process, inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateFirstImpl
							.pattern_EndEvent2FinalStateFirst_20_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_314(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_21_2_blackFFFFB(_edge_targetRef)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateFirstImpl
					.pattern_EndEvent2FinalStateFirst_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_21_3_expressionFBBBBBB(this, match, node,
					process, inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateFirstImpl
							.pattern_EndEvent2FinalStateFirst_21_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_315(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_22_2_blackFFFFB(_edge_incoming)) {
			StartEvent node = (StartEvent) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateFirstImpl
					.pattern_EndEvent2FinalStateFirst_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_22_3_expressionFBBBBBB(this, match, node,
					process, inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateFirstImpl
							.pattern_EndEvent2FinalStateFirst_22_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_102(EMoflonEdge _edge_finalState) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_23_2_blackFFB(_edge_finalState)) {
			Flow flow = (Flow) result2_black[0];
			UCCondition state = (UCCondition) result2_black[1];
			Object[] result2_green = EndEvent2FinalStateFirstImpl
					.pattern_EndEvent2FinalStateFirst_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_23_3_expressionFBBBB(this, match, flow,
					state)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateFirstImpl
							.pattern_EndEvent2FinalStateFirst_23_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_23_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EndEvent2FinalStateFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.StartEvent node = (SimpleBPMN.StartEvent) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForInFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("inFlow")).findAny();
		SimpleBPMN.SequenceFlow inFlow = (SimpleBPMN.SequenceFlow) matchForInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_if2f = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_if2f")).findAny();
		Bpmn2UseCase.SF2F _if2f = (Bpmn2UseCase.SF2F) matchFor_if2f.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEvent = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("event")).findAny();
		SimpleBPMN.EndEvent event = (SimpleBPMN.EndEvent) matchForEvent.get().getNode();

		Optional<TripleMatchNodeMapping> matchForState = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("state")).findAny();
		SimpleUseCase.UCCondition state = (SimpleUseCase.UCCondition) matchForState.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_e2s = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_e2s")).findAny();
		Bpmn2UseCase.EE2FS _e2s = (Bpmn2UseCase.EE2FS) matchFor_e2s.get().getNode();

		if (!(flow.is__empty() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("String");

		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state", true, csp);
		var_state_name.setValue(state.getName());
		var_state_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("EndEvent2FinalStateFirst");
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
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EndEvent2FinalStateFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.StartEvent node = (SimpleBPMN.StartEvent) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForInFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("inFlow")).findAny();
		SimpleBPMN.SequenceFlow inFlow = (SimpleBPMN.SequenceFlow) matchForInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_if2f = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_if2f")).findAny();
		Bpmn2UseCase.SF2F _if2f = (Bpmn2UseCase.SF2F) matchFor_if2f.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEvent = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("event")).findAny();
		SimpleBPMN.EndEvent event = (SimpleBPMN.EndEvent) matchForEvent.get().getNode();

		Optional<TripleMatchNodeMapping> matchForState = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("state")).findAny();
		SimpleUseCase.UCCondition state = (SimpleUseCase.UCCondition) matchForState.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_e2s = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_e2s")).findAny();
		Bpmn2UseCase.EE2FS _e2s = (Bpmn2UseCase.EE2FS) matchFor_e2s.get().getNode();

		if (!(flow.is__empty() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("String");

		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state", true, csp);
		var_state_name.setValue(state.getName());
		var_state_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("EndEvent2FinalStateFirst");
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
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_26_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_26_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_26_2_bindingFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		Flow flow = (Flow) result2_binding[0];
		StartEvent node = (StartEvent) result2_binding[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[2];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[3];
		EndEvent event = (EndEvent) result2_binding[4];
		UCCondition state = (UCCondition) result2_binding[5];
		for (Object[] result2_black : EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_26_2_blackBBBBFBBBB(
				flow, node, process, inFlow, event, state, sourceMatch, targetMatch)) {
			SF2F _if2f = (SF2F) result2_black[4];
			Object[] result2_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_26_2_greenBBBBBBBBFB(
					flow, node, process, inFlow, _if2f, event, state, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[8];

			// check csp
			Object[] result3_bindingAndBlack = EndEvent2FinalStateFirstImpl
					.pattern_EndEvent2FinalStateFirst_26_3_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, flow,
							node, process, inFlow, _if2f, event, state, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = EndEvent2FinalStateFirstImpl
						.pattern_EndEvent2FinalStateFirst_26_4_blackBB(result, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_26_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_26_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event, UCCondition state,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event.id", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("String");
		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state.name", true, csp);
		var_state_name.setValue(state.getName());
		var_state_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_event_id, var_state_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("_if2f", _if2f);
		isApplicableMatch.registerObject("event", event);
		isApplicableMatch.registerObject("state", state);
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
		Object[] result1_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_29_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_29_2_bindingAndBlackFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// Flow flow = (Flow) result2_bindingAndBlack[0];
		// StartEvent node = (StartEvent) result2_bindingAndBlack[1];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[2];
		// SequenceFlow inFlow = (SequenceFlow) result2_bindingAndBlack[3];
		// SF2F _if2f = (SF2F) result2_bindingAndBlack[4];
		EndEvent event = (EndEvent) result2_bindingAndBlack[5];
		UCCondition state = (UCCondition) result2_bindingAndBlack[6];
		Object[] result2_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_29_2_greenBBFF(event,
				state);
		PerformRuleResult result = (PerformRuleResult) result2_green[2];
		// EE2FS _e2s = (EE2FS) result2_green[3];

		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_29_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, SF2F _if2fParameter) {
		// create result
		Object[] result1_black = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_30_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_30_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EndEvent2FinalStateFirstImpl
				.pattern_EndEvent2FinalStateFirst_30_2_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList _if2fList = (RuleEntryList) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			SF2F _if2f = (SF2F) result2_black[2];
			SequenceFlow inFlow = (SequenceFlow) result2_black[3];
			StartEvent node = (StartEvent) result2_black[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[5];

			// solve CSP
			Object[] result3_bindingAndBlack = EndEvent2FinalStateFirstImpl
					.pattern_EndEvent2FinalStateFirst_30_3_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, flow, node,
							process, inFlow, _if2f, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[flow] = " + flow + ", "
						+ "[node] = " + node + ", " + "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", "
						+ "[_if2f] = " + _if2f + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_30_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = EndEvent2FinalStateFirstImpl
						.pattern_EndEvent2FinalStateFirst_30_5_blackBBBBB(flow, node, process, inFlow, _if2f);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EndEvent2FinalStateFirstImpl
							.pattern_EndEvent2FinalStateFirst_30_6_blackBBBBBB(flow, node, process, inFlow, _if2f,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[flow] = " + flow + ", " + "[node] = " + node + ", " + "[process] = " + process
								+ ", " + "[inFlow] = " + inFlow + ", " + "[_if2f] = " + _if2f + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_30_6_greenBBBFFFBB(flow, process,
							inFlow, ruleResult, csp);
					// EndEvent event = (EndEvent) result6_green[3];
					// UCCondition state = (UCCondition) result6_green[4];
					// EE2FS _e2s = (EE2FS) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateFirstImpl.pattern_EndEvent2FinalStateFirst_30_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event.id", csp);
		var_event_id.setType("String");
		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state.name", csp);
		var_state_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_event_id, var_state_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("_if2f", _if2f);
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
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_FWD((Match) arguments.get(0), (StartEvent) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(EndEvent) arguments.get(4));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_ENDEVENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (StartEvent) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(EndEvent) arguments.get(4));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_STARTEVENT_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (StartEvent) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(EndEvent) arguments.get(4));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOW_STARTEVENT_PROCESS_SEQUENCEFLOW_SF2F_ENDEVENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Flow) arguments.get(1),
					(StartEvent) arguments.get(2), (SimpleBPMN.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4), (SF2F) arguments.get(5), (EndEvent) arguments.get(6));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_BWD__MATCH_FLOW_UCCONDITION:
			return isAppropriate_BWD((Match) arguments.get(0), (Flow) arguments.get(1), (UCCondition) arguments.get(2));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_UCCONDITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Flow) arguments.get(1),
					(UCCondition) arguments.get(2));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_UCCONDITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Flow) arguments.get(1),
					(UCCondition) arguments.get(2));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOW_STARTEVENT_PROCESS_SEQUENCEFLOW_SF2F_UCCONDITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Flow) arguments.get(1),
					(StartEvent) arguments.get(2), (SimpleBPMN.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4), (SF2F) arguments.get(5), (UCCondition) arguments.get(6));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_313__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_313((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_314__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_314((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_315__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_315((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_102__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_102((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FLOW_STARTEVENT_PROCESS_SEQUENCEFLOW_SF2F_ENDEVENT_UCCONDITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (Flow) arguments.get(1),
					(StartEvent) arguments.get(2), (SimpleBPMN.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4), (SF2F) arguments.get(5), (EndEvent) arguments.get(6),
					(UCCondition) arguments.get(7), (Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F:
			return generateModel((RuleEntryContainer) arguments.get(0), (SF2F) arguments.get(1));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FLOW_STARTEVENT_PROCESS_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Flow) arguments.get(1),
					(StartEvent) arguments.get(2), (SimpleBPMN.Process) arguments.get(3),
					(SequenceFlow) arguments.get(4), (SF2F) arguments.get(5),
					(ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.END_EVENT2_FINAL_STATE_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_0_1_blackBBBBBB(EndEvent2FinalStateFirst _this,
			Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		return new Object[] { _this, match, node, process, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_0_2_bindingFBBBBBB(EndEvent2FinalStateFirst _this,
			Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, node, process, inFlow, event);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, node, process, inFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_0_2_bindingAndBlackFBBBBBB(
			EndEvent2FinalStateFirst _this, Match match, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {
		Object[] result_pattern_EndEvent2FinalStateFirst_0_2_binding = pattern_EndEvent2FinalStateFirst_0_2_bindingFBBBBBB(
				_this, match, node, process, inFlow, event);
		if (result_pattern_EndEvent2FinalStateFirst_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateFirst_0_2_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_0_2_black = pattern_EndEvent2FinalStateFirst_0_2_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateFirst_0_2_black != null) {

				return new Object[] { csp, _this, match, node, process, inFlow, event };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_0_3_expressionFBB(EndEvent2FinalStateFirst _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_0_4_blackBBBBB(Match match, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		return new Object[] { match, node, process, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_0_4_greenBBBBFFF(Match match,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(event);
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		match.getToBeTranslatedEdges().add(process__event____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		match.getToBeTranslatedEdges().add(inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		match.getToBeTranslatedEdges().add(event__inFlow____incoming);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		return new Object[] { match, process, inFlow, event, process__event____flowElements, inFlow__event____targetRef,
				event__inFlow____incoming };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_0_5_blackBBBBB(Match match, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		return new Object[] { match, node, process, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_0_5_greenBBBBFFFF(Match match, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow) {
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(node);
		match.getContextNodes().add(process);
		match.getContextNodes().add(inFlow);
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String inFlow__node____sourceRef_name_prime = "sourceRef";
		String node__inFlow____outgoing_name_prime = "outgoing";
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		match.getContextEdges().add(process__node____flowElements);
		inFlow__node____sourceRef.setSrc(inFlow);
		inFlow__node____sourceRef.setTrg(node);
		match.getContextEdges().add(inFlow__node____sourceRef);
		node__inFlow____outgoing.setSrc(node);
		node__inFlow____outgoing.setTrg(inFlow);
		match.getContextEdges().add(node__inFlow____outgoing);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		inFlow__node____sourceRef.setName(inFlow__node____sourceRef_name_prime);
		node__inFlow____outgoing.setName(node__inFlow____outgoing_name_prime);
		return new Object[] { match, node, process, inFlow, process__inFlow____flowElements,
				process__node____flowElements, inFlow__node____sourceRef, node__inFlow____outgoing };
	}

	public static final void pattern_EndEvent2FinalStateFirst_0_6_expressionBBBBBB(EndEvent2FinalStateFirst _this,
			Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		_this.registerObjectsToMatch_FWD(match, node, process, inFlow, event);

	}

	public static final boolean pattern_EndEvent2FinalStateFirst_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_1_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flow");
		EObject _localVariable_1 = isApplicableMatch.getObject("node");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("_if2f");
		EObject _localVariable_5 = isApplicableMatch.getObject("event");
		EObject tmpFlow = _localVariable_0;
		EObject tmpNode = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		EObject tmp_if2f = _localVariable_4;
		EObject tmpEvent = _localVariable_5;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpNode instanceof StartEvent) {
				StartEvent node = (StartEvent) tmpNode;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						if (tmp_if2f instanceof SF2F) {
							SF2F _if2f = (SF2F) tmp_if2f;
							if (tmpEvent instanceof EndEvent) {
								EndEvent event = (EndEvent) tmpEvent;
								return new Object[] { flow, node, process, inFlow, _if2f, event, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_1_1_blackBBBBBBBFB(Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event, EndEvent2FinalStateFirst _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { flow, node, process, inFlow, _if2f, event, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_1_1_bindingAndBlackFFFFFFBFB(
			EndEvent2FinalStateFirst _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EndEvent2FinalStateFirst_1_1_binding = pattern_EndEvent2FinalStateFirst_1_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EndEvent2FinalStateFirst_1_1_binding != null) {
			Flow flow = (Flow) result_pattern_EndEvent2FinalStateFirst_1_1_binding[0];
			StartEvent node = (StartEvent) result_pattern_EndEvent2FinalStateFirst_1_1_binding[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EndEvent2FinalStateFirst_1_1_binding[2];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEvent2FinalStateFirst_1_1_binding[3];
			SF2F _if2f = (SF2F) result_pattern_EndEvent2FinalStateFirst_1_1_binding[4];
			EndEvent event = (EndEvent) result_pattern_EndEvent2FinalStateFirst_1_1_binding[5];

			Object[] result_pattern_EndEvent2FinalStateFirst_1_1_black = pattern_EndEvent2FinalStateFirst_1_1_blackBBBBBBBFB(
					flow, node, process, inFlow, _if2f, event, _this, isApplicableMatch);
			if (result_pattern_EndEvent2FinalStateFirst_1_1_black != null) {
				CSP csp = (CSP) result_pattern_EndEvent2FinalStateFirst_1_1_black[7];

				return new Object[] { flow, node, process, inFlow, _if2f, event, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_1_1_greenBBFFB(Flow flow, EndEvent event, CSP csp) {
		UCCondition state = SimpleUseCaseFactory.eINSTANCE.createUCCondition();
		EE2FS _e2s = Bpmn2UseCaseFactory.eINSTANCE.createEE2FS();
		Object _localVariable_0 = csp.getValue("state", "name");
		flow.getFinalState().add(state);
		_e2s.setSource(event);
		_e2s.setTarget(state);
		String state_name_prime = (String) _localVariable_0;
		state.setName(state_name_prime);
		return new Object[] { flow, event, state, _e2s, csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_1_2_blackBBB(EndEvent event, UCCondition state,
			EE2FS _e2s) {
		return new Object[] { event, state, _e2s };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_1_2_greenFBBB(EndEvent event, UCCondition state,
			EE2FS _e2s) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(event);
		ruleresult.getCreatedElements().add(state);
		ruleresult.getCreatedLinkElements().add(_e2s);
		return new Object[] { ruleresult, event, state, _e2s };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_1_3_blackBBBBBBBBB(PerformRuleResult ruleresult,
			EObject flow, EObject node, EObject process, EObject inFlow, EObject _if2f, EObject event, EObject state,
			EObject _e2s) {
		if (!flow.equals(node)) {
			if (!flow.equals(process)) {
				if (!flow.equals(inFlow)) {
					if (!flow.equals(state)) {
						if (!node.equals(process)) {
							if (!node.equals(state)) {
								if (!process.equals(state)) {
									if (!inFlow.equals(node)) {
										if (!inFlow.equals(process)) {
											if (!inFlow.equals(state)) {
												if (!_if2f.equals(flow)) {
													if (!_if2f.equals(node)) {
														if (!_if2f.equals(process)) {
															if (!_if2f.equals(inFlow)) {
																if (!_if2f.equals(event)) {
																	if (!_if2f.equals(state)) {
																		if (!event.equals(flow)) {
																			if (!event.equals(node)) {
																				if (!event.equals(process)) {
																					if (!event.equals(inFlow)) {
																						if (!event.equals(state)) {
																							if (!_e2s.equals(flow)) {
																								if (!_e2s
																										.equals(node)) {
																									if (!_e2s.equals(
																											process)) {
																										if (!_e2s
																												.equals(inFlow)) {
																											if (!_e2s
																													.equals(_if2f)) {
																												if (!_e2s
																														.equals(event)) {
																													if (!_e2s
																															.equals(state)) {
																														return new Object[] {
																																ruleresult,
																																flow,
																																node,
																																process,
																																inFlow,
																																_if2f,
																																event,
																																state,
																																_e2s };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EndEvent2FinalStateFirst_1_3_greenBBBBBBBFFFFFF(PerformRuleResult ruleresult,
			EObject flow, EObject process, EObject inFlow, EObject event, EObject state, EObject _e2s) {
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _e2s__event____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _e2s__state____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EndEvent2FinalStateFirst";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String flow__state____finalState_name_prime = "finalState";
		String _e2s__event____source_name_prime = "source";
		String _e2s__state____target_name_prime = "target";
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
		_e2s__event____source.setSrc(_e2s);
		_e2s__event____source.setTrg(event);
		ruleresult.getCreatedEdges().add(_e2s__event____source);
		_e2s__state____target.setSrc(_e2s);
		_e2s__state____target.setTrg(state);
		ruleresult.getCreatedEdges().add(_e2s__state____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		_e2s__event____source.setName(_e2s__event____source_name_prime);
		_e2s__state____target.setName(_e2s__state____target_name_prime);
		return new Object[] { ruleresult, flow, process, inFlow, event, state, _e2s, process__event____flowElements,
				inFlow__event____targetRef, event__inFlow____incoming, flow__state____finalState, _e2s__event____source,
				_e2s__state____target };
	}

	public static final void pattern_EndEvent2FinalStateFirst_1_5_expressionBBBBBBBBBB(EndEvent2FinalStateFirst _this,
			PerformRuleResult ruleresult, EObject flow, EObject node, EObject process, EObject inFlow, EObject _if2f,
			EObject event, EObject state, EObject _e2s) {
		_this.registerObjects_FWD(ruleresult, flow, node, process, inFlow, _if2f, event, state, _e2s);

	}

	public static final PerformRuleResult pattern_EndEvent2FinalStateFirst_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_1_bindingFB(EndEvent2FinalStateFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_1_blackFBB(EClass eClass,
			EndEvent2FinalStateFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_1_bindingAndBlackFFB(
			EndEvent2FinalStateFirst _this) {
		Object[] result_pattern_EndEvent2FinalStateFirst_2_1_binding = pattern_EndEvent2FinalStateFirst_2_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateFirst_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EndEvent2FinalStateFirst_2_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_2_1_black = pattern_EndEvent2FinalStateFirst_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_EndEvent2FinalStateFirst_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EndEvent2FinalStateFirst_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EndEvent2FinalStateFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("node");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("inFlow");
		EObject _localVariable_3 = match.getObject("event");
		EObject tmpNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpInFlow = _localVariable_2;
		EObject tmpEvent = _localVariable_3;
		if (tmpNode instanceof StartEvent) {
			StartEvent node = (StartEvent) tmpNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpInFlow instanceof SequenceFlow) {
					SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
					if (tmpEvent instanceof EndEvent) {
						EndEvent event = (EndEvent) tmpEvent;
						return new Object[] { node, process, inFlow, event, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_2_2_blackFBBBFBB(StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SF2F _if2f : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(inFlow, SF2F.class,
				"source")) {
			Flow flow = _if2f.getTarget();
			if (flow != null) {
				boolean flow__empty = flow.is__empty();
				if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
					_result.add(new Object[] { flow, node, process, inFlow, _if2f, event, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_2_3_blackBBBBBB(Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.getFlowElements().contains(inFlow)) {
			if (process.getFlowElements().contains(event)) {
				if (process.getFlowElements().contains(node)) {
					if (event.equals(inFlow.getTargetRef())) {
						if (inFlow.equals(_if2f.getSource())) {
							if (flow.equals(_if2f.getTarget())) {
								if (node.equals(inFlow.getSourceRef())) {
									boolean flow__empty = flow.is__empty();
									if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
										_result.add(new Object[] { flow, node, process, inFlow, _if2f, event });
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

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_3_greenBBBBBBFFFFFFFFFF(Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _if2f__inFlow____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _if2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String _if2f__inFlow____source_name_prime = "source";
		String _if2f__flow____target_name_prime = "target";
		String inFlow__node____sourceRef_name_prime = "sourceRef";
		String node__inFlow____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(_if2f);
		isApplicableMatch.getAllContextElements().add(event);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(process__inFlow____flowElements);
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		isApplicableMatch.getAllContextElements().add(process__event____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(process__node____flowElements);
		inFlow__event____targetRef.setSrc(inFlow);
		inFlow__event____targetRef.setTrg(event);
		isApplicableMatch.getAllContextElements().add(inFlow__event____targetRef);
		event__inFlow____incoming.setSrc(event);
		event__inFlow____incoming.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(event__inFlow____incoming);
		_if2f__inFlow____source.setSrc(_if2f);
		_if2f__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(_if2f__inFlow____source);
		_if2f__flow____target.setSrc(_if2f);
		_if2f__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(_if2f__flow____target);
		inFlow__node____sourceRef.setSrc(inFlow);
		inFlow__node____sourceRef.setTrg(node);
		isApplicableMatch.getAllContextElements().add(inFlow__node____sourceRef);
		node__inFlow____outgoing.setSrc(node);
		node__inFlow____outgoing.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(node__inFlow____outgoing);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		_if2f__inFlow____source.setName(_if2f__inFlow____source_name_prime);
		_if2f__flow____target.setName(_if2f__flow____target_name_prime);
		inFlow__node____sourceRef.setName(inFlow__node____sourceRef_name_prime);
		node__inFlow____outgoing.setName(node__inFlow____outgoing_name_prime);
		return new Object[] { flow, node, process, inFlow, _if2f, event, isApplicableMatch,
				process__inFlow____flowElements, process__event____flowElements, process__node____flowElements,
				inFlow__event____targetRef, event__inFlow____incoming, _if2f__inFlow____source, _if2f__flow____target,
				inFlow__node____sourceRef, node__inFlow____outgoing };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_4_bindingFBBBBBBBB(EndEvent2FinalStateFirst _this,
			IsApplicableMatch isApplicableMatch, Flow flow, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow inFlow, SF2F _if2f, EndEvent event) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, flow, node, process, inFlow, _if2f,
				event);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flow, node, process, inFlow, _if2f, event };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_4_bindingAndBlackFBBBBBBBB(
			EndEvent2FinalStateFirst _this, IsApplicableMatch isApplicableMatch, Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event) {
		Object[] result_pattern_EndEvent2FinalStateFirst_2_4_binding = pattern_EndEvent2FinalStateFirst_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, flow, node, process, inFlow, _if2f, event);
		if (result_pattern_EndEvent2FinalStateFirst_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateFirst_2_4_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_2_4_black = pattern_EndEvent2FinalStateFirst_2_4_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateFirst_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flow, node, process, inFlow, _if2f, event };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_2_5_expressionFBB(EndEvent2FinalStateFirst _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalStateFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEvent2FinalStateFirst_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_10_1_blackBBBB(EndEvent2FinalStateFirst _this,
			Match match, Flow flow, UCCondition state) {
		return new Object[] { _this, match, flow, state };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_10_2_bindingFBBBB(EndEvent2FinalStateFirst _this,
			Match match, Flow flow, UCCondition state) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, flow, state);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flow, state };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_10_2_bindingAndBlackFBBBB(
			EndEvent2FinalStateFirst _this, Match match, Flow flow, UCCondition state) {
		Object[] result_pattern_EndEvent2FinalStateFirst_10_2_binding = pattern_EndEvent2FinalStateFirst_10_2_bindingFBBBB(
				_this, match, flow, state);
		if (result_pattern_EndEvent2FinalStateFirst_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateFirst_10_2_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_10_2_black = pattern_EndEvent2FinalStateFirst_10_2_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateFirst_10_2_black != null) {

				return new Object[] { csp, _this, match, flow, state };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_10_3_expressionFBB(EndEvent2FinalStateFirst _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_10_4_blackBBB(Match match, Flow flow,
			UCCondition state) {
		return new Object[] { match, flow, state };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_10_4_greenBBBF(Match match, Flow flow,
			UCCondition state) {
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(state);
		String flow__state____finalState_name_prime = "finalState";
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		match.getToBeTranslatedEdges().add(flow__state____finalState);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		return new Object[] { match, flow, state, flow__state____finalState };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_10_5_blackBBB(Match match, Flow flow,
			UCCondition state) {
		return new Object[] { match, flow, state };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_10_5_greenBB(Match match, Flow flow) {
		match.getContextNodes().add(flow);
		return new Object[] { match, flow };
	}

	public static final void pattern_EndEvent2FinalStateFirst_10_6_expressionBBBB(EndEvent2FinalStateFirst _this,
			Match match, Flow flow, UCCondition state) {
		_this.registerObjectsToMatch_BWD(match, flow, state);

	}

	public static final boolean pattern_EndEvent2FinalStateFirst_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flow");
		EObject _localVariable_1 = isApplicableMatch.getObject("node");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("_if2f");
		EObject _localVariable_5 = isApplicableMatch.getObject("state");
		EObject tmpFlow = _localVariable_0;
		EObject tmpNode = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		EObject tmp_if2f = _localVariable_4;
		EObject tmpState = _localVariable_5;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpNode instanceof StartEvent) {
				StartEvent node = (StartEvent) tmpNode;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						if (tmp_if2f instanceof SF2F) {
							SF2F _if2f = (SF2F) tmp_if2f;
							if (tmpState instanceof UCCondition) {
								UCCondition state = (UCCondition) tmpState;
								return new Object[] { flow, node, process, inFlow, _if2f, state, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_11_1_blackBBBBBBBFB(Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, UCCondition state,
			EndEvent2FinalStateFirst _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { flow, node, process, inFlow, _if2f, state, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_11_1_bindingAndBlackFFFFFFBFB(
			EndEvent2FinalStateFirst _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EndEvent2FinalStateFirst_11_1_binding = pattern_EndEvent2FinalStateFirst_11_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EndEvent2FinalStateFirst_11_1_binding != null) {
			Flow flow = (Flow) result_pattern_EndEvent2FinalStateFirst_11_1_binding[0];
			StartEvent node = (StartEvent) result_pattern_EndEvent2FinalStateFirst_11_1_binding[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EndEvent2FinalStateFirst_11_1_binding[2];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEvent2FinalStateFirst_11_1_binding[3];
			SF2F _if2f = (SF2F) result_pattern_EndEvent2FinalStateFirst_11_1_binding[4];
			UCCondition state = (UCCondition) result_pattern_EndEvent2FinalStateFirst_11_1_binding[5];

			Object[] result_pattern_EndEvent2FinalStateFirst_11_1_black = pattern_EndEvent2FinalStateFirst_11_1_blackBBBBBBBFB(
					flow, node, process, inFlow, _if2f, state, _this, isApplicableMatch);
			if (result_pattern_EndEvent2FinalStateFirst_11_1_black != null) {
				CSP csp = (CSP) result_pattern_EndEvent2FinalStateFirst_11_1_black[7];

				return new Object[] { flow, node, process, inFlow, _if2f, state, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_11_1_greenBBFBFB(SimpleBPMN.Process process,
			SequenceFlow inFlow, UCCondition state, CSP csp) {
		EndEvent event = SimpleBPMNFactory.eINSTANCE.createEndEvent();
		EE2FS _e2s = Bpmn2UseCaseFactory.eINSTANCE.createEE2FS();
		Object _localVariable_0 = csp.getValue("event", "id");
		process.getFlowElements().add(event);
		inFlow.setTargetRef(event);
		_e2s.setSource(event);
		_e2s.setTarget(state);
		String event_id_prime = (String) _localVariable_0;
		event.setId(event_id_prime);
		return new Object[] { process, inFlow, event, state, _e2s, csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_11_2_blackBBB(EndEvent event, UCCondition state,
			EE2FS _e2s) {
		return new Object[] { event, state, _e2s };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_11_2_greenFBBB(EndEvent event, UCCondition state,
			EE2FS _e2s) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(event);
		ruleresult.getTranslatedElements().add(state);
		ruleresult.getCreatedLinkElements().add(_e2s);
		return new Object[] { ruleresult, event, state, _e2s };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_11_3_blackBBBBBBBBB(PerformRuleResult ruleresult,
			EObject flow, EObject node, EObject process, EObject inFlow, EObject _if2f, EObject event, EObject state,
			EObject _e2s) {
		if (!flow.equals(node)) {
			if (!flow.equals(process)) {
				if (!flow.equals(inFlow)) {
					if (!flow.equals(state)) {
						if (!node.equals(process)) {
							if (!node.equals(state)) {
								if (!process.equals(state)) {
									if (!inFlow.equals(node)) {
										if (!inFlow.equals(process)) {
											if (!inFlow.equals(state)) {
												if (!_if2f.equals(flow)) {
													if (!_if2f.equals(node)) {
														if (!_if2f.equals(process)) {
															if (!_if2f.equals(inFlow)) {
																if (!_if2f.equals(event)) {
																	if (!_if2f.equals(state)) {
																		if (!event.equals(flow)) {
																			if (!event.equals(node)) {
																				if (!event.equals(process)) {
																					if (!event.equals(inFlow)) {
																						if (!event.equals(state)) {
																							if (!_e2s.equals(flow)) {
																								if (!_e2s
																										.equals(node)) {
																									if (!_e2s.equals(
																											process)) {
																										if (!_e2s
																												.equals(inFlow)) {
																											if (!_e2s
																													.equals(_if2f)) {
																												if (!_e2s
																														.equals(event)) {
																													if (!_e2s
																															.equals(state)) {
																														return new Object[] {
																																ruleresult,
																																flow,
																																node,
																																process,
																																inFlow,
																																_if2f,
																																event,
																																state,
																																_e2s };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EndEvent2FinalStateFirst_11_3_greenBBBBBBBFFFFFF(PerformRuleResult ruleresult,
			EObject flow, EObject process, EObject inFlow, EObject event, EObject state, EObject _e2s) {
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _e2s__event____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _e2s__state____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EndEvent2FinalStateFirst";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String flow__state____finalState_name_prime = "finalState";
		String _e2s__event____source_name_prime = "source";
		String _e2s__state____target_name_prime = "target";
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
		_e2s__event____source.setSrc(_e2s);
		_e2s__event____source.setTrg(event);
		ruleresult.getCreatedEdges().add(_e2s__event____source);
		_e2s__state____target.setSrc(_e2s);
		_e2s__state____target.setTrg(state);
		ruleresult.getCreatedEdges().add(_e2s__state____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		_e2s__event____source.setName(_e2s__event____source_name_prime);
		_e2s__state____target.setName(_e2s__state____target_name_prime);
		return new Object[] { ruleresult, flow, process, inFlow, event, state, _e2s, process__event____flowElements,
				inFlow__event____targetRef, event__inFlow____incoming, flow__state____finalState, _e2s__event____source,
				_e2s__state____target };
	}

	public static final void pattern_EndEvent2FinalStateFirst_11_5_expressionBBBBBBBBBB(EndEvent2FinalStateFirst _this,
			PerformRuleResult ruleresult, EObject flow, EObject node, EObject process, EObject inFlow, EObject _if2f,
			EObject event, EObject state, EObject _e2s) {
		_this.registerObjects_BWD(ruleresult, flow, node, process, inFlow, _if2f, event, state, _e2s);

	}

	public static final PerformRuleResult pattern_EndEvent2FinalStateFirst_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_1_bindingFB(EndEvent2FinalStateFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_1_blackFBB(EClass eClass,
			EndEvent2FinalStateFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_1_bindingAndBlackFFB(
			EndEvent2FinalStateFirst _this) {
		Object[] result_pattern_EndEvent2FinalStateFirst_12_1_binding = pattern_EndEvent2FinalStateFirst_12_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateFirst_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EndEvent2FinalStateFirst_12_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_12_1_black = pattern_EndEvent2FinalStateFirst_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_EndEvent2FinalStateFirst_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EndEvent2FinalStateFirst_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EndEvent2FinalStateFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_2_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_12_2_blackBFFBB(Flow flow,
			UCCondition state, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean flow__empty = flow.is__empty();
		if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
			for (SF2F _if2f : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow, SF2F.class,
					"target")) {
				SequenceFlow inFlow = _if2f.getSource();
				if (inFlow != null) {
					_result.add(new Object[] { flow, inFlow, _if2f, state, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_12_3_blackBFFBBB(Flow flow,
			SequenceFlow inFlow, SF2F _if2f, UCCondition state) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (flow.getFinalState().contains(state)) {
			if (inFlow.equals(_if2f.getSource())) {
				if (flow.equals(_if2f.getTarget())) {
					FlowNode tmpNode = inFlow.getSourceRef();
					if (tmpNode instanceof StartEvent) {
						StartEvent node = (StartEvent) tmpNode;
						boolean flow__empty = flow.is__empty();
						if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(node)) {
									_result.add(new Object[] { flow, node, process, inFlow, _if2f, state });
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_3_greenBBBBBBFFFFFFFF(Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, UCCondition state) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _if2f__inFlow____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _if2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__node____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge node__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String flow__state____finalState_name_prime = "finalState";
		String _if2f__inFlow____source_name_prime = "source";
		String _if2f__flow____target_name_prime = "target";
		String inFlow__node____sourceRef_name_prime = "sourceRef";
		String node__inFlow____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(_if2f);
		isApplicableMatch.getAllContextElements().add(state);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(process__inFlow____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(process__node____flowElements);
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		isApplicableMatch.getAllContextElements().add(flow__state____finalState);
		_if2f__inFlow____source.setSrc(_if2f);
		_if2f__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(_if2f__inFlow____source);
		_if2f__flow____target.setSrc(_if2f);
		_if2f__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(_if2f__flow____target);
		inFlow__node____sourceRef.setSrc(inFlow);
		inFlow__node____sourceRef.setTrg(node);
		isApplicableMatch.getAllContextElements().add(inFlow__node____sourceRef);
		node__inFlow____outgoing.setSrc(node);
		node__inFlow____outgoing.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(node__inFlow____outgoing);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__node____flowElements.setName(process__node____flowElements_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		_if2f__inFlow____source.setName(_if2f__inFlow____source_name_prime);
		_if2f__flow____target.setName(_if2f__flow____target_name_prime);
		inFlow__node____sourceRef.setName(inFlow__node____sourceRef_name_prime);
		node__inFlow____outgoing.setName(node__inFlow____outgoing_name_prime);
		return new Object[] { flow, node, process, inFlow, _if2f, state, isApplicableMatch,
				process__inFlow____flowElements, process__node____flowElements, flow__state____finalState,
				_if2f__inFlow____source, _if2f__flow____target, inFlow__node____sourceRef, node__inFlow____outgoing };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_4_bindingFBBBBBBBB(EndEvent2FinalStateFirst _this,
			IsApplicableMatch isApplicableMatch, Flow flow, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow inFlow, SF2F _if2f, UCCondition state) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, flow, node, process, inFlow, _if2f,
				state);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flow, node, process, inFlow, _if2f, state };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_4_bindingAndBlackFBBBBBBBB(
			EndEvent2FinalStateFirst _this, IsApplicableMatch isApplicableMatch, Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, UCCondition state) {
		Object[] result_pattern_EndEvent2FinalStateFirst_12_4_binding = pattern_EndEvent2FinalStateFirst_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, flow, node, process, inFlow, _if2f, state);
		if (result_pattern_EndEvent2FinalStateFirst_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateFirst_12_4_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_12_4_black = pattern_EndEvent2FinalStateFirst_12_4_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateFirst_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flow, node, process, inFlow, _if2f, state };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_12_5_expressionFBB(EndEvent2FinalStateFirst _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalStateFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEvent2FinalStateFirst_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_20_1_bindingFB(EndEvent2FinalStateFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_20_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_20_1_bindingAndBlackFFB(
			EndEvent2FinalStateFirst _this) {
		Object[] result_pattern_EndEvent2FinalStateFirst_20_1_binding = pattern_EndEvent2FinalStateFirst_20_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateFirst_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateFirst_20_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_20_1_black = pattern_EndEvent2FinalStateFirst_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateFirst_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateFirst_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_20_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpEvent = _edge_flowElements.getTrg();
			if (tmpEvent instanceof EndEvent) {
				EndEvent event = (EndEvent) tmpEvent;
				if (process.getFlowElements().contains(event)) {
					for (FlowElement tmpInFlow : process.getFlowElements()) {
						if (tmpInFlow instanceof SequenceFlow) {
							SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
							if (event.equals(inFlow.getTargetRef())) {
								FlowNode tmpNode = inFlow.getSourceRef();
								if (tmpNode instanceof StartEvent) {
									StartEvent node = (StartEvent) tmpNode;
									if (process.getFlowElements().contains(node)) {
										_result.add(new Object[] { node, process, inFlow, event, _edge_flowElements });
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

	public static final Object[] pattern_EndEvent2FinalStateFirst_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateFirst_20_3_expressionFBBBBBB(EndEvent2FinalStateFirst _this,
			Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_20_4_expressionFBB(EndEvent2FinalStateFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateFirst_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_21_1_bindingFB(EndEvent2FinalStateFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_21_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_21_1_bindingAndBlackFFB(
			EndEvent2FinalStateFirst _this) {
		Object[] result_pattern_EndEvent2FinalStateFirst_21_1_binding = pattern_EndEvent2FinalStateFirst_21_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateFirst_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateFirst_21_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_21_1_black = pattern_EndEvent2FinalStateFirst_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateFirst_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateFirst_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_21_2_blackFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpEvent = _edge_targetRef.getTrg();
			if (tmpEvent instanceof EndEvent) {
				EndEvent event = (EndEvent) tmpEvent;
				if (event.equals(inFlow.getTargetRef())) {
					FlowNode tmpNode = inFlow.getSourceRef();
					if (tmpNode instanceof StartEvent) {
						StartEvent node = (StartEvent) tmpNode;
						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
							if (process.getFlowElements().contains(event)) {
								if (process.getFlowElements().contains(node)) {
									_result.add(new Object[] { node, process, inFlow, event, _edge_targetRef });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateFirst_21_3_expressionFBBBBBB(EndEvent2FinalStateFirst _this,
			Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_21_4_expressionFBB(EndEvent2FinalStateFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateFirst_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_22_1_bindingFB(EndEvent2FinalStateFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_22_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_22_1_bindingAndBlackFFB(
			EndEvent2FinalStateFirst _this) {
		Object[] result_pattern_EndEvent2FinalStateFirst_22_1_binding = pattern_EndEvent2FinalStateFirst_22_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateFirst_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateFirst_22_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_22_1_black = pattern_EndEvent2FinalStateFirst_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateFirst_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateFirst_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_22_2_blackFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEvent = _edge_incoming.getSrc();
		if (tmpEvent instanceof EndEvent) {
			EndEvent event = (EndEvent) tmpEvent;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (event.equals(inFlow.getTargetRef())) {
					FlowNode tmpNode = inFlow.getSourceRef();
					if (tmpNode instanceof StartEvent) {
						StartEvent node = (StartEvent) tmpNode;
						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
							if (process.getFlowElements().contains(inFlow)) {
								if (process.getFlowElements().contains(node)) {
									_result.add(new Object[] { node, process, inFlow, event, _edge_incoming });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateFirst_22_3_expressionFBBBBBB(EndEvent2FinalStateFirst _this,
			Match match, StartEvent node, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_22_4_expressionFBB(EndEvent2FinalStateFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateFirst_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_23_1_bindingFB(EndEvent2FinalStateFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_23_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_23_1_bindingAndBlackFFB(
			EndEvent2FinalStateFirst _this) {
		Object[] result_pattern_EndEvent2FinalStateFirst_23_1_binding = pattern_EndEvent2FinalStateFirst_23_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateFirst_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateFirst_23_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_23_1_black = pattern_EndEvent2FinalStateFirst_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateFirst_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateFirst_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_23_2_black_nac_0B(UCCondition state) {
		for (UseCase __DEC_state_precondition_872862 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, UseCase.class, "precondition")) {
			return new Object[] { state };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_23_2_black_nac_1BB(UCCondition state, Flow flow) {
		for (Flow __DEC_state_finalState_129190 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_state_finalState_129190)) {
				return new Object[] { state, flow };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_23_2_blackFFB(
			EMoflonEdge _edge_finalState) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_finalState.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpState = _edge_finalState.getTrg();
			if (tmpState instanceof UCCondition) {
				UCCondition state = (UCCondition) tmpState;
				if (flow.getFinalState().contains(state)) {
					boolean flow__empty = flow.is__empty();
					if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
						if (pattern_EndEvent2FinalStateFirst_23_2_black_nac_0B(state) == null) {
							if (pattern_EndEvent2FinalStateFirst_23_2_black_nac_1BB(state, flow) == null) {
								_result.add(new Object[] { flow, state, _edge_finalState });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateFirst_23_3_expressionFBBBB(EndEvent2FinalStateFirst _this,
			Match match, Flow flow, UCCondition state) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow, state);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_23_4_expressionFBB(EndEvent2FinalStateFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateFirst_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_26_1_blackB(EndEvent2FinalStateFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_26_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_26_2_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("flow");
		EObject _localVariable_1 = sourceMatch.getObject("node");
		EObject _localVariable_2 = sourceMatch.getObject("process");
		EObject _localVariable_3 = sourceMatch.getObject("inFlow");
		EObject _localVariable_4 = sourceMatch.getObject("event");
		EObject _localVariable_5 = targetMatch.getObject("state");
		EObject tmpFlow = _localVariable_0;
		EObject tmpNode = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		EObject tmpEvent = _localVariable_4;
		EObject tmpState = _localVariable_5;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpNode instanceof StartEvent) {
				StartEvent node = (StartEvent) tmpNode;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						if (tmpEvent instanceof EndEvent) {
							EndEvent event = (EndEvent) tmpEvent;
							if (tmpState instanceof UCCondition) {
								UCCondition state = (UCCondition) tmpState;
								return new Object[] { flow, node, process, inFlow, event, state, targetMatch,
										sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_26_2_blackBBBBFBBBB(Flow flow,
			StartEvent node, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event, UCCondition state,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (process.getFlowElements().contains(inFlow)) {
				if (process.getFlowElements().contains(event)) {
					if (process.getFlowElements().contains(node)) {
						if (event.equals(inFlow.getTargetRef())) {
							if (flow.getFinalState().contains(state)) {
								if (node.equals(inFlow.getSourceRef())) {
									boolean flow__empty = flow.is__empty();
									if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
										for (SF2F _if2f : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(inFlow, SF2F.class, "source")) {
											if (flow.equals(_if2f.getTarget())) {
												_result.add(new Object[] { flow, node, process, inFlow, _if2f, event,
														state, sourceMatch, targetMatch });
											}
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

	public static final Object[] pattern_EndEvent2FinalStateFirst_26_2_greenBBBBBBBBFB(Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event, UCCondition state,
			Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalStateFirst";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(event);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(state);
		isApplicableMatch.getAllContextElements().add(_if2f);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { flow, node, process, inFlow, _if2f, event, state, sourceMatch, isApplicableMatch,
				targetMatch };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_26_3_bindingFBBBBBBBBBBB(
			EndEvent2FinalStateFirst _this, IsApplicableMatchCC isApplicableMatch, Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event, UCCondition state,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, flow, node, process, inFlow, _if2f,
				event, state, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flow, node, process, inFlow, _if2f, event, state,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_26_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_26_3_bindingAndBlackFBBBBBBBBBBB(
			EndEvent2FinalStateFirst _this, IsApplicableMatchCC isApplicableMatch, Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event, UCCondition state,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EndEvent2FinalStateFirst_26_3_binding = pattern_EndEvent2FinalStateFirst_26_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, flow, node, process, inFlow, _if2f, event, state, sourceMatch, targetMatch);
		if (result_pattern_EndEvent2FinalStateFirst_26_3_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateFirst_26_3_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_26_3_black = pattern_EndEvent2FinalStateFirst_26_3_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateFirst_26_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flow, node, process, inFlow, _if2f, event, state,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_26_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_26_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalStateFirst";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEvent2FinalStateFirst_26_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_29_1_blackB(EndEvent2FinalStateFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_29_2_bindingFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flow");
		EObject _localVariable_1 = isApplicableMatch.getObject("node");
		EObject _localVariable_2 = isApplicableMatch.getObject("process");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("_if2f");
		EObject _localVariable_5 = isApplicableMatch.getObject("event");
		EObject _localVariable_6 = isApplicableMatch.getObject("state");
		EObject tmpFlow = _localVariable_0;
		EObject tmpNode = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		EObject tmp_if2f = _localVariable_4;
		EObject tmpEvent = _localVariable_5;
		EObject tmpState = _localVariable_6;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpNode instanceof StartEvent) {
				StartEvent node = (StartEvent) tmpNode;
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						if (tmp_if2f instanceof SF2F) {
							SF2F _if2f = (SF2F) tmp_if2f;
							if (tmpEvent instanceof EndEvent) {
								EndEvent event = (EndEvent) tmpEvent;
								if (tmpState instanceof UCCondition) {
									UCCondition state = (UCCondition) tmpState;
									return new Object[] { flow, node, process, inFlow, _if2f, event, state,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_29_2_blackBBBBBBBB(Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, EndEvent event, UCCondition state,
			IsApplicableMatchCC isApplicableMatch) {
		if (process.getFlowElements().contains(inFlow)) {
			if (process.getFlowElements().contains(event)) {
				if (process.getFlowElements().contains(node)) {
					if (event.equals(inFlow.getTargetRef())) {
						if (flow.getFinalState().contains(state)) {
							if (inFlow.equals(_if2f.getSource())) {
								if (flow.equals(_if2f.getTarget())) {
									if (node.equals(inFlow.getSourceRef())) {
										boolean flow__empty = flow.is__empty();
										if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
											return new Object[] { flow, node, process, inFlow, _if2f, event, state,
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
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_29_2_bindingAndBlackFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_EndEvent2FinalStateFirst_29_2_binding = pattern_EndEvent2FinalStateFirst_29_2_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EndEvent2FinalStateFirst_29_2_binding != null) {
			Flow flow = (Flow) result_pattern_EndEvent2FinalStateFirst_29_2_binding[0];
			StartEvent node = (StartEvent) result_pattern_EndEvent2FinalStateFirst_29_2_binding[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EndEvent2FinalStateFirst_29_2_binding[2];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEvent2FinalStateFirst_29_2_binding[3];
			SF2F _if2f = (SF2F) result_pattern_EndEvent2FinalStateFirst_29_2_binding[4];
			EndEvent event = (EndEvent) result_pattern_EndEvent2FinalStateFirst_29_2_binding[5];
			UCCondition state = (UCCondition) result_pattern_EndEvent2FinalStateFirst_29_2_binding[6];

			Object[] result_pattern_EndEvent2FinalStateFirst_29_2_black = pattern_EndEvent2FinalStateFirst_29_2_blackBBBBBBBB(
					flow, node, process, inFlow, _if2f, event, state, isApplicableMatch);
			if (result_pattern_EndEvent2FinalStateFirst_29_2_black != null) {

				return new Object[] { flow, node, process, inFlow, _if2f, event, state, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_29_2_greenBBFF(EndEvent event, UCCondition state) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		EE2FS _e2s = Bpmn2UseCaseFactory.eINSTANCE.createEE2FS();
		result.getCreatedElements().add(_e2s);
		_e2s.setSource(event);
		_e2s.setTarget(state);
		return new Object[] { event, state, result, _e2s };
	}

	public static final PerformRuleResult pattern_EndEvent2FinalStateFirst_29_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_1_blackB(EndEvent2FinalStateFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SF2F _if2f) {
		if (ruleResult.getCorrObjects().contains(_if2f)) {
			return new Object[] { ruleResult, _if2f };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, StartEvent node) {
		if (ruleResult.getSourceObjects().contains(node)) {
			return new Object[] { ruleResult, node };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateFirst_30_2_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList _if2fList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmp_if2f : _if2fList.getEntryObjects()) {
				if (tmp_if2f instanceof SF2F) {
					SF2F _if2f = (SF2F) tmp_if2f;
					Flow flow = _if2f.getTarget();
					if (flow != null) {
						SequenceFlow inFlow = _if2f.getSource();
						if (inFlow != null) {
							boolean flow__empty = flow.is__empty();
							if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
								FlowNode tmpNode = inFlow.getSourceRef();
								if (tmpNode instanceof StartEvent) {
									StartEvent node = (StartEvent) tmpNode;
									if (pattern_EndEvent2FinalStateFirst_30_2_black_nac_1BB(ruleResult,
											_if2f) == null) {
										if (pattern_EndEvent2FinalStateFirst_30_2_black_nac_0BB(ruleResult,
												flow) == null) {
											if (pattern_EndEvent2FinalStateFirst_30_2_black_nac_2BB(ruleResult,
													inFlow) == null) {
												if (pattern_EndEvent2FinalStateFirst_30_2_black_nac_3BB(ruleResult,
														node) == null) {
													for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class,
																	"flowElements")) {
														if (process.getFlowElements().contains(node)) {
															if (pattern_EndEvent2FinalStateFirst_30_2_black_nac_4BB(
																	ruleResult, process) == null) {
																_result.add(new Object[] { _if2fList, flow, _if2f,
																		inFlow, node, process, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_3_bindingFBBBBBBBB(EndEvent2FinalStateFirst _this,
			IsApplicableMatch isApplicableMatch, Flow flow, StartEvent node, SimpleBPMN.Process process,
			SequenceFlow inFlow, SF2F _if2f, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, flow, node, process, inFlow, _if2f,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flow, node, process, inFlow, _if2f, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_3_bindingAndBlackFBBBBBBBB(
			EndEvent2FinalStateFirst _this, IsApplicableMatch isApplicableMatch, Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EndEvent2FinalStateFirst_30_3_binding = pattern_EndEvent2FinalStateFirst_30_3_bindingFBBBBBBBB(
				_this, isApplicableMatch, flow, node, process, inFlow, _if2f, ruleResult);
		if (result_pattern_EndEvent2FinalStateFirst_30_3_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateFirst_30_3_binding[0];

			Object[] result_pattern_EndEvent2FinalStateFirst_30_3_black = pattern_EndEvent2FinalStateFirst_30_3_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateFirst_30_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flow, node, process, inFlow, _if2f, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateFirst_30_4_expressionFBB(EndEvent2FinalStateFirst _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_5_blackBBBBB(Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f) {
		boolean flow__empty = flow.is__empty();
		if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
			return new Object[] { flow, node, process, inFlow, _if2f };
		}

		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_6_blackBBBBBB(Flow flow, StartEvent node,
			SimpleBPMN.Process process, SequenceFlow inFlow, SF2F _if2f, ModelgeneratorRuleResult ruleResult) {
		boolean flow__empty = flow.is__empty();
		if (Boolean.valueOf(flow__empty).equals(Boolean.valueOf(true))) {
			return new Object[] { flow, node, process, inFlow, _if2f, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateFirst_30_6_greenBBBFFFBB(Flow flow,
			SimpleBPMN.Process process, SequenceFlow inFlow, ModelgeneratorRuleResult ruleResult, CSP csp) {
		EndEvent event = SimpleBPMNFactory.eINSTANCE.createEndEvent();
		UCCondition state = SimpleUseCaseFactory.eINSTANCE.createUCCondition();
		EE2FS _e2s = Bpmn2UseCaseFactory.eINSTANCE.createEE2FS();
		Object _localVariable_0 = csp.getValue("event", "id");
		Object _localVariable_1 = csp.getValue("state", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		process.getFlowElements().add(event);
		inFlow.setTargetRef(event);
		ruleResult.getSourceObjects().add(event);
		flow.getFinalState().add(state);
		ruleResult.getTargetObjects().add(state);
		_e2s.setSource(event);
		_e2s.setTarget(state);
		ruleResult.getCorrObjects().add(_e2s);
		String event_id_prime = (String) _localVariable_0;
		String state_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		event.setId(event_id_prime);
		state.setName(state_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { flow, process, inFlow, event, state, _e2s, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EndEvent2FinalStateFirst_30_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EndEvent2FinalStateFirstImpl
