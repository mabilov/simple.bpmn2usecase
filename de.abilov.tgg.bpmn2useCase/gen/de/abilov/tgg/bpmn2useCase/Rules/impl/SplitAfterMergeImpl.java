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

import de.abilov.tgg.bpmn2useCase.Bpmn2useCaseFactory;
import de.abilov.tgg.bpmn2useCase.FN2S;
import de.abilov.tgg.bpmn2useCase.GW2S;

import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;
import de.abilov.tgg.bpmn2useCase.Rules.SplitAfterMerge;

import de.abilov.useCase.ChoiceStep;
import de.abilov.useCase.Flow;
import de.abilov.useCase.ParallelStep;
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
 * An implementation of the model object '<em><b>Split After Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SplitAfterMergeImpl extends AbstractRuleImpl implements SplitAfterMerge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitAfterMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSplitAfterMerge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		// initial bindings
		Object[] result1_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_0_1_blackBBBBBBBBB(this, match, prevNode,
				prevInFlow, prevPrevNode, process, sf1, pgw, pcgw);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_0_2_bindingAndBlackFBBBBBBBBB(
				this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw, pcgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[prevInFlow] = "
					+ prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", " + "[process] = " + process + ", "
					+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitAfterMergeImpl.pattern_SplitAfterMerge_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_0_4_blackBBBBBBBB(match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, pgw, pcgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", "
						+ "[pcgw] = " + pcgw + ".");
			}
			SplitAfterMergeImpl.pattern_SplitAfterMerge_0_4_greenBBBBBBFFFFFFFF(match, prevNode, process, sf1, pgw,
					pcgw);
					// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[7];
					// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result4_green[10];
					// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result4_green[11];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[12];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_0_5_blackBBBBBBBB(match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, pgw, pcgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[prevInFlow] = " + prevInFlow
								+ ", " + "[prevPrevNode] = " + prevPrevNode + ", " + "[process] = " + process + ", "
								+ "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
			}
			SplitAfterMergeImpl.pattern_SplitAfterMerge_0_5_greenBBBBBFFFFF(match, prevNode, prevInFlow, prevPrevNode,
					process);
					// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result5_green[5];
					// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result5_green[6];
					// EMoflonEdge prevInFlow__prevPrevNode____sourceRef = (EMoflonEdge) result5_green[7];
					// EMoflonEdge prevPrevNode__prevInFlow____outgoing = (EMoflonEdge) result5_green[8];
					// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[9];

			// register objects to match
			SplitAfterMergeImpl.pattern_SplitAfterMerge_0_6_expressionBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, pgw, pcgw);
			return SplitAfterMergeImpl.pattern_SplitAfterMerge_0_7_expressionF();
		} else {
			return SplitAfterMergeImpl.pattern_SplitAfterMerge_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl
				.pattern_SplitAfterMerge_1_1_bindingAndBlackFFFFFFFFFFFFBFB(this, isApplicableMatch);
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
		ParallelGateway pgw = (ParallelGateway) result1_bindingAndBlack[10];
		ParallelGateway pcgw = (ParallelGateway) result1_bindingAndBlack[11];
		CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_1_1_greenBBFBFFBB(prevStep, flow, pgw,
				pcgw, csp);
		ParallelStep step = (ParallelStep) result1_green[2];
		FN2S pcgwToStep = (FN2S) result1_green[4];
		GW2S pgwToStep = (GW2S) result1_green[5];

		// collect translated elements
		Object[] result2_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_1_2_blackBBBBBB(step, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_1_2_greenFBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_1_3_blackBBBBBBBBBBBBBBBB(ruleresult,
				prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
					+ flow + ", " + "[step] = " + step + ", " + "[prevInFlow] = " + prevInFlow + ", "
					+ "[prevPrevNode] = " + prevPrevNode + ", " + "[fn2ps] = " + fn2ps + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", "
					+ "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		SplitAfterMergeImpl.pattern_SplitAfterMerge_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode, prevStep,
				flow, step, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		SplitAfterMergeImpl.pattern_SplitAfterMerge_1_5_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, prevNode,
				choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitAfterMergeImpl.pattern_SplitAfterMerge_2_2_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[0];
		SequenceFlow prevInFlow = (SequenceFlow) result2_binding[1];
		FlowNode prevPrevNode = (FlowNode) result2_binding[2];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		ParallelGateway pgw = (ParallelGateway) result2_binding[5];
		ParallelGateway pcgw = (ParallelGateway) result2_binding[6];
		for (Object[] result2_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_2_2_blackBFFFBBFBBBBB(prevNode,
				prevInFlow, prevPrevNode, process, sf1, pgw, pcgw, match)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[1];
			GW2S pn2cs = (GW2S) result2_black[2];
			Step prevStep = (Step) result2_black[3];
			FN2S fn2ps = (FN2S) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_2_3_blackBBBBFBBBBBBB(prevNode,
					choiceStep, pn2cs, prevStep, prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw, pcgw)) {
				Flow flow = (Flow) result3_black[4];
				Object[] result3_green = SplitAfterMergeImpl
						.pattern_SplitAfterMerge_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(prevNode, choiceStep, pn2cs,
								prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw, pcgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[12];
				// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result3_green[13];
				// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge prevInFlow__prevPrevNode____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevPrevNode__prevInFlow____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge fn2ps__prevPrevNode____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge fn2ps__prevStep____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[23];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[24];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[25];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[26];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[27];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[28];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[29];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[30];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[31];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitAfterMergeImpl
						.pattern_SplitAfterMerge_2_4_bindingAndBlackFBBBBBBBBBBBBBB(this, isApplicableMatch, prevNode,
								choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw,
								pcgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", "
							+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", "
							+ "[fn2ps] = " + fn2ps + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", "
							+ "[pgw] = " + pgw + ", " + "[pcgw] = " + pcgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {
		match.registerObject("prevNode", prevNode);
		match.registerObject("prevInFlow", prevInFlow);
		match.registerObject("prevPrevNode", prevPrevNode);
		match.registerObject("process", process);
		match.registerObject("sf1", sf1);
		match.registerObject("pgw", pgw);
		match.registerObject("pcgw", pcgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw,
			ParallelGateway pcgw) {// Create CSP
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
			FN2S fn2ps, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		// Create unbound variables
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_pgw_id, var_step_id);

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
		isApplicableMatch.registerObject("pgw", pgw);
		isApplicableMatch.registerObject("pcgw", pcgw);
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
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("prevInFlow", prevInFlow);
		ruleresult.registerObject("prevPrevNode", prevPrevNode);
		ruleresult.registerObject("fn2ps", fn2ps);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("pcgwToStep", pcgwToStep);
		ruleresult.registerObject("pgwToStep", pgwToStep);
		ruleresult.registerObject("pcgw", pcgw);

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
				&& match.getObject("pgw").eClass()
						.equals(de.abilov.bpmn.BpmnPackage.eINSTANCE.getParallelGateway())
				&& match.getObject("pcgw").eClass()
						.equals(de.abilov.bpmn.BpmnPackage.eINSTANCE.getParallelGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, ChoiceStep choiceStep, Step prevStep, Flow flow, ParallelStep step) {
		// initial bindings
		Object[] result1_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_10_1_blackBBBBBB(this, match, choiceStep,
				prevStep, flow, step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
					+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_10_2_bindingAndBlackFBBBBBB(this,
				match, choiceStep, prevStep, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
					+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SplitAfterMergeImpl.pattern_SplitAfterMerge_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_10_4_blackBBBBB(match, choiceStep,
					prevStep, flow, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			SplitAfterMergeImpl.pattern_SplitAfterMerge_10_4_greenBBBBFF(match, prevStep, flow, step);
			// EMoflonEdge prevStep__step____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_10_5_blackBBBBB(match, choiceStep,
					prevStep, flow, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			SplitAfterMergeImpl.pattern_SplitAfterMerge_10_5_greenBBBBFF(match, choiceStep, prevStep, flow);
			// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			SplitAfterMergeImpl.pattern_SplitAfterMerge_10_6_expressionBBBBBB(this, match, choiceStep, prevStep, flow,
					step);
			return SplitAfterMergeImpl.pattern_SplitAfterMerge_10_7_expressionF();
		} else {
			return SplitAfterMergeImpl.pattern_SplitAfterMerge_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl
				.pattern_SplitAfterMerge_11_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		ParallelStep step = (ParallelStep) result1_bindingAndBlack[5];
		SequenceFlow prevInFlow = (SequenceFlow) result1_bindingAndBlack[6];
		FlowNode prevPrevNode = (FlowNode) result1_bindingAndBlack[7];
		FN2S fn2ps = (FN2S) result1_bindingAndBlack[8];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_11_1_greenBBBFFFFFB(prevNode, step,
				process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[3];
		ParallelGateway pgw = (ParallelGateway) result1_green[4];
		FN2S pcgwToStep = (FN2S) result1_green[5];
		GW2S pgwToStep = (GW2S) result1_green[6];
		ParallelGateway pcgw = (ParallelGateway) result1_green[7];

		// collect translated elements
		Object[] result2_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_11_2_blackBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = "
					+ pcgwToStep + ", " + "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_11_2_greenFBBBBBB(step, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_11_3_blackBBBBBBBBBBBBBBBB(ruleresult,
				prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw,
				pcgwToStep, pgwToStep, pcgw);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
					+ flow + ", " + "[step] = " + step + ", " + "[prevInFlow] = " + prevInFlow + ", "
					+ "[prevPrevNode] = " + prevPrevNode + ", " + "[fn2ps] = " + fn2ps + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[pgw] = " + pgw + ", " + "[pcgwToStep] = " + pcgwToStep + ", "
					+ "[pgwToStep] = " + pgwToStep + ", " + "[pcgw] = " + pcgw + ".");
		}
		SplitAfterMergeImpl.pattern_SplitAfterMerge_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode, prevStep,
				flow, step, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__pgw____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__pcgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__pgw____targetRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pgw__sf1____incoming = (EMoflonEdge) result3_green[17];
				// EMoflonEdge pgw__pcgw______conv = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge pcgwToStep__pcgw____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge pcgwToStep__step____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge pgwToStep__pgw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge pgwToStep__step____target = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		SplitAfterMergeImpl.pattern_SplitAfterMerge_11_5_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, prevNode,
				choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw, pcgwToStep,
				pgwToStep, pcgw);
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SplitAfterMergeImpl.pattern_SplitAfterMerge_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep choiceStep = (ChoiceStep) result2_binding[0];
		Step prevStep = (Step) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		ParallelStep step = (ParallelStep) result2_binding[3];
		for (Object[] result2_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_12_2_blackFBFBBBFFB(choiceStep,
				prevStep, flow, step, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S pn2cs = (GW2S) result2_black[2];
			FlowNode prevPrevNode = (FlowNode) result2_black[6];
			FN2S fn2ps = (FN2S) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_12_3_blackBBBBBBFBBF(prevNode,
					choiceStep, pn2cs, prevStep, flow, step, prevPrevNode, fn2ps)) {
				SequenceFlow prevInFlow = (SequenceFlow) result3_black[6];
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[9];
				Object[] result3_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFF(
						prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result3_green[12];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[13];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[15];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge prevInFlow__prevPrevNode____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevPrevNode__prevInFlow____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge fn2ps__prevPrevNode____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge fn2ps__prevStep____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = SplitAfterMergeImpl
						.pattern_SplitAfterMerge_12_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, prevNode,
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
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ChoiceStep choiceStep, Step prevStep, Flow flow,
			ParallelStep step) {
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
			ParallelStep step) {// Create CSP
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
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, ParallelStep step, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		// Create unbound variables
		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw.id", csp);
		var_pgw_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_pgw_id, var_step_id);

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
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("prevInFlow", prevInFlow);
		ruleresult.registerObject("prevPrevNode", prevPrevNode);
		ruleresult.registerObject("fn2ps", fn2ps);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("pgw", pgw);
		ruleresult.registerObject("pcgwToStep", pcgwToStep);
		ruleresult.registerObject("pgwToStep", pgwToStep);
		ruleresult.registerObject("pcgw", pcgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("step").eClass()
				.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getParallelStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_276(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_20_2_blackFFFFB(_edge_next)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ParallelStep step = (ParallelStep) result2_black[3];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_20_3_expressionFBBBBBB(this, match, choiceStep, prevStep,
					flow, step)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_277(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_21_2_blackFFFFB(_edge_steps)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ParallelStep step = (ParallelStep) result2_black[3];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_21_3_expressionFBBBBBB(this, match, choiceStep, prevStep,
					flow, step)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_902(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl
				.pattern_SplitAfterMerge_22_2_blackFFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ParallelGateway pgw = (ParallelGateway) result2_black[5];
			ParallelGateway pcgw = (ParallelGateway) result2_black[6];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_22_3_expressionFBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_903(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl
				.pattern_SplitAfterMerge_23_2_blackFFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ParallelGateway pgw = (ParallelGateway) result2_black[5];
			ParallelGateway pcgw = (ParallelGateway) result2_black[6];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_23_3_expressionFBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_904(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl
				.pattern_SplitAfterMerge_24_2_blackFFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ParallelGateway pgw = (ParallelGateway) result2_black[5];
			ParallelGateway pcgw = (ParallelGateway) result2_black[6];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_24_3_expressionFBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_905(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_25_2_blackFFFFFFFB(_edge_targetRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ParallelGateway pgw = (ParallelGateway) result2_black[5];
			ParallelGateway pcgw = (ParallelGateway) result2_black[6];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_25_3_expressionFBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_906(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_26_2_blackFFFFFFFB(_edge_incoming)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ParallelGateway pgw = (ParallelGateway) result2_black[5];
			ParallelGateway pcgw = (ParallelGateway) result2_black[6];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_26_3_expressionFBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_907(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_27_2_blackFFFFFFFB(_edge___conv)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ParallelGateway pgw = (ParallelGateway) result2_black[5];
			ParallelGateway pcgw = (ParallelGateway) result2_black[6];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_27_3_expressionFBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_908(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_28_2_blackFFFFFFFB(_edge_sourceRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ParallelGateway pgw = (ParallelGateway) result2_black[5];
			ParallelGateway pcgw = (ParallelGateway) result2_black[6];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_28_3_expressionFBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_909(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = SplitAfterMergeImpl.pattern_SplitAfterMerge_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SplitAfterMergeImpl.pattern_SplitAfterMerge_29_2_blackFFFFFFFB(_edge_outgoing)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ParallelGateway pgw = (ParallelGateway) result2_black[5];
			ParallelGateway pcgw = (ParallelGateway) result2_black[6];
			Object[] result2_green = SplitAfterMergeImpl.pattern_SplitAfterMerge_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SplitAfterMergeImpl.pattern_SplitAfterMerge_29_3_expressionFBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, pgw, pcgw)) {
				// Ensure that the correct types of elements are matched
				if (SplitAfterMergeImpl.pattern_SplitAfterMerge_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = SplitAfterMergeImpl.pattern_SplitAfterMerge_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					SplitAfterMergeImpl.pattern_SplitAfterMerge_29_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SplitAfterMergeImpl.pattern_SplitAfterMerge_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SplitAfterMerge");
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
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevInFlow")).findAny();
		de.abilov.bpmn.SequenceFlow prevInFlow = (de.abilov.bpmn.SequenceFlow) matchForPrevInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevPrevNode")).findAny();
		de.abilov.bpmn.FlowNode prevPrevNode = (de.abilov.bpmn.FlowNode) matchForPrevPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("fn2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S fn2ps = (de.abilov.tgg.bpmn2useCase.FN2S) matchForFn2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		de.abilov.bpmn.ParallelGateway pgw = (de.abilov.bpmn.ParallelGateway) matchForPgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgwToStep")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S pcgwToStep = (de.abilov.tgg.bpmn2useCase.FN2S) matchForPcgwToStep.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForPgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgwToStep")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pgwToStep = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgw")).findAny();
		de.abilov.bpmn.ParallelGateway pcgw = (de.abilov.bpmn.ParallelGateway) matchForPcgw.get().getNode();

		if (!(prevNode.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(pgw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(pcgw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SplitAfterMerge");
		eq0.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_step_id.setBound(false);
			eq0.solve(var_pgw_id, var_step_id);
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
		ruleResult.setRule("SplitAfterMerge");
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
		de.abilov.useCase.ParallelStep step = (de.abilov.useCase.ParallelStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevInFlow")).findAny();
		de.abilov.bpmn.SequenceFlow prevInFlow = (de.abilov.bpmn.SequenceFlow) matchForPrevInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevPrevNode")).findAny();
		de.abilov.bpmn.FlowNode prevPrevNode = (de.abilov.bpmn.FlowNode) matchForPrevPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFn2ps = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("fn2ps")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S fn2ps = (de.abilov.tgg.bpmn2useCase.FN2S) matchForFn2ps.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgw")).findAny();
		de.abilov.bpmn.ParallelGateway pgw = (de.abilov.bpmn.ParallelGateway) matchForPgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgwToStep")).findAny();
		de.abilov.tgg.bpmn2useCase.FN2S pcgwToStep = (de.abilov.tgg.bpmn2useCase.FN2S) matchForPcgwToStep.get()
				.getNode();

		Optional<TripleMatchNodeMapping> matchForPgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pgwToStep")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pgwToStep = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pcgw")).findAny();
		de.abilov.bpmn.ParallelGateway pcgw = (de.abilov.bpmn.ParallelGateway) matchForPcgw.get().getNode();

		if (!(prevNode.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(pgw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(pcgw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_pgw_id = CSPFactoryHelper.eINSTANCE.createVariable("pgw", true, csp);
		var_pgw_id.setValue(pgw.getId());
		var_pgw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SplitAfterMerge");
		eq0.solve(var_pgw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_pgw_id.setBound(false);
			eq0.solve(var_pgw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				pgw.setId((String) var_pgw_id.getValue());
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
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (FlowNode) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ParallelGateway) arguments.get(6), (ParallelGateway) arguments.get(7));
		case RulesPackage.SPLIT_AFTER_MERGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (FlowNode) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ParallelGateway) arguments.get(6), (ParallelGateway) arguments.get(7));
			return null;
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (FlowNode) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ParallelGateway) arguments.get(6), (ParallelGateway) arguments.get(7));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS_SEQUENCEFLOW_PARALLELGATEWAY_PARALLELGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (Step) arguments.get(4),
					(Flow) arguments.get(5), (SequenceFlow) arguments.get(6), (FlowNode) arguments.get(7),
					(FN2S) arguments.get(8), (de.abilov.bpmn.Process) arguments.get(9),
					(SequenceFlow) arguments.get(10), (ParallelGateway) arguments.get(11),
					(ParallelGateway) arguments.get(12));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.SPLIT_AFTER_MERGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW_PARALLELSTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1), (Step) arguments.get(2),
					(Flow) arguments.get(3), (ParallelStep) arguments.get(4));
		case RulesPackage.SPLIT_AFTER_MERGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW_PARALLELSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1), (Step) arguments.get(2),
					(Flow) arguments.get(3), (ParallelStep) arguments.get(4));
			return null;
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW_PARALLELSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3), (ParallelStep) arguments.get(4));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_PARALLELSTEP_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (Step) arguments.get(4),
					(Flow) arguments.get(5), (ParallelStep) arguments.get(6), (SequenceFlow) arguments.get(7),
					(FlowNode) arguments.get(8), (FN2S) arguments.get(9), (de.abilov.bpmn.Process) arguments.get(10));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.SPLIT_AFTER_MERGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_276__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_276((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_277__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_277((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_902__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_902((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_903__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_903((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_904__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_904((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_905__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_905((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_906__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_906((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_907__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_907((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_908__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_908((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_909__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_909((EMoflonEdge) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SPLIT_AFTER_MERGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SplitAfterMerge_0_1_blackBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!pgw.equals(prevPrevNode)) {
					if (!pcgw.equals(prevPrevNode)) {
						if (!pcgw.equals(pgw)) {
							return new Object[] { _this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw,
									pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_0_2_bindingFBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1,
				pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterMerge_0_2_bindingAndBlackFBBBBBBBBB(SplitAfterMerge _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_SplitAfterMerge_0_2_binding = pattern_SplitAfterMerge_0_2_bindingFBBBBBBBBB(_this,
				match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw, pcgw);
		if (result_pattern_SplitAfterMerge_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterMerge_0_2_binding[0];

			Object[] result_pattern_SplitAfterMerge_0_2_black = pattern_SplitAfterMerge_0_2_blackB(csp);
			if (result_pattern_SplitAfterMerge_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterMerge_0_3_expressionFBB(SplitAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_0_4_blackBBBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!pgw.equals(prevPrevNode)) {
					if (!pcgw.equals(prevPrevNode)) {
						if (!pcgw.equals(pgw)) {
							return new Object[] { match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_0_4_greenBBBBBBFFFFFFFF(Match match, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(pgw);
		match.getToBeTranslatedNodes().add(pcgw);
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		match.getToBeTranslatedEdges().add(process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getToBeTranslatedEdges().add(process__sf1____flowElements);
		process__pcgw____flowElements.setSrc(process);
		process__pcgw____flowElements.setTrg(pcgw);
		match.getToBeTranslatedEdges().add(process__pcgw____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		match.getToBeTranslatedEdges().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		match.getToBeTranslatedEdges().add(pgw__sf1____incoming);
		pgw__pcgw______conv.setSrc(pgw);
		pgw__pcgw______conv.setTrg(pcgw);
		match.getToBeTranslatedEdges().add(pgw__pcgw______conv);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { match, prevNode, process, sf1, pgw, pcgw, process__pgw____flowElements,
				process__sf1____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef, prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_SplitAfterMerge_0_5_blackBBBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!pgw.equals(prevPrevNode)) {
					if (!pcgw.equals(prevPrevNode)) {
						if (!pcgw.equals(pgw)) {
							return new Object[] { match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw, pcgw };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_0_5_greenBBBBBFFFFF(Match match, ExclusiveGateway prevNode,
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

	public static final void pattern_SplitAfterMerge_0_6_expressionBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw, pcgw);

	}

	public static final boolean pattern_SplitAfterMerge_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_1_1_bindingFFFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
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
		EObject _localVariable_10 = isApplicableMatch.getObject("pgw");
		EObject _localVariable_11 = isApplicableMatch.getObject("pcgw");
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
		EObject tmpPgw = _localVariable_10;
		EObject tmpPcgw = _localVariable_11;
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
												if (tmpPgw instanceof ParallelGateway) {
													ParallelGateway pgw = (ParallelGateway) tmpPgw;
													if (tmpPcgw instanceof ParallelGateway) {
														ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
														return new Object[] { prevNode, choiceStep, pn2cs, prevStep,
																flow, prevInFlow, prevPrevNode, fn2ps, process, sf1,
																pgw, pcgw, isApplicableMatch };
													}
												}
											}
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

	public static final Object[] pattern_SplitAfterMerge_1_1_blackBBBBBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode,
			FN2S fn2ps, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw,
			SplitAfterMerge _this, IsApplicableMatch isApplicableMatch) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!choiceStep.equals(prevStep)) {
				if (!prevInFlow.equals(sf1)) {
					if (!pgw.equals(prevPrevNode)) {
						if (!pcgw.equals(prevPrevNode)) {
							if (!pcgw.equals(pgw)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow,
												prevPrevNode, fn2ps, process, sf1, pgw, pcgw, _this, csp,
												isApplicableMatch };
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

	public static final Object[] pattern_SplitAfterMerge_1_1_bindingAndBlackFFFFFFFFFFFFBFB(SplitAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitAfterMerge_1_1_binding = pattern_SplitAfterMerge_1_1_bindingFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SplitAfterMerge_1_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_SplitAfterMerge_1_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_SplitAfterMerge_1_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_SplitAfterMerge_1_1_binding[2];
			Step prevStep = (Step) result_pattern_SplitAfterMerge_1_1_binding[3];
			Flow flow = (Flow) result_pattern_SplitAfterMerge_1_1_binding[4];
			SequenceFlow prevInFlow = (SequenceFlow) result_pattern_SplitAfterMerge_1_1_binding[5];
			FlowNode prevPrevNode = (FlowNode) result_pattern_SplitAfterMerge_1_1_binding[6];
			FN2S fn2ps = (FN2S) result_pattern_SplitAfterMerge_1_1_binding[7];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitAfterMerge_1_1_binding[8];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_SplitAfterMerge_1_1_binding[9];
			ParallelGateway pgw = (ParallelGateway) result_pattern_SplitAfterMerge_1_1_binding[10];
			ParallelGateway pcgw = (ParallelGateway) result_pattern_SplitAfterMerge_1_1_binding[11];

			Object[] result_pattern_SplitAfterMerge_1_1_black = pattern_SplitAfterMerge_1_1_blackBBBBBBBBBBBBBFB(
					prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw,
					pcgw, _this, isApplicableMatch);
			if (result_pattern_SplitAfterMerge_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitAfterMerge_1_1_black[13];

				return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps,
						process, sf1, pgw, pcgw, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_1_1_greenBBFBFFBB(Step prevStep, Flow flow,
			ParallelGateway pgw, ParallelGateway pcgw, CSP csp) {
		ParallelStep step = UseCaseFactory.eINSTANCE.createParallelStep();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		prevStep.setNext(step);
		flow.getSteps().add(step);
		pcgwToStep.setSource(pcgw);
		pcgwToStep.setTarget(step);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { prevStep, flow, step, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitAfterMerge_1_2_blackBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_1_2_greenFBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getTranslatedElements().add(pcgw);
		return new Object[] { ruleresult, step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_SplitAfterMerge_1_3_blackBBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep, EObject flow, EObject step,
			EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject process, EObject sf1, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!prevNode.equals(process)) {
						if (!prevNode.equals(sf1)) {
							if (!choiceStep.equals(prevNode)) {
								if (!choiceStep.equals(pn2cs)) {
									if (!choiceStep.equals(prevStep)) {
										if (!choiceStep.equals(flow)) {
											if (!choiceStep.equals(step)) {
												if (!choiceStep.equals(prevInFlow)) {
													if (!choiceStep.equals(prevPrevNode)) {
														if (!choiceStep.equals(fn2ps)) {
															if (!choiceStep.equals(process)) {
																if (!choiceStep.equals(sf1)) {
																	if (!choiceStep.equals(pgw)) {
																		if (!choiceStep.equals(pcgwToStep)) {
																			if (!choiceStep.equals(pgwToStep)) {
																				if (!choiceStep.equals(pcgw)) {
																					if (!pn2cs.equals(prevNode)) {
																						if (!pn2cs.equals(prevStep)) {
																							if (!pn2cs.equals(step)) {
																								if (!pn2cs.equals(
																										prevInFlow)) {
																									if (!pn2cs.equals(
																											prevPrevNode)) {
																										if (!pn2cs
																												.equals(process)) {
																											if (!pn2cs
																													.equals(sf1)) {
																												if (!prevStep
																														.equals(step)) {
																													if (!prevStep
																															.equals(process)) {
																														if (!prevStep
																																.equals(sf1)) {
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
																																								.equals(process)) {
																																							if (!flow
																																									.equals(sf1)) {
																																								if (!flow
																																										.equals(pgw)) {
																																									if (!flow
																																											.equals(pcgwToStep)) {
																																										if (!flow
																																												.equals(pgwToStep)) {
																																											if (!flow
																																													.equals(pcgw)) {
																																												if (!prevInFlow
																																														.equals(prevNode)) {
																																													if (!prevInFlow
																																															.equals(prevStep)) {
																																														if (!prevInFlow
																																																.equals(step)) {
																																															if (!prevInFlow
																																																	.equals(prevPrevNode)) {
																																																if (!prevInFlow
																																																		.equals(process)) {
																																																	if (!prevInFlow
																																																			.equals(sf1)) {
																																																		if (!prevPrevNode
																																																				.equals(prevStep)) {
																																																			if (!prevPrevNode
																																																					.equals(step)) {
																																																				if (!prevPrevNode
																																																						.equals(process)) {
																																																					if (!prevPrevNode
																																																							.equals(sf1)) {
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
																																																														.equals(process)) {
																																																													if (!fn2ps
																																																															.equals(sf1)) {
																																																														if (!fn2ps
																																																																.equals(pgw)) {
																																																															if (!fn2ps
																																																																	.equals(pcgwToStep)) {
																																																																if (!fn2ps
																																																																		.equals(pgwToStep)) {
																																																																	if (!fn2ps
																																																																			.equals(pcgw)) {
																																																																		if (!process
																																																																				.equals(step)) {
																																																																			if (!process
																																																																					.equals(sf1)) {
																																																																				if (!sf1.equals(
																																																																						step)) {
																																																																					if (!pgw.equals(
																																																																							prevNode)) {
																																																																						if (!pgw.equals(
																																																																								pn2cs)) {
																																																																							if (!pgw.equals(
																																																																									prevStep)) {
																																																																								if (!pgw.equals(
																																																																										step)) {
																																																																									if (!pgw.equals(
																																																																											prevInFlow)) {
																																																																										if (!pgw.equals(
																																																																												prevPrevNode)) {
																																																																											if (!pgw.equals(
																																																																													process)) {
																																																																												if (!pgw.equals(
																																																																														sf1)) {
																																																																													if (!pgw.equals(
																																																																															pgwToStep)) {
																																																																														if (!pcgwToStep
																																																																																.equals(prevNode)) {
																																																																															if (!pcgwToStep
																																																																																	.equals(pn2cs)) {
																																																																																if (!pcgwToStep
																																																																																		.equals(prevStep)) {
																																																																																	if (!pcgwToStep
																																																																																			.equals(step)) {
																																																																																		if (!pcgwToStep
																																																																																				.equals(prevInFlow)) {
																																																																																			if (!pcgwToStep
																																																																																					.equals(prevPrevNode)) {
																																																																																				if (!pcgwToStep
																																																																																						.equals(process)) {
																																																																																					if (!pcgwToStep
																																																																																							.equals(sf1)) {
																																																																																						if (!pcgwToStep
																																																																																								.equals(pgw)) {
																																																																																							if (!pcgwToStep
																																																																																									.equals(pgwToStep)) {
																																																																																								if (!pgwToStep
																																																																																										.equals(prevNode)) {
																																																																																									if (!pgwToStep
																																																																																											.equals(pn2cs)) {
																																																																																										if (!pgwToStep
																																																																																												.equals(prevStep)) {
																																																																																											if (!pgwToStep
																																																																																													.equals(step)) {
																																																																																												if (!pgwToStep
																																																																																														.equals(prevInFlow)) {
																																																																																													if (!pgwToStep
																																																																																															.equals(prevPrevNode)) {
																																																																																														if (!pgwToStep
																																																																																																.equals(process)) {
																																																																																															if (!pgwToStep
																																																																																																	.equals(sf1)) {
																																																																																																if (!pcgw
																																																																																																		.equals(prevNode)) {
																																																																																																	if (!pcgw
																																																																																																			.equals(pn2cs)) {
																																																																																																		if (!pcgw
																																																																																																				.equals(prevStep)) {
																																																																																																			if (!pcgw
																																																																																																					.equals(step)) {
																																																																																																				if (!pcgw
																																																																																																						.equals(prevInFlow)) {
																																																																																																					if (!pcgw
																																																																																																							.equals(prevPrevNode)) {
																																																																																																						if (!pcgw
																																																																																																								.equals(process)) {
																																																																																																							if (!pcgw
																																																																																																									.equals(sf1)) {
																																																																																																								if (!pcgw
																																																																																																										.equals(pgw)) {
																																																																																																									if (!pcgw
																																																																																																											.equals(pcgwToStep)) {
																																																																																																										if (!pcgw
																																																																																																												.equals(pgwToStep)) {
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
																																																																																																													process,
																																																																																																													sf1,
																																																																																																													pgw,
																																																																																																													pcgwToStep,
																																																																																																													pgwToStep,
																																																																																																													pcgw };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SplitAfterMerge_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject flow, EObject step,
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SplitAfterMerge";
		String prevStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(prevStep__step____next);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getTranslatedEdges().add(process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		process__pcgw____flowElements.setSrc(process);
		process__pcgw____flowElements.setTrg(pcgw);
		ruleresult.getTranslatedEdges().add(process__pcgw____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		ruleresult.getTranslatedEdges().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(pgw__sf1____incoming);
		pgw__pcgw______conv.setSrc(pgw);
		pgw__pcgw______conv.setTrg(pcgw);
		ruleresult.getTranslatedEdges().add(pgw__pcgw______conv);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		pcgwToStep__pcgw____source.setSrc(pcgwToStep);
		pcgwToStep__pcgw____source.setTrg(pcgw);
		ruleresult.getCreatedEdges().add(pcgwToStep__pcgw____source);
		pcgwToStep__step____target.setSrc(pcgwToStep);
		pcgwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(pcgwToStep__step____target);
		pgwToStep__pgw____source.setSrc(pgwToStep);
		pgwToStep__pgw____source.setTrg(pgw);
		ruleresult.getCreatedEdges().add(pgwToStep__pgw____source);
		pgwToStep__step____target.setSrc(pgwToStep);
		pgwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(pgwToStep__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, prevNode, prevStep, flow, step, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw, prevStep__step____next, flow__step____steps, process__pgw____flowElements,
				process__sf1____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_SplitAfterMerge_1_5_expressionBBBBBBBBBBBBBBBBB(SplitAfterMerge _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep,
			EObject flow, EObject step, EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject process,
			EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_FWD(ruleresult, prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow,
				prevPrevNode, fn2ps, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitAfterMerge_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_2_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_2_1_blackFBB(EClass eClass, SplitAfterMerge _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_2_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_2_1_binding = pattern_SplitAfterMerge_2_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitAfterMerge_2_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_2_1_black = pattern_SplitAfterMerge_2_1_blackFBB(eClass, _this);
			if (result_pattern_SplitAfterMerge_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitAfterMerge_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitAfterMerge";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitAfterMerge_2_2_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("prevInFlow");
		EObject _localVariable_2 = match.getObject("prevPrevNode");
		EObject _localVariable_3 = match.getObject("process");
		EObject _localVariable_4 = match.getObject("sf1");
		EObject _localVariable_5 = match.getObject("pgw");
		EObject _localVariable_6 = match.getObject("pcgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpPrevInFlow = _localVariable_1;
		EObject tmpPrevPrevNode = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpPgw = _localVariable_5;
		EObject tmpPcgw = _localVariable_6;
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
							if (tmpPgw instanceof ParallelGateway) {
								ParallelGateway pgw = (ParallelGateway) tmpPgw;
								if (tmpPcgw instanceof ParallelGateway) {
									ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
									return new Object[] { prevNode, prevInFlow, prevPrevNode, process, sf1, pgw, pcgw,
											match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_2_2_blackBFFFBBFBBBBB(ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ParallelGateway pgw, ParallelGateway pcgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!pgw.equals(prevPrevNode)) {
					if (!pcgw.equals(prevPrevNode)) {
						if (!pcgw.equals(pgw)) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
								boolean pgwisDiverging = pgw.isIsDiverging();
								if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
									boolean pcgwisDiverging = pcgw.isIsDiverging();
									if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
										for (GW2S pn2cs : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevNode, GW2S.class, "source")) {
											Step tmpChoiceStep = pn2cs.getTarget();
											if (tmpChoiceStep instanceof ChoiceStep) {
												ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
												for (FN2S fn2ps : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(prevPrevNode, FN2S.class,
																"source")) {
													Step prevStep = fn2ps.getTarget();
													if (prevStep != null) {
														if (!choiceStep.equals(prevStep)) {
															_result.add(new Object[] { prevNode, choiceStep, pn2cs,
																	prevStep, prevInFlow, prevPrevNode, fn2ps, process,
																	sf1, pgw, pcgw, match });
														}
													}

												}
											}

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

	public static final Iterable<Object[]> pattern_SplitAfterMerge_2_3_blackBBBBFBBBBBBB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, SequenceFlow prevInFlow, FlowNode prevPrevNode,
			FN2S fn2ps, de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(prevPrevNode)) {
			if (!choiceStep.equals(prevStep)) {
				if (!prevInFlow.equals(sf1)) {
					if (!pgw.equals(prevPrevNode)) {
						if (!pcgw.equals(prevPrevNode)) {
							if (!pcgw.equals(pgw)) {
								if (prevNode.equals(prevInFlow.getTargetRef())) {
									if (prevNode.equals(pn2cs.getSource())) {
										if (choiceStep.equals(pn2cs.getTarget())) {
											if (prevPrevNode.equals(prevInFlow.getSourceRef())) {
												if (prevPrevNode.equals(fn2ps.getSource())) {
													if (prevStep.equals(fn2ps.getTarget())) {
														if (process.getFlowElements().contains(pgw)) {
															if (process.getFlowElements().contains(sf1)) {
																if (process.getFlowElements().contains(prevNode)) {
																	if (process.getFlowElements().contains(pcgw)) {
																		if (pgw.equals(sf1.getTargetRef())) {
																			if (pcgw.equals(pgw.get__conv())) {
																				if (prevNode
																						.equals(sf1.getSourceRef())) {
																					boolean prevNodeisDiverging = prevNode
																							.isIsDiverging();
																					if (Boolean
																							.valueOf(
																									prevNodeisDiverging)
																							.equals(false)) {
																						boolean pgwisDiverging = pgw
																								.isIsDiverging();
																						if (Boolean
																								.valueOf(pgwisDiverging)
																								.equals(Boolean.valueOf(
																										true))) {
																							boolean pcgwisDiverging = pcgw
																									.isIsDiverging();
																							if (Boolean
																									.valueOf(
																											pcgwisDiverging)
																									.equals(false)) {
																								for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																										.getOppositeReferenceTyped(
																												choiceStep,
																												Flow.class,
																												"steps")) {
																									if (flow.getSteps()
																											.contains(
																													prevStep)) {
																										_result.add(
																												new Object[] {
																														prevNode,
																														choiceStep,
																														pn2cs,
																														prevStep,
																														flow,
																														prevInFlow,
																														prevPrevNode,
																														fn2ps,
																														process,
																														sf1,
																														pgw,
																														pcgw });
																									}
																								}
																							}

																						}

																					}

																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SplitAfterMerge_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge prevInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__prevInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__prevPrevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevPrevNode__prevInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fn2ps__prevPrevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String prevInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__prevInFlow____incoming_name_prime = "incoming";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__prevStep____steps_name_prime = "steps";
		String prevInFlow__prevPrevNode____sourceRef_name_prime = "sourceRef";
		String prevPrevNode__prevInFlow____outgoing_name_prime = "outgoing";
		String fn2ps__prevPrevNode____source_name_prime = "source";
		String fn2ps__prevStep____target_name_prime = "target";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
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
		isApplicableMatch.getAllContextElements().add(pgw);
		isApplicableMatch.getAllContextElements().add(pcgw);
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
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(flow__prevStep____steps);
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
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		process__pcgw____flowElements.setSrc(process);
		process__pcgw____flowElements.setTrg(pcgw);
		isApplicableMatch.getAllContextElements().add(process__pcgw____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		isApplicableMatch.getAllContextElements().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(pgw__sf1____incoming);
		pgw__pcgw______conv.setSrc(pgw);
		pgw__pcgw______conv.setTrg(pcgw);
		isApplicableMatch.getAllContextElements().add(pgw__pcgw______conv);
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
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		prevInFlow__prevPrevNode____sourceRef.setName(prevInFlow__prevPrevNode____sourceRef_name_prime);
		prevPrevNode__prevInFlow____outgoing.setName(prevPrevNode__prevInFlow____outgoing_name_prime);
		fn2ps__prevPrevNode____source.setName(fn2ps__prevPrevNode____source_name_prime);
		fn2ps__prevStep____target.setName(fn2ps__prevStep____target_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process,
				sf1, pgw, pcgw, isApplicableMatch, prevInFlow__prevNode____targetRef, prevNode__prevInFlow____incoming,
				pn2cs__prevNode____source, pn2cs__choiceStep____target, flow__choiceStep____steps,
				flow__prevStep____steps, prevInFlow__prevPrevNode____sourceRef, prevPrevNode__prevInFlow____outgoing,
				fn2ps__prevPrevNode____source, fn2ps__prevStep____target, process__pgw____flowElements,
				process__sf1____flowElements, process__prevNode____flowElements, process__pcgw____flowElements,
				sf1__pgw____targetRef, pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing };
	}

	public static final Object[] pattern_SplitAfterMerge_2_4_bindingFBBBBBBBBBBBBBB(SplitAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep,
				flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw, pcgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow,
					prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterMerge_2_4_bindingAndBlackFBBBBBBBBBBBBBB(SplitAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		Object[] result_pattern_SplitAfterMerge_2_4_binding = pattern_SplitAfterMerge_2_4_bindingFBBBBBBBBBBBBBB(_this,
				isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps,
				process, sf1, pgw, pcgw);
		if (result_pattern_SplitAfterMerge_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterMerge_2_4_binding[0];

			Object[] result_pattern_SplitAfterMerge_2_4_black = pattern_SplitAfterMerge_2_4_blackB(csp);
			if (result_pattern_SplitAfterMerge_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow,
						prevInFlow, prevPrevNode, fn2ps, process, sf1, pgw, pcgw };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterMerge_2_5_expressionFBB(SplitAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitAfterMerge_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitAfterMerge";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitAfterMerge_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_10_1_blackBBBBBB(SplitAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, ParallelStep step) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				return new Object[] { _this, match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_10_2_bindingFBBBBBB(SplitAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, ParallelStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, choiceStep, prevStep, flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, choiceStep, prevStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterMerge_10_2_bindingAndBlackFBBBBBB(SplitAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, ParallelStep step) {
		Object[] result_pattern_SplitAfterMerge_10_2_binding = pattern_SplitAfterMerge_10_2_bindingFBBBBBB(_this, match,
				choiceStep, prevStep, flow, step);
		if (result_pattern_SplitAfterMerge_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterMerge_10_2_binding[0];

			Object[] result_pattern_SplitAfterMerge_10_2_black = pattern_SplitAfterMerge_10_2_blackB(csp);
			if (result_pattern_SplitAfterMerge_10_2_black != null) {

				return new Object[] { csp, _this, match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterMerge_10_3_expressionFBB(SplitAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_10_4_blackBBBBB(Match match, ChoiceStep choiceStep,
			Step prevStep, Flow flow, ParallelStep step) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				return new Object[] { match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_10_4_greenBBBBFF(Match match, Step prevStep, Flow flow,
			ParallelStep step) {
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

	public static final Object[] pattern_SplitAfterMerge_10_5_blackBBBBB(Match match, ChoiceStep choiceStep,
			Step prevStep, Flow flow, ParallelStep step) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				return new Object[] { match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_10_5_greenBBBBFF(Match match, ChoiceStep choiceStep,
			Step prevStep, Flow flow) {
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(choiceStep);
		match.getContextNodes().add(prevStep);
		match.getContextNodes().add(flow);
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__prevStep____steps_name_prime = "steps";
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		match.getContextEdges().add(flow__choiceStep____steps);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		match.getContextEdges().add(flow__prevStep____steps);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		return new Object[] { match, choiceStep, prevStep, flow, flow__choiceStep____steps, flow__prevStep____steps };
	}

	public static final void pattern_SplitAfterMerge_10_6_expressionBBBBBB(SplitAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, ParallelStep step) {
		_this.registerObjectsToMatch_BWD(match, choiceStep, prevStep, flow, step);

	}

	public static final boolean pattern_SplitAfterMerge_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_11_1_bindingFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
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
							if (tmpStep instanceof ParallelStep) {
								ParallelStep step = (ParallelStep) tmpStep;
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

	public static final Object[] pattern_SplitAfterMerge_11_1_blackBBBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, ParallelStep step, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process, SplitAfterMerge _this,
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

	public static final Object[] pattern_SplitAfterMerge_11_1_bindingAndBlackFFFFFFFFFFBFB(SplitAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SplitAfterMerge_11_1_binding = pattern_SplitAfterMerge_11_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SplitAfterMerge_11_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_SplitAfterMerge_11_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_SplitAfterMerge_11_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_SplitAfterMerge_11_1_binding[2];
			Step prevStep = (Step) result_pattern_SplitAfterMerge_11_1_binding[3];
			Flow flow = (Flow) result_pattern_SplitAfterMerge_11_1_binding[4];
			ParallelStep step = (ParallelStep) result_pattern_SplitAfterMerge_11_1_binding[5];
			SequenceFlow prevInFlow = (SequenceFlow) result_pattern_SplitAfterMerge_11_1_binding[6];
			FlowNode prevPrevNode = (FlowNode) result_pattern_SplitAfterMerge_11_1_binding[7];
			FN2S fn2ps = (FN2S) result_pattern_SplitAfterMerge_11_1_binding[8];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_SplitAfterMerge_11_1_binding[9];

			Object[] result_pattern_SplitAfterMerge_11_1_black = pattern_SplitAfterMerge_11_1_blackBBBBBBBBBBBFB(
					prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, _this,
					isApplicableMatch);
			if (result_pattern_SplitAfterMerge_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SplitAfterMerge_11_1_black[11];

				return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode,
						fn2ps, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_11_1_greenBBBFFFFFB(ExclusiveGateway prevNode,
			ParallelStep step, de.abilov.bpmn.Process process, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		ParallelGateway pgw = BpmnFactory.eINSTANCE.createParallelGateway();
		FN2S pcgwToStep = Bpmn2useCaseFactory.eINSTANCE.createFN2S();
		GW2S pgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		ParallelGateway pcgw = BpmnFactory.eINSTANCE.createParallelGateway();
		boolean pgw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("pgw", "id");
		boolean pcgw_isDiverging_prime = false;
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		process.getFlowElements().add(pgw);
		sf1.setTargetRef(pgw);
		pcgwToStep.setTarget(step);
		pgwToStep.setSource(pgw);
		pgwToStep.setTarget(step);
		process.getFlowElements().add(pcgw);
		pgw.set__conv(pcgw);
		pcgwToStep.setSource(pcgw);
		pgw.setIsDiverging(Boolean.valueOf(pgw_isDiverging_prime));
		String pgw_id_prime = (String) _localVariable_0;
		pcgw.setIsDiverging(Boolean.valueOf(pcgw_isDiverging_prime));
		pgw.setId(pgw_id_prime);
		return new Object[] { prevNode, step, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw, csp };
	}

	public static final Object[] pattern_SplitAfterMerge_11_2_blackBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		if (!pcgw.equals(pgw)) {
			return new Object[] { step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_11_2_greenFBBBBBB(ParallelStep step, SequenceFlow sf1,
			ParallelGateway pgw, FN2S pcgwToStep, GW2S pgwToStep, ParallelGateway pcgw) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getCreatedElements().add(pgw);
		ruleresult.getCreatedLinkElements().add(pcgwToStep);
		ruleresult.getCreatedLinkElements().add(pgwToStep);
		ruleresult.getCreatedElements().add(pcgw);
		return new Object[] { ruleresult, step, sf1, pgw, pcgwToStep, pgwToStep, pcgw };
	}

	public static final Object[] pattern_SplitAfterMerge_11_3_blackBBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep, EObject flow, EObject step,
			EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject process, EObject sf1, EObject pgw,
			EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!prevNode.equals(process)) {
						if (!prevNode.equals(sf1)) {
							if (!choiceStep.equals(prevNode)) {
								if (!choiceStep.equals(pn2cs)) {
									if (!choiceStep.equals(prevStep)) {
										if (!choiceStep.equals(flow)) {
											if (!choiceStep.equals(step)) {
												if (!choiceStep.equals(prevInFlow)) {
													if (!choiceStep.equals(prevPrevNode)) {
														if (!choiceStep.equals(fn2ps)) {
															if (!choiceStep.equals(process)) {
																if (!choiceStep.equals(sf1)) {
																	if (!choiceStep.equals(pgw)) {
																		if (!choiceStep.equals(pcgwToStep)) {
																			if (!choiceStep.equals(pgwToStep)) {
																				if (!choiceStep.equals(pcgw)) {
																					if (!pn2cs.equals(prevNode)) {
																						if (!pn2cs.equals(prevStep)) {
																							if (!pn2cs.equals(step)) {
																								if (!pn2cs.equals(
																										prevInFlow)) {
																									if (!pn2cs.equals(
																											prevPrevNode)) {
																										if (!pn2cs
																												.equals(process)) {
																											if (!pn2cs
																													.equals(sf1)) {
																												if (!prevStep
																														.equals(step)) {
																													if (!prevStep
																															.equals(process)) {
																														if (!prevStep
																																.equals(sf1)) {
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
																																								.equals(process)) {
																																							if (!flow
																																									.equals(sf1)) {
																																								if (!flow
																																										.equals(pgw)) {
																																									if (!flow
																																											.equals(pcgwToStep)) {
																																										if (!flow
																																												.equals(pgwToStep)) {
																																											if (!flow
																																													.equals(pcgw)) {
																																												if (!prevInFlow
																																														.equals(prevNode)) {
																																													if (!prevInFlow
																																															.equals(prevStep)) {
																																														if (!prevInFlow
																																																.equals(step)) {
																																															if (!prevInFlow
																																																	.equals(prevPrevNode)) {
																																																if (!prevInFlow
																																																		.equals(process)) {
																																																	if (!prevInFlow
																																																			.equals(sf1)) {
																																																		if (!prevPrevNode
																																																				.equals(prevStep)) {
																																																			if (!prevPrevNode
																																																					.equals(step)) {
																																																				if (!prevPrevNode
																																																						.equals(process)) {
																																																					if (!prevPrevNode
																																																							.equals(sf1)) {
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
																																																														.equals(process)) {
																																																													if (!fn2ps
																																																															.equals(sf1)) {
																																																														if (!fn2ps
																																																																.equals(pgw)) {
																																																															if (!fn2ps
																																																																	.equals(pcgwToStep)) {
																																																																if (!fn2ps
																																																																		.equals(pgwToStep)) {
																																																																	if (!fn2ps
																																																																			.equals(pcgw)) {
																																																																		if (!process
																																																																				.equals(step)) {
																																																																			if (!process
																																																																					.equals(sf1)) {
																																																																				if (!sf1.equals(
																																																																						step)) {
																																																																					if (!pgw.equals(
																																																																							prevNode)) {
																																																																						if (!pgw.equals(
																																																																								pn2cs)) {
																																																																							if (!pgw.equals(
																																																																									prevStep)) {
																																																																								if (!pgw.equals(
																																																																										step)) {
																																																																									if (!pgw.equals(
																																																																											prevInFlow)) {
																																																																										if (!pgw.equals(
																																																																												prevPrevNode)) {
																																																																											if (!pgw.equals(
																																																																													process)) {
																																																																												if (!pgw.equals(
																																																																														sf1)) {
																																																																													if (!pgw.equals(
																																																																															pgwToStep)) {
																																																																														if (!pcgwToStep
																																																																																.equals(prevNode)) {
																																																																															if (!pcgwToStep
																																																																																	.equals(pn2cs)) {
																																																																																if (!pcgwToStep
																																																																																		.equals(prevStep)) {
																																																																																	if (!pcgwToStep
																																																																																			.equals(step)) {
																																																																																		if (!pcgwToStep
																																																																																				.equals(prevInFlow)) {
																																																																																			if (!pcgwToStep
																																																																																					.equals(prevPrevNode)) {
																																																																																				if (!pcgwToStep
																																																																																						.equals(process)) {
																																																																																					if (!pcgwToStep
																																																																																							.equals(sf1)) {
																																																																																						if (!pcgwToStep
																																																																																								.equals(pgw)) {
																																																																																							if (!pcgwToStep
																																																																																									.equals(pgwToStep)) {
																																																																																								if (!pgwToStep
																																																																																										.equals(prevNode)) {
																																																																																									if (!pgwToStep
																																																																																											.equals(pn2cs)) {
																																																																																										if (!pgwToStep
																																																																																												.equals(prevStep)) {
																																																																																											if (!pgwToStep
																																																																																													.equals(step)) {
																																																																																												if (!pgwToStep
																																																																																														.equals(prevInFlow)) {
																																																																																													if (!pgwToStep
																																																																																															.equals(prevPrevNode)) {
																																																																																														if (!pgwToStep
																																																																																																.equals(process)) {
																																																																																															if (!pgwToStep
																																																																																																	.equals(sf1)) {
																																																																																																if (!pcgw
																																																																																																		.equals(prevNode)) {
																																																																																																	if (!pcgw
																																																																																																			.equals(pn2cs)) {
																																																																																																		if (!pcgw
																																																																																																				.equals(prevStep)) {
																																																																																																			if (!pcgw
																																																																																																					.equals(step)) {
																																																																																																				if (!pcgw
																																																																																																						.equals(prevInFlow)) {
																																																																																																					if (!pcgw
																																																																																																							.equals(prevPrevNode)) {
																																																																																																						if (!pcgw
																																																																																																								.equals(process)) {
																																																																																																							if (!pcgw
																																																																																																									.equals(sf1)) {
																																																																																																								if (!pcgw
																																																																																																										.equals(pgw)) {
																																																																																																									if (!pcgw
																																																																																																											.equals(pcgwToStep)) {
																																																																																																										if (!pcgw
																																																																																																												.equals(pgwToStep)) {
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
																																																																																																													process,
																																																																																																													sf1,
																																																																																																													pgw,
																																																																																																													pcgwToStep,
																																																																																																													pgwToStep,
																																																																																																													pcgw };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SplitAfterMerge_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject flow, EObject step,
			EObject process, EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__pcgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__pgw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgw__pcgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__pcgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pcgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__pgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SplitAfterMerge";
		String prevStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String process__pgw____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__pcgw____flowElements_name_prime = "flowElements";
		String sf1__pgw____targetRef_name_prime = "targetRef";
		String pgw__sf1____incoming_name_prime = "incoming";
		String pgw__pcgw______conv_name_prime = "__conv";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String pcgwToStep__pcgw____source_name_prime = "source";
		String pcgwToStep__step____target_name_prime = "target";
		String pgwToStep__pgw____source_name_prime = "source";
		String pgwToStep__step____target_name_prime = "target";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(prevStep__step____next);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		process__pgw____flowElements.setSrc(process);
		process__pgw____flowElements.setTrg(pgw);
		ruleresult.getCreatedEdges().add(process__pgw____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		process__pcgw____flowElements.setSrc(process);
		process__pcgw____flowElements.setTrg(pcgw);
		ruleresult.getCreatedEdges().add(process__pcgw____flowElements);
		sf1__pgw____targetRef.setSrc(sf1);
		sf1__pgw____targetRef.setTrg(pgw);
		ruleresult.getCreatedEdges().add(sf1__pgw____targetRef);
		pgw__sf1____incoming.setSrc(pgw);
		pgw__sf1____incoming.setTrg(sf1);
		ruleresult.getCreatedEdges().add(pgw__sf1____incoming);
		pgw__pcgw______conv.setSrc(pgw);
		pgw__pcgw______conv.setTrg(pcgw);
		ruleresult.getCreatedEdges().add(pgw__pcgw______conv);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		pcgwToStep__pcgw____source.setSrc(pcgwToStep);
		pcgwToStep__pcgw____source.setTrg(pcgw);
		ruleresult.getCreatedEdges().add(pcgwToStep__pcgw____source);
		pcgwToStep__step____target.setSrc(pcgwToStep);
		pcgwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(pcgwToStep__step____target);
		pgwToStep__pgw____source.setSrc(pgwToStep);
		pgwToStep__pgw____source.setTrg(pgw);
		ruleresult.getCreatedEdges().add(pgwToStep__pgw____source);
		pgwToStep__step____target.setSrc(pgwToStep);
		pgwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(pgwToStep__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__pgw____flowElements.setName(process__pgw____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__pcgw____flowElements.setName(process__pcgw____flowElements_name_prime);
		sf1__pgw____targetRef.setName(sf1__pgw____targetRef_name_prime);
		pgw__sf1____incoming.setName(pgw__sf1____incoming_name_prime);
		pgw__pcgw______conv.setName(pgw__pcgw______conv_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		pcgwToStep__pcgw____source.setName(pcgwToStep__pcgw____source_name_prime);
		pcgwToStep__step____target.setName(pcgwToStep__step____target_name_prime);
		pgwToStep__pgw____source.setName(pgwToStep__pgw____source_name_prime);
		pgwToStep__step____target.setName(pgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, prevNode, prevStep, flow, step, process, sf1, pgw, pcgwToStep, pgwToStep,
				pcgw, prevStep__step____next, flow__step____steps, process__pgw____flowElements,
				process__sf1____flowElements, process__pcgw____flowElements, sf1__pgw____targetRef,
				pgw__sf1____incoming, pgw__pcgw______conv, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				pcgwToStep__pcgw____source, pcgwToStep__step____target, pgwToStep__pgw____source,
				pgwToStep__step____target };
	}

	public static final void pattern_SplitAfterMerge_11_5_expressionBBBBBBBBBBBBBBBBB(SplitAfterMerge _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep,
			EObject flow, EObject step, EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject process,
			EObject sf1, EObject pgw, EObject pcgwToStep, EObject pgwToStep, EObject pcgw) {
		_this.registerObjects_BWD(ruleresult, prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow,
				prevPrevNode, fn2ps, process, sf1, pgw, pcgwToStep, pgwToStep, pcgw);

	}

	public static final PerformRuleResult pattern_SplitAfterMerge_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_12_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_12_1_blackFBB(EClass eClass, SplitAfterMerge _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_12_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_12_1_binding = pattern_SplitAfterMerge_12_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SplitAfterMerge_12_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_12_1_black = pattern_SplitAfterMerge_12_1_blackFBB(eClass, _this);
			if (result_pattern_SplitAfterMerge_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SplitAfterMerge_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SplitAfterMerge";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SplitAfterMerge_12_2_bindingFFFFB(Match match) {
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
					if (tmpStep instanceof ParallelStep) {
						ParallelStep step = (ParallelStep) tmpStep;
						return new Object[] { choiceStep, prevStep, flow, step, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_12_2_blackFBFBBBFFB(ChoiceStep choiceStep,
			Step prevStep, Flow flow, ParallelStep step, Match match) {
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

	public static final Iterable<Object[]> pattern_SplitAfterMerge_12_3_blackBBBBBBFBBF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, ParallelStep step, FlowNode prevPrevNode,
			FN2S fn2ps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(prevPrevNode)) {
			if (!choiceStep.equals(prevStep)) {
				if (!prevStep.equals(step)) {
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
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, ParallelStep step, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge prevInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__prevInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevInFlow__prevPrevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevPrevNode__prevInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fn2ps__prevPrevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge fn2ps__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String prevInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__prevInFlow____incoming_name_prime = "incoming";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String prevStep__step____next_name_prime = "next";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__prevStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
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
		prevInFlow__prevNode____targetRef.setName(prevInFlow__prevNode____targetRef_name_prime);
		prevNode__prevInFlow____incoming.setName(prevNode__prevInFlow____incoming_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		prevInFlow__prevPrevNode____sourceRef.setName(prevInFlow__prevPrevNode____sourceRef_name_prime);
		prevPrevNode__prevInFlow____outgoing.setName(prevPrevNode__prevInFlow____outgoing_name_prime);
		fn2ps__prevPrevNode____source.setName(fn2ps__prevPrevNode____source_name_prime);
		fn2ps__prevStep____target.setName(fn2ps__prevStep____target_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps,
				process, isApplicableMatch, prevInFlow__prevNode____targetRef, prevNode__prevInFlow____incoming,
				pn2cs__prevNode____source, pn2cs__choiceStep____target, prevStep__step____next,
				flow__choiceStep____steps, flow__prevStep____steps, flow__step____steps,
				prevInFlow__prevPrevNode____sourceRef, prevPrevNode__prevInFlow____outgoing,
				fn2ps__prevPrevNode____source, fn2ps__prevStep____target, process__prevNode____flowElements };
	}

	public static final Object[] pattern_SplitAfterMerge_12_4_bindingFBBBBBBBBBBBB(SplitAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, ParallelStep step, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
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

	public static final Object[] pattern_SplitAfterMerge_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SplitAfterMerge_12_4_bindingAndBlackFBBBBBBBBBBBB(SplitAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, ParallelStep step, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process) {
		Object[] result_pattern_SplitAfterMerge_12_4_binding = pattern_SplitAfterMerge_12_4_bindingFBBBBBBBBBBBB(_this,
				isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps,
				process);
		if (result_pattern_SplitAfterMerge_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SplitAfterMerge_12_4_binding[0];

			Object[] result_pattern_SplitAfterMerge_12_4_black = pattern_SplitAfterMerge_12_4_blackB(csp);
			if (result_pattern_SplitAfterMerge_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step,
						prevInFlow, prevPrevNode, fn2ps, process };
			}
		}
		return null;
	}

	public static final boolean pattern_SplitAfterMerge_12_5_expressionFBB(SplitAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SplitAfterMerge_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SplitAfterMerge";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SplitAfterMerge_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_20_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_20_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_20_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_20_1_binding = pattern_SplitAfterMerge_20_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_20_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_20_1_black = pattern_SplitAfterMerge_20_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_20_2_black_nac_0BB(ParallelStep step, Flow flow) {
		for (Flow __DEC_step_steps_536056 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_536056)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_20_2_black_nac_1BBB(ParallelStep step, ChoiceStep choiceStep,
			Step prevStep) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (Step __DEC_step_next_215744 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(step, Step.class, "next")) {
					if (!step.equals(__DEC_step_next_215744)) {
						if (!choiceStep.equals(__DEC_step_next_215744)) {
							if (!prevStep.equals(__DEC_step_next_215744)) {
								return new Object[] { step, choiceStep, prevStep };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_20_2_black_nac_2BB(ChoiceStep choiceStep, ParallelStep step) {
		if (step.equals(choiceStep.getNext())) {
			return new Object[] { choiceStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_20_2_blackFFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (!prevStep.equals(step)) {
					if (step.equals(prevStep.getNext())) {
						for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevStep,
								Flow.class, "steps")) {
							if (flow.getSteps().contains(step)) {
								if (pattern_SplitAfterMerge_20_2_black_nac_0BB(step, flow) == null) {
									for (Step tmpChoiceStep : flow.getSteps()) {
										if (tmpChoiceStep instanceof ChoiceStep) {
											ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
											if (!choiceStep.equals(prevStep)) {
												if (pattern_SplitAfterMerge_20_2_black_nac_1BBB(step, choiceStep,
														prevStep) == null) {
													if (pattern_SplitAfterMerge_20_2_black_nac_2BB(choiceStep,
															step) == null) {
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

	public static final Object[] pattern_SplitAfterMerge_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_20_3_expressionFBBBBBB(SplitAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, prevStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_20_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_21_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_21_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_21_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_21_1_binding = pattern_SplitAfterMerge_21_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_21_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_21_1_black = pattern_SplitAfterMerge_21_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_21_2_black_nac_0BB(ParallelStep step, Flow flow) {
		for (Flow __DEC_step_steps_177132 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_177132)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_21_2_black_nac_1BBB(ParallelStep step, ChoiceStep choiceStep,
			Step prevStep) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (Step __DEC_step_next_68938 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(step, Step.class, "next")) {
					if (!step.equals(__DEC_step_next_68938)) {
						if (!choiceStep.equals(__DEC_step_next_68938)) {
							if (!prevStep.equals(__DEC_step_next_68938)) {
								return new Object[] { step, choiceStep, prevStep };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_21_2_black_nac_2BB(ChoiceStep choiceStep, ParallelStep step) {
		if (step.equals(choiceStep.getNext())) {
			return new Object[] { choiceStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_21_2_blackFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ParallelStep) {
				ParallelStep step = (ParallelStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_SplitAfterMerge_21_2_black_nac_0BB(step, flow) == null) {
						for (Step tmpChoiceStep : flow.getSteps()) {
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								if (pattern_SplitAfterMerge_21_2_black_nac_2BB(choiceStep, step) == null) {
									for (Step prevStep : flow.getSteps()) {
										if (!choiceStep.equals(prevStep)) {
											if (!prevStep.equals(step)) {
												if (step.equals(prevStep.getNext())) {
													if (pattern_SplitAfterMerge_21_2_black_nac_1BBB(step, choiceStep,
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

		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_21_3_expressionFBBBBBB(SplitAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, ParallelStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, prevStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_21_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_22_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_22_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_22_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_22_1_binding = pattern_SplitAfterMerge_22_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_22_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_22_1_black = pattern_SplitAfterMerge_22_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_724843 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_724843)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_724843)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_442766 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_442766)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_935419 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_935419)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_3BBBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevPrevNode)) {
			if (!prevNode.equals(prevPrevNode)) {
				if (!pcgw.equals(pgw)) {
					if (!pcgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pgw___conv_778480 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
							if (!pgw.equals(__DEC_pgw___conv_778480)) {
								if (!prevNode.equals(__DEC_pgw___conv_778480)) {
									if (!prevPrevNode.equals(__DEC_pgw___conv_778480)) {
										if (!pcgw.equals(__DEC_pgw___conv_778480)) {
											return new Object[] { pgw, prevNode, prevPrevNode, pcgw };
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

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_4BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						Gateway __DEC_pcgw___conv_699870 = pcgw.get__conv();
						if (__DEC_pcgw___conv_699870 != null) {
							if (!pcgw.equals(__DEC_pcgw___conv_699870)) {
								if (!prevNode.equals(__DEC_pcgw___conv_699870)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_699870)) {
										if (!pgw.equals(__DEC_pcgw___conv_699870)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_74299 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_74299)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_6BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pcgw___conv_749675 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
							if (!pcgw.equals(__DEC_pcgw___conv_749675)) {
								if (!prevNode.equals(__DEC_pcgw___conv_749675)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_749675)) {
										if (!pgw.equals(__DEC_pcgw___conv_749675)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_22_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_22_2_blackFFFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpPgw = _edge_flowElements.getTrg();
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (process.getFlowElements().contains(pgw)) {
					Gateway tmpPcgw = pgw.get__conv();
					if (tmpPcgw instanceof ParallelGateway) {
						ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
						if (!pcgw.equals(pgw)) {
							if (process.getFlowElements().contains(pcgw)) {
								boolean pgwisDiverging = pgw.isIsDiverging();
								if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
									boolean pcgwisDiverging = pcgw.isIsDiverging();
									if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
										if (pattern_SplitAfterMerge_22_2_black_nac_2BB(pgw, process) == null) {
											if (pattern_SplitAfterMerge_22_2_black_nac_5BB(pcgw, process) == null) {
												for (FlowElement tmpSf1 : process.getFlowElements()) {
													if (tmpSf1 instanceof SequenceFlow) {
														SequenceFlow sf1 = (SequenceFlow) tmpSf1;
														if (pgw.equals(sf1.getTargetRef())) {
															FlowNode tmpPrevNode = sf1.getSourceRef();
															if (tmpPrevNode instanceof ExclusiveGateway) {
																ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
																if (process.getFlowElements().contains(prevNode)) {
																	boolean prevNodeisDiverging = prevNode
																			.isIsDiverging();
																	if (Boolean.valueOf(prevNodeisDiverging)
																			.equals(false)) {
																		if (pattern_SplitAfterMerge_22_2_black_nac_1BB(
																				sf1, process) == null) {
																			if (pattern_SplitAfterMerge_22_2_black_nac_7BB(
																					prevNode, sf1) == null) {
																				if (pattern_SplitAfterMerge_22_2_black_nac_8BB(
																						prevNode, pgw) == null) {
																					if (pattern_SplitAfterMerge_22_2_black_nac_9BB(
																							pcgw, prevNode) == null) {
																						for (SequenceFlow prevInFlow : prevNode
																								.getIncoming()) {
																							if (!prevInFlow
																									.equals(sf1)) {
																								FlowNode prevPrevNode = prevInFlow
																										.getSourceRef();
																								if (prevPrevNode != null) {
																									if (!prevNode
																											.equals(prevPrevNode)) {
																										if (!pgw.equals(
																												prevPrevNode)) {
																											if (!pcgw
																													.equals(prevPrevNode)) {
																												if (pattern_SplitAfterMerge_22_2_black_nac_0BBB(
																														sf1,
																														prevNode,
																														prevPrevNode) == null) {
																													if (pattern_SplitAfterMerge_22_2_black_nac_3BBBB(
																															pgw,
																															prevNode,
																															prevPrevNode,
																															pcgw) == null) {
																														if (pattern_SplitAfterMerge_22_2_black_nac_4BBBB(
																																pcgw,
																																prevNode,
																																prevPrevNode,
																																pgw) == null) {
																															if (pattern_SplitAfterMerge_22_2_black_nac_6BBBB(
																																	pcgw,
																																	prevNode,
																																	prevPrevNode,
																																	pgw) == null) {
																																_result.add(
																																		new Object[] {
																																				prevNode,
																																				prevInFlow,
																																				prevPrevNode,
																																				process,
																																				sf1,
																																				pgw,
																																				pcgw,
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
											}
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

	public static final Object[] pattern_SplitAfterMerge_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_22_3_expressionFBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw,
				pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_22_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_23_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_23_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_23_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_23_1_binding = pattern_SplitAfterMerge_23_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_23_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_23_1_black = pattern_SplitAfterMerge_23_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_492175 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_492175)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_492175)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_376565 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_376565)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_398073 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_398073)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_3BBBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevPrevNode)) {
			if (!prevNode.equals(prevPrevNode)) {
				if (!pcgw.equals(pgw)) {
					if (!pcgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pgw___conv_61868 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
							if (!pgw.equals(__DEC_pgw___conv_61868)) {
								if (!prevNode.equals(__DEC_pgw___conv_61868)) {
									if (!prevPrevNode.equals(__DEC_pgw___conv_61868)) {
										if (!pcgw.equals(__DEC_pgw___conv_61868)) {
											return new Object[] { pgw, prevNode, prevPrevNode, pcgw };
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

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_4BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						Gateway __DEC_pcgw___conv_696976 = pcgw.get__conv();
						if (__DEC_pcgw___conv_696976 != null) {
							if (!pcgw.equals(__DEC_pcgw___conv_696976)) {
								if (!prevNode.equals(__DEC_pcgw___conv_696976)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_696976)) {
										if (!pgw.equals(__DEC_pcgw___conv_696976)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_650496 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_650496)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_6BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pcgw___conv_513353 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
							if (!pcgw.equals(__DEC_pcgw___conv_513353)) {
								if (!prevNode.equals(__DEC_pcgw___conv_513353)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_513353)) {
										if (!pgw.equals(__DEC_pcgw___conv_513353)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_23_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_23_2_blackFFFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpSf1 = _edge_flowElements.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (process.getFlowElements().contains(sf1)) {
					FlowNode tmpPgw = sf1.getTargetRef();
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						if (process.getFlowElements().contains(pgw)) {
							FlowNode tmpPrevNode = sf1.getSourceRef();
							if (tmpPrevNode instanceof ExclusiveGateway) {
								ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
								if (process.getFlowElements().contains(prevNode)) {
									Gateway tmpPcgw = pgw.get__conv();
									if (tmpPcgw instanceof ParallelGateway) {
										ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
										if (!pcgw.equals(pgw)) {
											if (process.getFlowElements().contains(pcgw)) {
												boolean pgwisDiverging = pgw.isIsDiverging();
												if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
													boolean prevNodeisDiverging = prevNode.isIsDiverging();
													if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
														boolean pcgwisDiverging = pcgw.isIsDiverging();
														if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
															if (pattern_SplitAfterMerge_23_2_black_nac_1BB(sf1,
																	process) == null) {
																if (pattern_SplitAfterMerge_23_2_black_nac_2BB(pgw,
																		process) == null) {
																	if (pattern_SplitAfterMerge_23_2_black_nac_7BB(
																			prevNode, sf1) == null) {
																		if (pattern_SplitAfterMerge_23_2_black_nac_8BB(
																				prevNode, pgw) == null) {
																			if (pattern_SplitAfterMerge_23_2_black_nac_5BB(
																					pcgw, process) == null) {
																				if (pattern_SplitAfterMerge_23_2_black_nac_9BB(
																						pcgw, prevNode) == null) {
																					for (SequenceFlow prevInFlow : prevNode
																							.getIncoming()) {
																						if (!prevInFlow.equals(sf1)) {
																							FlowNode prevPrevNode = prevInFlow
																									.getSourceRef();
																							if (prevPrevNode != null) {
																								if (!prevNode.equals(
																										prevPrevNode)) {
																									if (!pgw.equals(
																											prevPrevNode)) {
																										if (!pcgw
																												.equals(prevPrevNode)) {
																											if (pattern_SplitAfterMerge_23_2_black_nac_0BBB(
																													sf1,
																													prevNode,
																													prevPrevNode) == null) {
																												if (pattern_SplitAfterMerge_23_2_black_nac_3BBBB(
																														pgw,
																														prevNode,
																														prevPrevNode,
																														pcgw) == null) {
																													if (pattern_SplitAfterMerge_23_2_black_nac_4BBBB(
																															pcgw,
																															prevNode,
																															prevPrevNode,
																															pgw) == null) {
																														if (pattern_SplitAfterMerge_23_2_black_nac_6BBBB(
																																pcgw,
																																prevNode,
																																prevPrevNode,
																																pgw) == null) {
																															_result.add(
																																	new Object[] {
																																			prevNode,
																																			prevInFlow,
																																			prevPrevNode,
																																			process,
																																			sf1,
																																			pgw,
																																			pcgw,
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

	public static final Object[] pattern_SplitAfterMerge_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_23_3_expressionFBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw,
				pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_23_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_24_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_24_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_24_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_24_1_binding = pattern_SplitAfterMerge_24_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_24_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_24_1_black = pattern_SplitAfterMerge_24_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_770101 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_770101)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_770101)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_566769 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_566769)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_908330 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_908330)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_3BBBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevPrevNode)) {
			if (!prevNode.equals(prevPrevNode)) {
				if (!pcgw.equals(pgw)) {
					if (!pcgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pgw___conv_236079 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
							if (!pgw.equals(__DEC_pgw___conv_236079)) {
								if (!prevNode.equals(__DEC_pgw___conv_236079)) {
									if (!prevPrevNode.equals(__DEC_pgw___conv_236079)) {
										if (!pcgw.equals(__DEC_pgw___conv_236079)) {
											return new Object[] { pgw, prevNode, prevPrevNode, pcgw };
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

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_4BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						Gateway __DEC_pcgw___conv_132513 = pcgw.get__conv();
						if (__DEC_pcgw___conv_132513 != null) {
							if (!pcgw.equals(__DEC_pcgw___conv_132513)) {
								if (!prevNode.equals(__DEC_pcgw___conv_132513)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_132513)) {
										if (!pgw.equals(__DEC_pcgw___conv_132513)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_45112 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_45112)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_6BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pcgw___conv_218975 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
							if (!pcgw.equals(__DEC_pcgw___conv_218975)) {
								if (!prevNode.equals(__DEC_pcgw___conv_218975)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_218975)) {
										if (!pgw.equals(__DEC_pcgw___conv_218975)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_24_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_24_2_blackFFFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpPcgw = _edge_flowElements.getTrg();
			if (tmpPcgw instanceof ParallelGateway) {
				ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
				if (process.getFlowElements().contains(pcgw)) {
					boolean pcgwisDiverging = pcgw.isIsDiverging();
					if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
						if (pattern_SplitAfterMerge_24_2_black_nac_5BB(pcgw, process) == null) {
							for (FlowElement tmpPgw : process.getFlowElements()) {
								if (tmpPgw instanceof ParallelGateway) {
									ParallelGateway pgw = (ParallelGateway) tmpPgw;
									if (!pcgw.equals(pgw)) {
										if (pcgw.equals(pgw.get__conv())) {
											boolean pgwisDiverging = pgw.isIsDiverging();
											if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
												if (pattern_SplitAfterMerge_24_2_black_nac_2BB(pgw, process) == null) {
													for (FlowElement tmpSf1 : process.getFlowElements()) {
														if (tmpSf1 instanceof SequenceFlow) {
															SequenceFlow sf1 = (SequenceFlow) tmpSf1;
															if (pgw.equals(sf1.getTargetRef())) {
																FlowNode tmpPrevNode = sf1.getSourceRef();
																if (tmpPrevNode instanceof ExclusiveGateway) {
																	ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
																	if (process.getFlowElements().contains(prevNode)) {
																		boolean prevNodeisDiverging = prevNode
																				.isIsDiverging();
																		if (Boolean.valueOf(prevNodeisDiverging)
																				.equals(false)) {
																			if (pattern_SplitAfterMerge_24_2_black_nac_1BB(
																					sf1, process) == null) {
																				if (pattern_SplitAfterMerge_24_2_black_nac_7BB(
																						prevNode, sf1) == null) {
																					if (pattern_SplitAfterMerge_24_2_black_nac_8BB(
																							prevNode, pgw) == null) {
																						if (pattern_SplitAfterMerge_24_2_black_nac_9BB(
																								pcgw,
																								prevNode) == null) {
																							for (SequenceFlow prevInFlow : prevNode
																									.getIncoming()) {
																								if (!prevInFlow
																										.equals(sf1)) {
																									FlowNode prevPrevNode = prevInFlow
																											.getSourceRef();
																									if (prevPrevNode != null) {
																										if (!prevNode
																												.equals(prevPrevNode)) {
																											if (!pgw.equals(
																													prevPrevNode)) {
																												if (!pcgw
																														.equals(prevPrevNode)) {
																													if (pattern_SplitAfterMerge_24_2_black_nac_0BBB(
																															sf1,
																															prevNode,
																															prevPrevNode) == null) {
																														if (pattern_SplitAfterMerge_24_2_black_nac_3BBBB(
																																pgw,
																																prevNode,
																																prevPrevNode,
																																pcgw) == null) {
																															if (pattern_SplitAfterMerge_24_2_black_nac_4BBBB(
																																	pcgw,
																																	prevNode,
																																	prevPrevNode,
																																	pgw) == null) {
																																if (pattern_SplitAfterMerge_24_2_black_nac_6BBBB(
																																		pcgw,
																																		prevNode,
																																		prevPrevNode,
																																		pgw) == null) {
																																	_result.add(
																																			new Object[] {
																																					prevNode,
																																					prevInFlow,
																																					prevPrevNode,
																																					process,
																																					sf1,
																																					pgw,
																																					pcgw,
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
												}
											}

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

	public static final Object[] pattern_SplitAfterMerge_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_24_3_expressionFBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw,
				pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_24_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_25_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_25_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_25_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_25_1_binding = pattern_SplitAfterMerge_25_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_25_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_25_1_black = pattern_SplitAfterMerge_25_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_654684 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_654684)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_654684)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_696705 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_696705)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_942181 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_942181)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_3BBBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevPrevNode)) {
			if (!prevNode.equals(prevPrevNode)) {
				if (!pcgw.equals(pgw)) {
					if (!pcgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pgw___conv_386055 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
							if (!pgw.equals(__DEC_pgw___conv_386055)) {
								if (!prevNode.equals(__DEC_pgw___conv_386055)) {
									if (!prevPrevNode.equals(__DEC_pgw___conv_386055)) {
										if (!pcgw.equals(__DEC_pgw___conv_386055)) {
											return new Object[] { pgw, prevNode, prevPrevNode, pcgw };
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

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_4BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						Gateway __DEC_pcgw___conv_188899 = pcgw.get__conv();
						if (__DEC_pcgw___conv_188899 != null) {
							if (!pcgw.equals(__DEC_pcgw___conv_188899)) {
								if (!prevNode.equals(__DEC_pcgw___conv_188899)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_188899)) {
										if (!pgw.equals(__DEC_pcgw___conv_188899)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_701973 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_701973)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_6BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pcgw___conv_90148 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
							if (!pcgw.equals(__DEC_pcgw___conv_90148)) {
								if (!prevNode.equals(__DEC_pcgw___conv_90148)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_90148)) {
										if (!pgw.equals(__DEC_pcgw___conv_90148)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_25_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_25_2_blackFFFFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPgw = _edge_targetRef.getTrg();
			if (tmpPgw instanceof ParallelGateway) {
				ParallelGateway pgw = (ParallelGateway) tmpPgw;
				if (pgw.equals(sf1.getTargetRef())) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						Gateway tmpPcgw = pgw.get__conv();
						if (tmpPcgw instanceof ParallelGateway) {
							ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
							if (!pcgw.equals(pgw)) {
								boolean pgwisDiverging = pgw.isIsDiverging();
								if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
										boolean pcgwisDiverging = pcgw.isIsDiverging();
										if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
											if (pattern_SplitAfterMerge_25_2_black_nac_7BB(prevNode, sf1) == null) {
												if (pattern_SplitAfterMerge_25_2_black_nac_8BB(prevNode, pgw) == null) {
													if (pattern_SplitAfterMerge_25_2_black_nac_9BB(pcgw,
															prevNode) == null) {
														for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
															if (!prevInFlow.equals(sf1)) {
																FlowNode prevPrevNode = prevInFlow.getSourceRef();
																if (prevPrevNode != null) {
																	if (!prevNode.equals(prevPrevNode)) {
																		if (!pgw.equals(prevPrevNode)) {
																			if (!pcgw.equals(prevPrevNode)) {
																				if (pattern_SplitAfterMerge_25_2_black_nac_0BBB(
																						sf1, prevNode,
																						prevPrevNode) == null) {
																					if (pattern_SplitAfterMerge_25_2_black_nac_3BBBB(
																							pgw, prevNode, prevPrevNode,
																							pcgw) == null) {
																						if (pattern_SplitAfterMerge_25_2_black_nac_4BBBB(
																								pcgw, prevNode,
																								prevPrevNode,
																								pgw) == null) {
																							if (pattern_SplitAfterMerge_25_2_black_nac_6BBBB(
																									pcgw, prevNode,
																									prevPrevNode,
																									pgw) == null) {
																								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																										.getOppositeReferenceTyped(
																												sf1,
																												de.abilov.bpmn.Process.class,
																												"flowElements")) {
																									if (process
																											.getFlowElements()
																											.contains(
																													pgw)) {
																										if (process
																												.getFlowElements()
																												.contains(
																														prevNode)) {
																											if (process
																													.getFlowElements()
																													.contains(
																															pcgw)) {
																												if (pattern_SplitAfterMerge_25_2_black_nac_1BB(
																														sf1,
																														process) == null) {
																													if (pattern_SplitAfterMerge_25_2_black_nac_2BB(
																															pgw,
																															process) == null) {
																														if (pattern_SplitAfterMerge_25_2_black_nac_5BB(
																																pcgw,
																																process) == null) {
																															_result.add(
																																	new Object[] {
																																			prevNode,
																																			prevInFlow,
																																			prevPrevNode,
																																			process,
																																			sf1,
																																			pgw,
																																			pcgw,
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
											}
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

	public static final Object[] pattern_SplitAfterMerge_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_25_3_expressionFBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw,
				pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_25_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_26_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_26_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_26_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_26_1_binding = pattern_SplitAfterMerge_26_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_26_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_26_1_black = pattern_SplitAfterMerge_26_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_707973 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_707973)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_707973)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_332971 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_332971)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_457328 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_457328)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_3BBBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevPrevNode)) {
			if (!prevNode.equals(prevPrevNode)) {
				if (!pcgw.equals(pgw)) {
					if (!pcgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pgw___conv_945926 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
							if (!pgw.equals(__DEC_pgw___conv_945926)) {
								if (!prevNode.equals(__DEC_pgw___conv_945926)) {
									if (!prevPrevNode.equals(__DEC_pgw___conv_945926)) {
										if (!pcgw.equals(__DEC_pgw___conv_945926)) {
											return new Object[] { pgw, prevNode, prevPrevNode, pcgw };
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

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_4BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						Gateway __DEC_pcgw___conv_988055 = pcgw.get__conv();
						if (__DEC_pcgw___conv_988055 != null) {
							if (!pcgw.equals(__DEC_pcgw___conv_988055)) {
								if (!prevNode.equals(__DEC_pcgw___conv_988055)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_988055)) {
										if (!pgw.equals(__DEC_pcgw___conv_988055)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_875090 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_875090)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_6BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pcgw___conv_785168 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
							if (!pcgw.equals(__DEC_pcgw___conv_785168)) {
								if (!prevNode.equals(__DEC_pcgw___conv_785168)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_785168)) {
										if (!pgw.equals(__DEC_pcgw___conv_785168)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_26_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_26_2_blackFFFFFFFB(EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPgw = _edge_incoming.getSrc();
		if (tmpPgw instanceof ParallelGateway) {
			ParallelGateway pgw = (ParallelGateway) tmpPgw;
			EObject tmpSf1 = _edge_incoming.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (pgw.equals(sf1.getTargetRef())) {
					Gateway tmpPcgw = pgw.get__conv();
					if (tmpPcgw instanceof ParallelGateway) {
						ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
						if (!pcgw.equals(pgw)) {
							boolean pgwisDiverging = pgw.isIsDiverging();
							if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
								FlowNode tmpPrevNode = sf1.getSourceRef();
								if (tmpPrevNode instanceof ExclusiveGateway) {
									ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
									boolean pcgwisDiverging = pcgw.isIsDiverging();
									if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
											if (pattern_SplitAfterMerge_26_2_black_nac_7BB(prevNode, sf1) == null) {
												if (pattern_SplitAfterMerge_26_2_black_nac_8BB(prevNode, pgw) == null) {
													if (pattern_SplitAfterMerge_26_2_black_nac_9BB(pcgw,
															prevNode) == null) {
														for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
															if (!prevInFlow.equals(sf1)) {
																FlowNode prevPrevNode = prevInFlow.getSourceRef();
																if (prevPrevNode != null) {
																	if (!prevNode.equals(prevPrevNode)) {
																		if (!pgw.equals(prevPrevNode)) {
																			if (!pcgw.equals(prevPrevNode)) {
																				if (pattern_SplitAfterMerge_26_2_black_nac_0BBB(
																						sf1, prevNode,
																						prevPrevNode) == null) {
																					if (pattern_SplitAfterMerge_26_2_black_nac_3BBBB(
																							pgw, prevNode, prevPrevNode,
																							pcgw) == null) {
																						if (pattern_SplitAfterMerge_26_2_black_nac_4BBBB(
																								pcgw, prevNode,
																								prevPrevNode,
																								pgw) == null) {
																							if (pattern_SplitAfterMerge_26_2_black_nac_6BBBB(
																									pcgw, prevNode,
																									prevPrevNode,
																									pgw) == null) {
																								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																										.getOppositeReferenceTyped(
																												pgw,
																												de.abilov.bpmn.Process.class,
																												"flowElements")) {
																									if (process
																											.getFlowElements()
																											.contains(
																													sf1)) {
																										if (process
																												.getFlowElements()
																												.contains(
																														prevNode)) {
																											if (process
																													.getFlowElements()
																													.contains(
																															pcgw)) {
																												if (pattern_SplitAfterMerge_26_2_black_nac_1BB(
																														sf1,
																														process) == null) {
																													if (pattern_SplitAfterMerge_26_2_black_nac_2BB(
																															pgw,
																															process) == null) {
																														if (pattern_SplitAfterMerge_26_2_black_nac_5BB(
																																pcgw,
																																process) == null) {
																															_result.add(
																																	new Object[] {
																																			prevNode,
																																			prevInFlow,
																																			prevPrevNode,
																																			process,
																																			sf1,
																																			pgw,
																																			pcgw,
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
											}
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

	public static final Object[] pattern_SplitAfterMerge_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_26_3_expressionFBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw,
				pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_26_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_27_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_27_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_27_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_27_1_binding = pattern_SplitAfterMerge_27_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_27_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_27_1_black = pattern_SplitAfterMerge_27_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_156213 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_156213)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_156213)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_64825 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_64825)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_276385 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_276385)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_3BBBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevPrevNode)) {
			if (!prevNode.equals(prevPrevNode)) {
				if (!pcgw.equals(pgw)) {
					if (!pcgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pgw___conv_738631 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
							if (!pgw.equals(__DEC_pgw___conv_738631)) {
								if (!prevNode.equals(__DEC_pgw___conv_738631)) {
									if (!prevPrevNode.equals(__DEC_pgw___conv_738631)) {
										if (!pcgw.equals(__DEC_pgw___conv_738631)) {
											return new Object[] { pgw, prevNode, prevPrevNode, pcgw };
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

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_4BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						Gateway __DEC_pcgw___conv_506984 = pcgw.get__conv();
						if (__DEC_pcgw___conv_506984 != null) {
							if (!pcgw.equals(__DEC_pcgw___conv_506984)) {
								if (!prevNode.equals(__DEC_pcgw___conv_506984)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_506984)) {
										if (!pgw.equals(__DEC_pcgw___conv_506984)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_891260 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_891260)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_6BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pcgw___conv_65728 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
							if (!pcgw.equals(__DEC_pcgw___conv_65728)) {
								if (!prevNode.equals(__DEC_pcgw___conv_65728)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_65728)) {
										if (!pgw.equals(__DEC_pcgw___conv_65728)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_27_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_27_2_blackFFFFFFFB(EMoflonEdge _edge___conv) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPgw = _edge___conv.getSrc();
		if (tmpPgw instanceof ParallelGateway) {
			ParallelGateway pgw = (ParallelGateway) tmpPgw;
			EObject tmpPcgw = _edge___conv.getTrg();
			if (tmpPcgw instanceof ParallelGateway) {
				ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
				if (!pcgw.equals(pgw)) {
					if (pcgw.equals(pgw.get__conv())) {
						boolean pgwisDiverging = pgw.isIsDiverging();
						if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
							boolean pcgwisDiverging = pcgw.isIsDiverging();
							if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
								for (SequenceFlow sf1 : pgw.getIncoming()) {
									FlowNode tmpPrevNode = sf1.getSourceRef();
									if (tmpPrevNode instanceof ExclusiveGateway) {
										ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
											if (pattern_SplitAfterMerge_27_2_black_nac_7BB(prevNode, sf1) == null) {
												if (pattern_SplitAfterMerge_27_2_black_nac_8BB(prevNode, pgw) == null) {
													if (pattern_SplitAfterMerge_27_2_black_nac_9BB(pcgw,
															prevNode) == null) {
														for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
															if (!prevInFlow.equals(sf1)) {
																FlowNode prevPrevNode = prevInFlow.getSourceRef();
																if (prevPrevNode != null) {
																	if (!prevNode.equals(prevPrevNode)) {
																		if (!pgw.equals(prevPrevNode)) {
																			if (!pcgw.equals(prevPrevNode)) {
																				if (pattern_SplitAfterMerge_27_2_black_nac_0BBB(
																						sf1, prevNode,
																						prevPrevNode) == null) {
																					if (pattern_SplitAfterMerge_27_2_black_nac_3BBBB(
																							pgw, prevNode, prevPrevNode,
																							pcgw) == null) {
																						if (pattern_SplitAfterMerge_27_2_black_nac_4BBBB(
																								pcgw, prevNode,
																								prevPrevNode,
																								pgw) == null) {
																							if (pattern_SplitAfterMerge_27_2_black_nac_6BBBB(
																									pcgw, prevNode,
																									prevPrevNode,
																									pgw) == null) {
																								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																										.getOppositeReferenceTyped(
																												pgw,
																												de.abilov.bpmn.Process.class,
																												"flowElements")) {
																									if (process
																											.getFlowElements()
																											.contains(
																													sf1)) {
																										if (process
																												.getFlowElements()
																												.contains(
																														prevNode)) {
																											if (process
																													.getFlowElements()
																													.contains(
																															pcgw)) {
																												if (pattern_SplitAfterMerge_27_2_black_nac_1BB(
																														sf1,
																														process) == null) {
																													if (pattern_SplitAfterMerge_27_2_black_nac_2BB(
																															pgw,
																															process) == null) {
																														if (pattern_SplitAfterMerge_27_2_black_nac_5BB(
																																pcgw,
																																process) == null) {
																															_result.add(
																																	new Object[] {
																																			prevNode,
																																			prevInFlow,
																																			prevPrevNode,
																																			process,
																																			sf1,
																																			pgw,
																																			pcgw,
																																			_edge___conv });
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SplitAfterMerge_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_27_3_expressionFBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw,
				pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_27_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_28_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_28_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_28_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_28_1_binding = pattern_SplitAfterMerge_28_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_28_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_28_1_black = pattern_SplitAfterMerge_28_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_450101 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_450101)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_450101)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_368054 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_368054)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_981895 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_981895)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_3BBBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevPrevNode)) {
			if (!prevNode.equals(prevPrevNode)) {
				if (!pcgw.equals(pgw)) {
					if (!pcgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pgw___conv_560689 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
							if (!pgw.equals(__DEC_pgw___conv_560689)) {
								if (!prevNode.equals(__DEC_pgw___conv_560689)) {
									if (!prevPrevNode.equals(__DEC_pgw___conv_560689)) {
										if (!pcgw.equals(__DEC_pgw___conv_560689)) {
											return new Object[] { pgw, prevNode, prevPrevNode, pcgw };
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

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_4BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						Gateway __DEC_pcgw___conv_148968 = pcgw.get__conv();
						if (__DEC_pcgw___conv_148968 != null) {
							if (!pcgw.equals(__DEC_pcgw___conv_148968)) {
								if (!prevNode.equals(__DEC_pcgw___conv_148968)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_148968)) {
										if (!pgw.equals(__DEC_pcgw___conv_148968)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_213062 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_213062)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_6BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pcgw___conv_867943 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
							if (!pcgw.equals(__DEC_pcgw___conv_867943)) {
								if (!prevNode.equals(__DEC_pcgw___conv_867943)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_867943)) {
										if (!pgw.equals(__DEC_pcgw___conv_867943)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_28_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_28_2_blackFFFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					FlowNode tmpPgw = sf1.getTargetRef();
					if (tmpPgw instanceof ParallelGateway) {
						ParallelGateway pgw = (ParallelGateway) tmpPgw;
						boolean prevNodeisDiverging = prevNode.isIsDiverging();
						if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
							Gateway tmpPcgw = pgw.get__conv();
							if (tmpPcgw instanceof ParallelGateway) {
								ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
								if (!pcgw.equals(pgw)) {
									boolean pgwisDiverging = pgw.isIsDiverging();
									if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
										boolean pcgwisDiverging = pcgw.isIsDiverging();
										if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
											if (pattern_SplitAfterMerge_28_2_black_nac_7BB(prevNode, sf1) == null) {
												if (pattern_SplitAfterMerge_28_2_black_nac_8BB(prevNode, pgw) == null) {
													if (pattern_SplitAfterMerge_28_2_black_nac_9BB(pcgw,
															prevNode) == null) {
														for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
															if (!prevInFlow.equals(sf1)) {
																FlowNode prevPrevNode = prevInFlow.getSourceRef();
																if (prevPrevNode != null) {
																	if (!prevNode.equals(prevPrevNode)) {
																		if (!pgw.equals(prevPrevNode)) {
																			if (!pcgw.equals(prevPrevNode)) {
																				if (pattern_SplitAfterMerge_28_2_black_nac_0BBB(
																						sf1, prevNode,
																						prevPrevNode) == null) {
																					if (pattern_SplitAfterMerge_28_2_black_nac_3BBBB(
																							pgw, prevNode, prevPrevNode,
																							pcgw) == null) {
																						if (pattern_SplitAfterMerge_28_2_black_nac_4BBBB(
																								pcgw, prevNode,
																								prevPrevNode,
																								pgw) == null) {
																							if (pattern_SplitAfterMerge_28_2_black_nac_6BBBB(
																									pcgw, prevNode,
																									prevPrevNode,
																									pgw) == null) {
																								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																										.getOppositeReferenceTyped(
																												sf1,
																												de.abilov.bpmn.Process.class,
																												"flowElements")) {
																									if (process
																											.getFlowElements()
																											.contains(
																													pgw)) {
																										if (process
																												.getFlowElements()
																												.contains(
																														prevNode)) {
																											if (process
																													.getFlowElements()
																													.contains(
																															pcgw)) {
																												if (pattern_SplitAfterMerge_28_2_black_nac_1BB(
																														sf1,
																														process) == null) {
																													if (pattern_SplitAfterMerge_28_2_black_nac_2BB(
																															pgw,
																															process) == null) {
																														if (pattern_SplitAfterMerge_28_2_black_nac_5BB(
																																pcgw,
																																process) == null) {
																															_result.add(
																																	new Object[] {
																																			prevNode,
																																			prevInFlow,
																																			prevPrevNode,
																																			process,
																																			sf1,
																																			pgw,
																																			pcgw,
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
											}
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

	public static final Object[] pattern_SplitAfterMerge_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_28_3_expressionFBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw,
				pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_28_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_29_1_bindingFB(SplitAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_29_1_blackFBB(EClass __eClass, SplitAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_29_1_bindingAndBlackFFB(SplitAfterMerge _this) {
		Object[] result_pattern_SplitAfterMerge_29_1_binding = pattern_SplitAfterMerge_29_1_bindingFB(_this);
		if (result_pattern_SplitAfterMerge_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SplitAfterMerge_29_1_binding[0];

			Object[] result_pattern_SplitAfterMerge_29_1_black = pattern_SplitAfterMerge_29_1_blackFBB(__eClass, _this);
			if (result_pattern_SplitAfterMerge_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SplitAfterMerge_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_0BBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode) {
		if (!prevNode.equals(prevPrevNode)) {
			for (ExclusiveGateway __DEC_sf1_default_960308 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
				if (!prevNode.equals(__DEC_sf1_default_960308)) {
					if (!prevPrevNode.equals(__DEC_sf1_default_960308)) {
						return new Object[] { sf1, prevNode, prevPrevNode };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_98677 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_98677)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_2BB(ParallelGateway pgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pgw_flowElements_46219 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pgw_flowElements_46219)) {
				return new Object[] { pgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_3BBBB(ParallelGateway pgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pcgw) {
		if (!pgw.equals(prevPrevNode)) {
			if (!prevNode.equals(prevPrevNode)) {
				if (!pcgw.equals(pgw)) {
					if (!pcgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pgw___conv_53149 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pgw, Gateway.class, "__conv")) {
							if (!pgw.equals(__DEC_pgw___conv_53149)) {
								if (!prevNode.equals(__DEC_pgw___conv_53149)) {
									if (!prevPrevNode.equals(__DEC_pgw___conv_53149)) {
										if (!pcgw.equals(__DEC_pgw___conv_53149)) {
											return new Object[] { pgw, prevNode, prevPrevNode, pcgw };
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

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_4BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						Gateway __DEC_pcgw___conv_871986 = pcgw.get__conv();
						if (__DEC_pcgw___conv_871986 != null) {
							if (!pcgw.equals(__DEC_pcgw___conv_871986)) {
								if (!prevNode.equals(__DEC_pcgw___conv_871986)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_871986)) {
										if (!pgw.equals(__DEC_pcgw___conv_871986)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_5BB(ParallelGateway pcgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_pcgw_flowElements_446264 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pcgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_pcgw_flowElements_446264)) {
				return new Object[] { pcgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_6BBBB(ParallelGateway pcgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ParallelGateway pgw) {
		if (!pcgw.equals(prevPrevNode)) {
			if (!pcgw.equals(pgw)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!pgw.equals(prevPrevNode)) {
						for (Gateway __DEC_pcgw___conv_599356 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(pcgw, Gateway.class, "__conv")) {
							if (!pcgw.equals(__DEC_pcgw___conv_599356)) {
								if (!prevNode.equals(__DEC_pcgw___conv_599356)) {
									if (!prevPrevNode.equals(__DEC_pcgw___conv_599356)) {
										if (!pgw.equals(__DEC_pcgw___conv_599356)) {
											return new Object[] { pcgw, prevNode, prevPrevNode, pgw };
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

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_8BB(ExclusiveGateway prevNode,
			ParallelGateway pgw) {
		if (pgw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, pgw };
		}
		return null;
	}

	public static final Object[] pattern_SplitAfterMerge_29_2_black_nac_9BB(ParallelGateway pcgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(pcgw.get__conv())) {
			return new Object[] { pcgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SplitAfterMerge_29_2_blackFFFFFFFB(EMoflonEdge _edge_outgoing) {
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
						FlowNode tmpPgw = sf1.getTargetRef();
						if (tmpPgw instanceof ParallelGateway) {
							ParallelGateway pgw = (ParallelGateway) tmpPgw;
							Gateway tmpPcgw = pgw.get__conv();
							if (tmpPcgw instanceof ParallelGateway) {
								ParallelGateway pcgw = (ParallelGateway) tmpPcgw;
								if (!pcgw.equals(pgw)) {
									boolean pgwisDiverging = pgw.isIsDiverging();
									if (Boolean.valueOf(pgwisDiverging).equals(Boolean.valueOf(true))) {
										boolean pcgwisDiverging = pcgw.isIsDiverging();
										if (Boolean.valueOf(pcgwisDiverging).equals(false)) {
											if (pattern_SplitAfterMerge_29_2_black_nac_7BB(prevNode, sf1) == null) {
												if (pattern_SplitAfterMerge_29_2_black_nac_8BB(prevNode, pgw) == null) {
													if (pattern_SplitAfterMerge_29_2_black_nac_9BB(pcgw,
															prevNode) == null) {
														for (SequenceFlow prevInFlow : prevNode.getIncoming()) {
															if (!prevInFlow.equals(sf1)) {
																FlowNode prevPrevNode = prevInFlow.getSourceRef();
																if (prevPrevNode != null) {
																	if (!prevNode.equals(prevPrevNode)) {
																		if (!pgw.equals(prevPrevNode)) {
																			if (!pcgw.equals(prevPrevNode)) {
																				if (pattern_SplitAfterMerge_29_2_black_nac_0BBB(
																						sf1, prevNode,
																						prevPrevNode) == null) {
																					if (pattern_SplitAfterMerge_29_2_black_nac_3BBBB(
																							pgw, prevNode, prevPrevNode,
																							pcgw) == null) {
																						if (pattern_SplitAfterMerge_29_2_black_nac_4BBBB(
																								pcgw, prevNode,
																								prevPrevNode,
																								pgw) == null) {
																							if (pattern_SplitAfterMerge_29_2_black_nac_6BBBB(
																									pcgw, prevNode,
																									prevPrevNode,
																									pgw) == null) {
																								for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																										.getOppositeReferenceTyped(
																												prevNode,
																												de.abilov.bpmn.Process.class,
																												"flowElements")) {
																									if (process
																											.getFlowElements()
																											.contains(
																													pgw)) {
																										if (process
																												.getFlowElements()
																												.contains(
																														sf1)) {
																											if (process
																													.getFlowElements()
																													.contains(
																															pcgw)) {
																												if (pattern_SplitAfterMerge_29_2_black_nac_1BB(
																														sf1,
																														process) == null) {
																													if (pattern_SplitAfterMerge_29_2_black_nac_2BB(
																															pgw,
																															process) == null) {
																														if (pattern_SplitAfterMerge_29_2_black_nac_5BB(
																																pcgw,
																																process) == null) {
																															_result.add(
																																	new Object[] {
																																			prevNode,
																																			prevInFlow,
																																			prevPrevNode,
																																			process,
																																			sf1,
																																			pgw,
																																			pcgw,
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
											}
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

	public static final Object[] pattern_SplitAfterMerge_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SplitAfterMerge_29_3_expressionFBBBBBBBBB(SplitAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ParallelGateway pgw, ParallelGateway pcgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, pgw,
				pcgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SplitAfterMerge_29_4_expressionFBB(SplitAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SplitAfterMerge_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SplitAfterMerge_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SplitAfterMerge_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SplitAfterMergeImpl
