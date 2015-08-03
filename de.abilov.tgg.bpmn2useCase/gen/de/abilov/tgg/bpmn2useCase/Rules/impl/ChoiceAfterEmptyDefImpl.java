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
import de.abilov.tgg.bpmn2useCase.GW2S;

import de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterEmptyDef;
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
 * An implementation of the model object '<em><b>Choice After Empty Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChoiceAfterEmptyDefImpl extends AbstractRuleImpl implements ChoiceAfterEmptyDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceAfterEmptyDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getChoiceAfterEmptyDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SequenceFlow defInFlow, ExclusiveGateway eg,
			ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		// initial bindings
		Object[] result1_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_0_1_blackBBBBBBBBB(this, match,
				defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[defInFlow] = " + defInFlow + ", "
					+ "[eg] = " + eg + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", "
					+ "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_0_2_bindingAndBlackFBBBBBBBBB(this, match, defInFlow, eg, prevNode,
						process, sf1, egw, ecgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[defInFlow] = " + defInFlow + ", " + "[eg] = " + eg
					+ ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1
					+ ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_0_4_blackBBBBBBBB(match,
					defInFlow, eg, prevNode, process, sf1, egw, ecgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[defInFlow] = " + defInFlow + ", " + "[eg] = "
						+ eg + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", " + "[sf1] = "
						+ sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_0_4_greenBBBBBBFFFFFFFF(match, prevNode, process, sf1,
					egw, ecgw);
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result4_green[7];
					// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result4_green[8];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[9];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[10];
					// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result4_green[11];
					// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result4_green[12];
					// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_0_5_blackBBBBBBBB(match,
					defInFlow, eg, prevNode, process, sf1, egw, ecgw);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[defInFlow] = " + defInFlow + ", " + "[eg] = "
						+ eg + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", " + "[sf1] = "
						+ sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_0_5_greenBBBBBFFFFFF(match, defInFlow, eg, prevNode,
					process);
					// EMoflonEdge defInFlow__eg____sourceRef = (EMoflonEdge) result5_green[5];
					// EMoflonEdge eg__defInFlow____outgoing = (EMoflonEdge) result5_green[6];
					// EMoflonEdge eg__defInFlow____default = (EMoflonEdge) result5_green[7];
					// EMoflonEdge defInFlow__prevNode____targetRef = (EMoflonEdge) result5_green[8];
					// EMoflonEdge prevNode__defInFlow____incoming = (EMoflonEdge) result5_green[9];
					// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[10];

			// register objects to match
			ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_0_6_expressionBBBBBBBBB(this, match, defInFlow, eg,
					prevNode, process, sf1, egw, ecgw);
			return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_0_7_expressionF();
		} else {
			return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_1_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SequenceFlow defInFlow = (SequenceFlow) result1_bindingAndBlack[0];
		ExclusiveGateway eg = (ExclusiveGateway) result1_bindingAndBlack[1];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[2];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[3];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[4];
		Flow flow = (Flow) result1_bindingAndBlack[5];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[6];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[7];
		ExclusiveGateway egw = (ExclusiveGateway) result1_bindingAndBlack[8];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_1_1_greenBFBBFBFB(choiceStep, flow,
				egw, ecgw, csp);
		NormalStep step = (NormalStep) result1_green[1];
		GW2S egwToStep = (GW2S) result1_green[4];
		GW2S ecgwToStep = (GW2S) result1_green[6];

		// collect translated elements
		Object[] result2_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_1_2_blackBBBBBB(step, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = "
					+ egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_1_2_greenFBBBBBB(step, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_1_3_blackBBBBBBBBBBBBBB(ruleresult,
				defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[defInFlow] = " + defInFlow + ", " + "[eg] = " + eg
					+ ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
					+ pn2cs + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep + ", "
					+ "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode,
				choiceStep, step, flow, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result3_green[11];
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
		ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_1_5_expressionBBBBBBBBBBBBBBB(this, ruleresult, defInFlow,
				eg, prevNode, choiceStep, pn2cs, step, flow, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_2_2_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SequenceFlow defInFlow = (SequenceFlow) result2_binding[0];
		ExclusiveGateway eg = (ExclusiveGateway) result2_binding[1];
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[2];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[3];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[4];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[5];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[6];
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_2_2_blackBBBFFBBBBB(defInFlow,
				eg, prevNode, process, sf1, egw, ecgw, match)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[3];
			GW2S pn2cs = (GW2S) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_2_3_blackBBBBBFBBBB(
					defInFlow, eg, prevNode, choiceStep, pn2cs, process, sf1, egw, ecgw)) {
				Flow flow = (Flow) result3_black[5];
				Object[] result3_green = ChoiceAfterEmptyDefImpl
						.pattern_ChoiceAfterEmptyDef_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFFFF(defInFlow, eg, prevNode,
								choiceStep, pn2cs, flow, process, sf1, egw, ecgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge defInFlow__eg____sourceRef = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eg__defInFlow____outgoing = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eg__defInFlow____default = (EMoflonEdge) result3_green[13];
				// EMoflonEdge defInFlow__prevNode____targetRef = (EMoflonEdge) result3_green[14];
				// EMoflonEdge prevNode__defInFlow____incoming = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[16];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[22];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[24];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[25];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[26];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[27];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterEmptyDefImpl
						.pattern_ChoiceAfterEmptyDef_2_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
								defInFlow, eg, prevNode, choiceStep, pn2cs, flow, process, sf1, egw, ecgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[defInFlow] = " + defInFlow + ", " + "[eg] = " + eg + ", " + "[prevNode] = " + prevNode
							+ ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[flow] = "
							+ flow + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw
							+ ", " + "[ecgw] = " + ecgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SequenceFlow defInFlow, ExclusiveGateway eg,
			ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		match.registerObject("defInFlow", defInFlow);
		match.registerObject("eg", eg);
		match.registerObject("prevNode", prevNode);
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
	public CSP isAppropriate_solveCsp_FWD(Match match, SequenceFlow defInFlow, ExclusiveGateway eg,
			ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs, Flow flow,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
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
		isApplicableMatch.registerObject("defInFlow", defInFlow);
		isApplicableMatch.registerObject("eg", eg);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("choiceStep", choiceStep);
		isApplicableMatch.registerObject("pn2cs", pn2cs);
		isApplicableMatch.registerObject("flow", flow);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject defInFlow, EObject eg, EObject prevNode,
			EObject choiceStep, EObject pn2cs, EObject step, EObject flow, EObject process, EObject sf1, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("defInFlow", defInFlow);
		ruleresult.registerObject("eg", eg);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
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
	public boolean isAppropriate_BWD(Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_10_1_blackBBBBB(this, match,
				choiceStep, step, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
					+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_10_2_bindingAndBlackFBBBBB(this, match, choiceStep, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", " + "[step] = "
					+ step + ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_10_4_blackBBBB(match,
					choiceStep, step, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_10_4_greenBBBBFF(match, choiceStep, step, flow);
			// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_10_5_blackBBBB(match,
					choiceStep, step, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[choiceStep] = " + choiceStep + ", "
						+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
			}
			ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_10_5_greenBBBF(match, choiceStep, flow);
			// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result5_green[3];

			// register objects to match
			ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_10_6_expressionBBBBB(this, match, choiceStep, step,
					flow);
			return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_10_7_expressionF();
		} else {
			return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_11_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SequenceFlow defInFlow = (SequenceFlow) result1_bindingAndBlack[0];
		ExclusiveGateway eg = (ExclusiveGateway) result1_bindingAndBlack[1];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[2];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[3];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[4];
		NormalStep step = (NormalStep) result1_bindingAndBlack[5];
		Flow flow = (Flow) result1_bindingAndBlack[6];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_11_1_greenBBBFFFFFB(prevNode, step,
				process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[3];
		ExclusiveGateway egw = (ExclusiveGateway) result1_green[4];
		GW2S egwToStep = (GW2S) result1_green[5];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_green[6];
		GW2S ecgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_11_2_blackBBBBBB(step, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[step] = " + step + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = "
					+ egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_11_2_greenFBBBBBB(step, sf1, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_11_3_blackBBBBBBBBBBBBBB(
				ruleresult, defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow, process, sf1, egw, egwToStep, ecgw,
				ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[defInFlow] = " + defInFlow + ", " + "[eg] = " + eg
					+ ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
					+ pn2cs + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", " + "[process] = " + process
					+ ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep + ", "
					+ "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, prevNode,
				choiceStep, step, flow, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result3_green[11];
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
		ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_11_5_expressionBBBBBBBBBBBBBBB(this, ruleresult, defInFlow,
				eg, prevNode, choiceStep, pn2cs, step, flow, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep choiceStep = (ChoiceStep) result2_binding[0];
		NormalStep step = (NormalStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_12_2_blackFBFBBB(choiceStep,
				step, flow, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S pn2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterEmptyDefImpl
					.pattern_ChoiceAfterEmptyDef_12_3_blackFFBBBBBF(prevNode, choiceStep, pn2cs, step, flow)) {
				SequenceFlow defInFlow = (SequenceFlow) result3_black[0];
				ExclusiveGateway eg = (ExclusiveGateway) result3_black[1];
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[7];
				Object[] result3_green = ChoiceAfterEmptyDefImpl
						.pattern_ChoiceAfterEmptyDef_12_3_greenBBBBBBBBFFFFFFFFFFFF(defInFlow, eg, prevNode, choiceStep,
								pn2cs, step, flow, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge defInFlow__eg____sourceRef = (EMoflonEdge) result3_green[9];
				// EMoflonEdge eg__defInFlow____outgoing = (EMoflonEdge) result3_green[10];
				// EMoflonEdge eg__defInFlow____default = (EMoflonEdge) result3_green[11];
				// EMoflonEdge defInFlow__prevNode____targetRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge prevNode__defInFlow____incoming = (EMoflonEdge) result3_green[13];
				// EMoflonEdge choiceStep__step____next = (EMoflonEdge) result3_green[14];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[18];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[19];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterEmptyDefImpl
						.pattern_ChoiceAfterEmptyDef_12_4_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, defInFlow,
								eg, prevNode, choiceStep, pn2cs, step, flow, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[defInFlow] = " + defInFlow + ", " + "[eg] = " + eg + ", " + "[prevNode] = " + prevNode
							+ ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[step] = "
							+ step + ", " + "[flow] = " + flow + ", " + "[process] = " + process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterEmptyDefImpl
							.pattern_ChoiceAfterEmptyDef_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {
		match.registerObject("choiceStep", choiceStep);
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs, NormalStep step,
			Flow flow, de.abilov.bpmn.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("defInFlow", defInFlow);
		isApplicableMatch.registerObject("eg", eg);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("choiceStep", choiceStep);
		isApplicableMatch.registerObject("pn2cs", pn2cs);
		isApplicableMatch.registerObject("step", step);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject defInFlow, EObject eg, EObject prevNode,
			EObject choiceStep, EObject pn2cs, EObject step, EObject flow, EObject process, EObject sf1, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("defInFlow", defInFlow);
		ruleresult.registerObject("eg", eg);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_180(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_20_2_blackFFFB(_edge_next)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_20_3_expressionFBBBBB(this, match, choiceStep, step,
					flow)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_181(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_21_2_blackFFFB(_edge_steps)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[0];
			NormalStep step = (NormalStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_21_3_expressionFBBBBB(this, match, choiceStep, step,
					flow)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_589(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_22_2_blackFFFFFFFB(_edge_flowElements)) {
			SequenceFlow defInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_22_3_expressionFBBBBBBBBB(this, match, defInFlow,
					eg, prevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_590(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_23_2_blackFFFFFFFB(_edge_flowElements)) {
			SequenceFlow defInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_23_3_expressionFBBBBBBBBB(this, match, defInFlow,
					eg, prevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_591(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_24_2_blackFFFFFFFB(_edge_flowElements)) {
			SequenceFlow defInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_24_3_expressionFBBBBBBBBB(this, match, defInFlow,
					eg, prevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_592(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_25_2_blackFFFFFFFB(_edge_sourceRef)) {
			SequenceFlow defInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_25_3_expressionFBBBBBBBBB(this, match, defInFlow,
					eg, prevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_593(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_26_2_blackFFFFFFFB(_edge_outgoing)) {
			SequenceFlow defInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_26_3_expressionFBBBBBBBBB(this, match, defInFlow,
					eg, prevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_594(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_27_2_blackFFFFFFFB(_edge_targetRef)) {
			SequenceFlow defInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_27_3_expressionFBBBBBBBBB(this, match, defInFlow,
					eg, prevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_595(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_28_2_blackFFFFFFFB(_edge_incoming)) {
			SequenceFlow defInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_28_3_expressionFBBBBBBBBB(this, match, defInFlow,
					eg, prevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_28_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_596(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterEmptyDefImpl
				.pattern_ChoiceAfterEmptyDef_29_2_blackFFFFFFFB(_edge___conv)) {
			SequenceFlow defInFlow = (SequenceFlow) result2_black[0];
			ExclusiveGateway eg = (ExclusiveGateway) result2_black[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[2];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[3];
			SequenceFlow sf1 = (SequenceFlow) result2_black[4];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[5];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[6];
			Object[] result2_green = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_29_3_expressionFBBBBBBBBB(this, match, defInFlow,
					eg, prevNode, process, sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_29_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterEmptyDefImpl.pattern_ChoiceAfterEmptyDef_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ChoiceAfterEmptyDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForDefInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("defInFlow")).findAny();
		de.abilov.bpmn.SequenceFlow defInFlow = (de.abilov.bpmn.SequenceFlow) matchForDefInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg")).findAny();
		de.abilov.bpmn.ExclusiveGateway eg = (de.abilov.bpmn.ExclusiveGateway) matchForEg.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		de.abilov.useCase.ChoiceStep choiceStep = (de.abilov.useCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pn2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

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

		if (!(eg.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

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

		eq0.setRuleName("ChoiceAfterEmptyDef");
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
		ruleResult.setRule("ChoiceAfterEmptyDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForDefInFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("defInFlow")).findAny();
		de.abilov.bpmn.SequenceFlow defInFlow = (de.abilov.bpmn.SequenceFlow) matchForDefInFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg")).findAny();
		de.abilov.bpmn.ExclusiveGateway eg = (de.abilov.bpmn.ExclusiveGateway) matchForEg.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		de.abilov.useCase.ChoiceStep choiceStep = (de.abilov.useCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S pn2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.NormalStep step = (de.abilov.useCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

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

		if (!(eg.isIsDiverging() == true)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

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

		eq0.setRuleName("ChoiceAfterEmptyDef");
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
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6), (ExclusiveGateway) arguments.get(7));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6), (ExclusiveGateway) arguments.get(7));
			return null;
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(de.abilov.bpmn.Process) arguments.get(4), (SequenceFlow) arguments.get(5),
					(ExclusiveGateway) arguments.get(6), (ExclusiveGateway) arguments.get(7));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_FLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(ChoiceStep) arguments.get(4), (GW2S) arguments.get(5), (Flow) arguments.get(6),
					(de.abilov.bpmn.Process) arguments.get(7), (SequenceFlow) arguments.get(8),
					(ExclusiveGateway) arguments.get(9), (ExclusiveGateway) arguments.get(10));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(NormalStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(NormalStep) arguments.get(2), (Flow) arguments.get(3));
			return null;
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_NORMALSTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(NormalStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_NORMALSTEP_FLOW_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (SequenceFlow) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (ExclusiveGateway) arguments.get(3),
					(ChoiceStep) arguments.get(4), (GW2S) arguments.get(5), (NormalStep) arguments.get(6),
					(Flow) arguments.get(7), (de.abilov.bpmn.Process) arguments.get(8));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_180__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_180((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_181__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_181((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_589__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_589((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_590__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_590((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_591__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_591((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_592__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_592((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_593__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_593((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_594__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_594((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_595__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_595((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_596__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_596((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_EMPTY_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_0_1_blackBBBBBBBBB(ChoiceAfterEmptyDef _this, Match match,
			SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!defInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				if (!eg.equals(egw)) {
					if (!egw.equals(prevNode)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								if (!ecgw.equals(egw)) {
									return new Object[] { _this, match, defInFlow, eg, prevNode, process, sf1, egw,
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_0_2_bindingFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, defInFlow, eg, prevNode, process, sf1, egw,
				ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, defInFlow, eg, prevNode, process, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_0_2_bindingAndBlackFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterEmptyDef_0_2_binding = pattern_ChoiceAfterEmptyDef_0_2_bindingFBBBBBBBBB(
				_this, match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		if (result_pattern_ChoiceAfterEmptyDef_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterEmptyDef_0_2_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_0_2_black = pattern_ChoiceAfterEmptyDef_0_2_blackB(csp);
			if (result_pattern_ChoiceAfterEmptyDef_0_2_black != null) {

				return new Object[] { csp, _this, match, defInFlow, eg, prevNode, process, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_0_3_expressionFBB(ChoiceAfterEmptyDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_0_4_blackBBBBBBBB(Match match, SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!defInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				if (!eg.equals(egw)) {
					if (!egw.equals(prevNode)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								if (!ecgw.equals(egw)) {
									return new Object[] { match, defInFlow, eg, prevNode, process, sf1, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_0_4_greenBBBBBBFFFFFFFF(Match match,
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_0_5_blackBBBBBBBB(Match match, SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!defInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				if (!eg.equals(egw)) {
					if (!egw.equals(prevNode)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								if (!ecgw.equals(egw)) {
									return new Object[] { match, defInFlow, eg, prevNode, process, sf1, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_0_5_greenBBBBBFFFFFF(Match match, SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, de.abilov.bpmn.Process process) {
		EMoflonEdge defInFlow__eg____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__defInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__defInFlow____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__defInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(defInFlow);
		match.getContextNodes().add(eg);
		match.getContextNodes().add(prevNode);
		match.getContextNodes().add(process);
		String defInFlow__eg____sourceRef_name_prime = "sourceRef";
		String eg__defInFlow____outgoing_name_prime = "outgoing";
		String eg__defInFlow____default_name_prime = "default";
		String defInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__defInFlow____incoming_name_prime = "incoming";
		String process__prevNode____flowElements_name_prime = "flowElements";
		defInFlow__eg____sourceRef.setSrc(defInFlow);
		defInFlow__eg____sourceRef.setTrg(eg);
		match.getContextEdges().add(defInFlow__eg____sourceRef);
		eg__defInFlow____outgoing.setSrc(eg);
		eg__defInFlow____outgoing.setTrg(defInFlow);
		match.getContextEdges().add(eg__defInFlow____outgoing);
		eg__defInFlow____default.setSrc(eg);
		eg__defInFlow____default.setTrg(defInFlow);
		match.getContextEdges().add(eg__defInFlow____default);
		defInFlow__prevNode____targetRef.setSrc(defInFlow);
		defInFlow__prevNode____targetRef.setTrg(prevNode);
		match.getContextEdges().add(defInFlow__prevNode____targetRef);
		prevNode__defInFlow____incoming.setSrc(prevNode);
		prevNode__defInFlow____incoming.setTrg(defInFlow);
		match.getContextEdges().add(prevNode__defInFlow____incoming);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		match.getContextEdges().add(process__prevNode____flowElements);
		defInFlow__eg____sourceRef.setName(defInFlow__eg____sourceRef_name_prime);
		eg__defInFlow____outgoing.setName(eg__defInFlow____outgoing_name_prime);
		eg__defInFlow____default.setName(eg__defInFlow____default_name_prime);
		defInFlow__prevNode____targetRef.setName(defInFlow__prevNode____targetRef_name_prime);
		prevNode__defInFlow____incoming.setName(prevNode__defInFlow____incoming_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { match, defInFlow, eg, prevNode, process, defInFlow__eg____sourceRef,
				eg__defInFlow____outgoing, eg__defInFlow____default, defInFlow__prevNode____targetRef,
				prevNode__defInFlow____incoming, process__prevNode____flowElements };
	}

	public static final void pattern_ChoiceAfterEmptyDef_0_6_expressionBBBBBBBBB(ChoiceAfterEmptyDef _this, Match match,
			SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode, de.abilov.bpmn.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		_this.registerObjectsToMatch_FWD(match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_1_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("defInFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("eg");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_5 = isApplicableMatch.getObject("flow");
		EObject _localVariable_6 = isApplicableMatch.getObject("process");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_8 = isApplicableMatch.getObject("egw");
		EObject _localVariable_9 = isApplicableMatch.getObject("ecgw");
		EObject tmpDefInFlow = _localVariable_0;
		EObject tmpEg = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpChoiceStep = _localVariable_3;
		EObject tmpPn2cs = _localVariable_4;
		EObject tmpFlow = _localVariable_5;
		EObject tmpProcess = _localVariable_6;
		EObject tmpSf1 = _localVariable_7;
		EObject tmpEgw = _localVariable_8;
		EObject tmpEcgw = _localVariable_9;
		if (tmpDefInFlow instanceof SequenceFlow) {
			SequenceFlow defInFlow = (SequenceFlow) tmpDefInFlow;
			if (tmpEg instanceof ExclusiveGateway) {
				ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
				if (tmpPrevNode instanceof ExclusiveGateway) {
					ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
					if (tmpChoiceStep instanceof ChoiceStep) {
						ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
						if (tmpPn2cs instanceof GW2S) {
							GW2S pn2cs = (GW2S) tmpPn2cs;
							if (tmpFlow instanceof Flow) {
								Flow flow = (Flow) tmpFlow;
								if (tmpProcess instanceof de.abilov.bpmn.Process) {
									de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
									if (tmpSf1 instanceof SequenceFlow) {
										SequenceFlow sf1 = (SequenceFlow) tmpSf1;
										if (tmpEgw instanceof ExclusiveGateway) {
											ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
											if (tmpEcgw instanceof ExclusiveGateway) {
												ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
												return new Object[] { defInFlow, eg, prevNode, choiceStep, pn2cs, flow,
														process, sf1, egw, ecgw, isApplicableMatch };
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_1_1_blackBBBBBBBBBBBFB(SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs, Flow flow,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw,
			ChoiceAfterEmptyDef _this, IsApplicableMatch isApplicableMatch) {
		if (!defInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				if (!eg.equals(egw)) {
					if (!egw.equals(prevNode)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								if (!ecgw.equals(egw)) {
									for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
										if (tmpCsp instanceof CSP) {
											CSP csp = (CSP) tmpCsp;
											return new Object[] { defInFlow, eg, prevNode, choiceStep, pn2cs, flow,
													process, sf1, egw, ecgw, _this, csp, isApplicableMatch };
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_1_1_bindingAndBlackFFFFFFFFFFBFB(ChoiceAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterEmptyDef_1_1_binding = pattern_ChoiceAfterEmptyDef_1_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterEmptyDef_1_1_binding != null) {
			SequenceFlow defInFlow = (SequenceFlow) result_pattern_ChoiceAfterEmptyDef_1_1_binding[0];
			ExclusiveGateway eg = (ExclusiveGateway) result_pattern_ChoiceAfterEmptyDef_1_1_binding[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterEmptyDef_1_1_binding[2];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_ChoiceAfterEmptyDef_1_1_binding[3];
			GW2S pn2cs = (GW2S) result_pattern_ChoiceAfterEmptyDef_1_1_binding[4];
			Flow flow = (Flow) result_pattern_ChoiceAfterEmptyDef_1_1_binding[5];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterEmptyDef_1_1_binding[6];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ChoiceAfterEmptyDef_1_1_binding[7];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_ChoiceAfterEmptyDef_1_1_binding[8];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_ChoiceAfterEmptyDef_1_1_binding[9];

			Object[] result_pattern_ChoiceAfterEmptyDef_1_1_black = pattern_ChoiceAfterEmptyDef_1_1_blackBBBBBBBBBBBFB(
					defInFlow, eg, prevNode, choiceStep, pn2cs, flow, process, sf1, egw, ecgw, _this,
					isApplicableMatch);
			if (result_pattern_ChoiceAfterEmptyDef_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterEmptyDef_1_1_black[11];

				return new Object[] { defInFlow, eg, prevNode, choiceStep, pn2cs, flow, process, sf1, egw, ecgw, _this,
						csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_1_1_greenBFBBFBFB(ChoiceStep choiceStep, Flow flow,
			ExclusiveGateway egw, ExclusiveGateway ecgw, CSP csp) {
		NormalStep step = UseCaseFactory.eINSTANCE.createNormalStep();
		GW2S egwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		GW2S ecgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("step", "id");
		choiceStep.setNext(step);
		flow.getSteps().add(step);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		String step_id_prime = (String) _localVariable_0;
		step.setId(step_id_prime);
		return new Object[] { choiceStep, step, flow, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_1_2_blackBBBBBB(NormalStep step, SequenceFlow sf1,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { step, sf1, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_1_2_greenFBBBBBB(NormalStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_1_3_blackBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject defInFlow, EObject eg, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject step,
			EObject flow, EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		if (!defInFlow.equals(eg)) {
			if (!defInFlow.equals(prevNode)) {
				if (!defInFlow.equals(pn2cs)) {
					if (!defInFlow.equals(step)) {
						if (!defInFlow.equals(flow)) {
							if (!defInFlow.equals(process)) {
								if (!defInFlow.equals(sf1)) {
									if (!defInFlow.equals(egw)) {
										if (!defInFlow.equals(egwToStep)) {
											if (!defInFlow.equals(ecgw)) {
												if (!defInFlow.equals(ecgwToStep)) {
													if (!eg.equals(prevNode)) {
														if (!eg.equals(pn2cs)) {
															if (!eg.equals(step)) {
																if (!eg.equals(flow)) {
																	if (!eg.equals(process)) {
																		if (!eg.equals(sf1)) {
																			if (!eg.equals(egw)) {
																				if (!eg.equals(egwToStep)) {
																					if (!prevNode.equals(step)) {
																						if (!prevNode.equals(process)) {
																							if (!prevNode.equals(sf1)) {
																								if (!choiceStep.equals(
																										defInFlow)) {
																									if (!choiceStep
																											.equals(eg)) {
																										if (!choiceStep
																												.equals(prevNode)) {
																											if (!choiceStep
																													.equals(pn2cs)) {
																												if (!choiceStep
																														.equals(step)) {
																													if (!choiceStep
																															.equals(flow)) {
																														if (!choiceStep
																																.equals(process)) {
																															if (!choiceStep
																																	.equals(sf1)) {
																																if (!choiceStep
																																		.equals(egw)) {
																																	if (!choiceStep
																																			.equals(egwToStep)) {
																																		if (!choiceStep
																																				.equals(ecgw)) {
																																			if (!choiceStep
																																					.equals(ecgwToStep)) {
																																				if (!pn2cs
																																						.equals(prevNode)) {
																																					if (!pn2cs
																																							.equals(step)) {
																																						if (!pn2cs
																																								.equals(process)) {
																																							if (!pn2cs
																																									.equals(sf1)) {
																																								if (!flow
																																										.equals(prevNode)) {
																																									if (!flow
																																											.equals(pn2cs)) {
																																										if (!flow
																																												.equals(step)) {
																																											if (!flow
																																													.equals(process)) {
																																												if (!flow
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
																																																				step)) {
																																																			if (!egw.equals(
																																																					flow)) {
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
																																																											.equals(step)) {
																																																										if (!egwToStep
																																																												.equals(flow)) {
																																																											if (!egwToStep
																																																													.equals(process)) {
																																																												if (!egwToStep
																																																														.equals(sf1)) {
																																																													if (!ecgw
																																																															.equals(eg)) {
																																																														if (!ecgw
																																																																.equals(prevNode)) {
																																																															if (!ecgw
																																																																	.equals(pn2cs)) {
																																																																if (!ecgw
																																																																		.equals(step)) {
																																																																	if (!ecgw
																																																																			.equals(flow)) {
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
																																																																									.equals(eg)) {
																																																																								if (!ecgwToStep
																																																																										.equals(prevNode)) {
																																																																									if (!ecgwToStep
																																																																											.equals(pn2cs)) {
																																																																										if (!ecgwToStep
																																																																												.equals(step)) {
																																																																											if (!ecgwToStep
																																																																													.equals(flow)) {
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
																																																																																		defInFlow,
																																																																																		eg,
																																																																																		prevNode,
																																																																																		choiceStep,
																																																																																		pn2cs,
																																																																																		step,
																																																																																		flow,
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
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject step, EObject flow,
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String ruleresult_ruleName_prime = "ChoiceAfterEmptyDef";
		String choiceStep__step____next_name_prime = "next";
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
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		ruleresult.getCreatedEdges().add(choiceStep__step____next);
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
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
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
		return new Object[] { ruleresult, prevNode, choiceStep, step, flow, process, sf1, egw, egwToStep, ecgw,
				ecgwToStep, choiceStep__step____next, flow__step____steps, process__sf1____flowElements,
				process__egw____flowElements, process__ecgw____flowElements, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv,
				egwToStep__egw____source, egwToStep__step____target, ecgwToStep__ecgw____source,
				ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterEmptyDef_1_5_expressionBBBBBBBBBBBBBBB(ChoiceAfterEmptyDef _this,
			PerformRuleResult ruleresult, EObject defInFlow, EObject eg, EObject prevNode, EObject choiceStep,
			EObject pn2cs, EObject step, EObject flow, EObject process, EObject sf1, EObject egw, EObject egwToStep,
			EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_FWD(ruleresult, defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow, process, sf1, egw,
				egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterEmptyDef_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_1_blackFBB(EClass eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_2_1_binding = pattern_ChoiceAfterEmptyDef_2_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_2_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_2_1_black = pattern_ChoiceAfterEmptyDef_2_1_blackFBB(eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterEmptyDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_2_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("defInFlow");
		EObject _localVariable_1 = match.getObject("eg");
		EObject _localVariable_2 = match.getObject("prevNode");
		EObject _localVariable_3 = match.getObject("process");
		EObject _localVariable_4 = match.getObject("sf1");
		EObject _localVariable_5 = match.getObject("egw");
		EObject _localVariable_6 = match.getObject("ecgw");
		EObject tmpDefInFlow = _localVariable_0;
		EObject tmpEg = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpProcess = _localVariable_3;
		EObject tmpSf1 = _localVariable_4;
		EObject tmpEgw = _localVariable_5;
		EObject tmpEcgw = _localVariable_6;
		if (tmpDefInFlow instanceof SequenceFlow) {
			SequenceFlow defInFlow = (SequenceFlow) tmpDefInFlow;
			if (tmpEg instanceof ExclusiveGateway) {
				ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
				if (tmpPrevNode instanceof ExclusiveGateway) {
					ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
					if (tmpProcess instanceof de.abilov.bpmn.Process) {
						de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
						if (tmpSf1 instanceof SequenceFlow) {
							SequenceFlow sf1 = (SequenceFlow) tmpSf1;
							if (tmpEgw instanceof ExclusiveGateway) {
								ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
								if (tmpEcgw instanceof ExclusiveGateway) {
									ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
									return new Object[] { defInFlow, eg, prevNode, process, sf1, egw, ecgw, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_2_2_blackBBBFFBBBBB(SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!defInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				if (!eg.equals(egw)) {
					if (!egw.equals(prevNode)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								if (!ecgw.equals(egw)) {
									boolean egisDiverging = eg.isIsDiverging();
									if (Boolean.valueOf(egisDiverging).equals(Boolean.valueOf(true))) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
											boolean egwisDiverging = egw.isIsDiverging();
											if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
												boolean ecgwisDiverging = ecgw.isIsDiverging();
												if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
													for (GW2S pn2cs : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(prevNode, GW2S.class,
																	"source")) {
														Step tmpChoiceStep = pn2cs.getTarget();
														if (tmpChoiceStep instanceof ChoiceStep) {
															ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
															_result.add(
																	new Object[] { defInFlow, eg, prevNode, choiceStep,
																			pn2cs, process, sf1, egw, ecgw, match });
														}

													}
												}

											}

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

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_2_3_blackBBBBBFBBBB(SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!defInFlow.equals(sf1)) {
			if (!eg.equals(prevNode)) {
				if (!eg.equals(egw)) {
					if (!egw.equals(prevNode)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								if (!ecgw.equals(egw)) {
									if (eg.equals(defInFlow.getSourceRef())) {
										if (defInFlow.equals(eg.getDefault())) {
											if (prevNode.equals(defInFlow.getTargetRef())) {
												if (prevNode.equals(pn2cs.getSource())) {
													if (choiceStep.equals(pn2cs.getTarget())) {
														if (process.getFlowElements().contains(prevNode)) {
															if (process.getFlowElements().contains(sf1)) {
																if (process.getFlowElements().contains(egw)) {
																	if (process.getFlowElements().contains(ecgw)) {
																		if (prevNode.equals(sf1.getSourceRef())) {
																			if (egw.equals(sf1.getTargetRef())) {
																				if (ecgw.equals(egw.get__conv())) {
																					boolean egisDiverging = eg
																							.isIsDiverging();
																					if (Boolean.valueOf(egisDiverging)
																							.equals(Boolean
																									.valueOf(true))) {
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
																										_result.add(
																												new Object[] {
																														defInFlow,
																														eg,
																														prevNode,
																														choiceStep,
																														pn2cs,
																														flow,
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
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge defInFlow__eg____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__defInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__defInFlow____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__defInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String defInFlow__eg____sourceRef_name_prime = "sourceRef";
		String eg__defInFlow____outgoing_name_prime = "outgoing";
		String eg__defInFlow____default_name_prime = "default";
		String defInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__defInFlow____incoming_name_prime = "incoming";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String flow__choiceStep____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		isApplicableMatch.getAllContextElements().add(defInFlow);
		isApplicableMatch.getAllContextElements().add(eg);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(egw);
		isApplicableMatch.getAllContextElements().add(ecgw);
		defInFlow__eg____sourceRef.setSrc(defInFlow);
		defInFlow__eg____sourceRef.setTrg(eg);
		isApplicableMatch.getAllContextElements().add(defInFlow__eg____sourceRef);
		eg__defInFlow____outgoing.setSrc(eg);
		eg__defInFlow____outgoing.setTrg(defInFlow);
		isApplicableMatch.getAllContextElements().add(eg__defInFlow____outgoing);
		eg__defInFlow____default.setSrc(eg);
		eg__defInFlow____default.setTrg(defInFlow);
		isApplicableMatch.getAllContextElements().add(eg__defInFlow____default);
		defInFlow__prevNode____targetRef.setSrc(defInFlow);
		defInFlow__prevNode____targetRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(defInFlow__prevNode____targetRef);
		prevNode__defInFlow____incoming.setSrc(prevNode);
		prevNode__defInFlow____incoming.setTrg(defInFlow);
		isApplicableMatch.getAllContextElements().add(prevNode__defInFlow____incoming);
		pn2cs__prevNode____source.setSrc(pn2cs);
		pn2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs__prevNode____source);
		pn2cs__choiceStep____target.setSrc(pn2cs);
		pn2cs__choiceStep____target.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs__choiceStep____target);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(flow__choiceStep____steps);
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
		defInFlow__eg____sourceRef.setName(defInFlow__eg____sourceRef_name_prime);
		eg__defInFlow____outgoing.setName(eg__defInFlow____outgoing_name_prime);
		eg__defInFlow____default.setName(eg__defInFlow____default_name_prime);
		defInFlow__prevNode____targetRef.setName(defInFlow__prevNode____targetRef_name_prime);
		prevNode__defInFlow____incoming.setName(prevNode__defInFlow____incoming_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { defInFlow, eg, prevNode, choiceStep, pn2cs, flow, process, sf1, egw, ecgw,
				isApplicableMatch, defInFlow__eg____sourceRef, eg__defInFlow____outgoing, eg__defInFlow____default,
				defInFlow__prevNode____targetRef, prevNode__defInFlow____incoming, pn2cs__prevNode____source,
				pn2cs__choiceStep____target, flow__choiceStep____steps, process__prevNode____flowElements,
				process__sf1____flowElements, process__egw____flowElements, process__ecgw____flowElements,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, sf1__egw____targetRef, egw__sf1____incoming,
				egw__ecgw______conv };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_4_bindingFBBBBBBBBBBBB(ChoiceAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, defInFlow, eg, prevNode, choiceStep,
				pn2cs, flow, process, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, defInFlow, eg, prevNode, choiceStep, pn2cs, flow,
					process, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_4_bindingAndBlackFBBBBBBBBBBBB(ChoiceAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Flow flow, de.abilov.bpmn.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterEmptyDef_2_4_binding = pattern_ChoiceAfterEmptyDef_2_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, defInFlow, eg, prevNode, choiceStep, pn2cs, flow, process, sf1, egw, ecgw);
		if (result_pattern_ChoiceAfterEmptyDef_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterEmptyDef_2_4_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_2_4_black = pattern_ChoiceAfterEmptyDef_2_4_blackB(csp);
			if (result_pattern_ChoiceAfterEmptyDef_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, defInFlow, eg, prevNode, choiceStep, pn2cs, flow,
						process, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_2_5_expressionFBB(ChoiceAfterEmptyDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterEmptyDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterEmptyDef_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_10_1_blackBBBBB(ChoiceAfterEmptyDef _this, Match match,
			ChoiceStep choiceStep, NormalStep step, Flow flow) {
		return new Object[] { _this, match, choiceStep, step, flow };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_10_2_bindingFBBBBB(ChoiceAfterEmptyDef _this, Match match,
			ChoiceStep choiceStep, NormalStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, choiceStep, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, choiceStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_10_2_bindingAndBlackFBBBBB(ChoiceAfterEmptyDef _this,
			Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {
		Object[] result_pattern_ChoiceAfterEmptyDef_10_2_binding = pattern_ChoiceAfterEmptyDef_10_2_bindingFBBBBB(_this,
				match, choiceStep, step, flow);
		if (result_pattern_ChoiceAfterEmptyDef_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterEmptyDef_10_2_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_10_2_black = pattern_ChoiceAfterEmptyDef_10_2_blackB(csp);
			if (result_pattern_ChoiceAfterEmptyDef_10_2_black != null) {

				return new Object[] { csp, _this, match, choiceStep, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_10_3_expressionFBB(ChoiceAfterEmptyDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_10_4_blackBBBB(Match match, ChoiceStep choiceStep,
			NormalStep step, Flow flow) {
		return new Object[] { match, choiceStep, step, flow };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_10_4_greenBBBBFF(Match match, ChoiceStep choiceStep,
			NormalStep step, Flow flow) {
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(step);
		String choiceStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		match.getToBeTranslatedEdges().add(choiceStep__step____next);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(flow__step____steps);
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		return new Object[] { match, choiceStep, step, flow, choiceStep__step____next, flow__step____steps };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_10_5_blackBBBB(Match match, ChoiceStep choiceStep,
			NormalStep step, Flow flow) {
		return new Object[] { match, choiceStep, step, flow };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_10_5_greenBBBF(Match match, ChoiceStep choiceStep,
			Flow flow) {
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(choiceStep);
		match.getContextNodes().add(flow);
		String flow__choiceStep____steps_name_prime = "steps";
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		match.getContextEdges().add(flow__choiceStep____steps);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		return new Object[] { match, choiceStep, flow, flow__choiceStep____steps };
	}

	public static final void pattern_ChoiceAfterEmptyDef_10_6_expressionBBBBB(ChoiceAfterEmptyDef _this, Match match,
			ChoiceStep choiceStep, NormalStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, choiceStep, step, flow);

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_11_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("defInFlow");
		EObject _localVariable_1 = isApplicableMatch.getObject("eg");
		EObject _localVariable_2 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_5 = isApplicableMatch.getObject("step");
		EObject _localVariable_6 = isApplicableMatch.getObject("flow");
		EObject _localVariable_7 = isApplicableMatch.getObject("process");
		EObject tmpDefInFlow = _localVariable_0;
		EObject tmpEg = _localVariable_1;
		EObject tmpPrevNode = _localVariable_2;
		EObject tmpChoiceStep = _localVariable_3;
		EObject tmpPn2cs = _localVariable_4;
		EObject tmpStep = _localVariable_5;
		EObject tmpFlow = _localVariable_6;
		EObject tmpProcess = _localVariable_7;
		if (tmpDefInFlow instanceof SequenceFlow) {
			SequenceFlow defInFlow = (SequenceFlow) tmpDefInFlow;
			if (tmpEg instanceof ExclusiveGateway) {
				ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
				if (tmpPrevNode instanceof ExclusiveGateway) {
					ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
					if (tmpChoiceStep instanceof ChoiceStep) {
						ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
						if (tmpPn2cs instanceof GW2S) {
							GW2S pn2cs = (GW2S) tmpPn2cs;
							if (tmpStep instanceof NormalStep) {
								NormalStep step = (NormalStep) tmpStep;
								if (tmpFlow instanceof Flow) {
									Flow flow = (Flow) tmpFlow;
									if (tmpProcess instanceof de.abilov.bpmn.Process) {
										de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
										return new Object[] { defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow,
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_11_1_blackBBBBBBBBBFB(SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs, NormalStep step,
			Flow flow, de.abilov.bpmn.Process process, ChoiceAfterEmptyDef _this, IsApplicableMatch isApplicableMatch) {
		if (!eg.equals(prevNode)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow, process, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_11_1_bindingAndBlackFFFFFFFFBFB(ChoiceAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterEmptyDef_11_1_binding = pattern_ChoiceAfterEmptyDef_11_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterEmptyDef_11_1_binding != null) {
			SequenceFlow defInFlow = (SequenceFlow) result_pattern_ChoiceAfterEmptyDef_11_1_binding[0];
			ExclusiveGateway eg = (ExclusiveGateway) result_pattern_ChoiceAfterEmptyDef_11_1_binding[1];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterEmptyDef_11_1_binding[2];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_ChoiceAfterEmptyDef_11_1_binding[3];
			GW2S pn2cs = (GW2S) result_pattern_ChoiceAfterEmptyDef_11_1_binding[4];
			NormalStep step = (NormalStep) result_pattern_ChoiceAfterEmptyDef_11_1_binding[5];
			Flow flow = (Flow) result_pattern_ChoiceAfterEmptyDef_11_1_binding[6];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterEmptyDef_11_1_binding[7];

			Object[] result_pattern_ChoiceAfterEmptyDef_11_1_black = pattern_ChoiceAfterEmptyDef_11_1_blackBBBBBBBBBFB(
					defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow, process, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterEmptyDef_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterEmptyDef_11_1_black[9];

				return new Object[] { defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow, process, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_11_1_greenBBBFFFFFB(ExclusiveGateway prevNode,
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_11_2_blackBBBBBB(NormalStep step, SequenceFlow sf1,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { step, sf1, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_11_2_greenFBBBBBB(NormalStep step, SequenceFlow sf1,
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_11_3_blackBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject defInFlow, EObject eg, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject step,
			EObject flow, EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		if (!defInFlow.equals(eg)) {
			if (!defInFlow.equals(prevNode)) {
				if (!defInFlow.equals(pn2cs)) {
					if (!defInFlow.equals(step)) {
						if (!defInFlow.equals(flow)) {
							if (!defInFlow.equals(process)) {
								if (!defInFlow.equals(sf1)) {
									if (!defInFlow.equals(egw)) {
										if (!defInFlow.equals(egwToStep)) {
											if (!defInFlow.equals(ecgw)) {
												if (!defInFlow.equals(ecgwToStep)) {
													if (!eg.equals(prevNode)) {
														if (!eg.equals(pn2cs)) {
															if (!eg.equals(step)) {
																if (!eg.equals(flow)) {
																	if (!eg.equals(process)) {
																		if (!eg.equals(sf1)) {
																			if (!eg.equals(egw)) {
																				if (!eg.equals(egwToStep)) {
																					if (!prevNode.equals(step)) {
																						if (!prevNode.equals(process)) {
																							if (!prevNode.equals(sf1)) {
																								if (!choiceStep.equals(
																										defInFlow)) {
																									if (!choiceStep
																											.equals(eg)) {
																										if (!choiceStep
																												.equals(prevNode)) {
																											if (!choiceStep
																													.equals(pn2cs)) {
																												if (!choiceStep
																														.equals(step)) {
																													if (!choiceStep
																															.equals(flow)) {
																														if (!choiceStep
																																.equals(process)) {
																															if (!choiceStep
																																	.equals(sf1)) {
																																if (!choiceStep
																																		.equals(egw)) {
																																	if (!choiceStep
																																			.equals(egwToStep)) {
																																		if (!choiceStep
																																				.equals(ecgw)) {
																																			if (!choiceStep
																																					.equals(ecgwToStep)) {
																																				if (!pn2cs
																																						.equals(prevNode)) {
																																					if (!pn2cs
																																							.equals(step)) {
																																						if (!pn2cs
																																								.equals(process)) {
																																							if (!pn2cs
																																									.equals(sf1)) {
																																								if (!flow
																																										.equals(prevNode)) {
																																									if (!flow
																																											.equals(pn2cs)) {
																																										if (!flow
																																												.equals(step)) {
																																											if (!flow
																																													.equals(process)) {
																																												if (!flow
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
																																																				step)) {
																																																			if (!egw.equals(
																																																					flow)) {
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
																																																											.equals(step)) {
																																																										if (!egwToStep
																																																												.equals(flow)) {
																																																											if (!egwToStep
																																																													.equals(process)) {
																																																												if (!egwToStep
																																																														.equals(sf1)) {
																																																													if (!ecgw
																																																															.equals(eg)) {
																																																														if (!ecgw
																																																																.equals(prevNode)) {
																																																															if (!ecgw
																																																																	.equals(pn2cs)) {
																																																																if (!ecgw
																																																																		.equals(step)) {
																																																																	if (!ecgw
																																																																			.equals(flow)) {
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
																																																																									.equals(eg)) {
																																																																								if (!ecgwToStep
																																																																										.equals(prevNode)) {
																																																																									if (!ecgwToStep
																																																																											.equals(pn2cs)) {
																																																																										if (!ecgwToStep
																																																																												.equals(step)) {
																																																																											if (!ecgwToStep
																																																																													.equals(flow)) {
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
																																																																																		defInFlow,
																																																																																		eg,
																																																																																		prevNode,
																																																																																		choiceStep,
																																																																																		pn2cs,
																																																																																		step,
																																																																																		flow,
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
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject step, EObject flow,
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
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
		String ruleresult_ruleName_prime = "ChoiceAfterEmptyDef";
		String choiceStep__step____next_name_prime = "next";
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
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		ruleresult.getTranslatedEdges().add(choiceStep__step____next);
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
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
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
		return new Object[] { ruleresult, prevNode, choiceStep, step, flow, process, sf1, egw, egwToStep, ecgw,
				ecgwToStep, choiceStep__step____next, flow__step____steps, process__sf1____flowElements,
				process__egw____flowElements, process__ecgw____flowElements, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv,
				egwToStep__egw____source, egwToStep__step____target, ecgwToStep__ecgw____source,
				ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterEmptyDef_11_5_expressionBBBBBBBBBBBBBBB(ChoiceAfterEmptyDef _this,
			PerformRuleResult ruleresult, EObject defInFlow, EObject eg, EObject prevNode, EObject choiceStep,
			EObject pn2cs, EObject step, EObject flow, EObject process, EObject sf1, EObject egw, EObject egwToStep,
			EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_BWD(ruleresult, defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow, process, sf1, egw,
				egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterEmptyDef_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_1_blackFBB(EClass eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_12_1_binding = pattern_ChoiceAfterEmptyDef_12_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_12_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_12_1_black = pattern_ChoiceAfterEmptyDef_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterEmptyDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("choiceStep");
		EObject _localVariable_1 = match.getObject("step");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpChoiceStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpChoiceStep instanceof ChoiceStep) {
			ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { choiceStep, step, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_12_2_blackFBFBBB(ChoiceStep choiceStep,
			NormalStep step, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (GW2S pn2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(choiceStep, GW2S.class,
				"target")) {
			Gateway tmpPrevNode = pn2cs.getSource();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				boolean prevNodeisDiverging = prevNode.isIsDiverging();
				if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
					_result.add(new Object[] { prevNode, choiceStep, pn2cs, step, flow, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_12_3_blackFFBBBBBF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, NormalStep step, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (step.equals(choiceStep.getNext())) {
			if (prevNode.equals(pn2cs.getSource())) {
				if (choiceStep.equals(pn2cs.getTarget())) {
					if (flow.getSteps().contains(choiceStep)) {
						if (flow.getSteps().contains(step)) {
							boolean prevNodeisDiverging = prevNode.isIsDiverging();
							if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
								for (SequenceFlow defInFlow : prevNode.getIncoming()) {
									FlowNode tmpEg = defInFlow.getSourceRef();
									if (tmpEg instanceof ExclusiveGateway) {
										ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
										if (!eg.equals(prevNode)) {
											if (defInFlow.equals(eg.getDefault())) {
												boolean egisDiverging = eg.isIsDiverging();
												if (Boolean.valueOf(egisDiverging).equals(Boolean.valueOf(true))) {
													for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(prevNode,
																	de.abilov.bpmn.Process.class, "flowElements")) {
														_result.add(new Object[] { defInFlow, eg, prevNode, choiceStep,
																pn2cs, step, flow, process });
													}
												}

											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_3_greenBBBBBBBBFFFFFFFFFFFF(SequenceFlow defInFlow,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs, NormalStep step,
			Flow flow, de.abilov.bpmn.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge defInFlow__eg____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__defInFlow____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg__defInFlow____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defInFlow__prevNode____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__defInFlow____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge choiceStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String defInFlow__eg____sourceRef_name_prime = "sourceRef";
		String eg__defInFlow____outgoing_name_prime = "outgoing";
		String eg__defInFlow____default_name_prime = "default";
		String defInFlow__prevNode____targetRef_name_prime = "targetRef";
		String prevNode__defInFlow____incoming_name_prime = "incoming";
		String choiceStep__step____next_name_prime = "next";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(defInFlow);
		isApplicableMatch.getAllContextElements().add(eg);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		defInFlow__eg____sourceRef.setSrc(defInFlow);
		defInFlow__eg____sourceRef.setTrg(eg);
		isApplicableMatch.getAllContextElements().add(defInFlow__eg____sourceRef);
		eg__defInFlow____outgoing.setSrc(eg);
		eg__defInFlow____outgoing.setTrg(defInFlow);
		isApplicableMatch.getAllContextElements().add(eg__defInFlow____outgoing);
		eg__defInFlow____default.setSrc(eg);
		eg__defInFlow____default.setTrg(defInFlow);
		isApplicableMatch.getAllContextElements().add(eg__defInFlow____default);
		defInFlow__prevNode____targetRef.setSrc(defInFlow);
		defInFlow__prevNode____targetRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(defInFlow__prevNode____targetRef);
		prevNode__defInFlow____incoming.setSrc(prevNode);
		prevNode__defInFlow____incoming.setTrg(defInFlow);
		isApplicableMatch.getAllContextElements().add(prevNode__defInFlow____incoming);
		choiceStep__step____next.setSrc(choiceStep);
		choiceStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(choiceStep__step____next);
		pn2cs__prevNode____source.setSrc(pn2cs);
		pn2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(pn2cs__prevNode____source);
		pn2cs__choiceStep____target.setSrc(pn2cs);
		pn2cs__choiceStep____target.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs__choiceStep____target);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		isApplicableMatch.getAllContextElements().add(flow__choiceStep____steps);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		defInFlow__eg____sourceRef.setName(defInFlow__eg____sourceRef_name_prime);
		eg__defInFlow____outgoing.setName(eg__defInFlow____outgoing_name_prime);
		eg__defInFlow____default.setName(eg__defInFlow____default_name_prime);
		defInFlow__prevNode____targetRef.setName(defInFlow__prevNode____targetRef_name_prime);
		prevNode__defInFlow____incoming.setName(prevNode__defInFlow____incoming_name_prime);
		choiceStep__step____next.setName(choiceStep__step____next_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow, process, isApplicableMatch,
				defInFlow__eg____sourceRef, eg__defInFlow____outgoing, eg__defInFlow____default,
				defInFlow__prevNode____targetRef, prevNode__defInFlow____incoming, choiceStep__step____next,
				pn2cs__prevNode____source, pn2cs__choiceStep____target, flow__choiceStep____steps, flow__step____steps,
				process__prevNode____flowElements };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_4_bindingFBBBBBBBBBB(ChoiceAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, NormalStep step, Flow flow, de.abilov.bpmn.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, defInFlow, eg, prevNode, choiceStep,
				pn2cs, step, flow, process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow,
					process };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_4_bindingAndBlackFBBBBBBBBBB(ChoiceAfterEmptyDef _this,
			IsApplicableMatch isApplicableMatch, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, NormalStep step, Flow flow, de.abilov.bpmn.Process process) {
		Object[] result_pattern_ChoiceAfterEmptyDef_12_4_binding = pattern_ChoiceAfterEmptyDef_12_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, defInFlow, eg, prevNode, choiceStep, pn2cs, step, flow, process);
		if (result_pattern_ChoiceAfterEmptyDef_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterEmptyDef_12_4_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_12_4_black = pattern_ChoiceAfterEmptyDef_12_4_blackB(csp);
			if (result_pattern_ChoiceAfterEmptyDef_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, defInFlow, eg, prevNode, choiceStep, pn2cs, step,
						flow, process };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_12_5_expressionFBB(ChoiceAfterEmptyDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterEmptyDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterEmptyDef_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_20_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_20_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_20_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_20_1_binding = pattern_ChoiceAfterEmptyDef_20_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_20_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_20_1_black = pattern_ChoiceAfterEmptyDef_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_20_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_593714 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_593714)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_20_2_black_nac_1BB(NormalStep step,
			ChoiceStep choiceStep) {
		for (Step __DEC_step_next_78042 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_78042)) {
				if (!choiceStep.equals(__DEC_step_next_78042)) {
					return new Object[] { step, choiceStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_20_2_blackFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpChoiceStep = _edge_next.getSrc();
		if (tmpChoiceStep instanceof ChoiceStep) {
			ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (step.equals(choiceStep.getNext())) {
					if (pattern_ChoiceAfterEmptyDef_20_2_black_nac_1BB(step, choiceStep) == null) {
						for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(choiceStep,
								Flow.class, "steps")) {
							if (flow.getSteps().contains(step)) {
								if (pattern_ChoiceAfterEmptyDef_20_2_black_nac_0BB(step, flow) == null) {
									_result.add(new Object[] { choiceStep, step, flow, _edge_next });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_20_3_expressionFBBBBB(ChoiceAfterEmptyDef _this,
			Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_20_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_21_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_21_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_21_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_21_1_binding = pattern_ChoiceAfterEmptyDef_21_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_21_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_21_1_black = pattern_ChoiceAfterEmptyDef_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_21_2_black_nac_0BB(NormalStep step, Flow flow) {
		for (Flow __DEC_step_steps_436829 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_436829)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_21_2_black_nac_1BB(NormalStep step,
			ChoiceStep choiceStep) {
		for (Step __DEC_step_next_873923 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Step.class, "next")) {
			if (!step.equals(__DEC_step_next_873923)) {
				if (!choiceStep.equals(__DEC_step_next_873923)) {
					return new Object[] { step, choiceStep };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_21_2_blackFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof NormalStep) {
				NormalStep step = (NormalStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_ChoiceAfterEmptyDef_21_2_black_nac_0BB(step, flow) == null) {
						for (Step tmpChoiceStep : flow.getSteps()) {
							if (tmpChoiceStep instanceof ChoiceStep) {
								ChoiceStep choiceStep = (ChoiceStep) tmpChoiceStep;
								if (step.equals(choiceStep.getNext())) {
									if (pattern_ChoiceAfterEmptyDef_21_2_black_nac_1BB(step, choiceStep) == null) {
										_result.add(new Object[] { choiceStep, step, flow, _edge_steps });
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_21_3_expressionFBBBBB(ChoiceAfterEmptyDef _this,
			Match match, ChoiceStep choiceStep, NormalStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, choiceStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_21_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_22_1_binding = pattern_ChoiceAfterEmptyDef_22_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_22_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_22_1_black = pattern_ChoiceAfterEmptyDef_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!eg.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!egw.equals(prevNode)) {
					if (!ecgw.equals(eg)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_441193 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!eg.equals(__DEC_sf1_default_441193)) {
										if (!prevNode.equals(__DEC_sf1_default_441193)) {
											if (!egw.equals(__DEC_sf1_default_441193)) {
												if (!ecgw.equals(__DEC_sf1_default_441193)) {
													return new Object[] { sf1, eg, prevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_368486 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_368486)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_364494 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_364494)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!eg.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								for (Gateway __DEC_egw___conv_863204 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_863204)) {
										if (!eg.equals(__DEC_egw___conv_863204)) {
											if (!prevNode.equals(__DEC_egw___conv_863204)) {
												if (!ecgw.equals(__DEC_egw___conv_863204)) {
													return new Object[] { egw, eg, prevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								Gateway __DEC_ecgw___conv_311535 = ecgw.get__conv();
								if (__DEC_ecgw___conv_311535 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_311535)) {
										if (!eg.equals(__DEC_ecgw___conv_311535)) {
											if (!prevNode.equals(__DEC_ecgw___conv_311535)) {
												if (!egw.equals(__DEC_ecgw___conv_311535)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_931832 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_931832)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								for (Gateway __DEC_ecgw___conv_447173 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_447173)) {
										if (!eg.equals(__DEC_ecgw___conv_447173)) {
											if (!prevNode.equals(__DEC_ecgw___conv_447173)) {
												if (!egw.equals(__DEC_ecgw___conv_447173)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_7BB(ExclusiveGateway eg, SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_8BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_9BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_10BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_11BB(ExclusiveGateway eg,
			ExclusiveGateway egw) {
		if (egw.equals(eg.get__conv())) {
			return new Object[] { eg, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_12BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_13BB(ExclusiveGateway ecgw,
			ExclusiveGateway eg) {
		if (eg.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, eg };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_black_nac_14BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_22_2_blackFFFFFFFB(
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
																	if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_1BB(
																			sf1, process) == null) {
																		if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_8BB(
																				prevNode, sf1) == null) {
																			if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_2BB(
																					egw, process) == null) {
																				if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_9BB(
																						egw, sf1) == null) {
																					if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_12BB(
																							prevNode, egw) == null) {
																						if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_5BB(
																								ecgw,
																								process) == null) {
																							if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_10BB(
																									ecgw,
																									sf1) == null) {
																								if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_14BB(
																										ecgw,
																										prevNode) == null) {
																									for (SequenceFlow defInFlow : prevNode
																											.getIncoming()) {
																										if (!defInFlow
																												.equals(sf1)) {
																											FlowNode tmpEg = defInFlow
																													.getSourceRef();
																											if (tmpEg instanceof ExclusiveGateway) {
																												ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																												if (!eg.equals(
																														prevNode)) {
																													if (!eg.equals(
																															egw)) {
																														if (!ecgw
																																.equals(eg)) {
																															if (defInFlow
																																	.equals(eg
																																			.getDefault())) {
																																boolean egisDiverging = eg
																																		.isIsDiverging();
																																if (Boolean
																																		.valueOf(
																																				egisDiverging)
																																		.equals(Boolean
																																				.valueOf(
																																						true))) {
																																	if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_0BBBBB(
																																			sf1,
																																			eg,
																																			prevNode,
																																			egw,
																																			ecgw) == null) {
																																		if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_3BBBB(
																																				egw,
																																				eg,
																																				prevNode,
																																				ecgw) == null) {
																																			if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_4BBBB(
																																					ecgw,
																																					eg,
																																					prevNode,
																																					egw) == null) {
																																				if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_6BBBB(
																																						ecgw,
																																						eg,
																																						prevNode,
																																						egw) == null) {
																																					if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_7BB(
																																							eg,
																																							sf1) == null) {
																																						if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_11BB(
																																								eg,
																																								egw) == null) {
																																							if (pattern_ChoiceAfterEmptyDef_22_2_black_nac_13BB(
																																									ecgw,
																																									eg) == null) {
																																								_result.add(
																																										new Object[] {
																																												defInFlow,
																																												eg,
																																												prevNode,
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

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_22_3_expressionFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_22_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_23_1_binding = pattern_ChoiceAfterEmptyDef_23_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_23_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_23_1_black = pattern_ChoiceAfterEmptyDef_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!eg.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!egw.equals(prevNode)) {
					if (!ecgw.equals(eg)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_572028 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!eg.equals(__DEC_sf1_default_572028)) {
										if (!prevNode.equals(__DEC_sf1_default_572028)) {
											if (!egw.equals(__DEC_sf1_default_572028)) {
												if (!ecgw.equals(__DEC_sf1_default_572028)) {
													return new Object[] { sf1, eg, prevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_902965 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_902965)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_812988 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_812988)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!eg.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								for (Gateway __DEC_egw___conv_938755 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_938755)) {
										if (!eg.equals(__DEC_egw___conv_938755)) {
											if (!prevNode.equals(__DEC_egw___conv_938755)) {
												if (!ecgw.equals(__DEC_egw___conv_938755)) {
													return new Object[] { egw, eg, prevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								Gateway __DEC_ecgw___conv_444193 = ecgw.get__conv();
								if (__DEC_ecgw___conv_444193 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_444193)) {
										if (!eg.equals(__DEC_ecgw___conv_444193)) {
											if (!prevNode.equals(__DEC_ecgw___conv_444193)) {
												if (!egw.equals(__DEC_ecgw___conv_444193)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_333799 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_333799)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								for (Gateway __DEC_ecgw___conv_687184 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_687184)) {
										if (!eg.equals(__DEC_ecgw___conv_687184)) {
											if (!prevNode.equals(__DEC_ecgw___conv_687184)) {
												if (!egw.equals(__DEC_ecgw___conv_687184)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_7BB(ExclusiveGateway eg, SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_8BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_9BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_10BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_11BB(ExclusiveGateway eg,
			ExclusiveGateway egw) {
		if (egw.equals(eg.get__conv())) {
			return new Object[] { eg, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_12BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_13BB(ExclusiveGateway ecgw,
			ExclusiveGateway eg) {
		if (eg.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, eg };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_black_nac_14BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_23_2_blackFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
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
										if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_2BB(egw, process) == null) {
											if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_5BB(ecgw, process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof ExclusiveGateway) {
														ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
														if (!egw.equals(prevNode)) {
															if (!ecgw.equals(prevNode)) {
																boolean prevNodeisDiverging = prevNode.isIsDiverging();
																if (Boolean.valueOf(prevNodeisDiverging)
																		.equals(false)) {
																	if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_12BB(
																			prevNode, egw) == null) {
																		if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_14BB(
																				ecgw, prevNode) == null) {
																			for (FlowElement tmpSf1 : process
																					.getFlowElements()) {
																				if (tmpSf1 instanceof SequenceFlow) {
																					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																					if (prevNode.equals(
																							sf1.getSourceRef())) {
																						if (egw.equals(
																								sf1.getTargetRef())) {
																							if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_1BB(
																									sf1,
																									process) == null) {
																								if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_8BB(
																										prevNode,
																										sf1) == null) {
																									if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_9BB(
																											egw,
																											sf1) == null) {
																										if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_10BB(
																												ecgw,
																												sf1) == null) {
																											for (SequenceFlow defInFlow : prevNode
																													.getIncoming()) {
																												if (!defInFlow
																														.equals(sf1)) {
																													FlowNode tmpEg = defInFlow
																															.getSourceRef();
																													if (tmpEg instanceof ExclusiveGateway) {
																														ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																														if (!eg.equals(
																																prevNode)) {
																															if (!eg.equals(
																																	egw)) {
																																if (!ecgw
																																		.equals(eg)) {
																																	if (defInFlow
																																			.equals(eg
																																					.getDefault())) {
																																		boolean egisDiverging = eg
																																				.isIsDiverging();
																																		if (Boolean
																																				.valueOf(
																																						egisDiverging)
																																				.equals(Boolean
																																						.valueOf(
																																								true))) {
																																			if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_0BBBBB(
																																					sf1,
																																					eg,
																																					prevNode,
																																					egw,
																																					ecgw) == null) {
																																				if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_3BBBB(
																																						egw,
																																						eg,
																																						prevNode,
																																						ecgw) == null) {
																																					if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_4BBBB(
																																							ecgw,
																																							eg,
																																							prevNode,
																																							egw) == null) {
																																						if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_6BBBB(
																																								ecgw,
																																								eg,
																																								prevNode,
																																								egw) == null) {
																																							if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_7BB(
																																									eg,
																																									sf1) == null) {
																																								if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_11BB(
																																										eg,
																																										egw) == null) {
																																									if (pattern_ChoiceAfterEmptyDef_23_2_black_nac_13BB(
																																											ecgw,
																																											eg) == null) {
																																										_result.add(
																																												new Object[] {
																																														defInFlow,
																																														eg,
																																														prevNode,
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
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_23_3_expressionFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_23_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_24_1_binding = pattern_ChoiceAfterEmptyDef_24_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_24_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_24_1_black = pattern_ChoiceAfterEmptyDef_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!eg.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!egw.equals(prevNode)) {
					if (!ecgw.equals(eg)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_903037 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!eg.equals(__DEC_sf1_default_903037)) {
										if (!prevNode.equals(__DEC_sf1_default_903037)) {
											if (!egw.equals(__DEC_sf1_default_903037)) {
												if (!ecgw.equals(__DEC_sf1_default_903037)) {
													return new Object[] { sf1, eg, prevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_121415 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_121415)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_631732 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_631732)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!eg.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								for (Gateway __DEC_egw___conv_736024 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_736024)) {
										if (!eg.equals(__DEC_egw___conv_736024)) {
											if (!prevNode.equals(__DEC_egw___conv_736024)) {
												if (!ecgw.equals(__DEC_egw___conv_736024)) {
													return new Object[] { egw, eg, prevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								Gateway __DEC_ecgw___conv_317868 = ecgw.get__conv();
								if (__DEC_ecgw___conv_317868 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_317868)) {
										if (!eg.equals(__DEC_ecgw___conv_317868)) {
											if (!prevNode.equals(__DEC_ecgw___conv_317868)) {
												if (!egw.equals(__DEC_ecgw___conv_317868)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_929047 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_929047)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								for (Gateway __DEC_ecgw___conv_631840 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_631840)) {
										if (!eg.equals(__DEC_ecgw___conv_631840)) {
											if (!prevNode.equals(__DEC_ecgw___conv_631840)) {
												if (!egw.equals(__DEC_ecgw___conv_631840)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_7BB(ExclusiveGateway eg, SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_8BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_9BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_10BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_11BB(ExclusiveGateway eg,
			ExclusiveGateway egw) {
		if (egw.equals(eg.get__conv())) {
			return new Object[] { eg, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_12BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_13BB(ExclusiveGateway ecgw,
			ExclusiveGateway eg) {
		if (eg.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, eg };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_black_nac_14BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_24_2_blackFFFFFFFB(
			EMoflonEdge _edge_flowElements) {
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
						if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_5BB(ecgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof ExclusiveGateway) {
									ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
									if (!ecgw.equals(prevNode)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
											if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_14BB(ecgw,
													prevNode) == null) {
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
																					if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_1BB(
																							sf1, process) == null) {
																						if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_8BB(
																								prevNode,
																								sf1) == null) {
																							if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_10BB(
																									ecgw,
																									sf1) == null) {
																								if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_9BB(
																											egw,
																											sf1) == null) {
																										if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_12BB(
																												prevNode,
																												egw) == null) {
																											for (SequenceFlow defInFlow : prevNode
																													.getIncoming()) {
																												if (!defInFlow
																														.equals(sf1)) {
																													FlowNode tmpEg = defInFlow
																															.getSourceRef();
																													if (tmpEg instanceof ExclusiveGateway) {
																														ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																														if (!eg.equals(
																																prevNode)) {
																															if (!eg.equals(
																																	egw)) {
																																if (!ecgw
																																		.equals(eg)) {
																																	if (defInFlow
																																			.equals(eg
																																					.getDefault())) {
																																		boolean egisDiverging = eg
																																				.isIsDiverging();
																																		if (Boolean
																																				.valueOf(
																																						egisDiverging)
																																				.equals(Boolean
																																						.valueOf(
																																								true))) {
																																			if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_0BBBBB(
																																					sf1,
																																					eg,
																																					prevNode,
																																					egw,
																																					ecgw) == null) {
																																				if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_3BBBB(
																																						egw,
																																						eg,
																																						prevNode,
																																						ecgw) == null) {
																																					if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_4BBBB(
																																							ecgw,
																																							eg,
																																							prevNode,
																																							egw) == null) {
																																						if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_6BBBB(
																																								ecgw,
																																								eg,
																																								prevNode,
																																								egw) == null) {
																																							if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_7BB(
																																									eg,
																																									sf1) == null) {
																																								if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_11BB(
																																										eg,
																																										egw) == null) {
																																									if (pattern_ChoiceAfterEmptyDef_24_2_black_nac_13BB(
																																											ecgw,
																																											eg) == null) {
																																										_result.add(
																																												new Object[] {
																																														defInFlow,
																																														eg,
																																														prevNode,
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
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_24_3_expressionFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_24_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_25_1_binding = pattern_ChoiceAfterEmptyDef_25_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_25_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_25_1_black = pattern_ChoiceAfterEmptyDef_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!eg.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!egw.equals(prevNode)) {
					if (!ecgw.equals(eg)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_759831 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!eg.equals(__DEC_sf1_default_759831)) {
										if (!prevNode.equals(__DEC_sf1_default_759831)) {
											if (!egw.equals(__DEC_sf1_default_759831)) {
												if (!ecgw.equals(__DEC_sf1_default_759831)) {
													return new Object[] { sf1, eg, prevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_925128 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_925128)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_2733 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_2733)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!eg.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								for (Gateway __DEC_egw___conv_925542 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_925542)) {
										if (!eg.equals(__DEC_egw___conv_925542)) {
											if (!prevNode.equals(__DEC_egw___conv_925542)) {
												if (!ecgw.equals(__DEC_egw___conv_925542)) {
													return new Object[] { egw, eg, prevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								Gateway __DEC_ecgw___conv_102382 = ecgw.get__conv();
								if (__DEC_ecgw___conv_102382 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_102382)) {
										if (!eg.equals(__DEC_ecgw___conv_102382)) {
											if (!prevNode.equals(__DEC_ecgw___conv_102382)) {
												if (!egw.equals(__DEC_ecgw___conv_102382)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_80594 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_80594)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								for (Gateway __DEC_ecgw___conv_122768 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_122768)) {
										if (!eg.equals(__DEC_ecgw___conv_122768)) {
											if (!prevNode.equals(__DEC_ecgw___conv_122768)) {
												if (!egw.equals(__DEC_ecgw___conv_122768)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_7BB(ExclusiveGateway eg, SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_8BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_9BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_10BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_11BB(ExclusiveGateway eg,
			ExclusiveGateway egw) {
		if (egw.equals(eg.get__conv())) {
			return new Object[] { eg, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_12BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_13BB(ExclusiveGateway ecgw,
			ExclusiveGateway eg) {
		if (eg.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, eg };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_black_nac_14BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_25_2_blackFFFFFFFB(EMoflonEdge _edge_sourceRef) {
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
													if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_8BB(prevNode,
															sf1) == null) {
														if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_9BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_12BB(
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_10BB(
																		ecgw, sf1) == null) {
																	if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_14BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow defInFlow : prevNode
																				.getIncoming()) {
																			if (!defInFlow.equals(sf1)) {
																				FlowNode tmpEg = defInFlow
																						.getSourceRef();
																				if (tmpEg instanceof ExclusiveGateway) {
																					ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																					if (!eg.equals(prevNode)) {
																						if (!eg.equals(egw)) {
																							if (!ecgw.equals(eg)) {
																								if (defInFlow.equals(eg
																										.getDefault())) {
																									boolean egisDiverging = eg
																											.isIsDiverging();
																									if (Boolean
																											.valueOf(
																													egisDiverging)
																											.equals(Boolean
																													.valueOf(
																															true))) {
																										if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_0BBBBB(
																												sf1, eg,
																												prevNode,
																												egw,
																												ecgw) == null) {
																											if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_3BBBB(
																													egw,
																													eg,
																													prevNode,
																													ecgw) == null) {
																												if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_4BBBB(
																														ecgw,
																														eg,
																														prevNode,
																														egw) == null) {
																													if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_6BBBB(
																															ecgw,
																															eg,
																															prevNode,
																															egw) == null) {
																														if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_7BB(
																																eg,
																																sf1) == null) {
																															if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_11BB(
																																	eg,
																																	egw) == null) {
																																if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_13BB(
																																		ecgw,
																																		eg) == null) {
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
																																					if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_1BB(
																																							sf1,
																																							process) == null) {
																																						if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_2BB(
																																								egw,
																																								process) == null) {
																																							if (pattern_ChoiceAfterEmptyDef_25_2_black_nac_5BB(
																																									ecgw,
																																									process) == null) {
																																								_result.add(
																																										new Object[] {
																																												defInFlow,
																																												eg,
																																												prevNode,
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

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_25_3_expressionFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_25_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_26_1_binding = pattern_ChoiceAfterEmptyDef_26_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_26_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_26_1_black = pattern_ChoiceAfterEmptyDef_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!eg.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!egw.equals(prevNode)) {
					if (!ecgw.equals(eg)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_890463 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!eg.equals(__DEC_sf1_default_890463)) {
										if (!prevNode.equals(__DEC_sf1_default_890463)) {
											if (!egw.equals(__DEC_sf1_default_890463)) {
												if (!ecgw.equals(__DEC_sf1_default_890463)) {
													return new Object[] { sf1, eg, prevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_172110 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_172110)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_198578 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_198578)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!eg.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								for (Gateway __DEC_egw___conv_609133 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_609133)) {
										if (!eg.equals(__DEC_egw___conv_609133)) {
											if (!prevNode.equals(__DEC_egw___conv_609133)) {
												if (!ecgw.equals(__DEC_egw___conv_609133)) {
													return new Object[] { egw, eg, prevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								Gateway __DEC_ecgw___conv_375077 = ecgw.get__conv();
								if (__DEC_ecgw___conv_375077 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_375077)) {
										if (!eg.equals(__DEC_ecgw___conv_375077)) {
											if (!prevNode.equals(__DEC_ecgw___conv_375077)) {
												if (!egw.equals(__DEC_ecgw___conv_375077)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_958126 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_958126)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								for (Gateway __DEC_ecgw___conv_383283 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_383283)) {
										if (!eg.equals(__DEC_ecgw___conv_383283)) {
											if (!prevNode.equals(__DEC_ecgw___conv_383283)) {
												if (!egw.equals(__DEC_ecgw___conv_383283)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_7BB(ExclusiveGateway eg, SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_8BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_9BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_10BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_11BB(ExclusiveGateway eg,
			ExclusiveGateway egw) {
		if (egw.equals(eg.get__conv())) {
			return new Object[] { eg, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_12BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_13BB(ExclusiveGateway ecgw,
			ExclusiveGateway eg) {
		if (eg.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, eg };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_black_nac_14BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_26_2_blackFFFFFFFB(EMoflonEdge _edge_outgoing) {
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
													if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_8BB(prevNode,
															sf1) == null) {
														if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_9BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_12BB(
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_10BB(
																		ecgw, sf1) == null) {
																	if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_14BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow defInFlow : prevNode
																				.getIncoming()) {
																			if (!defInFlow.equals(sf1)) {
																				FlowNode tmpEg = defInFlow
																						.getSourceRef();
																				if (tmpEg instanceof ExclusiveGateway) {
																					ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																					if (!eg.equals(prevNode)) {
																						if (!eg.equals(egw)) {
																							if (!ecgw.equals(eg)) {
																								if (defInFlow.equals(eg
																										.getDefault())) {
																									boolean egisDiverging = eg
																											.isIsDiverging();
																									if (Boolean
																											.valueOf(
																													egisDiverging)
																											.equals(Boolean
																													.valueOf(
																															true))) {
																										if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_0BBBBB(
																												sf1, eg,
																												prevNode,
																												egw,
																												ecgw) == null) {
																											if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_3BBBB(
																													egw,
																													eg,
																													prevNode,
																													ecgw) == null) {
																												if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_4BBBB(
																														ecgw,
																														eg,
																														prevNode,
																														egw) == null) {
																													if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_6BBBB(
																															ecgw,
																															eg,
																															prevNode,
																															egw) == null) {
																														if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_7BB(
																																eg,
																																sf1) == null) {
																															if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_11BB(
																																	eg,
																																	egw) == null) {
																																if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_13BB(
																																		ecgw,
																																		eg) == null) {
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
																																					if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_1BB(
																																							sf1,
																																							process) == null) {
																																						if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_2BB(
																																								egw,
																																								process) == null) {
																																							if (pattern_ChoiceAfterEmptyDef_26_2_black_nac_5BB(
																																									ecgw,
																																									process) == null) {
																																								_result.add(
																																										new Object[] {
																																												defInFlow,
																																												eg,
																																												prevNode,
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
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_26_3_expressionFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_26_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_27_1_binding = pattern_ChoiceAfterEmptyDef_27_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_27_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_27_1_black = pattern_ChoiceAfterEmptyDef_27_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!eg.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!egw.equals(prevNode)) {
					if (!ecgw.equals(eg)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_822495 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!eg.equals(__DEC_sf1_default_822495)) {
										if (!prevNode.equals(__DEC_sf1_default_822495)) {
											if (!egw.equals(__DEC_sf1_default_822495)) {
												if (!ecgw.equals(__DEC_sf1_default_822495)) {
													return new Object[] { sf1, eg, prevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_312216 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_312216)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_959907 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_959907)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!eg.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								for (Gateway __DEC_egw___conv_492146 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_492146)) {
										if (!eg.equals(__DEC_egw___conv_492146)) {
											if (!prevNode.equals(__DEC_egw___conv_492146)) {
												if (!ecgw.equals(__DEC_egw___conv_492146)) {
													return new Object[] { egw, eg, prevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								Gateway __DEC_ecgw___conv_915140 = ecgw.get__conv();
								if (__DEC_ecgw___conv_915140 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_915140)) {
										if (!eg.equals(__DEC_ecgw___conv_915140)) {
											if (!prevNode.equals(__DEC_ecgw___conv_915140)) {
												if (!egw.equals(__DEC_ecgw___conv_915140)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_391957 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_391957)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								for (Gateway __DEC_ecgw___conv_376274 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_376274)) {
										if (!eg.equals(__DEC_ecgw___conv_376274)) {
											if (!prevNode.equals(__DEC_ecgw___conv_376274)) {
												if (!egw.equals(__DEC_ecgw___conv_376274)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_7BB(ExclusiveGateway eg, SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_8BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_9BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_10BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_11BB(ExclusiveGateway eg,
			ExclusiveGateway egw) {
		if (egw.equals(eg.get__conv())) {
			return new Object[] { eg, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_12BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_13BB(ExclusiveGateway ecgw,
			ExclusiveGateway eg) {
		if (eg.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, eg };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_black_nac_14BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_27_2_blackFFFFFFFB(EMoflonEdge _edge_targetRef) {
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
													if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_9BB(egw,
															sf1) == null) {
														if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_8BB(prevNode,
																sf1) == null) {
															if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_12BB(
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_10BB(
																		ecgw, sf1) == null) {
																	if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_14BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow defInFlow : prevNode
																				.getIncoming()) {
																			if (!defInFlow.equals(sf1)) {
																				FlowNode tmpEg = defInFlow
																						.getSourceRef();
																				if (tmpEg instanceof ExclusiveGateway) {
																					ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																					if (!eg.equals(prevNode)) {
																						if (!eg.equals(egw)) {
																							if (!ecgw.equals(eg)) {
																								if (defInFlow.equals(eg
																										.getDefault())) {
																									boolean egisDiverging = eg
																											.isIsDiverging();
																									if (Boolean
																											.valueOf(
																													egisDiverging)
																											.equals(Boolean
																													.valueOf(
																															true))) {
																										if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_0BBBBB(
																												sf1, eg,
																												prevNode,
																												egw,
																												ecgw) == null) {
																											if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_3BBBB(
																													egw,
																													eg,
																													prevNode,
																													ecgw) == null) {
																												if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_4BBBB(
																														ecgw,
																														eg,
																														prevNode,
																														egw) == null) {
																													if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_6BBBB(
																															ecgw,
																															eg,
																															prevNode,
																															egw) == null) {
																														if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_7BB(
																																eg,
																																sf1) == null) {
																															if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_11BB(
																																	eg,
																																	egw) == null) {
																																if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_13BB(
																																		ecgw,
																																		eg) == null) {
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
																																					if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_1BB(
																																							sf1,
																																							process) == null) {
																																						if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_2BB(
																																								egw,
																																								process) == null) {
																																							if (pattern_ChoiceAfterEmptyDef_27_2_black_nac_5BB(
																																									ecgw,
																																									process) == null) {
																																								_result.add(
																																										new Object[] {
																																												defInFlow,
																																												eg,
																																												prevNode,
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

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_27_3_expressionFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_27_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_28_1_binding = pattern_ChoiceAfterEmptyDef_28_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_28_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_28_1_black = pattern_ChoiceAfterEmptyDef_28_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!eg.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!egw.equals(prevNode)) {
					if (!ecgw.equals(eg)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_186013 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!eg.equals(__DEC_sf1_default_186013)) {
										if (!prevNode.equals(__DEC_sf1_default_186013)) {
											if (!egw.equals(__DEC_sf1_default_186013)) {
												if (!ecgw.equals(__DEC_sf1_default_186013)) {
													return new Object[] { sf1, eg, prevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_480667 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_480667)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_937117 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_937117)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!eg.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								for (Gateway __DEC_egw___conv_232261 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_232261)) {
										if (!eg.equals(__DEC_egw___conv_232261)) {
											if (!prevNode.equals(__DEC_egw___conv_232261)) {
												if (!ecgw.equals(__DEC_egw___conv_232261)) {
													return new Object[] { egw, eg, prevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								Gateway __DEC_ecgw___conv_486802 = ecgw.get__conv();
								if (__DEC_ecgw___conv_486802 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_486802)) {
										if (!eg.equals(__DEC_ecgw___conv_486802)) {
											if (!prevNode.equals(__DEC_ecgw___conv_486802)) {
												if (!egw.equals(__DEC_ecgw___conv_486802)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_662418 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_662418)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								for (Gateway __DEC_ecgw___conv_293514 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_293514)) {
										if (!eg.equals(__DEC_ecgw___conv_293514)) {
											if (!prevNode.equals(__DEC_ecgw___conv_293514)) {
												if (!egw.equals(__DEC_ecgw___conv_293514)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_7BB(ExclusiveGateway eg, SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_8BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_9BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_10BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_11BB(ExclusiveGateway eg,
			ExclusiveGateway egw) {
		if (egw.equals(eg.get__conv())) {
			return new Object[] { eg, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_12BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_13BB(ExclusiveGateway ecgw,
			ExclusiveGateway eg) {
		if (eg.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, eg };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_black_nac_14BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_28_2_blackFFFFFFFB(EMoflonEdge _edge_incoming) {
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
													if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_9BB(egw,
															sf1) == null) {
														if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_10BB(ecgw,
																sf1) == null) {
															if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_8BB(prevNode,
																	sf1) == null) {
																if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_12BB(
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_14BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow defInFlow : prevNode
																				.getIncoming()) {
																			if (!defInFlow.equals(sf1)) {
																				FlowNode tmpEg = defInFlow
																						.getSourceRef();
																				if (tmpEg instanceof ExclusiveGateway) {
																					ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																					if (!eg.equals(prevNode)) {
																						if (!eg.equals(egw)) {
																							if (!ecgw.equals(eg)) {
																								if (defInFlow.equals(eg
																										.getDefault())) {
																									boolean egisDiverging = eg
																											.isIsDiverging();
																									if (Boolean
																											.valueOf(
																													egisDiverging)
																											.equals(Boolean
																													.valueOf(
																															true))) {
																										if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_0BBBBB(
																												sf1, eg,
																												prevNode,
																												egw,
																												ecgw) == null) {
																											if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_3BBBB(
																													egw,
																													eg,
																													prevNode,
																													ecgw) == null) {
																												if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_4BBBB(
																														ecgw,
																														eg,
																														prevNode,
																														egw) == null) {
																													if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_6BBBB(
																															ecgw,
																															eg,
																															prevNode,
																															egw) == null) {
																														if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_7BB(
																																eg,
																																sf1) == null) {
																															if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_11BB(
																																	eg,
																																	egw) == null) {
																																if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_13BB(
																																		ecgw,
																																		eg) == null) {
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
																																					if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_1BB(
																																							sf1,
																																							process) == null) {
																																						if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_2BB(
																																								egw,
																																								process) == null) {
																																							if (pattern_ChoiceAfterEmptyDef_28_2_black_nac_5BB(
																																									ecgw,
																																									process) == null) {
																																								_result.add(
																																										new Object[] {
																																												defInFlow,
																																												eg,
																																												prevNode,
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

						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_28_3_expressionFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_28_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_1_bindingFB(ChoiceAfterEmptyDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_1_blackFBB(EClass __eClass, ChoiceAfterEmptyDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_1_bindingAndBlackFFB(ChoiceAfterEmptyDef _this) {
		Object[] result_pattern_ChoiceAfterEmptyDef_29_1_binding = pattern_ChoiceAfterEmptyDef_29_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterEmptyDef_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterEmptyDef_29_1_binding[0];

			Object[] result_pattern_ChoiceAfterEmptyDef_29_1_black = pattern_ChoiceAfterEmptyDef_29_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterEmptyDef_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterEmptyDef_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_0BBBBB(SequenceFlow sf1,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!eg.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!egw.equals(prevNode)) {
					if (!ecgw.equals(eg)) {
						if (!ecgw.equals(prevNode)) {
							if (!ecgw.equals(egw)) {
								for (ExclusiveGateway __DEC_sf1_default_361769 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
									if (!eg.equals(__DEC_sf1_default_361769)) {
										if (!prevNode.equals(__DEC_sf1_default_361769)) {
											if (!egw.equals(__DEC_sf1_default_361769)) {
												if (!ecgw.equals(__DEC_sf1_default_361769)) {
													return new Object[] { sf1, eg, prevNode, egw, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_985384 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_985384)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_97977 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_97977)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_3BBBB(ExclusiveGateway egw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!eg.equals(egw)) {
				if (!eg.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						if (!ecgw.equals(eg)) {
							if (!ecgw.equals(prevNode)) {
								for (Gateway __DEC_egw___conv_372350 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
									if (!egw.equals(__DEC_egw___conv_372350)) {
										if (!eg.equals(__DEC_egw___conv_372350)) {
											if (!prevNode.equals(__DEC_egw___conv_372350)) {
												if (!ecgw.equals(__DEC_egw___conv_372350)) {
													return new Object[] { egw, eg, prevNode, ecgw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_4BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								Gateway __DEC_ecgw___conv_809385 = ecgw.get__conv();
								if (__DEC_ecgw___conv_809385 != null) {
									if (!ecgw.equals(__DEC_ecgw___conv_809385)) {
										if (!eg.equals(__DEC_ecgw___conv_809385)) {
											if (!prevNode.equals(__DEC_ecgw___conv_809385)) {
												if (!egw.equals(__DEC_ecgw___conv_809385)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_120738 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_120738)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_6BBBB(ExclusiveGateway ecgw,
			ExclusiveGateway eg, ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(eg)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (!eg.equals(prevNode)) {
						if (!eg.equals(egw)) {
							if (!egw.equals(prevNode)) {
								for (Gateway __DEC_ecgw___conv_800739 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
									if (!ecgw.equals(__DEC_ecgw___conv_800739)) {
										if (!eg.equals(__DEC_ecgw___conv_800739)) {
											if (!prevNode.equals(__DEC_ecgw___conv_800739)) {
												if (!egw.equals(__DEC_ecgw___conv_800739)) {
													return new Object[] { ecgw, eg, prevNode, egw };
												}
											}
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

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_7BB(ExclusiveGateway eg, SequenceFlow sf1) {
		if (sf1.equals(eg.getDefault())) {
			return new Object[] { eg, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_8BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_9BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_10BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_11BB(ExclusiveGateway eg,
			ExclusiveGateway egw) {
		if (egw.equals(eg.get__conv())) {
			return new Object[] { eg, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_12BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_13BB(ExclusiveGateway ecgw,
			ExclusiveGateway eg) {
		if (eg.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, eg };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_black_nac_14BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterEmptyDef_29_2_blackFFFFFFFB(EMoflonEdge _edge___conv) {
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
													if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_9BB(egw,
															sf1) == null) {
														if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_10BB(ecgw,
																sf1) == null) {
															if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_8BB(prevNode,
																	sf1) == null) {
																if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_12BB(
																		prevNode, egw) == null) {
																	if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_14BB(
																			ecgw, prevNode) == null) {
																		for (SequenceFlow defInFlow : prevNode
																				.getIncoming()) {
																			if (!defInFlow.equals(sf1)) {
																				FlowNode tmpEg = defInFlow
																						.getSourceRef();
																				if (tmpEg instanceof ExclusiveGateway) {
																					ExclusiveGateway eg = (ExclusiveGateway) tmpEg;
																					if (!eg.equals(prevNode)) {
																						if (!eg.equals(egw)) {
																							if (!ecgw.equals(eg)) {
																								if (defInFlow.equals(eg
																										.getDefault())) {
																									boolean egisDiverging = eg
																											.isIsDiverging();
																									if (Boolean
																											.valueOf(
																													egisDiverging)
																											.equals(Boolean
																													.valueOf(
																															true))) {
																										if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_0BBBBB(
																												sf1, eg,
																												prevNode,
																												egw,
																												ecgw) == null) {
																											if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_3BBBB(
																													egw,
																													eg,
																													prevNode,
																													ecgw) == null) {
																												if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_4BBBB(
																														ecgw,
																														eg,
																														prevNode,
																														egw) == null) {
																													if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_6BBBB(
																															ecgw,
																															eg,
																															prevNode,
																															egw) == null) {
																														if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_7BB(
																																eg,
																																sf1) == null) {
																															if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_11BB(
																																	eg,
																																	egw) == null) {
																																if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_13BB(
																																		ecgw,
																																		eg) == null) {
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
																																					if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_1BB(
																																							sf1,
																																							process) == null) {
																																						if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_2BB(
																																								egw,
																																								process) == null) {
																																							if (pattern_ChoiceAfterEmptyDef_29_2_black_nac_5BB(
																																									ecgw,
																																									process) == null) {
																																								_result.add(
																																										new Object[] {
																																												defInFlow,
																																												eg,
																																												prevNode,
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

						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterEmptyDef_29_3_expressionFBBBBBBBBB(ChoiceAfterEmptyDef _this,
			Match match, SequenceFlow defInFlow, ExclusiveGateway eg, ExclusiveGateway prevNode,
			de.abilov.bpmn.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, defInFlow, eg, prevNode, process, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterEmptyDef_29_4_expressionFBB(ChoiceAfterEmptyDef _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterEmptyDef_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterEmptyDef_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ChoiceAfterEmptyDefImpl
