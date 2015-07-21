/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;
import Bpmn2UseCase.FN2F;
import Bpmn2UseCase.FN2S;

import Bpmn2UseCase.Rules.RulesPackage;
import Bpmn2UseCase.Rules.Task2NormalStepFirst;

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
 * An implementation of the model object '<em><b>Task2 Normal Step First</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Task2NormalStepFirstImpl extends AbstractRuleImpl implements Task2NormalStepFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task2NormalStepFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTask2NormalStepFirst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1,
			Task task) {
		// initial bindings
		Object[] result1_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_0_1_blackBBBBBB(this, match,
				prevNode, process, sf1, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_0_2_bindingAndBlackFBBBBBB(this, match, prevNode, process, sf1, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_0_4_blackBBBBB(match,
					prevNode, process, sf1, task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
			}
			Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_0_4_greenBBBBBFFFFFF(match, prevNode, process, sf1,
					task);
					// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[5];
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result4_green[7];
					// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_0_5_blackBBBBB(match,
					prevNode, process, sf1, task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
			}
			Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_0_6_expressionBBBBBB(this, match, prevNode, process,
					sf1, task);
			return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_0_7_expressionF();
		} else {
			return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_1_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2F pnToFlow = (FN2F) result1_bindingAndBlack[0];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[1];
		Flow flow = (Flow) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[4];
		Task task = (Task) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_1_1_greenFBFBB(flow, task, csp);
		NormalStep step = (NormalStep) result1_green[0];
		FN2S t2s = (FN2S) result1_green[2];

		// collect translated elements
		Object[] result2_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_1_2_blackBBBB(step, t2s, sf1,
				task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[t2s] = " + t2s + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_1_2_greenFBBBB(step, t2s, sf1,
				task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_1_3_blackBBBBBBBBB(ruleresult,
				pnToFlow, step, prevNode, flow, t2s, process, sf1, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pnToFlow] = " + pnToFlow + ", " + "[step] = " + step
					+ ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow + ", " + "[t2s] = " + t2s + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_1_3_greenBBBBBBBBFFFFFFFFF(ruleresult, step, prevNode,
				flow, t2s, process, sf1, task);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[15];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[16];

		// perform postprocessing story node is empty
		// register objects
		Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_1_5_expressionBBBBBBBBBB(this, ruleresult, pnToFlow, step,
				prevNode, flow, t2s, process, sf1, task);
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		FlowNode prevNode = (FlowNode) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		Task task = (Task) result2_binding[3];
		for (Object[] result2_black : Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_2_2_blackFBFBBBB(prevNode,
				process, sf1, task, match)) {
			FN2F pnToFlow = (FN2F) result2_black[0];
			Flow flow = (Flow) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : Task2NormalStepFirstImpl
					.pattern_Task2NormalStepFirst_2_3_blackBBBBBB(pnToFlow, prevNode, flow, process, sf1, task)) {
				Object[] result3_green = Task2NormalStepFirstImpl
						.pattern_Task2NormalStepFirst_2_3_greenBBBBBBFFFFFFFFFF(pnToFlow, prevNode, flow, process, sf1,
								task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge pnToFlow__prevNode____source = (EMoflonEdge) result3_green[7];
				// EMoflonEdge pnToFlow__flow____target = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[9];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[13];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2NormalStepFirstImpl
						.pattern_Task2NormalStepFirst_2_4_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, pnToFlow,
								prevNode, flow, process, sf1, task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pnToFlow] = " + pnToFlow + ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow
							+ ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2NormalStepFirstImpl
							.pattern_Task2NormalStepFirst_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode,
			Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {// Create CSP
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
		isApplicableMatch.registerObject("pnToFlow", pnToFlow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode,
			EObject flow, EObject t2s, EObject process, EObject sf1, EObject task) {
		ruleresult.registerObject("pnToFlow", pnToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("flow", flow);
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
	public boolean isAppropriate_BWD(Match match, NormalStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_10_1_blackBBBB(this, match, step,
				flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_10_2_bindingAndBlackFBBBB(this, match, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_10_4_blackBBB(match, step,
					flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed." + " Variables: "
								+ "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_10_4_greenBBBF(match, step, flow);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_10_5_blackBBB(match, step,
					flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_10_5_greenBB(match, flow);

			// register objects to match
			Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_10_6_expressionBBBB(this, match, step, flow);
			return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_10_7_expressionF();
		} else {
			return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_11_1_bindingAndBlackFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		FN2F pnToFlow = (FN2F) result1_bindingAndBlack[0];
		NormalStep step = (NormalStep) result1_bindingAndBlack[1];
		FlowNode prevNode = (FlowNode) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_11_1_greenBBFBFFB(step, prevNode,
				process, csp);
		FN2S t2s = (FN2S) result1_green[2];
		SequenceFlow sf1 = (SequenceFlow) result1_green[4];
		Task task = (Task) result1_green[5];

		// collect translated elements
		Object[] result2_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_11_2_blackBBBB(step, t2s, sf1,
				task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[t2s] = " + t2s + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_11_2_greenFBBBB(step, t2s, sf1,
				task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_11_3_blackBBBBBBBBB(ruleresult,
				pnToFlow, step, prevNode, flow, t2s, process, sf1, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[pnToFlow] = " + pnToFlow + ", " + "[step] = " + step
					+ ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow + ", " + "[t2s] = " + t2s + ", "
					+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[task] = " + task + ".");
		}
		Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_11_3_greenBBBBBBBBFFFFFFFFF(ruleresult, step, prevNode,
				flow, t2s, process, sf1, task);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[15];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[16];

		// perform postprocessing story node is empty
		// register objects
		Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_11_5_expressionBBBBBBBBBB(this, ruleresult, pnToFlow,
				step, prevNode, flow, t2s, process, sf1, task);
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		NormalStep step = (NormalStep) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		for (Object[] result2_black : Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_12_2_blackFBFBB(step, flow,
				match)) {
			FN2F pnToFlow = (FN2F) result2_black[0];
			FlowNode prevNode = (FlowNode) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : Task2NormalStepFirstImpl
					.pattern_Task2NormalStepFirst_12_3_blackBBBBF(pnToFlow, step, prevNode, flow)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[4];
				Object[] result3_green = Task2NormalStepFirstImpl
						.pattern_Task2NormalStepFirst_12_3_greenBBBBBFFFFF(pnToFlow, step, prevNode, flow, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge pnToFlow__prevNode____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge pnToFlow__flow____target = (EMoflonEdge) result3_green[7];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2NormalStepFirstImpl
						.pattern_Task2NormalStepFirst_12_4_bindingAndBlackFBBBBBBB(this, isApplicableMatch, pnToFlow,
								step, prevNode, flow, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[pnToFlow] = " + pnToFlow + ", " + "[step] = " + step + ", " + "[prevNode] = " + prevNode
							+ ", " + "[flow] = " + flow + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2NormalStepFirstImpl
							.pattern_Task2NormalStepFirst_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NormalStep step, Flow flow) {
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep step, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2F pnToFlow, NormalStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("pnToFlow", pnToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("prevNode", prevNode);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode,
			EObject flow, EObject t2s, EObject process, EObject sf1, EObject task) {
		ruleresult.registerObject("pnToFlow", pnToFlow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("flow", flow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_25(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_20_2_blackFFB(_edge_steps)) {
			NormalStep step = (NormalStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_20_3_expressionFBBBB(this, match, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_75(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_21_2_blackFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_21_3_expressionFBBBBBB(this, match, prevNode,
					process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_76(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_22_2_blackFFFFB(_edge_flowElements)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_22_3_expressionFBBBBBB(this, match, prevNode,
					process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_77(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_23_2_blackFFFFB(_edge_targetRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_23_3_expressionFBBBBBB(this, match, prevNode,
					process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_78(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_24_2_blackFFFFB(_edge_incoming)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_24_3_expressionFBBBBBB(this, match, prevNode,
					process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_79(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_25_2_blackFFFFB(_edge_sourceRef)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_25_3_expressionFBBBBBB(this, match, prevNode,
					process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_80(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_26_2_blackFFFFB(_edge_outgoing)) {
			FlowNode prevNode = (FlowNode) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_26_3_expressionFBBBBBB(this, match, prevNode,
					process, sf1, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Task2NormalStepFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPnToFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pnToFlow")).findAny();
		Bpmn2UseCase.FN2F pnToFlow = (Bpmn2UseCase.FN2F) matchForPnToFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		Bpmn2UseCase.FN2S t2s = (Bpmn2UseCase.FN2S) matchForT2s.get().getNode();

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

		eq0.setRuleName("Task2NormalStepFirst");
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
		ruleResult.setRule("Task2NormalStepFirst");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPnToFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pnToFlow")).findAny();
		Bpmn2UseCase.FN2F pnToFlow = (Bpmn2UseCase.FN2F) matchForPnToFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		SimpleBPMN.FlowNode prevNode = (SimpleBPMN.FlowNode) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		Bpmn2UseCase.FN2S t2s = (Bpmn2UseCase.FN2S) matchForT2s.get().getNode();

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

		eq0.setRuleName("Task2NormalStepFirst");
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
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// prepare
		Object[] result1_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_29_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_29_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_29_2_bindingFFFFFFBB(targetMatch, sourceMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed." + " Variables: " + "[targetMatch] = "
					+ targetMatch + ", " + "[sourceMatch] = " + sourceMatch + ".");
		}
		NormalStep step = (NormalStep) result2_binding[0];
		FlowNode prevNode = (FlowNode) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		Task task = (Task) result2_binding[5];
		for (Object[] result2_black : Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_29_2_blackFBBBBBBBB(step,
				prevNode, flow, process, sf1, task, sourceMatch, targetMatch)) {
			FN2F pnToFlow = (FN2F) result2_black[0];
			Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_29_2_greenBBBBBBBBBF(
					pnToFlow, step, prevNode, flow, process, sf1, task, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[9];

			// check csp
			Object[] result3_bindingAndBlack = Task2NormalStepFirstImpl
					.pattern_Task2NormalStepFirst_29_3_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, pnToFlow,
							step, prevNode, flow, process, sf1, task, sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_29_4_blackBB(result,
						isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed." + " Variables: " + "[result] = "
									+ result + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
				}
				Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_29_4_greenBB(result, isApplicableMatch);

			} else {
			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_29_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch, FN2F pnToFlow, NormalStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, Task task, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pnToFlow", pnToFlow);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("flow", flow);
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
		Object[] result1_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_32_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed." + " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_32_2_bindingAndBlackFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [create correspondence links] failed." + " Variables: "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		// FN2F pnToFlow = (FN2F) result2_bindingAndBlack[0];
		NormalStep step = (NormalStep) result2_bindingAndBlack[1];
		// FlowNode prevNode = (FlowNode) result2_bindingAndBlack[2];
		// Flow flow = (Flow) result2_bindingAndBlack[3];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[4];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[5];
		Task task = (Task) result2_bindingAndBlack[6];
		Object[] result2_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_32_2_greenBBFF(step, task);
		PerformRuleResult result = (PerformRuleResult) result2_green[2];
		// FN2S t2s = (FN2S) result2_green[3];

		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_32_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, FN2F pnToFlowParameter) {
		// create result
		Object[] result1_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_33_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_33_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : Task2NormalStepFirstImpl
				.pattern_Task2NormalStepFirst_33_2_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			// RuleEntryList pnToFlowList = (RuleEntryList) result2_black[0];
			FN2F pnToFlow = (FN2F) result2_black[1];
			FlowNode prevNode = (FlowNode) result2_black[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[3];
			Flow flow = (Flow) result2_black[4];

			// solve CSP
			Object[] result3_bindingAndBlack = Task2NormalStepFirstImpl
					.pattern_Task2NormalStepFirst_33_3_bindingAndBlackFBBBBBBB(this, isApplicableMatch, pnToFlow,
							prevNode, flow, process, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = "
						+ this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pnToFlow] = " + pnToFlow
						+ ", " + "[prevNode] = " + prevNode + ", " + "[flow] = " + flow + ", " + "[process] = "
						+ process + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_33_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_33_5_blackBBBB(flow,
						pnToFlow, prevNode, process);
				if (result5_black != null) {

					// perform
					Object[] result6_black = Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_33_6_blackBBBBB(
							pnToFlow, prevNode, flow, process, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [perform] failed." + " Variables: "
								+ "[pnToFlow] = " + pnToFlow + ", " + "[prevNode] = " + prevNode + ", " + "[flow] = "
								+ flow + ", " + "[process] = " + process + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_33_6_greenFBBFBFFBB(prevNode, flow, process,
							ruleResult, csp);
					// NormalStep step = (NormalStep) result6_green[0];
					// FN2S t2s = (FN2S) result6_green[3];
					// SequenceFlow sf1 = (SequenceFlow) result6_green[5];
					// Task task = (Task) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepFirstImpl.pattern_Task2NormalStepFirst_33_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode,
			Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", csp);
		var_task_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pnToFlow", pnToFlow);
		isApplicableMatch.registerObject("prevNode", prevNode);
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
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3), (Task) arguments.get(4));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3), (Task) arguments.get(4));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_FLOWNODE_PROCESS_SEQUENCEFLOW_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (FlowNode) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3), (Task) arguments.get(4));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(FlowNode) arguments.get(2), (Flow) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(SequenceFlow) arguments.get(5), (Task) arguments.get(6));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1), (Flow) arguments.get(2));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(Flow) arguments.get(2));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(Flow) arguments.get(2));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_NORMALSTEP_FLOWNODE_FLOW_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(NormalStep) arguments.get(2), (FlowNode) arguments.get(3), (Flow) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_25((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_75__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_75((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_76__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_76((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_77__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_77((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_78__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_78((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_79__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_79((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_80__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_80((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_FN2F_NORMALSTEP_FLOWNODE_FLOW_PROCESS_SEQUENCEFLOW_TASK_MATCH_MATCH:
			return isApplicable_solveCsp_CC((IsApplicableMatchCC) arguments.get(0), (FN2F) arguments.get(1),
					(NormalStep) arguments.get(2), (FlowNode) arguments.get(3), (Flow) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5), (SequenceFlow) arguments.get(6), (Task) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_FN2F:
			return generateModel((RuleEntryContainer) arguments.get(0), (FN2F) arguments.get(1));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_FN2F_FLOWNODE_FLOW_PROCESS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (FN2F) arguments.get(1),
					(FlowNode) arguments.get(2), (Flow) arguments.get(3), (SimpleBPMN.Process) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.TASK2_NORMAL_STEP_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Task2NormalStepFirst_0_1_blackBBBBBB(Task2NormalStepFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		if (!prevNode.equals(task)) {
			return new Object[] { _this, match, prevNode, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_0_2_bindingFBBBBBB(Task2NormalStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, sf1, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepFirst_0_2_bindingAndBlackFBBBBBB(Task2NormalStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		Object[] result_pattern_Task2NormalStepFirst_0_2_binding = pattern_Task2NormalStepFirst_0_2_bindingFBBBBBB(
				_this, match, prevNode, process, sf1, task);
		if (result_pattern_Task2NormalStepFirst_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepFirst_0_2_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_0_2_black = pattern_Task2NormalStepFirst_0_2_blackB(csp);
			if (result_pattern_Task2NormalStepFirst_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, sf1, task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepFirst_0_3_expressionFBB(Task2NormalStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_0_4_blackBBBBB(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		if (!prevNode.equals(task)) {
			return new Object[] { match, prevNode, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_0_4_greenBBBBBFFFFFF(Match match, FlowNode prevNode,
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

	public static final Object[] pattern_Task2NormalStepFirst_0_5_blackBBBBB(Match match, FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		if (!prevNode.equals(task)) {
			return new Object[] { match, prevNode, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_0_5_greenBBBF(Match match, FlowNode prevNode,
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

	public static final void pattern_Task2NormalStepFirst_0_6_expressionBBBBBB(Task2NormalStepFirst _this, Match match,
			FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, sf1, task);

	}

	public static final boolean pattern_Task2NormalStepFirst_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepFirst_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_1_1_bindingFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pnToFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("flow");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_5 = isApplicableMatch.getObject("task");
		EObject tmpPnToFlow = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpTask = _localVariable_5;
		if (tmpPnToFlow instanceof FN2F) {
			FN2F pnToFlow = (FN2F) tmpPnToFlow;
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpTask instanceof Task) {
								Task task = (Task) tmpTask;
								return new Object[] { pnToFlow, prevNode, flow, process, sf1, task, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_1_1_blackBBBBBBBFB(FN2F pnToFlow, FlowNode prevNode,
			Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, Task task, Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch) {
		if (!prevNode.equals(task)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { pnToFlow, prevNode, flow, process, sf1, task, _this, csp, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_1_1_bindingAndBlackFFFFFFBFB(Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2NormalStepFirst_1_1_binding = pattern_Task2NormalStepFirst_1_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2NormalStepFirst_1_1_binding != null) {
			FN2F pnToFlow = (FN2F) result_pattern_Task2NormalStepFirst_1_1_binding[0];
			FlowNode prevNode = (FlowNode) result_pattern_Task2NormalStepFirst_1_1_binding[1];
			Flow flow = (Flow) result_pattern_Task2NormalStepFirst_1_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2NormalStepFirst_1_1_binding[3];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2NormalStepFirst_1_1_binding[4];
			Task task = (Task) result_pattern_Task2NormalStepFirst_1_1_binding[5];

			Object[] result_pattern_Task2NormalStepFirst_1_1_black = pattern_Task2NormalStepFirst_1_1_blackBBBBBBBFB(
					pnToFlow, prevNode, flow, process, sf1, task, _this, isApplicableMatch);
			if (result_pattern_Task2NormalStepFirst_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2NormalStepFirst_1_1_black[7];

				return new Object[] { pnToFlow, prevNode, flow, process, sf1, task, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_1_1_greenFBFBB(Flow flow, Task task, CSP csp) {
		NormalStep step = SimpleUseCaseFactory.eINSTANCE.createNormalStep();
		FN2S t2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		flow.getSteps().add(step);
		t2s.setTarget(step);
		t2s.setSource(task);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { step, flow, t2s, task, csp };
	}

	public static final Object[] pattern_Task2NormalStepFirst_1_2_blackBBBB(NormalStep step, FN2S t2s, SequenceFlow sf1,
			Task task) {
		return new Object[] { step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2NormalStepFirst_1_2_greenFBBBB(NormalStep step, FN2S t2s,
			SequenceFlow sf1, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(task);
		return new Object[] { ruleresult, step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2NormalStepFirst_1_3_blackBBBBBBBBB(PerformRuleResult ruleresult,
			EObject pnToFlow, EObject step, EObject prevNode, EObject flow, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		if (!pnToFlow.equals(step)) {
			if (!pnToFlow.equals(prevNode)) {
				if (!pnToFlow.equals(t2s)) {
					if (!pnToFlow.equals(process)) {
						if (!pnToFlow.equals(sf1)) {
							if (!pnToFlow.equals(task)) {
								if (!step.equals(t2s)) {
									if (!step.equals(task)) {
										if (!prevNode.equals(step)) {
											if (!prevNode.equals(t2s)) {
												if (!prevNode.equals(process)) {
													if (!prevNode.equals(sf1)) {
														if (!prevNode.equals(task)) {
															if (!flow.equals(pnToFlow)) {
																if (!flow.equals(step)) {
																	if (!flow.equals(prevNode)) {
																		if (!flow.equals(t2s)) {
																			if (!flow.equals(process)) {
																				if (!flow.equals(sf1)) {
																					if (!flow.equals(task)) {
																						if (!t2s.equals(task)) {
																							if (!process.equals(step)) {
																								if (!process
																										.equals(t2s)) {
																									if (!process.equals(
																											sf1)) {
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
																																pnToFlow,
																																step,
																																prevNode,
																																flow,
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
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_1_3_greenBBBBBBBBFFFFFFFFF(PerformRuleResult ruleresult,
			EObject step, EObject prevNode, EObject flow, EObject t2s, EObject process, EObject sf1, EObject task) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2NormalStepFirst";
		String flow__step____steps_name_prime = "steps";
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
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { ruleresult, step, prevNode, flow, t2s, process, sf1, task, flow__step____steps,
				t2s__step____target, t2s__task____source, process__task____flowElements, process__sf1____flowElements,
				sf1__task____targetRef, task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final void pattern_Task2NormalStepFirst_1_5_expressionBBBBBBBBBB(Task2NormalStepFirst _this,
			PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode, EObject flow, EObject t2s,
			EObject process, EObject sf1, EObject task) {
		_this.registerObjects_FWD(ruleresult, pnToFlow, step, prevNode, flow, t2s, process, sf1, task);

	}

	public static final PerformRuleResult pattern_Task2NormalStepFirst_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_1_bindingFB(Task2NormalStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_1_blackFBB(EClass eClass, Task2NormalStepFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_1_bindingAndBlackFFB(Task2NormalStepFirst _this) {
		Object[] result_pattern_Task2NormalStepFirst_2_1_binding = pattern_Task2NormalStepFirst_2_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepFirst_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2NormalStepFirst_2_1_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_2_1_black = pattern_Task2NormalStepFirst_2_1_blackFBB(eClass,
					_this);
			if (result_pattern_Task2NormalStepFirst_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2NormalStepFirst_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2NormalStepFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_2_bindingFFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_2_2_blackFBFBBBB(FlowNode prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(task)) {
			for (FN2F pnToFlow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode,
					FN2F.class, "source")) {
				Flow flow = pnToFlow.getTarget();
				if (flow != null) {
					_result.add(new Object[] { pnToFlow, prevNode, flow, process, sf1, task, match });
				}

			}
		}
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_3_black_nac_0B(Flow flow) {
		for (Step otherStep : flow.getSteps()) {
			return new Object[] { flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_2_3_blackBBBBBB(FN2F pnToFlow,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(task)) {
			if (prevNode.equals(pnToFlow.getSource())) {
				if (flow.equals(pnToFlow.getTarget())) {
					if (process.getFlowElements().contains(task)) {
						if (process.getFlowElements().contains(sf1)) {
							if (process.getFlowElements().contains(prevNode)) {
								if (task.equals(sf1.getTargetRef())) {
									if (prevNode.equals(sf1.getSourceRef())) {
										if (pattern_Task2NormalStepFirst_2_3_black_nac_0B(flow) == null) {
											_result.add(new Object[] { pnToFlow, prevNode, flow, process, sf1, task });
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

	public static final Object[] pattern_Task2NormalStepFirst_2_3_greenBBBBBBFFFFFFFFFF(FN2F pnToFlow,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pnToFlow__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pnToFlow__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pnToFlow__prevNode____source_name_prime = "source";
		String pnToFlow__flow____target_name_prime = "target";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(pnToFlow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(task);
		pnToFlow__prevNode____source.setSrc(pnToFlow);
		pnToFlow__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pnToFlow__prevNode____source);
		pnToFlow__flow____target.setSrc(pnToFlow);
		pnToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(pnToFlow__flow____target);
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
		pnToFlow__prevNode____source.setName(pnToFlow__prevNode____source_name_prime);
		pnToFlow__flow____target.setName(pnToFlow__flow____target_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { pnToFlow, prevNode, flow, process, sf1, task, isApplicableMatch,
				pnToFlow__prevNode____source, pnToFlow__flow____target, process__task____flowElements,
				process__sf1____flowElements, process__prevNode____flowElements, sf1__task____targetRef,
				task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_4_bindingFBBBBBBBB(Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pnToFlow, prevNode, flow, process,
				sf1, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_4_bindingAndBlackFBBBBBBBB(Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		Object[] result_pattern_Task2NormalStepFirst_2_4_binding = pattern_Task2NormalStepFirst_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, task);
		if (result_pattern_Task2NormalStepFirst_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepFirst_2_4_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_2_4_black = pattern_Task2NormalStepFirst_2_4_blackB(csp);
			if (result_pattern_Task2NormalStepFirst_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, sf1, task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepFirst_2_5_expressionFBB(Task2NormalStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepFirst_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2NormalStepFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2NormalStepFirst_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_10_1_blackBBBB(Task2NormalStepFirst _this, Match match,
			NormalStep step, Flow flow) {
		return new Object[] { _this, match, step, flow };
	}

	public static final Object[] pattern_Task2NormalStepFirst_10_2_bindingFBBBB(Task2NormalStepFirst _this, Match match,
			NormalStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepFirst_10_2_bindingAndBlackFBBBB(Task2NormalStepFirst _this,
			Match match, NormalStep step, Flow flow) {
		Object[] result_pattern_Task2NormalStepFirst_10_2_binding = pattern_Task2NormalStepFirst_10_2_bindingFBBBB(
				_this, match, step, flow);
		if (result_pattern_Task2NormalStepFirst_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepFirst_10_2_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_10_2_black = pattern_Task2NormalStepFirst_10_2_blackB(csp);
			if (result_pattern_Task2NormalStepFirst_10_2_black != null) {

				return new Object[] { csp, _this, match, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepFirst_10_3_expressionFBB(Task2NormalStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_10_4_blackBBB(Match match, NormalStep step, Flow flow) {
		return new Object[] { match, step, flow };
	}

	public static final Object[] pattern_Task2NormalStepFirst_10_4_greenBBBF(Match match, NormalStep step, Flow flow) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, step, flow, flow__step____steps };
	}

	public static final Object[] pattern_Task2NormalStepFirst_10_5_blackBBB(Match match, NormalStep step, Flow flow) {
		return new Object[] { match, step, flow };
	}

	public static final Object[] pattern_Task2NormalStepFirst_10_5_greenBB(Match match, Flow flow) {
		match.getContextNodes().add(flow);
		return new Object[] { match, flow };
	}

	public static final void pattern_Task2NormalStepFirst_10_6_expressionBBBB(Task2NormalStepFirst _this, Match match,
			NormalStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, step, flow);

	}

	public static final boolean pattern_Task2NormalStepFirst_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepFirst_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_11_1_bindingFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pnToFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject tmpPnToFlow = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		if (tmpPnToFlow instanceof FN2F) {
			FN2F pnToFlow = (FN2F) tmpPnToFlow;
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (tmpPrevNode instanceof FlowNode) {
					FlowNode prevNode = (FlowNode) tmpPrevNode;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							return new Object[] { pnToFlow, step, prevNode, flow, process, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_11_1_blackBBBBBBFB(FN2F pnToFlow, NormalStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pnToFlow, step, prevNode, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_11_1_bindingAndBlackFFFFFBFB(Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2NormalStepFirst_11_1_binding = pattern_Task2NormalStepFirst_11_1_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2NormalStepFirst_11_1_binding != null) {
			FN2F pnToFlow = (FN2F) result_pattern_Task2NormalStepFirst_11_1_binding[0];
			NormalStep step = (NormalStep) result_pattern_Task2NormalStepFirst_11_1_binding[1];
			FlowNode prevNode = (FlowNode) result_pattern_Task2NormalStepFirst_11_1_binding[2];
			Flow flow = (Flow) result_pattern_Task2NormalStepFirst_11_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2NormalStepFirst_11_1_binding[4];

			Object[] result_pattern_Task2NormalStepFirst_11_1_black = pattern_Task2NormalStepFirst_11_1_blackBBBBBBFB(
					pnToFlow, step, prevNode, flow, process, _this, isApplicableMatch);
			if (result_pattern_Task2NormalStepFirst_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2NormalStepFirst_11_1_black[6];

				return new Object[] { pnToFlow, step, prevNode, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_11_1_greenBBFBFFB(NormalStep step, FlowNode prevNode,
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
		return new Object[] { step, prevNode, t2s, process, sf1, task, csp };
	}

	public static final Object[] pattern_Task2NormalStepFirst_11_2_blackBBBB(NormalStep step, FN2S t2s,
			SequenceFlow sf1, Task task) {
		return new Object[] { step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2NormalStepFirst_11_2_greenFBBBB(NormalStep step, FN2S t2s,
			SequenceFlow sf1, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getCreatedElements().add(task);
		return new Object[] { ruleresult, step, t2s, sf1, task };
	}

	public static final Object[] pattern_Task2NormalStepFirst_11_3_blackBBBBBBBBB(PerformRuleResult ruleresult,
			EObject pnToFlow, EObject step, EObject prevNode, EObject flow, EObject t2s, EObject process, EObject sf1,
			EObject task) {
		if (!pnToFlow.equals(step)) {
			if (!pnToFlow.equals(prevNode)) {
				if (!pnToFlow.equals(t2s)) {
					if (!pnToFlow.equals(process)) {
						if (!pnToFlow.equals(sf1)) {
							if (!pnToFlow.equals(task)) {
								if (!step.equals(t2s)) {
									if (!step.equals(task)) {
										if (!prevNode.equals(step)) {
											if (!prevNode.equals(t2s)) {
												if (!prevNode.equals(process)) {
													if (!prevNode.equals(sf1)) {
														if (!prevNode.equals(task)) {
															if (!flow.equals(pnToFlow)) {
																if (!flow.equals(step)) {
																	if (!flow.equals(prevNode)) {
																		if (!flow.equals(t2s)) {
																			if (!flow.equals(process)) {
																				if (!flow.equals(sf1)) {
																					if (!flow.equals(task)) {
																						if (!t2s.equals(task)) {
																							if (!process.equals(step)) {
																								if (!process
																										.equals(t2s)) {
																									if (!process.equals(
																											sf1)) {
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
																																pnToFlow,
																																step,
																																prevNode,
																																flow,
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
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_11_3_greenBBBBBBBBFFFFFFFFF(PerformRuleResult ruleresult,
			EObject step, EObject prevNode, EObject flow, EObject t2s, EObject process, EObject sf1, EObject task) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2NormalStepFirst";
		String flow__step____steps_name_prime = "steps";
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
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { ruleresult, step, prevNode, flow, t2s, process, sf1, task, flow__step____steps,
				t2s__step____target, t2s__task____source, process__task____flowElements, process__sf1____flowElements,
				sf1__task____targetRef, task__sf1____incoming, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final void pattern_Task2NormalStepFirst_11_5_expressionBBBBBBBBBB(Task2NormalStepFirst _this,
			PerformRuleResult ruleresult, EObject pnToFlow, EObject step, EObject prevNode, EObject flow, EObject t2s,
			EObject process, EObject sf1, EObject task) {
		_this.registerObjects_BWD(ruleresult, pnToFlow, step, prevNode, flow, t2s, process, sf1, task);

	}

	public static final PerformRuleResult pattern_Task2NormalStepFirst_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_1_bindingFB(Task2NormalStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_1_blackFBB(EClass eClass, Task2NormalStepFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_1_bindingAndBlackFFB(Task2NormalStepFirst _this) {
		Object[] result_pattern_Task2NormalStepFirst_12_1_binding = pattern_Task2NormalStepFirst_12_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepFirst_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2NormalStepFirst_12_1_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_12_1_black = pattern_Task2NormalStepFirst_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_Task2NormalStepFirst_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2NormalStepFirst_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2NormalStepFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("flow");
		EObject tmpStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				return new Object[] { step, flow, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_12_2_blackFBFBB(NormalStep step, Flow flow,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (FN2F pnToFlow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(flow, FN2F.class,
				"target")) {
			FlowNode prevNode = pnToFlow.getSource();
			if (prevNode != null) {
				_result.add(new Object[] { pnToFlow, step, prevNode, flow, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_12_3_blackBBBBF(FN2F pnToFlow, NormalStep step,
			FlowNode prevNode, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(pnToFlow.getSource())) {
			if (flow.equals(pnToFlow.getTarget())) {
				if (flow.getSteps().contains(step)) {
					for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class, "flowElements")) {
						_result.add(new Object[] { pnToFlow, step, prevNode, flow, process });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_3_greenBBBBBFFFFF(FN2F pnToFlow, NormalStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pnToFlow__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pnToFlow__flow____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pnToFlow__prevNode____source_name_prime = "source";
		String pnToFlow__flow____target_name_prime = "target";
		String flow__step____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(pnToFlow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		pnToFlow__prevNode____source.setSrc(pnToFlow);
		pnToFlow__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pnToFlow__prevNode____source);
		pnToFlow__flow____target.setSrc(pnToFlow);
		pnToFlow__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(pnToFlow__flow____target);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		pnToFlow__prevNode____source.setName(pnToFlow__prevNode____source_name_prime);
		pnToFlow__flow____target.setName(pnToFlow__flow____target_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { pnToFlow, step, prevNode, flow, process, isApplicableMatch, pnToFlow__prevNode____source,
				pnToFlow__flow____target, flow__step____steps, process__prevNode____flowElements };
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_4_bindingFBBBBBBB(Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, NormalStep step, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pnToFlow, step, prevNode, flow,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_4_bindingAndBlackFBBBBBBB(Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, NormalStep step, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process) {
		Object[] result_pattern_Task2NormalStepFirst_12_4_binding = pattern_Task2NormalStepFirst_12_4_bindingFBBBBBBB(
				_this, isApplicableMatch, pnToFlow, step, prevNode, flow, process);
		if (result_pattern_Task2NormalStepFirst_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepFirst_12_4_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_12_4_black = pattern_Task2NormalStepFirst_12_4_blackB(csp);
			if (result_pattern_Task2NormalStepFirst_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepFirst_12_5_expressionFBB(Task2NormalStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepFirst_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2NormalStepFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2NormalStepFirst_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_20_1_bindingFB(Task2NormalStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_20_1_blackFBB(EClass __eClass,
			Task2NormalStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_20_1_bindingAndBlackFFB(Task2NormalStepFirst _this) {
		Object[] result_pattern_Task2NormalStepFirst_20_1_binding = pattern_Task2NormalStepFirst_20_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepFirst_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepFirst_20_1_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_20_1_black = pattern_Task2NormalStepFirst_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepFirst_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepFirst_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_20_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_963188 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_963188)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_20_2_black_nac_1B(NormalStep step) {
		for (Step __DEC_step_next_484892 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_484892)) {
				return new Object[] { step };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_20_2_blackFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_Task2NormalStepFirst_20_2_black_nac_0BB(step, flow) == null) {
						if (pattern_Task2NormalStepFirst_20_2_black_nac_1B(step) == null) {
							_result.add(new Object[] { step, flow, _edge_steps });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepFirst_20_3_expressionFBBBB(Task2NormalStepFirst _this,
			Match match, NormalStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepFirst_20_4_expressionFBB(Task2NormalStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepFirst_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_21_1_bindingFB(Task2NormalStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_21_1_blackFBB(EClass __eClass,
			Task2NormalStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_21_1_bindingAndBlackFFB(Task2NormalStepFirst _this) {
		Object[] result_pattern_Task2NormalStepFirst_21_1_binding = pattern_Task2NormalStepFirst_21_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepFirst_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepFirst_21_1_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_21_1_black = pattern_Task2NormalStepFirst_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepFirst_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepFirst_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_21_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_838047 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_838047)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_21_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_754441 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_754441)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_21_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (process.getFlowElements().contains(task)) {
					if (pattern_Task2NormalStepFirst_21_2_black_nac_1BB(task, process) == null) {
						for (FlowElement tmpSf1 : process.getFlowElements()) {
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (task.equals(sf1.getTargetRef())) {
									FlowNode prevNode = sf1.getSourceRef();
									if (prevNode != null) {
										if (!prevNode.equals(task)) {
											if (process.getFlowElements().contains(prevNode)) {
												if (pattern_Task2NormalStepFirst_21_2_black_nac_0BB(sf1,
														process) == null) {
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

	public static final Object[] pattern_Task2NormalStepFirst_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepFirst_21_3_expressionFBBBBBB(Task2NormalStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepFirst_21_4_expressionFBB(Task2NormalStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepFirst_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_22_1_bindingFB(Task2NormalStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_22_1_blackFBB(EClass __eClass,
			Task2NormalStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_22_1_bindingAndBlackFFB(Task2NormalStepFirst _this) {
		Object[] result_pattern_Task2NormalStepFirst_22_1_binding = pattern_Task2NormalStepFirst_22_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepFirst_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepFirst_22_1_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_22_1_black = pattern_Task2NormalStepFirst_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepFirst_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepFirst_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_22_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_892882 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_892882)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_22_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_630595 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_630595)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_22_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
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
										if (pattern_Task2NormalStepFirst_22_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepFirst_22_2_black_nac_1BB(task,
													process) == null) {
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

		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepFirst_22_3_expressionFBBBBBB(Task2NormalStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepFirst_22_4_expressionFBB(Task2NormalStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepFirst_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_23_1_bindingFB(Task2NormalStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_23_1_blackFBB(EClass __eClass,
			Task2NormalStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_23_1_bindingAndBlackFFB(Task2NormalStepFirst _this) {
		Object[] result_pattern_Task2NormalStepFirst_23_1_binding = pattern_Task2NormalStepFirst_23_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepFirst_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepFirst_23_1_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_23_1_black = pattern_Task2NormalStepFirst_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepFirst_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepFirst_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_23_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_822218 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_822218)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_23_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_370495 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_370495)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_23_2_blackFFFFB(EMoflonEdge _edge_targetRef) {
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
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(task)) {
									if (process.getFlowElements().contains(prevNode)) {
										if (pattern_Task2NormalStepFirst_23_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepFirst_23_2_black_nac_1BB(task,
													process) == null) {
												_result.add(
														new Object[] { prevNode, process, sf1, task, _edge_targetRef });
											}
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

	public static final Object[] pattern_Task2NormalStepFirst_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepFirst_23_3_expressionFBBBBBB(Task2NormalStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepFirst_23_4_expressionFBB(Task2NormalStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepFirst_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_24_1_bindingFB(Task2NormalStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_24_1_blackFBB(EClass __eClass,
			Task2NormalStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_24_1_bindingAndBlackFFB(Task2NormalStepFirst _this) {
		Object[] result_pattern_Task2NormalStepFirst_24_1_binding = pattern_Task2NormalStepFirst_24_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepFirst_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepFirst_24_1_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_24_1_black = pattern_Task2NormalStepFirst_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepFirst_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepFirst_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_24_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_823413 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_823413)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_24_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_460333 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_460333)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_24_2_blackFFFFB(EMoflonEdge _edge_incoming) {
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
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements().contains(prevNode)) {
										if (pattern_Task2NormalStepFirst_24_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepFirst_24_2_black_nac_1BB(task,
													process) == null) {
												_result.add(
														new Object[] { prevNode, process, sf1, task, _edge_incoming });
											}
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

	public static final Object[] pattern_Task2NormalStepFirst_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepFirst_24_3_expressionFBBBBBB(Task2NormalStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepFirst_24_4_expressionFBB(Task2NormalStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepFirst_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_25_1_bindingFB(Task2NormalStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_25_1_blackFBB(EClass __eClass,
			Task2NormalStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_25_1_bindingAndBlackFFB(Task2NormalStepFirst _this) {
		Object[] result_pattern_Task2NormalStepFirst_25_1_binding = pattern_Task2NormalStepFirst_25_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepFirst_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepFirst_25_1_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_25_1_black = pattern_Task2NormalStepFirst_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepFirst_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepFirst_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_25_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_148761 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_148761)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_25_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_217957 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_217957)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_25_2_blackFFFFB(EMoflonEdge _edge_sourceRef) {
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
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(task)) {
									if (process.getFlowElements().contains(prevNode)) {
										if (pattern_Task2NormalStepFirst_25_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepFirst_25_2_black_nac_1BB(task,
													process) == null) {
												_result.add(
														new Object[] { prevNode, process, sf1, task, _edge_sourceRef });
											}
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

	public static final Object[] pattern_Task2NormalStepFirst_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepFirst_25_3_expressionFBBBBBB(Task2NormalStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepFirst_25_4_expressionFBB(Task2NormalStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepFirst_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_26_1_bindingFB(Task2NormalStepFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_26_1_blackFBB(EClass __eClass,
			Task2NormalStepFirst _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_26_1_bindingAndBlackFFB(Task2NormalStepFirst _this) {
		Object[] result_pattern_Task2NormalStepFirst_26_1_binding = pattern_Task2NormalStepFirst_26_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepFirst_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepFirst_26_1_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_26_1_black = pattern_Task2NormalStepFirst_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepFirst_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepFirst_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_26_2_black_nac_0BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_919699 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_919699)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_26_2_black_nac_1BB(Task task,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_task_flowElements_522572 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_522572)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_26_2_blackFFFFB(EMoflonEdge _edge_outgoing) {
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
							for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class, "flowElements")) {
								if (process.getFlowElements().contains(task)) {
									if (process.getFlowElements().contains(sf1)) {
										if (pattern_Task2NormalStepFirst_26_2_black_nac_0BB(sf1, process) == null) {
											if (pattern_Task2NormalStepFirst_26_2_black_nac_1BB(task,
													process) == null) {
												_result.add(
														new Object[] { prevNode, process, sf1, task, _edge_outgoing });
											}
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

	public static final Object[] pattern_Task2NormalStepFirst_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepFirst_26_3_expressionFBBBBBB(Task2NormalStepFirst _this,
			Match match, FlowNode prevNode, SimpleBPMN.Process process, SequenceFlow sf1, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepFirst_26_4_expressionFBB(Task2NormalStepFirst _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepFirst_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_29_1_blackB(Task2NormalStepFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Task2NormalStepFirst_29_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Task2NormalStepFirst_29_2_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("step");
		EObject _localVariable_1 = sourceMatch.getObject("prevNode");
		EObject _localVariable_2 = targetMatch.getObject("flow");
		EObject _localVariable_3 = sourceMatch.getObject("process");
		EObject _localVariable_4 = sourceMatch.getObject("sf1");
		EObject _localVariable_5 = sourceMatch.getObject("task");
		EObject tmpStep = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpTask = _localVariable_5;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpPrevNode instanceof FlowNode) {
				FlowNode prevNode = (FlowNode) tmpPrevNode;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpTask instanceof Task) {
								Task task = (Task) tmpTask;
								return new Object[] { step, prevNode, flow, process, sf1, task, targetMatch,
										sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_29_2_blackFBBBBBBBB(NormalStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, Task task, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(task)) {
			if (!sourceMatch.equals(targetMatch)) {
				if (flow.getSteps().contains(step)) {
					if (process.getFlowElements().contains(task)) {
						if (process.getFlowElements().contains(sf1)) {
							if (process.getFlowElements().contains(prevNode)) {
								if (task.equals(sf1.getTargetRef())) {
									if (prevNode.equals(sf1.getSourceRef())) {
										for (FN2F pnToFlow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevNode, FN2F.class, "source")) {
											if (flow.equals(pnToFlow.getTarget())) {
												_result.add(new Object[] { pnToFlow, step, prevNode, flow, process, sf1,
														task, sourceMatch, targetMatch });
											}
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

	public static final Object[] pattern_Task2NormalStepFirst_29_2_greenBBBBBBBBBF(FN2F pnToFlow, NormalStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, Task task, Match sourceMatch,
			Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "Task2NormalStepFirst";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(task);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(pnToFlow);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { pnToFlow, step, prevNode, flow, process, sf1, task, sourceMatch, targetMatch,
				isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepFirst_29_3_bindingFBBBBBBBBBBB(Task2NormalStepFirst _this,
			IsApplicableMatchCC isApplicableMatch, FN2F pnToFlow, NormalStep step, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(isApplicableMatch, pnToFlow, step, prevNode, flow,
				process, sf1, task, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process, sf1, task,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_29_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepFirst_29_3_bindingAndBlackFBBBBBBBBBBB(
			Task2NormalStepFirst _this, IsApplicableMatchCC isApplicableMatch, FN2F pnToFlow, NormalStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, Task task, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_Task2NormalStepFirst_29_3_binding = pattern_Task2NormalStepFirst_29_3_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, pnToFlow, step, prevNode, flow, process, sf1, task, sourceMatch, targetMatch);
		if (result_pattern_Task2NormalStepFirst_29_3_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepFirst_29_3_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_29_3_black = pattern_Task2NormalStepFirst_29_3_blackB(csp);
			if (result_pattern_Task2NormalStepFirst_29_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, step, prevNode, flow, process, sf1, task,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_29_4_blackBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepFirst_29_4_greenBB(IsApplicableRuleResult result,
			IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2NormalStepFirst";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2NormalStepFirst_29_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_32_1_blackB(Task2NormalStepFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Task2NormalStepFirst_32_2_bindingFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pnToFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("step");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_6 = isApplicableMatch.getObject("task");
		EObject tmpPnToFlow = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpTask = _localVariable_6;
		if (tmpPnToFlow instanceof FN2F) {
			FN2F pnToFlow = (FN2F) tmpPnToFlow;
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (tmpPrevNode instanceof FlowNode) {
					FlowNode prevNode = (FlowNode) tmpPrevNode;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (tmpTask instanceof Task) {
									Task task = (Task) tmpTask;
									return new Object[] { pnToFlow, step, prevNode, flow, process, sf1, task,
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

	public static final Object[] pattern_Task2NormalStepFirst_32_2_blackBBBBBBBB(FN2F pnToFlow, NormalStep step,
			FlowNode prevNode, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			IsApplicableMatchCC isApplicableMatch) {
		if (!prevNode.equals(task)) {
			if (prevNode.equals(pnToFlow.getSource())) {
				if (flow.equals(pnToFlow.getTarget())) {
					if (flow.getSteps().contains(step)) {
						if (process.getFlowElements().contains(task)) {
							if (process.getFlowElements().contains(sf1)) {
								if (process.getFlowElements().contains(prevNode)) {
									if (task.equals(sf1.getTargetRef())) {
										if (prevNode.equals(sf1.getSourceRef())) {
											return new Object[] { pnToFlow, step, prevNode, flow, process, sf1, task,
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

	public static final Object[] pattern_Task2NormalStepFirst_32_2_bindingAndBlackFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_Task2NormalStepFirst_32_2_binding = pattern_Task2NormalStepFirst_32_2_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2NormalStepFirst_32_2_binding != null) {
			FN2F pnToFlow = (FN2F) result_pattern_Task2NormalStepFirst_32_2_binding[0];
			NormalStep step = (NormalStep) result_pattern_Task2NormalStepFirst_32_2_binding[1];
			FlowNode prevNode = (FlowNode) result_pattern_Task2NormalStepFirst_32_2_binding[2];
			Flow flow = (Flow) result_pattern_Task2NormalStepFirst_32_2_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2NormalStepFirst_32_2_binding[4];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2NormalStepFirst_32_2_binding[5];
			Task task = (Task) result_pattern_Task2NormalStepFirst_32_2_binding[6];

			Object[] result_pattern_Task2NormalStepFirst_32_2_black = pattern_Task2NormalStepFirst_32_2_blackBBBBBBBB(
					pnToFlow, step, prevNode, flow, process, sf1, task, isApplicableMatch);
			if (result_pattern_Task2NormalStepFirst_32_2_black != null) {

				return new Object[] { pnToFlow, step, prevNode, flow, process, sf1, task, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_32_2_greenBBFF(NormalStep step, Task task) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		FN2S t2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		result.getCreatedElements().add(t2s);
		t2s.setTarget(step);
		t2s.setSource(task);
		return new Object[] { step, task, result, t2s };
	}

	public static final PerformRuleResult pattern_Task2NormalStepFirst_32_3_expressionFB(PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_1_blackB(Task2NormalStepFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_2_black_nac_0BB(ModelgeneratorRuleResult ruleResult,
			FN2F pnToFlow) {
		if (ruleResult.getCorrObjects().contains(pnToFlow)) {
			return new Object[] { ruleResult, pnToFlow };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_2_black_nac_1BB(ModelgeneratorRuleResult ruleResult,
			FlowNode prevNode) {
		if (ruleResult.getSourceObjects().contains(prevNode)) {
			return new Object[] { ruleResult, prevNode };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_2_black_nac_2BB(ModelgeneratorRuleResult ruleResult,
			SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_2_black_nac_3BB(ModelgeneratorRuleResult ruleResult,
			Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepFirst_33_2_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList pnToFlowList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpPnToFlow : pnToFlowList.getEntryObjects()) {
				if (tmpPnToFlow instanceof FN2F) {
					FN2F pnToFlow = (FN2F) tmpPnToFlow;
					FlowNode prevNode = pnToFlow.getSource();
					if (prevNode != null) {
						Flow flow = pnToFlow.getTarget();
						if (flow != null) {
							if (pattern_Task2NormalStepFirst_33_2_black_nac_0BB(ruleResult, pnToFlow) == null) {
								if (pattern_Task2NormalStepFirst_33_2_black_nac_1BB(ruleResult, prevNode) == null) {
									if (pattern_Task2NormalStepFirst_33_2_black_nac_3BB(ruleResult, flow) == null) {
										for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
														"flowElements")) {
											if (pattern_Task2NormalStepFirst_33_2_black_nac_2BB(ruleResult,
													process) == null) {
												_result.add(new Object[] { pnToFlowList, pnToFlow, prevNode, process,
														flow, ruleEntryContainer, ruleResult });
											}
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

	public static final Object[] pattern_Task2NormalStepFirst_33_3_bindingFBBBBBBB(Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, pnToFlow, prevNode, flow, process,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_3_bindingAndBlackFBBBBBBB(Task2NormalStepFirst _this,
			IsApplicableMatch isApplicableMatch, FN2F pnToFlow, FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Task2NormalStepFirst_33_3_binding = pattern_Task2NormalStepFirst_33_3_bindingFBBBBBBB(
				_this, isApplicableMatch, pnToFlow, prevNode, flow, process, ruleResult);
		if (result_pattern_Task2NormalStepFirst_33_3_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepFirst_33_3_binding[0];

			Object[] result_pattern_Task2NormalStepFirst_33_3_black = pattern_Task2NormalStepFirst_33_3_blackB(csp);
			if (result_pattern_Task2NormalStepFirst_33_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pnToFlow, prevNode, flow, process, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepFirst_33_4_expressionFBB(Task2NormalStepFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_5_black_nac_0B(Flow flow) {
		for (Step otherStep : flow.getSteps()) {
			return new Object[] { flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_5_blackBBBB(Flow flow, FN2F pnToFlow,
			FlowNode prevNode, SimpleBPMN.Process process) {
		if (pattern_Task2NormalStepFirst_33_5_black_nac_0B(flow) == null) {
			return new Object[] { flow, pnToFlow, prevNode, process };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_6_blackBBBBB(FN2F pnToFlow, FlowNode prevNode,
			Flow flow, SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { pnToFlow, prevNode, flow, process, ruleResult };
	}

	public static final Object[] pattern_Task2NormalStepFirst_33_6_greenFBBFBFFBB(FlowNode prevNode, Flow flow,
			SimpleBPMN.Process process, ModelgeneratorRuleResult ruleResult, CSP csp) {
		NormalStep step = SimpleUseCaseFactory.eINSTANCE.createNormalStep();
		FN2S t2s = Bpmn2UseCaseFactory.eINSTANCE.createFN2S();
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		Task task = SimpleBPMNFactory.eINSTANCE.createTask();
		Object _localVariable_0 = csp.getValue("step", "id");
		Object _localVariable_1 = csp.getValue("task", "id");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		flow.getSteps().add(step);
		ruleResult.getTargetObjects().add(step);
		t2s.setTarget(step);
		ruleResult.getCorrObjects().add(t2s);
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		ruleResult.getSourceObjects().add(sf1);
		t2s.setSource(task);
		process.getFlowElements().add(task);
		sf1.setTargetRef(task);
		ruleResult.getSourceObjects().add(task);
		String step_id_prime = (String) _localVariable_0;
		String task_id_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		step.setId(step_id_prime);
		task.setId(task_id_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { step, prevNode, flow, t2s, process, sf1, task, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_Task2NormalStepFirst_33_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Task2NormalStepFirstImpl
