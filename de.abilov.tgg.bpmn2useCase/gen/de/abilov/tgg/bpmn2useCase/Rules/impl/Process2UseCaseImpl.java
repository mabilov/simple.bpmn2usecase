/**
 */
package de.abilov.tgg.bpmn2useCase.Rules.impl;

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

import de.abilov.bpmn.BpmnFactory;
import de.abilov.bpmn.StartEvent;

import de.abilov.tgg.bpmn2useCase.Bpmn2useCaseFactory;
import de.abilov.tgg.bpmn2useCase.FN2F;
import de.abilov.tgg.bpmn2useCase.P2UC;

import de.abilov.tgg.bpmn2useCase.Rules.Process2UseCase;
import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;

import de.abilov.useCase.BasicFlow;
import de.abilov.useCase.Flow;
import de.abilov.useCase.Step;
import de.abilov.useCase.UCCondition;
import de.abilov.useCase.UseCase;
import de.abilov.useCase.UseCaseFactory;

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
	public boolean isAppropriate_FWD(Match match, de.abilov.bpmn.Process process, StartEvent start) {
		// initial bindings
		Object[] result1_black = Process2UseCaseImpl.pattern_Process2UseCase_0_1_blackBBBB(this, match, process, start);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", "
					+ "[start] = " + start + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_0_2_bindingAndBlackFBBBB(this,
				match, process, start);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[start] = " + start
					+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Process2UseCaseImpl.pattern_Process2UseCase_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Process2UseCaseImpl.pattern_Process2UseCase_0_4_blackBBB(match, process, start);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[start] = "
						+ start + ".");
			}
			Process2UseCaseImpl.pattern_Process2UseCase_0_4_greenBBBF(match, process, start);
			// EMoflonEdge process__start____flowElements = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = Process2UseCaseImpl.pattern_Process2UseCase_0_5_blackBBB(match, process, start);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[process] = " + process + ", " + "[start] = " + start + ".");
			}
			// register objects to match
			Process2UseCaseImpl.pattern_Process2UseCase_0_6_expressionBBBB(this, match, process, start);
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
		Object[] result1_bindingAndBlack = Process2UseCaseImpl.pattern_Process2UseCase_1_1_bindingAndBlackFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[0];
		StartEvent start = (StartEvent) result1_bindingAndBlack[1];
		CSP csp = (CSP) result1_bindingAndBlack[3];
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_1_1_greenBFFFFBFB(process, start, csp);
		UseCase useCase = (UseCase) result1_green[1];
		P2UC _p2uc = (P2UC) result1_green[2];
		BasicFlow flow = (BasicFlow) result1_green[3];
		FN2F s2f = (FN2F) result1_green[4];
		UCCondition cond = (UCCondition) result1_green[6];

		// collect translated elements
		Object[] result2_black = Process2UseCaseImpl.pattern_Process2UseCase_1_2_blackBBBBBBB(process, useCase, _p2uc,
				flow, s2f, start, cond);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc + ", "
					+ "[flow] = " + flow + ", " + "[s2f] = " + s2f + ", " + "[start] = " + start + ", " + "[cond] = "
					+ cond + ".");
		}
		Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_1_2_greenFBBBBBBB(process, useCase, _p2uc,
				flow, s2f, start, cond);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Process2UseCaseImpl.pattern_Process2UseCase_1_3_blackBBBBBBBB(ruleresult, process,
				useCase, _p2uc, flow, s2f, start, cond);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[_p2uc] = " + _p2uc + ", " + "[flow] = " + flow + ", " + "[s2f] = " + s2f + ", "
					+ "[start] = " + start + ", " + "[cond] = " + cond + ".");
		}
		Process2UseCaseImpl.pattern_Process2UseCase_1_3_greenBBBBBBBBFFFFFFF(ruleresult, process, useCase, _p2uc, flow,
				s2f, start, cond);
				// EMoflonEdge process__start____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[9];
				// EMoflonEdge useCase__cond____precondition = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _p2uc__process____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _p2uc__useCase____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge s2f__start____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge s2f__flow____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		Process2UseCaseImpl.pattern_Process2UseCase_1_5_expressionBBBBBBBBB(this, ruleresult, process, useCase, _p2uc,
				flow, s2f, start, cond);
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
		Object[] result2_binding = Process2UseCaseImpl.pattern_Process2UseCase_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[0];
		StartEvent start = (StartEvent) result2_binding[1];
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_2_2_blackBBB(process, start, match)) {
			// ForEach find context
			for (Object[] result3_black : Process2UseCaseImpl.pattern_Process2UseCase_2_3_blackBB(process, start)) {
				Object[] result3_green = Process2UseCaseImpl.pattern_Process2UseCase_2_3_greenBBFF(process, start);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				// EMoflonEdge process__start____flowElements = (EMoflonEdge) result3_green[3];

				// solve CSP
				Object[] result4_bindingAndBlack = Process2UseCaseImpl
						.pattern_Process2UseCase_2_4_bindingAndBlackFBBBB(this, isApplicableMatch, process, start);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[start] = " + start + ".");
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
	public void registerObjectsToMatch_FWD(Match match, de.abilov.bpmn.Process process, StartEvent start) {
		match.registerObject("process", process);
		match.registerObject("start", start);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, de.abilov.bpmn.Process process, StartEvent start) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process,
			StartEvent start) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start.id", true, csp);
		var_start_id.setValue(start.getId());
		var_start_id.setType("String");
		Variable var_process_id = CSPFactoryHelper.eINSTANCE.createVariable("process.id", true, csp);
		var_process_id.setValue(process.getId());
		var_process_id.setType("String");

		// Create unbound variables
		Variable var_cond_name = CSPFactoryHelper.eINSTANCE.createVariable("cond.name", csp);
		var_cond_name.setType("String");
		Variable var_useCase_id = CSPFactoryHelper.eINSTANCE.createVariable("useCase.id", csp);
		var_useCase_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_start_id, var_cond_name);
		eq_0.setRuleName("");
		eq_0.solve(var_process_id, var_useCase_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("start", start);
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
			EObject flow, EObject s2f, EObject start, EObject cond) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("_p2uc", _p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("s2f", s2f);
		ruleresult.registerObject("start", start);
		ruleresult.registerObject("cond", cond);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("process").eClass()
						.equals(de.abilov.bpmn.BpmnPackage.eINSTANCE.getProcess())
				&& match.getObject("start").eClass()
						.equals(de.abilov.bpmn.BpmnPackage.eINSTANCE.getStartEvent());
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
		Object[] result1_green = Process2UseCaseImpl.pattern_Process2UseCase_11_1_greenFBFBFFB(useCase, flow, csp);
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_green[0];
		P2UC _p2uc = (P2UC) result1_green[2];
		FN2F s2f = (FN2F) result1_green[4];
		StartEvent start = (StartEvent) result1_green[5];

		// collect translated elements
		Object[] result2_black = Process2UseCaseImpl.pattern_Process2UseCase_11_2_blackBBBBBBB(process, useCase, _p2uc,
				flow, s2f, start, cond);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[_p2uc] = " + _p2uc + ", "
					+ "[flow] = " + flow + ", " + "[s2f] = " + s2f + ", " + "[start] = " + start + ", " + "[cond] = "
					+ cond + ".");
		}
		Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_11_2_greenFBBBBBBB(process, useCase, _p2uc,
				flow, s2f, start, cond);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Process2UseCaseImpl.pattern_Process2UseCase_11_3_blackBBBBBBBB(ruleresult, process,
				useCase, _p2uc, flow, s2f, start, cond);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[_p2uc] = " + _p2uc + ", " + "[flow] = " + flow + ", " + "[s2f] = " + s2f + ", "
					+ "[start] = " + start + ", " + "[cond] = " + cond + ".");
		}
		Process2UseCaseImpl.pattern_Process2UseCase_11_3_greenBBBBBBBBFFFFFFF(ruleresult, process, useCase, _p2uc, flow,
				s2f, start, cond);
				// EMoflonEdge process__start____flowElements = (EMoflonEdge) result3_green[8];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[9];
				// EMoflonEdge useCase__cond____precondition = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _p2uc__process____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge _p2uc__useCase____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge s2f__start____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge s2f__flow____target = (EMoflonEdge) result3_green[14];

		// perform postprocessing story node is empty
		// register objects
		Process2UseCaseImpl.pattern_Process2UseCase_11_5_expressionBBBBBBBBB(this, ruleresult, process, useCase, _p2uc,
				flow, s2f, start, cond);
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
		Variable var_useCase_id = CSPFactoryHelper.eINSTANCE.createVariable("useCase.id", true, csp);
		var_useCase_id.setValue(useCase.getId());
		var_useCase_id.setType("String");

		// Create unbound variables
		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start.id", csp);
		var_start_id.setType("String");
		Variable var_process_id = CSPFactoryHelper.eINSTANCE.createVariable("process.id", csp);
		var_process_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_start_id, var_cond_name);
		eq_0.setRuleName("");
		eq_0.solve(var_process_id, var_useCase_id);

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
			EObject flow, EObject s2f, EObject start, EObject cond) {
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("_p2uc", _p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("s2f", s2f);
		ruleresult.registerObject("start", start);
		ruleresult.registerObject("cond", cond);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("useCase").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getUseCase())
				&& match.getObject("flow").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getBasicFlow())
				&& match.getObject("cond").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getUCCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_406(EMoflonEdge _edge_flowElements) {
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
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_20_2_blackFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			StartEvent start = (StartEvent) result2_black[1];
			Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Process2UseCaseImpl.pattern_Process2UseCase_20_3_expressionFBBBB(this, match, process, start)) {
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_124(EMoflonEdge _edge_flows) {
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
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_21_2_blackFFFB(_edge_flows)) {
			UseCase useCase = (UseCase) result2_black[0];
			BasicFlow flow = (BasicFlow) result2_black[1];
			UCCondition cond = (UCCondition) result2_black[2];
			Object[] result2_green = Process2UseCaseImpl.pattern_Process2UseCase_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Process2UseCaseImpl.pattern_Process2UseCase_21_3_expressionFBBBBB(this, match, useCase, flow, cond)) {
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_125(EMoflonEdge _edge_precondition) {
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
		for (Object[] result2_black : Process2UseCaseImpl.pattern_Process2UseCase_22_2_blackFFFB(_edge_precondition)) {
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
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Process2UseCase");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_p2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC _p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchFor_p2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.BasicFlow flow = (de.abilov.useCase.BasicFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForS2f = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("s2f")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2F s2f = (de.abilov.tgg.bpmn2useCase.FN2F) matchForS2f.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStart = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("start")).findAny();
		de.abilov.bpmn.StartEvent start = (de.abilov.bpmn.StartEvent) matchForStart.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCond = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cond")).findAny();
		de.abilov.useCase.UCCondition cond = (de.abilov.useCase.UCCondition) matchForCond.get().getNode();

		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start", true, csp);
		var_start_id.setValue(start.getId());
		var_start_id.setType("String");

		Variable var_cond_name = CSPFactoryHelper.eINSTANCE.createVariable("cond", true, csp);
		var_cond_name.setValue(cond.getName());
		var_cond_name.setType("String");

		Variable var_process_id = CSPFactoryHelper.eINSTANCE.createVariable("process", true, csp);
		var_process_id.setValue(process.getId());
		var_process_id.setType("String");

		Variable var_useCase_id = CSPFactoryHelper.eINSTANCE.createVariable("useCase", true, csp);
		var_useCase_id.setValue(useCase.getId());
		var_useCase_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("Process2UseCase");
		eq0.solve(var_start_id, var_cond_name);

		eq1.setRuleName("Process2UseCase");
		eq1.solve(var_process_id, var_useCase_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_cond_name.setBound(false);
			var_useCase_id.setBound(false);
			eq0.solve(var_start_id, var_cond_name);
			eq1.solve(var_process_id, var_useCase_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				cond.setName((String) var_cond_name.getValue());
				useCase.setId((String) var_useCase_id.getValue());
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
		ruleResult.setRule("Process2UseCase");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_p2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC _p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchFor_p2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.BasicFlow flow = (de.abilov.useCase.BasicFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForS2f = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("s2f")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2F s2f = (de.abilov.tgg.bpmn2useCase.FN2F) matchForS2f.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStart = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("start")).findAny();
		de.abilov.bpmn.StartEvent start = (de.abilov.bpmn.StartEvent) matchForStart.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCond = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cond")).findAny();
		de.abilov.useCase.UCCondition cond = (de.abilov.useCase.UCCondition) matchForCond.get().getNode();

		Variable var_start_id = CSPFactoryHelper.eINSTANCE.createVariable("start", true, csp);
		var_start_id.setValue(start.getId());
		var_start_id.setType("String");

		Variable var_cond_name = CSPFactoryHelper.eINSTANCE.createVariable("cond", true, csp);
		var_cond_name.setValue(cond.getName());
		var_cond_name.setType("String");

		Variable var_process_id = CSPFactoryHelper.eINSTANCE.createVariable("process", true, csp);
		var_process_id.setValue(process.getId());
		var_process_id.setType("String");

		Variable var_useCase_id = CSPFactoryHelper.eINSTANCE.createVariable("useCase", true, csp);
		var_useCase_id.setValue(useCase.getId());
		var_useCase_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("Process2UseCase");
		eq0.solve(var_start_id, var_cond_name);

		eq1.setRuleName("Process2UseCase");
		eq1.solve(var_process_id, var_useCase_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_start_id.setBound(false);
			var_process_id.setBound(false);
			eq0.solve(var_start_id, var_cond_name);
			eq1.solve(var_process_id, var_useCase_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				start.setId((String) var_start_id.getValue());
				process.setId((String) var_process_id.getValue());
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
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_FWD__MATCH_PROCESS_STARTEVENT:
			return isAppropriate_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(StartEvent) arguments.get(2));
		case RulesPackage.PROCESS2_USE_CASE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_STARTEVENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(StartEvent) arguments.get(2));
			return null;
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_STARTEVENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(StartEvent) arguments.get(2));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_STARTEVENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(de.abilov.bpmn.Process) arguments.get(1), (StartEvent) arguments.get(2));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
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
		case RulesPackage.PROCESS2_USE_CASE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.PROCESS2_USE_CASE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_406__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_406((EMoflonEdge) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_124__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_124((EMoflonEdge) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_125__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_125((EMoflonEdge) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PROCESS2_USE_CASE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Process2UseCase_0_1_blackBBBB(Process2UseCase _this, Match match,
			de.abilov.bpmn.Process process, StartEvent start) {
		return new Object[] { _this, match, process, start };
	}

	public static final Object[] pattern_Process2UseCase_0_2_bindingFBBBB(Process2UseCase _this, Match match,
			de.abilov.bpmn.Process process, StartEvent start) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, start);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, start };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Process2UseCase_0_2_bindingAndBlackFBBBB(Process2UseCase _this, Match match,
			de.abilov.bpmn.Process process, StartEvent start) {
		Object[] result_pattern_Process2UseCase_0_2_binding = pattern_Process2UseCase_0_2_bindingFBBBB(_this, match,
				process, start);
		if (result_pattern_Process2UseCase_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Process2UseCase_0_2_binding[0];

			Object[] result_pattern_Process2UseCase_0_2_black = pattern_Process2UseCase_0_2_blackB(csp);
			if (result_pattern_Process2UseCase_0_2_black != null) {

				return new Object[] { csp, _this, match, process, start };
			}
		}
		return null;
	}

	public static final boolean pattern_Process2UseCase_0_3_expressionFBB(Process2UseCase _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_0_4_blackBBB(Match match, de.abilov.bpmn.Process process,
			StartEvent start) {
		return new Object[] { match, process, start };
	}

	public static final Object[] pattern_Process2UseCase_0_4_greenBBBF(Match match, de.abilov.bpmn.Process process,
			StartEvent start) {
		EMoflonEdge process__start____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(process);
		match.getToBeTranslatedNodes().add(start);
		String process__start____flowElements_name_prime = "flowElements";
		process__start____flowElements.setSrc(process);
		process__start____flowElements.setTrg(start);
		match.getToBeTranslatedEdges().add(process__start____flowElements);
		process__start____flowElements.setName(process__start____flowElements_name_prime);
		return new Object[] { match, process, start, process__start____flowElements };
	}

	public static final Object[] pattern_Process2UseCase_0_5_blackBBB(Match match, de.abilov.bpmn.Process process,
			StartEvent start) {
		return new Object[] { match, process, start };
	}

	public static final void pattern_Process2UseCase_0_6_expressionBBBB(Process2UseCase _this, Match match,
			de.abilov.bpmn.Process process, StartEvent start) {
		_this.registerObjectsToMatch_FWD(match, process, start);

	}

	public static final boolean pattern_Process2UseCase_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_1_1_bindingFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("start");
		EObject tmpProcess = _localVariable_0;
		EObject tmpStart = _localVariable_1;
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			if (tmpStart instanceof StartEvent) {
				StartEvent start = (StartEvent) tmpStart;
				return new Object[] { process, start, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_1_1_blackBBBFB(de.abilov.bpmn.Process process,
			StartEvent start, Process2UseCase _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { process, start, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_1_1_bindingAndBlackFFBFB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Process2UseCase_1_1_binding = pattern_Process2UseCase_1_1_bindingFFB(isApplicableMatch);
		if (result_pattern_Process2UseCase_1_1_binding != null) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_Process2UseCase_1_1_binding[0];
			StartEvent start = (StartEvent) result_pattern_Process2UseCase_1_1_binding[1];

			Object[] result_pattern_Process2UseCase_1_1_black = pattern_Process2UseCase_1_1_blackBBBFB(process, start,
					_this, isApplicableMatch);
			if (result_pattern_Process2UseCase_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Process2UseCase_1_1_black[3];

				return new Object[] { process, start, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_1_1_greenBFFFFBFB(de.abilov.bpmn.Process process,
			StartEvent start, CSP csp) {
		UseCase useCase = UseCaseFactory.eINSTANCE.createUseCase();
		P2UC _p2uc = Bpmn2useCaseFactory.eINSTANCE.createP2UC();
		BasicFlow flow = UseCaseFactory.eINSTANCE.createBasicFlow();
		FN2F s2f = Bpmn2useCaseFactory.eINSTANCE.createFN2F();
		UCCondition cond = UseCaseFactory.eINSTANCE.createUCCondition();
		Object _localVariable_0 = csp.getValue("useCase", "id");
		Object _localVariable_1 = csp.getValue("cond", "name");
		_p2uc.setSource(process);
		_p2uc.setTarget(useCase);
		useCase.getFlows().add(flow);
		s2f.setSource(start);
		s2f.setTarget(flow);
		useCase.setPrecondition(cond);
		String useCase_id_prime = (String) _localVariable_0;
		String cond_name_prime = (String) _localVariable_1;
		useCase.setId(useCase_id_prime);
		cond.setName(cond_name_prime);
		return new Object[] { process, useCase, _p2uc, flow, s2f, start, cond, csp };
	}

	public static final Object[] pattern_Process2UseCase_1_2_blackBBBBBBB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC _p2uc, BasicFlow flow, FN2F s2f, StartEvent start, UCCondition cond) {
		return new Object[] { process, useCase, _p2uc, flow, s2f, start, cond };
	}

	public static final Object[] pattern_Process2UseCase_1_2_greenFBBBBBBB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC _p2uc, BasicFlow flow, FN2F s2f, StartEvent start, UCCondition cond) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(process);
		ruleresult.getCreatedElements().add(useCase);
		ruleresult.getCreatedLinkElements().add(_p2uc);
		ruleresult.getCreatedElements().add(flow);
		ruleresult.getCreatedLinkElements().add(s2f);
		ruleresult.getTranslatedElements().add(start);
		ruleresult.getCreatedElements().add(cond);
		return new Object[] { ruleresult, process, useCase, _p2uc, flow, s2f, start, cond };
	}

	public static final Object[] pattern_Process2UseCase_1_3_blackBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject s2f, EObject start, EObject cond) {
		if (!process.equals(useCase)) {
			if (!process.equals(s2f)) {
				if (!process.equals(start)) {
					if (!_p2uc.equals(process)) {
						if (!_p2uc.equals(useCase)) {
							if (!_p2uc.equals(flow)) {
								if (!_p2uc.equals(s2f)) {
									if (!_p2uc.equals(start)) {
										if (!_p2uc.equals(cond)) {
											if (!flow.equals(process)) {
												if (!flow.equals(useCase)) {
													if (!flow.equals(s2f)) {
														if (!flow.equals(start)) {
															if (!s2f.equals(useCase)) {
																if (!s2f.equals(start)) {
																	if (!start.equals(useCase)) {
																		if (!cond.equals(process)) {
																			if (!cond.equals(useCase)) {
																				if (!cond.equals(flow)) {
																					if (!cond.equals(s2f)) {
																						if (!cond.equals(start)) {
																							return new Object[] {
																									ruleresult, process,
																									useCase, _p2uc,
																									flow, s2f, start,
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
		return null;
	}

	public static final Object[] pattern_Process2UseCase_1_3_greenBBBBBBBBFFFFFFF(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject s2f, EObject start, EObject cond) {
		EMoflonEdge process__start____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__cond____precondition = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2f__start____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Process2UseCase";
		String process__start____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String useCase__cond____precondition_name_prime = "precondition";
		String _p2uc__process____source_name_prime = "source";
		String _p2uc__useCase____target_name_prime = "target";
		String s2f__start____source_name_prime = "source";
		String s2f__flow____target_name_prime = "target";
		process__start____flowElements.setSrc(process);
		process__start____flowElements.setTrg(start);
		ruleresult.getTranslatedEdges().add(process__start____flowElements);
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
		s2f__start____source.setSrc(s2f);
		s2f__start____source.setTrg(start);
		ruleresult.getCreatedEdges().add(s2f__start____source);
		s2f__flow____target.setSrc(s2f);
		s2f__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(s2f__flow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__start____flowElements.setName(process__start____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__cond____precondition.setName(useCase__cond____precondition_name_prime);
		_p2uc__process____source.setName(_p2uc__process____source_name_prime);
		_p2uc__useCase____target.setName(_p2uc__useCase____target_name_prime);
		s2f__start____source.setName(s2f__start____source_name_prime);
		s2f__flow____target.setName(s2f__flow____target_name_prime);
		return new Object[] { ruleresult, process, useCase, _p2uc, flow, s2f, start, cond,
				process__start____flowElements, useCase__flow____flows, useCase__cond____precondition,
				_p2uc__process____source, _p2uc__useCase____target, s2f__start____source, s2f__flow____target };
	}

	public static final void pattern_Process2UseCase_1_5_expressionBBBBBBBBB(Process2UseCase _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject s2f,
			EObject start, EObject cond) {
		_this.registerObjects_FWD(ruleresult, process, useCase, _p2uc, flow, s2f, start, cond);

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

	public static final Object[] pattern_Process2UseCase_2_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("start");
		EObject tmpProcess = _localVariable_0;
		EObject tmpStart = _localVariable_1;
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			if (tmpStart instanceof StartEvent) {
				StartEvent start = (StartEvent) tmpStart;
				return new Object[] { process, start, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_2_2_blackBBB(de.abilov.bpmn.Process process,
			StartEvent start, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { process, start, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_2_3_blackBB(de.abilov.bpmn.Process process,
			StartEvent start) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (process.getFlowElements().contains(start)) {
			_result.add(new Object[] { process, start });
		}
		return _result;
	}

	public static final Object[] pattern_Process2UseCase_2_3_greenBBFF(de.abilov.bpmn.Process process,
			StartEvent start) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__start____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__start____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(start);
		process__start____flowElements.setSrc(process);
		process__start____flowElements.setTrg(start);
		isApplicableMatch.getAllContextElements().add(process__start____flowElements);
		process__start____flowElements.setName(process__start____flowElements_name_prime);
		return new Object[] { process, start, isApplicableMatch, process__start____flowElements };
	}

	public static final Object[] pattern_Process2UseCase_2_4_bindingFBBBB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, StartEvent start) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, process, start);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, start };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Process2UseCase_2_4_bindingAndBlackFBBBB(Process2UseCase _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, StartEvent start) {
		Object[] result_pattern_Process2UseCase_2_4_binding = pattern_Process2UseCase_2_4_bindingFBBBB(_this,
				isApplicableMatch, process, start);
		if (result_pattern_Process2UseCase_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Process2UseCase_2_4_binding[0];

			Object[] result_pattern_Process2UseCase_2_4_black = pattern_Process2UseCase_2_4_blackB(csp);
			if (result_pattern_Process2UseCase_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, start };
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

	public static final Object[] pattern_Process2UseCase_11_1_greenFBFBFFB(UseCase useCase, BasicFlow flow, CSP csp) {
		de.abilov.bpmn.Process process = BpmnFactory.eINSTANCE.createProcess();
		P2UC _p2uc = Bpmn2useCaseFactory.eINSTANCE.createP2UC();
		FN2F s2f = Bpmn2useCaseFactory.eINSTANCE.createFN2F();
		StartEvent start = BpmnFactory.eINSTANCE.createStartEvent();
		Object _localVariable_0 = csp.getValue("process", "id");
		Object _localVariable_1 = csp.getValue("start", "id");
		_p2uc.setSource(process);
		_p2uc.setTarget(useCase);
		s2f.setTarget(flow);
		process.getFlowElements().add(start);
		s2f.setSource(start);
		String process_id_prime = (String) _localVariable_0;
		String start_id_prime = (String) _localVariable_1;
		process.setId(process_id_prime);
		start.setId(start_id_prime);
		return new Object[] { process, useCase, _p2uc, flow, s2f, start, csp };
	}

	public static final Object[] pattern_Process2UseCase_11_2_blackBBBBBBB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC _p2uc, BasicFlow flow, FN2F s2f, StartEvent start, UCCondition cond) {
		return new Object[] { process, useCase, _p2uc, flow, s2f, start, cond };
	}

	public static final Object[] pattern_Process2UseCase_11_2_greenFBBBBBBB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC _p2uc, BasicFlow flow, FN2F s2f, StartEvent start, UCCondition cond) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(process);
		ruleresult.getTranslatedElements().add(useCase);
		ruleresult.getCreatedLinkElements().add(_p2uc);
		ruleresult.getTranslatedElements().add(flow);
		ruleresult.getCreatedLinkElements().add(s2f);
		ruleresult.getCreatedElements().add(start);
		ruleresult.getTranslatedElements().add(cond);
		return new Object[] { ruleresult, process, useCase, _p2uc, flow, s2f, start, cond };
	}

	public static final Object[] pattern_Process2UseCase_11_3_blackBBBBBBBB(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject s2f, EObject start, EObject cond) {
		if (!process.equals(useCase)) {
			if (!process.equals(s2f)) {
				if (!process.equals(start)) {
					if (!_p2uc.equals(process)) {
						if (!_p2uc.equals(useCase)) {
							if (!_p2uc.equals(flow)) {
								if (!_p2uc.equals(s2f)) {
									if (!_p2uc.equals(start)) {
										if (!_p2uc.equals(cond)) {
											if (!flow.equals(process)) {
												if (!flow.equals(useCase)) {
													if (!flow.equals(s2f)) {
														if (!flow.equals(start)) {
															if (!s2f.equals(useCase)) {
																if (!s2f.equals(start)) {
																	if (!start.equals(useCase)) {
																		if (!cond.equals(process)) {
																			if (!cond.equals(useCase)) {
																				if (!cond.equals(flow)) {
																					if (!cond.equals(s2f)) {
																						if (!cond.equals(start)) {
																							return new Object[] {
																									ruleresult, process,
																									useCase, _p2uc,
																									flow, s2f, start,
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
		return null;
	}

	public static final Object[] pattern_Process2UseCase_11_3_greenBBBBBBBBFFFFFFF(PerformRuleResult ruleresult,
			EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject s2f, EObject start, EObject cond) {
		EMoflonEdge process__start____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__cond____precondition = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge _p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2f__start____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge s2f__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Process2UseCase";
		String process__start____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String useCase__cond____precondition_name_prime = "precondition";
		String _p2uc__process____source_name_prime = "source";
		String _p2uc__useCase____target_name_prime = "target";
		String s2f__start____source_name_prime = "source";
		String s2f__flow____target_name_prime = "target";
		process__start____flowElements.setSrc(process);
		process__start____flowElements.setTrg(start);
		ruleresult.getCreatedEdges().add(process__start____flowElements);
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
		s2f__start____source.setSrc(s2f);
		s2f__start____source.setTrg(start);
		ruleresult.getCreatedEdges().add(s2f__start____source);
		s2f__flow____target.setSrc(s2f);
		s2f__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(s2f__flow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		process__start____flowElements.setName(process__start____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__cond____precondition.setName(useCase__cond____precondition_name_prime);
		_p2uc__process____source.setName(_p2uc__process____source_name_prime);
		_p2uc__useCase____target.setName(_p2uc__useCase____target_name_prime);
		s2f__start____source.setName(s2f__start____source_name_prime);
		s2f__flow____target.setName(s2f__flow____target_name_prime);
		return new Object[] { ruleresult, process, useCase, _p2uc, flow, s2f, start, cond,
				process__start____flowElements, useCase__flow____flows, useCase__cond____precondition,
				_p2uc__process____source, _p2uc__useCase____target, s2f__start____source, s2f__flow____target };
	}

	public static final void pattern_Process2UseCase_11_5_expressionBBBBBBBBB(Process2UseCase _this,
			PerformRuleResult ruleresult, EObject process, EObject useCase, EObject _p2uc, EObject flow, EObject s2f,
			EObject start, EObject cond) {
		_this.registerObjects_BWD(ruleresult, process, useCase, _p2uc, flow, s2f, start, cond);

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

	public static final Object[] pattern_Process2UseCase_20_2_black_nac_0BB(StartEvent start,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_start_flowElements_390988 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(start, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_start_flowElements_390988)) {
				return new Object[] { start, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_20_2_blackFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpStart = _edge_flowElements.getTrg();
			if (tmpStart instanceof StartEvent) {
				StartEvent start = (StartEvent) tmpStart;
				if (process.getFlowElements().contains(start)) {
					if (pattern_Process2UseCase_20_2_black_nac_0BB(start, process) == null) {
						_result.add(new Object[] { process, start, _edge_flowElements });
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

	public static final boolean pattern_Process2UseCase_20_3_expressionFBBBB(Process2UseCase _this, Match match,
			de.abilov.bpmn.Process process, StartEvent start) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, start);
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
			if (__performOperationname.equals("isApplicable_BWD")) {
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

	public static final Object[] pattern_Process2UseCase_21_2_black_nac_0BB(BasicFlow flow, UseCase useCase) {
		for (UseCase __DEC_flow_flows_134712 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
				UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_flow_flows_134712)) {
				return new Object[] { flow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_21_2_black_nac_1BB(UCCondition cond, UseCase useCase) {
		for (UseCase __DEC_cond_precondition_351674 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(cond, UseCase.class, "precondition")) {
			if (!useCase.equals(__DEC_cond_precondition_351674)) {
				return new Object[] { cond, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_21_2_black_nac_2BB(UCCondition cond, BasicFlow flow) {
		for (Flow __DEC_cond_finalState_300760 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(cond, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_cond_finalState_300760)) {
				return new Object[] { cond, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_21_2_black_nac_3B(UCCondition cond) {
		for (Step __DEC_cond___last_122532 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cond,
				Step.class, "__last")) {
			return new Object[] { cond };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_21_2_black_nac_4BB(BasicFlow flow, UCCondition cond) {
		if (cond.equals(flow.getFinalState())) {
			return new Object[] { flow, cond };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_21_2_blackFFFB(EMoflonEdge _edge_flows) {
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
						if (pattern_Process2UseCase_21_2_black_nac_0BB(flow, useCase) == null) {
							if (pattern_Process2UseCase_21_2_black_nac_1BB(cond, useCase) == null) {
								if (pattern_Process2UseCase_21_2_black_nac_2BB(cond, flow) == null) {
									if (pattern_Process2UseCase_21_2_black_nac_3B(cond) == null) {
										if (pattern_Process2UseCase_21_2_black_nac_4BB(flow, cond) == null) {
											_result.add(new Object[] { useCase, flow, cond, _edge_flows });
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

	public static final Object[] pattern_Process2UseCase_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Process2UseCase_21_3_expressionFBBBBB(Process2UseCase _this, Match match,
			UseCase useCase, BasicFlow flow, UCCondition cond) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, useCase, flow, cond);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Process2UseCase_21_4_expressionFBB(Process2UseCase _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
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

	public static final Object[] pattern_Process2UseCase_22_2_black_nac_0BB(BasicFlow flow, UseCase useCase) {
		for (UseCase __DEC_flow_flows_18598 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
				UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_flow_flows_18598)) {
				return new Object[] { flow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_22_2_black_nac_1BB(UCCondition cond, UseCase useCase) {
		for (UseCase __DEC_cond_precondition_38587 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(cond, UseCase.class, "precondition")) {
			if (!useCase.equals(__DEC_cond_precondition_38587)) {
				return new Object[] { cond, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_22_2_black_nac_2BB(UCCondition cond, BasicFlow flow) {
		for (Flow __DEC_cond_finalState_276366 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(cond, Flow.class, "finalState")) {
			if (!flow.equals(__DEC_cond_finalState_276366)) {
				return new Object[] { cond, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_22_2_black_nac_3B(UCCondition cond) {
		for (Step __DEC_cond___last_926446 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cond,
				Step.class, "__last")) {
			return new Object[] { cond };
		}
		return null;
	}

	public static final Object[] pattern_Process2UseCase_22_2_black_nac_4BB(BasicFlow flow, UCCondition cond) {
		if (cond.equals(flow.getFinalState())) {
			return new Object[] { flow, cond };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Process2UseCase_22_2_blackFFFB(EMoflonEdge _edge_precondition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_precondition.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpCond = _edge_precondition.getTrg();
			if (tmpCond instanceof UCCondition) {
				UCCondition cond = (UCCondition) tmpCond;
				if (cond.equals(useCase.getPrecondition())) {
					if (pattern_Process2UseCase_22_2_black_nac_1BB(cond, useCase) == null) {
						if (pattern_Process2UseCase_22_2_black_nac_3B(cond) == null) {
							for (Flow tmpFlow : useCase.getFlows()) {
								if (tmpFlow instanceof BasicFlow) {
									BasicFlow flow = (BasicFlow) tmpFlow;
									if (pattern_Process2UseCase_22_2_black_nac_0BB(flow, useCase) == null) {
										if (pattern_Process2UseCase_22_2_black_nac_2BB(cond, flow) == null) {
											if (pattern_Process2UseCase_22_2_black_nac_4BB(flow, cond) == null) {
												_result.add(new Object[] { useCase, flow, cond, _edge_precondition });
											}
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

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Process2UseCaseImpl
