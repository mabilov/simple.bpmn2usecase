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

import de.abilov.tgg.bpmn2useCase.Bpmn2useCaseFactory;
import de.abilov.tgg.bpmn2useCase.FN2S;
import de.abilov.tgg.bpmn2useCase.GW2S;

import de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterMerge;
import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Choice After Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChoiceAfterMergeImpl extends AbstractRuleImpl implements ChoiceAfterMerge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceAfterMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getChoiceAfterMerge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		// initial bindings
		Object[] result1_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_1_blackBBBBBBBBB(this, match, prevNode,
				prevInFlow, prevPrevNode, process, sf1, egw, ecgw);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
					+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_2_bindingAndBlackFBBBBBBBBB(
				this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw, ecgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[prevInFlow] = "
					+ prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", " + "[process] = " + process + ", "
					+ "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_4_blackBBBBBBBB(match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
						+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", "
						+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", "
						+ "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_4_greenBBBBBBFFFFFFFF(match, prevNode, process, sf1, egw,
					ecgw);
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result4_green[7];
					// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[10];
					// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result4_green[11];
					// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result4_green[12];
					// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_5_blackBBBBBBBB(match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[prevInFlow] = " + prevInFlow
								+ ", " + "[prevPrevNode] = " + prevPrevNode + ", " + "[process] = " + process + ", "
								+ "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_5_greenBBBBBFFFFF(match, prevNode, prevInFlow, prevPrevNode,
					process);
					// EMoflonEdge prevInFlow__prevNode____targetRef = (EMoflonEdge) result5_green[5];
					// EMoflonEdge prevNode__prevInFlow____incoming = (EMoflonEdge) result5_green[6];
					// EMoflonEdge prevInFlow__prevPrevNode____sourceRef = (EMoflonEdge) result5_green[7];
					// EMoflonEdge prevPrevNode__prevInFlow____outgoing = (EMoflonEdge) result5_green[8];
					// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[9];

			// register objects to match
			ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_6_expressionBBBBBBBBB(this, match, prevNode, prevInFlow,
					prevPrevNode, process, sf1, egw, ecgw);
			return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_7_expressionF();
		} else {
			return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_1_1_bindingAndBlackFFFFFFFFFFFFBFB(this, isApplicableMatch);
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
		ExclusiveGateway egw = (ExclusiveGateway) result1_bindingAndBlack[10];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_bindingAndBlack[11];
		CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_1_1_greenBBFBFBFB(prevStep, flow, egw,
				ecgw, csp);
		NormalStep step = (NormalStep) result1_green[2];
		GW2S egwToStep = (GW2S) result1_green[4];
		GW2S ecgwToStep = (GW2S) result1_green[6];

		// collect translated elements
		Object[] result2_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_1_2_blackBBBBBB(step, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = "
					+ egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_1_2_greenFBBBBBB(step, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_1_3_blackBBBBBBBBBBBBBBBB(ruleresult,
				prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
					+ flow + ", " + "[step] = " + step + ", " + "[prevInFlow] = " + prevInFlow + ", "
					+ "[prevPrevNode] = " + prevPrevNode + ", " + "[fn2ps] = " + fn2ps + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep + ", "
					+ "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode, prevStep,
				flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[19];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[20];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_1_5_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, prevNode,
				choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, sf1, egw, egwToStep,
				ecgw, ecgwToStep);
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_2_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[0];
		SequenceFlow prevInFlow = (SequenceFlow) result2_binding[1];
		FlowNode prevPrevNode = (FlowNode) result2_binding[2];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[5];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[6];
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_2_blackBFFFBBFBBBBB(prevNode,
				prevInFlow, prevPrevNode, process, sf1, egw, ecgw, match)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[1];
			GW2S pn2cs = (GW2S) result2_black[2];
			Step prevStep = (Step) result2_black[3];
			FN2S fn2ps = (FN2S) result2_black[6];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_3_blackBBBBFBBBBBBB(prevNode,
					choiceStep, pn2cs, prevStep, prevInFlow, prevPrevNode, fn2ps, process, sf1, egw, ecgw)) {
				Flow flow = (Flow) result3_black[4];
				Object[] result3_green = ChoiceAfterMergeImpl
						.pattern_ChoiceAfterMerge_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(prevNode, choiceStep, pn2cs,
								prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, egw, ecgw);
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
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[23];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[24];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[25];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[26];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[27];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[28];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[29];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[30];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[31];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterMergeImpl
						.pattern_ChoiceAfterMerge_2_4_bindingAndBlackFBBBBBBBBBBBBBB(this, isApplicableMatch, prevNode,
								choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, egw,
								ecgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", "
							+ "[prevInFlow] = " + prevInFlow + ", " + "[prevPrevNode] = " + prevPrevNode + ", "
							+ "[fn2ps] = " + fn2ps + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", "
							+ "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		match.registerObject("prevNode", prevNode);
		match.registerObject("prevInFlow", prevInFlow);
		match.registerObject("prevPrevNode", prevPrevNode);
		match.registerObject("process", process);
		match.registerObject("sf1", sf1);
		match.registerObject("egw", egw);
		match.registerObject("ecgw", ecgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {// Create CSP
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
			FN2S fn2ps, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		// Create unbound variables
		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step.id", csp);
		var_step_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_egw_id, var_step_id);

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
		isApplicableMatch.registerObject("egw", egw);
		isApplicableMatch.registerObject("ecgw", ecgw);
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
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
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
		ruleresult.registerObject("egw", egw);
		ruleresult.registerObject("egwToStep", egwToStep);
		ruleresult.registerObject("ecgw", ecgw);
		ruleresult.registerObject("ecgwToStep", ecgwToStep);

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
				&& match.getObject("egw").eClass()
						.equals(de.abilov.bpmn.BpmnPackage.eINSTANCE.getExclusiveGateway())
				&& match.getObject("ecgw").eClass()
						.equals(de.abilov.bpmn.BpmnPackage.eINSTANCE.getExclusiveGateway());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		// initial bindings
		Object[] result1_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_1_blackBBBBBB(this, match, choiceStep,
				prevStep, flow, step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
					+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_10_2_bindingAndBlackFBBBBBB(this, match, choiceStep, prevStep, flow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
					+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_4_blackBBBBB(match, choiceStep,
					prevStep, flow, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_4_greenBBBBFF(match, prevStep, flow, step);
			// EMoflonEdge prevStep__step____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_5_blackBBBBB(match, choiceStep,
					prevStep, flow, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = " + step + ".");
			}
			ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_5_greenBBBBFF(match, choiceStep, prevStep, flow);
			// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_6_expressionBBBBBB(this, match, choiceStep, prevStep, flow,
					step);
			return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_7_expressionF();
		} else {
			return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_11_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
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
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_11_1_greenBBBFFFFFB(prevNode, step,
				process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[3];
		ExclusiveGateway egw = (ExclusiveGateway) result1_green[4];
		GW2S egwToStep = (GW2S) result1_green[5];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_green[6];
		GW2S ecgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_11_2_blackBBBBBB(step, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = "
					+ egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_11_2_greenFBBBBBB(step, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_11_3_blackBBBBBBBBBBBBBBBB(ruleresult,
				prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
					+ flow + ", " + "[step] = " + step + ", " + "[prevInFlow] = " + prevInFlow + ", "
					+ "[prevPrevNode] = " + prevPrevNode + ", " + "[fn2ps] = " + fn2ps + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep + ", "
					+ "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode,
				prevStep, flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[12];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[16];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[17];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[18];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[19];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[20];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[21];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[22];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[23];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[24];

		// perform postprocessing story node is empty
		// register objects
		ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_11_5_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, prevNode,
				choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, sf1, egw, egwToStep,
				ecgw, ecgwToStep);
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_2_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep choiceStep = (ChoiceStep) result2_binding[0];
		Step prevStep = (Step) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		NormalStep step = (NormalStep) result2_binding[3];
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_2_blackFBFBBBFFB(choiceStep,
				prevStep, flow, step, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S pn2cs = (GW2S) result2_black[2];
			FlowNode prevPrevNode = (FlowNode) result2_black[6];
			FN2S fn2ps = (FN2S) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_3_blackBBBBBBFBBF(prevNode,
					choiceStep, pn2cs, prevStep, flow, step, prevPrevNode, fn2ps)) {
				SequenceFlow prevInFlow = (SequenceFlow) result3_black[6];
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[9];
				Object[] result3_green = ChoiceAfterMergeImpl
						.pattern_ChoiceAfterMerge_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFF(prevNode, choiceStep, pn2cs,
								prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process);
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
				Object[] result4_bindingAndBlack = ChoiceAfterMergeImpl
						.pattern_ChoiceAfterMerge_12_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, prevNode,
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
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_7_expressionFB(ruleresult);
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
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", csp);
		var_egw_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_egw_id, var_step_id);

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
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
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
		ruleresult.registerObject("egw", egw);
		ruleresult.registerObject("egwToStep", egwToStep);
		ruleresult.registerObject("ecgw", ecgw);
		ruleresult.registerObject("ecgwToStep", ecgwToStep);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_278(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_20_2_blackFFFFB(_edge_next)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			NormalStep step = (NormalStep) result2_black[3];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_20_3_expressionFBBBBBB(this, match, choiceStep, prevStep,
					flow, step)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_279(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_21_2_blackFFFFB(_edge_steps)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			Step prevStep = (Step) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			NormalStep step = (NormalStep) result2_black[3];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_21_3_expressionFBBBBBB(this, match, choiceStep, prevStep,
					flow, step)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_910(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_22_2_blackFFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_3_expressionFBBBBBBBBB(this, match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_911(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_23_2_blackFFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_3_expressionFBBBBBBBBB(this, match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_912(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_24_2_blackFFFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_3_expressionFBBBBBBBBB(this, match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_913(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_25_2_blackFFFFFFFB(_edge_sourceRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_3_expressionFBBBBBBBBB(this, match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_914(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_26_2_blackFFFFFFFB(_edge_outgoing)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_3_expressionFBBBBBBBBB(this, match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_915(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_27_2_blackFFFFFFFB(_edge_targetRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_3_expressionFBBBBBBBBB(this, match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_916(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_28_2_blackFFFFFFFB(_edge_incoming)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_3_expressionFBBBBBBBBB(this, match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_917(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_2_blackFFFFFFFB(_edge___conv)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow prevInFlow = (SequenceFlow) result2_black[1];
			FlowNode prevPrevNode = (FlowNode) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_3_expressionFBBBBBBBBB(this, match, prevNode,
					prevInFlow, prevPrevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ChoiceAfterMerge");
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

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egw")).findAny();
		de.abilov.bpmn.ExclusiveGateway egw = (de.abilov.bpmn.ExclusiveGateway) matchForEgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egwToStep")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S egwToStep = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgw")).findAny();
		de.abilov.bpmn.ExclusiveGateway ecgw = (de.abilov.bpmn.ExclusiveGateway) matchForEcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgwToStep")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S ecgwToStep = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEcgwToStep.get()
				.getNode();

		if (!(prevNode.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(egw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(ecgw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ChoiceAfterMerge");
		eq0.solve(var_egw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_step_id.setBound(false);
			eq0.solve(var_egw_id, var_step_id);
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
		ruleResult.setRule("ChoiceAfterMerge");
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

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egw")).findAny();
		de.abilov.bpmn.ExclusiveGateway egw = (de.abilov.bpmn.ExclusiveGateway) matchForEgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egwToStep")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S egwToStep = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgw")).findAny();
		de.abilov.bpmn.ExclusiveGateway ecgw = (de.abilov.bpmn.ExclusiveGateway) matchForEcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgwToStep")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S ecgwToStep = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEcgwToStep.get()
				.getNode();

		if (!(prevNode.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(egw.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!(ecgw.isIsDiverging() == false)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ChoiceAfterMerge");
		eq0.solve(var_egw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_egw_id.setBound(false);
			eq0.solve(var_egw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				egw.setId((String) var_egw_id.getValue());
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
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (FlowNode) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6), (ExclusiveGateway) arguments.get(7));
		case RulesPackage.CHOICE_AFTER_MERGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (FlowNode) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6), (ExclusiveGateway) arguments.get(7));
			return null;
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_FLOWNODE_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (FlowNode) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6), (ExclusiveGateway) arguments.get(7));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (Step) arguments.get(4),
					(Flow) arguments.get(5), (SequenceFlow) arguments.get(6), (FlowNode) arguments.get(7),
					(FN2S) arguments.get(8), (de.abilov.bpmn.Process) arguments.get(9),
					(SequenceFlow) arguments.get(10), (ExclusiveGateway) arguments.get(11),
					(ExclusiveGateway) arguments.get(12));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.CHOICE_AFTER_MERGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1), (Step) arguments.get(2),
					(Flow) arguments.get(3), (NormalStep) arguments.get(4));
		case RulesPackage.CHOICE_AFTER_MERGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1), (Step) arguments.get(2),
					(Flow) arguments.get(3), (NormalStep) arguments.get(4));
			return null;
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_STEP_FLOW_NORMALSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(Step) arguments.get(2), (Flow) arguments.get(3), (NormalStep) arguments.get(4));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_NORMALSTEP_SEQUENCEFLOW_FLOWNODE_FN2S_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (Step) arguments.get(4),
					(Flow) arguments.get(5), (NormalStep) arguments.get(6), (SequenceFlow) arguments.get(7),
					(FlowNode) arguments.get(8), (FN2S) arguments.get(9), (de.abilov.bpmn.Process) arguments.get(10));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.CHOICE_AFTER_MERGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_278__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_278((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_279__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_279((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_910__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_910((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_911__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_911((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_912__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_912((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_913__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_913((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_914__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_914((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_915__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_915((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_916__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_916((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_917__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_917((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_1_blackBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!egw.equals(prevNode)) {
					if (!egw.equals(prevPrevNode)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								if (!ecgw.equals(egw)) {
									return new Object[] { _this, match, prevNode, prevInFlow, prevPrevNode, process,
											sf1, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_2_bindingFBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1,
				egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_2_bindingAndBlackFBBBBBBBBB(ChoiceAfterMerge _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterMerge_0_2_binding = pattern_ChoiceAfterMerge_0_2_bindingFBBBBBBBBB(_this,
				match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw, ecgw);
		if (result_pattern_ChoiceAfterMerge_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterMerge_0_2_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_0_2_black = pattern_ChoiceAfterMerge_0_2_blackB(csp);
			if (result_pattern_ChoiceAfterMerge_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterMerge_0_3_expressionFBB(ChoiceAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_4_blackBBBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!egw.equals(prevNode)) {
					if (!egw.equals(prevPrevNode)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								if (!ecgw.equals(egw)) {
									return new Object[] { match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
											ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_4_greenBBBBBBFFFFFFFF(Match match,
			ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(egw);
		match.getToBeTranslatedNodes().add(ecgw);
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getToBeTranslatedEdges().add(process__sf1____flowElements);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		match.getToBeTranslatedEdges().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		match.getToBeTranslatedEdges().add(process__ecgw____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		match.getToBeTranslatedEdges().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		match.getToBeTranslatedEdges().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		match.getToBeTranslatedEdges().add(egw__ecgw______conv);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { match, prevNode, process, sf1, egw, ecgw, process__sf1____flowElements,
				process__egw____flowElements, process__ecgw____flowElements, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv };
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_5_blackBBBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!egw.equals(prevNode)) {
					if (!egw.equals(prevPrevNode)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								if (!ecgw.equals(egw)) {
									return new Object[] { match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
											ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_5_greenBBBBBFFFFF(Match match, ExclusiveGateway prevNode,
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

	public static final void pattern_ChoiceAfterMerge_0_6_expressionBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw, ecgw);

	}

	public static final boolean pattern_ChoiceAfterMerge_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_1_1_bindingFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
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
		EObject _localVariable_10 = isApplicableMatch.getObject("egw");
		EObject _localVariable_11 = isApplicableMatch.getObject("ecgw");
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
		EObject tmpEgw = _localVariable_10;
		EObject tmpEcgw = _localVariable_11;
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
												if (tmpEgw instanceof ExclusiveGateway) {
													ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
													if (tmpEcgw instanceof ExclusiveGateway) {
														ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
														return new Object[] { prevNode, choiceStep, pn2cs, prevStep,
																flow, prevInFlow, prevPrevNode, fn2ps, process, sf1,
																egw, ecgw, isApplicableMatch };
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_1_1_blackBBBBBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode,
			FN2S fn2ps, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw,
			ChoiceAfterMerge _this, IsApplicableMatch isApplicableMatch) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!choiceStep.equals(prevStep)) {
				if (!prevInFlow.equals(sf1)) {
					if (!egw.equals(prevNode)) {
						if (!egw.equals(prevPrevNode)) {
							if (!ecgw.equals(prevNode)) {
								if (!ecgw.equals(prevPrevNode)) {
									if (!ecgw.equals(egw)) {
										for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
											if (tmpCsp instanceof CSP) {
												CSP csp = (CSP) tmpCsp;
												return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow,
														prevInFlow, prevPrevNode, fn2ps, process, sf1, egw, ecgw, _this,
														csp, isApplicableMatch };
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_1_1_bindingAndBlackFFFFFFFFFFFFBFB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterMerge_1_1_binding = pattern_ChoiceAfterMerge_1_1_bindingFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterMerge_1_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterMerge_1_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_ChoiceAfterMerge_1_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_ChoiceAfterMerge_1_1_binding[2];
			Step prevStep = (Step) result_pattern_ChoiceAfterMerge_1_1_binding[3];
			Flow flow = (Flow) result_pattern_ChoiceAfterMerge_1_1_binding[4];
			SequenceFlow prevInFlow = (SequenceFlow) result_pattern_ChoiceAfterMerge_1_1_binding[5];
			FlowNode prevPrevNode = (FlowNode) result_pattern_ChoiceAfterMerge_1_1_binding[6];
			FN2S fn2ps = (FN2S) result_pattern_ChoiceAfterMerge_1_1_binding[7];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterMerge_1_1_binding[8];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ChoiceAfterMerge_1_1_binding[9];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_ChoiceAfterMerge_1_1_binding[10];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_ChoiceAfterMerge_1_1_binding[11];

			Object[] result_pattern_ChoiceAfterMerge_1_1_black = pattern_ChoiceAfterMerge_1_1_blackBBBBBBBBBBBBBFB(
					prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, egw,
					ecgw, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterMerge_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterMerge_1_1_black[13];

				return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps,
						process, sf1, egw, ecgw, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_1_1_greenBBFBFBFB(Step prevStep, Flow flow,
			ExclusiveGateway egw, ExclusiveGateway ecgw, CSP csp) {
		NormalStep step = UseCaseFactory.eINSTANCE.createNormalStep();
		GW2S egwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		GW2S ecgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		prevStep.setNext(step);
		flow.getSteps().add(step);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { prevStep, flow, step, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_ChoiceAfterMerge_1_2_blackBBBBBB(NormalStep step, SequenceFlow sf1,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { step, sf1, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_1_2_greenFBBBBBB(NormalStep step, SequenceFlow sf1,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getTranslatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, step, sf1, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_ChoiceAfterMerge_1_3_blackBBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep, EObject flow, EObject step,
			EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject process, EObject sf1, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
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
																	if (!choiceStep.equals(egw)) {
																		if (!choiceStep.equals(egwToStep)) {
																			if (!choiceStep.equals(ecgw)) {
																				if (!choiceStep.equals(ecgwToStep)) {
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
																																																										if (!process
																																																												.equals(step)) {
																																																											if (!process
																																																													.equals(sf1)) {
																																																												if (!sf1.equals(
																																																														step)) {
																																																													if (!egw.equals(
																																																															prevNode)) {
																																																														if (!egw.equals(
																																																																pn2cs)) {
																																																															if (!egw.equals(
																																																																	prevStep)) {
																																																																if (!egw.equals(
																																																																		flow)) {
																																																																	if (!egw.equals(
																																																																			step)) {
																																																																		if (!egw.equals(
																																																																				prevInFlow)) {
																																																																			if (!egw.equals(
																																																																					prevPrevNode)) {
																																																																				if (!egw.equals(
																																																																						fn2ps)) {
																																																																					if (!egw.equals(
																																																																							process)) {
																																																																						if (!egw.equals(
																																																																								sf1)) {
																																																																							if (!egw.equals(
																																																																									egwToStep)) {
																																																																								if (!egwToStep
																																																																										.equals(prevNode)) {
																																																																									if (!egwToStep
																																																																											.equals(pn2cs)) {
																																																																										if (!egwToStep
																																																																												.equals(prevStep)) {
																																																																											if (!egwToStep
																																																																													.equals(flow)) {
																																																																												if (!egwToStep
																																																																														.equals(step)) {
																																																																													if (!egwToStep
																																																																															.equals(prevInFlow)) {
																																																																														if (!egwToStep
																																																																																.equals(prevPrevNode)) {
																																																																															if (!egwToStep
																																																																																	.equals(fn2ps)) {
																																																																																if (!egwToStep
																																																																																		.equals(process)) {
																																																																																	if (!egwToStep
																																																																																			.equals(sf1)) {
																																																																																		if (!ecgw
																																																																																				.equals(prevNode)) {
																																																																																			if (!ecgw
																																																																																					.equals(pn2cs)) {
																																																																																				if (!ecgw
																																																																																						.equals(prevStep)) {
																																																																																					if (!ecgw
																																																																																							.equals(flow)) {
																																																																																						if (!ecgw
																																																																																								.equals(step)) {
																																																																																							if (!ecgw
																																																																																									.equals(prevInFlow)) {
																																																																																								if (!ecgw
																																																																																										.equals(prevPrevNode)) {
																																																																																									if (!ecgw
																																																																																											.equals(fn2ps)) {
																																																																																										if (!ecgw
																																																																																												.equals(process)) {
																																																																																											if (!ecgw
																																																																																													.equals(sf1)) {
																																																																																												if (!ecgw
																																																																																														.equals(egw)) {
																																																																																													if (!ecgw
																																																																																															.equals(egwToStep)) {
																																																																																														if (!ecgw
																																																																																																.equals(ecgwToStep)) {
																																																																																															if (!ecgwToStep
																																																																																																	.equals(prevNode)) {
																																																																																																if (!ecgwToStep
																																																																																																		.equals(pn2cs)) {
																																																																																																	if (!ecgwToStep
																																																																																																			.equals(prevStep)) {
																																																																																																		if (!ecgwToStep
																																																																																																				.equals(flow)) {
																																																																																																			if (!ecgwToStep
																																																																																																					.equals(step)) {
																																																																																																				if (!ecgwToStep
																																																																																																						.equals(prevInFlow)) {
																																																																																																					if (!ecgwToStep
																																																																																																							.equals(prevPrevNode)) {
																																																																																																						if (!ecgwToStep
																																																																																																								.equals(fn2ps)) {
																																																																																																							if (!ecgwToStep
																																																																																																									.equals(process)) {
																																																																																																								if (!ecgwToStep
																																																																																																										.equals(sf1)) {
																																																																																																									if (!ecgwToStep
																																																																																																											.equals(egw)) {
																																																																																																										if (!ecgwToStep
																																																																																																												.equals(egwToStep)) {
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
																																																																																																													egw,
																																																																																																													egwToStep,
																																																																																																													ecgw,
																																																																																																													ecgwToStep };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject flow, EObject step,
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ChoiceAfterMerge";
		String prevStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(prevStep__step____next);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(flow__step____steps);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		ruleresult.getTranslatedEdges().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		ruleresult.getTranslatedEdges().add(process__ecgw____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		ruleresult.getTranslatedEdges().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		ruleresult.getTranslatedEdges().add(egw__ecgw______conv);
		egwToStep__egw____source.setSrc(egwToStep);
		egwToStep__egw____source.setTrg(egw);
		ruleresult.getCreatedEdges().add(egwToStep__egw____source);
		egwToStep__step____target.setSrc(egwToStep);
		egwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(egwToStep__step____target);
		ecgwToStep__ecgw____source.setSrc(ecgwToStep);
		ecgwToStep__ecgw____source.setTrg(ecgw);
		ruleresult.getCreatedEdges().add(ecgwToStep__ecgw____source);
		ecgwToStep__step____target.setSrc(ecgwToStep);
		ecgwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(ecgwToStep__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, prevNode, prevStep, flow, step, process, sf1, egw, egwToStep, ecgw,
				ecgwToStep, prevStep__step____next, flow__step____steps, process__sf1____flowElements,
				process__egw____flowElements, process__ecgw____flowElements, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv,
				egwToStep__egw____source, egwToStep__step____target, ecgwToStep__ecgw____source,
				ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterMerge_1_5_expressionBBBBBBBBBBBBBBBBB(ChoiceAfterMerge _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep,
			EObject flow, EObject step, EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject process,
			EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_FWD(ruleresult, prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow,
				prevPrevNode, fn2ps, process, sf1, egw, egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterMerge_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_1_blackFBB(EClass eClass, ChoiceAfterMerge _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_2_1_binding = pattern_ChoiceAfterMerge_2_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterMerge_2_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_2_1_black = pattern_ChoiceAfterMerge_2_1_blackFBB(eClass, _this);
			if (result_pattern_ChoiceAfterMerge_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterMerge_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterMerge";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_2_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("prevInFlow");
		EObject _localVariable_2 = match.getObject("prevPrevNode");
		EObject _localVariable_3 = match.getObject("process");
		EObject _localVariable_4 = match.getObject("sf1");
		EObject _localVariable_5 = match.getObject("egw");
		EObject _localVariable_6 = match.getObject("ecgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpPrevInFlow = _localVariable_1;
		EObject tmpPrevPrevNode = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpEgw = _localVariable_5;
		EObject tmpEcgw = _localVariable_6;
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
							if (tmpEgw instanceof ExclusiveGateway) {
								ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
								if (tmpEcgw instanceof ExclusiveGateway) {
									ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
									return new Object[] { prevNode, prevInFlow, prevPrevNode, process, sf1, egw, ecgw,
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_2_2_blackBFFFBBFBBBBB(ExclusiveGateway prevNode,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(prevPrevNode)) {
			if (!prevInFlow.equals(sf1)) {
				if (!egw.equals(prevNode)) {
					if (!egw.equals(prevPrevNode)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								if (!ecgw.equals(egw)) {
									boolean prevNodeisDiverging = prevNode.isIsDiverging();
									if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
										boolean egwisDiverging = egw.isIsDiverging();
										if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
											boolean ecgwisDiverging = ecgw.isIsDiverging();
											if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
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
																	_result.add(new Object[] { prevNode, choiceStep,
																			pn2cs, prevStep, prevInFlow, prevPrevNode,
																			fn2ps, process, sf1, egw, ecgw, match });
																}
															}

														}
													}

												}
											}

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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_2_3_blackBBBBFBBBBBBB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, SequenceFlow prevInFlow, FlowNode prevPrevNode,
			FN2S fn2ps, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevNode.equals(prevPrevNode)) {
			if (!choiceStep.equals(prevStep)) {
				if (!prevInFlow.equals(sf1)) {
					if (!egw.equals(prevNode)) {
						if (!egw.equals(prevPrevNode)) {
							if (!ecgw.equals(prevNode)) {
								if (!ecgw.equals(prevPrevNode)) {
									if (!ecgw.equals(egw)) {
										if (prevNode.equals(prevInFlow.getTargetRef())) {
											if (prevNode.equals(pn2cs.getSource())) {
												if (choiceStep.equals(pn2cs.getTarget())) {
													if (prevPrevNode.equals(prevInFlow.getSourceRef())) {
														if (prevPrevNode.equals(fn2ps.getSource())) {
															if (prevStep.equals(fn2ps.getTarget())) {
																if (process.getFlowElements().contains(prevNode)) {
																	if (process.getFlowElements().contains(sf1)) {
																		if (process.getFlowElements().contains(egw)) {
																			if (process.getFlowElements()
																					.contains(ecgw)) {
																				if (prevNode
																						.equals(sf1.getSourceRef())) {
																					if (egw.equals(
																							sf1.getTargetRef())) {
																						if (ecgw.equals(
																								egw.get__conv())) {
																							boolean prevNodeisDiverging = prevNode
																									.isIsDiverging();
																							if (Boolean
																									.valueOf(
																											prevNodeisDiverging)
																									.equals(false)) {
																								boolean egwisDiverging = egw
																										.isIsDiverging();
																								if (Boolean
																										.valueOf(
																												egwisDiverging)
																										.equals(Boolean
																												.valueOf(
																														true))) {
																									boolean ecgwisDiverging = ecgw
																											.isIsDiverging();
																									if (Boolean
																											.valueOf(
																													ecgwisDiverging)
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
																																egw,
																																ecgw });
																											}
																										}
																									}

																								}

																							}

																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_2_3_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow,
			SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
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
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
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
		isApplicableMatch.getAllContextElements().add(egw);
		isApplicableMatch.getAllContextElements().add(ecgw);
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
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(process__sf1____flowElements);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		isApplicableMatch.getAllContextElements().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		isApplicableMatch.getAllContextElements().add(process__ecgw____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		isApplicableMatch.getAllContextElements().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		isApplicableMatch.getAllContextElements().add(egw__ecgw______conv);
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
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps, process,
				sf1, egw, ecgw, isApplicableMatch, prevInFlow__prevNode____targetRef, prevNode__prevInFlow____incoming,
				pn2cs__prevNode____source, pn2cs__choiceStep____target, flow__choiceStep____steps,
				flow__prevStep____steps, prevInFlow__prevPrevNode____sourceRef, prevPrevNode__prevInFlow____outgoing,
				fn2ps__prevPrevNode____source, fn2ps__prevStep____target, process__prevNode____flowElements,
				process__sf1____flowElements, process__egw____flowElements, process__ecgw____flowElements,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, sf1__egw____targetRef, egw__sf1____incoming,
				egw__ecgw______conv };
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_4_bindingFBBBBBBBBBBBBBB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep,
				flow, prevInFlow, prevPrevNode, fn2ps, process, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow,
					prevInFlow, prevPrevNode, fn2ps, process, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_4_bindingAndBlackFBBBBBBBBBBBBBB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterMerge_2_4_binding = pattern_ChoiceAfterMerge_2_4_bindingFBBBBBBBBBBBBBB(
				_this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, prevInFlow, prevPrevNode, fn2ps,
				process, sf1, egw, ecgw);
		if (result_pattern_ChoiceAfterMerge_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterMerge_2_4_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_2_4_black = pattern_ChoiceAfterMerge_2_4_blackB(csp);
			if (result_pattern_ChoiceAfterMerge_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow,
						prevInFlow, prevPrevNode, fn2ps, process, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterMerge_2_5_expressionFBB(ChoiceAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterMerge";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterMerge_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_10_1_blackBBBBBB(ChoiceAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				return new Object[] { _this, match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_10_2_bindingFBBBBBB(ChoiceAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, choiceStep, prevStep, flow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, choiceStep, prevStep, flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterMerge_10_2_bindingAndBlackFBBBBBB(ChoiceAfterMerge _this,
			Match match, ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		Object[] result_pattern_ChoiceAfterMerge_10_2_binding = pattern_ChoiceAfterMerge_10_2_bindingFBBBBBB(_this,
				match, choiceStep, prevStep, flow, step);
		if (result_pattern_ChoiceAfterMerge_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterMerge_10_2_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_10_2_black = pattern_ChoiceAfterMerge_10_2_blackB(csp);
			if (result_pattern_ChoiceAfterMerge_10_2_black != null) {

				return new Object[] { csp, _this, match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterMerge_10_3_expressionFBB(ChoiceAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_10_4_blackBBBBB(Match match, ChoiceStep choiceStep,
			Step prevStep, Flow flow, NormalStep step) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				return new Object[] { match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_10_4_greenBBBBFF(Match match, Step prevStep, Flow flow,
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

	public static final Object[] pattern_ChoiceAfterMerge_10_5_blackBBBBB(Match match, ChoiceStep choiceStep,
			Step prevStep, Flow flow, NormalStep step) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				return new Object[] { match, choiceStep, prevStep, flow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_10_5_greenBBBBFF(Match match, ChoiceStep choiceStep,
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

	public static final void pattern_ChoiceAfterMerge_10_6_expressionBBBBBB(ChoiceAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		_this.registerObjectsToMatch_BWD(match, choiceStep, prevStep, flow, step);

	}

	public static final boolean pattern_ChoiceAfterMerge_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_11_1_bindingFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
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

	public static final Object[] pattern_ChoiceAfterMerge_11_1_blackBBBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, SequenceFlow prevInFlow,
			FlowNode prevPrevNode, FN2S fn2ps, de.abilov.bpmn.Process process, ChoiceAfterMerge _this,
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

	public static final Object[] pattern_ChoiceAfterMerge_11_1_bindingAndBlackFFFFFFFFFFBFB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterMerge_11_1_binding = pattern_ChoiceAfterMerge_11_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterMerge_11_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterMerge_11_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_ChoiceAfterMerge_11_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_ChoiceAfterMerge_11_1_binding[2];
			Step prevStep = (Step) result_pattern_ChoiceAfterMerge_11_1_binding[3];
			Flow flow = (Flow) result_pattern_ChoiceAfterMerge_11_1_binding[4];
			NormalStep step = (NormalStep) result_pattern_ChoiceAfterMerge_11_1_binding[5];
			SequenceFlow prevInFlow = (SequenceFlow) result_pattern_ChoiceAfterMerge_11_1_binding[6];
			FlowNode prevPrevNode = (FlowNode) result_pattern_ChoiceAfterMerge_11_1_binding[7];
			FN2S fn2ps = (FN2S) result_pattern_ChoiceAfterMerge_11_1_binding[8];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterMerge_11_1_binding[9];

			Object[] result_pattern_ChoiceAfterMerge_11_1_black = pattern_ChoiceAfterMerge_11_1_blackBBBBBBBBBBBFB(
					prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode, fn2ps, process, _this,
					isApplicableMatch);
			if (result_pattern_ChoiceAfterMerge_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterMerge_11_1_black[11];

				return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode,
						fn2ps, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_11_1_greenBBBFFFFFB(ExclusiveGateway prevNode,
			NormalStep step, de.abilov.bpmn.Process process, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		ExclusiveGateway egw = BpmnFactory.eINSTANCE.createExclusiveGateway();
		GW2S egwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		ExclusiveGateway ecgw = BpmnFactory.eINSTANCE.createExclusiveGateway();
		GW2S ecgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		boolean egw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("egw", "id");
		boolean ecgw_isDiverging_prime = false;
		process.getFlowElements().add(sf1);
		sf1.setSourceRef(prevNode);
		process.getFlowElements().add(egw);
		sf1.setTargetRef(egw);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		process.getFlowElements().add(ecgw);
		egw.set__conv(ecgw);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		egw.setIsDiverging(Boolean.valueOf(egw_isDiverging_prime));
		String egw_id_prime = (String) _localVariable_0;
		ecgw.setIsDiverging(Boolean.valueOf(ecgw_isDiverging_prime));
		egw.setId(egw_id_prime);
		return new Object[] { prevNode, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_ChoiceAfterMerge_11_2_blackBBBBBB(NormalStep step, SequenceFlow sf1,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { step, sf1, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_11_2_greenFBBBBBB(NormalStep step, SequenceFlow sf1,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getCreatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getCreatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, step, sf1, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_ChoiceAfterMerge_11_3_blackBBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep, EObject flow, EObject step,
			EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject process, EObject sf1, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
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
																	if (!choiceStep.equals(egw)) {
																		if (!choiceStep.equals(egwToStep)) {
																			if (!choiceStep.equals(ecgw)) {
																				if (!choiceStep.equals(ecgwToStep)) {
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
																																																										if (!process
																																																												.equals(step)) {
																																																											if (!process
																																																													.equals(sf1)) {
																																																												if (!sf1.equals(
																																																														step)) {
																																																													if (!egw.equals(
																																																															prevNode)) {
																																																														if (!egw.equals(
																																																																pn2cs)) {
																																																															if (!egw.equals(
																																																																	prevStep)) {
																																																																if (!egw.equals(
																																																																		flow)) {
																																																																	if (!egw.equals(
																																																																			step)) {
																																																																		if (!egw.equals(
																																																																				prevInFlow)) {
																																																																			if (!egw.equals(
																																																																					prevPrevNode)) {
																																																																				if (!egw.equals(
																																																																						fn2ps)) {
																																																																					if (!egw.equals(
																																																																							process)) {
																																																																						if (!egw.equals(
																																																																								sf1)) {
																																																																							if (!egw.equals(
																																																																									egwToStep)) {
																																																																								if (!egwToStep
																																																																										.equals(prevNode)) {
																																																																									if (!egwToStep
																																																																											.equals(pn2cs)) {
																																																																										if (!egwToStep
																																																																												.equals(prevStep)) {
																																																																											if (!egwToStep
																																																																													.equals(flow)) {
																																																																												if (!egwToStep
																																																																														.equals(step)) {
																																																																													if (!egwToStep
																																																																															.equals(prevInFlow)) {
																																																																														if (!egwToStep
																																																																																.equals(prevPrevNode)) {
																																																																															if (!egwToStep
																																																																																	.equals(fn2ps)) {
																																																																																if (!egwToStep
																																																																																		.equals(process)) {
																																																																																	if (!egwToStep
																																																																																			.equals(sf1)) {
																																																																																		if (!ecgw
																																																																																				.equals(prevNode)) {
																																																																																			if (!ecgw
																																																																																					.equals(pn2cs)) {
																																																																																				if (!ecgw
																																																																																						.equals(prevStep)) {
																																																																																					if (!ecgw
																																																																																							.equals(flow)) {
																																																																																						if (!ecgw
																																																																																								.equals(step)) {
																																																																																							if (!ecgw
																																																																																									.equals(prevInFlow)) {
																																																																																								if (!ecgw
																																																																																										.equals(prevPrevNode)) {
																																																																																									if (!ecgw
																																																																																											.equals(fn2ps)) {
																																																																																										if (!ecgw
																																																																																												.equals(process)) {
																																																																																											if (!ecgw
																																																																																													.equals(sf1)) {
																																																																																												if (!ecgw
																																																																																														.equals(egw)) {
																																																																																													if (!ecgw
																																																																																															.equals(egwToStep)) {
																																																																																														if (!ecgw
																																																																																																.equals(ecgwToStep)) {
																																																																																															if (!ecgwToStep
																																																																																																	.equals(prevNode)) {
																																																																																																if (!ecgwToStep
																																																																																																		.equals(pn2cs)) {
																																																																																																	if (!ecgwToStep
																																																																																																			.equals(prevStep)) {
																																																																																																		if (!ecgwToStep
																																																																																																				.equals(flow)) {
																																																																																																			if (!ecgwToStep
																																																																																																					.equals(step)) {
																																																																																																				if (!ecgwToStep
																																																																																																						.equals(prevInFlow)) {
																																																																																																					if (!ecgwToStep
																																																																																																							.equals(prevPrevNode)) {
																																																																																																						if (!ecgwToStep
																																																																																																								.equals(fn2ps)) {
																																																																																																							if (!ecgwToStep
																																																																																																									.equals(process)) {
																																																																																																								if (!ecgwToStep
																																																																																																										.equals(sf1)) {
																																																																																																									if (!ecgwToStep
																																																																																																											.equals(egw)) {
																																																																																																										if (!ecgwToStep
																																																																																																												.equals(egwToStep)) {
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
																																																																																																													egw,
																																																																																																													egwToStep,
																																																																																																													ecgw,
																																																																																																													ecgwToStep };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject flow, EObject step,
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ChoiceAfterMerge";
		String prevStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(prevStep__step____next);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(flow__step____steps);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		ruleresult.getCreatedEdges().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		ruleresult.getCreatedEdges().add(process__ecgw____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		ruleresult.getCreatedEdges().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		ruleresult.getCreatedEdges().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		ruleresult.getCreatedEdges().add(egw__ecgw______conv);
		egwToStep__egw____source.setSrc(egwToStep);
		egwToStep__egw____source.setTrg(egw);
		ruleresult.getCreatedEdges().add(egwToStep__egw____source);
		egwToStep__step____target.setSrc(egwToStep);
		egwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(egwToStep__step____target);
		ecgwToStep__ecgw____source.setSrc(ecgwToStep);
		ecgwToStep__ecgw____source.setTrg(ecgw);
		ruleresult.getCreatedEdges().add(ecgwToStep__ecgw____source);
		ecgwToStep__step____target.setSrc(ecgwToStep);
		ecgwToStep__step____target.setTrg(step);
		ruleresult.getCreatedEdges().add(ecgwToStep__step____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, prevNode, prevStep, flow, step, process, sf1, egw, egwToStep, ecgw,
				ecgwToStep, prevStep__step____next, flow__step____steps, process__sf1____flowElements,
				process__egw____flowElements, process__ecgw____flowElements, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv,
				egwToStep__egw____source, egwToStep__step____target, ecgwToStep__ecgw____source,
				ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterMerge_11_5_expressionBBBBBBBBBBBBBBBBB(ChoiceAfterMerge _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep,
			EObject flow, EObject step, EObject prevInFlow, EObject prevPrevNode, EObject fn2ps, EObject process,
			EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_BWD(ruleresult, prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow,
				prevPrevNode, fn2ps, process, sf1, egw, egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterMerge_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_1_blackFBB(EClass eClass, ChoiceAfterMerge _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_12_1_binding = pattern_ChoiceAfterMerge_12_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterMerge_12_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_12_1_black = pattern_ChoiceAfterMerge_12_1_blackFBB(eClass, _this);
			if (result_pattern_ChoiceAfterMerge_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterMerge_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterMerge";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_2_bindingFFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_12_2_blackFBFBBBFFB(ChoiceStep choiceStep,
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_12_3_blackBBBBBBFBBF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, FlowNode prevPrevNode,
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

	public static final Object[] pattern_ChoiceAfterMerge_12_3_greenBBBBBBBBBBFFFFFFFFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, SequenceFlow prevInFlow,
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

	public static final Object[] pattern_ChoiceAfterMerge_12_4_bindingFBBBBBBBBBBBB(ChoiceAfterMerge _this,
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

	public static final Object[] pattern_ChoiceAfterMerge_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_4_bindingAndBlackFBBBBBBBBBBBB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, NormalStep step, SequenceFlow prevInFlow, FlowNode prevPrevNode, FN2S fn2ps,
			de.abilov.bpmn.Process process) {
		Object[] result_pattern_ChoiceAfterMerge_12_4_binding = pattern_ChoiceAfterMerge_12_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step, prevInFlow, prevPrevNode,
				fn2ps, process);
		if (result_pattern_ChoiceAfterMerge_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterMerge_12_4_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_12_4_black = pattern_ChoiceAfterMerge_12_4_blackB(csp);
			if (result_pattern_ChoiceAfterMerge_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step,
						prevInFlow, prevPrevNode, fn2ps, process };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterMerge_12_5_expressionFBB(ChoiceAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterMerge";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterMerge_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_20_1_binding = pattern_ChoiceAfterMerge_20_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_20_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_20_1_black = pattern_ChoiceAfterMerge_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_846858 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_846858)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_2_black_nac_1BBB(NormalStep step, ChoiceStep choiceStep,
			Step prevStep) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (Step __DEC_step_next_632630 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(step, Step.class, "next")) {
					if (!step.equals(__DEC_step_next_632630)) {
						if (!choiceStep.equals(__DEC_step_next_632630)) {
							if (!prevStep.equals(__DEC_step_next_632630)) {
								return new Object[] { step, choiceStep, prevStep };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_2_black_nac_2BB(ChoiceStep choiceStep, NormalStep step) {
		if (step.equals(choiceStep.getNext())) {
			return new Object[] { choiceStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_20_2_blackFFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof Step) {
			Step prevStep = (Step) tmpPrevStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (!prevStep.equals(step)) {
					if (step.equals(prevStep.getNext())) {
						for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevStep,
								Flow.class, "steps")) {
							if (flow.getSteps().contains(step)) {
								if (pattern_ChoiceAfterMerge_20_2_black_nac_0BB(step, flow) == null) {
									for (Step tmpChoiceStep : flow.getSteps()) {
										if (tmpChoiceStep instanceof ChoiceStep) {
											ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
											if (!choiceStep.equals(prevStep)) {
												if (pattern_ChoiceAfterMerge_20_2_black_nac_1BBB(step, choiceStep,
														prevStep) == null) {
													if (pattern_ChoiceAfterMerge_20_2_black_nac_2BB(choiceStep,
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

	public static final Object[] pattern_ChoiceAfterMerge_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_20_3_expressionFBBBBBB(ChoiceAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, prevStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_20_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_21_1_binding = pattern_ChoiceAfterMerge_21_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_21_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_21_1_black = pattern_ChoiceAfterMerge_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_751983 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_751983)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_2_black_nac_1BBB(NormalStep step, ChoiceStep choiceStep,
			Step prevStep) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (Step __DEC_step_next_976322 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(step, Step.class, "next")) {
					if (!step.equals(__DEC_step_next_976322)) {
						if (!choiceStep.equals(__DEC_step_next_976322)) {
							if (!prevStep.equals(__DEC_step_next_976322)) {
								return new Object[] { step, choiceStep, prevStep };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_2_black_nac_2BB(ChoiceStep choiceStep, NormalStep step) {
		if (step.equals(choiceStep.getNext())) {
			return new Object[] { choiceStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_21_2_blackFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_ChoiceAfterMerge_21_2_black_nac_0BB(step, flow) == null) {
						for (Step tmpChoiceStep : flow.getSteps()) {
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								if (pattern_ChoiceAfterMerge_21_2_black_nac_2BB(choiceStep, step) == null) {
									for (Step prevStep : flow.getSteps()) {
										if (!choiceStep.equals(prevStep)) {
											if (!prevStep.equals(step)) {
												if (step.equals(prevStep.getNext())) {
													if (pattern_ChoiceAfterMerge_21_2_black_nac_1BBB(step, choiceStep,
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

	public static final Object[] pattern_ChoiceAfterMerge_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_21_3_expressionFBBBBBB(ChoiceAfterMerge _this, Match match,
			ChoiceStep choiceStep, Step prevStep, Flow flow, NormalStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, prevStep, flow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_21_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_22_1_binding = pattern_ChoiceAfterMerge_22_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_22_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_22_1_black = pattern_ChoiceAfterMerge_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!egw.equals(prevNode)) {
				if (!egw.equals(prevPrevNode)) {
					if (!ecgw.equals(prevNode)) {
						if (!ecgw.equals(prevPrevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_365845 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!prevNode.equals(__DEC_sf1_default_365845)) {
										if (!prevPrevNode.equals(__DEC_sf1_default_365845)) {
											if (!egw.equals(__DEC_sf1_default_365845)) {
												if (!ecgw.equals(__DEC_sf1_default_365845)) {
													return new Object[] { sf1, prevNode, prevPrevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_363279 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_363279)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_272298 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_272298)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!egw.equals(prevPrevNode)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								for (Gateway __DEC_egw___conv_16481 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_16481)) {
										if (!prevNode.equals(__DEC_egw___conv_16481)) {
											if (!prevPrevNode.equals(__DEC_egw___conv_16481)) {
												if (!ecgw.equals(__DEC_egw___conv_16481)) {
													return new Object[] { egw, prevNode, prevPrevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								Gateway __DEC_ecgw___conv_942713 = ecgw.get__conv();
								if (__DEC_ecgw___conv_942713 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_942713)) {
										if (!prevNode.equals(__DEC_ecgw___conv_942713)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_942713)) {
												if (!egw.equals(__DEC_ecgw___conv_942713)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_556826 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_556826)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								for (Gateway __DEC_ecgw___conv_906430 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_906430)) {
										if (!prevNode.equals(__DEC_ecgw___conv_906430)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_906430)) {
												if (!egw.equals(__DEC_ecgw___conv_906430)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_22_2_blackFFFFFFFB(EMoflonEdge _edge_flowElements) {
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
							FlowNode tmpEgw = sf1.getTargetRef();
							if (tmpEgw instanceof ExclusiveGateway) {
								ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
								if (!egw.equals(prevNode)) {
									if (process.getFlowElements().contains(egw)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
											Gateway tmpEcgw = egw.get__conv();
											if (tmpEcgw instanceof ExclusiveGateway) {
												ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
												if (!ecgw.equals(prevNode)) {
													if (!ecgw.equals(egw)) {
														if (process.getFlowElements().contains(ecgw)) {
															boolean egwisDiverging = egw.isIsDiverging();
															if (Boolean.valueOf(egwisDiverging)
																	.equals(Boolean.valueOf(true))) {
																boolean ecgwisDiverging = ecgw.isIsDiverging();
																if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
																	if (pattern_ChoiceAfterMerge_22_2_black_nac_1BB(sf1,
																			process) == null) {
																		if (pattern_ChoiceAfterMerge_22_2_black_nac_7BB(
																				prevNode, sf1) == null) {
																			if (pattern_ChoiceAfterMerge_22_2_black_nac_2BB(
																					egw, process) == null) {
																				if (pattern_ChoiceAfterMerge_22_2_black_nac_8BB(
																						egw, sf1) == null) {
																					if (pattern_ChoiceAfterMerge_22_2_black_nac_10BB(
																							prevNode, egw) == null) {
																						if (pattern_ChoiceAfterMerge_22_2_black_nac_5BB(
																								ecgw,
																								process) == null) {
																							if (pattern_ChoiceAfterMerge_22_2_black_nac_9BB(
																									ecgw,
																									sf1) == null) {
																								if (pattern_ChoiceAfterMerge_22_2_black_nac_11BB(
																										ecgw,
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
																													if (!egw.equals(
																															prevPrevNode)) {
																														if (!ecgw
																																.equals(prevPrevNode)) {
																															if (pattern_ChoiceAfterMerge_22_2_black_nac_0BBBBB(
																																	sf1,
																																	prevNode,
																																	prevPrevNode,
																																	egw,
																																	ecgw) == null) {
																																if (pattern_ChoiceAfterMerge_22_2_black_nac_3BBBB(
																																		egw,
																																		prevNode,
																																		prevPrevNode,
																																		ecgw) == null) {
																																	if (pattern_ChoiceAfterMerge_22_2_black_nac_4BBBB(
																																			ecgw,
																																			prevNode,
																																			prevPrevNode,
																																			egw) == null) {
																																		if (pattern_ChoiceAfterMerge_22_2_black_nac_6BBBB(
																																				ecgw,
																																				prevNode,
																																				prevPrevNode,
																																				egw) == null) {
																																			_result.add(
																																					new Object[] {
																																							prevNode,
																																							prevInFlow,
																																							prevPrevNode,
																																							process,
																																							sf1,
																																							egw,
																																							ecgw,
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
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_22_3_expressionFBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
				ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_22_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_23_1_binding = pattern_ChoiceAfterMerge_23_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_23_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_23_1_black = pattern_ChoiceAfterMerge_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!egw.equals(prevNode)) {
				if (!egw.equals(prevPrevNode)) {
					if (!ecgw.equals(prevNode)) {
						if (!ecgw.equals(prevPrevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_25047 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!prevNode.equals(__DEC_sf1_default_25047)) {
										if (!prevPrevNode.equals(__DEC_sf1_default_25047)) {
											if (!egw.equals(__DEC_sf1_default_25047)) {
												if (!ecgw.equals(__DEC_sf1_default_25047)) {
													return new Object[] { sf1, prevNode, prevPrevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_156250 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_156250)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_140000 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_140000)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!egw.equals(prevPrevNode)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								for (Gateway __DEC_egw___conv_84803 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_84803)) {
										if (!prevNode.equals(__DEC_egw___conv_84803)) {
											if (!prevPrevNode.equals(__DEC_egw___conv_84803)) {
												if (!ecgw.equals(__DEC_egw___conv_84803)) {
													return new Object[] { egw, prevNode, prevPrevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								Gateway __DEC_ecgw___conv_675220 = ecgw.get__conv();
								if (__DEC_ecgw___conv_675220 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_675220)) {
										if (!prevNode.equals(__DEC_ecgw___conv_675220)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_675220)) {
												if (!egw.equals(__DEC_ecgw___conv_675220)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_707858 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_707858)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								for (Gateway __DEC_ecgw___conv_373679 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_373679)) {
										if (!prevNode.equals(__DEC_ecgw___conv_373679)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_373679)) {
												if (!egw.equals(__DEC_ecgw___conv_373679)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_23_2_blackFFFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpEgw = _edge_flowElements.getTrg();
			if (tmpEgw instanceof ExclusiveGateway) {
				ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
				if (process.getFlowElements().contains(egw)) {
					Gateway tmpEcgw = egw.get__conv();
					if (tmpEcgw instanceof ExclusiveGateway) {
						ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
						if (!ecgw.equals(egw)) {
							if (process.getFlowElements().contains(ecgw)) {
								boolean egwisDiverging = egw.isIsDiverging();
								if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
									boolean ecgwisDiverging = ecgw.isIsDiverging();
									if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
										if (pattern_ChoiceAfterMerge_23_2_black_nac_2BB(egw, process) == null) {
											if (pattern_ChoiceAfterMerge_23_2_black_nac_5BB(ecgw, process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof ExclusiveGateway) {
														ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
														if (!egw.equals(prevNode)) {
															if (!ecgw.equals(prevNode)) {
																boolean prevNodeisDiverging = prevNode.isIsDiverging();
																if (Boolean.valueOf(prevNodeisDiverging)
																		.equals(false)) {
																	if (pattern_ChoiceAfterMerge_23_2_black_nac_10BB(
																			prevNode, egw) == null) {
																		if (pattern_ChoiceAfterMerge_23_2_black_nac_11BB(
																				ecgw, prevNode) == null) {
																			for (FlowElement tmpSf1 : process
																					.getFlowElements()) {
																				if (tmpSf1 instanceof SequenceFlow) {
																					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																					if (prevNode.equals(
																							sf1.getSourceRef())) {
																						if (egw.equals(
																								sf1.getTargetRef())) {
																							if (pattern_ChoiceAfterMerge_23_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_ChoiceAfterMerge_23_2_black_nac_7BB(
																										prevNode,
																										sf1) == null) {
																									if (pattern_ChoiceAfterMerge_23_2_black_nac_8BB(
																											egw,
																											sf1) == null) {
																										if (pattern_ChoiceAfterMerge_23_2_black_nac_9BB(
																												ecgw,
																												sf1) == null) {
																											for (SequenceFlow prevInFlow : prevNode
																													.getIncoming()) {
																												if (!prevInFlow
																														.equals(sf1)) {
																													FlowNode prevPrevNode = prevInFlow
																															.getSourceRef();
																													if (prevPrevNode != null) {
																														if (!prevNode
																																.equals(prevPrevNode)) {
																															if (!egw.equals(
																																	prevPrevNode)) {
																																if (!ecgw
																																		.equals(prevPrevNode)) {
																																	if (pattern_ChoiceAfterMerge_23_2_black_nac_0BBBBB(
																																			sf1,
																																			prevNode,
																																			prevPrevNode,
																																			egw,
																																			ecgw) == null) {
																																		if (pattern_ChoiceAfterMerge_23_2_black_nac_3BBBB(
																																				egw,
																																				prevNode,
																																				prevPrevNode,
																																				ecgw) == null) {
																																			if (pattern_ChoiceAfterMerge_23_2_black_nac_4BBBB(
																																					ecgw,
																																					prevNode,
																																					prevPrevNode,
																																					egw) == null) {
																																				if (pattern_ChoiceAfterMerge_23_2_black_nac_6BBBB(
																																						ecgw,
																																						prevNode,
																																						prevPrevNode,
																																						egw) == null) {
																																					_result.add(
																																							new Object[] {
																																									prevNode,
																																									prevInFlow,
																																									prevPrevNode,
																																									process,
																																									sf1,
																																									egw,
																																									ecgw,
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
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_23_3_expressionFBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
				ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_23_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_24_1_binding = pattern_ChoiceAfterMerge_24_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_24_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_24_1_black = pattern_ChoiceAfterMerge_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!egw.equals(prevNode)) {
				if (!egw.equals(prevPrevNode)) {
					if (!ecgw.equals(prevNode)) {
						if (!ecgw.equals(prevPrevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_777163 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!prevNode.equals(__DEC_sf1_default_777163)) {
										if (!prevPrevNode.equals(__DEC_sf1_default_777163)) {
											if (!egw.equals(__DEC_sf1_default_777163)) {
												if (!ecgw.equals(__DEC_sf1_default_777163)) {
													return new Object[] { sf1, prevNode, prevPrevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_825555 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_825555)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_408288 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_408288)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!egw.equals(prevPrevNode)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								for (Gateway __DEC_egw___conv_659661 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_659661)) {
										if (!prevNode.equals(__DEC_egw___conv_659661)) {
											if (!prevPrevNode.equals(__DEC_egw___conv_659661)) {
												if (!ecgw.equals(__DEC_egw___conv_659661)) {
													return new Object[] { egw, prevNode, prevPrevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								Gateway __DEC_ecgw___conv_228787 = ecgw.get__conv();
								if (__DEC_ecgw___conv_228787 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_228787)) {
										if (!prevNode.equals(__DEC_ecgw___conv_228787)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_228787)) {
												if (!egw.equals(__DEC_ecgw___conv_228787)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_715743 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_715743)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								for (Gateway __DEC_ecgw___conv_610118 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_610118)) {
										if (!prevNode.equals(__DEC_ecgw___conv_610118)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_610118)) {
												if (!egw.equals(__DEC_ecgw___conv_610118)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_24_2_blackFFFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			EObject tmpEcgw = _edge_flowElements.getTrg();
			if (tmpEcgw instanceof ExclusiveGateway) {
				ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
				if (process.getFlowElements().contains(ecgw)) {
					boolean ecgwisDiverging = ecgw.isIsDiverging();
					if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
						if (pattern_ChoiceAfterMerge_24_2_black_nac_5BB(ecgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof ExclusiveGateway) {
									ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
									if (!ecgw.equals(prevNode)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
											if (pattern_ChoiceAfterMerge_24_2_black_nac_11BB(ecgw, prevNode) == null) {
												for (FlowElement tmpSf1 : process.getFlowElements()) {
													if (tmpSf1 instanceof SequenceFlow) {
														SequenceFlow sf1 = (SequenceFlow) tmpSf1;
														if (prevNode.equals(sf1.getSourceRef())) {
															FlowNode tmpEgw = sf1.getTargetRef();
															if (tmpEgw instanceof ExclusiveGateway) {
																ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
																if (!egw.equals(prevNode)) {
																	if (!ecgw.equals(egw)) {
																		if (process.getFlowElements().contains(egw)) {
																			if (ecgw.equals(egw.get__conv())) {
																				boolean egwisDiverging = egw
																						.isIsDiverging();
																				if (Boolean.valueOf(egwisDiverging)
																						.equals(Boolean
																								.valueOf(true))) {
																					if (pattern_ChoiceAfterMerge_24_2_black_nac_1BB(
																							sf1, process) == null) {
																						if (pattern_ChoiceAfterMerge_24_2_black_nac_7BB(
																								prevNode,
																								sf1) == null) {
																							if (pattern_ChoiceAfterMerge_24_2_black_nac_9BB(
																									ecgw,
																									sf1) == null) {
																								if (pattern_ChoiceAfterMerge_24_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_ChoiceAfterMerge_24_2_black_nac_8BB(
																											egw,
																											sf1) == null) {
																										if (pattern_ChoiceAfterMerge_24_2_black_nac_10BB(
																												prevNode,
																												egw) == null) {
																											for (SequenceFlow prevInFlow : prevNode
																													.getIncoming()) {
																												if (!prevInFlow
																														.equals(sf1)) {
																													FlowNode prevPrevNode = prevInFlow
																															.getSourceRef();
																													if (prevPrevNode != null) {
																														if (!prevNode
																																.equals(prevPrevNode)) {
																															if (!egw.equals(
																																	prevPrevNode)) {
																																if (!ecgw
																																		.equals(prevPrevNode)) {
																																	if (pattern_ChoiceAfterMerge_24_2_black_nac_0BBBBB(
																																			sf1,
																																			prevNode,
																																			prevPrevNode,
																																			egw,
																																			ecgw) == null) {
																																		if (pattern_ChoiceAfterMerge_24_2_black_nac_3BBBB(
																																				egw,
																																				prevNode,
																																				prevPrevNode,
																																				ecgw) == null) {
																																			if (pattern_ChoiceAfterMerge_24_2_black_nac_4BBBB(
																																					ecgw,
																																					prevNode,
																																					prevPrevNode,
																																					egw) == null) {
																																				if (pattern_ChoiceAfterMerge_24_2_black_nac_6BBBB(
																																						ecgw,
																																						prevNode,
																																						prevPrevNode,
																																						egw) == null) {
																																					_result.add(
																																							new Object[] {
																																									prevNode,
																																									prevInFlow,
																																									prevPrevNode,
																																									process,
																																									sf1,
																																									egw,
																																									ecgw,
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
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_24_3_expressionFBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
				ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_24_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_25_1_binding = pattern_ChoiceAfterMerge_25_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_25_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_25_1_black = pattern_ChoiceAfterMerge_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!egw.equals(prevNode)) {
				if (!egw.equals(prevPrevNode)) {
					if (!ecgw.equals(prevNode)) {
						if (!ecgw.equals(prevPrevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_307396 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!prevNode.equals(__DEC_sf1_default_307396)) {
										if (!prevPrevNode.equals(__DEC_sf1_default_307396)) {
											if (!egw.equals(__DEC_sf1_default_307396)) {
												if (!ecgw.equals(__DEC_sf1_default_307396)) {
													return new Object[] { sf1, prevNode, prevPrevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_995140 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_995140)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_504934 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_504934)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!egw.equals(prevPrevNode)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								for (Gateway __DEC_egw___conv_524030 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_524030)) {
										if (!prevNode.equals(__DEC_egw___conv_524030)) {
											if (!prevPrevNode.equals(__DEC_egw___conv_524030)) {
												if (!ecgw.equals(__DEC_egw___conv_524030)) {
													return new Object[] { egw, prevNode, prevPrevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								Gateway __DEC_ecgw___conv_580784 = ecgw.get__conv();
								if (__DEC_ecgw___conv_580784 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_580784)) {
										if (!prevNode.equals(__DEC_ecgw___conv_580784)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_580784)) {
												if (!egw.equals(__DEC_ecgw___conv_580784)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_338477 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_338477)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								for (Gateway __DEC_ecgw___conv_398966 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_398966)) {
										if (!prevNode.equals(__DEC_ecgw___conv_398966)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_398966)) {
												if (!egw.equals(__DEC_ecgw___conv_398966)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_25_2_blackFFFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (prevNode.equals(sf1.getSourceRef())) {
					FlowNode tmpEgw = sf1.getTargetRef();
					if (tmpEgw instanceof ExclusiveGateway) {
						ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
						if (!egw.equals(prevNode)) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
								Gateway tmpEcgw = egw.get__conv();
								if (tmpEcgw instanceof ExclusiveGateway) {
									ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
									if (!ecgw.equals(prevNode)) {
										if (!ecgw.equals(egw)) {
											boolean egwisDiverging = egw.isIsDiverging();
											if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
												boolean ecgwisDiverging = ecgw.isIsDiverging();
												if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
													if (pattern_ChoiceAfterMerge_25_2_black_nac_7BB(prevNode,
															sf1) == null) {
														if (pattern_ChoiceAfterMerge_25_2_black_nac_8BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterMerge_25_2_black_nac_10BB(prevNode,
																	egw) == null) {
																if (pattern_ChoiceAfterMerge_25_2_black_nac_9BB(ecgw,
																		sf1) == null) {
																	if (pattern_ChoiceAfterMerge_25_2_black_nac_11BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow prevInFlow : prevNode
																				.getIncoming()) {
																			if (!prevInFlow.equals(sf1)) {
																				FlowNode prevPrevNode = prevInFlow
																						.getSourceRef();
																				if (prevPrevNode != null) {
																					if (!prevNode
																							.equals(prevPrevNode)) {
																						if (!egw.equals(prevPrevNode)) {
																							if (!ecgw.equals(
																									prevPrevNode)) {
																								if (pattern_ChoiceAfterMerge_25_2_black_nac_0BBBBB(
																										sf1, prevNode,
																										prevPrevNode,
																										egw,
																										ecgw) == null) {
																									if (pattern_ChoiceAfterMerge_25_2_black_nac_3BBBB(
																											egw,
																											prevNode,
																											prevPrevNode,
																											ecgw) == null) {
																										if (pattern_ChoiceAfterMerge_25_2_black_nac_4BBBB(
																												ecgw,
																												prevNode,
																												prevPrevNode,
																												egw) == null) {
																											if (pattern_ChoiceAfterMerge_25_2_black_nac_6BBBB(
																													ecgw,
																													prevNode,
																													prevPrevNode,
																													egw) == null) {
																												for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																sf1,
																																de.abilov.bpmn.Process.class,
																																"flowElements")) {
																													if (process
																															.getFlowElements()
																															.contains(
																																	prevNode)) {
																														if (process
																																.getFlowElements()
																																.contains(
																																		egw)) {
																															if (process
																																	.getFlowElements()
																																	.contains(
																																			ecgw)) {
																																if (pattern_ChoiceAfterMerge_25_2_black_nac_1BB(
																																		sf1,
																																		process) == null) {
																																	if (pattern_ChoiceAfterMerge_25_2_black_nac_2BB(
																																			egw,
																																			process) == null) {
																																		if (pattern_ChoiceAfterMerge_25_2_black_nac_5BB(
																																				ecgw,
																																				process) == null) {
																																			_result.add(
																																					new Object[] {
																																							prevNode,
																																							prevInFlow,
																																							prevPrevNode,
																																							process,
																																							sf1,
																																							egw,
																																							ecgw,
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
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_25_3_expressionFBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
				ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_25_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_26_1_binding = pattern_ChoiceAfterMerge_26_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_26_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_26_1_black = pattern_ChoiceAfterMerge_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!egw.equals(prevNode)) {
				if (!egw.equals(prevPrevNode)) {
					if (!ecgw.equals(prevNode)) {
						if (!ecgw.equals(prevPrevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_990664 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!prevNode.equals(__DEC_sf1_default_990664)) {
										if (!prevPrevNode.equals(__DEC_sf1_default_990664)) {
											if (!egw.equals(__DEC_sf1_default_990664)) {
												if (!ecgw.equals(__DEC_sf1_default_990664)) {
													return new Object[] { sf1, prevNode, prevPrevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_892983 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_892983)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_74304 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_74304)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!egw.equals(prevPrevNode)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								for (Gateway __DEC_egw___conv_676369 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_676369)) {
										if (!prevNode.equals(__DEC_egw___conv_676369)) {
											if (!prevPrevNode.equals(__DEC_egw___conv_676369)) {
												if (!ecgw.equals(__DEC_egw___conv_676369)) {
													return new Object[] { egw, prevNode, prevPrevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								Gateway __DEC_ecgw___conv_444922 = ecgw.get__conv();
								if (__DEC_ecgw___conv_444922 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_444922)) {
										if (!prevNode.equals(__DEC_ecgw___conv_444922)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_444922)) {
												if (!egw.equals(__DEC_ecgw___conv_444922)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_846274 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_846274)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								for (Gateway __DEC_ecgw___conv_511307 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_511307)) {
										if (!prevNode.equals(__DEC_ecgw___conv_511307)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_511307)) {
												if (!egw.equals(__DEC_ecgw___conv_511307)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_26_2_blackFFFFFFFB(EMoflonEdge _edge_outgoing) {
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
						FlowNode tmpEgw = sf1.getTargetRef();
						if (tmpEgw instanceof ExclusiveGateway) {
							ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
							if (!egw.equals(prevNode)) {
								Gateway tmpEcgw = egw.get__conv();
								if (tmpEcgw instanceof ExclusiveGateway) {
									ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
									if (!ecgw.equals(prevNode)) {
										if (!ecgw.equals(egw)) {
											boolean egwisDiverging = egw.isIsDiverging();
											if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
												boolean ecgwisDiverging = ecgw.isIsDiverging();
												if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
													if (pattern_ChoiceAfterMerge_26_2_black_nac_7BB(prevNode,
															sf1) == null) {
														if (pattern_ChoiceAfterMerge_26_2_black_nac_8BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterMerge_26_2_black_nac_10BB(prevNode,
																	egw) == null) {
																if (pattern_ChoiceAfterMerge_26_2_black_nac_9BB(ecgw,
																		sf1) == null) {
																	if (pattern_ChoiceAfterMerge_26_2_black_nac_11BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow prevInFlow : prevNode
																				.getIncoming()) {
																			if (!prevInFlow.equals(sf1)) {
																				FlowNode prevPrevNode = prevInFlow
																						.getSourceRef();
																				if (prevPrevNode != null) {
																					if (!prevNode
																							.equals(prevPrevNode)) {
																						if (!egw.equals(prevPrevNode)) {
																							if (!ecgw.equals(
																									prevPrevNode)) {
																								if (pattern_ChoiceAfterMerge_26_2_black_nac_0BBBBB(
																										sf1, prevNode,
																										prevPrevNode,
																										egw,
																										ecgw) == null) {
																									if (pattern_ChoiceAfterMerge_26_2_black_nac_3BBBB(
																											egw,
																											prevNode,
																											prevPrevNode,
																											ecgw) == null) {
																										if (pattern_ChoiceAfterMerge_26_2_black_nac_4BBBB(
																												ecgw,
																												prevNode,
																												prevPrevNode,
																												egw) == null) {
																											if (pattern_ChoiceAfterMerge_26_2_black_nac_6BBBB(
																													ecgw,
																													prevNode,
																													prevPrevNode,
																													egw) == null) {
																												for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																prevNode,
																																de.abilov.bpmn.Process.class,
																																"flowElements")) {
																													if (process
																															.getFlowElements()
																															.contains(
																																	sf1)) {
																														if (process
																																.getFlowElements()
																																.contains(
																																		egw)) {
																															if (process
																																	.getFlowElements()
																																	.contains(
																																			ecgw)) {
																																if (pattern_ChoiceAfterMerge_26_2_black_nac_1BB(
																																		sf1,
																																		process) == null) {
																																	if (pattern_ChoiceAfterMerge_26_2_black_nac_2BB(
																																			egw,
																																			process) == null) {
																																		if (pattern_ChoiceAfterMerge_26_2_black_nac_5BB(
																																				ecgw,
																																				process) == null) {
																																			_result.add(
																																					new Object[] {
																																							prevNode,
																																							prevInFlow,
																																							prevPrevNode,
																																							process,
																																							sf1,
																																							egw,
																																							ecgw,
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

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_26_3_expressionFBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
				ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_26_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_27_1_binding = pattern_ChoiceAfterMerge_27_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_27_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_27_1_black = pattern_ChoiceAfterMerge_27_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!egw.equals(prevNode)) {
				if (!egw.equals(prevPrevNode)) {
					if (!ecgw.equals(prevNode)) {
						if (!ecgw.equals(prevPrevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_767686 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!prevNode.equals(__DEC_sf1_default_767686)) {
										if (!prevPrevNode.equals(__DEC_sf1_default_767686)) {
											if (!egw.equals(__DEC_sf1_default_767686)) {
												if (!ecgw.equals(__DEC_sf1_default_767686)) {
													return new Object[] { sf1, prevNode, prevPrevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_5833 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_5833)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_924398 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_924398)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!egw.equals(prevPrevNode)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								for (Gateway __DEC_egw___conv_215224 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_215224)) {
										if (!prevNode.equals(__DEC_egw___conv_215224)) {
											if (!prevPrevNode.equals(__DEC_egw___conv_215224)) {
												if (!ecgw.equals(__DEC_egw___conv_215224)) {
													return new Object[] { egw, prevNode, prevPrevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								Gateway __DEC_ecgw___conv_168674 = ecgw.get__conv();
								if (__DEC_ecgw___conv_168674 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_168674)) {
										if (!prevNode.equals(__DEC_ecgw___conv_168674)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_168674)) {
												if (!egw.equals(__DEC_ecgw___conv_168674)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_852673 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_852673)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								for (Gateway __DEC_ecgw___conv_36368 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_36368)) {
										if (!prevNode.equals(__DEC_ecgw___conv_36368)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_36368)) {
												if (!egw.equals(__DEC_ecgw___conv_36368)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_27_2_blackFFFFFFFB(EMoflonEdge _edge_targetRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_targetRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpEgw = _edge_targetRef.getTrg();
			if (tmpEgw instanceof ExclusiveGateway) {
				ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
				if (egw.equals(sf1.getTargetRef())) {
					FlowNode tmpPrevNode = sf1.getSourceRef();
					if (tmpPrevNode instanceof ExclusiveGateway) {
						ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
						if (!egw.equals(prevNode)) {
							Gateway tmpEcgw = egw.get__conv();
							if (tmpEcgw instanceof ExclusiveGateway) {
								ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
								if (!ecgw.equals(prevNode)) {
									if (!ecgw.equals(egw)) {
										boolean egwisDiverging = egw.isIsDiverging();
										if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
												boolean ecgwisDiverging = ecgw.isIsDiverging();
												if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
													if (pattern_ChoiceAfterMerge_27_2_black_nac_8BB(egw, sf1) == null) {
														if (pattern_ChoiceAfterMerge_27_2_black_nac_7BB(prevNode,
																sf1) == null) {
															if (pattern_ChoiceAfterMerge_27_2_black_nac_10BB(prevNode,
																	egw) == null) {
																if (pattern_ChoiceAfterMerge_27_2_black_nac_9BB(ecgw,
																		sf1) == null) {
																	if (pattern_ChoiceAfterMerge_27_2_black_nac_11BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow prevInFlow : prevNode
																				.getIncoming()) {
																			if (!prevInFlow.equals(sf1)) {
																				FlowNode prevPrevNode = prevInFlow
																						.getSourceRef();
																				if (prevPrevNode != null) {
																					if (!prevNode
																							.equals(prevPrevNode)) {
																						if (!egw.equals(prevPrevNode)) {
																							if (!ecgw.equals(
																									prevPrevNode)) {
																								if (pattern_ChoiceAfterMerge_27_2_black_nac_0BBBBB(
																										sf1, prevNode,
																										prevPrevNode,
																										egw,
																										ecgw) == null) {
																									if (pattern_ChoiceAfterMerge_27_2_black_nac_3BBBB(
																											egw,
																											prevNode,
																											prevPrevNode,
																											ecgw) == null) {
																										if (pattern_ChoiceAfterMerge_27_2_black_nac_4BBBB(
																												ecgw,
																												prevNode,
																												prevPrevNode,
																												egw) == null) {
																											if (pattern_ChoiceAfterMerge_27_2_black_nac_6BBBB(
																													ecgw,
																													prevNode,
																													prevPrevNode,
																													egw) == null) {
																												for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																sf1,
																																de.abilov.bpmn.Process.class,
																																"flowElements")) {
																													if (process
																															.getFlowElements()
																															.contains(
																																	prevNode)) {
																														if (process
																																.getFlowElements()
																																.contains(
																																		egw)) {
																															if (process
																																	.getFlowElements()
																																	.contains(
																																			ecgw)) {
																																if (pattern_ChoiceAfterMerge_27_2_black_nac_1BB(
																																		sf1,
																																		process) == null) {
																																	if (pattern_ChoiceAfterMerge_27_2_black_nac_2BB(
																																			egw,
																																			process) == null) {
																																		if (pattern_ChoiceAfterMerge_27_2_black_nac_5BB(
																																				ecgw,
																																				process) == null) {
																																			_result.add(
																																					new Object[] {
																																							prevNode,
																																							prevInFlow,
																																							prevPrevNode,
																																							process,
																																							sf1,
																																							egw,
																																							ecgw,
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
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_27_3_expressionFBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
				ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_27_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_28_1_binding = pattern_ChoiceAfterMerge_28_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_28_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_28_1_black = pattern_ChoiceAfterMerge_28_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!egw.equals(prevNode)) {
				if (!egw.equals(prevPrevNode)) {
					if (!ecgw.equals(prevNode)) {
						if (!ecgw.equals(prevPrevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_945335 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!prevNode.equals(__DEC_sf1_default_945335)) {
										if (!prevPrevNode.equals(__DEC_sf1_default_945335)) {
											if (!egw.equals(__DEC_sf1_default_945335)) {
												if (!ecgw.equals(__DEC_sf1_default_945335)) {
													return new Object[] { sf1, prevNode, prevPrevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_375170 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_375170)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_306798 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_306798)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!egw.equals(prevPrevNode)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								for (Gateway __DEC_egw___conv_783605 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_783605)) {
										if (!prevNode.equals(__DEC_egw___conv_783605)) {
											if (!prevPrevNode.equals(__DEC_egw___conv_783605)) {
												if (!ecgw.equals(__DEC_egw___conv_783605)) {
													return new Object[] { egw, prevNode, prevPrevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								Gateway __DEC_ecgw___conv_261647 = ecgw.get__conv();
								if (__DEC_ecgw___conv_261647 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_261647)) {
										if (!prevNode.equals(__DEC_ecgw___conv_261647)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_261647)) {
												if (!egw.equals(__DEC_ecgw___conv_261647)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_215842 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_215842)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								for (Gateway __DEC_ecgw___conv_328690 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_328690)) {
										if (!prevNode.equals(__DEC_ecgw___conv_328690)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_328690)) {
												if (!egw.equals(__DEC_ecgw___conv_328690)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_28_2_blackFFFFFFFB(EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEgw = _edge_incoming.getSrc();
		if (tmpEgw instanceof ExclusiveGateway) {
			ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
			EObject tmpSf1 = _edge_incoming.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (egw.equals(sf1.getTargetRef())) {
					Gateway tmpEcgw = egw.get__conv();
					if (tmpEcgw instanceof ExclusiveGateway) {
						ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
						if (!ecgw.equals(egw)) {
							boolean egwisDiverging = egw.isIsDiverging();
							if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
								FlowNode tmpPrevNode = sf1.getSourceRef();
								if (tmpPrevNode instanceof ExclusiveGateway) {
									ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
									if (!egw.equals(prevNode)) {
										if (!ecgw.equals(prevNode)) {
											boolean ecgwisDiverging = ecgw.isIsDiverging();
											if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
												boolean prevNodeisDiverging = prevNode.isIsDiverging();
												if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
													if (pattern_ChoiceAfterMerge_28_2_black_nac_8BB(egw, sf1) == null) {
														if (pattern_ChoiceAfterMerge_28_2_black_nac_9BB(ecgw,
																sf1) == null) {
															if (pattern_ChoiceAfterMerge_28_2_black_nac_7BB(prevNode,
																	sf1) == null) {
																if (pattern_ChoiceAfterMerge_28_2_black_nac_10BB(
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterMerge_28_2_black_nac_11BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow prevInFlow : prevNode
																				.getIncoming()) {
																			if (!prevInFlow.equals(sf1)) {
																				FlowNode prevPrevNode = prevInFlow
																						.getSourceRef();
																				if (prevPrevNode != null) {
																					if (!prevNode
																							.equals(prevPrevNode)) {
																						if (!egw.equals(prevPrevNode)) {
																							if (!ecgw.equals(
																									prevPrevNode)) {
																								if (pattern_ChoiceAfterMerge_28_2_black_nac_0BBBBB(
																										sf1, prevNode,
																										prevPrevNode,
																										egw,
																										ecgw) == null) {
																									if (pattern_ChoiceAfterMerge_28_2_black_nac_3BBBB(
																											egw,
																											prevNode,
																											prevPrevNode,
																											ecgw) == null) {
																										if (pattern_ChoiceAfterMerge_28_2_black_nac_4BBBB(
																												ecgw,
																												prevNode,
																												prevPrevNode,
																												egw) == null) {
																											if (pattern_ChoiceAfterMerge_28_2_black_nac_6BBBB(
																													ecgw,
																													prevNode,
																													prevPrevNode,
																													egw) == null) {
																												for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																egw,
																																de.abilov.bpmn.Process.class,
																																"flowElements")) {
																													if (process
																															.getFlowElements()
																															.contains(
																																	prevNode)) {
																														if (process
																																.getFlowElements()
																																.contains(
																																		sf1)) {
																															if (process
																																	.getFlowElements()
																																	.contains(
																																			ecgw)) {
																																if (pattern_ChoiceAfterMerge_28_2_black_nac_1BB(
																																		sf1,
																																		process) == null) {
																																	if (pattern_ChoiceAfterMerge_28_2_black_nac_2BB(
																																			egw,
																																			process) == null) {
																																		if (pattern_ChoiceAfterMerge_28_2_black_nac_5BB(
																																				ecgw,
																																				process) == null) {
																																			_result.add(
																																					new Object[] {
																																							prevNode,
																																							prevInFlow,
																																							prevPrevNode,
																																							process,
																																							sf1,
																																							egw,
																																							ecgw,
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
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_28_3_expressionFBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
				ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_28_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_1_bindingFB(ChoiceAfterMerge _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_1_blackFBB(EClass __eClass, ChoiceAfterMerge _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_1_bindingAndBlackFFB(ChoiceAfterMerge _this) {
		Object[] result_pattern_ChoiceAfterMerge_29_1_binding = pattern_ChoiceAfterMerge_29_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterMerge_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterMerge_29_1_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_29_1_black = pattern_ChoiceAfterMerge_29_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterMerge_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterMerge_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!prevNode.equals(prevPrevNode)) {
			if (!egw.equals(prevNode)) {
				if (!egw.equals(prevPrevNode)) {
					if (!ecgw.equals(prevNode)) {
						if (!ecgw.equals(prevPrevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_276356 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!prevNode.equals(__DEC_sf1_default_276356)) {
										if (!prevPrevNode.equals(__DEC_sf1_default_276356)) {
											if (!egw.equals(__DEC_sf1_default_276356)) {
												if (!ecgw.equals(__DEC_sf1_default_276356)) {
													return new Object[] { sf1, prevNode, prevPrevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_981512 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_981512)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_928841 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_928841)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!egw.equals(prevPrevNode)) {
				if (!prevNode.equals(prevPrevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(prevPrevNode)) {
								for (Gateway __DEC_egw___conv_461007 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_461007)) {
										if (!prevNode.equals(__DEC_egw___conv_461007)) {
											if (!prevPrevNode.equals(__DEC_egw___conv_461007)) {
												if (!ecgw.equals(__DEC_egw___conv_461007)) {
													return new Object[] { egw, prevNode, prevPrevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								Gateway __DEC_ecgw___conv_560723 = ecgw.get__conv();
								if (__DEC_ecgw___conv_560723 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_560723)) {
										if (!prevNode.equals(__DEC_ecgw___conv_560723)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_560723)) {
												if (!egw.equals(__DEC_ecgw___conv_560723)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_876338 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_876338)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, FlowNode prevPrevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(prevPrevNode)) {
				if (!ecgw.equals(egw)) {
					if (!prevNode.equals(prevPrevNode)) {
						if (!egw.equals(prevNode)) {
							if (!egw.equals(prevPrevNode)) {
								for (Gateway __DEC_ecgw___conv_79277 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_79277)) {
										if (!prevNode.equals(__DEC_ecgw___conv_79277)) {
											if (!prevPrevNode.equals(__DEC_ecgw___conv_79277)) {
												if (!egw.equals(__DEC_ecgw___conv_79277)) {
													return new Object[] { ecgw, prevNode, prevPrevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_29_2_blackFFFFFFFB(EMoflonEdge _edge___conv) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEgw = _edge___conv.getSrc();
		if (tmpEgw instanceof ExclusiveGateway) {
			ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
			EObject tmpEcgw = _edge___conv.getTrg();
			if (tmpEcgw instanceof ExclusiveGateway) {
				ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
				if (!ecgw.equals(egw)) {
					if (ecgw.equals(egw.get__conv())) {
						boolean egwisDiverging = egw.isIsDiverging();
						if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
							boolean ecgwisDiverging = ecgw.isIsDiverging();
							if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
								for (SequenceFlow sf1 : egw.getIncoming()) {
									FlowNode tmpPrevNode = sf1.getSourceRef();
									if (tmpPrevNode instanceof ExclusiveGateway) {
										ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
										if (!egw.equals(prevNode)) {
											if (!ecgw.equals(prevNode)) {
												boolean prevNodeisDiverging = prevNode.isIsDiverging();
												if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
													if (pattern_ChoiceAfterMerge_29_2_black_nac_8BB(egw, sf1) == null) {
														if (pattern_ChoiceAfterMerge_29_2_black_nac_9BB(ecgw,
																sf1) == null) {
															if (pattern_ChoiceAfterMerge_29_2_black_nac_7BB(prevNode,
																	sf1) == null) {
																if (pattern_ChoiceAfterMerge_29_2_black_nac_10BB(
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterMerge_29_2_black_nac_11BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow prevInFlow : prevNode
																				.getIncoming()) {
																			if (!prevInFlow.equals(sf1)) {
																				FlowNode prevPrevNode = prevInFlow
																						.getSourceRef();
																				if (prevPrevNode != null) {
																					if (!prevNode
																							.equals(prevPrevNode)) {
																						if (!egw.equals(prevPrevNode)) {
																							if (!ecgw.equals(
																									prevPrevNode)) {
																								if (pattern_ChoiceAfterMerge_29_2_black_nac_0BBBBB(
																										sf1, prevNode,
																										prevPrevNode,
																										egw,
																										ecgw) == null) {
																									if (pattern_ChoiceAfterMerge_29_2_black_nac_3BBBB(
																											egw,
																											prevNode,
																											prevPrevNode,
																											ecgw) == null) {
																										if (pattern_ChoiceAfterMerge_29_2_black_nac_4BBBB(
																												ecgw,
																												prevNode,
																												prevPrevNode,
																												egw) == null) {
																											if (pattern_ChoiceAfterMerge_29_2_black_nac_6BBBB(
																													ecgw,
																													prevNode,
																													prevPrevNode,
																													egw) == null) {
																												for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																														.getOppositeReferenceTyped(
																																egw,
																																de.abilov.bpmn.Process.class,
																																"flowElements")) {
																													if (process
																															.getFlowElements()
																															.contains(
																																	prevNode)) {
																														if (process
																																.getFlowElements()
																																.contains(
																																		sf1)) {
																															if (process
																																	.getFlowElements()
																																	.contains(
																																			ecgw)) {
																																if (pattern_ChoiceAfterMerge_29_2_black_nac_1BB(
																																		sf1,
																																		process) == null) {
																																	if (pattern_ChoiceAfterMerge_29_2_black_nac_2BB(
																																			egw,
																																			process) == null) {
																																		if (pattern_ChoiceAfterMerge_29_2_black_nac_5BB(
																																				ecgw,
																																				process) == null) {
																																			_result.add(
																																					new Object[] {
																																							prevNode,
																																							prevInFlow,
																																							prevPrevNode,
																																							process,
																																							sf1,
																																							egw,
																																							ecgw,
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

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_29_3_expressionFBBBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow prevInFlow, FlowNode prevPrevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, prevInFlow, prevPrevNode, process, sf1, egw,
				ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_29_4_expressionFBB(ChoiceAfterMerge _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterMerge_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ChoiceAfterMergeImpl
