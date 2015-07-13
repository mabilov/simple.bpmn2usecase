/**
 */
package Bpmn2UseCase.Rules.impl;

import Bpmn2UseCase.Bpmn2UseCaseFactory;

import Bpmn2UseCase.Rules.RulesPackage;
import Bpmn2UseCase.Rules.Task2NormalStepSeq;

import Bpmn2UseCase.SF2F;
import Bpmn2UseCase.T2NS;

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
 * An implementation of the model object '<em><b>Task2 Normal Step Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Task2NormalStepSeqImpl extends AbstractRuleImpl implements
		Task2NormalStepSeq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Task2NormalStepSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTask2NormalStepSeq();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		// initial bindings
		Object[] result1_black = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_0_1_blackBBBBBBB(this, match, node,
						process, sf1, task, sf2);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[node] = " + node
							+ ", " + "[process] = " + process + ", "
							+ "[sf1] = " + sf1 + ", " + "[task] = " + task
							+ ", " + "[sf2] = " + sf2 + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_0_2_bindingAndBlackFBBBBBBB(this,
						match, node, process, sf1, task, sf2);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[node] = " + node
							+ ", " + "[process] = " + process + ", "
							+ "[sf1] = " + sf1 + ", " + "[task] = " + task
							+ ", " + "[sf2] = " + sf2 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_0_4_blackBBBBBB(match, node,
							process, sf1, task, sf2);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[node] = " + node + ", " + "[process] = "
								+ process + ", " + "[sf1] = " + sf1 + ", "
								+ "[task] = " + task + ", " + "[sf2] = " + sf2
								+ ".");
			}
			Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_0_4_greenBBBBBFFFFFF(match,
							process, sf1, task, sf2);
			// EMoflonEdge process__task____flowElements = (EMoflonEdge) result4_green[5];
			// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result4_green[6];
			// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result4_green[7];
			// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result4_green[8];
			// EMoflonEdge sf2__task____sourceRef = (EMoflonEdge) result4_green[9];
			// EMoflonEdge task__sf2____outgoing = (EMoflonEdge) result4_green[10];

			// collect context elements
			Object[] result5_black = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_0_5_blackBBBBBB(match, node,
							process, sf1, task, sf2);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[node] = " + node + ", " + "[process] = "
								+ process + ", " + "[sf1] = " + sf1 + ", "
								+ "[task] = " + task + ", " + "[sf2] = " + sf2
								+ ".");
			}
			Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_0_5_greenBBBBFFFF(match, node,
							process, sf1);
			// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result5_green[4];
			// EMoflonEdge process__node____flowElements = (EMoflonEdge) result5_green[5];
			// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result5_green[6];
			// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result5_green[7];

			// register objects to match
			Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_0_6_expressionBBBBBBB(this,
							match, node, process, sf1, task, sf2);
			return Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_0_7_expressionF();
		} else {
			return Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_1_1_bindingAndBlackFFFFFFFFFBFB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Task node = (Task) result1_bindingAndBlack[0];
		NormalStep prevStep = (NormalStep) result1_bindingAndBlack[1];
		T2NS _t2ps1 = (T2NS) result1_bindingAndBlack[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[5];
		Task task = (Task) result1_bindingAndBlack[6];
		SequenceFlow sf2 = (SequenceFlow) result1_bindingAndBlack[7];
		SF2F _sf2f1 = (SF2F) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_1_1_greenBFBBFBF(prevStep, flow,
						task, sf2);
		NormalStep step = (NormalStep) result1_green[1];
		T2NS _t2ns = (T2NS) result1_green[4];
		SF2F _sf2f2 = (SF2F) result1_green[6];

		// collect translated elements
		Object[] result2_black = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_1_2_blackBBBBB(step, task, _t2ns,
						sf2, _sf2f2);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[step] = " + step + ", "
							+ "[task] = " + task + ", " + "[_t2ns] = " + _t2ns
							+ ", " + "[sf2] = " + sf2 + ", " + "[_sf2f2] = "
							+ _sf2f2 + ".");
		}
		Object[] result2_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_1_2_greenFBBBBB(step, task, _t2ns,
						sf2, _sf2f2);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_1_3_blackBBBBBBBBBBBBB(ruleresult,
						node, prevStep, _t2ps1, step, process, flow, sf1, task,
						_t2ns, sf2, _sf2f2, _sf2f1);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[node] = "
							+ node
							+ ", "
							+ "[prevStep] = "
							+ prevStep
							+ ", "
							+ "[_t2ps1] = "
							+ _t2ps1
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[sf1] = "
							+ sf1
							+ ", "
							+ "[task] = "
							+ task
							+ ", "
							+ "[_t2ns] = "
							+ _t2ns
							+ ", "
							+ "[sf2] = "
							+ sf2
							+ ", "
							+ "[_sf2f2] = "
							+ _sf2f2 + ", " + "[_sf2f1] = " + _sf2f1 + ".");
		}
		Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_1_3_greenBBBBBBBBBBFFFFFFFFFFFF(
						ruleresult, prevStep, step, process, flow, sf1, task,
						_t2ns, sf2, _sf2f2);
		// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[10];
		// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[11];
		// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result3_green[12];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[13];
		// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[14];
		// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[15];
		// EMoflonEdge sf2__task____sourceRef = (EMoflonEdge) result3_green[16];
		// EMoflonEdge task__sf2____outgoing = (EMoflonEdge) result3_green[17];
		// EMoflonEdge _t2ns__task____source = (EMoflonEdge) result3_green[18];
		// EMoflonEdge _t2ns__step____target = (EMoflonEdge) result3_green[19];
		// EMoflonEdge _sf2f2__sf2____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge _sf2f2__flow____target = (EMoflonEdge) result3_green[21];

		// perform postprocessing story node is empty
		// register objects
		Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_1_5_expressionBBBBBBBBBBBBBB(this,
						ruleresult, node, prevStep, _t2ps1, step, process,
						flow, sf1, task, _t2ns, sf2, _sf2f2, _sf2f1);
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Task node = (Task) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		Task task = (Task) result2_binding[3];
		SequenceFlow sf2 = (SequenceFlow) result2_binding[4];
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_2_2_blackBFFBFBBBFB(node, process,
						sf1, task, sf2, match)) {
			NormalStep prevStep = (NormalStep) result2_black[1];
			T2NS _t2ps1 = (T2NS) result2_black[2];
			Flow flow = (Flow) result2_black[4];
			SF2F _sf2f1 = (SF2F) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_2_3_blackBBBBBBBBB(node,
							prevStep, _t2ps1, process, flow, sf1, task, sf2,
							_sf2f1)) {
				Object[] result3_green = Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_2_3_greenBBBBBBBBBFFFFFFFFFFFFFFF(
								node, prevStep, _t2ps1, process, flow, sf1,
								task, sf2, _sf2f1);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge _t2ps1__node____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _t2ps1__prevStep____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf2__task____sourceRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge task__sf2____outgoing = (EMoflonEdge) result3_green[19];
				// EMoflonEdge _sf2f1__sf1____source = (EMoflonEdge) result3_green[20];
				// EMoflonEdge _sf2f1__flow____target = (EMoflonEdge) result3_green[21];
				// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result3_green[22];
				// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_2_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, node, prevStep,
								_t2ps1, process, flow, sf1, task, sf2, _sf2f1);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[node] = "
									+ node
									+ ", "
									+ "[prevStep] = "
									+ prevStep
									+ ", "
									+ "[_t2ps1] = "
									+ _t2ps1
									+ ", "
									+ "[process] = "
									+ process
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[sf1] = "
									+ sf1
									+ ", "
									+ "[task] = "
									+ task
									+ ", "
									+ "[sf2] = "
									+ sf2
									+ ", "
									+ "[_sf2f1] = "
									+ _sf2f1 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_2_6_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		match.registerObject("node", node);
		match.registerObject("process", process);
		match.registerObject("sf1", sf1);
		match.registerObject("task", task);
		match.registerObject("sf2", sf2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("_t2ps1", _t2ps1);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("task", task);
		isApplicableMatch.registerObject("sf2", sf2);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject node,
			EObject prevStep, EObject _t2ps1, EObject step, EObject process,
			EObject flow, EObject sf1, EObject task, EObject _t2ns,
			EObject sf2, EObject _sf2f2, EObject _sf2f1) {
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("_t2ps1", _t2ps1);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("_t2ns", _t2ns);
		ruleresult.registerObject("sf2", sf2);
		ruleresult.registerObject("_sf2f2", _sf2f2);
		ruleresult.registerObject("_sf2f1", _sf2f1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& match.getObject("task")
						.eClass()
						.equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE
								.getTask())
				&& match.getObject("sf2")
						.eClass()
						.equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE
								.getSequenceFlow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, NormalStep prevStep,
			NormalStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_10_1_blackBBBBB(this, match,
						prevStep, step, flow);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevStep] = "
							+ prevStep + ", " + "[step] = " + step + ", "
							+ "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_10_2_bindingAndBlackFBBBBB(this,
						match, prevStep, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevStep] = "
							+ prevStep + ", " + "[step] = " + step + ", "
							+ "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_10_4_blackBBBB(match, prevStep,
							step, flow);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[prevStep] = " + prevStep + ", "
								+ "[step] = " + step + ", " + "[flow] = "
								+ flow + ".");
			}
			Task2NormalStepSeqImpl.pattern_Task2NormalStepSeq_10_4_greenBBBBFF(
					match, prevStep, step, flow);
			// EMoflonEdge prevStep__step____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_10_5_blackBBBB(match, prevStep,
							step, flow);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[prevStep] = " + prevStep + ", "
								+ "[step] = " + step + ", " + "[flow] = "
								+ flow + ".");
			}
			Task2NormalStepSeqImpl.pattern_Task2NormalStepSeq_10_5_greenBBB(
					match, prevStep, flow);

			// register objects to match
			Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_10_6_expressionBBBBB(this,
							match, prevStep, step, flow);
			return Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_10_7_expressionF();
		} else {
			return Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_11_1_bindingAndBlackFFFFFFFFBFB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Task node = (Task) result1_bindingAndBlack[0];
		NormalStep prevStep = (NormalStep) result1_bindingAndBlack[1];
		T2NS _t2ps1 = (T2NS) result1_bindingAndBlack[2];
		NormalStep step = (NormalStep) result1_bindingAndBlack[3];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[6];
		SF2F _sf2f1 = (SF2F) result1_bindingAndBlack[7];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_11_1_greenBBBBFFFF(step, process,
						flow, sf1);
		Task task = (Task) result1_green[4];
		T2NS _t2ns = (T2NS) result1_green[5];
		SequenceFlow sf2 = (SequenceFlow) result1_green[6];
		SF2F _sf2f2 = (SF2F) result1_green[7];

		// collect translated elements
		Object[] result2_black = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_11_2_blackBBBBB(step, task, _t2ns,
						sf2, _sf2f2);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[step] = " + step + ", "
							+ "[task] = " + task + ", " + "[_t2ns] = " + _t2ns
							+ ", " + "[sf2] = " + sf2 + ", " + "[_sf2f2] = "
							+ _sf2f2 + ".");
		}
		Object[] result2_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_11_2_greenFBBBBB(step, task, _t2ns,
						sf2, _sf2f2);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_11_3_blackBBBBBBBBBBBBB(ruleresult,
						node, prevStep, _t2ps1, step, process, flow, sf1, task,
						_t2ns, sf2, _sf2f2, _sf2f1);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[node] = "
							+ node
							+ ", "
							+ "[prevStep] = "
							+ prevStep
							+ ", "
							+ "[_t2ps1] = "
							+ _t2ps1
							+ ", "
							+ "[step] = "
							+ step
							+ ", "
							+ "[process] = "
							+ process
							+ ", "
							+ "[flow] = "
							+ flow
							+ ", "
							+ "[sf1] = "
							+ sf1
							+ ", "
							+ "[task] = "
							+ task
							+ ", "
							+ "[_t2ns] = "
							+ _t2ns
							+ ", "
							+ "[sf2] = "
							+ sf2
							+ ", "
							+ "[_sf2f2] = "
							+ _sf2f2 + ", " + "[_sf2f1] = " + _sf2f1 + ".");
		}
		Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_11_3_greenBBBBBBBBBBFFFFFFFFFFFF(
						ruleresult, prevStep, step, process, flow, sf1, task,
						_t2ns, sf2, _sf2f2);
		// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[10];
		// EMoflonEdge process__task____flowElements = (EMoflonEdge) result3_green[11];
		// EMoflonEdge process__sf2____flowElements = (EMoflonEdge) result3_green[12];
		// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[13];
		// EMoflonEdge sf1__task____targetRef = (EMoflonEdge) result3_green[14];
		// EMoflonEdge task__sf1____incoming = (EMoflonEdge) result3_green[15];
		// EMoflonEdge sf2__task____sourceRef = (EMoflonEdge) result3_green[16];
		// EMoflonEdge task__sf2____outgoing = (EMoflonEdge) result3_green[17];
		// EMoflonEdge _t2ns__task____source = (EMoflonEdge) result3_green[18];
		// EMoflonEdge _t2ns__step____target = (EMoflonEdge) result3_green[19];
		// EMoflonEdge _sf2f2__sf2____source = (EMoflonEdge) result3_green[20];
		// EMoflonEdge _sf2f2__flow____target = (EMoflonEdge) result3_green[21];

		// perform postprocessing story node is empty
		// register objects
		Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_11_5_expressionBBBBBBBBBBBBBB(this,
						ruleresult, node, prevStep, _t2ps1, step, process,
						flow, sf1, task, _t2ns, sf2, _sf2f2, _sf2f1);
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		NormalStep prevStep = (NormalStep) result2_binding[0];
		NormalStep step = (NormalStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_12_2_blackFBFBBFFB(prevStep, step,
						flow, match)) {
			Task node = (Task) result2_black[0];
			T2NS _t2ps1 = (T2NS) result2_black[2];
			SequenceFlow sf1 = (SequenceFlow) result2_black[5];
			SF2F _sf2f1 = (SF2F) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_12_3_blackBBBBFBBB(node,
							prevStep, _t2ps1, step, flow, sf1, _sf2f1)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[4];
				Object[] result3_green = Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_12_3_greenBBBBBBBBFFFFFFFFFFF(
								node, prevStep, _t2ps1, step, process, flow,
								sf1, _sf2f1);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[9];
				// EMoflonEdge _t2ps1__node____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge _t2ps1__prevStep____target = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__node____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge _sf2f1__sf1____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge _sf2f1__flow____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__node____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge node__sf1____outgoing = (EMoflonEdge) result3_green[18];

				// solve CSP
				Object[] result4_bindingAndBlack = Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_12_4_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, node, prevStep,
								_t2ps1, step, process, flow, sf1, _sf2f1);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[node] = "
									+ node
									+ ", "
									+ "[prevStep] = "
									+ prevStep
									+ ", "
									+ "[_t2ps1] = "
									+ _t2ps1
									+ ", "
									+ "[step] = "
									+ step
									+ ", "
									+ "[process] = "
									+ process
									+ ", "
									+ "[flow] = "
									+ flow
									+ ", "
									+ "[sf1] = "
									+ sf1 + ", " + "[_sf2f1] = " + _sf2f1 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_12_5_expressionFBB(this,
								csp)) {

					// add match to rule result
					Object[] result6_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_12_6_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_12_6_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NormalStep prevStep,
			NormalStep step, Flow flow) {
		match.registerObject("prevStep", prevStep);
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NormalStep prevStep,
			NormalStep step, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("_t2ps1", _t2ps1);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject node,
			EObject prevStep, EObject _t2ps1, EObject step, EObject process,
			EObject flow, EObject sf1, EObject task, EObject _t2ns,
			EObject sf2, EObject _sf2f2, EObject _sf2f1) {
		ruleresult.registerObject("node", node);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("_t2ps1", _t2ps1);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("_t2ns", _t2ns);
		ruleresult.registerObject("sf2", sf2);
		ruleresult.registerObject("_sf2f2", _sf2f2);
		ruleresult.registerObject("_sf2f1", _sf2f1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match
				.getObject("step")
				.eClass()
				.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE
						.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_76(
			EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_20_2_blackFFFB(_edge_next)) {
			NormalStep prevStep = (NormalStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_20_3_expressionFBBBBB(this,
							match, prevStep, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_20_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_20_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_253(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_21_2_blackFFFFFB(_edge_flowElements)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			SequenceFlow sf2 = (SequenceFlow) result2_black[4];
			Object[] result2_green = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_21_3_expressionFBBBBBBB(this,
							match, node, process, sf1, task, sf2)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_21_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_21_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_254(
			EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_22_2_blackFFFFFB(_edge_flowElements)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			SequenceFlow sf2 = (SequenceFlow) result2_black[4];
			Object[] result2_green = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_22_3_expressionFBBBBBBB(this,
							match, node, process, sf1, task, sf2)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_22_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_22_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_77(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_23_2_blackFFFB(_edge_steps)) {
			NormalStep prevStep = (NormalStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_23_3_expressionFBBBBB(this,
							match, prevStep, step, flow)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_23_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_23_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_23_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_255(
			EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_24_2_blackFFFFFB(_edge_targetRef)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			SequenceFlow sf2 = (SequenceFlow) result2_black[4];
			Object[] result2_green = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_24_3_expressionFBBBBBBB(this,
							match, node, process, sf1, task, sf2)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_24_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_24_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_24_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_256(
			EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_25_2_blackFFFFFB(_edge_incoming)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			SequenceFlow sf2 = (SequenceFlow) result2_black[4];
			Object[] result2_green = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_25_3_expressionFBBBBBBB(this,
							match, node, process, sf1, task, sf2)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_25_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_25_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_25_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_257(
			EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_26_2_blackFFFFFB(_edge_sourceRef)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			SequenceFlow sf2 = (SequenceFlow) result2_black[4];
			Object[] result2_green = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_26_3_expressionFBBBBBBB(this,
							match, node, process, sf1, task, sf2)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_26_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_26_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_26_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_258(
			EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_27_2_blackFFFFFB(_edge_outgoing)) {
			Task node = (Task) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			Task task = (Task) result2_black[3];
			SequenceFlow sf2 = (SequenceFlow) result2_black[4];
			Object[] result2_green = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_27_3_expressionFBBBBBBB(this,
							match, node, process, sf1, task, sf2)) {
				// Ensure that the correct types of elements are matched
				if (Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_27_4_expressionFBB(this,
								match)) {

					// Add match to rule result
					Object[] result5_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_27_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_27_5_greenBBB(match,
									__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(
			TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Task2NormalStepSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.Task node = (SimpleBPMN.Task) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.NormalStep prevStep = (SimpleUseCase.NormalStep) matchForPrevStep
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_t2ps1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_t2ps1")).findAny();
		Bpmn2UseCase.T2NS _t2ps1 = (Bpmn2UseCase.T2NS) matchFor_t2ps1.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		SimpleBPMN.Task task = (SimpleBPMN.Task) matchForTask.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_t2ns = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_t2ns")).findAny();
		Bpmn2UseCase.T2NS _t2ns = (Bpmn2UseCase.T2NS) matchFor_t2ns.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForSf2 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf2")).findAny();
		SimpleBPMN.SequenceFlow sf2 = (SimpleBPMN.SequenceFlow) matchForSf2
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f2 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f2")).findAny();
		Bpmn2UseCase.SF2F _sf2f2 = (Bpmn2UseCase.SF2F) matchFor_sf2f2.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f1")).findAny();
		Bpmn2UseCase.SF2F _sf2f1 = (Bpmn2UseCase.SF2F) matchFor_sf2f1.get()
				.getNode();

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
	public AttributeConstraintsRuleResult checkAttributes_BWD(
			TripleMatch tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Task2NormalStepSeq");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForNode = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("node")).findAny();
		SimpleBPMN.Task node = (SimpleBPMN.Task) matchForNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.NormalStep prevStep = (SimpleUseCase.NormalStep) matchForPrevStep
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_t2ps1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_t2ps1")).findAny();
		Bpmn2UseCase.T2NS _t2ps1 = (Bpmn2UseCase.T2NS) matchFor_t2ps1.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForStep = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchForTask = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("task")).findAny();
		SimpleBPMN.Task task = (SimpleBPMN.Task) matchForTask.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_t2ns = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_t2ns")).findAny();
		Bpmn2UseCase.T2NS _t2ns = (Bpmn2UseCase.T2NS) matchFor_t2ns.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForSf2 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf2")).findAny();
		SimpleBPMN.SequenceFlow sf2 = (SimpleBPMN.SequenceFlow) matchForSf2
				.get().getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f2 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f2")).findAny();
		Bpmn2UseCase.SF2F _sf2f2 = (Bpmn2UseCase.SF2F) matchFor_sf2f2.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchFor_sf2f1 = tripleMatch
				.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("_sf2f1")).findAny();
		Bpmn2UseCase.SF2F _sf2f1 = (Bpmn2UseCase.SF2F) matchFor_sf2f1.get()
				.getNode();

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch,
			Match targetMatch) {
		// prepare
		Object[] result1_black = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_30_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_30_1_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		// ForEach match context
		Object[] result2_binding = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_30_2_bindingFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node match context failed."
					+ " Variables: " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		Task node = (Task) result2_binding[0];
		NormalStep prevStep = (NormalStep) result2_binding[1];
		NormalStep step = (NormalStep) result2_binding[2];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[3];
		Flow flow = (Flow) result2_binding[4];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[5];
		Task task = (Task) result2_binding[6];
		SequenceFlow sf2 = (SequenceFlow) result2_binding[7];
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_30_2_blackBBFBBBBBBFBB(node,
						prevStep, step, process, flow, sf1, task, sf2,
						sourceMatch, targetMatch)) {
			T2NS _t2ps1 = (T2NS) result2_black[2];
			SF2F _sf2f1 = (SF2F) result2_black[9];
			Object[] result2_green = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_30_2_greenBBBBBBBBBBBFB(node,
							prevStep, _t2ps1, step, process, flow, sf1, task,
							sf2, _sf2f1, sourceMatch, targetMatch);
			IsApplicableMatchCC isApplicableMatch = (IsApplicableMatchCC) result2_green[11];

			// check csp
			Object[] result3_bindingAndBlack = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_30_3_bindingAndBlackFBBBBBBBBBBBBBB(
							this, isApplicableMatch, node, prevStep, _t2ps1,
							step, process, flow, sf1, task, sf2, _sf2f1,
							sourceMatch, targetMatch);
			if (result3_bindingAndBlack != null) {
				// CSP csp = (CSP) result3_bindingAndBlack[0];

				// add to returned result
				Object[] result4_black = Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_30_4_blackBB(result,
								isApplicableMatch);
				if (result4_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [add to returned result] failed."
									+ " Variables: " + "[result] = " + result
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ".");
				}
				Task2NormalStepSeqImpl.pattern_Task2NormalStepSeq_30_4_greenBB(
						result, isApplicableMatch);

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_30_5_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(IsApplicableMatchCC isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("_t2ps1", _t2ps1);
		isApplicableMatch.registerObject("step", step);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("task", task);
		isApplicableMatch.registerObject("sf2", sf2);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
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
		Object[] result1_black = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_33_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}

		// create correspondence links
		Object[] result2_bindingAndBlack = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_33_2_bindingAndBlackFFFFFFFFFFB(isApplicableMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [create correspondence links] failed."
							+ " Variables: " + "[isApplicableMatch] = "
							+ isApplicableMatch + ".");
		}
		// Task node = (Task) result2_bindingAndBlack[0];
		// NormalStep prevStep = (NormalStep) result2_bindingAndBlack[1];
		// T2NS _t2ps1 = (T2NS) result2_bindingAndBlack[2];
		NormalStep step = (NormalStep) result2_bindingAndBlack[3];
		// SimpleBPMN.Process process = (SimpleBPMN.Process) result2_bindingAndBlack[4];
		Flow flow = (Flow) result2_bindingAndBlack[5];
		// SequenceFlow sf1 = (SequenceFlow) result2_bindingAndBlack[6];
		Task task = (Task) result2_bindingAndBlack[7];
		SequenceFlow sf2 = (SequenceFlow) result2_bindingAndBlack[8];
		// SF2F _sf2f1 = (SF2F) result2_bindingAndBlack[9];
		Object[] result2_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_33_2_greenBBBBFFF(step, flow, task,
						sf2);
		PerformRuleResult result = (PerformRuleResult) result2_green[4];
		// T2NS _t2ns = (T2NS) result2_green[5];
		// SF2F _sf2f2 = (SF2F) result2_green[6];

		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_33_3_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer, T2NS _t2ps1Parameter) {
		// create result
		Object[] result1_black = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_34_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_34_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_34_2_blackFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList _t2ps1List = (RuleEntryList) result2_black[0];
			Task node = (Task) result2_black[1];
			T2NS _t2ps1 = (T2NS) result2_black[2];
			NormalStep prevStep = (NormalStep) result2_black[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[4];
			SequenceFlow sf1 = (SequenceFlow) result2_black[5];
			SF2F _sf2f1 = (SF2F) result2_black[6];
			Flow flow = (Flow) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_34_3_bindingAndBlackFBBBBBBBBBB(
							this, isApplicableMatch, node, prevStep, _t2ps1,
							process, flow, sf1, _sf2f1, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[node] = "
								+ node
								+ ", "
								+ "[prevStep] = "
								+ prevStep
								+ ", "
								+ "[_t2ps1] = "
								+ _t2ps1
								+ ", "
								+ "[process] = "
								+ process
								+ ", "
								+ "[flow] = "
								+ flow
								+ ", "
								+ "[sf1] = "
								+ sf1
								+ ", "
								+ "[_sf2f1] = "
								+ _sf2f1
								+ ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (Task2NormalStepSeqImpl
					.pattern_Task2NormalStepSeq_34_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = Task2NormalStepSeqImpl
						.pattern_Task2NormalStepSeq_34_5_blackBBBBBBB(node,
								prevStep, _t2ps1, process, flow, sf1, _sf2f1);
				if (result5_black != null) {

					// perform
					Object[] result6_black = Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_34_6_blackBBBBBBBB(
									node, prevStep, _t2ps1, process, flow, sf1,
									_sf2f1, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[node] = "
										+ node
										+ ", "
										+ "[prevStep] = "
										+ prevStep
										+ ", "
										+ "[_t2ps1] = "
										+ _t2ps1
										+ ", "
										+ "[process] = "
										+ process
										+ ", "
										+ "[flow] = "
										+ flow
										+ ", "
										+ "[sf1] = "
										+ sf1
										+ ", "
										+ "[_sf2f1] = "
										+ _sf2f1
										+ ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					Task2NormalStepSeqImpl
							.pattern_Task2NormalStepSeq_34_6_greenBFBBBFFFFB(
									prevStep, process, flow, sf1, ruleResult);
					// NormalStep step = (NormalStep) result6_green[1];
					// Task task = (Task) result6_green[5];
					// T2NS _t2ns = (T2NS) result6_green[6];
					// SequenceFlow sf2 = (SequenceFlow) result6_green[7];
					// SF2F _sf2f2 = (SF2F) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return Task2NormalStepSeqImpl
				.pattern_Task2NormalStepSeq_34_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("node", node);
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("_t2ps1", _t2ps1);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("_sf2f1", _sf2f1);
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
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Task) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Task) arguments.get(4),
					(SequenceFlow) arguments.get(5));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Task) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Task) arguments.get(4),
					(SequenceFlow) arguments.get(5));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TASK_PROCESS_SEQUENCEFLOW_TASK_SEQUENCEFLOW:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Task) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2),
					(SequenceFlow) arguments.get(3), (Task) arguments.get(4),
					(SequenceFlow) arguments.get(5));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TASK_NORMALSTEP_T2NS_PROCESS_FLOW_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Task) arguments.get(1), (NormalStep) arguments.get(2),
					(T2NS) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4),
					(Flow) arguments.get(5), (SequenceFlow) arguments.get(6),
					(Task) arguments.get(7), (SequenceFlow) arguments.get(8),
					(SF2F) arguments.get(9));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD__MATCH_NORMALSTEP_NORMALSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(NormalStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NORMALSTEP_NORMALSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(NormalStep) arguments.get(2), (Flow) arguments.get(3));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NORMALSTEP_NORMALSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(NormalStep) arguments.get(1),
					(NormalStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TASK_NORMALSTEP_T2NS_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_SF2F:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Task) arguments.get(1), (NormalStep) arguments.get(2),
					(T2NS) arguments.get(3), (NormalStep) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5),
					(Flow) arguments.get(6), (SequenceFlow) arguments.get(7),
					(SF2F) arguments.get(8));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_76__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_76((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_253__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_253((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_254__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_254((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_BWD_EMOFLON_EDGE_77__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_77((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_255__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_255((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_256__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_256((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_257__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_257((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPROPRIATE_FWD_EMOFLON_EDGE_258__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_258((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0),
					(Match) arguments.get(1));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_SOLVE_CSP_CC__ISAPPLICABLEMATCHCC_TASK_NORMALSTEP_T2NS_NORMALSTEP_PROCESS_FLOW_SEQUENCEFLOW_TASK_SEQUENCEFLOW_SF2F_MATCH_MATCH:
			return isApplicable_solveCsp_CC(
					(IsApplicableMatchCC) arguments.get(0),
					(Task) arguments.get(1), (NormalStep) arguments.get(2),
					(T2NS) arguments.get(3), (NormalStep) arguments.get(4),
					(SimpleBPMN.Process) arguments.get(5),
					(Flow) arguments.get(6), (SequenceFlow) arguments.get(7),
					(Task) arguments.get(8), (SequenceFlow) arguments.get(9),
					(SF2F) arguments.get(10), (Match) arguments.get(11),
					(Match) arguments.get(12));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___PERFORM_CC__ISAPPLICABLEMATCHCC:
			return perform_CC((IsApplicableMatchCC) arguments.get(0));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___GENERATE_MODEL__RULEENTRYCONTAINER_T2NS:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(T2NS) arguments.get(1));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TASK_NORMALSTEP_T2NS_PROCESS_FLOW_SEQUENCEFLOW_SF2F_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Task) arguments.get(1), (NormalStep) arguments.get(2),
					(T2NS) arguments.get(3),
					(SimpleBPMN.Process) arguments.get(4),
					(Flow) arguments.get(5), (SequenceFlow) arguments.get(6),
					(SF2F) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.TASK2_NORMAL_STEP_SEQ___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Task2NormalStepSeq_0_1_blackBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		if (!node.equals(task)) {
			if (!sf1.equals(sf2)) {
				return new Object[] { _this, match, node, process, sf1, task,
						sf2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_0_2_bindingFBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, node,
				process, sf1, task, sf2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, node, process, sf1, task,
					sf2 };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepSeq_0_2_bindingAndBlackFBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		Object[] result_pattern_Task2NormalStepSeq_0_2_binding = pattern_Task2NormalStepSeq_0_2_bindingFBBBBBBB(
				_this, match, node, process, sf1, task, sf2);
		if (result_pattern_Task2NormalStepSeq_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepSeq_0_2_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_0_2_black = pattern_Task2NormalStepSeq_0_2_blackB(csp);
			if (result_pattern_Task2NormalStepSeq_0_2_black != null) {

				return new Object[] { csp, _this, match, node, process, sf1,
						task, sf2 };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepSeq_0_3_expressionFBB(
			Task2NormalStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_0_4_blackBBBBBB(
			Match match, Task node, SimpleBPMN.Process process,
			SequenceFlow sf1, Task task, SequenceFlow sf2) {
		if (!node.equals(task)) {
			if (!sf1.equals(sf2)) {
				return new Object[] { match, node, process, sf1, task, sf2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_0_4_greenBBBBBFFFFFF(
			Match match, SimpleBPMN.Process process, SequenceFlow sf1,
			Task task, SequenceFlow sf2) {
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf2__task____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__sf2____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(task);
		match.getToBeTranslatedNodes().add(sf2);
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf2__task____sourceRef_name_prime = "sourceRef";
		String task__sf2____outgoing_name_prime = "outgoing";
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		match.getToBeTranslatedEdges().add(process__task____flowElements);
		process__sf2____flowElements.setSrc(process);
		process__sf2____flowElements.setTrg(sf2);
		match.getToBeTranslatedEdges().add(process__sf2____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		match.getToBeTranslatedEdges().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		match.getToBeTranslatedEdges().add(task__sf1____incoming);
		sf2__task____sourceRef.setSrc(sf2);
		sf2__task____sourceRef.setTrg(task);
		match.getToBeTranslatedEdges().add(sf2__task____sourceRef);
		task__sf2____outgoing.setSrc(task);
		task__sf2____outgoing.setTrg(sf2);
		match.getToBeTranslatedEdges().add(task__sf2____outgoing);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		process__sf2____flowElements
				.setName(process__sf2____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf2__task____sourceRef.setName(sf2__task____sourceRef_name_prime);
		task__sf2____outgoing.setName(task__sf2____outgoing_name_prime);
		return new Object[] { match, process, sf1, task, sf2,
				process__task____flowElements, process__sf2____flowElements,
				sf1__task____targetRef, task__sf1____incoming,
				sf2__task____sourceRef, task__sf2____outgoing };
	}

	public static final Object[] pattern_Task2NormalStepSeq_0_5_blackBBBBBB(
			Match match, Task node, SimpleBPMN.Process process,
			SequenceFlow sf1, Task task, SequenceFlow sf2) {
		if (!node.equals(task)) {
			if (!sf1.equals(sf2)) {
				return new Object[] { match, node, process, sf1, task, sf2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_0_5_greenBBBBFFFF(
			Match match, Task node, SimpleBPMN.Process process, SequenceFlow sf1) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(node);
		match.getContextNodes().add(process);
		match.getContextNodes().add(sf1);
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String sf1__node____sourceRef_name_prime = "sourceRef";
		String node__sf1____outgoing_name_prime = "outgoing";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getContextEdges().add(process__sf1____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		match.getContextEdges().add(process__node____flowElements);
		sf1__node____sourceRef.setSrc(sf1);
		sf1__node____sourceRef.setTrg(node);
		match.getContextEdges().add(sf1__node____sourceRef);
		node__sf1____outgoing.setSrc(node);
		node__sf1____outgoing.setTrg(sf1);
		match.getContextEdges().add(node__sf1____outgoing);
		process__sf1____flowElements
				.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements
				.setName(process__node____flowElements_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		return new Object[] { match, node, process, sf1,
				process__sf1____flowElements, process__node____flowElements,
				sf1__node____sourceRef, node__sf1____outgoing };
	}

	public static final void pattern_Task2NormalStepSeq_0_6_expressionBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		_this.registerObjectsToMatch_FWD(match, node, process, sf1, task, sf2);

	}

	public static final boolean pattern_Task2NormalStepSeq_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("node");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("_t2ps1");
		EObject _localVariable_3 = isApplicableMatch.getObject("process");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_6 = isApplicableMatch.getObject("task");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf2");
		EObject _localVariable_8 = isApplicableMatch.getObject("_sf2f1");
		EObject tmpNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmp_t2ps1 = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpTask = _localVariable_6;
		EObject tmpSf2 = _localVariable_7;
		EObject tmp_sf2f1 = _localVariable_8;
		if (tmpNode instanceof Task) {
			Task node = (Task) tmpNode;
			if (tmpPrevStep instanceof NormalStep) {
				NormalStep prevStep = (NormalStep) tmpPrevStep;
				if (tmp_t2ps1 instanceof T2NS) {
					T2NS _t2ps1 = (T2NS) tmp_t2ps1;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (tmpTask instanceof Task) {
									Task task = (Task) tmpTask;
									if (tmpSf2 instanceof SequenceFlow) {
										SequenceFlow sf2 = (SequenceFlow) tmpSf2;
										if (tmp_sf2f1 instanceof SF2F) {
											SF2F _sf2f1 = (SF2F) tmp_sf2f1;
											return new Object[] { node,
													prevStep, _t2ps1, process,
													flow, sf1, task, sf2,
													_sf2f1, isApplicableMatch };
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

	public static final Object[] pattern_Task2NormalStepSeq_1_1_blackBBBBBBBBBBFB(
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1, Task2NormalStepSeq _this,
			IsApplicableMatch isApplicableMatch) {
		if (!node.equals(task)) {
			if (!sf1.equals(sf2)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { node, prevStep, _t2ps1, process,
								flow, sf1, task, sf2, _sf2f1, _this, csp,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_1_1_bindingAndBlackFFFFFFFFFBFB(
			Task2NormalStepSeq _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2NormalStepSeq_1_1_binding = pattern_Task2NormalStepSeq_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_Task2NormalStepSeq_1_1_binding != null) {
			Task node = (Task) result_pattern_Task2NormalStepSeq_1_1_binding[0];
			NormalStep prevStep = (NormalStep) result_pattern_Task2NormalStepSeq_1_1_binding[1];
			T2NS _t2ps1 = (T2NS) result_pattern_Task2NormalStepSeq_1_1_binding[2];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2NormalStepSeq_1_1_binding[3];
			Flow flow = (Flow) result_pattern_Task2NormalStepSeq_1_1_binding[4];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2NormalStepSeq_1_1_binding[5];
			Task task = (Task) result_pattern_Task2NormalStepSeq_1_1_binding[6];
			SequenceFlow sf2 = (SequenceFlow) result_pattern_Task2NormalStepSeq_1_1_binding[7];
			SF2F _sf2f1 = (SF2F) result_pattern_Task2NormalStepSeq_1_1_binding[8];

			Object[] result_pattern_Task2NormalStepSeq_1_1_black = pattern_Task2NormalStepSeq_1_1_blackBBBBBBBBBBFB(
					node, prevStep, _t2ps1, process, flow, sf1, task, sf2,
					_sf2f1, _this, isApplicableMatch);
			if (result_pattern_Task2NormalStepSeq_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2NormalStepSeq_1_1_black[10];

				return new Object[] { node, prevStep, _t2ps1, process, flow,
						sf1, task, sf2, _sf2f1, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_1_1_greenBFBBFBF(
			NormalStep prevStep, Flow flow, Task task, SequenceFlow sf2) {
		NormalStep step = SimpleUseCaseFactory.eINSTANCE.createNormalStep();
		T2NS _t2ns = Bpmn2UseCaseFactory.eINSTANCE.createT2NS();
		SF2F _sf2f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		prevStep.setNext(step);
		flow.getSteps().add(step);
		_t2ns.setSource(task);
		_t2ns.setTarget(step);
		_sf2f2.setSource(sf2);
		_sf2f2.setTarget(flow);
		return new Object[] { prevStep, step, flow, task, _t2ns, sf2, _sf2f2 };
	}

	public static final Object[] pattern_Task2NormalStepSeq_1_2_blackBBBBB(
			NormalStep step, Task task, T2NS _t2ns, SequenceFlow sf2,
			SF2F _sf2f2) {
		return new Object[] { step, task, _t2ns, sf2, _sf2f2 };
	}

	public static final Object[] pattern_Task2NormalStepSeq_1_2_greenFBBBBB(
			NormalStep step, Task task, T2NS _t2ns, SequenceFlow sf2,
			SF2F _sf2f2) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(task);
		ruleresult.getCreatedLinkElements().add(_t2ns);
		ruleresult.getTranslatedElements().add(sf2);
		ruleresult.getCreatedLinkElements().add(_sf2f2);
		return new Object[] { ruleresult, step, task, _t2ns, sf2, _sf2f2 };
	}

	public static final Object[] pattern_Task2NormalStepSeq_1_3_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject node, EObject prevStep,
			EObject _t2ps1, EObject step, EObject process, EObject flow,
			EObject sf1, EObject task, EObject _t2ns, EObject sf2,
			EObject _sf2f2, EObject _sf2f1) {
		if (!node.equals(prevStep)) {
			if (!node.equals(step)) {
				if (!node.equals(process)) {
					if (!node.equals(sf1)) {
						if (!node.equals(task)) {
							if (!node.equals(sf2)) {
								if (!prevStep.equals(step)) {
									if (!prevStep.equals(process)) {
										if (!prevStep.equals(sf1)) {
											if (!prevStep.equals(task)) {
												if (!prevStep.equals(sf2)) {
													if (!_t2ps1.equals(node)) {
														if (!_t2ps1
																.equals(prevStep)) {
															if (!_t2ps1
																	.equals(step)) {
																if (!_t2ps1
																		.equals(process)) {
																	if (!_t2ps1
																			.equals(flow)) {
																		if (!_t2ps1
																				.equals(sf1)) {
																			if (!_t2ps1
																					.equals(task)) {
																				if (!_t2ps1
																						.equals(sf2)) {
																					if (!step
																							.equals(task)) {
																						if (!process
																								.equals(step)) {
																							if (!process
																									.equals(sf1)) {
																								if (!process
																										.equals(task)) {
																									if (!process
																											.equals(sf2)) {
																										if (!flow
																												.equals(node)) {
																											if (!flow
																													.equals(prevStep)) {
																												if (!flow
																														.equals(step)) {
																													if (!flow
																															.equals(process)) {
																														if (!flow
																																.equals(sf1)) {
																															if (!flow
																																	.equals(task)) {
																																if (!flow
																																		.equals(sf2)) {
																																	if (!sf1.equals(step)) {
																																		if (!sf1.equals(task)) {
																																			if (!sf1.equals(sf2)) {
																																				if (!_t2ns
																																						.equals(node)) {
																																					if (!_t2ns
																																							.equals(prevStep)) {
																																						if (!_t2ns
																																								.equals(_t2ps1)) {
																																							if (!_t2ns
																																									.equals(step)) {
																																								if (!_t2ns
																																										.equals(process)) {
																																									if (!_t2ns
																																											.equals(flow)) {
																																										if (!_t2ns
																																												.equals(sf1)) {
																																											if (!_t2ns
																																													.equals(task)) {
																																												if (!_t2ns
																																														.equals(sf2)) {
																																													if (!sf2.equals(step)) {
																																														if (!sf2.equals(task)) {
																																															if (!_sf2f2
																																																	.equals(node)) {
																																																if (!_sf2f2
																																																		.equals(prevStep)) {
																																																	if (!_sf2f2
																																																			.equals(_t2ps1)) {
																																																		if (!_sf2f2
																																																				.equals(step)) {
																																																			if (!_sf2f2
																																																					.equals(process)) {
																																																				if (!_sf2f2
																																																						.equals(flow)) {
																																																					if (!_sf2f2
																																																							.equals(sf1)) {
																																																						if (!_sf2f2
																																																								.equals(task)) {
																																																							if (!_sf2f2
																																																									.equals(_t2ns)) {
																																																								if (!_sf2f2
																																																										.equals(sf2)) {
																																																									if (!_sf2f1
																																																											.equals(node)) {
																																																										if (!_sf2f1
																																																												.equals(prevStep)) {
																																																											if (!_sf2f1
																																																													.equals(_t2ps1)) {
																																																												if (!_sf2f1
																																																														.equals(step)) {
																																																													if (!_sf2f1
																																																															.equals(process)) {
																																																														if (!_sf2f1
																																																																.equals(flow)) {
																																																															if (!_sf2f1
																																																																	.equals(sf1)) {
																																																																if (!_sf2f1
																																																																		.equals(task)) {
																																																																	if (!_sf2f1
																																																																			.equals(_t2ns)) {
																																																																		if (!_sf2f1
																																																																				.equals(sf2)) {
																																																																			if (!_sf2f1
																																																																					.equals(_sf2f2)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						node,
																																																																						prevStep,
																																																																						_t2ps1,
																																																																						step,
																																																																						process,
																																																																						flow,
																																																																						sf1,
																																																																						task,
																																																																						_t2ns,
																																																																						sf2,
																																																																						_sf2f2,
																																																																						_sf2f1 };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Task2NormalStepSeq_1_3_greenBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevStep, EObject step,
			EObject process, EObject flow, EObject sf1, EObject task,
			EObject _t2ns, EObject sf2, EObject _sf2f2) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf2__task____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__sf2____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _t2ns__task____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _t2ns__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f2__sf2____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f2__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2NormalStepSeq";
		String prevStep__step____next_name_prime = "next";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String flow__step____steps_name_prime = "steps";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf2__task____sourceRef_name_prime = "sourceRef";
		String task__sf2____outgoing_name_prime = "outgoing";
		String _t2ns__task____source_name_prime = "source";
		String _t2ns__step____target_name_prime = "target";
		String _sf2f2__sf2____source_name_prime = "source";
		String _sf2f2__flow____target_name_prime = "target";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(prevStep__step____next);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getTranslatedEdges().add(process__task____flowElements);
		process__sf2____flowElements.setSrc(process);
		process__sf2____flowElements.setTrg(sf2);
		ruleresult.getTranslatedEdges().add(process__sf2____flowElements);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		ruleresult.getTranslatedEdges().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(task__sf1____incoming);
		sf2__task____sourceRef.setSrc(sf2);
		sf2__task____sourceRef.setTrg(task);
		ruleresult.getTranslatedEdges().add(sf2__task____sourceRef);
		task__sf2____outgoing.setSrc(task);
		task__sf2____outgoing.setTrg(sf2);
		ruleresult.getTranslatedEdges().add(task__sf2____outgoing);
		_t2ns__task____source.setSrc(_t2ns);
		_t2ns__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(_t2ns__task____source);
		_t2ns__step____target.setSrc(_t2ns);
		_t2ns__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(_t2ns__step____target);
		_sf2f2__sf2____source.setSrc(_sf2f2);
		_sf2f2__sf2____source.setTrg(sf2);
		ruleresult.getCreatedEdges().add(_sf2f2__sf2____source);
		_sf2f2__flow____target.setSrc(_sf2f2);
		_sf2f2__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_sf2f2__flow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		process__sf2____flowElements
				.setName(process__sf2____flowElements_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf2__task____sourceRef.setName(sf2__task____sourceRef_name_prime);
		task__sf2____outgoing.setName(task__sf2____outgoing_name_prime);
		_t2ns__task____source.setName(_t2ns__task____source_name_prime);
		_t2ns__step____target.setName(_t2ns__step____target_name_prime);
		_sf2f2__sf2____source.setName(_sf2f2__sf2____source_name_prime);
		_sf2f2__flow____target.setName(_sf2f2__flow____target_name_prime);
		return new Object[] { ruleresult, prevStep, step, process, flow, sf1,
				task, _t2ns, sf2, _sf2f2, prevStep__step____next,
				process__task____flowElements, process__sf2____flowElements,
				flow__step____steps, sf1__task____targetRef,
				task__sf1____incoming, sf2__task____sourceRef,
				task__sf2____outgoing, _t2ns__task____source,
				_t2ns__step____target, _sf2f2__sf2____source,
				_sf2f2__flow____target };
	}

	public static final void pattern_Task2NormalStepSeq_1_5_expressionBBBBBBBBBBBBBB(
			Task2NormalStepSeq _this, PerformRuleResult ruleresult,
			EObject node, EObject prevStep, EObject _t2ps1, EObject step,
			EObject process, EObject flow, EObject sf1, EObject task,
			EObject _t2ns, EObject sf2, EObject _sf2f2, EObject _sf2f1) {
		_this.registerObjects_FWD(ruleresult, node, prevStep, _t2ps1, step,
				process, flow, sf1, task, _t2ns, sf2, _sf2f2, _sf2f1);

	}

	public static final PerformRuleResult pattern_Task2NormalStepSeq_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_1_blackFBB(
			EClass eClass, Task2NormalStepSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_2_1_binding = pattern_Task2NormalStepSeq_2_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2NormalStepSeq_2_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_2_1_black = pattern_Task2NormalStepSeq_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_Task2NormalStepSeq_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2NormalStepSeq_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2NormalStepSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_2_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("node");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("sf1");
		EObject _localVariable_3 = match.getObject("task");
		EObject _localVariable_4 = match.getObject("sf2");
		EObject tmpNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpSf1 = _localVariable_2;
		EObject tmpTask = _localVariable_3;
		EObject tmpSf2 = _localVariable_4;
		if (tmpNode instanceof Task) {
			Task node = (Task) tmpNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpSf1 instanceof SequenceFlow) {
					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						if (tmpSf2 instanceof SequenceFlow) {
							SequenceFlow sf2 = (SequenceFlow) tmpSf2;
							return new Object[] { node, process, sf1, task,
									sf2, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_2_2_blackBFFBFBBBFB(
			Task node, SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!node.equals(task)) {
			if (!sf1.equals(sf2)) {
				for (T2NS _t2ps1 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(node, T2NS.class, "source")) {
					NormalStep prevStep = _t2ps1.getTarget();
					if (prevStep != null) {
						for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(sf1, SF2F.class,
										"source")) {
							Flow flow = _sf2f1.getTarget();
							if (flow != null) {
								_result.add(new Object[] { node, prevStep,
										_t2ps1, process, flow, sf1, task, sf2,
										_sf2f1, match });
							}

						}
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_2_3_blackBBBBBBBBB(
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!node.equals(task)) {
			if (!sf1.equals(sf2)) {
				if (node.equals(_t2ps1.getSource())) {
					if (prevStep.equals(_t2ps1.getTarget())) {
						if (process.getFlowElements().contains(task)) {
							if (process.getFlowElements().contains(sf1)) {
								if (process.getFlowElements().contains(node)) {
									if (process.getFlowElements().contains(sf2)) {
										if (task.equals(sf1.getTargetRef())) {
											if (task.equals(sf2.getSourceRef())) {
												if (sf1.equals(_sf2f1
														.getSource())) {
													if (flow.equals(_sf2f1
															.getTarget())) {
														if (node.equals(sf1
																.getSourceRef())) {
															_result.add(new Object[] {
																	node,
																	prevStep,
																	_t2ps1,
																	process,
																	flow, sf1,
																	task, sf2,
																	_sf2f1 });
														}
													}
												}
											}
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

	public static final Object[] pattern_Task2NormalStepSeq_2_3_greenBBBBBBBBBFFFFFFFFFFFFFFF(
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge _t2ps1__node____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _t2ps1__prevStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf2__task____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__sf2____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f1__sf1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f1__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String _t2ps1__node____source_name_prime = "source";
		String _t2ps1__prevStep____target_name_prime = "target";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf2__task____sourceRef_name_prime = "sourceRef";
		String task__sf2____outgoing_name_prime = "outgoing";
		String _sf2f1__sf1____source_name_prime = "source";
		String _sf2f1__flow____target_name_prime = "target";
		String sf1__node____sourceRef_name_prime = "sourceRef";
		String node__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(_t2ps1);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(task);
		isApplicableMatch.getAllContextElements().add(sf2);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		_t2ps1__node____source.setSrc(_t2ps1);
		_t2ps1__node____source.setTrg(node);
		isApplicableMatch.getAllContextElements().add(_t2ps1__node____source);
		_t2ps1__prevStep____target.setSrc(_t2ps1);
		_t2ps1__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(
				_t2ps1__prevStep____target);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		isApplicableMatch.getAllContextElements().add(
				process__task____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(
				process__sf1____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(
				process__node____flowElements);
		process__sf2____flowElements.setSrc(process);
		process__sf2____flowElements.setTrg(sf2);
		isApplicableMatch.getAllContextElements().add(
				process__sf2____flowElements);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		isApplicableMatch.getAllContextElements().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(task__sf1____incoming);
		sf2__task____sourceRef.setSrc(sf2);
		sf2__task____sourceRef.setTrg(task);
		isApplicableMatch.getAllContextElements().add(sf2__task____sourceRef);
		task__sf2____outgoing.setSrc(task);
		task__sf2____outgoing.setTrg(sf2);
		isApplicableMatch.getAllContextElements().add(task__sf2____outgoing);
		_sf2f1__sf1____source.setSrc(_sf2f1);
		_sf2f1__sf1____source.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(_sf2f1__sf1____source);
		_sf2f1__flow____target.setSrc(_sf2f1);
		_sf2f1__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(_sf2f1__flow____target);
		sf1__node____sourceRef.setSrc(sf1);
		sf1__node____sourceRef.setTrg(node);
		isApplicableMatch.getAllContextElements().add(sf1__node____sourceRef);
		node__sf1____outgoing.setSrc(node);
		node__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(node__sf1____outgoing);
		_t2ps1__node____source.setName(_t2ps1__node____source_name_prime);
		_t2ps1__prevStep____target
				.setName(_t2ps1__prevStep____target_name_prime);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		process__sf1____flowElements
				.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements
				.setName(process__node____flowElements_name_prime);
		process__sf2____flowElements
				.setName(process__sf2____flowElements_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf2__task____sourceRef.setName(sf2__task____sourceRef_name_prime);
		task__sf2____outgoing.setName(task__sf2____outgoing_name_prime);
		_sf2f1__sf1____source.setName(_sf2f1__sf1____source_name_prime);
		_sf2f1__flow____target.setName(_sf2f1__flow____target_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		return new Object[] { node, prevStep, _t2ps1, process, flow, sf1, task,
				sf2, _sf2f1, isApplicableMatch, _t2ps1__node____source,
				_t2ps1__prevStep____target, process__task____flowElements,
				process__sf1____flowElements, process__node____flowElements,
				process__sf2____flowElements, sf1__task____targetRef,
				task__sf1____incoming, sf2__task____sourceRef,
				task__sf2____outgoing, _sf2f1__sf1____source,
				_sf2f1__flow____target, sf1__node____sourceRef,
				node__sf1____outgoing };
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_4_bindingFBBBBBBBBBBB(
			Task2NormalStepSeq _this, IsApplicableMatch isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, node, prevStep, _t2ps1, process, flow, sf1,
				task, sf2, _sf2f1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node,
					prevStep, _t2ps1, process, flow, sf1, task, sf2, _sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_4_bindingAndBlackFBBBBBBBBBBB(
			Task2NormalStepSeq _this, IsApplicableMatch isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1) {
		Object[] result_pattern_Task2NormalStepSeq_2_4_binding = pattern_Task2NormalStepSeq_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, node, prevStep, _t2ps1, process,
				flow, sf1, task, sf2, _sf2f1);
		if (result_pattern_Task2NormalStepSeq_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepSeq_2_4_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_2_4_black = pattern_Task2NormalStepSeq_2_4_blackB(csp);
			if (result_pattern_Task2NormalStepSeq_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node,
						prevStep, _t2ps1, process, flow, sf1, task, sf2, _sf2f1 };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepSeq_2_5_expressionFBB(
			Task2NormalStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepSeq_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2NormalStepSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2NormalStepSeq_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_10_1_blackBBBBB(
			Task2NormalStepSeq _this, Match match, NormalStep prevStep,
			NormalStep step, Flow flow) {
		if (!prevStep.equals(step)) {
			return new Object[] { _this, match, prevStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_10_2_bindingFBBBBB(
			Task2NormalStepSeq _this, Match match, NormalStep prevStep,
			NormalStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match,
				prevStep, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepSeq_10_2_bindingAndBlackFBBBBB(
			Task2NormalStepSeq _this, Match match, NormalStep prevStep,
			NormalStep step, Flow flow) {
		Object[] result_pattern_Task2NormalStepSeq_10_2_binding = pattern_Task2NormalStepSeq_10_2_bindingFBBBBB(
				_this, match, prevStep, step, flow);
		if (result_pattern_Task2NormalStepSeq_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepSeq_10_2_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_10_2_black = pattern_Task2NormalStepSeq_10_2_blackB(csp);
			if (result_pattern_Task2NormalStepSeq_10_2_black != null) {

				return new Object[] { csp, _this, match, prevStep, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepSeq_10_3_expressionFBB(
			Task2NormalStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_10_4_blackBBBB(
			Match match, NormalStep prevStep, NormalStep step, Flow flow) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, prevStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_10_4_greenBBBBFF(
			Match match, NormalStep prevStep, NormalStep step, Flow flow) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
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
		return new Object[] { match, prevStep, step, flow,
				prevStep__step____next, flow__step____steps };
	}

	public static final Object[] pattern_Task2NormalStepSeq_10_5_blackBBBB(
			Match match, NormalStep prevStep, NormalStep step, Flow flow) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, prevStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_10_5_greenBBB(
			Match match, NormalStep prevStep, Flow flow) {
		match.getContextNodes().add(prevStep);
		match.getContextNodes().add(flow);
		return new Object[] { match, prevStep, flow };
	}

	public static final void pattern_Task2NormalStepSeq_10_6_expressionBBBBB(
			Task2NormalStepSeq _this, Match match, NormalStep prevStep,
			NormalStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, prevStep, step, flow);

	}

	public static final boolean pattern_Task2NormalStepSeq_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("node");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("_t2ps1");
		EObject _localVariable_3 = isApplicableMatch.getObject("step");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("_sf2f1");
		EObject tmpNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmp_t2ps1 = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmp_sf2f1 = _localVariable_7;
		if (tmpNode instanceof Task) {
			Task node = (Task) tmpNode;
			if (tmpPrevStep instanceof NormalStep) {
				NormalStep prevStep = (NormalStep) tmpPrevStep;
				if (tmp_t2ps1 instanceof T2NS) {
					T2NS _t2ps1 = (T2NS) tmp_t2ps1;
					if (tmpStep instanceof NormalStep) {
						NormalStep step = (NormalStep) tmpStep;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmp_sf2f1 instanceof SF2F) {
										SF2F _sf2f1 = (SF2F) tmp_sf2f1;
										return new Object[] { node, prevStep,
												_t2ps1, step, process, flow,
												sf1, _sf2f1, isApplicableMatch };
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

	public static final Object[] pattern_Task2NormalStepSeq_11_1_blackBBBBBBBBBFB(
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1, Task2NormalStepSeq _this,
			IsApplicableMatch isApplicableMatch) {
		if (!prevStep.equals(step)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { node, prevStep, _t2ps1, step,
							process, flow, sf1, _sf2f1, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_11_1_bindingAndBlackFFFFFFFFBFB(
			Task2NormalStepSeq _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Task2NormalStepSeq_11_1_binding = pattern_Task2NormalStepSeq_11_1_bindingFFFFFFFFB(isApplicableMatch);
		if (result_pattern_Task2NormalStepSeq_11_1_binding != null) {
			Task node = (Task) result_pattern_Task2NormalStepSeq_11_1_binding[0];
			NormalStep prevStep = (NormalStep) result_pattern_Task2NormalStepSeq_11_1_binding[1];
			T2NS _t2ps1 = (T2NS) result_pattern_Task2NormalStepSeq_11_1_binding[2];
			NormalStep step = (NormalStep) result_pattern_Task2NormalStepSeq_11_1_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2NormalStepSeq_11_1_binding[4];
			Flow flow = (Flow) result_pattern_Task2NormalStepSeq_11_1_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2NormalStepSeq_11_1_binding[6];
			SF2F _sf2f1 = (SF2F) result_pattern_Task2NormalStepSeq_11_1_binding[7];

			Object[] result_pattern_Task2NormalStepSeq_11_1_black = pattern_Task2NormalStepSeq_11_1_blackBBBBBBBBBFB(
					node, prevStep, _t2ps1, step, process, flow, sf1, _sf2f1,
					_this, isApplicableMatch);
			if (result_pattern_Task2NormalStepSeq_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Task2NormalStepSeq_11_1_black[9];

				return new Object[] { node, prevStep, _t2ps1, step, process,
						flow, sf1, _sf2f1, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_11_1_greenBBBBFFFF(
			NormalStep step, SimpleBPMN.Process process, Flow flow,
			SequenceFlow sf1) {
		Task task = SimpleBPMNFactory.eINSTANCE.createTask();
		T2NS _t2ns = Bpmn2UseCaseFactory.eINSTANCE.createT2NS();
		SequenceFlow sf2 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		SF2F _sf2f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		process.getFlowElements().add(task);
		sf1.setTargetRef(task);
		_t2ns.setSource(task);
		_t2ns.setTarget(step);
		process.getFlowElements().add(sf2);
		sf2.setSourceRef(task);
		_sf2f2.setSource(sf2);
		_sf2f2.setTarget(flow);
		return new Object[] { step, process, flow, sf1, task, _t2ns, sf2,
				_sf2f2 };
	}

	public static final Object[] pattern_Task2NormalStepSeq_11_2_blackBBBBB(
			NormalStep step, Task task, T2NS _t2ns, SequenceFlow sf2,
			SF2F _sf2f2) {
		return new Object[] { step, task, _t2ns, sf2, _sf2f2 };
	}

	public static final Object[] pattern_Task2NormalStepSeq_11_2_greenFBBBBB(
			NormalStep step, Task task, T2NS _t2ns, SequenceFlow sf2,
			SF2F _sf2f2) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(task);
		ruleresult.getCreatedLinkElements().add(_t2ns);
		ruleresult.getCreatedElements().add(sf2);
		ruleresult.getCreatedLinkElements().add(_sf2f2);
		return new Object[] { ruleresult, step, task, _t2ns, sf2, _sf2f2 };
	}

	public static final Object[] pattern_Task2NormalStepSeq_11_3_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject node, EObject prevStep,
			EObject _t2ps1, EObject step, EObject process, EObject flow,
			EObject sf1, EObject task, EObject _t2ns, EObject sf2,
			EObject _sf2f2, EObject _sf2f1) {
		if (!node.equals(prevStep)) {
			if (!node.equals(step)) {
				if (!node.equals(process)) {
					if (!node.equals(sf1)) {
						if (!node.equals(task)) {
							if (!node.equals(sf2)) {
								if (!prevStep.equals(step)) {
									if (!prevStep.equals(process)) {
										if (!prevStep.equals(sf1)) {
											if (!prevStep.equals(task)) {
												if (!prevStep.equals(sf2)) {
													if (!_t2ps1.equals(node)) {
														if (!_t2ps1
																.equals(prevStep)) {
															if (!_t2ps1
																	.equals(step)) {
																if (!_t2ps1
																		.equals(process)) {
																	if (!_t2ps1
																			.equals(flow)) {
																		if (!_t2ps1
																				.equals(sf1)) {
																			if (!_t2ps1
																					.equals(task)) {
																				if (!_t2ps1
																						.equals(sf2)) {
																					if (!step
																							.equals(task)) {
																						if (!process
																								.equals(step)) {
																							if (!process
																									.equals(sf1)) {
																								if (!process
																										.equals(task)) {
																									if (!process
																											.equals(sf2)) {
																										if (!flow
																												.equals(node)) {
																											if (!flow
																													.equals(prevStep)) {
																												if (!flow
																														.equals(step)) {
																													if (!flow
																															.equals(process)) {
																														if (!flow
																																.equals(sf1)) {
																															if (!flow
																																	.equals(task)) {
																																if (!flow
																																		.equals(sf2)) {
																																	if (!sf1.equals(step)) {
																																		if (!sf1.equals(task)) {
																																			if (!sf1.equals(sf2)) {
																																				if (!_t2ns
																																						.equals(node)) {
																																					if (!_t2ns
																																							.equals(prevStep)) {
																																						if (!_t2ns
																																								.equals(_t2ps1)) {
																																							if (!_t2ns
																																									.equals(step)) {
																																								if (!_t2ns
																																										.equals(process)) {
																																									if (!_t2ns
																																											.equals(flow)) {
																																										if (!_t2ns
																																												.equals(sf1)) {
																																											if (!_t2ns
																																													.equals(task)) {
																																												if (!_t2ns
																																														.equals(sf2)) {
																																													if (!sf2.equals(step)) {
																																														if (!sf2.equals(task)) {
																																															if (!_sf2f2
																																																	.equals(node)) {
																																																if (!_sf2f2
																																																		.equals(prevStep)) {
																																																	if (!_sf2f2
																																																			.equals(_t2ps1)) {
																																																		if (!_sf2f2
																																																				.equals(step)) {
																																																			if (!_sf2f2
																																																					.equals(process)) {
																																																				if (!_sf2f2
																																																						.equals(flow)) {
																																																					if (!_sf2f2
																																																							.equals(sf1)) {
																																																						if (!_sf2f2
																																																								.equals(task)) {
																																																							if (!_sf2f2
																																																									.equals(_t2ns)) {
																																																								if (!_sf2f2
																																																										.equals(sf2)) {
																																																									if (!_sf2f1
																																																											.equals(node)) {
																																																										if (!_sf2f1
																																																												.equals(prevStep)) {
																																																											if (!_sf2f1
																																																													.equals(_t2ps1)) {
																																																												if (!_sf2f1
																																																														.equals(step)) {
																																																													if (!_sf2f1
																																																															.equals(process)) {
																																																														if (!_sf2f1
																																																																.equals(flow)) {
																																																															if (!_sf2f1
																																																																	.equals(sf1)) {
																																																																if (!_sf2f1
																																																																		.equals(task)) {
																																																																	if (!_sf2f1
																																																																			.equals(_t2ns)) {
																																																																		if (!_sf2f1
																																																																				.equals(sf2)) {
																																																																			if (!_sf2f1
																																																																					.equals(_sf2f2)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						node,
																																																																						prevStep,
																																																																						_t2ps1,
																																																																						step,
																																																																						process,
																																																																						flow,
																																																																						sf1,
																																																																						task,
																																																																						_t2ns,
																																																																						sf2,
																																																																						_sf2f2,
																																																																						_sf2f1 };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Task2NormalStepSeq_11_3_greenBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevStep, EObject step,
			EObject process, EObject flow, EObject sf1, EObject task,
			EObject _t2ns, EObject sf2, EObject _sf2f2) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__task____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sf2____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__task____targetRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__sf1____incoming = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf2__task____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge task__sf2____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _t2ns__task____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _t2ns__step____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f2__sf2____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f2__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Task2NormalStepSeq";
		String prevStep__step____next_name_prime = "next";
		String process__task____flowElements_name_prime = "flowElements";
		String process__sf2____flowElements_name_prime = "flowElements";
		String flow__step____steps_name_prime = "steps";
		String sf1__task____targetRef_name_prime = "targetRef";
		String task__sf1____incoming_name_prime = "incoming";
		String sf2__task____sourceRef_name_prime = "sourceRef";
		String task__sf2____outgoing_name_prime = "outgoing";
		String _t2ns__task____source_name_prime = "source";
		String _t2ns__step____target_name_prime = "target";
		String _sf2f2__sf2____source_name_prime = "source";
		String _sf2f2__flow____target_name_prime = "target";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(prevStep__step____next);
		process__task____flowElements.setSrc(process);
		process__task____flowElements.setTrg(task);
		ruleresult.getCreatedEdges().add(process__task____flowElements);
		process__sf2____flowElements.setSrc(process);
		process__sf2____flowElements.setTrg(sf2);
		ruleresult.getCreatedEdges().add(process__sf2____flowElements);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		sf1__task____targetRef.setSrc(sf1);
		sf1__task____targetRef.setTrg(task);
		ruleresult.getCreatedEdges().add(sf1__task____targetRef);
		task__sf1____incoming.setSrc(task);
		task__sf1____incoming.setTrg(sf1);
		ruleresult.getCreatedEdges().add(task__sf1____incoming);
		sf2__task____sourceRef.setSrc(sf2);
		sf2__task____sourceRef.setTrg(task);
		ruleresult.getCreatedEdges().add(sf2__task____sourceRef);
		task__sf2____outgoing.setSrc(task);
		task__sf2____outgoing.setTrg(sf2);
		ruleresult.getCreatedEdges().add(task__sf2____outgoing);
		_t2ns__task____source.setSrc(_t2ns);
		_t2ns__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(_t2ns__task____source);
		_t2ns__step____target.setSrc(_t2ns);
		_t2ns__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(_t2ns__step____target);
		_sf2f2__sf2____source.setSrc(_sf2f2);
		_sf2f2__sf2____source.setTrg(sf2);
		ruleresult.getCreatedEdges().add(_sf2f2__sf2____source);
		_sf2f2__flow____target.setSrc(_sf2f2);
		_sf2f2__flow____target.setTrg(flow);
		ruleresult.getCreatedEdges().add(_sf2f2__flow____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		process__task____flowElements
				.setName(process__task____flowElements_name_prime);
		process__sf2____flowElements
				.setName(process__sf2____flowElements_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		sf1__task____targetRef.setName(sf1__task____targetRef_name_prime);
		task__sf1____incoming.setName(task__sf1____incoming_name_prime);
		sf2__task____sourceRef.setName(sf2__task____sourceRef_name_prime);
		task__sf2____outgoing.setName(task__sf2____outgoing_name_prime);
		_t2ns__task____source.setName(_t2ns__task____source_name_prime);
		_t2ns__step____target.setName(_t2ns__step____target_name_prime);
		_sf2f2__sf2____source.setName(_sf2f2__sf2____source_name_prime);
		_sf2f2__flow____target.setName(_sf2f2__flow____target_name_prime);
		return new Object[] { ruleresult, prevStep, step, process, flow, sf1,
				task, _t2ns, sf2, _sf2f2, prevStep__step____next,
				process__task____flowElements, process__sf2____flowElements,
				flow__step____steps, sf1__task____targetRef,
				task__sf1____incoming, sf2__task____sourceRef,
				task__sf2____outgoing, _t2ns__task____source,
				_t2ns__step____target, _sf2f2__sf2____source,
				_sf2f2__flow____target };
	}

	public static final void pattern_Task2NormalStepSeq_11_5_expressionBBBBBBBBBBBBBB(
			Task2NormalStepSeq _this, PerformRuleResult ruleresult,
			EObject node, EObject prevStep, EObject _t2ps1, EObject step,
			EObject process, EObject flow, EObject sf1, EObject task,
			EObject _t2ns, EObject sf2, EObject _sf2f2, EObject _sf2f1) {
		_this.registerObjects_BWD(ruleresult, node, prevStep, _t2ps1, step,
				process, flow, sf1, task, _t2ns, sf2, _sf2f2, _sf2f1);

	}

	public static final PerformRuleResult pattern_Task2NormalStepSeq_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_1_blackFBB(
			EClass eClass, Task2NormalStepSeq _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_12_1_binding = pattern_Task2NormalStepSeq_12_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Task2NormalStepSeq_12_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_12_1_black = pattern_Task2NormalStepSeq_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_Task2NormalStepSeq_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Task2NormalStepSeq_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Task2NormalStepSeq";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_2_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("prevStep");
		EObject _localVariable_1 = match.getObject("step");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpPrevStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpPrevStep instanceof NormalStep) {
			NormalStep prevStep = (NormalStep) tmpPrevStep;
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { prevStep, step, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_12_2_blackFBFBBFFB(
			NormalStep prevStep, NormalStep step, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			for (T2NS _t2ps1 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(prevStep, T2NS.class, "target")) {
				Task node = _t2ps1.getSource();
				if (node != null) {
					for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(flow, SF2F.class,
									"target")) {
						SequenceFlow sf1 = _sf2f1.getSource();
						if (sf1 != null) {
							_result.add(new Object[] { node, prevStep, _t2ps1,
									step, flow, sf1, _sf2f1, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_12_3_blackBBBBFBBB(
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			Flow flow, SequenceFlow sf1, SF2F _sf2f1) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			if (step.equals(prevStep.getNext())) {
				if (node.equals(_t2ps1.getSource())) {
					if (prevStep.equals(_t2ps1.getTarget())) {
						if (flow.getSteps().contains(step)) {
							if (sf1.equals(_sf2f1.getSource())) {
								if (flow.equals(_sf2f1.getTarget())) {
									if (node.equals(sf1.getSourceRef())) {
										for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														sf1,
														SimpleBPMN.Process.class,
														"flowElements")) {
											if (process.getFlowElements()
													.contains(node)) {
												_result.add(new Object[] {
														node, prevStep, _t2ps1,
														step, process, flow,
														sf1, _sf2f1 });
											}
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

	public static final Object[] pattern_Task2NormalStepSeq_12_3_greenBBBBBBBBFFFFFFFFFFF(
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _t2ps1__node____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _t2ps1__prevStep____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge process__node____flowElements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f1__sf1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _sf2f1__flow____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sf1__node____sourceRef = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge node__sf1____outgoing = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String prevStep__step____next_name_prime = "next";
		String _t2ps1__node____source_name_prime = "source";
		String _t2ps1__prevStep____target_name_prime = "target";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__node____flowElements_name_prime = "flowElements";
		String flow__step____steps_name_prime = "steps";
		String _sf2f1__sf1____source_name_prime = "source";
		String _sf2f1__flow____target_name_prime = "target";
		String sf1__node____sourceRef_name_prime = "sourceRef";
		String node__sf1____outgoing_name_prime = "outgoing";
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(_t2ps1);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(prevStep__step____next);
		_t2ps1__node____source.setSrc(_t2ps1);
		_t2ps1__node____source.setTrg(node);
		isApplicableMatch.getAllContextElements().add(_t2ps1__node____source);
		_t2ps1__prevStep____target.setSrc(_t2ps1);
		_t2ps1__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(
				_t2ps1__prevStep____target);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(
				process__sf1____flowElements);
		process__node____flowElements.setSrc(process);
		process__node____flowElements.setTrg(node);
		isApplicableMatch.getAllContextElements().add(
				process__node____flowElements);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		_sf2f1__sf1____source.setSrc(_sf2f1);
		_sf2f1__sf1____source.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(_sf2f1__sf1____source);
		_sf2f1__flow____target.setSrc(_sf2f1);
		_sf2f1__flow____target.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(_sf2f1__flow____target);
		sf1__node____sourceRef.setSrc(sf1);
		sf1__node____sourceRef.setTrg(node);
		isApplicableMatch.getAllContextElements().add(sf1__node____sourceRef);
		node__sf1____outgoing.setSrc(node);
		node__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(node__sf1____outgoing);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		_t2ps1__node____source.setName(_t2ps1__node____source_name_prime);
		_t2ps1__prevStep____target
				.setName(_t2ps1__prevStep____target_name_prime);
		process__sf1____flowElements
				.setName(process__sf1____flowElements_name_prime);
		process__node____flowElements
				.setName(process__node____flowElements_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		_sf2f1__sf1____source.setName(_sf2f1__sf1____source_name_prime);
		_sf2f1__flow____target.setName(_sf2f1__flow____target_name_prime);
		sf1__node____sourceRef.setName(sf1__node____sourceRef_name_prime);
		node__sf1____outgoing.setName(node__sf1____outgoing_name_prime);
		return new Object[] { node, prevStep, _t2ps1, step, process, flow, sf1,
				_sf2f1, isApplicableMatch, prevStep__step____next,
				_t2ps1__node____source, _t2ps1__prevStep____target,
				process__sf1____flowElements, process__node____flowElements,
				flow__step____steps, _sf2f1__sf1____source,
				_sf2f1__flow____target, sf1__node____sourceRef,
				node__sf1____outgoing };
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_4_bindingFBBBBBBBBBB(
			Task2NormalStepSeq _this, IsApplicableMatch isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, node, prevStep, _t2ps1, step, process, flow,
				sf1, _sf2f1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node,
					prevStep, _t2ps1, step, process, flow, sf1, _sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_4_bindingAndBlackFBBBBBBBBBB(
			Task2NormalStepSeq _this, IsApplicableMatch isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1) {
		Object[] result_pattern_Task2NormalStepSeq_12_4_binding = pattern_Task2NormalStepSeq_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, node, prevStep, _t2ps1, step,
				process, flow, sf1, _sf2f1);
		if (result_pattern_Task2NormalStepSeq_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepSeq_12_4_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_12_4_black = pattern_Task2NormalStepSeq_12_4_blackB(csp);
			if (result_pattern_Task2NormalStepSeq_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node,
						prevStep, _t2ps1, step, process, flow, sf1, _sf2f1 };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepSeq_12_5_expressionFBB(
			Task2NormalStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepSeq_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2NormalStepSeq";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2NormalStepSeq_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_20_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_20_1_blackFBB(
			EClass __eClass, Task2NormalStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_20_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_20_1_binding = pattern_Task2NormalStepSeq_20_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepSeq_20_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_20_1_black = pattern_Task2NormalStepSeq_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepSeq_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepSeq_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_20_2_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof NormalStep) {
			NormalStep prevStep = (NormalStep) tmpPrevStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (!prevStep.equals(step)) {
					if (step.equals(prevStep.getNext())) {
						for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(step, Flow.class,
										"steps")) {
							_result.add(new Object[] { prevStep, step, flow,
									_edge_next });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepSeq_20_3_expressionFBBBBB(
			Task2NormalStepSeq _this, Match match, NormalStep prevStep,
			NormalStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep,
				step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_20_4_expressionFBB(
			Task2NormalStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepSeq_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_21_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_21_1_blackFBB(
			EClass __eClass, Task2NormalStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_21_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_21_1_binding = pattern_Task2NormalStepSeq_21_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepSeq_21_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_21_1_black = pattern_Task2NormalStepSeq_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepSeq_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepSeq_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_21_2_black_nac_0BB(
			SequenceFlow sf2, Task task) {
		if (task.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_21_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpTask = _edge_flowElements.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (process.getFlowElements().contains(task)) {
					for (FlowElement tmpSf1 : process.getFlowElements()) {
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (task.equals(sf1.getTargetRef())) {
								FlowNode tmpNode = sf1.getSourceRef();
								if (tmpNode instanceof Task) {
									Task node = (Task) tmpNode;
									if (!node.equals(task)) {
										if (process.getFlowElements().contains(
												node)) {
											for (FlowElement tmpSf2 : process
													.getFlowElements()) {
												if (tmpSf2 instanceof SequenceFlow) {
													SequenceFlow sf2 = (SequenceFlow) tmpSf2;
													if (!sf1.equals(sf2)) {
														if (task.equals(sf2
																.getSourceRef())) {
															if (pattern_Task2NormalStepSeq_21_2_black_nac_0BB(
																	sf2, task) == null) {
																_result.add(new Object[] {
																		node,
																		process,
																		sf1,
																		task,
																		sf2,
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

	public static final Object[] pattern_Task2NormalStepSeq_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepSeq_21_3_expressionFBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node,
				process, sf1, task, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_21_4_expressionFBB(
			Task2NormalStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepSeq_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_22_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_22_1_blackFBB(
			EClass __eClass, Task2NormalStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_22_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_22_1_binding = pattern_Task2NormalStepSeq_22_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepSeq_22_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_22_1_black = pattern_Task2NormalStepSeq_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepSeq_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepSeq_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_22_2_black_nac_0BB(
			SequenceFlow sf2, Task task) {
		if (task.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_22_2_blackFFFFFB(
			EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
			EObject tmpSf2 = _edge_flowElements.getTrg();
			if (tmpSf2 instanceof SequenceFlow) {
				SequenceFlow sf2 = (SequenceFlow) tmpSf2;
				if (process.getFlowElements().contains(sf2)) {
					FlowNode tmpTask = sf2.getSourceRef();
					if (tmpTask instanceof Task) {
						Task task = (Task) tmpTask;
						if (process.getFlowElements().contains(task)) {
							if (pattern_Task2NormalStepSeq_22_2_black_nac_0BB(
									sf2, task) == null) {
								for (FlowElement tmpSf1 : process
										.getFlowElements()) {
									if (tmpSf1 instanceof SequenceFlow) {
										SequenceFlow sf1 = (SequenceFlow) tmpSf1;
										if (!sf1.equals(sf2)) {
											if (task.equals(sf1.getTargetRef())) {
												FlowNode tmpNode = sf1
														.getSourceRef();
												if (tmpNode instanceof Task) {
													Task node = (Task) tmpNode;
													if (!node.equals(task)) {
														if (process
																.getFlowElements()
																.contains(node)) {
															_result.add(new Object[] {
																	node,
																	process,
																	sf1, task,
																	sf2,
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

	public static final Object[] pattern_Task2NormalStepSeq_22_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepSeq_22_3_expressionFBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node,
				process, sf1, task, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_22_4_expressionFBB(
			Task2NormalStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_22_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_22_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepSeq_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_23_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_23_1_blackFBB(
			EClass __eClass, Task2NormalStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_23_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_23_1_binding = pattern_Task2NormalStepSeq_23_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepSeq_23_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_23_1_black = pattern_Task2NormalStepSeq_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepSeq_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepSeq_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_23_2_blackFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					for (Step tmpPrevStep : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(step, Step.class, "next")) {
						if (tmpPrevStep instanceof NormalStep) {
							NormalStep prevStep = (NormalStep) tmpPrevStep;
							if (!prevStep.equals(step)) {
								_result.add(new Object[] { prevStep, step,
										flow, _edge_steps });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_23_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepSeq_23_3_expressionFBBBBB(
			Task2NormalStepSeq _this, Match match, NormalStep prevStep,
			NormalStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep,
				step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_23_4_expressionFBB(
			Task2NormalStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_23_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_23_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepSeq_23_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_24_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_24_1_blackFBB(
			EClass __eClass, Task2NormalStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_24_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_24_1_binding = pattern_Task2NormalStepSeq_24_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepSeq_24_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_24_1_black = pattern_Task2NormalStepSeq_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepSeq_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepSeq_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_24_2_black_nac_0BB(
			SequenceFlow sf2, Task task) {
		if (task.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_24_2_blackFFFFFB(
			EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpTask = _edge_targetRef.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (task.equals(sf1.getTargetRef())) {
					FlowNode tmpNode = sf1.getSourceRef();
					if (tmpNode instanceof Task) {
						Task node = (Task) tmpNode;
						if (!node.equals(task)) {
							for (SequenceFlow sf2 : task.getOutgoing()) {
								if (!sf1.equals(sf2)) {
									if (pattern_Task2NormalStepSeq_24_2_black_nac_0BB(
											sf2, task) == null) {
										for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														sf1,
														SimpleBPMN.Process.class,
														"flowElements")) {
											if (process.getFlowElements()
													.contains(task)) {
												if (process.getFlowElements()
														.contains(node)) {
													if (process
															.getFlowElements()
															.contains(sf2)) {
														_result.add(new Object[] {
																node, process,
																sf1, task, sf2,
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

	public static final Object[] pattern_Task2NormalStepSeq_24_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepSeq_24_3_expressionFBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node,
				process, sf1, task, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_24_4_expressionFBB(
			Task2NormalStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_24_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_24_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepSeq_24_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_25_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_25_1_blackFBB(
			EClass __eClass, Task2NormalStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_25_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_25_1_binding = pattern_Task2NormalStepSeq_25_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepSeq_25_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_25_1_black = pattern_Task2NormalStepSeq_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepSeq_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepSeq_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_25_2_black_nac_0BB(
			SequenceFlow sf2, Task task) {
		if (task.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_25_2_blackFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_incoming.getSrc();
		if (tmpTask instanceof Task) {
			Task task = (Task) tmpTask;
			EObject tmpSf1 = _edge_incoming.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (task.equals(sf1.getTargetRef())) {
					FlowNode tmpNode = sf1.getSourceRef();
					if (tmpNode instanceof Task) {
						Task node = (Task) tmpNode;
						if (!node.equals(task)) {
							for (SequenceFlow sf2 : task.getOutgoing()) {
								if (!sf1.equals(sf2)) {
									if (pattern_Task2NormalStepSeq_25_2_black_nac_0BB(
											sf2, task) == null) {
										for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														task,
														SimpleBPMN.Process.class,
														"flowElements")) {
											if (process.getFlowElements()
													.contains(sf1)) {
												if (process.getFlowElements()
														.contains(node)) {
													if (process
															.getFlowElements()
															.contains(sf2)) {
														_result.add(new Object[] {
																node, process,
																sf1, task, sf2,
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

	public static final Object[] pattern_Task2NormalStepSeq_25_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepSeq_25_3_expressionFBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node,
				process, sf1, task, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_25_4_expressionFBB(
			Task2NormalStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_25_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_25_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepSeq_25_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_26_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_26_1_blackFBB(
			EClass __eClass, Task2NormalStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_26_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_26_1_binding = pattern_Task2NormalStepSeq_26_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepSeq_26_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_26_1_black = pattern_Task2NormalStepSeq_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepSeq_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepSeq_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_26_2_black_nac_0BB(
			SequenceFlow sf2, Task task) {
		if (task.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_26_2_blackFFFFFB(
			EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf2 = _edge_sourceRef.getSrc();
		if (tmpSf2 instanceof SequenceFlow) {
			SequenceFlow sf2 = (SequenceFlow) tmpSf2;
			EObject tmpTask = _edge_sourceRef.getTrg();
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				if (task.equals(sf2.getSourceRef())) {
					if (pattern_Task2NormalStepSeq_26_2_black_nac_0BB(sf2, task) == null) {
						for (SequenceFlow sf1 : task.getIncoming()) {
							if (!sf1.equals(sf2)) {
								FlowNode tmpNode = sf1.getSourceRef();
								if (tmpNode instanceof Task) {
									Task node = (Task) tmpNode;
									if (!node.equals(task)) {
										for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														sf2,
														SimpleBPMN.Process.class,
														"flowElements")) {
											if (process.getFlowElements()
													.contains(task)) {
												if (process.getFlowElements()
														.contains(sf1)) {
													if (process
															.getFlowElements()
															.contains(node)) {
														_result.add(new Object[] {
																node, process,
																sf1, task, sf2,
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

	public static final Object[] pattern_Task2NormalStepSeq_26_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepSeq_26_3_expressionFBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node,
				process, sf1, task, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_26_4_expressionFBB(
			Task2NormalStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_26_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_26_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepSeq_26_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_27_1_bindingFB(
			Task2NormalStepSeq _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_27_1_blackFBB(
			EClass __eClass, Task2NormalStepSeq _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_27_1_bindingAndBlackFFB(
			Task2NormalStepSeq _this) {
		Object[] result_pattern_Task2NormalStepSeq_27_1_binding = pattern_Task2NormalStepSeq_27_1_bindingFB(_this);
		if (result_pattern_Task2NormalStepSeq_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Task2NormalStepSeq_27_1_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_27_1_black = pattern_Task2NormalStepSeq_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Task2NormalStepSeq_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Task2NormalStepSeq_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_27_2_black_nac_0BB(
			SequenceFlow sf2, Task task) {
		if (task.equals(sf2.getTargetRef())) {
			return new Object[] { sf2, task };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_27_2_blackFFFFFB(
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_outgoing.getSrc();
		if (tmpTask instanceof Task) {
			Task task = (Task) tmpTask;
			EObject tmpSf2 = _edge_outgoing.getTrg();
			if (tmpSf2 instanceof SequenceFlow) {
				SequenceFlow sf2 = (SequenceFlow) tmpSf2;
				if (task.equals(sf2.getSourceRef())) {
					if (pattern_Task2NormalStepSeq_27_2_black_nac_0BB(sf2, task) == null) {
						for (SequenceFlow sf1 : task.getIncoming()) {
							if (!sf1.equals(sf2)) {
								FlowNode tmpNode = sf1.getSourceRef();
								if (tmpNode instanceof Task) {
									Task node = (Task) tmpNode;
									if (!node.equals(task)) {
										for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(
														task,
														SimpleBPMN.Process.class,
														"flowElements")) {
											if (process.getFlowElements()
													.contains(sf1)) {
												if (process.getFlowElements()
														.contains(node)) {
													if (process
															.getFlowElements()
															.contains(sf2)) {
														_result.add(new Object[] {
																node, process,
																sf1, task, sf2,
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

	public static final Object[] pattern_Task2NormalStepSeq_27_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Task2NormalStepSeq_27_3_expressionFBBBBBBB(
			Task2NormalStepSeq _this, Match match, Task node,
			SimpleBPMN.Process process, SequenceFlow sf1, Task task,
			SequenceFlow sf2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, node,
				process, sf1, task, sf2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Task2NormalStepSeq_27_4_expressionFBB(
			Task2NormalStepSeq _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_27_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_27_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Task2NormalStepSeq_27_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_30_1_blackB(
			Task2NormalStepSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Task2NormalStepSeq_30_1_greenF() {
		IsApplicableRuleResult result = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Task2NormalStepSeq_30_2_bindingFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("node");
		EObject _localVariable_1 = targetMatch.getObject("prevStep");
		EObject _localVariable_2 = targetMatch.getObject("step");
		EObject _localVariable_3 = sourceMatch.getObject("process");
		EObject _localVariable_4 = targetMatch.getObject("flow");
		EObject _localVariable_5 = sourceMatch.getObject("sf1");
		EObject _localVariable_6 = sourceMatch.getObject("task");
		EObject _localVariable_7 = sourceMatch.getObject("sf2");
		EObject tmpNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpStep = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpSf1 = _localVariable_5;
		EObject tmpTask = _localVariable_6;
		EObject tmpSf2 = _localVariable_7;
		if (tmpNode instanceof Task) {
			Task node = (Task) tmpNode;
			if (tmpPrevStep instanceof NormalStep) {
				NormalStep prevStep = (NormalStep) tmpPrevStep;
				if (tmpStep instanceof NormalStep) {
					NormalStep step = (NormalStep) tmpStep;
					if (tmpProcess instanceof SimpleBPMN.Process) {
						SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpSf1 instanceof SequenceFlow) {
								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
								if (tmpTask instanceof Task) {
									Task task = (Task) tmpTask;
									if (tmpSf2 instanceof SequenceFlow) {
										SequenceFlow sf2 = (SequenceFlow) tmpSf2;
										return new Object[] { node, prevStep,
												step, process, flow, sf1, task,
												sf2, sourceMatch, targetMatch };
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

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_30_2_blackBBFBBBBBBFBB(
			Task node, NormalStep prevStep, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!node.equals(task)) {
			if (!prevStep.equals(step)) {
				if (!sf1.equals(sf2)) {
					if (!sourceMatch.equals(targetMatch)) {
						if (step.equals(prevStep.getNext())) {
							if (process.getFlowElements().contains(task)) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements()
											.contains(node)) {
										if (process.getFlowElements().contains(
												sf2)) {
											if (flow.getSteps().contains(step)) {
												if (task.equals(sf1
														.getTargetRef())) {
													if (task.equals(sf2
															.getSourceRef())) {
														if (node.equals(sf1
																.getSourceRef())) {
															for (T2NS _t2ps1 : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			node,
																			T2NS.class,
																			"source")) {
																if (prevStep
																		.equals(_t2ps1
																				.getTarget())) {
																	for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(
																					sf1,
																					SF2F.class,
																					"source")) {
																		if (flow.equals(_sf2f1
																				.getTarget())) {
																			_result.add(new Object[] {
																					node,
																					prevStep,
																					_t2ps1,
																					step,
																					process,
																					flow,
																					sf1,
																					task,
																					sf2,
																					_sf2f1,
																					sourceMatch,
																					targetMatch });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Task2NormalStepSeq_30_2_greenBBBBBBBBBBBFB(
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1, Match sourceMatch, Match targetMatch) {
		IsApplicableMatchCC isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatchCC();
		String isApplicableMatch_ruleName_prime = "Task2NormalStepSeq";
		isApplicableMatch.setSourceMatch(sourceMatch);
		isApplicableMatch.setTargetMatch(targetMatch);
		isApplicableMatch.getAllContextElements().add(node);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(task);
		isApplicableMatch.getAllContextElements().add(sf2);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(_t2ps1);
		isApplicableMatch.getAllContextElements().add(_sf2f1);
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { node, prevStep, _t2ps1, step, process, flow, sf1,
				task, sf2, _sf2f1, sourceMatch, isApplicableMatch, targetMatch };
	}

	public static final Object[] pattern_Task2NormalStepSeq_30_3_bindingFBBBBBBBBBBBBBB(
			Task2NormalStepSeq _this, IsApplicableMatchCC isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_CC(
				isApplicableMatch, node, prevStep, _t2ps1, step, process, flow,
				sf1, task, sf2, _sf2f1, sourceMatch, targetMatch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node,
					prevStep, _t2ps1, step, process, flow, sf1, task, sf2,
					_sf2f1, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_30_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepSeq_30_3_bindingAndBlackFBBBBBBBBBBBBBB(
			Task2NormalStepSeq _this, IsApplicableMatchCC isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Task2NormalStepSeq_30_3_binding = pattern_Task2NormalStepSeq_30_3_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, node, prevStep, _t2ps1, step,
				process, flow, sf1, task, sf2, _sf2f1, sourceMatch, targetMatch);
		if (result_pattern_Task2NormalStepSeq_30_3_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepSeq_30_3_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_30_3_black = pattern_Task2NormalStepSeq_30_3_blackB(csp);
			if (result_pattern_Task2NormalStepSeq_30_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node,
						prevStep, _t2ps1, step, process, flow, sf1, task, sf2,
						_sf2f1, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_30_4_blackBB(
			IsApplicableRuleResult result, IsApplicableMatch isApplicableMatch) {
		return new Object[] { result, isApplicableMatch };
	}

	public static final Object[] pattern_Task2NormalStepSeq_30_4_greenBB(
			IsApplicableRuleResult result, IsApplicableMatch isApplicableMatch) {
		result.getIsApplicableMatch().add(isApplicableMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Task2NormalStepSeq";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { result, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Task2NormalStepSeq_30_5_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_33_1_blackB(
			Task2NormalStepSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Task2NormalStepSeq_33_2_bindingFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("node");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("_t2ps1");
		EObject _localVariable_3 = isApplicableMatch.getObject("step");
		EObject _localVariable_4 = isApplicableMatch.getObject("process");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("task");
		EObject _localVariable_8 = isApplicableMatch.getObject("sf2");
		EObject _localVariable_9 = isApplicableMatch.getObject("_sf2f1");
		EObject tmpNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmp_t2ps1 = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpProcess = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpTask = _localVariable_7;
		EObject tmpSf2 = _localVariable_8;
		EObject tmp_sf2f1 = _localVariable_9;
		if (tmpNode instanceof Task) {
			Task node = (Task) tmpNode;
			if (tmpPrevStep instanceof NormalStep) {
				NormalStep prevStep = (NormalStep) tmpPrevStep;
				if (tmp_t2ps1 instanceof T2NS) {
					T2NS _t2ps1 = (T2NS) tmp_t2ps1;
					if (tmpStep instanceof NormalStep) {
						NormalStep step = (NormalStep) tmpStep;
						if (tmpProcess instanceof SimpleBPMN.Process) {
							SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmpTask instanceof Task) {
										Task task = (Task) tmpTask;
										if (tmpSf2 instanceof SequenceFlow) {
											SequenceFlow sf2 = (SequenceFlow) tmpSf2;
											if (tmp_sf2f1 instanceof SF2F) {
												SF2F _sf2f1 = (SF2F) tmp_sf2f1;
												return new Object[] { node,
														prevStep, _t2ps1, step,
														process, flow, sf1,
														task, sf2, _sf2f1,
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
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_33_2_blackBBBBBBBBBBB(
			Task node, NormalStep prevStep, T2NS _t2ps1, NormalStep step,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, Task task,
			SequenceFlow sf2, SF2F _sf2f1, IsApplicableMatchCC isApplicableMatch) {
		if (!node.equals(task)) {
			if (!prevStep.equals(step)) {
				if (!sf1.equals(sf2)) {
					if (step.equals(prevStep.getNext())) {
						if (node.equals(_t2ps1.getSource())) {
							if (prevStep.equals(_t2ps1.getTarget())) {
								if (process.getFlowElements().contains(task)) {
									if (process.getFlowElements().contains(sf1)) {
										if (process.getFlowElements().contains(
												node)) {
											if (process.getFlowElements()
													.contains(sf2)) {
												if (flow.getSteps().contains(
														step)) {
													if (task.equals(sf1
															.getTargetRef())) {
														if (task.equals(sf2
																.getSourceRef())) {
															if (sf1.equals(_sf2f1
																	.getSource())) {
																if (flow.equals(_sf2f1
																		.getTarget())) {
																	if (node.equals(sf1
																			.getSourceRef())) {
																		return new Object[] {
																				node,
																				prevStep,
																				_t2ps1,
																				step,
																				process,
																				flow,
																				sf1,
																				task,
																				sf2,
																				_sf2f1,
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
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_33_2_bindingAndBlackFFFFFFFFFFB(
			IsApplicableMatchCC isApplicableMatch) {
		Object[] result_pattern_Task2NormalStepSeq_33_2_binding = pattern_Task2NormalStepSeq_33_2_bindingFFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_Task2NormalStepSeq_33_2_binding != null) {
			Task node = (Task) result_pattern_Task2NormalStepSeq_33_2_binding[0];
			NormalStep prevStep = (NormalStep) result_pattern_Task2NormalStepSeq_33_2_binding[1];
			T2NS _t2ps1 = (T2NS) result_pattern_Task2NormalStepSeq_33_2_binding[2];
			NormalStep step = (NormalStep) result_pattern_Task2NormalStepSeq_33_2_binding[3];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_Task2NormalStepSeq_33_2_binding[4];
			Flow flow = (Flow) result_pattern_Task2NormalStepSeq_33_2_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_Task2NormalStepSeq_33_2_binding[6];
			Task task = (Task) result_pattern_Task2NormalStepSeq_33_2_binding[7];
			SequenceFlow sf2 = (SequenceFlow) result_pattern_Task2NormalStepSeq_33_2_binding[8];
			SF2F _sf2f1 = (SF2F) result_pattern_Task2NormalStepSeq_33_2_binding[9];

			Object[] result_pattern_Task2NormalStepSeq_33_2_black = pattern_Task2NormalStepSeq_33_2_blackBBBBBBBBBBB(
					node, prevStep, _t2ps1, step, process, flow, sf1, task,
					sf2, _sf2f1, isApplicableMatch);
			if (result_pattern_Task2NormalStepSeq_33_2_black != null) {

				return new Object[] { node, prevStep, _t2ps1, step, process,
						flow, sf1, task, sf2, _sf2f1, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_33_2_greenBBBBFFF(
			NormalStep step, Flow flow, Task task, SequenceFlow sf2) {
		PerformRuleResult result = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		T2NS _t2ns = Bpmn2UseCaseFactory.eINSTANCE.createT2NS();
		SF2F _sf2f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		result.getCreatedElements().add(_t2ns);
		_t2ns.setSource(task);
		_t2ns.setTarget(step);
		result.getCreatedElements().add(_sf2f2);
		_sf2f2.setSource(sf2);
		_sf2f2.setTarget(flow);
		return new Object[] { step, flow, task, sf2, result, _t2ns, _sf2f2 };
	}

	public static final PerformRuleResult pattern_Task2NormalStepSeq_33_3_expressionFB(
			PerformRuleResult result) {
		PerformRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_1_blackB(
			Task2NormalStepSeq _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Task node) {
		if (ruleResult.getSourceObjects().contains(node)) {
			return new Object[] { ruleResult, node };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, T2NS _t2ps1) {
		if (ruleResult.getCorrObjects().contains(_t2ps1)) {
			return new Object[] { ruleResult, _t2ps1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, NormalStep prevStep) {
		if (ruleResult.getTargetObjects().contains(prevStep)) {
			return new Object[] { ruleResult, prevStep };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SimpleBPMN.Process process) {
		if (ruleResult.getSourceObjects().contains(process)) {
			return new Object[] { ruleResult, process };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, SequenceFlow sf1) {
		if (ruleResult.getSourceObjects().contains(sf1)) {
			return new Object[] { ruleResult, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, SF2F _sf2f1) {
		if (ruleResult.getCorrObjects().contains(_sf2f1)) {
			return new Object[] { ruleResult, _sf2f1 };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Flow flow) {
		if (ruleResult.getTargetObjects().contains(flow)) {
			return new Object[] { ruleResult, flow };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Task2NormalStepSeq_34_2_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList _t2ps1List : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmp_t2ps1 : _t2ps1List.getEntryObjects()) {
				if (tmp_t2ps1 instanceof T2NS) {
					T2NS _t2ps1 = (T2NS) tmp_t2ps1;
					Task node = _t2ps1.getSource();
					if (node != null) {
						NormalStep prevStep = _t2ps1.getTarget();
						if (prevStep != null) {
							if (pattern_Task2NormalStepSeq_34_2_black_nac_1BB(
									ruleResult, _t2ps1) == null) {
								if (pattern_Task2NormalStepSeq_34_2_black_nac_0BB(
										ruleResult, node) == null) {
									if (pattern_Task2NormalStepSeq_34_2_black_nac_2BB(
											ruleResult, prevStep) == null) {
										for (SequenceFlow sf1 : node
												.getOutgoing()) {
											if (pattern_Task2NormalStepSeq_34_2_black_nac_4BB(
													ruleResult, sf1) == null) {
												for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(
																node,
																SimpleBPMN.Process.class,
																"flowElements")) {
													if (process
															.getFlowElements()
															.contains(sf1)) {
														if (pattern_Task2NormalStepSeq_34_2_black_nac_3BB(
																ruleResult,
																process) == null) {
															for (SF2F _sf2f1 : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			sf1,
																			SF2F.class,
																			"source")) {
																Flow flow = _sf2f1
																		.getTarget();
																if (flow != null) {
																	if (pattern_Task2NormalStepSeq_34_2_black_nac_5BB(
																			ruleResult,
																			_sf2f1) == null) {
																		if (pattern_Task2NormalStepSeq_34_2_black_nac_6BB(
																				ruleResult,
																				flow) == null) {
																			_result.add(new Object[] {
																					_t2ps1List,
																					node,
																					_t2ps1,
																					prevStep,
																					process,
																					sf1,
																					_sf2f1,
																					flow,
																					ruleEntryContainer,
																					ruleResult });
																		}
																	}
																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Task2NormalStepSeq_34_3_bindingFBBBBBBBBBB(
			Task2NormalStepSeq _this, IsApplicableMatch isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, node, prevStep, _t2ps1, process, flow, sf1,
				_sf2f1, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, node,
					prevStep, _t2ps1, process, flow, sf1, _sf2f1, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_3_bindingAndBlackFBBBBBBBBBB(
			Task2NormalStepSeq _this, IsApplicableMatch isApplicableMatch,
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Task2NormalStepSeq_34_3_binding = pattern_Task2NormalStepSeq_34_3_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, node, prevStep, _t2ps1, process,
				flow, sf1, _sf2f1, ruleResult);
		if (result_pattern_Task2NormalStepSeq_34_3_binding != null) {
			CSP csp = (CSP) result_pattern_Task2NormalStepSeq_34_3_binding[0];

			Object[] result_pattern_Task2NormalStepSeq_34_3_black = pattern_Task2NormalStepSeq_34_3_blackB(csp);
			if (result_pattern_Task2NormalStepSeq_34_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, node,
						prevStep, _t2ps1, process, flow, sf1, _sf2f1,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Task2NormalStepSeq_34_4_expressionFBB(
			Task2NormalStepSeq _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_5_blackBBBBBBB(
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1, SF2F _sf2f1) {
		return new Object[] { node, prevStep, _t2ps1, process, flow, sf1,
				_sf2f1 };
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_6_blackBBBBBBBB(
			Task node, NormalStep prevStep, T2NS _t2ps1,
			SimpleBPMN.Process process, Flow flow, SequenceFlow sf1,
			SF2F _sf2f1, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { node, prevStep, _t2ps1, process, flow, sf1,
				_sf2f1, ruleResult };
	}

	public static final Object[] pattern_Task2NormalStepSeq_34_6_greenBFBBBFFFFB(
			NormalStep prevStep, SimpleBPMN.Process process, Flow flow,
			SequenceFlow sf1, ModelgeneratorRuleResult ruleResult) {
		NormalStep step = SimpleUseCaseFactory.eINSTANCE.createNormalStep();
		Task task = SimpleBPMNFactory.eINSTANCE.createTask();
		T2NS _t2ns = Bpmn2UseCaseFactory.eINSTANCE.createT2NS();
		SequenceFlow sf2 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		SF2F _sf2f2 = Bpmn2UseCaseFactory.eINSTANCE.createSF2F();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		prevStep.setNext(step);
		flow.getSteps().add(step);
		ruleResult.getTargetObjects().add(step);
		process.getFlowElements().add(task);
		sf1.setTargetRef(task);
		ruleResult.getSourceObjects().add(task);
		_t2ns.setSource(task);
		_t2ns.setTarget(step);
		ruleResult.getCorrObjects().add(_t2ns);
		process.getFlowElements().add(sf2);
		sf2.setSourceRef(task);
		ruleResult.getSourceObjects().add(sf2);
		_sf2f2.setSource(sf2);
		_sf2f2.setTarget(flow);
		ruleResult.getCorrObjects().add(_sf2f2);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { prevStep, step, process, flow, sf1, task, _t2ns,
				sf2, _sf2f2, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_Task2NormalStepSeq_34_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Task2NormalStepSeqImpl
