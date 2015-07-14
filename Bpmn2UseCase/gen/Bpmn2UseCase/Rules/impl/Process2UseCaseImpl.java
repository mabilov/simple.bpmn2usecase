/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.P2UC;

import Bpmn2UseCase.Rules.Process2UseCase;
import Bpmn2UseCase.Rules.RulesPackage;

import Bpmn2UseCase.SE2BF;
import Bpmn2UseCase.SF2F;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;
import SimpleBPMN.StartEvent;

import SimpleUseCase.BasicFlow;
import SimpleUseCase.Flow;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.UCCondition;
import SimpleUseCase.UseCase;

import TGGLanguage.csp.CSP;

import TGGLanguage.modelgenerator.RuleEntryContainer;

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
 * An implementation of the model object '<em><b>Process2 Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Process2UseCaseImpl extends AbstractRuleImpl implements Process2UseCase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Process2UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getProcess2UseCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		// initial bindings
		Object[] result1_black = Process2UseCaseImpl.pattern_Process2UseCase_0_1_blackBBBBB(this, match, process, start,
				sf);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", "
					+ "[start] = " + start + ", " + "[sf] = " + sf + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_0_2_bindingAndBlackFBBBBB(this,
				match, process, start, sf);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[start] = " + start
					+ ", " + "[sf] = " + sf + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Process2UseCaseImpl.pattern_Process2UseCase_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Process2UseCaseImpl.pattern_Process2UseCase_0_4_blackBBBB(match, process, start,
					sf);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[start] = "
						+ start + ", " + "[sf] = " + sf + ".");
			}
			Process2UseCaseImpl.pattern_Process2UseCase_0_4_greenBBBBFFFF(match, process, start, sf);
			// EMoflonEdge process__start____flowElements = (EMoflonEdge) result4_green[4];
			// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge sf__start____sourceRef = (EMoflonEdge) result4_green[6];
			// EMoflonEdge start__sf____outgoing = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = Process2UseCaseImpl.pattern_Process2UseCase_0_5_blackBBBB(match, process, start,
					sf);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[start] = "
						+ start + ", " + "[sf] = " + sf + ".");
			}
			// register objects to match
			Process2UseCaseImpl.pattern_Process2UseCase_0_6_expressionBBBBB(this, match, process, start, sf);
			return Process2UseCaseImpl.pattern_Process2UseCase_0_7_expressionF();
		} else {
			return Process2UseCaseImpl.pattern_Process2UseCase_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_1_1_bindingAndBlackFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[0];
		StartEvent start = (StartEvent) result1_bindingAndBlack[1];
		SequenceFlow sf = (SequenceFlow) result1_bindingAndBlack[2];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_1_1_greenBFFFFBBFFB(process, start, sf,
				csp);
		UseCase useCase = (UseCase) result1_green[1];
		P2UC _p2uc = (P2UC) result1_green[2];
		BasicFlow flow = (BasicFlow) result1_green[3];
		SE2BF _se2bf = (SE2BF) result1_green[4];
		SF2F _sf2f = (SF2F) result1_green[7];
		UCCondition cond = (UCCondition) result1_green[8];

		// collect translated elements
		Object[] result2_black = Process2UseCaseImpl.pattern_Process2UseCase_1_2_blackBBBBBBBBB(process, useCase, _p2uc,
				flow, _se2bf, start, sf, _sf2f, cond);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc + ", "
					+ "[flow] = " + flow + ", " + "[_se2bf] = " + _se2bf + ", " + "[start] = " + start + ", "
					+ "[sf] = " + sf + ", " + "[_sf2f] = " + _sf2f + ", " + "[cond] = " + cond + ".");
		}
		Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_1_2_greenFBBBBBBBBB(process, useCase,
				_p2uc, flow, _se2bf, start, sf, _sf2f, cond);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Process2UseCaseImpl.pattern_Process2UseCase_1_3_blackBBBBBBBBBB(ruleresult, process,
				useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[_p2uc] = " + _p2uc + ", " + "[flow] = " + flow + ", " + "[_se2bf] = " + _se2bf + ", "
					+ "[start] = " + start + ", " + "[sf] = " + sf + ", " + "[_sf2f] = " + _sf2f + ", " + "[cond] = "
					+ cond + ".");
		}
		Process2UseCaseImpl.pattern_Process2UseCase_1_3_greenBBBBBBBBBBFFFFFFFFFFFF(ruleresult, process, useCase, _p2uc,
				flow, _se2bf, start, sf, _sf2f, cond);
				// EMoflonEdge process__start____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__cond____precondition = (EMoflonEdge) result3_green[13];
				// EMoflonEdge _p2uc__process____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge _p2uc__useCase____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge _se2bf__start____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge _se2bf__flow____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf__start____sourceRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge start__sf____outgoing = (EMoflonEdge) result3_green[19];
				// EMoflonEdge _sf2f__sf____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge _sf2f__flow____target = (EMoflonEdge) result3_green[21];

		// perform postprocessing story node is empty
		// register objects
		Process2UseCaseImpl.pattern_Process2UseCase_1_5_expressionBBBBBBBBBBB(this, ruleresult, process, useCase, _p2uc,
				flow, _se2bf, start, sf, _sf2f, cond);
		return Process2UseCaseImpl.pattern_Process2UseCase_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Process2UseCaseImpl.pattern_Process2UseCase_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		StartEvent start = (StartEvent) result2_binding[1];
		SequenceFlow sf = (SequenceFlow) result2_binding[2];
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_2_2_blackBBBB(process, start, sf,
				match)) {
			// ForEach find context
			for (Object[] result3_black : Process2UseCaseImpl.pattern_Process2UseCase_2_3_blackBBB(process, start,
					sf)) {
				Object[] result3_green = Process2UseCaseImpl.pattern_Process2UseCase_2_3_greenBBBFFFFF(process, start,
						sf);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[3];
				// EMoflonEdge process__start____flowElements = (EMoflonEdge) result3_green[4];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[5];
				// EMoflonEdge sf__start____sourceRef = (EMoflonEdge) result3_green[6];
				// EMoflonEdge start__sf____outgoing = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = Process2UseCaseImpl
						.pattern_Process2UseCase_2_4_bindingAndBlackFBBBBB(this, isApplicableMatch, process, start, sf);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[start] = " + start + ", " + "[sf] = " + sf + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Process2UseCaseImpl.pattern_Process2UseCase_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Process2UseCaseImpl.pattern_Process2UseCase_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Process2UseCaseImpl.pattern_Process2UseCase_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Process2UseCaseImpl.pattern_Process2UseCase_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		match.registerObject("process", process);
		match.registerObject("start", start);
		match.registerObject("sf", sf);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {// Create CSP
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
			StartEvent start, SequenceFlow sf) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start.id", true, csp);
		var_start_id.setValue(start.getId());
		var_start_id.setType("String");

		// Create unbound variables
		Variable var_cond_name = CSPFactoryHelper.eINSTANCE.createVariable("cond.name", csp);
		var_cond_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_start_id, var_cond_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("start", start);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject process, EObject useCase, EObject _p2uc,
			EObject flow, EObject _se2bf, EObject start, EObject sf, EObject _sf2f, EObject cond) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("_p2uc", _p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("_se2bf", _se2bf);
		ruleresult.registerObject("start", start);
		ruleresult.registerObject("sf", sf);
		ruleresult.registerObject("_sf2f", _sf2f);
		ruleresult.registerObject("cond", cond);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("process").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getProcess())
				&& match.getObject("start").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getStartEvent())
				&& match.getObject("sf").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, UseCase useCase, BasicFlow flow, UCCondition cond) {
		// initial bindings
		Object[] result1_black = Process2UseCaseImpl.pattern_Process2UseCase_10_1_blackBBBBB(this, match, useCase, flow,
				cond);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", "
					+ "[flow] = " + flow + ", " + "[cond] = " + cond + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_10_2_bindingAndBlackFBBBBB(this,
				match, useCase, flow, cond);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[flow] = " + flow
					+ ", " + "[cond] = " + cond + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Process2UseCaseImpl.pattern_Process2UseCase_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Process2UseCaseImpl.pattern_Process2UseCase_10_4_blackBBBB(match, useCase, flow,
					cond);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[flow] = "
						+ flow + ", " + "[cond] = " + cond + ".");
			}
			Process2UseCaseImpl.pattern_Process2UseCase_10_4_greenBBBBFF(match, useCase, flow, cond);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result4_green[4];
			// EMoflonEdge useCase__cond____precondition = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = Process2UseCaseImpl.pattern_Process2UseCase_10_5_blackBBBB(match, useCase, flow,
					cond);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[useCase] = " + useCase + ", " + "[flow] = "
						+ flow + ", " + "[cond] = " + cond + ".");
			}
			// register objects to match
			Process2UseCaseImpl.pattern_Process2UseCase_10_6_expressionBBBBB(this, match, useCase, flow, cond);
			return Process2UseCaseImpl.pattern_Process2UseCase_10_7_expressionF();
		} else {
			return Process2UseCaseImpl.pattern_Process2UseCase_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_11_1_bindingAndBlackFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		UseCase useCase = (UseCase) result1_bindingAndBlack[0];
		BasicFlow flow = (BasicFlow) result1_bindingAndBlack[1];
		UCCondition cond = (UCCondition) result1_bindingAndBlack[2];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_11_1_greenFBFBFFFFB(useCase, flow, csp);
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_green[0];
		P2UC _p2uc = (P2UC) result1_green[2];
		SE2BF _se2bf = (SE2BF) result1_green[4];
		StartEvent start = (StartEvent) result1_green[5];
		SequenceFlow sf = (SequenceFlow) result1_green[6];
		SF2F _sf2f = (SF2F) result1_green[7];

		// collect translated elements
		Object[] result2_black = Process2UseCaseImpl.pattern_Process2UseCase_11_2_blackBBBBBBBBB(process, useCase,
				_p2uc, flow, _se2bf, start, sf, _sf2f, cond);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc + ", "
					+ "[flow] = " + flow + ", " + "[_se2bf] = " + _se2bf + ", " + "[start] = " + start + ", "
					+ "[sf] = " + sf + ", " + "[_sf2f] = " + _sf2f + ", " + "[cond] = " + cond + ".");
		}
		Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_11_2_greenFBBBBBBBBB(process, useCase,
				_p2uc, flow, _se2bf, start, sf, _sf2f, cond);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Process2UseCaseImpl.pattern_Process2UseCase_11_3_blackBBBBBBBBBB(ruleresult, process,
				useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[_p2uc] = " + _p2uc + ", " + "[flow] = " + flow + ", " + "[_se2bf] = " + _se2bf + ", "
					+ "[start] = " + start + ", " + "[sf] = " + sf + ", " + "[_sf2f] = " + _sf2f + ", " + "[cond] = "
					+ cond + ".");
		}
		Process2UseCaseImpl.pattern_Process2UseCase_11_3_greenBBBBBBBBBBFFFFFFFFFFFF(ruleresult, process, useCase,
				_p2uc, flow, _se2bf, start, sf, _sf2f, cond);
				// EMoflonEdge process__start____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__sf____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__cond____precondition = (EMoflonEdge) result3_green[13];
				// EMoflonEdge _p2uc__process____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge _p2uc__useCase____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge _se2bf__start____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge _se2bf__flow____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf__start____sourceRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge start__sf____outgoing = (EMoflonEdge) result3_green[19];
				// EMoflonEdge _sf2f__sf____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge _sf2f__flow____target = (EMoflonEdge) result3_green[21];

		// perform postprocessing story node is empty
		// register objects
		Process2UseCaseImpl.pattern_Process2UseCase_11_5_expressionBBBBBBBBBBB(this, ruleresult, process, useCase,
				_p2uc, flow, _se2bf, start, sf, _sf2f, cond);
		return Process2UseCaseImpl.pattern_Process2UseCase_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Process2UseCaseImpl.pattern_Process2UseCase_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		UseCase useCase = (UseCase) result2_binding[0];
		BasicFlow flow = (BasicFlow) result2_binding[1];
		UCCondition cond = (UCCondition) result2_binding[2];
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_12_2_blackBBBB(useCase, flow, cond,
				match)) {
			// ForEach find context
			for (Object[] result3_black : Process2UseCaseImpl.pattern_Process2UseCase_12_3_blackBBB(useCase, flow,
					cond)) {
				Object[] result3_green = Process2UseCaseImpl.pattern_Process2UseCase_12_3_greenBBBFFF(useCase, flow,
						cond);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[3];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[4];
				// EMoflonEdge useCase__cond____precondition = (EMoflonEdge) result3_green[5];

				// solve CSP
				Object[] result4_bindingAndBlack = Process2UseCaseImpl
						.pattern_Process2UseCase_12_4_bindingAndBlackFBBBBB(this, isApplicableMatch, useCase, flow,
								cond);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[useCase] = " + useCase + ", " + "[flow] = " + flow + ", " + "[cond] = " + cond + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Process2UseCaseImpl.pattern_Process2UseCase_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Process2UseCaseImpl.pattern_Process2UseCase_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Process2UseCaseImpl.pattern_Process2UseCase_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Process2UseCaseImpl.pattern_Process2UseCase_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, UseCase useCase, BasicFlow flow, UCCondition cond) {
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("cond", cond);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, UseCase useCase, BasicFlow flow, UCCondition cond) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, UseCase useCase, BasicFlow flow,
			UCCondition cond) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cond_name = CSPFactoryHelper.eINSTANCE.createVariable("cond.name", true, csp);
		var_cond_name.setValue(cond.getName());
		var_cond_name.setType("String");

		// Create unbound variables
		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start.id", csp);
		var_start_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_start_id, var_cond_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("cond", cond);
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
			EObject flow, EObject _se2bf, EObject start, EObject sf, EObject _sf2f, EObject cond) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("_p2uc", _p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("_se2bf", _se2bf);
		ruleresult.registerObject("start", start);
		ruleresult.registerObject("sf", sf);
		ruleresult.registerObject("_sf2f", _sf2f);
		ruleresult.registerObject("cond", cond);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("useCase").eClass().equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getUseCase())
				&& match.getObject("flow").eClass().equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getBasicFlow())
				&& match.getObject("cond").eClass()
						.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getUCCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_102(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_20_2_blackFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			StartEvent start = (StartEvent) result2_black[1];
			SequenceFlow sf = (SequenceFlow) result2_black[2];
			Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Process2UseCaseImpl.pattern_Process2UseCase_20_3_expressionFBBBBB(this, match, process, start, sf)) {
				// Ensure that the correct types of elements are matched
				if (Process2UseCaseImpl.pattern_Process2UseCase_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Process2UseCaseImpl.pattern_Process2UseCase_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Process2UseCaseImpl.pattern_Process2UseCase_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Process2UseCaseImpl.pattern_Process2UseCase_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_103(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_21_2_blackFFFB(_edge_flowElements)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			StartEvent start = (StartEvent) result2_black[1];
			SequenceFlow sf = (SequenceFlow) result2_black[2];
			Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Process2UseCaseImpl.pattern_Process2UseCase_21_3_expressionFBBBBB(this, match, process, start, sf)) {
				// Ensure that the correct types of elements are matched
				if (Process2UseCaseImpl.pattern_Process2UseCase_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Process2UseCaseImpl.pattern_Process2UseCase_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Process2UseCaseImpl.pattern_Process2UseCase_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Process2UseCaseImpl.pattern_Process2UseCase_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_29(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_22_2_blackFFFB(_edge_flows)) {
			UseCase useCase = (UseCase) result2_black[0];
			BasicFlow flow = (BasicFlow) result2_black[1];
			UCCondition cond = (UCCondition) result2_black[2];
			Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Process2UseCaseImpl.pattern_Process2UseCase_22_3_expressionFBBBBB(this, match, useCase, flow, cond)) {
				// Ensure that the correct types of elements are matched
				if (Process2UseCaseImpl.pattern_Process2UseCase_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Process2UseCaseImpl.pattern_Process2UseCase_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Process2UseCaseImpl.pattern_Process2UseCase_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Process2UseCaseImpl.pattern_Process2UseCase_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_30(EMoflonEdge _edge_precondition) {
		// prepare return value
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_23_2_blackFFFB(_edge_precondition)) {
			UseCase useCase = (UseCase) result2_black[0];
			BasicFlow flow = (BasicFlow) result2_black[1];
			UCCondition cond = (UCCondition) result2_black[2];
			Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Process2UseCaseImpl.pattern_Process2UseCase_23_3_expressionFBBBBB(this, match, useCase, flow, cond)) {
				// Ensure that the correct types of elements are matched
				if (Process2UseCaseImpl.pattern_Process2UseCase_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Process2UseCaseImpl.pattern_Process2UseCase_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Process2UseCaseImpl.pattern_Process2UseCase_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Process2UseCaseImpl.pattern_Process2UseCase_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_104(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_24_2_blackFFFB(_edge_sourceRef)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			StartEvent start = (StartEvent) result2_black[1];
			SequenceFlow sf = (SequenceFlow) result2_black[2];
			Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Process2UseCaseImpl.pattern_Process2UseCase_24_3_expressionFBBBBB(this, match, process, start, sf)) {
				// Ensure that the correct types of elements are matched
				if (Process2UseCaseImpl.pattern_Process2UseCase_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Process2UseCaseImpl.pattern_Process2UseCase_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Process2UseCaseImpl.pattern_Process2UseCase_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Process2UseCaseImpl.pattern_Process2UseCase_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_105(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_25_2_blackFFFB(_edge_outgoing)) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[0];
			StartEvent start = (StartEvent) result2_black[1];
			SequenceFlow sf = (SequenceFlow) result2_black[2];
			Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Process2UseCaseImpl.pattern_Process2UseCase_25_3_expressionFBBBBB(this, match, process, start, sf)) {
				// Ensure that the correct types of elements are matched
				if (Process2UseCaseImpl.pattern_Process2UseCase_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Process2UseCaseImpl.pattern_Process2UseCase_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Process2UseCaseImpl.pattern_Process2UseCase_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Process2UseCaseImpl.pattern_Process2UseCase_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Process2UseCase");
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

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.BasicFlow flow = (SimpleUseCase.BasicFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_se2bf = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_se2bf")).findAny();
		Bpmn2UseCase.SE2BF _se2bf = (Bpmn2UseCase.SE2BF) matchFor_se2bf.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStart = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("start")).findAny();
		SimpleBPMN.StartEvent start = (SimpleBPMN.StartEvent) matchForStart.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf")).findAny();
		SimpleBPMN.SequenceFlow sf = (SimpleBPMN.SequenceFlow) matchForSf.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f")).findAny();
		Bpmn2UseCase.SF2F _sf2f = (Bpmn2UseCase.SF2F) matchFor_sf2f.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCond = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cond")).findAny();
		SimpleUseCase.UCCondition cond = (SimpleUseCase.UCCondition) matchForCond.get().getNode();

		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start", true, csp);
		var_start_id.setValue(start.getId());
		var_start_id.setType("String");

		Variable var_cond_name = CSPFactoryHelper.eINSTANCE.createVariable("cond", true, csp);
		var_cond_name.setValue(cond.getName());
		var_cond_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("Process2UseCase");
		eq0.solve(var_start_id, var_cond_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_cond_name.setBound(false);
			eq0.solve(var_start_id, var_cond_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				cond.setName((String) var_cond_name.getValue());
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
		ruleResult.setRule("Process2UseCase");
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

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.BasicFlow flow = (SimpleUseCase.BasicFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_se2bf = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_se2bf")).findAny();
		Bpmn2UseCase.SE2BF _se2bf = (Bpmn2UseCase.SE2BF) matchFor_se2bf.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStart = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("start")).findAny();
		SimpleBPMN.StartEvent start = (SimpleBPMN.StartEvent) matchForStart.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf")).findAny();
		SimpleBPMN.SequenceFlow sf = (SimpleBPMN.SequenceFlow) matchForSf.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f")).findAny();
		Bpmn2UseCase.SF2F _sf2f = (Bpmn2UseCase.SF2F) matchFor_sf2f.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCond = tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cond")).findAny();
		SimpleUseCase.UCCondition cond = (SimpleUseCase.UCCondition) matchForCond.get().getNode();

		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start", true, csp);
		var_start_id.setValue(start.getId());
		var_start_id.setType("String");

		Variable var_cond_name = CSPFactoryHelper.eINSTANCE.createVariable("cond", true, csp);
		var_cond_name.setValue(cond.getName());
		var_cond_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("Process2UseCase");
		eq0.solve(var_start_id, var_cond_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_start_id.setBound(false);
			eq0.solve(var_start_id, var_cond_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				start.setId((String) var_start_id.getValue());
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
		Object[] result1_black = Process2UseCaseImpl.pattern_Process2UseCase_28_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_28_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = Process2UseCaseImpl.pattern_Process2UseCase_28_2_bindingFFFFFFBB(sourceMatch,
				targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		BasicFlow flow = (BasicFlow) result2_binding[2];
		StartEvent start = (StartEvent) result2_binding[3];
		SequenceFlow sf = (SequenceFlow) result2_binding[4];
		UCCondition cond = (UCCondition) result2_binding[5];
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_28_2_blackBBBBBBBB(process, useCase,
				flow, start, sf, cond, sourceMatch, targetMatch)) {
			Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_28_2_greenBBBBBBBFB(process, useCase,
					flow, start, sf, cond, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[7];

			// check csp
			Object[] result3_bindingAndBlack = Process2UseCaseImpl
					.pattern_Process2UseCase_28_3_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, process, useCase,
							flow, start, sf, cond, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = Process2UseCaseImpl.pattern_Process2UseCase_28_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				Process2UseCaseImpl.pattern_Process2UseCase_28_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return Process2UseCaseImpl.pattern_Process2UseCase_28_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process,
			UseCase useCase, BasicFlow flow, StartEvent start, SequenceFlow sf, UCCondition cond, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start.id", true, csp);
		var_start_id.setValue(start.getId());
		var_start_id.setType("String");
		Variable var_cond_name = CSPFactoryHelper.eINSTANCE.createVariable("cond.name", true, csp);
		var_cond_name.setValue(cond.getName());
		var_cond_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_start_id, var_cond_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("start", start);
		isApplicableMatch.registerObject("sf", sf);
		isApplicableMatch.registerObject("cond", cond);
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
		Object[] result1_black = Process2UseCaseImpl.pattern_Process2UseCase_31_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = Process2UseCaseImpl
				.pattern_Process2UseCase_31_2_bindingAndBlackFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[0];
		UseCase useCase = (UseCase) result2_bindingAndBlack[1];
		BasicFlow flow = (BasicFlow) result2_bindingAndBlack[2];
		StartEvent start = (StartEvent) result2_bindingAndBlack[3];
		SequenceFlow sf = (SequenceFlow) result2_bindingAndBlack[4];
		// UCCondition cond = (UCCondition) result2_bindingAndBlack[5];
		Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_31_2_greenBBBBBFFFF(process, useCase, flow,
				start, sf);
		PerformRuleResult result = (PerformRuleResult) result2_green[5];
		// P2UC _p2uc = (P2UC) result2_green[6];
		// SE2BF _se2bf = (SE2BF) result2_green[7];
		// SF2F _sf2f = (SF2F) result2_green[8];

		return Process2UseCaseImpl.pattern_Process2UseCase_31_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {
		// create result
		Object[] result1_black = Process2UseCaseImpl.pattern_Process2UseCase_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_32_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// is applicable core
		Object[] result2_black = Process2UseCaseImpl.pattern_Process2UseCase_32_2_blackB(this);
		if (result2_black != null) {

			// solve CSP
			Object[] result3_bindingAndBlack = Process2UseCaseImpl
					.pattern_Process2UseCase_32_3_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (Process2UseCaseImpl.pattern_Process2UseCase_32_4_expressionFBB(this, csp)) {
				// check nacs story node is empty

				// perform
				Object[] result6_black = Process2UseCaseImpl.pattern_Process2UseCase_32_6_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
							+ "[ruleResult] = " + ruleResult + ".");
				}
				Process2UseCaseImpl.pattern_Process2UseCase_32_6_greenFFFFFFFFFBB(ruleResult, csp);
				// SimpleBPMN.Process process = (SimpleBPMN.Process) result6_green[0];
				// UseCase useCase = (UseCase) result6_green[1];
				// P2UC _p2uc = (P2UC) result6_green[2];
				// BasicFlow flow = (BasicFlow) result6_green[3];
				// SE2BF _se2bf = (SE2BF) result6_green[4];
				// StartEvent start = (StartEvent) result6_green[5];
				// SequenceFlow sf = (SequenceFlow) result6_green[6];
				// SF2F _sf2f = (SF2F) result6_green[7];
				// UCCondition cond = (UCCondition) result6_green[8];

			} else {
			}

		} else {
		}
		return Process2UseCaseImpl.pattern_Process2UseCase_32_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start.id", csp);
		var_start_id.setType("String");
		Variable var_cond_name = CSPFactoryHelper.eINSTANCE.createVariable("cond.name", csp);
		var_cond_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_start_id, var_cond_name);

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_FWD__MATCH_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(StartEvent) arguments.get(2), (SequenceFlow) arguments.get(3));
		case RulesPackage.PROCESS2_USE_CASE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_STARTEVENT_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(StartEvent) arguments.get(2), (SequenceFlow) arguments.get(3));
			return null;
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SimpleBPMN.Process) arguments.get(1),
					(StartEvent) arguments.get(2), (SequenceFlow) arguments.get(3));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_STARTEVENT_SEQUENCEFLOW:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (StartEvent) arguments.get(2),
					(SequenceFlow) arguments.get(3));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.PROCESS2_USE_CASE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_BWD__MATCH_USECASE_BASICFLOW_UCCONDITION:
			return isAppropriate_BWD((Match) arguments.get(0), (UseCase) arguments.get(1), (BasicFlow) arguments.get(2),
					(UCCondition) arguments.get(3));
		case RulesPackage.PROCESS2_USE_CASE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_USECASE_BASICFLOW_UCCONDITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(BasicFlow) arguments.get(2), (UCCondition) arguments.get(3));
			return null;
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_USECASE_BASICFLOW_UCCONDITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (UseCase) arguments.get(1),
					(BasicFlow) arguments.get(2), (UCCondition) arguments.get(3));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_USECASE_BASICFLOW_UCCONDITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (UseCase) arguments.get(1),
					(BasicFlow) arguments.get(2), (UCCondition) arguments.get(3));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.PROCESS2_USE_CASE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_102__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_102((EMoflonEdge) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_103__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_103((EMoflonEdge) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_30((EMoflonEdge) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_104__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_104((EMoflonEdge) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_105__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_105((EMoflonEdge) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_PROCESS_USECASE_BASICFLOW_STARTEVENT_SEQUENCEFLOW_UCCONDITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0),
					(SimpleBPMN.Process) arguments.get(1), (UseCase) arguments.get(2), (BasicFlow) arguments.get(3),
					(StartEvent) arguments.get(4), (SequenceFlow) arguments.get(5), (UCCondition) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.PROCESS2_USE_CASE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Process2UseCase_0_1_blackBBBBB(Process2UseCase _this, Match match,
			SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		return new Object[] { _this, match, process, start, sf };
	}

	public static final Object[] pattern_Process2UseCase_0_2_bindingFBBBBB(Process2UseCase _this, Match match,
			SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, start, sf);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, start, sf };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Process2UseCase_0_2_bindingAndBlackFBBBBB(Process2UseCase _this, Match match,
			SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		Object[] result_pattern_Process2UseCase_0_2_binding = pattern_Process2UseCase_0_2_bindingFBBBBB(_this, match,
				process, start, sf);
		if (result_pattern_Process2UseCase_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Process2UseCase_0_2_binding[0];

			Object[] result_pattern_Process2UseCase_0_2_black = pattern_Process2UseCase_0_2_blackB(csp);
			if (result_pattern_Process2UseCase_0_2_black != null) {

				return new Object[] { csp, _this, match, process, start, sf };
			}
		}
		return null;
	}

	public static final boolean pattern_Process2UseCase_0_3_expressionFBB(Process2UseCase _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_0_4_blackBBBB(Match match, SimpleBPMN.Process process,
			StartEvent start, SequenceFlow sf) {
		return new Object[] { match, process, start, sf };
	}

	public static final Object[] pattern_Process2UseCase_0_4_greenBBBBFFFF(Match match, SimpleBPMN.Process process,
			StartEvent start, SequenceFlow sf) {
		EMoflonEdge process__start____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__start____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge start__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(process);
		match.getToBeTranslatedNodes().add(start);
		match.getToBeTranslatedNodes().add(sf);
		String process__start____flowElements_name_prime = "flowElements";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__start____sourceRef_name_prime = "sourceRef";
		String start__sf____outgoing_name_prime = "outgoing";
		process__start____flowElements.setSrc(process);
		process__start____flowElements.setTrg(start);
		match.getToBeTranslatedEdges().add(process__start____flowElements);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		match.getToBeTranslatedEdges().add(process__sf____flowElements);
		sf__start____sourceRef.setSrc(sf);
		sf__start____sourceRef.setTrg(start);
		match.getToBeTranslatedEdges().add(sf__start____sourceRef);
		start__sf____outgoing.setSrc(start);
		start__sf____outgoing.setTrg(sf);
		match.getToBeTranslatedEdges().add(start__sf____outgoing);
		process__start____flowElements.setName(process__start____flowElements_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__start____sourceRef.setName(sf__start____sourceRef_name_prime);
		start__sf____outgoing.setName(start__sf____outgoing_name_prime);
		return new Object[] { match, process, start, sf, process__start____flowElements, process__sf____flowElements,
				sf__start____sourceRef, start__sf____outgoing };
	}

	public static final Object[] pattern_Process2UseCase_0_5_blackBBBB(Match match, SimpleBPMN.Process process,
			StartEvent start, SequenceFlow sf) {
		return new Object[] { match, process, start, sf };
	}

	public static final void pattern_Process2UseCase_0_6_expressionBBBBB(Process2UseCase _this, Match match,
			SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		_this.registerObjectsToMatch_FWD(match, process, start, sf);

	}

	public static final boolean pattern_Process2UseCase_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_1_1_bindingFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("start");
		EObject _localVariable_2 = isApplicableMatch.getObject("sf");
		EObject tmpProcess = _localVariable_0;
		EObject tmpStart = _localVariable_1;
		EObject tmpSf = _localVariable_2;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpStart instanceof StartEvent) {
				StartEvent start = (StartEvent) tmpStart;
				if (tmpSf instanceof SequenceFlow) {
					SequenceFlow sf = (SequenceFlow) tmpSf;
					return new Object[] { process, start, sf, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_1_1_blackBBBBFB(SimpleBPMN.Process process, StartEvent start,
			SequenceFlow sf, Process2UseCase _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { process, start, sf, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_1_1_bindingAndBlackFFFBFB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Process2UseCase_1_1_binding = pattern_Process2UseCase_1_1_bindingFFFB(
				isApplicableMatch);
		if (result_pattern_Process2UseCase_1_1_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Process2UseCase_1_1_binding[0];
			StartEvent start = (StartEvent) result_pattern_Process2UseCase_1_1_binding[1];
			SequenceFlow sf = (SequenceFlow) result_pattern_Process2UseCase_1_1_binding[2];

			Object[] result_pattern_Process2UseCase_1_1_black = pattern_Process2UseCase_1_1_blackBBBBFB(process, start,
					sf, _this, isApplicableMatch);
			if (result_pattern_Process2UseCase_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Process2UseCase_1_1_black[4];

				return new Object[] { process, start, sf, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_1_1_greenBFFFFBBFFB(SimpleBPMN.Process process,
			StartEvent start, SequenceFlow sf, CSP csp) {
		UseCase useCase = SimpleUseCaseFactory.eINSTANCE.createUseCase();
		P2UC _p2uc = Bpmn2UseCaseFactory.eINSTANCE.createP2UC();
		BasicFlow flow = SimpleUseCaseFactory.eINSTANCE.createBasicFlow();
		SE2BF _se2bf = Bpmn2UseCaseFactory.eINSTANCE.createSE2BF();
		SF2F _sf2f = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		UCCondition cond = SimpleUseCaseFactory.eINSTANCE.createUCCondition();
		Object _localVariable_0 = csp.getValue("cond", "name");
		_p2uc.setSource(process);
		_p2uc.setTarget(useCase);
		useCase.getFlows().add(flow);
		_se2bf.setSource(start);
		_se2bf.setTarget(flow);
		_sf2f.setSource(sf);
		_sf2f.setTarget(flow);
		useCase.setPrecondition(cond);
		String cond_name_prime = (String) _localVariable_0;
		cond.setName(cond_name_prime);
		return new Object[] { process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond, csp };
	}

	public static final Object[] pattern_Process2UseCase_1_2_blackBBBBBBBBB(SimpleBPMN.Process process, UseCase useCase,
			P2UC _p2uc, BasicFlow flow, SE2BF _se2bf, StartEvent start, SequenceFlow sf, SF2F _sf2f, UCCondition cond) {
		return new Object[] { process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond };
	}

	public static final Object[] pattern_Process2UseCase_1_2_greenFBBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, BasicFlow flow, SE2BF _se2bf, StartEvent start, SequenceFlow sf, SF2F _sf2f,
			UCCondition cond) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(process);
		ruleresult.getCreatedElements().add(useCase);
		ruleresult.getCreatedLinkElements().add(_p2uc);
		ruleresult.getCreatedElements().add(flow);
		ruleresult.getCreatedLinkElements().add(_se2bf);
		ruleresult.getTranslatedElements().add(start);
		ruleresult.getTranslatedElements().add(sf);
		ruleresult.getCreatedLinkElements().add(_sf2f);
		ruleresult.getCreatedElements().add(cond);
		return new Object[] { ruleresult, process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond };
	}

	public static final Object[] pattern_Process2UseCase_1_3_blackBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _se2bf, EObject start, EObject sf,
			EObject _sf2f, EObject cond) {
		if (!process.equals(useCase)) {
			if (!process.equals(start)) {
				if (!process.equals(sf)) {
					if (!_p2uc.equals(process)) {
						if (!_p2uc.equals(useCase)) {
							if (!_p2uc.equals(flow)) {
								if (!_p2uc.equals(_se2bf)) {
									if (!_p2uc.equals(start)) {
										if (!_p2uc.equals(sf)) {
											if (!_p2uc.equals(_sf2f)) {
												if (!_p2uc.equals(cond)) {
													if (!flow.equals(process)) {
														if (!flow.equals(useCase)) {
															if (!flow.equals(start)) {
																if (!flow.equals(sf)) {
																	if (!_se2bf.equals(process)) {
																		if (!_se2bf.equals(useCase)) {
																			if (!_se2bf.equals(flow)) {
																				if (!_se2bf.equals(start)) {
																					if (!_se2bf.equals(sf)) {
																						if (!_se2bf.equals(_sf2f)) {
																							if (!_se2bf.equals(cond)) {
																								if (!start.equals(
																										useCase)) {
																									if (!sf.equals(
																											useCase)) {
																										if (!sf.equals(
																												start)) {
																											if (!_sf2f
																													.equals(process)) {
																												if (!_sf2f
																														.equals(useCase)) {
																													if (!_sf2f
																															.equals(flow)) {
																														if (!_sf2f
																																.equals(start)) {
																															if (!_sf2f
																																	.equals(sf)) {
																																if (!_sf2f
																																		.equals(cond)) {
																																	if (!cond
																																			.equals(process)) {
																																		if (!cond
																																				.equals(useCase)) {
																																			if (!cond
																																					.equals(flow)) {
																																				if (!cond
																																						.equals(start)) {
																																					if (!cond
																																							.equals(sf)) {
																																						return new Object[] {
																																								ruleresult,
																																								process,
																																								useCase,
																																								_p2uc,
																																								flow,
																																								_se2bf,
																																								start,
																																								sf,
																																								_sf2f,
																																								cond };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Process2UseCase_1_3_greenBBBBBBBBBBFFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _se2bf, EObject start, EObject sf,
			EObject _sf2f, EObject cond) {
		EMoflonEdge process__start____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__cond____precondition = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _se2bf__start____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _se2bf__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__start____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge start__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f__sf____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Process2UseCase";
		String process__start____flowElements_name_prime = "flowElements";
		String process__sf____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String useCase__cond____precondition_name_prime = "precondition";
		String _p2uc__process____source_name_prime = "source";
		String _p2uc__useCase____target_name_prime = "target";
		String _se2bf__start____source_name_prime = "source";
		String _se2bf__flow____target_name_prime = "target";
		String sf__start____sourceRef_name_prime = "sourceRef";
		String start__sf____outgoing_name_prime = "outgoing";
		String _sf2f__sf____source_name_prime = "source";
		String _sf2f__flow____target_name_prime = "target";
		process__start____flowElements.setSrc(process);
		process__start____flowElements.setTrg(start);
		ruleresult.getTranslatedEdges().add(process__start____flowElements);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		ruleresult.getTranslatedEdges().add(process__sf____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		ruleresult.getCreatedEdges().add(useCase__flow____flows);
		useCase__cond____precondition.setSrc(useCase);
		useCase__cond____precondition.setTrg(cond);
		ruleresult.getCreatedEdges().add(useCase__cond____precondition);
		_p2uc__process____source.setSrc(_p2uc);
		_p2uc__process____source.setTrg(process);
		ruleresult.getCreatedEdges().add(_p2uc__process____source);
		_p2uc__useCase____target.setSrc(_p2uc);
		_p2uc__useCase____target.setTrg(useCase);
		ruleresult.getCreatedEdges().add(_p2uc__useCase____target);
		_se2bf__start____source.setSrc(_se2bf);
		_se2bf__start____source.setTrg(start);
		ruleresult.getCreatedEdges().add(_se2bf__start____source);
		_se2bf__flow____target.setSrc(_se2bf);
		_se2bf__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_se2bf__flow____target);
		sf__start____sourceRef.setSrc(sf);
		sf__start____sourceRef.setTrg(start);
		ruleresult.getTranslatedEdges().add(sf__start____sourceRef);
		start__sf____outgoing.setSrc(start);
		start__sf____outgoing.setTrg(sf);
		ruleresult.getTranslatedEdges().add(start__sf____outgoing);
		_sf2f__sf____source.setSrc(_sf2f);
		_sf2f__sf____source.setTrg(sf);
		ruleresult.getCreatedEdges().add(_sf2f__sf____source);
		_sf2f__flow____target.setSrc(_sf2f);
		_sf2f__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_sf2f__flow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__start____flowElements.setName(process__start____flowElements_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__cond____precondition.setName(useCase__cond____precondition_name_prime);
		_p2uc__process____source.setName(_p2uc__process____source_name_prime);
		_p2uc__useCase____target.setName(_p2uc__useCase____target_name_prime);
		_se2bf__start____source.setName(_se2bf__start____source_name_prime);
		_se2bf__flow____target.setName(_se2bf__flow____target_name_prime);
		sf__start____sourceRef.setName(sf__start____sourceRef_name_prime);
		start__sf____outgoing.setName(start__sf____outgoing_name_prime);
		_sf2f__sf____source.setName(_sf2f__sf____source_name_prime);
		_sf2f__flow____target.setName(_sf2f__flow____target_name_prime);
		return new Object[] { ruleresult, process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond,
				process__start____flowElements, process__sf____flowElements, useCase__flow____flows,
				useCase__cond____precondition, _p2uc__process____source, _p2uc__useCase____target,
				_se2bf__start____source, _se2bf__flow____target, sf__start____sourceRef, start__sf____outgoing,
				_sf2f__sf____source, _sf2f__flow____target };
	}

	public static final void pattern_Process2UseCase_1_5_expressionBBBBBBBBBBB(Process2UseCase _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _se2bf,
			EObject start, EObject sf, EObject _sf2f, EObject cond) {
		_this.registerObjects_FWD(ruleresult, process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond);

	}

	public static final PerformRuleResult pattern_Process2UseCase_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_2_1_bindingFB(Process2UseCase _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_2_1_blackFBB(EClass eClass, Process2UseCase _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_2_1_bindingAndBlackFFB(Process2UseCase _this) {
		Object[] result_pattern_Process2UseCase_2_1_binding = pattern_Process2UseCase_2_1_bindingFB(_this);
		if (result_pattern_Process2UseCase_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Process2UseCase_2_1_binding[0];

			Object[] result_pattern_Process2UseCase_2_1_black = pattern_Process2UseCase_2_1_blackFBB(eClass, _this);
			if (result_pattern_Process2UseCase_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Process2UseCase_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Process2UseCase";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Process2UseCase_2_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("start");
		EObject _localVariable_2 = match.getObject("sf");
		EObject tmpProcess = _localVariable_0;
		EObject tmpStart = _localVariable_1;
		EObject tmpSf = _localVariable_2;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpStart instanceof StartEvent) {
				StartEvent start = (StartEvent) tmpStart;
				if (tmpSf instanceof SequenceFlow) {
					SequenceFlow sf = (SequenceFlow) tmpSf;
					return new Object[] { process, start, sf, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_2_2_blackBBBB(SimpleBPMN.Process process,
			StartEvent start, SequenceFlow sf, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { process, start, sf, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_2_3_blackBBB(SimpleBPMN.Process process,
			StartEvent start, SequenceFlow sf) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.getFlowElements().contains(start)) {
			if (process.getFlowElements().contains(sf)) {
				if (start.equals(sf.getSourceRef())) {
					_result.add(new Object[] { process, start, sf });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_2_3_greenBBBFFFFF(SimpleBPMN.Process process, StartEvent start,
			SequenceFlow sf) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__start____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__start____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge start__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__start____flowElements_name_prime = "flowElements";
		String process__sf____flowElements_name_prime = "flowElements";
		String sf__start____sourceRef_name_prime = "sourceRef";
		String start__sf____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(start);
		isApplicableMatch.getAllContextElements().add(sf);
		process__start____flowElements.setSrc(process);
		process__start____flowElements.setTrg(start);
		isApplicableMatch.getAllContextElements().add(process__start____flowElements);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(process__sf____flowElements);
		sf__start____sourceRef.setSrc(sf);
		sf__start____sourceRef.setTrg(start);
		isApplicableMatch.getAllContextElements().add(sf__start____sourceRef);
		start__sf____outgoing.setSrc(start);
		start__sf____outgoing.setTrg(sf);
		isApplicableMatch.getAllContextElements().add(start__sf____outgoing);
		process__start____flowElements.setName(process__start____flowElements_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		sf__start____sourceRef.setName(sf__start____sourceRef_name_prime);
		start__sf____outgoing.setName(start__sf____outgoing_name_prime);
		return new Object[] { process, start, sf, isApplicableMatch, process__start____flowElements,
				process__sf____flowElements, sf__start____sourceRef, start__sf____outgoing };
	}

	public static final Object[] pattern_Process2UseCase_2_4_bindingFBBBBB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, process, start, sf);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, start, sf };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Process2UseCase_2_4_bindingAndBlackFBBBBB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch, SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		Object[] result_pattern_Process2UseCase_2_4_binding = pattern_Process2UseCase_2_4_bindingFBBBBB(_this,
				isApplicableMatch, process, start, sf);
		if (result_pattern_Process2UseCase_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Process2UseCase_2_4_binding[0];

			Object[] result_pattern_Process2UseCase_2_4_black = pattern_Process2UseCase_2_4_blackB(csp);
			if (result_pattern_Process2UseCase_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, start, sf };
			}
		}
		return null;
	}

	public static final boolean pattern_Process2UseCase_2_5_expressionFBB(Process2UseCase _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Process2UseCase_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Process2UseCase";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Process2UseCase_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_10_1_blackBBBBB(Process2UseCase _this, Match match,
			UseCase useCase, BasicFlow flow, UCCondition cond) {
		return new Object[] { _this, match, useCase, flow, cond };
	}

	public static final Object[] pattern_Process2UseCase_10_2_bindingFBBBBB(Process2UseCase _this, Match match,
			UseCase useCase, BasicFlow flow, UCCondition cond) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, useCase, flow, cond);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, useCase, flow, cond };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Process2UseCase_10_2_bindingAndBlackFBBBBB(Process2UseCase _this, Match match,
			UseCase useCase, BasicFlow flow, UCCondition cond) {
		Object[] result_pattern_Process2UseCase_10_2_binding = pattern_Process2UseCase_10_2_bindingFBBBBB(_this, match,
				useCase, flow, cond);
		if (result_pattern_Process2UseCase_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Process2UseCase_10_2_binding[0];

			Object[] result_pattern_Process2UseCase_10_2_black = pattern_Process2UseCase_10_2_blackB(csp);
			if (result_pattern_Process2UseCase_10_2_black != null) {

				return new Object[] { csp, _this, match, useCase, flow, cond };
			}
		}
		return null;
	}

	public static final boolean pattern_Process2UseCase_10_3_expressionFBB(Process2UseCase _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_10_4_blackBBBB(Match match, UseCase useCase, BasicFlow flow,
			UCCondition cond) {
		return new Object[] { match, useCase, flow, cond };
	}

	public static final Object[] pattern_Process2UseCase_10_4_greenBBBBFF(Match match, UseCase useCase, BasicFlow flow,
			UCCondition cond) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__cond____precondition = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(useCase);
		match.getToBeTranslatedNodes().add(flow);
		match.getToBeTranslatedNodes().add(cond);
		String useCase__flow____flows_name_prime = "flows";
		String useCase__cond____precondition_name_prime = "precondition";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getToBeTranslatedEdges().add(useCase__flow____flows);
		useCase__cond____precondition.setSrc(useCase);
		useCase__cond____precondition.setTrg(cond);
		match.getToBeTranslatedEdges().add(useCase__cond____precondition);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__cond____precondition.setName(useCase__cond____precondition_name_prime);
		return new Object[] { match, useCase, flow, cond, useCase__flow____flows, useCase__cond____precondition };
	}

	public static final Object[] pattern_Process2UseCase_10_5_blackBBBB(Match match, UseCase useCase, BasicFlow flow,
			UCCondition cond) {
		return new Object[] { match, useCase, flow, cond };
	}

	public static final void pattern_Process2UseCase_10_6_expressionBBBBB(Process2UseCase _this, Match match,
			UseCase useCase, BasicFlow flow, UCCondition cond) {
		_this.registerObjectsToMatch_BWD(match, useCase, flow, cond);

	}

	public static final boolean pattern_Process2UseCase_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_11_1_bindingFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("cond");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpCond = _localVariable_2;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpFlow instanceof BasicFlow) {
				BasicFlow flow = (BasicFlow) tmpFlow;
				if (tmpCond instanceof UCCondition) {
					UCCondition cond = (UCCondition) tmpCond;
					return new Object[] { useCase, flow, cond, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_11_1_blackBBBBFB(UseCase useCase, BasicFlow flow,
			UCCondition cond, Process2UseCase _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { useCase, flow, cond, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_11_1_bindingAndBlackFFFBFB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Process2UseCase_11_1_binding = pattern_Process2UseCase_11_1_bindingFFFB(
				isApplicableMatch);
		if (result_pattern_Process2UseCase_11_1_binding != null) {
			UseCase useCase = (UseCase) result_pattern_Process2UseCase_11_1_binding[0];
			BasicFlow flow = (BasicFlow) result_pattern_Process2UseCase_11_1_binding[1];
			UCCondition cond = (UCCondition) result_pattern_Process2UseCase_11_1_binding[2];

			Object[] result_pattern_Process2UseCase_11_1_black = pattern_Process2UseCase_11_1_blackBBBBFB(useCase, flow,
					cond, _this, isApplicableMatch);
			if (result_pattern_Process2UseCase_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Process2UseCase_11_1_black[4];

				return new Object[] { useCase, flow, cond, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_11_1_greenFBFBFFFFB(UseCase useCase, BasicFlow flow, CSP csp) {
		SimpleBPMN.Process process = SimpleBPMNFactory.eINSTANCE.createProcess();
		P2UC _p2uc = Bpmn2UseCaseFactory.eINSTANCE.createP2UC();
		SE2BF _se2bf = Bpmn2UseCaseFactory.eINSTANCE.createSE2BF();
		StartEvent start = SimpleBPMNFactory.eINSTANCE.createStartEvent();
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		SF2F _sf2f = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		Object _localVariable_0 = csp.getValue("start", "id");
		_p2uc.setSource(process);
		_p2uc.setTarget(useCase);
		_se2bf.setTarget(flow);
		process.getFlowElements().add(start);
		_se2bf.setSource(start);
		process.getFlowElements().add(sf);
		sf.setSourceRef(start);
		_sf2f.setSource(sf);
		_sf2f.setTarget(flow);
		String start_id_prime = (String) _localVariable_0;
		start.setId(start_id_prime);
		return new Object[] { process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, csp };
	}

	public static final Object[] pattern_Process2UseCase_11_2_blackBBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, BasicFlow flow, SE2BF _se2bf, StartEvent start, SequenceFlow sf, SF2F _sf2f,
			UCCondition cond) {
		return new Object[] { process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond };
	}

	public static final Object[] pattern_Process2UseCase_11_2_greenFBBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, P2UC _p2uc, BasicFlow flow, SE2BF _se2bf, StartEvent start, SequenceFlow sf, SF2F _sf2f,
			UCCondition cond) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(process);
		ruleresult.getTranslatedElements().add(useCase);
		ruleresult.getCreatedLinkElements().add(_p2uc);
		ruleresult.getTranslatedElements().add(flow);
		ruleresult.getCreatedLinkElements().add(_se2bf);
		ruleresult.getCreatedElements().add(start);
		ruleresult.getCreatedElements().add(sf);
		ruleresult.getCreatedLinkElements().add(_sf2f);
		ruleresult.getTranslatedElements().add(cond);
		return new Object[] { ruleresult, process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond };
	}

	public static final Object[] pattern_Process2UseCase_11_3_blackBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _se2bf, EObject start, EObject sf,
			EObject _sf2f, EObject cond) {
		if (!process.equals(useCase)) {
			if (!process.equals(start)) {
				if (!process.equals(sf)) {
					if (!_p2uc.equals(process)) {
						if (!_p2uc.equals(useCase)) {
							if (!_p2uc.equals(flow)) {
								if (!_p2uc.equals(_se2bf)) {
									if (!_p2uc.equals(start)) {
										if (!_p2uc.equals(sf)) {
											if (!_p2uc.equals(_sf2f)) {
												if (!_p2uc.equals(cond)) {
													if (!flow.equals(process)) {
														if (!flow.equals(useCase)) {
															if (!flow.equals(start)) {
																if (!flow.equals(sf)) {
																	if (!_se2bf.equals(process)) {
																		if (!_se2bf.equals(useCase)) {
																			if (!_se2bf.equals(flow)) {
																				if (!_se2bf.equals(start)) {
																					if (!_se2bf.equals(sf)) {
																						if (!_se2bf.equals(_sf2f)) {
																							if (!_se2bf.equals(cond)) {
																								if (!start.equals(
																										useCase)) {
																									if (!sf.equals(
																											useCase)) {
																										if (!sf.equals(
																												start)) {
																											if (!_sf2f
																													.equals(process)) {
																												if (!_sf2f
																														.equals(useCase)) {
																													if (!_sf2f
																															.equals(flow)) {
																														if (!_sf2f
																																.equals(start)) {
																															if (!_sf2f
																																	.equals(sf)) {
																																if (!_sf2f
																																		.equals(cond)) {
																																	if (!cond
																																			.equals(process)) {
																																		if (!cond
																																				.equals(useCase)) {
																																			if (!cond
																																					.equals(flow)) {
																																				if (!cond
																																						.equals(start)) {
																																					if (!cond
																																							.equals(sf)) {
																																						return new Object[] {
																																								ruleresult,
																																								process,
																																								useCase,
																																								_p2uc,
																																								flow,
																																								_se2bf,
																																								start,
																																								sf,
																																								_sf2f,
																																								cond };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Process2UseCase_11_3_greenBBBBBBBBBBFFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _se2bf, EObject start, EObject sf,
			EObject _sf2f, EObject cond) {
		EMoflonEdge process__start____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__cond____precondition = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _se2bf__start____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _se2bf__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf__start____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge start__sf____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f__sf____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _sf2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Process2UseCase";
		String process__start____flowElements_name_prime = "flowElements";
		String process__sf____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String useCase__cond____precondition_name_prime = "precondition";
		String _p2uc__process____source_name_prime = "source";
		String _p2uc__useCase____target_name_prime = "target";
		String _se2bf__start____source_name_prime = "source";
		String _se2bf__flow____target_name_prime = "target";
		String sf__start____sourceRef_name_prime = "sourceRef";
		String start__sf____outgoing_name_prime = "outgoing";
		String _sf2f__sf____source_name_prime = "source";
		String _sf2f__flow____target_name_prime = "target";
		process__start____flowElements.setSrc(process);
		process__start____flowElements.setTrg(start);
		ruleresult.getCreatedEdges().add(process__start____flowElements);
		process__sf____flowElements.setSrc(process);
		process__sf____flowElements.setTrg(sf);
		ruleresult.getCreatedEdges().add(process__sf____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		ruleresult.getTranslatedEdges().add(useCase__flow____flows);
		useCase__cond____precondition.setSrc(useCase);
		useCase__cond____precondition.setTrg(cond);
		ruleresult.getTranslatedEdges().add(useCase__cond____precondition);
		_p2uc__process____source.setSrc(_p2uc);
		_p2uc__process____source.setTrg(process);
		ruleresult.getCreatedEdges().add(_p2uc__process____source);
		_p2uc__useCase____target.setSrc(_p2uc);
		_p2uc__useCase____target.setTrg(useCase);
		ruleresult.getCreatedEdges().add(_p2uc__useCase____target);
		_se2bf__start____source.setSrc(_se2bf);
		_se2bf__start____source.setTrg(start);
		ruleresult.getCreatedEdges().add(_se2bf__start____source);
		_se2bf__flow____target.setSrc(_se2bf);
		_se2bf__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_se2bf__flow____target);
		sf__start____sourceRef.setSrc(sf);
		sf__start____sourceRef.setTrg(start);
		ruleresult.getCreatedEdges().add(sf__start____sourceRef);
		start__sf____outgoing.setSrc(start);
		start__sf____outgoing.setTrg(sf);
		ruleresult.getCreatedEdges().add(start__sf____outgoing);
		_sf2f__sf____source.setSrc(_sf2f);
		_sf2f__sf____source.setTrg(sf);
		ruleresult.getCreatedEdges().add(_sf2f__sf____source);
		_sf2f__flow____target.setSrc(_sf2f);
		_sf2f__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_sf2f__flow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__start____flowElements.setName(process__start____flowElements_name_prime);
		process__sf____flowElements.setName(process__sf____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__cond____precondition.setName(useCase__cond____precondition_name_prime);
		_p2uc__process____source.setName(_p2uc__process____source_name_prime);
		_p2uc__useCase____target.setName(_p2uc__useCase____target_name_prime);
		_se2bf__start____source.setName(_se2bf__start____source_name_prime);
		_se2bf__flow____target.setName(_se2bf__flow____target_name_prime);
		sf__start____sourceRef.setName(sf__start____sourceRef_name_prime);
		start__sf____outgoing.setName(start__sf____outgoing_name_prime);
		_sf2f__sf____source.setName(_sf2f__sf____source_name_prime);
		_sf2f__flow____target.setName(_sf2f__flow____target_name_prime);
		return new Object[] { ruleresult, process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond,
				process__start____flowElements, process__sf____flowElements, useCase__flow____flows,
				useCase__cond____precondition, _p2uc__process____source, _p2uc__useCase____target,
				_se2bf__start____source, _se2bf__flow____target, sf__start____sourceRef, start__sf____outgoing,
				_sf2f__sf____source, _sf2f__flow____target };
	}

	public static final void pattern_Process2UseCase_11_5_expressionBBBBBBBBBBB(Process2UseCase _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject _se2bf,
			EObject start, EObject sf, EObject _sf2f, EObject cond) {
		_this.registerObjects_BWD(ruleresult, process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond);

	}

	public static final PerformRuleResult pattern_Process2UseCase_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_12_1_bindingFB(Process2UseCase _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_12_1_blackFBB(EClass eClass, Process2UseCase _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_12_1_bindingAndBlackFFB(Process2UseCase _this) {
		Object[] result_pattern_Process2UseCase_12_1_binding = pattern_Process2UseCase_12_1_bindingFB(_this);
		if (result_pattern_Process2UseCase_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Process2UseCase_12_1_binding[0];

			Object[] result_pattern_Process2UseCase_12_1_black = pattern_Process2UseCase_12_1_blackFBB(eClass, _this);
			if (result_pattern_Process2UseCase_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Process2UseCase_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Process2UseCase";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Process2UseCase_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("useCase");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("cond");
		EObject tmpUseCase = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpCond = _localVariable_2;
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			if (tmpFlow instanceof BasicFlow) {
				BasicFlow flow = (BasicFlow) tmpFlow;
				if (tmpCond instanceof UCCondition) {
					UCCondition cond = (UCCondition) tmpCond;
					return new Object[] { useCase, flow, cond, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_12_2_blackBBBB(UseCase useCase, BasicFlow flow,
			UCCondition cond, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { useCase, flow, cond, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_12_3_blackBBB(UseCase useCase, BasicFlow flow,
			UCCondition cond) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (useCase.getFlows().contains(flow)) {
			if (cond.equals(useCase.getPrecondition())) {
				_result.add(new Object[] { useCase, flow, cond });
			}
		}
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_12_3_greenBBBFFF(UseCase useCase, BasicFlow flow,
			UCCondition cond) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__cond____precondition = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String useCase__flow____flows_name_prime = "flows";
		String useCase__cond____precondition_name_prime = "precondition";
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(cond);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		useCase__cond____precondition.setSrc(useCase);
		useCase__cond____precondition.setTrg(cond);
		isApplicableMatch.getAllContextElements().add(useCase__cond____precondition);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__cond____precondition.setName(useCase__cond____precondition_name_prime);
		return new Object[] { useCase, flow, cond, isApplicableMatch, useCase__flow____flows,
				useCase__cond____precondition };
	}

	public static final Object[] pattern_Process2UseCase_12_4_bindingFBBBBB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase, BasicFlow flow, UCCondition cond) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, useCase, flow, cond);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, useCase, flow, cond };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Process2UseCase_12_4_bindingAndBlackFBBBBB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch, UseCase useCase, BasicFlow flow, UCCondition cond) {
		Object[] result_pattern_Process2UseCase_12_4_binding = pattern_Process2UseCase_12_4_bindingFBBBBB(_this,
				isApplicableMatch, useCase, flow, cond);
		if (result_pattern_Process2UseCase_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Process2UseCase_12_4_binding[0];

			Object[] result_pattern_Process2UseCase_12_4_black = pattern_Process2UseCase_12_4_blackB(csp);
			if (result_pattern_Process2UseCase_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, useCase, flow, cond };
			}
		}
		return null;
	}

	public static final boolean pattern_Process2UseCase_12_5_expressionFBB(Process2UseCase _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Process2UseCase_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Process2UseCase";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Process2UseCase_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_20_1_bindingFB(Process2UseCase _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_20_1_blackFBB(EClass __eClass, Process2UseCase _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_20_1_bindingAndBlackFFB(Process2UseCase _this) {
		Object[] result_pattern_Process2UseCase_20_1_binding = pattern_Process2UseCase_20_1_bindingFB(_this);
		if (result_pattern_Process2UseCase_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Process2UseCase_20_1_binding[0];

			Object[] result_pattern_Process2UseCase_20_1_black = pattern_Process2UseCase_20_1_blackFBB(__eClass, _this);
			if (result_pattern_Process2UseCase_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Process2UseCase_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Process2UseCase_20_2_black_nac_0BB(SequenceFlow sf, StartEvent start) {
		if (start.equals(sf.getTargetRef())) {
			return new Object[] { sf, start };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_20_2_blackFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpStart = _edge_flowElements.getTrg();
			if (tmpStart instanceof StartEvent) {
				StartEvent start = (StartEvent) tmpStart;
				if (process.getFlowElements().contains(start)) {
					for (FlowElement tmpSf : process.getFlowElements()) {
						if (tmpSf instanceof SequenceFlow) {
							SequenceFlow sf = (SequenceFlow) tmpSf;
							if (start.equals(sf.getSourceRef())) {
								if (pattern_Process2UseCase_20_2_black_nac_0BB(sf, start) == null) {
									_result.add(new Object[] { process, start, sf, _edge_flowElements });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Process2UseCase_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Process2UseCase_20_3_expressionFBBBBB(Process2UseCase _this, Match match,
			SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, start, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_20_4_expressionFBB(Process2UseCase _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Process2UseCase_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Process2UseCase_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_21_1_bindingFB(Process2UseCase _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_21_1_blackFBB(EClass __eClass, Process2UseCase _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_21_1_bindingAndBlackFFB(Process2UseCase _this) {
		Object[] result_pattern_Process2UseCase_21_1_binding = pattern_Process2UseCase_21_1_bindingFB(_this);
		if (result_pattern_Process2UseCase_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Process2UseCase_21_1_binding[0];

			Object[] result_pattern_Process2UseCase_21_1_black = pattern_Process2UseCase_21_1_blackFBB(__eClass, _this);
			if (result_pattern_Process2UseCase_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Process2UseCase_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Process2UseCase_21_2_black_nac_0BB(SequenceFlow sf, StartEvent start) {
		if (start.equals(sf.getTargetRef())) {
			return new Object[] { sf, start };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_21_2_blackFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf = _edge_flowElements.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (process.getFlowElements().contains(sf)) {
					FlowNode tmpStart = sf.getSourceRef();
					if (tmpStart instanceof StartEvent) {
						StartEvent start = (StartEvent) tmpStart;
						if (process.getFlowElements().contains(start)) {
							if (pattern_Process2UseCase_21_2_black_nac_0BB(sf, start) == null) {
								_result.add(new Object[] { process, start, sf, _edge_flowElements });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Process2UseCase_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Process2UseCase_21_3_expressionFBBBBB(Process2UseCase _this, Match match,
			SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, start, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_21_4_expressionFBB(Process2UseCase _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Process2UseCase_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Process2UseCase_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_22_1_bindingFB(Process2UseCase _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_22_1_blackFBB(EClass __eClass, Process2UseCase _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_22_1_bindingAndBlackFFB(Process2UseCase _this) {
		Object[] result_pattern_Process2UseCase_22_1_binding = pattern_Process2UseCase_22_1_bindingFB(_this);
		if (result_pattern_Process2UseCase_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Process2UseCase_22_1_binding[0];

			Object[] result_pattern_Process2UseCase_22_1_black = pattern_Process2UseCase_22_1_blackFBB(__eClass, _this);
			if (result_pattern_Process2UseCase_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Process2UseCase_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Process2UseCase_22_2_black_nac_0BB(UCCondition cond, UseCase useCase) {
		for (UseCase __DEC_cond_precondition_13104 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(cond, UseCase.class, "precondition")) {
			if (!useCase.equals(__DEC_cond_precondition_13104)) {
				return new Object[] { cond, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_22_2_black_nac_1BB(UCCondition cond, BasicFlow flow) {
		for (Flow __DEC_cond_finalState_556309 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(cond, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_cond_finalState_556309)) {
				return new Object[] { cond, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_22_2_black_nac_2BB(BasicFlow flow, UCCondition cond) {
		if (flow.getFinalState().contains(cond)) {
			return new Object[] { flow, cond };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_22_2_blackFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpFlow = _edge_flows.getTrg();
			if (tmpFlow instanceof BasicFlow) {
				BasicFlow flow = (BasicFlow) tmpFlow;
				if (useCase.getFlows().contains(flow)) {
					UCCondition cond = useCase.getPrecondition();
					if (cond != null) {
						if (pattern_Process2UseCase_22_2_black_nac_0BB(cond, useCase) == null) {
							if (pattern_Process2UseCase_22_2_black_nac_1BB(cond, flow) == null) {
								if (pattern_Process2UseCase_22_2_black_nac_2BB(flow, cond) == null) {
									_result.add(new Object[] { useCase, flow, cond, _edge_flows });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Process2UseCase_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Process2UseCase_22_3_expressionFBBBBB(Process2UseCase _this, Match match,
			UseCase useCase, BasicFlow flow, UCCondition cond) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, flow, cond);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_22_4_expressionFBB(Process2UseCase _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Process2UseCase_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Process2UseCase_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_23_1_bindingFB(Process2UseCase _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_23_1_blackFBB(EClass __eClass, Process2UseCase _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_23_1_bindingAndBlackFFB(Process2UseCase _this) {
		Object[] result_pattern_Process2UseCase_23_1_binding = pattern_Process2UseCase_23_1_bindingFB(_this);
		if (result_pattern_Process2UseCase_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Process2UseCase_23_1_binding[0];

			Object[] result_pattern_Process2UseCase_23_1_black = pattern_Process2UseCase_23_1_blackFBB(__eClass, _this);
			if (result_pattern_Process2UseCase_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Process2UseCase_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Process2UseCase_23_2_black_nac_0BB(UCCondition cond, UseCase useCase) {
		for (UseCase __DEC_cond_precondition_834586 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(cond, UseCase.class, "precondition")) {
			if (!useCase.equals(__DEC_cond_precondition_834586)) {
				return new Object[] { cond, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_23_2_black_nac_1BB(UCCondition cond, BasicFlow flow) {
		for (Flow __DEC_cond_finalState_103426 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(cond, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_cond_finalState_103426)) {
				return new Object[] { cond, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_23_2_black_nac_2BB(BasicFlow flow, UCCondition cond) {
		if (flow.getFinalState().contains(cond)) {
			return new Object[] { flow, cond };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_23_2_blackFFFB(EMoflonEdge _edge_precondition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_precondition.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpCond = _edge_precondition.getTrg();
			if (tmpCond instanceof UCCondition) {
				UCCondition cond = (UCCondition) tmpCond;
				if (cond.equals(useCase.getPrecondition())) {
					if (pattern_Process2UseCase_23_2_black_nac_0BB(cond, useCase) == null) {
						for (Flow tmpFlow : useCase.getFlows()) {
							if (tmpFlow instanceof BasicFlow) {
								BasicFlow flow = (BasicFlow) tmpFlow;
								if (pattern_Process2UseCase_23_2_black_nac_1BB(cond, flow) == null) {
									if (pattern_Process2UseCase_23_2_black_nac_2BB(flow, cond) == null) {
										_result.add(new Object[] { useCase, flow, cond, _edge_precondition });
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

	public static final Object[] pattern_Process2UseCase_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Process2UseCase_23_3_expressionFBBBBB(Process2UseCase _this, Match match,
			UseCase useCase, BasicFlow flow, UCCondition cond) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, flow, cond);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_23_4_expressionFBB(Process2UseCase _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Process2UseCase_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Process2UseCase_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_24_1_bindingFB(Process2UseCase _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_24_1_blackFBB(EClass __eClass, Process2UseCase _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_24_1_bindingAndBlackFFB(Process2UseCase _this) {
		Object[] result_pattern_Process2UseCase_24_1_binding = pattern_Process2UseCase_24_1_bindingFB(_this);
		if (result_pattern_Process2UseCase_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Process2UseCase_24_1_binding[0];

			Object[] result_pattern_Process2UseCase_24_1_black = pattern_Process2UseCase_24_1_blackFBB(__eClass, _this);
			if (result_pattern_Process2UseCase_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Process2UseCase_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Process2UseCase_24_2_black_nac_0BB(SequenceFlow sf, StartEvent start) {
		if (start.equals(sf.getTargetRef())) {
			return new Object[] { sf, start };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_24_2_blackFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf = _edge_sourceRef.getSrc();
		if (tmpSf instanceof SequenceFlow) {
			SequenceFlow sf = (SequenceFlow) tmpSf;
			EObject tmpStart = _edge_sourceRef.getTrg();
			if (tmpStart instanceof StartEvent) {
				StartEvent start = (StartEvent) tmpStart;
				if (start.equals(sf.getSourceRef())) {
					if (pattern_Process2UseCase_24_2_black_nac_0BB(sf, start) == null) {
						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(sf, SimpleBPMN.Process.class, "flowElements")) {
							if (process.getFlowElements().contains(start)) {
								_result.add(new Object[] { process, start, sf, _edge_sourceRef });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Process2UseCase_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Process2UseCase_24_3_expressionFBBBBB(Process2UseCase _this, Match match,
			SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, start, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_24_4_expressionFBB(Process2UseCase _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Process2UseCase_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Process2UseCase_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_25_1_bindingFB(Process2UseCase _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_25_1_blackFBB(EClass __eClass, Process2UseCase _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_25_1_bindingAndBlackFFB(Process2UseCase _this) {
		Object[] result_pattern_Process2UseCase_25_1_binding = pattern_Process2UseCase_25_1_bindingFB(_this);
		if (result_pattern_Process2UseCase_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Process2UseCase_25_1_binding[0];

			Object[] result_pattern_Process2UseCase_25_1_black = pattern_Process2UseCase_25_1_blackFBB(__eClass, _this);
			if (result_pattern_Process2UseCase_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Process2UseCase_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Process2UseCase_25_2_black_nac_0BB(SequenceFlow sf, StartEvent start) {
		if (start.equals(sf.getTargetRef())) {
			return new Object[] { sf, start };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_25_2_blackFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpStart = _edge_outgoing.getSrc();
		if (tmpStart instanceof StartEvent) {
			StartEvent start = (StartEvent) tmpStart;
			EObject tmpSf = _edge_outgoing.getTrg();
			if (tmpSf instanceof SequenceFlow) {
				SequenceFlow sf = (SequenceFlow) tmpSf;
				if (start.equals(sf.getSourceRef())) {
					if (pattern_Process2UseCase_25_2_black_nac_0BB(sf, start) == null) {
						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(start, SimpleBPMN.Process.class, "flowElements")) {
							if (process.getFlowElements().contains(sf)) {
								_result.add(new Object[] { process, start, sf, _edge_outgoing });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Process2UseCase_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Process2UseCase_25_3_expressionFBBBBB(Process2UseCase _this, Match match,
			SimpleBPMN.Process process, StartEvent start, SequenceFlow sf) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, start, sf);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_25_4_expressionFBB(Process2UseCase _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Process2UseCase_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Process2UseCase_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_28_1_blackB(Process2UseCase _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Process2UseCase_28_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Process2UseCase_28_2_bindingFFFFFFBB(Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("process");
		EObject _localVariable_1 = targetMatch.getObject("useCase");
		EObject _localVariable_2 = targetMatch.getObject("flow");
		EObject _localVariable_3 = sourceMatch.getObject("start");
		EObject _localVariable_4 = sourceMatch.getObject("sf");
		EObject _localVariable_5 = targetMatch.getObject("cond");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpStart = _localVariable_3;
		EObject tmpSf = _localVariable_4;
		EObject tmpCond = _localVariable_5;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpFlow instanceof BasicFlow) {
					BasicFlow flow = (BasicFlow) tmpFlow;
					if (tmpStart instanceof StartEvent) {
						StartEvent start = (StartEvent) tmpStart;
						if (tmpSf instanceof SequenceFlow) {
							SequenceFlow sf = (SequenceFlow) tmpSf;
							if (tmpCond instanceof UCCondition) {
								UCCondition cond = (UCCondition) tmpCond;
								return new Object[] { process, useCase, flow, start, sf, cond, sourceMatch,
										targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_28_2_blackBBBBBBBB(SimpleBPMN.Process process,
			UseCase useCase, BasicFlow flow, StartEvent start, SequenceFlow sf, UCCondition cond, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (process.getFlowElements().contains(start)) {
				if (process.getFlowElements().contains(sf)) {
					if (useCase.getFlows().contains(flow)) {
						if (cond.equals(useCase.getPrecondition())) {
							if (start.equals(sf.getSourceRef())) {
								_result.add(new Object[] { process, useCase, flow, start, sf, cond, sourceMatch,
										targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_28_2_greenBBBBBBBFB(SimpleBPMN.Process process,
			UseCase useCase, BasicFlow flow, StartEvent start, SequenceFlow sf, UCCondition cond, Match sourceMatch,
			Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "Process2UseCase";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(start);
		isApplicableMatch.getAllContextElements().add(sf);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(cond);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { process, useCase, flow, start, sf, cond, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_Process2UseCase_28_3_bindingFBBBBBBBBBB(Process2UseCase _this,
			IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, BasicFlow flow,
			StartEvent start, SequenceFlow sf, UCCondition cond, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, process, useCase, flow, start, sf,
				cond, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, flow, start, sf, cond, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_28_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Process2UseCase_28_3_bindingAndBlackFBBBBBBBBBB(Process2UseCase _this,
			IsApplicableMatchCC isApplicableMatch, SimpleBPMN.Process process, UseCase useCase, BasicFlow flow,
			StartEvent start, SequenceFlow sf, UCCondition cond, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Process2UseCase_28_3_binding = pattern_Process2UseCase_28_3_bindingFBBBBBBBBBB(_this,
				isApplicableMatch, process, useCase, flow, start, sf, cond, sourceMatch, targetMatch);
		if (result_pattern_Process2UseCase_28_3_binding != null) {
			CSP csp = (CSP) result_pattern_Process2UseCase_28_3_binding[0];

			Object[] result_pattern_Process2UseCase_28_3_black = pattern_Process2UseCase_28_3_blackB(csp);
			if (result_pattern_Process2UseCase_28_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, flow, start, sf, cond,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_28_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_Process2UseCase_28_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Process2UseCase";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Process2UseCase_28_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_31_1_blackB(Process2UseCase _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Process2UseCase_31_2_bindingFFFFFFB(IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("start");
		EObject _localVariable_4 = isApplicableMatch.getObject("sf");
		EObject _localVariable_5 = isApplicableMatch.getObject("cond");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpStart = _localVariable_3;
		EObject tmpSf = _localVariable_4;
		EObject tmpCond = _localVariable_5;
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpFlow instanceof BasicFlow) {
					BasicFlow flow = (BasicFlow) tmpFlow;
					if (tmpStart instanceof StartEvent) {
						StartEvent start = (StartEvent) tmpStart;
						if (tmpSf instanceof SequenceFlow) {
							SequenceFlow sf = (SequenceFlow) tmpSf;
							if (tmpCond instanceof UCCondition) {
								UCCondition cond = (UCCondition) tmpCond;
								return new Object[] { process, useCase, flow, start, sf, cond, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_31_2_blackBBBBBBB(SimpleBPMN.Process process, UseCase useCase,
			BasicFlow flow, StartEvent start, SequenceFlow sf, UCCondition cond,
			IsApplicableMatchCC isApplicableMatch) {
		if (process.getFlowElements().contains(start)) {
			if (process.getFlowElements().contains(sf)) {
				if (useCase.getFlows().contains(flow)) {
					if (cond.equals(useCase.getPrecondition())) {
						if (start.equals(sf.getSourceRef())) {
							return new Object[] { process, useCase, flow, start, sf, cond, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_31_2_bindingAndBlackFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_Process2UseCase_31_2_binding = pattern_Process2UseCase_31_2_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Process2UseCase_31_2_binding != null) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Process2UseCase_31_2_binding[0];
			UseCase useCase = (UseCase) result_pattern_Process2UseCase_31_2_binding[1];
			BasicFlow flow = (BasicFlow) result_pattern_Process2UseCase_31_2_binding[2];
			StartEvent start = (StartEvent) result_pattern_Process2UseCase_31_2_binding[3];
			SequenceFlow sf = (SequenceFlow) result_pattern_Process2UseCase_31_2_binding[4];
			UCCondition cond = (UCCondition) result_pattern_Process2UseCase_31_2_binding[5];

			Object[] result_pattern_Process2UseCase_31_2_black = pattern_Process2UseCase_31_2_blackBBBBBBB(process,
					useCase, flow, start, sf, cond, isApplicableMatch);
			if (result_pattern_Process2UseCase_31_2_black != null) {

				return new Object[] { process, useCase, flow, start, sf, cond, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_31_2_greenBBBBBFFFF(SimpleBPMN.Process process,
			UseCase useCase, BasicFlow flow, StartEvent start, SequenceFlow sf) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		P2UC _p2uc = Bpmn2UseCaseFactory.eINSTANCE.createP2UC();
		SE2BF _se2bf = Bpmn2UseCaseFactory.eINSTANCE.createSE2BF();
		SF2F _sf2f = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		result.getCreatedElements().add(_p2uc);
		_p2uc.setSource(process);
		_p2uc.setTarget(useCase);
		result.getCreatedElements().add(_se2bf);
		_se2bf.setSource(start);
		_se2bf.setTarget(flow);
		result.getCreatedElements().add(_sf2f);
		_sf2f.setSource(sf);
		_sf2f.setTarget(flow);
		return new Object[] { process, useCase, flow, start, sf, result, _p2uc, _se2bf, _sf2f };
	}

	public static final PerformRuleResult pattern_Process2UseCase_31_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_32_1_blackB(Process2UseCase _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Process2UseCase_32_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Process2UseCase_32_2_blackB(Process2UseCase _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Process2UseCase_32_3_bindingFBBB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_32_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Process2UseCase_32_3_bindingAndBlackFBBB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Process2UseCase_32_3_binding = pattern_Process2UseCase_32_3_bindingFBBB(_this,
				isApplicableMatch, ruleResult);
		if (result_pattern_Process2UseCase_32_3_binding != null) {
			CSP csp = (CSP) result_pattern_Process2UseCase_32_3_binding[0];

			Object[] result_pattern_Process2UseCase_32_3_black = pattern_Process2UseCase_32_3_blackB(csp);
			if (result_pattern_Process2UseCase_32_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Process2UseCase_32_4_expressionFBB(Process2UseCase _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_32_6_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_Process2UseCase_32_6_greenFFFFFFFFFBB(ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		SimpleBPMN.Process process = SimpleBPMNFactory.eINSTANCE.createProcess();
		UseCase useCase = SimpleUseCaseFactory.eINSTANCE.createUseCase();
		P2UC _p2uc = Bpmn2UseCaseFactory.eINSTANCE.createP2UC();
		BasicFlow flow = SimpleUseCaseFactory.eINSTANCE.createBasicFlow();
		SE2BF _se2bf = Bpmn2UseCaseFactory.eINSTANCE.createSE2BF();
		StartEvent start = SimpleBPMNFactory.eINSTANCE.createStartEvent();
		SequenceFlow sf = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		SF2F _sf2f = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		UCCondition cond = SimpleUseCaseFactory.eINSTANCE.createUCCondition();
		Object _localVariable_0 = csp.getValue("start", "id");
		Object _localVariable_1 = csp.getValue("cond", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(process);
		ruleResult.getTargetObjects().add(useCase);
		_p2uc.setSource(process);
		_p2uc.setTarget(useCase);
		ruleResult.getCorrObjects().add(_p2uc);
		useCase.getFlows().add(flow);
		ruleResult.getTargetObjects().add(flow);
		_se2bf.setTarget(flow);
		ruleResult.getCorrObjects().add(_se2bf);
		process.getFlowElements().add(start);
		_se2bf.setSource(start);
		ruleResult.getSourceObjects().add(start);
		process.getFlowElements().add(sf);
		sf.setSourceRef(start);
		ruleResult.getSourceObjects().add(sf);
		_sf2f.setSource(sf);
		_sf2f.setTarget(flow);
		ruleResult.getCorrObjects().add(_sf2f);
		useCase.setPrecondition(cond);
		ruleResult.getTargetObjects().add(cond);
		String start_id_prime = (String) _localVariable_0;
		String cond_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		start.setId(start_id_prime);
		cond.setName(cond_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { process, useCase, _p2uc, flow, _se2bf, start, sf, _sf2f, cond, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_Process2UseCase_32_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Process2UseCaseImpl
