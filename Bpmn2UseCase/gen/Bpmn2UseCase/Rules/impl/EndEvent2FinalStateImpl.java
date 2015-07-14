/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.EE2FS;
import Bpmn2UseCase.P2UC;

import Bpmn2UseCase.Rules.EndEvent2FinalState;
import Bpmn2UseCase.Rules.RulesPackage;

import Bpmn2UseCase.SF2F;

import SimpleBPMN.EndEvent;
import SimpleBPMN.FlowElement;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

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
 * An implementation of the model object '<em><b>End Event2 Final State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EndEvent2FinalStateImpl extends AbstractRuleImpl implements EndEvent2FinalState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEvent2FinalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEndEvent2FinalState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		// initial bindings
		Object[] result1_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_0_1_blackBBBBB(this, match,
				process, inFlow, event);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", "
					+ "[inFlow] = " + inFlow + ", " + "[event] = " + event + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_0_2_bindingAndBlackFBBBBB(this, match, process, inFlow, event);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[inFlow] = "
					+ inFlow + ", " + "[event] = " + event + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_0_4_blackBBBB(match, process,
					inFlow, event);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[inFlow] = "
						+ inFlow + ", " + "[event] = " + event + ".");
			}
			EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_0_4_greenBBBBFFF(match, process, inFlow, event);
			// EMoflonEdge process__event____flowElements = (EMoflonEdge) result4_green[4];
			// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result4_green[5];
			// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result4_green[6];

			// collect context elements
			Object[] result5_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_0_5_blackBBBB(match, process,
					inFlow, event);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[inFlow] = "
						+ inFlow + ", " + "[event] = " + event + ".");
			}
			EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_0_5_greenBBBF(match, process, inFlow);
			// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_0_6_expressionBBBBB(this, match, process, inFlow,
					event);
			return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_0_7_expressionF();
		} else {
			return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_1_1_bindingAndBlackFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		P2UC _p2uc = (P2UC) result1_bindingAndBlack[2];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		SF2F _if2f = (SF2F) result1_bindingAndBlack[5];
		EndEvent event = (EndEvent) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_1_1_greenBBFFB(flow, event, csp);
		UCCondition state = (UCCondition) result1_green[2];
		EE2FS _e2s = (EE2FS) result1_green[3];

		// collect translated elements
		Object[] result2_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_1_2_blackBBB(event, state, _e2s);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[event] = " + event + ", " + "[state] = " + state + ", " + "[_e2s] = " + _e2s + ".");
		}
		Object[] result2_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_1_2_greenFBBB(event, state, _e2s);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_1_3_blackBBBBBBBBBB(ruleresult,
				process, useCase, _p2uc, inFlow, flow, _if2f, event, state, _e2s);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[_p2uc] = " + _p2uc + ", " + "[inFlow] = " + inFlow + ", " + "[flow] = " + flow + ", "
					+ "[_if2f] = " + _if2f + ", " + "[event] = " + event + ", " + "[state] = " + state + ", "
					+ "[_e2s] = " + _e2s + ".");
		}
		EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_1_3_greenBBBBBBBFFFFFF(ruleresult, process, inFlow, flow,
				event, state, _e2s);
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _e2s__event____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _e2s__state____target = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_1_5_expressionBBBBBBBBBBB(this, ruleresult, process,
				useCase, _p2uc, inFlow, flow, _if2f, event, state, _e2s);
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[1];
		EndEvent event = (EndEvent) result2_binding[2];
		for (Object[] result2_black : EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_2_2_blackBFFBFFBB(process,
				inFlow, event, match)) {
			UseCase useCase = (UseCase) result2_black[1];
			P2UC _p2uc = (P2UC) result2_black[2];
			Flow flow = (Flow) result2_black[4];
			SF2F _if2f = (SF2F) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_2_3_blackBBBBBBB(process,
					useCase, _p2uc, inFlow, flow, _if2f, event)) {
				Object[] result3_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_2_3_greenBBBBBBBFFFFFFFFFF(
						process, useCase, _p2uc, inFlow, flow, _if2f, event);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[9];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _p2uc__process____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _p2uc__useCase____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge _if2f__inFlow____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge _if2f__flow____target = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = EndEvent2FinalStateImpl
						.pattern_EndEvent2FinalState_2_4_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, process,
								useCase, _p2uc, inFlow, flow, _if2f, event);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc
							+ ", " + "[inFlow] = " + inFlow + ", " + "[flow] = " + flow + ", " + "[_if2f] = " + _if2f
							+ ", " + "[event] = " + event + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SimpleBPMN.Process process, SequenceFlow inFlow,
			EndEvent event) {
		match.registerObject("process", process);
		match.registerObject("inFlow", inFlow);
		match.registerObject("event", event);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SimpleBPMN.Process process, SequenceFlow inFlow,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event) {// Create CSP
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
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("_p2uc", _p2uc);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject process, EObject useCase, EObject _p2uc,
			EObject inFlow, EObject flow, EObject _if2f, EObject event, EObject state, EObject _e2s) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("_p2uc", _p2uc);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("flow", flow);
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
	public boolean isAppropriate_BWD(Match match, UseCase useCase, Flow flow, UCCondition state) {
		// initial bindings
		Object[] result1_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_10_1_blackBBBBB(this, match,
				useCase, flow, state);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", "
					+ "[flow] = " + flow + ", " + "[state] = " + state + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_10_2_bindingAndBlackFBBBBB(this, match, useCase, flow, state);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[flow] = " + flow
					+ ", " + "[state] = " + state + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_10_4_blackBBBB(match, useCase,
					flow, state);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[flow] = "
						+ flow + ", " + "[state] = " + state + ".");
			}
			EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_10_4_greenBBBF(match, flow, state);
			// EMoflonEdge flow__state____finalState = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_10_5_blackBBBB(match, useCase,
					flow, state);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[flow] = "
						+ flow + ", " + "[state] = " + state + ".");
			}
			EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_10_5_greenBBBF(match, useCase, flow);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[3];

			// register objects to match
			EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_10_6_expressionBBBBB(this, match, useCase, flow, state);
			return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_10_7_expressionF();
		} else {
			return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_11_1_bindingAndBlackFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		P2UC _p2uc = (P2UC) result1_bindingAndBlack[2];
		SequenceFlow inFlow = (SequenceFlow) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		SF2F _if2f = (SF2F) result1_bindingAndBlack[5];
		UCCondition state = (UCCondition) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_11_1_greenBBFBFB(process, inFlow,
				state, csp);
		EndEvent event = (EndEvent) result1_green[2];
		EE2FS _e2s = (EE2FS) result1_green[4];

		// collect translated elements
		Object[] result2_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_11_2_blackBBB(event, state, _e2s);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[event] = " + event + ", " + "[state] = " + state + ", " + "[_e2s] = " + _e2s + ".");
		}
		Object[] result2_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_11_2_greenFBBB(event, state, _e2s);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_11_3_blackBBBBBBBBBB(ruleresult,
				process, useCase, _p2uc, inFlow, flow, _if2f, event, state, _e2s);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[_p2uc] = " + _p2uc + ", " + "[inFlow] = " + inFlow + ", " + "[flow] = " + flow + ", "
					+ "[_if2f] = " + _if2f + ", " + "[event] = " + event + ", " + "[state] = " + state + ", "
					+ "[_e2s] = " + _e2s + ".");
		}
		EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_11_3_greenBBBBBBBFFFFFF(ruleresult, process, inFlow, flow,
				event, state, _e2s);
				// EMoflonEdge process__event____flowElements = (EMoflonEdge) result3_green[7];
				// EMoflonEdge inFlow__event____targetRef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge event__inFlow____incoming = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _e2s__event____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _e2s__state____target = (EMoflonEdge) result3_green[12];

		// perform postprocessing story node is empty
		// register objects
		EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_11_5_expressionBBBBBBBBBBB(this, ruleresult, process,
				useCase, _p2uc, inFlow, flow, _if2f, event, state, _e2s);
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		UCCondition state = (UCCondition) result2_binding[2];
		for (Object[] result2_black : EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_12_2_blackFBFFBFBB(useCase,
				flow, state, match)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			P2UC _p2uc = (P2UC) result2_black[2];
			SequenceFlow inFlow = (SequenceFlow) result2_black[3];
			SF2F _if2f = (SF2F) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_12_3_blackBBBBBBB(process,
					useCase, _p2uc, inFlow, flow, _if2f, state)) {
				Object[] result3_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_12_3_greenBBBBBBBFFFFFFFF(
						process, useCase, _p2uc, inFlow, flow, _if2f, state);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge process__inFlow____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[9];
				// EMoflonEdge _p2uc__process____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _p2uc__useCase____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__state____finalState = (EMoflonEdge) result3_green[12];
				// EMoflonEdge _if2f__inFlow____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge _if2f__flow____target = (EMoflonEdge) result3_green[14];

				// solve CSP
				Object[] result4_bindingAndBlack = EndEvent2FinalStateImpl
						.pattern_EndEvent2FinalState_12_4_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, process,
								useCase, _p2uc, inFlow, flow, _if2f, state);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc
							+ ", " + "[inFlow] = " + inFlow + ", " + "[flow] = " + flow + ", " + "[_if2f] = " + _if2f
							+ ", " + "[state] = " + state + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EndEvent2FinalStateImpl
							.pattern_EndEvent2FinalState_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase, Flow flow, UCCondition state) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("state", state);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase, Flow flow, UCCondition state) {// Create CSP
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
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, UCCondition state) {// Create CSP
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
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("_p2uc", _p2uc);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject process, EObject useCase, EObject _p2uc,
			EObject inFlow, EObject flow, EObject _if2f, EObject event, EObject state, EObject _e2s) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("_p2uc", _p2uc);
		ruleresult.registerObject("inFlow", inFlow);
		ruleresult.registerObject("flow", flow);
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_151(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_20_2_blackFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent event = (EndEvent) result2_black[2];
			Object[] result2_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_20_3_expressionFBBBBB(this, match, process, inFlow,
					event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_152(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_21_2_blackFFFB(_edge_targetRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent event = (EndEvent) result2_black[2];
			Object[] result2_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_21_3_expressionFBBBBB(this, match, process, inFlow,
					event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_153(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_22_2_blackFFFB(_edge_incoming)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			SequenceFlow inFlow = (SequenceFlow) result2_black[1];
			EndEvent event = (EndEvent) result2_black[2];
			Object[] result2_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_22_3_expressionFBBBBB(this, match, process, inFlow,
					event)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_45(EMoflonEdge _edge_finalState) {
		// prepare return value
		Object[] result1_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_23_2_blackFFFB(_edge_finalState)) {
			UseCase useCase = (UseCase) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			UCCondition state = (UCCondition) result2_black[2];
			Object[] result2_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_23_3_expressionFBBBBB(this, match, useCase, flow,
					state)) {
				// Ensure that the correct types of elements are matched
				if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EndEvent2FinalState");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_p2uc = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_p2uc")).findAny();
		Bpmn2UseCase.P2UC _p2uc = (Bpmn2UseCase.P2UC) matchFor_p2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForInFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("inFlow")).findAny();
		SimpleBPMN.SequenceFlow inFlow = (SimpleBPMN.SequenceFlow) matchForInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

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

		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("String");

		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state", true, csp);
		var_state_name.setValue(state.getName());
		var_state_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("EndEvent2FinalState");
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
		ruleResult.setRule("EndEvent2FinalState");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_p2uc = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_p2uc")).findAny();
		Bpmn2UseCase.P2UC _p2uc = (Bpmn2UseCase.P2UC) matchFor_p2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForInFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("inFlow")).findAny();
		SimpleBPMN.SequenceFlow inFlow = (SimpleBPMN.SequenceFlow) matchForInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

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

		Variable var_event_id = CSPFactoryHelper.eINSTANCE.createVariable("event", true, csp);
		var_event_id.setValue(event.getId());
		var_event_id.setType("String");

		Variable var_state_name = CSPFactoryHelper.eINSTANCE.createVariable("state", true, csp);
		var_state_name.setValue(state.getName());
		var_state_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("EndEvent2FinalState");
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
		Object[] result1_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_26_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_26_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_26_2_bindingFFFFFFBB(sourceMatch,
				targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		SequenceFlow inFlow = (SequenceFlow) result2_binding[2];
		Flow flow = (Flow) result2_binding[3];
		EndEvent event = (EndEvent) result2_binding[4];
		UCCondition state = (UCCondition) result2_binding[5];
		for (Object[] result2_black : EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_26_2_blackBBFBBFBBBB(process,
				useCase, inFlow, flow, event, state, sourceMatch, targetMatch)) {
			P2UC _p2uc = (P2UC) result2_black[2];
			SF2F _if2f = (SF2F) result2_black[5];
			Object[] result2_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_26_2_greenBBBBBBBBBFB(process,
					useCase, _p2uc, inFlow, flow, _if2f, event, state, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[9];

			// check csp
			Object[] result3_bindingAndBlack = EndEvent2FinalStateImpl
					.pattern_EndEvent2FinalState_26_3_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, process,
							useCase, _p2uc, inFlow, flow, _if2f, event, state, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_26_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_26_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_26_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event, UCCondition state,
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
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("_p2uc", _p2uc);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
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
		Object[] result1_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_29_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_29_2_bindingAndBlackFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[0];
		// UseCase useCase = (UseCase) result2_bindingAndBlack[1];
		// P2UC _p2uc = (P2UC) result2_bindingAndBlack[2];
		// SequenceFlow inFlow = (SequenceFlow) result2_bindingAndBlack[3];
		// Flow flow = (Flow) result2_bindingAndBlack[4];
		// SF2F _if2f = (SF2F) result2_bindingAndBlack[5];
		EndEvent event = (EndEvent) result2_bindingAndBlack[6];
		UCCondition state = (UCCondition) result2_bindingAndBlack[7];
		Object[] result2_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_29_2_greenBBFF(event, state);
		PerformRuleResult result = (PerformRuleResult) result2_green[2];
		// EE2FS _e2s = (EE2FS) result2_green[3];

		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_29_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, SF2F _if2fParameter) {
		// create result
		Object[] result1_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_30_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_30_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EndEvent2FinalStateImpl
				.pattern_EndEvent2FinalState_30_2_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList _if2fList = (RuleEntryList) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow inFlow = (SequenceFlow) result2_black[2];
			SF2F _if2f = (SF2F) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			UseCase useCase = (UseCase) result2_black[5];
			P2UC _p2uc = (P2UC) result2_black[6];

			// solve CSP
			Object[] result3_bindingAndBlack = EndEvent2FinalStateImpl
					.pattern_EndEvent2FinalState_30_3_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, process,
							useCase, _p2uc, inFlow, flow, _if2f, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[process] = " + process
						+ ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc + ", " + "[inFlow] = " + inFlow
						+ ", " + "[flow] = " + flow + ", " + "[_if2f] = " + _if2f + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_30_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_30_5_blackBBBBBB(process,
						useCase, _p2uc, inFlow, flow, _if2f);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_30_6_blackBBBBBBB(
							process, useCase, _p2uc, inFlow, flow, _if2f, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = "
								+ _p2uc + ", " + "[inFlow] = " + inFlow + ", " + "[flow] = " + flow + ", "
								+ "[_if2f] = " + _if2f + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_30_6_greenBBBFFFBB(process, inFlow, flow,
							ruleResult, csp);
					// EndEvent event = (EndEvent) result6_green[3];
					// UCCondition state = (UCCondition) result6_green[4];
					// EE2FS _e2s = (EE2FS) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return EndEvent2FinalStateImpl.pattern_EndEvent2FinalState_30_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("_p2uc", _p2uc);
		isApplicableMatch.registerObject("inFlow", inFlow);
		isApplicableMatch.registerObject("flow", flow);
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
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2), (EndEvent) arguments.get(3));
		case RulesPackage.END_EVENT2_FINAL_STATE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2), (EndEvent) arguments.get(3));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_SEQUENCEFLOW_ENDEVENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(SequenceFlow) arguments.get(2), (EndEvent) arguments.get(3));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_SEQUENCEFLOW_FLOW_SF2F_ENDEVENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Flow) arguments.get(5), (SF2F) arguments.get(6),
					(EndEvent) arguments.get(7));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_BWD__MATCH_USECASE_FLOW_UCCONDITION:
			return isAppropriate_BWD((Match) arguments.get(0), (UseCase) arguments.get(1), (Flow) arguments.get(2),
					(UCCondition) arguments.get(3));
		case RulesPackage.END_EVENT2_FINAL_STATE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_FLOW_UCCONDITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (UseCase) arguments.get(1), (Flow) arguments.get(2),
					(UCCondition) arguments.get(3));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_FLOW_UCCONDITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(Flow) arguments.get(2), (UCCondition) arguments.get(3));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_SEQUENCEFLOW_FLOW_SF2F_UCCONDITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Flow) arguments.get(5), (SF2F) arguments.get(6),
					(UCCondition) arguments.get(7));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.END_EVENT2_FINAL_STATE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_151__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_151((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_152__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_152((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_153__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_153((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_45((EMoflonEdge) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PROCESS_USECASE_P2UC_SEQUENCEFLOW_FLOW_SF2F_ENDEVENT_UCCONDITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Flow) arguments.get(5), (SF2F) arguments.get(6),
					(EndEvent) arguments.get(7), (UCCondition) arguments.get(8), (Match) arguments.get(9),
					(Match) arguments.get(10));
		case RulesPackage.END_EVENT2_FINAL_STATE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.END_EVENT2_FINAL_STATE___GENERATE_MODEL__RULEENTRYCONTAINER_SF2F:
			return generateModel((RuleEntryContainer) arguments.get(0), (SF2F) arguments.get(1));
		case RulesPackage.END_EVENT2_FINAL_STATE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_SEQUENCEFLOW_FLOW_SF2F_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(SequenceFlow) arguments.get(4), (Flow) arguments.get(5), (SF2F) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.END_EVENT2_FINAL_STATE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EndEvent2FinalState_0_1_blackBBBBB(EndEvent2FinalState _this, Match match,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		return new Object[] { _this, match, process, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalState_0_2_bindingFBBBBB(EndEvent2FinalState _this, Match match,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, inFlow, event);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, inFlow, event };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalState_0_2_bindingAndBlackFBBBBB(EndEvent2FinalState _this,
			Match match, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		Object[] result_pattern_EndEvent2FinalState_0_2_binding = pattern_EndEvent2FinalState_0_2_bindingFBBBBB(_this,
				match, process, inFlow, event);
		if (result_pattern_EndEvent2FinalState_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalState_0_2_binding[0];

			Object[] result_pattern_EndEvent2FinalState_0_2_black = pattern_EndEvent2FinalState_0_2_blackB(csp);
			if (result_pattern_EndEvent2FinalState_0_2_black != null) {

				return new Object[] { csp, _this, match, process, inFlow, event };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalState_0_3_expressionFBB(EndEvent2FinalState _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_0_4_blackBBBB(Match match, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {
		return new Object[] { match, process, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalState_0_4_greenBBBBFFF(Match match, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {
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

	public static final Object[] pattern_EndEvent2FinalState_0_5_blackBBBB(Match match, SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event) {
		return new Object[] { match, process, inFlow, event };
	}

	public static final Object[] pattern_EndEvent2FinalState_0_5_greenBBBF(Match match, SimpleBPMN.Process process,
			SequenceFlow inFlow) {
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(inFlow);
		String process__inFlow____flowElements_name_prime = "flowElements";
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		match.getContextEdges().add(process__inFlow____flowElements);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		return new Object[] { match, process, inFlow, process__inFlow____flowElements };
	}

	public static final void pattern_EndEvent2FinalState_0_6_expressionBBBBB(EndEvent2FinalState _this, Match match,
			SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		_this.registerObjectsToMatch_FWD(match, process, inFlow, event);

	}

	public static final boolean pattern_EndEvent2FinalState_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalState_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_1_1_bindingFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("_p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("_if2f");
		EObject _localVariable_6 = isApplicableMatch.getObject("event");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmp_p2uc = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmp_if2f = _localVariable_5;
		EObject tmpEvent = _localVariable_6;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmp_p2uc instanceof P2UC) {
					P2UC _p2uc = (P2UC) tmp_p2uc;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmp_if2f instanceof SF2F) {
								SF2F _if2f = (SF2F) tmp_if2f;
								if (tmpEvent instanceof EndEvent) {
									EndEvent event = (EndEvent) tmpEvent;
									return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event,
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

	public static final Object[] pattern_EndEvent2FinalState_1_1_blackBBBBBBBBFB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event,
			EndEvent2FinalState _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_1_1_bindingAndBlackFFFFFFFBFB(EndEvent2FinalState _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EndEvent2FinalState_1_1_binding = pattern_EndEvent2FinalState_1_1_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EndEvent2FinalState_1_1_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EndEvent2FinalState_1_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_EndEvent2FinalState_1_1_binding[1];
			P2UC _p2uc = (P2UC) result_pattern_EndEvent2FinalState_1_1_binding[2];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEvent2FinalState_1_1_binding[3];
			Flow flow = (Flow) result_pattern_EndEvent2FinalState_1_1_binding[4];
			SF2F _if2f = (SF2F) result_pattern_EndEvent2FinalState_1_1_binding[5];
			EndEvent event = (EndEvent) result_pattern_EndEvent2FinalState_1_1_binding[6];

			Object[] result_pattern_EndEvent2FinalState_1_1_black = pattern_EndEvent2FinalState_1_1_blackBBBBBBBBFB(
					process, useCase, _p2uc, inFlow, flow, _if2f, event, _this, isApplicableMatch);
			if (result_pattern_EndEvent2FinalState_1_1_black != null) {
				CSP csp = (CSP) result_pattern_EndEvent2FinalState_1_1_black[8];

				return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_1_1_greenBBFFB(Flow flow, EndEvent event, CSP csp) {
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

	public static final Object[] pattern_EndEvent2FinalState_1_2_blackBBB(EndEvent event, UCCondition state,
			EE2FS _e2s) {
		return new Object[] { event, state, _e2s };
	}

	public static final Object[] pattern_EndEvent2FinalState_1_2_greenFBBB(EndEvent event, UCCondition state,
			EE2FS _e2s) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(event);
		ruleresult.getCreatedElements().add(state);
		ruleresult.getCreatedLinkElements().add(_e2s);
		return new Object[] { ruleresult, event, state, _e2s };
	}

	public static final Object[] pattern_EndEvent2FinalState_1_3_blackBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject inFlow, EObject flow, EObject _if2f, EObject event,
			EObject state, EObject _e2s) {
		if (!process.equals(useCase)) {
			if (!process.equals(state)) {
				if (!_p2uc.equals(process)) {
					if (!_p2uc.equals(useCase)) {
						if (!_p2uc.equals(inFlow)) {
							if (!_p2uc.equals(flow)) {
								if (!_p2uc.equals(event)) {
									if (!_p2uc.equals(state)) {
										if (!inFlow.equals(process)) {
											if (!inFlow.equals(useCase)) {
												if (!inFlow.equals(state)) {
													if (!flow.equals(process)) {
														if (!flow.equals(useCase)) {
															if (!flow.equals(inFlow)) {
																if (!flow.equals(state)) {
																	if (!_if2f.equals(process)) {
																		if (!_if2f.equals(useCase)) {
																			if (!_if2f.equals(_p2uc)) {
																				if (!_if2f.equals(inFlow)) {
																					if (!_if2f.equals(flow)) {
																						if (!_if2f.equals(event)) {
																							if (!_if2f.equals(state)) {
																								if (!event.equals(
																										process)) {
																									if (!event.equals(
																											useCase)) {
																										if (!event
																												.equals(inFlow)) {
																											if (!event
																													.equals(flow)) {
																												if (!event
																														.equals(state)) {
																													if (!state
																															.equals(useCase)) {
																														if (!_e2s
																																.equals(process)) {
																															if (!_e2s
																																	.equals(useCase)) {
																																if (!_e2s
																																		.equals(_p2uc)) {
																																	if (!_e2s
																																			.equals(inFlow)) {
																																		if (!_e2s
																																				.equals(flow)) {
																																			if (!_e2s
																																					.equals(_if2f)) {
																																				if (!_e2s
																																						.equals(event)) {
																																					if (!_e2s
																																							.equals(state)) {
																																						return new Object[] {
																																								ruleresult,
																																								process,
																																								useCase,
																																								_p2uc,
																																								inFlow,
																																								flow,
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

	public static final Object[] pattern_EndEvent2FinalState_1_3_greenBBBBBBBFFFFFF(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject flow, EObject event, EObject state, EObject _e2s) {
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _e2s__event____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _e2s__state____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EndEvent2FinalState";
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
		return new Object[] { ruleresult, process, inFlow, flow, event, state, _e2s, process__event____flowElements,
				inFlow__event____targetRef, event__inFlow____incoming, flow__state____finalState, _e2s__event____source,
				_e2s__state____target };
	}

	public static final void pattern_EndEvent2FinalState_1_5_expressionBBBBBBBBBBB(EndEvent2FinalState _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject _p2uc, EObject inFlow, EObject flow,
			EObject _if2f, EObject event, EObject state, EObject _e2s) {
		_this.registerObjects_FWD(ruleresult, process, useCase, _p2uc, inFlow, flow, _if2f, event, state, _e2s);

	}

	public static final PerformRuleResult pattern_EndEvent2FinalState_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_2_1_bindingFB(EndEvent2FinalState _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_2_1_blackFBB(EClass eClass, EndEvent2FinalState _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_2_1_bindingAndBlackFFB(EndEvent2FinalState _this) {
		Object[] result_pattern_EndEvent2FinalState_2_1_binding = pattern_EndEvent2FinalState_2_1_bindingFB(_this);
		if (result_pattern_EndEvent2FinalState_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EndEvent2FinalState_2_1_binding[0];

			Object[] result_pattern_EndEvent2FinalState_2_1_black = pattern_EndEvent2FinalState_2_1_blackFBB(eClass,
					_this);
			if (result_pattern_EndEvent2FinalState_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EndEvent2FinalState_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EndEvent2FinalState";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EndEvent2FinalState_2_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("inFlow");
		EObject _localVariable_2 = match.getObject("event");
		EObject tmpProcess = _localVariable_0;
		EObject tmpInFlow = _localVariable_1;
		EObject tmpEvent = _localVariable_2;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (tmpEvent instanceof EndEvent) {
					EndEvent event = (EndEvent) tmpEvent;
					return new Object[] { process, inFlow, event, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_2_2_blackBFFBFFBB(SimpleBPMN.Process process,
			SequenceFlow inFlow, EndEvent event, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2UC _p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(process, P2UC.class,
				"source")) {
			UseCase useCase = _p2uc.getTarget();
			if (useCase != null) {
				for (SF2F _if2f : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(inFlow, SF2F.class,
						"source")) {
					Flow flow = _if2f.getTarget();
					if (flow != null) {
						_result.add(new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_2_3_blackBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.getFlowElements().contains(inFlow)) {
			if (process.getFlowElements().contains(event)) {
				if (useCase.getFlows().contains(flow)) {
					if (process.equals(_p2uc.getSource())) {
						if (useCase.equals(_p2uc.getTarget())) {
							if (event.equals(inFlow.getTargetRef())) {
								if (inFlow.equals(_if2f.getSource())) {
									if (flow.equals(_if2f.getTarget())) {
										_result.add(
												new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event });
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

	public static final Object[] pattern_EndEvent2FinalState_2_3_greenBBBBBBBFFFFFFFFFF(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _if2f__inFlow____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _if2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__inFlow____flowElements_name_prime = "flowElements";
		String process__event____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String _p2uc__process____source_name_prime = "source";
		String _p2uc__useCase____target_name_prime = "target";
		String inFlow__event____targetRef_name_prime = "targetRef";
		String event__inFlow____incoming_name_prime = "incoming";
		String _if2f__inFlow____source_name_prime = "source";
		String _if2f__flow____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(_p2uc);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(_if2f);
		isApplicableMatch.getAllContextElements().add(event);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(process__inFlow____flowElements);
		process__event____flowElements.setSrc(process);
		process__event____flowElements.setTrg(event);
		isApplicableMatch.getAllContextElements().add(process__event____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		_p2uc__process____source.setSrc(_p2uc);
		_p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(_p2uc__process____source);
		_p2uc__useCase____target.setSrc(_p2uc);
		_p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(_p2uc__useCase____target);
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
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		process__event____flowElements.setName(process__event____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		_p2uc__process____source.setName(_p2uc__process____source_name_prime);
		_p2uc__useCase____target.setName(_p2uc__useCase____target_name_prime);
		inFlow__event____targetRef.setName(inFlow__event____targetRef_name_prime);
		event__inFlow____incoming.setName(event__inFlow____incoming_name_prime);
		_if2f__inFlow____source.setName(_if2f__inFlow____source_name_prime);
		_if2f__flow____target.setName(_if2f__flow____target_name_prime);
		return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event, isApplicableMatch,
				process__inFlow____flowElements, process__event____flowElements, useCase__flow____flows,
				_p2uc__process____source, _p2uc__useCase____target, inFlow__event____targetRef,
				event__inFlow____incoming, _if2f__inFlow____source, _if2f__flow____target };
	}

	public static final Object[] pattern_EndEvent2FinalState_2_4_bindingFBBBBBBBBB(EndEvent2FinalState _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, process, useCase, _p2uc, inFlow, flow,
				_if2f, event);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f, event };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalState_2_4_bindingAndBlackFBBBBBBBBB(EndEvent2FinalState _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event) {
		Object[] result_pattern_EndEvent2FinalState_2_4_binding = pattern_EndEvent2FinalState_2_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f, event);
		if (result_pattern_EndEvent2FinalState_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalState_2_4_binding[0];

			Object[] result_pattern_EndEvent2FinalState_2_4_black = pattern_EndEvent2FinalState_2_4_blackB(csp);
			if (result_pattern_EndEvent2FinalState_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f,
						event };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalState_2_5_expressionFBB(EndEvent2FinalState _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalState_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalState";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEvent2FinalState_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_10_1_blackBBBBB(EndEvent2FinalState _this, Match match,
			UseCase useCase, Flow flow, UCCondition state) {
		return new Object[] { _this, match, useCase, flow, state };
	}

	public static final Object[] pattern_EndEvent2FinalState_10_2_bindingFBBBBB(EndEvent2FinalState _this, Match match,
			UseCase useCase, Flow flow, UCCondition state) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, useCase, flow, state);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, flow, state };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalState_10_2_bindingAndBlackFBBBBB(EndEvent2FinalState _this,
			Match match, UseCase useCase, Flow flow, UCCondition state) {
		Object[] result_pattern_EndEvent2FinalState_10_2_binding = pattern_EndEvent2FinalState_10_2_bindingFBBBBB(_this,
				match, useCase, flow, state);
		if (result_pattern_EndEvent2FinalState_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalState_10_2_binding[0];

			Object[] result_pattern_EndEvent2FinalState_10_2_black = pattern_EndEvent2FinalState_10_2_blackB(csp);
			if (result_pattern_EndEvent2FinalState_10_2_black != null) {

				return new Object[] { csp, _this, match, useCase, flow, state };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalState_10_3_expressionFBB(EndEvent2FinalState _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_10_4_blackBBBB(Match match, UseCase useCase, Flow flow,
			UCCondition state) {
		return new Object[] { match, useCase, flow, state };
	}

	public static final Object[] pattern_EndEvent2FinalState_10_4_greenBBBF(Match match, Flow flow, UCCondition state) {
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(state);
		String flow__state____finalState_name_prime = "finalState";
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		match.getToBeTranslatedEdges().add(flow__state____finalState);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		return new Object[] { match, flow, state, flow__state____finalState };
	}

	public static final Object[] pattern_EndEvent2FinalState_10_5_blackBBBB(Match match, UseCase useCase, Flow flow,
			UCCondition state) {
		return new Object[] { match, useCase, flow, state };
	}

	public static final Object[] pattern_EndEvent2FinalState_10_5_greenBBBF(Match match, UseCase useCase, Flow flow) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		String useCase__flow____flows_name_prime = "flows";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		return new Object[] { match, useCase, flow, useCase__flow____flows };
	}

	public static final void pattern_EndEvent2FinalState_10_6_expressionBBBBB(EndEvent2FinalState _this, Match match,
			UseCase useCase, Flow flow, UCCondition state) {
		_this.registerObjectsToMatch_BWD(match, useCase, flow, state);

	}

	public static final boolean pattern_EndEvent2FinalState_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalState_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_11_1_bindingFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("_p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("_if2f");
		EObject _localVariable_6 = isApplicableMatch.getObject("state");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmp_p2uc = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmp_if2f = _localVariable_5;
		EObject tmpState = _localVariable_6;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmp_p2uc instanceof P2UC) {
					P2UC _p2uc = (P2UC) tmp_p2uc;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmp_if2f instanceof SF2F) {
								SF2F _if2f = (SF2F) tmp_if2f;
								if (tmpState instanceof UCCondition) {
									UCCondition state = (UCCondition) tmpState;
									return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, state,
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

	public static final Object[] pattern_EndEvent2FinalState_11_1_blackBBBBBBBBFB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, UCCondition state,
			EndEvent2FinalState _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, state, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_11_1_bindingAndBlackFFFFFFFBFB(EndEvent2FinalState _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EndEvent2FinalState_11_1_binding = pattern_EndEvent2FinalState_11_1_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EndEvent2FinalState_11_1_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EndEvent2FinalState_11_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_EndEvent2FinalState_11_1_binding[1];
			P2UC _p2uc = (P2UC) result_pattern_EndEvent2FinalState_11_1_binding[2];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEvent2FinalState_11_1_binding[3];
			Flow flow = (Flow) result_pattern_EndEvent2FinalState_11_1_binding[4];
			SF2F _if2f = (SF2F) result_pattern_EndEvent2FinalState_11_1_binding[5];
			UCCondition state = (UCCondition) result_pattern_EndEvent2FinalState_11_1_binding[6];

			Object[] result_pattern_EndEvent2FinalState_11_1_black = pattern_EndEvent2FinalState_11_1_blackBBBBBBBBFB(
					process, useCase, _p2uc, inFlow, flow, _if2f, state, _this, isApplicableMatch);
			if (result_pattern_EndEvent2FinalState_11_1_black != null) {
				CSP csp = (CSP) result_pattern_EndEvent2FinalState_11_1_black[8];

				return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, state, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_11_1_greenBBFBFB(SimpleBPMN.Process process,
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

	public static final Object[] pattern_EndEvent2FinalState_11_2_blackBBB(EndEvent event, UCCondition state,
			EE2FS _e2s) {
		return new Object[] { event, state, _e2s };
	}

	public static final Object[] pattern_EndEvent2FinalState_11_2_greenFBBB(EndEvent event, UCCondition state,
			EE2FS _e2s) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(event);
		ruleresult.getTranslatedElements().add(state);
		ruleresult.getCreatedLinkElements().add(_e2s);
		return new Object[] { ruleresult, event, state, _e2s };
	}

	public static final Object[] pattern_EndEvent2FinalState_11_3_blackBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject inFlow, EObject flow, EObject _if2f, EObject event,
			EObject state, EObject _e2s) {
		if (!process.equals(useCase)) {
			if (!process.equals(state)) {
				if (!_p2uc.equals(process)) {
					if (!_p2uc.equals(useCase)) {
						if (!_p2uc.equals(inFlow)) {
							if (!_p2uc.equals(flow)) {
								if (!_p2uc.equals(event)) {
									if (!_p2uc.equals(state)) {
										if (!inFlow.equals(process)) {
											if (!inFlow.equals(useCase)) {
												if (!inFlow.equals(state)) {
													if (!flow.equals(process)) {
														if (!flow.equals(useCase)) {
															if (!flow.equals(inFlow)) {
																if (!flow.equals(state)) {
																	if (!_if2f.equals(process)) {
																		if (!_if2f.equals(useCase)) {
																			if (!_if2f.equals(_p2uc)) {
																				if (!_if2f.equals(inFlow)) {
																					if (!_if2f.equals(flow)) {
																						if (!_if2f.equals(event)) {
																							if (!_if2f.equals(state)) {
																								if (!event.equals(
																										process)) {
																									if (!event.equals(
																											useCase)) {
																										if (!event
																												.equals(inFlow)) {
																											if (!event
																													.equals(flow)) {
																												if (!event
																														.equals(state)) {
																													if (!state
																															.equals(useCase)) {
																														if (!_e2s
																																.equals(process)) {
																															if (!_e2s
																																	.equals(useCase)) {
																																if (!_e2s
																																		.equals(_p2uc)) {
																																	if (!_e2s
																																			.equals(inFlow)) {
																																		if (!_e2s
																																				.equals(flow)) {
																																			if (!_e2s
																																					.equals(_if2f)) {
																																				if (!_e2s
																																						.equals(event)) {
																																					if (!_e2s
																																							.equals(state)) {
																																						return new Object[] {
																																								ruleresult,
																																								process,
																																								useCase,
																																								_p2uc,
																																								inFlow,
																																								flow,
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

	public static final Object[] pattern_EndEvent2FinalState_11_3_greenBBBBBBBFFFFFF(PerformRuleResult ruleresult,
			EObject process, EObject inFlow, EObject flow, EObject event, EObject state, EObject _e2s) {
		EMoflonEdge process__event____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge inFlow__event____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge event__inFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _e2s__event____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _e2s__state____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EndEvent2FinalState";
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
		return new Object[] { ruleresult, process, inFlow, flow, event, state, _e2s, process__event____flowElements,
				inFlow__event____targetRef, event__inFlow____incoming, flow__state____finalState, _e2s__event____source,
				_e2s__state____target };
	}

	public static final void pattern_EndEvent2FinalState_11_5_expressionBBBBBBBBBBB(EndEvent2FinalState _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject _p2uc, EObject inFlow, EObject flow,
			EObject _if2f, EObject event, EObject state, EObject _e2s) {
		_this.registerObjects_BWD(ruleresult, process, useCase, _p2uc, inFlow, flow, _if2f, event, state, _e2s);

	}

	public static final PerformRuleResult pattern_EndEvent2FinalState_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_12_1_bindingFB(EndEvent2FinalState _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_12_1_blackFBB(EClass eClass, EndEvent2FinalState _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_12_1_bindingAndBlackFFB(EndEvent2FinalState _this) {
		Object[] result_pattern_EndEvent2FinalState_12_1_binding = pattern_EndEvent2FinalState_12_1_bindingFB(_this);
		if (result_pattern_EndEvent2FinalState_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EndEvent2FinalState_12_1_binding[0];

			Object[] result_pattern_EndEvent2FinalState_12_1_black = pattern_EndEvent2FinalState_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_EndEvent2FinalState_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EndEvent2FinalState_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EndEvent2FinalState";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EndEvent2FinalState_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("state");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpState = _localVariable_2;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpState instanceof UCCondition) {
					UCCondition state = (UCCondition) tmpState;
					return new Object[] { useCase, flow, state, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_12_2_blackFBFFBFBB(UseCase useCase, Flow flow,
			UCCondition state, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (P2UC _p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase, P2UC.class,
				"target")) {
			SimpleBPMN.Process process = _p2uc.getSource();
			if (process != null) {
				for (SF2F _if2f : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow, SF2F.class,
						"target")) {
					SequenceFlow inFlow = _if2f.getSource();
					if (inFlow != null) {
						_result.add(new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, state, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_12_3_blackBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, UCCondition state) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.getFlowElements().contains(inFlow)) {
			if (useCase.getFlows().contains(flow)) {
				if (process.equals(_p2uc.getSource())) {
					if (useCase.equals(_p2uc.getTarget())) {
						if (flow.getFinalState().contains(state)) {
							if (inFlow.equals(_if2f.getSource())) {
								if (flow.equals(_if2f.getTarget())) {
									_result.add(new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, state });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_12_3_greenBBBBBBBFFFFFFFF(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, UCCondition state) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__inFlow____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__state____finalState = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _if2f__inFlow____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _if2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__inFlow____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String _p2uc__process____source_name_prime = "source";
		String _p2uc__useCase____target_name_prime = "target";
		String flow__state____finalState_name_prime = "finalState";
		String _if2f__inFlow____source_name_prime = "source";
		String _if2f__flow____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(_p2uc);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(_if2f);
		isApplicableMatch.getAllContextElements().add(state);
		process__inFlow____flowElements.setSrc(process);
		process__inFlow____flowElements.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(process__inFlow____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		_p2uc__process____source.setSrc(_p2uc);
		_p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(_p2uc__process____source);
		_p2uc__useCase____target.setSrc(_p2uc);
		_p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(_p2uc__useCase____target);
		flow__state____finalState.setSrc(flow);
		flow__state____finalState.setTrg(state);
		isApplicableMatch.getAllContextElements().add(flow__state____finalState);
		_if2f__inFlow____source.setSrc(_if2f);
		_if2f__inFlow____source.setTrg(inFlow);
		isApplicableMatch.getAllContextElements().add(_if2f__inFlow____source);
		_if2f__flow____target.setSrc(_if2f);
		_if2f__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(_if2f__flow____target);
		process__inFlow____flowElements.setName(process__inFlow____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		_p2uc__process____source.setName(_p2uc__process____source_name_prime);
		_p2uc__useCase____target.setName(_p2uc__useCase____target_name_prime);
		flow__state____finalState.setName(flow__state____finalState_name_prime);
		_if2f__inFlow____source.setName(_if2f__inFlow____source_name_prime);
		_if2f__flow____target.setName(_if2f__flow____target_name_prime);
		return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, state, isApplicableMatch,
				process__inFlow____flowElements, useCase__flow____flows, _p2uc__process____source,
				_p2uc__useCase____target, flow__state____finalState, _if2f__inFlow____source, _if2f__flow____target };
	}

	public static final Object[] pattern_EndEvent2FinalState_12_4_bindingFBBBBBBBBB(EndEvent2FinalState _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			SequenceFlow inFlow, Flow flow, SF2F _if2f, UCCondition state) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, process, useCase, _p2uc, inFlow, flow,
				_if2f, state);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f, state };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalState_12_4_bindingAndBlackFBBBBBBBBB(EndEvent2FinalState _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			SequenceFlow inFlow, Flow flow, SF2F _if2f, UCCondition state) {
		Object[] result_pattern_EndEvent2FinalState_12_4_binding = pattern_EndEvent2FinalState_12_4_bindingFBBBBBBBBB(
				_this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f, state);
		if (result_pattern_EndEvent2FinalState_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalState_12_4_binding[0];

			Object[] result_pattern_EndEvent2FinalState_12_4_black = pattern_EndEvent2FinalState_12_4_blackB(csp);
			if (result_pattern_EndEvent2FinalState_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f,
						state };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalState_12_5_expressionFBB(EndEvent2FinalState _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalState_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalState";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEvent2FinalState_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_20_1_bindingFB(EndEvent2FinalState _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_20_1_blackFBB(EClass __eClass, EndEvent2FinalState _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_20_1_bindingAndBlackFFB(EndEvent2FinalState _this) {
		Object[] result_pattern_EndEvent2FinalState_20_1_binding = pattern_EndEvent2FinalState_20_1_bindingFB(_this);
		if (result_pattern_EndEvent2FinalState_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalState_20_1_binding[0];

			Object[] result_pattern_EndEvent2FinalState_20_1_black = pattern_EndEvent2FinalState_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EndEvent2FinalState_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalState_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_20_2_blackFFFB(EMoflonEdge _edge_flowElements) {
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
								_result.add(new Object[] { process, inFlow, event, _edge_flowElements });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalState_20_3_expressionFBBBBB(EndEvent2FinalState _this,
			Match match, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalState_20_4_expressionFBB(EndEvent2FinalState _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalState_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalState_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_21_1_bindingFB(EndEvent2FinalState _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_21_1_blackFBB(EClass __eClass, EndEvent2FinalState _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_21_1_bindingAndBlackFFB(EndEvent2FinalState _this) {
		Object[] result_pattern_EndEvent2FinalState_21_1_binding = pattern_EndEvent2FinalState_21_1_bindingFB(_this);
		if (result_pattern_EndEvent2FinalState_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalState_21_1_binding[0];

			Object[] result_pattern_EndEvent2FinalState_21_1_black = pattern_EndEvent2FinalState_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EndEvent2FinalState_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalState_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_21_2_blackFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInFlow = _edge_targetRef.getSrc();
		if (tmpInFlow instanceof SequenceFlow) {
			SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
			EObject tmpEvent = _edge_targetRef.getTrg();
			if (tmpEvent instanceof EndEvent) {
				EndEvent event = (EndEvent) tmpEvent;
				if (event.equals(inFlow.getTargetRef())) {
					for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class, "flowElements")) {
						if (process.getFlowElements().contains(event)) {
							_result.add(new Object[] { process, inFlow, event, _edge_targetRef });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalState_21_3_expressionFBBBBB(EndEvent2FinalState _this,
			Match match, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalState_21_4_expressionFBB(EndEvent2FinalState _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalState_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalState_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_22_1_bindingFB(EndEvent2FinalState _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_22_1_blackFBB(EClass __eClass, EndEvent2FinalState _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_22_1_bindingAndBlackFFB(EndEvent2FinalState _this) {
		Object[] result_pattern_EndEvent2FinalState_22_1_binding = pattern_EndEvent2FinalState_22_1_bindingFB(_this);
		if (result_pattern_EndEvent2FinalState_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalState_22_1_binding[0];

			Object[] result_pattern_EndEvent2FinalState_22_1_black = pattern_EndEvent2FinalState_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EndEvent2FinalState_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalState_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_22_2_blackFFFB(EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEvent = _edge_incoming.getSrc();
		if (tmpEvent instanceof EndEvent) {
			EndEvent event = (EndEvent) tmpEvent;
			EObject tmpInFlow = _edge_incoming.getTrg();
			if (tmpInFlow instanceof SequenceFlow) {
				SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
				if (event.equals(inFlow.getTargetRef())) {
					for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(event, SimpleBPMN.Process.class, "flowElements")) {
						if (process.getFlowElements().contains(inFlow)) {
							_result.add(new Object[] { process, inFlow, event, _edge_incoming });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalState_22_3_expressionFBBBBB(EndEvent2FinalState _this,
			Match match, SimpleBPMN.Process process, SequenceFlow inFlow, EndEvent event) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, inFlow, event);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalState_22_4_expressionFBB(EndEvent2FinalState _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalState_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalState_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_23_1_bindingFB(EndEvent2FinalState _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_23_1_blackFBB(EClass __eClass, EndEvent2FinalState _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_23_1_bindingAndBlackFFB(EndEvent2FinalState _this) {
		Object[] result_pattern_EndEvent2FinalState_23_1_binding = pattern_EndEvent2FinalState_23_1_bindingFB(_this);
		if (result_pattern_EndEvent2FinalState_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EndEvent2FinalState_23_1_binding[0];

			Object[] result_pattern_EndEvent2FinalState_23_1_black = pattern_EndEvent2FinalState_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_EndEvent2FinalState_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EndEvent2FinalState_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EndEvent2FinalState_23_2_black_nac_0BB(UCCondition state, UseCase useCase) {
		for (UseCase __DEC_state_precondition_46635 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, UseCase.class, "precondition")) {
			if (!useCase.equals(__DEC_state_precondition_46635)) {
				return new Object[] { state, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_23_2_black_nac_1BB(UCCondition state, Flow flow) {
		for (Flow __DEC_state_finalState_365734 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(state, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_state_finalState_365734)) {
				return new Object[] { state, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_23_2_black_nac_2BB(UseCase useCase, UCCondition state) {
		if (state.equals(useCase.getPrecondition())) {
			return new Object[] { useCase, state };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_23_2_blackFFFB(EMoflonEdge _edge_finalState) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_finalState.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpState = _edge_finalState.getTrg();
			if (tmpState instanceof UCCondition) {
				UCCondition state = (UCCondition) tmpState;
				if (flow.getFinalState().contains(state)) {
					if (pattern_EndEvent2FinalState_23_2_black_nac_1BB(state, flow) == null) {
						for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
								UseCase.class, "flows")) {
							if (pattern_EndEvent2FinalState_23_2_black_nac_0BB(state, useCase) == null) {
								if (pattern_EndEvent2FinalState_23_2_black_nac_2BB(useCase, state) == null) {
									_result.add(new Object[] { useCase, flow, state, _edge_finalState });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EndEvent2FinalState_23_3_expressionFBBBBB(EndEvent2FinalState _this,
			Match match, UseCase useCase, Flow flow, UCCondition state) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, flow, state);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EndEvent2FinalState_23_4_expressionFBB(EndEvent2FinalState _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EndEvent2FinalState_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EndEvent2FinalState_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_26_1_blackB(EndEvent2FinalState _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEvent2FinalState_26_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_EndEvent2FinalState_26_2_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("process");
		EObject _localVariable_1 = targetMatch.getObject("useCase");
		EObject _localVariable_2 = sourceMatch.getObject("inFlow");
		EObject _localVariable_3 = targetMatch.getObject("flow");
		EObject _localVariable_4 = sourceMatch.getObject("event");
		EObject _localVariable_5 = targetMatch.getObject("state");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpInFlow = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpEvent = _localVariable_4;
		EObject tmpState = _localVariable_5;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpInFlow instanceof SequenceFlow) {
					SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpEvent instanceof EndEvent) {
							EndEvent event = (EndEvent) tmpEvent;
							if (tmpState instanceof UCCondition) {
								UCCondition state = (UCCondition) tmpState;
								return new Object[] { process, useCase, inFlow, flow, event, state, sourceMatch,
										targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_26_2_blackBBFBBFBBBB(SimpleBPMN.Process process,
			UseCase useCase, SequenceFlow inFlow, Flow flow, EndEvent event, UCCondition state, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (process.getFlowElements().contains(inFlow)) {
				if (process.getFlowElements().contains(event)) {
					if (useCase.getFlows().contains(flow)) {
						if (event.equals(inFlow.getTargetRef())) {
							if (flow.getFinalState().contains(state)) {
								for (P2UC _p2uc : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(process, P2UC.class, "source")) {
									if (useCase.equals(_p2uc.getTarget())) {
										for (SF2F _if2f : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(inFlow, SF2F.class, "source")) {
											if (flow.equals(_if2f.getTarget())) {
												_result.add(new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f,
														event, state, sourceMatch, targetMatch });
											}
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

	public static final Object[] pattern_EndEvent2FinalState_26_2_greenBBBBBBBBBFB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event, UCCondition state,
			Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalState";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(inFlow);
		isApplicableMatch.getAllContextElements().add(event);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(state);
		isApplicableMatch.getAllContextElements().add(_p2uc);
		isApplicableMatch.getAllContextElements().add(_if2f);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event, state, sourceMatch,
				isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_EndEvent2FinalState_26_3_bindingFBBBBBBBBBBBB(EndEvent2FinalState _this,
			IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event, UCCondition state, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, process, useCase, _p2uc, inFlow, flow,
				_if2f, event, state, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f, event,
					state, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_26_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalState_26_3_bindingAndBlackFBBBBBBBBBBBB(
			EndEvent2FinalState _this, IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event, UCCondition state,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EndEvent2FinalState_26_3_binding = pattern_EndEvent2FinalState_26_3_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f, event, state, sourceMatch,
				targetMatch);
		if (result_pattern_EndEvent2FinalState_26_3_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalState_26_3_binding[0];

			Object[] result_pattern_EndEvent2FinalState_26_3_black = pattern_EndEvent2FinalState_26_3_blackB(csp);
			if (result_pattern_EndEvent2FinalState_26_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f,
						event, state, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_26_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_EndEvent2FinalState_26_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EndEvent2FinalState";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EndEvent2FinalState_26_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_29_1_blackB(EndEvent2FinalState _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEvent2FinalState_29_2_bindingFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("_p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("inFlow");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("_if2f");
		EObject _localVariable_6 = isApplicableMatch.getObject("event");
		EObject _localVariable_7 = isApplicableMatch.getObject("state");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmp_p2uc = _localVariable_2;
		EObject tmpInFlow = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmp_if2f = _localVariable_5;
		EObject tmpEvent = _localVariable_6;
		EObject tmpState = _localVariable_7;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmp_p2uc instanceof P2UC) {
					P2UC _p2uc = (P2UC) tmp_p2uc;
					if (tmpInFlow instanceof SequenceFlow) {
						SequenceFlow inFlow = (SequenceFlow) tmpInFlow;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmp_if2f instanceof SF2F) {
								SF2F _if2f = (SF2F) tmp_if2f;
								if (tmpEvent instanceof EndEvent) {
									EndEvent event = (EndEvent) tmpEvent;
									if (tmpState instanceof UCCondition) {
										UCCondition state = (UCCondition) tmpState;
										return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event,
												state, isApplicableMatch };
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

	public static final Object[] pattern_EndEvent2FinalState_29_2_blackBBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f, EndEvent event, UCCondition state,
			IsApplicableMatchCC isApplicableMatch) {
		if (process.getFlowElements().contains(inFlow)) {
			if (process.getFlowElements().contains(event)) {
				if (useCase.getFlows().contains(flow)) {
					if (process.equals(_p2uc.getSource())) {
						if (useCase.equals(_p2uc.getTarget())) {
							if (event.equals(inFlow.getTargetRef())) {
								if (flow.getFinalState().contains(state)) {
									if (inFlow.equals(_if2f.getSource())) {
										if (flow.equals(_if2f.getTarget())) {
											return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event,
													state, isApplicableMatch };
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

	public static final Object[] pattern_EndEvent2FinalState_29_2_bindingAndBlackFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_EndEvent2FinalState_29_2_binding = pattern_EndEvent2FinalState_29_2_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EndEvent2FinalState_29_2_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_EndEvent2FinalState_29_2_binding[0];
			UseCase useCase = (UseCase) result_pattern_EndEvent2FinalState_29_2_binding[1];
			P2UC _p2uc = (P2UC) result_pattern_EndEvent2FinalState_29_2_binding[2];
			SequenceFlow inFlow = (SequenceFlow) result_pattern_EndEvent2FinalState_29_2_binding[3];
			Flow flow = (Flow) result_pattern_EndEvent2FinalState_29_2_binding[4];
			SF2F _if2f = (SF2F) result_pattern_EndEvent2FinalState_29_2_binding[5];
			EndEvent event = (EndEvent) result_pattern_EndEvent2FinalState_29_2_binding[6];
			UCCondition state = (UCCondition) result_pattern_EndEvent2FinalState_29_2_binding[7];

			Object[] result_pattern_EndEvent2FinalState_29_2_black = pattern_EndEvent2FinalState_29_2_blackBBBBBBBBB(
					process, useCase, _p2uc, inFlow, flow, _if2f, event, state, isApplicableMatch);
			if (result_pattern_EndEvent2FinalState_29_2_black != null) {

				return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, event, state, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_29_2_greenBBFF(EndEvent event, UCCondition state) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		EE2FS _e2s = Bpmn2UseCaseFactory.eINSTANCE.createEE2FS();
		result.getCreatedElements().add(_e2s);
		_e2s.setSource(event);
		_e2s.setTarget(state);
		return new Object[] { event, state, result, _e2s };
	}

	public static final PerformRuleResult pattern_EndEvent2FinalState_29_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_30_1_blackB(EndEvent2FinalState _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EndEvent2FinalState_30_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EndEvent2FinalState_30_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_30_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			SequenceFlow inFlow) {
		if (ruleResult.getSourceObjects().contains(inFlow)) {
			return new Object[] { ruleResult, inFlow };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_30_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			SF2F _if2f) {
		if (ruleResult.getCorrObjects().contains(_if2f)) {
			return new Object[] { ruleResult, _if2f };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_30_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_30_2_black_nac_4BB(ModelgeneratorRuleResult ruleResult,
			UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_30_2_black_nac_5BB(ModelgeneratorRuleResult ruleResult,
			P2UC _p2uc) {
		if (ruleResult.getCorrObjects().contains(_p2uc)) {
			return new Object[] { ruleResult, _p2uc };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EndEvent2FinalState_30_2_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList _if2fList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmp_if2f : _if2fList.getEntryObjects()) {
				if (tmp_if2f instanceof SF2F) {
					SF2F _if2f = (SF2F) tmp_if2f;
					SequenceFlow inFlow = _if2f.getSource();
					if (inFlow != null) {
						Flow flow = _if2f.getTarget();
						if (flow != null) {
							if (pattern_EndEvent2FinalState_30_2_black_nac_2BB(ruleResult, _if2f) == null) {
								if (pattern_EndEvent2FinalState_30_2_black_nac_1BB(ruleResult, inFlow) == null) {
									if (pattern_EndEvent2FinalState_30_2_black_nac_3BB(ruleResult, flow) == null) {
										for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(inFlow, SimpleBPMN.Process.class,
														"flowElements")) {
											if (pattern_EndEvent2FinalState_30_2_black_nac_0BB(ruleResult,
													process) == null) {
												for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(flow, UseCase.class, "flows")) {
													if (pattern_EndEvent2FinalState_30_2_black_nac_4BB(ruleResult,
															useCase) == null) {
														for (P2UC _p2uc : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(process, P2UC.class,
																		"source")) {
															if (useCase.equals(_p2uc.getTarget())) {
																if (pattern_EndEvent2FinalState_30_2_black_nac_5BB(
																		ruleResult, _p2uc) == null) {
																	_result.add(new Object[] { _if2fList, process,
																			inFlow, _if2f, flow, useCase, _p2uc,
																			ruleEntryContainer, ruleResult });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EndEvent2FinalState_30_3_bindingFBBBBBBBBB(EndEvent2FinalState _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			SequenceFlow inFlow, Flow flow, SF2F _if2f, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, process, useCase, _p2uc, inFlow,
				flow, _if2f, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EndEvent2FinalState_30_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EndEvent2FinalState_30_3_bindingAndBlackFBBBBBBBBB(EndEvent2FinalState _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, P2UC _p2uc,
			SequenceFlow inFlow, Flow flow, SF2F _if2f, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EndEvent2FinalState_30_3_binding = pattern_EndEvent2FinalState_30_3_bindingFBBBBBBBBB(
				_this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f, ruleResult);
		if (result_pattern_EndEvent2FinalState_30_3_binding != null) {
			CSP csp = (CSP) result_pattern_EndEvent2FinalState_30_3_binding[0];

			Object[] result_pattern_EndEvent2FinalState_30_3_black = pattern_EndEvent2FinalState_30_3_blackB(csp);
			if (result_pattern_EndEvent2FinalState_30_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, _p2uc, inFlow, flow, _if2f,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EndEvent2FinalState_30_4_expressionFBB(EndEvent2FinalState _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EndEvent2FinalState_30_5_blackBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f) {
		return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f };
	}

	public static final Object[] pattern_EndEvent2FinalState_30_6_blackBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, SequenceFlow inFlow, Flow flow, SF2F _if2f,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { process, useCase, _p2uc, inFlow, flow, _if2f, ruleResult };
	}

	public static final Object[] pattern_EndEvent2FinalState_30_6_greenBBBFFFBB(SimpleBPMN.Process process,
			SequenceFlow inFlow, Flow flow, ModelgeneratorRuleResult ruleResult, CSP csp) {
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
		return new Object[] { process, inFlow, flow, event, state, _e2s, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EndEvent2FinalState_30_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EndEvent2FinalStateImpl
