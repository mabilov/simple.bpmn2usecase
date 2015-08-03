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
import de.abilov.tgg.bpmn2useCase.Rules.T2SAfterChoiceDef;

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
 * An implementation of the model object '<em><b>T2S After Choice Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class T2SAfterChoiceDefImpl extends AbstractRuleImpl implements T2SAfterChoiceDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected T2SAfterChoiceDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getT2SAfterChoiceDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, Task task) {
		// initial bindings
		Object[] result1_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_0_1_blackBBBBBB(this, match, prevNode,
				sf1, process, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[sf1] = " + sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_0_2_bindingAndBlackFBBBBBB(this, match, prevNode, sf1, process, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1
					+ ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_0_4_blackBBBBB(match, prevNode,
					sf1, process, task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
			}
			T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_0_4_greenBBBBBFFFFFFF(match, prevNode, sf1, process, task);
			// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[5];
			// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[6];
			// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result4_green[7];
			// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[8];
			// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[9];
			// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result4_green[10];
			// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result4_green[11];

			// collect context elements
			Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_0_5_blackBBBBB(match, prevNode,
					sf1, process, task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
			}
			T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_0_6_expressionBBBBBB(this, match, prevNode, sf1, process,
					task);
			return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_0_7_expressionF();
		} else {
			return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_1_1_bindingAndBlackFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Flow flow = (Flow) result1_bindingAndBlack[0];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[1];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[2];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[3];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[4];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[5];
		Task task = (Task) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_1_1_greenFBBFBB(flow, cStep, task,
				csp);
		NormalStep step = (NormalStep) result1_green[0];
		FN2S t2s = (FN2S) result1_green[3];

		// collect translated elements
		Object[] result2_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_1_2_blackBBBB(step, sf1, t2s, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[t2s] = " + t2s + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_1_2_greenFBBBB(step, sf1, t2s, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_1_3_blackBBBBBBBBBB(ruleresult, step,
				flow, prevNode, cStep, eg2cs, sf1, t2s, process, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs + ", "
					+ "[sf1] = " + sf1 + ", " + "[t2s] = " + t2s + ", " + "[process] = " + process + ", " + "[task] = "
					+ task + ".");
		}
		T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_1_3_greenBBBBBBBBBFFFFFFFFFFF(ruleresult, step, flow, prevNode,
				cStep, sf1, t2s, process, task);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[9];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result3_green[12];
				// EMoflonEdge cStep__step____next = (EMoflonEdge) result3_green[13];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[19];

		// perform postprocessing story node is empty
		// register objects
		T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_1_5_expressionBBBBBBBBBBB(this, ruleresult, step, flow,
				prevNode, cStep, eg2cs, sf1, t2s, process, task);
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[0];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[1];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[2];
		Task task = (Task) result2_binding[3];
		for (Object[] result2_black : T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_2_blackBFFBBBB(prevNode, sf1,
				process, task, match)) {
			ChoiceStep cStep = (ChoiceStep) result2_black[1];
			GW2S eg2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_3_blackFBBBBBB(prevNode,
					cStep, eg2cs, sf1, process, task)) {
				Flow flow = (Flow) result3_black[0];
				Object[] result3_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_3_greenBBBBBBBFFFFFFFFFFFF(
						flow, prevNode, cStep, eg2cs, sf1, process, task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result3_green[8];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[9];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eg2cs__cStep____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = T2SAfterChoiceDefImpl
						.pattern_T2SAfterChoiceDef_2_4_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, flow,
								prevNode, cStep, eg2cs, sf1, process, task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[flow] = " + flow + ", " + "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep
							+ ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[process] = " + process
							+ ", " + "[task] = " + task + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {// Create CSP
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
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("process", process);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject step, EObject flow, EObject prevNode,
			EObject cStep, EObject eg2cs, EObject sf1, EObject t2s, EObject process, EObject task) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("t2s", t2s);
		ruleresult.registerObject("process", process);
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
	public boolean isAppropriate_BWD(Match match, NormalStep step, Flow flow, ChoiceStep cStep) {
		// initial bindings
		Object[] result1_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_10_1_blackBBBBB(this, match, step,
				flow, cStep);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = "
					+ flow + ", " + "[cStep] = " + cStep + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_10_2_bindingAndBlackFBBBBB(this, match, step, flow, cStep);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", "
					+ "[cStep] = " + cStep + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_10_4_blackBBBB(match, step, flow,
					cStep);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow
						+ ", " + "[cStep] = " + cStep + ".");
			}
			T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_10_4_greenBBBBFF(match, step, flow, cStep);
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[4];
			// EMoflonEdge cStep__step____next = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_10_5_blackBBBB(match, step, flow,
					cStep);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[step] = " + step + ", " + "[flow] = " + flow
						+ ", " + "[cStep] = " + cStep + ".");
			}
			T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_10_5_greenBBBF(match, flow, cStep);
			// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result5_green[3];

			// register objects to match
			T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_10_6_expressionBBBBB(this, match, step, flow, cStep);
			return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_10_7_expressionF();
		} else {
			return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_11_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NormalStep step = (NormalStep) result1_bindingAndBlack[0];
		Flow flow = (Flow) result1_bindingAndBlack[1];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[2];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[3];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[4];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_11_1_greenBBFFBFB(step, prevNode,
				process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[2];
		FN2S t2s = (FN2S) result1_green[3];
		Task task = (Task) result1_green[5];

		// collect translated elements
		Object[] result2_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_11_2_blackBBBB(step, sf1, t2s, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[t2s] = " + t2s + ", " + "[task] = " + task
					+ ".");
		}
		Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_11_2_greenFBBBB(step, sf1, t2s, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_11_3_blackBBBBBBBBBB(ruleresult, step,
				flow, prevNode, cStep, eg2cs, sf1, t2s, process, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", "
					+ "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs + ", "
					+ "[sf1] = " + sf1 + ", " + "[t2s] = " + t2s + ", " + "[process] = " + process + ", " + "[task] = "
					+ task + ".");
		}
		T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_11_3_greenBBBBBBBBBFFFFFFFFFFF(ruleresult, step, flow, prevNode,
				cStep, sf1, t2s, process, task);
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[9];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result3_green[12];
				// EMoflonEdge cStep__step____next = (EMoflonEdge) result3_green[13];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[19];

		// perform postprocessing story node is empty
		// register objects
		T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_11_5_expressionBBBBBBBBBBB(this, ruleresult, step, flow,
				prevNode, cStep, eg2cs, sf1, t2s, process, task);
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		NormalStep step = (NormalStep) result2_binding[0];
		Flow flow = (Flow) result2_binding[1];
		ChoiceStep cStep = (ChoiceStep) result2_binding[2];
		for (Object[] result2_black : T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_12_2_blackBBFBFB(step, flow,
				cStep, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			GW2S eg2cs = (GW2S) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_12_3_blackBBBBBF(step, flow,
					prevNode, cStep, eg2cs)) {
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[5];
				Object[] result3_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_12_3_greenBBBBBBFFFFFFF(step,
						flow, prevNode, cStep, eg2cs, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result3_green[7];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[8];
				// EMoflonEdge cStep__step____next = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eg2cs__cStep____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = T2SAfterChoiceDefImpl
						.pattern_T2SAfterChoiceDef_12_4_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, step, flow,
								prevNode, cStep, eg2cs, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[step] = " + step + ", "
									+ "[flow] = " + flow + ", " + "[prevNode] = " + prevNode + ", " + "[cStep] = "
									+ cStep + ", " + "[eg2cs] = " + eg2cs + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NormalStep step, Flow flow, ChoiceStep cStep) {
		match.registerObject("step", step);
		match.registerObject("flow", flow);
		match.registerObject("cStep", cStep);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep step, Flow flow, ChoiceStep cStep) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, NormalStep step, Flow flow,
			ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs, de.abilov.bpmn.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject step, EObject flow, EObject prevNode,
			EObject cStep, EObject eg2cs, EObject sf1, EObject t2s, EObject process, EObject task) {
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("t2s", t2s);
		ruleresult.registerObject("process", process);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_148(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_20_2_blackFFFB(_edge_steps)) {
			NormalStep step = (NormalStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			ChoiceStep cStep = (ChoiceStep) result2_black[2];
			Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_20_3_expressionFBBBBB(this, match, step, flow, cStep)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_490(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_21_2_blackFFFFB(_edge_sourceRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_21_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_491(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_22_2_blackFFFFB(_edge_outgoing)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_22_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_492(EMoflonEdge _edge_default) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_23_2_blackFFFFB(_edge_default)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_23_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_149(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_24_2_blackFFFB(_edge_next)) {
			NormalStep step = (NormalStep) result2_black[0];
			Flow flow = (Flow) result2_black[1];
			ChoiceStep cStep = (ChoiceStep) result2_black[2];
			Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_24_3_expressionFBBBBB(this, match, step, flow, cStep)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_493(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_25_2_blackFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_25_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_494(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_26_2_blackFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_26_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_495(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_27_2_blackFFFFB(_edge_targetRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_27_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_496(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = T2SAfterChoiceDefImpl
				.pattern_T2SAfterChoiceDef_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_28_2_blackFFFFB(_edge_incoming)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_28_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return T2SAfterChoiceDefImpl.pattern_T2SAfterChoiceDef_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("T2SAfterChoiceDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cStep")).findAny();
		de.abilov.useCase.ChoiceStep cStep = (de.abilov.useCase.ChoiceStep) matchForCStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S eg2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S t2s = (de.abilov.tgg.bpmn2useCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		de.abilov.bpmn.Task task = (de.abilov.bpmn.Task) matchForTask.get().getNode();

		if (!(prevNode.isIsDiverging() == true)) {
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

		eq0.setRuleName("T2SAfterChoiceDef");
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
		ruleResult.setRule("T2SAfterChoiceDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cStep")).findAny();
		de.abilov.useCase.ChoiceStep cStep = (de.abilov.useCase.ChoiceStep) matchForCStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S eg2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForT2s = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("t2s")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S t2s = (de.abilov.tgg.bpmn2useCase.FN2S) matchForT2s.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		de.abilov.bpmn.Task task = (de.abilov.bpmn.Task) matchForTask.get().getNode();

		if (!(prevNode.isIsDiverging() == true)) {
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

		eq0.setRuleName("T2SAfterChoiceDef");
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
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(Task) arguments.get(4));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(Task) arguments.get(4));
			return null;
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(Task) arguments.get(4));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Flow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (ChoiceStep) arguments.get(3), (GW2S) arguments.get(4),
					(SequenceFlow) arguments.get(5), (de.abilov.bpmn.Process) arguments.get(6),
					(Task) arguments.get(7));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.T2S_AFTER_CHOICE_DEF___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(ChoiceStep) arguments.get(3));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1), (Flow) arguments.get(2),
					(ChoiceStep) arguments.get(3));
			return null;
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_FLOW_CHOICESTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (NormalStep) arguments.get(1),
					(Flow) arguments.get(2), (ChoiceStep) arguments.get(3));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NORMALSTEP_FLOW_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (NormalStep) arguments.get(1),
					(Flow) arguments.get(2), (ExclusiveGateway) arguments.get(3), (ChoiceStep) arguments.get(4),
					(GW2S) arguments.get(5), (de.abilov.bpmn.Process) arguments.get(6));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.T2S_AFTER_CHOICE_DEF___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_148__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_148((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_490__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_490((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_491__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_491((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_492__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_492((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_149__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_149((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_493__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_493((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_494__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_494((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_495__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_495((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_496__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_496((EMoflonEdge) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.T2S_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_T2SAfterChoiceDef_0_1_blackBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		return new Object[] { _this, match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_0_2_bindingFBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, sf1, process, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, sf1, process, task };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_0_2_bindingAndBlackFBBBBBB(T2SAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		Object[] result_pattern_T2SAfterChoiceDef_0_2_binding = pattern_T2SAfterChoiceDef_0_2_bindingFBBBBBB(_this,
				match, prevNode, sf1, process, task);
		if (result_pattern_T2SAfterChoiceDef_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterChoiceDef_0_2_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_0_2_black = pattern_T2SAfterChoiceDef_0_2_blackB(csp);
			if (result_pattern_T2SAfterChoiceDef_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, sf1, process, task };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterChoiceDef_0_3_expressionFBB(T2SAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_0_4_blackBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		return new Object[] { match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_0_4_greenBBBBBFFFFFFF(Match match, ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(task);
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevNode__sf1____default_name_prime = "default";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____default);
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
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { match, prevNode, sf1, process, task, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, prevNode__sf1____default, process__task____flowElements,
				process__sf1____flowElements, sf1__task____targetRef, task__sf1____incoming };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_0_5_blackBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		return new Object[] { match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_0_5_greenBBBF(Match match, ExclusiveGateway prevNode,
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

	public static final void pattern_T2SAfterChoiceDef_0_6_expressionBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		_this.registerObjectsToMatch_FWD(match, prevNode, sf1, process, task);

	}

	public static final boolean pattern_T2SAfterChoiceDef_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_1_1_bindingFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("flow");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_3 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_4 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("task");
		EObject tmpFlow = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpCStep = _localVariable_2;
		EObject tmpEg2cs = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpTask = _localVariable_6;
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (tmpCStep instanceof ChoiceStep) {
					ChoiceStep cStep = (ChoiceStep) tmpCStep;
					if (tmpEg2cs instanceof GW2S) {
						GW2S eg2cs = (GW2S) tmpEg2cs;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpProcess instanceof de.abilov.bpmn.Process) {
								de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
								if (tmpTask instanceof Task) {
									Task task = (Task) tmpTask;
									return new Object[] { flow, prevNode, cStep, eg2cs, sf1, process, task,
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

	public static final Object[] pattern_T2SAfterChoiceDef_1_1_blackBBBBBBBBFB(Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task,
			T2SAfterChoiceDef _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { flow, prevNode, cStep, eg2cs, sf1, process, task, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_1_1_bindingAndBlackFFFFFFFBFB(T2SAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_T2SAfterChoiceDef_1_1_binding = pattern_T2SAfterChoiceDef_1_1_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_T2SAfterChoiceDef_1_1_binding != null) {
			Flow flow = (Flow) result_pattern_T2SAfterChoiceDef_1_1_binding[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_T2SAfterChoiceDef_1_1_binding[1];
			ChoiceStep cStep = (ChoiceStep) result_pattern_T2SAfterChoiceDef_1_1_binding[2];
			GW2S eg2cs = (GW2S) result_pattern_T2SAfterChoiceDef_1_1_binding[3];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_T2SAfterChoiceDef_1_1_binding[4];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_T2SAfterChoiceDef_1_1_binding[5];
			Task task = (Task) result_pattern_T2SAfterChoiceDef_1_1_binding[6];

			Object[] result_pattern_T2SAfterChoiceDef_1_1_black = pattern_T2SAfterChoiceDef_1_1_blackBBBBBBBBFB(flow,
					prevNode, cStep, eg2cs, sf1, process, task, _this, isApplicableMatch);
			if (result_pattern_T2SAfterChoiceDef_1_1_black != null) {
				CSP csp = (CSP) result_pattern_T2SAfterChoiceDef_1_1_black[8];

				return new Object[] { flow, prevNode, cStep, eg2cs, sf1, process, task, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_1_1_greenFBBFBB(Flow flow, ChoiceStep cStep, Task task,
			CSP csp) {
		NormalStep step = UseCaseFactory.eINSTANCE.createNormalStep();
		FN2S t2s = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		flow.getSteps().add(step);
		cStep.setNext(step);
		t2s.setTarget(step);
		t2s.setSource(task);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { step, flow, cStep, t2s, task, csp };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_1_2_blackBBBB(NormalStep step, SequenceFlow sf1, FN2S t2s,
			Task task) {
		return new Object[] { step, sf1, t2s, task };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_1_2_greenFBBBB(NormalStep step, SequenceFlow sf1, FN2S t2s,
			Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getTranslatedElements().add(task);
		return new Object[] { ruleresult, step, sf1, t2s, task };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_1_3_blackBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject step, EObject flow, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject t2s,
			EObject process, EObject task) {
		if (!step.equals(t2s)) {
			if (!step.equals(task)) {
				if (!flow.equals(step)) {
					if (!flow.equals(prevNode)) {
						if (!flow.equals(sf1)) {
							if (!flow.equals(t2s)) {
								if (!flow.equals(process)) {
									if (!flow.equals(task)) {
										if (!prevNode.equals(step)) {
											if (!prevNode.equals(sf1)) {
												if (!prevNode.equals(t2s)) {
													if (!prevNode.equals(process)) {
														if (!prevNode.equals(task)) {
															if (!cStep.equals(step)) {
																if (!cStep.equals(flow)) {
																	if (!cStep.equals(prevNode)) {
																		if (!cStep.equals(eg2cs)) {
																			if (!cStep.equals(sf1)) {
																				if (!cStep.equals(t2s)) {
																					if (!cStep.equals(process)) {
																						if (!cStep.equals(task)) {
																							if (!eg2cs.equals(step)) {
																								if (!eg2cs
																										.equals(flow)) {
																									if (!eg2cs.equals(
																											prevNode)) {
																										if (!eg2cs
																												.equals(sf1)) {
																											if (!eg2cs
																													.equals(t2s)) {
																												if (!eg2cs
																														.equals(process)) {
																													if (!eg2cs
																															.equals(task)) {
																														if (!sf1.equals(
																																step)) {
																															if (!sf1.equals(
																																	t2s)) {
																																if (!sf1.equals(
																																		task)) {
																																	if (!t2s.equals(
																																			task)) {
																																		if (!process
																																				.equals(step)) {
																																			if (!process
																																					.equals(sf1)) {
																																				if (!process
																																						.equals(t2s)) {
																																					if (!process
																																							.equals(task)) {
																																						return new Object[] {
																																								ruleresult,
																																								step,
																																								flow,
																																								prevNode,
																																								cStep,
																																								eg2cs,
																																								sf1,
																																								t2s,
																																								process,
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

	public static final Object[] pattern_T2SAfterChoiceDef_1_3_greenBBBBBBBBBFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject step, EObject flow, EObject prevNode, EObject cStep, EObject sf1, EObject t2s, EObject process,
			EObject task) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "T2SAfterChoiceDef";
		String flow__step____steps_name_prime = "steps";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevNode__sf1____default_name_prime = "default";
		String cStep__step____next_name_prime = "next";
		String t2s__step____target_name_prime = "target";
		String t2s__task____source_name_prime = "source";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____default);
		cStep__step____next.setSrc(cStep);
		cStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(cStep__step____next);
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
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		cStep__step____next.setName(cStep__step____next_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { ruleresult, step, flow, prevNode, cStep, sf1, t2s, process, task, flow__step____steps,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, prevNode__sf1____default, cStep__step____next,
				t2s__step____target, t2s__task____source, process__task____flowElements, process__sf1____flowElements,
				sf1__task____targetRef, task__sf1____incoming };
	}

	public static final void pattern_T2SAfterChoiceDef_1_5_expressionBBBBBBBBBBB(T2SAfterChoiceDef _this,
			PerformRuleResult ruleresult, EObject step, EObject flow, EObject prevNode, EObject cStep, EObject eg2cs,
			EObject sf1, EObject t2s, EObject process, EObject task) {
		_this.registerObjects_FWD(ruleresult, step, flow, prevNode, cStep, eg2cs, sf1, t2s, process, task);

	}

	public static final PerformRuleResult pattern_T2SAfterChoiceDef_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_1_blackFBB(EClass eClass, T2SAfterChoiceDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_2_1_binding = pattern_T2SAfterChoiceDef_2_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_T2SAfterChoiceDef_2_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_2_1_black = pattern_T2SAfterChoiceDef_2_1_blackFBB(eClass, _this);
			if (result_pattern_T2SAfterChoiceDef_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "T2SAfterChoiceDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_2_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("sf1");
		EObject _localVariable_2 = match.getObject("process");
		EObject _localVariable_3 = match.getObject("task");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpSf1 = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpTask = _localVariable_3;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
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

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_2_2_blackBFFBBBB(ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode, GW2S.class,
					"source")) {
				Step tmpCStep = eg2cs.getTarget();
				if (tmpCStep instanceof ChoiceStep) {
					ChoiceStep cStep = (ChoiceStep) tmpCStep;
					_result.add(new Object[] { prevNode, cStep, eg2cs, sf1, process, task, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_2_3_blackFBBBBBB(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(sf1.getSourceRef())) {
			if (sf1.equals(prevNode.getDefault())) {
				if (prevNode.equals(eg2cs.getSource())) {
					if (cStep.equals(eg2cs.getTarget())) {
						if (process.getFlowElements().contains(task)) {
							if (process.getFlowElements().contains(sf1)) {
								if (process.getFlowElements().contains(prevNode)) {
									if (task.equals(sf1.getTargetRef())) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(cStep, Flow.class, "steps")) {
												_result.add(new Object[] { flow, prevNode, cStep, eg2cs, sf1, process,
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
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_3_greenBBBBBBBFFFFFFFFFFFF(Flow flow,
			ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process,
			Task task) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__cStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String flow__cStep____steps_name_prime = "steps";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevNode__sf1____default_name_prime = "default";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__cStep____target_name_prime = "target";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(task);
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(flow__cStep____steps);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____default);
		eg2cs__prevNode____source.setSrc(eg2cs);
		eg2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevNode____source);
		eg2cs__cStep____target.setSrc(eg2cs);
		eg2cs__cStep____target.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs__cStep____target);
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
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__cStep____target.setName(eg2cs__cStep____target_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { flow, prevNode, cStep, eg2cs, sf1, process, task, isApplicableMatch, flow__cStep____steps,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, prevNode__sf1____default,
				eg2cs__prevNode____source, eg2cs__cStep____target, process__task____flowElements,
				process__sf1____flowElements, process__prevNode____flowElements, sf1__task____targetRef,
				task__sf1____incoming };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_4_bindingFBBBBBBBBB(T2SAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, flow, prevNode, cStep, eg2cs, sf1,
				process, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, flow, prevNode, cStep, eg2cs, sf1, process, task };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_4_bindingAndBlackFBBBBBBBBB(T2SAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, Flow flow, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		Object[] result_pattern_T2SAfterChoiceDef_2_4_binding = pattern_T2SAfterChoiceDef_2_4_bindingFBBBBBBBBB(_this,
				isApplicableMatch, flow, prevNode, cStep, eg2cs, sf1, process, task);
		if (result_pattern_T2SAfterChoiceDef_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterChoiceDef_2_4_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_2_4_black = pattern_T2SAfterChoiceDef_2_4_blackB(csp);
			if (result_pattern_T2SAfterChoiceDef_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, flow, prevNode, cStep, eg2cs, sf1, process, task };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterChoiceDef_2_5_expressionFBB(T2SAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "T2SAfterChoiceDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_T2SAfterChoiceDef_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_10_1_blackBBBBB(T2SAfterChoiceDef _this, Match match,
			NormalStep step, Flow flow, ChoiceStep cStep) {
		return new Object[] { _this, match, step, flow, cStep };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_10_2_bindingFBBBBB(T2SAfterChoiceDef _this, Match match,
			NormalStep step, Flow flow, ChoiceStep cStep) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, step, flow, cStep);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, step, flow, cStep };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_10_2_bindingAndBlackFBBBBB(T2SAfterChoiceDef _this,
			Match match, NormalStep step, Flow flow, ChoiceStep cStep) {
		Object[] result_pattern_T2SAfterChoiceDef_10_2_binding = pattern_T2SAfterChoiceDef_10_2_bindingFBBBBB(_this,
				match, step, flow, cStep);
		if (result_pattern_T2SAfterChoiceDef_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterChoiceDef_10_2_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_10_2_black = pattern_T2SAfterChoiceDef_10_2_blackB(csp);
			if (result_pattern_T2SAfterChoiceDef_10_2_black != null) {

				return new Object[] { csp, _this, match, step, flow, cStep };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterChoiceDef_10_3_expressionFBB(T2SAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_10_4_blackBBBB(Match match, NormalStep step, Flow flow,
			ChoiceStep cStep) {
		return new Object[] { match, step, flow, cStep };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_10_4_greenBBBBFF(Match match, NormalStep step, Flow flow,
			ChoiceStep cStep) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String flow__step____steps_name_prime = "steps";
		String cStep__step____next_name_prime = "next";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		cStep__step____next.setSrc(cStep);
		cStep__step____next.setTrg(step);
		match.getToBeTranslatedEdges().add(cStep__step____next);
		flow__step____steps.setName(flow__step____steps_name_prime);
		cStep__step____next.setName(cStep__step____next_name_prime);
		return new Object[] { match, step, flow, cStep, flow__step____steps, cStep__step____next };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_10_5_blackBBBB(Match match, NormalStep step, Flow flow,
			ChoiceStep cStep) {
		return new Object[] { match, step, flow, cStep };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_10_5_greenBBBF(Match match, Flow flow, ChoiceStep cStep) {
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(flow);
		match.getContextNodes().add(cStep);
		String flow__cStep____steps_name_prime = "steps";
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		match.getContextEdges().add(flow__cStep____steps);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		return new Object[] { match, flow, cStep, flow__cStep____steps };
	}

	public static final void pattern_T2SAfterChoiceDef_10_6_expressionBBBBB(T2SAfterChoiceDef _this, Match match,
			NormalStep step, Flow flow, ChoiceStep cStep) {
		_this.registerObjectsToMatch_BWD(match, step, flow, cStep);

	}

	public static final boolean pattern_T2SAfterChoiceDef_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_11_1_bindingFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("step");
		EObject _localVariable_1 = isApplicableMatch.getObject("flow");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject tmpStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpCStep = _localVariable_3;
		EObject tmpEg2cs = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpPrevNode instanceof ExclusiveGateway) {
					ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
					if (tmpCStep instanceof ChoiceStep) {
						ChoiceStep cStep = (ChoiceStep) tmpCStep;
						if (tmpEg2cs instanceof GW2S) {
							GW2S eg2cs = (GW2S) tmpEg2cs;
							if (tmpProcess instanceof de.abilov.bpmn.Process) {
								de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
								return new Object[] { step, flow, prevNode, cStep, eg2cs, process, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_11_1_blackBBBBBBBFB(NormalStep step, Flow flow,
			ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs, de.abilov.bpmn.Process process,
			T2SAfterChoiceDef _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { step, flow, prevNode, cStep, eg2cs, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_11_1_bindingAndBlackFFFFFFBFB(T2SAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_T2SAfterChoiceDef_11_1_binding = pattern_T2SAfterChoiceDef_11_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_T2SAfterChoiceDef_11_1_binding != null) {
			NormalStep step = (NormalStep) result_pattern_T2SAfterChoiceDef_11_1_binding[0];
			Flow flow = (Flow) result_pattern_T2SAfterChoiceDef_11_1_binding[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_T2SAfterChoiceDef_11_1_binding[2];
			ChoiceStep cStep = (ChoiceStep) result_pattern_T2SAfterChoiceDef_11_1_binding[3];
			GW2S eg2cs = (GW2S) result_pattern_T2SAfterChoiceDef_11_1_binding[4];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_T2SAfterChoiceDef_11_1_binding[5];

			Object[] result_pattern_T2SAfterChoiceDef_11_1_black = pattern_T2SAfterChoiceDef_11_1_blackBBBBBBBFB(step,
					flow, prevNode, cStep, eg2cs, process, _this, isApplicableMatch);
			if (result_pattern_T2SAfterChoiceDef_11_1_black != null) {
				CSP csp = (CSP) result_pattern_T2SAfterChoiceDef_11_1_black[7];

				return new Object[] { step, flow, prevNode, cStep, eg2cs, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_11_1_greenBBFFBFB(NormalStep step, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		FN2S t2s = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		Task task = BpmnFactory.eINSTANCE.createTask();
		Object _localVariable_0 = csp.getValue("task", "id");
		sf1.setSourceRef(prevNode);
		prevNode.setDefault(sf1);
		process.getFlowElements().add(sf1);
		t2s.setTarget(step);
		t2s.setSource(task);
		process.getFlowElements().add(task);
		sf1.setTargetRef(task);
		String task_id_prime = (String) _localVariable_0;
		task.setId(task_id_prime);
		return new Object[] { step, prevNode, sf1, t2s, process, task, csp };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_11_2_blackBBBB(NormalStep step, SequenceFlow sf1, FN2S t2s,
			Task task) {
		return new Object[] { step, sf1, t2s, task };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_11_2_greenFBBBB(NormalStep step, SequenceFlow sf1, FN2S t2s,
			Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getCreatedElements().add(task);
		return new Object[] { ruleresult, step, sf1, t2s, task };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_11_3_blackBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject step, EObject flow, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject t2s,
			EObject process, EObject task) {
		if (!step.equals(t2s)) {
			if (!step.equals(task)) {
				if (!flow.equals(step)) {
					if (!flow.equals(prevNode)) {
						if (!flow.equals(sf1)) {
							if (!flow.equals(t2s)) {
								if (!flow.equals(process)) {
									if (!flow.equals(task)) {
										if (!prevNode.equals(step)) {
											if (!prevNode.equals(sf1)) {
												if (!prevNode.equals(t2s)) {
													if (!prevNode.equals(process)) {
														if (!prevNode.equals(task)) {
															if (!cStep.equals(step)) {
																if (!cStep.equals(flow)) {
																	if (!cStep.equals(prevNode)) {
																		if (!cStep.equals(eg2cs)) {
																			if (!cStep.equals(sf1)) {
																				if (!cStep.equals(t2s)) {
																					if (!cStep.equals(process)) {
																						if (!cStep.equals(task)) {
																							if (!eg2cs.equals(step)) {
																								if (!eg2cs
																										.equals(flow)) {
																									if (!eg2cs.equals(
																											prevNode)) {
																										if (!eg2cs
																												.equals(sf1)) {
																											if (!eg2cs
																													.equals(t2s)) {
																												if (!eg2cs
																														.equals(process)) {
																													if (!eg2cs
																															.equals(task)) {
																														if (!sf1.equals(
																																step)) {
																															if (!sf1.equals(
																																	t2s)) {
																																if (!sf1.equals(
																																		task)) {
																																	if (!t2s.equals(
																																			task)) {
																																		if (!process
																																				.equals(step)) {
																																			if (!process
																																					.equals(sf1)) {
																																				if (!process
																																						.equals(t2s)) {
																																					if (!process
																																							.equals(task)) {
																																						return new Object[] {
																																								ruleresult,
																																								step,
																																								flow,
																																								prevNode,
																																								cStep,
																																								eg2cs,
																																								sf1,
																																								t2s,
																																								process,
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

	public static final Object[] pattern_T2SAfterChoiceDef_11_3_greenBBBBBBBBBFFFFFFFFFFF(PerformRuleResult ruleresult,
			EObject step, EObject flow, EObject prevNode, EObject cStep, EObject sf1, EObject t2s, EObject process,
			EObject task) {
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "T2SAfterChoiceDef";
		String flow__step____steps_name_prime = "steps";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevNode__sf1____default_name_prime = "default";
		String cStep__step____next_name_prime = "next";
		String t2s__step____target_name_prime = "target";
		String t2s__task____source_name_prime = "source";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____default);
		cStep__step____next.setSrc(cStep);
		cStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(cStep__step____next);
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
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		cStep__step____next.setName(cStep__step____next_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { ruleresult, step, flow, prevNode, cStep, sf1, t2s, process, task, flow__step____steps,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, prevNode__sf1____default, cStep__step____next,
				t2s__step____target, t2s__task____source, process__task____flowElements, process__sf1____flowElements,
				sf1__task____targetRef, task__sf1____incoming };
	}

	public static final void pattern_T2SAfterChoiceDef_11_5_expressionBBBBBBBBBBB(T2SAfterChoiceDef _this,
			PerformRuleResult ruleresult, EObject step, EObject flow, EObject prevNode, EObject cStep, EObject eg2cs,
			EObject sf1, EObject t2s, EObject process, EObject task) {
		_this.registerObjects_BWD(ruleresult, step, flow, prevNode, cStep, eg2cs, sf1, t2s, process, task);

	}

	public static final PerformRuleResult pattern_T2SAfterChoiceDef_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_1_blackFBB(EClass eClass, T2SAfterChoiceDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_12_1_binding = pattern_T2SAfterChoiceDef_12_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_T2SAfterChoiceDef_12_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_12_1_black = pattern_T2SAfterChoiceDef_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "T2SAfterChoiceDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("step");
		EObject _localVariable_1 = match.getObject("flow");
		EObject _localVariable_2 = match.getObject("cStep");
		EObject tmpStep = _localVariable_0;
		EObject tmpFlow = _localVariable_1;
		EObject tmpCStep = _localVariable_2;
		if (tmpStep instanceof NormalStep) {
			NormalStep step = (NormalStep) tmpStep;
			if (tmpFlow instanceof Flow) {
				Flow flow = (Flow) tmpFlow;
				if (tmpCStep instanceof ChoiceStep) {
					ChoiceStep cStep = (ChoiceStep) tmpCStep;
					return new Object[] { step, flow, cStep, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_12_2_blackBBFBFB(NormalStep step, Flow flow,
			ChoiceStep cStep, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cStep, GW2S.class,
				"target")) {
			Gateway tmpPrevNode = eg2cs.getSource();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				boolean prevNodeisDiverging = prevNode.isIsDiverging();
				if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
					_result.add(new Object[] { step, flow, prevNode, cStep, eg2cs, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_12_3_blackBBBBBF(NormalStep step, Flow flow,
			ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (flow.getSteps().contains(cStep)) {
			if (flow.getSteps().contains(step)) {
				if (step.equals(cStep.getNext())) {
					if (prevNode.equals(eg2cs.getSource())) {
						if (cStep.equals(eg2cs.getTarget())) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class,
												"flowElements")) {
									_result.add(new Object[] { step, flow, prevNode, cStep, eg2cs, process });
								}
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_3_greenBBBBBBFFFFFFF(NormalStep step, Flow flow,
			ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs, de.abilov.bpmn.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__cStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String flow__cStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String cStep__step____next_name_prime = "next";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__cStep____target_name_prime = "target";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(process);
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(flow__cStep____steps);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		cStep__step____next.setSrc(cStep);
		cStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(cStep__step____next);
		eg2cs__prevNode____source.setSrc(eg2cs);
		eg2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevNode____source);
		eg2cs__cStep____target.setSrc(eg2cs);
		eg2cs__cStep____target.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs__cStep____target);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		cStep__step____next.setName(cStep__step____next_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__cStep____target.setName(eg2cs__cStep____target_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { step, flow, prevNode, cStep, eg2cs, process, isApplicableMatch, flow__cStep____steps,
				flow__step____steps, cStep__step____next, eg2cs__prevNode____source, eg2cs__cStep____target,
				process__prevNode____flowElements };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_4_bindingFBBBBBBBB(T2SAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, NormalStep step, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, de.abilov.bpmn.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, step, flow, prevNode, cStep, eg2cs,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, step, flow, prevNode, cStep, eg2cs, process };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_4_bindingAndBlackFBBBBBBBB(T2SAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, NormalStep step, Flow flow, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, de.abilov.bpmn.Process process) {
		Object[] result_pattern_T2SAfterChoiceDef_12_4_binding = pattern_T2SAfterChoiceDef_12_4_bindingFBBBBBBBB(_this,
				isApplicableMatch, step, flow, prevNode, cStep, eg2cs, process);
		if (result_pattern_T2SAfterChoiceDef_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_T2SAfterChoiceDef_12_4_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_12_4_black = pattern_T2SAfterChoiceDef_12_4_blackB(csp);
			if (result_pattern_T2SAfterChoiceDef_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, step, flow, prevNode, cStep, eg2cs, process };
			}
		}
		return null;
	}

	public static final boolean pattern_T2SAfterChoiceDef_12_5_expressionFBB(T2SAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "T2SAfterChoiceDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_T2SAfterChoiceDef_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_20_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_20_1_blackFBB(EClass __eClass, T2SAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_20_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_20_1_binding = pattern_T2SAfterChoiceDef_20_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterChoiceDef_20_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_20_1_black = pattern_T2SAfterChoiceDef_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_20_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_709111 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_709111)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_20_2_black_nac_1BB(NormalStep step, ChoiceStep cStep) {
		for (Step __DEC_step_next_660643 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_660643)) {
				if (!cStep.equals(__DEC_step_next_660643)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_20_2_blackFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_T2SAfterChoiceDef_20_2_black_nac_0BB(step, flow) == null) {
						for (Step tmpCStep : flow.getSteps()) {
							if (tmpCStep instanceof ChoiceStep) {
								ChoiceStep cStep = (ChoiceStep) tmpCStep;
								if (step.equals(cStep.getNext())) {
									if (pattern_T2SAfterChoiceDef_20_2_black_nac_1BB(step, cStep) == null) {
										_result.add(new Object[] { step, flow, cStep, _edge_steps });
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

	public static final Object[] pattern_T2SAfterChoiceDef_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterChoiceDef_20_3_expressionFBBBBB(T2SAfterChoiceDef _this, Match match,
			NormalStep step, Flow flow, ChoiceStep cStep) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, flow, cStep);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_20_4_expressionFBB(T2SAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterChoiceDef_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_1_blackFBB(EClass __eClass, T2SAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_21_1_binding = pattern_T2SAfterChoiceDef_21_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterChoiceDef_21_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_21_1_black = pattern_T2SAfterChoiceDef_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_9262 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_9262)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_758961 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_758961)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_348197 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_348197)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_21_2_blackFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					if (sf1.equals(prevNode.getDefault())) {
						FlowNode tmpTask = sf1.getTargetRef();
						if (tmpTask instanceof Task) {
							Task task = (Task) tmpTask;
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								if (pattern_T2SAfterChoiceDef_21_2_black_nac_0BB(sf1, prevNode) == null) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(task)) {
											if (process.getFlowElements().contains(prevNode)) {
												if (pattern_T2SAfterChoiceDef_21_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_T2SAfterChoiceDef_21_2_black_nac_2BB(task,
															process) == null) {
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

		}

		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterChoiceDef_21_3_expressionFBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_21_4_expressionFBB(T2SAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterChoiceDef_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_1_blackFBB(EClass __eClass, T2SAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_22_1_binding = pattern_T2SAfterChoiceDef_22_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterChoiceDef_22_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_22_1_black = pattern_T2SAfterChoiceDef_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_657930 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_657930)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_354754 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_354754)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_689847 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_689847)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_22_2_blackFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					if (sf1.equals(prevNode.getDefault())) {
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							FlowNode tmpTask = sf1.getTargetRef();
							if (tmpTask instanceof Task) {
								Task task = (Task) tmpTask;
								if (pattern_T2SAfterChoiceDef_22_2_black_nac_0BB(sf1, prevNode) == null) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(task)) {
											if (process.getFlowElements().contains(sf1)) {
												if (pattern_T2SAfterChoiceDef_22_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_T2SAfterChoiceDef_22_2_black_nac_2BB(task,
															process) == null) {
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

		}

		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterChoiceDef_22_3_expressionFBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_22_4_expressionFBB(T2SAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterChoiceDef_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_23_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_23_1_blackFBB(EClass __eClass, T2SAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_23_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_23_1_binding = pattern_T2SAfterChoiceDef_23_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterChoiceDef_23_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_23_1_black = pattern_T2SAfterChoiceDef_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_23_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_158333 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_158333)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_965808 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_965808)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_23_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_867156 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_867156)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_23_2_blackFFFFB(EMoflonEdge _edge_default) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_default.getSrc();
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_default.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					if (sf1.equals(prevNode.getDefault())) {
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							FlowNode tmpTask = sf1.getTargetRef();
							if (tmpTask instanceof Task) {
								Task task = (Task) tmpTask;
								if (pattern_T2SAfterChoiceDef_23_2_black_nac_0BB(sf1, prevNode) == null) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(task)) {
											if (process.getFlowElements().contains(sf1)) {
												if (pattern_T2SAfterChoiceDef_23_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_T2SAfterChoiceDef_23_2_black_nac_2BB(task,
															process) == null) {
														_result.add(new Object[] { prevNode, sf1, process, task,
																_edge_default });
													}
												}
											}
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

	public static final Object[] pattern_T2SAfterChoiceDef_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterChoiceDef_23_3_expressionFBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_23_4_expressionFBB(T2SAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterChoiceDef_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_24_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_24_1_blackFBB(EClass __eClass, T2SAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_24_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_24_1_binding = pattern_T2SAfterChoiceDef_24_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterChoiceDef_24_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_24_1_black = pattern_T2SAfterChoiceDef_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_24_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_256062 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_256062)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_24_2_black_nac_1BB(NormalStep step, ChoiceStep cStep) {
		for (Step __DEC_step_next_601134 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_601134)) {
				if (!cStep.equals(__DEC_step_next_601134)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_24_2_blackFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCStep = _edge_next.getSrc();
		if (tmpCStep instanceof ChoiceStep) {
			ChoiceStep cStep = (ChoiceStep) tmpCStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (step.equals(cStep.getNext())) {
					if (pattern_T2SAfterChoiceDef_24_2_black_nac_1BB(step, cStep) == null) {
						for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cStep,
								Flow.class, "steps")) {
							if (flow.getSteps().contains(step)) {
								if (pattern_T2SAfterChoiceDef_24_2_black_nac_0BB(step, flow) == null) {
									_result.add(new Object[] { step, flow, cStep, _edge_next });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterChoiceDef_24_3_expressionFBBBBB(T2SAfterChoiceDef _this, Match match,
			NormalStep step, Flow flow, ChoiceStep cStep) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, step, flow, cStep);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_24_4_expressionFBB(T2SAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterChoiceDef_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_25_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_25_1_blackFBB(EClass __eClass, T2SAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_25_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_25_1_binding = pattern_T2SAfterChoiceDef_25_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterChoiceDef_25_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_25_1_black = pattern_T2SAfterChoiceDef_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_25_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_910589 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_910589)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_422745 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_422745)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_25_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_420521 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_420521)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_25_2_blackFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (process.getFlowElements().contains(task)) {
					if (pattern_T2SAfterChoiceDef_25_2_black_nac_2BB(task, process) == null) {
						for (FlowElement tmpSf1 : process.getFlowElements()) {
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (task.equals(sf1.getTargetRef())) {
									FlowNode tmpPrevNode = sf1.getSourceRef();
									if (tmpPrevNode instanceof ExclusiveGateway) {
										ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
										if (sf1.equals(prevNode.getDefault())) {
											if (process.getFlowElements().contains(prevNode)) {
												boolean prevNodeisDiverging = prevNode.isIsDiverging();
												if (Boolean.valueOf(prevNodeisDiverging)
														.equals(Boolean.valueOf(true))) {
													if (pattern_T2SAfterChoiceDef_25_2_black_nac_1BB(sf1,
															process) == null) {
														if (pattern_T2SAfterChoiceDef_25_2_black_nac_0BB(sf1,
																prevNode) == null) {
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

	public static final Object[] pattern_T2SAfterChoiceDef_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterChoiceDef_25_3_expressionFBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_25_4_expressionFBB(T2SAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterChoiceDef_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_26_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_26_1_blackFBB(EClass __eClass, T2SAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_26_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_26_1_binding = pattern_T2SAfterChoiceDef_26_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterChoiceDef_26_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_26_1_black = pattern_T2SAfterChoiceDef_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_26_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_378019 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_378019)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_393073 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_393073)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_26_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_201439 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_201439)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_26_2_blackFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						if (sf1.equals(prevNode.getDefault())) {
							if (process.getFlowElements().contains(prevNode)) {
								FlowNode tmpTask = sf1.getTargetRef();
								if (tmpTask instanceof Task) {
									Task task = (Task) tmpTask;
									if (process.getFlowElements().contains(task)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_T2SAfterChoiceDef_26_2_black_nac_1BB(sf1, process) == null) {
												if (pattern_T2SAfterChoiceDef_26_2_black_nac_0BB(sf1,
														prevNode) == null) {
													if (pattern_T2SAfterChoiceDef_26_2_black_nac_2BB(task,
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

	public static final Object[] pattern_T2SAfterChoiceDef_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterChoiceDef_26_3_expressionFBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_26_4_expressionFBB(T2SAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterChoiceDef_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_1_blackFBB(EClass __eClass, T2SAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_27_1_binding = pattern_T2SAfterChoiceDef_27_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterChoiceDef_27_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_27_1_black = pattern_T2SAfterChoiceDef_27_1_blackFBB(__eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_326755 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_326755)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_42472 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_42472)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_2164 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_2164)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_27_2_blackFFFFB(EMoflonEdge _edge_targetRef) {
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
						if (sf1.equals(prevNode.getDefault())) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								if (pattern_T2SAfterChoiceDef_27_2_black_nac_0BB(sf1, prevNode) == null) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(task)) {
											if (process.getFlowElements().contains(prevNode)) {
												if (pattern_T2SAfterChoiceDef_27_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_T2SAfterChoiceDef_27_2_black_nac_2BB(task,
															process) == null) {
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

		}

		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterChoiceDef_27_3_expressionFBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_27_4_expressionFBB(T2SAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterChoiceDef_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_1_bindingFB(T2SAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_1_blackFBB(EClass __eClass, T2SAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_1_bindingAndBlackFFB(T2SAfterChoiceDef _this) {
		Object[] result_pattern_T2SAfterChoiceDef_28_1_binding = pattern_T2SAfterChoiceDef_28_1_bindingFB(_this);
		if (result_pattern_T2SAfterChoiceDef_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_T2SAfterChoiceDef_28_1_binding[0];

			Object[] result_pattern_T2SAfterChoiceDef_28_1_black = pattern_T2SAfterChoiceDef_28_1_blackFBB(__eClass,
					_this);
			if (result_pattern_T2SAfterChoiceDef_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_T2SAfterChoiceDef_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_404961 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_404961)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_621539 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_621539)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_749241 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_749241)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_T2SAfterChoiceDef_28_2_blackFFFFB(EMoflonEdge _edge_incoming) {
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
						if (sf1.equals(prevNode.getDefault())) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								if (pattern_T2SAfterChoiceDef_28_2_black_nac_0BB(sf1, prevNode) == null) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(sf1)) {
											if (process.getFlowElements().contains(prevNode)) {
												if (pattern_T2SAfterChoiceDef_28_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_T2SAfterChoiceDef_28_2_black_nac_2BB(task,
															process) == null) {
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

		}

		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_T2SAfterChoiceDef_28_3_expressionFBBBBBB(T2SAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_T2SAfterChoiceDef_28_4_expressionFBB(T2SAfterChoiceDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_T2SAfterChoiceDef_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_T2SAfterChoiceDef_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //T2SAfterChoiceDefImpl
