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
import de.abilov.tgg.bpmn2useCase.P2UC;

import de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoice;
import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;

import de.abilov.useCase.AlternativeFlow;
import de.abilov.useCase.ChoiceStep;
import de.abilov.useCase.Flow;
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
 * An implementation of the model object '<em><b>Choice After Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChoiceAfterChoiceImpl extends AbstractRuleImpl implements ChoiceAfterChoice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceAfterChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getChoiceAfterChoice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, de.abilov.bpmn.Process process, ExclusiveGateway prevNode,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		// initial bindings
		Object[] result1_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_0_1_blackBBBBBBB(this, match, process,
				prevNode, sf1, egw, ecgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode
							+ ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_0_2_bindingAndBlackFBBBBBBB(this, match, process, prevNode, sf1, egw, ecgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[process] = " + process + ", " + "[prevNode] = "
					+ prevNode + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_0_4_blackBBBBBB(match, process,
					prevNode, sf1, egw, ecgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[process] = " + process + ", "
						+ "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", "
						+ "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_0_4_greenBBBBBBFFFFFFFF(match, process, prevNode, sf1, egw,
					ecgw);
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[6];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[7];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[8];
					// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result4_green[9];
					// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result4_green[10];
					// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result4_green[11];
					// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result4_green[12];
					// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result4_green[13];

			// collect context elements
			Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_0_5_blackBBBBBB(match, process,
					prevNode, sf1, egw, ecgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[process] = " + process + ", " + "[prevNode] = " + prevNode + ", "
								+ "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_0_5_greenBBBF(match, process, prevNode);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_0_6_expressionBBBBBBB(this, match, process, prevNode, sf1,
					egw, ecgw);
			return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_0_7_expressionF();
		} else {
			return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_1_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[0];
		UseCase useCase = (UseCase) result1_bindingAndBlack[1];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[2];
		Flow flow = (Flow) result1_bindingAndBlack[3];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[4];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[5];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[6];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[7];
		ExclusiveGateway egw = (ExclusiveGateway) result1_bindingAndBlack[8];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_1_1_greenFBBFFBFBFB(useCase, cStep,
				egw, ecgw, csp);
		StepAlternative alt = (StepAlternative) result1_green[0];
		AlternativeFlow altFlow = (AlternativeFlow) result1_green[3];
		ChoiceStep step = (ChoiceStep) result1_green[4];
		GW2S egwToStep = (GW2S) result1_green[6];
		GW2S ecgwToStep = (GW2S) result1_green[8];

		// collect translated elements
		Object[] result2_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_1_2_blackBBBBBBBB(alt, sf1, altFlow,
				step, egw, egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[alt] = " + alt + ", " + "[sf1] = " + sf1 + ", " + "[altFlow] = " + altFlow + ", " + "[step] = "
					+ step + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw
					+ ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_1_2_greenFBBBBBBBB(alt, sf1, altFlow,
				step, egw, egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_1_3_blackBBBBBBBBBBBBBBBB(ruleresult,
				alt, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, altFlow, step, egw, egwToStep, ecgw,
				ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[alt] = " + alt + ", " + "[process] = " + process + ", "
					+ "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", "
					+ "[cStep] = " + cStep + ", " + "[prevNode] = " + prevNode + ", " + "[eg2cs] = " + eg2cs + ", "
					+ "[sf1] = " + sf1 + ", " + "[altFlow] = " + altFlow + ", " + "[step] = " + step + ", " + "[egw] = "
					+ egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = "
					+ ecgwToStep + ".");
		}
		ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult, alt, process,
				useCase, cStep, prevNode, sf1, altFlow, step, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[18];
				// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[22];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[23];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[24];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[26];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[27];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[28];

		// perform postprocessing story node is empty
		// register objects
		ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_1_5_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, alt, process,
				useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, altFlow, step, egw, egwToStep, ecgw, ecgwToStep);
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[0];
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[3];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[4];
		for (Object[] result2_black : ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_2_2_blackBFFFBFBBBB(process,
				prevNode, sf1, egw, ecgw, match)) {
			UseCase useCase = (UseCase) result2_black[1];
			P2UC p2uc = (P2UC) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[3];
			GW2S eg2cs = (GW2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_2_3_blackBBBFBBBBBB(process,
					useCase, p2uc, cStep, prevNode, eg2cs, sf1, egw, ecgw)) {
				Flow flow = (Flow) result3_black[3];
				Object[] result3_green = ChoiceAfterChoiceImpl
						.pattern_ChoiceAfterChoice_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(process, useCase, p2uc, flow,
								cStep, prevNode, eg2cs, sf1, egw, ecgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[14];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[15];
				// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[18];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge eg2cs__cStep____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[22];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[23];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[24];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[25];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterChoiceImpl
						.pattern_ChoiceAfterChoice_2_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, process,
								useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, egw, ecgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[process] = " + process + ", " + "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc
							+ ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", " + "[prevNode] = "
							+ prevNode + ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw
							+ ", " + "[ecgw] = " + ecgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_2_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, de.abilov.bpmn.Process process, ExclusiveGateway prevNode,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		match.registerObject("process", process);
		match.registerObject("prevNode", prevNode);
		match.registerObject("sf1", sf1);
		match.registerObject("egw", egw);
		match.registerObject("ecgw", ecgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, de.abilov.bpmn.Process process, ExclusiveGateway prevNode,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, ChoiceStep cStep, ExclusiveGateway prevNode, GW2S eg2cs,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
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
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

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
		eq_1.solve(var_egw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase,
			EObject p2uc, EObject flow, EObject cStep, EObject prevNode, EObject eg2cs, EObject sf1, EObject altFlow,
			EObject step, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("step", step);
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
	public boolean isAppropriate_BWD(Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep,
			AlternativeFlow altFlow, ChoiceStep step) {
		// initial bindings
		Object[] result1_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_10_1_blackBBBBBBBB(this, match, alt,
				useCase, flow, cStep, altFlow, step);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[useCase] = "
					+ useCase + ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", " + "[altFlow] = "
					+ altFlow + ", " + "[step] = " + step + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_10_2_bindingAndBlackFBBBBBBBB(this, match, alt, useCase, flow, cStep,
						altFlow, step);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[useCase] = " + useCase
					+ ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", " + "[altFlow] = " + altFlow + ", "
					+ "[step] = " + step + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_10_4_blackBBBBBBB(match, alt,
					useCase, flow, cStep, altFlow, step);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[useCase] = "
						+ useCase + ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", " + "[altFlow] = "
						+ altFlow + ", " + "[step] = " + step + ".");
			}
			ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_10_4_greenBBBBBBFFFF(match, alt, useCase, cStep, altFlow,
					step);
					// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result4_green[6];
					// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result4_green[7];
					// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result4_green[8];
					// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result4_green[9];

			// collect context elements
			Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_10_5_blackBBBBBBB(match, alt,
					useCase, flow, cStep, altFlow, step);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[alt] = " + alt + ", " + "[useCase] = "
						+ useCase + ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", " + "[altFlow] = "
						+ altFlow + ", " + "[step] = " + step + ".");
			}
			ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_10_5_greenBBBBFF(match, useCase, flow, cStep);
			// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_10_6_expressionBBBBBBBB(this, match, alt, useCase, flow,
					cStep, altFlow, step);
			return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_10_7_expressionF();
		} else {
			return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_11_1_bindingAndBlackFFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		StepAlternative alt = (StepAlternative) result1_bindingAndBlack[0];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[1];
		UseCase useCase = (UseCase) result1_bindingAndBlack[2];
		P2UC p2uc = (P2UC) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		ChoiceStep cStep = (ChoiceStep) result1_bindingAndBlack[5];
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[6];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[7];
		AlternativeFlow altFlow = (AlternativeFlow) result1_bindingAndBlack[8];
		ChoiceStep step = (ChoiceStep) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_11_1_greenBBFBFFFFB(process, prevNode,
				step, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[2];
		ExclusiveGateway egw = (ExclusiveGateway) result1_green[4];
		GW2S egwToStep = (GW2S) result1_green[5];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_green[6];
		GW2S ecgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_11_2_blackBBBBBBBB(alt, sf1, altFlow,
				step, egw, egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[alt] = " + alt + ", " + "[sf1] = " + sf1 + ", " + "[altFlow] = " + altFlow + ", " + "[step] = "
					+ step + ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw
					+ ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_11_2_greenFBBBBBBBB(alt, sf1, altFlow,
				step, egw, egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_11_3_blackBBBBBBBBBBBBBBBB(ruleresult,
				alt, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, altFlow, step, egw, egwToStep, ecgw,
				ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[alt] = " + alt + ", " + "[process] = " + process + ", "
					+ "[useCase] = " + useCase + ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", "
					+ "[cStep] = " + cStep + ", " + "[prevNode] = " + prevNode + ", " + "[eg2cs] = " + eg2cs + ", "
					+ "[sf1] = " + sf1 + ", " + "[altFlow] = " + altFlow + ", " + "[step] = " + step + ", " + "[egw] = "
					+ egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = "
					+ ecgwToStep + ".");
		}
		ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult, alt,
				process, useCase, cStep, prevNode, sf1, altFlow, step, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[13];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[14];
				// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[15];
				// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result3_green[16];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[17];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[18];
				// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result3_green[19];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[20];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[21];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[22];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[23];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[24];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[25];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[26];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[27];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[28];

		// perform postprocessing story node is empty
		// register objects
		ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_11_5_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, alt, process,
				useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, altFlow, step, egw, egwToStep, ecgw, ecgwToStep);
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_12_2_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		StepAlternative alt = (StepAlternative) result2_binding[0];
		UseCase useCase = (UseCase) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		ChoiceStep cStep = (ChoiceStep) result2_binding[3];
		AlternativeFlow altFlow = (AlternativeFlow) result2_binding[4];
		ChoiceStep step = (ChoiceStep) result2_binding[5];
		for (Object[] result2_black : ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_12_2_blackBFBFBBFFBBB(alt,
				useCase, flow, cStep, altFlow, step, match)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[1];
			P2UC p2uc = (P2UC) result2_black[3];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[6];
			GW2S eg2cs = (GW2S) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_12_3_blackBBBBBBBBBB(alt,
					process, useCase, p2uc, flow, cStep, prevNode, eg2cs, altFlow, step)) {
				Object[] result3_green = ChoiceAfterChoiceImpl
						.pattern_ChoiceAfterChoice_12_3_greenBBBBBBBBBBFFFFFFFFFFFF(alt, process, useCase, p2uc, flow,
								cStep, prevNode, eg2cs, altFlow, step);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				// EMoflonEdge alt__altFlow____ref = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];
				// EMoflonEdge useCase__flow____flows = (EMoflonEdge) result3_green[13];
				// EMoflonEdge useCase__altFlow____flows = (EMoflonEdge) result3_green[14];
				// EMoflonEdge p2uc__process____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge p2uc__useCase____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge flow__cStep____steps = (EMoflonEdge) result3_green[17];
				// EMoflonEdge cStep__alt____stepAlternatives = (EMoflonEdge) result3_green[18];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge eg2cs__cStep____target = (EMoflonEdge) result3_green[20];
				// EMoflonEdge altFlow__step____steps = (EMoflonEdge) result3_green[21];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterChoiceImpl
						.pattern_ChoiceAfterChoice_12_4_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch, alt,
								process, useCase, p2uc, flow, cStep, prevNode, eg2cs, altFlow, step);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[alt] = " + alt + ", " + "[process] = " + process + ", " + "[useCase] = " + useCase
							+ ", " + "[p2uc] = " + p2uc + ", " + "[flow] = " + flow + ", " + "[cStep] = " + cStep + ", "
							+ "[prevNode] = " + prevNode + ", " + "[eg2cs] = " + eg2cs + ", " + "[altFlow] = " + altFlow
							+ ", " + "[step] = " + step + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_12_6_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, StepAlternative alt, UseCase useCase, Flow flow,
			ChoiceStep cStep, AlternativeFlow altFlow, ChoiceStep step) {
		match.registerObject("alt", alt);
		match.registerObject("useCase", useCase);
		match.registerObject("flow", flow);
		match.registerObject("cStep", cStep);
		match.registerObject("altFlow", altFlow);
		match.registerObject("step", step);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, StepAlternative alt, UseCase useCase, Flow flow,
			ChoiceStep cStep, AlternativeFlow altFlow, ChoiceStep step) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, StepAlternative alt,
			de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow, ChoiceStep cStep,
			ExclusiveGateway prevNode, GW2S eg2cs, AlternativeFlow altFlow, ChoiceStep step) {// Create CSP
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
		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw.id", csp);
		var_egw_id.setType("String");

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
		eq_1.solve(var_egw_id, var_step_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("alt", alt);
		isApplicableMatch.registerObject("process", process);
		isApplicableMatch.registerObject("useCase", useCase);
		isApplicableMatch.registerObject("p2uc", p2uc);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("cStep", cStep);
		isApplicableMatch.registerObject("prevNode", prevNode);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
		isApplicableMatch.registerObject("altFlow", altFlow);
		isApplicableMatch.registerObject("step", step);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase,
			EObject p2uc, EObject flow, EObject cStep, EObject prevNode, EObject eg2cs, EObject sf1, EObject altFlow,
			EObject step, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("alt", alt);
		ruleresult.registerObject("process", process);
		ruleresult.registerObject("useCase", useCase);
		ruleresult.registerObject("p2uc", p2uc);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("cStep", cStep);
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("altFlow", altFlow);
		ruleresult.registerObject("step", step);
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
		return true
				&& match.getObject("alt").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getStepAlternative())
				&& match.getObject("altFlow").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getAlternativeFlow())
				&& match.getObject("step").eClass()
						.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getChoiceStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_290(EMoflonEdge _edge_ref) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_20_2_blackFFFFFFB(_edge_ref)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			ChoiceStep step = (ChoiceStep) result2_black[5];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_20_3_expressionFBBBBBBBB(this, match, alt, useCase,
					flow, cStep, altFlow, step)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_20_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_949(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_21_2_blackFFFFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_21_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_21_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_291(EMoflonEdge _edge_flows) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_22_2_blackFFFFFFB(_edge_flows)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			ChoiceStep step = (ChoiceStep) result2_black[5];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_22_3_expressionFBBBBBBBB(this, match, alt, useCase,
					flow, cStep, altFlow, step)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_22_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_292(EMoflonEdge _edge_stepAlternatives) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_23_2_blackFFFFFFB(_edge_stepAlternatives)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			ChoiceStep step = (ChoiceStep) result2_black[5];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_23_3_expressionFBBBBBBBB(this, match, alt, useCase,
					flow, cStep, altFlow, step)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_23_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_950(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_24_2_blackFFFFFB(_edge_sourceRef)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_24_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_24_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_951(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_25_2_blackFFFFFB(_edge_outgoing)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_25_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_25_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_293(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_26_2_blackFFFFFFB(_edge_steps)) {
			StepAlternative alt = (StepAlternative) result2_black[0];
			UseCase useCase = (UseCase) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			ChoiceStep cStep = (ChoiceStep) result2_black[3];
			AlternativeFlow altFlow = (AlternativeFlow) result2_black[4];
			ChoiceStep step = (ChoiceStep) result2_black[5];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_26_3_expressionFBBBBBBBB(this, match, alt, useCase,
					flow, cStep, altFlow, step)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_26_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_952(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_27_2_blackFFFFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_27_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_27_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_953(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_28_2_blackFFFFFB(_edge_flowElements)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_28_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_28_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_954(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_29_2_blackFFFFFB(_edge_targetRef)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_29_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_29_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_955(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_30_2_blackFFFFFB(_edge_incoming)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_30_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_30_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_30_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_30_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_956(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceImpl
				.pattern_ChoiceAfterChoice_31_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_31_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_31_2_blackFFFFFB(_edge___conv)) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[0];
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_31_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_31_3_expressionFBBBBBBB(this, match, process, prevNode,
					sf1, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_31_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_31_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_31_5_greenBBB(match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceImpl.pattern_ChoiceAfterChoice_31_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ChoiceAfterChoice");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForAlt = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("alt")).findAny();
		de.abilov.useCase.StepAlternative alt = (de.abilov.useCase.StepAlternative) matchForAlt.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cStep")).findAny();
		de.abilov.useCase.ChoiceStep cStep = (de.abilov.useCase.ChoiceStep) matchForCStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S eg2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForAltFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("altFlow")).findAny();
		de.abilov.useCase.AlternativeFlow altFlow = (de.abilov.useCase.AlternativeFlow) matchForAltFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ChoiceStep step = (de.abilov.useCase.ChoiceStep) matchForStep.get().getNode();

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

		if (!(prevNode.isIsDiverging() == true)) {
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

		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("ChoiceAfterChoice");
		eq0.solve(var_sf1_conditionExpression, var_alt_condition);

		eq1.setRuleName("ChoiceAfterChoice");
		eq1.solve(var_sf1_id, var_altFlow_id);

		eq2.setRuleName("ChoiceAfterChoice");
		eq2.solve(var_egw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_alt_condition.setBound(false);
			var_altFlow_id.setBound(false);
			var_step_id.setBound(false);
			eq0.solve(var_sf1_conditionExpression, var_alt_condition);
			eq1.solve(var_sf1_id, var_altFlow_id);
			eq2.solve(var_egw_id, var_step_id);
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
		ruleResult.setRule("ChoiceAfterChoice");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForAlt = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("alt")).findAny();
		de.abilov.useCase.StepAlternative alt = (de.abilov.useCase.StepAlternative) matchForAlt.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForUseCase = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("useCase")).findAny();
		de.abilov.useCase.UseCase useCase = (de.abilov.useCase.UseCase) matchForUseCase.get().getNode();

		Optional<TripleMatchNodeMapping> matchForP2uc = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("p2uc")).findAny();
		de.abilov.tgg.bpmn2useCase.P2UC p2uc = (de.abilov.tgg.bpmn2useCase.P2UC) matchForP2uc.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForCStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("cStep")).findAny();
		de.abilov.useCase.ChoiceStep cStep = (de.abilov.useCase.ChoiceStep) matchForCStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S eg2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForAltFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("altFlow")).findAny();
		de.abilov.useCase.AlternativeFlow altFlow = (de.abilov.useCase.AlternativeFlow) matchForAltFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ChoiceStep step = (de.abilov.useCase.ChoiceStep) matchForStep.get().getNode();

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

		if (!(prevNode.isIsDiverging() == true)) {
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

		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		eq0.setRuleName("ChoiceAfterChoice");
		eq0.solve(var_sf1_conditionExpression, var_alt_condition);

		eq1.setRuleName("ChoiceAfterChoice");
		eq1.solve(var_sf1_id, var_altFlow_id);

		eq2.setRuleName("ChoiceAfterChoice");
		eq2.solve(var_egw_id, var_step_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_sf1_conditionExpression.setBound(false);
			var_sf1_id.setBound(false);
			var_egw_id.setBound(false);
			eq0.solve(var_sf1_conditionExpression, var_alt_condition);
			eq1.solve(var_sf1_id, var_altFlow_id);
			eq2.solve(var_egw_id, var_step_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				sf1.setConditionExpression((String) var_sf1_conditionExpression.getValue());
				sf1.setId((String) var_sf1_id.getValue());
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
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_CHOICE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
			return null;
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROCESS_EXCLUSIVEGATEWAY_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (de.abilov.bpmn.Process) arguments.get(1),
					(ExclusiveGateway) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(de.abilov.bpmn.Process) arguments.get(1), (UseCase) arguments.get(2), (P2UC) arguments.get(3),
					(Flow) arguments.get(4), (ChoiceStep) arguments.get(5), (ExclusiveGateway) arguments.get(6),
					(GW2S) arguments.get(7), (SequenceFlow) arguments.get(8), (ExclusiveGateway) arguments.get(9),
					(ExclusiveGateway) arguments.get(10));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.CHOICE_AFTER_CHOICE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_CHOICESTEP:
			return isAppropriate_BWD((Match) arguments.get(0), (StepAlternative) arguments.get(1),
					(UseCase) arguments.get(2), (Flow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(AlternativeFlow) arguments.get(5), (ChoiceStep) arguments.get(6));
		case RulesPackage.CHOICE_AFTER_CHOICE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_CHOICESTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (StepAlternative) arguments.get(1),
					(UseCase) arguments.get(2), (Flow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(AlternativeFlow) arguments.get(5), (ChoiceStep) arguments.get(6));
			return null;
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEPALTERNATIVE_USECASE_FLOW_CHOICESTEP_ALTERNATIVEFLOW_CHOICESTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (StepAlternative) arguments.get(1),
					(UseCase) arguments.get(2), (Flow) arguments.get(3), (ChoiceStep) arguments.get(4),
					(AlternativeFlow) arguments.get(5), (ChoiceStep) arguments.get(6));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEPALTERNATIVE_PROCESS_USECASE_P2UC_FLOW_CHOICESTEP_EXCLUSIVEGATEWAY_GW2S_ALTERNATIVEFLOW_CHOICESTEP:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (StepAlternative) arguments.get(1),
					(de.abilov.bpmn.Process) arguments.get(2), (UseCase) arguments.get(3), (P2UC) arguments.get(4),
					(Flow) arguments.get(5), (ChoiceStep) arguments.get(6), (ExclusiveGateway) arguments.get(7),
					(GW2S) arguments.get(8), (AlternativeFlow) arguments.get(9), (ChoiceStep) arguments.get(10));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.CHOICE_AFTER_CHOICE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_290__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_290((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_949__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_949((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_291__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_291((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_292__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_292((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_950__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_950((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_951__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_951((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_293__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_293((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_952__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_952((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_953__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_953((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_954__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_954((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_955__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_955((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_956__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_956((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ChoiceAfterChoice_0_1_blackBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					return new Object[] { _this, match, process, prevNode, sf1, egw, ecgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_0_2_bindingFBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, process, prevNode, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, process, prevNode, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterChoice_0_2_bindingAndBlackFBBBBBBB(ChoiceAfterChoice _this,
			Match match, de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterChoice_0_2_binding = pattern_ChoiceAfterChoice_0_2_bindingFBBBBBBB(_this,
				match, process, prevNode, sf1, egw, ecgw);
		if (result_pattern_ChoiceAfterChoice_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterChoice_0_2_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_0_2_black = pattern_ChoiceAfterChoice_0_2_blackB(csp);
			if (result_pattern_ChoiceAfterChoice_0_2_black != null) {

				return new Object[] { csp, _this, match, process, prevNode, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterChoice_0_3_expressionFBB(ChoiceAfterChoice _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_0_4_blackBBBBBB(Match match, de.abilov.bpmn.Process process,
			ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					return new Object[] { match, process, prevNode, sf1, egw, ecgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_0_4_greenBBBBBBFFFFFFFF(Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(egw);
		match.getToBeTranslatedNodes().add(ecgw);
		String process__sf1____flowElements_name_prime = "flowElements";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getToBeTranslatedEdges().add(process__sf1____flowElements);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		match.getToBeTranslatedEdges().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		match.getToBeTranslatedEdges().add(process__ecgw____flowElements);
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
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { match, process, prevNode, sf1, egw, ecgw, process__sf1____flowElements,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, process__egw____flowElements,
				process__ecgw____flowElements, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv };
	}

	public static final Object[] pattern_ChoiceAfterChoice_0_5_blackBBBBBB(Match match, de.abilov.bpmn.Process process,
			ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					return new Object[] { match, process, prevNode, sf1, egw, ecgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_0_5_greenBBBF(Match match, de.abilov.bpmn.Process process,
			ExclusiveGateway prevNode) {
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(process);
		match.getContextNodes().add(prevNode);
		String process__prevNode____flowElements_name_prime = "flowElements";
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		match.getContextEdges().add(process__prevNode____flowElements);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { match, process, prevNode, process__prevNode____flowElements };
	}

	public static final void pattern_ChoiceAfterChoice_0_6_expressionBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		_this.registerObjectsToMatch_FWD(match, process, prevNode, sf1, egw, ecgw);

	}

	public static final boolean pattern_ChoiceAfterChoice_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_1_1_bindingFFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("process");
		EObject _localVariable_1 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_2 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_3 = isApplicableMatch.getObject("flow");
		EObject _localVariable_4 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_5 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_6 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_7 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_8 = isApplicableMatch.getObject("egw");
		EObject _localVariable_9 = isApplicableMatch.getObject("ecgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpP2uc = _localVariable_2;
		EObject tmpFlow = _localVariable_3;
		EObject tmpCStep = _localVariable_4;
		EObject tmpPrevNode = _localVariable_5;
		EObject tmpEg2cs = _localVariable_6;
		EObject tmpSf1 = _localVariable_7;
		EObject tmpEgw = _localVariable_8;
		EObject tmpEcgw = _localVariable_9;
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpP2uc instanceof P2UC) {
					P2UC p2uc = (P2UC) tmpP2uc;
					if (tmpFlow instanceof Flow) {
						Flow flow = (Flow) tmpFlow;
						if (tmpCStep instanceof ChoiceStep) {
							ChoiceStep cStep = (ChoiceStep) tmpCStep;
							if (tmpPrevNode instanceof ExclusiveGateway) {
								ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
								if (tmpEg2cs instanceof GW2S) {
									GW2S eg2cs = (GW2S) tmpEg2cs;
									if (tmpSf1 instanceof SequenceFlow) {
										SequenceFlow sf1 = (SequenceFlow) tmpSf1;
										if (tmpEgw instanceof ExclusiveGateway) {
											ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
											if (tmpEcgw instanceof ExclusiveGateway) {
												ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
												return new Object[] { process, useCase, p2uc, flow, cStep, prevNode,
														eg2cs, sf1, egw, ecgw, isApplicableMatch };
											}
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

	public static final Object[] pattern_ChoiceAfterChoice_1_1_blackBBBBBBBBBBBFB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, Flow flow, ChoiceStep cStep, ExclusiveGateway prevNode, GW2S eg2cs,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw, ChoiceAfterChoice _this,
			IsApplicableMatch isApplicableMatch) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { process, useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, egw, ecgw,
									_this, csp, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_1_1_bindingAndBlackFFFFFFFFFFBFB(ChoiceAfterChoice _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterChoice_1_1_binding = pattern_ChoiceAfterChoice_1_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterChoice_1_1_binding != null) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterChoice_1_1_binding[0];
			UseCase useCase = (UseCase) result_pattern_ChoiceAfterChoice_1_1_binding[1];
			P2UC p2uc = (P2UC) result_pattern_ChoiceAfterChoice_1_1_binding[2];
			Flow flow = (Flow) result_pattern_ChoiceAfterChoice_1_1_binding[3];
			ChoiceStep cStep = (ChoiceStep) result_pattern_ChoiceAfterChoice_1_1_binding[4];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterChoice_1_1_binding[5];
			GW2S eg2cs = (GW2S) result_pattern_ChoiceAfterChoice_1_1_binding[6];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ChoiceAfterChoice_1_1_binding[7];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_ChoiceAfterChoice_1_1_binding[8];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_ChoiceAfterChoice_1_1_binding[9];

			Object[] result_pattern_ChoiceAfterChoice_1_1_black = pattern_ChoiceAfterChoice_1_1_blackBBBBBBBBBBBFB(
					process, useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, egw, ecgw, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterChoice_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterChoice_1_1_black[11];

				return new Object[] { process, useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, egw, ecgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_1_1_greenFBBFFBFBFB(UseCase useCase, ChoiceStep cStep,
			ExclusiveGateway egw, ExclusiveGateway ecgw, CSP csp) {
		StepAlternative alt = UseCaseFactory.eINSTANCE.createStepAlternative();
		AlternativeFlow altFlow = UseCaseFactory.eINSTANCE.createAlternativeFlow();
		ChoiceStep step = UseCaseFactory.eINSTANCE.createChoiceStep();
		GW2S egwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		GW2S ecgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("alt", "condition");
		Object _localVariable_1 = csp.getValue("altFlow", "id");
		Object _localVariable_2 = csp.getValue("step", "id");
		cStep.getStepAlternatives().add(alt);
		alt.setRef(altFlow);
		useCase.getFlows().add(altFlow);
		altFlow.getSteps().add(step);
		egwToStep.setSource(egw);
		egwToStep.setTarget(step);
		ecgwToStep.setSource(ecgw);
		ecgwToStep.setTarget(step);
		String alt_condition_prime = (String) _localVariable_0;
		String altFlow_id_prime = (String) _localVariable_1;
		String step_id_prime = (String) _localVariable_2;
		alt.setCondition(alt_condition_prime);
		altFlow.setId(altFlow_id_prime);
		step.setId(step_id_prime);
		return new Object[] { alt, useCase, cStep, altFlow, step, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_ChoiceAfterChoice_1_2_blackBBBBBBBB(StepAlternative alt, SequenceFlow sf1,
			AlternativeFlow altFlow, ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw,
			GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { alt, sf1, altFlow, step, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_1_2_greenFBBBBBBBB(StepAlternative alt, SequenceFlow sf1,
			AlternativeFlow altFlow, ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw,
			GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(alt);
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(altFlow);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getTranslatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, alt, sf1, altFlow, step, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_ChoiceAfterChoice_1_3_blackBBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject alt, EObject process, EObject useCase, EObject p2uc, EObject flow, EObject cStep, EObject prevNode,
			EObject eg2cs, EObject sf1, EObject altFlow, EObject step, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		if (!alt.equals(process)) {
			if (!alt.equals(useCase)) {
				if (!alt.equals(p2uc)) {
					if (!alt.equals(flow)) {
						if (!alt.equals(cStep)) {
							if (!alt.equals(prevNode)) {
								if (!alt.equals(eg2cs)) {
									if (!alt.equals(sf1)) {
										if (!alt.equals(altFlow)) {
											if (!alt.equals(step)) {
												if (!alt.equals(egw)) {
													if (!alt.equals(egwToStep)) {
														if (!alt.equals(ecgw)) {
															if (!alt.equals(ecgwToStep)) {
																if (!process.equals(useCase)) {
																	if (!process.equals(sf1)) {
																		if (!process.equals(step)) {
																			if (!p2uc.equals(process)) {
																				if (!p2uc.equals(useCase)) {
																					if (!p2uc.equals(prevNode)) {
																						if (!p2uc.equals(sf1)) {
																							if (!p2uc.equals(step)) {
																								if (!flow.equals(
																										process)) {
																									if (!flow.equals(
																											useCase)) {
																										if (!flow
																												.equals(p2uc)) {
																											if (!flow
																													.equals(prevNode)) {
																												if (!flow
																														.equals(sf1)) {
																													if (!flow
																															.equals(step)) {
																														if (!cStep
																																.equals(process)) {
																															if (!cStep
																																	.equals(useCase)) {
																																if (!cStep
																																		.equals(p2uc)) {
																																	if (!cStep
																																			.equals(flow)) {
																																		if (!cStep
																																				.equals(prevNode)) {
																																			if (!cStep
																																					.equals(eg2cs)) {
																																				if (!cStep
																																						.equals(sf1)) {
																																					if (!cStep
																																							.equals(step)) {
																																						if (!cStep
																																								.equals(egw)) {
																																							if (!cStep
																																									.equals(egwToStep)) {
																																								if (!cStep
																																										.equals(ecgw)) {
																																									if (!cStep
																																											.equals(ecgwToStep)) {
																																										if (!prevNode
																																												.equals(process)) {
																																											if (!prevNode
																																													.equals(useCase)) {
																																												if (!prevNode
																																														.equals(sf1)) {
																																													if (!prevNode
																																															.equals(step)) {
																																														if (!eg2cs
																																																.equals(process)) {
																																															if (!eg2cs
																																																	.equals(useCase)) {
																																																if (!eg2cs
																																																		.equals(p2uc)) {
																																																	if (!eg2cs
																																																			.equals(flow)) {
																																																		if (!eg2cs
																																																				.equals(prevNode)) {
																																																			if (!eg2cs
																																																					.equals(sf1)) {
																																																				if (!eg2cs
																																																						.equals(step)) {
																																																					if (!eg2cs
																																																							.equals(egw)) {
																																																						if (!eg2cs
																																																								.equals(egwToStep)) {
																																																							if (!sf1.equals(
																																																									useCase)) {
																																																								if (!sf1.equals(
																																																										step)) {
																																																									if (!altFlow
																																																											.equals(process)) {
																																																										if (!altFlow
																																																												.equals(useCase)) {
																																																											if (!altFlow
																																																													.equals(p2uc)) {
																																																												if (!altFlow
																																																														.equals(flow)) {
																																																													if (!altFlow
																																																															.equals(cStep)) {
																																																														if (!altFlow
																																																																.equals(prevNode)) {
																																																															if (!altFlow
																																																																	.equals(eg2cs)) {
																																																																if (!altFlow
																																																																		.equals(sf1)) {
																																																																	if (!altFlow
																																																																			.equals(step)) {
																																																																		if (!altFlow
																																																																				.equals(egw)) {
																																																																			if (!altFlow
																																																																					.equals(egwToStep)) {
																																																																				if (!altFlow
																																																																						.equals(ecgw)) {
																																																																					if (!altFlow
																																																																							.equals(ecgwToStep)) {
																																																																						if (!step
																																																																								.equals(useCase)) {
																																																																							if (!egw.equals(
																																																																									process)) {
																																																																								if (!egw.equals(
																																																																										useCase)) {
																																																																									if (!egw.equals(
																																																																											p2uc)) {
																																																																										if (!egw.equals(
																																																																												flow)) {
																																																																											if (!egw.equals(
																																																																													prevNode)) {
																																																																												if (!egw.equals(
																																																																														sf1)) {
																																																																													if (!egw.equals(
																																																																															step)) {
																																																																														if (!egw.equals(
																																																																																egwToStep)) {
																																																																															if (!egwToStep
																																																																																	.equals(process)) {
																																																																																if (!egwToStep
																																																																																		.equals(useCase)) {
																																																																																	if (!egwToStep
																																																																																			.equals(p2uc)) {
																																																																																		if (!egwToStep
																																																																																				.equals(flow)) {
																																																																																			if (!egwToStep
																																																																																					.equals(prevNode)) {
																																																																																				if (!egwToStep
																																																																																						.equals(sf1)) {
																																																																																					if (!egwToStep
																																																																																							.equals(step)) {
																																																																																						if (!ecgw
																																																																																								.equals(process)) {
																																																																																							if (!ecgw
																																																																																									.equals(useCase)) {
																																																																																								if (!ecgw
																																																																																										.equals(p2uc)) {
																																																																																									if (!ecgw
																																																																																											.equals(flow)) {
																																																																																										if (!ecgw
																																																																																												.equals(prevNode)) {
																																																																																											if (!ecgw
																																																																																													.equals(eg2cs)) {
																																																																																												if (!ecgw
																																																																																														.equals(sf1)) {
																																																																																													if (!ecgw
																																																																																															.equals(step)) {
																																																																																														if (!ecgw
																																																																																																.equals(egw)) {
																																																																																															if (!ecgw
																																																																																																	.equals(egwToStep)) {
																																																																																																if (!ecgw
																																																																																																		.equals(ecgwToStep)) {
																																																																																																	if (!ecgwToStep
																																																																																																			.equals(process)) {
																																																																																																		if (!ecgwToStep
																																																																																																				.equals(useCase)) {
																																																																																																			if (!ecgwToStep
																																																																																																					.equals(p2uc)) {
																																																																																																				if (!ecgwToStep
																																																																																																						.equals(flow)) {
																																																																																																					if (!ecgwToStep
																																																																																																							.equals(prevNode)) {
																																																																																																						if (!ecgwToStep
																																																																																																								.equals(eg2cs)) {
																																																																																																							if (!ecgwToStep
																																																																																																									.equals(sf1)) {
																																																																																																								if (!ecgwToStep
																																																																																																										.equals(step)) {
																																																																																																									if (!ecgwToStep
																																																																																																											.equals(egw)) {
																																																																																																										if (!ecgwToStep
																																																																																																												.equals(egwToStep)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													alt,
																																																																																																													process,
																																																																																																													useCase,
																																																																																																													p2uc,
																																																																																																													flow,
																																																																																																													cStep,
																																																																																																													prevNode,
																																																																																																													eg2cs,
																																																																																																													sf1,
																																																																																																													altFlow,
																																																																																																													step,
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

	public static final Object[] pattern_ChoiceAfterChoice_1_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase, EObject cStep,
			EObject prevNode, EObject sf1, EObject altFlow, EObject step, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ChoiceAfterChoice";
		String alt__altFlow____ref_name_prime = "ref";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__altFlow____flows_name_prime = "flows";
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String altFlow__step____steps_name_prime = "steps";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(alt__altFlow____ref);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(process__sf1____flowElements);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		ruleresult.getCreatedEdges().add(useCase__altFlow____flows);
		cStep__alt____stepAlternatives.setSrc(cStep);
		cStep__alt____stepAlternatives.setTrg(alt);
		ruleresult.getCreatedEdges().add(cStep__alt____stepAlternatives);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
		altFlow__step____steps.setSrc(altFlow);
		altFlow__step____steps.setTrg(step);
		ruleresult.getCreatedEdges().add(altFlow__step____steps);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		ruleresult.getTranslatedEdges().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		ruleresult.getTranslatedEdges().add(process__ecgw____flowElements);
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
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, alt, process, useCase, cStep, prevNode, sf1, altFlow, step, egw, egwToStep,
				ecgw, ecgwToStep, alt__altFlow____ref, process__sf1____flowElements, useCase__altFlow____flows,
				cStep__alt____stepAlternatives, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				altFlow__step____steps, process__egw____flowElements, process__ecgw____flowElements,
				sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv, egwToStep__egw____source,
				egwToStep__step____target, ecgwToStep__ecgw____source, ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterChoice_1_5_expressionBBBBBBBBBBBBBBBBB(ChoiceAfterChoice _this,
			PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase, EObject p2uc, EObject flow,
			EObject cStep, EObject prevNode, EObject eg2cs, EObject sf1, EObject altFlow, EObject step, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_FWD(ruleresult, alt, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, altFlow,
				step, egw, egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterChoice_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_1_blackFBB(EClass eClass, ChoiceAfterChoice _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_2_1_binding = pattern_ChoiceAfterChoice_2_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterChoice_2_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_2_1_black = pattern_ChoiceAfterChoice_2_1_blackFBB(eClass, _this);
			if (result_pattern_ChoiceAfterChoice_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterChoice_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterChoice";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("process");
		EObject _localVariable_1 = match.getObject("prevNode");
		EObject _localVariable_2 = match.getObject("sf1");
		EObject _localVariable_3 = match.getObject("egw");
		EObject _localVariable_4 = match.getObject("ecgw");
		EObject tmpProcess = _localVariable_0;
		EObject tmpPrevNode = _localVariable_1;
		EObject tmpSf1 = _localVariable_2;
		EObject tmpEgw = _localVariable_3;
		EObject tmpEcgw = _localVariable_4;
		if (tmpProcess instanceof de.abilov.bpmn.Process) {
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (tmpSf1 instanceof SequenceFlow) {
					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
					if (tmpEgw instanceof ExclusiveGateway) {
						ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
						if (tmpEcgw instanceof ExclusiveGateway) {
							ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
							return new Object[] { process, prevNode, sf1, egw, ecgw, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_2_2_blackBFFFBFBBBB(de.abilov.bpmn.Process process,
			ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
						boolean egwisDiverging = egw.isIsDiverging();
						if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
							boolean ecgwisDiverging = ecgw.isIsDiverging();
							if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
								for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(process, P2UC.class, "source")) {
									UseCase useCase = p2uc.getTarget();
									if (useCase != null) {
										for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevNode, GW2S.class, "source")) {
											Step tmpCStep = eg2cs.getTarget();
											if (tmpCStep instanceof ChoiceStep) {
												ChoiceStep cStep = (ChoiceStep) tmpCStep;
												_result.add(new Object[] { process, useCase, p2uc, cStep, prevNode,
														eg2cs, sf1, egw, ecgw, match });
											}

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

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_2_3_blackBBBFBBBBBB(de.abilov.bpmn.Process process,
			UseCase useCase, P2UC p2uc, ChoiceStep cStep, ExclusiveGateway prevNode, GW2S eg2cs, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (process.getFlowElements().contains(prevNode)) {
						if (process.getFlowElements().contains(sf1)) {
							if (process.equals(p2uc.getSource())) {
								if (useCase.equals(p2uc.getTarget())) {
									if (prevNode.equals(sf1.getSourceRef())) {
										if (prevNode.equals(eg2cs.getSource())) {
											if (cStep.equals(eg2cs.getTarget())) {
												if (process.getFlowElements().contains(egw)) {
													if (process.getFlowElements().contains(ecgw)) {
														if (egw.equals(sf1.getTargetRef())) {
															if (ecgw.equals(egw.get__conv())) {
																boolean prevNodeisDiverging = prevNode.isIsDiverging();
																if (Boolean.valueOf(prevNodeisDiverging)
																		.equals(Boolean.valueOf(true))) {
																	boolean egwisDiverging = egw.isIsDiverging();
																	if (Boolean.valueOf(egwisDiverging)
																			.equals(Boolean.valueOf(true))) {
																		boolean ecgwisDiverging = ecgw.isIsDiverging();
																		if (Boolean.valueOf(ecgwisDiverging)
																				.equals(false)) {
																			for (Flow flow : useCase.getFlows()) {
																				if (flow.getSteps().contains(cStep)) {
																					_result.add(new Object[] { process,
																							useCase, p2uc, flow, cStep,
																							prevNode, eg2cs, sf1, egw,
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
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_3_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow, ChoiceStep cStep,
			ExclusiveGateway prevNode, GW2S eg2cs, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__cStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String flow__cStep____steps_name_prime = "steps";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__cStep____target_name_prime = "target";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(egw);
		isApplicableMatch.getAllContextElements().add(ecgw);
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
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		isApplicableMatch.getAllContextElements().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		isApplicableMatch.getAllContextElements().add(process__ecgw____flowElements);
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		isApplicableMatch.getAllContextElements().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		isApplicableMatch.getAllContextElements().add(egw__ecgw______conv);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__cStep____target.setName(eg2cs__cStep____target_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { process, useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, egw, ecgw, isApplicableMatch,
				process__prevNode____flowElements, process__sf1____flowElements, useCase__flow____flows,
				p2uc__process____source, p2uc__useCase____target, flow__cStep____steps, sf1__prevNode____sourceRef,
				prevNode__sf1____outgoing, eg2cs__prevNode____source, eg2cs__cStep____target,
				process__egw____flowElements, process__ecgw____flowElements, sf1__egw____targetRef,
				egw__sf1____incoming, egw__ecgw______conv };
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_4_bindingFBBBBBBBBBBBB(ChoiceAfterChoice _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow,
			ChoiceStep cStep, ExclusiveGateway prevNode, GW2S eg2cs, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, process, useCase, p2uc, flow, cStep,
				prevNode, eg2cs, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, flow, cStep, prevNode, eg2cs,
					sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_4_bindingAndBlackFBBBBBBBBBBBB(ChoiceAfterChoice _this,
			IsApplicableMatch isApplicableMatch, de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow,
			ChoiceStep cStep, ExclusiveGateway prevNode, GW2S eg2cs, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterChoice_2_4_binding = pattern_ChoiceAfterChoice_2_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, egw, ecgw);
		if (result_pattern_ChoiceAfterChoice_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterChoice_2_4_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_2_4_black = pattern_ChoiceAfterChoice_2_4_blackB(csp);
			if (result_pattern_ChoiceAfterChoice_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, process, useCase, p2uc, flow, cStep, prevNode,
						eg2cs, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterChoice_2_5_expressionFBB(ChoiceAfterChoice _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterChoice_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterChoice";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterChoice_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_10_1_blackBBBBBBBB(ChoiceAfterChoice _this, Match match,
			StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ChoiceStep step) {
		if (!cStep.equals(step)) {
			if (!altFlow.equals(flow)) {
				return new Object[] { _this, match, alt, useCase, flow, cStep, altFlow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_10_2_bindingFBBBBBBBB(ChoiceAfterChoice _this, Match match,
			StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ChoiceStep step) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, alt, useCase, flow, cStep, altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterChoice_10_2_bindingAndBlackFBBBBBBBB(ChoiceAfterChoice _this,
			Match match, StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ChoiceStep step) {
		Object[] result_pattern_ChoiceAfterChoice_10_2_binding = pattern_ChoiceAfterChoice_10_2_bindingFBBBBBBBB(_this,
				match, alt, useCase, flow, cStep, altFlow, step);
		if (result_pattern_ChoiceAfterChoice_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterChoice_10_2_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_10_2_black = pattern_ChoiceAfterChoice_10_2_blackB(csp);
			if (result_pattern_ChoiceAfterChoice_10_2_black != null) {

				return new Object[] { csp, _this, match, alt, useCase, flow, cStep, altFlow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterChoice_10_3_expressionFBB(ChoiceAfterChoice _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_10_4_blackBBBBBBB(Match match, StepAlternative alt,
			UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow, ChoiceStep step) {
		if (!cStep.equals(step)) {
			if (!altFlow.equals(flow)) {
				return new Object[] { match, alt, useCase, flow, cStep, altFlow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_10_4_greenBBBBBBFFFF(Match match, StepAlternative alt,
			UseCase useCase, ChoiceStep cStep, AlternativeFlow altFlow, ChoiceStep step) {
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(alt);
		match.getToBeTranslatedNodes().add(altFlow);
		match.getToBeTranslatedNodes().add(step);
		String alt__altFlow____ref_name_prime = "ref";
		String useCase__altFlow____flows_name_prime = "flows";
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String altFlow__step____steps_name_prime = "steps";
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		match.getToBeTranslatedEdges().add(alt__altFlow____ref);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		match.getToBeTranslatedEdges().add(useCase__altFlow____flows);
		cStep__alt____stepAlternatives.setSrc(cStep);
		cStep__alt____stepAlternatives.setTrg(alt);
		match.getToBeTranslatedEdges().add(cStep__alt____stepAlternatives);
		altFlow__step____steps.setSrc(altFlow);
		altFlow__step____steps.setTrg(step);
		match.getToBeTranslatedEdges().add(altFlow__step____steps);
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		return new Object[] { match, alt, useCase, cStep, altFlow, step, alt__altFlow____ref, useCase__altFlow____flows,
				cStep__alt____stepAlternatives, altFlow__step____steps };
	}

	public static final Object[] pattern_ChoiceAfterChoice_10_5_blackBBBBBBB(Match match, StepAlternative alt,
			UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow, ChoiceStep step) {
		if (!cStep.equals(step)) {
			if (!altFlow.equals(flow)) {
				return new Object[] { match, alt, useCase, flow, cStep, altFlow, step };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_10_5_greenBBBBFF(Match match, UseCase useCase, Flow flow,
			ChoiceStep cStep) {
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(useCase);
		match.getContextNodes().add(flow);
		match.getContextNodes().add(cStep);
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
		return new Object[] { match, useCase, flow, cStep, useCase__flow____flows, flow__cStep____steps };
	}

	public static final void pattern_ChoiceAfterChoice_10_6_expressionBBBBBBBB(ChoiceAfterChoice _this, Match match,
			StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ChoiceStep step) {
		_this.registerObjectsToMatch_BWD(match, alt, useCase, flow, cStep, altFlow, step);

	}

	public static final boolean pattern_ChoiceAfterChoice_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_11_1_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("alt");
		EObject _localVariable_1 = isApplicableMatch.getObject("process");
		EObject _localVariable_2 = isApplicableMatch.getObject("useCase");
		EObject _localVariable_3 = isApplicableMatch.getObject("p2uc");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("cStep");
		EObject _localVariable_6 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_7 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_8 = isApplicableMatch.getObject("altFlow");
		EObject _localVariable_9 = isApplicableMatch.getObject("step");
		EObject tmpAlt = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpUseCase = _localVariable_2;
		EObject tmpP2uc = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpCStep = _localVariable_5;
		EObject tmpPrevNode = _localVariable_6;
		EObject tmpEg2cs = _localVariable_7;
		EObject tmpAltFlow = _localVariable_8;
		EObject tmpStep = _localVariable_9;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpProcess instanceof de.abilov.bpmn.Process) {
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
				if (tmpUseCase instanceof UseCase) {
					UseCase useCase = (UseCase) tmpUseCase;
					if (tmpP2uc instanceof P2UC) {
						P2UC p2uc = (P2UC) tmpP2uc;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpCStep instanceof ChoiceStep) {
								ChoiceStep cStep = (ChoiceStep) tmpCStep;
								if (tmpPrevNode instanceof ExclusiveGateway) {
									ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
									if (tmpEg2cs instanceof GW2S) {
										GW2S eg2cs = (GW2S) tmpEg2cs;
										if (tmpAltFlow instanceof AlternativeFlow) {
											AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
											if (tmpStep instanceof ChoiceStep) {
												ChoiceStep step = (ChoiceStep) tmpStep;
												return new Object[] { alt, process, useCase, p2uc, flow, cStep,
														prevNode, eg2cs, altFlow, step, isApplicableMatch };
											}
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

	public static final Object[] pattern_ChoiceAfterChoice_11_1_blackBBBBBBBBBBBFB(StepAlternative alt,
			de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow, ChoiceStep cStep,
			ExclusiveGateway prevNode, GW2S eg2cs, AlternativeFlow altFlow, ChoiceStep step, ChoiceAfterChoice _this,
			IsApplicableMatch isApplicableMatch) {
		if (!cStep.equals(step)) {
			if (!altFlow.equals(flow)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { alt, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, altFlow, step,
								_this, csp, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_11_1_bindingAndBlackFFFFFFFFFFBFB(ChoiceAfterChoice _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterChoice_11_1_binding = pattern_ChoiceAfterChoice_11_1_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterChoice_11_1_binding != null) {
			StepAlternative alt = (StepAlternative) result_pattern_ChoiceAfterChoice_11_1_binding[0];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterChoice_11_1_binding[1];
			UseCase useCase = (UseCase) result_pattern_ChoiceAfterChoice_11_1_binding[2];
			P2UC p2uc = (P2UC) result_pattern_ChoiceAfterChoice_11_1_binding[3];
			Flow flow = (Flow) result_pattern_ChoiceAfterChoice_11_1_binding[4];
			ChoiceStep cStep = (ChoiceStep) result_pattern_ChoiceAfterChoice_11_1_binding[5];
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterChoice_11_1_binding[6];
			GW2S eg2cs = (GW2S) result_pattern_ChoiceAfterChoice_11_1_binding[7];
			AlternativeFlow altFlow = (AlternativeFlow) result_pattern_ChoiceAfterChoice_11_1_binding[8];
			ChoiceStep step = (ChoiceStep) result_pattern_ChoiceAfterChoice_11_1_binding[9];

			Object[] result_pattern_ChoiceAfterChoice_11_1_black = pattern_ChoiceAfterChoice_11_1_blackBBBBBBBBBBBFB(
					alt, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, altFlow, step, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterChoice_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterChoice_11_1_black[11];

				return new Object[] { alt, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, altFlow, step, _this,
						csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_11_1_greenBBFBFFFFB(de.abilov.bpmn.Process process,
			ExclusiveGateway prevNode, ChoiceStep step, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		ExclusiveGateway egw = BpmnFactory.eINSTANCE.createExclusiveGateway();
		GW2S egwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		ExclusiveGateway ecgw = BpmnFactory.eINSTANCE.createExclusiveGateway();
		GW2S ecgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		Object _localVariable_0 = csp.getValue("sf1", "conditionExpression");
		Object _localVariable_1 = csp.getValue("sf1", "id");
		boolean egw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_2 = csp.getValue("egw", "id");
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
		String sf1_conditionExpression_prime = (String) _localVariable_0;
		String sf1_id_prime = (String) _localVariable_1;
		egw.setIsDiverging(Boolean.valueOf(egw_isDiverging_prime));
		String egw_id_prime = (String) _localVariable_2;
		ecgw.setIsDiverging(Boolean.valueOf(ecgw_isDiverging_prime));
		sf1.setConditionExpression(sf1_conditionExpression_prime);
		sf1.setId(sf1_id_prime);
		egw.setId(egw_id_prime);
		return new Object[] { process, prevNode, sf1, step, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_ChoiceAfterChoice_11_2_blackBBBBBBBB(StepAlternative alt, SequenceFlow sf1,
			AlternativeFlow altFlow, ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw,
			GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { alt, sf1, altFlow, step, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_11_2_greenFBBBBBBBB(StepAlternative alt, SequenceFlow sf1,
			AlternativeFlow altFlow, ChoiceStep step, ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw,
			GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(alt);
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(altFlow);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getCreatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, alt, sf1, altFlow, step, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_ChoiceAfterChoice_11_3_blackBBBBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject alt, EObject process, EObject useCase, EObject p2uc, EObject flow, EObject cStep, EObject prevNode,
			EObject eg2cs, EObject sf1, EObject altFlow, EObject step, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		if (!alt.equals(process)) {
			if (!alt.equals(useCase)) {
				if (!alt.equals(p2uc)) {
					if (!alt.equals(flow)) {
						if (!alt.equals(cStep)) {
							if (!alt.equals(prevNode)) {
								if (!alt.equals(eg2cs)) {
									if (!alt.equals(sf1)) {
										if (!alt.equals(altFlow)) {
											if (!alt.equals(step)) {
												if (!alt.equals(egw)) {
													if (!alt.equals(egwToStep)) {
														if (!alt.equals(ecgw)) {
															if (!alt.equals(ecgwToStep)) {
																if (!process.equals(useCase)) {
																	if (!process.equals(sf1)) {
																		if (!process.equals(step)) {
																			if (!p2uc.equals(process)) {
																				if (!p2uc.equals(useCase)) {
																					if (!p2uc.equals(prevNode)) {
																						if (!p2uc.equals(sf1)) {
																							if (!p2uc.equals(step)) {
																								if (!flow.equals(
																										process)) {
																									if (!flow.equals(
																											useCase)) {
																										if (!flow
																												.equals(p2uc)) {
																											if (!flow
																													.equals(prevNode)) {
																												if (!flow
																														.equals(sf1)) {
																													if (!flow
																															.equals(step)) {
																														if (!cStep
																																.equals(process)) {
																															if (!cStep
																																	.equals(useCase)) {
																																if (!cStep
																																		.equals(p2uc)) {
																																	if (!cStep
																																			.equals(flow)) {
																																		if (!cStep
																																				.equals(prevNode)) {
																																			if (!cStep
																																					.equals(eg2cs)) {
																																				if (!cStep
																																						.equals(sf1)) {
																																					if (!cStep
																																							.equals(step)) {
																																						if (!cStep
																																								.equals(egw)) {
																																							if (!cStep
																																									.equals(egwToStep)) {
																																								if (!cStep
																																										.equals(ecgw)) {
																																									if (!cStep
																																											.equals(ecgwToStep)) {
																																										if (!prevNode
																																												.equals(process)) {
																																											if (!prevNode
																																													.equals(useCase)) {
																																												if (!prevNode
																																														.equals(sf1)) {
																																													if (!prevNode
																																															.equals(step)) {
																																														if (!eg2cs
																																																.equals(process)) {
																																															if (!eg2cs
																																																	.equals(useCase)) {
																																																if (!eg2cs
																																																		.equals(p2uc)) {
																																																	if (!eg2cs
																																																			.equals(flow)) {
																																																		if (!eg2cs
																																																				.equals(prevNode)) {
																																																			if (!eg2cs
																																																					.equals(sf1)) {
																																																				if (!eg2cs
																																																						.equals(step)) {
																																																					if (!eg2cs
																																																							.equals(egw)) {
																																																						if (!eg2cs
																																																								.equals(egwToStep)) {
																																																							if (!sf1.equals(
																																																									useCase)) {
																																																								if (!sf1.equals(
																																																										step)) {
																																																									if (!altFlow
																																																											.equals(process)) {
																																																										if (!altFlow
																																																												.equals(useCase)) {
																																																											if (!altFlow
																																																													.equals(p2uc)) {
																																																												if (!altFlow
																																																														.equals(flow)) {
																																																													if (!altFlow
																																																															.equals(cStep)) {
																																																														if (!altFlow
																																																																.equals(prevNode)) {
																																																															if (!altFlow
																																																																	.equals(eg2cs)) {
																																																																if (!altFlow
																																																																		.equals(sf1)) {
																																																																	if (!altFlow
																																																																			.equals(step)) {
																																																																		if (!altFlow
																																																																				.equals(egw)) {
																																																																			if (!altFlow
																																																																					.equals(egwToStep)) {
																																																																				if (!altFlow
																																																																						.equals(ecgw)) {
																																																																					if (!altFlow
																																																																							.equals(ecgwToStep)) {
																																																																						if (!step
																																																																								.equals(useCase)) {
																																																																							if (!egw.equals(
																																																																									process)) {
																																																																								if (!egw.equals(
																																																																										useCase)) {
																																																																									if (!egw.equals(
																																																																											p2uc)) {
																																																																										if (!egw.equals(
																																																																												flow)) {
																																																																											if (!egw.equals(
																																																																													prevNode)) {
																																																																												if (!egw.equals(
																																																																														sf1)) {
																																																																													if (!egw.equals(
																																																																															step)) {
																																																																														if (!egw.equals(
																																																																																egwToStep)) {
																																																																															if (!egwToStep
																																																																																	.equals(process)) {
																																																																																if (!egwToStep
																																																																																		.equals(useCase)) {
																																																																																	if (!egwToStep
																																																																																			.equals(p2uc)) {
																																																																																		if (!egwToStep
																																																																																				.equals(flow)) {
																																																																																			if (!egwToStep
																																																																																					.equals(prevNode)) {
																																																																																				if (!egwToStep
																																																																																						.equals(sf1)) {
																																																																																					if (!egwToStep
																																																																																							.equals(step)) {
																																																																																						if (!ecgw
																																																																																								.equals(process)) {
																																																																																							if (!ecgw
																																																																																									.equals(useCase)) {
																																																																																								if (!ecgw
																																																																																										.equals(p2uc)) {
																																																																																									if (!ecgw
																																																																																											.equals(flow)) {
																																																																																										if (!ecgw
																																																																																												.equals(prevNode)) {
																																																																																											if (!ecgw
																																																																																													.equals(eg2cs)) {
																																																																																												if (!ecgw
																																																																																														.equals(sf1)) {
																																																																																													if (!ecgw
																																																																																															.equals(step)) {
																																																																																														if (!ecgw
																																																																																																.equals(egw)) {
																																																																																															if (!ecgw
																																																																																																	.equals(egwToStep)) {
																																																																																																if (!ecgw
																																																																																																		.equals(ecgwToStep)) {
																																																																																																	if (!ecgwToStep
																																																																																																			.equals(process)) {
																																																																																																		if (!ecgwToStep
																																																																																																				.equals(useCase)) {
																																																																																																			if (!ecgwToStep
																																																																																																					.equals(p2uc)) {
																																																																																																				if (!ecgwToStep
																																																																																																						.equals(flow)) {
																																																																																																					if (!ecgwToStep
																																																																																																							.equals(prevNode)) {
																																																																																																						if (!ecgwToStep
																																																																																																								.equals(eg2cs)) {
																																																																																																							if (!ecgwToStep
																																																																																																									.equals(sf1)) {
																																																																																																								if (!ecgwToStep
																																																																																																										.equals(step)) {
																																																																																																									if (!ecgwToStep
																																																																																																											.equals(egw)) {
																																																																																																										if (!ecgwToStep
																																																																																																												.equals(egwToStep)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													alt,
																																																																																																													process,
																																																																																																													useCase,
																																																																																																													p2uc,
																																																																																																													flow,
																																																																																																													cStep,
																																																																																																													prevNode,
																																																																																																													eg2cs,
																																																																																																													sf1,
																																																																																																													altFlow,
																																																																																																													step,
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

	public static final Object[] pattern_ChoiceAfterChoice_11_3_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase, EObject cStep,
			EObject prevNode, EObject sf1, EObject altFlow, EObject step, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ChoiceAfterChoice";
		String alt__altFlow____ref_name_prime = "ref";
		String process__sf1____flowElements_name_prime = "flowElements";
		String useCase__altFlow____flows_name_prime = "flows";
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String altFlow__step____steps_name_prime = "steps";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		ruleresult.getTranslatedEdges().add(alt__altFlow____ref);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		ruleresult.getCreatedEdges().add(process__sf1____flowElements);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		ruleresult.getTranslatedEdges().add(useCase__altFlow____flows);
		cStep__alt____stepAlternatives.setSrc(cStep);
		cStep__alt____stepAlternatives.setTrg(alt);
		ruleresult.getTranslatedEdges().add(cStep__alt____stepAlternatives);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
		altFlow__step____steps.setSrc(altFlow);
		altFlow__step____steps.setTrg(step);
		ruleresult.getTranslatedEdges().add(altFlow__step____steps);
		process__egw____flowElements.setSrc(process);
		process__egw____flowElements.setTrg(egw);
		ruleresult.getCreatedEdges().add(process__egw____flowElements);
		process__ecgw____flowElements.setSrc(process);
		process__ecgw____flowElements.setTrg(ecgw);
		ruleresult.getCreatedEdges().add(process__ecgw____flowElements);
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
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, alt, process, useCase, cStep, prevNode, sf1, altFlow, step, egw, egwToStep,
				ecgw, ecgwToStep, alt__altFlow____ref, process__sf1____flowElements, useCase__altFlow____flows,
				cStep__alt____stepAlternatives, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				altFlow__step____steps, process__egw____flowElements, process__ecgw____flowElements,
				sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv, egwToStep__egw____source,
				egwToStep__step____target, ecgwToStep__ecgw____source, ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterChoice_11_5_expressionBBBBBBBBBBBBBBBBB(ChoiceAfterChoice _this,
			PerformRuleResult ruleresult, EObject alt, EObject process, EObject useCase, EObject p2uc, EObject flow,
			EObject cStep, EObject prevNode, EObject eg2cs, EObject sf1, EObject altFlow, EObject step, EObject egw,
			EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_BWD(ruleresult, alt, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, sf1, altFlow,
				step, egw, egwToStep, ecgw, ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterChoice_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_1_blackFBB(EClass eClass, ChoiceAfterChoice _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_12_1_binding = pattern_ChoiceAfterChoice_12_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterChoice_12_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_12_1_black = pattern_ChoiceAfterChoice_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterChoice_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterChoice";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_2_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("alt");
		EObject _localVariable_1 = match.getObject("useCase");
		EObject _localVariable_2 = match.getObject("flow");
		EObject _localVariable_3 = match.getObject("cStep");
		EObject _localVariable_4 = match.getObject("altFlow");
		EObject _localVariable_5 = match.getObject("step");
		EObject tmpAlt = _localVariable_0;
		EObject tmpUseCase = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		EObject tmpCStep = _localVariable_3;
		EObject tmpAltFlow = _localVariable_4;
		EObject tmpStep = _localVariable_5;
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			if (tmpUseCase instanceof UseCase) {
				UseCase useCase = (UseCase) tmpUseCase;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					if (tmpCStep instanceof ChoiceStep) {
						ChoiceStep cStep = (ChoiceStep) tmpCStep;
						if (tmpAltFlow instanceof AlternativeFlow) {
							AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
							if (tmpStep instanceof ChoiceStep) {
								ChoiceStep step = (ChoiceStep) tmpStep;
								return new Object[] { alt, useCase, flow, cStep, altFlow, step, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_12_2_blackBFBFBBFFBBB(StepAlternative alt,
			UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow, ChoiceStep step, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cStep.equals(step)) {
			if (!altFlow.equals(flow)) {
				for (P2UC p2uc : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(useCase, P2UC.class,
						"target")) {
					de.abilov.bpmn.Process process = p2uc.getSource();
					if (process != null) {
						for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cStep,
								GW2S.class, "target")) {
							Gateway tmpPrevNode = eg2cs.getSource();
							if (tmpPrevNode instanceof ExclusiveGateway) {
								ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
								boolean prevNodeisDiverging = prevNode.isIsDiverging();
								if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
									_result.add(new Object[] { alt, process, useCase, p2uc, flow, cStep, prevNode,
											eg2cs, altFlow, step, match });
								}

							}

						}
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_12_3_blackBBBBBBBBBB(StepAlternative alt,
			de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow, ChoiceStep cStep,
			ExclusiveGateway prevNode, GW2S eg2cs, AlternativeFlow altFlow, ChoiceStep step) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cStep.equals(step)) {
			if (!altFlow.equals(flow)) {
				if (altFlow.equals(alt.getRef())) {
					if (process.getFlowElements().contains(prevNode)) {
						if (useCase.getFlows().contains(flow)) {
							if (useCase.getFlows().contains(altFlow)) {
								if (process.equals(p2uc.getSource())) {
									if (useCase.equals(p2uc.getTarget())) {
										if (flow.getSteps().contains(cStep)) {
											if (cStep.getStepAlternatives().contains(alt)) {
												if (prevNode.equals(eg2cs.getSource())) {
													if (cStep.equals(eg2cs.getTarget())) {
														if (altFlow.getSteps().contains(step)) {
															boolean prevNodeisDiverging = prevNode.isIsDiverging();
															if (Boolean.valueOf(prevNodeisDiverging)
																	.equals(Boolean.valueOf(true))) {
																_result.add(new Object[] { alt, process, useCase, p2uc,
																		flow, cStep, prevNode, eg2cs, altFlow, step });
															}

														}
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterChoice_12_3_greenBBBBBBBBBBFFFFFFFFFFFF(StepAlternative alt,
			de.abilov.bpmn.Process process, UseCase useCase, P2UC p2uc, Flow flow, ChoiceStep cStep,
			ExclusiveGateway prevNode, GW2S eg2cs, AlternativeFlow altFlow, ChoiceStep step) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge alt__altFlow____ref = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__flow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge useCase__altFlow____flows = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__process____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2uc__useCase____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__cStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cStep__alt____stepAlternatives = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__cStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge altFlow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String alt__altFlow____ref_name_prime = "ref";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String useCase__flow____flows_name_prime = "flows";
		String useCase__altFlow____flows_name_prime = "flows";
		String p2uc__process____source_name_prime = "source";
		String p2uc__useCase____target_name_prime = "target";
		String flow__cStep____steps_name_prime = "steps";
		String cStep__alt____stepAlternatives_name_prime = "stepAlternatives";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__cStep____target_name_prime = "target";
		String altFlow__step____steps_name_prime = "steps";
		isApplicableMatch.getAllContextElements().add(alt);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(cStep);
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(altFlow);
		isApplicableMatch.getAllContextElements().add(step);
		alt__altFlow____ref.setSrc(alt);
		alt__altFlow____ref.setTrg(altFlow);
		isApplicableMatch.getAllContextElements().add(alt__altFlow____ref);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		useCase__flow____flows.setSrc(useCase);
		useCase__flow____flows.setTrg(flow);
		isApplicableMatch.getAllContextElements().add(useCase__flow____flows);
		useCase__altFlow____flows.setSrc(useCase);
		useCase__altFlow____flows.setTrg(altFlow);
		isApplicableMatch.getAllContextElements().add(useCase__altFlow____flows);
		p2uc__process____source.setSrc(p2uc);
		p2uc__process____source.setTrg(process);
		isApplicableMatch.getAllContextElements().add(p2uc__process____source);
		p2uc__useCase____target.setSrc(p2uc);
		p2uc__useCase____target.setTrg(useCase);
		isApplicableMatch.getAllContextElements().add(p2uc__useCase____target);
		flow__cStep____steps.setSrc(flow);
		flow__cStep____steps.setTrg(cStep);
		isApplicableMatch.getAllContextElements().add(flow__cStep____steps);
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
		alt__altFlow____ref.setName(alt__altFlow____ref_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		useCase__flow____flows.setName(useCase__flow____flows_name_prime);
		useCase__altFlow____flows.setName(useCase__altFlow____flows_name_prime);
		p2uc__process____source.setName(p2uc__process____source_name_prime);
		p2uc__useCase____target.setName(p2uc__useCase____target_name_prime);
		flow__cStep____steps.setName(flow__cStep____steps_name_prime);
		cStep__alt____stepAlternatives.setName(cStep__alt____stepAlternatives_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__cStep____target.setName(eg2cs__cStep____target_name_prime);
		altFlow__step____steps.setName(altFlow__step____steps_name_prime);
		return new Object[] { alt, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, altFlow, step,
				isApplicableMatch, alt__altFlow____ref, process__prevNode____flowElements, useCase__flow____flows,
				useCase__altFlow____flows, p2uc__process____source, p2uc__useCase____target, flow__cStep____steps,
				cStep__alt____stepAlternatives, eg2cs__prevNode____source, eg2cs__cStep____target,
				altFlow__step____steps };
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_4_bindingFBBBBBBBBBBBB(ChoiceAfterChoice _this,
			IsApplicableMatch isApplicableMatch, StepAlternative alt, de.abilov.bpmn.Process process, UseCase useCase,
			P2UC p2uc, Flow flow, ChoiceStep cStep, ExclusiveGateway prevNode, GW2S eg2cs, AlternativeFlow altFlow,
			ChoiceStep step) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, alt, process, useCase, p2uc, flow,
				cStep, prevNode, eg2cs, altFlow, step);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, alt, process, useCase, p2uc, flow, cStep, prevNode,
					eg2cs, altFlow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_4_bindingAndBlackFBBBBBBBBBBBB(ChoiceAfterChoice _this,
			IsApplicableMatch isApplicableMatch, StepAlternative alt, de.abilov.bpmn.Process process, UseCase useCase,
			P2UC p2uc, Flow flow, ChoiceStep cStep, ExclusiveGateway prevNode, GW2S eg2cs, AlternativeFlow altFlow,
			ChoiceStep step) {
		Object[] result_pattern_ChoiceAfterChoice_12_4_binding = pattern_ChoiceAfterChoice_12_4_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, alt, process, useCase, p2uc, flow, cStep, prevNode, eg2cs, altFlow, step);
		if (result_pattern_ChoiceAfterChoice_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterChoice_12_4_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_12_4_black = pattern_ChoiceAfterChoice_12_4_blackB(csp);
			if (result_pattern_ChoiceAfterChoice_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, alt, process, useCase, p2uc, flow, cStep, prevNode,
						eg2cs, altFlow, step };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterChoice_12_5_expressionFBB(ChoiceAfterChoice _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterChoice_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterChoice";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterChoice_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_20_1_binding = pattern_ChoiceAfterChoice_20_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_20_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_20_1_black = pattern_ChoiceAfterChoice_20_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_2_black_nac_0BBB(StepAlternative alt, ChoiceStep cStep,
			ChoiceStep step) {
		if (!cStep.equals(step)) {
			for (ChoiceStep __DEC_alt_stepAlternatives_149436 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
				if (!cStep.equals(__DEC_alt_stepAlternatives_149436)) {
					if (!step.equals(__DEC_alt_stepAlternatives_149436)) {
						return new Object[] { alt, cStep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_2_black_nac_1BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_716303 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_716303)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_2_black_nac_2BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_676716 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_676716)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_2_black_nac_3BBB(ChoiceStep step, Flow flow,
			AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_647730 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!flow.equals(__DEC_step_steps_647730)) {
					if (!altFlow.equals(__DEC_step_steps_647730)) {
						return new Object[] { step, flow, altFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_2_black_nac_4BB(ChoiceStep step, ChoiceStep cStep) {
		if (!cStep.equals(step)) {
			for (Step __DEC_step_next_314635 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_314635)) {
					if (!cStep.equals(__DEC_step_next_314635)) {
						return new Object[] { step, cStep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_2_black_nac_5BB(ChoiceStep step, StepAlternative alt) {
		if (step.getStepAlternatives().contains(alt)) {
			return new Object[] { step, alt };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_2_black_nac_6BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_2_black_nac_7BB(ChoiceStep cStep, ChoiceStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_20_2_blackFFFFFFB(EMoflonEdge _edge_ref) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlt = _edge_ref.getSrc();
		if (tmpAlt instanceof StepAlternative) {
			StepAlternative alt = (StepAlternative) tmpAlt;
			EObject tmpAltFlow = _edge_ref.getTrg();
			if (tmpAltFlow instanceof AlternativeFlow) {
				AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
				if (altFlow.equals(alt.getRef())) {
					if (pattern_ChoiceAfterChoice_20_2_black_nac_1BB(altFlow, alt) == null) {
						for (Step tmpStep : altFlow.getSteps()) {
							if (tmpStep instanceof ChoiceStep) {
								ChoiceStep step = (ChoiceStep) tmpStep;
								if (pattern_ChoiceAfterChoice_20_2_black_nac_5BB(step, alt) == null) {
									for (ChoiceStep cStep : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
										if (!cStep.equals(step)) {
											if (pattern_ChoiceAfterChoice_20_2_black_nac_0BBB(alt, cStep,
													step) == null) {
												if (pattern_ChoiceAfterChoice_20_2_black_nac_4BB(step, cStep) == null) {
													if (pattern_ChoiceAfterChoice_20_2_black_nac_7BB(cStep,
															step) == null) {
														for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(altFlow, UseCase.class,
																		"flows")) {
															if (pattern_ChoiceAfterChoice_20_2_black_nac_2BB(altFlow,
																	useCase) == null) {
																for (Flow flow : useCase.getFlows()) {
																	if (!altFlow.equals(flow)) {
																		if (flow.getSteps().contains(cStep)) {
																			if (pattern_ChoiceAfterChoice_20_2_black_nac_3BBB(
																					step, flow, altFlow) == null) {
																				if (pattern_ChoiceAfterChoice_20_2_black_nac_6BB(
																						flow, step) == null) {
																					_result.add(new Object[] { alt,
																							useCase, flow, cStep,
																							altFlow, step, _edge_ref });
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterChoice_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_20_3_expressionFBBBBBBBB(ChoiceAfterChoice _this, Match match,
			StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ChoiceStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_20_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_21_1_binding = pattern_ChoiceAfterChoice_21_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_21_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_21_1_black = pattern_ChoiceAfterChoice_21_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_236297 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_236297)) {
							if (!egw.equals(__DEC_sf1_default_236297)) {
								if (!ecgw.equals(__DEC_sf1_default_236297)) {
									return new Object[] { sf1, prevNode, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_71243 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_71243)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_739004 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_739004)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_218457 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_218457)) {
							if (!prevNode.equals(__DEC_egw___conv_218457)) {
								if (!ecgw.equals(__DEC_egw___conv_218457)) {
									return new Object[] { egw, prevNode, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_480730 = ecgw.get__conv();
					if (__DEC_ecgw___conv_480730 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_480730)) {
							if (!prevNode.equals(__DEC_ecgw___conv_480730)) {
								if (!egw.equals(__DEC_ecgw___conv_480730)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_537544 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_537544)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_954908 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_954908)) {
							if (!prevNode.equals(__DEC_ecgw___conv_954908)) {
								if (!egw.equals(__DEC_ecgw___conv_954908)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_21_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
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
																	if (pattern_ChoiceAfterChoice_21_2_black_nac_1BB(
																			sf1, process) == null) {
																		if (pattern_ChoiceAfterChoice_21_2_black_nac_7BB(
																				prevNode, sf1) == null) {
																			if (pattern_ChoiceAfterChoice_21_2_black_nac_2BB(
																					egw, process) == null) {
																				if (pattern_ChoiceAfterChoice_21_2_black_nac_8BB(
																						egw, sf1) == null) {
																					if (pattern_ChoiceAfterChoice_21_2_black_nac_10BB(
																							prevNode, egw) == null) {
																						if (pattern_ChoiceAfterChoice_21_2_black_nac_0BBBB(
																								sf1, prevNode, egw,
																								ecgw) == null) {
																							if (pattern_ChoiceAfterChoice_21_2_black_nac_3BBB(
																									egw, prevNode,
																									ecgw) == null) {
																								if (pattern_ChoiceAfterChoice_21_2_black_nac_4BBB(
																										ecgw, prevNode,
																										egw) == null) {
																									if (pattern_ChoiceAfterChoice_21_2_black_nac_5BB(
																											ecgw,
																											process) == null) {
																										if (pattern_ChoiceAfterChoice_21_2_black_nac_6BBB(
																												ecgw,
																												prevNode,
																												egw) == null) {
																											if (pattern_ChoiceAfterChoice_21_2_black_nac_9BB(
																													ecgw,
																													sf1) == null) {
																												if (pattern_ChoiceAfterChoice_21_2_black_nac_11BB(
																														ecgw,
																														prevNode) == null) {
																													_result.add(
																															new Object[] {
																																	process,
																																	prevNode,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_21_3_expressionFBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_21_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_22_1_binding = pattern_ChoiceAfterChoice_22_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_22_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_22_1_black = pattern_ChoiceAfterChoice_22_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_2_black_nac_0BBB(StepAlternative alt, ChoiceStep cStep,
			ChoiceStep step) {
		if (!cStep.equals(step)) {
			for (ChoiceStep __DEC_alt_stepAlternatives_734445 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
				if (!cStep.equals(__DEC_alt_stepAlternatives_734445)) {
					if (!step.equals(__DEC_alt_stepAlternatives_734445)) {
						return new Object[] { alt, cStep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_2_black_nac_1BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_408038 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_408038)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_2_black_nac_2BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_913594 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_913594)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_2_black_nac_3BBB(ChoiceStep step, Flow flow,
			AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_653170 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!flow.equals(__DEC_step_steps_653170)) {
					if (!altFlow.equals(__DEC_step_steps_653170)) {
						return new Object[] { step, flow, altFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_2_black_nac_4BB(ChoiceStep step, ChoiceStep cStep) {
		if (!cStep.equals(step)) {
			for (Step __DEC_step_next_307509 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_307509)) {
					if (!cStep.equals(__DEC_step_next_307509)) {
						return new Object[] { step, cStep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_2_black_nac_5BB(ChoiceStep step, StepAlternative alt) {
		if (step.getStepAlternatives().contains(alt)) {
			return new Object[] { step, alt };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_2_black_nac_6BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_2_black_nac_7BB(ChoiceStep cStep, ChoiceStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_22_2_blackFFFFFFB(EMoflonEdge _edge_flows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUseCase = _edge_flows.getSrc();
		if (tmpUseCase instanceof UseCase) {
			UseCase useCase = (UseCase) tmpUseCase;
			EObject tmpAltFlow = _edge_flows.getTrg();
			if (tmpAltFlow instanceof AlternativeFlow) {
				AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
				if (useCase.getFlows().contains(altFlow)) {
					if (pattern_ChoiceAfterChoice_22_2_black_nac_2BB(altFlow, useCase) == null) {
						for (Flow flow : useCase.getFlows()) {
							if (!altFlow.equals(flow)) {
								for (Step tmpStep : altFlow.getSteps()) {
									if (tmpStep instanceof ChoiceStep) {
										ChoiceStep step = (ChoiceStep) tmpStep;
										if (pattern_ChoiceAfterChoice_22_2_black_nac_3BBB(step, flow,
												altFlow) == null) {
											if (pattern_ChoiceAfterChoice_22_2_black_nac_6BB(flow, step) == null) {
												for (Step tmpCStep : flow.getSteps()) {
													if (tmpCStep instanceof ChoiceStep) {
														ChoiceStep cStep = (ChoiceStep) tmpCStep;
														if (!cStep.equals(step)) {
															if (pattern_ChoiceAfterChoice_22_2_black_nac_4BB(step,
																	cStep) == null) {
																if (pattern_ChoiceAfterChoice_22_2_black_nac_7BB(cStep,
																		step) == null) {
																	for (StepAlternative alt : cStep
																			.getStepAlternatives()) {
																		if (altFlow.equals(alt.getRef())) {
																			if (pattern_ChoiceAfterChoice_22_2_black_nac_0BBB(
																					alt, cStep, step) == null) {
																				if (pattern_ChoiceAfterChoice_22_2_black_nac_1BB(
																						altFlow, alt) == null) {
																					if (pattern_ChoiceAfterChoice_22_2_black_nac_5BB(
																							step, alt) == null) {
																						_result.add(new Object[] { alt,
																								useCase, flow, cStep,
																								altFlow, step,
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
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_22_3_expressionFBBBBBBBB(ChoiceAfterChoice _this, Match match,
			StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ChoiceStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_22_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_23_1_binding = pattern_ChoiceAfterChoice_23_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_23_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_23_1_black = pattern_ChoiceAfterChoice_23_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_2_black_nac_0BBB(StepAlternative alt, ChoiceStep cStep,
			ChoiceStep step) {
		if (!cStep.equals(step)) {
			for (ChoiceStep __DEC_alt_stepAlternatives_351270 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
				if (!cStep.equals(__DEC_alt_stepAlternatives_351270)) {
					if (!step.equals(__DEC_alt_stepAlternatives_351270)) {
						return new Object[] { alt, cStep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_2_black_nac_1BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_541062 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_541062)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_2_black_nac_2BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_565592 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_565592)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_2_black_nac_3BBB(ChoiceStep step, Flow flow,
			AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_541534 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!flow.equals(__DEC_step_steps_541534)) {
					if (!altFlow.equals(__DEC_step_steps_541534)) {
						return new Object[] { step, flow, altFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_2_black_nac_4BB(ChoiceStep step, ChoiceStep cStep) {
		if (!cStep.equals(step)) {
			for (Step __DEC_step_next_174260 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_174260)) {
					if (!cStep.equals(__DEC_step_next_174260)) {
						return new Object[] { step, cStep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_2_black_nac_5BB(ChoiceStep step, StepAlternative alt) {
		if (step.getStepAlternatives().contains(alt)) {
			return new Object[] { step, alt };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_2_black_nac_6BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_2_black_nac_7BB(ChoiceStep cStep, ChoiceStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_23_2_blackFFFFFFB(
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
						if (pattern_ChoiceAfterChoice_23_2_black_nac_1BB(altFlow, alt) == null) {
							for (Step tmpStep : altFlow.getSteps()) {
								if (tmpStep instanceof ChoiceStep) {
									ChoiceStep step = (ChoiceStep) tmpStep;
									if (!cStep.equals(step)) {
										if (pattern_ChoiceAfterChoice_23_2_black_nac_0BBB(alt, cStep, step) == null) {
											if (pattern_ChoiceAfterChoice_23_2_black_nac_4BB(step, cStep) == null) {
												if (pattern_ChoiceAfterChoice_23_2_black_nac_5BB(step, alt) == null) {
													if (pattern_ChoiceAfterChoice_23_2_black_nac_7BB(cStep,
															step) == null) {
														for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(cStep, Flow.class,
																		"steps")) {
															if (!altFlow.equals(flow)) {
																if (pattern_ChoiceAfterChoice_23_2_black_nac_3BBB(step,
																		flow, altFlow) == null) {
																	if (pattern_ChoiceAfterChoice_23_2_black_nac_6BB(
																			flow, step) == null) {
																		for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(altFlow,
																						UseCase.class, "flows")) {
																			if (useCase.getFlows().contains(flow)) {
																				if (pattern_ChoiceAfterChoice_23_2_black_nac_2BB(
																						altFlow, useCase) == null) {
																					_result.add(new Object[] { alt,
																							useCase, flow, cStep,
																							altFlow, step,
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
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_23_3_expressionFBBBBBBBB(ChoiceAfterChoice _this, Match match,
			StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ChoiceStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_23_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_24_1_binding = pattern_ChoiceAfterChoice_24_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_24_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_24_1_black = pattern_ChoiceAfterChoice_24_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_156458 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_156458)) {
							if (!egw.equals(__DEC_sf1_default_156458)) {
								if (!ecgw.equals(__DEC_sf1_default_156458)) {
									return new Object[] { sf1, prevNode, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_877496 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_877496)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_619650 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_619650)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_481211 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_481211)) {
							if (!prevNode.equals(__DEC_egw___conv_481211)) {
								if (!ecgw.equals(__DEC_egw___conv_481211)) {
									return new Object[] { egw, prevNode, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_111167 = ecgw.get__conv();
					if (__DEC_ecgw___conv_111167 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_111167)) {
							if (!prevNode.equals(__DEC_ecgw___conv_111167)) {
								if (!egw.equals(__DEC_ecgw___conv_111167)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_816407 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_816407)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_829172 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_829172)) {
							if (!prevNode.equals(__DEC_ecgw___conv_829172)) {
								if (!egw.equals(__DEC_ecgw___conv_829172)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_24_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
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
							if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
								Gateway tmpEcgw = egw.get__conv();
								if (tmpEcgw instanceof ExclusiveGateway) {
									ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
									if (!ecgw.equals(prevNode)) {
										if (!ecgw.equals(egw)) {
											boolean egwisDiverging = egw.isIsDiverging();
											if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
												boolean ecgwisDiverging = ecgw.isIsDiverging();
												if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
													if (pattern_ChoiceAfterChoice_24_2_black_nac_7BB(prevNode,
															sf1) == null) {
														if (pattern_ChoiceAfterChoice_24_2_black_nac_8BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoice_24_2_black_nac_10BB(prevNode,
																	egw) == null) {
																if (pattern_ChoiceAfterChoice_24_2_black_nac_0BBBB(sf1,
																		prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterChoice_24_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoice_24_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoice_24_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoice_24_2_black_nac_9BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterChoice_24_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
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
																										if (pattern_ChoiceAfterChoice_24_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoice_24_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoice_24_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	process,
																																	prevNode,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_24_3_expressionFBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_24_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_25_1_binding = pattern_ChoiceAfterChoice_25_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_25_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_25_1_black = pattern_ChoiceAfterChoice_25_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_768138 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_768138)) {
							if (!egw.equals(__DEC_sf1_default_768138)) {
								if (!ecgw.equals(__DEC_sf1_default_768138)) {
									return new Object[] { sf1, prevNode, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_661627 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_661627)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_158450 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_158450)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_784497 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_784497)) {
							if (!prevNode.equals(__DEC_egw___conv_784497)) {
								if (!ecgw.equals(__DEC_egw___conv_784497)) {
									return new Object[] { egw, prevNode, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_639988 = ecgw.get__conv();
					if (__DEC_ecgw___conv_639988 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_639988)) {
							if (!prevNode.equals(__DEC_ecgw___conv_639988)) {
								if (!egw.equals(__DEC_ecgw___conv_639988)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_282797 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_282797)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_811899 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_811899)) {
							if (!prevNode.equals(__DEC_ecgw___conv_811899)) {
								if (!egw.equals(__DEC_ecgw___conv_811899)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_25_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
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
													if (pattern_ChoiceAfterChoice_25_2_black_nac_7BB(prevNode,
															sf1) == null) {
														if (pattern_ChoiceAfterChoice_25_2_black_nac_8BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoice_25_2_black_nac_10BB(prevNode,
																	egw) == null) {
																if (pattern_ChoiceAfterChoice_25_2_black_nac_0BBBB(sf1,
																		prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterChoice_25_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoice_25_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoice_25_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoice_25_2_black_nac_9BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterChoice_25_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
																						for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										prevNode,
																										de.abilov.bpmn.Process.class,
																										"flowElements")) {
																							if (process
																									.getFlowElements()
																									.contains(sf1)) {
																								if (process
																										.getFlowElements()
																										.contains(
																												egw)) {
																									if (process
																											.getFlowElements()
																											.contains(
																													ecgw)) {
																										if (pattern_ChoiceAfterChoice_25_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoice_25_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoice_25_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	process,
																																	prevNode,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_25_3_expressionFBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_25_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_26_1_binding = pattern_ChoiceAfterChoice_26_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_26_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_26_1_black = pattern_ChoiceAfterChoice_26_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_2_black_nac_0BBB(StepAlternative alt, ChoiceStep cStep,
			ChoiceStep step) {
		if (!cStep.equals(step)) {
			for (ChoiceStep __DEC_alt_stepAlternatives_293802 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(alt, ChoiceStep.class, "stepAlternatives")) {
				if (!cStep.equals(__DEC_alt_stepAlternatives_293802)) {
					if (!step.equals(__DEC_alt_stepAlternatives_293802)) {
						return new Object[] { alt, cStep, step };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_2_black_nac_1BB(AlternativeFlow altFlow,
			StepAlternative alt) {
		for (StepAlternative __DEC_altFlow_ref_733847 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
			if (!alt.equals(__DEC_altFlow_ref_733847)) {
				return new Object[] { altFlow, alt };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_2_black_nac_2BB(AlternativeFlow altFlow,
			UseCase useCase) {
		for (UseCase __DEC_altFlow_flows_701242 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
			if (!useCase.equals(__DEC_altFlow_flows_701242)) {
				return new Object[] { altFlow, useCase };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_2_black_nac_3BBB(ChoiceStep step, Flow flow,
			AlternativeFlow altFlow) {
		if (!altFlow.equals(flow)) {
			for (Flow __DEC_step_steps_169586 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Flow.class, "steps")) {
				if (!flow.equals(__DEC_step_steps_169586)) {
					if (!altFlow.equals(__DEC_step_steps_169586)) {
						return new Object[] { step, flow, altFlow };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_2_black_nac_4BB(ChoiceStep step, ChoiceStep cStep) {
		if (!cStep.equals(step)) {
			for (Step __DEC_step_next_199147 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_199147)) {
					if (!cStep.equals(__DEC_step_next_199147)) {
						return new Object[] { step, cStep };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_2_black_nac_5BB(ChoiceStep step, StepAlternative alt) {
		if (step.getStepAlternatives().contains(alt)) {
			return new Object[] { step, alt };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_2_black_nac_6BB(Flow flow, ChoiceStep step) {
		if (flow.getSteps().contains(step)) {
			return new Object[] { flow, step };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_2_black_nac_7BB(ChoiceStep cStep, ChoiceStep step) {
		if (step.equals(cStep.getNext())) {
			return new Object[] { cStep, step };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_26_2_blackFFFFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAltFlow = _edge_steps.getSrc();
		if (tmpAltFlow instanceof AlternativeFlow) {
			AlternativeFlow altFlow = (AlternativeFlow) tmpAltFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ChoiceStep) {
				ChoiceStep step = (ChoiceStep) tmpStep;
				if (altFlow.getSteps().contains(step)) {
					for (StepAlternative alt : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(altFlow, StepAlternative.class, "ref")) {
						if (pattern_ChoiceAfterChoice_26_2_black_nac_1BB(altFlow, alt) == null) {
							if (pattern_ChoiceAfterChoice_26_2_black_nac_5BB(step, alt) == null) {
								for (UseCase useCase : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(altFlow, UseCase.class, "flows")) {
									if (pattern_ChoiceAfterChoice_26_2_black_nac_2BB(altFlow, useCase) == null) {
										for (Flow flow : useCase.getFlows()) {
											if (!altFlow.equals(flow)) {
												if (pattern_ChoiceAfterChoice_26_2_black_nac_3BBB(step, flow,
														altFlow) == null) {
													if (pattern_ChoiceAfterChoice_26_2_black_nac_6BB(flow,
															step) == null) {
														for (Step tmpCStep : flow.getSteps()) {
															if (tmpCStep instanceof ChoiceStep) {
																ChoiceStep cStep = (ChoiceStep) tmpCStep;
																if (!cStep.equals(step)) {
																	if (cStep.getStepAlternatives().contains(alt)) {
																		if (pattern_ChoiceAfterChoice_26_2_black_nac_0BBB(
																				alt, cStep, step) == null) {
																			if (pattern_ChoiceAfterChoice_26_2_black_nac_4BB(
																					step, cStep) == null) {
																				if (pattern_ChoiceAfterChoice_26_2_black_nac_7BB(
																						cStep, step) == null) {
																					_result.add(new Object[] { alt,
																							useCase, flow, cStep,
																							altFlow, step,
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
			}

		}

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_26_3_expressionFBBBBBBBB(ChoiceAfterChoice _this, Match match,
			StepAlternative alt, UseCase useCase, Flow flow, ChoiceStep cStep, AlternativeFlow altFlow,
			ChoiceStep step) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, alt, useCase, flow, cStep, altFlow, step);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_26_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_27_1_binding = pattern_ChoiceAfterChoice_27_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_27_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_27_1_black = pattern_ChoiceAfterChoice_27_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_786500 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_786500)) {
							if (!egw.equals(__DEC_sf1_default_786500)) {
								if (!ecgw.equals(__DEC_sf1_default_786500)) {
									return new Object[] { sf1, prevNode, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_618559 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_618559)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_235302 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_235302)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_934650 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_934650)) {
							if (!prevNode.equals(__DEC_egw___conv_934650)) {
								if (!ecgw.equals(__DEC_egw___conv_934650)) {
									return new Object[] { egw, prevNode, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_363692 = ecgw.get__conv();
					if (__DEC_ecgw___conv_363692 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_363692)) {
							if (!prevNode.equals(__DEC_ecgw___conv_363692)) {
								if (!egw.equals(__DEC_ecgw___conv_363692)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_901553 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_901553)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_624094 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_624094)) {
							if (!prevNode.equals(__DEC_ecgw___conv_624094)) {
								if (!egw.equals(__DEC_ecgw___conv_624094)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_27_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
										if (pattern_ChoiceAfterChoice_27_2_black_nac_2BB(egw, process) == null) {
											if (pattern_ChoiceAfterChoice_27_2_black_nac_5BB(ecgw, process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof ExclusiveGateway) {
														ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
														if (!egw.equals(prevNode)) {
															if (!ecgw.equals(prevNode)) {
																boolean prevNodeisDiverging = prevNode.isIsDiverging();
																if (Boolean.valueOf(prevNodeisDiverging)
																		.equals(Boolean.valueOf(true))) {
																	if (pattern_ChoiceAfterChoice_27_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoice_27_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoice_27_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoice_27_2_black_nac_10BB(
																						prevNode, egw) == null) {
																					if (pattern_ChoiceAfterChoice_27_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
																						for (FlowElement tmpSf1 : process
																								.getFlowElements()) {
																							if (tmpSf1 instanceof SequenceFlow) {
																								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																								if (prevNode.equals(sf1
																										.getSourceRef())) {
																									if (egw.equals(sf1
																											.getTargetRef())) {
																										if (pattern_ChoiceAfterChoice_27_2_black_nac_0BBBB(
																												sf1,
																												prevNode,
																												egw,
																												ecgw) == null) {
																											if (pattern_ChoiceAfterChoice_27_2_black_nac_1BB(
																													sf1,
																													process) == null) {
																												if (pattern_ChoiceAfterChoice_27_2_black_nac_7BB(
																														prevNode,
																														sf1) == null) {
																													if (pattern_ChoiceAfterChoice_27_2_black_nac_8BB(
																															egw,
																															sf1) == null) {
																														if (pattern_ChoiceAfterChoice_27_2_black_nac_9BB(
																																ecgw,
																																sf1) == null) {
																															_result.add(
																																	new Object[] {
																																			process,
																																			prevNode,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_27_3_expressionFBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_27_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_28_1_binding = pattern_ChoiceAfterChoice_28_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_28_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_28_1_black = pattern_ChoiceAfterChoice_28_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_993686 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_993686)) {
							if (!egw.equals(__DEC_sf1_default_993686)) {
								if (!ecgw.equals(__DEC_sf1_default_993686)) {
									return new Object[] { sf1, prevNode, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_128833 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_128833)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_352465 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_352465)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_412302 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_412302)) {
							if (!prevNode.equals(__DEC_egw___conv_412302)) {
								if (!ecgw.equals(__DEC_egw___conv_412302)) {
									return new Object[] { egw, prevNode, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_973594 = ecgw.get__conv();
					if (__DEC_ecgw___conv_973594 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_973594)) {
							if (!prevNode.equals(__DEC_ecgw___conv_973594)) {
								if (!egw.equals(__DEC_ecgw___conv_973594)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_170446 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_170446)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_40738 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_40738)) {
							if (!prevNode.equals(__DEC_ecgw___conv_40738)) {
								if (!egw.equals(__DEC_ecgw___conv_40738)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_28_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
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
						if (pattern_ChoiceAfterChoice_28_2_black_nac_5BB(ecgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof ExclusiveGateway) {
									ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
									if (!ecgw.equals(prevNode)) {
										boolean prevNodeisDiverging = prevNode.isIsDiverging();
										if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
											if (pattern_ChoiceAfterChoice_28_2_black_nac_11BB(ecgw, prevNode) == null) {
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
																					if (pattern_ChoiceAfterChoice_28_2_black_nac_1BB(
																							sf1, process) == null) {
																						if (pattern_ChoiceAfterChoice_28_2_black_nac_7BB(
																								prevNode,
																								sf1) == null) {
																							if (pattern_ChoiceAfterChoice_28_2_black_nac_9BB(
																									ecgw,
																									sf1) == null) {
																								if (pattern_ChoiceAfterChoice_28_2_black_nac_0BBBB(
																										sf1, prevNode,
																										egw,
																										ecgw) == null) {
																									if (pattern_ChoiceAfterChoice_28_2_black_nac_2BB(
																											egw,
																											process) == null) {
																										if (pattern_ChoiceAfterChoice_28_2_black_nac_3BBB(
																												egw,
																												prevNode,
																												ecgw) == null) {
																											if (pattern_ChoiceAfterChoice_28_2_black_nac_4BBB(
																													ecgw,
																													prevNode,
																													egw) == null) {
																												if (pattern_ChoiceAfterChoice_28_2_black_nac_6BBB(
																														ecgw,
																														prevNode,
																														egw) == null) {
																													if (pattern_ChoiceAfterChoice_28_2_black_nac_8BB(
																															egw,
																															sf1) == null) {
																														if (pattern_ChoiceAfterChoice_28_2_black_nac_10BB(
																																prevNode,
																																egw) == null) {
																															_result.add(
																																	new Object[] {
																																			process,
																																			prevNode,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_28_3_expressionFBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_28_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_29_1_binding = pattern_ChoiceAfterChoice_29_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_29_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_29_1_black = pattern_ChoiceAfterChoice_29_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_470433 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_470433)) {
							if (!egw.equals(__DEC_sf1_default_470433)) {
								if (!ecgw.equals(__DEC_sf1_default_470433)) {
									return new Object[] { sf1, prevNode, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_375163 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_375163)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_830521 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_830521)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_577193 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_577193)) {
							if (!prevNode.equals(__DEC_egw___conv_577193)) {
								if (!ecgw.equals(__DEC_egw___conv_577193)) {
									return new Object[] { egw, prevNode, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_350440 = ecgw.get__conv();
					if (__DEC_ecgw___conv_350440 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_350440)) {
							if (!prevNode.equals(__DEC_ecgw___conv_350440)) {
								if (!egw.equals(__DEC_ecgw___conv_350440)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_874228 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_874228)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_680075 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_680075)) {
							if (!prevNode.equals(__DEC_ecgw___conv_680075)) {
								if (!egw.equals(__DEC_ecgw___conv_680075)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_29_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
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
											if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
												boolean ecgwisDiverging = ecgw.isIsDiverging();
												if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
													if (pattern_ChoiceAfterChoice_29_2_black_nac_8BB(egw,
															sf1) == null) {
														if (pattern_ChoiceAfterChoice_29_2_black_nac_7BB(prevNode,
																sf1) == null) {
															if (pattern_ChoiceAfterChoice_29_2_black_nac_10BB(prevNode,
																	egw) == null) {
																if (pattern_ChoiceAfterChoice_29_2_black_nac_0BBBB(sf1,
																		prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterChoice_29_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoice_29_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoice_29_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoice_29_2_black_nac_9BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterChoice_29_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
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
																										if (pattern_ChoiceAfterChoice_29_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoice_29_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoice_29_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	process,
																																	prevNode,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_29_3_expressionFBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_29_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_30_1_binding = pattern_ChoiceAfterChoice_30_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_30_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_30_1_black = pattern_ChoiceAfterChoice_30_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_642198 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_642198)) {
							if (!egw.equals(__DEC_sf1_default_642198)) {
								if (!ecgw.equals(__DEC_sf1_default_642198)) {
									return new Object[] { sf1, prevNode, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_18677 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_18677)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_353959 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_353959)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_773505 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_773505)) {
							if (!prevNode.equals(__DEC_egw___conv_773505)) {
								if (!ecgw.equals(__DEC_egw___conv_773505)) {
									return new Object[] { egw, prevNode, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_541263 = ecgw.get__conv();
					if (__DEC_ecgw___conv_541263 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_541263)) {
							if (!prevNode.equals(__DEC_ecgw___conv_541263)) {
								if (!egw.equals(__DEC_ecgw___conv_541263)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_726824 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_726824)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_589008 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_589008)) {
							if (!prevNode.equals(__DEC_ecgw___conv_589008)) {
								if (!egw.equals(__DEC_ecgw___conv_589008)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_30_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
												if (Boolean.valueOf(prevNodeisDiverging)
														.equals(Boolean.valueOf(true))) {
													if (pattern_ChoiceAfterChoice_30_2_black_nac_8BB(egw,
															sf1) == null) {
														if (pattern_ChoiceAfterChoice_30_2_black_nac_9BB(ecgw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoice_30_2_black_nac_0BBBB(sf1,
																	prevNode, egw, ecgw) == null) {
																if (pattern_ChoiceAfterChoice_30_2_black_nac_3BBB(egw,
																		prevNode, ecgw) == null) {
																	if (pattern_ChoiceAfterChoice_30_2_black_nac_4BBB(
																			ecgw, prevNode, egw) == null) {
																		if (pattern_ChoiceAfterChoice_30_2_black_nac_6BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoice_30_2_black_nac_7BB(
																					prevNode, sf1) == null) {
																				if (pattern_ChoiceAfterChoice_30_2_black_nac_10BB(
																						prevNode, egw) == null) {
																					if (pattern_ChoiceAfterChoice_30_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
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
																										if (pattern_ChoiceAfterChoice_30_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoice_30_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoice_30_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	process,
																																	prevNode,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_30_3_expressionFBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_30_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_30_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_30_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_1_bindingFB(ChoiceAfterChoice _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_1_blackFBB(EClass __eClass, ChoiceAfterChoice _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_1_bindingAndBlackFFB(ChoiceAfterChoice _this) {
		Object[] result_pattern_ChoiceAfterChoice_31_1_binding = pattern_ChoiceAfterChoice_31_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoice_31_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoice_31_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoice_31_1_black = pattern_ChoiceAfterChoice_31_1_blackFBB(__eClass,
					_this);
			if (result_pattern_ChoiceAfterChoice_31_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoice_31_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_79983 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_79983)) {
							if (!egw.equals(__DEC_sf1_default_79983)) {
								if (!ecgw.equals(__DEC_sf1_default_79983)) {
									return new Object[] { sf1, prevNode, egw, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_554726 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_554726)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_95250 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_95250)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_106438 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_106438)) {
							if (!prevNode.equals(__DEC_egw___conv_106438)) {
								if (!ecgw.equals(__DEC_egw___conv_106438)) {
									return new Object[] { egw, prevNode, ecgw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_37959 = ecgw.get__conv();
					if (__DEC_ecgw___conv_37959 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_37959)) {
							if (!prevNode.equals(__DEC_ecgw___conv_37959)) {
								if (!egw.equals(__DEC_ecgw___conv_37959)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_372552 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_372552)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_46801 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_46801)) {
							if (!prevNode.equals(__DEC_ecgw___conv_46801)) {
								if (!egw.equals(__DEC_ecgw___conv_46801)) {
									return new Object[] { ecgw, prevNode, egw };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_7BB(ExclusiveGateway prevNode,
			SequenceFlow sf1) {
		if (sf1.equals(prevNode.getDefault())) {
			return new Object[] { prevNode, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_8BB(ExclusiveGateway egw, SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_9BB(ExclusiveGateway ecgw, SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_10BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_black_nac_11BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoice_31_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
												if (Boolean.valueOf(prevNodeisDiverging)
														.equals(Boolean.valueOf(true))) {
													if (pattern_ChoiceAfterChoice_31_2_black_nac_8BB(egw,
															sf1) == null) {
														if (pattern_ChoiceAfterChoice_31_2_black_nac_9BB(ecgw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoice_31_2_black_nac_0BBBB(sf1,
																	prevNode, egw, ecgw) == null) {
																if (pattern_ChoiceAfterChoice_31_2_black_nac_3BBB(egw,
																		prevNode, ecgw) == null) {
																	if (pattern_ChoiceAfterChoice_31_2_black_nac_4BBB(
																			ecgw, prevNode, egw) == null) {
																		if (pattern_ChoiceAfterChoice_31_2_black_nac_6BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoice_31_2_black_nac_7BB(
																					prevNode, sf1) == null) {
																				if (pattern_ChoiceAfterChoice_31_2_black_nac_10BB(
																						prevNode, egw) == null) {
																					if (pattern_ChoiceAfterChoice_31_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
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
																										if (pattern_ChoiceAfterChoice_31_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoice_31_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoice_31_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	process,
																																	prevNode,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoice_31_3_expressionFBBBBBBB(ChoiceAfterChoice _this, Match match,
			de.abilov.bpmn.Process process, ExclusiveGateway prevNode, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, process, prevNode, sf1, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoice_31_4_expressionFBB(ChoiceAfterChoice _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoice_31_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoice_31_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ChoiceAfterChoiceImpl
