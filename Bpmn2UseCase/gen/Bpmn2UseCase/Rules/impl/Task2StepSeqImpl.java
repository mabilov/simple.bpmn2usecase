/**
 */
package bpmn2UseCase.Rules.impl;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;
import SimpleBPMN.Task;

import SimpleUseCase.Flow;
import SimpleUseCase.NormalStep;
import SimpleUseCase.SimpleUseCaseFactory;
import SimpleUseCase.Step;

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

import bpmn2UseCase.Bpmn2UseCaseFactory;
import bpmn2UseCase.FN2S;

import bpmn2UseCase.Rules.RulesPackage;
import bpmn2UseCase.Rules.Task2StepSeq;

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
 * An implementation of the model object '<em><b>Task2 Step Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Task2StepSeqImpl extends AbstractRuleImpl implements Task2StepSeq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task2StepSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTask2StepSeq();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			Task task) {
		// initial bindings
		Object[] result1_black = Task2StepSeqImpl.pattern_Task2StepSeq_0_1_blackBBBBBB(this, match, prevNode, process,
				sf1, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_0_2_bindingAndBlackFBBBBBB(this, match,
				prevNode, process, sf1, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2StepSeqImpl.pattern_Task2StepSeq_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2StepSeqImpl.pattern_Task2StepSeq_0_4_blackBBBBB(match, prevNode, process, sf1,
					task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
			}
			Task2StepSeqImpl.pattern_Task2StepSeq_0_4_greenBBBBBFFFFFF(match, prevNode, process, sf1, task);
			// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result4_green[7];
			// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result4_green[8];
			// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[9];
			// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_0_5_blackBBBBB(match, prevNode, process, sf1,
					task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
			}
			Task2StepSeqImpl.pattern_Task2StepSeq_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			Task2StepSeqImpl.pattern_Task2StepSeq_0_6_expressionBBBBBB(this, match, prevNode, process, sf1, task);
			return Task2StepSeqImpl.pattern_Task2StepSeq_0_7_expressionF();
		} else {
			return Task2StepSeqImpl.pattern_Task2StepSeq_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_1_1_bindingAndBlackFFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2S pn2ps = (FN2S) result1_bindingAndBlack[0];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[5];
		Task task = (Task) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_1_1_greenBBFFBB(flow, prevStep, task, csp);
		NormalStep step = (NormalStep) result1_green[2];
		FN2S t2s = (FN2S) result1_green[3];

		// collect translated elements
		Object[] result2_black = Task2StepSeqImpl.pattern_Task2StepSeq_1_2_blackBBBB(step, t2s, sf1, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[t2s] = " + t2s + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_1_2_greenFBBBB(step, t2s, sf1, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2StepSeqImpl.pattern_Task2StepSeq_1_3_blackBBBBBBBBBB(ruleresult, pn2ps, prevNode,
				flow, prevStep, step, t2s, process, sf1, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pn2ps] = " + pn2ps + ", " + "[prevNode] = " + prevNode
					+ ", " + "[flow] = " + flow + ", " + "[prevStep] = " + prevStep + ", " + "[step] = " + step + ", "
					+ "[t2s] = " + t2s + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = "
					+ task + ".");
		}
		Task2StepSeqImpl.pattern_Task2StepSeq_1_3_greenBBBBBBBBBFFFFFFFFFF(ruleresult, prevNode, flow, prevStep, step,
				t2s, process, sf1, task);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[9];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[10];
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
		Task2StepSeqImpl.pattern_Task2StepSeq_1_5_expressionBBBBBBBBBBB(this, ruleresult, pn2ps, prevNode, flow,
				prevStep, step, t2s, process, sf1, task);
		return Task2StepSeqImpl.pattern_Task2StepSeq_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2StepSeqImpl.pattern_Task2StepSeq_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		FlowNode prevNode = (FlowNode) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		Task task = (Task) result2_binding[3];
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_2_2_blackFBFBBBB(prevNode, process, sf1,
				task, match)) {
			FN2S pn2ps = (FN2S) result2_black[0];
			Step prevStep = (Step) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : Task2StepSeqImpl.pattern_Task2StepSeq_2_3_blackBBFBBBB(pn2ps, prevNode,
					prevStep, process, sf1, task)) {
				Flow flow = (Flow) result3_black[2];
				Object[] result3_green = Task2StepSeqImpl.pattern_Task2StepSeq_2_3_greenBBBBBBBFFFFFFFFFFF(pn2ps,
						prevNode, flow, prevStep, process, sf1, task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge pn2ps__prevNode____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pn2ps__prevStep____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[17];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_2_4_bindingAndBlackFBBBBBBBBB(
						this, isApplicableMatch, pn2ps, prevNode, flow, prevStep, process, sf1, task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pn2ps] = " + pn2ps + ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow
							+ ", " + "[prevStep] = " + prevStep + ", " + "[process] = " + process + ", " + "[sf1] = "
							+ sf1 + ", " + "[task] = " + task + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2StepSeqImpl.pattern_Task2StepSeq_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2StepSeqImpl.pattern_Task2StepSeq_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			Task task) {
		match.registerObject("prevNode", prevNode);
		match.registerObject("process", process);
		match.registerObject("sf1", sf1);
		match.registerObject("task", task);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			Task task) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FN2S pn2ps, FlowNode prevNode, Flow flow,
			Step prevStep, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {// Create CSP
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
		isApplicableMatch.registerObject("pn2ps", pn2ps);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevStep", prevStep);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pn2ps, EObject prevNode, EObject flow,
			EObject prevStep, EObject step, EObject t2s, EObject process, EObject sf1, EObject task) {
		ruleresult.registerObject("pn2ps", pn2ps);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("step", step);
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
		return true && match.getObject("sf1").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow())
				&& match.getObject("task").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getTask());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Flow flow, Step prevStep, NormalStep step) {
		// initial bindings
		Object[] result1_black = Task2StepSeqImpl.pattern_Task2StepSeq_10_1_blackBBBBB(this, match, flow, prevStep,
				step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[flow] = " + flow + ", "
					+ "[prevStep] = " + prevStep + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_10_2_bindingAndBlackFBBBBB(this, match,
				flow, prevStep, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[prevStep] = " + prevStep
					+ ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2StepSeqImpl.pattern_Task2StepSeq_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2StepSeqImpl.pattern_Task2StepSeq_10_4_blackBBBB(match, flow, prevStep, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[prevStep] = "
						+ prevStep + ", " + "[step] = " + step + ".");
			}
			Task2StepSeqImpl.pattern_Task2StepSeq_10_4_greenBBBBFF(match, flow, prevStep, step);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge prevStep__step____next = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_10_5_blackBBBB(match, flow, prevStep, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[flow] = " + flow + ", " + "[prevStep] = "
						+ prevStep + ", " + "[step] = " + step + ".");
			}
			Task2StepSeqImpl.pattern_Task2StepSeq_10_5_greenBBBF(match, flow, prevStep);
			// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result5_green[3];

			// register objects to match
			Task2StepSeqImpl.pattern_Task2StepSeq_10_6_expressionBBBBB(this, match, flow, prevStep, step);
			return Task2StepSeqImpl.pattern_Task2StepSeq_10_7_expressionF();
		} else {
			return Task2StepSeqImpl.pattern_Task2StepSeq_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_11_1_bindingAndBlackFFFFFFBFB(this,
				isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2S pn2ps = (FN2S) result1_bindingAndBlack[0];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		NormalStep step = (NormalStep) result1_bindingAndBlack[4];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_11_1_greenBBFBFFB(prevNode, step, process, csp);
		FN2S t2s = (FN2S) result1_green[2];
		SequenceFlow sf1 = (SequenceFlow) result1_green[4];
		Task task = (Task) result1_green[5];

		// collect translated elements
		Object[] result2_black = Task2StepSeqImpl.pattern_Task2StepSeq_11_2_blackBBBB(step, t2s, sf1, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[t2s] = " + t2s + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_11_2_greenFBBBB(step, t2s, sf1, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2StepSeqImpl.pattern_Task2StepSeq_11_3_blackBBBBBBBBBB(ruleresult, pn2ps, prevNode,
				flow, prevStep, step, t2s, process, sf1, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pn2ps] = " + pn2ps + ", " + "[prevNode] = " + prevNode
					+ ", " + "[flow] = " + flow + ", " + "[prevStep] = " + prevStep + ", " + "[step] = " + step + ", "
					+ "[t2s] = " + t2s + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = "
					+ task + ".");
		}
		Task2StepSeqImpl.pattern_Task2StepSeq_11_3_greenBBBBBBBBBFFFFFFFFFF(ruleresult, prevNode, flow, prevStep, step,
				t2s, process, sf1, task);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[9];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[10];
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
		Task2StepSeqImpl.pattern_Task2StepSeq_11_5_expressionBBBBBBBBBBB(this, ruleresult, pn2ps, prevNode, flow,
				prevStep, step, t2s, process, sf1, task);
		return Task2StepSeqImpl.pattern_Task2StepSeq_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2StepSeqImpl.pattern_Task2StepSeq_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Flow flow = (Flow) result2_binding[0];
		Step prevStep = (Step) result2_binding[1];
		NormalStep step = (NormalStep) result2_binding[2];
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_12_2_blackFFBBBB(flow, prevStep, step,
				match)) {
			FN2S pn2ps = (FN2S) result2_black[0];
			FlowNode prevNode = (FlowNode) result2_black[1];
			// ForEach find context
			for (Object[] result3_black : Task2StepSeqImpl.pattern_Task2StepSeq_12_3_blackBBBBBF(pn2ps, prevNode, flow,
					prevStep, step)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[5];
				Object[] result3_green = Task2StepSeqImpl.pattern_Task2StepSeq_12_3_greenBBBBBBFFFFFFF(pn2ps, prevNode,
						flow, prevStep, step, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge pn2ps__prevNode____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge pn2ps__prevStep____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_12_4_bindingAndBlackFBBBBBBBB(
						this, isApplicableMatch, pn2ps, prevNode, flow, prevStep, step, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pn2ps] = " + pn2ps + ", "
									+ "[prevNode] = " + prevNode + ", " + "[flow] = " + flow + ", " + "[prevStep] = "
									+ prevStep + ", " + "[step] = " + step + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2StepSeqImpl.pattern_Task2StepSeq_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2StepSeqImpl.pattern_Task2StepSeq_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Flow flow, Step prevStep, NormalStep step) {
		match.registerObject("flow", flow);
		match.registerObject("prevStep", prevStep);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Flow flow, Step prevStep, NormalStep step) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2S pn2ps, FlowNode prevNode, Flow flow,
			Step prevStep, NormalStep step, SimpleBPMN.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("pn2ps", pn2ps);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("step", step);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject pn2ps, EObject prevNode, EObject flow,
			EObject prevStep, EObject step, EObject t2s, EObject process, EObject sf1, EObject task) {
		ruleresult.registerObject("pn2ps", pn2ps);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("step", step);
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
				.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_5(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_20_2_blackFFFB(_edge_steps)) {
			Flow flow = (Flow) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			NormalStep step = (NormalStep) result2_black[2];
			Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepSeqImpl.pattern_Task2StepSeq_20_3_expressionFBBBBB(this, match, flow, prevStep, step)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepSeqImpl.pattern_Task2StepSeq_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_6(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_21_2_blackFFFB(_edge_next)) {
			Flow flow = (Flow) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			NormalStep step = (NormalStep) result2_black[2];
			Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepSeqImpl.pattern_Task2StepSeq_21_3_expressionFBBBBB(this, match, flow, prevStep, step)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepSeqImpl.pattern_Task2StepSeq_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_9(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_22_2_blackFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepSeqImpl.pattern_Task2StepSeq_22_3_expressionFBBBBBB(this, match, prevNode, process, sf1,
					task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepSeqImpl.pattern_Task2StepSeq_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_10(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_23_2_blackFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepSeqImpl.pattern_Task2StepSeq_23_3_expressionFBBBBBB(this, match, prevNode, process, sf1,
					task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepSeqImpl.pattern_Task2StepSeq_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_11(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_24_2_blackFFFFB(_edge_targetRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepSeqImpl.pattern_Task2StepSeq_24_3_expressionFBBBBBB(this, match, prevNode, process, sf1,
					task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepSeqImpl.pattern_Task2StepSeq_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_12(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_25_2_blackFFFFB(_edge_incoming)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepSeqImpl.pattern_Task2StepSeq_25_3_expressionFBBBBBB(this, match, prevNode, process, sf1,
					task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepSeqImpl.pattern_Task2StepSeq_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_13(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_26_2_blackFFFFB(_edge_sourceRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepSeqImpl.pattern_Task2StepSeq_26_3_expressionFBBBBBB(this, match, prevNode, process, sf1,
					task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepSeqImpl.pattern_Task2StepSeq_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_14(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepSeqImpl.pattern_Task2StepSeq_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepSeqImpl.pattern_Task2StepSeq_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepSeqImpl.pattern_Task2StepSeq_27_2_blackFFFFB(_edge_outgoing)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepSeqImpl.pattern_Task2StepSeq_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepSeqImpl.pattern_Task2StepSeq_27_3_expressionFBBBBBB(this, match, prevNode, process, sf1,
					task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepSeqImpl.pattern_Task2StepSeq_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepSeqImpl.pattern_Task2StepSeq_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepSeqImpl.pattern_Task2StepSeq_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2StepSeqImpl.pattern_Task2StepSeq_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Task2StepSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2ps")).findAny();
		bpmn2UseCase.FN2S pn2ps = (bpmn2UseCase.FN2S) matchForPn2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.Step prevStep = (SimpleUseCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		bpmn2UseCase.FN2S t2s = (bpmn2UseCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		SimpleBPMN.Task task = (SimpleBPMN.Task) matchForTask.get().getNode();

		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("Task2StepSeq");
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
		ruleResult.setRule("Task2StepSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2ps")).findAny();
		bpmn2UseCase.FN2S pn2ps = (bpmn2UseCase.FN2S) matchForPn2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.Step prevStep = (SimpleUseCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		bpmn2UseCase.FN2S t2s = (bpmn2UseCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		SimpleBPMN.Task task = (SimpleBPMN.Task) matchForTask.get().getNode();

		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("Task2StepSeq");
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
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3), (Task) arguments.get(4));
		case RulesPackage.TASK2_STEP_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3), (Task) arguments.get(4));
			return null;
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3), (Task) arguments.get(4));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2S_FLOWNODE_FLOW_STEP_PROCESS_SEQUENCEFLOW_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(FlowNode) arguments.get(2), (Flow) arguments.get(3), (Step) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (SequenceFlow) arguments.get(6), (Task) arguments.get(7));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TASK2_STEP_SEQ___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_BWD__MATCH_FLOW_STEP_NORMALSTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (Flow) arguments.get(1), (Step) arguments.get(2),
					(NormalStep) arguments.get(3));
		case RulesPackage.TASK2_STEP_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FLOW_STEP_NORMALSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Flow) arguments.get(1), (Step) arguments.get(2),
					(NormalStep) arguments.get(3));
			return null;
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FLOW_STEP_NORMALSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Flow) arguments.get(1),
					(Step) arguments.get(2), (NormalStep) arguments.get(3));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2S_FLOWNODE_FLOW_STEP_NORMALSTEP_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2S) arguments.get(1),
					(FlowNode) arguments.get(2), (Flow) arguments.get(3), (Step) arguments.get(4),
					(NormalStep) arguments.get(5), (SimpleBPMN.Process) arguments.get(6));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TASK2_STEP_SEQ___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_5((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_6((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_10((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_12((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_13__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_13((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_14__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_14((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TASK2_STEP_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Task2StepSeq_0_1_blackBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		if (!prevNode.equals(task)) {
			return new Object[] { _this, match, prevNode, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_0_2_bindingFBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, sf1, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepSeq_0_2_bindingAndBlackFBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		Object[] result_pattern_Task2StepSeq_0_2_binding = pattern_Task2StepSeq_0_2_bindingFBBBBBB(_this, match,
				prevNode, process, sf1, task);
		if (result_pattern_Task2StepSeq_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepSeq_0_2_binding[0];

			Object[] result_pattern_Task2StepSeq_0_2_black = pattern_Task2StepSeq_0_2_blackB(csp);
			if (result_pattern_Task2StepSeq_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, sf1, task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepSeq_0_3_expressionFBB(Task2StepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_0_4_blackBBBBB(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		if (!prevNode.equals(task)) {
			return new Object[] { match, prevNode, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_0_4_greenBBBBBFFFFFF(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
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

	public static final Object[] pattern_Task2StepSeq_0_5_blackBBBBB(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		if (!prevNode.equals(task)) {
			return new Object[] { match, prevNode, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_0_5_greenBBBF(Match match, FlowNode prevNode,
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

	public static final void pattern_Task2StepSeq_0_6_expressionBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, sf1, task);

	}

	public static final boolean pattern_Task2StepSeq_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_1_1_bindingFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pn2ps");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_6 = isApplicableMatch.getObject("task");
		EObject tmpPn2ps = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpTask = _localVariable_6;
		if (tmpPn2ps instanceof FN2S) {
			FN2S pn2ps = (FN2S) tmpPn2ps;
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpPrevStep instanceof Step) {
						Step prevStep = (Step) tmpPrevStep;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (tmpTask instanceof Task) {
									Task task = (Task) tmpTask;
									return new Object[] { pn2ps, prevNode, flow, prevStep, process, sf1, task,
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

	public static final Object[] pattern_Task2StepSeq_1_1_blackBBBBBBBBFB(FN2S pn2ps, FlowNode prevNode, Flow flow,
			Step prevStep, SimpleBPMN.Process process, SequenceFlow sf1, Task task, Task2StepSeq _this,
			IsApplicableMatch isApplicableMatch) {
		if (!prevNode.equals(task)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { pn2ps, prevNode, flow, prevStep, process, sf1, task, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_1_1_bindingAndBlackFFFFFFFBFB(Task2StepSeq _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2StepSeq_1_1_binding = pattern_Task2StepSeq_1_1_bindingFFFFFFFB(isApplicableMatch);
		if (result_pattern_Task2StepSeq_1_1_binding != null) {
			FN2S pn2ps = (FN2S) result_pattern_Task2StepSeq_1_1_binding[0];
			FlowNode prevNode = (FlowNode) result_pattern_Task2StepSeq_1_1_binding[1];
			Flow flow = (Flow) result_pattern_Task2StepSeq_1_1_binding[2];
			Step prevStep = (Step) result_pattern_Task2StepSeq_1_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2StepSeq_1_1_binding[4];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2StepSeq_1_1_binding[5];
			Task task = (Task) result_pattern_Task2StepSeq_1_1_binding[6];

			Object[] result_pattern_Task2StepSeq_1_1_black = pattern_Task2StepSeq_1_1_blackBBBBBBBBFB(pn2ps, prevNode,
					flow, prevStep, process, sf1, task, _this, isApplicableMatch);
			if (result_pattern_Task2StepSeq_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2StepSeq_1_1_black[8];

				return new Object[] { pn2ps, prevNode, flow, prevStep, process, sf1, task, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_1_1_greenBBFFBB(Flow flow, Step prevStep, Task task, CSP csp) {
		NormalStep step = SimpleUseCaseFactory.eINSTANCE.createNormalStep();
		FN2S t2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		flow.getSteps().add(step);
		prevStep.setNext(step);
		t2s.setTarget(step);
		t2s.setSource(task);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { flow, prevStep, step, t2s, task, csp };
	}

	public static final Object[] pattern_Task2StepSeq_1_2_blackBBBB(NormalStep step, FN2S t2s, SequenceFlow sf1,
			Task task) {
		return new Object[] { step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2StepSeq_1_2_greenFBBBB(NormalStep step, FN2S t2s, SequenceFlow sf1,
			Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(task);
		return new Object[] { ruleresult, step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2StepSeq_1_3_blackBBBBBBBBBB(PerformRuleResult ruleresult, EObject pn2ps,
			EObject prevNode, EObject flow, EObject prevStep, EObject step, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		if (!pn2ps.equals(prevNode)) {
			if (!pn2ps.equals(prevStep)) {
				if (!pn2ps.equals(step)) {
					if (!pn2ps.equals(t2s)) {
						if (!pn2ps.equals(process)) {
							if (!pn2ps.equals(sf1)) {
								if (!pn2ps.equals(task)) {
									if (!prevNode.equals(prevStep)) {
										if (!prevNode.equals(step)) {
											if (!prevNode.equals(t2s)) {
												if (!prevNode.equals(process)) {
													if (!prevNode.equals(sf1)) {
														if (!prevNode.equals(task)) {
															if (!flow.equals(pn2ps)) {
																if (!flow.equals(prevNode)) {
																	if (!flow.equals(prevStep)) {
																		if (!flow.equals(step)) {
																			if (!flow.equals(t2s)) {
																				if (!flow.equals(process)) {
																					if (!flow.equals(sf1)) {
																						if (!flow.equals(task)) {
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
																												if (!step
																														.equals(t2s)) {
																													if (!step
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
																																								pn2ps,
																																								prevNode,
																																								flow,
																																								prevStep,
																																								step,
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
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_1_3_greenBBBBBBBBBFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject prevNode, EObject flow, EObject prevStep, EObject step, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2StepSeq";
		String flow__step____steps_name_prime = "steps";
		String prevStep__step____next_name_prime = "next";
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
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(prevStep__step____next);
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
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { ruleresult, prevNode, flow, prevStep, step, t2s, process, sf1, task, flow__step____steps,
				prevStep__step____next, t2s__step____target, t2s__task____source, process__task____flowElements,
				process__sf1____flowElements, sf1__task____targetRef, task__sf1____incoming, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing };
	}

	public static final void pattern_Task2StepSeq_1_5_expressionBBBBBBBBBBB(Task2StepSeq _this,
			PerformRuleResult ruleresult, EObject pn2ps, EObject prevNode, EObject flow, EObject prevStep, EObject step,
			EObject t2s, EObject process, EObject sf1, EObject task) {
		_this.registerObjects_FWD(ruleresult, pn2ps, prevNode, flow, prevStep, step, t2s, process, sf1, task);

	}

	public static final PerformRuleResult pattern_Task2StepSeq_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_2_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_2_1_blackFBB(EClass eClass, Task2StepSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_2_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_2_1_binding = pattern_Task2StepSeq_2_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2StepSeq_2_1_binding[0];

			Object[] result_pattern_Task2StepSeq_2_1_black = pattern_Task2StepSeq_2_1_blackFBB(eClass, _this);
			if (result_pattern_Task2StepSeq_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2StepSeq_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2StepSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2StepSeq_2_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("sf1");
		EObject _localVariable_3 = match.getObject("task");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpSf1 = _localVariable_2;
		EObject tmpTask = _localVariable_3;
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpSf1 instanceof SequenceFlow) {
					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						return new Object[] { prevNode, process, sf1, task, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_2_2_blackFBFBBBB(FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(task)) {
			for (FN2S pn2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode, FN2S.class,
					"source")) {
				Step prevStep = pn2ps.getTarget();
				if (prevStep != null) {
					_result.add(new Object[] { pn2ps, prevNode, prevStep, process, sf1, task, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_2_3_blackBBFBBBB(FN2S pn2ps, FlowNode prevNode,
			Step prevStep, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(task)) {
			if (prevNode.equals(pn2ps.getSource())) {
				if (prevStep.equals(pn2ps.getTarget())) {
					if (process.getFlowElements().contains(task)) {
						if (process.getFlowElements().contains(sf1)) {
							if (process.getFlowElements().contains(prevNode)) {
								if (task.equals(sf1.getTargetRef())) {
									if (prevNode.equals(sf1.getSourceRef())) {
										for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevStep, Flow.class, "steps")) {
											_result.add(new Object[] { pn2ps, prevNode, flow, prevStep, process, sf1,
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
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_2_3_greenBBBBBBBFFFFFFFFFFF(FN2S pn2ps, FlowNode prevNode,
			Flow flow, Step prevStep, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pn2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pn2ps__prevNode____source_name_prime = "source";
		String pn2ps__prevStep____target_name_prime = "target";
		String flow__prevStep____steps_name_prime = "steps";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(pn2ps);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(task);
		pn2ps__prevNode____source.setSrc(pn2ps);
		pn2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevNode____source);
		pn2ps__prevStep____target.setSrc(pn2ps);
		pn2ps__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevStep____target);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(flow__prevStep____steps);
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
		pn2ps__prevNode____source.setName(pn2ps__prevNode____source_name_prime);
		pn2ps__prevStep____target.setName(pn2ps__prevStep____target_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { pn2ps, prevNode, flow, prevStep, process, sf1, task, isApplicableMatch,
				pn2ps__prevNode____source, pn2ps__prevStep____target, flow__prevStep____steps,
				process__task____flowElements, process__sf1____flowElements, process__prevNode____flowElements,
				sf1__task____targetRef, task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_Task2StepSeq_2_4_bindingFBBBBBBBBB(Task2StepSeq _this,
			IsApplicableMatch isApplicableMatch, FN2S pn2ps, FlowNode prevNode, Flow flow, Step prevStep,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pn2ps, prevNode, flow, prevStep,
				process, sf1, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pn2ps, prevNode, flow, prevStep, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepSeq_2_4_bindingAndBlackFBBBBBBBBB(Task2StepSeq _this,
			IsApplicableMatch isApplicableMatch, FN2S pn2ps, FlowNode prevNode, Flow flow, Step prevStep,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		Object[] result_pattern_Task2StepSeq_2_4_binding = pattern_Task2StepSeq_2_4_bindingFBBBBBBBBB(_this,
				isApplicableMatch, pn2ps, prevNode, flow, prevStep, process, sf1, task);
		if (result_pattern_Task2StepSeq_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepSeq_2_4_binding[0];

			Object[] result_pattern_Task2StepSeq_2_4_black = pattern_Task2StepSeq_2_4_blackB(csp);
			if (result_pattern_Task2StepSeq_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pn2ps, prevNode, flow, prevStep, process, sf1,
						task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepSeq_2_5_expressionFBB(Task2StepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2StepSeq_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2StepSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2StepSeq_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_10_1_blackBBBBB(Task2StepSeq _this, Match match, Flow flow,
			Step prevStep, NormalStep step) {
		if (!prevStep.equals(step)) {
			return new Object[] { _this, match, flow, prevStep, step };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_10_2_bindingFBBBBB(Task2StepSeq _this, Match match, Flow flow,
			Step prevStep, NormalStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, flow, prevStep, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, flow, prevStep, step };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepSeq_10_2_bindingAndBlackFBBBBB(Task2StepSeq _this, Match match,
			Flow flow, Step prevStep, NormalStep step) {
		Object[] result_pattern_Task2StepSeq_10_2_binding = pattern_Task2StepSeq_10_2_bindingFBBBBB(_this, match, flow,
				prevStep, step);
		if (result_pattern_Task2StepSeq_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepSeq_10_2_binding[0];

			Object[] result_pattern_Task2StepSeq_10_2_black = pattern_Task2StepSeq_10_2_blackB(csp);
			if (result_pattern_Task2StepSeq_10_2_black != null) {

				return new Object[] { csp, _this, match, flow, prevStep, step };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepSeq_10_3_expressionFBB(Task2StepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_10_4_blackBBBB(Match match, Flow flow, Step prevStep,
			NormalStep step) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, flow, prevStep, step };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_10_4_greenBBBBFF(Match match, Flow flow, Step prevStep,
			NormalStep step) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		String prevStep__step____next_name_prime = "next";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		match.getToBeTranslatedEdges().add(prevStep__step____next);
		flow__step____steps.setName(flow__step____steps_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		return new Object[] { match, flow, prevStep, step, flow__step____steps, prevStep__step____next };
	}

	public static final Object[] pattern_Task2StepSeq_10_5_blackBBBB(Match match, Flow flow, Step prevStep,
			NormalStep step) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, flow, prevStep, step };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_10_5_greenBBBF(Match match, Flow flow, Step prevStep) {
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(flow);
		match.getContextNodes().add(prevStep);
		String flow__prevStep____steps_name_prime = "steps";
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		match.getContextEdges().add(flow__prevStep____steps);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		return new Object[] { match, flow, prevStep, flow__prevStep____steps };
	}

	public static final void pattern_Task2StepSeq_10_6_expressionBBBBB(Task2StepSeq _this, Match match, Flow flow,
			Step prevStep, NormalStep step) {
		_this.registerObjectsToMatch_BWD(match, flow, prevStep, step);

	}

	public static final boolean pattern_Task2StepSeq_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_11_1_bindingFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pn2ps");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("step");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject tmpPn2ps = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpStep = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		if (tmpPn2ps instanceof FN2S) {
			FN2S pn2ps = (FN2S) tmpPn2ps;
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpPrevStep instanceof Step) {
						Step prevStep = (Step) tmpPrevStep;
						if (tmpStep instanceof NormalStep) {
							NormalStep step = (NormalStep) tmpStep;
							if (tmpProcess instanceof SimpleBPMN.Process) {
								SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
								return new Object[] { pn2ps, prevNode, flow, prevStep, step, process,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_11_1_blackBBBBBBBFB(FN2S pn2ps, FlowNode prevNode, Flow flow,
			Step prevStep, NormalStep step, SimpleBPMN.Process process, Task2StepSeq _this,
			IsApplicableMatch isApplicableMatch) {
		if (!prevStep.equals(step)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { pn2ps, prevNode, flow, prevStep, step, process, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_11_1_bindingAndBlackFFFFFFBFB(Task2StepSeq _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2StepSeq_11_1_binding = pattern_Task2StepSeq_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_Task2StepSeq_11_1_binding != null) {
			FN2S pn2ps = (FN2S) result_pattern_Task2StepSeq_11_1_binding[0];
			FlowNode prevNode = (FlowNode) result_pattern_Task2StepSeq_11_1_binding[1];
			Flow flow = (Flow) result_pattern_Task2StepSeq_11_1_binding[2];
			Step prevStep = (Step) result_pattern_Task2StepSeq_11_1_binding[3];
			NormalStep step = (NormalStep) result_pattern_Task2StepSeq_11_1_binding[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2StepSeq_11_1_binding[5];

			Object[] result_pattern_Task2StepSeq_11_1_black = pattern_Task2StepSeq_11_1_blackBBBBBBBFB(pn2ps, prevNode,
					flow, prevStep, step, process, _this, isApplicableMatch);
			if (result_pattern_Task2StepSeq_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2StepSeq_11_1_black[7];

				return new Object[] { pn2ps, prevNode, flow, prevStep, step, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_11_1_greenBBFBFFB(FlowNode prevNode, NormalStep step,
			SimpleBPMN.Process process, CSP csp) {
		FN2S t2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		Task task = SimpleBPMNFactory.eINSTANCE.createTask();
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

	public static final Object[] pattern_Task2StepSeq_11_2_blackBBBB(NormalStep step, FN2S t2s, SequenceFlow sf1,
			Task task) {
		return new Object[] { step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2StepSeq_11_2_greenFBBBB(NormalStep step, FN2S t2s, SequenceFlow sf1,
			Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getCreatedElements().add(task);
		return new Object[] { ruleresult, step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2StepSeq_11_3_blackBBBBBBBBBB(PerformRuleResult ruleresult, EObject pn2ps,
			EObject prevNode, EObject flow, EObject prevStep, EObject step, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		if (!pn2ps.equals(prevNode)) {
			if (!pn2ps.equals(prevStep)) {
				if (!pn2ps.equals(step)) {
					if (!pn2ps.equals(t2s)) {
						if (!pn2ps.equals(process)) {
							if (!pn2ps.equals(sf1)) {
								if (!pn2ps.equals(task)) {
									if (!prevNode.equals(prevStep)) {
										if (!prevNode.equals(step)) {
											if (!prevNode.equals(t2s)) {
												if (!prevNode.equals(process)) {
													if (!prevNode.equals(sf1)) {
														if (!prevNode.equals(task)) {
															if (!flow.equals(pn2ps)) {
																if (!flow.equals(prevNode)) {
																	if (!flow.equals(prevStep)) {
																		if (!flow.equals(step)) {
																			if (!flow.equals(t2s)) {
																				if (!flow.equals(process)) {
																					if (!flow.equals(sf1)) {
																						if (!flow.equals(task)) {
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
																												if (!step
																														.equals(t2s)) {
																													if (!step
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
																																								pn2ps,
																																								prevNode,
																																								flow,
																																								prevStep,
																																								step,
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
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_11_3_greenBBBBBBBBBFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject prevNode, EObject flow, EObject prevStep, EObject step, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2StepSeq";
		String flow__step____steps_name_prime = "steps";
		String prevStep__step____next_name_prime = "next";
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
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(prevStep__step____next);
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
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { ruleresult, prevNode, flow, prevStep, step, t2s, process, sf1, task, flow__step____steps,
				prevStep__step____next, t2s__step____target, t2s__task____source, process__task____flowElements,
				process__sf1____flowElements, sf1__task____targetRef, task__sf1____incoming, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing };
	}

	public static final void pattern_Task2StepSeq_11_5_expressionBBBBBBBBBBB(Task2StepSeq _this,
			PerformRuleResult ruleresult, EObject pn2ps, EObject prevNode, EObject flow, EObject prevStep, EObject step,
			EObject t2s, EObject process, EObject sf1, EObject task) {
		_this.registerObjects_BWD(ruleresult, pn2ps, prevNode, flow, prevStep, step, t2s, process, sf1, task);

	}

	public static final PerformRuleResult pattern_Task2StepSeq_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_12_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_12_1_blackFBB(EClass eClass, Task2StepSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_12_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_12_1_binding = pattern_Task2StepSeq_12_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2StepSeq_12_1_binding[0];

			Object[] result_pattern_Task2StepSeq_12_1_black = pattern_Task2StepSeq_12_1_blackFBB(eClass, _this);
			if (result_pattern_Task2StepSeq_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2StepSeq_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2StepSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2StepSeq_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("flow");
		EObject _localVariable_1 = match.getObject("prevStep");
		EObject _localVariable_2 = match.getObject("step");
		EObject tmpFlow = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpPrevStep instanceof Step) {
				Step prevStep = (Step) tmpPrevStep;
				if (tmpStep instanceof NormalStep) {
					NormalStep step = (NormalStep) tmpStep;
					return new Object[] { flow, prevStep, step, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_12_2_blackFFBBBB(Flow flow, Step prevStep,
			NormalStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			for (FN2S pn2ps : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevStep, FN2S.class,
					"target")) {
				FlowNode prevNode = pn2ps.getSource();
				if (prevNode != null) {
					_result.add(new Object[] { pn2ps, prevNode, flow, prevStep, step, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_12_3_blackBBBBBF(FN2S pn2ps, FlowNode prevNode,
			Flow flow, Step prevStep, NormalStep step) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			if (prevNode.equals(pn2ps.getSource())) {
				if (prevStep.equals(pn2ps.getTarget())) {
					if (flow.getSteps().contains(prevStep)) {
						if (flow.getSteps().contains(step)) {
							if (step.equals(prevStep.getNext())) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
												"flowElements")) {
									_result.add(new Object[] { pn2ps, prevNode, flow, prevStep, step, process });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_12_3_greenBBBBBBFFFFFFF(FN2S pn2ps, FlowNode prevNode, Flow flow,
			Step prevStep, NormalStep step, SimpleBPMN.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pn2ps__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pn2ps__prevNode____source_name_prime = "source";
		String pn2ps__prevStep____target_name_prime = "target";
		String flow__prevStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String prevStep__step____next_name_prime = "next";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(pn2ps);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(process);
		pn2ps__prevNode____source.setSrc(pn2ps);
		pn2ps__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevNode____source);
		pn2ps__prevStep____target.setSrc(pn2ps);
		pn2ps__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(pn2ps__prevStep____target);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(flow__prevStep____steps);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(prevStep__step____next);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		pn2ps__prevNode____source.setName(pn2ps__prevNode____source_name_prime);
		pn2ps__prevStep____target.setName(pn2ps__prevStep____target_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { pn2ps, prevNode, flow, prevStep, step, process, isApplicableMatch,
				pn2ps__prevNode____source, pn2ps__prevStep____target, flow__prevStep____steps, flow__step____steps,
				prevStep__step____next, process__prevNode____flowElements };
	}

	public static final Object[] pattern_Task2StepSeq_12_4_bindingFBBBBBBBB(Task2StepSeq _this,
			IsApplicableMatch isApplicableMatch, FN2S pn2ps, FlowNode prevNode, Flow flow, Step prevStep,
			NormalStep step, SimpleBPMN.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pn2ps, prevNode, flow, prevStep, step,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pn2ps, prevNode, flow, prevStep, step, process };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepSeq_12_4_bindingAndBlackFBBBBBBBB(Task2StepSeq _this,
			IsApplicableMatch isApplicableMatch, FN2S pn2ps, FlowNode prevNode, Flow flow, Step prevStep,
			NormalStep step, SimpleBPMN.Process process) {
		Object[] result_pattern_Task2StepSeq_12_4_binding = pattern_Task2StepSeq_12_4_bindingFBBBBBBBB(_this,
				isApplicableMatch, pn2ps, prevNode, flow, prevStep, step, process);
		if (result_pattern_Task2StepSeq_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepSeq_12_4_binding[0];

			Object[] result_pattern_Task2StepSeq_12_4_black = pattern_Task2StepSeq_12_4_blackB(csp);
			if (result_pattern_Task2StepSeq_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pn2ps, prevNode, flow, prevStep, step, process };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepSeq_12_5_expressionFBB(Task2StepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2StepSeq_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2StepSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2StepSeq_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_20_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_20_1_blackFBB(EClass __eClass, Task2StepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_20_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_20_1_binding = pattern_Task2StepSeq_20_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepSeq_20_1_binding[0];

			Object[] result_pattern_Task2StepSeq_20_1_black = pattern_Task2StepSeq_20_1_blackFBB(__eClass, _this);
			if (result_pattern_Task2StepSeq_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepSeq_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepSeq_20_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_250055 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_250055)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_20_2_black_nac_1BB(NormalStep step, Step prevStep) {
		if (!prevStep.equals(step)) {
			for (Step __DEC_step_next_224620 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_224620)) {
					if (!prevStep.equals(__DEC_step_next_224620)) {
						return new Object[] { step, prevStep };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_20_2_blackFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_Task2StepSeq_20_2_black_nac_0BB(step, flow) == null) {
						for (Step prevStep : flow.getSteps()) {
							if (!prevStep.equals(step)) {
								if (step.equals(prevStep.getNext())) {
									if (pattern_Task2StepSeq_20_2_black_nac_1BB(step, prevStep) == null) {
										_result.add(new Object[] { flow, prevStep, step, _edge_steps });
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

	public static final Object[] pattern_Task2StepSeq_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepSeq_20_3_expressionFBBBBB(Task2StepSeq _this, Match match, Flow flow,
			Step prevStep, NormalStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow, prevStep, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_20_4_expressionFBB(Task2StepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepSeq_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepSeq_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_21_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_21_1_blackFBB(EClass __eClass, Task2StepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_21_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_21_1_binding = pattern_Task2StepSeq_21_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepSeq_21_1_binding[0];

			Object[] result_pattern_Task2StepSeq_21_1_black = pattern_Task2StepSeq_21_1_blackFBB(__eClass, _this);
			if (result_pattern_Task2StepSeq_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepSeq_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepSeq_21_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_812173 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_812173)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_21_2_black_nac_1BB(NormalStep step, Step prevStep) {
		if (!prevStep.equals(step)) {
			for (Step __DEC_step_next_450789 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_450789)) {
					if (!prevStep.equals(__DEC_step_next_450789)) {
						return new Object[] { step, prevStep };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_21_2_blackFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (!prevStep.equals(step)) {
					if (step.equals(prevStep.getNext())) {
						if (pattern_Task2StepSeq_21_2_black_nac_1BB(step, prevStep) == null) {
							for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevStep, Flow.class, "steps")) {
								if (flow.getSteps().contains(step)) {
									if (pattern_Task2StepSeq_21_2_black_nac_0BB(step, flow) == null) {
										_result.add(new Object[] { flow, prevStep, step, _edge_next });
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

	public static final Object[] pattern_Task2StepSeq_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepSeq_21_3_expressionFBBBBB(Task2StepSeq _this, Match match, Flow flow,
			Step prevStep, NormalStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, flow, prevStep, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_21_4_expressionFBB(Task2StepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepSeq_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepSeq_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_22_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_22_1_blackFBB(EClass __eClass, Task2StepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_22_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_22_1_binding = pattern_Task2StepSeq_22_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepSeq_22_1_binding[0];

			Object[] result_pattern_Task2StepSeq_22_1_black = pattern_Task2StepSeq_22_1_blackFBB(__eClass, _this);
			if (result_pattern_Task2StepSeq_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepSeq_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepSeq_22_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_77202 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_77202)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_22_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_125904 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_125904)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_22_2_black_nac_2BB(Task task, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_492145 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_492145)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_22_2_blackFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (process.getFlowElements().contains(task)) {
					if (pattern_Task2StepSeq_22_2_black_nac_2BB(task, process) == null) {
						for (FlowElement tmpSf1 : process.getFlowElements()) {
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (task.equals(sf1.getTargetRef())) {
									FlowNode prevNode = sf1.getSourceRef();
									if (prevNode != null) {
										if (!prevNode.equals(task)) {
											if (process.getFlowElements().contains(prevNode)) {
												if (pattern_Task2StepSeq_22_2_black_nac_1BB(sf1, process) == null) {
													if (pattern_Task2StepSeq_22_2_black_nac_0BB(sf1,
															prevNode) == null) {
														_result.add(new Object[] { prevNode, process, sf1, task,
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

	public static final Object[] pattern_Task2StepSeq_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepSeq_22_3_expressionFBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_22_4_expressionFBB(Task2StepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepSeq_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepSeq_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_23_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_23_1_blackFBB(EClass __eClass, Task2StepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_23_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_23_1_binding = pattern_Task2StepSeq_23_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepSeq_23_1_binding[0];

			Object[] result_pattern_Task2StepSeq_23_1_black = pattern_Task2StepSeq_23_1_blackFBB(__eClass, _this);
			if (result_pattern_Task2StepSeq_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepSeq_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepSeq_23_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_115898 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_115898)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_23_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_477559 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_477559)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_23_2_black_nac_2BB(Task task, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_443459 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_443459)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_23_2_blackFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode tmpTask = sf1.getTargetRef();
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						if (process.getFlowElements().contains(task)) {
							FlowNode prevNode = sf1.getSourceRef();
							if (prevNode != null) {
								if (!prevNode.equals(task)) {
									if (process.getFlowElements().contains(prevNode)) {
										if (pattern_Task2StepSeq_23_2_black_nac_1BB(sf1, process) == null) {
											if (pattern_Task2StepSeq_23_2_black_nac_2BB(task, process) == null) {
												if (pattern_Task2StepSeq_23_2_black_nac_0BB(sf1, prevNode) == null) {
													_result.add(new Object[] { prevNode, process, sf1, task,
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

	public static final Object[] pattern_Task2StepSeq_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepSeq_23_3_expressionFBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_23_4_expressionFBB(Task2StepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepSeq_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepSeq_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_24_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_24_1_blackFBB(EClass __eClass, Task2StepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_24_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_24_1_binding = pattern_Task2StepSeq_24_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepSeq_24_1_binding[0];

			Object[] result_pattern_Task2StepSeq_24_1_black = pattern_Task2StepSeq_24_1_blackFBB(__eClass, _this);
			if (result_pattern_Task2StepSeq_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepSeq_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepSeq_24_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_642290 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_642290)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_24_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_426592 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_426592)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_24_2_black_nac_2BB(Task task, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_901792 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_901792)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_24_2_blackFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpTask = _edge_targetRef.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (task.equals(sf1.getTargetRef())) {
					FlowNode prevNode = sf1.getSourceRef();
					if (prevNode != null) {
						if (!prevNode.equals(task)) {
							if (pattern_Task2StepSeq_24_2_black_nac_0BB(sf1, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(task)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (pattern_Task2StepSeq_24_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_Task2StepSeq_24_2_black_nac_2BB(task, process) == null) {
													_result.add(new Object[] { prevNode, process, sf1, task,
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

	public static final Object[] pattern_Task2StepSeq_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepSeq_24_3_expressionFBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_24_4_expressionFBB(Task2StepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepSeq_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepSeq_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_25_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_25_1_blackFBB(EClass __eClass, Task2StepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_25_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_25_1_binding = pattern_Task2StepSeq_25_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepSeq_25_1_binding[0];

			Object[] result_pattern_Task2StepSeq_25_1_black = pattern_Task2StepSeq_25_1_blackFBB(__eClass, _this);
			if (result_pattern_Task2StepSeq_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepSeq_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepSeq_25_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_205670 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_205670)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_25_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_8993 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_8993)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_25_2_black_nac_2BB(Task task, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_555186 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_555186)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_25_2_blackFFFFB(EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_incoming.getSrc();
		if (tmpTask instanceof Task) {
			Task task = (Task) tmpTask;
			EObject tmpSf1 = _edge_incoming.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (task.equals(sf1.getTargetRef())) {
					FlowNode prevNode = sf1.getSourceRef();
					if (prevNode != null) {
						if (!prevNode.equals(task)) {
							if (pattern_Task2StepSeq_25_2_black_nac_0BB(sf1, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(sf1)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (pattern_Task2StepSeq_25_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_Task2StepSeq_25_2_black_nac_2BB(task, process) == null) {
													_result.add(new Object[] { prevNode, process, sf1, task,
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

	public static final Object[] pattern_Task2StepSeq_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepSeq_25_3_expressionFBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_25_4_expressionFBB(Task2StepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepSeq_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepSeq_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_26_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_26_1_blackFBB(EClass __eClass, Task2StepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_26_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_26_1_binding = pattern_Task2StepSeq_26_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepSeq_26_1_binding[0];

			Object[] result_pattern_Task2StepSeq_26_1_black = pattern_Task2StepSeq_26_1_blackFBB(__eClass, _this);
			if (result_pattern_Task2StepSeq_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepSeq_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepSeq_26_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_407407 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_407407)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_26_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_822221 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_822221)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_26_2_black_nac_2BB(Task task, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_885437 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_885437)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_26_2_blackFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					FlowNode tmpTask = sf1.getTargetRef();
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						if (!prevNode.equals(task)) {
							if (pattern_Task2StepSeq_26_2_black_nac_0BB(sf1, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
									if (process.getFlowElements().contains(task)) {
										if (process.getFlowElements().contains(prevNode)) {
											if (pattern_Task2StepSeq_26_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_Task2StepSeq_26_2_black_nac_2BB(task, process) == null) {
													_result.add(new Object[] { prevNode, process, sf1, task,
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

	public static final Object[] pattern_Task2StepSeq_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepSeq_26_3_expressionFBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_26_4_expressionFBB(Task2StepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepSeq_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepSeq_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_27_1_bindingFB(Task2StepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_27_1_blackFBB(EClass __eClass, Task2StepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_27_1_bindingAndBlackFFB(Task2StepSeq _this) {
		Object[] result_pattern_Task2StepSeq_27_1_binding = pattern_Task2StepSeq_27_1_bindingFB(_this);
		if (result_pattern_Task2StepSeq_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepSeq_27_1_binding[0];

			Object[] result_pattern_Task2StepSeq_27_1_black = pattern_Task2StepSeq_27_1_blackFBB(__eClass, _this);
			if (result_pattern_Task2StepSeq_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepSeq_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepSeq_27_2_black_nac_0BB(SequenceFlow sf1, FlowNode prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_880106 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_880106)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_27_2_black_nac_1BB(SequenceFlow sf1, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_304236 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_304236)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepSeq_27_2_black_nac_2BB(Task task, SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_477563 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_477563)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepSeq_27_2_blackFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof FlowNode) {
			FlowNode prevNode = (FlowNode) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					FlowNode tmpTask = sf1.getTargetRef();
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						if (!prevNode.equals(task)) {
							if (pattern_Task2StepSeq_27_2_black_nac_0BB(sf1, prevNode) == null) {
								for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
												"flowElements")) {
									if (process.getFlowElements().contains(task)) {
										if (process.getFlowElements().contains(sf1)) {
											if (pattern_Task2StepSeq_27_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_Task2StepSeq_27_2_black_nac_2BB(task, process) == null) {
													_result.add(new Object[] { prevNode, process, sf1, task,
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

	public static final Object[] pattern_Task2StepSeq_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepSeq_27_3_expressionFBBBBBB(Task2StepSeq _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepSeq_27_4_expressionFBB(Task2StepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepSeq_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepSeq_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepSeq_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Task2StepSeqImpl
