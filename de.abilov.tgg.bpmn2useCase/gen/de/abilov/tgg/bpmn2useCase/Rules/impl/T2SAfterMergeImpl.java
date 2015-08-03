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
import de.abilov.tgg.bpmn2useCase.Rules.T2SAfterMerge;

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
 * An implementation of the model object '<em><b>T2S After Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class T2SAfterMergeImpl extends AbstractRuleImpl implements T2SAfterMerge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T2SAfterMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getT2SAfterMerge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		// initial bindings
		Object[] result1_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_0_1_blackBBBBBBBB(this, match, prevNode,
				prevInFlow, prevPrevNode, process, sf1, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_0_2_bindingAndBlackFBBBBBBBB(this,
				match, prevNode, prevInFlow, prevPrevNode, process, sf1, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[prevInFlow] = "
					+ prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", " + "[process] = " + process + ", "
					+ "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (T2SAfterMergeImpl.pattern_T2SAfterMerge_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_0_4_blackBBBBBBB(match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
			}
			T2SAfterMergeImpl.pattern_T2SAfterMerge_0_4_greenBBBBBFFFFFF(match, prevNode, process, sf1, task);
			// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result4_green[7];
			// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result4_green[8];
			// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[9];
			// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_0_5_blackBBBBBBB(match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
			}
			T2SAfterMergeImpl.pattern_T2SAfterMerge_0_5_greenBBBBBFFFFF(match, prevNode, prevInFlow, prevPrevNode,
					process);
					// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result5_green[5];
					// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result5_green[6];
					// EMoflonEdge prevInFlow__prevPrevNode____sourceRef = (EMoflonEdge) result5_green[7];
					// EMoflonEdge prevPrevNode__prevInFlow____outgoing = (EMoflonEdge) result5_green[8];
					// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[9];

			// register objects to match
			T2SAfterMergeImpl.pattern_T2SAfterMerge_0_6_expressionBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, task);
			return T2SAfterMergeImpl.pattern_T2SAfterMerge_0_7_expressionF();
		} else {
			return T2SAfterMergeImpl.pattern_T2SAfterMerge_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl
				.pattern_T2SAfterMerge_1_1_bindingAndBlackFFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		SequenceFlow prevInFlow = (SequenceFlow) result1_bindingAndBlack[5];
		FlowNode prevPrevNode = (FlowNode) result1_bindingAndBlack[6];
		FN2S fn2ps = (FN2S) result1_bindingAndBlack[7];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[8];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[9];
		Task task = (Task) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[12];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_1_1_greenBBFFBB(prevStep, flow, task, csp);
		NormalStep step = (NormalStep) result1_green[2];
		FN2S t2s = (FN2S) result1_green[3];

		// collect translated elements
		Object[] result2_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_1_2_blackBBBB(step, t2s, sf1, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[t2s] = " + t2s + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_1_2_greenFBBBB(step, t2s, sf1, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_1_3_blackBBBBBBBBBBBBBB(ruleresult, prevNode,
				choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, t2s, process, sf1, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
					+ flow + ", " + "[step] = " + step + ", " + "[prevInFlow] = " + prevInFlow + ", "
					+ "[prevPrevNode] = " + prevPrevNode + ", " + "[fn2ps] = " + fn2ps + ", " + "[t2s] = " + t2s + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		T2SAfterMergeImpl.pattern_T2SAfterMerge_1_3_greenBBBBBBBBBFFFFFFFFFF(ruleresult, prevNode, prevStep, flow, step,
				t2s, process, sf1, task);
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[10];
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
		T2SAfterMergeImpl.pattern_T2SAfterMerge_1_5_expressionBBBBBBBBBBBBBBB(this, ruleresult, prevNode, choiceStep,
				pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, t2s, process, sf1, task);
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = T2SAfterMergeImpl.pattern_T2SAfterMerge_2_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[0];
		SequenceFlow prevInFlow = (SequenceFlow) result2_binding[1];
		FlowNode prevPrevNode = (FlowNode) result2_binding[2];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		Task task = (Task) result2_binding[5];
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_2_2_blackBFFFBBFBBBB(prevNode, prevInFlow,
				prevPrevNode, process, sf1, task, match)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[1];
			GW2S pn2cs = (GW2S) result2_black[2];
			Step prevStep = (Step) result2_black[3];
			FN2S fn2ps = (FN2S) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_2_3_blackBBBBFBBBBBB(prevNode,
					choiceStep, pn2cs, prevStep, prevInFlow, prevPrevNode, fn2ps, process, sf1, task)) {
				Flow flow = (Flow) result3_black[4];
				Object[] result3_green = T2SAfterMergeImpl
						.pattern_T2SAfterMerge_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(prevNode, choiceStep, pn2cs,
								prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				// EMoflonEdge choiceStep__prevStep______lastInDef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result3_green[18];
				// EMoflonEdge prevInFlow__prevPrevNode____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevPrevNode__prevInFlow____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge fn2ps__prevPrevNode____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge fn2ps__prevStep____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[23];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[24];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[25];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[26];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[27];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[28];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[29];

				// solve CSP
				Object[] result4_bindingAndBlack = T2SAfterMergeImpl
						.pattern_T2SAfterMerge_2_4_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch, prevNode,
								choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", "
							+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", "
							+ "[fn2ps] = " + fn2ps + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", "
							+ "[task] = " + task + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		match.registerObject("prevNode", prevNode);
		match.registerObject("prevInFlow", prevInFlow);
		match.registerObject("prevPrevNode", prevPrevNode);
		match.registerObject("process", process);
		match.registerObject("sf1", sf1);
		match.registerObject("task", task);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode,
			FN2S fn2ps, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {// Create CSP
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
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("choiceStep", choiceStep);
		isApplicableMatch.registerObject("pn2cs", pn2cs);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevInFlow", prevInFlow);
		isApplicableMatch.registerObject("prevPrevNode", prevPrevNode);
		isApplicableMatch.registerObject("fn2ps", fn2ps);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs,
			EObject prevStep, EObject flow, EObject step, EObject prevInFlow, EObject prevPrevNode, EObject fn2ps,
			EObject t2s, EObject process, EObject sf1, EObject task) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("prevInFlow", prevInFlow);
		ruleresult.registerObject("prevPrevNode", prevPrevNode);
		ruleresult.registerObject("fn2ps", fn2ps);
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
	public boolean isAppropriate_BWD(Match match, ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		// initial bindings
		Object[] result1_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_10_1_blackBBBBBB(this, match, choiceStep,
				prevStep, flow, step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
					+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_10_2_bindingAndBlackFBBBBBB(this,
				match, choiceStep, prevStep, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
					+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (T2SAfterMergeImpl.pattern_T2SAfterMerge_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_10_4_blackBBBBB(match, choiceStep,
					prevStep, flow, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			T2SAfterMergeImpl.pattern_T2SAfterMerge_10_4_greenBBBBFF(match, prevStep, flow, step);
			// EMoflonEdge prevStep__step____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_10_5_blackBBBBB(match, choiceStep,
					prevStep, flow, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			T2SAfterMergeImpl.pattern_T2SAfterMerge_10_5_greenBBBBFFF(match, choiceStep, prevStep, flow);
			// EMoflonEdge choiceStep__prevStep______lastInDef = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result5_green[5];
			// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result5_green[6];

			// register objects to match
			T2SAfterMergeImpl.pattern_T2SAfterMerge_10_6_expressionBBBBBB(this, match, choiceStep, prevStep, flow,
					step);
			return T2SAfterMergeImpl.pattern_T2SAfterMerge_10_7_expressionF();
		} else {
			return T2SAfterMergeImpl.pattern_T2SAfterMerge_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl
				.pattern_T2SAfterMerge_11_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		NormalStep step = (NormalStep) result1_bindingAndBlack[5];
		SequenceFlow prevInFlow = (SequenceFlow) result1_bindingAndBlack[6];
		FlowNode prevPrevNode = (FlowNode) result1_bindingAndBlack[7];
		FN2S fn2ps = (FN2S) result1_bindingAndBlack[8];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_11_1_greenBBFBFFB(prevNode, step, process,
				csp);
		FN2S t2s = (FN2S) result1_green[2];
		SequenceFlow sf1 = (SequenceFlow) result1_green[4];
		Task task = (Task) result1_green[5];

		// collect translated elements
		Object[] result2_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_11_2_blackBBBB(step, t2s, sf1, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[t2s] = " + t2s + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_11_2_greenFBBBB(step, t2s, sf1, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_11_3_blackBBBBBBBBBBBBBB(ruleresult, prevNode,
				choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, t2s, process, sf1, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
					+ flow + ", " + "[step] = " + step + ", " + "[prevInFlow] = " + prevInFlow + ", "
					+ "[prevPrevNode] = " + prevPrevNode + ", " + "[fn2ps] = " + fn2ps + ", " + "[t2s] = " + t2s + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		T2SAfterMergeImpl.pattern_T2SAfterMerge_11_3_greenBBBBBBBBBFFFFFFFFFF(ruleresult, prevNode, prevStep, flow,
				step, t2s, process, sf1, task);
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[10];
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
		T2SAfterMergeImpl.pattern_T2SAfterMerge_11_5_expressionBBBBBBBBBBBBBBB(this, ruleresult, prevNode, choiceStep,
				pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, t2s, process, sf1, task);
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = T2SAfterMergeImpl.pattern_T2SAfterMerge_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep choiceStep = (ChoiceStep) result2_binding[0];
		Step prevStep = (Step) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		NormalStep step = (NormalStep) result2_binding[3];
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_12_2_blackFBFBBBFFB(choiceStep, prevStep,
				flow, step, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S pn2cs = (GW2S) result2_black[2];
			FlowNode prevPrevNode = (FlowNode) result2_black[6];
			FN2S fn2ps = (FN2S) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_12_3_blackBBBBBBFBBF(prevNode,
					choiceStep, pn2cs, prevStep, flow, step, prevPrevNode, fn2ps)) {
				SequenceFlow prevInFlow = (SequenceFlow) result3_black[6];
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[9];
				Object[] result3_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
						prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge choiceStep__prevStep______lastInDef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevInFlow__prevPrevNode____sourceRef = (EMoflonEdge) result3_green[20];
				// EMoflonEdge prevPrevNode__prevInFlow____outgoing = (EMoflonEdge) result3_green[21];
				// EMoflonEdge fn2ps__prevPrevNode____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge fn2ps__prevStep____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[24];

				// solve CSP
				Object[] result4_bindingAndBlack = T2SAfterMergeImpl
						.pattern_T2SAfterMerge_12_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, prevNode,
								choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = "
							+ step + ", " + "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode
							+ ", " + "[fn2ps] = " + fn2ps + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ChoiceStep choiceStep, Step prevStep, Flow flow,
			NormalStep step) {
		match.registerObject("choiceStep", choiceStep);
		match.registerObject("prevStep", prevStep);
		match.registerObject("flow", flow);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ChoiceStep choiceStep, Step prevStep, Flow flow,
			NormalStep step) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("choiceStep", choiceStep);
		isApplicableMatch.registerObject("pn2cs", pn2cs);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("prevInFlow", prevInFlow);
		isApplicableMatch.registerObject("prevPrevNode", prevPrevNode);
		isApplicableMatch.registerObject("fn2ps", fn2ps);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs,
			EObject prevStep, EObject flow, EObject step, EObject prevInFlow, EObject prevPrevNode, EObject fn2ps,
			EObject t2s, EObject process, EObject sf1, EObject task) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("prevInFlow", prevInFlow);
		ruleresult.registerObject("prevPrevNode", prevPrevNode);
		ruleresult.registerObject("fn2ps", fn2ps);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_140(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_20_2_blackFFFFB(_edge_next)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			NormalStep step = (NormalStep) result2_black[3];
			Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterMergeImpl.pattern_T2SAfterMerge_20_3_expressionFBBBBBB(this, match, choiceStep, prevStep, flow,
					step)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_141(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_21_2_blackFFFFB(_edge_steps)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			NormalStep step = (NormalStep) result2_black[3];
			Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterMergeImpl.pattern_T2SAfterMerge_21_3_expressionFBBBBBB(this, match, choiceStep, prevStep, flow,
					step)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_460(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_22_2_blackFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterMergeImpl.pattern_T2SAfterMerge_22_3_expressionFBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_461(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_23_2_blackFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterMergeImpl.pattern_T2SAfterMerge_23_3_expressionFBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_462(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_24_2_blackFFFFFFB(_edge_targetRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterMergeImpl.pattern_T2SAfterMerge_24_3_expressionFBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_463(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_25_2_blackFFFFFFB(_edge_incoming)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterMergeImpl.pattern_T2SAfterMerge_25_3_expressionFBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_464(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_26_2_blackFFFFFFB(_edge_sourceRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterMergeImpl.pattern_T2SAfterMerge_26_3_expressionFBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_465(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterMergeImpl.pattern_T2SAfterMerge_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterMergeImpl.pattern_T2SAfterMerge_27_2_blackFFFFFFB(_edge_outgoing)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			Task task = (Task) result2_black[5];
			Object[] result2_green = T2SAfterMergeImpl.pattern_T2SAfterMerge_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterMergeImpl.pattern_T2SAfterMerge_27_3_expressionFBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterMergeImpl.pattern_T2SAfterMerge_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterMergeImpl.pattern_T2SAfterMerge_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterMergeImpl.pattern_T2SAfterMerge_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterMergeImpl.pattern_T2SAfterMerge_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("T2SAfterMerge");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		de.abilov.useCase.ChoiceStep choiceStep = (de.abilov.useCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pn2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		de.abilov.useCase.Step prevStep = (de.abilov.useCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevInFlow")).findAny();
		de.abilov.bpmn.SequenceFlow prevInFlow = (de.abilov.bpmn.SequenceFlow) matchForPrevInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevPrevNode")).findAny();
		de.abilov.bpmn.FlowNode prevPrevNode = (de.abilov.bpmn.FlowNode) matchForPrevPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("fn2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S fn2ps = (de.abilov.tgg.bpmn2useCase.FN2S) matchForFn2ps.get().getNode();

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

		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("T2SAfterMerge");
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
		ruleResult.setRule("T2SAfterMerge");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		de.abilov.useCase.ChoiceStep choiceStep = (de.abilov.useCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pn2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		de.abilov.useCase.Step prevStep = (de.abilov.useCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevInFlow")).findAny();
		de.abilov.bpmn.SequenceFlow prevInFlow = (de.abilov.bpmn.SequenceFlow) matchForPrevInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevPrevNode")).findAny();
		de.abilov.bpmn.FlowNode prevPrevNode = (de.abilov.bpmn.FlowNode) matchForPrevPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("fn2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S fn2ps = (de.abilov.tgg.bpmn2useCase.FN2S) matchForFn2ps.get().getNode();

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

		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("T2SAfterMerge");
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
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (FlowNode) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(Task) arguments.get(6));
		case RulesPackage.T2S_AFTER_MERGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (FlowNode) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(Task) arguments.get(6));
			return null;
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (FlowNode) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(Task) arguments.get(6));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS_SEQUENCEFLOW_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (Step) arguments.get(4),
					(Flow) arguments.get(5), (SequenceFlow) arguments.get(6), (FlowNode) arguments.get(7),
					(FN2S) arguments.get(8), (de.abilov.bpmn.Process) arguments.get(9),
					(SequenceFlow) arguments.get(10), (Task) arguments.get(11));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.T2S_AFTER_MERGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1), (Step) arguments.get(2),
					(Flow) arguments.get(3), (NormalStep) arguments.get(4));
		case RulesPackage.T2S_AFTER_MERGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1), (Step) arguments.get(2),
					(Flow) arguments.get(3), (NormalStep) arguments.get(4));
			return null;
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3), (NormalStep) arguments.get(4));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_NORMALSTEP_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (Step) arguments.get(4),
					(Flow) arguments.get(5), (NormalStep) arguments.get(6), (SequenceFlow) arguments.get(7),
					(FlowNode) arguments.get(8), (FN2S) arguments.get(9), (de.abilov.bpmn.Process) arguments.get(10));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.T2S_AFTER_MERGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_140__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_140((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_141__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_141((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_460__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_460((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_461__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_461((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_462__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_462((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_463__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_463((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_464__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_464((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_465__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_465((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.T2S_AFTER_MERGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_T2SAfterMerge_0_1_blackBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!prevPrevNode.equals(task)) {
					return new Object[] { _this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, task };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_0_2_bindingFBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1,
				task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterMerge_0_2_bindingAndBlackFBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		Object[] result_pattern_T2SAfterMerge_0_2_binding = pattern_T2SAfterMerge_0_2_bindingFBBBBBBBB(_this, match,
				prevNode, prevInFlow, prevPrevNode, process, sf1, task);
		if (result_pattern_T2SAfterMerge_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterMerge_0_2_binding[0];

			Object[] result_pattern_T2SAfterMerge_0_2_black = pattern_T2SAfterMerge_0_2_blackB(csp);
			if (result_pattern_T2SAfterMerge_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, task };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterMerge_0_3_expressionFBB(T2SAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_0_4_blackBBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			Task task) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!prevPrevNode.equals(task)) {
					return new Object[] { match, prevNode, prevInFlow, prevPrevNode, process, sf1, task };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_0_4_greenBBBBBFFFFFF(Match match, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
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

	public static final Object[] pattern_T2SAfterMerge_0_5_blackBBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			Task task) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!prevPrevNode.equals(task)) {
					return new Object[] { match, prevNode, prevInFlow, prevPrevNode, process, sf1, task };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_0_5_greenBBBBBFFFFF(Match match, ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process) {
		EMoflonEdge prevInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__prevInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__prevPrevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevPrevNode__prevInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(prevNode);
		match.getContextNodes().add(prevInFlow);
		match.getContextNodes().add(prevPrevNode);
		match.getContextNodes().add(process);
		String prevInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__prevInFlow____incoming_name_prime = "incoming";
		String prevInFlow__prevPrevNode____sourceRef_name_prime = "sourceRef";
		String prevPrevNode__prevInFlow____outgoing_name_prime = "outgoing";
		String process__prevNode____flowElements_name_prime = "flowElements";
		prevInFlow__prevNode____targetRef.setSrc(prevInFlow);
		prevInFlow__prevNode____targetRef.setTrg(prevNode);
		match.getContextEdges().add(prevInFlow__prevNode____targetRef);
		prevNode__prevInFlow____incoming.setSrc(prevNode);
		prevNode__prevInFlow____incoming.setTrg(prevInFlow);
		match.getContextEdges().add(prevNode__prevInFlow____incoming);
		prevInFlow__prevPrevNode____sourceRef.setSrc(prevInFlow);
		prevInFlow__prevPrevNode____sourceRef.setTrg(prevPrevNode);
		match.getContextEdges().add(prevInFlow__prevPrevNode____sourceRef);
		prevPrevNode__prevInFlow____outgoing.setSrc(prevPrevNode);
		prevPrevNode__prevInFlow____outgoing.setTrg(prevInFlow);
		match.getContextEdges().add(prevPrevNode__prevInFlow____outgoing);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		match.getContextEdges().add(process__prevNode____flowElements);
		prevInFlow__prevNode____targetRef.setName(prevInFlow__prevNode____targetRef_name_prime);
		prevNode__prevInFlow____incoming.setName(prevNode__prevInFlow____incoming_name_prime);
		prevInFlow__prevPrevNode____sourceRef.setName(prevInFlow__prevPrevNode____sourceRef_name_prime);
		prevPrevNode__prevInFlow____outgoing.setName(prevPrevNode__prevInFlow____outgoing_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { match, prevNode, prevInFlow, prevPrevNode, process, prevInFlow__prevNode____targetRef,
				prevNode__prevInFlow____incoming, prevInFlow__prevPrevNode____sourceRef,
				prevPrevNode__prevInFlow____outgoing, process__prevNode____flowElements };
	}

	public static final void pattern_T2SAfterMerge_0_6_expressionBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		_this.registerObjectsToMatch_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, task);

	}

	public static final boolean pattern_T2SAfterMerge_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_1_1_bindingFFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("prevInFlow");
		EObject _localVariable_6 = isApplicableMatch.getObject("prevPrevNode");
		EObject _localVariable_7 = isApplicableMatch.getObject("fn2ps");
		EObject _localVariable_8 = isApplicableMatch.getObject("process");
		EObject _localVariable_9 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_10 = isApplicableMatch.getObject("task");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpChoiceStep = _localVariable_1;
		EObject tmpPn2cs = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpPrevInFlow = _localVariable_5;
		EObject tmpPrevPrevNode = _localVariable_6;
		EObject tmpFn2ps = _localVariable_7;
		EObject tmpProcess = _localVariable_8;
		EObject tmpSf1 = _localVariable_9;
		EObject tmpTask = _localVariable_10;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpChoiceStep instanceof ChoiceStep) {
				ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
				if (tmpPn2cs instanceof GW2S) {
					GW2S pn2cs = (GW2S) tmpPn2cs;
					if (tmpPrevStep instanceof Step) {
						Step prevStep = (Step) tmpPrevStep;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpPrevInFlow instanceof SequenceFlow) {
								SequenceFlow prevInFlow = (SequenceFlow) tmpPrevInFlow;
								if (tmpPrevPrevNode instanceof FlowNode) {
									FlowNode prevPrevNode = (FlowNode) tmpPrevPrevNode;
									if (tmpFn2ps instanceof FN2S) {
										FN2S fn2ps = (FN2S) tmpFn2ps;
										if (tmpProcess instanceof de.abilov.bpmn.Process) {
											de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
											if (tmpSf1 instanceof SequenceFlow) {
												SequenceFlow sf1 = (SequenceFlow) tmpSf1;
												if (tmpTask instanceof Task) {
													Task task = (Task) tmpTask;
													return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow,
															prevInFlow, prevPrevNode, fn2ps, process, sf1, task,
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
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_1_1_blackBBBBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode,
			FN2S fn2ps, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task, T2SAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!choiceStep.equals(prevStep)) {
				if (!prevInFlow.equals(sf1)) {
					if (!prevPrevNode.equals(task)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow,
										prevPrevNode, fn2ps, process, sf1, task, _this, csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_1_1_bindingAndBlackFFFFFFFFFFFBFB(T2SAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_T2SAfterMerge_1_1_binding = pattern_T2SAfterMerge_1_1_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_T2SAfterMerge_1_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_T2SAfterMerge_1_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_T2SAfterMerge_1_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_T2SAfterMerge_1_1_binding[2];
			Step prevStep = (Step) result_pattern_T2SAfterMerge_1_1_binding[3];
			Flow flow = (Flow) result_pattern_T2SAfterMerge_1_1_binding[4];
			SequenceFlow prevInFlow = (SequenceFlow) result_pattern_T2SAfterMerge_1_1_binding[5];
			FlowNode prevPrevNode = (FlowNode) result_pattern_T2SAfterMerge_1_1_binding[6];
			FN2S fn2ps = (FN2S) result_pattern_T2SAfterMerge_1_1_binding[7];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_T2SAfterMerge_1_1_binding[8];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_T2SAfterMerge_1_1_binding[9];
			Task task = (Task) result_pattern_T2SAfterMerge_1_1_binding[10];

			Object[] result_pattern_T2SAfterMerge_1_1_black = pattern_T2SAfterMerge_1_1_blackBBBBBBBBBBBBFB(prevNode,
					choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, task, _this,
					isApplicableMatch);
			if (result_pattern_T2SAfterMerge_1_1_black != null) {
				CSP csp = (CSP) result_pattern_T2SAfterMerge_1_1_black[12];

				return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps,
						process, sf1, task, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_1_1_greenBBFFBB(Step prevStep, Flow flow, Task task, CSP csp) {
		NormalStep step = UseCaseFactory.eINSTANCE.createNormalStep();
		FN2S t2s = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		prevStep.setNext(step);
		flow.getSteps().add(step);
		t2s.setTarget(step);
		t2s.setSource(task);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { prevStep, flow, step, t2s, task, csp };
	}

	public static final Object[] pattern_T2SAfterMerge_1_2_blackBBBB(NormalStep step, FN2S t2s, SequenceFlow sf1,
			Task task) {
		return new Object[] { step, t2s, sf1, task };
	}

	public static final Object[] pattern_T2SAfterMerge_1_2_greenFBBBB(NormalStep step, FN2S t2s, SequenceFlow sf1,
			Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(task);
		return new Object[] { ruleresult, step, t2s, sf1, task };
	}

	public static final Object[] pattern_T2SAfterMerge_1_3_blackBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep, EObject flow, EObject step,
			EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!prevNode.equals(t2s)) {
						if (!prevNode.equals(process)) {
							if (!prevNode.equals(sf1)) {
								if (!prevNode.equals(task)) {
									if (!choiceStep.equals(prevNode)) {
										if (!choiceStep.equals(pn2cs)) {
											if (!choiceStep.equals(prevStep)) {
												if (!choiceStep.equals(flow)) {
													if (!choiceStep.equals(step)) {
														if (!choiceStep.equals(prevInFlow)) {
															if (!choiceStep.equals(prevPrevNode)) {
																if (!choiceStep.equals(fn2ps)) {
																	if (!choiceStep.equals(t2s)) {
																		if (!choiceStep.equals(process)) {
																			if (!choiceStep.equals(sf1)) {
																				if (!choiceStep.equals(task)) {
																					if (!pn2cs.equals(prevNode)) {
																						if (!pn2cs.equals(prevStep)) {
																							if (!pn2cs.equals(step)) {
																								if (!pn2cs.equals(
																										prevInFlow)) {
																									if (!pn2cs.equals(
																											prevPrevNode)) {
																										if (!pn2cs
																												.equals(t2s)) {
																											if (!pn2cs
																													.equals(process)) {
																												if (!pn2cs
																														.equals(sf1)) {
																													if (!pn2cs
																															.equals(task)) {
																														if (!prevStep
																																.equals(step)) {
																															if (!prevStep
																																	.equals(t2s)) {
																																if (!prevStep
																																		.equals(process)) {
																																	if (!prevStep
																																			.equals(sf1)) {
																																		if (!prevStep
																																				.equals(task)) {
																																			if (!flow
																																					.equals(prevNode)) {
																																				if (!flow
																																						.equals(pn2cs)) {
																																					if (!flow
																																							.equals(prevStep)) {
																																						if (!flow
																																								.equals(step)) {
																																							if (!flow
																																									.equals(prevInFlow)) {
																																								if (!flow
																																										.equals(prevPrevNode)) {
																																									if (!flow
																																											.equals(fn2ps)) {
																																										if (!flow
																																												.equals(t2s)) {
																																											if (!flow
																																													.equals(process)) {
																																												if (!flow
																																														.equals(sf1)) {
																																													if (!flow
																																															.equals(task)) {
																																														if (!step
																																																.equals(t2s)) {
																																															if (!step
																																																	.equals(task)) {
																																																if (!prevInFlow
																																																		.equals(prevNode)) {
																																																	if (!prevInFlow
																																																			.equals(prevStep)) {
																																																		if (!prevInFlow
																																																				.equals(step)) {
																																																			if (!prevInFlow
																																																					.equals(prevPrevNode)) {
																																																				if (!prevInFlow
																																																						.equals(t2s)) {
																																																					if (!prevInFlow
																																																							.equals(process)) {
																																																						if (!prevInFlow
																																																								.equals(sf1)) {
																																																							if (!prevInFlow
																																																									.equals(task)) {
																																																								if (!prevPrevNode
																																																										.equals(prevStep)) {
																																																									if (!prevPrevNode
																																																											.equals(step)) {
																																																										if (!prevPrevNode
																																																												.equals(t2s)) {
																																																											if (!prevPrevNode
																																																													.equals(process)) {
																																																												if (!prevPrevNode
																																																														.equals(sf1)) {
																																																													if (!prevPrevNode
																																																															.equals(task)) {
																																																														if (!fn2ps
																																																																.equals(prevNode)) {
																																																															if (!fn2ps
																																																																	.equals(pn2cs)) {
																																																																if (!fn2ps
																																																																		.equals(prevStep)) {
																																																																	if (!fn2ps
																																																																			.equals(step)) {
																																																																		if (!fn2ps
																																																																				.equals(prevInFlow)) {
																																																																			if (!fn2ps
																																																																					.equals(prevPrevNode)) {
																																																																				if (!fn2ps
																																																																						.equals(t2s)) {
																																																																					if (!fn2ps
																																																																							.equals(process)) {
																																																																						if (!fn2ps
																																																																								.equals(sf1)) {
																																																																							if (!fn2ps
																																																																									.equals(task)) {
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
																																																																																		prevNode,
																																																																																		choiceStep,
																																																																																		pn2cs,
																																																																																		prevStep,
																																																																																		flow,
																																																																																		step,
																																																																																		prevInFlow,
																																																																																		prevPrevNode,
																																																																																		fn2ps,
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
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_1_3_greenBBBBBBBBBFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject prevNode, EObject prevStep, EObject flow, EObject step, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "T2SAfterMerge";
		String prevStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String t2s__step____target_name_prime = "target";
		String t2s__task____source_name_prime = "source";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(prevStep__step____next);
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
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { ruleresult, prevNode, prevStep, flow, step, t2s, process, sf1, task,
				prevStep__step____next, flow__step____steps, t2s__step____target, t2s__task____source,
				process__task____flowElements, process__sf1____flowElements, sf1__task____targetRef,
				task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final void pattern_T2SAfterMerge_1_5_expressionBBBBBBBBBBBBBBB(T2SAfterMerge _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep,
			EObject flow, EObject step, EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject t2s,
			EObject process, EObject sf1, EObject task) {
		_this.registerObjects_FWD(ruleresult, prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow,
				prevPrevNode, fn2ps, t2s, process, sf1, task);

	}

	public static final PerformRuleResult pattern_T2SAfterMerge_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_2_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_2_1_blackFBB(EClass eClass, T2SAfterMerge _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_2_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_2_1_binding = pattern_T2SAfterMerge_2_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_T2SAfterMerge_2_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_2_1_black = pattern_T2SAfterMerge_2_1_blackFBB(eClass, _this);
			if (result_pattern_T2SAfterMerge_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_T2SAfterMerge_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "T2SAfterMerge";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_T2SAfterMerge_2_2_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("prevInFlow");
		EObject _localVariable_2 = match.getObject("prevPrevNode");
		EObject _localVariable_3 = match.getObject("process");
		EObject _localVariable_4 = match.getObject("sf1");
		EObject _localVariable_5 = match.getObject("task");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpPrevInFlow = _localVariable_1;
		EObject tmpPrevPrevNode = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpTask = _localVariable_5;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpPrevInFlow instanceof SequenceFlow) {
				SequenceFlow prevInFlow = (SequenceFlow) tmpPrevInFlow;
				if (tmpPrevPrevNode instanceof FlowNode) {
					FlowNode prevPrevNode = (FlowNode) tmpPrevPrevNode;
					if (tmpProcess instanceof de.abilov.bpmn.Process) {
						de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpTask instanceof Task) {
								Task task = (Task) tmpTask;
								return new Object[] { prevNode, prevInFlow, prevPrevNode, process, sf1, task, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_2_2_blackBFFFBBFBBBB(ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!prevPrevNode.equals(task)) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
						for (GW2S pn2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode,
								GW2S.class, "source")) {
							Step tmpChoiceStep = pn2cs.getTarget();
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								for (FN2S fn2ps : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevPrevNode, FN2S.class, "source")) {
									Step prevStep = fn2ps.getTarget();
									if (prevStep != null) {
										if (!choiceStep.equals(prevStep)) {
											_result.add(new Object[] { prevNode, choiceStep, pn2cs, prevStep,
													prevInFlow, prevPrevNode, fn2ps, process, sf1, task, match });
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

	public static final Iterable<Object[]> pattern_T2SAfterMerge_2_3_blackBBBBFBBBBBB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, SequenceFlow prevInFlow, FlowNode prevPrevNode,
			FN2S fn2ps, de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(prevPrevNode)) {
			if (!choiceStep.equals(prevStep)) {
				if (!prevInFlow.equals(sf1)) {
					if (!prevPrevNode.equals(task)) {
						if (prevStep.equals(choiceStep.get__lastInDef())) {
							if (prevNode.equals(pn2cs.getSource())) {
								if (choiceStep.equals(pn2cs.getTarget())) {
									if (prevNode.equals(prevInFlow.getTargetRef())) {
										if (prevPrevNode.equals(prevInFlow.getSourceRef())) {
											if (prevPrevNode.equals(fn2ps.getSource())) {
												if (prevStep.equals(fn2ps.getTarget())) {
													if (process.getFlowElements().contains(task)) {
														if (process.getFlowElements().contains(sf1)) {
															if (process.getFlowElements().contains(prevNode)) {
																if (task.equals(sf1.getTargetRef())) {
																	if (prevNode.equals(sf1.getSourceRef())) {
																		boolean prevNodeisDiverging = prevNode
																				.isIsDiverging();
																		if (Boolean.valueOf(prevNodeisDiverging)
																				.equals(false)) {
																			for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							choiceStep, Flow.class,
																							"steps")) {
																				if (flow.getSteps()
																						.contains(prevStep)) {
																					_result.add(new Object[] { prevNode,
																							choiceStep, pn2cs, prevStep,
																							flow, prevInFlow,
																							prevPrevNode, fn2ps,
																							process, sf1, task });
																				}
																			}
																		}

																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_2_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge choiceStep__prevStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__prevInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__prevPrevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevPrevNode__prevInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fn2ps__prevPrevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String choiceStep__prevStep______lastInDef_name_prime = "__lastInDef";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__prevStep____steps_name_prime = "steps";
		String prevInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__prevInFlow____incoming_name_prime = "incoming";
		String prevInFlow__prevPrevNode____sourceRef_name_prime = "sourceRef";
		String prevPrevNode__prevInFlow____outgoing_name_prime = "outgoing";
		String fn2ps__prevPrevNode____source_name_prime = "source";
		String fn2ps__prevStep____target_name_prime = "target";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevPrevNode);
		isApplicableMatch.getAllContextElements().add(fn2ps);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(task);
		choiceStep__prevStep______lastInDef.setSrc(choiceStep);
		choiceStep__prevStep______lastInDef.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(choiceStep__prevStep______lastInDef);
		pn2cs__prevNode____source.setSrc(pn2cs);
		pn2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs__prevNode____source);
		pn2cs__choiceStep____target.setSrc(pn2cs);
		pn2cs__choiceStep____target.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs__choiceStep____target);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(flow__choiceStep____steps);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(flow__prevStep____steps);
		prevInFlow__prevNode____targetRef.setSrc(prevInFlow);
		prevInFlow__prevNode____targetRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(prevInFlow__prevNode____targetRef);
		prevNode__prevInFlow____incoming.setSrc(prevNode);
		prevNode__prevInFlow____incoming.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevNode__prevInFlow____incoming);
		prevInFlow__prevPrevNode____sourceRef.setSrc(prevInFlow);
		prevInFlow__prevPrevNode____sourceRef.setTrg(prevPrevNode);
		isApplicableMatch.getAllContextElements().add(prevInFlow__prevPrevNode____sourceRef);
		prevPrevNode__prevInFlow____outgoing.setSrc(prevPrevNode);
		prevPrevNode__prevInFlow____outgoing.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevPrevNode__prevInFlow____outgoing);
		fn2ps__prevPrevNode____source.setSrc(fn2ps);
		fn2ps__prevPrevNode____source.setTrg(prevPrevNode);
		isApplicableMatch.getAllContextElements().add(fn2ps__prevPrevNode____source);
		fn2ps__prevStep____target.setSrc(fn2ps);
		fn2ps__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(fn2ps__prevStep____target);
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
		choiceStep__prevStep______lastInDef.setName(choiceStep__prevStep______lastInDef_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		prevInFlow__prevNode____targetRef.setName(prevInFlow__prevNode____targetRef_name_prime);
		prevNode__prevInFlow____incoming.setName(prevNode__prevInFlow____incoming_name_prime);
		prevInFlow__prevPrevNode____sourceRef.setName(prevInFlow__prevPrevNode____sourceRef_name_prime);
		prevPrevNode__prevInFlow____outgoing.setName(prevPrevNode__prevInFlow____outgoing_name_prime);
		fn2ps__prevPrevNode____source.setName(fn2ps__prevPrevNode____source_name_prime);
		fn2ps__prevStep____target.setName(fn2ps__prevStep____target_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process,
				sf1, task, isApplicableMatch, choiceStep__prevStep______lastInDef, pn2cs__prevNode____source,
				pn2cs__choiceStep____target, flow__choiceStep____steps, flow__prevStep____steps,
				prevInFlow__prevNode____targetRef, prevNode__prevInFlow____incoming,
				prevInFlow__prevPrevNode____sourceRef, prevPrevNode__prevInFlow____outgoing,
				fn2ps__prevPrevNode____source, fn2ps__prevStep____target, process__task____flowElements,
				process__sf1____flowElements, process__prevNode____flowElements, sf1__task____targetRef,
				task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_T2SAfterMerge_2_4_bindingFBBBBBBBBBBBBB(T2SAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep,
				flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow,
					prevInFlow, prevPrevNode, fn2ps, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterMerge_2_4_bindingAndBlackFBBBBBBBBBBBBB(T2SAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process, SequenceFlow sf1, Task task) {
		Object[] result_pattern_T2SAfterMerge_2_4_binding = pattern_T2SAfterMerge_2_4_bindingFBBBBBBBBBBBBB(_this,
				isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps,
				process, sf1, task);
		if (result_pattern_T2SAfterMerge_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterMerge_2_4_binding[0];

			Object[] result_pattern_T2SAfterMerge_2_4_black = pattern_T2SAfterMerge_2_4_blackB(csp);
			if (result_pattern_T2SAfterMerge_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow,
						prevInFlow, prevPrevNode, fn2ps, process, sf1, task };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterMerge_2_5_expressionFBB(T2SAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_T2SAfterMerge_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "T2SAfterMerge";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_T2SAfterMerge_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_10_1_blackBBBBBB(T2SAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				return new Object[] { _this, match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_10_2_bindingFBBBBBB(T2SAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, choiceStep, prevStep, flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, choiceStep, prevStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterMerge_10_2_bindingAndBlackFBBBBBB(T2SAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		Object[] result_pattern_T2SAfterMerge_10_2_binding = pattern_T2SAfterMerge_10_2_bindingFBBBBBB(_this, match,
				choiceStep, prevStep, flow, step);
		if (result_pattern_T2SAfterMerge_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterMerge_10_2_binding[0];

			Object[] result_pattern_T2SAfterMerge_10_2_black = pattern_T2SAfterMerge_10_2_blackB(csp);
			if (result_pattern_T2SAfterMerge_10_2_black != null) {

				return new Object[] { csp, _this, match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterMerge_10_3_expressionFBB(T2SAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_10_4_blackBBBBB(Match match, ChoiceStep choiceStep,
			Step prevStep, Flow flow, NormalStep step) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				return new Object[] { match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_10_4_greenBBBBFF(Match match, Step prevStep, Flow flow,
			NormalStep step) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String prevStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		match.getToBeTranslatedEdges().add(prevStep__step____next);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, prevStep, flow, step, prevStep__step____next, flow__step____steps };
	}

	public static final Object[] pattern_T2SAfterMerge_10_5_blackBBBBB(Match match, ChoiceStep choiceStep,
			Step prevStep, Flow flow, NormalStep step) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				return new Object[] { match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_10_5_greenBBBBFFF(Match match, ChoiceStep choiceStep,
			Step prevStep, Flow flow) {
		EMoflonEdge choiceStep__prevStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(choiceStep);
		match.getContextNodes().add(prevStep);
		match.getContextNodes().add(flow);
		String choiceStep__prevStep______lastInDef_name_prime = "__lastInDef";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__prevStep____steps_name_prime = "steps";
		choiceStep__prevStep______lastInDef.setSrc(choiceStep);
		choiceStep__prevStep______lastInDef.setTrg(prevStep);
		match.getContextEdges().add(choiceStep__prevStep______lastInDef);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		match.getContextEdges().add(flow__choiceStep____steps);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		match.getContextEdges().add(flow__prevStep____steps);
		choiceStep__prevStep______lastInDef.setName(choiceStep__prevStep______lastInDef_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		return new Object[] { match, choiceStep, prevStep, flow, choiceStep__prevStep______lastInDef,
				flow__choiceStep____steps, flow__prevStep____steps };
	}

	public static final void pattern_T2SAfterMerge_10_6_expressionBBBBBB(T2SAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		_this.registerObjectsToMatch_BWD(match, choiceStep, prevStep, flow, step);

	}

	public static final boolean pattern_T2SAfterMerge_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_11_1_bindingFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("step");
		EObject _localVariable_6 = isApplicableMatch.getObject("prevInFlow");
		EObject _localVariable_7 = isApplicableMatch.getObject("prevPrevNode");
		EObject _localVariable_8 = isApplicableMatch.getObject("fn2ps");
		EObject _localVariable_9 = isApplicableMatch.getObject("process");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpChoiceStep = _localVariable_1;
		EObject tmpPn2cs = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpStep = _localVariable_5;
		EObject tmpPrevInFlow = _localVariable_6;
		EObject tmpPrevPrevNode = _localVariable_7;
		EObject tmpFn2ps = _localVariable_8;
		EObject tmpProcess = _localVariable_9;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpChoiceStep instanceof ChoiceStep) {
				ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
				if (tmpPn2cs instanceof GW2S) {
					GW2S pn2cs = (GW2S) tmpPn2cs;
					if (tmpPrevStep instanceof Step) {
						Step prevStep = (Step) tmpPrevStep;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpStep instanceof NormalStep) {
								NormalStep step = (NormalStep) tmpStep;
								if (tmpPrevInFlow instanceof SequenceFlow) {
									SequenceFlow prevInFlow = (SequenceFlow) tmpPrevInFlow;
									if (tmpPrevPrevNode instanceof FlowNode) {
										FlowNode prevPrevNode = (FlowNode) tmpPrevPrevNode;
										if (tmpFn2ps instanceof FN2S) {
											FN2S fn2ps = (FN2S) tmpFn2ps;
											if (tmpProcess instanceof de.abilov.bpmn.Process) {
												de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
												return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step,
														prevInFlow, prevPrevNode, fn2ps, process, isApplicableMatch };
											}
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

	public static final Object[] pattern_T2SAfterMerge_11_1_blackBBBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process, T2SAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!choiceStep.equals(prevStep)) {
				if (!prevStep.equals(step)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow,
									prevPrevNode, fn2ps, process, _this, csp, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_11_1_bindingAndBlackFFFFFFFFFFBFB(T2SAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_T2SAfterMerge_11_1_binding = pattern_T2SAfterMerge_11_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_T2SAfterMerge_11_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_T2SAfterMerge_11_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_T2SAfterMerge_11_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_T2SAfterMerge_11_1_binding[2];
			Step prevStep = (Step) result_pattern_T2SAfterMerge_11_1_binding[3];
			Flow flow = (Flow) result_pattern_T2SAfterMerge_11_1_binding[4];
			NormalStep step = (NormalStep) result_pattern_T2SAfterMerge_11_1_binding[5];
			SequenceFlow prevInFlow = (SequenceFlow) result_pattern_T2SAfterMerge_11_1_binding[6];
			FlowNode prevPrevNode = (FlowNode) result_pattern_T2SAfterMerge_11_1_binding[7];
			FN2S fn2ps = (FN2S) result_pattern_T2SAfterMerge_11_1_binding[8];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_T2SAfterMerge_11_1_binding[9];

			Object[] result_pattern_T2SAfterMerge_11_1_black = pattern_T2SAfterMerge_11_1_blackBBBBBBBBBBBFB(prevNode,
					choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, _this,
					isApplicableMatch);
			if (result_pattern_T2SAfterMerge_11_1_black != null) {
				CSP csp = (CSP) result_pattern_T2SAfterMerge_11_1_black[11];

				return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode,
						fn2ps, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_11_1_greenBBFBFFB(ExclusiveGateway prevNode, NormalStep step,
			de.abilov.bpmn.Process process, CSP csp) {
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

	public static final Object[] pattern_T2SAfterMerge_11_2_blackBBBB(NormalStep step, FN2S t2s, SequenceFlow sf1,
			Task task) {
		return new Object[] { step, t2s, sf1, task };
	}

	public static final Object[] pattern_T2SAfterMerge_11_2_greenFBBBB(NormalStep step, FN2S t2s, SequenceFlow sf1,
			Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getCreatedElements().add(task);
		return new Object[] { ruleresult, step, t2s, sf1, task };
	}

	public static final Object[] pattern_T2SAfterMerge_11_3_blackBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep, EObject flow, EObject step,
			EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!prevNode.equals(t2s)) {
						if (!prevNode.equals(process)) {
							if (!prevNode.equals(sf1)) {
								if (!prevNode.equals(task)) {
									if (!choiceStep.equals(prevNode)) {
										if (!choiceStep.equals(pn2cs)) {
											if (!choiceStep.equals(prevStep)) {
												if (!choiceStep.equals(flow)) {
													if (!choiceStep.equals(step)) {
														if (!choiceStep.equals(prevInFlow)) {
															if (!choiceStep.equals(prevPrevNode)) {
																if (!choiceStep.equals(fn2ps)) {
																	if (!choiceStep.equals(t2s)) {
																		if (!choiceStep.equals(process)) {
																			if (!choiceStep.equals(sf1)) {
																				if (!choiceStep.equals(task)) {
																					if (!pn2cs.equals(prevNode)) {
																						if (!pn2cs.equals(prevStep)) {
																							if (!pn2cs.equals(step)) {
																								if (!pn2cs.equals(
																										prevInFlow)) {
																									if (!pn2cs.equals(
																											prevPrevNode)) {
																										if (!pn2cs
																												.equals(t2s)) {
																											if (!pn2cs
																													.equals(process)) {
																												if (!pn2cs
																														.equals(sf1)) {
																													if (!pn2cs
																															.equals(task)) {
																														if (!prevStep
																																.equals(step)) {
																															if (!prevStep
																																	.equals(t2s)) {
																																if (!prevStep
																																		.equals(process)) {
																																	if (!prevStep
																																			.equals(sf1)) {
																																		if (!prevStep
																																				.equals(task)) {
																																			if (!flow
																																					.equals(prevNode)) {
																																				if (!flow
																																						.equals(pn2cs)) {
																																					if (!flow
																																							.equals(prevStep)) {
																																						if (!flow
																																								.equals(step)) {
																																							if (!flow
																																									.equals(prevInFlow)) {
																																								if (!flow
																																										.equals(prevPrevNode)) {
																																									if (!flow
																																											.equals(fn2ps)) {
																																										if (!flow
																																												.equals(t2s)) {
																																											if (!flow
																																													.equals(process)) {
																																												if (!flow
																																														.equals(sf1)) {
																																													if (!flow
																																															.equals(task)) {
																																														if (!step
																																																.equals(t2s)) {
																																															if (!step
																																																	.equals(task)) {
																																																if (!prevInFlow
																																																		.equals(prevNode)) {
																																																	if (!prevInFlow
																																																			.equals(prevStep)) {
																																																		if (!prevInFlow
																																																				.equals(step)) {
																																																			if (!prevInFlow
																																																					.equals(prevPrevNode)) {
																																																				if (!prevInFlow
																																																						.equals(t2s)) {
																																																					if (!prevInFlow
																																																							.equals(process)) {
																																																						if (!prevInFlow
																																																								.equals(sf1)) {
																																																							if (!prevInFlow
																																																									.equals(task)) {
																																																								if (!prevPrevNode
																																																										.equals(prevStep)) {
																																																									if (!prevPrevNode
																																																											.equals(step)) {
																																																										if (!prevPrevNode
																																																												.equals(t2s)) {
																																																											if (!prevPrevNode
																																																													.equals(process)) {
																																																												if (!prevPrevNode
																																																														.equals(sf1)) {
																																																													if (!prevPrevNode
																																																															.equals(task)) {
																																																														if (!fn2ps
																																																																.equals(prevNode)) {
																																																															if (!fn2ps
																																																																	.equals(pn2cs)) {
																																																																if (!fn2ps
																																																																		.equals(prevStep)) {
																																																																	if (!fn2ps
																																																																			.equals(step)) {
																																																																		if (!fn2ps
																																																																				.equals(prevInFlow)) {
																																																																			if (!fn2ps
																																																																					.equals(prevPrevNode)) {
																																																																				if (!fn2ps
																																																																						.equals(t2s)) {
																																																																					if (!fn2ps
																																																																							.equals(process)) {
																																																																						if (!fn2ps
																																																																								.equals(sf1)) {
																																																																							if (!fn2ps
																																																																									.equals(task)) {
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
																																																																																		prevNode,
																																																																																		choiceStep,
																																																																																		pn2cs,
																																																																																		prevStep,
																																																																																		flow,
																																																																																		step,
																																																																																		prevInFlow,
																																																																																		prevPrevNode,
																																																																																		fn2ps,
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
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_11_3_greenBBBBBBBBBFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject prevNode, EObject prevStep, EObject flow, EObject step, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "T2SAfterMerge";
		String prevStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String t2s__step____target_name_prime = "target";
		String t2s__task____source_name_prime = "source";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(prevStep__step____next);
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
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { ruleresult, prevNode, prevStep, flow, step, t2s, process, sf1, task,
				prevStep__step____next, flow__step____steps, t2s__step____target, t2s__task____source,
				process__task____flowElements, process__sf1____flowElements, sf1__task____targetRef,
				task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final void pattern_T2SAfterMerge_11_5_expressionBBBBBBBBBBBBBBB(T2SAfterMerge _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep,
			EObject flow, EObject step, EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject t2s,
			EObject process, EObject sf1, EObject task) {
		_this.registerObjects_BWD(ruleresult, prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow,
				prevPrevNode, fn2ps, t2s, process, sf1, task);

	}

	public static final PerformRuleResult pattern_T2SAfterMerge_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_12_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_12_1_blackFBB(EClass eClass, T2SAfterMerge _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_12_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_12_1_binding = pattern_T2SAfterMerge_12_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_T2SAfterMerge_12_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_12_1_black = pattern_T2SAfterMerge_12_1_blackFBB(eClass, _this);
			if (result_pattern_T2SAfterMerge_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_T2SAfterMerge_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "T2SAfterMerge";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_T2SAfterMerge_12_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("choiceStep");
		EObject _localVariable_1 = match.getObject("prevStep");
		EObject _localVariable_2 = match.getObject("flow");
		EObject _localVariable_3 = match.getObject("step");
		EObject tmpChoiceStep = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		if (tmpChoiceStep instanceof ChoiceStep) {
			ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpStep instanceof NormalStep) {
						NormalStep step = (NormalStep) tmpStep;
						return new Object[] { choiceStep, prevStep, flow, step, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_12_2_blackFBFBBBFFB(ChoiceStep choiceStep,
			Step prevStep, Flow flow, NormalStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (GW2S pn2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(choiceStep,
						GW2S.class, "target")) {
					Gateway tmpPrevNode = pn2cs.getSource();
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
							for (FN2S fn2ps : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevStep, FN2S.class, "target")) {
								FlowNode prevPrevNode = fn2ps.getSource();
								if (prevPrevNode != null) {
									if (!prevNode.equals(prevPrevNode)) {
										_result.add(new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step,
												prevPrevNode, fn2ps, match });
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

	public static final Iterable<Object[]> pattern_T2SAfterMerge_12_3_blackBBBBBBFBBF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, FlowNode prevPrevNode,
			FN2S fn2ps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(prevPrevNode)) {
			if (!choiceStep.equals(prevStep)) {
				if (!prevStep.equals(step)) {
					if (prevStep.equals(choiceStep.get__lastInDef())) {
						if (prevNode.equals(pn2cs.getSource())) {
							if (choiceStep.equals(pn2cs.getTarget())) {
								if (step.equals(prevStep.getNext())) {
									if (flow.getSteps().contains(choiceStep)) {
										if (flow.getSteps().contains(prevStep)) {
											if (flow.getSteps().contains(step)) {
												if (prevPrevNode.equals(fn2ps.getSource())) {
													if (prevStep.equals(fn2ps.getTarget())) {
														boolean prevNodeisDiverging = prevNode.isIsDiverging();
														if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
															for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
																if (prevPrevNode.equals(prevInFlow.getSourceRef())) {
																	for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(prevNode,
																					de.abilov.bpmn.Process.class,
																					"flowElements")) {
																		_result.add(new Object[] { prevNode, choiceStep,
																				pn2cs, prevStep, flow, step, prevInFlow,
																				prevPrevNode, fn2ps, process });
																	}
																}
															}
														}

													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge choiceStep__prevStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__prevInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__prevPrevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevPrevNode__prevInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fn2ps__prevPrevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String choiceStep__prevStep______lastInDef_name_prime = "__lastInDef";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String prevStep__step____next_name_prime = "next";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__prevStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String prevInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__prevInFlow____incoming_name_prime = "incoming";
		String prevInFlow__prevPrevNode____sourceRef_name_prime = "sourceRef";
		String prevPrevNode__prevInFlow____outgoing_name_prime = "outgoing";
		String fn2ps__prevPrevNode____source_name_prime = "source";
		String fn2ps__prevStep____target_name_prime = "target";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevPrevNode);
		isApplicableMatch.getAllContextElements().add(fn2ps);
		isApplicableMatch.getAllContextElements().add(process);
		choiceStep__prevStep______lastInDef.setSrc(choiceStep);
		choiceStep__prevStep______lastInDef.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(choiceStep__prevStep______lastInDef);
		pn2cs__prevNode____source.setSrc(pn2cs);
		pn2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs__prevNode____source);
		pn2cs__choiceStep____target.setSrc(pn2cs);
		pn2cs__choiceStep____target.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs__choiceStep____target);
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(prevStep__step____next);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(flow__choiceStep____steps);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(flow__prevStep____steps);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		prevInFlow__prevNode____targetRef.setSrc(prevInFlow);
		prevInFlow__prevNode____targetRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(prevInFlow__prevNode____targetRef);
		prevNode__prevInFlow____incoming.setSrc(prevNode);
		prevNode__prevInFlow____incoming.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevNode__prevInFlow____incoming);
		prevInFlow__prevPrevNode____sourceRef.setSrc(prevInFlow);
		prevInFlow__prevPrevNode____sourceRef.setTrg(prevPrevNode);
		isApplicableMatch.getAllContextElements().add(prevInFlow__prevPrevNode____sourceRef);
		prevPrevNode__prevInFlow____outgoing.setSrc(prevPrevNode);
		prevPrevNode__prevInFlow____outgoing.setTrg(prevInFlow);
		isApplicableMatch.getAllContextElements().add(prevPrevNode__prevInFlow____outgoing);
		fn2ps__prevPrevNode____source.setSrc(fn2ps);
		fn2ps__prevPrevNode____source.setTrg(prevPrevNode);
		isApplicableMatch.getAllContextElements().add(fn2ps__prevPrevNode____source);
		fn2ps__prevStep____target.setSrc(fn2ps);
		fn2ps__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(fn2ps__prevStep____target);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		choiceStep__prevStep______lastInDef.setName(choiceStep__prevStep______lastInDef_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		prevInFlow__prevNode____targetRef.setName(prevInFlow__prevNode____targetRef_name_prime);
		prevNode__prevInFlow____incoming.setName(prevNode__prevInFlow____incoming_name_prime);
		prevInFlow__prevPrevNode____sourceRef.setName(prevInFlow__prevPrevNode____sourceRef_name_prime);
		prevPrevNode__prevInFlow____outgoing.setName(prevPrevNode__prevInFlow____outgoing_name_prime);
		fn2ps__prevPrevNode____source.setName(fn2ps__prevPrevNode____source_name_prime);
		fn2ps__prevStep____target.setName(fn2ps__prevStep____target_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps,
				process, isApplicableMatch, choiceStep__prevStep______lastInDef, pn2cs__prevNode____source,
				pn2cs__choiceStep____target, prevStep__step____next, flow__choiceStep____steps, flow__prevStep____steps,
				flow__step____steps, prevInFlow__prevNode____targetRef, prevNode__prevInFlow____incoming,
				prevInFlow__prevPrevNode____sourceRef, prevPrevNode__prevInFlow____outgoing,
				fn2ps__prevPrevNode____source, fn2ps__prevStep____target, process__prevNode____flowElements };
	}

	public static final Object[] pattern_T2SAfterMerge_12_4_bindingFBBBBBBBBBBBB(T2SAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, NormalStep step, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep,
				flow, step, prevInFlow, prevPrevNode, fn2ps, process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step,
					prevInFlow, prevPrevNode, fn2ps, process };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterMerge_12_4_bindingAndBlackFBBBBBBBBBBBB(T2SAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, NormalStep step, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process) {
		Object[] result_pattern_T2SAfterMerge_12_4_binding = pattern_T2SAfterMerge_12_4_bindingFBBBBBBBBBBBB(_this,
				isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps,
				process);
		if (result_pattern_T2SAfterMerge_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterMerge_12_4_binding[0];

			Object[] result_pattern_T2SAfterMerge_12_4_black = pattern_T2SAfterMerge_12_4_blackB(csp);
			if (result_pattern_T2SAfterMerge_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step,
						prevInFlow, prevPrevNode, fn2ps, process };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterMerge_12_5_expressionFBB(T2SAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_T2SAfterMerge_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "T2SAfterMerge";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_T2SAfterMerge_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_20_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_20_1_blackFBB(EClass __eClass, T2SAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_20_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_20_1_binding = pattern_T2SAfterMerge_20_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterMerge_20_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_20_1_black = pattern_T2SAfterMerge_20_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterMerge_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterMerge_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterMerge_20_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_97950 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_97950)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_20_2_black_nac_1BBB(NormalStep step, ChoiceStep choiceStep,
			Step prevStep) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (Step __DEC_step_next_865206 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(step, Step.class, "next")) {
					if (!step.equals(__DEC_step_next_865206)) {
						if (!choiceStep.equals(__DEC_step_next_865206)) {
							if (!prevStep.equals(__DEC_step_next_865206)) {
								return new Object[] { step, choiceStep, prevStep };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_20_2_black_nac_2BB(ChoiceStep choiceStep, NormalStep step) {
		if (step.equals(choiceStep.getNext())) {
			return new Object[] { choiceStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_20_2_blackFFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (!prevStep.equals(step)) {
					if (step.equals(prevStep.getNext())) {
						for (ChoiceStep choiceStep : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(prevStep, ChoiceStep.class, "__lastInDef")) {
							if (!choiceStep.equals(prevStep)) {
								if (pattern_T2SAfterMerge_20_2_black_nac_1BBB(step, choiceStep, prevStep) == null) {
									if (pattern_T2SAfterMerge_20_2_black_nac_2BB(choiceStep, step) == null) {
										for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevStep, Flow.class, "steps")) {
											if (flow.getSteps().contains(choiceStep)) {
												if (flow.getSteps().contains(step)) {
													if (pattern_T2SAfterMerge_20_2_black_nac_0BB(step, flow) == null) {
														_result.add(new Object[] { choiceStep, prevStep, flow, step,
																_edge_next });
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterMerge_20_3_expressionFBBBBBB(T2SAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, prevStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_20_4_expressionFBB(T2SAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterMerge_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterMerge_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_21_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_21_1_blackFBB(EClass __eClass, T2SAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_21_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_21_1_binding = pattern_T2SAfterMerge_21_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterMerge_21_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_21_1_black = pattern_T2SAfterMerge_21_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterMerge_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterMerge_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterMerge_21_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_850219 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_850219)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_21_2_black_nac_1BBB(NormalStep step, ChoiceStep choiceStep,
			Step prevStep) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (Step __DEC_step_next_767329 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(step, Step.class, "next")) {
					if (!step.equals(__DEC_step_next_767329)) {
						if (!choiceStep.equals(__DEC_step_next_767329)) {
							if (!prevStep.equals(__DEC_step_next_767329)) {
								return new Object[] { step, choiceStep, prevStep };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_21_2_black_nac_2BB(ChoiceStep choiceStep, NormalStep step) {
		if (step.equals(choiceStep.getNext())) {
			return new Object[] { choiceStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_21_2_blackFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_T2SAfterMerge_21_2_black_nac_0BB(step, flow) == null) {
						for (Step tmpChoiceStep : flow.getSteps()) {
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								Step prevStep = choiceStep.get__lastInDef();
								if (prevStep != null) {
									if (!choiceStep.equals(prevStep)) {
										if (!prevStep.equals(step)) {
											if (step.equals(prevStep.getNext())) {
												if (flow.getSteps().contains(prevStep)) {
													if (pattern_T2SAfterMerge_21_2_black_nac_2BB(choiceStep,
															step) == null) {
														if (pattern_T2SAfterMerge_21_2_black_nac_1BBB(step, choiceStep,
																prevStep) == null) {
															_result.add(new Object[] { choiceStep, prevStep, flow, step,
																	_edge_steps });
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterMerge_21_3_expressionFBBBBBB(T2SAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, prevStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_21_4_expressionFBB(T2SAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterMerge_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterMerge_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_22_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_22_1_blackFBB(EClass __eClass, T2SAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_22_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_22_1_binding = pattern_T2SAfterMerge_22_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterMerge_22_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_22_1_black = pattern_T2SAfterMerge_22_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterMerge_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterMerge_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterMerge_22_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway prevNode,
			FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_322402 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_322402)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_322402)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_853418 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_853418)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_22_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_453339 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_453339)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_22_2_black_nac_3BB(ExclusiveGateway prevNode, SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_22_2_blackFFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (process.getFlowElements().contains(task)) {
					if (pattern_T2SAfterMerge_22_2_black_nac_2BB(task, process) == null) {
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
												if (pattern_T2SAfterMerge_22_2_black_nac_1BB(sf1, process) == null) {
													if (pattern_T2SAfterMerge_22_2_black_nac_3BB(prevNode,
															sf1) == null) {
														for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
															if (!prevInFlow.equals(sf1)) {
																FlowNode prevPrevNode = prevInFlow.getSourceRef();
																if (prevPrevNode != null) {
																	if (!prevNode.equals(prevPrevNode)) {
																		if (!prevPrevNode.equals(task)) {
																			if (pattern_T2SAfterMerge_22_2_black_nac_0BBB(
																					sf1, prevNode,
																					prevPrevNode) == null) {
																				_result.add(new Object[] { prevNode,
																						prevInFlow, prevPrevNode,
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

		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterMerge_22_3_expressionFBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1,
				task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_22_4_expressionFBB(T2SAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterMerge_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterMerge_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_23_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_23_1_blackFBB(EClass __eClass, T2SAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_23_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_23_1_binding = pattern_T2SAfterMerge_23_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterMerge_23_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_23_1_black = pattern_T2SAfterMerge_23_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterMerge_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterMerge_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterMerge_23_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway prevNode,
			FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_557993 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_557993)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_557993)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_256178 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_256178)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_23_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_944838 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_944838)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_23_2_black_nac_3BB(ExclusiveGateway prevNode, SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_23_2_blackFFFFFFB(EMoflonEdge _edge_flowElements) {
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
										if (pattern_T2SAfterMerge_23_2_black_nac_1BB(sf1, process) == null) {
											if (pattern_T2SAfterMerge_23_2_black_nac_2BB(task, process) == null) {
												if (pattern_T2SAfterMerge_23_2_black_nac_3BB(prevNode, sf1) == null) {
													for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
														if (!prevInFlow.equals(sf1)) {
															FlowNode prevPrevNode = prevInFlow.getSourceRef();
															if (prevPrevNode != null) {
																if (!prevNode.equals(prevPrevNode)) {
																	if (!prevPrevNode.equals(task)) {
																		if (pattern_T2SAfterMerge_23_2_black_nac_0BBB(
																				sf1, prevNode, prevPrevNode) == null) {
																			_result.add(new Object[] { prevNode,
																					prevInFlow, prevPrevNode, process,
																					sf1, task, _edge_flowElements });
																		}
																	}
																}
															}

														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterMerge_23_3_expressionFBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1,
				task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_23_4_expressionFBB(T2SAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterMerge_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterMerge_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_24_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_24_1_blackFBB(EClass __eClass, T2SAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_24_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_24_1_binding = pattern_T2SAfterMerge_24_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterMerge_24_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_24_1_black = pattern_T2SAfterMerge_24_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterMerge_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterMerge_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterMerge_24_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway prevNode,
			FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_156477 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_156477)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_156477)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_24_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_339642 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_339642)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_24_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_119381 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_119381)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_24_2_black_nac_3BB(ExclusiveGateway prevNode, SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_24_2_blackFFFFFFB(EMoflonEdge _edge_targetRef) {
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
							if (pattern_T2SAfterMerge_24_2_black_nac_3BB(prevNode, sf1) == null) {
								for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
									if (!prevInFlow.equals(sf1)) {
										FlowNode prevPrevNode = prevInFlow.getSourceRef();
										if (prevPrevNode != null) {
											if (!prevNode.equals(prevPrevNode)) {
												if (!prevPrevNode.equals(task)) {
													if (pattern_T2SAfterMerge_24_2_black_nac_0BBB(sf1, prevNode,
															prevPrevNode) == null) {
														for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(sf1,
																		de.abilov.bpmn.Process.class, "flowElements")) {
															if (process.getFlowElements().contains(task)) {
																if (process.getFlowElements().contains(prevNode)) {
																	if (pattern_T2SAfterMerge_24_2_black_nac_1BB(sf1,
																			process) == null) {
																		if (pattern_T2SAfterMerge_24_2_black_nac_2BB(
																				task, process) == null) {
																			_result.add(new Object[] { prevNode,
																					prevInFlow, prevPrevNode, process,
																					sf1, task, _edge_targetRef });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterMerge_24_3_expressionFBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1,
				task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_24_4_expressionFBB(T2SAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterMerge_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterMerge_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_25_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_25_1_blackFBB(EClass __eClass, T2SAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_25_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_25_1_binding = pattern_T2SAfterMerge_25_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterMerge_25_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_25_1_black = pattern_T2SAfterMerge_25_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterMerge_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterMerge_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterMerge_25_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway prevNode,
			FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_810469 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_810469)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_810469)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_969511 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_969511)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_25_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_722167 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_722167)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_25_2_black_nac_3BB(ExclusiveGateway prevNode, SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_25_2_blackFFFFFFB(EMoflonEdge _edge_incoming) {
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
							if (pattern_T2SAfterMerge_25_2_black_nac_3BB(prevNode, sf1) == null) {
								for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
									if (!prevInFlow.equals(sf1)) {
										FlowNode prevPrevNode = prevInFlow.getSourceRef();
										if (prevPrevNode != null) {
											if (!prevNode.equals(prevPrevNode)) {
												if (!prevPrevNode.equals(task)) {
													if (pattern_T2SAfterMerge_25_2_black_nac_0BBB(sf1, prevNode,
															prevPrevNode) == null) {
														for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(task,
																		de.abilov.bpmn.Process.class, "flowElements")) {
															if (process.getFlowElements().contains(sf1)) {
																if (process.getFlowElements().contains(prevNode)) {
																	if (pattern_T2SAfterMerge_25_2_black_nac_1BB(sf1,
																			process) == null) {
																		if (pattern_T2SAfterMerge_25_2_black_nac_2BB(
																				task, process) == null) {
																			_result.add(new Object[] { prevNode,
																					prevInFlow, prevPrevNode, process,
																					sf1, task, _edge_incoming });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterMerge_25_3_expressionFBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1,
				task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_25_4_expressionFBB(T2SAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterMerge_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterMerge_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_26_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_26_1_blackFBB(EClass __eClass, T2SAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_26_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_26_1_binding = pattern_T2SAfterMerge_26_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterMerge_26_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_26_1_black = pattern_T2SAfterMerge_26_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterMerge_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterMerge_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterMerge_26_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway prevNode,
			FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_960644 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_960644)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_960644)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_902929 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_902929)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_26_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_458244 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_458244)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_26_2_black_nac_3BB(ExclusiveGateway prevNode, SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_26_2_blackFFFFFFB(EMoflonEdge _edge_sourceRef) {
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
							if (pattern_T2SAfterMerge_26_2_black_nac_3BB(prevNode, sf1) == null) {
								for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
									if (!prevInFlow.equals(sf1)) {
										FlowNode prevPrevNode = prevInFlow.getSourceRef();
										if (prevPrevNode != null) {
											if (!prevNode.equals(prevPrevNode)) {
												if (!prevPrevNode.equals(task)) {
													if (pattern_T2SAfterMerge_26_2_black_nac_0BBB(sf1, prevNode,
															prevPrevNode) == null) {
														for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(sf1,
																		de.abilov.bpmn.Process.class, "flowElements")) {
															if (process.getFlowElements().contains(task)) {
																if (process.getFlowElements().contains(prevNode)) {
																	if (pattern_T2SAfterMerge_26_2_black_nac_1BB(sf1,
																			process) == null) {
																		if (pattern_T2SAfterMerge_26_2_black_nac_2BB(
																				task, process) == null) {
																			_result.add(new Object[] { prevNode,
																					prevInFlow, prevPrevNode, process,
																					sf1, task, _edge_sourceRef });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterMerge_26_3_expressionFBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1,
				task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_26_4_expressionFBB(T2SAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterMerge_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterMerge_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_27_1_bindingFB(T2SAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_27_1_blackFBB(EClass __eClass, T2SAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_27_1_bindingAndBlackFFB(T2SAfterMerge _this) {
		Object[] result_pattern_T2SAfterMerge_27_1_binding = pattern_T2SAfterMerge_27_1_bindingFB(_this);
		if (result_pattern_T2SAfterMerge_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterMerge_27_1_binding[0];

			Object[] result_pattern_T2SAfterMerge_27_1_black = pattern_T2SAfterMerge_27_1_blackFBB(__eClass, _this);
			if (result_pattern_T2SAfterMerge_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterMerge_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterMerge_27_2_black_nac_0BBB(SequenceFlow sf1, ExclusiveGateway prevNode,
			FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_82745 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_82745)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_82745)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_420938 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_420938)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_27_2_black_nac_2BB(Task task, de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_441435 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_441435)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterMerge_27_2_black_nac_3BB(ExclusiveGateway prevNode, SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterMerge_27_2_blackFFFFFFB(EMoflonEdge _edge_outgoing) {
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
							if (pattern_T2SAfterMerge_27_2_black_nac_3BB(prevNode, sf1) == null) {
								for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
									if (!prevInFlow.equals(sf1)) {
										FlowNode prevPrevNode = prevInFlow.getSourceRef();
										if (prevPrevNode != null) {
											if (!prevNode.equals(prevPrevNode)) {
												if (!prevPrevNode.equals(task)) {
													if (pattern_T2SAfterMerge_27_2_black_nac_0BBB(sf1, prevNode,
															prevPrevNode) == null) {
														for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(prevNode,
																		de.abilov.bpmn.Process.class, "flowElements")) {
															if (process.getFlowElements().contains(task)) {
																if (process.getFlowElements().contains(sf1)) {
																	if (pattern_T2SAfterMerge_27_2_black_nac_1BB(sf1,
																			process) == null) {
																		if (pattern_T2SAfterMerge_27_2_black_nac_2BB(
																				task, process) == null) {
																			_result.add(new Object[] { prevNode,
																					prevInFlow, prevPrevNode, process,
																					sf1, task, _edge_outgoing });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterMerge_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterMerge_27_3_expressionFBBBBBBBB(T2SAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1,
				task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterMerge_27_4_expressionFBB(T2SAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterMerge_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterMerge_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterMerge_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //T2SAfterMergeImpl
