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
import de.abilov.bpmn.SequenceFlow;
import de.abilov.bpmn.Task;

import de.abilov.tgg.bpmn2useCase.Bpmn2useCaseFactory;
import de.abilov.tgg.bpmn2useCase.FN2S;
import de.abilov.tgg.bpmn2useCase.GW2S;

import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;
import de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterEmptyDef;

import de.abilov.useCase.ChoiceStep;
import de.abilov.useCase.Flow;
import de.abilov.useCase.NormalStep;
import de.abilov.useCase.Step;
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
 * An implementation of the model object '<em><b>Task2 Step After Empty Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Task2StepAfterEmptyDefImpl extends AbstractRuleImpl implements Task2StepAfterEmptyDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task2StepAfterEmptyDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTask2StepAfterEmptyDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode,
			ExclusiveGateway eg, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		// initial bindings
		Object[] result1_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_0_1_blackBBBBBBBB(this,
				match, prevInFlow, prevNode, eg, process, sf1, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevInFlow] = " + prevInFlow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[eg] = " + eg + ", " + "[process] = " + process + ", "
					+ "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_0_2_bindingAndBlackFBBBBBBBB(this, match, prevInFlow, prevNode, eg,
						process, sf1, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevInFlow] = " + prevInFlow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[eg] = " + eg + ", " + "[process] = " + process + ", "
					+ "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_0_4_blackBBBBBBB(match,
					prevInFlow, prevNode, eg, process, sf1, task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevInFlow] = " + prevInFlow + ", "
						+ "[prevNode] = " + prevNode + ", " + "[eg] = " + eg + ", " + "[process] = " + process + ", "
						+ "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
			}
			Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_0_4_greenBBBBBFFFFFF(match, prevNode, process,
					sf1, task);
					// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[5];
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result4_green[7];
					// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_0_5_blackBBBBBBB(match,
					prevInFlow, prevNode, eg, process, sf1, task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevInFlow] = " + prevInFlow + ", "
						+ "[prevNode] = " + prevNode + ", " + "[eg] = " + eg + ", " + "[process] = " + process + ", "
						+ "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
			}
			Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_0_5_greenBBBBBFFFFFF(match, prevInFlow, prevNode,
					eg, process);
					// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result5_green[5];
					// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result5_green[6];
					// EMoflonEdge prevInFlow__eg____sourceRef = (EMoflonEdge) result5_green[7];
					// EMoflonEdge eg__prevInFlow____outgoing = (EMoflonEdge) result5_green[8];
					// EMoflonEdge eg__prevInFlow____default = (EMoflonEdge) result5_green[9];
					// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[10];

			// register objects to match
			Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_0_6_expressionBBBBBBBB(this, match, prevInFlow,
					prevNode, eg, process, sf1, task);
			return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_0_7_expressionF();
		} else {
			return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_1_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SequenceFlow prevInFlow = (SequenceFlow) result1_bindingAndBlack[0];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[1];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[4];
		ExclusiveGateway eg = (ExclusiveGateway) result1_bindingAndBlack[5];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[6];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[7];
		Task task = (Task) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_1_1_greenFBBFBB(flow,
				choiceStep, task, csp);
		NormalStep step = (NormalStep) result1_green[0];
		FN2S t2s = (FN2S) result1_green[3];

		// collect translated elements
		Object[] result2_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_1_2_blackBBBB(step, t2s, sf1,
				task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[t2s] = " + t2s + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_1_2_greenFBBBB(step, t2s,
				sf1, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_1_3_blackBBBBBBBBBBBB(
				ruleresult, prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, t2s, process, sf1, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevInFlow] = " + prevInFlow + ", " + "[prevNode] = "
					+ prevNode + ", " + "[pn2cs] = " + pn2cs + ", " + "[step] = " + step + ", " + "[flow] = " + flow
					+ ", " + "[choiceStep] = " + choiceStep + ", " + "[eg] = " + eg + ", " + "[t2s] = " + t2s + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_1_3_greenBBBBBBBBBFFFFFFFFFF(ruleresult, prevNode,
				step, flow, choiceStep, t2s, process, sf1, task);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[9];
				// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result3_green[10];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[15];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[18];

		// perform postprocessing story node is empty
		// register objects
		Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_1_5_expressionBBBBBBBBBBBBB(this, ruleresult,
				prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, t2s, process, sf1, task);
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_2_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SequenceFlow prevInFlow = (SequenceFlow) result2_binding[0];
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[1];
		ExclusiveGateway eg = (ExclusiveGateway) result2_binding[2];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		Task task = (Task) result2_binding[5];
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_2_2_blackBBFFBBBBB(
				prevInFlow, prevNode, eg, process, sf1, task, match)) {
			GW2S pn2cs = (GW2S) result2_black[2];
			ChoiceStep choiceStep = (ChoiceStep) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_2_3_blackBBBFBBBBB(
					prevInFlow, prevNode, pn2cs, choiceStep, eg, process, sf1, task)) {
				Flow flow = (Flow) result3_black[3];
				Object[] result3_green = Task2StepAfterEmptyDefImpl
						.pattern_Task2StepAfterEmptyDef_2_3_greenBBBBBBBBBFFFFFFFFFFFFFFFF(prevInFlow, prevNode, pn2cs,
								flow, choiceStep, eg, process, sf1, task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevInFlow__eg____sourceRef = (EMoflonEdge) result3_green[15];
				// EMoflonEdge eg__prevInFlow____outgoing = (EMoflonEdge) result3_green[16];
				// EMoflonEdge eg__prevInFlow____default = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[22];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[24];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2StepAfterEmptyDefImpl
						.pattern_Task2StepAfterEmptyDef_2_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								prevInFlow, prevNode, pn2cs, flow, choiceStep, eg, process, sf1, task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevInFlow] = " + prevInFlow + ", " + "[prevNode] = " + prevNode + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[flow] = " + flow + ", " + "[choiceStep] = " + choiceStep + ", "
							+ "[eg] = " + eg + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", "
							+ "[task] = " + task + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode,
			ExclusiveGateway eg, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		match.registerObject("prevInFlow", prevInFlow);
		match.registerObject("prevNode", prevNode);
		match.registerObject("eg", eg);
		match.registerObject("process", process);
		match.registerObject("sf1", sf1);
		match.registerObject("task", task);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode,
			ExclusiveGateway eg, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, GW2S pn2cs, Flow flow, ChoiceStep choiceStep, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		// Create unbound variables
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("prevInFlow", prevInFlow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pn2cs", pn2cs);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("choiceStep", choiceStep);
		isApplicableMatch.registerObject("eg", eg);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("sf1", sf1);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject prevInFlow, EObject prevNode, EObject pn2cs,
			EObject step, EObject flow, EObject choiceStep, EObject eg, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		ruleresult.registerObject("prevInFlow", prevInFlow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("eg", eg);
		ruleresult.registerObject("t2s", t2s);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("sf1", sf1);
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
	public boolean isAppropriate_BWD(Match match, NormalStep step, Flow flow, ChoiceStep choiceStep) {
		// initial bindings
		Object[] result1_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_10_1_blackBBBBB(this, match,
				step, flow, choiceStep);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = "
					+ flow + ", " + "[choiceStep] = " + choiceStep + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_10_2_bindingAndBlackFBBBBB(this, match, step, flow, choiceStep);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", "
					+ "[choiceStep] = " + choiceStep + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_10_4_blackBBBB(match,
					step, flow, choiceStep);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow
						+ ", " + "[choiceStep] = " + choiceStep + ".");
			}
			Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_10_4_greenBBBBFF(match, step, flow, choiceStep);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_10_5_blackBBBB(match,
					step, flow, choiceStep);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow
						+ ", " + "[choiceStep] = " + choiceStep + ".");
			}
			Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_10_5_greenBBBF(match, flow, choiceStep);
			// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result5_green[3];

			// register objects to match
			Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_10_6_expressionBBBBB(this, match, step, flow,
					choiceStep);
			return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_10_7_expressionF();
		} else {
			return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_11_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SequenceFlow prevInFlow = (SequenceFlow) result1_bindingAndBlack[0];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[1];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[2];
		NormalStep step = (NormalStep) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[5];
		ExclusiveGateway eg = (ExclusiveGateway) result1_bindingAndBlack[6];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_11_1_greenBBFBFFB(prevNode,
				step, process, csp);
		FN2S t2s = (FN2S) result1_green[2];
		SequenceFlow sf1 = (SequenceFlow) result1_green[4];
		Task task = (Task) result1_green[5];

		// collect translated elements
		Object[] result2_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_11_2_blackBBBB(step, t2s,
				sf1, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[t2s] = " + t2s + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_11_2_greenFBBBB(step, t2s,
				sf1, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_11_3_blackBBBBBBBBBBBB(
				ruleresult, prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, t2s, process, sf1, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevInFlow] = " + prevInFlow + ", " + "[prevNode] = "
					+ prevNode + ", " + "[pn2cs] = " + pn2cs + ", " + "[step] = " + step + ", " + "[flow] = " + flow
					+ ", " + "[choiceStep] = " + choiceStep + ", " + "[eg] = " + eg + ", " + "[t2s] = " + t2s + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_11_3_greenBBBBBBBBBFFFFFFFFFF(ruleresult, prevNode,
				step, flow, choiceStep, t2s, process, sf1, task);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[9];
				// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result3_green[10];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[15];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[18];

		// perform postprocessing story node is empty
		// register objects
		Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_11_5_expressionBBBBBBBBBBBBB(this, ruleresult,
				prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, t2s, process, sf1, task);
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		NormalStep step = (NormalStep) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		ChoiceStep choiceStep = (ChoiceStep) result2_binding[2];
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_12_2_blackFFBBBB(step,
				flow, choiceStep, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S pn2cs = (GW2S) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : Task2StepAfterEmptyDefImpl
					.pattern_Task2StepAfterEmptyDef_12_3_blackFBBBBBFF(prevNode, pn2cs, step, flow, choiceStep)) {
				SequenceFlow prevInFlow = (SequenceFlow) result3_black[0];
				ExclusiveGateway eg = (ExclusiveGateway) result3_black[6];
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[7];
				Object[] result3_green = Task2StepAfterEmptyDefImpl
						.pattern_Task2StepAfterEmptyDef_12_3_greenBBBBBBBBFFFFFFFFFFFF(prevInFlow, prevNode, pn2cs,
								step, flow, choiceStep, eg, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result3_green[9];
				// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result3_green[15];
				// EMoflonEdge prevInFlow__eg____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge eg__prevInFlow____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge eg__prevInFlow____default = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2StepAfterEmptyDefImpl
						.pattern_Task2StepAfterEmptyDef_12_4_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevInFlow] = " + prevInFlow + ", " + "[prevNode] = " + prevNode + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", " + "[choiceStep] = "
							+ choiceStep + ", " + "[eg] = " + eg + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NormalStep step, Flow flow, ChoiceStep choiceStep) {
		match.registerObject("step", step);
		match.registerObject("flow", flow);
		match.registerObject("choiceStep", choiceStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep step, Flow flow, ChoiceStep choiceStep) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, GW2S pn2cs, NormalStep step, Flow flow, ChoiceStep choiceStep,
			ExclusiveGateway eg, de.abilov.bpmn.Process process) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", csp);
		var_task_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("prevInFlow", prevInFlow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("pn2cs", pn2cs);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("choiceStep", choiceStep);
		isApplicableMatch.registerObject("eg", eg);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject prevInFlow, EObject prevNode, EObject pn2cs,
			EObject step, EObject flow, EObject choiceStep, EObject eg, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		ruleresult.registerObject("prevInFlow", prevInFlow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("eg", eg);
		ruleresult.registerObject("t2s", t2s);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("task", task);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("step").eClass()
				.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_296(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_20_2_blackFFFB(_edge_steps)) {
			NormalStep step = (NormalStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			ChoiceStep choiceStep = (ChoiceStep) result2_black[2];
			Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_20_3_expressionFBBBBB(this, match, step, flow,
					choiceStep)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_20_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_297(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_21_2_blackFFFB(_edge_next)) {
			NormalStep step = (NormalStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			ChoiceStep choiceStep = (ChoiceStep) result2_black[2];
			Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_21_3_expressionFBBBBB(this, match, step, flow,
					choiceStep)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_21_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_963(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_22_2_blackFFFFFFB(_edge_flowElements)) {
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_22_3_expressionFBBBBBBBB(this, match,
					prevInFlow, prevNode, eg, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_22_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_964(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_23_2_blackFFFFFFB(_edge_flowElements)) {
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_23_3_expressionFBBBBBBBB(this, match,
					prevInFlow, prevNode, eg, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_23_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_965(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_24_2_blackFFFFFFB(_edge_targetRef)) {
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_24_3_expressionFBBBBBBBB(this, match,
					prevInFlow, prevNode, eg, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_24_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_966(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_25_2_blackFFFFFFB(_edge_incoming)) {
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_25_3_expressionFBBBBBBBB(this, match,
					prevInFlow, prevNode, eg, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_25_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_967(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_26_2_blackFFFFFFB(_edge_sourceRef)) {
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_26_3_expressionFBBBBBBBB(this, match,
					prevInFlow, prevNode, eg, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_26_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_968(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterEmptyDefImpl
				.pattern_Task2StepAfterEmptyDef_27_2_blackFFFFFFB(_edge_outgoing)) {
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_27_3_expressionFBBBBBBBB(this, match,
					prevInFlow, prevNode, eg, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterEmptyDefImpl
							.pattern_Task2StepAfterEmptyDef_27_5_blackBBB(match, __performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterEmptyDefImpl.pattern_Task2StepAfterEmptyDef_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Task2StepAfterEmptyDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevInFlow")).findAny();
		de.abilov.bpmn.SequenceFlow prevInFlow = (de.abilov.bpmn.SequenceFlow) matchForPrevInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pn2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		de.abilov.useCase.ChoiceStep choiceStep = (de.abilov.useCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg")).findAny();
		de.abilov.bpmn.ExclusiveGateway eg = (de.abilov.bpmn.ExclusiveGateway) matchForEg.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S t2s = (de.abilov.tgg.bpmn2useCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		de.abilov.bpmn.Task task = (de.abilov.bpmn.Task) matchForTask.get().getNode();

		if (!(prevNode.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(eg.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("Task2StepAfterEmptyDef");
		eq0.solve(var_task_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_step_id.setBound(false);
			eq0.solve(var_task_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
		ruleResult.setRule("Task2StepAfterEmptyDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevInFlow")).findAny();
		de.abilov.bpmn.SequenceFlow prevInFlow = (de.abilov.bpmn.SequenceFlow) matchForPrevInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pn2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		de.abilov.useCase.ChoiceStep choiceStep = (de.abilov.useCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg")).findAny();
		de.abilov.bpmn.ExclusiveGateway eg = (de.abilov.bpmn.ExclusiveGateway) matchForEg.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S t2s = (de.abilov.tgg.bpmn2useCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		de.abilov.bpmn.Task task = (de.abilov.bpmn.Task) matchForTask.get().getNode();

		if (!(prevNode.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(eg.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("Task2StepAfterEmptyDef");
		eq0.solve(var_task_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_task_id.setBound(false);
			eq0.solve(var_task_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(Task) arguments.get(6));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(Task) arguments.get(6));
			return null;
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(Task) arguments.get(6));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_GW2S_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (GW2S) arguments.get(3), (Flow) arguments.get(4),
					(ChoiceStep) arguments.get(5), (ExclusiveGateway) arguments.get(6),
					(de.abilov.bpmn.Process) arguments.get(7), (SequenceFlow) arguments.get(8),
					(Task) arguments.get(9));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(ChoiceStep) arguments.get(3));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(ChoiceStep) arguments.get(3));
			return null;
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(Flow) arguments.get(2), (ChoiceStep) arguments.get(3));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_GW2S_NORMALSTEP_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (GW2S) arguments.get(3), (NormalStep) arguments.get(4),
					(Flow) arguments.get(5), (ChoiceStep) arguments.get(6), (ExclusiveGateway) arguments.get(7),
					(de.abilov.bpmn.Process) arguments.get(8));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_296__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_296((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_297__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_297((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_963__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_963((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_964__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_964((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_965__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_965((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_966__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_966((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_967__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_967((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_968__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_968((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_0_1_blackBBBBBBBB(Task2StepAfterEmptyDef _this,
			Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		if (!prevInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				return new Object[] { _this, match, prevInFlow, prevNode, eg, process, sf1, task };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_0_2_bindingFBBBBBBBB(Task2StepAfterEmptyDef _this,
			Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevInFlow, prevNode, eg, process, sf1, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevInFlow, prevNode, eg, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_0_2_bindingAndBlackFBBBBBBBB(
			Task2StepAfterEmptyDef _this, Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode,
			ExclusiveGateway eg, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		Object[] result_pattern_Task2StepAfterEmptyDef_0_2_binding = pattern_Task2StepAfterEmptyDef_0_2_bindingFBBBBBBBB(
				_this, match, prevInFlow, prevNode, eg, process, sf1, task);
		if (result_pattern_Task2StepAfterEmptyDef_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepAfterEmptyDef_0_2_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_0_2_black = pattern_Task2StepAfterEmptyDef_0_2_blackB(csp);
			if (result_pattern_Task2StepAfterEmptyDef_0_2_black != null) {

				return new Object[] { csp, _this, match, prevInFlow, prevNode, eg, process, sf1, task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_0_3_expressionFBB(Task2StepAfterEmptyDef _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_0_4_blackBBBBBBB(Match match, SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, ExclusiveGateway eg, de.abilov.bpmn.Process process, SequenceFlow sf1,
			Task task) {
		if (!prevInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				return new Object[] { match, prevInFlow, prevNode, eg, process, sf1, task };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_0_4_greenBBBBBFFFFFF(Match match,
			ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(task);
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		match.getToBeTranslatedEdges().add(process__task____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getToBeTranslatedEdges().add(process__sf1____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		match.getToBeTranslatedEdges().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		match.getToBeTranslatedEdges().add(task__sf1____incoming);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { match, prevNode, process, sf1, task, process__task____flowElements,
				process__sf1____flowElements, sf1__task____targetRef, task__sf1____incoming, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_0_5_blackBBBBBBB(Match match, SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, ExclusiveGateway eg, de.abilov.bpmn.Process process, SequenceFlow sf1,
			Task task) {
		if (!prevInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				return new Object[] { match, prevInFlow, prevNode, eg, process, sf1, task };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_0_5_greenBBBBBFFFFFF(Match match,
			SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg, de.abilov.bpmn.Process process) {
		EMoflonEdge prevInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__prevInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__eg____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__prevInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__prevInFlow____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(prevInFlow);
		match.getContextNodes().add(prevNode);
		match.getContextNodes().add(eg);
		match.getContextNodes().add(process);
		String prevInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__prevInFlow____incoming_name_prime = "incoming";
		String prevInFlow__eg____sourceRef_name_prime = "sourceRef";
		String eg__prevInFlow____outgoing_name_prime = "outgoing";
		String eg__prevInFlow____default_name_prime = "default";
		String process__prevNode____flowElements_name_prime = "flowElements";
		prevInFlow__prevNode____targetRef.setSrc(prevInFlow);
		prevInFlow__prevNode____targetRef.setTrg(prevNode);
		match.getContextEdges().add(prevInFlow__prevNode____targetRef);
		prevNode__prevInFlow____incoming.setSrc(prevNode);
		prevNode__prevInFlow____incoming.setTrg(prevInFlow);
		match.getContextEdges().add(prevNode__prevInFlow____incoming);
		prevInFlow__eg____sourceRef.setSrc(prevInFlow);
		prevInFlow__eg____sourceRef.setTrg(eg);
		match.getContextEdges().add(prevInFlow__eg____sourceRef);
		eg__prevInFlow____outgoing.setSrc(eg);
		eg__prevInFlow____outgoing.setTrg(prevInFlow);
		match.getContextEdges().add(eg__prevInFlow____outgoing);
		eg__prevInFlow____default.setSrc(eg);
		eg__prevInFlow____default.setTrg(prevInFlow);
		match.getContextEdges().add(eg__prevInFlow____default);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		match.getContextEdges().add(process__prevNode____flowElements);
		prevInFlow__prevNode____targetRef.setName(prevInFlow__prevNode____targetRef_name_prime);
		prevNode__prevInFlow____incoming.setName(prevNode__prevInFlow____incoming_name_prime);
		prevInFlow__eg____sourceRef.setName(prevInFlow__eg____sourceRef_name_prime);
		eg__prevInFlow____outgoing.setName(eg__prevInFlow____outgoing_name_prime);
		eg__prevInFlow____default.setName(eg__prevInFlow____default_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { match, prevInFlow, prevNode, eg, process, prevInFlow__prevNode____targetRef,
				prevNode__prevInFlow____incoming, prevInFlow__eg____sourceRef, eg__prevInFlow____outgoing,
				eg__prevInFlow____default, process__prevNode____flowElements };
	}

	public static final void pattern_Task2StepAfterEmptyDef_0_6_expressionBBBBBBBB(Task2StepAfterEmptyDef _this,
			Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		_this.registerObjectsToMatch_FWD(match, prevInFlow, prevNode, eg, process, sf1, task);

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevInFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_5 = isApplicableMatch.getObject("eg");
		EObject _localVariable_6 = isApplicableMatch.getObject("process");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_8 = isApplicableMatch.getObject("task");
		EObject tmpPrevInFlow = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpPn2cs = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpChoiceStep = _localVariable_4;
		EObject tmpEg = _localVariable_5;
		EObject tmpProcess = _localVariable_6;
		EObject tmpSf1 = _localVariable_7;
		EObject tmpTask = _localVariable_8;
		if (tmpPrevInFlow instanceof SequenceFlow) {
			SequenceFlow prevInFlow = (SequenceFlow) tmpPrevInFlow;
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (tmpPn2cs instanceof GW2S) {
					GW2S pn2cs = (GW2S) tmpPn2cs;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpChoiceStep instanceof ChoiceStep) {
							ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
							if (tmpEg instanceof ExclusiveGateway) {
								ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
								if (tmpProcess instanceof de.abilov.bpmn.Process) {
									de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
									if (tmpSf1 instanceof SequenceFlow) {
										SequenceFlow sf1 = (SequenceFlow) tmpSf1;
										if (tmpTask instanceof Task) {
											Task task = (Task) tmpTask;
											return new Object[] { prevInFlow, prevNode, pn2cs, flow, choiceStep, eg,
													process, sf1, task, isApplicableMatch };
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_1_1_blackBBBBBBBBBBFB(SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, GW2S pn2cs, Flow flow, ChoiceStep choiceStep, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task, Task2StepAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch) {
		if (!prevInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { prevInFlow, prevNode, pn2cs, flow, choiceStep, eg, process, sf1, task,
								_this, csp, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_1_1_bindingAndBlackFFFFFFFFFBFB(
			Task2StepAfterEmptyDef _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2StepAfterEmptyDef_1_1_binding = pattern_Task2StepAfterEmptyDef_1_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2StepAfterEmptyDef_1_1_binding != null) {
			SequenceFlow prevInFlow = (SequenceFlow) result_pattern_Task2StepAfterEmptyDef_1_1_binding[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_Task2StepAfterEmptyDef_1_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_Task2StepAfterEmptyDef_1_1_binding[2];
			Flow flow = (Flow) result_pattern_Task2StepAfterEmptyDef_1_1_binding[3];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_Task2StepAfterEmptyDef_1_1_binding[4];
			ExclusiveGateway eg = (ExclusiveGateway) result_pattern_Task2StepAfterEmptyDef_1_1_binding[5];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_Task2StepAfterEmptyDef_1_1_binding[6];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2StepAfterEmptyDef_1_1_binding[7];
			Task task = (Task) result_pattern_Task2StepAfterEmptyDef_1_1_binding[8];

			Object[] result_pattern_Task2StepAfterEmptyDef_1_1_black = pattern_Task2StepAfterEmptyDef_1_1_blackBBBBBBBBBBFB(
					prevInFlow, prevNode, pn2cs, flow, choiceStep, eg, process, sf1, task, _this, isApplicableMatch);
			if (result_pattern_Task2StepAfterEmptyDef_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2StepAfterEmptyDef_1_1_black[10];

				return new Object[] { prevInFlow, prevNode, pn2cs, flow, choiceStep, eg, process, sf1, task, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_1_1_greenFBBFBB(Flow flow, ChoiceStep choiceStep,
			Task task, CSP csp) {
		NormalStep step = UseCaseFactory.eINSTANCE.createNormalStep();
		FN2S t2s = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		flow.getSteps().add(step);
		choiceStep.setNext(step);
		t2s.setTarget(step);
		t2s.setSource(task);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { step, flow, choiceStep, t2s, task, csp };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_1_2_blackBBBB(NormalStep step, FN2S t2s,
			SequenceFlow sf1, Task task) {
		return new Object[] { step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_1_2_greenFBBBB(NormalStep step, FN2S t2s,
			SequenceFlow sf1, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(task);
		return new Object[] { ruleresult, step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_1_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevInFlow, EObject prevNode, EObject pn2cs, EObject step, EObject flow, EObject choiceStep,
			EObject eg, EObject t2s, EObject process, EObject sf1, EObject task) {
		if (!prevInFlow.equals(prevNode)) {
			if (!prevInFlow.equals(step)) {
				if (!prevInFlow.equals(t2s)) {
					if (!prevInFlow.equals(process)) {
						if (!prevInFlow.equals(sf1)) {
							if (!prevInFlow.equals(task)) {
								if (!prevNode.equals(step)) {
									if (!prevNode.equals(t2s)) {
										if (!prevNode.equals(process)) {
											if (!prevNode.equals(sf1)) {
												if (!prevNode.equals(task)) {
													if (!pn2cs.equals(prevInFlow)) {
														if (!pn2cs.equals(prevNode)) {
															if (!pn2cs.equals(step)) {
																if (!pn2cs.equals(t2s)) {
																	if (!pn2cs.equals(process)) {
																		if (!pn2cs.equals(sf1)) {
																			if (!pn2cs.equals(task)) {
																				if (!step.equals(t2s)) {
																					if (!step.equals(task)) {
																						if (!flow.equals(prevInFlow)) {
																							if (!flow
																									.equals(prevNode)) {
																								if (!flow.equals(
																										pn2cs)) {
																									if (!flow.equals(
																											step)) {
																										if (!flow
																												.equals(t2s)) {
																											if (!flow
																													.equals(process)) {
																												if (!flow
																														.equals(sf1)) {
																													if (!flow
																															.equals(task)) {
																														if (!choiceStep
																																.equals(prevInFlow)) {
																															if (!choiceStep
																																	.equals(prevNode)) {
																																if (!choiceStep
																																		.equals(pn2cs)) {
																																	if (!choiceStep
																																			.equals(step)) {
																																		if (!choiceStep
																																				.equals(flow)) {
																																			if (!choiceStep
																																					.equals(eg)) {
																																				if (!choiceStep
																																						.equals(t2s)) {
																																					if (!choiceStep
																																							.equals(process)) {
																																						if (!choiceStep
																																								.equals(sf1)) {
																																							if (!choiceStep
																																									.equals(task)) {
																																								if (!eg.equals(
																																										prevInFlow)) {
																																									if (!eg.equals(
																																											prevNode)) {
																																										if (!eg.equals(
																																												pn2cs)) {
																																											if (!eg.equals(
																																													step)) {
																																												if (!eg.equals(
																																														flow)) {
																																													if (!eg.equals(
																																															t2s)) {
																																														if (!eg.equals(
																																																process)) {
																																															if (!eg.equals(
																																																	sf1)) {
																																																if (!eg.equals(
																																																		task)) {
																																																	if (!t2s.equals(
																																																			task)) {
																																																		if (!process
																																																				.equals(step)) {
																																																			if (!process
																																																					.equals(t2s)) {
																																																				if (!process
																																																						.equals(sf1)) {
																																																					if (!process
																																																							.equals(task)) {
																																																						if (!sf1.equals(
																																																								step)) {
																																																							if (!sf1.equals(
																																																									t2s)) {
																																																								if (!sf1.equals(
																																																										task)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											prevInFlow,
																																																											prevNode,
																																																											pn2cs,
																																																											step,
																																																											flow,
																																																											choiceStep,
																																																											eg,
																																																											t2s,
																																																											process,
																																																											sf1,
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_1_3_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject step, EObject flow, EObject choiceStep, EObject t2s,
			EObject process, EObject sf1, EObject task) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2StepAfterEmptyDef";
		String flow__step____steps_name_prime = "steps";
		String choiceStep__step____next_name_prime = "next";
		String t2s__step____target_name_prime = "target";
		String t2s__task____source_name_prime = "source";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(choiceStep__step____next);
		t2s__step____target.setSrc(t2s);
		t2s__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(t2s__step____target);
		t2s__task____source.setSrc(t2s);
		t2s__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(t2s__task____source);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getTranslatedEdges().add(process__task____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		ruleresult.getTranslatedEdges().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(task__sf1____incoming);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { ruleresult, prevNode, step, flow, choiceStep, t2s, process, sf1, task,
				flow__step____steps, choiceStep__step____next, t2s__step____target, t2s__task____source,
				process__task____flowElements, process__sf1____flowElements, sf1__task____targetRef,
				task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final void pattern_Task2StepAfterEmptyDef_1_5_expressionBBBBBBBBBBBBB(Task2StepAfterEmptyDef _this,
			PerformRuleResult ruleresult, EObject prevInFlow, EObject prevNode, EObject pn2cs, EObject step,
			EObject flow, EObject choiceStep, EObject eg, EObject t2s, EObject process, EObject sf1, EObject task) {
		_this.registerObjects_FWD(ruleresult, prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, t2s, process,
				sf1, task);

	}

	public static final PerformRuleResult pattern_Task2StepAfterEmptyDef_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_1_blackFBB(EClass eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_2_1_binding = pattern_Task2StepAfterEmptyDef_2_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_2_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_2_1_black = pattern_Task2StepAfterEmptyDef_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2StepAfterEmptyDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_2_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevInFlow");
		EObject _localVariable_1 = match.getObject("prevNode");
		EObject _localVariable_2 = match.getObject("eg");
		EObject _localVariable_3 = match.getObject("process");
		EObject _localVariable_4 = match.getObject("sf1");
		EObject _localVariable_5 = match.getObject("task");
		EObject tmpPrevInFlow = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpEg = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpTask = _localVariable_5;
		if (tmpPrevInFlow instanceof SequenceFlow) {
			SequenceFlow prevInFlow = (SequenceFlow) tmpPrevInFlow;
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (tmpEg instanceof ExclusiveGateway) {
					ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
					if (tmpProcess instanceof de.abilov.bpmn.Process) {
						de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpTask instanceof Task) {
								Task task = (Task) tmpTask;
								return new Object[] { prevInFlow, prevNode, eg, process, sf1, task, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_2_2_blackBBFFBBBBB(SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, ExclusiveGateway eg, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				boolean prevNodeisDiverging = prevNode.isIsDiverging();
				if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
					boolean egisDiverging = eg.isIsDiverging();
					if (Boolean.valueOf(egisDiverging).equals(Boolean.valueOf(true))) {
						for (GW2S pn2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode,
								GW2S.class, "source")) {
							Step tmpChoiceStep = pn2cs.getTarget();
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								_result.add(new Object[] { prevInFlow, prevNode, pn2cs, choiceStep, eg, process, sf1,
										task, match });
							}

						}
					}

				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_2_3_blackBBBFBBBBB(SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, GW2S pn2cs, ChoiceStep choiceStep, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				if (prevNode.equals(prevInFlow.getTargetRef())) {
					if (prevNode.equals(pn2cs.getSource())) {
						if (choiceStep.equals(pn2cs.getTarget())) {
							if (eg.equals(prevInFlow.getSourceRef())) {
								if (prevInFlow.equals(eg.getDefault())) {
									if (process.getFlowElements().contains(task)) {
										if (process.getFlowElements().contains(sf1)) {
											if (process.getFlowElements().contains(prevNode)) {
												if (task.equals(sf1.getTargetRef())) {
													if (prevNode.equals(sf1.getSourceRef())) {
														boolean prevNodeisDiverging = prevNode.isIsDiverging();
														if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
															boolean egisDiverging = eg.isIsDiverging();
															if (Boolean.valueOf(egisDiverging)
																	.equals(Boolean.valueOf(true))) {
																for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(choiceStep,
																				Flow.class, "steps")) {
																	_result.add(new Object[] { prevInFlow, prevNode,
																			pn2cs, flow, choiceStep, eg, process, sf1,
																			task });
																}
															}

														}

													}
												}
											}
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_3_greenBBBBBBBBBFFFFFFFFFFFFFFFF(
			SequenceFlow prevInFlow, ExclusiveGateway prevNode, GW2S pn2cs, Flow flow, ChoiceStep choiceStep,
			ExclusiveGateway eg, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge prevInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__prevInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__eg____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__prevInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__prevInFlow____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String prevInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__prevInFlow____incoming_name_prime = "incoming";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String flow__choiceStep____steps_name_prime = "steps";
		String prevInFlow__eg____sourceRef_name_prime = "sourceRef";
		String eg__prevInFlow____outgoing_name_prime = "outgoing";
		String eg__prevInFlow____default_name_prime = "default";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(choiceStep);
		isApplicableMatch.getAllContextElements().add(eg);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(task);
		prevInFlow__prevNode____targetRef.setSrc(prevInFlow);
		prevInFlow__prevNode____targetRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(prevInFlow__prevNode____targetRef);
		prevNode__prevInFlow____incoming.setSrc(prevNode);
		prevNode__prevInFlow____incoming.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevNode__prevInFlow____incoming);
		pn2cs__prevNode____source.setSrc(pn2cs);
		pn2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs__prevNode____source);
		pn2cs__choiceStep____target.setSrc(pn2cs);
		pn2cs__choiceStep____target.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs__choiceStep____target);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(flow__choiceStep____steps);
		prevInFlow__eg____sourceRef.setSrc(prevInFlow);
		prevInFlow__eg____sourceRef.setTrg(eg);
		isApplicableMatch.getAllContextElements().add(prevInFlow__eg____sourceRef);
		eg__prevInFlow____outgoing.setSrc(eg);
		eg__prevInFlow____outgoing.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(eg__prevInFlow____outgoing);
		eg__prevInFlow____default.setSrc(eg);
		eg__prevInFlow____default.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(eg__prevInFlow____default);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		isApplicableMatch.getAllContextElements().add(process__task____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		isApplicableMatch.getAllContextElements().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(task__sf1____incoming);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		prevInFlow__prevNode____targetRef.setName(prevInFlow__prevNode____targetRef_name_prime);
		prevNode__prevInFlow____incoming.setName(prevNode__prevInFlow____incoming_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		prevInFlow__eg____sourceRef.setName(prevInFlow__eg____sourceRef_name_prime);
		eg__prevInFlow____outgoing.setName(eg__prevInFlow____outgoing_name_prime);
		eg__prevInFlow____default.setName(eg__prevInFlow____default_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { prevInFlow, prevNode, pn2cs, flow, choiceStep, eg, process, sf1, task, isApplicableMatch,
				prevInFlow__prevNode____targetRef, prevNode__prevInFlow____incoming, pn2cs__prevNode____source,
				pn2cs__choiceStep____target, flow__choiceStep____steps, prevInFlow__eg____sourceRef,
				eg__prevInFlow____outgoing, eg__prevInFlow____default, process__task____flowElements,
				process__sf1____flowElements, process__prevNode____flowElements, sf1__task____targetRef,
				task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_4_bindingFBBBBBBBBBBB(Task2StepAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow prevInFlow, ExclusiveGateway prevNode, GW2S pn2cs,
			Flow flow, ChoiceStep choiceStep, ExclusiveGateway eg, de.abilov.bpmn.Process process, SequenceFlow sf1,
			Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevInFlow, prevNode, pn2cs, flow,
				choiceStep, eg, process, sf1, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevInFlow, prevNode, pn2cs, flow, choiceStep, eg,
					process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_4_bindingAndBlackFBBBBBBBBBBB(
			Task2StepAfterEmptyDef _this, IsApplicableMatch isApplicableMatch, SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, GW2S pn2cs, Flow flow, ChoiceStep choiceStep, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		Object[] result_pattern_Task2StepAfterEmptyDef_2_4_binding = pattern_Task2StepAfterEmptyDef_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, prevInFlow, prevNode, pn2cs, flow, choiceStep, eg, process, sf1, task);
		if (result_pattern_Task2StepAfterEmptyDef_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepAfterEmptyDef_2_4_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_2_4_black = pattern_Task2StepAfterEmptyDef_2_4_blackB(csp);
			if (result_pattern_Task2StepAfterEmptyDef_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevInFlow, prevNode, pn2cs, flow, choiceStep, eg,
						process, sf1, task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_2_5_expressionFBB(Task2StepAfterEmptyDef _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2StepAfterEmptyDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2StepAfterEmptyDef_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_10_1_blackBBBBB(Task2StepAfterEmptyDef _this,
			Match match, NormalStep step, Flow flow, ChoiceStep choiceStep) {
		return new Object[] { _this, match, step, flow, choiceStep };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_10_2_bindingFBBBBB(Task2StepAfterEmptyDef _this,
			Match match, NormalStep step, Flow flow, ChoiceStep choiceStep) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, step, flow, choiceStep);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, flow, choiceStep };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_10_2_bindingAndBlackFBBBBB(Task2StepAfterEmptyDef _this,
			Match match, NormalStep step, Flow flow, ChoiceStep choiceStep) {
		Object[] result_pattern_Task2StepAfterEmptyDef_10_2_binding = pattern_Task2StepAfterEmptyDef_10_2_bindingFBBBBB(
				_this, match, step, flow, choiceStep);
		if (result_pattern_Task2StepAfterEmptyDef_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepAfterEmptyDef_10_2_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_10_2_black = pattern_Task2StepAfterEmptyDef_10_2_blackB(csp);
			if (result_pattern_Task2StepAfterEmptyDef_10_2_black != null) {

				return new Object[] { csp, _this, match, step, flow, choiceStep };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_10_3_expressionFBB(Task2StepAfterEmptyDef _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_10_4_blackBBBB(Match match, NormalStep step, Flow flow,
			ChoiceStep choiceStep) {
		return new Object[] { match, step, flow, choiceStep };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_10_4_greenBBBBFF(Match match, NormalStep step,
			Flow flow, ChoiceStep choiceStep) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		String choiceStep__step____next_name_prime = "next";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		match.getToBeTranslatedEdges().add(choiceStep__step____next);
		flow__step____steps.setName(flow__step____steps_name_prime);
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
		return new Object[] { match, step, flow, choiceStep, flow__step____steps, choiceStep__step____next };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_10_5_blackBBBB(Match match, NormalStep step, Flow flow,
			ChoiceStep choiceStep) {
		return new Object[] { match, step, flow, choiceStep };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_10_5_greenBBBF(Match match, Flow flow,
			ChoiceStep choiceStep) {
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(flow);
		match.getContextNodes().add(choiceStep);
		String flow__choiceStep____steps_name_prime = "steps";
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		match.getContextEdges().add(flow__choiceStep____steps);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		return new Object[] { match, flow, choiceStep, flow__choiceStep____steps };
	}

	public static final void pattern_Task2StepAfterEmptyDef_10_6_expressionBBBBB(Task2StepAfterEmptyDef _this,
			Match match, NormalStep step, Flow flow, ChoiceStep choiceStep) {
		_this.registerObjectsToMatch_BWD(match, step, flow, choiceStep);

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevInFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("step");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_6 = isApplicableMatch.getObject("eg");
		EObject _localVariable_7 = isApplicableMatch.getObject("process");
		EObject tmpPrevInFlow = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpPn2cs = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpChoiceStep = _localVariable_5;
		EObject tmpEg = _localVariable_6;
		EObject tmpProcess = _localVariable_7;
		if (tmpPrevInFlow instanceof SequenceFlow) {
			SequenceFlow prevInFlow = (SequenceFlow) tmpPrevInFlow;
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (tmpPn2cs instanceof GW2S) {
					GW2S pn2cs = (GW2S) tmpPn2cs;
					if (tmpStep instanceof NormalStep) {
						NormalStep step = (NormalStep) tmpStep;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								if (tmpEg instanceof ExclusiveGateway) {
									ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
									if (tmpProcess instanceof de.abilov.bpmn.Process) {
										de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
										return new Object[] { prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg,
												process, isApplicableMatch };
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_11_1_blackBBBBBBBBBFB(SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, GW2S pn2cs, NormalStep step, Flow flow, ChoiceStep choiceStep,
			ExclusiveGateway eg, de.abilov.bpmn.Process process, Task2StepAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch) {
		if (!eg.equals(prevNode)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, process, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_11_1_bindingAndBlackFFFFFFFFBFB(
			Task2StepAfterEmptyDef _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2StepAfterEmptyDef_11_1_binding = pattern_Task2StepAfterEmptyDef_11_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2StepAfterEmptyDef_11_1_binding != null) {
			SequenceFlow prevInFlow = (SequenceFlow) result_pattern_Task2StepAfterEmptyDef_11_1_binding[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_Task2StepAfterEmptyDef_11_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_Task2StepAfterEmptyDef_11_1_binding[2];
			NormalStep step = (NormalStep) result_pattern_Task2StepAfterEmptyDef_11_1_binding[3];
			Flow flow = (Flow) result_pattern_Task2StepAfterEmptyDef_11_1_binding[4];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_Task2StepAfterEmptyDef_11_1_binding[5];
			ExclusiveGateway eg = (ExclusiveGateway) result_pattern_Task2StepAfterEmptyDef_11_1_binding[6];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_Task2StepAfterEmptyDef_11_1_binding[7];

			Object[] result_pattern_Task2StepAfterEmptyDef_11_1_black = pattern_Task2StepAfterEmptyDef_11_1_blackBBBBBBBBBFB(
					prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, process, _this, isApplicableMatch);
			if (result_pattern_Task2StepAfterEmptyDef_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2StepAfterEmptyDef_11_1_black[9];

				return new Object[] { prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, process, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_11_1_greenBBFBFFB(ExclusiveGateway prevNode,
			NormalStep step, de.abilov.bpmn.Process process, CSP csp) {
		FN2S t2s = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		Task task = BpmnFactory.eINSTANCE.createTask();
		Object _localVariable_0 = csp.getValue("task", "id");
		t2s.setTarget(step);
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		t2s.setSource(task);
		process.getFlowElements().add(task);
		sf1.setTargetRef(task);
		String task_id_prime = (String) _localVariable_0;
		task.setId(task_id_prime);
		return new Object[] { prevNode, step, t2s, process, sf1, task, csp };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_11_2_blackBBBB(NormalStep step, FN2S t2s,
			SequenceFlow sf1, Task task) {
		return new Object[] { step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_11_2_greenFBBBB(NormalStep step, FN2S t2s,
			SequenceFlow sf1, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getCreatedElements().add(task);
		return new Object[] { ruleresult, step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_11_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevInFlow, EObject prevNode, EObject pn2cs, EObject step, EObject flow, EObject choiceStep,
			EObject eg, EObject t2s, EObject process, EObject sf1, EObject task) {
		if (!prevInFlow.equals(prevNode)) {
			if (!prevInFlow.equals(step)) {
				if (!prevInFlow.equals(t2s)) {
					if (!prevInFlow.equals(process)) {
						if (!prevInFlow.equals(sf1)) {
							if (!prevInFlow.equals(task)) {
								if (!prevNode.equals(step)) {
									if (!prevNode.equals(t2s)) {
										if (!prevNode.equals(process)) {
											if (!prevNode.equals(sf1)) {
												if (!prevNode.equals(task)) {
													if (!pn2cs.equals(prevInFlow)) {
														if (!pn2cs.equals(prevNode)) {
															if (!pn2cs.equals(step)) {
																if (!pn2cs.equals(t2s)) {
																	if (!pn2cs.equals(process)) {
																		if (!pn2cs.equals(sf1)) {
																			if (!pn2cs.equals(task)) {
																				if (!step.equals(t2s)) {
																					if (!step.equals(task)) {
																						if (!flow.equals(prevInFlow)) {
																							if (!flow
																									.equals(prevNode)) {
																								if (!flow.equals(
																										pn2cs)) {
																									if (!flow.equals(
																											step)) {
																										if (!flow
																												.equals(t2s)) {
																											if (!flow
																													.equals(process)) {
																												if (!flow
																														.equals(sf1)) {
																													if (!flow
																															.equals(task)) {
																														if (!choiceStep
																																.equals(prevInFlow)) {
																															if (!choiceStep
																																	.equals(prevNode)) {
																																if (!choiceStep
																																		.equals(pn2cs)) {
																																	if (!choiceStep
																																			.equals(step)) {
																																		if (!choiceStep
																																				.equals(flow)) {
																																			if (!choiceStep
																																					.equals(eg)) {
																																				if (!choiceStep
																																						.equals(t2s)) {
																																					if (!choiceStep
																																							.equals(process)) {
																																						if (!choiceStep
																																								.equals(sf1)) {
																																							if (!choiceStep
																																									.equals(task)) {
																																								if (!eg.equals(
																																										prevInFlow)) {
																																									if (!eg.equals(
																																											prevNode)) {
																																										if (!eg.equals(
																																												pn2cs)) {
																																											if (!eg.equals(
																																													step)) {
																																												if (!eg.equals(
																																														flow)) {
																																													if (!eg.equals(
																																															t2s)) {
																																														if (!eg.equals(
																																																process)) {
																																															if (!eg.equals(
																																																	sf1)) {
																																																if (!eg.equals(
																																																		task)) {
																																																	if (!t2s.equals(
																																																			task)) {
																																																		if (!process
																																																				.equals(step)) {
																																																			if (!process
																																																					.equals(t2s)) {
																																																				if (!process
																																																						.equals(sf1)) {
																																																					if (!process
																																																							.equals(task)) {
																																																						if (!sf1.equals(
																																																								step)) {
																																																							if (!sf1.equals(
																																																									t2s)) {
																																																								if (!sf1.equals(
																																																										task)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											prevInFlow,
																																																											prevNode,
																																																											pn2cs,
																																																											step,
																																																											flow,
																																																											choiceStep,
																																																											eg,
																																																											t2s,
																																																											process,
																																																											sf1,
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_11_3_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject step, EObject flow, EObject choiceStep, EObject t2s,
			EObject process, EObject sf1, EObject task) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2StepAfterEmptyDef";
		String flow__step____steps_name_prime = "steps";
		String choiceStep__step____next_name_prime = "next";
		String t2s__step____target_name_prime = "target";
		String t2s__task____source_name_prime = "source";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(choiceStep__step____next);
		t2s__step____target.setSrc(t2s);
		t2s__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(t2s__step____target);
		t2s__task____source.setSrc(t2s);
		t2s__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(t2s__task____source);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getCreatedEdges().add(process__task____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		ruleresult.getCreatedEdges().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		ruleresult.getCreatedEdges().add(task__sf1____incoming);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { ruleresult, prevNode, step, flow, choiceStep, t2s, process, sf1, task,
				flow__step____steps, choiceStep__step____next, t2s__step____target, t2s__task____source,
				process__task____flowElements, process__sf1____flowElements, sf1__task____targetRef,
				task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final void pattern_Task2StepAfterEmptyDef_11_5_expressionBBBBBBBBBBBBB(Task2StepAfterEmptyDef _this,
			PerformRuleResult ruleresult, EObject prevInFlow, EObject prevNode, EObject pn2cs, EObject step,
			EObject flow, EObject choiceStep, EObject eg, EObject t2s, EObject process, EObject sf1, EObject task) {
		_this.registerObjects_BWD(ruleresult, prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, t2s, process,
				sf1, task);

	}

	public static final PerformRuleResult pattern_Task2StepAfterEmptyDef_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_1_blackFBB(EClass eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_12_1_binding = pattern_Task2StepAfterEmptyDef_12_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_12_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_12_1_black = pattern_Task2StepAfterEmptyDef_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2StepAfterEmptyDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("choiceStep");
		EObject tmpStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpChoiceStep = _localVariable_2;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpChoiceStep instanceof ChoiceStep) {
					ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
					return new Object[] { step, flow, choiceStep, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_12_2_blackFFBBBB(NormalStep step, Flow flow,
			ChoiceStep choiceStep, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (GW2S pn2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(choiceStep, GW2S.class,
				"target")) {
			Gateway tmpPrevNode = pn2cs.getSource();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				boolean prevNodeisDiverging = prevNode.isIsDiverging();
				if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
					_result.add(new Object[] { prevNode, pn2cs, step, flow, choiceStep, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_12_3_blackFBBBBBFF(ExclusiveGateway prevNode,
			GW2S pn2cs, NormalStep step, Flow flow, ChoiceStep choiceStep) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(pn2cs.getSource())) {
			if (choiceStep.equals(pn2cs.getTarget())) {
				if (flow.getSteps().contains(step)) {
					if (flow.getSteps().contains(choiceStep)) {
						if (step.equals(choiceStep.getNext())) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
								for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
									FlowNode tmpEg = prevInFlow.getSourceRef();
									if (tmpEg instanceof ExclusiveGateway) {
										ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
										if (!eg.equals(prevNode)) {
											if (prevInFlow.equals(eg.getDefault())) {
												boolean egisDiverging = eg.isIsDiverging();
												if (Boolean.valueOf(egisDiverging).equals(Boolean.valueOf(true))) {
													for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(prevNode,
																	de.abilov.bpmn.Process.class, "flowElements")) {
														_result.add(new Object[] { prevInFlow, prevNode, pn2cs, step,
																flow, choiceStep, eg, process });
													}
												}

											}
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_3_greenBBBBBBBBFFFFFFFFFFFF(SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, GW2S pn2cs, NormalStep step, Flow flow, ChoiceStep choiceStep,
			ExclusiveGateway eg, de.abilov.bpmn.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge prevInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__prevInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__eg____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__prevInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__prevInFlow____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String prevInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__prevInFlow____incoming_name_prime = "incoming";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String flow__choiceStep____steps_name_prime = "steps";
		String choiceStep__step____next_name_prime = "next";
		String prevInFlow__eg____sourceRef_name_prime = "sourceRef";
		String eg__prevInFlow____outgoing_name_prime = "outgoing";
		String eg__prevInFlow____default_name_prime = "default";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(choiceStep);
		isApplicableMatch.getAllContextElements().add(eg);
		isApplicableMatch.getAllContextElements().add(process);
		prevInFlow__prevNode____targetRef.setSrc(prevInFlow);
		prevInFlow__prevNode____targetRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(prevInFlow__prevNode____targetRef);
		prevNode__prevInFlow____incoming.setSrc(prevNode);
		prevNode__prevInFlow____incoming.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevNode__prevInFlow____incoming);
		pn2cs__prevNode____source.setSrc(pn2cs);
		pn2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs__prevNode____source);
		pn2cs__choiceStep____target.setSrc(pn2cs);
		pn2cs__choiceStep____target.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs__choiceStep____target);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(flow__choiceStep____steps);
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(choiceStep__step____next);
		prevInFlow__eg____sourceRef.setSrc(prevInFlow);
		prevInFlow__eg____sourceRef.setTrg(eg);
		isApplicableMatch.getAllContextElements().add(prevInFlow__eg____sourceRef);
		eg__prevInFlow____outgoing.setSrc(eg);
		eg__prevInFlow____outgoing.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(eg__prevInFlow____outgoing);
		eg__prevInFlow____default.setSrc(eg);
		eg__prevInFlow____default.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(eg__prevInFlow____default);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		prevInFlow__prevNode____targetRef.setName(prevInFlow__prevNode____targetRef_name_prime);
		prevNode__prevInFlow____incoming.setName(prevNode__prevInFlow____incoming_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
		prevInFlow__eg____sourceRef.setName(prevInFlow__eg____sourceRef_name_prime);
		eg__prevInFlow____outgoing.setName(eg__prevInFlow____outgoing_name_prime);
		eg__prevInFlow____default.setName(eg__prevInFlow____default_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, process, isApplicableMatch,
				prevInFlow__prevNode____targetRef, prevNode__prevInFlow____incoming, pn2cs__prevNode____source,
				pn2cs__choiceStep____target, flow__step____steps, flow__choiceStep____steps, choiceStep__step____next,
				prevInFlow__eg____sourceRef, eg__prevInFlow____outgoing, eg__prevInFlow____default,
				process__prevNode____flowElements };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_4_bindingFBBBBBBBBBB(Task2StepAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow prevInFlow, ExclusiveGateway prevNode, GW2S pn2cs,
			NormalStep step, Flow flow, ChoiceStep choiceStep, ExclusiveGateway eg, de.abilov.bpmn.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, prevInFlow, prevNode, pn2cs, step,
				flow, choiceStep, eg, process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevInFlow, prevNode, pn2cs, step, flow, choiceStep,
					eg, process };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_4_bindingAndBlackFBBBBBBBBBB(
			Task2StepAfterEmptyDef _this, IsApplicableMatch isApplicableMatch, SequenceFlow prevInFlow,
			ExclusiveGateway prevNode, GW2S pn2cs, NormalStep step, Flow flow, ChoiceStep choiceStep,
			ExclusiveGateway eg, de.abilov.bpmn.Process process) {
		Object[] result_pattern_Task2StepAfterEmptyDef_12_4_binding = pattern_Task2StepAfterEmptyDef_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, prevInFlow, prevNode, pn2cs, step, flow, choiceStep, eg, process);
		if (result_pattern_Task2StepAfterEmptyDef_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepAfterEmptyDef_12_4_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_12_4_black = pattern_Task2StepAfterEmptyDef_12_4_blackB(csp);
			if (result_pattern_Task2StepAfterEmptyDef_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevInFlow, prevNode, pn2cs, step, flow,
						choiceStep, eg, process };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_12_5_expressionFBB(Task2StepAfterEmptyDef _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2StepAfterEmptyDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2StepAfterEmptyDef_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_20_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_20_1_blackFBB(EClass __eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_20_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_20_1_binding = pattern_Task2StepAfterEmptyDef_20_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_20_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_20_1_black = pattern_Task2StepAfterEmptyDef_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_20_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_467327 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_467327)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_20_2_black_nac_1BB(NormalStep step,
			ChoiceStep choiceStep) {
		for (Step __DEC_step_next_115910 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_115910)) {
				if (!choiceStep.equals(__DEC_step_next_115910)) {
					return new Object[] { step, choiceStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_20_2_blackFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_Task2StepAfterEmptyDef_20_2_black_nac_0BB(step, flow) == null) {
						for (Step tmpChoiceStep : flow.getSteps()) {
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								if (step.equals(choiceStep.getNext())) {
									if (pattern_Task2StepAfterEmptyDef_20_2_black_nac_1BB(step, choiceStep) == null) {
										_result.add(new Object[] { step, flow, choiceStep, _edge_steps });
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_20_3_expressionFBBBBB(Task2StepAfterEmptyDef _this,
			Match match, NormalStep step, Flow flow, ChoiceStep choiceStep) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, flow, choiceStep);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_20_4_expressionFBB(Task2StepAfterEmptyDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterEmptyDef_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_21_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_21_1_blackFBB(EClass __eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_21_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_21_1_binding = pattern_Task2StepAfterEmptyDef_21_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_21_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_21_1_black = pattern_Task2StepAfterEmptyDef_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_21_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_286178 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_286178)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_21_2_black_nac_1BB(NormalStep step,
			ChoiceStep choiceStep) {
		for (Step __DEC_step_next_303384 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_303384)) {
				if (!choiceStep.equals(__DEC_step_next_303384)) {
					return new Object[] { step, choiceStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_21_2_blackFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpChoiceStep = _edge_next.getSrc();
		if (tmpChoiceStep instanceof ChoiceStep) {
			ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (step.equals(choiceStep.getNext())) {
					if (pattern_Task2StepAfterEmptyDef_21_2_black_nac_1BB(step, choiceStep) == null) {
						for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(choiceStep,
								Flow.class, "steps")) {
							if (flow.getSteps().contains(step)) {
								if (pattern_Task2StepAfterEmptyDef_21_2_black_nac_0BB(step, flow) == null) {
									_result.add(new Object[] { step, flow, choiceStep, _edge_next });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_21_3_expressionFBBBBB(Task2StepAfterEmptyDef _this,
			Match match, NormalStep step, Flow flow, ChoiceStep choiceStep) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, flow, choiceStep);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_21_4_expressionFBB(Task2StepAfterEmptyDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterEmptyDef_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_1_blackFBB(EClass __eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_22_1_binding = pattern_Task2StepAfterEmptyDef_22_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_22_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_22_1_black = pattern_Task2StepAfterEmptyDef_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway eg) {
		if (!eg.equals(prevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_666064 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_666064)) {
					if (!eg.equals(__DEC_sf1_default_666064)) {
						return new Object[] { sf1, prevNode, eg };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_406817 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_406817)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_252091 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_252091)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_2_black_nac_4BB(ExclusiveGateway eg,
			SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_22_2_blackFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (process.getFlowElements().contains(task)) {
					if (pattern_Task2StepAfterEmptyDef_22_2_black_nac_2BB(task, process) == null) {
						for (FlowElement tmpSf1 : process.getFlowElements()) {
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (task.equals(sf1.getTargetRef())) {
									FlowNode tmpPrevNode = sf1.getSourceRef();
									if (tmpPrevNode instanceof ExclusiveGateway) {
										ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
										if (process.getFlowElements().contains(prevNode)) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
												if (pattern_Task2StepAfterEmptyDef_22_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_Task2StepAfterEmptyDef_22_2_black_nac_3BB(prevNode,
															sf1) == null) {
														for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
															if (!prevInFlow.equals(sf1)) {
																FlowNode tmpEg = prevInFlow.getSourceRef();
																if (tmpEg instanceof ExclusiveGateway) {
																	ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																	if (!eg.equals(prevNode)) {
																		if (prevInFlow.equals(eg.getDefault())) {
																			boolean egisDiverging = eg.isIsDiverging();
																			if (Boolean.valueOf(egisDiverging)
																					.equals(Boolean.valueOf(true))) {
																				if (pattern_Task2StepAfterEmptyDef_22_2_black_nac_0BBB(
																						sf1, prevNode, eg) == null) {
																					if (pattern_Task2StepAfterEmptyDef_22_2_black_nac_4BB(
																							eg, sf1) == null) {
																						_result.add(new Object[] {
																								prevInFlow, prevNode,
																								eg, process, sf1, task,
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

		}

		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_22_3_expressionFBBBBBBBB(Task2StepAfterEmptyDef _this,
			Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevInFlow, prevNode, eg, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_22_4_expressionFBB(Task2StepAfterEmptyDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterEmptyDef_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_1_blackFBB(EClass __eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_23_1_binding = pattern_Task2StepAfterEmptyDef_23_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_23_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_23_1_black = pattern_Task2StepAfterEmptyDef_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway eg) {
		if (!eg.equals(prevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_72610 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_72610)) {
					if (!eg.equals(__DEC_sf1_default_72610)) {
						return new Object[] { sf1, prevNode, eg };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_259632 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_259632)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_985485 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_985485)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_2_black_nac_4BB(ExclusiveGateway eg,
			SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_23_2_blackFFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode tmpTask = sf1.getTargetRef();
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						if (process.getFlowElements().contains(task)) {
							FlowNode tmpPrevNode = sf1.getSourceRef();
							if (tmpPrevNode instanceof ExclusiveGateway) {
								ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
								if (process.getFlowElements().contains(prevNode)) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
										if (pattern_Task2StepAfterEmptyDef_23_2_black_nac_1BB(sf1, process) == null) {
											if (pattern_Task2StepAfterEmptyDef_23_2_black_nac_2BB(task,
													process) == null) {
												if (pattern_Task2StepAfterEmptyDef_23_2_black_nac_3BB(prevNode,
														sf1) == null) {
													for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
														if (!prevInFlow.equals(sf1)) {
															FlowNode tmpEg = prevInFlow.getSourceRef();
															if (tmpEg instanceof ExclusiveGateway) {
																ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																if (!eg.equals(prevNode)) {
																	if (prevInFlow.equals(eg.getDefault())) {
																		boolean egisDiverging = eg.isIsDiverging();
																		if (Boolean.valueOf(egisDiverging)
																				.equals(Boolean.valueOf(true))) {
																			if (pattern_Task2StepAfterEmptyDef_23_2_black_nac_0BBB(
																					sf1, prevNode, eg) == null) {
																				if (pattern_Task2StepAfterEmptyDef_23_2_black_nac_4BB(
																						eg, sf1) == null) {
																					_result.add(new Object[] {
																							prevInFlow, prevNode, eg,
																							process, sf1, task,
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_23_3_expressionFBBBBBBBB(Task2StepAfterEmptyDef _this,
			Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevInFlow, prevNode, eg, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_23_4_expressionFBB(Task2StepAfterEmptyDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_23_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterEmptyDef_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_1_blackFBB(EClass __eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_24_1_binding = pattern_Task2StepAfterEmptyDef_24_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_24_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_24_1_black = pattern_Task2StepAfterEmptyDef_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway eg) {
		if (!eg.equals(prevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_528533 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_528533)) {
					if (!eg.equals(__DEC_sf1_default_528533)) {
						return new Object[] { sf1, prevNode, eg };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_905365 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_905365)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_120996 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_120996)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_2_black_nac_4BB(ExclusiveGateway eg,
			SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_24_2_blackFFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpTask = _edge_targetRef.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (task.equals(sf1.getTargetRef())) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
							if (pattern_Task2StepAfterEmptyDef_24_2_black_nac_3BB(prevNode, sf1) == null) {
								for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
									if (!prevInFlow.equals(sf1)) {
										FlowNode tmpEg = prevInFlow.getSourceRef();
										if (tmpEg instanceof ExclusiveGateway) {
											ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
											if (!eg.equals(prevNode)) {
												if (prevInFlow.equals(eg.getDefault())) {
													boolean egisDiverging = eg.isIsDiverging();
													if (Boolean.valueOf(egisDiverging).equals(Boolean.valueOf(true))) {
														if (pattern_Task2StepAfterEmptyDef_24_2_black_nac_0BBB(sf1,
																prevNode, eg) == null) {
															if (pattern_Task2StepAfterEmptyDef_24_2_black_nac_4BB(eg,
																	sf1) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(sf1,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(task)) {
																		if (process.getFlowElements()
																				.contains(prevNode)) {
																			if (pattern_Task2StepAfterEmptyDef_24_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_Task2StepAfterEmptyDef_24_2_black_nac_2BB(
																						task, process) == null) {
																					_result.add(new Object[] {
																							prevInFlow, prevNode, eg,
																							process, sf1, task,
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_24_3_expressionFBBBBBBBB(Task2StepAfterEmptyDef _this,
			Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevInFlow, prevNode, eg, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_24_4_expressionFBB(Task2StepAfterEmptyDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_24_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterEmptyDef_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_1_blackFBB(EClass __eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_25_1_binding = pattern_Task2StepAfterEmptyDef_25_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_25_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_25_1_black = pattern_Task2StepAfterEmptyDef_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway eg) {
		if (!eg.equals(prevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_463694 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_463694)) {
					if (!eg.equals(__DEC_sf1_default_463694)) {
						return new Object[] { sf1, prevNode, eg };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_423888 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_423888)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_584544 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_584544)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_2_black_nac_4BB(ExclusiveGateway eg,
			SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_25_2_blackFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_incoming.getSrc();
		if (tmpTask instanceof Task) {
			Task task = (Task) tmpTask;
			EObject tmpSf1 = _edge_incoming.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (task.equals(sf1.getTargetRef())) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
							if (pattern_Task2StepAfterEmptyDef_25_2_black_nac_3BB(prevNode, sf1) == null) {
								for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
									if (!prevInFlow.equals(sf1)) {
										FlowNode tmpEg = prevInFlow.getSourceRef();
										if (tmpEg instanceof ExclusiveGateway) {
											ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
											if (!eg.equals(prevNode)) {
												if (prevInFlow.equals(eg.getDefault())) {
													boolean egisDiverging = eg.isIsDiverging();
													if (Boolean.valueOf(egisDiverging).equals(Boolean.valueOf(true))) {
														if (pattern_Task2StepAfterEmptyDef_25_2_black_nac_0BBB(sf1,
																prevNode, eg) == null) {
															if (pattern_Task2StepAfterEmptyDef_25_2_black_nac_4BB(eg,
																	sf1) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(task,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(sf1)) {
																		if (process.getFlowElements()
																				.contains(prevNode)) {
																			if (pattern_Task2StepAfterEmptyDef_25_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_Task2StepAfterEmptyDef_25_2_black_nac_2BB(
																						task, process) == null) {
																					_result.add(new Object[] {
																							prevInFlow, prevNode, eg,
																							process, sf1, task,
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_25_3_expressionFBBBBBBBB(Task2StepAfterEmptyDef _this,
			Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevInFlow, prevNode, eg, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_25_4_expressionFBB(Task2StepAfterEmptyDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_25_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterEmptyDef_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_1_blackFBB(EClass __eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_26_1_binding = pattern_Task2StepAfterEmptyDef_26_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_26_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_26_1_black = pattern_Task2StepAfterEmptyDef_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway eg) {
		if (!eg.equals(prevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_410700 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_410700)) {
					if (!eg.equals(__DEC_sf1_default_410700)) {
						return new Object[] { sf1, prevNode, eg };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_217951 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_217951)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_578464 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_578464)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_2_black_nac_4BB(ExclusiveGateway eg,
			SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_26_2_blackFFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					FlowNode tmpTask = sf1.getTargetRef();
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
							if (pattern_Task2StepAfterEmptyDef_26_2_black_nac_3BB(prevNode, sf1) == null) {
								for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
									if (!prevInFlow.equals(sf1)) {
										FlowNode tmpEg = prevInFlow.getSourceRef();
										if (tmpEg instanceof ExclusiveGateway) {
											ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
											if (!eg.equals(prevNode)) {
												if (prevInFlow.equals(eg.getDefault())) {
													boolean egisDiverging = eg.isIsDiverging();
													if (Boolean.valueOf(egisDiverging).equals(Boolean.valueOf(true))) {
														if (pattern_Task2StepAfterEmptyDef_26_2_black_nac_0BBB(sf1,
																prevNode, eg) == null) {
															if (pattern_Task2StepAfterEmptyDef_26_2_black_nac_4BB(eg,
																	sf1) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(sf1,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(task)) {
																		if (process.getFlowElements()
																				.contains(prevNode)) {
																			if (pattern_Task2StepAfterEmptyDef_26_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_Task2StepAfterEmptyDef_26_2_black_nac_2BB(
																						task, process) == null) {
																					_result.add(new Object[] {
																							prevInFlow, prevNode, eg,
																							process, sf1, task,
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_26_3_expressionFBBBBBBBB(Task2StepAfterEmptyDef _this,
			Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevInFlow, prevNode, eg, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_26_4_expressionFBB(Task2StepAfterEmptyDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_26_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterEmptyDef_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_1_bindingFB(Task2StepAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_1_blackFBB(EClass __eClass,
			Task2StepAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_1_bindingAndBlackFFB(Task2StepAfterEmptyDef _this) {
		Object[] result_pattern_Task2StepAfterEmptyDef_27_1_binding = pattern_Task2StepAfterEmptyDef_27_1_bindingFB(
				_this);
		if (result_pattern_Task2StepAfterEmptyDef_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterEmptyDef_27_1_binding[0];

			Object[] result_pattern_Task2StepAfterEmptyDef_27_1_black = pattern_Task2StepAfterEmptyDef_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterEmptyDef_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterEmptyDef_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway eg) {
		if (!eg.equals(prevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_188024 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_188024)) {
					if (!eg.equals(__DEC_sf1_default_188024)) {
						return new Object[] { sf1, prevNode, eg };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_859405 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_859405)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_539390 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_539390)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_2_black_nac_4BB(ExclusiveGateway eg,
			SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterEmptyDef_27_2_blackFFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
						FlowNode tmpTask = sf1.getTargetRef();
						if (tmpTask instanceof Task) {
							Task task = (Task) tmpTask;
							if (pattern_Task2StepAfterEmptyDef_27_2_black_nac_3BB(prevNode, sf1) == null) {
								for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
									if (!prevInFlow.equals(sf1)) {
										FlowNode tmpEg = prevInFlow.getSourceRef();
										if (tmpEg instanceof ExclusiveGateway) {
											ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
											if (!eg.equals(prevNode)) {
												if (prevInFlow.equals(eg.getDefault())) {
													boolean egisDiverging = eg.isIsDiverging();
													if (Boolean.valueOf(egisDiverging).equals(Boolean.valueOf(true))) {
														if (pattern_Task2StepAfterEmptyDef_27_2_black_nac_0BBB(sf1,
																prevNode, eg) == null) {
															if (pattern_Task2StepAfterEmptyDef_27_2_black_nac_4BB(eg,
																	sf1) == null) {
																for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(prevNode,
																				de.abilov.bpmn.Process.class,
																				"flowElements")) {
																	if (process.getFlowElements().contains(task)) {
																		if (process.getFlowElements().contains(sf1)) {
																			if (pattern_Task2StepAfterEmptyDef_27_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_Task2StepAfterEmptyDef_27_2_black_nac_2BB(
																						task, process) == null) {
																					_result.add(new Object[] {
																							prevInFlow, prevNode, eg,
																							process, sf1, task,
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

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterEmptyDef_27_3_expressionFBBBBBBBB(Task2StepAfterEmptyDef _this,
			Match match, SequenceFlow prevInFlow, ExclusiveGateway prevNode, ExclusiveGateway eg,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevInFlow, prevNode, eg, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterEmptyDef_27_4_expressionFBB(Task2StepAfterEmptyDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterEmptyDef_27_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterEmptyDef_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Task2StepAfterEmptyDefImpl
