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

import de.abilov.tgg.bpmn2useCase.Rules.ChoiceAfterChoiceDef;
import de.abilov.tgg.bpmn2useCase.Rules.RulesPackage;

import de.abilov.useCase.ChoiceStep;
import de.abilov.useCase.Flow;
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
 * An implementation of the model object '<em><b>Choice After Choice Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChoiceAfterChoiceDefImpl extends AbstractRuleImpl implements ChoiceAfterChoiceDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceAfterChoiceDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getChoiceAfterChoiceDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		// initial bindings
		Object[] result1_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_0_1_blackBBBBBBB(this, match,
				prevNode, sf1, process, egw, ecgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", "
							+ "[process] = " + process + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_0_2_bindingAndBlackFBBBBBBB(this, match, prevNode, sf1, process, egw,
						ecgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1
					+ ", " + "[process] = " + process + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_0_4_blackBBBBBB(match,
					prevNode, sf1, process, egw, ecgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = "
						+ sf1 + ", " + "[process] = " + process + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw
						+ ".");
			}
			ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_0_4_greenBBBBBBFFFFFFFFF(match, prevNode, sf1,
					process, egw, ecgw);
					// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result4_green[6];
					// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result4_green[7];
					// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result4_green[8];
					// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result4_green[9];
					// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result4_green[10];
					// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result4_green[11];
					// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result4_green[12];
					// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result4_green[13];
					// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result4_green[14];

			// collect context elements
			Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_0_5_blackBBBBBB(match,
					prevNode, sf1, process, egw, ecgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[sf1] = " + sf1 + ", "
								+ "[process] = " + process + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_0_6_expressionBBBBBBB(this, match, prevNode, sf1,
					process, egw, ecgw);
			return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_0_7_expressionF();
		} else {
			return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_1_1_bindingAndBlackFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep prevStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[2];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[5];
		ExclusiveGateway egw = (ExclusiveGateway) result1_bindingAndBlack[6];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_1_1_greenBFBBFBFB(prevStep, flow,
				egw, ecgw, csp);
		ChoiceStep step = (ChoiceStep) result1_green[1];
		GW2S egwToStep = (GW2S) result1_green[4];
		GW2S ecgwToStep = (GW2S) result1_green[6];

		// collect translated elements
		Object[] result2_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_1_2_blackBBBBBB(sf1, step, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[step] = " + step + ", " + "[egw] = " + egw + ", " + "[egwToStep] = "
					+ egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_1_2_greenFBBBBBB(sf1, step, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_1_3_blackBBBBBBBBBBBB(ruleresult,
				prevNode, prevStep, eg2cs, sf1, step, flow, process, egw, egwToStep, ecgw, ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[prevStep] = "
					+ prevStep + ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[step] = " + step
					+ ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[egw] = " + egw + ", "
					+ "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep
					+ ".");
		}
		ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, prevNode,
				prevStep, sf1, step, flow, process, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result3_green[11];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[13];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[20];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[21];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_1_5_expressionBBBBBBBBBBBBB(this, ruleresult, prevNode,
				prevStep, eg2cs, sf1, step, flow, process, egw, egwToStep, ecgw, ecgwToStep);
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[0];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[1];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_binding[2];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[3];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[4];
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_2_2_blackBFFBBBBB(prevNode,
				sf1, process, egw, ecgw, match)) {
			ChoiceStep prevStep = (ChoiceStep) result2_black[1];
			GW2S eg2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_2_3_blackBBBBFBBB(
					prevNode, prevStep, eg2cs, sf1, process, egw, ecgw)) {
				Flow flow = (Flow) result3_black[4];
				Object[] result3_green = ChoiceAfterChoiceDefImpl
						.pattern_ChoiceAfterChoiceDef_2_3_greenBBBBBBBBFFFFFFFFFFFFFF(prevNode, prevStep, eg2cs, sf1,
								flow, process, egw, ecgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result3_green[9];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[11];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[12];
				// EMoflonEdge eg2cs__prevStep____target = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[20];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[21];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterChoiceDefImpl
						.pattern_ChoiceAfterChoiceDef_2_4_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch, prevNode,
								prevStep, eg2cs, sf1, flow, process, egw, ecgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[prevStep] = " + prevStep + ", " + "[eg2cs] = "
							+ eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[flow] = " + flow + ", " + "[process] = "
							+ process + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterChoiceDefImpl
							.pattern_ChoiceAfterChoiceDef_2_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_2_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		match.registerObject("prevNode", prevNode);
		match.registerObject("sf1", sf1);
		match.registerObject("process", process);
		match.registerObject("egw", egw);
		match.registerObject("ecgw", ecgw);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ExclusiveGateway prevNode, SequenceFlow sf1,
			de.abilov.bpmn.Process process, ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
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
			ChoiceStep prevStep, GW2S eg2cs, SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {// Create CSP
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
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
		isApplicableMatch.registerObject("sf1", sf1);
		isApplicableMatch.registerObject("flow", flow);
		isApplicableMatch.registerObject("process", process);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject eg2cs,
			EObject sf1, EObject step, EObject flow, EObject process, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
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
	public boolean isAppropriate_BWD(Match match, ChoiceStep prevStep, ChoiceStep step, Flow flow) {
		// initial bindings
		Object[] result1_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_10_1_blackBBBBB(this, match,
				prevStep, step, flow);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching in node [initial bindings] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", "
					+ "[step] = " + step + ", " + "[flow] = " + flow + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_10_2_bindingAndBlackFBBBBB(this, match, prevStep, step, flow);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", " + "[step] = " + step
					+ ", " + "[flow] = " + flow + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_10_4_blackBBBB(match,
					prevStep, step, flow);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", " + "[step] = "
						+ step + ", " + "[flow] = " + flow + ".");
			}
			ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_10_4_greenBBBBFF(match, prevStep, step, flow);
			// EMoflonEdge prevStep__step____next = (EMoflonEdge) result4_green[4];
			// EMoflonEdge flow__step____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_10_5_blackBBBB(match,
					prevStep, step, flow);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching in node [collect context elements] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevStep] = " + prevStep + ", " + "[step] = "
						+ step + ", " + "[flow] = " + flow + ".");
			}
			ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_10_5_greenBBBF(match, prevStep, flow);
			// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result5_green[3];

			// register objects to match
			ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_10_6_expressionBBBBB(this, match, prevStep, step,
					flow);
			return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_10_7_expressionF();
		} else {
			return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_11_1_bindingAndBlackFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep prevStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S eg2cs = (GW2S) result1_bindingAndBlack[2];
		ChoiceStep step = (ChoiceStep) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_11_1_greenBFBBFFFFB(prevNode,
				step, process, csp);
		SequenceFlow sf1 = (SequenceFlow) result1_green[1];
		ExclusiveGateway egw = (ExclusiveGateway) result1_green[4];
		GW2S egwToStep = (GW2S) result1_green[5];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_green[6];
		GW2S ecgwToStep = (GW2S) result1_green[7];

		// collect translated elements
		Object[] result2_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_11_2_blackBBBBBB(sf1, step, egw,
				egwToStep, ecgw, ecgwToStep);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching in node [collect translated elements] failed." + " Variables: "
					+ "[sf1] = " + sf1 + ", " + "[step] = " + step + ", " + "[egw] = " + egw + ", " + "[egwToStep] = "
					+ egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep + ".");
		}
		Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_11_2_greenFBBBBBB(sf1, step, egw,
				egwToStep, ecgw, ecgwToStep);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_11_3_blackBBBBBBBBBBBB(
				ruleresult, prevNode, prevStep, eg2cs, sf1, step, flow, process, egw, egwToStep, ecgw, ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[prevStep] = "
					+ prevStep + ", " + "[eg2cs] = " + eg2cs + ", " + "[sf1] = " + sf1 + ", " + "[step] = " + step
					+ ", " + "[flow] = " + flow + ", " + "[process] = " + process + ", " + "[egw] = " + egw + ", "
					+ "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", " + "[ecgwToStep] = " + ecgwToStep
					+ ".");
		}
		ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, prevNode,
				prevStep, sf1, step, flow, process, egw, egwToStep, ecgw, ecgwToStep);
				// EMoflonEdge prevNode__sf1____default = (EMoflonEdge) result3_green[11];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[12];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[13];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[14];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[20];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[21];
				// EMoflonEdge egwToStep__egw____source = (EMoflonEdge) result3_green[22];
				// EMoflonEdge egwToStep__step____target = (EMoflonEdge) result3_green[23];
				// EMoflonEdge ecgwToStep__ecgw____source = (EMoflonEdge) result3_green[24];
				// EMoflonEdge ecgwToStep__step____target = (EMoflonEdge) result3_green[25];

		// perform postprocessing story node is empty
		// register objects
		ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_11_5_expressionBBBBBBBBBBBBB(this, ruleresult, prevNode,
				prevStep, eg2cs, sf1, step, flow, process, egw, egwToStep, ecgw, ecgwToStep);
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ChoiceStep prevStep = (ChoiceStep) result2_binding[0];
		ChoiceStep step = (ChoiceStep) result2_binding[1];
		Flow flow = (Flow) result2_binding[2];
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_12_2_blackFBFBBB(prevStep,
				step, flow, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S eg2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterChoiceDefImpl
					.pattern_ChoiceAfterChoiceDef_12_3_blackBBBBBF(prevNode, prevStep, eg2cs, step, flow)) {
				de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result3_black[5];
				Object[] result3_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_12_3_greenBBBBBBFFFFFFF(
						prevNode, prevStep, eg2cs, step, flow, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[7];
				// EMoflonEdge eg2cs__prevNode____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge eg2cs__prevStep____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[10];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[11];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[12];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterChoiceDefImpl
						.pattern_ChoiceAfterChoiceDef_12_4_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, prevNode,
								prevStep, eg2cs, step, flow, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[prevStep] = " + prevStep + ", " + "[eg2cs] = "
							+ eg2cs + ", " + "[step] = " + step + ", " + "[flow] = " + flow + ", " + "[process] = "
							+ process + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ChoiceAfterChoiceDefImpl
							.pattern_ChoiceAfterChoiceDef_12_6_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching in node [add match to rule result] failed."
								+ " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[isApplicableMatch] = "
								+ isApplicableMatch + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_12_6_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ChoiceStep prevStep, ChoiceStep step, Flow flow) {
		match.registerObject("prevStep", prevStep);
		match.registerObject("step", step);
		match.registerObject("flow", flow);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ChoiceStep prevStep, ChoiceStep step, Flow flow) {// Create CSP
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
			ChoiceStep prevStep, GW2S eg2cs, ChoiceStep step, Flow flow, de.abilov.bpmn.Process process) {// Create CSP
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
		isApplicableMatch.registerObject("prevStep", prevStep);
		isApplicableMatch.registerObject("eg2cs", eg2cs);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject eg2cs,
			EObject sf1, EObject step, EObject flow, EObject process, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("eg2cs", eg2cs);
		ruleresult.registerObject("sf1", sf1);
		ruleresult.registerObject("step", step);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("process", process);
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
				.equals(de.abilov.useCase.UseCasePackage.eINSTANCE.getChoiceStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_546(EMoflonEdge _edge_default) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_20_2_blackFFFFFB(_edge_default)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_20_3_expressionFBBBBBBB(this, match, prevNode,
					sf1, process, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_20_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_20_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_547(EMoflonEdge _edge_sourceRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_21_2_blackFFFFFB(_edge_sourceRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_21_3_expressionFBBBBBBB(this, match, prevNode,
					sf1, process, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_21_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_21_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_548(EMoflonEdge _edge_outgoing) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_22_2_blackFFFFFB(_edge_outgoing)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_22_3_expressionFBBBBBBB(this, match, prevNode,
					sf1, process, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_22_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_22_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_22_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_22_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_166(EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_23_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_23_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_23_2_blackFFFB(_edge_next)) {
			ChoiceStep prevStep = (ChoiceStep) result2_black[0];
			ChoiceStep step = (ChoiceStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_23_3_expressionFBBBBB(this, match, prevStep, step,
					flow)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_23_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_23_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_23_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_23_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_167(EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_24_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_24_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_24_2_blackFFFB(_edge_steps)) {
			ChoiceStep prevStep = (ChoiceStep) result2_black[0];
			ChoiceStep step = (ChoiceStep) result2_black[1];
			Flow flow = (Flow) result2_black[2];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_24_3_expressionFBBBBB(this, match, prevStep, step,
					flow)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_24_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_24_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_24_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_24_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_549(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_25_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_25_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_25_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_25_3_expressionFBBBBBBB(this, match, prevNode,
					sf1, process, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_25_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_25_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_25_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_25_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_550(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_26_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_26_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_26_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_26_3_expressionFBBBBBBB(this, match, prevNode,
					sf1, process, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_26_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_26_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_26_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_26_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_551(EMoflonEdge _edge_flowElements) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_27_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_27_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_27_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_27_3_expressionFBBBBBBB(this, match, prevNode,
					sf1, process, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_27_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_27_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_27_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_27_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_552(EMoflonEdge _edge_targetRef) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_28_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_28_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_28_2_blackFFFFFB(_edge_targetRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_28_3_expressionFBBBBBBB(this, match, prevNode,
					sf1, process, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_28_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_28_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_28_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_28_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_553(EMoflonEdge _edge_incoming) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_29_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_29_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_29_2_blackFFFFFB(_edge_incoming)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_29_3_expressionFBBBBBBB(this, match, prevNode,
					sf1, process, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_29_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_29_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_29_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_29_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_554(EMoflonEdge _edge___conv) {
		// prepare return value
		Object[] result1_bindingAndBlack = ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_30_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [prepare return value] failed." + " Variables: "
					+ "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_30_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ChoiceAfterChoiceDefImpl
				.pattern_ChoiceAfterChoiceDef_30_2_blackFFFFFB(_edge___conv)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SequenceFlow sf1 = (SequenceFlow) result2_black[1];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_30_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_30_3_expressionFBBBBBBB(this, match, prevNode,
					sf1, process, egw, ecgw)) {
				// Ensure that the correct types of elements are matched
				if (ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_30_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_30_5_blackBBB(match,
							__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching in node [Add match to rule result] failed."
								+ " Variables: " + "[match] = " + match + ", " + "[__performOperation] = "
								+ __performOperation + ", " + "[__result] = " + __result + ".");
					}
					ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_30_5_greenBBB(match, __performOperation,
							__result);

				} else {
				}

			} else {
			}

		}
		return ChoiceAfterChoiceDefImpl.pattern_ChoiceAfterChoiceDef_30_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ChoiceAfterChoiceDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		de.abilov.useCase.ChoiceStep prevStep = (de.abilov.useCase.ChoiceStep) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S eg2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ChoiceStep step = (de.abilov.useCase.ChoiceStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

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

		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ChoiceAfterChoiceDef");
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
		ruleResult.setRule("ChoiceAfterChoiceDef");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		Optional<TripleMatchNodeMapping> matchForPrevNode = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevNode")).findAny();
		de.abilov.bpmn.ExclusiveGateway prevNode = (de.abilov.bpmn.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		de.abilov.useCase.ChoiceStep prevStep = (de.abilov.useCase.ChoiceStep) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEg2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("eg2cs")).findAny();
		de.abilov.tgg.bpmn2useCase.GW2S eg2cs = (de.abilov.tgg.bpmn2useCase.GW2S) matchForEg2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		de.abilov.bpmn.SequenceFlow sf1 = (de.abilov.bpmn.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		de.abilov.useCase.ChoiceStep step = (de.abilov.useCase.ChoiceStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		de.abilov.useCase.Flow flow = (de.abilov.useCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) matchForProcess.get().getNode();

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

		Variable var_egw_id = CSPFactoryHelper.eINSTANCE.createVariable("egw", true, csp);
		var_egw_id.setValue(egw.getId());
		var_egw_id.setType("String");

		Variable var_step_id = CSPFactoryHelper.eINSTANCE.createVariable("step", true, csp);
		var_step_id.setValue(step.getId());
		var_step_id.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ChoiceAfterChoiceDef");
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
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
			return null;
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_SEQUENCEFLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SequenceFlow) arguments.get(2), (de.abilov.bpmn.Process) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_SEQUENCEFLOW_FLOW_PROCESS_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (SequenceFlow) arguments.get(4),
					(Flow) arguments.get(5), (de.abilov.bpmn.Process) arguments.get(6),
					(ExclusiveGateway) arguments.get(7), (ExclusiveGateway) arguments.get(8));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD__MATCH_CHOICESTEP_CHOICESTEP_FLOW:
			return isAppropriate_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(ChoiceStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CHOICESTEP_CHOICESTEP_FLOW:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(ChoiceStep) arguments.get(2), (Flow) arguments.get(3));
			return null;
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CHOICESTEP_CHOICESTEP_FLOW:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ChoiceStep) arguments.get(1),
					(ChoiceStep) arguments.get(2), (Flow) arguments.get(3));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_CHOICESTEP_FLOW_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (ChoiceStep) arguments.get(4),
					(Flow) arguments.get(5), (de.abilov.bpmn.Process) arguments.get(6));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_546__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_546((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_547__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_547((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_548__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_548((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_166__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_166((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_BWD_EMOFLON_EDGE_167__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_167((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_549__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_549((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_550__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_550((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_551__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_551((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_552__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_552((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_553__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_553((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___IS_APPROPRIATE_FWD_EMOFLON_EDGE_554__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_554((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_CHOICE_DEF___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_0_1_blackBBBBBBB(ChoiceAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					return new Object[] { _this, match, prevNode, sf1, process, egw, ecgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_0_2_bindingFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, sf1, process, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, sf1, process, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_0_2_bindingAndBlackFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterChoiceDef_0_2_binding = pattern_ChoiceAfterChoiceDef_0_2_bindingFBBBBBBB(
				_this, match, prevNode, sf1, process, egw, ecgw);
		if (result_pattern_ChoiceAfterChoiceDef_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterChoiceDef_0_2_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_0_2_black = pattern_ChoiceAfterChoiceDef_0_2_blackB(csp);
			if (result_pattern_ChoiceAfterChoiceDef_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, sf1, process, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_0_3_expressionFBB(ChoiceAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_0_4_blackBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					return new Object[] { match, prevNode, sf1, process, egw, ecgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_0_4_greenBBBBBBFFFFFFFFF(Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sf1);
		match.getToBeTranslatedNodes().add(egw);
		match.getToBeTranslatedNodes().add(ecgw);
		String prevNode__sf1____default_name_prime = "default";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____default);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		match.getToBeTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		match.getToBeTranslatedEdges().add(prevNode__sf1____outgoing);
		process__sf1____flowElements.setSrc(process);
		process__sf1____flowElements.setTrg(sf1);
		match.getToBeTranslatedEdges().add(process__sf1____flowElements);
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
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { match, prevNode, sf1, process, egw, ecgw, prevNode__sf1____default,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, process__sf1____flowElements,
				process__egw____flowElements, process__ecgw____flowElements, sf1__egw____targetRef,
				egw__sf1____incoming, egw__ecgw______conv };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_0_5_blackBBBBBB(Match match, ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					return new Object[] { match, prevNode, sf1, process, egw, ecgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_0_5_greenBBBF(Match match, ExclusiveGateway prevNode,
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

	public static final void pattern_ChoiceAfterChoiceDef_0_6_expressionBBBBBBB(ChoiceAfterChoiceDef _this, Match match,
			ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, sf1, process, egw, ecgw);

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_1_1_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("egw");
		EObject _localVariable_7 = isApplicableMatch.getObject("ecgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpEg2cs = _localVariable_2;
		EObject tmpSf1 = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpEgw = _localVariable_6;
		EObject tmpEcgw = _localVariable_7;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpPrevStep instanceof ChoiceStep) {
				ChoiceStep prevStep = (ChoiceStep) tmpPrevStep;
				if (tmpEg2cs instanceof GW2S) {
					GW2S eg2cs = (GW2S) tmpEg2cs;
					if (tmpSf1 instanceof SequenceFlow) {
						SequenceFlow sf1 = (SequenceFlow) tmpSf1;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpProcess instanceof de.abilov.bpmn.Process) {
								de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
								if (tmpEgw instanceof ExclusiveGateway) {
									ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
									if (tmpEcgw instanceof ExclusiveGateway) {
										ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
										return new Object[] { prevNode, prevStep, eg2cs, sf1, flow, process, egw, ecgw,
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_1_1_blackBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep prevStep, GW2S eg2cs, SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw, ChoiceAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { prevNode, prevStep, eg2cs, sf1, flow, process, egw, ecgw, _this, csp,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_1_1_bindingAndBlackFFFFFFFFBFB(ChoiceAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterChoiceDef_1_1_binding = pattern_ChoiceAfterChoiceDef_1_1_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterChoiceDef_1_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterChoiceDef_1_1_binding[0];
			ChoiceStep prevStep = (ChoiceStep) result_pattern_ChoiceAfterChoiceDef_1_1_binding[1];
			GW2S eg2cs = (GW2S) result_pattern_ChoiceAfterChoiceDef_1_1_binding[2];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ChoiceAfterChoiceDef_1_1_binding[3];
			Flow flow = (Flow) result_pattern_ChoiceAfterChoiceDef_1_1_binding[4];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterChoiceDef_1_1_binding[5];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_ChoiceAfterChoiceDef_1_1_binding[6];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_ChoiceAfterChoiceDef_1_1_binding[7];

			Object[] result_pattern_ChoiceAfterChoiceDef_1_1_black = pattern_ChoiceAfterChoiceDef_1_1_blackBBBBBBBBBFB(
					prevNode, prevStep, eg2cs, sf1, flow, process, egw, ecgw, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterChoiceDef_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterChoiceDef_1_1_black[9];

				return new Object[] { prevNode, prevStep, eg2cs, sf1, flow, process, egw, ecgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_1_1_greenBFBBFBFB(ChoiceStep prevStep, Flow flow,
			ExclusiveGateway egw, ExclusiveGateway ecgw, CSP csp) {
		ChoiceStep step = UseCaseFactory.eINSTANCE.createChoiceStep();
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
		return new Object[] { prevStep, step, flow, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_1_2_blackBBBBBB(SequenceFlow sf1, ChoiceStep step,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { sf1, step, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_1_2_greenFBBBBBB(SequenceFlow sf1, ChoiceStep step,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sf1);
		ruleresult.getCreatedElements().add(step);
		ruleresult.getTranslatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getTranslatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, sf1, step, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_1_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject prevStep, EObject eg2cs, EObject sf1, EObject step, EObject flow, EObject process,
			EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(sf1)) {
				if (!prevNode.equals(step)) {
					if (!prevNode.equals(process)) {
						if (!prevStep.equals(sf1)) {
							if (!prevStep.equals(step)) {
								if (!prevStep.equals(process)) {
									if (!eg2cs.equals(prevNode)) {
										if (!eg2cs.equals(prevStep)) {
											if (!eg2cs.equals(sf1)) {
												if (!eg2cs.equals(step)) {
													if (!eg2cs.equals(flow)) {
														if (!eg2cs.equals(process)) {
															if (!eg2cs.equals(egw)) {
																if (!eg2cs.equals(egwToStep)) {
																	if (!sf1.equals(step)) {
																		if (!flow.equals(prevNode)) {
																			if (!flow.equals(prevStep)) {
																				if (!flow.equals(sf1)) {
																					if (!flow.equals(step)) {
																						if (!flow.equals(process)) {
																							if (!process.equals(sf1)) {
																								if (!process
																										.equals(step)) {
																									if (!egw.equals(
																											prevNode)) {
																										if (!egw.equals(
																												prevStep)) {
																											if (!egw.equals(
																													sf1)) {
																												if (!egw.equals(
																														step)) {
																													if (!egw.equals(
																															flow)) {
																														if (!egw.equals(
																																process)) {
																															if (!egw.equals(
																																	egwToStep)) {
																																if (!egwToStep
																																		.equals(prevNode)) {
																																	if (!egwToStep
																																			.equals(prevStep)) {
																																		if (!egwToStep
																																				.equals(sf1)) {
																																			if (!egwToStep
																																					.equals(step)) {
																																				if (!egwToStep
																																						.equals(flow)) {
																																					if (!egwToStep
																																							.equals(process)) {
																																						if (!ecgw
																																								.equals(prevNode)) {
																																							if (!ecgw
																																									.equals(prevStep)) {
																																								if (!ecgw
																																										.equals(eg2cs)) {
																																									if (!ecgw
																																											.equals(sf1)) {
																																										if (!ecgw
																																												.equals(step)) {
																																											if (!ecgw
																																													.equals(flow)) {
																																												if (!ecgw
																																														.equals(process)) {
																																													if (!ecgw
																																															.equals(egw)) {
																																														if (!ecgw
																																																.equals(egwToStep)) {
																																															if (!ecgw
																																																	.equals(ecgwToStep)) {
																																																if (!ecgwToStep
																																																		.equals(prevNode)) {
																																																	if (!ecgwToStep
																																																			.equals(prevStep)) {
																																																		if (!ecgwToStep
																																																				.equals(eg2cs)) {
																																																			if (!ecgwToStep
																																																					.equals(sf1)) {
																																																				if (!ecgwToStep
																																																						.equals(step)) {
																																																					if (!ecgwToStep
																																																							.equals(flow)) {
																																																						if (!ecgwToStep
																																																								.equals(process)) {
																																																							if (!ecgwToStep
																																																									.equals(egw)) {
																																																								if (!ecgwToStep
																																																										.equals(egwToStep)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											prevNode,
																																																											prevStep,
																																																											eg2cs,
																																																											sf1,
																																																											step,
																																																											flow,
																																																											process,
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
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_1_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject sf1, EObject step, EObject flow,
			EObject process, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ChoiceAfterChoiceDef";
		String prevNode__sf1____default_name_prime = "default";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____default);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getTranslatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getTranslatedEdges().add(prevNode__sf1____outgoing);
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
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, prevNode, prevStep, sf1, step, flow, process, egw, egwToStep, ecgw,
				ecgwToStep, prevNode__sf1____default, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				prevStep__step____next, flow__step____steps, process__sf1____flowElements, process__egw____flowElements,
				process__ecgw____flowElements, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv,
				egwToStep__egw____source, egwToStep__step____target, ecgwToStep__ecgw____source,
				ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterChoiceDef_1_5_expressionBBBBBBBBBBBBB(ChoiceAfterChoiceDef _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject eg2cs, EObject sf1, EObject step,
			EObject flow, EObject process, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_FWD(ruleresult, prevNode, prevStep, eg2cs, sf1, step, flow, process, egw, egwToStep, ecgw,
				ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterChoiceDef_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_1_blackFBB(EClass eClass, ChoiceAfterChoiceDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_2_1_binding = pattern_ChoiceAfterChoiceDef_2_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_2_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_2_1_black = pattern_ChoiceAfterChoiceDef_2_1_blackFBB(eClass,
					_this);
			if (result_pattern_ChoiceAfterChoiceDef_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterChoiceDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("sf1");
		EObject _localVariable_2 = match.getObject("process");
		EObject _localVariable_3 = match.getObject("egw");
		EObject _localVariable_4 = match.getObject("ecgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpSf1 = _localVariable_1;
		EObject tmpProcess = _localVariable_2;
		EObject tmpEgw = _localVariable_3;
		EObject tmpEcgw = _localVariable_4;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (tmpProcess instanceof de.abilov.bpmn.Process) {
					de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
					if (tmpEgw instanceof ExclusiveGateway) {
						ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
						if (tmpEcgw instanceof ExclusiveGateway) {
							ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
							return new Object[] { prevNode, sf1, process, egw, ecgw, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_2_2_blackBFFBBBBB(ExclusiveGateway prevNode,
			SequenceFlow sf1, de.abilov.bpmn.Process process, ExclusiveGateway egw, ExclusiveGateway ecgw,
			Match match) {
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
								for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(prevNode, GW2S.class, "source")) {
									Step tmpPrevStep = eg2cs.getTarget();
									if (tmpPrevStep instanceof ChoiceStep) {
										ChoiceStep prevStep = (ChoiceStep) tmpPrevStep;
										_result.add(new Object[] { prevNode, prevStep, eg2cs, sf1, process, egw, ecgw,
												match });
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

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_2_3_blackBBBBFBBB(ExclusiveGateway prevNode,
			ChoiceStep prevStep, GW2S eg2cs, SequenceFlow sf1, de.abilov.bpmn.Process process, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (sf1.equals(prevNode.getDefault())) {
						if (prevNode.equals(sf1.getSourceRef())) {
							if (prevNode.equals(eg2cs.getSource())) {
								if (prevStep.equals(eg2cs.getTarget())) {
									if (process.getFlowElements().contains(prevNode)) {
										if (process.getFlowElements().contains(sf1)) {
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
																		for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(prevStep,
																						Flow.class, "steps")) {
																			_result.add(new Object[] { prevNode,
																					prevStep, eg2cs, sf1, flow, process,
																					egw, ecgw });
																		}
																	}

																}

															}

														}
													}
												}
											}
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_3_greenBBBBBBBBFFFFFFFFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep prevStep, GW2S eg2cs, SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String prevNode__sf1____default_name_prime = "default";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__prevStep____target_name_prime = "target";
		String flow__prevStep____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(egw);
		isApplicableMatch.getAllContextElements().add(ecgw);
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____default);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(prevNode__sf1____outgoing);
		eg2cs__prevNode____source.setSrc(eg2cs);
		eg2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevNode____source);
		eg2cs__prevStep____target.setSrc(eg2cs);
		eg2cs__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevStep____target);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(flow__prevStep____steps);
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
		sf1__egw____targetRef.setSrc(sf1);
		sf1__egw____targetRef.setTrg(egw);
		isApplicableMatch.getAllContextElements().add(sf1__egw____targetRef);
		egw__sf1____incoming.setSrc(egw);
		egw__sf1____incoming.setTrg(sf1);
		isApplicableMatch.getAllContextElements().add(egw__sf1____incoming);
		egw__ecgw______conv.setSrc(egw);
		egw__ecgw______conv.setTrg(ecgw);
		isApplicableMatch.getAllContextElements().add(egw__ecgw______conv);
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__prevStep____target.setName(eg2cs__prevStep____target_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { prevNode, prevStep, eg2cs, sf1, flow, process, egw, ecgw, isApplicableMatch,
				prevNode__sf1____default, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				eg2cs__prevNode____source, eg2cs__prevStep____target, flow__prevStep____steps,
				process__prevNode____flowElements, process__sf1____flowElements, process__egw____flowElements,
				process__ecgw____flowElements, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_4_bindingFBBBBBBBBBB(ChoiceAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep prevStep, GW2S eg2cs,
			SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, prevStep, eg2cs, sf1, flow,
				process, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, eg2cs, sf1, flow, process, egw,
					ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_4_bindingAndBlackFBBBBBBBBBB(ChoiceAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep prevStep, GW2S eg2cs,
			SequenceFlow sf1, Flow flow, de.abilov.bpmn.Process process, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterChoiceDef_2_4_binding = pattern_ChoiceAfterChoiceDef_2_4_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, prevNode, prevStep, eg2cs, sf1, flow, process, egw, ecgw);
		if (result_pattern_ChoiceAfterChoiceDef_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterChoiceDef_2_4_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_2_4_black = pattern_ChoiceAfterChoiceDef_2_4_blackB(csp);
			if (result_pattern_ChoiceAfterChoiceDef_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, eg2cs, sf1, flow, process, egw,
						ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_2_5_expressionFBB(ChoiceAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_2_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterChoiceDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterChoiceDef_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_10_1_blackBBBBB(ChoiceAfterChoiceDef _this, Match match,
			ChoiceStep prevStep, ChoiceStep step, Flow flow) {
		if (!prevStep.equals(step)) {
			return new Object[] { _this, match, prevStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_10_2_bindingFBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ChoiceStep prevStep, ChoiceStep step, Flow flow) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, prevStep, step, flow);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_10_2_bindingAndBlackFBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ChoiceStep prevStep, ChoiceStep step, Flow flow) {
		Object[] result_pattern_ChoiceAfterChoiceDef_10_2_binding = pattern_ChoiceAfterChoiceDef_10_2_bindingFBBBBB(
				_this, match, prevStep, step, flow);
		if (result_pattern_ChoiceAfterChoiceDef_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterChoiceDef_10_2_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_10_2_black = pattern_ChoiceAfterChoiceDef_10_2_blackB(csp);
			if (result_pattern_ChoiceAfterChoiceDef_10_2_black != null) {

				return new Object[] { csp, _this, match, prevStep, step, flow };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_10_3_expressionFBB(ChoiceAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_10_4_blackBBBB(Match match, ChoiceStep prevStep,
			ChoiceStep step, Flow flow) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, prevStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_10_4_greenBBBBFF(Match match, ChoiceStep prevStep,
			ChoiceStep step, Flow flow) {
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
		return new Object[] { match, prevStep, step, flow, prevStep__step____next, flow__step____steps };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_10_5_blackBBBB(Match match, ChoiceStep prevStep,
			ChoiceStep step, Flow flow) {
		if (!prevStep.equals(step)) {
			return new Object[] { match, prevStep, step, flow };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_10_5_greenBBBF(Match match, ChoiceStep prevStep,
			Flow flow) {
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(prevStep);
		match.getContextNodes().add(flow);
		String flow__prevStep____steps_name_prime = "steps";
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		match.getContextEdges().add(flow__prevStep____steps);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		return new Object[] { match, prevStep, flow, flow__prevStep____steps };
	}

	public static final void pattern_ChoiceAfterChoiceDef_10_6_expressionBBBBB(ChoiceAfterChoiceDef _this, Match match,
			ChoiceStep prevStep, ChoiceStep step, Flow flow) {
		_this.registerObjectsToMatch_BWD(match, prevStep, step, flow);

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_11_1_bindingFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("eg2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("step");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpPrevStep = _localVariable_1;
		EObject tmpEg2cs = _localVariable_2;
		EObject tmpStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpPrevStep instanceof ChoiceStep) {
				ChoiceStep prevStep = (ChoiceStep) tmpPrevStep;
				if (tmpEg2cs instanceof GW2S) {
					GW2S eg2cs = (GW2S) tmpEg2cs;
					if (tmpStep instanceof ChoiceStep) {
						ChoiceStep step = (ChoiceStep) tmpStep;
						if (tmpFlow instanceof Flow) {
							Flow flow = (Flow) tmpFlow;
							if (tmpProcess instanceof de.abilov.bpmn.Process) {
								de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) tmpProcess;
								return new Object[] { prevNode, prevStep, eg2cs, step, flow, process,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_11_1_blackBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep prevStep, GW2S eg2cs, ChoiceStep step, Flow flow, de.abilov.bpmn.Process process,
			ChoiceAfterChoiceDef _this, IsApplicableMatch isApplicableMatch) {
		if (!prevStep.equals(step)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { prevNode, prevStep, eg2cs, step, flow, process, _this, csp,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_11_1_bindingAndBlackFFFFFFBFB(ChoiceAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterChoiceDef_11_1_binding = pattern_ChoiceAfterChoiceDef_11_1_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterChoiceDef_11_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterChoiceDef_11_1_binding[0];
			ChoiceStep prevStep = (ChoiceStep) result_pattern_ChoiceAfterChoiceDef_11_1_binding[1];
			GW2S eg2cs = (GW2S) result_pattern_ChoiceAfterChoiceDef_11_1_binding[2];
			ChoiceStep step = (ChoiceStep) result_pattern_ChoiceAfterChoiceDef_11_1_binding[3];
			Flow flow = (Flow) result_pattern_ChoiceAfterChoiceDef_11_1_binding[4];
			de.abilov.bpmn.Process process = (de.abilov.bpmn.Process) result_pattern_ChoiceAfterChoiceDef_11_1_binding[5];

			Object[] result_pattern_ChoiceAfterChoiceDef_11_1_black = pattern_ChoiceAfterChoiceDef_11_1_blackBBBBBBBFB(
					prevNode, prevStep, eg2cs, step, flow, process, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterChoiceDef_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterChoiceDef_11_1_black[7];

				return new Object[] { prevNode, prevStep, eg2cs, step, flow, process, _this, csp, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_11_1_greenBFBBFFFFB(ExclusiveGateway prevNode,
			ChoiceStep step, de.abilov.bpmn.Process process, CSP csp) {
		SequenceFlow sf1 = BpmnFactory.eINSTANCE.createSequenceFlow();
		ExclusiveGateway egw = BpmnFactory.eINSTANCE.createExclusiveGateway();
		GW2S egwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		ExclusiveGateway ecgw = BpmnFactory.eINSTANCE.createExclusiveGateway();
		GW2S ecgwToStep = Bpmn2useCaseFactory.eINSTANCE.createGW2S();
		boolean egw_isDiverging_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("egw", "id");
		boolean ecgw_isDiverging_prime = false;
		prevNode.setDefault(sf1);
		sf1.setSourceRef(prevNode);
		process.getFlowElements().add(sf1);
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
		return new Object[] { prevNode, sf1, step, process, egw, egwToStep, ecgw, ecgwToStep, csp };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_11_2_blackBBBBBB(SequenceFlow sf1, ChoiceStep step,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		if (!ecgw.equals(egw)) {
			if (!ecgwToStep.equals(egwToStep)) {
				return new Object[] { sf1, step, egw, egwToStep, ecgw, ecgwToStep };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_11_2_greenFBBBBBB(SequenceFlow sf1, ChoiceStep step,
			ExclusiveGateway egw, GW2S egwToStep, ExclusiveGateway ecgw, GW2S ecgwToStep) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sf1);
		ruleresult.getTranslatedElements().add(step);
		ruleresult.getCreatedElements().add(egw);
		ruleresult.getCreatedLinkElements().add(egwToStep);
		ruleresult.getCreatedElements().add(ecgw);
		ruleresult.getCreatedLinkElements().add(ecgwToStep);
		return new Object[] { ruleresult, sf1, step, egw, egwToStep, ecgw, ecgwToStep };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_11_3_blackBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject prevStep, EObject eg2cs, EObject sf1, EObject step, EObject flow, EObject process,
			EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(sf1)) {
				if (!prevNode.equals(step)) {
					if (!prevNode.equals(process)) {
						if (!prevStep.equals(sf1)) {
							if (!prevStep.equals(step)) {
								if (!prevStep.equals(process)) {
									if (!eg2cs.equals(prevNode)) {
										if (!eg2cs.equals(prevStep)) {
											if (!eg2cs.equals(sf1)) {
												if (!eg2cs.equals(step)) {
													if (!eg2cs.equals(flow)) {
														if (!eg2cs.equals(process)) {
															if (!eg2cs.equals(egw)) {
																if (!eg2cs.equals(egwToStep)) {
																	if (!sf1.equals(step)) {
																		if (!flow.equals(prevNode)) {
																			if (!flow.equals(prevStep)) {
																				if (!flow.equals(sf1)) {
																					if (!flow.equals(step)) {
																						if (!flow.equals(process)) {
																							if (!process.equals(sf1)) {
																								if (!process
																										.equals(step)) {
																									if (!egw.equals(
																											prevNode)) {
																										if (!egw.equals(
																												prevStep)) {
																											if (!egw.equals(
																													sf1)) {
																												if (!egw.equals(
																														step)) {
																													if (!egw.equals(
																															flow)) {
																														if (!egw.equals(
																																process)) {
																															if (!egw.equals(
																																	egwToStep)) {
																																if (!egwToStep
																																		.equals(prevNode)) {
																																	if (!egwToStep
																																			.equals(prevStep)) {
																																		if (!egwToStep
																																				.equals(sf1)) {
																																			if (!egwToStep
																																					.equals(step)) {
																																				if (!egwToStep
																																						.equals(flow)) {
																																					if (!egwToStep
																																							.equals(process)) {
																																						if (!ecgw
																																								.equals(prevNode)) {
																																							if (!ecgw
																																									.equals(prevStep)) {
																																								if (!ecgw
																																										.equals(eg2cs)) {
																																									if (!ecgw
																																											.equals(sf1)) {
																																										if (!ecgw
																																												.equals(step)) {
																																											if (!ecgw
																																													.equals(flow)) {
																																												if (!ecgw
																																														.equals(process)) {
																																													if (!ecgw
																																															.equals(egw)) {
																																														if (!ecgw
																																																.equals(egwToStep)) {
																																															if (!ecgw
																																																	.equals(ecgwToStep)) {
																																																if (!ecgwToStep
																																																		.equals(prevNode)) {
																																																	if (!ecgwToStep
																																																			.equals(prevStep)) {
																																																		if (!ecgwToStep
																																																				.equals(eg2cs)) {
																																																			if (!ecgwToStep
																																																					.equals(sf1)) {
																																																				if (!ecgwToStep
																																																						.equals(step)) {
																																																					if (!ecgwToStep
																																																							.equals(flow)) {
																																																						if (!ecgwToStep
																																																								.equals(process)) {
																																																							if (!ecgwToStep
																																																									.equals(egw)) {
																																																								if (!ecgwToStep
																																																										.equals(egwToStep)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											prevNode,
																																																											prevStep,
																																																											eg2cs,
																																																											sf1,
																																																											step,
																																																											flow,
																																																											process,
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
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_11_3_greenBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject sf1, EObject step, EObject flow,
			EObject process, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		EMoflonEdge prevNode__sf1____default = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__egw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__ecgw____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ecgwToStep__step____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ChoiceAfterChoiceDef";
		String prevNode__sf1____default_name_prime = "default";
		String sf1__prevNode____sourceRef_name_prime = "sourceRef";
		String prevNode__sf1____outgoing_name_prime = "outgoing";
		String prevStep__step____next_name_prime = "next";
		String flow__step____steps_name_prime = "steps";
		String process__sf1____flowElements_name_prime = "flowElements";
		String process__egw____flowElements_name_prime = "flowElements";
		String process__ecgw____flowElements_name_prime = "flowElements";
		String sf1__egw____targetRef_name_prime = "targetRef";
		String egw__sf1____incoming_name_prime = "incoming";
		String egw__ecgw______conv_name_prime = "__conv";
		String egwToStep__egw____source_name_prime = "source";
		String egwToStep__step____target_name_prime = "target";
		String ecgwToStep__ecgw____source_name_prime = "source";
		String ecgwToStep__step____target_name_prime = "target";
		prevNode__sf1____default.setSrc(prevNode);
		prevNode__sf1____default.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____default);
		sf1__prevNode____sourceRef.setSrc(sf1);
		sf1__prevNode____sourceRef.setTrg(prevNode);
		ruleresult.getCreatedEdges().add(sf1__prevNode____sourceRef);
		prevNode__sf1____outgoing.setSrc(prevNode);
		prevNode__sf1____outgoing.setTrg(sf1);
		ruleresult.getCreatedEdges().add(prevNode__sf1____outgoing);
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
		prevNode__sf1____default.setName(prevNode__sf1____default_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		egwToStep__egw____source.setName(egwToStep__egw____source_name_prime);
		egwToStep__step____target.setName(egwToStep__step____target_name_prime);
		ecgwToStep__ecgw____source.setName(ecgwToStep__ecgw____source_name_prime);
		ecgwToStep__step____target.setName(ecgwToStep__step____target_name_prime);
		return new Object[] { ruleresult, prevNode, prevStep, sf1, step, flow, process, egw, egwToStep, ecgw,
				ecgwToStep, prevNode__sf1____default, sf1__prevNode____sourceRef, prevNode__sf1____outgoing,
				prevStep__step____next, flow__step____steps, process__sf1____flowElements, process__egw____flowElements,
				process__ecgw____flowElements, sf1__egw____targetRef, egw__sf1____incoming, egw__ecgw______conv,
				egwToStep__egw____source, egwToStep__step____target, ecgwToStep__ecgw____source,
				ecgwToStep__step____target };
	}

	public static final void pattern_ChoiceAfterChoiceDef_11_5_expressionBBBBBBBBBBBBB(ChoiceAfterChoiceDef _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject prevStep, EObject eg2cs, EObject sf1, EObject step,
			EObject flow, EObject process, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		_this.registerObjects_BWD(ruleresult, prevNode, prevStep, eg2cs, sf1, step, flow, process, egw, egwToStep, ecgw,
				ecgwToStep);

	}

	public static final PerformRuleResult pattern_ChoiceAfterChoiceDef_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_1_blackFBB(EClass eClass, ChoiceAfterChoiceDef _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_12_1_binding = pattern_ChoiceAfterChoiceDef_12_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_12_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_12_1_black = pattern_ChoiceAfterChoiceDef_12_1_blackFBB(eClass,
					_this);
			if (result_pattern_ChoiceAfterChoiceDef_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_1_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ChoiceAfterChoiceDef";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevStep");
		EObject _localVariable_1 = match.getObject("step");
		EObject _localVariable_2 = match.getObject("flow");
		EObject tmpPrevStep = _localVariable_0;
		EObject tmpStep = _localVariable_1;
		EObject tmpFlow = _localVariable_2;
		if (tmpPrevStep instanceof ChoiceStep) {
			ChoiceStep prevStep = (ChoiceStep) tmpPrevStep;
			if (tmpStep instanceof ChoiceStep) {
				ChoiceStep step = (ChoiceStep) tmpStep;
				if (tmpFlow instanceof Flow) {
					Flow flow = (Flow) tmpFlow;
					return new Object[] { prevStep, step, flow, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_12_2_blackFBFBBB(ChoiceStep prevStep,
			ChoiceStep step, Flow flow, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			for (GW2S eg2cs : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(prevStep, GW2S.class,
					"target")) {
				Gateway tmpPrevNode = eg2cs.getSource();
				if (tmpPrevNode instanceof ExclusiveGateway) {
					ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
					boolean prevNodeisDiverging = prevNode.isIsDiverging();
					if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
						_result.add(new Object[] { prevNode, prevStep, eg2cs, step, flow, match });
					}

				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_12_3_blackBBBBBF(ExclusiveGateway prevNode,
			ChoiceStep prevStep, GW2S eg2cs, ChoiceStep step, Flow flow) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!prevStep.equals(step)) {
			if (step.equals(prevStep.getNext())) {
				if (prevNode.equals(eg2cs.getSource())) {
					if (prevStep.equals(eg2cs.getTarget())) {
						if (flow.getSteps().contains(prevStep)) {
							if (flow.getSteps().contains(step)) {
								boolean prevNodeisDiverging = prevNode.isIsDiverging();
								if (Boolean.valueOf(prevNodeisDiverging).equals(Boolean.valueOf(true))) {
									for (de.abilov.bpmn.Process process : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(prevNode, de.abilov.bpmn.Process.class,
													"flowElements")) {
										_result.add(new Object[] { prevNode, prevStep, eg2cs, step, flow, process });
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_3_greenBBBBBBFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep prevStep, GW2S eg2cs, ChoiceStep step, Flow flow, de.abilov.bpmn.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eg2cs__prevStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String prevStep__step____next_name_prime = "next";
		String eg2cs__prevNode____source_name_prime = "source";
		String eg2cs__prevStep____target_name_prime = "target";
		String flow__prevStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(eg2cs);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(process);
		prevStep__step____next.setSrc(prevStep);
		prevStep__step____next.setTrg(step);
		isApplicableMatch.getAllContextElements().add(prevStep__step____next);
		eg2cs__prevNode____source.setSrc(eg2cs);
		eg2cs__prevNode____source.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevNode____source);
		eg2cs__prevStep____target.setSrc(eg2cs);
		eg2cs__prevStep____target.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(eg2cs__prevStep____target);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(flow__prevStep____steps);
		flow__step____steps.setSrc(flow);
		flow__step____steps.setTrg(step);
		isApplicableMatch.getAllContextElements().add(flow__step____steps);
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		eg2cs__prevNode____source.setName(eg2cs__prevNode____source_name_prime);
		eg2cs__prevStep____target.setName(eg2cs__prevStep____target_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { prevNode, prevStep, eg2cs, step, flow, process, isApplicableMatch, prevStep__step____next,
				eg2cs__prevNode____source, eg2cs__prevStep____target, flow__prevStep____steps, flow__step____steps,
				process__prevNode____flowElements };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_4_bindingFBBBBBBBB(ChoiceAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep prevStep, GW2S eg2cs,
			ChoiceStep step, Flow flow, de.abilov.bpmn.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, prevNode, prevStep, eg2cs, step, flow,
				process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, eg2cs, step, flow, process };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_4_bindingAndBlackFBBBBBBBB(ChoiceAfterChoiceDef _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep prevStep, GW2S eg2cs,
			ChoiceStep step, Flow flow, de.abilov.bpmn.Process process) {
		Object[] result_pattern_ChoiceAfterChoiceDef_12_4_binding = pattern_ChoiceAfterChoiceDef_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, prevNode, prevStep, eg2cs, step, flow, process);
		if (result_pattern_ChoiceAfterChoiceDef_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterChoiceDef_12_4_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_12_4_black = pattern_ChoiceAfterChoiceDef_12_4_blackB(csp);
			if (result_pattern_ChoiceAfterChoiceDef_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, prevStep, eg2cs, step, flow, process };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_12_5_expressionFBB(ChoiceAfterChoiceDef _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_6_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_12_6_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ChoiceAfterChoiceDef";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ChoiceAfterChoiceDef_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_20_1_binding = pattern_ChoiceAfterChoiceDef_20_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_20_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_20_1_black = pattern_ChoiceAfterChoiceDef_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_854747 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_854747)) {
							if (!egw.equals(__DEC_sf1_default_854747)) {
								if (!ecgw.equals(__DEC_sf1_default_854747)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_609338 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_609338)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_224938 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_224938)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_545457 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_545457)) {
							if (!prevNode.equals(__DEC_egw___conv_545457)) {
								if (!ecgw.equals(__DEC_egw___conv_545457)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_16503 = ecgw.get__conv();
					if (__DEC_ecgw___conv_16503 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_16503)) {
							if (!prevNode.equals(__DEC_ecgw___conv_16503)) {
								if (!egw.equals(__DEC_ecgw___conv_16503)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_744074 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_744074)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_153165 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_153165)) {
							if (!prevNode.equals(__DEC_ecgw___conv_153165)) {
								if (!egw.equals(__DEC_ecgw___conv_153165)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_7BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_8BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_9BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_black_nac_10BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_20_2_blackFFFFFB(EMoflonEdge _edge_default) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_default.getSrc();
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_default.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (sf1.equals(prevNode.getDefault())) {
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
														if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_7BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_9BB(
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_0BBBB(
																		sf1, prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_8BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_10BB(
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
																										if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoiceDef_20_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	prevNode,
																																	sf1,
																																	process,
																																	egw,
																																	ecgw,
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
																}
															}
														}
													}

												}

											}
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_20_3_expressionFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_20_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_20_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_21_1_binding = pattern_ChoiceAfterChoiceDef_21_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_21_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_21_1_black = pattern_ChoiceAfterChoiceDef_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_755857 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_755857)) {
							if (!egw.equals(__DEC_sf1_default_755857)) {
								if (!ecgw.equals(__DEC_sf1_default_755857)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_457669 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_457669)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_628175 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_628175)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_599171 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_599171)) {
							if (!prevNode.equals(__DEC_egw___conv_599171)) {
								if (!ecgw.equals(__DEC_egw___conv_599171)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_229026 = ecgw.get__conv();
					if (__DEC_ecgw___conv_229026 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_229026)) {
							if (!prevNode.equals(__DEC_ecgw___conv_229026)) {
								if (!egw.equals(__DEC_ecgw___conv_229026)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_763059 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_763059)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_961653 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_961653)) {
							if (!prevNode.equals(__DEC_ecgw___conv_961653)) {
								if (!egw.equals(__DEC_ecgw___conv_961653)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_7BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_8BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_9BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_black_nac_10BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_21_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSf1 = _edge_sourceRef.getSrc();
		if (tmpSf1 instanceof SequenceFlow) {
			SequenceFlow sf1 = (SequenceFlow) tmpSf1;
			EObject tmpPrevNode = _edge_sourceRef.getTrg();
			if (tmpPrevNode instanceof ExclusiveGateway) {
				ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
				if (sf1.equals(prevNode.getDefault())) {
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
														if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_7BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_9BB(
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_0BBBB(
																		sf1, prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_8BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_10BB(
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
																										if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoiceDef_21_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	prevNode,
																																	sf1,
																																	process,
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_21_3_expressionFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_21_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_21_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_22_1_binding = pattern_ChoiceAfterChoiceDef_22_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_22_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_22_1_black = pattern_ChoiceAfterChoiceDef_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_334279 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_334279)) {
							if (!egw.equals(__DEC_sf1_default_334279)) {
								if (!ecgw.equals(__DEC_sf1_default_334279)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_38941 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_38941)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_755938 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_755938)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_985765 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_985765)) {
							if (!prevNode.equals(__DEC_egw___conv_985765)) {
								if (!ecgw.equals(__DEC_egw___conv_985765)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_713937 = ecgw.get__conv();
					if (__DEC_ecgw___conv_713937 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_713937)) {
							if (!prevNode.equals(__DEC_ecgw___conv_713937)) {
								if (!egw.equals(__DEC_ecgw___conv_713937)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_606391 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_606391)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_31549 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_31549)) {
							if (!prevNode.equals(__DEC_ecgw___conv_31549)) {
								if (!egw.equals(__DEC_ecgw___conv_31549)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_7BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_8BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_9BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_black_nac_10BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_22_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevNode = _edge_outgoing.getSrc();
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			EObject tmpSf1 = _edge_outgoing.getTrg();
			if (tmpSf1 instanceof SequenceFlow) {
				SequenceFlow sf1 = (SequenceFlow) tmpSf1;
				if (sf1.equals(prevNode.getDefault())) {
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
														if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_7BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_9BB(
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_0BBBB(
																		sf1, prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_8BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_10BB(
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
																										if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoiceDef_22_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	prevNode,
																																	sf1,
																																	process,
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_22_3_expressionFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_22_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_22_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_22_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_23_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_23_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_23_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_23_1_binding = pattern_ChoiceAfterChoiceDef_23_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_23_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_23_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_23_1_black = pattern_ChoiceAfterChoiceDef_23_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_23_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_23_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_23_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_23_2_black_nac_0BB(ChoiceStep step, Flow flow) {
		for (Flow __DEC_step_steps_20403 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_20403)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_23_2_black_nac_1BB(ChoiceStep step, ChoiceStep prevStep) {
		if (!prevStep.equals(step)) {
			for (Step __DEC_step_next_26780 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_26780)) {
					if (!prevStep.equals(__DEC_step_next_26780)) {
						return new Object[] { step, prevStep };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_23_2_blackFFFB(EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPrevStep = _edge_next.getSrc();
		if (tmpPrevStep instanceof ChoiceStep) {
			ChoiceStep prevStep = (ChoiceStep) tmpPrevStep;
			EObject tmpStep = _edge_next.getTrg();
			if (tmpStep instanceof ChoiceStep) {
				ChoiceStep step = (ChoiceStep) tmpStep;
				if (!prevStep.equals(step)) {
					if (step.equals(prevStep.getNext())) {
						if (pattern_ChoiceAfterChoiceDef_23_2_black_nac_1BB(step, prevStep) == null) {
							for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(prevStep, Flow.class, "steps")) {
								if (flow.getSteps().contains(step)) {
									if (pattern_ChoiceAfterChoiceDef_23_2_black_nac_0BB(step, flow) == null) {
										_result.add(new Object[] { prevStep, step, flow, _edge_next });
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_23_3_expressionFBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ChoiceStep prevStep, ChoiceStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_23_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_23_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_23_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_23_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_24_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_24_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_24_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_24_1_binding = pattern_ChoiceAfterChoiceDef_24_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_24_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_24_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_24_1_black = pattern_ChoiceAfterChoiceDef_24_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_24_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_24_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_24_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_24_2_black_nac_0BB(ChoiceStep step, Flow flow) {
		for (Flow __DEC_step_steps_652578 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_652578)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_24_2_black_nac_1BB(ChoiceStep step, ChoiceStep prevStep) {
		if (!prevStep.equals(step)) {
			for (Step __DEC_step_next_497402 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
					Step.class, "next")) {
				if (!step.equals(__DEC_step_next_497402)) {
					if (!prevStep.equals(__DEC_step_next_497402)) {
						return new Object[] { step, prevStep };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_24_2_blackFFFB(EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFlow = _edge_steps.getSrc();
		if (tmpFlow instanceof Flow) {
			Flow flow = (Flow) tmpFlow;
			EObject tmpStep = _edge_steps.getTrg();
			if (tmpStep instanceof ChoiceStep) {
				ChoiceStep step = (ChoiceStep) tmpStep;
				if (flow.getSteps().contains(step)) {
					if (pattern_ChoiceAfterChoiceDef_24_2_black_nac_0BB(step, flow) == null) {
						for (Step tmpPrevStep : flow.getSteps()) {
							if (tmpPrevStep instanceof ChoiceStep) {
								ChoiceStep prevStep = (ChoiceStep) tmpPrevStep;
								if (!prevStep.equals(step)) {
									if (step.equals(prevStep.getNext())) {
										if (pattern_ChoiceAfterChoiceDef_24_2_black_nac_1BB(step, prevStep) == null) {
											_result.add(new Object[] { prevStep, step, flow, _edge_steps });
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_24_3_expressionFBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ChoiceStep prevStep, ChoiceStep step, Flow flow) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, prevStep, step, flow);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_24_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_24_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_24_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_24_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_25_1_binding = pattern_ChoiceAfterChoiceDef_25_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_25_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_25_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_25_1_black = pattern_ChoiceAfterChoiceDef_25_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_25_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_25_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_18482 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_18482)) {
							if (!egw.equals(__DEC_sf1_default_18482)) {
								if (!ecgw.equals(__DEC_sf1_default_18482)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_126356 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_126356)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_427661 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_427661)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_632511 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_632511)) {
							if (!prevNode.equals(__DEC_egw___conv_632511)) {
								if (!ecgw.equals(__DEC_egw___conv_632511)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_120267 = ecgw.get__conv();
					if (__DEC_ecgw___conv_120267 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_120267)) {
							if (!prevNode.equals(__DEC_ecgw___conv_120267)) {
								if (!egw.equals(__DEC_ecgw___conv_120267)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_882401 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_882401)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_41425 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_41425)) {
							if (!prevNode.equals(__DEC_ecgw___conv_41425)) {
								if (!egw.equals(__DEC_ecgw___conv_41425)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_7BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_8BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_9BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_black_nac_10BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_25_2_blackFFFFFB(
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
						if (sf1.equals(prevNode.getDefault())) {
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
																	if (Boolean.valueOf(ecgwisDiverging)
																			.equals(false)) {
																		if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_1BB(
																				sf1, process) == null) {
																			if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_2BB(
																					egw, process) == null) {
																				if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_7BB(
																						egw, sf1) == null) {
																					if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_9BB(
																							prevNode, egw) == null) {
																						if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_0BBBB(
																								sf1, prevNode, egw,
																								ecgw) == null) {
																							if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_3BBB(
																									egw, prevNode,
																									ecgw) == null) {
																								if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_4BBB(
																										ecgw, prevNode,
																										egw) == null) {
																									if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_5BB(
																											ecgw,
																											process) == null) {
																										if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_6BBB(
																												ecgw,
																												prevNode,
																												egw) == null) {
																											if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_8BB(
																													ecgw,
																													sf1) == null) {
																												if (pattern_ChoiceAfterChoiceDef_25_2_black_nac_10BB(
																														ecgw,
																														prevNode) == null) {
																													_result.add(
																															new Object[] {
																																	prevNode,
																																	sf1,
																																	process,
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_25_3_expressionFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_25_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_25_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_25_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_26_1_binding = pattern_ChoiceAfterChoiceDef_26_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_26_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_26_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_26_1_black = pattern_ChoiceAfterChoiceDef_26_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_26_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_26_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_897493 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_897493)) {
							if (!egw.equals(__DEC_sf1_default_897493)) {
								if (!ecgw.equals(__DEC_sf1_default_897493)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_261848 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_261848)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_973903 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_973903)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_685158 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_685158)) {
							if (!prevNode.equals(__DEC_egw___conv_685158)) {
								if (!ecgw.equals(__DEC_egw___conv_685158)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_228431 = ecgw.get__conv();
					if (__DEC_ecgw___conv_228431 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_228431)) {
							if (!prevNode.equals(__DEC_ecgw___conv_228431)) {
								if (!egw.equals(__DEC_ecgw___conv_228431)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_994556 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_994556)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_812830 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_812830)) {
							if (!prevNode.equals(__DEC_ecgw___conv_812830)) {
								if (!egw.equals(__DEC_ecgw___conv_812830)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_7BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_8BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_9BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_black_nac_10BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_26_2_blackFFFFFB(
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
										if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_2BB(egw, process) == null) {
											if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_5BB(ecgw,
													process) == null) {
												for (FlowElement tmpPrevNode : process.getFlowElements()) {
													if (tmpPrevNode instanceof ExclusiveGateway) {
														ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
														if (!egw.equals(prevNode)) {
															if (!ecgw.equals(prevNode)) {
																SequenceFlow sf1 = prevNode.getDefault();
																if (sf1 != null) {
																	if (prevNode.equals(sf1.getSourceRef())) {
																		if (process.getFlowElements().contains(sf1)) {
																			if (egw.equals(sf1.getTargetRef())) {
																				boolean prevNodeisDiverging = prevNode
																						.isIsDiverging();
																				if (Boolean.valueOf(prevNodeisDiverging)
																						.equals(Boolean
																								.valueOf(true))) {
																					if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_3BBB(
																							egw, prevNode,
																							ecgw) == null) {
																						if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_4BBB(
																								ecgw, prevNode,
																								egw) == null) {
																							if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_6BBB(
																									ecgw, prevNode,
																									egw) == null) {
																								if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_9BB(
																										prevNode,
																										egw) == null) {
																									if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_10BB(
																											ecgw,
																											prevNode) == null) {
																										if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_0BBBB(
																												sf1,
																												prevNode,
																												egw,
																												ecgw) == null) {
																											if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_1BB(
																													sf1,
																													process) == null) {
																												if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_7BB(
																														egw,
																														sf1) == null) {
																													if (pattern_ChoiceAfterChoiceDef_26_2_black_nac_8BB(
																															ecgw,
																															sf1) == null) {
																														_result.add(
																																new Object[] {
																																		prevNode,
																																		sf1,
																																		process,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_26_3_expressionFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_26_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_26_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_26_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_27_1_binding = pattern_ChoiceAfterChoiceDef_27_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_27_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_27_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_27_1_black = pattern_ChoiceAfterChoiceDef_27_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_27_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_27_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_26998 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_26998)) {
							if (!egw.equals(__DEC_sf1_default_26998)) {
								if (!ecgw.equals(__DEC_sf1_default_26998)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_829602 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_829602)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_805867 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_805867)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_935186 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_935186)) {
							if (!prevNode.equals(__DEC_egw___conv_935186)) {
								if (!ecgw.equals(__DEC_egw___conv_935186)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_87425 = ecgw.get__conv();
					if (__DEC_ecgw___conv_87425 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_87425)) {
							if (!prevNode.equals(__DEC_ecgw___conv_87425)) {
								if (!egw.equals(__DEC_ecgw___conv_87425)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_543682 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_543682)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_397386 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_397386)) {
							if (!prevNode.equals(__DEC_ecgw___conv_397386)) {
								if (!egw.equals(__DEC_ecgw___conv_397386)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_7BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_8BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_9BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_black_nac_10BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_27_2_blackFFFFFB(
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
						if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_5BB(ecgw, process) == null) {
							for (FlowElement tmpPrevNode : process.getFlowElements()) {
								if (tmpPrevNode instanceof ExclusiveGateway) {
									ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
									if (!ecgw.equals(prevNode)) {
										SequenceFlow sf1 = prevNode.getDefault();
										if (sf1 != null) {
											if (prevNode.equals(sf1.getSourceRef())) {
												if (process.getFlowElements().contains(sf1)) {
													boolean prevNodeisDiverging = prevNode.isIsDiverging();
													if (Boolean.valueOf(prevNodeisDiverging)
															.equals(Boolean.valueOf(true))) {
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
																					.equals(Boolean.valueOf(true))) {
																				if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_10BB(
																						ecgw, prevNode) == null) {
																					if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_1BB(
																							sf1, process) == null) {
																						if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_8BB(
																								ecgw, sf1) == null) {
																							if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_0BBBB(
																									sf1, prevNode, egw,
																									ecgw) == null) {
																								if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_2BB(
																										egw,
																										process) == null) {
																									if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_3BBB(
																											egw,
																											prevNode,
																											ecgw) == null) {
																										if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_4BBB(
																												ecgw,
																												prevNode,
																												egw) == null) {
																											if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_6BBB(
																													ecgw,
																													prevNode,
																													egw) == null) {
																												if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_7BB(
																														egw,
																														sf1) == null) {
																													if (pattern_ChoiceAfterChoiceDef_27_2_black_nac_9BB(
																															prevNode,
																															egw) == null) {
																														_result.add(
																																new Object[] {
																																		prevNode,
																																		sf1,
																																		process,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_27_3_expressionFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_27_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_27_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_27_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_28_1_binding = pattern_ChoiceAfterChoiceDef_28_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_28_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_28_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_28_1_black = pattern_ChoiceAfterChoiceDef_28_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_28_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_28_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_25230 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_25230)) {
							if (!egw.equals(__DEC_sf1_default_25230)) {
								if (!ecgw.equals(__DEC_sf1_default_25230)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_457230 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_457230)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_922741 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_922741)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_571809 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_571809)) {
							if (!prevNode.equals(__DEC_egw___conv_571809)) {
								if (!ecgw.equals(__DEC_egw___conv_571809)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_848991 = ecgw.get__conv();
					if (__DEC_ecgw___conv_848991 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_848991)) {
							if (!prevNode.equals(__DEC_ecgw___conv_848991)) {
								if (!egw.equals(__DEC_ecgw___conv_848991)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_807206 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_807206)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_749326 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_749326)) {
							if (!prevNode.equals(__DEC_ecgw___conv_749326)) {
								if (!egw.equals(__DEC_ecgw___conv_749326)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_7BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_8BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_9BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_black_nac_10BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_28_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
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
							if (sf1.equals(prevNode.getDefault())) {
								Gateway tmpEcgw = egw.get__conv();
								if (tmpEcgw instanceof ExclusiveGateway) {
									ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
									if (!ecgw.equals(prevNode)) {
										if (!ecgw.equals(egw)) {
											boolean egwisDiverging = egw.isIsDiverging();
											if (Boolean.valueOf(egwisDiverging).equals(Boolean.valueOf(true))) {
												boolean prevNodeisDiverging = prevNode.isIsDiverging();
												if (Boolean.valueOf(prevNodeisDiverging)
														.equals(Boolean.valueOf(true))) {
													boolean ecgwisDiverging = ecgw.isIsDiverging();
													if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
														if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_7BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_9BB(
																	prevNode, egw) == null) {
																if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_0BBBB(
																		sf1, prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_8BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_10BB(
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
																										if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoiceDef_28_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	prevNode,
																																	sf1,
																																	process,
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_28_3_expressionFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_28_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_28_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_28_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_29_1_binding = pattern_ChoiceAfterChoiceDef_29_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_29_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_29_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_29_1_black = pattern_ChoiceAfterChoiceDef_29_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_29_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_29_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_608276 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_608276)) {
							if (!egw.equals(__DEC_sf1_default_608276)) {
								if (!ecgw.equals(__DEC_sf1_default_608276)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_764842 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_764842)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_256984 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_256984)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_164158 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_164158)) {
							if (!prevNode.equals(__DEC_egw___conv_164158)) {
								if (!ecgw.equals(__DEC_egw___conv_164158)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_264339 = ecgw.get__conv();
					if (__DEC_ecgw___conv_264339 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_264339)) {
							if (!prevNode.equals(__DEC_ecgw___conv_264339)) {
								if (!egw.equals(__DEC_ecgw___conv_264339)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_151741 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_151741)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_319829 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_319829)) {
							if (!prevNode.equals(__DEC_ecgw___conv_319829)) {
								if (!egw.equals(__DEC_ecgw___conv_319829)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_7BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_8BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_9BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_black_nac_10BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_29_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
											if (sf1.equals(prevNode.getDefault())) {
												boolean ecgwisDiverging = ecgw.isIsDiverging();
												if (Boolean.valueOf(ecgwisDiverging).equals(false)) {
													boolean prevNodeisDiverging = prevNode.isIsDiverging();
													if (Boolean.valueOf(prevNodeisDiverging)
															.equals(Boolean.valueOf(true))) {
														if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_7BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_8BB(ecgw,
																	sf1) == null) {
																if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_0BBBB(
																		sf1, prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_9BB(
																						prevNode, egw) == null) {
																					if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_10BB(
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
																										if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoiceDef_29_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	prevNode,
																																	sf1,
																																	process,
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_29_3_expressionFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_29_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_29_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_29_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_1_bindingFB(ChoiceAfterChoiceDef _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_1_blackFBB(EClass __eClass,
			ChoiceAfterChoiceDef _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_1_bindingAndBlackFFB(ChoiceAfterChoiceDef _this) {
		Object[] result_pattern_ChoiceAfterChoiceDef_30_1_binding = pattern_ChoiceAfterChoiceDef_30_1_bindingFB(_this);
		if (result_pattern_ChoiceAfterChoiceDef_30_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ChoiceAfterChoiceDef_30_1_binding[0];

			Object[] result_pattern_ChoiceAfterChoiceDef_30_1_black = pattern_ChoiceAfterChoiceDef_30_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ChoiceAfterChoiceDef_30_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ChoiceAfterChoiceDef_30_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_745445 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_745445)) {
							if (!egw.equals(__DEC_sf1_default_745445)) {
								if (!ecgw.equals(__DEC_sf1_default_745445)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_1BB(SequenceFlow sf1,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_sf1_flowElements_832795 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_832795)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_2BB(ExclusiveGateway egw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_egw_flowElements_49843 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_49843)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_820904 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_820904)) {
							if (!prevNode.equals(__DEC_egw___conv_820904)) {
								if (!ecgw.equals(__DEC_egw___conv_820904)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_854540 = ecgw.get__conv();
					if (__DEC_ecgw___conv_854540 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_854540)) {
							if (!prevNode.equals(__DEC_ecgw___conv_854540)) {
								if (!egw.equals(__DEC_ecgw___conv_854540)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_5BB(ExclusiveGateway ecgw,
			de.abilov.bpmn.Process process) {
		for (de.abilov.bpmn.Process __DEC_ecgw_flowElements_2917 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, de.abilov.bpmn.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_2917)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_543541 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_543541)) {
							if (!prevNode.equals(__DEC_ecgw___conv_543541)) {
								if (!egw.equals(__DEC_ecgw___conv_543541)) {
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_7BB(ExclusiveGateway egw,
			SequenceFlow sf1) {
		if (sf1.equals(egw.getDefault())) {
			return new Object[] { egw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_8BB(ExclusiveGateway ecgw,
			SequenceFlow sf1) {
		if (sf1.equals(ecgw.getDefault())) {
			return new Object[] { ecgw, sf1 };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_9BB(ExclusiveGateway prevNode,
			ExclusiveGateway egw) {
		if (egw.equals(prevNode.get__conv())) {
			return new Object[] { prevNode, egw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_black_nac_10BB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode) {
		if (prevNode.equals(ecgw.get__conv())) {
			return new Object[] { ecgw, prevNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterChoiceDef_30_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
												if (sf1.equals(prevNode.getDefault())) {
													boolean prevNodeisDiverging = prevNode.isIsDiverging();
													if (Boolean.valueOf(prevNodeisDiverging)
															.equals(Boolean.valueOf(true))) {
														if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_7BB(egw,
																sf1) == null) {
															if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_8BB(ecgw,
																	sf1) == null) {
																if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_0BBBB(
																		sf1, prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_9BB(
																						prevNode, egw) == null) {
																					if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_10BB(
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
																										if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_1BB(
																												sf1,
																												process) == null) {
																											if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_2BB(
																													egw,
																													process) == null) {
																												if (pattern_ChoiceAfterChoiceDef_30_2_black_nac_5BB(
																														ecgw,
																														process) == null) {
																													_result.add(
																															new Object[] {
																																	prevNode,
																																	sf1,
																																	process,
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

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterChoiceDef_30_3_expressionFBBBBBBB(ChoiceAfterChoiceDef _this,
			Match match, ExclusiveGateway prevNode, SequenceFlow sf1, de.abilov.bpmn.Process process,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, sf1, process, egw, ecgw);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterChoiceDef_30_4_expressionFBB(ChoiceAfterChoiceDef _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_5_blackBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ChoiceAfterChoiceDef_30_5_greenBBB(Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ChoiceAfterChoiceDef_30_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ChoiceAfterChoiceDefImpl
