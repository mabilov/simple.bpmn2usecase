/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.FN2S;
import Bpmn2UseCase.GW2S;
import Bpmn2UseCase.P2UC;

import Bpmn2UseCase.Rules.RulesPackage;
import Bpmn2UseCase.Rules.Task2NormalStepAfterPG;

import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.ParallelGateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;
import SimpleBPMN.Task;

import SimpleUseCase.Flow;
import SimpleUseCase.NormalStep;
import SimpleUseCase.ParallelFlow;
import SimpleUseCase.ParallelStep;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.Step;
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
 * An implementation of the model object '<em><b>Task2 Normal Step After PG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Task2NormalStepAfterPGImpl extends AbstractRuleImpl implements Task2NormalStepAfterPG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task2NormalStepAfterPGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTask2NormalStepAfterPG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ParallelGateway prevNode, SequenceFlow sf1,
			SimpleBPMN.Process process, Task task) {
		// initial bindings
		Object[] result1_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_0_1_blackBBBBBB(this, match,
				prevNode, sf1, process, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[sf1] = " + sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_0_2_bindingAndBlackFBBBBBB(this, match, prevNode, sf1, process, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1
					+ ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_0_4_blackBBBBB(match,
					prevNode, sf1, process, task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
			}
			Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_0_4_greenBBBBBFFFFFF(match, prevNode, sf1,
					process, task);
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[5];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[6];
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[7];
					// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_0_5_blackBBBBB(match,
					prevNode, sf1, process, task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
			}
			Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_0_6_expressionBBBBBB(this, match, prevNode, sf1,
					process, task);
			return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_0_7_expressionF();
		} else {
			return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_1_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		GW2S pgw2ps = (GW2S) result1_bindingAndBlack[0];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[1];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[2];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[6];
		Task task = (Task) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_1_1_greenFBBFFBB(pstep,
				useCase, task, csp);
		NormalStep step = (NormalStep) result1_green[0];
		ParallelFlow flow = (ParallelFlow) result1_green[3];
		FN2S t2s = (FN2S) result1_green[4];

		// collect translated elements
		Object[] result2_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_1_2_blackBBBBB(step, sf1,
				flow, t2s, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", " + "[t2s] = " + t2s
					+ ", " + "[task] = " + task + ".");
		}
		Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_1_2_greenFBBBBB(step, sf1,
				flow, t2s, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_1_3_blackBBBBBBBBBBBB(
				ruleresult, step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, t2s, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[step] = " + step + ", " + "[pgw2ps] = " + pgw2ps + ", "
					+ "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[sf1] = " + sf1 + ", "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", "
					+ "[flow] = " + flow + ", " + "[t2s] = " + t2s + ", " + "[task] = " + task + ".");
		}
		Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_1_3_greenBBBBBBBBBBFFFFFFFFFFF(ruleresult, step,
				prevNode, pstep, sf1, process, useCase, flow, t2s, task);
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pstep__flow____invokedFlows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_1_5_expressionBBBBBBBBBBBBB(this, ruleresult, step,
				pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, t2s, task);
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ParallelGateway prevNode = (ParallelGateway) result2_binding[0];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[1];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[2];
		Task task = (Task) result2_binding[3];
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_2_2_blackFBFBBFFBB(prevNode, sf1, process, task, match)) {
			GW2S pgw2ps = (GW2S) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[2];
			UseCase useCase = (UseCase) result2_black[5];
			P2UC p2uc = (P2UC) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_2_3_blackBBBBBBBB(
					pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, task)) {
				Object[] result3_green = Task2NormalStepAfterPGImpl
						.pattern_Task2NormalStepAfterPG_2_3_greenBBBBBBBBFFFFFFFFFFFF(pgw2ps, prevNode, pstep, sf1,
								process, useCase, p2uc, task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge pgw2ps__prevNode____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pgw2ps__pstep____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2NormalStepAfterPGImpl
						.pattern_Task2NormalStepAfterPG_2_4_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, pgw2ps,
								prevNode, pstep, sf1, process, useCase, p2uc, task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pgw2ps] = " + pgw2ps + ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep
							+ ", " + "[sf1] = " + sf1 + ", " + "[process] = " + process + ", " + "[useCase] = "
							+ useCase + ", " + "[p2uc] = " + p2uc + ", " + "[task] = " + task + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ParallelGateway prevNode, SequenceFlow sf1,
			SimpleBPMN.Process process, Task task) {
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
			SimpleBPMN.Process process, Task task) {// Create CSP
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
			ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Task task) {// Create CSP
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
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", csp);
		var_flow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_flow_id);
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
			EObject pstep, EObject sf1, EObject process, EObject useCase, EObject p2uc, EObject flow, EObject t2s,
			EObject task) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("pgw2ps", pgw2ps);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
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
		return true && match.getObject("sf1").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow())
				&& match.getObject("task").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getTask());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, NormalStep step, ParallelStep pstep, UseCase useCase,
			ParallelFlow flow) {
		// initial bindings
		Object[] result1_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_10_1_blackBBBBBB(this, match,
				step, pstep, useCase, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[pstep] = "
					+ pstep + ", " + "[useCase] = " + useCase + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_10_2_bindingAndBlackFBBBBBB(this, match, step, pstep, useCase, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[pstep] = " + pstep
					+ ", " + "[useCase] = " + useCase + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_10_4_blackBBBBB(match,
					step, pstep, useCase, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[pstep] = "
						+ pstep + ", " + "[useCase] = " + useCase + ", " + "[flow] = " + flow + ".");
			}
			Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_10_4_greenBBBBBFFF(match, step, pstep, useCase,
					flow);
					// EMoflonEdge pstep__flow____invokedFlows = (EMoflonEdge) result4_green[5];
					// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result4_green[6];
					// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[7];

			// collect context elements
			Object[] result5_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_10_5_blackBBBBB(match,
					step, pstep, useCase, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[pstep] = "
						+ pstep + ", " + "[useCase] = " + useCase + ", " + "[flow] = " + flow + ".");
			}
			Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_10_5_greenBBB(match, pstep, useCase);

			// register objects to match
			Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_10_6_expressionBBBBBB(this, match, step, pstep,
					useCase, flow);
			return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_10_7_expressionF();
		} else {
			return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_11_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NormalStep step = (NormalStep) result1_bindingAndBlack[0];
		GW2S pgw2ps = (GW2S) result1_bindingAndBlack[1];
		ParallelGateway prevNode = (ParallelGateway) result1_bindingAndBlack[2];
		ParallelStep pstep = (ParallelStep) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[6];
		ParallelFlow flow = (ParallelFlow) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_11_1_greenBBFBFFB(step,
				prevNode, process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[2];
		FN2S t2s = (FN2S) result1_green[4];
		Task task = (Task) result1_green[5];

		// collect translated elements
		Object[] result2_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_11_2_blackBBBBB(step, sf1,
				flow, t2s, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", " + "[t2s] = " + t2s
					+ ", " + "[task] = " + task + ".");
		}
		Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_11_2_greenFBBBBB(step, sf1,
				flow, t2s, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_11_3_blackBBBBBBBBBBBB(
				ruleresult, step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, t2s, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[step] = " + step + ", " + "[pgw2ps] = " + pgw2ps + ", "
					+ "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[sf1] = " + sf1 + ", "
					+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", "
					+ "[flow] = " + flow + ", " + "[t2s] = " + t2s + ", " + "[task] = " + task + ".");
		}
		Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_11_3_greenBBBBBBBBBBFFFFFFFFFFF(ruleresult, step,
				prevNode, pstep, sf1, process, useCase, flow, t2s, task);
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pstep__flow____invokedFlows = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[20];

		// perform postprocessing story node is empty
		// register objects
		Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_11_5_expressionBBBBBBBBBBBBB(this, ruleresult, step,
				pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, t2s, task);
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		NormalStep step = (NormalStep) result2_binding[0];
		ParallelStep pstep = (ParallelStep) result2_binding[1];
		UseCase useCase = (UseCase) result2_binding[2];
		ParallelFlow flow = (ParallelFlow) result2_binding[3];
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_12_2_blackBFFBFBFBB(step, pstep, useCase, flow, match)) {
			GW2S pgw2ps = (GW2S) result2_black[1];
			ParallelGateway prevNode = (ParallelGateway) result2_black[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[4];
			P2UC p2uc = (P2UC) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_12_3_blackBBBBBBBB(
					step, pgw2ps, prevNode, pstep, process, useCase, p2uc, flow)) {
				Object[] result3_green = Task2NormalStepAfterPGImpl
						.pattern_Task2NormalStepAfterPG_12_3_greenBBBBBBBBFFFFFFFFF(step, pgw2ps, prevNode, pstep,
								process, useCase, p2uc, flow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge pgw2ps__prevNode____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pgw2ps__pstep____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pstep__flow____invokedFlows = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[16];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2NormalStepAfterPGImpl
						.pattern_Task2NormalStepAfterPG_12_4_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, step,
								pgw2ps, prevNode, pstep, process, useCase, p2uc, flow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[step] = " + step + ", " + "[pgw2ps] = " + pgw2ps + ", " + "[prevNode] = " + prevNode
							+ ", " + "[pstep] = " + pstep + ", " + "[process] = " + process + ", " + "[useCase] = "
							+ useCase + ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NormalStep step, ParallelStep pstep, UseCase useCase,
			ParallelFlow flow) {
		match.registerObject("step", step);
		match.registerObject("pstep", pstep);
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep step, ParallelStep pstep, UseCase useCase,
			ParallelFlow flow) {// Create CSP
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
			ParallelGateway prevNode, ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelFlow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");
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
		eq.solve(var_sf1_id, var_flow_id);
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
			EObject pstep, EObject sf1, EObject process, EObject useCase, EObject p2uc, EObject flow, EObject t2s,
			EObject task) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("pgw2ps", pgw2ps);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pstep", pstep);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
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
				&& match.getObject("step").eClass().equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getNormalStep())
				&& match.getObject("flow").eClass()
						.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getParallelFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_103(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_20_2_blackFFFFB(_edge_sourceRef)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_20_3_expressionFBBBBBB(this, match, prevNode,
					sf1, process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_20_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_104(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_21_2_blackFFFFB(_edge_outgoing)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_21_3_expressionFBBBBBB(this, match, prevNode,
					sf1, process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_21_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_30(EMoflonEdge _edge_invokedFlows) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_22_2_blackFFFFB(_edge_invokedFlows)) {
			NormalStep step = (NormalStep) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			ParallelFlow flow = (ParallelFlow) result2_black[3];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_22_3_expressionFBBBBBB(this, match, step,
					pstep, useCase, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_22_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_105(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_23_2_blackFFFFB(_edge_flowElements)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_23_3_expressionFBBBBBB(this, match, prevNode,
					sf1, process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_23_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_31(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_24_2_blackFFFFB(_edge_flows)) {
			NormalStep step = (NormalStep) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			ParallelFlow flow = (ParallelFlow) result2_black[3];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_24_3_expressionFBBBBBB(this, match, step,
					pstep, useCase, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_24_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_32(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_25_2_blackFFFFB(_edge_steps)) {
			NormalStep step = (NormalStep) result2_black[0];
			ParallelStep pstep = (ParallelStep) result2_black[1];
			UseCase useCase = (UseCase) result2_black[2];
			ParallelFlow flow = (ParallelFlow) result2_black[3];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_25_3_expressionFBBBBBB(this, match, step,
					pstep, useCase, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_25_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_106(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_26_2_blackFFFFB(_edge_flowElements)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_26_3_expressionFBBBBBB(this, match, prevNode,
					sf1, process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_26_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_107(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_27_2_blackFFFFB(_edge_targetRef)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_27_3_expressionFBBBBBB(this, match, prevNode,
					sf1, process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_27_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_108(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_28_2_blackFFFFB(_edge_incoming)) {
			ParallelGateway prevNode = (ParallelGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_28_3_expressionFBBBBBB(this, match, prevNode,
					sf1, process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_28_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_28_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Task2NormalStepAfterPG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw2ps")).findAny();
		Bpmn2UseCase.GW2S pgw2ps = (Bpmn2UseCase.GW2S) matchForPgw2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.ParallelGateway prevNode = (SimpleBPMN.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		SimpleUseCase.ParallelStep pstep = (SimpleUseCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		Bpmn2UseCase.P2UC p2uc = (Bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.ParallelFlow flow = (SimpleUseCase.ParallelFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		Bpmn2UseCase.FN2S t2s = (Bpmn2UseCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		SimpleBPMN.Task task = (SimpleBPMN.Task) matchForTask.get().getNode();

		if (!(prevNode.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");

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

		eq0.setRuleName("Task2NormalStepAfterPG");
		eq0.solve(var_sf1_id, var_flow_id);

		eq1.setRuleName("Task2NormalStepAfterPG");
		eq1.solve(var_task_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_flow_id.setBound(false);
			var_step_id.setBound(false);
			eq0.solve(var_sf1_id, var_flow_id);
			eq1.solve(var_task_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				flow.setId((String) var_flow_id.getValue());
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
		ruleResult.setRule("Task2NormalStepAfterPG");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw2ps")).findAny();
		Bpmn2UseCase.GW2S pgw2ps = (Bpmn2UseCase.GW2S) matchForPgw2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.ParallelGateway prevNode = (SimpleBPMN.ParallelGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPstep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pstep")).findAny();
		SimpleUseCase.ParallelStep pstep = (SimpleUseCase.ParallelStep) matchForPstep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		SimpleUseCase.UseCase useCase = (SimpleUseCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		Bpmn2UseCase.P2UC p2uc = (Bpmn2UseCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.ParallelFlow flow = (SimpleUseCase.ParallelFlow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		Bpmn2UseCase.FN2S t2s = (Bpmn2UseCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		SimpleBPMN.Task task = (SimpleBPMN.Task) matchForTask.get().getNode();

		if (!(prevNode.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");

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

		eq0.setRuleName("Task2NormalStepAfterPG");
		eq0.solve(var_sf1_id, var_flow_id);

		eq1.setRuleName("Task2NormalStepAfterPG");
		eq1.solve(var_task_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf1_id.setBound(false);
			var_task_id.setBound(false);
			eq0.solve(var_sf1_id, var_flow_id);
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
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_31_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_31_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_31_2_bindingFFFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		NormalStep step = (NormalStep) result2_binding[0];
		ParallelGateway prevNode = (ParallelGateway) result2_binding[1];
		ParallelStep pstep = (ParallelStep) result2_binding[2];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[4];
		UseCase useCase = (UseCase) result2_binding[5];
		ParallelFlow flow = (ParallelFlow) result2_binding[6];
		Task task = (Task) result2_binding[7];
		for (Object[] result2_black : Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_31_2_blackBFBBBBBFBBBB(
				step, prevNode, pstep, sf1, process, useCase, flow, task, sourceMatch, targetMatch)) {
			GW2S pgw2ps = (GW2S) result2_black[1];
			P2UC p2uc = (P2UC) result2_black[7];
			Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_31_2_greenBBBBBBBBBBBBF(
					step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[12];

			// check csp
			Object[] result3_bindingAndBlack = Task2NormalStepAfterPGImpl
					.pattern_Task2NormalStepAfterPG_31_3_bindingAndBlackFBBBBBBBBBBBBBB(this, isApplicableMatch, step,
							pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_31_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_31_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_31_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, ParallelFlow flow, Task task, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", true, csp);
		var_flow_id.setValue(flow.getId());
		var_flow_id.setType("String");
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_flow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("step", step);
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
		Object[] result1_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_34_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_34_2_bindingAndBlackFFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NormalStep step = (NormalStep) result2_bindingAndBlack[0];
		// GW2S pgw2ps = (GW2S) result2_bindingAndBlack[1];
		// ParallelGateway prevNode = (ParallelGateway) result2_bindingAndBlack[2];
		// ParallelStep pstep = (ParallelStep) result2_bindingAndBlack[3];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[4];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[5];
		// UseCase useCase = (UseCase) result2_bindingAndBlack[6];
		// P2UC p2uc = (P2UC) result2_bindingAndBlack[7];
		// ParallelFlow flow = (ParallelFlow) result2_bindingAndBlack[8];
		Task task = (Task) result2_bindingAndBlack[9];
		Object[] result2_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_34_2_greenBBFF(step, task);
		PerformRuleResult result = (PerformRuleResult) result2_green[2];
		// FN2S t2s = (FN2S) result2_green[3];

		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_34_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, GW2S pgw2psParameter) {
		// create result
		Object[] result1_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_35_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_35_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : Task2NormalStepAfterPGImpl
				.pattern_Task2NormalStepAfterPG_35_2_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList pgw2psList = (RuleEntryList) result2_black[0];
			GW2S pgw2ps = (GW2S) result2_black[1];
			ParallelGateway prevNode = (ParallelGateway) result2_black[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[3];
			P2UC p2uc = (P2UC) result2_black[4];
			UseCase useCase = (UseCase) result2_black[5];
			ParallelStep pstep = (ParallelStep) result2_black[6];

			// solve CSP
			Object[] result3_bindingAndBlack = Task2NormalStepAfterPGImpl
					.pattern_Task2NormalStepAfterPG_35_3_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, pgw2ps,
							prevNode, pstep, process, useCase, p2uc, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pgw2ps] = " + pgw2ps
						+ ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = " + pstep + ", " + "[process] = "
						+ process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_35_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_35_5_blackBBBBBB(
						pgw2ps, prevNode, pstep, process, useCase, p2uc);
				if (result5_black != null) {

					// perform
					Object[] result6_black = Task2NormalStepAfterPGImpl
							.pattern_Task2NormalStepAfterPG_35_6_blackBBBBBBB(pgw2ps, prevNode, pstep, process, useCase,
									p2uc, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[pgw2ps] = " + pgw2ps + ", " + "[prevNode] = " + prevNode + ", " + "[pstep] = "
								+ pstep + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase + ", "
								+ "[p2uc] = " + p2uc + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_35_6_greenFBBFBBFFFBB(prevNode, pstep,
							process, useCase, ruleResult, csp);
					// NormalStep step = (NormalStep) result6_green[0];
					// SequenceFlow sf1 = (SequenceFlow) result6_green[3];
					// ParallelFlow flow = (ParallelFlow) result6_green[6];
					// FN2S t2s = (FN2S) result6_green[7];
					// Task task = (Task) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepAfterPGImpl.pattern_Task2NormalStepAfterPG_35_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", csp);
		var_sf1_id.setType("String");
		Variable var_flow_id = CSPFactoryHelper.eINSTANCE.createVariable("flow.id", csp);
		var_flow_id.setType("String");
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", csp);
		var_task_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_id, var_flow_id);
		eq_0.setRuleName("");
		eq_0.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pgw2ps", pgw2ps);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pstep", pstep);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
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
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (ParallelGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (Task) arguments.get(4));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ParallelGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (Task) arguments.get(4));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PARALLELGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ParallelGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (SimpleBPMN.Process) arguments.get(3), (Task) arguments.get(4));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GW2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (GW2S) arguments.get(1),
					(ParallelGateway) arguments.get(2), (ParallelStep) arguments.get(3),
					(SequenceFlow) arguments.get(4), (SimpleBPMN.Process) arguments.get(5), (UseCase) arguments.get(6),
					(P2UC) arguments.get(7), (Task) arguments.get(8));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (UseCase) arguments.get(3), (ParallelFlow) arguments.get(4));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (UseCase) arguments.get(3), (ParallelFlow) arguments.get(4));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_PARALLELSTEP_USECASE_PARALLELFLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(ParallelStep) arguments.get(2), (UseCase) arguments.get(3), (ParallelFlow) arguments.get(4));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_GW2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_PARALLELFLOW:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (NormalStep) arguments.get(1),
					(GW2S) arguments.get(2), (ParallelGateway) arguments.get(3), (ParallelStep) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (UseCase) arguments.get(6), (P2UC) arguments.get(7),
					(ParallelFlow) arguments.get(8));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_103__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_103((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_104__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_104((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_30((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_105__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_105((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_31((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_BWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_32((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_106__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_106((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_107__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_107((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPROPRIATE_FWD_EMOFLON_EDGE_108__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_108((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_NORMALSTEP_GW2S_PARALLELGATEWAY_PARALLELSTEP_SEQUENCEFLOW_PROCESS_USECASE_P2UC_PARALLELFLOW_TASK_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (NormalStep) arguments.get(1),
					(GW2S) arguments.get(2), (ParallelGateway) arguments.get(3), (ParallelStep) arguments.get(4),
					(SequenceFlow) arguments.get(5), (SimpleBPMN.Process) arguments.get(6), (UseCase) arguments.get(7),
					(P2UC) arguments.get(8), (ParallelFlow) arguments.get(9), (Task) arguments.get(10),
					(Match) arguments.get(11), (Match) arguments.get(12));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___GENERATE_MODEL__RULEENTRYCONTAINER_GW2S:
			return generateModel((RuleEntryContainer) arguments.get(0), (GW2S) arguments.get(1));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_GW2S_PARALLELGATEWAY_PARALLELSTEP_PROCESS_USECASE_P2UC_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (GW2S) arguments.get(1),
					(ParallelGateway) arguments.get(2), (ParallelStep) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4), (UseCase) arguments.get(5), (P2UC) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.TASK2_NORMAL_STEP_AFTER_PG___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_0_1_blackBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		return new Object[] { _this, match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_0_2_bindingFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, sf1, process, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, sf1, process, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_0_2_bindingAndBlackFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		Object[] result_pattern_Task2NormalStepAfterPG_0_2_binding = pattern_Task2NormalStepAfterPG_0_2_bindingFBBBBBB(
				_this, match, prevNode, sf1, process, task);
		if (result_pattern_Task2NormalStepAfterPG_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepAfterPG_0_2_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_0_2_black = pattern_Task2NormalStepAfterPG_0_2_blackB(csp);
			if (result_pattern_Task2NormalStepAfterPG_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, sf1, process, task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_0_3_expressionFBB(Task2NormalStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_0_4_blackBBBBB(Match match, ParallelGateway prevNode,
			SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		return new Object[] { match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_0_4_greenBBBBBFFFFFF(Match match,
			ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
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

	public static final Object[] pattern_Task2NormalStepAfterPG_0_5_blackBBBBB(Match match, ParallelGateway prevNode,
			SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		return new Object[] { match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_0_5_greenBBBF(Match match, ParallelGateway prevNode,
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

	public static final void pattern_Task2NormalStepAfterPG_0_6_expressionBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		_this.registerObjectsToMatch_FWD(match, prevNode, sf1, process, task);

	}

	public static final boolean pattern_Task2NormalStepAfterPG_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_1_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_7 = isApplicableMatch.getObject("task");
		EObject tmpPgw2ps = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpPstep = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpP2uc = _localVariable_6;
		EObject tmpTask = _localVariable_7;
		if (tmpPgw2ps instanceof GW2S) {
			GW2S pgw2ps = (GW2S) tmpPgw2ps;
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (tmpPstep instanceof ParallelStep) {
					ParallelStep pstep = (ParallelStep) tmpPstep;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpP2uc instanceof P2UC) {
									P2UC p2uc = (P2UC) tmpP2uc;
									if (tmpTask instanceof Task) {
										Task task = (Task) tmpTask;
										return new Object[] { pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc,
												task, isApplicableMatch };
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

	public static final Object[] pattern_Task2NormalStepAfterPG_1_1_blackBBBBBBBBBFB(GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, Task task, Task2NormalStepAfterPG _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, task, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_1_1_bindingAndBlackFFFFFFFFBFB(
			Task2NormalStepAfterPG _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2NormalStepAfterPG_1_1_binding = pattern_Task2NormalStepAfterPG_1_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2NormalStepAfterPG_1_1_binding != null) {
			GW2S pgw2ps = (GW2S) result_pattern_Task2NormalStepAfterPG_1_1_binding[0];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_Task2NormalStepAfterPG_1_1_binding[1];
			ParallelStep pstep = (ParallelStep) result_pattern_Task2NormalStepAfterPG_1_1_binding[2];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2NormalStepAfterPG_1_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2NormalStepAfterPG_1_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_Task2NormalStepAfterPG_1_1_binding[5];
			P2UC p2uc = (P2UC) result_pattern_Task2NormalStepAfterPG_1_1_binding[6];
			Task task = (Task) result_pattern_Task2NormalStepAfterPG_1_1_binding[7];

			Object[] result_pattern_Task2NormalStepAfterPG_1_1_black = pattern_Task2NormalStepAfterPG_1_1_blackBBBBBBBBBFB(
					pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, task, _this, isApplicableMatch);
			if (result_pattern_Task2NormalStepAfterPG_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2NormalStepAfterPG_1_1_black[9];

				return new Object[] { pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, task, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_1_1_greenFBBFFBB(ParallelStep pstep, UseCase useCase,
			Task task, CSP csp) {
		NormalStep step = SimpleUseCaseFactory.eINSTANCE.createNormalStep();
		ParallelFlow flow = SimpleUseCaseFactory.eINSTANCE.createParallelFlow();
		FN2S t2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		Object _localVariable_1 = csp.getValue("flow", "id");
		pstep.getInvokedFlows().add(flow);
		useCase.getFlows().add(flow);
		flow.getSteps().add(step);
		t2s.setTarget(step);
		t2s.setSource(task);
		String step_id_prime = (String) _localVariable_0;
		String flow_id_prime = (String) _localVariable_1;
		step.setId(step_id_prime);
		flow.setId(flow_id_prime);
		return new Object[] { step, pstep, useCase, flow, t2s, task, csp };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_1_2_blackBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelFlow flow, FN2S t2s, Task task) {
		return new Object[] { step, sf1, flow, t2s, task };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_1_2_greenFBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelFlow flow, FN2S t2s, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(flow);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getTranslatedElements().add(task);
		return new Object[] { ruleresult, step, sf1, flow, t2s, task };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_1_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject step, EObject pgw2ps, EObject prevNode, EObject pstep, EObject sf1, EObject process,
			EObject useCase, EObject p2uc, EObject flow, EObject t2s, EObject task) {
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
																																												.equals(t2s)) {
																																											if (!p2uc
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
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_1_3_greenBBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject step, EObject prevNode, EObject pstep, EObject sf1, EObject process,
			EObject useCase, EObject flow, EObject t2s, EObject task) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2NormalStepAfterPG";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pstep__flow____invokedFlows_name_prime = "invokedFlows";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String flow__step____steps_name_prime = "steps";
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
		pstep__flow____invokedFlows.setSrc(pstep);
		pstep__flow____invokedFlows.setTrg(flow);
		ruleresult.getCreatedEdges().add(pstep__flow____invokedFlows);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		ruleresult.getCreatedEdges().add(useCase__flow____flows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
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
		pstep__flow____invokedFlows.setName(pstep__flow____invokedFlows_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { ruleresult, step, prevNode, pstep, sf1, process, useCase, flow, t2s, task,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, pstep__flow____invokedFlows,
				process__sf1____flowElements, useCase__flow____flows, flow__step____steps, t2s__step____target,
				t2s__task____source, process__task____flowElements, sf1__task____targetRef, task__sf1____incoming };
	}

	public static final void pattern_Task2NormalStepAfterPG_1_5_expressionBBBBBBBBBBBBB(Task2NormalStepAfterPG _this,
			PerformRuleResult ruleresult, EObject step, EObject pgw2ps, EObject prevNode, EObject pstep, EObject sf1,
			EObject process, EObject useCase, EObject p2uc, EObject flow, EObject t2s, EObject task) {
		_this.registerObjects_FWD(ruleresult, step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, t2s,
				task);

	}

	public static final PerformRuleResult pattern_Task2NormalStepAfterPG_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_1_blackFBB(EClass eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_2_1_binding = pattern_Task2NormalStepAfterPG_2_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2NormalStepAfterPG_2_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_2_1_black = pattern_Task2NormalStepAfterPG_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2NormalStepAfterPG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_2_bindingFFFFB(Match match) {
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
				if (tmpProcess instanceof SimpleBPMN.Process) {
					SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						return new Object[] { prevNode, sf1, process, task, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_2_2_blackFBFBBFFBB(ParallelGateway prevNode,
			SequenceFlow sf1, SimpleBPMN.Process process, Task task, Match match) {
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

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_2_3_blackBBBBBBBB(GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, Task task) {
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
												_result.add(new Object[] { pgw2ps, prevNode, pstep, sf1, process,
														useCase, p2uc, task });
											}

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

	public static final Object[] pattern_Task2NormalStepAfterPG_2_3_greenBBBBBBBBFFFFFFFFFFFF(GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, Task task) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pgw2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pgw2ps__prevNode____source_name_prime = "source";
		String pgw2ps__pstep____target_name_prime = "target";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
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
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
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
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, task, isApplicableMatch,
				pgw2ps__prevNode____source, pgw2ps__pstep____target, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, process__prevNode____flowElements, process__sf1____flowElements,
				p2uc__process____source, p2uc__useCase____target, process__task____flowElements, sf1__task____targetRef,
				task__sf1____incoming };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_4_bindingFBBBBBBBBBB(Task2NormalStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, GW2S pgw2ps, ParallelGateway prevNode, ParallelStep pstep,
			SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pgw2ps, prevNode, pstep, sf1, process,
				useCase, p2uc, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc,
					task };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_4_bindingAndBlackFBBBBBBBBBB(
			Task2NormalStepAfterPG _this, IsApplicableMatch isApplicableMatch, GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, Task task) {
		Object[] result_pattern_Task2NormalStepAfterPG_2_4_binding = pattern_Task2NormalStepAfterPG_2_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, task);
		if (result_pattern_Task2NormalStepAfterPG_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepAfterPG_2_4_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_2_4_black = pattern_Task2NormalStepAfterPG_2_4_blackB(csp);
			if (result_pattern_Task2NormalStepAfterPG_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pgw2ps, prevNode, pstep, sf1, process, useCase,
						p2uc, task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_2_5_expressionFBB(Task2NormalStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2NormalStepAfterPG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2NormalStepAfterPG_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_10_1_blackBBBBBB(Task2NormalStepAfterPG _this,
			Match match, NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow flow) {
		return new Object[] { _this, match, step, pstep, useCase, flow };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_10_2_bindingFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, step, pstep, useCase, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, pstep, useCase, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_10_2_bindingAndBlackFBBBBBB(
			Task2NormalStepAfterPG _this, Match match, NormalStep step, ParallelStep pstep, UseCase useCase,
			ParallelFlow flow) {
		Object[] result_pattern_Task2NormalStepAfterPG_10_2_binding = pattern_Task2NormalStepAfterPG_10_2_bindingFBBBBBB(
				_this, match, step, pstep, useCase, flow);
		if (result_pattern_Task2NormalStepAfterPG_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepAfterPG_10_2_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_10_2_black = pattern_Task2NormalStepAfterPG_10_2_blackB(csp);
			if (result_pattern_Task2NormalStepAfterPG_10_2_black != null) {

				return new Object[] { csp, _this, match, step, pstep, useCase, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_10_3_expressionFBB(Task2NormalStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_10_4_blackBBBBB(Match match, NormalStep step,
			ParallelStep pstep, UseCase useCase, ParallelFlow flow) {
		return new Object[] { match, step, pstep, useCase, flow };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_10_4_greenBBBBBFFF(Match match, NormalStep step,
			ParallelStep pstep, UseCase useCase, ParallelFlow flow) {
		EMoflonEdge pstep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		match.getToBeTranslatedNodes().add(flow);
		String pstep__flow____invokedFlows_name_prime = "invokedFlows";
		String useCase__flow____flows_name_prime = "flows";
		String flow__step____steps_name_prime = "steps";
		pstep__flow____invokedFlows.setSrc(pstep);
		pstep__flow____invokedFlows.setTrg(flow);
		match.getToBeTranslatedEdges().add(pstep__flow____invokedFlows);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getToBeTranslatedEdges().add(useCase__flow____flows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		pstep__flow____invokedFlows.setName(pstep__flow____invokedFlows_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, step, pstep, useCase, flow, pstep__flow____invokedFlows, useCase__flow____flows,
				flow__step____steps };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_10_5_blackBBBBB(Match match, NormalStep step,
			ParallelStep pstep, UseCase useCase, ParallelFlow flow) {
		return new Object[] { match, step, pstep, useCase, flow };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_10_5_greenBBB(Match match, ParallelStep pstep,
			UseCase useCase) {
		match.getContextNodes().add(pstep);
		match.getContextNodes().add(useCase);
		return new Object[] { match, pstep, useCase };
	}

	public static final void pattern_Task2NormalStepAfterPG_10_6_expressionBBBBBB(Task2NormalStepAfterPG _this,
			Match match, NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow flow) {
		_this.registerObjectsToMatch_BWD(match, step, pstep, useCase, flow);

	}

	public static final boolean pattern_Task2NormalStepAfterPG_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("step");
		EObject _localVariable_1 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject tmpStep = _localVariable_0;
		EObject tmpPgw2ps = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpPstep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpP2uc = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpPgw2ps instanceof GW2S) {
				GW2S pgw2ps = (GW2S) tmpPgw2ps;
				if (tmpPrevNode instanceof ParallelGateway) {
					ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
					if (tmpPstep instanceof ParallelStep) {
						ParallelStep pstep = (ParallelStep) tmpPstep;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpP2uc instanceof P2UC) {
									P2UC p2uc = (P2UC) tmpP2uc;
									if (tmpFlow instanceof ParallelFlow) {
										ParallelFlow flow = (ParallelFlow) tmpFlow;
										return new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc,
												flow, isApplicableMatch };
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

	public static final Object[] pattern_Task2NormalStepAfterPG_11_1_blackBBBBBBBBBFB(NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelFlow flow, Task2NormalStepAfterPG _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc, flow, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_11_1_bindingAndBlackFFFFFFFFBFB(
			Task2NormalStepAfterPG _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2NormalStepAfterPG_11_1_binding = pattern_Task2NormalStepAfterPG_11_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2NormalStepAfterPG_11_1_binding != null) {
			NormalStep step = (NormalStep) result_pattern_Task2NormalStepAfterPG_11_1_binding[0];
			GW2S pgw2ps = (GW2S) result_pattern_Task2NormalStepAfterPG_11_1_binding[1];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_Task2NormalStepAfterPG_11_1_binding[2];
			ParallelStep pstep = (ParallelStep) result_pattern_Task2NormalStepAfterPG_11_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2NormalStepAfterPG_11_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_Task2NormalStepAfterPG_11_1_binding[5];
			P2UC p2uc = (P2UC) result_pattern_Task2NormalStepAfterPG_11_1_binding[6];
			ParallelFlow flow = (ParallelFlow) result_pattern_Task2NormalStepAfterPG_11_1_binding[7];

			Object[] result_pattern_Task2NormalStepAfterPG_11_1_black = pattern_Task2NormalStepAfterPG_11_1_blackBBBBBBBBBFB(
					step, pgw2ps, prevNode, pstep, process, useCase, p2uc, flow, _this, isApplicableMatch);
			if (result_pattern_Task2NormalStepAfterPG_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2NormalStepAfterPG_11_1_black[9];

				return new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc, flow, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_11_1_greenBBFBFFB(NormalStep step,
			ParallelGateway prevNode, SimpleBPMN.Process process, CSP csp) {
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		FN2S t2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		Task task = SimpleBPMNFactory.eINSTANCE.createTask();
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

	public static final Object[] pattern_Task2NormalStepAfterPG_11_2_blackBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelFlow flow, FN2S t2s, Task task) {
		return new Object[] { step, sf1, flow, t2s, task };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_11_2_greenFBBBBB(NormalStep step, SequenceFlow sf1,
			ParallelFlow flow, FN2S t2s, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(flow);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getCreatedElements().add(task);
		return new Object[] { ruleresult, step, sf1, flow, t2s, task };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_11_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject step, EObject pgw2ps, EObject prevNode, EObject pstep, EObject sf1, EObject process,
			EObject useCase, EObject p2uc, EObject flow, EObject t2s, EObject task) {
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
																																												.equals(t2s)) {
																																											if (!p2uc
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
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_11_3_greenBBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject step, EObject prevNode, EObject pstep, EObject sf1, EObject process,
			EObject useCase, EObject flow, EObject t2s, EObject task) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2NormalStepAfterPG";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pstep__flow____invokedFlows_name_prime = "invokedFlows";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String flow__step____steps_name_prime = "steps";
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
		pstep__flow____invokedFlows.setSrc(pstep);
		pstep__flow____invokedFlows.setTrg(flow);
		ruleresult.getTranslatedEdges().add(pstep__flow____invokedFlows);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		ruleresult.getTranslatedEdges().add(useCase__flow____flows);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
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
		pstep__flow____invokedFlows.setName(pstep__flow____invokedFlows_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { ruleresult, step, prevNode, pstep, sf1, process, useCase, flow, t2s, task,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, pstep__flow____invokedFlows,
				process__sf1____flowElements, useCase__flow____flows, flow__step____steps, t2s__step____target,
				t2s__task____source, process__task____flowElements, sf1__task____targetRef, task__sf1____incoming };
	}

	public static final void pattern_Task2NormalStepAfterPG_11_5_expressionBBBBBBBBBBBBB(Task2NormalStepAfterPG _this,
			PerformRuleResult ruleresult, EObject step, EObject pgw2ps, EObject prevNode, EObject pstep, EObject sf1,
			EObject process, EObject useCase, EObject p2uc, EObject flow, EObject t2s, EObject task) {
		_this.registerObjects_BWD(ruleresult, step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, t2s,
				task);

	}

	public static final PerformRuleResult pattern_Task2NormalStepAfterPG_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_1_blackFBB(EClass eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_12_1_binding = pattern_Task2NormalStepAfterPG_12_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2NormalStepAfterPG_12_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_12_1_black = pattern_Task2NormalStepAfterPG_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2NormalStepAfterPG";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("pstep");
		EObject _localVariable_2 = match.getObject("useCase");
		EObject _localVariable_3 = match.getObject("flow");
		EObject tmpStep = _localVariable_0;
		EObject tmpPstep = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpPstep instanceof ParallelStep) {
				ParallelStep pstep = (ParallelStep) tmpPstep;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpFlow instanceof ParallelFlow) {
						ParallelFlow flow = (ParallelFlow) tmpFlow;
						return new Object[] { step, pstep, useCase, flow, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_12_2_blackBFFBFBFBB(NormalStep step,
			ParallelStep pstep, UseCase useCase, ParallelFlow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (GW2S pgw2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pstep, GW2S.class,
				"target")) {
			Gateway tmpPrevNode = pgw2ps.getSource();
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				boolean prevNodeisDiverging = prevNode.isIsDiverging();
				if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
					for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase,
							P2UC.class, "target")) {
						SimpleBPMN.Process process = p2uc.getSource();
						if (process != null) {
							_result.add(new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc, flow,
									match });
						}

					}
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_12_3_blackBBBBBBBB(NormalStep step,
			GW2S pgw2ps, ParallelGateway prevNode, ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, ParallelFlow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(pgw2ps.getSource())) {
			if (pstep.equals(pgw2ps.getTarget())) {
				if (pstep.getInvokedFlows().contains(flow)) {
					if (process.getFlowElements().contains(prevNode)) {
						if (useCase.getFlows().contains(flow)) {
							if (process.equals(p2uc.getSource())) {
								if (useCase.equals(p2uc.getTarget())) {
									if (flow.getSteps().contains(step)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											_result.add(new Object[] { step, pgw2ps, prevNode, pstep, process, useCase,
													p2uc, flow });
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

	public static final Object[] pattern_Task2NormalStepAfterPG_12_3_greenBBBBBBBBFFFFFFFFF(NormalStep step,
			GW2S pgw2ps, ParallelGateway prevNode, ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, ParallelFlow flow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pgw2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw2ps__pstep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pstep__flow____invokedFlows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pgw2ps__prevNode____source_name_prime = "source";
		String pgw2ps__pstep____target_name_prime = "target";
		String pstep__flow____invokedFlows_name_prime = "invokedFlows";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(pgw2ps);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(flow);
		pgw2ps__prevNode____source.setSrc(pgw2ps);
		pgw2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pgw2ps__prevNode____source);
		pgw2ps__pstep____target.setSrc(pgw2ps);
		pgw2ps__pstep____target.setTrg(pstep);
		isApplicableMatch.getAllContextElements().add(pgw2ps__pstep____target);
		pstep__flow____invokedFlows.setSrc(pstep);
		pstep__flow____invokedFlows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(pstep__flow____invokedFlows);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		pgw2ps__prevNode____source.setName(pgw2ps__prevNode____source_name_prime);
		pgw2ps__pstep____target.setName(pgw2ps__pstep____target_name_prime);
		pstep__flow____invokedFlows.setName(pstep__flow____invokedFlows_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { step, pgw2ps, prevNode, pstep, process, useCase, p2uc, flow, isApplicableMatch,
				pgw2ps__prevNode____source, pgw2ps__pstep____target, pstep__flow____invokedFlows,
				process__prevNode____flowElements, useCase__flow____flows, p2uc__process____source,
				p2uc__useCase____target, flow__step____steps };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_4_bindingFBBBBBBBBBB(Task2NormalStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, NormalStep step, GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, ParallelFlow flow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, step, pgw2ps, prevNode, pstep,
				process, useCase, p2uc, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, step, pgw2ps, prevNode, pstep, process, useCase, p2uc,
					flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_4_bindingAndBlackFBBBBBBBBBB(
			Task2NormalStepAfterPG _this, IsApplicableMatch isApplicableMatch, NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ParallelFlow flow) {
		Object[] result_pattern_Task2NormalStepAfterPG_12_4_binding = pattern_Task2NormalStepAfterPG_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, step, pgw2ps, prevNode, pstep, process, useCase, p2uc, flow);
		if (result_pattern_Task2NormalStepAfterPG_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepAfterPG_12_4_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_12_4_black = pattern_Task2NormalStepAfterPG_12_4_blackB(csp);
			if (result_pattern_Task2NormalStepAfterPG_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, step, pgw2ps, prevNode, pstep, process, useCase,
						p2uc, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_12_5_expressionFBB(Task2NormalStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2NormalStepAfterPG";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2NormalStepAfterPG_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_20_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_20_1_blackFBB(EClass __eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_20_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_20_1_binding = pattern_Task2NormalStepAfterPG_20_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepAfterPG_20_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_20_1_black = pattern_Task2NormalStepAfterPG_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_20_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_299918 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_299918)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_20_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_721761 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_721761)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_20_2_blackFFFFB(EMoflonEdge _edge_sourceRef) {
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
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(prevNode)) {
									if (process.getFlowElements().contains(task)) {
										if (pattern_Task2NormalStepAfterPG_20_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepAfterPG_20_2_black_nac_1BB(task,
													process) == null) {
												_result.add(
														new Object[] { prevNode, sf1, process, task, _edge_sourceRef });
											}
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

	public static final Object[] pattern_Task2NormalStepAfterPG_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepAfterPG_20_3_expressionFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_20_4_expressionFBB(Task2NormalStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepAfterPG_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_21_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_21_1_blackFBB(EClass __eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_21_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_21_1_binding = pattern_Task2NormalStepAfterPG_21_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepAfterPG_21_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_21_1_black = pattern_Task2NormalStepAfterPG_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_21_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_960654 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_960654)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_21_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_41103 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_41103)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_21_2_blackFFFFB(EMoflonEdge _edge_outgoing) {
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
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements().contains(task)) {
										if (pattern_Task2NormalStepAfterPG_21_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepAfterPG_21_2_black_nac_1BB(task,
													process) == null) {
												_result.add(
														new Object[] { prevNode, sf1, process, task, _edge_outgoing });
											}
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

	public static final Object[] pattern_Task2NormalStepAfterPG_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepAfterPG_21_3_expressionFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_21_4_expressionFBB(Task2NormalStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepAfterPG_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_1_blackFBB(EClass __eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_22_1_binding = pattern_Task2NormalStepAfterPG_22_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepAfterPG_22_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_22_1_black = pattern_Task2NormalStepAfterPG_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_2_black_nac_0BB(NormalStep step, ParallelFlow flow) {
		for (Flow __DEC_step_steps_953429 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_953429)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_2_black_nac_1BB(NormalStep step,
			ParallelStep pstep) {
		for (Step __DEC_step_next_49838 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_49838)) {
				if (!pstep.equals(__DEC_step_next_49838)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_2_black_nac_2BB(ParallelFlow flow,
			ParallelStep pstep) {
		for (ParallelStep __DEC_flow_invokedFlows_728148 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_flow_invokedFlows_728148)) {
				return new Object[] { flow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_2_black_nac_3BB(ParallelFlow flow, UseCase useCase) {
		for (UseCase __DEC_flow_flows_821523 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
				UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_flow_flows_821523)) {
				return new Object[] { flow, useCase };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_22_2_blackFFFFB(
			EMoflonEdge _edge_invokedFlows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPstep = _edge_invokedFlows.getSrc();
		if (tmpPstep instanceof ParallelStep) {
			ParallelStep pstep = (ParallelStep) tmpPstep;
			EObject tmpFlow = _edge_invokedFlows.getTrg();
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (pstep.getInvokedFlows().contains(flow)) {
					if (pattern_Task2NormalStepAfterPG_22_2_black_nac_2BB(flow, pstep) == null) {
						for (Step tmpStep : flow.getSteps()) {
							if (tmpStep instanceof NormalStep) {
								NormalStep step = (NormalStep) tmpStep;
								if (pattern_Task2NormalStepAfterPG_22_2_black_nac_0BB(step, flow) == null) {
									if (pattern_Task2NormalStepAfterPG_22_2_black_nac_1BB(step, pstep) == null) {
										for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(flow, UseCase.class, "flows")) {
											if (pattern_Task2NormalStepAfterPG_22_2_black_nac_3BB(flow,
													useCase) == null) {
												_result.add(new Object[] { step, pstep, useCase, flow,
														_edge_invokedFlows });
											}
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

	public static final Object[] pattern_Task2NormalStepAfterPG_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepAfterPG_22_3_expressionFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, pstep, useCase, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_22_4_expressionFBB(Task2NormalStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepAfterPG_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_23_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_23_1_blackFBB(EClass __eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_23_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_23_1_binding = pattern_Task2NormalStepAfterPG_23_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepAfterPG_23_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_23_1_black = pattern_Task2NormalStepAfterPG_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_23_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_239947 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_239947)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_23_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_747386 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_747386)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_23_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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
										if (pattern_Task2NormalStepAfterPG_23_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepAfterPG_23_2_black_nac_1BB(task,
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

		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepAfterPG_23_3_expressionFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_23_4_expressionFBB(Task2NormalStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepAfterPG_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_1_blackFBB(EClass __eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_24_1_binding = pattern_Task2NormalStepAfterPG_24_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepAfterPG_24_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_24_1_black = pattern_Task2NormalStepAfterPG_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_2_black_nac_0BB(NormalStep step, ParallelFlow flow) {
		for (Flow __DEC_step_steps_686766 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_686766)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_2_black_nac_1BB(NormalStep step,
			ParallelStep pstep) {
		for (Step __DEC_step_next_380663 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_380663)) {
				if (!pstep.equals(__DEC_step_next_380663)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_2_black_nac_2BB(ParallelFlow flow,
			ParallelStep pstep) {
		for (ParallelStep __DEC_flow_invokedFlows_623967 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_flow_invokedFlows_623967)) {
				return new Object[] { flow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_2_black_nac_3BB(ParallelFlow flow, UseCase useCase) {
		for (UseCase __DEC_flow_flows_938949 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
				UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_flow_flows_938949)) {
				return new Object[] { flow, useCase };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_24_2_blackFFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpFlow = _edge_flows.getTrg();
			if (tmpFlow instanceof ParallelFlow) {
				ParallelFlow flow = (ParallelFlow) tmpFlow;
				if (useCase.getFlows().contains(flow)) {
					if (pattern_Task2NormalStepAfterPG_24_2_black_nac_3BB(flow, useCase) == null) {
						for (Step tmpStep : flow.getSteps()) {
							if (tmpStep instanceof NormalStep) {
								NormalStep step = (NormalStep) tmpStep;
								if (pattern_Task2NormalStepAfterPG_24_2_black_nac_0BB(step, flow) == null) {
									for (ParallelStep pstep : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
										if (pattern_Task2NormalStepAfterPG_24_2_black_nac_1BB(step, pstep) == null) {
											if (pattern_Task2NormalStepAfterPG_24_2_black_nac_2BB(flow,
													pstep) == null) {
												_result.add(new Object[] { step, pstep, useCase, flow, _edge_flows });
											}
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

	public static final Object[] pattern_Task2NormalStepAfterPG_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepAfterPG_24_3_expressionFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, pstep, useCase, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_24_4_expressionFBB(Task2NormalStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepAfterPG_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_1_blackFBB(EClass __eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_25_1_binding = pattern_Task2NormalStepAfterPG_25_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepAfterPG_25_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_25_1_black = pattern_Task2NormalStepAfterPG_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_2_black_nac_0BB(NormalStep step, ParallelFlow flow) {
		for (Flow __DEC_step_steps_262411 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_262411)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_2_black_nac_1BB(NormalStep step,
			ParallelStep pstep) {
		for (Step __DEC_step_next_88066 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_88066)) {
				if (!pstep.equals(__DEC_step_next_88066)) {
					return new Object[] { step, pstep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_2_black_nac_2BB(ParallelFlow flow,
			ParallelStep pstep) {
		for (ParallelStep __DEC_flow_invokedFlows_110841 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
			if (!pstep.equals(__DEC_flow_invokedFlows_110841)) {
				return new Object[] { flow, pstep };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_2_black_nac_3BB(ParallelFlow flow, UseCase useCase) {
		for (UseCase __DEC_flow_flows_118827 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow,
				UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_flow_flows_118827)) {
				return new Object[] { flow, useCase };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_25_2_blackFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof ParallelFlow) {
			ParallelFlow flow = (ParallelFlow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_Task2NormalStepAfterPG_25_2_black_nac_0BB(step, flow) == null) {
						for (ParallelStep pstep : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(flow, ParallelStep.class, "invokedFlows")) {
							if (pattern_Task2NormalStepAfterPG_25_2_black_nac_1BB(step, pstep) == null) {
								if (pattern_Task2NormalStepAfterPG_25_2_black_nac_2BB(flow, pstep) == null) {
									for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(flow, UseCase.class, "flows")) {
										if (pattern_Task2NormalStepAfterPG_25_2_black_nac_3BB(flow, useCase) == null) {
											_result.add(new Object[] { step, pstep, useCase, flow, _edge_steps });
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

	public static final Object[] pattern_Task2NormalStepAfterPG_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepAfterPG_25_3_expressionFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, NormalStep step, ParallelStep pstep, UseCase useCase, ParallelFlow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, pstep, useCase, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_25_4_expressionFBB(Task2NormalStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_25_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepAfterPG_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_26_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_26_1_blackFBB(EClass __eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_26_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_26_1_binding = pattern_Task2NormalStepAfterPG_26_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepAfterPG_26_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_26_1_black = pattern_Task2NormalStepAfterPG_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_26_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_264467 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_264467)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_26_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_623780 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_623780)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_26_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (process.getFlowElements().contains(task)) {
					if (pattern_Task2NormalStepAfterPG_26_2_black_nac_1BB(task, process) == null) {
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
													if (pattern_Task2NormalStepAfterPG_26_2_black_nac_0BB(sf1,
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

		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepAfterPG_26_3_expressionFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_26_4_expressionFBB(Task2NormalStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_26_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_26_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepAfterPG_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_27_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_27_1_blackFBB(EClass __eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_27_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_27_1_binding = pattern_Task2NormalStepAfterPG_27_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepAfterPG_27_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_27_1_black = pattern_Task2NormalStepAfterPG_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_27_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_265746 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_265746)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_27_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_895016 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_895016)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_27_2_blackFFFFB(EMoflonEdge _edge_targetRef) {
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
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(prevNode)) {
									if (process.getFlowElements().contains(task)) {
										if (pattern_Task2NormalStepAfterPG_27_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepAfterPG_27_2_black_nac_1BB(task,
													process) == null) {
												_result.add(
														new Object[] { prevNode, sf1, process, task, _edge_targetRef });
											}
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

	public static final Object[] pattern_Task2NormalStepAfterPG_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepAfterPG_27_3_expressionFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_27_4_expressionFBB(Task2NormalStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_27_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_27_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepAfterPG_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_28_1_bindingFB(Task2NormalStepAfterPG _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_28_1_blackFBB(EClass __eClass,
			Task2NormalStepAfterPG _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_28_1_bindingAndBlackFFB(Task2NormalStepAfterPG _this) {
		Object[] result_pattern_Task2NormalStepAfterPG_28_1_binding = pattern_Task2NormalStepAfterPG_28_1_bindingFB(
				_this);
		if (result_pattern_Task2NormalStepAfterPG_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepAfterPG_28_1_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_28_1_black = pattern_Task2NormalStepAfterPG_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepAfterPG_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepAfterPG_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_28_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_157262 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_157262)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_28_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_622234 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_622234)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_28_2_blackFFFFB(EMoflonEdge _edge_incoming) {
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
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(prevNode)) {
									if (process.getFlowElements().contains(sf1)) {
										if (pattern_Task2NormalStepAfterPG_28_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepAfterPG_28_2_black_nac_1BB(task,
													process) == null) {
												_result.add(
														new Object[] { prevNode, sf1, process, task, _edge_incoming });
											}
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

	public static final Object[] pattern_Task2NormalStepAfterPG_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepAfterPG_28_3_expressionFBBBBBB(Task2NormalStepAfterPG _this,
			Match match, ParallelGateway prevNode, SequenceFlow sf1, SimpleBPMN.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_28_4_expressionFBB(Task2NormalStepAfterPG _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_28_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_28_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepAfterPG_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_31_1_blackB(Task2NormalStepAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_31_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_31_2_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("step");
		EObject _localVariable_1 = sourceMatch.getObject("prevNode");
		EObject _localVariable_2 = targetMatch.getObject("pstep");
		EObject _localVariable_3 = sourceMatch.getObject("sf1");
		EObject _localVariable_4 = sourceMatch.getObject("process");
		EObject _localVariable_5 = targetMatch.getObject("useCase");
		EObject _localVariable_6 = targetMatch.getObject("flow");
		EObject _localVariable_7 = sourceMatch.getObject("task");
		EObject tmpStep = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpPstep = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpFlow = _localVariable_6;
		EObject tmpTask = _localVariable_7;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpPrevNode instanceof ParallelGateway) {
				ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
				if (tmpPstep instanceof ParallelStep) {
					ParallelStep pstep = (ParallelStep) tmpPstep;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpFlow instanceof ParallelFlow) {
									ParallelFlow flow = (ParallelFlow) tmpFlow;
									if (tmpTask instanceof Task) {
										Task task = (Task) tmpTask;
										return new Object[] { step, prevNode, pstep, sf1, process, useCase, flow, task,
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

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_31_2_blackBFBBBBBFBBBB(NormalStep step,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase,
			ParallelFlow flow, Task task, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			if (prevNode.equals(sf1.getSourceRef())) {
				if (pstep.getInvokedFlows().contains(flow)) {
					if (process.getFlowElements().contains(prevNode)) {
						if (process.getFlowElements().contains(sf1)) {
							if (useCase.getFlows().contains(flow)) {
								if (flow.getSteps().contains(step)) {
									if (process.getFlowElements().contains(task)) {
										if (task.equals(sf1.getTargetRef())) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
												for (GW2S pgw2ps : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(prevNode, GW2S.class, "source")) {
													if (pstep.equals(pgw2ps.getTarget())) {
														for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(process, P2UC.class,
																		"source")) {
															if (useCase.equals(p2uc.getTarget())) {
																_result.add(new Object[] { step, pgw2ps, prevNode,
																		pstep, sf1, process, useCase, p2uc, flow, task,
																		sourceMatch, targetMatch });
															}
														}
													}
												}
											}

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

	public static final Object[] pattern_Task2NormalStepAfterPG_31_2_greenBBBBBBBBBBBBF(NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, ParallelFlow flow, Task task, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "Task2NormalStepAfterPG";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(task);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(pstep);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(pgw2ps);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task, sourceMatch,
				targetMatch, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_31_3_bindingFBBBBBBBBBBBBBB(
			Task2NormalStepAfterPG _this, IsApplicableMatchCC isApplicableMatch, NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, ParallelFlow flow, Task task, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, step, pgw2ps, prevNode, pstep, sf1,
				process, useCase, p2uc, flow, task, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, step, pgw2ps, prevNode, pstep, sf1, process, useCase,
					p2uc, flow, task, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_31_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_31_3_bindingAndBlackFBBBBBBBBBBBBBB(
			Task2NormalStepAfterPG _this, IsApplicableMatchCC isApplicableMatch, NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, ParallelFlow flow, Task task, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Task2NormalStepAfterPG_31_3_binding = pattern_Task2NormalStepAfterPG_31_3_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task,
				sourceMatch, targetMatch);
		if (result_pattern_Task2NormalStepAfterPG_31_3_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepAfterPG_31_3_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_31_3_black = pattern_Task2NormalStepAfterPG_31_3_blackB(csp);
			if (result_pattern_Task2NormalStepAfterPG_31_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, step, pgw2ps, prevNode, pstep, sf1, process,
						useCase, p2uc, flow, task, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_31_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_31_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2NormalStepAfterPG";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2NormalStepAfterPG_31_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_34_1_blackB(Task2NormalStepAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_34_2_bindingFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("step");
		EObject _localVariable_1 = isApplicableMatch.getObject("pgw2ps");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("pstep");
		EObject _localVariable_4 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_7 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_8 = isApplicableMatch.getObject("flow");
		EObject _localVariable_9 = isApplicableMatch.getObject("task");
		EObject tmpStep = _localVariable_0;
		EObject tmpPgw2ps = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpPstep = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpUseCase = _localVariable_6;
		EObject tmpP2uc = _localVariable_7;
		EObject tmpFlow = _localVariable_8;
		EObject tmpTask = _localVariable_9;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpPgw2ps instanceof GW2S) {
				GW2S pgw2ps = (GW2S) tmpPgw2ps;
				if (tmpPrevNode instanceof ParallelGateway) {
					ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
					if (tmpPstep instanceof ParallelStep) {
						ParallelStep pstep = (ParallelStep) tmpPstep;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpProcess instanceof SimpleBPMN.Process) {
								SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
								if (tmpUseCase instanceof UseCase) {
									UseCase useCase = (UseCase) tmpUseCase;
									if (tmpP2uc instanceof P2UC) {
										P2UC p2uc = (P2UC) tmpP2uc;
										if (tmpFlow instanceof ParallelFlow) {
											ParallelFlow flow = (ParallelFlow) tmpFlow;
											if (tmpTask instanceof Task) {
												Task task = (Task) tmpTask;
												return new Object[] { step, pgw2ps, prevNode, pstep, sf1, process,
														useCase, p2uc, flow, task, isApplicableMatch };
											}
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

	public static final Object[] pattern_Task2NormalStepAfterPG_34_2_blackBBBBBBBBBBB(NormalStep step, GW2S pgw2ps,
			ParallelGateway prevNode, ParallelStep pstep, SequenceFlow sf1, SimpleBPMN.Process process, UseCase useCase,
			P2UC p2uc, ParallelFlow flow, Task task, IsApplicableMatchCC isApplicableMatch) {
		if (prevNode.equals(pgw2ps.getSource())) {
			if (pstep.equals(pgw2ps.getTarget())) {
				if (prevNode.equals(sf1.getSourceRef())) {
					if (pstep.getInvokedFlows().contains(flow)) {
						if (process.getFlowElements().contains(prevNode)) {
							if (process.getFlowElements().contains(sf1)) {
								if (useCase.getFlows().contains(flow)) {
									if (process.equals(p2uc.getSource())) {
										if (useCase.equals(p2uc.getTarget())) {
											if (flow.getSteps().contains(step)) {
												if (process.getFlowElements().contains(task)) {
													if (task.equals(sf1.getTargetRef())) {
														boolean prevNodeisDiverging = prevNode.isIsDiverging();
														if (Boolean.valueOf(prevNodeisDiverging)
																.equals(Boolean.valueOf(true))) {
															return new Object[] { step, pgw2ps, prevNode, pstep, sf1,
																	process, useCase, p2uc, flow, task,
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
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_34_2_bindingAndBlackFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_Task2NormalStepAfterPG_34_2_binding = pattern_Task2NormalStepAfterPG_34_2_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2NormalStepAfterPG_34_2_binding != null) {
			NormalStep step = (NormalStep) result_pattern_Task2NormalStepAfterPG_34_2_binding[0];
			GW2S pgw2ps = (GW2S) result_pattern_Task2NormalStepAfterPG_34_2_binding[1];
			ParallelGateway prevNode = (ParallelGateway) result_pattern_Task2NormalStepAfterPG_34_2_binding[2];
			ParallelStep pstep = (ParallelStep) result_pattern_Task2NormalStepAfterPG_34_2_binding[3];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2NormalStepAfterPG_34_2_binding[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2NormalStepAfterPG_34_2_binding[5];
			UseCase useCase = (UseCase) result_pattern_Task2NormalStepAfterPG_34_2_binding[6];
			P2UC p2uc = (P2UC) result_pattern_Task2NormalStepAfterPG_34_2_binding[7];
			ParallelFlow flow = (ParallelFlow) result_pattern_Task2NormalStepAfterPG_34_2_binding[8];
			Task task = (Task) result_pattern_Task2NormalStepAfterPG_34_2_binding[9];

			Object[] result_pattern_Task2NormalStepAfterPG_34_2_black = pattern_Task2NormalStepAfterPG_34_2_blackBBBBBBBBBBB(
					step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task, isApplicableMatch);
			if (result_pattern_Task2NormalStepAfterPG_34_2_black != null) {

				return new Object[] { step, pgw2ps, prevNode, pstep, sf1, process, useCase, p2uc, flow, task,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_34_2_greenBBFF(NormalStep step, Task task) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		FN2S t2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		result.getCreatedElements().add(t2s);
		t2s.setTarget(step);
		t2s.setSource(task);
		return new Object[] { step, task, result, t2s };
	}

	public static final PerformRuleResult pattern_Task2NormalStepAfterPG_34_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_1_blackB(Task2NormalStepAfterPG _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			GW2S pgw2ps) {
		if (ruleResult.getCorrObjects().contains(pgw2ps)) {
			return new Object[] { ruleResult, pgw2ps };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			ParallelGateway prevNode) {
		if (ruleResult.getSourceObjects().contains(prevNode)) {
			return new Object[] { ruleResult, prevNode };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			P2UC p2uc) {
		if (ruleResult.getCorrObjects().contains(p2uc)) {
			return new Object[] { ruleResult, p2uc };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_2_black_nac_4BB(ModelgeneratorRuleResult ruleResult,
			UseCase useCase) {
		if (ruleResult.getTargetObjects().contains(useCase)) {
			return new Object[] { ruleResult, useCase };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_2_black_nac_5BB(ModelgeneratorRuleResult ruleResult,
			ParallelStep pstep) {
		if (ruleResult.getTargetObjects().contains(pstep)) {
			return new Object[] { ruleResult, pstep };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepAfterPG_35_2_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList pgw2psList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpPgw2ps : pgw2psList.getEntryObjects()) {
				if (tmpPgw2ps instanceof GW2S) {
					GW2S pgw2ps = (GW2S) tmpPgw2ps;
					Gateway tmpPrevNode = pgw2ps.getSource();
					if (tmpPrevNode instanceof ParallelGateway) {
						ParallelGateway prevNode = (ParallelGateway) tmpPrevNode;
						Step tmpPstep = pgw2ps.getTarget();
						if (tmpPstep instanceof ParallelStep) {
							ParallelStep pstep = (ParallelStep) tmpPstep;
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								if (pattern_Task2NormalStepAfterPG_35_2_black_nac_0BB(ruleResult, pgw2ps) == null) {
									if (pattern_Task2NormalStepAfterPG_35_2_black_nac_1BB(ruleResult,
											prevNode) == null) {
										if (pattern_Task2NormalStepAfterPG_35_2_black_nac_5BB(ruleResult,
												pstep) == null) {
											for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
															"flowElements")) {
												if (pattern_Task2NormalStepAfterPG_35_2_black_nac_2BB(ruleResult,
														process) == null) {
													for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(process, P2UC.class, "source")) {
														UseCase useCase = p2uc.getTarget();
														if (useCase != null) {
															if (pattern_Task2NormalStepAfterPG_35_2_black_nac_3BB(
																	ruleResult, p2uc) == null) {
																if (pattern_Task2NormalStepAfterPG_35_2_black_nac_4BB(
																		ruleResult, useCase) == null) {
																	_result.add(new Object[] { pgw2psList, pgw2ps,
																			prevNode, process, p2uc, useCase, pstep,
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

	public static final Object[] pattern_Task2NormalStepAfterPG_35_3_bindingFBBBBBBBBB(Task2NormalStepAfterPG _this,
			IsApplicableMatch isApplicableMatch, GW2S pgw2ps, ParallelGateway prevNode, ParallelStep pstep,
			SimpleBPMN.Process process, UseCase useCase, P2UC p2uc, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, pgw2ps, prevNode, pstep, process,
				useCase, p2uc, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pgw2ps, prevNode, pstep, process, useCase, p2uc,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_3_bindingAndBlackFBBBBBBBBB(
			Task2NormalStepAfterPG _this, IsApplicableMatch isApplicableMatch, GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Task2NormalStepAfterPG_35_3_binding = pattern_Task2NormalStepAfterPG_35_3_bindingFBBBBBBBBB(
				_this, isApplicableMatch, pgw2ps, prevNode, pstep, process, useCase, p2uc, ruleResult);
		if (result_pattern_Task2NormalStepAfterPG_35_3_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepAfterPG_35_3_binding[0];

			Object[] result_pattern_Task2NormalStepAfterPG_35_3_black = pattern_Task2NormalStepAfterPG_35_3_blackB(csp);
			if (result_pattern_Task2NormalStepAfterPG_35_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pgw2ps, prevNode, pstep, process, useCase, p2uc,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepAfterPG_35_4_expressionFBB(Task2NormalStepAfterPG _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_5_blackBBBBBB(GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { pgw2ps, prevNode, pstep, process, useCase, p2uc };
		}

		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_6_blackBBBBBBB(GW2S pgw2ps, ParallelGateway prevNode,
			ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase, P2UC p2uc,
			ModelgeneratorRuleResult ruleResult) {
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			return new Object[] { pgw2ps, prevNode, pstep, process, useCase, p2uc, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_Task2NormalStepAfterPG_35_6_greenFBBFBBFFFBB(ParallelGateway prevNode,
			ParallelStep pstep, SimpleBPMN.Process process, UseCase useCase, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		NormalStep step = SimpleUseCaseFactory.eINSTANCE.createNormalStep();
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ParallelFlow flow = SimpleUseCaseFactory.eINSTANCE.createParallelFlow();
		FN2S t2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		Task task = SimpleBPMNFactory.eINSTANCE.createTask();
		Object _localVariable_0 = csp.getValue("step", "id");
		Object _localVariable_1 = csp.getValue("sf1", "id");
		Object _localVariable_2 = csp.getValue("flow", "id");
		Object _localVariable_3 = csp.getValue("task", "id");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(step);
		sf1.setSourceRef(prevNode);
		process.getFlowElements().add(sf1);
		ruleResult.getSourceObjects().add(sf1);
		pstep.getInvokedFlows().add(flow);
		useCase.getFlows().add(flow);
		flow.getSteps().add(step);
		ruleResult.getTargetObjects().add(flow);
		t2s.setTarget(step);
		ruleResult.getCorrObjects().add(t2s);
		t2s.setSource(task);
		process.getFlowElements().add(task);
		sf1.setTargetRef(task);
		ruleResult.getSourceObjects().add(task);
		String step_id_prime = (String) _localVariable_0;
		String sf1_id_prime = (String) _localVariable_1;
		String flow_id_prime = (String) _localVariable_2;
		String task_id_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		step.setId(step_id_prime);
		sf1.setId(sf1_id_prime);
		flow.setId(flow_id_prime);
		task.setId(task_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { step, prevNode, pstep, sf1, process, useCase, flow, t2s, task, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_Task2NormalStepAfterPG_35_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Task2NormalStepAfterPGImpl
