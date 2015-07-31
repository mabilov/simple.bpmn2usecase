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
import de.abilov.tgg.bpmn2useCase.P2UC;

import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;
import de.abilov.tgg.bpmn2useCase.Rules.Task2StepAfterChoice;

import de.abilov.useCase.AlternativeFlow;
import de.abilov.useCase.ChoiceStep;
import de.abilov.useCase.Flow;
import de.abilov.useCase.NormalStep;
import de.abilov.useCase.Step;
import de.abilov.useCase.StepAlternative;
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
 * An implementation of the model object '<em><b>Task2 Step After Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Task2StepAfterChoiceImpl extends AbstractRuleImpl implements Task2StepAfterChoice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task2StepAfterChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTask2StepAfterChoice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, Task task) {
		// initial bindings
		Object[] result1_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_0_1_blackBBBBBB(this, match,
				prevNode, sf1, process, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[sf1] = " + sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_0_2_bindingAndBlackFBBBBBB(this, match, prevNode, sf1, process, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1
					+ ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_0_4_blackBBBBB(match,
					prevNode, sf1, process, task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
			}
			Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_0_4_greenBBBBBFFFFFF(match, prevNode, sf1, process,
					task);
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[5];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[6];
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[7];
					// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_0_5_blackBBBBB(match,
					prevNode, sf1, process, task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[task] = " + task + ".");
			}
			Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_0_6_expressionBBBBBB(this, match, prevNode, sf1,
					process, task);
			return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_0_7_expressionF();
		} else {
			return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_1_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[2];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[3];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[4];
		UseCase useCase = (UseCase) result1_bindingAndBlack[5];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[6];
		Flow flow = (Flow) result1_bindingAndBlack[7];
		Task task = (Task) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_1_1_greenBFFBFFBB(cStep, useCase,
				task, csp);
		NormalStep step = (NormalStep) result1_green[1];
		AlternativeFlow altFlow = (AlternativeFlow) result1_green[2];
		StepAlternative alt = (StepAlternative) result1_green[4];
		FN2S t2s = (FN2S) result1_green[5];

		// collect translated elements
		Object[] result2_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_1_2_blackBBBBBB(sf1, step,
				altFlow, alt, t2s, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[step] = " + step + ", " + "[altFlow] = " + altFlow + ", " + "[alt] = "
					+ alt + ", " + "[t2s] = " + t2s + ", " + "[task] = " + task + ".");
		}
		Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_1_2_greenFBBBBBB(sf1, step,
				altFlow, alt, t2s, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_1_3_blackBBBBBBBBBBBBBB(
				ruleresult, prevNode, cStep, eg2cs, sf1, step, altFlow, process, useCase, p2uc, alt, flow, t2s, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep
					+ ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[step] = " + step + ", "
					+ "[altFlow] = " + altFlow + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[p2uc] = " + p2uc + ", " + "[alt] = " + alt + ", " + "[flow] = " + flow + ", "
					+ "[t2s] = " + t2s + ", " + "[task] = " + task + ".");
		}
		Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_1_3_greenBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, prevNode,
				cStep, sf1, step, altFlow, process, useCase, alt, t2s, task);
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[12];
				// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result3_green[13];
				// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[17];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[22];

		// perform postprocessing story node is empty
		// register objects
		Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_1_5_expressionBBBBBBBBBBBBBBB(this, ruleresult, prevNode,
				cStep, eg2cs, sf1, step, altFlow, process, useCase, p2uc, alt, flow, t2s, task);
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_2_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[0];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[1];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[2];
		Task task = (Task) result2_binding[3];
		for (Object[] result2_black : Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_2_2_blackBFFBBFFBB(prevNode,
				sf1, process, task, match)) {
			ChoiceStep cStep = (ChoiceStep) result2_black[1];
			GW2S eg2cs = (GW2S) result2_black[2];
			UseCase useCase = (UseCase) result2_black[5];
			P2UC p2uc = (P2UC) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_2_3_blackBBBBBBBFB(
					prevNode, cStep, eg2cs, sf1, process, useCase, p2uc, task)) {
				Flow flow = (Flow) result3_black[7];
				Object[] result3_green = Task2StepAfterChoiceImpl
						.pattern_Task2StepAfterChoice_2_3_greenBBBBBBBBBFFFFFFFFFFFFFF(prevNode, cStep, eg2cs, sf1,
								process, useCase, p2uc, flow, task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eg2cs__cStep____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[22];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2StepAfterChoiceImpl
						.pattern_Task2StepAfterChoice_2_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, prevNode,
								cStep, eg2cs, sf1, process, useCase, p2uc, flow, task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed." + " Variables: " + "[this] = " + this + ", "
									+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[prevNode] = " + prevNode
									+ ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = "
									+ sf1 + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase + ", "
									+ "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", " + "[task] = " + task + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2StepAfterChoiceImpl
							.pattern_Task2StepAfterChoice_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			Flow flow, Task task) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sf1_conditionExpression = CSPFactoryHelper.eINSTANCE.createVariable("sf1.conditionExpression",
				true, csp);
		var_sf1_conditionExpression.setValue(sf1.getConditionExpression());
		var_sf1_conditionExpression.setType("String");
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", true, csp);
		var_task_id.setValue(task.getId());
		var_task_id.setType("String");

		// Create unbound variables
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable("alt.condition", csp);
		var_alt_condition.setType("String");
		Variable var_altFlow_id = CSPFactoryHelper.eINSTANCE.createVariable("altFlow.id", csp);
		var_altFlow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_conditionExpression, var_alt_condition);
		eq_0.setRuleName("");
		eq_0.solve(var_sf1_id, var_altFlow_id);
		eq_1.setRuleName("");
		eq_1.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject eg2cs,
			EObject sf1, EObject step, EObject altFlow, EObject process, EObject useCase, EObject p2uc, EObject alt,
			EObject flow, EObject t2s, EObject task) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("alt", alt);
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
	public boolean isAppropriate_BWD(Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow,
			UseCase useCase, StepAlternative alt, Flow flow) {
		// initial bindings
		Object[] result1_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_10_1_blackBBBBBBBB(this, match,
				cStep, step, altFlow, useCase, alt, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[cStep] = " + cStep + ", "
					+ "[step] = " + step + ", " + "[altFlow] = " + altFlow + ", " + "[useCase] = " + useCase + ", "
					+ "[alt] = " + alt + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_10_2_bindingAndBlackFBBBBBBBB(this, match, cStep, step, altFlow, useCase,
						alt, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[cStep] = " + cStep + ", " + "[step] = " + step
					+ ", " + "[altFlow] = " + altFlow + ", " + "[useCase] = " + useCase + ", " + "[alt] = " + alt + ", "
					+ "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_10_4_blackBBBBBBB(match,
					cStep, step, altFlow, useCase, alt, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[cStep] = " + cStep + ", " + "[step] = "
						+ step + ", " + "[altFlow] = " + altFlow + ", " + "[useCase] = " + useCase + ", " + "[alt] = "
						+ alt + ", " + "[flow] = " + flow + ".");
			}
			Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_10_4_greenBBBBBBFFFF(match, cStep, step, altFlow,
					useCase, alt);
					// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result4_green[6];
					// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result4_green[7];
					// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result4_green[8];
					// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_10_5_blackBBBBBBB(match,
					cStep, step, altFlow, useCase, alt, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[cStep] = " + cStep + ", " + "[step] = "
						+ step + ", " + "[altFlow] = " + altFlow + ", " + "[useCase] = " + useCase + ", " + "[alt] = "
						+ alt + ", " + "[flow] = " + flow + ".");
			}
			Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_10_5_greenBBBBFF(match, cStep, useCase, flow);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_10_6_expressionBBBBBBBB(this, match, cStep, step,
					altFlow, useCase, alt, flow);
			return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_10_7_expressionF();
		} else {
			return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_11_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[2];
		NormalStep step = (NormalStep) result1_bindingAndBlack[3];
		AlternativeFlow altFlow = (AlternativeFlow) result1_bindingAndBlack[4];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[5];
		UseCase useCase = (UseCase) result1_bindingAndBlack[6];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[7];
		StepAlternative alt = (StepAlternative) result1_bindingAndBlack[8];
		Flow flow = (Flow) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_11_1_greenBFBBFFB(prevNode, step,
				process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[1];
		FN2S t2s = (FN2S) result1_green[4];
		Task task = (Task) result1_green[5];

		// collect translated elements
		Object[] result2_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_11_2_blackBBBBBB(sf1, step,
				altFlow, alt, t2s, task);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[step] = " + step + ", " + "[altFlow] = " + altFlow + ", " + "[alt] = "
					+ alt + ", " + "[t2s] = " + t2s + ", " + "[task] = " + task + ".");
		}
		Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_11_2_greenFBBBBBB(sf1, step,
				altFlow, alt, t2s, task);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_11_3_blackBBBBBBBBBBBBBB(
				ruleresult, prevNode, cStep, eg2cs, sf1, step, altFlow, process, useCase, p2uc, alt, flow, t2s, task);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep
					+ ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[step] = " + step + ", "
					+ "[altFlow] = " + altFlow + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
					+ ", " + "[p2uc] = " + p2uc + ", " + "[alt] = " + alt + ", " + "[flow] = " + flow + ", "
					+ "[t2s] = " + t2s + ", " + "[task] = " + task + ".");
		}
		Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_11_3_greenBBBBBBBBBBBFFFFFFFFFFFF(ruleresult, prevNode,
				cStep, sf1, step, altFlow, process, useCase, alt, t2s, task);
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[12];
				// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result3_green[13];
				// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[17];
				// EMoflonEdge t2s__step____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge t2s__task____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[22];

		// perform postprocessing story node is empty
		// register objects
		Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_11_5_expressionBBBBBBBBBBBBBBB(this, ruleresult, prevNode,
				cStep, eg2cs, sf1, step, altFlow, process, useCase, p2uc, alt, flow, t2s, task);
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_12_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep cStep = (ChoiceStep) result2_binding[0];
		NormalStep step = (NormalStep) result2_binding[1];
		AlternativeFlow altFlow = (AlternativeFlow) result2_binding[2];
		UseCase useCase = (UseCase) result2_binding[3];
		StepAlternative alt = (StepAlternative) result2_binding[4];
		Flow flow = (Flow) result2_binding[5];
		for (Object[] result2_black : Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_12_2_blackFBFBBFBFBBB(cStep,
				step, altFlow, useCase, alt, flow, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S eg2cs = (GW2S) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[5];
			P2UC p2uc = (P2UC) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_12_3_blackBBBBBBBBBB(
					prevNode, cStep, eg2cs, step, altFlow, process, useCase, p2uc, alt, flow)) {
				Object[] result3_green = Task2StepAfterChoiceImpl
						.pattern_Task2StepAfterChoice_12_3_greenBBBBBBBBBBFFFFFFFFFFFF(prevNode, cStep, eg2cs, step,
								altFlow, process, useCase, p2uc, alt, flow);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eg2cs__cStep____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[16];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[17];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[18];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[19];
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[20];
				// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result3_green[21];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2StepAfterChoiceImpl
						.pattern_Task2StepAfterChoice_12_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
								prevNode, cStep, eg2cs, step, altFlow, process, useCase, p2uc, alt, flow);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[cStep] = " + cStep + ", " + "[eg2cs] = " + eg2cs
							+ ", " + "[step] = " + step + ", " + "[altFlow] = " + altFlow + ", " + "[process] = "
							+ process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[alt] = "
							+ alt + ", " + "[flow] = " + flow + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2StepAfterChoiceImpl
							.pattern_Task2StepAfterChoice_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow,
			UseCase useCase, StepAlternative alt, Flow flow) {
		match.registerObject("cStep", cStep);
		match.registerObject("step", step);
		match.registerObject("altFlow", altFlow);
		match.registerObject("useCase", useCase);
		match.registerObject("alt", alt);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow,
			UseCase useCase, StepAlternative alt, Flow flow) {// Create CSP
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
			ChoiceStep cStep, GW2S eg2cs, NormalStep step, AlternativeFlow altFlow, de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, StepAlternative alt, Flow flow) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable("alt.condition", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("String");
		Variable var_altFlow_id = CSPFactoryHelper.eINSTANCE.createVariable("altFlow.id", true, csp);
		var_altFlow_id.setValue(altFlow.getId());
		var_altFlow_id.setType("String");
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables
		Variable var_sf1_conditionExpression = CSPFactoryHelper.eINSTANCE.createVariable("sf1.conditionExpression",
				csp);
		var_sf1_conditionExpression.setType("String");
		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1.id", csp);
		var_sf1_id.setType("String");
		Variable var_task_id = CSPFactoryHelper.eINSTANCE.createVariable("task.id", csp);
		var_task_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_sf1_conditionExpression, var_alt_condition);
		eq_0.setRuleName("");
		eq_0.solve(var_sf1_id, var_altFlow_id);
		eq_1.setRuleName("");
		eq_1.solve(var_task_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("altFlow", altFlow);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("alt", alt);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject eg2cs,
			EObject sf1, EObject step, EObject altFlow, EObject process, EObject useCase, EObject p2uc, EObject alt,
			EObject flow, EObject t2s, EObject task) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("alt", alt);
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
				&& match.getObject("altFlow").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getAlternativeFlow())
				&& match.getObject("alt").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getStepAlternative());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_491(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_20_2_blackFFFFB(_edge_sourceRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_20_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_492(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_21_2_blackFFFFB(_edge_outgoing)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_21_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_148(EMoflonEdge _edge_stepAlternatives) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_22_2_blackFFFFFFB(_edge_stepAlternatives)) {
			ChoiceStep cStep = (ChoiceStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			StepAlternative alt = (StepAlternative) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_22_3_expressionFBBBBBBBB(this, match, cStep, step,
					altFlow, useCase, alt, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_149(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_23_2_blackFFFFFFB(_edge_steps)) {
			ChoiceStep cStep = (ChoiceStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			StepAlternative alt = (StepAlternative) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_23_3_expressionFBBBBBBBB(this, match, cStep, step,
					altFlow, useCase, alt, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_493(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_24_2_blackFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_24_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_150(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_25_2_blackFFFFFFB(_edge_flows)) {
			ChoiceStep cStep = (ChoiceStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			StepAlternative alt = (StepAlternative) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_25_3_expressionFBBBBBBBB(this, match, cStep, step,
					altFlow, useCase, alt, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_151(EMoflonEdge _edge_ref) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_26_2_blackFFFFFFB(_edge_ref)) {
			ChoiceStep cStep = (ChoiceStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[2];
			UseCase useCase = (UseCase) result2_black[3];
			StepAlternative alt = (StepAlternative) result2_black[4];
			Flow flow = (Flow) result2_black[5];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_26_3_expressionFBBBBBBBB(this, match, cStep, step,
					altFlow, useCase, alt, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_494(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_27_2_blackFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_27_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_495(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_28_2_blackFFFFB(_edge_targetRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_28_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_28_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_496(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2StepAfterChoiceImpl
				.pattern_Task2StepAfterChoice_29_2_blackFFFFB(_edge_incoming)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			Task task = (Task) result2_black[3];
			Object[] result2_green = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_29_3_expressionFBBBBBB(this, match, prevNode, sf1,
					process, task)) {
				// Ensure that the correct types of elements are matched
				if (Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_29_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return Task2StepAfterChoiceImpl.pattern_Task2StepAfterChoice_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Task2StepAfterChoice");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

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

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForAltFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("altFlow")).findAny();
		de.abilov.useCase.AlternativeFlow altFlow = (de.abilov.useCase.AlternativeFlow) matchForAltFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForAlt = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("alt")).findAny();
		de.abilov.useCase.StepAlternative alt = (de.abilov.useCase.StepAlternative) matchForAlt.get().getNode();

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

		Variable var_sf1_conditionExpression = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_conditionExpression.setValue(sf1.getConditionExpression());
		var_sf1_conditionExpression.setType("String");

		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable("alt", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("String");

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_altFlow_id = CSPFactoryHelper.eINSTANCE.createVariable("altFlow", true, csp);
		var_altFlow_id.setValue(altFlow.getId());
		var_altFlow_id.setType("String");

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

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("Task2StepAfterChoice");
		eq0.solve(var_sf1_conditionExpression, var_alt_condition);

		eq1.setRuleName("Task2StepAfterChoice");
		eq1.solve(var_sf1_id, var_altFlow_id);

		eq2.setRuleName("Task2StepAfterChoice");
		eq2.solve(var_task_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_alt_condition.setBound(false);
			var_altFlow_id.setBound(false);
			var_step_id.setBound(false);
			eq0.solve(var_sf1_conditionExpression, var_alt_condition);
			eq1.solve(var_sf1_id, var_altFlow_id);
			eq2.solve(var_task_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				alt.setCondition((String) var_alt_condition.getValue());
				altFlow.setId((String) var_altFlow_id.getValue());
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
		ruleResult.setRule("Task2StepAfterChoice");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

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

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForAltFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("altFlow")).findAny();
		de.abilov.useCase.AlternativeFlow altFlow = (de.abilov.useCase.AlternativeFlow) matchForAltFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForAlt = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("alt")).findAny();
		de.abilov.useCase.StepAlternative alt = (de.abilov.useCase.StepAlternative) matchForAlt.get().getNode();

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

		Variable var_sf1_conditionExpression = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_conditionExpression.setValue(sf1.getConditionExpression());
		var_sf1_conditionExpression.setType("String");

		Variable var_alt_condition = CSPFactoryHelper.eINSTANCE.createVariable("alt", true, csp);
		var_alt_condition.setValue(alt.getCondition());
		var_alt_condition.setType("String");

		Variable var_sf1_id = CSPFactoryHelper.eINSTANCE.createVariable("sf1", true, csp);
		var_sf1_id.setValue(sf1.getId());
		var_sf1_id.setType("String");

		Variable var_altFlow_id = CSPFactoryHelper.eINSTANCE.createVariable("altFlow", true, csp);
		var_altFlow_id.setValue(altFlow.getId());
		var_altFlow_id.setType("String");

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

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("Task2StepAfterChoice");
		eq0.solve(var_sf1_conditionExpression, var_alt_condition);

		eq1.setRuleName("Task2StepAfterChoice");
		eq1.solve(var_sf1_id, var_altFlow_id);

		eq2.setRuleName("Task2StepAfterChoice");
		eq2.solve(var_task_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf1_conditionExpression.setBound(false);
			var_sf1_id.setBound(false);
			var_task_id.setBound(false);
			eq0.solve(var_sf1_conditionExpression, var_alt_condition);
			eq1.solve(var_sf1_id, var_altFlow_id);
			eq2.solve(var_task_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				sf1.setConditionExpression((String) var_sf1_conditionExpression.getValue());
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
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(Task) arguments.get(4));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(Task) arguments.get(4));
			return null;
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(Task) arguments.get(4));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_PROCESS_USECASE_P2UC_FLOW_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (SequenceFlow) arguments.get(4),
					(de.abilov.bpmn.Process) arguments.get(5), (UseCase) arguments.get(6), (P2UC) arguments.get(7),
					(Flow) arguments.get(8), (Task) arguments.get(9));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(NormalStep) arguments.get(2), (AlternativeFlow) arguments.get(3), (UseCase) arguments.get(4),
					(StepAlternative) arguments.get(5), (Flow) arguments.get(6));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(NormalStep) arguments.get(2), (AlternativeFlow) arguments.get(3), (UseCase) arguments.get(4),
					(StepAlternative) arguments.get(5), (Flow) arguments.get(6));
			return null;
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_NORMALSTEP_ALTERNATIVEFLOW_USECASE_STEPALTERNATIVE_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(NormalStep) arguments.get(2), (AlternativeFlow) arguments.get(3), (UseCase) arguments.get(4),
					(StepAlternative) arguments.get(5), (Flow) arguments.get(6));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_NORMALSTEP_ALTERNATIVEFLOW_PROCESS_USECASE_P2UC_STEPALTERNATIVE_FLOW:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (NormalStep) arguments.get(4),
					(AlternativeFlow) arguments.get(5), (de.abilov.bpmn.Process) arguments.get(6),
					(UseCase) arguments.get(7), (P2UC) arguments.get(8), (StepAlternative) arguments.get(9),
					(Flow) arguments.get(10));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_491__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_491((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_492__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_492((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_148__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_148((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_149__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_149((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_493__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_493((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_150__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_150((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_151__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_151((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_494__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_494((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_495__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_495((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_496__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_496((EMoflonEdge) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TASK2_STEP_AFTER_CHOICE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Task2StepAfterChoice_0_1_blackBBBBBB(Task2StepAfterChoice _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		return new Object[] { _this, match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_Task2StepAfterChoice_0_2_bindingFBBBBBB(Task2StepAfterChoice _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, sf1, process, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, sf1, process, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepAfterChoice_0_2_bindingAndBlackFBBBBBB(Task2StepAfterChoice _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		Object[] result_pattern_Task2StepAfterChoice_0_2_binding = pattern_Task2StepAfterChoice_0_2_bindingFBBBBBB(
				_this, match, prevNode, sf1, process, task);
		if (result_pattern_Task2StepAfterChoice_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepAfterChoice_0_2_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_0_2_black = pattern_Task2StepAfterChoice_0_2_blackB(csp);
			if (result_pattern_Task2StepAfterChoice_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, sf1, process, task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepAfterChoice_0_3_expressionFBB(Task2StepAfterChoice _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_0_4_blackBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		return new Object[] { match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_Task2StepAfterChoice_0_4_greenBBBBBFFFFFF(Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
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

	public static final Object[] pattern_Task2StepAfterChoice_0_5_blackBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		return new Object[] { match, prevNode, sf1, process, task };
	}

	public static final Object[] pattern_Task2StepAfterChoice_0_5_greenBBBF(Match match, ExclusiveGateway prevNode,
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

	public static final void pattern_Task2StepAfterChoice_0_6_expressionBBBBBB(Task2StepAfterChoice _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		_this.registerObjectsToMatch_FWD(match, prevNode, sf1, process, task);

	}

	public static final boolean pattern_Task2StepAfterChoice_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_6 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_7 = isApplicableMatch.getObject("flow");
		EObject _localVariable_8 = isApplicableMatch.getObject("task");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpCStep = _localVariable_1;
		EObject tmpEg2cs = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpUseCase = _localVariable_5;
		EObject tmpP2uc = _localVariable_6;
		EObject tmpFlow = _localVariable_7;
		EObject tmpTask = _localVariable_8;
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
							if (tmpUseCase instanceof UseCase) {
								UseCase useCase = (UseCase) tmpUseCase;
								if (tmpP2uc instanceof P2UC) {
									P2UC p2uc = (P2UC) tmpP2uc;
									if (tmpFlow instanceof Flow) {
										Flow flow = (Flow) tmpFlow;
										if (tmpTask instanceof Task) {
											Task task = (Task) tmpTask;
											return new Object[] { prevNode, cStep, eg2cs, sf1, process, useCase, p2uc,
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

	public static final Object[] pattern_Task2StepAfterChoice_1_1_blackBBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			Flow flow, Task task, Task2StepAfterChoice _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { prevNode, cStep, eg2cs, sf1, process, useCase, p2uc, flow, task, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_1_1_bindingAndBlackFFFFFFFFFBFB(
			Task2StepAfterChoice _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2StepAfterChoice_1_1_binding = pattern_Task2StepAfterChoice_1_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2StepAfterChoice_1_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_Task2StepAfterChoice_1_1_binding[0];
			ChoiceStep cStep = (ChoiceStep) result_pattern_Task2StepAfterChoice_1_1_binding[1];
			GW2S eg2cs = (GW2S) result_pattern_Task2StepAfterChoice_1_1_binding[2];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2StepAfterChoice_1_1_binding[3];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_Task2StepAfterChoice_1_1_binding[4];
			UseCase useCase = (UseCase) result_pattern_Task2StepAfterChoice_1_1_binding[5];
			P2UC p2uc = (P2UC) result_pattern_Task2StepAfterChoice_1_1_binding[6];
			Flow flow = (Flow) result_pattern_Task2StepAfterChoice_1_1_binding[7];
			Task task = (Task) result_pattern_Task2StepAfterChoice_1_1_binding[8];

			Object[] result_pattern_Task2StepAfterChoice_1_1_black = pattern_Task2StepAfterChoice_1_1_blackBBBBBBBBBBFB(
					prevNode, cStep, eg2cs, sf1, process, useCase, p2uc, flow, task, _this, isApplicableMatch);
			if (result_pattern_Task2StepAfterChoice_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2StepAfterChoice_1_1_black[10];

				return new Object[] { prevNode, cStep, eg2cs, sf1, process, useCase, p2uc, flow, task, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_1_1_greenBFFBFFBB(ChoiceStep cStep, UseCase useCase,
			Task task, CSP csp) {
		NormalStep step = UseCaseFactory.eINSTANCE.createNormalStep();
		AlternativeFlow altFlow = UseCaseFactory.eINSTANCE.createAlternativeFlow();
		StepAlternative alt = UseCaseFactory.eINSTANCE.createStepAlternative();
		FN2S t2s = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		Object _localVariable_1 = csp.getValue("altFlow", "id");
		Object _localVariable_2 = csp.getValue("alt", "condition");
		altFlow.getSteps().add(step);
		useCase.getFlows().add(altFlow);
		cStep.getStepAlternatives().add(alt);
		alt.setRef(altFlow);
		t2s.setTarget(step);
		t2s.setSource(task);
		String step_id_prime = (String) _localVariable_0;
		String altFlow_id_prime = (String) _localVariable_1;
		String alt_condition_prime = (String) _localVariable_2;
		step.setId(step_id_prime);
		altFlow.setId(altFlow_id_prime);
		alt.setCondition(alt_condition_prime);
		return new Object[] { cStep, step, altFlow, useCase, alt, t2s, task, csp };
	}

	public static final Object[] pattern_Task2StepAfterChoice_1_2_blackBBBBBB(SequenceFlow sf1, NormalStep step,
			AlternativeFlow altFlow, StepAlternative alt, FN2S t2s, Task task) {
		return new Object[] { sf1, step, altFlow, alt, t2s, task };
	}

	public static final Object[] pattern_Task2StepAfterChoice_1_2_greenFBBBBBB(SequenceFlow sf1, NormalStep step,
			AlternativeFlow altFlow, StepAlternative alt, FN2S t2s, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getCreatedElements().add(altFlow);
		ruleresult.getCreatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getTranslatedElements().add(task);
		return new Object[] { ruleresult, sf1, step, altFlow, alt, t2s, task };
	}

	public static final Object[] pattern_Task2StepAfterChoice_1_3_blackBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject step, EObject altFlow, EObject process,
			EObject useCase, EObject p2uc, EObject alt, EObject flow, EObject t2s, EObject task) {
		if (!prevNode.equals(sf1)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(process)) {
					if (!prevNode.equals(useCase)) {
						if (!prevNode.equals(t2s)) {
							if (!prevNode.equals(task)) {
								if (!cStep.equals(prevNode)) {
									if (!cStep.equals(eg2cs)) {
										if (!cStep.equals(sf1)) {
											if (!cStep.equals(step)) {
												if (!cStep.equals(process)) {
													if (!cStep.equals(useCase)) {
														if (!cStep.equals(p2uc)) {
															if (!cStep.equals(flow)) {
																if (!cStep.equals(t2s)) {
																	if (!cStep.equals(task)) {
																		if (!eg2cs.equals(prevNode)) {
																			if (!eg2cs.equals(sf1)) {
																				if (!eg2cs.equals(step)) {
																					if (!eg2cs.equals(process)) {
																						if (!eg2cs.equals(useCase)) {
																							if (!eg2cs.equals(p2uc)) {
																								if (!eg2cs
																										.equals(flow)) {
																									if (!eg2cs.equals(
																											t2s)) {
																										if (!eg2cs
																												.equals(task)) {
																											if (!sf1.equals(
																													step)) {
																												if (!sf1.equals(
																														useCase)) {
																													if (!sf1.equals(
																															t2s)) {
																														if (!sf1.equals(
																																task)) {
																															if (!step
																																	.equals(useCase)) {
																																if (!step
																																		.equals(t2s)) {
																																	if (!step
																																			.equals(task)) {
																																		if (!altFlow
																																				.equals(prevNode)) {
																																			if (!altFlow
																																					.equals(cStep)) {
																																				if (!altFlow
																																						.equals(eg2cs)) {
																																					if (!altFlow
																																							.equals(sf1)) {
																																						if (!altFlow
																																								.equals(step)) {
																																							if (!altFlow
																																									.equals(process)) {
																																								if (!altFlow
																																										.equals(useCase)) {
																																									if (!altFlow
																																											.equals(p2uc)) {
																																										if (!altFlow
																																												.equals(flow)) {
																																											if (!altFlow
																																													.equals(t2s)) {
																																												if (!altFlow
																																														.equals(task)) {
																																													if (!process
																																															.equals(sf1)) {
																																														if (!process
																																																.equals(step)) {
																																															if (!process
																																																	.equals(useCase)) {
																																																if (!process
																																																		.equals(t2s)) {
																																																	if (!process
																																																			.equals(task)) {
																																																		if (!p2uc
																																																				.equals(prevNode)) {
																																																			if (!p2uc
																																																					.equals(sf1)) {
																																																				if (!p2uc
																																																						.equals(step)) {
																																																					if (!p2uc
																																																							.equals(process)) {
																																																						if (!p2uc
																																																								.equals(useCase)) {
																																																							if (!p2uc
																																																									.equals(t2s)) {
																																																								if (!p2uc
																																																										.equals(task)) {
																																																									if (!alt.equals(
																																																											prevNode)) {
																																																										if (!alt.equals(
																																																												cStep)) {
																																																											if (!alt.equals(
																																																													eg2cs)) {
																																																												if (!alt.equals(
																																																														sf1)) {
																																																													if (!alt.equals(
																																																															step)) {
																																																														if (!alt.equals(
																																																																altFlow)) {
																																																															if (!alt.equals(
																																																																	process)) {
																																																																if (!alt.equals(
																																																																		useCase)) {
																																																																	if (!alt.equals(
																																																																			p2uc)) {
																																																																		if (!alt.equals(
																																																																				flow)) {
																																																																			if (!alt.equals(
																																																																					t2s)) {
																																																																				if (!alt.equals(
																																																																						task)) {
																																																																					if (!flow
																																																																							.equals(prevNode)) {
																																																																						if (!flow
																																																																								.equals(sf1)) {
																																																																							if (!flow
																																																																									.equals(step)) {
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
																																																																																		prevNode,
																																																																																		cStep,
																																																																																		eg2cs,
																																																																																		sf1,
																																																																																		step,
																																																																																		altFlow,
																																																																																		process,
																																																																																		useCase,
																																																																																		p2uc,
																																																																																		alt,
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
													}
												}
											}
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

	public static final Object[] pattern_Task2StepAfterChoice_1_3_greenBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject sf1, EObject step, EObject altFlow,
			EObject process, EObject useCase, EObject alt, EObject t2s, EObject task) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2StepAfterChoice";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String altFlow__step____steps_name_prime = "steps";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__altFlow____flows_name_prime = "flows";
		String alt__altFlow____ref_name_prime = "ref";
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
		cStep__alt____stepAlternatives.setSrc(cStep);
		cStep__alt____stepAlternatives.setTrg(alt);
		ruleresult.getCreatedEdges().add(cStep__alt____stepAlternatives);
		altFlow__step____steps.setSrc(altFlow);
		altFlow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(altFlow__step____steps);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(useCase__altFlow____flows);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(alt__altFlow____ref);
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
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { ruleresult, prevNode, cStep, sf1, step, altFlow, process, useCase, alt, t2s, task,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, cStep__alt____stepAlternatives,
				altFlow__step____steps, process__sf1____flowElements, useCase__altFlow____flows, alt__altFlow____ref,
				t2s__step____target, t2s__task____source, process__task____flowElements, sf1__task____targetRef,
				task__sf1____incoming };
	}

	public static final void pattern_Task2StepAfterChoice_1_5_expressionBBBBBBBBBBBBBBB(Task2StepAfterChoice _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject step,
			EObject altFlow, EObject process, EObject useCase, EObject p2uc, EObject alt, EObject flow, EObject t2s,
			EObject task) {
		_this.registerObjects_FWD(ruleresult, prevNode, cStep, eg2cs, sf1, step, altFlow, process, useCase, p2uc, alt,
				flow, t2s, task);

	}

	public static final PerformRuleResult pattern_Task2StepAfterChoice_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_1_blackFBB(EClass eClass, Task2StepAfterChoice _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_2_1_binding = pattern_Task2StepAfterChoice_2_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2StepAfterChoice_2_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_2_1_black = pattern_Task2StepAfterChoice_2_1_blackFBB(eClass,
					_this);
			if (result_pattern_Task2StepAfterChoice_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2StepAfterChoice_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2StepAfterChoice";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_2_bindingFFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_2_2_blackBFFBBFFBB(ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, Task task, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean prevNodeisDiverging = prevNode.isIsDiverging();
		if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
			for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevNode, GW2S.class,
					"source")) {
				Step tmpCStep = eg2cs.getTarget();
				if (tmpCStep instanceof ChoiceStep) {
					ChoiceStep cStep = (ChoiceStep) tmpCStep;
					for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(process,
							P2UC.class, "source")) {
						UseCase useCase = p2uc.getTarget();
						if (useCase != null) {
							_result.add(
									new Object[] { prevNode, cStep, eg2cs, sf1, process, useCase, p2uc, task, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_2_3_blackBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			Task task) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (prevNode.equals(sf1.getSourceRef())) {
			if (prevNode.equals(eg2cs.getSource())) {
				if (cStep.equals(eg2cs.getTarget())) {
					if (process.getFlowElements().contains(prevNode)) {
						if (process.getFlowElements().contains(sf1)) {
							if (process.equals(p2uc.getSource())) {
								if (useCase.equals(p2uc.getTarget())) {
									if (process.getFlowElements().contains(task)) {
										if (task.equals(sf1.getTargetRef())) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
												for (Flow flow : useCase.getFlows()) {
													if (flow.getSteps().contains(cStep)) {
														_result.add(new Object[] { prevNode, cStep, eg2cs, sf1, process,
																useCase, p2uc, flow, task });
													}
												}
											}

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

	public static final Object[] pattern_Task2StepAfterChoice_2_3_greenBBBBBBBBBFFFFFFFFFFFFFF(
			ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, Task task) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__cStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__cStep____target_name_prime = "target";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String flow__cStep____steps_name_prime = "steps";
		String process__task____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(task);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		eg2cs__prevNode____source.setSrc(eg2cs);
		eg2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevNode____source);
		eg2cs__cStep____target.setSrc(eg2cs);
		eg2cs__cStep____target.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs__cStep____target);
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
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(flow__cStep____steps);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		isApplicableMatch.getAllContextElements().add(process__task____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		isApplicableMatch.getAllContextElements().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(task__sf1____incoming);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__cStep____target.setName(eg2cs__cStep____target_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { prevNode, cStep, eg2cs, sf1, process, useCase, p2uc, flow, task, isApplicableMatch,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, eg2cs__prevNode____source,
				eg2cs__cStep____target, process__prevNode____flowElements, process__sf1____flowElements,
				useCase__flow____flows, p2uc__process____source, p2uc__useCase____target, flow__cStep____steps,
				process__task____flowElements, sf1__task____targetRef, task__sf1____incoming };
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_4_bindingFBBBBBBBBBBB(Task2StepAfterChoice _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			SequenceFlow sf1, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow, Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, cStep, eg2cs, sf1, process,
				useCase, p2uc, flow, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, cStep, eg2cs, sf1, process, useCase, p2uc,
					flow, task };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_4_bindingAndBlackFBBBBBBBBBBB(
			Task2StepAfterChoice _this, IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			Flow flow, Task task) {
		Object[] result_pattern_Task2StepAfterChoice_2_4_binding = pattern_Task2StepAfterChoice_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, prevNode, cStep, eg2cs, sf1, process, useCase, p2uc, flow, task);
		if (result_pattern_Task2StepAfterChoice_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepAfterChoice_2_4_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_2_4_black = pattern_Task2StepAfterChoice_2_4_blackB(csp);
			if (result_pattern_Task2StepAfterChoice_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, cStep, eg2cs, sf1, process, useCase,
						p2uc, flow, task };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepAfterChoice_2_5_expressionFBB(Task2StepAfterChoice _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2StepAfterChoice_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2StepAfterChoice";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2StepAfterChoice_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_10_1_blackBBBBBBBB(Task2StepAfterChoice _this,
			Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow, UseCase useCase,
			StepAlternative alt, Flow flow) {
		if (!altFlow.equals(flow)) {
			return new Object[] { _this, match, cStep, step, altFlow, useCase, alt, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_10_2_bindingFBBBBBBBB(Task2StepAfterChoice _this,
			Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow, UseCase useCase,
			StepAlternative alt, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, cStep, step, altFlow, useCase, alt, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cStep, step, altFlow, useCase, alt, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepAfterChoice_10_2_bindingAndBlackFBBBBBBBB(Task2StepAfterChoice _this,
			Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow, UseCase useCase,
			StepAlternative alt, Flow flow) {
		Object[] result_pattern_Task2StepAfterChoice_10_2_binding = pattern_Task2StepAfterChoice_10_2_bindingFBBBBBBBB(
				_this, match, cStep, step, altFlow, useCase, alt, flow);
		if (result_pattern_Task2StepAfterChoice_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepAfterChoice_10_2_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_10_2_black = pattern_Task2StepAfterChoice_10_2_blackB(csp);
			if (result_pattern_Task2StepAfterChoice_10_2_black != null) {

				return new Object[] { csp, _this, match, cStep, step, altFlow, useCase, alt, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepAfterChoice_10_3_expressionFBB(Task2StepAfterChoice _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_10_4_blackBBBBBBB(Match match, ChoiceStep cStep,
			NormalStep step, AlternativeFlow altFlow, UseCase useCase, StepAlternative alt, Flow flow) {
		if (!altFlow.equals(flow)) {
			return new Object[] { match, cStep, step, altFlow, useCase, alt, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_10_4_greenBBBBBBFFFF(Match match, ChoiceStep cStep,
			NormalStep step, AlternativeFlow altFlow, UseCase useCase, StepAlternative alt) {
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		match.getToBeTranslatedNodes().add(altFlow);
		match.getToBeTranslatedNodes().add(alt);
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String altFlow__step____steps_name_prime = "steps";
		String useCase__altFlow____flows_name_prime = "flows";
		String alt__altFlow____ref_name_prime = "ref";
		cStep__alt____stepAlternatives.setSrc(cStep);
		cStep__alt____stepAlternatives.setTrg(alt);
		match.getToBeTranslatedEdges().add(cStep__alt____stepAlternatives);
		altFlow__step____steps.setSrc(altFlow);
		altFlow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(altFlow__step____steps);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		match.getToBeTranslatedEdges().add(useCase__altFlow____flows);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		match.getToBeTranslatedEdges().add(alt__altFlow____ref);
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		return new Object[] { match, cStep, step, altFlow, useCase, alt, cStep__alt____stepAlternatives,
				altFlow__step____steps, useCase__altFlow____flows, alt__altFlow____ref };
	}

	public static final Object[] pattern_Task2StepAfterChoice_10_5_blackBBBBBBB(Match match, ChoiceStep cStep,
			NormalStep step, AlternativeFlow altFlow, UseCase useCase, StepAlternative alt, Flow flow) {
		if (!altFlow.equals(flow)) {
			return new Object[] { match, cStep, step, altFlow, useCase, alt, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_10_5_greenBBBBFF(Match match, ChoiceStep cStep,
			UseCase useCase, Flow flow) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(cStep);
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		String useCase__flow____flows_name_prime = "flows";
		String flow__cStep____steps_name_prime = "steps";
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		match.getContextEdges().add(useCase__flow____flows);
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		match.getContextEdges().add(flow__cStep____steps);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		return new Object[] { match, cStep, useCase, flow, useCase__flow____flows, flow__cStep____steps };
	}

	public static final void pattern_Task2StepAfterChoice_10_6_expressionBBBBBBBB(Task2StepAfterChoice _this,
			Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow, UseCase useCase,
			StepAlternative alt, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, cStep, step, altFlow, useCase, alt, flow);

	}

	public static final boolean pattern_Task2StepAfterChoice_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_11_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("step");
		EObject _localVariable_4 = isApplicableMatch.getObject("altFlow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_7 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_8 = isApplicableMatch.getObject("alt");
		EObject _localVariable_9 = isApplicableMatch.getObject("flow");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpCStep = _localVariable_1;
		EObject tmpEg2cs = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpAltFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpUseCase = _localVariable_6;
		EObject tmpP2uc = _localVariable_7;
		EObject tmpAlt = _localVariable_8;
		EObject tmpFlow = _localVariable_9;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpCStep instanceof ChoiceStep) {
				ChoiceStep cStep = (ChoiceStep) tmpCStep;
				if (tmpEg2cs instanceof GW2S) {
					GW2S eg2cs = (GW2S) tmpEg2cs;
					if (tmpStep instanceof NormalStep) {
						NormalStep step = (NormalStep) tmpStep;
						if (tmpAltFlow instanceof AlternativeFlow) {
							AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
							if (tmpProcess instanceof de.abilov.bpmn.Process) {
								de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
								if (tmpUseCase instanceof UseCase) {
									UseCase useCase = (UseCase) tmpUseCase;
									if (tmpP2uc instanceof P2UC) {
										P2UC p2uc = (P2UC) tmpP2uc;
										if (tmpAlt instanceof StepAlternative) {
											StepAlternative alt = (StepAlternative) tmpAlt;
											if (tmpFlow instanceof Flow) {
												Flow flow = (Flow) tmpFlow;
												return new Object[] { prevNode, cStep, eg2cs, step, altFlow, process,
														useCase, p2uc, alt, flow, isApplicableMatch };
											}
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

	public static final Object[] pattern_Task2StepAfterChoice_11_1_blackBBBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, NormalStep step, AlternativeFlow altFlow, de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, StepAlternative alt, Flow flow, Task2StepAfterChoice _this,
			IsApplicableMatch isApplicableMatch) {
		if (!altFlow.equals(flow)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { prevNode, cStep, eg2cs, step, altFlow, process, useCase, p2uc, alt, flow,
							_this, csp, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_11_1_bindingAndBlackFFFFFFFFFFBFB(
			Task2StepAfterChoice _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2StepAfterChoice_11_1_binding = pattern_Task2StepAfterChoice_11_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Task2StepAfterChoice_11_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_Task2StepAfterChoice_11_1_binding[0];
			ChoiceStep cStep = (ChoiceStep) result_pattern_Task2StepAfterChoice_11_1_binding[1];
			GW2S eg2cs = (GW2S) result_pattern_Task2StepAfterChoice_11_1_binding[2];
			NormalStep step = (NormalStep) result_pattern_Task2StepAfterChoice_11_1_binding[3];
			AlternativeFlow altFlow = (AlternativeFlow) result_pattern_Task2StepAfterChoice_11_1_binding[4];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_Task2StepAfterChoice_11_1_binding[5];
			UseCase useCase = (UseCase) result_pattern_Task2StepAfterChoice_11_1_binding[6];
			P2UC p2uc = (P2UC) result_pattern_Task2StepAfterChoice_11_1_binding[7];
			StepAlternative alt = (StepAlternative) result_pattern_Task2StepAfterChoice_11_1_binding[8];
			Flow flow = (Flow) result_pattern_Task2StepAfterChoice_11_1_binding[9];

			Object[] result_pattern_Task2StepAfterChoice_11_1_black = pattern_Task2StepAfterChoice_11_1_blackBBBBBBBBBBBFB(
					prevNode, cStep, eg2cs, step, altFlow, process, useCase, p2uc, alt, flow, _this, isApplicableMatch);
			if (result_pattern_Task2StepAfterChoice_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2StepAfterChoice_11_1_black[11];

				return new Object[] { prevNode, cStep, eg2cs, step, altFlow, process, useCase, p2uc, alt, flow, _this,
						csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_11_1_greenBFBBFFB(ExclusiveGateway prevNode,
			NormalStep step, de.abilov.bpmn.Process process, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		FN2S t2s = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		Task task = BpmnFactory.eINSTANCE.createTask();
		Object _localVariable_0 = csp.getValue("sf1", "conditionExpression");
		Object _localVariable_1 = csp.getValue("sf1", "id");
		Object _localVariable_2 = csp.getValue("task", "id");
		sf1.setSourceRef(prevNode);
		process.getFlowElements().add(sf1);
		t2s.setTarget(step);
		t2s.setSource(task);
		process.getFlowElements().add(task);
		sf1.setTargetRef(task);
		String sf1_conditionExpression_prime = (String) _localVariable_0;
		String sf1_id_prime = (String) _localVariable_1;
		String task_id_prime = (String) _localVariable_2;
		sf1.setConditionExpression(sf1_conditionExpression_prime);
		sf1.setId(sf1_id_prime);
		task.setId(task_id_prime);
		return new Object[] { prevNode, sf1, step, process, t2s, task, csp };
	}

	public static final Object[] pattern_Task2StepAfterChoice_11_2_blackBBBBBB(SequenceFlow sf1, NormalStep step,
			AlternativeFlow altFlow, StepAlternative alt, FN2S t2s, Task task) {
		return new Object[] { sf1, step, altFlow, alt, t2s, task };
	}

	public static final Object[] pattern_Task2StepAfterChoice_11_2_greenFBBBBBB(SequenceFlow sf1, NormalStep step,
			AlternativeFlow altFlow, StepAlternative alt, FN2S t2s, Task task) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getTranslatedElements().add(altFlow);
		ruleresult.getTranslatedElements().add(alt);
		ruleresult.getCreatedLinkElements().add(t2s);
		ruleresult.getCreatedElements().add(task);
		return new Object[] { ruleresult, sf1, step, altFlow, alt, t2s, task };
	}

	public static final Object[] pattern_Task2StepAfterChoice_11_3_blackBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject step, EObject altFlow, EObject process,
			EObject useCase, EObject p2uc, EObject alt, EObject flow, EObject t2s, EObject task) {
		if (!prevNode.equals(sf1)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(process)) {
					if (!prevNode.equals(useCase)) {
						if (!prevNode.equals(t2s)) {
							if (!prevNode.equals(task)) {
								if (!cStep.equals(prevNode)) {
									if (!cStep.equals(eg2cs)) {
										if (!cStep.equals(sf1)) {
											if (!cStep.equals(step)) {
												if (!cStep.equals(process)) {
													if (!cStep.equals(useCase)) {
														if (!cStep.equals(p2uc)) {
															if (!cStep.equals(flow)) {
																if (!cStep.equals(t2s)) {
																	if (!cStep.equals(task)) {
																		if (!eg2cs.equals(prevNode)) {
																			if (!eg2cs.equals(sf1)) {
																				if (!eg2cs.equals(step)) {
																					if (!eg2cs.equals(process)) {
																						if (!eg2cs.equals(useCase)) {
																							if (!eg2cs.equals(p2uc)) {
																								if (!eg2cs
																										.equals(flow)) {
																									if (!eg2cs.equals(
																											t2s)) {
																										if (!eg2cs
																												.equals(task)) {
																											if (!sf1.equals(
																													step)) {
																												if (!sf1.equals(
																														useCase)) {
																													if (!sf1.equals(
																															t2s)) {
																														if (!sf1.equals(
																																task)) {
																															if (!step
																																	.equals(useCase)) {
																																if (!step
																																		.equals(t2s)) {
																																	if (!step
																																			.equals(task)) {
																																		if (!altFlow
																																				.equals(prevNode)) {
																																			if (!altFlow
																																					.equals(cStep)) {
																																				if (!altFlow
																																						.equals(eg2cs)) {
																																					if (!altFlow
																																							.equals(sf1)) {
																																						if (!altFlow
																																								.equals(step)) {
																																							if (!altFlow
																																									.equals(process)) {
																																								if (!altFlow
																																										.equals(useCase)) {
																																									if (!altFlow
																																											.equals(p2uc)) {
																																										if (!altFlow
																																												.equals(flow)) {
																																											if (!altFlow
																																													.equals(t2s)) {
																																												if (!altFlow
																																														.equals(task)) {
																																													if (!process
																																															.equals(sf1)) {
																																														if (!process
																																																.equals(step)) {
																																															if (!process
																																																	.equals(useCase)) {
																																																if (!process
																																																		.equals(t2s)) {
																																																	if (!process
																																																			.equals(task)) {
																																																		if (!p2uc
																																																				.equals(prevNode)) {
																																																			if (!p2uc
																																																					.equals(sf1)) {
																																																				if (!p2uc
																																																						.equals(step)) {
																																																					if (!p2uc
																																																							.equals(process)) {
																																																						if (!p2uc
																																																								.equals(useCase)) {
																																																							if (!p2uc
																																																									.equals(t2s)) {
																																																								if (!p2uc
																																																										.equals(task)) {
																																																									if (!alt.equals(
																																																											prevNode)) {
																																																										if (!alt.equals(
																																																												cStep)) {
																																																											if (!alt.equals(
																																																													eg2cs)) {
																																																												if (!alt.equals(
																																																														sf1)) {
																																																													if (!alt.equals(
																																																															step)) {
																																																														if (!alt.equals(
																																																																altFlow)) {
																																																															if (!alt.equals(
																																																																	process)) {
																																																																if (!alt.equals(
																																																																		useCase)) {
																																																																	if (!alt.equals(
																																																																			p2uc)) {
																																																																		if (!alt.equals(
																																																																				flow)) {
																																																																			if (!alt.equals(
																																																																					t2s)) {
																																																																				if (!alt.equals(
																																																																						task)) {
																																																																					if (!flow
																																																																							.equals(prevNode)) {
																																																																						if (!flow
																																																																								.equals(sf1)) {
																																																																							if (!flow
																																																																									.equals(step)) {
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
																																																																																		prevNode,
																																																																																		cStep,
																																																																																		eg2cs,
																																																																																		sf1,
																																																																																		step,
																																																																																		altFlow,
																																																																																		process,
																																																																																		useCase,
																																																																																		p2uc,
																																																																																		alt,
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
													}
												}
											}
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

	public static final Object[] pattern_Task2StepAfterChoice_11_3_greenBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject sf1, EObject step, EObject altFlow,
			EObject process, EObject useCase, EObject alt, EObject t2s, EObject task) {
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2s__task____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2StepAfterChoice";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String altFlow__step____steps_name_prime = "steps";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__altFlow____flows_name_prime = "flows";
		String alt__altFlow____ref_name_prime = "ref";
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
		cStep__alt____stepAlternatives.setSrc(cStep);
		cStep__alt____stepAlternatives.setTrg(alt);
		ruleresult.getTranslatedEdges().add(cStep__alt____stepAlternatives);
		altFlow__step____steps.setSrc(altFlow);
		altFlow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(altFlow__step____steps);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		ruleresult.getTranslatedEdges().add(useCase__altFlow____flows);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getTranslatedEdges().add(alt__altFlow____ref);
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
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		t2s__step____target.setName(t2s__step____target_name_prime);
		t2s__task____source.setName(t2s__task____source_name_prime);
		process__task____flowElements.setName(process__task____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		return new Object[] { ruleresult, prevNode, cStep, sf1, step, altFlow, process, useCase, alt, t2s, task,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, cStep__alt____stepAlternatives,
				altFlow__step____steps, process__sf1____flowElements, useCase__altFlow____flows, alt__altFlow____ref,
				t2s__step____target, t2s__task____source, process__task____flowElements, sf1__task____targetRef,
				task__sf1____incoming };
	}

	public static final void pattern_Task2StepAfterChoice_11_5_expressionBBBBBBBBBBBBBBB(Task2StepAfterChoice _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject cStep, EObject eg2cs, EObject sf1, EObject step,
			EObject altFlow, EObject process, EObject useCase, EObject p2uc, EObject alt, EObject flow, EObject t2s,
			EObject task) {
		_this.registerObjects_BWD(ruleresult, prevNode, cStep, eg2cs, sf1, step, altFlow, process, useCase, p2uc, alt,
				flow, t2s, task);

	}

	public static final PerformRuleResult pattern_Task2StepAfterChoice_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_1_blackFBB(EClass eClass, Task2StepAfterChoice _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_12_1_binding = pattern_Task2StepAfterChoice_12_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2StepAfterChoice_12_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_12_1_black = pattern_Task2StepAfterChoice_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_Task2StepAfterChoice_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2StepAfterChoice_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2StepAfterChoice";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_2_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cStep");
		EObject _localVariable_1 = match.getObject("step");
		EObject _localVariable_2 = match.getObject("altFlow");
		EObject _localVariable_3 = match.getObject("useCase");
		EObject _localVariable_4 = match.getObject("alt");
		EObject _localVariable_5 = match.getObject("flow");
		EObject tmpCStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpAltFlow = _localVariable_2;
		EObject tmpUseCase = _localVariable_3;
		EObject tmpAlt = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		if (tmpCStep instanceof ChoiceStep) {
			ChoiceStep cStep = (ChoiceStep) tmpCStep;
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (tmpAltFlow instanceof AlternativeFlow) {
					AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
					if (tmpUseCase instanceof UseCase) {
						UseCase useCase = (UseCase) tmpUseCase;
						if (tmpAlt instanceof StepAlternative) {
							StepAlternative alt = (StepAlternative) tmpAlt;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								return new Object[] { cStep, step, altFlow, useCase, alt, flow, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_12_2_blackFBFBBFBFBBB(ChoiceStep cStep,
			NormalStep step, AlternativeFlow altFlow, UseCase useCase, StepAlternative alt, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!altFlow.equals(flow)) {
			for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cStep, GW2S.class,
					"target")) {
				Gateway tmpPrevNode = eg2cs.getSource();
				if (tmpPrevNode instanceof ExclusiveGateway) {
					ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
						for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase,
								P2UC.class, "target")) {
							de.abilov.bpmn.Process process = p2uc.getSource();
							if (process != null) {
								_result.add(new Object[] { prevNode, cStep, eg2cs, step, altFlow, process, useCase,
										p2uc, alt, flow, match });
							}

						}
					}

				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_12_3_blackBBBBBBBBBB(ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, NormalStep step, AlternativeFlow altFlow, de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, StepAlternative alt, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!altFlow.equals(flow)) {
			if (cStep.getStepAlternatives().contains(alt)) {
				if (prevNode.equals(eg2cs.getSource())) {
					if (cStep.equals(eg2cs.getTarget())) {
						if (altFlow.getSteps().contains(step)) {
							if (process.getFlowElements().contains(prevNode)) {
								if (useCase.getFlows().contains(altFlow)) {
									if (useCase.getFlows().contains(flow)) {
										if (process.equals(p2uc.getSource())) {
											if (useCase.equals(p2uc.getTarget())) {
												if (altFlow.equals(alt.getRef())) {
													if (flow.getSteps().contains(cStep)) {
														boolean prevNodeisDiverging = prevNode.isIsDiverging();
														if (Boolean.valueOf(prevNodeisDiverging)
																.equals(Boolean.valueOf(true))) {
															_result.add(new Object[] { prevNode, cStep, eg2cs, step,
																	altFlow, process, useCase, p2uc, alt, flow });
														}

													}
												}
											}
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

	public static final Object[] pattern_Task2StepAfterChoice_12_3_greenBBBBBBBBBBFFFFFFFFFFFF(
			ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs, NormalStep step, AlternativeFlow altFlow,
			de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, StepAlternative alt, Flow flow) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__cStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__cStep____target_name_prime = "target";
		String altFlow__step____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String useCase__altFlow____flows_name_prime = "flows";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String alt__altFlow____ref_name_prime = "ref";
		String flow__cStep____steps_name_prime = "steps";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(altFlow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(flow);
		cStep__alt____stepAlternatives.setSrc(cStep);
		cStep__alt____stepAlternatives.setTrg(alt);
		isApplicableMatch.getAllContextElements().add(cStep__alt____stepAlternatives);
		eg2cs__prevNode____source.setSrc(eg2cs);
		eg2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevNode____source);
		eg2cs__cStep____target.setSrc(eg2cs);
		eg2cs__cStep____target.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(eg2cs__cStep____target);
		altFlow__step____steps.setSrc(altFlow);
		altFlow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(altFlow__step____steps);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		isApplicableMatch.getAllContextElements().add(useCase__altFlow____flows);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		isApplicableMatch.getAllContextElements().add(alt__altFlow____ref);
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(flow__cStep____steps);
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__cStep____target.setName(eg2cs__cStep____target_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		return new Object[] { prevNode, cStep, eg2cs, step, altFlow, process, useCase, p2uc, alt, flow,
				isApplicableMatch, cStep__alt____stepAlternatives, eg2cs__prevNode____source, eg2cs__cStep____target,
				altFlow__step____steps, process__prevNode____flowElements, useCase__altFlow____flows,
				useCase__flow____flows, p2uc__process____source, p2uc__useCase____target, alt__altFlow____ref,
				flow__cStep____steps };
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_4_bindingFBBBBBBBBBBBB(Task2StepAfterChoice _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep cStep, GW2S eg2cs,
			NormalStep step, AlternativeFlow altFlow, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc,
			StepAlternative alt, Flow flow) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, prevNode, cStep, eg2cs, step, altFlow,
				process, useCase, p2uc, alt, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, cStep, eg2cs, step, altFlow, process,
					useCase, p2uc, alt, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_4_bindingAndBlackFBBBBBBBBBBBB(
			Task2StepAfterChoice _this, IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode,
			ChoiceStep cStep, GW2S eg2cs, NormalStep step, AlternativeFlow altFlow, de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, StepAlternative alt, Flow flow) {
		Object[] result_pattern_Task2StepAfterChoice_12_4_binding = pattern_Task2StepAfterChoice_12_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, prevNode, cStep, eg2cs, step, altFlow, process, useCase, p2uc, alt, flow);
		if (result_pattern_Task2StepAfterChoice_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2StepAfterChoice_12_4_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_12_4_black = pattern_Task2StepAfterChoice_12_4_blackB(csp);
			if (result_pattern_Task2StepAfterChoice_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, cStep, eg2cs, step, altFlow, process,
						useCase, p2uc, alt, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2StepAfterChoice_12_5_expressionFBB(Task2StepAfterChoice _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2StepAfterChoice_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2StepAfterChoice";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2StepAfterChoice_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_20_1_binding = pattern_Task2StepAfterChoice_20_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_20_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_20_1_black = pattern_Task2StepAfterChoice_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_45566 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_45566)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_258020 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_258020)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_94683 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_94683)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_20_2_blackFFFFB(EMoflonEdge _edge_sourceRef) {
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
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							if (pattern_Task2StepAfterChoice_20_2_black_nac_0BB(sf1, prevNode) == null) {
								if (pattern_Task2StepAfterChoice_20_2_black_nac_3BB(prevNode, sf1) == null) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(prevNode)) {
											if (process.getFlowElements().contains(task)) {
												if (pattern_Task2StepAfterChoice_20_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_Task2StepAfterChoice_20_2_black_nac_2BB(task,
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

	public static final Object[] pattern_Task2StepAfterChoice_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_20_3_expressionFBBBBBB(Task2StepAfterChoice _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_20_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_21_1_binding = pattern_Task2StepAfterChoice_21_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_21_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_21_1_black = pattern_Task2StepAfterChoice_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_925 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_925)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_980732 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_980732)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_969843 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_969843)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_21_2_blackFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (prevNode.equals(sf1.getSourceRef())) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
						FlowNode tmpTask = sf1.getTargetRef();
						if (tmpTask instanceof Task) {
							Task task = (Task) tmpTask;
							if (pattern_Task2StepAfterChoice_21_2_black_nac_0BB(sf1, prevNode) == null) {
								if (pattern_Task2StepAfterChoice_21_2_black_nac_3BB(prevNode, sf1) == null) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(sf1)) {
											if (process.getFlowElements().contains(task)) {
												if (pattern_Task2StepAfterChoice_21_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_Task2StepAfterChoice_21_2_black_nac_2BB(task,
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

	public static final Object[] pattern_Task2StepAfterChoice_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_21_3_expressionFBBBBBB(Task2StepAfterChoice _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_21_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_22_1_binding = pattern_Task2StepAfterChoice_22_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_22_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_22_1_black = pattern_Task2StepAfterChoice_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_2_black_nac_0BBB(NormalStep step,
			AlternativeFlow altFlow, Flow flow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_381404 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!altFlow.equals(__DEC_step_steps_381404)) {
					if (!flow.equals(__DEC_step_steps_381404)) {
						return new Object[] { step, altFlow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_2_black_nac_1BB(NormalStep step, ChoiceStep cStep) {
		for (Step __DEC_step_next_621431 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_621431)) {
				if (!cStep.equals(__DEC_step_next_621431)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_2_black_nac_2BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_824125 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_824125)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_2_black_nac_3BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_20550 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_20550)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_2_black_nac_4BB(StepAlternative alt,
			ChoiceStep cStep) {
		for (ChoiceStep __DEC_alt_stepAlternatives_603953 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
			if (!cStep.equals(__DEC_alt_stepAlternatives_603953)) {
				return new Object[] { alt, cStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_2_black_nac_5BB(Flow flow, NormalStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_2_black_nac_6BB(ChoiceStep cStep, NormalStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_22_2_blackFFFFFFB(
			EMoflonEdge _edge_stepAlternatives) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCStep = _edge_stepAlternatives.getSrc();
		if (tmpCStep instanceof ChoiceStep) {
			ChoiceStep cStep = (ChoiceStep) tmpCStep;
			EObject tmpAlt = _edge_stepAlternatives.getTrg();
			if (tmpAlt instanceof StepAlternative) {
				StepAlternative alt = (StepAlternative) tmpAlt;
				if (cStep.getStepAlternatives().contains(alt)) {
					AlternativeFlow altFlow = alt.getRef();
					if (altFlow != null) {
						if (pattern_Task2StepAfterChoice_22_2_black_nac_4BB(alt, cStep) == null) {
							if (pattern_Task2StepAfterChoice_22_2_black_nac_2BB(altFlow, alt) == null) {
								for (Step tmpStep : altFlow.getSteps()) {
									if (tmpStep instanceof NormalStep) {
										NormalStep step = (NormalStep) tmpStep;
										if (pattern_Task2StepAfterChoice_22_2_black_nac_1BB(step, cStep) == null) {
											if (pattern_Task2StepAfterChoice_22_2_black_nac_6BB(cStep, step) == null) {
												for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(cStep, Flow.class, "steps")) {
													if (!altFlow.equals(flow)) {
														if (pattern_Task2StepAfterChoice_22_2_black_nac_0BBB(step,
																altFlow, flow) == null) {
															if (pattern_Task2StepAfterChoice_22_2_black_nac_5BB(flow,
																	step) == null) {
																for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(altFlow,
																				UseCase.class, "flows")) {
																	if (useCase.getFlows().contains(flow)) {
																		if (pattern_Task2StepAfterChoice_22_2_black_nac_3BB(
																				altFlow, useCase) == null) {
																			_result.add(new Object[] { cStep, step,
																					altFlow, useCase, alt, flow,
																					_edge_stepAlternatives });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Task2StepAfterChoice_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_22_3_expressionFBBBBBBBB(Task2StepAfterChoice _this,
			Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow, UseCase useCase,
			StepAlternative alt, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cStep, step, altFlow, useCase, alt, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_22_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_23_1_binding = pattern_Task2StepAfterChoice_23_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_23_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_23_1_black = pattern_Task2StepAfterChoice_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_2_black_nac_0BBB(NormalStep step,
			AlternativeFlow altFlow, Flow flow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_506766 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!altFlow.equals(__DEC_step_steps_506766)) {
					if (!flow.equals(__DEC_step_steps_506766)) {
						return new Object[] { step, altFlow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_2_black_nac_1BB(NormalStep step, ChoiceStep cStep) {
		for (Step __DEC_step_next_491376 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_491376)) {
				if (!cStep.equals(__DEC_step_next_491376)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_2_black_nac_2BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_815320 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_815320)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_2_black_nac_3BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_684161 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_684161)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_2_black_nac_4BB(StepAlternative alt,
			ChoiceStep cStep) {
		for (ChoiceStep __DEC_alt_stepAlternatives_440607 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
			if (!cStep.equals(__DEC_alt_stepAlternatives_440607)) {
				return new Object[] { alt, cStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_2_black_nac_5BB(Flow flow, NormalStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_2_black_nac_6BB(ChoiceStep cStep, NormalStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_23_2_blackFFFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAltFlow = _edge_steps.getSrc();
		if (tmpAltFlow instanceof AlternativeFlow) {
			AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (altFlow.getSteps().contains(step)) {
					for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(altFlow,
							UseCase.class, "flows")) {
						if (pattern_Task2StepAfterChoice_23_2_black_nac_3BB(altFlow, useCase) == null) {
							for (Flow flow : useCase.getFlows()) {
								if (!altFlow.equals(flow)) {
									if (pattern_Task2StepAfterChoice_23_2_black_nac_0BBB(step, altFlow, flow) == null) {
										if (pattern_Task2StepAfterChoice_23_2_black_nac_5BB(flow, step) == null) {
											for (Step tmpCStep : flow.getSteps()) {
												if (tmpCStep instanceof ChoiceStep) {
													ChoiceStep cStep = (ChoiceStep) tmpCStep;
													if (pattern_Task2StepAfterChoice_23_2_black_nac_1BB(step,
															cStep) == null) {
														if (pattern_Task2StepAfterChoice_23_2_black_nac_6BB(cStep,
																step) == null) {
															for (StepAlternative alt : cStep.getStepAlternatives()) {
																if (altFlow.equals(alt.getRef())) {
																	if (pattern_Task2StepAfterChoice_23_2_black_nac_2BB(
																			altFlow, alt) == null) {
																		if (pattern_Task2StepAfterChoice_23_2_black_nac_4BB(
																				alt, cStep) == null) {
																			_result.add(new Object[] { cStep, step,
																					altFlow, useCase, alt, flow,
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
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_23_3_expressionFBBBBBBBB(Task2StepAfterChoice _this,
			Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow, UseCase useCase,
			StepAlternative alt, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cStep, step, altFlow, useCase, alt, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_23_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_24_1_binding = pattern_Task2StepAfterChoice_24_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_24_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_24_1_black = pattern_Task2StepAfterChoice_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_641094 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_641094)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_561706 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_561706)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_877476 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_877476)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_24_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
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
						if (process.getFlowElements().contains(prevNode)) {
							FlowNode tmpTask = sf1.getTargetRef();
							if (tmpTask instanceof Task) {
								Task task = (Task) tmpTask;
								if (process.getFlowElements().contains(task)) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
										if (pattern_Task2StepAfterChoice_24_2_black_nac_1BB(sf1, process) == null) {
											if (pattern_Task2StepAfterChoice_24_2_black_nac_0BB(sf1,
													prevNode) == null) {
												if (pattern_Task2StepAfterChoice_24_2_black_nac_3BB(prevNode,
														sf1) == null) {
													if (pattern_Task2StepAfterChoice_24_2_black_nac_2BB(task,
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

	public static final Object[] pattern_Task2StepAfterChoice_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_24_3_expressionFBBBBBB(Task2StepAfterChoice _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_24_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_25_1_binding = pattern_Task2StepAfterChoice_25_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_25_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_25_1_black = pattern_Task2StepAfterChoice_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_2_black_nac_0BBB(NormalStep step,
			AlternativeFlow altFlow, Flow flow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_915245 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!altFlow.equals(__DEC_step_steps_915245)) {
					if (!flow.equals(__DEC_step_steps_915245)) {
						return new Object[] { step, altFlow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_2_black_nac_1BB(NormalStep step, ChoiceStep cStep) {
		for (Step __DEC_step_next_995849 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_995849)) {
				if (!cStep.equals(__DEC_step_next_995849)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_2_black_nac_2BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_883083 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_883083)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_2_black_nac_3BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_304294 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_304294)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_2_black_nac_4BB(StepAlternative alt,
			ChoiceStep cStep) {
		for (ChoiceStep __DEC_alt_stepAlternatives_308825 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
			if (!cStep.equals(__DEC_alt_stepAlternatives_308825)) {
				return new Object[] { alt, cStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_2_black_nac_5BB(Flow flow, NormalStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_2_black_nac_6BB(ChoiceStep cStep, NormalStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_25_2_blackFFFFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpAltFlow = _edge_flows.getTrg();
			if (tmpAltFlow instanceof AlternativeFlow) {
				AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
				if (useCase.getFlows().contains(altFlow)) {
					if (pattern_Task2StepAfterChoice_25_2_black_nac_3BB(altFlow, useCase) == null) {
						for (Flow flow : useCase.getFlows()) {
							if (!altFlow.equals(flow)) {
								for (Step tmpStep : altFlow.getSteps()) {
									if (tmpStep instanceof NormalStep) {
										NormalStep step = (NormalStep) tmpStep;
										if (pattern_Task2StepAfterChoice_25_2_black_nac_0BBB(step, altFlow,
												flow) == null) {
											if (pattern_Task2StepAfterChoice_25_2_black_nac_5BB(flow, step) == null) {
												for (Step tmpCStep : flow.getSteps()) {
													if (tmpCStep instanceof ChoiceStep) {
														ChoiceStep cStep = (ChoiceStep) tmpCStep;
														if (pattern_Task2StepAfterChoice_25_2_black_nac_1BB(step,
																cStep) == null) {
															if (pattern_Task2StepAfterChoice_25_2_black_nac_6BB(cStep,
																	step) == null) {
																for (StepAlternative alt : cStep
																		.getStepAlternatives()) {
																	if (altFlow.equals(alt.getRef())) {
																		if (pattern_Task2StepAfterChoice_25_2_black_nac_2BB(
																				altFlow, alt) == null) {
																			if (pattern_Task2StepAfterChoice_25_2_black_nac_4BB(
																					alt, cStep) == null) {
																				_result.add(new Object[] { cStep, step,
																						altFlow, useCase, alt, flow,
																						_edge_flows });
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Task2StepAfterChoice_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_25_3_expressionFBBBBBBBB(Task2StepAfterChoice _this,
			Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow, UseCase useCase,
			StepAlternative alt, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cStep, step, altFlow, useCase, alt, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_25_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_26_1_binding = pattern_Task2StepAfterChoice_26_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_26_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_26_1_black = pattern_Task2StepAfterChoice_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_2_black_nac_0BBB(NormalStep step,
			AlternativeFlow altFlow, Flow flow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_363271 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!altFlow.equals(__DEC_step_steps_363271)) {
					if (!flow.equals(__DEC_step_steps_363271)) {
						return new Object[] { step, altFlow, flow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_2_black_nac_1BB(NormalStep step, ChoiceStep cStep) {
		for (Step __DEC_step_next_231497 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_231497)) {
				if (!cStep.equals(__DEC_step_next_231497)) {
					return new Object[] { step, cStep };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_2_black_nac_2BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_865372 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_865372)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_2_black_nac_3BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_655936 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_655936)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_2_black_nac_4BB(StepAlternative alt,
			ChoiceStep cStep) {
		for (ChoiceStep __DEC_alt_stepAlternatives_946153 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
			if (!cStep.equals(__DEC_alt_stepAlternatives_946153)) {
				return new Object[] { alt, cStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_2_black_nac_5BB(Flow flow, NormalStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_2_black_nac_6BB(ChoiceStep cStep, NormalStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_26_2_blackFFFFFFB(EMoflonEdge _edge_ref) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlt = _edge_ref.getSrc();
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			EObject tmpAltFlow = _edge_ref.getTrg();
			if (tmpAltFlow instanceof AlternativeFlow) {
				AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
				if (altFlow.equals(alt.getRef())) {
					if (pattern_Task2StepAfterChoice_26_2_black_nac_2BB(altFlow, alt) == null) {
						for (Step tmpStep : altFlow.getSteps()) {
							if (tmpStep instanceof NormalStep) {
								NormalStep step = (NormalStep) tmpStep;
								for (ChoiceStep cStep : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
									if (pattern_Task2StepAfterChoice_26_2_black_nac_1BB(step, cStep) == null) {
										if (pattern_Task2StepAfterChoice_26_2_black_nac_4BB(alt, cStep) == null) {
											if (pattern_Task2StepAfterChoice_26_2_black_nac_6BB(cStep, step) == null) {
												for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
													if (pattern_Task2StepAfterChoice_26_2_black_nac_3BB(altFlow,
															useCase) == null) {
														for (Flow flow : useCase.getFlows()) {
															if (!altFlow.equals(flow)) {
																if (flow.getSteps().contains(cStep)) {
																	if (pattern_Task2StepAfterChoice_26_2_black_nac_0BBB(
																			step, altFlow, flow) == null) {
																		if (pattern_Task2StepAfterChoice_26_2_black_nac_5BB(
																				flow, step) == null) {
																			_result.add(new Object[] { cStep, step,
																					altFlow, useCase, alt, flow,
																					_edge_ref });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Task2StepAfterChoice_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_26_3_expressionFBBBBBBBB(Task2StepAfterChoice _this,
			Match match, ChoiceStep cStep, NormalStep step, AlternativeFlow altFlow, UseCase useCase,
			StepAlternative alt, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cStep, step, altFlow, useCase, alt, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_26_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_27_1_binding = pattern_Task2StepAfterChoice_27_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_27_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_27_1_black = pattern_Task2StepAfterChoice_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_512280 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_512280)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_544782 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_544782)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_201768 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_201768)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_27_2_blackFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (process.getFlowElements().contains(task)) {
					if (pattern_Task2StepAfterChoice_27_2_black_nac_2BB(task, process) == null) {
						for (FlowElement tmpPrevNode : process.getFlowElements()) {
							if (tmpPrevNode instanceof ExclusiveGateway) {
								ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
								boolean prevNodeisDiverging = prevNode.isIsDiverging();
								if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
									for (FlowElement tmpSf1 : process.getFlowElements()) {
										if (tmpSf1 instanceof SequenceFlow) {
											SequenceFlow sf1 = (SequenceFlow) tmpSf1;
											if (prevNode.equals(sf1.getSourceRef())) {
												if (task.equals(sf1.getTargetRef())) {
													if (pattern_Task2StepAfterChoice_27_2_black_nac_0BB(sf1,
															prevNode) == null) {
														if (pattern_Task2StepAfterChoice_27_2_black_nac_1BB(sf1,
																process) == null) {
															if (pattern_Task2StepAfterChoice_27_2_black_nac_3BB(
																	prevNode, sf1) == null) {
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

		}

		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_27_3_expressionFBBBBBB(Task2StepAfterChoice _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_27_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_28_1_binding = pattern_Task2StepAfterChoice_28_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_28_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_28_1_black = pattern_Task2StepAfterChoice_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_867389 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_867389)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_208814 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_208814)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_581388 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_581388)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_28_2_blackFFFFB(EMoflonEdge _edge_targetRef) {
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
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							if (pattern_Task2StepAfterChoice_28_2_black_nac_0BB(sf1, prevNode) == null) {
								if (pattern_Task2StepAfterChoice_28_2_black_nac_3BB(prevNode, sf1) == null) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(prevNode)) {
											if (process.getFlowElements().contains(task)) {
												if (pattern_Task2StepAfterChoice_28_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_Task2StepAfterChoice_28_2_black_nac_2BB(task,
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

	public static final Object[] pattern_Task2StepAfterChoice_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_28_3_expressionFBBBBBB(Task2StepAfterChoice _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_28_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_1_bindingFB(Task2StepAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_1_blackFBB(EClass __eClass,
			Task2StepAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_1_bindingAndBlackFFB(Task2StepAfterChoice _this) {
		Object[] result_pattern_Task2StepAfterChoice_29_1_binding = pattern_Task2StepAfterChoice_29_1_bindingFB(_this);
		if (result_pattern_Task2StepAfterChoice_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2StepAfterChoice_29_1_binding[0];

			Object[] result_pattern_Task2StepAfterChoice_29_1_black = pattern_Task2StepAfterChoice_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2StepAfterChoice_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2StepAfterChoice_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_2_black_nac_0BB(SequenceFlow sf1,
			ExclusiveGateway prevNode) {
		for (ExclusiveGateway __DEC_sf1_default_571664 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
			if (!prevNode.equals(__DEC_sf1_default_571664)) {
				return new Object[] { sf1, prevNode };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_703694 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_703694)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_2_black_nac_2BB(Task task,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_task_flowElements_953013 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_task_flowElements_953013)) {
				return new Object[] { task, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_2_black_nac_3BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2StepAfterChoice_29_2_blackFFFFB(EMoflonEdge _edge_incoming) {
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
						if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
							if (pattern_Task2StepAfterChoice_29_2_black_nac_0BB(sf1, prevNode) == null) {
								if (pattern_Task2StepAfterChoice_29_2_black_nac_3BB(prevNode, sf1) == null) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(task, de.abilov.bpmn.Process.class,
													"flowElements")) {
										if (process.getFlowElements().contains(prevNode)) {
											if (process.getFlowElements().contains(sf1)) {
												if (pattern_Task2StepAfterChoice_29_2_black_nac_1BB(sf1,
														process) == null) {
													if (pattern_Task2StepAfterChoice_29_2_black_nac_2BB(task,
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

	public static final Object[] pattern_Task2StepAfterChoice_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2StepAfterChoice_29_3_expressionFBBBBBB(Task2StepAfterChoice _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2StepAfterChoice_29_4_expressionFBB(Task2StepAfterChoice _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2StepAfterChoice_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2StepAfterChoice_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Task2StepAfterChoiceImpl
