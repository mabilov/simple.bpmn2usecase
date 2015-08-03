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
import de.abilov.bpmn.ExclusiveGateway;
import de.abilov.bpmn.FlowElement;
import de.abilov.bpmn.FlowNode;
import de.abilov.bpmn.Gateway;
import de.abilov.bpmn.ParallelGateway;
import de.abilov.bpmn.SequenceFlow;
import de.abilov.bpmn.Task;

import de.abilov.tgg.bpmn2useCase.Bpmn2useCaseFactory;
import de.abilov.tgg.bpmn2useCase.FN2S;
import de.abilov.tgg.bpmn2useCase.GW2S;
import de.abilov.tgg.bpmn2useCase.P2UC;

import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;
import de.abilov.tgg.bpmn2useCase.Rules.T2SAfterSplit;

import de.abilov.useCase.Flow;
import de.abilov.useCase.NormalStep;
import de.abilov.useCase.ParallelFlow;
import de.abilov.useCase.ParallelStep;
import de.abilov.useCase.Step;
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
 * An implementation of the model object '<em><b>T2S After Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class T2SAfterSplitImpl extends AbstractRuleImpl implements T2SAfterSplit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T2SAfterSplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getT2SAfterSplit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ParallelGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, Task task) {
		// initial bindings
		Object[] result1_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_0_1_blackBBBBBB(this, match, prevNode, sf1,
				process, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[sf1] = " + sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_0_2_bindingAndBlackFBBBBBB(this,
				match, prevNode, sf1, process, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1
					+ ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (T2SAfterSplitImpl.pattern_T2SAfterSplit_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_0_4_blackBBBBB(match, prevNode, sf1,
					process, task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
			}
			T2SAfterSplitImpl.pattern_T2SAfterSplit_0_4_greenBBBBBFFFFFF(match, prevNode, sf1, process, task);
			// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[5];
			// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[6];
			// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[7];
			// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[8];
			// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result4_green[9];
			// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_0_5_blackBBBBB(match, prevNode, sf1,
					process, task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
			}
			T2SAfterSplitImpl.pattern_T2SAfterSplit_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			T2SAfterSplitImpl.pattern_T2SAfterSplit_0_6_expressionBBBBBB(this, match, prevNode, sf1, process, task);
			return T2SAfterSplitImpl.pattern_T2SAfterSplit_0_7_expressionF();
		} else {
			return T2SAfterSplitImpl.pattern_T2SAfterSplit_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_1_1_bindingAndBlackFFFFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		GW2S pgw2ps = (GW2S) result1_bindingAndBlack[0];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[1];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[2];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[3];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[6];
		Flow flow = (Flow) result1_bindingAndBlack[7];
		Task task = (Task) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_1_1_greenFBBFFBB(pstep, useCase, task, csp);
		NormalStep step = (NormalStep) result1_green[0];
		ParallelFlow pflow = (ParallelFlow) result1_green[3];
		FN2S t2s = (FN2S) result1_green[4];

		// collect translated elements
		Object[] result2_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_1_2_blackBBBBB(step, sf1, pflow, t2s, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[t2s] = "
					+ t2s + ", " + "[task] = " + task + ".");
		}
		Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_1_2_greenFBBBBB(step, sf1, pflow, t2s, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_1_3_blackBBBBBBBBBBBBB(ruleresult, step,
				pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, pflow, flow, t2s, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[step] = " + step + ", " + "[pgw2ps] = " + pgw2ps + ", "
					+ "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[sf1] = " + sf1 + ", "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", "
					+ "[pflow] = " + pflow + ", " + "[flow] = " + flow + ", " + "[t2s] = " + t2s + ", " + "[task] = "
					+ task + ".");
		}
		T2SAfterSplitImpl.pattern_T2SAfterSplit_1_3_greenBBBBBBBBBBFFFFFFFFFFF(ruleresult, step, prevNode, pstep, sf1,
				process, useCase, pflow, t2s, task);
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		T2SAfterSplitImpl.pattern_T2SAfterSplit_1_5_expressionBBBBBBBBBBBBBB(this, ruleresult, step, pgw2ps, prevNode,
				pstep, sf1, process, useCase, p2uc, pflow, flow, t2s, task);
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = T2SAfterSplitImpl.pattern_T2SAfterSplit_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ParallelGateway prevNode = (ParallelGateway) result2_binding[0];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[1];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[2];
		Task task = (Task) result2_binding[3];
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_2_2_blackFBFBBFFBB(prevNode, sf1, process,
				task, match)) {
			GW2S pgw2ps = (GW2S) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[2];
			UseCase useCase = (UseCase) result2_black[5];
			P2UC p2uc = (P2UC) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_2_3_blackBBBBBBBFB(pgw2ps, prevNode,
					pstep, sf1, process, useCase, p2uc, task)) {
				Flow flow = (Flow) result3_black[7];
				Object[] result3_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_2_3_greenBBBBBBBBBFFFFFFFFFFFFFF(
						pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge pgw2ps__prevNode____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pgw2ps__pstep____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[22];

				// solve CSP
				Object[] result4_bindingAndBlack = T2SAfterSplitImpl
						.pattern_T2SAfterSplit_2_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, pgw2ps,
								prevNode, pstep, sf1, process, useCase, p2uc, flow, task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pgw2ps] = " + pgw2ps + ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep
							+ ", " + "[sf1] = " + sf1 + ", " + "[process] = " + process + ", " + "[useCase] = "
							+ useCase + ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", " + "[task] = "
							+ task + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ParallelGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, Task task) {
		match.registerObject("prevNode", prevNode);
		match.registerObject("sf1", sf1);
		match.registerObject("process", process);
		match.registerObject("task", task);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ParallelGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, Task task) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, SequenceFlow sf1, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow,
			Task task) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		// Create unbound variables
		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow.id", csp);
		var_pflow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_pflow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pgw2ps", pgw2ps);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("task", task);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject step, EObject pgw2ps, EObject prevNode,
			EObject pstep, EObject sf1, EObject process, EObject useCase, EObject p2uc, EObject pflow, EObject flow,
			EObject t2s, EObject task) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("pgw2ps", pgw2ps);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("pflow", pflow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("t2s", t2s);
		ruleresult.registerObject("task", task);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("sf1").eClass()
						.equals(de.abilov.bpmn.BpmnPackage.eINSTANCE.getSequenceFlow())
				&& match.getObject("task").eClass().equals(de.abilov.bpmn.BpmnPackage.eINSTANCE.getTask());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, NormalStep step, ParallelStep pstep, UseCase useCase,
			ParallelFlow pflow, Flow flow) {
		// initial bindings
		Object[] result1_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_10_1_blackBBBBBBB(this, match, step, pstep,
				useCase, pflow, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[step] = " + step + ", " + "[pstep] = " + pstep + ", "
							+ "[useCase] = " + useCase + ", " + "[pflow] = " + pflow + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_10_2_bindingAndBlackFBBBBBBB(this,
				match, step, pstep, useCase, pflow, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[pstep] = " + pstep
					+ ", " + "[useCase] = " + useCase + ", " + "[pflow] = " + pflow + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (T2SAfterSplitImpl.pattern_T2SAfterSplit_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_10_4_blackBBBBBB(match, step, pstep,
					useCase, pflow, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[pstep] = "
						+ pstep + ", " + "[useCase] = " + useCase + ", " + "[pflow] = " + pflow + ", " + "[flow] = "
						+ flow + ".");
			}
			T2SAfterSplitImpl.pattern_T2SAfterSplit_10_4_greenBBBBBFFF(match, step, pstep, useCase, pflow);
			// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result4_green[5];
			// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result4_green[6];
			// EMoflonEdge pflow__step____steps = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_10_5_blackBBBBBB(match, step, pstep,
					useCase, pflow, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[pstep] = "
						+ pstep + ", " + "[useCase] = " + useCase + ", " + "[pflow] = " + pflow + ", " + "[flow] = "
						+ flow + ".");
			}
			T2SAfterSplitImpl.pattern_T2SAfterSplit_10_5_greenBBBBFF(match, pstep, useCase, flow);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			T2SAfterSplitImpl.pattern_T2SAfterSplit_10_6_expressionBBBBBBB(this, match, step, pstep, useCase, pflow,
					flow);
			return T2SAfterSplitImpl.pattern_T2SAfterSplit_10_7_expressionF();
		} else {
			return T2SAfterSplitImpl.pattern_T2SAfterSplit_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl
				.pattern_T2SAfterSplit_11_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NormalStep step = (NormalStep) result1_bindingAndBlack[0];
		GW2S pgw2ps = (GW2S) result1_bindingAndBlack[1];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[2];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[3];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[6];
		ParallelFlow pflow = (ParallelFlow) result1_bindingAndBlack[7];
		Flow flow = (Flow) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_11_1_greenBBFBFFB(step, prevNode, process,
				csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[2];
		FN2S t2s = (FN2S) result1_green[4];
		Task task = (Task) result1_green[5];

		// collect translated elements
		Object[] result2_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_11_2_blackBBBBB(step, sf1, pflow, t2s, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pflow] = " + pflow + ", " + "[t2s] = "
					+ t2s + ", " + "[task] = " + task + ".");
		}
		Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_11_2_greenFBBBBB(step, sf1, pflow, t2s, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_11_3_blackBBBBBBBBBBBBB(ruleresult, step,
				pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, pflow, flow, t2s, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[step] = " + step + ", " + "[pgw2ps] = " + pgw2ps + ", "
					+ "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[sf1] = " + sf1 + ", "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", "
					+ "[pflow] = " + pflow + ", " + "[flow] = " + flow + ", " + "[t2s] = " + t2s + ", " + "[task] = "
					+ task + ".");
		}
		T2SAfterSplitImpl.pattern_T2SAfterSplit_11_3_greenBBBBBBBBBBFFFFFFFFFFF(ruleresult, step, prevNode, pstep, sf1,
				process, useCase, pflow, t2s, task);
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		T2SAfterSplitImpl.pattern_T2SAfterSplit_11_5_expressionBBBBBBBBBBBBBB(this, ruleresult, step, pgw2ps, prevNode,
				pstep, sf1, process, useCase, p2uc, pflow, flow, t2s, task);
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = T2SAfterSplitImpl.pattern_T2SAfterSplit_12_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		NormalStep step = (NormalStep) result2_binding[0];
		ParallelStep pstep = (ParallelStep) result2_binding[1];
		UseCase useCase = (UseCase) result2_binding[2];
		ParallelFlow pflow = (ParallelFlow) result2_binding[3];
		Flow flow = (Flow) result2_binding[4];
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_12_2_blackBFFBFBFBBB(step, pstep, useCase,
				pflow, flow, match)) {
			GW2S pgw2ps = (GW2S) result2_black[1];
			ParallelGateway prevNode = (ParallelGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[4];
			P2UC p2uc = (P2UC) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_12_3_blackBBBBBBBBB(step, pgw2ps,
					prevNode, pstep, process, useCase, p2uc, pflow, flow)) {
				Object[] result3_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_12_3_greenBBBBBBBBBFFFFFFFFFFF(step,
						pgw2ps, prevNode, pstep, process, useCase, p2uc, pflow, flow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge pgw2ps__prevNode____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pgw2ps__pstep____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pstep__pflow____invokedFlows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCase__pflow____flows = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pflow__step____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flow__pstep____steps = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = T2SAfterSplitImpl
						.pattern_T2SAfterSplit_12_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, step, pgw2ps,
								prevNode, pstep, process, useCase, p2uc, pflow, flow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[step] = " + step + ", " + "[pgw2ps] = " + pgw2ps + ", " + "[prevNode] = " + prevNode
							+ ", " + "[pstep] = " + pstep + ", " + "[process] = " + process + ", " + "[useCase] = "
							+ useCase + ", " + "[p2uc] = " + p2uc + ", " + "[pflow] = " + pflow + ", " + "[flow] = "
							+ flow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NormalStep step, ParallelStep pstep, UseCase useCase,
			ParallelFlow pflow, Flow flow) {
		match.registerObject("step", step);
		match.registerObject("pstep", pstep);
		match.registerObject("useCase", useCase);
		match.registerObject("pflow", pflow);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep step, ParallelStep pstep, UseCase useCase,
			ParallelFlow pflow, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			ParallelFlow pflow, Flow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow.id", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", csp);
		var_sf1_id.setType("String");
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", csp);
		var_task_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_pflow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("pgw2ps", pgw2ps);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("pflow", pflow);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject step, EObject pgw2ps, EObject prevNode,
			EObject pstep, EObject sf1, EObject process, EObject useCase, EObject p2uc, EObject pflow, EObject flow,
			EObject t2s, EObject task) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("pgw2ps", pgw2ps);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("pflow", pflow);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("t2s", t2s);
		ruleresult.registerObject("task", task);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& match.getObject("step").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getNormalStep())
				&& match.getObject("pflow").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getParallelFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_443(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_20_2_blackFFFFB(_edge_sourceRef)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterSplitImpl.pattern_T2SAfterSplit_20_3_expressionFBBBBBB(this, match, prevNode, sf1, process,
					task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_444(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_21_2_blackFFFFB(_edge_outgoing)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterSplitImpl.pattern_T2SAfterSplit_21_3_expressionFBBBBBB(this, match, prevNode, sf1, process,
					task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_134(EMoflonEdge _edge_invokedFlows) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_22_2_blackFFFFFB(_edge_invokedFlows)) {
			NormalStep step = (NormalStep) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			ParallelFlow pflow = (ParallelFlow) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterSplitImpl.pattern_T2SAfterSplit_22_3_expressionFBBBBBBB(this, match, step, pstep, useCase,
					pflow, flow)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_445(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_23_2_blackFFFFB(_edge_flowElements)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterSplitImpl.pattern_T2SAfterSplit_23_3_expressionFBBBBBB(this, match, prevNode, sf1, process,
					task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_135(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_24_2_blackFFFFFB(_edge_flows)) {
			NormalStep step = (NormalStep) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			ParallelFlow pflow = (ParallelFlow) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterSplitImpl.pattern_T2SAfterSplit_24_3_expressionFBBBBBBB(this, match, step, pstep, useCase,
					pflow, flow)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_136(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_25_2_blackFFFFFB(_edge_steps)) {
			NormalStep step = (NormalStep) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			ParallelFlow pflow = (ParallelFlow) result2_black[3];
			Flow flow = (Flow) result2_black[4];
			Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterSplitImpl.pattern_T2SAfterSplit_25_3_expressionFBBBBBBB(this, match, step, pstep, useCase,
					pflow, flow)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_446(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_26_2_blackFFFFB(_edge_flowElements)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterSplitImpl.pattern_T2SAfterSplit_26_3_expressionFBBBBBB(this, match, prevNode, sf1, process,
					task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_447(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_27_2_blackFFFFB(_edge_targetRef)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterSplitImpl.pattern_T2SAfterSplit_27_3_expressionFBBBBBB(this, match, prevNode, sf1, process,
					task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_448(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterSplitImpl.pattern_T2SAfterSplit_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterSplitImpl.pattern_T2SAfterSplit_28_2_blackFFFFB(_edge_incoming)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterSplitImpl.pattern_T2SAfterSplit_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterSplitImpl.pattern_T2SAfterSplit_28_3_expressionFBBBBBB(this, match, prevNode, sf1, process,
					task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterSplitImpl.pattern_T2SAfterSplit_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterSplitImpl.pattern_T2SAfterSplit_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterSplitImpl.pattern_T2SAfterSplit_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterSplitImpl.pattern_T2SAfterSplit_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("T2SAfterSplit");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pgw2ps = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPgw2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ParallelGateway prevNode = (de.abilov.bpmn.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		de.abilov.useCase.ParallelStep pstep = (de.abilov.useCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPflow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pflow")).findAny();
		de.abilov.useCase.ParallelFlow pflow = (de.abilov.useCase.ParallelFlow) matchForPflow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S t2s = (de.abilov.tgg.bpmn2useCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		de.abilov.bpmn.Task task = (de.abilov.bpmn.Task) matchForTask.get().getNode();

		if (!(prevNode.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");

		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("T2SAfterSplit");
		eq0.solve(var_sf1_id, var_pflow_id);

		eq1.setRuleName("T2SAfterSplit");
		eq1.solve(var_task_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_pflow_id.setBound(false);
			var_step_id.setBound(false);
			eq0.solve(var_sf1_id, var_pflow_id);
			eq1.solve(var_task_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				pflow.setId((String) var_pflow_id.getValue());
				step.setId((String) var_step_id.getValue());
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
		ruleResult.setRule("T2SAfterSplit");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pgw2ps = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPgw2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ParallelGateway prevNode = (de.abilov.bpmn.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		de.abilov.useCase.ParallelStep pstep = (de.abilov.useCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPflow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pflow")).findAny();
		de.abilov.useCase.ParallelFlow pflow = (de.abilov.useCase.ParallelFlow) matchForPflow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S t2s = (de.abilov.tgg.bpmn2useCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		de.abilov.bpmn.Task task = (de.abilov.bpmn.Task) matchForTask.get().getNode();

		if (!(prevNode.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_pflow_id = CSPFactoryHelper.eINSTANCE.createVariable("pflow", true, csp);
		var_pflow_id.setValue(pflow.getId());
		var_pflow_id.setType("String");

		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("T2SAfterSplit");
		eq0.solve(var_sf1_id, var_pflow_id);

		eq1.setRuleName("T2SAfterSplit");
		eq1.solve(var_task_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf1_id.setBound(false);
			var_task_id.setBound(false);
			eq0.solve(var_sf1_id, var_pflow_id);
			eq1.solve(var_task_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				sf1.setId((String) var_sf1_id.getValue());
				task.setId((String) var_task_id.getValue());
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
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (ParallelGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(Task) arguments.get(4));
		case RulesPackage.T2S_AFTER_SPLIT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ParallelGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(Task) arguments.get(4));
			return null;
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ParallelGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(Task) arguments.get(4));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GW2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (GW2S) arguments.get(1),
					(ParallelGateway) arguments.get(2), (ParallelStep) arguments.get(3),
					(SequenceFlow) arguments.get(4), (de.abilov.bpmn.Process) arguments.get(5),
					(UseCase) arguments.get(6), (P2UC) arguments.get(7), (Flow) arguments.get(8),
					(Task) arguments.get(9));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.T2S_AFTER_SPLIT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (UseCase) arguments.get(3), (ParallelFlow) arguments.get(4),
					(Flow) arguments.get(5));
		case RulesPackage.T2S_AFTER_SPLIT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (UseCase) arguments.get(3), (ParallelFlow) arguments.get(4),
					(Flow) arguments.get(5));
			return null;
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (UseCase) arguments.get(3), (ParallelFlow) arguments.get(4),
					(Flow) arguments.get(5));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_GW2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_PARALLELFLOW_FLOW:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (NormalStep) arguments.get(1),
					(GW2S) arguments.get(2), (ParallelGateway) arguments.get(3), (ParallelStep) arguments.get(4),
					(de.abilov.bpmn.Process) arguments.get(5), (UseCase) arguments.get(6), (P2UC) arguments.get(7),
					(ParallelFlow) arguments.get(8), (Flow) arguments.get(9));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.T2S_AFTER_SPLIT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_443__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_443((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_444__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_444((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_134__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_134((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_445__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_445((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_135__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_135((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_136__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_136((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_446__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_446((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_447__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_447((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_448__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_448((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.T2S_AFTER_SPLIT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_T2SAfterSplit_0_1_blackBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		return new Object[] { _this, match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_T2SAfterSplit_0_2_bindingFBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, sf1, process, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, sf1, process, task };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterSplit_0_2_bindingAndBlackFBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		Object[] result_pattern_T2SAfterSplit_0_2_binding = pattern_T2SAfterSplit_0_2_bindingFBBBBBB(_this, match,
				prevNode, sf1, process, task);
		if (result_pattern_T2SAfterSplit_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterSplit_0_2_binding[0];

			Object[] result_pattern_T2SAfterSplit_0_2_black = pattern_T2SAfterSplit_0_2_blackB(csp);
			if (result_pattern_T2SAfterSplit_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, sf1, process, task };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterSplit_0_3_expressionFBB(T2SAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_0_4_blackBBBBB(Match match, ParallelGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		return new Object[] { match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_T2SAfterSplit_0_4_greenBBBBBFFFFFF(Match match, ParallelGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(task);
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__task____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getToBeTranslatedEdges().add(process__sf1____flowElements);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		match.getToBeTranslatedEdges().add(process__task____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		match.getToBeTranslatedEdges().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		match.getToBeTranslatedEdges().add(task__sf1____incoming);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { match, prevNode, sf1, process, task, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, process__sf1____flowElements, process__task____flowElements,
				sf1__task____targetRef, task__sf1____incoming };
	}

	public static final Object[] pattern_T2SAfterSplit_0_5_blackBBBBB(Match match, ParallelGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		return new Object[] { match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_T2SAfterSplit_0_5_greenBBBF(Match match, ParallelGateway prevNode,
			de.abilov.bpmn.Process process) {
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

	public static final void pattern_T2SAfterSplit_0_6_expressionBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		_this.registerObjectsToMatch_FWD(match, prevNode, sf1, process, task);

	}

	public static final boolean pattern_T2SAfterSplit_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_1_1_bindingFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("task");
		EObject tmpPgw2ps = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpPstep = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpP2uc = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpTask = _localVariable_8;
		if (tmpPgw2ps instanceof GW2S) {
			GW2S pgw2ps = (GW2S) tmpPgw2ps;
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (tmpPstep instanceof ParallelStep) {
					ParallelStep pstep = (ParallelStep) tmpPstep;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpProcess instanceof de.abilov.bpmn.Process) {
							de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpP2uc instanceof P2UC) {
									P2UC p2uc = (P2UC) tmpP2uc;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpTask instanceof Task) {
											Task task = (Task) tmpTask;
											return new Object[] { pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc,
													flow, task, isApplicableMatch };
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

	public static final Object[] pattern_T2SAfterSplit_1_1_blackBBBBBBBBBBFB(GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, SequenceFlow sf1, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow,
			Task task, T2SAfterSplit _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_1_1_bindingAndBlackFFFFFFFFFBFB(T2SAfterSplit _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_T2SAfterSplit_1_1_binding = pattern_T2SAfterSplit_1_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_T2SAfterSplit_1_1_binding != null) {
			GW2S pgw2ps = (GW2S) result_pattern_T2SAfterSplit_1_1_binding[0];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_T2SAfterSplit_1_1_binding[1];
			ParallelStep pstep = (ParallelStep) result_pattern_T2SAfterSplit_1_1_binding[2];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_T2SAfterSplit_1_1_binding[3];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_T2SAfterSplit_1_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_T2SAfterSplit_1_1_binding[5];
			P2UC p2uc = (P2UC) result_pattern_T2SAfterSplit_1_1_binding[6];
			Flow flow = (Flow) result_pattern_T2SAfterSplit_1_1_binding[7];
			Task task = (Task) result_pattern_T2SAfterSplit_1_1_binding[8];

			Object[] result_pattern_T2SAfterSplit_1_1_black = pattern_T2SAfterSplit_1_1_blackBBBBBBBBBBFB(pgw2ps,
					prevNode, pstep, sf1, process, useCase, p2uc, flow, task, _this, isApplicableMatch);
			if (result_pattern_T2SAfterSplit_1_1_black != null) {
				CSP csp = (CSP) result_pattern_T2SAfterSplit_1_1_black[10];

				return new Object[] { pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_1_1_greenFBBFFBB(ParallelStep pstep, UseCase useCase, Task task,
			CSP csp) {
		NormalStep step = UseCaseFactory.eINSTANCE.createNormalStep();
		ParallelFlow pflow = UseCaseFactory.eINSTANCE.createParallelFlow();
		FN2S t2s = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		Object _localVariable_1 = csp.getValue("pflow", "id");
		pstep.getInvokedFlows().add(pflow);
		useCase.getFlows().add(pflow);
		pflow.getSteps().add(step);
		t2s.setTarget(step);
		t2s.setSource(task);
		String step_id_prime = (String) _localVariable_0;
		String pflow_id_prime = (String) _localVariable_1;
		step.setId(step_id_prime);
		pflow.setId(pflow_id_prime);
		return new Object[] { step, pstep, useCase, pflow, t2s, task, csp };
	}

	public static final Object[] pattern_T2SAfterSplit_1_2_blackBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelFlow pflow, FN2S t2s, Task task) {
		return new Object[] { step, sf1, pflow, t2s, task };
	}

	public static final Object[] pattern_T2SAfterSplit_1_2_greenFBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelFlow pflow, FN2S t2s, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(pflow);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getTranslatedElements().add(task);
		return new Object[] { ruleresult, step, sf1, pflow, t2s, task };
	}

	public static final Object[] pattern_T2SAfterSplit_1_3_blackBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject step, EObject pgw2ps, EObject prevNode, EObject pstep, EObject sf1, EObject process,
			EObject useCase, EObject p2uc, EObject pflow, EObject flow, EObject t2s, EObject task) {
		if (!step.equals(useCase)) {
			if (!step.equals(t2s)) {
				if (!step.equals(task)) {
					if (!pgw2ps.equals(step)) {
						if (!pgw2ps.equals(prevNode)) {
							if (!pgw2ps.equals(pstep)) {
								if (!pgw2ps.equals(sf1)) {
									if (!pgw2ps.equals(process)) {
										if (!pgw2ps.equals(useCase)) {
											if (!pgw2ps.equals(t2s)) {
												if (!pgw2ps.equals(task)) {
													if (!prevNode.equals(step)) {
														if (!prevNode.equals(pstep)) {
															if (!prevNode.equals(sf1)) {
																if (!prevNode.equals(process)) {
																	if (!prevNode.equals(useCase)) {
																		if (!prevNode.equals(t2s)) {
																			if (!prevNode.equals(task)) {
																				if (!pstep.equals(step)) {
																					if (!pstep.equals(sf1)) {
																						if (!pstep.equals(useCase)) {
																							if (!pstep.equals(t2s)) {
																								if (!pstep
																										.equals(task)) {
																									if (!sf1.equals(
																											step)) {
																										if (!sf1.equals(
																												useCase)) {
																											if (!sf1.equals(
																													t2s)) {
																												if (!sf1.equals(
																														task)) {
																													if (!process
																															.equals(step)) {
																														if (!process
																																.equals(pstep)) {
																															if (!process
																																	.equals(sf1)) {
																																if (!process
																																		.equals(useCase)) {
																																	if (!process
																																			.equals(t2s)) {
																																		if (!process
																																				.equals(task)) {
																																			if (!p2uc
																																					.equals(step)) {
																																				if (!p2uc
																																						.equals(pgw2ps)) {
																																					if (!p2uc
																																							.equals(prevNode)) {
																																						if (!p2uc
																																								.equals(pstep)) {
																																							if (!p2uc
																																									.equals(sf1)) {
																																								if (!p2uc
																																										.equals(process)) {
																																									if (!p2uc
																																											.equals(useCase)) {
																																										if (!p2uc
																																												.equals(pflow)) {
																																											if (!p2uc
																																													.equals(t2s)) {
																																												if (!p2uc
																																														.equals(task)) {
																																													if (!pflow
																																															.equals(step)) {
																																														if (!pflow
																																																.equals(pgw2ps)) {
																																															if (!pflow
																																																	.equals(prevNode)) {
																																																if (!pflow
																																																		.equals(pstep)) {
																																																	if (!pflow
																																																			.equals(sf1)) {
																																																		if (!pflow
																																																				.equals(process)) {
																																																			if (!pflow
																																																					.equals(useCase)) {
																																																				if (!pflow
																																																						.equals(t2s)) {
																																																					if (!pflow
																																																							.equals(task)) {
																																																						if (!flow
																																																								.equals(step)) {
																																																							if (!flow
																																																									.equals(pgw2ps)) {
																																																								if (!flow
																																																										.equals(prevNode)) {
																																																									if (!flow
																																																											.equals(pstep)) {
																																																										if (!flow
																																																												.equals(sf1)) {
																																																											if (!flow
																																																													.equals(process)) {
																																																												if (!flow
																																																														.equals(useCase)) {
																																																													if (!flow
																																																															.equals(p2uc)) {
																																																														if (!flow
																																																																.equals(pflow)) {
																																																															if (!flow
																																																																	.equals(t2s)) {
																																																																if (!flow
																																																																		.equals(task)) {
																																																																	if (!t2s.equals(
																																																																			useCase)) {
																																																																		if (!t2s.equals(
																																																																				task)) {
																																																																			if (!task
																																																																					.equals(useCase)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						step,
																																																																						pgw2ps,
																																																																						prevNode,
																																																																						pstep,
																																																																						sf1,
																																																																						process,
																																																																						useCase,
																																																																						p2uc,
																																																																						pflow,
																																																																						flow,
																																																																						t2s,
																																																																						task };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterSplit_1_3_greenBBBBBBBBBBFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject step, EObject prevNode, EObject pstep, EObject sf1, EObject process, EObject useCase, EObject pflow,
			EObject t2s, EObject task) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "T2SAfterSplit";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String pflow__step____steps_name_prime = "steps";
		String t2s__step____target_name_prime = "target";
		String t2s__task____source_name_prime = "source";
		String process__task____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		ruleresult.getCreatedEdges().add(pstep__pflow____invokedFlows);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		ruleresult.getCreatedEdges().add(useCase__pflow____flows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(pflow__step____steps);
		t2s__step____target.setSrc(t2s);
		t2s__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(t2s__step____target);
		t2s__task____source.setSrc(t2s);
		t2s__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(t2s__task____source);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getTranslatedEdges().add(process__task____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		ruleresult.getTranslatedEdges().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(task__sf1____incoming);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { ruleresult, step, prevNode, pstep, sf1, process, useCase, pflow, t2s, task,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, pstep__pflow____invokedFlows,
				process__sf1____flowElements, useCase__pflow____flows, pflow__step____steps, t2s__step____target,
				t2s__task____source, process__task____flowElements, sf1__task____targetRef, task__sf1____incoming };
	}

	public static final void pattern_T2SAfterSplit_1_5_expressionBBBBBBBBBBBBBB(T2SAfterSplit _this,
			PerformRuleResult ruleresult, EObject step, EObject pgw2ps, EObject prevNode, EObject pstep, EObject sf1,
			EObject process, EObject useCase, EObject p2uc, EObject pflow, EObject flow, EObject t2s, EObject task) {
		_this.registerObjects_FWD(ruleresult, step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, pflow, flow,
				t2s, task);

	}

	public static final PerformRuleResult pattern_T2SAfterSplit_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_2_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_2_1_blackFBB(EClass eClass, T2SAfterSplit _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_2_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_2_1_binding = pattern_T2SAfterSplit_2_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_T2SAfterSplit_2_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_2_1_black = pattern_T2SAfterSplit_2_1_blackFBB(eClass, _this);
			if (result_pattern_T2SAfterSplit_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_T2SAfterSplit_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "T2SAfterSplit";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_T2SAfterSplit_2_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("sf1");
		EObject _localVariable_2 = match.getObject("process");
		EObject _localVariable_3 = match.getObject("task");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpSf1 = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpTask = _localVariable_3;
		if (tmpPrevNode instanceof ParallelGateway) {
			ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (tmpProcess instanceof de.abilov.bpmn.Process) {
					de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						return new Object[] { prevNode, sf1, process, task, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_2_2_blackFBFBBFFBB(ParallelGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			for (GW2S pgw2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode, GW2S.class,
					"source")) {
				Step tmpPstep = pgw2ps.getTarget();
				if (tmpPstep instanceof ParallelStep) {
					ParallelStep pstep = (ParallelStep) tmpPstep;
					for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(process,
							P2UC.class, "source")) {
						UseCase useCase = p2uc.getTarget();
						if (useCase != null) {
							_result.add(
									new Object[] { pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, task, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_2_3_blackBBBBBBBFB(GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, Task task) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(pgw2ps.getSource())) {
			if (pstep.equals(pgw2ps.getTarget())) {
				if (prevNode.equals(sf1.getSourceRef())) {
					if (process.getFlowElements().contains(prevNode)) {
						if (process.getFlowElements().contains(sf1)) {
							if (process.equals(p2uc.getSource())) {
								if (useCase.equals(p2uc.getTarget())) {
									if (process.getFlowElements().contains(task)) {
										if (task.equals(sf1.getTargetRef())) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
												for (Flow flow : useCase.getFlows()) {
													if (flow.getSteps().contains(pstep)) {
														_result.add(new Object[] { pgw2ps, prevNode, pstep, sf1,
																process, useCase, p2uc, flow, task });
													}
												}
											}

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

	public static final Object[] pattern_T2SAfterSplit_2_3_greenBBBBBBBBBFFFFFFFFFFFFFF(GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, Task task) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pgw2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pgw2ps__prevNode____source_name_prime = "source";
		String pgw2ps__pstep____target_name_prime = "target";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String flow__pstep____steps_name_prime = "steps";
		String process__task____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		isApplicableMatch.getAllContextElements().add(pgw2ps);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(task);
		pgw2ps__prevNode____source.setSrc(pgw2ps);
		pgw2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pgw2ps__prevNode____source);
		pgw2ps__pstep____target.setSrc(pgw2ps);
		pgw2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pgw2ps__pstep____target);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(flow__pstep____steps);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		isApplicableMatch.getAllContextElements().add(process__task____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		isApplicableMatch.getAllContextElements().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(task__sf1____incoming);
		pgw2ps__prevNode____source.setName(pgw2ps__prevNode____source_name_prime);
		pgw2ps__pstep____target.setName(pgw2ps__pstep____target_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task, isApplicableMatch,
				pgw2ps__prevNode____source, pgw2ps__pstep____target, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, process__prevNode____flowElements, process__sf1____flowElements,
				useCase__flow____flows, p2uc__process____source, p2uc__useCase____target, flow__pstep____steps,
				process__task____flowElements, sf1__task____targetRef, task__sf1____incoming };
	}

	public static final Object[] pattern_T2SAfterSplit_2_4_bindingFBBBBBBBBBBB(T2SAfterSplit _this,
			IsApplicableMatch isApplicableMatch, GW2S pgw2ps, ParallelGateway prevNode, ParallelStep pstep,
			SequenceFlow sf1, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow, Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pgw2ps, prevNode, pstep, sf1, process,
				useCase, p2uc, flow, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc,
					flow, task };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterSplit_2_4_bindingAndBlackFBBBBBBBBBBB(T2SAfterSplit _this,
			IsApplicableMatch isApplicableMatch, GW2S pgw2ps, ParallelGateway prevNode, ParallelStep pstep,
			SequenceFlow sf1, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow, Task task) {
		Object[] result_pattern_T2SAfterSplit_2_4_binding = pattern_T2SAfterSplit_2_4_bindingFBBBBBBBBBBB(_this,
				isApplicableMatch, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task);
		if (result_pattern_T2SAfterSplit_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterSplit_2_4_binding[0];

			Object[] result_pattern_T2SAfterSplit_2_4_black = pattern_T2SAfterSplit_2_4_blackB(csp);
			if (result_pattern_T2SAfterSplit_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pgw2ps, prevNode, pstep, sf1, process, useCase,
						p2uc, flow, task };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterSplit_2_5_expressionFBB(T2SAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_T2SAfterSplit_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "T2SAfterSplit";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_T2SAfterSplit_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_10_1_blackBBBBBBB(T2SAfterSplit _this, Match match,
			NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow) {
		if (!flow.equals(pflow)) {
			return new Object[] { _this, match, step, pstep, useCase, pflow, flow };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_10_2_bindingFBBBBBBB(T2SAfterSplit _this, Match match,
			NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, step, pstep, useCase, pflow, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, pstep, useCase, pflow, flow };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterSplit_10_2_bindingAndBlackFBBBBBBB(T2SAfterSplit _this, Match match,
			NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow) {
		Object[] result_pattern_T2SAfterSplit_10_2_binding = pattern_T2SAfterSplit_10_2_bindingFBBBBBBB(_this, match,
				step, pstep, useCase, pflow, flow);
		if (result_pattern_T2SAfterSplit_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterSplit_10_2_binding[0];

			Object[] result_pattern_T2SAfterSplit_10_2_black = pattern_T2SAfterSplit_10_2_blackB(csp);
			if (result_pattern_T2SAfterSplit_10_2_black != null) {

				return new Object[] { csp, _this, match, step, pstep, useCase, pflow, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterSplit_10_3_expressionFBB(T2SAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_10_4_blackBBBBBB(Match match, NormalStep step,
			ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow) {
		if (!flow.equals(pflow)) {
			return new Object[] { match, step, pstep, useCase, pflow, flow };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_10_4_greenBBBBBFFF(Match match, NormalStep step,
			ParallelStep pstep, UseCase useCase, ParallelFlow pflow) {
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		match.getToBeTranslatedNodes().add(pflow);
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String useCase__pflow____flows_name_prime = "flows";
		String pflow__step____steps_name_prime = "steps";
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		match.getToBeTranslatedEdges().add(pstep__pflow____invokedFlows);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		match.getToBeTranslatedEdges().add(useCase__pflow____flows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(pflow__step____steps);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		return new Object[] { match, step, pstep, useCase, pflow, pstep__pflow____invokedFlows, useCase__pflow____flows,
				pflow__step____steps };
	}

	public static final Object[] pattern_T2SAfterSplit_10_5_blackBBBBBB(Match match, NormalStep step,
			ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow) {
		if (!flow.equals(pflow)) {
			return new Object[] { match, step, pstep, useCase, pflow, flow };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_10_5_greenBBBBFF(Match match, ParallelStep pstep,
			UseCase useCase, Flow flow) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pstep);
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		String useCase__flow____flows_name_prime = "flows";
		String flow__pstep____steps_name_prime = "steps";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		match.getContextEdges().add(flow__pstep____steps);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		return new Object[] { match, pstep, useCase, flow, useCase__flow____flows, flow__pstep____steps };
	}

	public static final void pattern_T2SAfterSplit_10_6_expressionBBBBBBB(T2SAfterSplit _this, Match match,
			NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, step, pstep, useCase, pflow, flow);

	}

	public static final boolean pattern_T2SAfterSplit_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_11_1_bindingFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("step");
		EObject _localVariable_1 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_7 = isApplicableMatch.getObject("pflow");
		EObject _localVariable_8 = isApplicableMatch.getObject("flow");
		EObject tmpStep = _localVariable_0;
		EObject tmpPgw2ps = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpPstep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpP2uc = _localVariable_6;
		EObject tmpPflow = _localVariable_7;
		EObject tmpFlow = _localVariable_8;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpPgw2ps instanceof GW2S) {
				GW2S pgw2ps = (GW2S) tmpPgw2ps;
				if (tmpPrevNode instanceof ParallelGateway) {
					ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
					if (tmpPstep instanceof ParallelStep) {
						ParallelStep pstep = (ParallelStep) tmpPstep;
						if (tmpProcess instanceof de.abilov.bpmn.Process) {
							de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpP2uc instanceof P2UC) {
									P2UC p2uc = (P2UC) tmpP2uc;
									if (tmpPflow instanceof ParallelFlow) {
										ParallelFlow pflow = (ParallelFlow) tmpPflow;
										if (tmpFlow instanceof Flow) {
											Flow flow = (Flow) tmpFlow;
											return new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc,
													pflow, flow, isApplicableMatch };
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

	public static final Object[] pattern_T2SAfterSplit_11_1_blackBBBBBBBBBBFB(NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			ParallelFlow pflow, Flow flow, T2SAfterSplit _this, IsApplicableMatch isApplicableMatch) {
		if (!flow.equals(pflow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc, pflow, flow, _this,
							csp, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_11_1_bindingAndBlackFFFFFFFFFBFB(T2SAfterSplit _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_T2SAfterSplit_11_1_binding = pattern_T2SAfterSplit_11_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_T2SAfterSplit_11_1_binding != null) {
			NormalStep step = (NormalStep) result_pattern_T2SAfterSplit_11_1_binding[0];
			GW2S pgw2ps = (GW2S) result_pattern_T2SAfterSplit_11_1_binding[1];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_T2SAfterSplit_11_1_binding[2];
			ParallelStep pstep = (ParallelStep) result_pattern_T2SAfterSplit_11_1_binding[3];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_T2SAfterSplit_11_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_T2SAfterSplit_11_1_binding[5];
			P2UC p2uc = (P2UC) result_pattern_T2SAfterSplit_11_1_binding[6];
			ParallelFlow pflow = (ParallelFlow) result_pattern_T2SAfterSplit_11_1_binding[7];
			Flow flow = (Flow) result_pattern_T2SAfterSplit_11_1_binding[8];

			Object[] result_pattern_T2SAfterSplit_11_1_black = pattern_T2SAfterSplit_11_1_blackBBBBBBBBBBFB(step,
					pgw2ps, prevNode, pstep, process, useCase, p2uc, pflow, flow, _this, isApplicableMatch);
			if (result_pattern_T2SAfterSplit_11_1_black != null) {
				CSP csp = (CSP) result_pattern_T2SAfterSplit_11_1_black[10];

				return new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc, pflow, flow, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_11_1_greenBBFBFFB(NormalStep step, ParallelGateway prevNode,
			de.abilov.bpmn.Process process, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		FN2S t2s = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		Task task = BpmnFactory.eINSTANCE.createTask();
		Object _localVariable_0 = csp.getValue("sf1", "id");
		Object _localVariable_1 = csp.getValue("task", "id");
		sf1.setSourceRef(prevNode);
		process.getFlowElements().add(sf1);
		t2s.setTarget(step);
		t2s.setSource(task);
		process.getFlowElements().add(task);
		sf1.setTargetRef(task);
		String sf1_id_prime = (String) _localVariable_0;
		String task_id_prime = (String) _localVariable_1;
		sf1.setId(sf1_id_prime);
		task.setId(task_id_prime);
		return new Object[] { step, prevNode, sf1, process, t2s, task, csp };
	}

	public static final Object[] pattern_T2SAfterSplit_11_2_blackBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelFlow pflow, FN2S t2s, Task task) {
		return new Object[] { step, sf1, pflow, t2s, task };
	}

	public static final Object[] pattern_T2SAfterSplit_11_2_greenFBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelFlow pflow, FN2S t2s, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(pflow);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getCreatedElements().add(task);
		return new Object[] { ruleresult, step, sf1, pflow, t2s, task };
	}

	public static final Object[] pattern_T2SAfterSplit_11_3_blackBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject step, EObject pgw2ps, EObject prevNode, EObject pstep, EObject sf1, EObject process,
			EObject useCase, EObject p2uc, EObject pflow, EObject flow, EObject t2s, EObject task) {
		if (!step.equals(useCase)) {
			if (!step.equals(t2s)) {
				if (!step.equals(task)) {
					if (!pgw2ps.equals(step)) {
						if (!pgw2ps.equals(prevNode)) {
							if (!pgw2ps.equals(pstep)) {
								if (!pgw2ps.equals(sf1)) {
									if (!pgw2ps.equals(process)) {
										if (!pgw2ps.equals(useCase)) {
											if (!pgw2ps.equals(t2s)) {
												if (!pgw2ps.equals(task)) {
													if (!prevNode.equals(step)) {
														if (!prevNode.equals(pstep)) {
															if (!prevNode.equals(sf1)) {
																if (!prevNode.equals(process)) {
																	if (!prevNode.equals(useCase)) {
																		if (!prevNode.equals(t2s)) {
																			if (!prevNode.equals(task)) {
																				if (!pstep.equals(step)) {
																					if (!pstep.equals(sf1)) {
																						if (!pstep.equals(useCase)) {
																							if (!pstep.equals(t2s)) {
																								if (!pstep
																										.equals(task)) {
																									if (!sf1.equals(
																											step)) {
																										if (!sf1.equals(
																												useCase)) {
																											if (!sf1.equals(
																													t2s)) {
																												if (!sf1.equals(
																														task)) {
																													if (!process
																															.equals(step)) {
																														if (!process
																																.equals(pstep)) {
																															if (!process
																																	.equals(sf1)) {
																																if (!process
																																		.equals(useCase)) {
																																	if (!process
																																			.equals(t2s)) {
																																		if (!process
																																				.equals(task)) {
																																			if (!p2uc
																																					.equals(step)) {
																																				if (!p2uc
																																						.equals(pgw2ps)) {
																																					if (!p2uc
																																							.equals(prevNode)) {
																																						if (!p2uc
																																								.equals(pstep)) {
																																							if (!p2uc
																																									.equals(sf1)) {
																																								if (!p2uc
																																										.equals(process)) {
																																									if (!p2uc
																																											.equals(useCase)) {
																																										if (!p2uc
																																												.equals(pflow)) {
																																											if (!p2uc
																																													.equals(t2s)) {
																																												if (!p2uc
																																														.equals(task)) {
																																													if (!pflow
																																															.equals(step)) {
																																														if (!pflow
																																																.equals(pgw2ps)) {
																																															if (!pflow
																																																	.equals(prevNode)) {
																																																if (!pflow
																																																		.equals(pstep)) {
																																																	if (!pflow
																																																			.equals(sf1)) {
																																																		if (!pflow
																																																				.equals(process)) {
																																																			if (!pflow
																																																					.equals(useCase)) {
																																																				if (!pflow
																																																						.equals(t2s)) {
																																																					if (!pflow
																																																							.equals(task)) {
																																																						if (!flow
																																																								.equals(step)) {
																																																							if (!flow
																																																									.equals(pgw2ps)) {
																																																								if (!flow
																																																										.equals(prevNode)) {
																																																									if (!flow
																																																											.equals(pstep)) {
																																																										if (!flow
																																																												.equals(sf1)) {
																																																											if (!flow
																																																													.equals(process)) {
																																																												if (!flow
																																																														.equals(useCase)) {
																																																													if (!flow
																																																															.equals(p2uc)) {
																																																														if (!flow
																																																																.equals(pflow)) {
																																																															if (!flow
																																																																	.equals(t2s)) {
																																																																if (!flow
																																																																		.equals(task)) {
																																																																	if (!t2s.equals(
																																																																			useCase)) {
																																																																		if (!t2s.equals(
																																																																				task)) {
																																																																			if (!task
																																																																					.equals(useCase)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						step,
																																																																						pgw2ps,
																																																																						prevNode,
																																																																						pstep,
																																																																						sf1,
																																																																						process,
																																																																						useCase,
																																																																						p2uc,
																																																																						pflow,
																																																																						flow,
																																																																						t2s,
																																																																						task };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterSplit_11_3_greenBBBBBBBBBBFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject step, EObject prevNode, EObject pstep, EObject sf1, EObject process, EObject useCase, EObject pflow,
			EObject t2s, EObject task) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "T2SAfterSplit";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String pflow__step____steps_name_prime = "steps";
		String t2s__step____target_name_prime = "target";
		String t2s__task____source_name_prime = "source";
		String process__task____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		ruleresult.getTranslatedEdges().add(pstep__pflow____invokedFlows);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		ruleresult.getTranslatedEdges().add(useCase__pflow____flows);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(pflow__step____steps);
		t2s__step____target.setSrc(t2s);
		t2s__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(t2s__step____target);
		t2s__task____source.setSrc(t2s);
		t2s__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(t2s__task____source);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getCreatedEdges().add(process__task____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		ruleresult.getCreatedEdges().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		ruleresult.getCreatedEdges().add(task__sf1____incoming);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { ruleresult, step, prevNode, pstep, sf1, process, useCase, pflow, t2s, task,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, pstep__pflow____invokedFlows,
				process__sf1____flowElements, useCase__pflow____flows, pflow__step____steps, t2s__step____target,
				t2s__task____source, process__task____flowElements, sf1__task____targetRef, task__sf1____incoming };
	}

	public static final void pattern_T2SAfterSplit_11_5_expressionBBBBBBBBBBBBBB(T2SAfterSplit _this,
			PerformRuleResult ruleresult, EObject step, EObject pgw2ps, EObject prevNode, EObject pstep, EObject sf1,
			EObject process, EObject useCase, EObject p2uc, EObject pflow, EObject flow, EObject t2s, EObject task) {
		_this.registerObjects_BWD(ruleresult, step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, pflow, flow,
				t2s, task);

	}

	public static final PerformRuleResult pattern_T2SAfterSplit_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_12_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_12_1_blackFBB(EClass eClass, T2SAfterSplit _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_12_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_12_1_binding = pattern_T2SAfterSplit_12_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_T2SAfterSplit_12_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_12_1_black = pattern_T2SAfterSplit_12_1_blackFBB(eClass, _this);
			if (result_pattern_T2SAfterSplit_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_T2SAfterSplit_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "T2SAfterSplit";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_T2SAfterSplit_12_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("pstep");
		EObject _localVariable_2 = match.getObject("useCase");
		EObject _localVariable_3 = match.getObject("pflow");
		EObject _localVariable_4 = match.getObject("flow");
		EObject tmpStep = _localVariable_0;
		EObject tmpPstep = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpPflow = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpPstep instanceof ParallelStep) {
				ParallelStep pstep = (ParallelStep) tmpPstep;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpPflow instanceof ParallelFlow) {
						ParallelFlow pflow = (ParallelFlow) tmpPflow;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							return new Object[] { step, pstep, useCase, pflow, flow, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_12_2_blackBFFBFBFBBB(NormalStep step,
			ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(pflow)) {
			for (GW2S pgw2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pstep, GW2S.class,
					"target")) {
				Gateway tmpPrevNode = pgw2ps.getSource();
				if (tmpPrevNode instanceof ParallelGateway) {
					ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
						for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase,
								P2UC.class, "target")) {
							de.abilov.bpmn.Process process = p2uc.getSource();
							if (process != null) {
								_result.add(new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc, pflow,
										flow, match });
							}

						}
					}

				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_12_3_blackBBBBBBBBB(NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			ParallelFlow pflow, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!flow.equals(pflow)) {
			if (prevNode.equals(pgw2ps.getSource())) {
				if (pstep.equals(pgw2ps.getTarget())) {
					if (pstep.getInvokedFlows().contains(pflow)) {
						if (process.getFlowElements().contains(prevNode)) {
							if (useCase.getFlows().contains(pflow)) {
								if (useCase.getFlows().contains(flow)) {
									if (process.equals(p2uc.getSource())) {
										if (useCase.equals(p2uc.getTarget())) {
											if (pflow.getSteps().contains(step)) {
												if (flow.getSteps().contains(pstep)) {
													boolean prevNodeisDiverging = prevNode.isIsDiverging();
													if (Boolean.valueOf(prevNodeisDiverging)
															.equals(Boolean.valueOf(true))) {
														_result.add(new Object[] { step, pgw2ps, prevNode, pstep,
																process, useCase, p2uc, pflow, flow });
													}

												}
											}
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

	public static final Object[] pattern_T2SAfterSplit_12_3_greenBBBBBBBBBFFFFFFFFFFF(NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			ParallelFlow pflow, Flow flow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pgw2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__pflow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__pflow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pflow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__pstep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pgw2ps__prevNode____source_name_prime = "source";
		String pgw2ps__pstep____target_name_prime = "target";
		String pstep__pflow____invokedFlows_name_prime = "invokedFlows";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String useCase__pflow____flows_name_prime = "flows";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String pflow__step____steps_name_prime = "steps";
		String flow__pstep____steps_name_prime = "steps";
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(pgw2ps);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(pflow);
		isApplicableMatch.getAllContextElements().add(flow);
		pgw2ps__prevNode____source.setSrc(pgw2ps);
		pgw2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pgw2ps__prevNode____source);
		pgw2ps__pstep____target.setSrc(pgw2ps);
		pgw2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pgw2ps__pstep____target);
		pstep__pflow____invokedFlows.setSrc(pstep);
		pstep__pflow____invokedFlows.setTrg(pflow);
		isApplicableMatch.getAllContextElements().add(pstep__pflow____invokedFlows);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		useCase__pflow____flows.setSrc(useCase);
		useCase__pflow____flows.setTrg(pflow);
		isApplicableMatch.getAllContextElements().add(useCase__pflow____flows);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		pflow__step____steps.setSrc(pflow);
		pflow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(pflow__step____steps);
		flow__pstep____steps.setSrc(flow);
		flow__pstep____steps.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(flow__pstep____steps);
		pgw2ps__prevNode____source.setName(pgw2ps__prevNode____source_name_prime);
		pgw2ps__pstep____target.setName(pgw2ps__pstep____target_name_prime);
		pstep__pflow____invokedFlows.setName(pstep__pflow____invokedFlows_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		useCase__pflow____flows.setName(useCase__pflow____flows_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		pflow__step____steps.setName(pflow__step____steps_name_prime);
		flow__pstep____steps.setName(flow__pstep____steps_name_prime);
		return new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc, pflow, flow, isApplicableMatch,
				pgw2ps__prevNode____source, pgw2ps__pstep____target, pstep__pflow____invokedFlows,
				process__prevNode____flowElements, useCase__pflow____flows, useCase__flow____flows,
				p2uc__process____source, p2uc__useCase____target, pflow__step____steps, flow__pstep____steps };
	}

	public static final Object[] pattern_T2SAfterSplit_12_4_bindingFBBBBBBBBBBB(T2SAfterSplit _this,
			IsApplicableMatch isApplicableMatch, NormalStep step, GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, ParallelFlow pflow,
			Flow flow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, step, pgw2ps, prevNode, pstep,
				process, useCase, p2uc, pflow, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, step, pgw2ps, prevNode, pstep, process, useCase, p2uc,
					pflow, flow };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterSplit_12_4_bindingAndBlackFBBBBBBBBBBB(T2SAfterSplit _this,
			IsApplicableMatch isApplicableMatch, NormalStep step, GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, ParallelFlow pflow,
			Flow flow) {
		Object[] result_pattern_T2SAfterSplit_12_4_binding = pattern_T2SAfterSplit_12_4_bindingFBBBBBBBBBBB(_this,
				isApplicableMatch, step, pgw2ps, prevNode, pstep, process, useCase, p2uc, pflow, flow);
		if (result_pattern_T2SAfterSplit_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterSplit_12_4_binding[0];

			Object[] result_pattern_T2SAfterSplit_12_4_black = pattern_T2SAfterSplit_12_4_blackB(csp);
			if (result_pattern_T2SAfterSplit_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, step, pgw2ps, prevNode, pstep, process, useCase,
						p2uc, pflow, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterSplit_12_5_expressionFBB(T2SAfterSplit _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_T2SAfterSplit_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "T2SAfterSplit";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_T2SAfterSplit_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_20_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_20_1_blackFBB(EClass __eClass, T2SAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_20_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_20_1_binding = pattern_T2SAfterSplit_20_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterSplit_20_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_20_1_black = pattern_T2SAfterSplit_20_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterSplit_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterSplit_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterSplit_20_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_296452 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_20_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_448164 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_448164)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_20_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_400481 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_400481)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_20_2_blackFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					FlowNode tmpTask = sf1.getTargetRef();
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							if (pattern_T2SAfterSplit_20_2_black_nac_0B(sf1) == null) {
								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(prevNode)) {
										if (process.getFlowElements().contains(task)) {
											if (pattern_T2SAfterSplit_20_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_T2SAfterSplit_20_2_black_nac_2BB(task, process) == null) {
													_result.add(new Object[] { prevNode, sf1, process, task,
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

	public static final Object[] pattern_T2SAfterSplit_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterSplit_20_3_expressionFBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_20_4_expressionFBB(T2SAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterSplit_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterSplit_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_21_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_21_1_blackFBB(EClass __eClass, T2SAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_21_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_21_1_binding = pattern_T2SAfterSplit_21_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterSplit_21_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_21_1_black = pattern_T2SAfterSplit_21_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterSplit_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterSplit_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterSplit_21_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_876472 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_21_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_97700 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_97700)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_21_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_80288 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_80288)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_21_2_blackFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof ParallelGateway) {
			ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
						FlowNode tmpTask = sf1.getTargetRef();
						if (tmpTask instanceof Task) {
							Task task = (Task) tmpTask;
							if (pattern_T2SAfterSplit_21_2_black_nac_0B(sf1) == null) {
								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class,
												"flowElements")) {
									if (process.getFlowElements().contains(sf1)) {
										if (process.getFlowElements().contains(task)) {
											if (pattern_T2SAfterSplit_21_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_T2SAfterSplit_21_2_black_nac_2BB(task, process) == null) {
													_result.add(new Object[] { prevNode, sf1, process, task,
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

	public static final Object[] pattern_T2SAfterSplit_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterSplit_21_3_expressionFBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_21_4_expressionFBB(T2SAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterSplit_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterSplit_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_22_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_22_1_blackFBB(EClass __eClass, T2SAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_22_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_22_1_binding = pattern_T2SAfterSplit_22_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterSplit_22_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_22_1_black = pattern_T2SAfterSplit_22_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterSplit_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterSplit_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterSplit_22_2_black_nac_0BBB(NormalStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_763817 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_763817)) {
					if (!flow.equals(__DEC_step_steps_763817)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_22_2_black_nac_1BB(NormalStep step, ParallelStep pstep) {
		for (Step __DEC_step_next_88940 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_88940)) {
				if (!pstep.equals(__DEC_step_next_88940)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_22_2_black_nac_2BB(ParallelFlow pflow, ParallelStep pstep) {
		for (ParallelStep __DEC_pflow_invokedFlows_77625 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_pflow_invokedFlows_77625)) {
				return new Object[] { pflow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_22_2_black_nac_3BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_821908 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_821908)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_22_2_black_nac_4BB(Flow flow, NormalStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_22_2_blackFFFFFB(EMoflonEdge _edge_invokedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPstep = _edge_invokedFlows.getSrc();
		if (tmpPstep instanceof ParallelStep) {
			ParallelStep pstep = (ParallelStep) tmpPstep;
			EObject tmpPflow = _edge_invokedFlows.getTrg();
			if (tmpPflow instanceof ParallelFlow) {
				ParallelFlow pflow = (ParallelFlow) tmpPflow;
				if (pstep.getInvokedFlows().contains(pflow)) {
					if (pattern_T2SAfterSplit_22_2_black_nac_2BB(pflow, pstep) == null) {
						for (Step tmpStep : pflow.getSteps()) {
							if (tmpStep instanceof NormalStep) {
								NormalStep step = (NormalStep) tmpStep;
								if (pattern_T2SAfterSplit_22_2_black_nac_1BB(step, pstep) == null) {
									for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(pstep, Flow.class, "steps")) {
										if (!flow.equals(pflow)) {
											if (pattern_T2SAfterSplit_22_2_black_nac_0BBB(step, pflow, flow) == null) {
												if (pattern_T2SAfterSplit_22_2_black_nac_4BB(flow, step) == null) {
													for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
														if (useCase.getFlows().contains(flow)) {
															if (pattern_T2SAfterSplit_22_2_black_nac_3BB(pflow,
																	useCase) == null) {
																_result.add(new Object[] { step, pstep, useCase, pflow,
																		flow, _edge_invokedFlows });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterSplit_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterSplit_22_3_expressionFBBBBBBB(T2SAfterSplit _this, Match match,
			NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, pstep, useCase, pflow, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_22_4_expressionFBB(T2SAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterSplit_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterSplit_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_23_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_23_1_blackFBB(EClass __eClass, T2SAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_23_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_23_1_binding = pattern_T2SAfterSplit_23_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterSplit_23_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_23_1_black = pattern_T2SAfterSplit_23_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterSplit_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterSplit_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterSplit_23_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_454134 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_964519 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_964519)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_23_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_933294 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_933294)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_23_2_blackFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						if (process.getFlowElements().contains(prevNode)) {
							FlowNode tmpTask = sf1.getTargetRef();
							if (tmpTask instanceof Task) {
								Task task = (Task) tmpTask;
								if (process.getFlowElements().contains(task)) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										if (pattern_T2SAfterSplit_23_2_black_nac_0B(sf1) == null) {
											if (pattern_T2SAfterSplit_23_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_T2SAfterSplit_23_2_black_nac_2BB(task, process) == null) {
													_result.add(new Object[] { prevNode, sf1, process, task,
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

	public static final Object[] pattern_T2SAfterSplit_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterSplit_23_3_expressionFBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_23_4_expressionFBB(T2SAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterSplit_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterSplit_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_24_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_24_1_blackFBB(EClass __eClass, T2SAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_24_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_24_1_binding = pattern_T2SAfterSplit_24_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterSplit_24_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_24_1_black = pattern_T2SAfterSplit_24_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterSplit_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterSplit_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterSplit_24_2_black_nac_0BBB(NormalStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_985400 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_985400)) {
					if (!flow.equals(__DEC_step_steps_985400)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_24_2_black_nac_1BB(NormalStep step, ParallelStep pstep) {
		for (Step __DEC_step_next_524046 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_524046)) {
				if (!pstep.equals(__DEC_step_next_524046)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_24_2_black_nac_2BB(ParallelFlow pflow, ParallelStep pstep) {
		for (ParallelStep __DEC_pflow_invokedFlows_46533 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_pflow_invokedFlows_46533)) {
				return new Object[] { pflow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_24_2_black_nac_3BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_600158 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_600158)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_24_2_black_nac_4BB(Flow flow, NormalStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_24_2_blackFFFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpPflow = _edge_flows.getTrg();
			if (tmpPflow instanceof ParallelFlow) {
				ParallelFlow pflow = (ParallelFlow) tmpPflow;
				if (useCase.getFlows().contains(pflow)) {
					if (pattern_T2SAfterSplit_24_2_black_nac_3BB(pflow, useCase) == null) {
						for (Flow flow : useCase.getFlows()) {
							if (!flow.equals(pflow)) {
								for (Step tmpStep : pflow.getSteps()) {
									if (tmpStep instanceof NormalStep) {
										NormalStep step = (NormalStep) tmpStep;
										if (pattern_T2SAfterSplit_24_2_black_nac_0BBB(step, pflow, flow) == null) {
											if (pattern_T2SAfterSplit_24_2_black_nac_4BB(flow, step) == null) {
												for (Step tmpPstep : flow.getSteps()) {
													if (tmpPstep instanceof ParallelStep) {
														ParallelStep pstep = (ParallelStep) tmpPstep;
														if (pstep.getInvokedFlows().contains(pflow)) {
															if (pattern_T2SAfterSplit_24_2_black_nac_1BB(step,
																	pstep) == null) {
																if (pattern_T2SAfterSplit_24_2_black_nac_2BB(pflow,
																		pstep) == null) {
																	_result.add(new Object[] { step, pstep, useCase,
																			pflow, flow, _edge_flows });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterSplit_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterSplit_24_3_expressionFBBBBBBB(T2SAfterSplit _this, Match match,
			NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, pstep, useCase, pflow, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_24_4_expressionFBB(T2SAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterSplit_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterSplit_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_25_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_25_1_blackFBB(EClass __eClass, T2SAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_25_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_25_1_binding = pattern_T2SAfterSplit_25_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterSplit_25_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_25_1_black = pattern_T2SAfterSplit_25_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterSplit_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterSplit_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterSplit_25_2_black_nac_0BBB(NormalStep step, ParallelFlow pflow,
			Flow flow) {
		if (!flow.equals(pflow)) {
			for (Flow __DEC_step_steps_921682 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!pflow.equals(__DEC_step_steps_921682)) {
					if (!flow.equals(__DEC_step_steps_921682)) {
						return new Object[] { step, pflow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_25_2_black_nac_1BB(NormalStep step, ParallelStep pstep) {
		for (Step __DEC_step_next_287506 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_287506)) {
				if (!pstep.equals(__DEC_step_next_287506)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_25_2_black_nac_2BB(ParallelFlow pflow, ParallelStep pstep) {
		for (ParallelStep __DEC_pflow_invokedFlows_556902 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_pflow_invokedFlows_556902)) {
				return new Object[] { pflow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_25_2_black_nac_3BB(ParallelFlow pflow, UseCase useCase) {
		for (UseCase __DEC_pflow_flows_236239 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_pflow_flows_236239)) {
				return new Object[] { pflow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_25_2_black_nac_4BB(Flow flow, NormalStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_25_2_blackFFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPflow = _edge_steps.getSrc();
		if (tmpPflow instanceof ParallelFlow) {
			ParallelFlow pflow = (ParallelFlow) tmpPflow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (pflow.getSteps().contains(step)) {
					for (ParallelStep pstep : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pflow,
							ParallelStep.class, "invokedFlows")) {
						if (pattern_T2SAfterSplit_25_2_black_nac_1BB(step, pstep) == null) {
							if (pattern_T2SAfterSplit_25_2_black_nac_2BB(pflow, pstep) == null) {
								for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(pflow, UseCase.class, "flows")) {
									if (pattern_T2SAfterSplit_25_2_black_nac_3BB(pflow, useCase) == null) {
										for (Flow flow : useCase.getFlows()) {
											if (!flow.equals(pflow)) {
												if (flow.getSteps().contains(pstep)) {
													if (pattern_T2SAfterSplit_25_2_black_nac_0BBB(step, pflow,
															flow) == null) {
														if (pattern_T2SAfterSplit_25_2_black_nac_4BB(flow,
																step) == null) {
															_result.add(new Object[] { step, pstep, useCase, pflow,
																	flow, _edge_steps });
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterSplit_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterSplit_25_3_expressionFBBBBBBB(T2SAfterSplit _this, Match match,
			NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow pflow, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, pstep, useCase, pflow, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_25_4_expressionFBB(T2SAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterSplit_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterSplit_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_26_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_26_1_blackFBB(EClass __eClass, T2SAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_26_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_26_1_binding = pattern_T2SAfterSplit_26_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterSplit_26_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_26_1_black = pattern_T2SAfterSplit_26_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterSplit_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterSplit_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterSplit_26_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_325065 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_678137 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_678137)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_26_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_794956 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_794956)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_26_2_blackFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (process.getFlowElements().contains(task)) {
					if (pattern_T2SAfterSplit_26_2_black_nac_2BB(task, process) == null) {
						for (FlowElement tmpPrevNode : process.getFlowElements()) {
							if (tmpPrevNode instanceof ParallelGateway) {
								ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
								boolean prevNodeisDiverging = prevNode.isIsDiverging();
								if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
									for (FlowElement tmpSf1 : process.getFlowElements()) {
										if (tmpSf1 instanceof SequenceFlow) {
											SequenceFlow sf1 = (SequenceFlow) tmpSf1;
											if (prevNode.equals(sf1.getSourceRef())) {
												if (task.equals(sf1.getTargetRef())) {
													if (pattern_T2SAfterSplit_26_2_black_nac_0B(sf1) == null) {
														if (pattern_T2SAfterSplit_26_2_black_nac_1BB(sf1,
																process) == null) {
															_result.add(new Object[] { prevNode, sf1, process, task,
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

		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterSplit_26_3_expressionFBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_26_4_expressionFBB(T2SAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterSplit_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterSplit_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_27_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_27_1_blackFBB(EClass __eClass, T2SAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_27_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_27_1_binding = pattern_T2SAfterSplit_27_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterSplit_27_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_27_1_black = pattern_T2SAfterSplit_27_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterSplit_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterSplit_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterSplit_27_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_999879 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_357781 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_357781)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_27_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_65504 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_65504)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_27_2_blackFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpTask = _edge_targetRef.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (task.equals(sf1.getTargetRef())) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							if (pattern_T2SAfterSplit_27_2_black_nac_0B(sf1) == null) {
								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(prevNode)) {
										if (process.getFlowElements().contains(task)) {
											if (pattern_T2SAfterSplit_27_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_T2SAfterSplit_27_2_black_nac_2BB(task, process) == null) {
													_result.add(new Object[] { prevNode, sf1, process, task,
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

	public static final Object[] pattern_T2SAfterSplit_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterSplit_27_3_expressionFBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_27_4_expressionFBB(T2SAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterSplit_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterSplit_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_28_1_bindingFB(T2SAfterSplit _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_28_1_blackFBB(EClass __eClass, T2SAfterSplit _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_28_1_bindingAndBlackFFB(T2SAfterSplit _this) {
		Object[] result_pattern_T2SAfterSplit_28_1_binding = pattern_T2SAfterSplit_28_1_bindingFB(_this);
		if (result_pattern_T2SAfterSplit_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterSplit_28_1_binding[0];

			Object[] result_pattern_T2SAfterSplit_28_1_black = pattern_T2SAfterSplit_28_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterSplit_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterSplit_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterSplit_28_2_black_nac_0B(SequenceFlow sf1) {
		for (ExclusiveGateway __DEC_sf1_default_936458 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			return new Object[] { sf1 };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_372893 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_372893)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterSplit_28_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_305293 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_305293)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterSplit_28_2_blackFFFFB(EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_incoming.getSrc();
		if (tmpTask instanceof Task) {
			Task task = (Task) tmpTask;
			EObject tmpSf1 = _edge_incoming.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (task.equals(sf1.getTargetRef())) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							if (pattern_T2SAfterSplit_28_2_black_nac_0B(sf1) == null) {
								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class,
												"flowElements")) {
									if (process.getFlowElements().contains(prevNode)) {
										if (process.getFlowElements().contains(sf1)) {
											if (pattern_T2SAfterSplit_28_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_T2SAfterSplit_28_2_black_nac_2BB(task, process) == null) {
													_result.add(new Object[] { prevNode, sf1, process, task,
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

	public static final Object[] pattern_T2SAfterSplit_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterSplit_28_3_expressionFBBBBBB(T2SAfterSplit _this, Match match,
			ParallelGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterSplit_28_4_expressionFBB(T2SAfterSplit _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterSplit_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterSplit_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterSplit_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //T2SAfterSplitImpl
