/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.GW2S;

import Bpmn2UseCase.Rules.EndEvent2FinalStateGWSeq;
import Bpmn2UseCase.Rules.RulesPackage;

import SimpleBPMN.EndEvent;
import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.Flow;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.Step;
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
 * An implementation of the model object '<em><b>End Event2 Final State GW Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EndEvent2FinalStateGWSeqImpl extends AbstractRuleImpl implements EndEvent2FinalStateGWSeq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEvent2FinalStateGWSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEndEvent2FinalStateGWSeq();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow,
			EndEvent event) {
		// initial bindings
		Object[] result1_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_0_1_blackBBBBBB(this,
				match, prevNode, process, inFlow, event);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_0_2_bindingAndBlackFBBBBBB(this, match, prevNode, process, inFlow,
						event);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_0_4_blackBBBBB(match,
					prevNode, process, inFlow, event);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
			}
			EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_0_4_greenBBBBBFFFFFF(match, prevNode, process,
					inFlow, event);
					// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result4_green[5];
					// EMoflonEdge process__event____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result4_green[7];
					// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result4_green[8];
					// EMoflonEdge inFlow__prevNode____sourceRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge prevNode__inFlow____outgoing = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_0_5_blackBBBBB(match,
					prevNode, process, inFlow, event);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
			}
			EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_0_6_expressionBBBBBB(this, match, prevNode,
					process, inFlow, event);
			return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_0_7_expressionF();
		} else {
			return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_1_1_bindingAndBlackFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Gateway prevNode = (Gateway) result1_bindingAndBlack[0];
		Step lastStep = (Step) result1_bindingAndBlack[1];
		GW2S pn2s = (GW2S) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[5];
		EndEvent event = (EndEvent) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_1_1_greenFBBB(lastStep,
				flow, csp);
		UCCondition state = (UCCondition) result1_green[0];

		// collect translated elements
		Object[] result2_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_1_2_blackBBB(state,
				inFlow, event);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[state] = " + state + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}
		Object[] result2_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_1_2_greenFBBB(state,
				inFlow, event);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_1_3_blackBBBBBBBBB(
				ruleresult, state, prevNode, lastStep, pn2s, flow, process, inFlow, event);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[state] = " + state + ", " + "[prevNode] = " + prevNode
					+ ", " + "[lastStep] = " + lastStep + ", " + "[pn2s] = " + pn2s + ", " + "[flow] = " + flow + ", "
					+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}
		EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_1_3_greenBBBBBBBBFFFFFFFF(ruleresult, state,
				prevNode, lastStep, flow, process, inFlow, event);
				// EMoflonEdge lastStep__state______last = (EMoflonEdge) result3_green[8];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlow__prevNode____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevNode__inFlow____outgoing = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_1_5_expressionBBBBBBBBBB(this, ruleresult, state,
				prevNode, lastStep, pn2s, flow, process, inFlow, event);
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Gateway prevNode = (Gateway) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[2];
		EndEvent event = (EndEvent) result2_binding[3];
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_2_2_blackBFFBBBB(prevNode, process, inFlow, event, match)) {
			Step lastStep = (Step) result2_black[1];
			GW2S pn2s = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_2_3_blackBBBFBBB(prevNode, lastStep, pn2s, process, inFlow,
							event)) {
				Flow flow = (Flow) result3_black[3];
				Object[] result3_green = EndEvent2FinalStateGWSeqImpl
						.pattern_EndEvent2FinalStateGWSeq_2_3_greenBBBBBBBFFFFFFFFFFF(prevNode, lastStep, pn2s, flow,
								process, inFlow, event);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge pn2s__prevNode____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pn2s__lastStep____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__lastStep____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[15];
				// EMoflonEdge inFlow__prevNode____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevNode__inFlow____outgoing = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
						.pattern_EndEvent2FinalStateGWSeq_2_4_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								prevNode, lastStep, pn2s, flow, process, inFlow, event);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[lastStep] = " + lastStep + ", " + "[pn2s] = " + pn2s
							+ ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[inFlow] = "
							+ inFlow + ", " + "[event] = " + event + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Gateway prevNode, SimpleBPMN.Process process,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, Gateway prevNode, SimpleBPMN.Process process,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Gateway prevNode, Step lastStep,
			GW2S pn2s, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {// Create CSP
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
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("lastStep", lastStep);
		isApplicableMatch.registerObject("pn2s", pn2s);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject state, EObject prevNode, EObject lastStep,
			EObject pn2s, EObject flow, EObject process, EObject inFlow, EObject event) {
		ruleresult.registerObject("state", state);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("lastStep", lastStep);
		ruleresult.registerObject("pn2s", pn2s);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("event", event);

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
	public boolean isAppropriate_BWD(Match match, UCCondition state, Step lastStep, Flow flow) {
		// initial bindings
		Object[] result1_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_10_1_blackBBBBB(this,
				match, state, lastStep, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[state] = " + state + ", "
					+ "[lastStep] = " + lastStep + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_10_2_bindingAndBlackFBBBBB(this, match, state, lastStep, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[state] = " + state + ", " + "[lastStep] = "
					+ lastStep + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_10_4_blackBBBB(match,
					state, lastStep, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[state] = " + state + ", " + "[lastStep] = "
						+ lastStep + ", " + "[flow] = " + flow + ".");
			}
			EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_10_4_greenBBBBFF(match, state, lastStep,
					flow);
					// EMoflonEdge lastStep__state______last = (EMoflonEdge) result4_green[4];
					// EMoflonEdge flow__state____finalState = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_10_5_blackBBBB(match,
					state, lastStep, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[state] = " + state + ", " + "[lastStep] = "
						+ lastStep + ", " + "[flow] = " + flow + ".");
			}
			EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_10_5_greenBBBF(match, lastStep, flow);
			// EMoflonEdge flow__lastStep____steps = (EMoflonEdge) result5_green[3];

			// register objects to match
			EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_10_6_expressionBBBBB(this, match, state,
					lastStep, flow);
			return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_10_7_expressionF();
		} else {
			return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_11_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		UCCondition state = (UCCondition) result1_bindingAndBlack[0];
		Gateway prevNode = (Gateway) result1_bindingAndBlack[1];
		Step lastStep = (Step) result1_bindingAndBlack[2];
		GW2S pn2s = (GW2S) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_11_1_greenBBFFB(prevNode,
				process, csp);
		SequenceFlow inFlow = (SequenceFlow) result1_green[2];
		EndEvent event = (EndEvent) result1_green[3];

		// collect translated elements
		Object[] result2_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_11_2_blackBBB(state,
				inFlow, event);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[state] = " + state + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}
		Object[] result2_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_11_2_greenFBBB(state,
				inFlow, event);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_11_3_blackBBBBBBBBB(
				ruleresult, state, prevNode, lastStep, pn2s, flow, process, inFlow, event);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[state] = " + state + ", " + "[prevNode] = " + prevNode
					+ ", " + "[lastStep] = " + lastStep + ", " + "[pn2s] = " + pn2s + ", " + "[flow] = " + flow + ", "
					+ "[process] = " + process + ", " + "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}
		EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_11_3_greenBBBBBBBBFFFFFFFF(ruleresult, state,
				prevNode, lastStep, flow, process, inFlow, event);
				// EMoflonEdge lastStep__state______last = (EMoflonEdge) result3_green[8];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[13];
				// EMoflonEdge inFlow__prevNode____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevNode__inFlow____outgoing = (EMoflonEdge) result3_green[15];

		// perform postprocessing story node is empty
		// register objects
		EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_11_5_expressionBBBBBBBBBB(this, ruleresult, state,
				prevNode, lastStep, pn2s, flow, process, inFlow, event);
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		UCCondition state = (UCCondition) result2_binding[0];
		Step lastStep = (Step) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_12_2_blackBFBFBB(state, lastStep, flow, match)) {
			Gateway prevNode = (Gateway) result2_black[1];
			GW2S pn2s = (GW2S) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_12_3_blackBBBBBF(state, prevNode, lastStep, pn2s, flow)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[5];
				Object[] result3_green = EndEvent2FinalStateGWSeqImpl
						.pattern_EndEvent2FinalStateGWSeq_12_3_greenBBBBBBFFFFFFF(state, prevNode, lastStep, pn2s, flow,
								process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge lastStep__state______last = (EMoflonEdge) result3_green[7];
				// EMoflonEdge pn2s__prevNode____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pn2s__lastStep____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__lastStep____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
						.pattern_EndEvent2FinalStateGWSeq_12_4_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, state,
								prevNode, lastStep, pn2s, flow, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[state] = " + state + ", " + "[prevNode] = " + prevNode + ", " + "[lastStep] = "
							+ lastStep + ", " + "[pn2s] = " + pn2s + ", " + "[flow] = " + flow + ", " + "[process] = "
							+ process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, UCCondition state, Step lastStep, Flow flow) {
		match.registerObject("state", state);
		match.registerObject("lastStep", lastStep);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UCCondition state, Step lastStep, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, UCCondition state, Gateway prevNode,
			Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("state", state);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("lastStep", lastStep);
		isApplicableMatch.registerObject("pn2s", pn2s);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject state, EObject prevNode, EObject lastStep,
			EObject pn2s, EObject flow, EObject process, EObject inFlow, EObject event) {
		ruleresult.registerObject("state", state);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("lastStep", lastStep);
		ruleresult.registerObject("pn2s", pn2s);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("event", event);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_92(EMoflonEdge _edge___last) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_20_2_blackFFFB(_edge___last)) {
			UCCondition state = (UCCondition) result2_black[0];
			Step lastStep = (Step) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_20_3_expressionFBBBBB(this, match, state,
					lastStep, flow)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_20_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_93(EMoflonEdge _edge_finalState) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_21_2_blackFFFB(_edge_finalState)) {
			UCCondition state = (UCCondition) result2_black[0];
			Step lastStep = (Step) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_21_3_expressionFBBBBB(this, match, state,
					lastStep, flow)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_21_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_288(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_22_2_blackFFFFB(_edge_flowElements)) {
			Gateway prevNode = (Gateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_22_3_expressionFBBBBBB(this, match,
					prevNode, process, inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_22_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_289(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_23_2_blackFFFFB(_edge_flowElements)) {
			Gateway prevNode = (Gateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_23_3_expressionFBBBBBB(this, match,
					prevNode, process, inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_23_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_23_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_290(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_24_2_blackFFFFB(_edge_targetRef)) {
			Gateway prevNode = (Gateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_24_3_expressionFBBBBBB(this, match,
					prevNode, process, inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_24_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_24_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_291(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_25_2_blackFFFFB(_edge_incoming)) {
			Gateway prevNode = (Gateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_25_3_expressionFBBBBBB(this, match,
					prevNode, process, inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_25_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_25_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_292(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_26_2_blackFFFFB(_edge_sourceRef)) {
			Gateway prevNode = (Gateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_26_3_expressionFBBBBBB(this, match,
					prevNode, process, inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_26_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_26_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_293(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_27_2_blackFFFFB(_edge_outgoing)) {
			Gateway prevNode = (Gateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			EndEvent event = (EndEvent) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_27_3_expressionFBBBBBB(this, match,
					prevNode, process, inFlow, event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_27_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_27_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EndEvent2FinalStateGWSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForState = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("state")).findAny();
		SimpleUseCase.UCCondition state = (SimpleUseCase.UCCondition) matchForState.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.Gateway prevNode = (SimpleBPMN.Gateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForLastStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("lastStep")).findAny();
		SimpleUseCase.Step lastStep = (SimpleUseCase.Step) matchForLastStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2s")).findAny();
		Bpmn2UseCase.GW2S pn2s = (Bpmn2UseCase.GW2S) matchForPn2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("inFlow")).findAny();
		SimpleBPMN.SequenceFlow inFlow = (SimpleBPMN.SequenceFlow) matchForInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEvent = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("event")).findAny();
		SimpleBPMN.EndEvent event = (SimpleBPMN.EndEvent) matchForEvent.get().getNode();

		if (!(prevNode.isIsDiverging() == false)) {
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

		eq0.setRuleName("EndEvent2FinalStateGWSeq");
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
		ruleResult.setRule("EndEvent2FinalStateGWSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForState = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("state")).findAny();
		SimpleUseCase.UCCondition state = (SimpleUseCase.UCCondition) matchForState.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.Gateway prevNode = (SimpleBPMN.Gateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForLastStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("lastStep")).findAny();
		SimpleUseCase.Step lastStep = (SimpleUseCase.Step) matchForLastStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2s")).findAny();
		Bpmn2UseCase.GW2S pn2s = (Bpmn2UseCase.GW2S) matchForPn2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("inFlow")).findAny();
		SimpleBPMN.SequenceFlow inFlow = (SimpleBPMN.SequenceFlow) matchForInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEvent = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("event")).findAny();
		SimpleBPMN.EndEvent event = (SimpleBPMN.EndEvent) matchForEvent.get().getNode();

		if (!(prevNode.isIsDiverging() == false)) {
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

		eq0.setRuleName("EndEvent2FinalStateGWSeq");
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
		Object[] result1_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_30_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_30_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_30_2_bindingFFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		UCCondition state = (UCCondition) result2_binding[0];
		Gateway prevNode = (Gateway) result2_binding[1];
		Step lastStep = (Step) result2_binding[2];
		Flow flow = (Flow) result2_binding[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[4];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[5];
		EndEvent event = (EndEvent) result2_binding[6];
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_30_2_blackBBBFBBBBBB(state, prevNode, lastStep, flow, process, inFlow,
						event, sourceMatch, targetMatch)) {
			GW2S pn2s = (GW2S) result2_black[3];
			Object[] result2_green = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_30_2_greenBBBBBBBBBBF(state, prevNode, lastStep, pn2s, flow,
							process, inFlow, event, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[10];

			// check csp
			Object[] result3_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_30_3_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, state,
							prevNode, lastStep, pn2s, flow, process, inFlow, event, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = EndEvent2FinalStateGWSeqImpl
						.pattern_EndEvent2FinalStateGWSeq_30_4_blackBB(result, isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_30_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_30_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, UCCondition state, Gateway prevNode,
			Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event,
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
		isApplicableMatch.registerObject("state", state);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("lastStep", lastStep);
		isApplicableMatch.registerObject("pn2s", pn2s);
		isApplicableMatch.registerObject("flow", flow);
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
		Object[] result1_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_33_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_33_2_bindingAndBlackFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// UCCondition state = (UCCondition) result2_bindingAndBlack[0];
		// Gateway prevNode = (Gateway) result2_bindingAndBlack[1];
		// Step lastStep = (Step) result2_bindingAndBlack[2];
		// GW2S pn2s = (GW2S) result2_bindingAndBlack[3];
		// Flow flow = (Flow) result2_bindingAndBlack[4];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[5];
		// SequenceFlow inFlow = (SequenceFlow) result2_bindingAndBlack[6];
		// EndEvent event = (EndEvent) result2_bindingAndBlack[7];
		Object[] result2_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_33_2_greenF();
		PerformRuleResult result = (PerformRuleResult) result2_green[0];

		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_33_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, GW2S pn2sParameter) {
		// create result
		Object[] result1_black = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_34_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_34_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EndEvent2FinalStateGWSeqImpl
				.pattern_EndEvent2FinalStateGWSeq_34_2_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList pn2sList = (RuleEntryList) result2_black[0];
			Gateway prevNode = (Gateway) result2_black[1];
			GW2S pn2s = (GW2S) result2_black[2];
			Step lastStep = (Step) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[5];

			// solve CSP
			Object[] result3_bindingAndBlack = EndEvent2FinalStateGWSeqImpl
					.pattern_EndEvent2FinalStateGWSeq_34_3_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, prevNode,
							lastStep, pn2s, flow, process, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[prevNode] = " + prevNode
						+ ", " + "[lastStep] = " + lastStep + ", " + "[pn2s] = " + pn2s + ", " + "[flow] = " + flow
						+ ", " + "[process] = " + process + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_34_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = EndEvent2FinalStateGWSeqImpl
						.pattern_EndEvent2FinalStateGWSeq_34_5_blackBBBBB(prevNode, lastStep, pn2s, flow, process);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EndEvent2FinalStateGWSeqImpl
							.pattern_EndEvent2FinalStateGWSeq_34_6_blackBBBBBB(prevNode, lastStep, pn2s, flow, process,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[prevNode] = " + prevNode + ", " + "[lastStep] = " + lastStep + ", " + "[pn2s] = "
								+ pn2s + ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_34_6_greenFBBBBFFBB(prevNode,
							lastStep, flow, process, ruleResult, csp);
					// UCCondition state = (UCCondition) result6_green[0];
					// SequenceFlow inFlow = (SequenceFlow) result6_green[5];
					// EndEvent event = (EndEvent) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateGWSeqImpl.pattern_EndEvent2FinalStateGWSeq_34_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Gateway prevNode, Step lastStep,
			GW2S pn2s, Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("lastStep", lastStep);
		isApplicableMatch.registerObject("pn2s", pn2s);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
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
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD__MATCH_GATEWAY_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_FWD((Match) arguments.get(0), (Gateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(EndEvent) arguments.get(4));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GATEWAY_PROCESS_SEQUENCEFLOW_ENDEVENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Gateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(EndEvent) arguments.get(4));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GATEWAY_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Gateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(EndEvent) arguments.get(4));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GATEWAY_STEP_GW2S_FLOW_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Gateway) arguments.get(1),
					(Step) arguments.get(2), (GW2S) arguments.get(3), (Flow) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (SequenceFlow) arguments.get(6),
					(EndEvent) arguments.get(7));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD__MATCH_UCCONDITION_STEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (UCCondition) arguments.get(1), (Step) arguments.get(2),
					(Flow) arguments.get(3));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_UCCONDITION_STEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (UCCondition) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_UCCONDITION_STEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (UCCondition) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_UCCONDITION_GATEWAY_STEP_GW2S_FLOW_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (UCCondition) arguments.get(1),
					(Gateway) arguments.get(2), (Step) arguments.get(3), (GW2S) arguments.get(4),
					(Flow) arguments.get(5), (SimpleBPMN.Process) arguments.get(6));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_92((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_93__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_93((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_288__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_288((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_289__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_289((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_290__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_290((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_291__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_291((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_292__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_292((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_293__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_293((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_UCCONDITION_GATEWAY_STEP_GW2S_FLOW_PROCESS_SEQUENCEFLOW_ENDEVENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (UCCondition) arguments.get(1),
					(Gateway) arguments.get(2), (Step) arguments.get(3), (GW2S) arguments.get(4),
					(Flow) arguments.get(5), (SimpleBPMN.Process) arguments.get(6), (SequenceFlow) arguments.get(7),
					(EndEvent) arguments.get(8), (Match) arguments.get(9), (Match) arguments.get(10));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (GW2S) arguments.get(1));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_GATEWAY_STEP_GW2S_FLOW_PROCESS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Gateway) arguments.get(1),
					(Step) arguments.get(2), (GW2S) arguments.get(3), (Flow) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.END_EVENT2_FINAL_STATE_GW_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_0_1_blackBBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		return new Object[] { _this, match, prevNode, process, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_0_2_bindingFBBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, inFlow, event);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, inFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_0_2_bindingAndBlackFBBBBBB(
			EndEvent2FinalStateGWSeq _this, Match match, Gateway prevNode, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_0_2_binding = pattern_EndEvent2FinalStateGWSeq_0_2_bindingFBBBBBB(
				_this, match, prevNode, process, inFlow, event);
		if (result_pattern_EndEvent2FinalStateGWSeq_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateGWSeq_0_2_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_0_2_black = pattern_EndEvent2FinalStateGWSeq_0_2_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateGWSeq_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, inFlow, event };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_0_3_expressionFBB(EndEvent2FinalStateGWSeq _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_0_4_blackBBBBB(Match match, Gateway prevNode,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		return new Object[] { match, prevNode, process, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_0_4_greenBBBBBFFFFFF(Match match, Gateway prevNode,
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_0_5_blackBBBBB(Match match, Gateway prevNode,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		return new Object[] { match, prevNode, process, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_0_5_greenBBBF(Match match, Gateway prevNode,
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

	public static final void pattern_EndEvent2FinalStateGWSeq_0_6_expressionBBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, inFlow, event);

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_1_1_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("lastStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2s");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_6 = isApplicableMatch.getObject("event");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpLastStep = _localVariable_1;
		EObject tmpPn2s = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpInFlow = _localVariable_5;
		EObject tmpEvent = _localVariable_6;
		if (tmpPrevNode instanceof Gateway) {
			Gateway prevNode = (Gateway) tmpPrevNode;
			if (tmpLastStep instanceof Step) {
				Step lastStep = (Step) tmpLastStep;
				if (tmpPn2s instanceof GW2S) {
					GW2S pn2s = (GW2S) tmpPn2s;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (tmpEvent instanceof EndEvent) {
									EndEvent event = (EndEvent) tmpEvent;
									return new Object[] { prevNode, lastStep, pn2s, flow, process, inFlow, event,
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_1_1_blackBBBBBBBBFB(Gateway prevNode, Step lastStep,
			GW2S pn2s, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event,
			EndEvent2FinalStateGWSeq _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { prevNode, lastStep, pn2s, flow, process, inFlow, event, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_1_1_bindingAndBlackFFFFFFFBFB(
			EndEvent2FinalStateGWSeq _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_1_1_binding = pattern_EndEvent2FinalStateGWSeq_1_1_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EndEvent2FinalStateGWSeq_1_1_binding != null) {
			Gateway prevNode = (Gateway) result_pattern_EndEvent2FinalStateGWSeq_1_1_binding[0];
			Step lastStep = (Step) result_pattern_EndEvent2FinalStateGWSeq_1_1_binding[1];
			GW2S pn2s = (GW2S) result_pattern_EndEvent2FinalStateGWSeq_1_1_binding[2];
			Flow flow = (Flow) result_pattern_EndEvent2FinalStateGWSeq_1_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EndEvent2FinalStateGWSeq_1_1_binding[4];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEvent2FinalStateGWSeq_1_1_binding[5];
			EndEvent event = (EndEvent) result_pattern_EndEvent2FinalStateGWSeq_1_1_binding[6];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_1_1_black = pattern_EndEvent2FinalStateGWSeq_1_1_blackBBBBBBBBFB(
					prevNode, lastStep, pn2s, flow, process, inFlow, event, _this, isApplicableMatch);
			if (result_pattern_EndEvent2FinalStateGWSeq_1_1_black != null) {
				CSP csp = (CSP) result_pattern_EndEvent2FinalStateGWSeq_1_1_black[8];

				return new Object[] { prevNode, lastStep, pn2s, flow, process, inFlow, event, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_1_1_greenFBBB(Step lastStep, Flow flow, CSP csp) {
		UCCondition state = SimpleUseCaseFactory.eINSTANCE.createUCCondition();
		Object _localVariable_0 = csp.getValue("state", "name");
		lastStep.set__last(state);
		flow.setFinalState(state);
		String state_name_prime = (String) _localVariable_0;
		state.setName(state_name_prime);
		return new Object[] { state, lastStep, flow, csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_1_2_blackBBB(UCCondition state, SequenceFlow inFlow,
			EndEvent event) {
		return new Object[] { state, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_1_2_greenFBBB(UCCondition state, SequenceFlow inFlow,
			EndEvent event) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(state);
		ruleresult.getTranslatedElements().add(inFlow);
		ruleresult.getTranslatedElements().add(event);
		return new Object[] { ruleresult, state, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_1_3_blackBBBBBBBBB(PerformRuleResult ruleresult,
			EObject state, EObject prevNode, EObject lastStep, EObject pn2s, EObject flow, EObject process,
			EObject inFlow, EObject event) {
		if (!prevNode.equals(state)) {
			if (!prevNode.equals(process)) {
				if (!lastStep.equals(state)) {
					if (!lastStep.equals(prevNode)) {
						if (!lastStep.equals(pn2s)) {
							if (!lastStep.equals(process)) {
								if (!pn2s.equals(state)) {
									if (!pn2s.equals(prevNode)) {
										if (!pn2s.equals(process)) {
											if (!flow.equals(state)) {
												if (!flow.equals(prevNode)) {
													if (!flow.equals(lastStep)) {
														if (!flow.equals(pn2s)) {
															if (!flow.equals(process)) {
																if (!flow.equals(inFlow)) {
																	if (!process.equals(state)) {
																		if (!inFlow.equals(state)) {
																			if (!inFlow.equals(prevNode)) {
																				if (!inFlow.equals(lastStep)) {
																					if (!inFlow.equals(pn2s)) {
																						if (!inFlow.equals(process)) {
																							if (!event.equals(state)) {
																								if (!event.equals(
																										prevNode)) {
																									if (!event.equals(
																											lastStep)) {
																										if (!event
																												.equals(pn2s)) {
																											if (!event
																													.equals(flow)) {
																												if (!event
																														.equals(process)) {
																													if (!event
																															.equals(inFlow)) {
																														return new Object[] {
																																ruleresult,
																																state,
																																prevNode,
																																lastStep,
																																pn2s,
																																flow,
																																process,
																																inFlow,
																																event };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_1_3_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject state, EObject prevNode, EObject lastStep, EObject flow,
			EObject process, EObject inFlow, EObject event) {
		EMoflonEdge lastStep__state______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EndEvent2FinalStateGWSeq";
		String lastStep__state______last_name_prime = "__last";
		String flow__state____finalState_name_prime = "finalState";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String inFlow__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__inFlow____outgoing_name_prime = "outgoing";
		lastStep__state______last.setSrc(lastStep);
		lastStep__state______last.setTrg(state);
		ruleresult.getCreatedEdges().add(lastStep__state______last);
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		ruleresult.getCreatedEdges().add(flow__state____finalState);
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
		inFlow__prevNode____sourceRef.setSrc(inFlow);
		inFlow__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(inFlow__prevNode____sourceRef);
		prevNode__inFlow____outgoing.setSrc(prevNode);
		prevNode__inFlow____outgoing.setTrg(inFlow);
		ruleresult.getTranslatedEdges().add(prevNode__inFlow____outgoing);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		lastStep__state______last.setName(lastStep__state______last_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		inFlow__prevNode____sourceRef.setName(inFlow__prevNode____sourceRef_name_prime);
		prevNode__inFlow____outgoing.setName(prevNode__inFlow____outgoing_name_prime);
		return new Object[] { ruleresult, state, prevNode, lastStep, flow, process, inFlow, event,
				lastStep__state______last, flow__state____finalState, process__inFlow____flowElements,
				process__event____flowElements, inFlow__event____targetRef, event__inFlow____incoming,
				inFlow__prevNode____sourceRef, prevNode__inFlow____outgoing };
	}

	public static final void pattern_EndEvent2FinalStateGWSeq_1_5_expressionBBBBBBBBBB(EndEvent2FinalStateGWSeq _this,
			PerformRuleResult ruleresult, EObject state, EObject prevNode, EObject lastStep, EObject pn2s, EObject flow,
			EObject process, EObject inFlow, EObject event) {
		_this.registerObjects_FWD(ruleresult, state, prevNode, lastStep, pn2s, flow, process, inFlow, event);

	}

	public static final PerformRuleResult pattern_EndEvent2FinalStateGWSeq_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_1_blackFBB(EClass eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_2_1_binding = pattern_EndEvent2FinalStateGWSeq_2_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_2_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_2_1_black = pattern_EndEvent2FinalStateGWSeq_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EndEvent2FinalStateGWSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("inFlow");
		EObject _localVariable_3 = match.getObject("event");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpInFlow = _localVariable_2;
		EObject tmpEvent = _localVariable_3;
		if (tmpPrevNode instanceof Gateway) {
			Gateway prevNode = (Gateway) tmpPrevNode;
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

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_2_2_blackBFFBBBB(Gateway prevNode,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
			for (GW2S pn2s : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode, GW2S.class,
					"source")) {
				Step lastStep = pn2s.getTarget();
				if (lastStep != null) {
					_result.add(new Object[] { prevNode, lastStep, pn2s, process, inFlow, event, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_2_3_blackBBBFBBB(Gateway prevNode,
			Step lastStep, GW2S pn2s, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(pn2s.getSource())) {
			if (lastStep.equals(pn2s.getTarget())) {
				if (process.getFlowElements().contains(inFlow)) {
					if (process.getFlowElements().contains(event)) {
						if (process.getFlowElements().contains(prevNode)) {
							if (event.equals(inFlow.getTargetRef())) {
								if (prevNode.equals(inFlow.getSourceRef())) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
										for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(lastStep, Flow.class, "steps")) {
											_result.add(new Object[] { prevNode, lastStep, pn2s, flow, process, inFlow,
													event });
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_3_greenBBBBBBBFFFFFFFFFFF(Gateway prevNode,
			Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pn2s__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2s__lastStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__lastStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pn2s__prevNode____source_name_prime = "source";
		String pn2s__lastStep____target_name_prime = "target";
		String flow__lastStep____steps_name_prime = "steps";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String inFlow__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__inFlow____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(lastStep);
		isApplicableMatch.getAllContextElements().add(pn2s);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(event);
		pn2s__prevNode____source.setSrc(pn2s);
		pn2s__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2s__prevNode____source);
		pn2s__lastStep____target.setSrc(pn2s);
		pn2s__lastStep____target.setTrg(lastStep);
		isApplicableMatch.getAllContextElements().add(pn2s__lastStep____target);
		flow__lastStep____steps.setSrc(flow);
		flow__lastStep____steps.setTrg(lastStep);
		isApplicableMatch.getAllContextElements().add(flow__lastStep____steps);
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
		pn2s__prevNode____source.setName(pn2s__prevNode____source_name_prime);
		pn2s__lastStep____target.setName(pn2s__lastStep____target_name_prime);
		flow__lastStep____steps.setName(flow__lastStep____steps_name_prime);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		inFlow__prevNode____sourceRef.setName(inFlow__prevNode____sourceRef_name_prime);
		prevNode__inFlow____outgoing.setName(prevNode__inFlow____outgoing_name_prime);
		return new Object[] { prevNode, lastStep, pn2s, flow, process, inFlow, event, isApplicableMatch,
				pn2s__prevNode____source, pn2s__lastStep____target, flow__lastStep____steps,
				process__inFlow____flowElements, process__event____flowElements, process__prevNode____flowElements,
				inFlow__event____targetRef, event__inFlow____incoming, inFlow__prevNode____sourceRef,
				prevNode__inFlow____outgoing };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_4_bindingFBBBBBBBBB(EndEvent2FinalStateGWSeq _this,
			IsApplicableMatch isApplicableMatch, Gateway prevNode, Step lastStep, GW2S pn2s, Flow flow,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, lastStep, pn2s, flow,
				process, inFlow, event);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, lastStep, pn2s, flow, process, inFlow,
					event };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_4_bindingAndBlackFBBBBBBBBB(
			EndEvent2FinalStateGWSeq _this, IsApplicableMatch isApplicableMatch, Gateway prevNode, Step lastStep,
			GW2S pn2s, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_2_4_binding = pattern_EndEvent2FinalStateGWSeq_2_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, prevNode, lastStep, pn2s, flow, process, inFlow, event);
		if (result_pattern_EndEvent2FinalStateGWSeq_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateGWSeq_2_4_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_2_4_black = pattern_EndEvent2FinalStateGWSeq_2_4_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateGWSeq_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, lastStep, pn2s, flow, process, inFlow,
						event };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_2_5_expressionFBB(EndEvent2FinalStateGWSeq _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalStateGWSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEvent2FinalStateGWSeq_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_10_1_blackBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, UCCondition state, Step lastStep, Flow flow) {
		return new Object[] { _this, match, state, lastStep, flow };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_10_2_bindingFBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, UCCondition state, Step lastStep, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, state, lastStep, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, state, lastStep, flow };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_10_2_bindingAndBlackFBBBBB(
			EndEvent2FinalStateGWSeq _this, Match match, UCCondition state, Step lastStep, Flow flow) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_10_2_binding = pattern_EndEvent2FinalStateGWSeq_10_2_bindingFBBBBB(
				_this, match, state, lastStep, flow);
		if (result_pattern_EndEvent2FinalStateGWSeq_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateGWSeq_10_2_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_10_2_black = pattern_EndEvent2FinalStateGWSeq_10_2_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateGWSeq_10_2_black != null) {

				return new Object[] { csp, _this, match, state, lastStep, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_10_3_expressionFBB(EndEvent2FinalStateGWSeq _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_10_4_blackBBBB(Match match, UCCondition state,
			Step lastStep, Flow flow) {
		return new Object[] { match, state, lastStep, flow };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_10_4_greenBBBBFF(Match match, UCCondition state,
			Step lastStep, Flow flow) {
		EMoflonEdge lastStep__state______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(state);
		String lastStep__state______last_name_prime = "__last";
		String flow__state____finalState_name_prime = "finalState";
		lastStep__state______last.setSrc(lastStep);
		lastStep__state______last.setTrg(state);
		match.getToBeTranslatedEdges().add(lastStep__state______last);
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		match.getToBeTranslatedEdges().add(flow__state____finalState);
		lastStep__state______last.setName(lastStep__state______last_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		return new Object[] { match, state, lastStep, flow, lastStep__state______last, flow__state____finalState };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_10_5_blackBBBB(Match match, UCCondition state,
			Step lastStep, Flow flow) {
		return new Object[] { match, state, lastStep, flow };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_10_5_greenBBBF(Match match, Step lastStep,
			Flow flow) {
		EMoflonEdge flow__lastStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(lastStep);
		match.getContextNodes().add(flow);
		String flow__lastStep____steps_name_prime = "steps";
		flow__lastStep____steps.setSrc(flow);
		flow__lastStep____steps.setTrg(lastStep);
		match.getContextEdges().add(flow__lastStep____steps);
		flow__lastStep____steps.setName(flow__lastStep____steps_name_prime);
		return new Object[] { match, lastStep, flow, flow__lastStep____steps };
	}

	public static final void pattern_EndEvent2FinalStateGWSeq_10_6_expressionBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, UCCondition state, Step lastStep, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, state, lastStep, flow);

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("state");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("lastStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("pn2s");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject tmpState = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpLastStep = _localVariable_2;
		EObject tmpPn2s = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		if (tmpState instanceof UCCondition) {
			UCCondition state = (UCCondition) tmpState;
			if (tmpPrevNode instanceof Gateway) {
				Gateway prevNode = (Gateway) tmpPrevNode;
				if (tmpLastStep instanceof Step) {
					Step lastStep = (Step) tmpLastStep;
					if (tmpPn2s instanceof GW2S) {
						GW2S pn2s = (GW2S) tmpPn2s;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpProcess instanceof SimpleBPMN.Process) {
								SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
								return new Object[] { state, prevNode, lastStep, pn2s, flow, process,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_11_1_blackBBBBBBBFB(UCCondition state,
			Gateway prevNode, Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process,
			EndEvent2FinalStateGWSeq _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { state, prevNode, lastStep, pn2s, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_11_1_bindingAndBlackFFFFFFBFB(
			EndEvent2FinalStateGWSeq _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_11_1_binding = pattern_EndEvent2FinalStateGWSeq_11_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EndEvent2FinalStateGWSeq_11_1_binding != null) {
			UCCondition state = (UCCondition) result_pattern_EndEvent2FinalStateGWSeq_11_1_binding[0];
			Gateway prevNode = (Gateway) result_pattern_EndEvent2FinalStateGWSeq_11_1_binding[1];
			Step lastStep = (Step) result_pattern_EndEvent2FinalStateGWSeq_11_1_binding[2];
			GW2S pn2s = (GW2S) result_pattern_EndEvent2FinalStateGWSeq_11_1_binding[3];
			Flow flow = (Flow) result_pattern_EndEvent2FinalStateGWSeq_11_1_binding[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EndEvent2FinalStateGWSeq_11_1_binding[5];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_11_1_black = pattern_EndEvent2FinalStateGWSeq_11_1_blackBBBBBBBFB(
					state, prevNode, lastStep, pn2s, flow, process, _this, isApplicableMatch);
			if (result_pattern_EndEvent2FinalStateGWSeq_11_1_black != null) {
				CSP csp = (CSP) result_pattern_EndEvent2FinalStateGWSeq_11_1_black[7];

				return new Object[] { state, prevNode, lastStep, pn2s, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_11_1_greenBBFFB(Gateway prevNode,
			SimpleBPMN.Process process, CSP csp) {
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_11_2_blackBBB(UCCondition state, SequenceFlow inFlow,
			EndEvent event) {
		return new Object[] { state, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_11_2_greenFBBB(UCCondition state, SequenceFlow inFlow,
			EndEvent event) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(state);
		ruleresult.getCreatedElements().add(inFlow);
		ruleresult.getCreatedElements().add(event);
		return new Object[] { ruleresult, state, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_11_3_blackBBBBBBBBB(PerformRuleResult ruleresult,
			EObject state, EObject prevNode, EObject lastStep, EObject pn2s, EObject flow, EObject process,
			EObject inFlow, EObject event) {
		if (!prevNode.equals(state)) {
			if (!prevNode.equals(process)) {
				if (!lastStep.equals(state)) {
					if (!lastStep.equals(prevNode)) {
						if (!lastStep.equals(pn2s)) {
							if (!lastStep.equals(process)) {
								if (!pn2s.equals(state)) {
									if (!pn2s.equals(prevNode)) {
										if (!pn2s.equals(process)) {
											if (!flow.equals(state)) {
												if (!flow.equals(prevNode)) {
													if (!flow.equals(lastStep)) {
														if (!flow.equals(pn2s)) {
															if (!flow.equals(process)) {
																if (!flow.equals(inFlow)) {
																	if (!process.equals(state)) {
																		if (!inFlow.equals(state)) {
																			if (!inFlow.equals(prevNode)) {
																				if (!inFlow.equals(lastStep)) {
																					if (!inFlow.equals(pn2s)) {
																						if (!inFlow.equals(process)) {
																							if (!event.equals(state)) {
																								if (!event.equals(
																										prevNode)) {
																									if (!event.equals(
																											lastStep)) {
																										if (!event
																												.equals(pn2s)) {
																											if (!event
																													.equals(flow)) {
																												if (!event
																														.equals(process)) {
																													if (!event
																															.equals(inFlow)) {
																														return new Object[] {
																																ruleresult,
																																state,
																																prevNode,
																																lastStep,
																																pn2s,
																																flow,
																																process,
																																inFlow,
																																event };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_11_3_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject state, EObject prevNode, EObject lastStep, EObject flow,
			EObject process, EObject inFlow, EObject event) {
		EMoflonEdge lastStep__state______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__inFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EndEvent2FinalStateGWSeq";
		String lastStep__state______last_name_prime = "__last";
		String flow__state____finalState_name_prime = "finalState";
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String inFlow__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__inFlow____outgoing_name_prime = "outgoing";
		lastStep__state______last.setSrc(lastStep);
		lastStep__state______last.setTrg(state);
		ruleresult.getTranslatedEdges().add(lastStep__state______last);
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		ruleresult.getTranslatedEdges().add(flow__state____finalState);
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
		inFlow__prevNode____sourceRef.setSrc(inFlow);
		inFlow__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(inFlow__prevNode____sourceRef);
		prevNode__inFlow____outgoing.setSrc(prevNode);
		prevNode__inFlow____outgoing.setTrg(inFlow);
		ruleresult.getCreatedEdges().add(prevNode__inFlow____outgoing);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		lastStep__state______last.setName(lastStep__state______last_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		inFlow__prevNode____sourceRef.setName(inFlow__prevNode____sourceRef_name_prime);
		prevNode__inFlow____outgoing.setName(prevNode__inFlow____outgoing_name_prime);
		return new Object[] { ruleresult, state, prevNode, lastStep, flow, process, inFlow, event,
				lastStep__state______last, flow__state____finalState, process__inFlow____flowElements,
				process__event____flowElements, inFlow__event____targetRef, event__inFlow____incoming,
				inFlow__prevNode____sourceRef, prevNode__inFlow____outgoing };
	}

	public static final void pattern_EndEvent2FinalStateGWSeq_11_5_expressionBBBBBBBBBB(EndEvent2FinalStateGWSeq _this,
			PerformRuleResult ruleresult, EObject state, EObject prevNode, EObject lastStep, EObject pn2s, EObject flow,
			EObject process, EObject inFlow, EObject event) {
		_this.registerObjects_BWD(ruleresult, state, prevNode, lastStep, pn2s, flow, process, inFlow, event);

	}

	public static final PerformRuleResult pattern_EndEvent2FinalStateGWSeq_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_1_blackFBB(EClass eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_12_1_binding = pattern_EndEvent2FinalStateGWSeq_12_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_12_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_12_1_black = pattern_EndEvent2FinalStateGWSeq_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EndEvent2FinalStateGWSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("state");
		EObject _localVariable_1 = match.getObject("lastStep");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpState = _localVariable_0;
		EObject tmpLastStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpState instanceof UCCondition) {
			UCCondition state = (UCCondition) tmpState;
			if (tmpLastStep instanceof Step) {
				Step lastStep = (Step) tmpLastStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { state, lastStep, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_12_2_blackBFBFBB(UCCondition state,
			Step lastStep, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (GW2S pn2s : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(lastStep, GW2S.class,
				"target")) {
			Gateway prevNode = pn2s.getSource();
			if (prevNode != null) {
				boolean prevNodeisDiverging = prevNode.isIsDiverging();
				if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
					_result.add(new Object[] { state, prevNode, lastStep, pn2s, flow, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_12_3_blackBBBBBF(UCCondition state,
			Gateway prevNode, Step lastStep, GW2S pn2s, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (state.equals(lastStep.get__last())) {
			if (prevNode.equals(pn2s.getSource())) {
				if (lastStep.equals(pn2s.getTarget())) {
					if (flow.getSteps().contains(lastStep)) {
						if (state.equals(flow.getFinalState())) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
												"flowElements")) {
									_result.add(new Object[] { state, prevNode, lastStep, pn2s, flow, process });
								}
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_3_greenBBBBBBFFFFFFF(UCCondition state,
			Gateway prevNode, Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge lastStep__state______last = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2s__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2s__lastStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__lastStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String lastStep__state______last_name_prime = "__last";
		String pn2s__prevNode____source_name_prime = "source";
		String pn2s__lastStep____target_name_prime = "target";
		String flow__lastStep____steps_name_prime = "steps";
		String flow__state____finalState_name_prime = "finalState";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(state);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(lastStep);
		isApplicableMatch.getAllContextElements().add(pn2s);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		lastStep__state______last.setSrc(lastStep);
		lastStep__state______last.setTrg(state);
		isApplicableMatch.getAllContextElements().add(lastStep__state______last);
		pn2s__prevNode____source.setSrc(pn2s);
		pn2s__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2s__prevNode____source);
		pn2s__lastStep____target.setSrc(pn2s);
		pn2s__lastStep____target.setTrg(lastStep);
		isApplicableMatch.getAllContextElements().add(pn2s__lastStep____target);
		flow__lastStep____steps.setSrc(flow);
		flow__lastStep____steps.setTrg(lastStep);
		isApplicableMatch.getAllContextElements().add(flow__lastStep____steps);
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		isApplicableMatch.getAllContextElements().add(flow__state____finalState);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		lastStep__state______last.setName(lastStep__state______last_name_prime);
		pn2s__prevNode____source.setName(pn2s__prevNode____source_name_prime);
		pn2s__lastStep____target.setName(pn2s__lastStep____target_name_prime);
		flow__lastStep____steps.setName(flow__lastStep____steps_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { state, prevNode, lastStep, pn2s, flow, process, isApplicableMatch,
				lastStep__state______last, pn2s__prevNode____source, pn2s__lastStep____target, flow__lastStep____steps,
				flow__state____finalState, process__prevNode____flowElements };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_4_bindingFBBBBBBBB(EndEvent2FinalStateGWSeq _this,
			IsApplicableMatch isApplicableMatch, UCCondition state, Gateway prevNode, Step lastStep, GW2S pn2s,
			Flow flow, SimpleBPMN.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, state, prevNode, lastStep, pn2s, flow,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, state, prevNode, lastStep, pn2s, flow, process };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_4_bindingAndBlackFBBBBBBBB(
			EndEvent2FinalStateGWSeq _this, IsApplicableMatch isApplicableMatch, UCCondition state, Gateway prevNode,
			Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_12_4_binding = pattern_EndEvent2FinalStateGWSeq_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, state, prevNode, lastStep, pn2s, flow, process);
		if (result_pattern_EndEvent2FinalStateGWSeq_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateGWSeq_12_4_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_12_4_black = pattern_EndEvent2FinalStateGWSeq_12_4_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateGWSeq_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, state, prevNode, lastStep, pn2s, flow, process };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_12_5_expressionFBB(EndEvent2FinalStateGWSeq _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalStateGWSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEvent2FinalStateGWSeq_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_20_1_binding = pattern_EndEvent2FinalStateGWSeq_20_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_20_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_20_1_black = pattern_EndEvent2FinalStateGWSeq_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_2_black_nac_0B(UCCondition state) {
		for (UseCase __DEC_state_precondition_354665 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, UseCase.class, "precondition")) {
			return new Object[] { state };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_2_black_nac_1BB(UCCondition state, Flow flow) {
		for (Flow __DEC_state_finalState_347086 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_state_finalState_347086)) {
				return new Object[] { state, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_2_black_nac_2BB(UCCondition state, Step lastStep) {
		for (Step __DEC_state___last_216649 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(state,
				Step.class, "__last")) {
			if (!lastStep.equals(__DEC_state___last_216649)) {
				return new Object[] { state, lastStep };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_20_2_blackFFFB(EMoflonEdge _edge___last) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpLastStep = _edge___last.getSrc();
		if (tmpLastStep instanceof Step) {
			Step lastStep = (Step) tmpLastStep;
			EObject tmpState = _edge___last.getTrg();
			if (tmpState instanceof UCCondition) {
				UCCondition state = (UCCondition) tmpState;
				if (state.equals(lastStep.get__last())) {
					if (pattern_EndEvent2FinalStateGWSeq_20_2_black_nac_0B(state) == null) {
						if (pattern_EndEvent2FinalStateGWSeq_20_2_black_nac_2BB(state, lastStep) == null) {
							for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(lastStep, Flow.class, "steps")) {
								if (state.equals(flow.getFinalState())) {
									if (pattern_EndEvent2FinalStateGWSeq_20_2_black_nac_1BB(state, flow) == null) {
										_result.add(new Object[] { state, lastStep, flow, _edge___last });
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_20_3_expressionFBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, UCCondition state, Step lastStep, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, state, lastStep, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_20_4_expressionFBB(EndEvent2FinalStateGWSeq _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateGWSeq_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_21_1_binding = pattern_EndEvent2FinalStateGWSeq_21_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_21_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_21_1_black = pattern_EndEvent2FinalStateGWSeq_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_2_black_nac_0B(UCCondition state) {
		for (UseCase __DEC_state_precondition_944266 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, UseCase.class, "precondition")) {
			return new Object[] { state };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_2_black_nac_1BB(UCCondition state, Flow flow) {
		for (Flow __DEC_state_finalState_390502 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_state_finalState_390502)) {
				return new Object[] { state, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_2_black_nac_2BB(UCCondition state, Step lastStep) {
		for (Step __DEC_state___last_173057 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(state,
				Step.class, "__last")) {
			if (!lastStep.equals(__DEC_state___last_173057)) {
				return new Object[] { state, lastStep };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_21_2_blackFFFB(
			EMoflonEdge _edge_finalState) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_finalState.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpState = _edge_finalState.getTrg();
			if (tmpState instanceof UCCondition) {
				UCCondition state = (UCCondition) tmpState;
				if (state.equals(flow.getFinalState())) {
					if (pattern_EndEvent2FinalStateGWSeq_21_2_black_nac_0B(state) == null) {
						if (pattern_EndEvent2FinalStateGWSeq_21_2_black_nac_1BB(state, flow) == null) {
							for (Step lastStep : flow.getSteps()) {
								if (state.equals(lastStep.get__last())) {
									if (pattern_EndEvent2FinalStateGWSeq_21_2_black_nac_2BB(state, lastStep) == null) {
										_result.add(new Object[] { state, lastStep, flow, _edge_finalState });
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_21_3_expressionFBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, UCCondition state, Step lastStep, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, state, lastStep, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_21_4_expressionFBB(EndEvent2FinalStateGWSeq _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateGWSeq_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_22_1_binding = pattern_EndEvent2FinalStateGWSeq_22_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_22_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_22_1_black = pattern_EndEvent2FinalStateGWSeq_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_2_black_nac_0BB(SequenceFlow inFlow,
			Gateway prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_300961 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_300961)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_671254 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_671254)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_953931 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_953931)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_22_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
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
							FlowNode tmpPrevNode = inFlow.getSourceRef();
							if (tmpPrevNode instanceof Gateway) {
								Gateway prevNode = (Gateway) tmpPrevNode;
								if (process.getFlowElements().contains(prevNode)) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
										if (pattern_EndEvent2FinalStateGWSeq_22_2_black_nac_1BB(inFlow,
												process) == null) {
											if (pattern_EndEvent2FinalStateGWSeq_22_2_black_nac_2BB(event,
													process) == null) {
												if (pattern_EndEvent2FinalStateGWSeq_22_2_black_nac_0BB(inFlow,
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_22_3_expressionFBBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_22_4_expressionFBB(EndEvent2FinalStateGWSeq _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateGWSeq_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_23_1_binding = pattern_EndEvent2FinalStateGWSeq_23_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_23_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_23_1_black = pattern_EndEvent2FinalStateGWSeq_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_2_black_nac_0BB(SequenceFlow inFlow,
			Gateway prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_11365 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_11365)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_774198 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_774198)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_848319 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_848319)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_23_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpEvent = _edge_flowElements.getTrg();
			if (tmpEvent instanceof EndEvent) {
				EndEvent event = (EndEvent) tmpEvent;
				if (process.getFlowElements().contains(event)) {
					if (pattern_EndEvent2FinalStateGWSeq_23_2_black_nac_2BB(event, process) == null) {
						for (FlowElement tmpInFlow : process.getFlowElements()) {
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (event.equals(inFlow.getTargetRef())) {
									FlowNode tmpPrevNode = inFlow.getSourceRef();
									if (tmpPrevNode instanceof Gateway) {
										Gateway prevNode = (Gateway) tmpPrevNode;
										if (process.getFlowElements().contains(prevNode)) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
												if (pattern_EndEvent2FinalStateGWSeq_23_2_black_nac_1BB(inFlow,
														process) == null) {
													if (pattern_EndEvent2FinalStateGWSeq_23_2_black_nac_0BB(inFlow,
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_23_3_expressionFBBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_23_4_expressionFBB(EndEvent2FinalStateGWSeq _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateGWSeq_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_24_1_binding = pattern_EndEvent2FinalStateGWSeq_24_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_24_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_24_1_black = pattern_EndEvent2FinalStateGWSeq_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_2_black_nac_0BB(SequenceFlow inFlow,
			Gateway prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_675426 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_675426)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_537587 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_537587)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_994259 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_994259)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_24_2_blackFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpEvent = _edge_targetRef.getTrg();
			if (tmpEvent instanceof EndEvent) {
				EndEvent event = (EndEvent) tmpEvent;
				if (event.equals(inFlow.getTargetRef())) {
					FlowNode tmpPrevNode = inFlow.getSourceRef();
					if (tmpPrevNode instanceof Gateway) {
						Gateway prevNode = (Gateway) tmpPrevNode;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
							if (pattern_EndEvent2FinalStateGWSeq_24_2_black_nac_0BB(inFlow, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(event)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (pattern_EndEvent2FinalStateGWSeq_24_2_black_nac_1BB(inFlow,
													process) == null) {
												if (pattern_EndEvent2FinalStateGWSeq_24_2_black_nac_2BB(event,
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_24_3_expressionFBBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_24_4_expressionFBB(EndEvent2FinalStateGWSeq _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateGWSeq_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_25_1_binding = pattern_EndEvent2FinalStateGWSeq_25_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_25_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_25_1_black = pattern_EndEvent2FinalStateGWSeq_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_2_black_nac_0BB(SequenceFlow inFlow,
			Gateway prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_579837 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_579837)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_839093 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_839093)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_637675 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_637675)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_25_2_blackFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEvent = _edge_incoming.getSrc();
		if (tmpEvent instanceof EndEvent) {
			EndEvent event = (EndEvent) tmpEvent;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (event.equals(inFlow.getTargetRef())) {
					FlowNode tmpPrevNode = inFlow.getSourceRef();
					if (tmpPrevNode instanceof Gateway) {
						Gateway prevNode = (Gateway) tmpPrevNode;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
							if (pattern_EndEvent2FinalStateGWSeq_25_2_black_nac_0BB(inFlow, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(inFlow)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (pattern_EndEvent2FinalStateGWSeq_25_2_black_nac_1BB(inFlow,
													process) == null) {
												if (pattern_EndEvent2FinalStateGWSeq_25_2_black_nac_2BB(event,
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_25_3_expressionFBBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_25_4_expressionFBB(EndEvent2FinalStateGWSeq _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_25_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateGWSeq_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_26_1_binding = pattern_EndEvent2FinalStateGWSeq_26_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_26_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_26_1_black = pattern_EndEvent2FinalStateGWSeq_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_2_black_nac_0BB(SequenceFlow inFlow,
			Gateway prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_298703 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_298703)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_9338 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_9338)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_112513 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_112513)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_26_2_blackFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_sourceRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof Gateway) {
				Gateway prevNode = (Gateway) tmpPrevNode;
				if (prevNode.equals(inFlow.getSourceRef())) {
					FlowNode tmpEvent = inFlow.getTargetRef();
					if (tmpEvent instanceof EndEvent) {
						EndEvent event = (EndEvent) tmpEvent;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
							if (pattern_EndEvent2FinalStateGWSeq_26_2_black_nac_0BB(inFlow, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(event)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (pattern_EndEvent2FinalStateGWSeq_26_2_black_nac_1BB(inFlow,
													process) == null) {
												if (pattern_EndEvent2FinalStateGWSeq_26_2_black_nac_2BB(event,
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_26_3_expressionFBBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_26_4_expressionFBB(EndEvent2FinalStateGWSeq _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_26_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateGWSeq_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_1_bindingFB(EndEvent2FinalStateGWSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_1_blackFBB(EClass __eClass,
			EndEvent2FinalStateGWSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_1_bindingAndBlackFFB(
			EndEvent2FinalStateGWSeq _this) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_27_1_binding = pattern_EndEvent2FinalStateGWSeq_27_1_bindingFB(
				_this);
		if (result_pattern_EndEvent2FinalStateGWSeq_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalStateGWSeq_27_1_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_27_1_black = pattern_EndEvent2FinalStateGWSeq_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EndEvent2FinalStateGWSeq_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalStateGWSeq_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_2_black_nac_0BB(SequenceFlow inFlow,
			Gateway prevNode) {
		for (ExclusiveGateway __DEC_inFlow_default_877188 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_inFlow_default_877188)) {
				return new Object[] { inFlow, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_2_black_nac_1BB(SequenceFlow inFlow,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_inFlow_flowElements_437250 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_inFlow_flowElements_437250)) {
				return new Object[] { inFlow, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_2_black_nac_2BB(EndEvent event,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_event_flowElements_372771 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_event_flowElements_372771)) {
				return new Object[] { event, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_27_2_blackFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof Gateway) {
			Gateway prevNode = (Gateway) tmpPrevNode;
			EObject tmpInFlow = _edge_outgoing.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (prevNode.equals(inFlow.getSourceRef())) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
						FlowNode tmpEvent = inFlow.getTargetRef();
						if (tmpEvent instanceof EndEvent) {
							EndEvent event = (EndEvent) tmpEvent;
							if (pattern_EndEvent2FinalStateGWSeq_27_2_black_nac_0BB(inFlow, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
												"flowElements")) {
									if (process.getFlowElements().contains(inFlow)) {
										if (process.getFlowElements().contains(event)) {
											if (pattern_EndEvent2FinalStateGWSeq_27_2_black_nac_1BB(inFlow,
													process) == null) {
												if (pattern_EndEvent2FinalStateGWSeq_27_2_black_nac_2BB(event,
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_27_3_expressionFBBBBBB(EndEvent2FinalStateGWSeq _this,
			Match match, Gateway prevNode, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_27_4_expressionFBB(EndEvent2FinalStateGWSeq _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_27_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalStateGWSeq_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_30_1_blackB(EndEvent2FinalStateGWSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_30_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_30_2_bindingFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("state");
		EObject _localVariable_1 = sourceMatch.getObject("prevNode");
		EObject _localVariable_2 = targetMatch.getObject("lastStep");
		EObject _localVariable_3 = targetMatch.getObject("flow");
		EObject _localVariable_4 = sourceMatch.getObject("process");
		EObject _localVariable_5 = sourceMatch.getObject("inFlow");
		EObject _localVariable_6 = sourceMatch.getObject("event");
		EObject tmpState = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpLastStep = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpInFlow = _localVariable_5;
		EObject tmpEvent = _localVariable_6;
		if (tmpState instanceof UCCondition) {
			UCCondition state = (UCCondition) tmpState;
			if (tmpPrevNode instanceof Gateway) {
				Gateway prevNode = (Gateway) tmpPrevNode;
				if (tmpLastStep instanceof Step) {
					Step lastStep = (Step) tmpLastStep;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpInFlow instanceof SequenceFlow) {
								SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
								if (tmpEvent instanceof EndEvent) {
									EndEvent event = (EndEvent) tmpEvent;
									return new Object[] { state, prevNode, lastStep, flow, process, inFlow, event,
											targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_30_2_blackBBBFBBBBBB(UCCondition state,
			Gateway prevNode, Step lastStep, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (state.equals(lastStep.get__last())) {
				if (flow.getSteps().contains(lastStep)) {
					if (state.equals(flow.getFinalState())) {
						if (process.getFlowElements().contains(inFlow)) {
							if (process.getFlowElements().contains(event)) {
								if (process.getFlowElements().contains(prevNode)) {
									if (event.equals(inFlow.getTargetRef())) {
										if (prevNode.equals(inFlow.getSourceRef())) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
												for (GW2S pn2s : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(prevNode, GW2S.class, "source")) {
													if (lastStep.equals(pn2s.getTarget())) {
														_result.add(new Object[] { state, prevNode, lastStep, pn2s,
																flow, process, inFlow, event, sourceMatch,
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
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_30_2_greenBBBBBBBBBBF(UCCondition state,
			Gateway prevNode, Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow,
			EndEvent event, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalStateGWSeq";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(event);
		isApplicableMatch.getAllContextElements().add(state);
		isApplicableMatch.getAllContextElements().add(lastStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(pn2s);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { state, prevNode, lastStep, pn2s, flow, process, inFlow, event, sourceMatch, targetMatch,
				isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_30_3_bindingFBBBBBBBBBBBB(
			EndEvent2FinalStateGWSeq _this, IsApplicableMatchCC isApplicableMatch, UCCondition state, Gateway prevNode,
			Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, state, prevNode, lastStep, pn2s, flow,
				process, inFlow, event, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, state, prevNode, lastStep, pn2s, flow, process, inFlow,
					event, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_30_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_30_3_bindingAndBlackFBBBBBBBBBBBB(
			EndEvent2FinalStateGWSeq _this, IsApplicableMatchCC isApplicableMatch, UCCondition state, Gateway prevNode,
			Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_30_3_binding = pattern_EndEvent2FinalStateGWSeq_30_3_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, state, prevNode, lastStep, pn2s, flow, process, inFlow, event, sourceMatch,
				targetMatch);
		if (result_pattern_EndEvent2FinalStateGWSeq_30_3_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateGWSeq_30_3_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_30_3_black = pattern_EndEvent2FinalStateGWSeq_30_3_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateGWSeq_30_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, state, prevNode, lastStep, pn2s, flow, process,
						inFlow, event, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_30_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_30_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalStateGWSeq";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEvent2FinalStateGWSeq_30_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_33_1_blackB(EndEvent2FinalStateGWSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_33_2_bindingFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("state");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("lastStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("pn2s");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("event");
		EObject tmpState = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpLastStep = _localVariable_2;
		EObject tmpPn2s = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpInFlow = _localVariable_6;
		EObject tmpEvent = _localVariable_7;
		if (tmpState instanceof UCCondition) {
			UCCondition state = (UCCondition) tmpState;
			if (tmpPrevNode instanceof Gateway) {
				Gateway prevNode = (Gateway) tmpPrevNode;
				if (tmpLastStep instanceof Step) {
					Step lastStep = (Step) tmpLastStep;
					if (tmpPn2s instanceof GW2S) {
						GW2S pn2s = (GW2S) tmpPn2s;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpProcess instanceof SimpleBPMN.Process) {
								SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
								if (tmpInFlow instanceof SequenceFlow) {
									SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
									if (tmpEvent instanceof EndEvent) {
										EndEvent event = (EndEvent) tmpEvent;
										return new Object[] { state, prevNode, lastStep, pn2s, flow, process, inFlow,
												event, isApplicableMatch };
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_33_2_blackBBBBBBBBB(UCCondition state,
			Gateway prevNode, Step lastStep, GW2S pn2s, Flow flow, SimpleBPMN.Process process, SequenceFlow inFlow,
			EndEvent event, IsApplicableMatchCC isApplicableMatch) {
		if (state.equals(lastStep.get__last())) {
			if (prevNode.equals(pn2s.getSource())) {
				if (lastStep.equals(pn2s.getTarget())) {
					if (flow.getSteps().contains(lastStep)) {
						if (state.equals(flow.getFinalState())) {
							if (process.getFlowElements().contains(inFlow)) {
								if (process.getFlowElements().contains(event)) {
									if (process.getFlowElements().contains(prevNode)) {
										if (event.equals(inFlow.getTargetRef())) {
											if (prevNode.equals(inFlow.getSourceRef())) {
												boolean prevNodeisDiverging = prevNode.isIsDiverging();
												if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
													return new Object[] { state, prevNode, lastStep, pn2s, flow,
															process, inFlow, event, isApplicableMatch };
												}

											}
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

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_33_2_bindingAndBlackFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_33_2_binding = pattern_EndEvent2FinalStateGWSeq_33_2_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EndEvent2FinalStateGWSeq_33_2_binding != null) {
			UCCondition state = (UCCondition) result_pattern_EndEvent2FinalStateGWSeq_33_2_binding[0];
			Gateway prevNode = (Gateway) result_pattern_EndEvent2FinalStateGWSeq_33_2_binding[1];
			Step lastStep = (Step) result_pattern_EndEvent2FinalStateGWSeq_33_2_binding[2];
			GW2S pn2s = (GW2S) result_pattern_EndEvent2FinalStateGWSeq_33_2_binding[3];
			Flow flow = (Flow) result_pattern_EndEvent2FinalStateGWSeq_33_2_binding[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EndEvent2FinalStateGWSeq_33_2_binding[5];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEvent2FinalStateGWSeq_33_2_binding[6];
			EndEvent event = (EndEvent) result_pattern_EndEvent2FinalStateGWSeq_33_2_binding[7];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_33_2_black = pattern_EndEvent2FinalStateGWSeq_33_2_blackBBBBBBBBB(
					state, prevNode, lastStep, pn2s, flow, process, inFlow, event, isApplicableMatch);
			if (result_pattern_EndEvent2FinalStateGWSeq_33_2_black != null) {

				return new Object[] { state, prevNode, lastStep, pn2s, flow, process, inFlow, event,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_33_2_greenF() {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { result };
	}

	public static final PerformRuleResult pattern_EndEvent2FinalStateGWSeq_33_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_1_blackB(EndEvent2FinalStateGWSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Gateway prevNode) {
		if (ruleResult.getSourceObjects().contains(prevNode)) {
			return new Object[] { ruleResult, prevNode };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, GW2S pn2s) {
		if (ruleResult.getCorrObjects().contains(pn2s)) {
			return new Object[] { ruleResult, pn2s };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Step lastStep) {
		if (ruleResult.getTargetObjects().contains(lastStep)) {
			return new Object[] { ruleResult, lastStep };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalStateGWSeq_34_2_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList pn2sList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpPn2s : pn2sList.getEntryObjects()) {
				if (tmpPn2s instanceof GW2S) {
					GW2S pn2s = (GW2S) tmpPn2s;
					Gateway prevNode = pn2s.getSource();
					if (prevNode != null) {
						Step lastStep = pn2s.getTarget();
						if (lastStep != null) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
								if (pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_1BB(ruleResult, pn2s) == null) {
									if (pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_0BB(ruleResult,
											prevNode) == null) {
										if (pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_2BB(ruleResult,
												lastStep) == null) {
											for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
															"flowElements")) {
												if (pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_4BB(ruleResult,
														process) == null) {
													for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(lastStep, Flow.class, "steps")) {
														if (pattern_EndEvent2FinalStateGWSeq_34_2_black_nac_3BB(
																ruleResult, flow) == null) {
															_result.add(new Object[] { pn2sList, prevNode, pn2s,
																	lastStep, flow, process, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_3_bindingFBBBBBBBB(EndEvent2FinalStateGWSeq _this,
			IsApplicableMatch isApplicableMatch, Gateway prevNode, Step lastStep, GW2S pn2s, Flow flow,
			SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, prevNode, lastStep, pn2s, flow,
				process, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, lastStep, pn2s, flow, process, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_3_bindingAndBlackFBBBBBBBB(
			EndEvent2FinalStateGWSeq _this, IsApplicableMatch isApplicableMatch, Gateway prevNode, Step lastStep,
			GW2S pn2s, Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EndEvent2FinalStateGWSeq_34_3_binding = pattern_EndEvent2FinalStateGWSeq_34_3_bindingFBBBBBBBB(
				_this, isApplicableMatch, prevNode, lastStep, pn2s, flow, process, ruleResult);
		if (result_pattern_EndEvent2FinalStateGWSeq_34_3_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalStateGWSeq_34_3_binding[0];

			Object[] result_pattern_EndEvent2FinalStateGWSeq_34_3_black = pattern_EndEvent2FinalStateGWSeq_34_3_blackB(
					csp);
			if (result_pattern_EndEvent2FinalStateGWSeq_34_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, lastStep, pn2s, flow, process,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalStateGWSeq_34_4_expressionFBB(EndEvent2FinalStateGWSeq _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_5_blackBBBBB(Gateway prevNode, Step lastStep,
			GW2S pn2s, Flow flow, SimpleBPMN.Process process) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
			return new Object[] { prevNode, lastStep, pn2s, flow, process };
		}

		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_6_blackBBBBBB(Gateway prevNode, Step lastStep,
			GW2S pn2s, Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
			return new Object[] { prevNode, lastStep, pn2s, flow, process, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_EndEvent2FinalStateGWSeq_34_6_greenFBBBBFFBB(Gateway prevNode, Step lastStep,
			Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult, CSP csp) {
		UCCondition state = SimpleUseCaseFactory.eINSTANCE.createUCCondition();
		SequenceFlow inFlow = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		EndEvent event = SimpleBPMNFactory.eINSTANCE.createEndEvent();
		Object _localVariable_0 = csp.getValue("state", "name");
		Object _localVariable_1 = csp.getValue("event", "id");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		lastStep.set__last(state);
		flow.setFinalState(state);
		ruleResult.getTargetObjects().add(state);
		process.getFlowElements().add(inFlow);
		inFlow.setSourceRef(prevNode);
		ruleResult.getSourceObjects().add(inFlow);
		process.getFlowElements().add(event);
		inFlow.setTargetRef(event);
		ruleResult.getSourceObjects().add(event);
		String state_name_prime = (String) _localVariable_0;
		String event_id_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		state.setName(state_name_prime);
		event.setId(event_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { state, prevNode, lastStep, flow, process, inFlow, event, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EndEvent2FinalStateGWSeq_34_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EndEvent2FinalStateGWSeqImpl
