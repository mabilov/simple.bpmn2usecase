/**
 */
package bpmn2UseCase.Rules.impl;

import SimpleBPMN.ExclusiveGateway;
import SimpleBPMN.FlowElement;
import SimpleBPMN.FlowNode;
import SimpleBPMN.Gateway;
import SimpleBPMN.SequenceFlow;
import SimpleBPMN.SimpleBPMNFactory;

import SimpleUseCase.ChoiceStep;
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
import bpmn2UseCase.GW2S;

import bpmn2UseCase.Rules.ChoiceAfterMerge;
import bpmn2UseCase.Rules.RulesPackage;

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
	public boolean isAppropriate_FWD(Match match, ExclusiveGateway prevNode, SimpleBPMN.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		// initial bindings
		Object[] result1_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_1_blackBBBBBBB(this, match, prevNode,
				process, sf1, egw, ecgw);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed." + " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process
							+ ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ChoiceAfterMergeImpl
				.pattern_ChoiceAfterMerge_0_2_bindingAndBlackFBBBBBBB(this, match, prevNode, process, sf1, egw, ecgw);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [Solve CSP] failed." + " Variables: " + "[this] = "
					+ this + ", " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = "
					+ process + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_4_blackBBBBBB(match, prevNode,
					process, sf1, egw, ecgw);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching in node [collect elements to be translated] failed."
						+ " Variables: " + "[match] = " + match + ", " + "[prevNode] = " + prevNode + ", "
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
			Object[] result5_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_5_blackBBBBBB(match, prevNode,
					process, sf1, egw, ecgw);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed." + " Variables: " + "[match] = "
								+ match + ", " + "[prevNode] = " + prevNode + ", " + "[process] = " + process + ", "
								+ "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", " + "[ecgw] = " + ecgw + ".");
			}
			ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_5_greenBBBF(match, prevNode, process);
			// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result5_green[3];

			// register objects to match
			ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_0_6_expressionBBBBBBB(this, match, prevNode, process, sf1,
					egw, ecgw);
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
				.pattern_ChoiceAfterMerge_1_1_bindingAndBlackFFFFFFFFFBFB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching in node [perform transformation] failed." + " Variables: "
					+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result1_bindingAndBlack[0];
		ChoiceStep choiceStep = (ChoiceStep) result1_bindingAndBlack[1];
		GW2S pn2cs = (GW2S) result1_bindingAndBlack[2];
		Step prevStep = (Step) result1_bindingAndBlack[3];
		Flow flow = (Flow) result1_bindingAndBlack[4];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[5];
		SequenceFlow sf1 = (SequenceFlow) result1_bindingAndBlack[6];
		ExclusiveGateway egw = (ExclusiveGateway) result1_bindingAndBlack[7];
		ExclusiveGateway ecgw = (ExclusiveGateway) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[10];
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
		Object[] result3_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_1_3_blackBBBBBBBBBBBBB(ruleresult,
				prevNode, choiceStep, pn2cs, prevStep, flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
					+ flow + ", " + "[step] = " + step + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1
					+ ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", "
					+ "[ecgwToStep] = " + ecgwToStep + ".");
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
		ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_1_5_expressionBBBBBBBBBBBBBB(this, ruleresult, prevNode,
				choiceStep, pn2cs, prevStep, flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
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
		Object[] result2_binding = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_2_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ExclusiveGateway prevNode = (ExclusiveGateway) result2_binding[0];
		SimpleBPMN.Process process = (SimpleBPMN.Process) result2_binding[1];
		SequenceFlow sf1 = (SequenceFlow) result2_binding[2];
		ExclusiveGateway egw = (ExclusiveGateway) result2_binding[3];
		ExclusiveGateway ecgw = (ExclusiveGateway) result2_binding[4];
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_2_blackBFFBBBBB(prevNode, process,
				sf1, egw, ecgw, match)) {
			ChoiceStep choiceStep = (ChoiceStep) result2_black[1];
			GW2S pn2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_2_3_blackBBBFFBBBB(prevNode,
					choiceStep, pn2cs, process, sf1, egw, ecgw)) {
				Step prevStep = (Step) result3_black[3];
				Flow flow = (Flow) result3_black[4];
				Object[] result3_green = ChoiceAfterMergeImpl
						.pattern_ChoiceAfterMerge_2_3_greenBBBBBBBBBFFFFFFFFFFFFFFF(prevNode, choiceStep, pn2cs,
								prevStep, flow, process, sf1, egw, ecgw);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge choiceStep__prevStep______lastInDef = (EMoflonEdge) result3_green[10];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[11];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[12];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[15];
				// EMoflonEdge process__sf1____flowElements = (EMoflonEdge) result3_green[16];
				// EMoflonEdge process__egw____flowElements = (EMoflonEdge) result3_green[17];
				// EMoflonEdge process__ecgw____flowElements = (EMoflonEdge) result3_green[18];
				// EMoflonEdge sf1__prevNode____sourceRef = (EMoflonEdge) result3_green[19];
				// EMoflonEdge prevNode__sf1____outgoing = (EMoflonEdge) result3_green[20];
				// EMoflonEdge sf1__egw____targetRef = (EMoflonEdge) result3_green[21];
				// EMoflonEdge egw__sf1____incoming = (EMoflonEdge) result3_green[22];
				// EMoflonEdge egw__ecgw______conv = (EMoflonEdge) result3_green[23];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterMergeImpl
						.pattern_ChoiceAfterMerge_2_4_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch, prevNode,
								choiceStep, pn2cs, prevStep, flow, process, sf1, egw, ecgw);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", "
							+ "[process] = " + process + ", " + "[sf1] = " + sf1 + ", " + "[egw] = " + egw + ", "
							+ "[ecgw] = " + ecgw + ".");
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
	public void registerObjectsToMatch_FWD(Match match, ExclusiveGateway prevNode, SimpleBPMN.Process process,
			SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, ExclusiveGateway prevNode, SimpleBPMN.Process process,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1,
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
		isApplicableMatch.registerObject("choiceStep", choiceStep);
		isApplicableMatch.registerObject("pn2cs", pn2cs);
		isApplicableMatch.registerObject("prevStep", prevStep);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs,
			EObject prevStep, EObject flow, EObject step, EObject process, EObject sf1, EObject egw, EObject egwToStep,
			EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
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
		return true && match.getObject("sf1").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getSequenceFlow())
				&& match.getObject("egw").eClass().equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getExclusiveGateway())
				&& match.getObject("ecgw").eClass()
						.equals(SimpleBPMN.SimpleBPMNPackage.eINSTANCE.getExclusiveGateway());
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
			ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_10_5_greenBBBBFFF(match, choiceStep, prevStep, flow);
			// EMoflonEdge choiceStep__prevStep______lastInDef = (EMoflonEdge) result5_green[4];
			// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result5_green[5];
			// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result5_green[6];

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
				.pattern_ChoiceAfterMerge_11_1_bindingAndBlackFFFFFFFBFB(this, isApplicableMatch);
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
		SimpleBPMN.Process process = (SimpleBPMN.Process) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[8];
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
		Object[] result3_black = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_11_3_blackBBBBBBBBBBBBB(ruleresult,
				prevNode, choiceStep, pn2cs, prevStep, flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching in node [bookkeeping for edges] failed." + " Variables: "
					+ "[ruleresult] = " + ruleresult + ", " + "[prevNode] = " + prevNode + ", " + "[choiceStep] = "
					+ choiceStep + ", " + "[pn2cs] = " + pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = "
					+ flow + ", " + "[step] = " + step + ", " + "[process] = " + process + ", " + "[sf1] = " + sf1
					+ ", " + "[egw] = " + egw + ", " + "[egwToStep] = " + egwToStep + ", " + "[ecgw] = " + ecgw + ", "
					+ "[ecgwToStep] = " + ecgwToStep + ".");
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
		ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_11_5_expressionBBBBBBBBBBBBBB(this, ruleresult, prevNode,
				choiceStep, pn2cs, prevStep, flow, step, process, sf1, egw, egwToStep, ecgw, ecgwToStep);
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
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_2_blackFBFBBBB(choiceStep,
				prevStep, flow, step, match)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			GW2S pn2cs = (GW2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_3_blackBBBBBBF(prevNode,
					choiceStep, pn2cs, prevStep, flow, step)) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) result3_black[6];
				Object[] result3_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_12_3_greenBBBBBBBFFFFFFFFF(
						prevNode, choiceStep, pn2cs, prevStep, flow, step, process);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				// EMoflonEdge choiceStep__prevStep______lastInDef = (EMoflonEdge) result3_green[8];
				// EMoflonEdge pn2cs__prevNode____source = (EMoflonEdge) result3_green[9];
				// EMoflonEdge pn2cs__choiceStep____target = (EMoflonEdge) result3_green[10];
				// EMoflonEdge prevStep__step____next = (EMoflonEdge) result3_green[11];
				// EMoflonEdge flow__choiceStep____steps = (EMoflonEdge) result3_green[12];
				// EMoflonEdge flow__prevStep____steps = (EMoflonEdge) result3_green[13];
				// EMoflonEdge flow__step____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge process__prevNode____flowElements = (EMoflonEdge) result3_green[15];

				// solve CSP
				Object[] result4_bindingAndBlack = ChoiceAfterMergeImpl
						.pattern_ChoiceAfterMerge_12_4_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, prevNode,
								choiceStep, pn2cs, prevStep, flow, step, process);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching in node [solve CSP] failed." + " Variables: "
							+ "[this] = " + this + ", " + "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[prevNode] = " + prevNode + ", " + "[choiceStep] = " + choiceStep + ", " + "[pn2cs] = "
							+ pn2cs + ", " + "[prevStep] = " + prevStep + ", " + "[flow] = " + flow + ", " + "[step] = "
							+ step + ", " + "[process] = " + process + ".");
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
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, SimpleBPMN.Process process) {// Create CSP
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
			EObject prevStep, EObject flow, EObject step, EObject process, EObject sf1, EObject egw, EObject egwToStep,
			EObject ecgw, EObject ecgwToStep) {
		ruleresult.registerObject("prevNode", prevNode);
		ruleresult.registerObject("choiceStep", choiceStep);
		ruleresult.registerObject("pn2cs", pn2cs);
		ruleresult.registerObject("prevStep", prevStep);
		ruleresult.registerObject("flow", flow);
		ruleresult.registerObject("step", step);
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
				.equals(SimpleUseCase.SimpleUseCasePackage.eINSTANCE.getNormalStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_36(EMoflonEdge _edge_next) {
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_37(EMoflonEdge _edge_steps) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_122(EMoflonEdge _edge_flowElements) {
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
				.pattern_ChoiceAfterMerge_22_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_22_3_expressionFBBBBBBB(this, match, prevNode, process,
					sf1, egw, ecgw)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_123(EMoflonEdge _edge_flowElements) {
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
				.pattern_ChoiceAfterMerge_23_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_23_3_expressionFBBBBBBB(this, match, prevNode, process,
					sf1, egw, ecgw)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_124(EMoflonEdge _edge_flowElements) {
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
				.pattern_ChoiceAfterMerge_24_2_blackFFFFFB(_edge_flowElements)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_24_3_expressionFBBBBBBB(this, match, prevNode, process,
					sf1, egw, ecgw)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_125(EMoflonEdge _edge_sourceRef) {
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
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_2_blackFFFFFB(_edge_sourceRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_25_3_expressionFBBBBBBB(this, match, prevNode, process,
					sf1, egw, ecgw)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_126(EMoflonEdge _edge_outgoing) {
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
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_2_blackFFFFFB(_edge_outgoing)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_26_3_expressionFBBBBBBB(this, match, prevNode, process,
					sf1, egw, ecgw)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_127(EMoflonEdge _edge_targetRef) {
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
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_2_blackFFFFFB(_edge_targetRef)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_27_3_expressionFBBBBBBB(this, match, prevNode, process,
					sf1, egw, ecgw)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_128(EMoflonEdge _edge_incoming) {
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
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_2_blackFFFFFB(_edge_incoming)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_28_3_expressionFBBBBBBB(this, match, prevNode, process,
					sf1, egw, ecgw)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_129(EMoflonEdge _edge___conv) {
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
		for (Object[] result2_black : ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_2_blackFFFFFB(_edge___conv)) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result2_black[0];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result2_black[1];
			SequenceFlow sf1 = (SequenceFlow) result2_black[2];
			ExclusiveGateway egw = (ExclusiveGateway) result2_black[3];
			ExclusiveGateway ecgw = (ExclusiveGateway) result2_black[4];
			Object[] result2_green = ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ChoiceAfterMergeImpl.pattern_ChoiceAfterMerge_29_3_expressionFBBBBBBB(this, match, prevNode, process,
					sf1, egw, ecgw)) {
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
		SimpleBPMN.ExclusiveGateway prevNode = (SimpleBPMN.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		SimpleUseCase.ChoiceStep choiceStep = (SimpleUseCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		bpmn2UseCase.GW2S pn2cs = (bpmn2UseCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.Step prevStep = (SimpleUseCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egw")).findAny();
		SimpleBPMN.ExclusiveGateway egw = (SimpleBPMN.ExclusiveGateway) matchForEgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egwToStep")).findAny();
		bpmn2UseCase.GW2S egwToStep = (bpmn2UseCase.GW2S) matchForEgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgw")).findAny();
		SimpleBPMN.ExclusiveGateway ecgw = (SimpleBPMN.ExclusiveGateway) matchForEcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgwToStep")).findAny();
		bpmn2UseCase.GW2S ecgwToStep = (bpmn2UseCase.GW2S) matchForEcgwToStep.get().getNode();

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
		SimpleBPMN.ExclusiveGateway prevNode = (SimpleBPMN.ExclusiveGateway) matchForPrevNode.get().getNode();

		Optional<TripleMatchNodeMapping> matchForChoiceStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("choiceStep")).findAny();
		SimpleUseCase.ChoiceStep choiceStep = (SimpleUseCase.ChoiceStep) matchForChoiceStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPn2cs = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("pn2cs")).findAny();
		bpmn2UseCase.GW2S pn2cs = (bpmn2UseCase.GW2S) matchForPn2cs.get().getNode();

		Optional<TripleMatchNodeMapping> matchForPrevStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("prevStep")).findAny();
		SimpleUseCase.Step prevStep = (SimpleUseCase.Step) matchForPrevStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForFlow = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("flow")).findAny();
		SimpleUseCase.Flow flow = (SimpleUseCase.Flow) matchForFlow.get().getNode();

		Optional<TripleMatchNodeMapping> matchForStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("step")).findAny();
		SimpleUseCase.NormalStep step = (SimpleUseCase.NormalStep) matchForStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForProcess = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("process")).findAny();
		SimpleBPMN.Process process = (SimpleBPMN.Process) matchForProcess.get().getNode();

		Optional<TripleMatchNodeMapping> matchForSf1 = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("sf1")).findAny();
		SimpleBPMN.SequenceFlow sf1 = (SimpleBPMN.SequenceFlow) matchForSf1.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egw")).findAny();
		SimpleBPMN.ExclusiveGateway egw = (SimpleBPMN.ExclusiveGateway) matchForEgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("egwToStep")).findAny();
		bpmn2UseCase.GW2S egwToStep = (bpmn2UseCase.GW2S) matchForEgwToStep.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgw = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgw")).findAny();
		SimpleBPMN.ExclusiveGateway ecgw = (SimpleBPMN.ExclusiveGateway) matchForEcgw.get().getNode();

		Optional<TripleMatchNodeMapping> matchForEcgwToStep = __tripleMatch.getNodeMappings().stream()
				.filter(nm -> nm.getNodeName().equals("ecgwToStep")).findAny();
		bpmn2UseCase.GW2S ecgwToStep = (bpmn2UseCase.GW2S) matchForEcgwToStep.get().getNode();

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
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_MERGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
			return null;
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_EXCLUSIVEGATEWAY_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(SimpleBPMN.Process) arguments.get(2), (SequenceFlow) arguments.get(3),
					(ExclusiveGateway) arguments.get(4), (ExclusiveGateway) arguments.get(5));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_PROCESS_SEQUENCEFLOW_EXCLUSIVEGATEWAY_EXCLUSIVEGATEWAY:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (Step) arguments.get(4),
					(Flow) arguments.get(5), (SimpleBPMN.Process) arguments.get(6), (SequenceFlow) arguments.get(7),
					(ExclusiveGateway) arguments.get(8), (ExclusiveGateway) arguments.get(9));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
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
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_EXCLUSIVEGATEWAY_CHOICESTEP_GW2S_STEP_FLOW_NORMALSTEP_PROCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ExclusiveGateway) arguments.get(1),
					(ChoiceStep) arguments.get(2), (GW2S) arguments.get(3), (Step) arguments.get(4),
					(Flow) arguments.get(5), (NormalStep) arguments.get(6), (SimpleBPMN.Process) arguments.get(7));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.CHOICE_AFTER_MERGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_36__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_36((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_122__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_122((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_123__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_123((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_124__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_124((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_125__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_125((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_126__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_126((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_127__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_127((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_128__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_128((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_129__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_129((EMoflonEdge) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CHOICE_AFTER_MERGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_1_blackBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					return new Object[] { _this, match, prevNode, process, sf1, egw, ecgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_2_bindingFBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, prevNode, process, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, prevNode, process, sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_2_bindingAndBlackFBBBBBBB(ChoiceAfterMerge _this,
			Match match, ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterMerge_0_2_binding = pattern_ChoiceAfterMerge_0_2_bindingFBBBBBBB(_this,
				match, prevNode, process, sf1, egw, ecgw);
		if (result_pattern_ChoiceAfterMerge_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterMerge_0_2_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_0_2_black = pattern_ChoiceAfterMerge_0_2_blackB(csp);
			if (result_pattern_ChoiceAfterMerge_0_2_black != null) {

				return new Object[] { csp, _this, match, prevNode, process, sf1, egw, ecgw };
			}
		}
		return null;
	}

	public static final boolean pattern_ChoiceAfterMerge_0_3_expressionFBB(ChoiceAfterMerge _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_4_blackBBBBBB(Match match, ExclusiveGateway prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					return new Object[] { match, prevNode, process, sf1, egw, ecgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_4_greenBBBBBBFFFFFFFF(Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
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

	public static final Object[] pattern_ChoiceAfterMerge_0_5_blackBBBBBB(Match match, ExclusiveGateway prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					return new Object[] { match, prevNode, process, sf1, egw, ecgw };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_0_5_greenBBBF(Match match, ExclusiveGateway prevNode,
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

	public static final void pattern_ChoiceAfterMerge_0_6_expressionBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		_this.registerObjectsToMatch_FWD(match, prevNode, process, sf1, egw, ecgw);

	}

	public static final boolean pattern_ChoiceAfterMerge_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ChoiceAfterMerge_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_1_1_bindingFFFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("process");
		EObject _localVariable_6 = isApplicableMatch.getObject("sf1");
		EObject _localVariable_7 = isApplicableMatch.getObject("egw");
		EObject _localVariable_8 = isApplicableMatch.getObject("ecgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpChoiceStep = _localVariable_1;
		EObject tmpPn2cs = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpProcess = _localVariable_5;
		EObject tmpSf1 = _localVariable_6;
		EObject tmpEgw = _localVariable_7;
		EObject tmpEcgw = _localVariable_8;
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
							if (tmpProcess instanceof SimpleBPMN.Process) {
								SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
								if (tmpSf1 instanceof SequenceFlow) {
									SequenceFlow sf1 = (SequenceFlow) tmpSf1;
									if (tmpEgw instanceof ExclusiveGateway) {
										ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
										if (tmpEcgw instanceof ExclusiveGateway) {
											ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
											return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, process,
													sf1, egw, ecgw, isApplicableMatch };
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

	public static final Object[] pattern_ChoiceAfterMerge_1_1_blackBBBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw, ChoiceAfterMerge _this, IsApplicableMatch isApplicableMatch) {
		if (!choiceStep.equals(prevStep)) {
			if (!egw.equals(prevNode)) {
				if (!ecgw.equals(prevNode)) {
					if (!ecgw.equals(egw)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, process, sf1, egw,
										ecgw, _this, csp, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_1_1_bindingAndBlackFFFFFFFFFBFB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterMerge_1_1_binding = pattern_ChoiceAfterMerge_1_1_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterMerge_1_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterMerge_1_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_ChoiceAfterMerge_1_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_ChoiceAfterMerge_1_1_binding[2];
			Step prevStep = (Step) result_pattern_ChoiceAfterMerge_1_1_binding[3];
			Flow flow = (Flow) result_pattern_ChoiceAfterMerge_1_1_binding[4];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ChoiceAfterMerge_1_1_binding[5];
			SequenceFlow sf1 = (SequenceFlow) result_pattern_ChoiceAfterMerge_1_1_binding[6];
			ExclusiveGateway egw = (ExclusiveGateway) result_pattern_ChoiceAfterMerge_1_1_binding[7];
			ExclusiveGateway ecgw = (ExclusiveGateway) result_pattern_ChoiceAfterMerge_1_1_binding[8];

			Object[] result_pattern_ChoiceAfterMerge_1_1_black = pattern_ChoiceAfterMerge_1_1_blackBBBBBBBBBBFB(
					prevNode, choiceStep, pn2cs, prevStep, flow, process, sf1, egw, ecgw, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterMerge_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterMerge_1_1_black[10];

				return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, process, sf1, egw, ecgw, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_1_1_greenBBFBFBFB(Step prevStep, Flow flow,
			ExclusiveGateway egw, ExclusiveGateway ecgw, CSP csp) {
		NormalStep step = SimpleUseCaseFactory.eINSTANCE.createNormalStep();
		GW2S egwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		GW2S ecgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
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

	public static final Object[] pattern_ChoiceAfterMerge_1_3_blackBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep, EObject flow, EObject step,
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(process)) {
					if (!prevNode.equals(sf1)) {
						if (!choiceStep.equals(prevNode)) {
							if (!choiceStep.equals(pn2cs)) {
								if (!choiceStep.equals(prevStep)) {
									if (!choiceStep.equals(flow)) {
										if (!choiceStep.equals(step)) {
											if (!choiceStep.equals(process)) {
												if (!choiceStep.equals(sf1)) {
													if (!choiceStep.equals(egw)) {
														if (!choiceStep.equals(egwToStep)) {
															if (!choiceStep.equals(ecgw)) {
																if (!choiceStep.equals(ecgwToStep)) {
																	if (!pn2cs.equals(prevNode)) {
																		if (!pn2cs.equals(prevStep)) {
																			if (!pn2cs.equals(step)) {
																				if (!pn2cs.equals(process)) {
																					if (!pn2cs.equals(sf1)) {
																						if (!prevStep.equals(step)) {
																							if (!prevStep
																									.equals(process)) {
																								if (!prevStep
																										.equals(sf1)) {
																									if (!flow.equals(
																											prevNode)) {
																										if (!flow
																												.equals(pn2cs)) {
																											if (!flow
																													.equals(prevStep)) {
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
																																						prevStep)) {
																																					if (!egw.equals(
																																							flow)) {
																																						if (!egw.equals(
																																								step)) {
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

	public static final void pattern_ChoiceAfterMerge_1_5_expressionBBBBBBBBBBBBBB(ChoiceAfterMerge _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep,
			EObject flow, EObject step, EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		_this.registerObjects_FWD(ruleresult, prevNode, choiceStep, pn2cs, prevStep, flow, step, process, sf1, egw,
				egwToStep, ecgw, ecgwToStep);

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

	public static final Object[] pattern_ChoiceAfterMerge_2_2_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("prevNode");
		EObject _localVariable_1 = match.getObject("process");
		EObject _localVariable_2 = match.getObject("sf1");
		EObject _localVariable_3 = match.getObject("egw");
		EObject _localVariable_4 = match.getObject("ecgw");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpProcess = _localVariable_1;
		EObject tmpSf1 = _localVariable_2;
		EObject tmpEgw = _localVariable_3;
		EObject tmpEcgw = _localVariable_4;
		if (tmpPrevNode instanceof ExclusiveGateway) {
			ExclusiveGateway prevNode = (ExclusiveGateway) tmpPrevNode;
			if (tmpProcess instanceof SimpleBPMN.Process) {
				SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
				if (tmpSf1 instanceof SequenceFlow) {
					SequenceFlow sf1 = (SequenceFlow) tmpSf1;
					if (tmpEgw instanceof ExclusiveGateway) {
						ExclusiveGateway egw = (ExclusiveGateway) tmpEgw;
						if (tmpEcgw instanceof ExclusiveGateway) {
							ExclusiveGateway ecgw = (ExclusiveGateway) tmpEcgw;
							return new Object[] { prevNode, process, sf1, egw, ecgw, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_2_2_blackBFFBBBBB(ExclusiveGateway prevNode,
			SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw, ExclusiveGateway ecgw, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
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
										_result.add(new Object[] { prevNode, choiceStep, pn2cs, process, sf1, egw, ecgw,
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_2_3_blackBBBFFBBBB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					if (prevNode.equals(pn2cs.getSource())) {
						if (choiceStep.equals(pn2cs.getTarget())) {
							if (process.getFlowElements().contains(prevNode)) {
								if (process.getFlowElements().contains(sf1)) {
									if (process.getFlowElements().contains(egw)) {
										if (process.getFlowElements().contains(ecgw)) {
											if (prevNode.equals(sf1.getSourceRef())) {
												if (egw.equals(sf1.getTargetRef())) {
													if (ecgw.equals(egw.get__conv())) {
														Step prevStep = choiceStep.get__lastInDef();
														if (prevStep != null) {
															if (!choiceStep.equals(prevStep)) {
																boolean prevNodeisDiverging = prevNode.isIsDiverging();
																if (Boolean.valueOf(prevNodeisDiverging)
																		.equals(false)) {
																	boolean egwisDiverging = egw.isIsDiverging();
																	if (Boolean.valueOf(egwisDiverging)
																			.equals(Boolean.valueOf(true))) {
																		boolean ecgwisDiverging = ecgw.isIsDiverging();
																		if (Boolean.valueOf(ecgwisDiverging)
																				.equals(false)) {
																			for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							choiceStep, Flow.class,
																							"steps")) {
																				if (flow.getSteps()
																						.contains(prevStep)) {
																					_result.add(new Object[] { prevNode,
																							choiceStep, pn2cs, prevStep,
																							flow, process, sf1, egw,
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

	public static final Object[] pattern_ChoiceAfterMerge_2_3_greenBBBBBBBBBFFFFFFFFFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1,
			ExclusiveGateway egw, ExclusiveGateway ecgw) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge choiceStep__prevStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__sf1____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__egw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__ecgw____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__prevNode____sourceRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevNode__sf1____outgoing = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sf1__egw____targetRef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__sf1____incoming = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge egw__ecgw______conv = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String choiceStep__prevStep______lastInDef_name_prime = "__lastInDef";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__prevStep____steps_name_prime = "steps";
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
		isApplicableMatch.getAllContextElements().add(process);
		isApplicableMatch.getAllContextElements().add(sf1);
		isApplicableMatch.getAllContextElements().add(egw);
		isApplicableMatch.getAllContextElements().add(ecgw);
		choiceStep__prevStep______lastInDef.setSrc(choiceStep);
		choiceStep__prevStep______lastInDef.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(choiceStep__prevStep______lastInDef);
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
		choiceStep__prevStep______lastInDef.setName(choiceStep__prevStep______lastInDef_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		process__sf1____flowElements.setName(process__sf1____flowElements_name_prime);
		process__egw____flowElements.setName(process__egw____flowElements_name_prime);
		process__ecgw____flowElements.setName(process__ecgw____flowElements_name_prime);
		sf1__prevNode____sourceRef.setName(sf1__prevNode____sourceRef_name_prime);
		prevNode__sf1____outgoing.setName(prevNode__sf1____outgoing_name_prime);
		sf1__egw____targetRef.setName(sf1__egw____targetRef_name_prime);
		egw__sf1____incoming.setName(egw__sf1____incoming_name_prime);
		egw__ecgw______conv.setName(egw__ecgw______conv_name_prime);
		return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, process, sf1, egw, ecgw, isApplicableMatch,
				choiceStep__prevStep______lastInDef, pn2cs__prevNode____source, pn2cs__choiceStep____target,
				flow__choiceStep____steps, flow__prevStep____steps, process__prevNode____flowElements,
				process__sf1____flowElements, process__egw____flowElements, process__ecgw____flowElements,
				sf1__prevNode____sourceRef, prevNode__sf1____outgoing, sf1__egw____targetRef, egw__sf1____incoming,
				egw__ecgw______conv };
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_4_bindingFBBBBBBBBBBB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep,
				flow, process, sf1, egw, ecgw);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, process,
					sf1, egw, ecgw };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterMerge_2_4_bindingAndBlackFBBBBBBBBBBB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		Object[] result_pattern_ChoiceAfterMerge_2_4_binding = pattern_ChoiceAfterMerge_2_4_bindingFBBBBBBBBBBB(_this,
				isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, process, sf1, egw, ecgw);
		if (result_pattern_ChoiceAfterMerge_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterMerge_2_4_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_2_4_black = pattern_ChoiceAfterMerge_2_4_blackB(csp);
			if (result_pattern_ChoiceAfterMerge_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow,
						process, sf1, egw, ecgw };
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

	public static final Object[] pattern_ChoiceAfterMerge_10_5_greenBBBBFFF(Match match, ChoiceStep choiceStep,
			Step prevStep, Flow flow) {
		EMoflonEdge choiceStep__prevStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(choiceStep);
		match.getContextNodes().add(prevStep);
		match.getContextNodes().add(flow);
		String choiceStep__prevStep______lastInDef_name_prime = "__lastInDef";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__prevStep____steps_name_prime = "steps";
		choiceStep__prevStep______lastInDef.setSrc(choiceStep);
		choiceStep__prevStep______lastInDef.setTrg(prevStep);
		match.getContextEdges().add(choiceStep__prevStep______lastInDef);
		flow__choiceStep____steps.setSrc(flow);
		flow__choiceStep____steps.setTrg(choiceStep);
		match.getContextEdges().add(flow__choiceStep____steps);
		flow__prevStep____steps.setSrc(flow);
		flow__prevStep____steps.setTrg(prevStep);
		match.getContextEdges().add(flow__prevStep____steps);
		choiceStep__prevStep______lastInDef.setName(choiceStep__prevStep______lastInDef_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		return new Object[] { match, choiceStep, prevStep, flow, choiceStep__prevStep______lastInDef,
				flow__choiceStep____steps, flow__prevStep____steps };
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

	public static final Object[] pattern_ChoiceAfterMerge_11_1_bindingFFFFFFFB(IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("prevNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("choiceStep");
		EObject _localVariable_2 = isApplicableMatch.getObject("pn2cs");
		EObject _localVariable_3 = isApplicableMatch.getObject("prevStep");
		EObject _localVariable_4 = isApplicableMatch.getObject("flow");
		EObject _localVariable_5 = isApplicableMatch.getObject("step");
		EObject _localVariable_6 = isApplicableMatch.getObject("process");
		EObject tmpPrevNode = _localVariable_0;
		EObject tmpChoiceStep = _localVariable_1;
		EObject tmpPn2cs = _localVariable_2;
		EObject tmpPrevStep = _localVariable_3;
		EObject tmpFlow = _localVariable_4;
		EObject tmpStep = _localVariable_5;
		EObject tmpProcess = _localVariable_6;
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
								if (tmpProcess instanceof SimpleBPMN.Process) {
									SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
									return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, process,
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

	public static final Object[] pattern_ChoiceAfterMerge_11_1_blackBBBBBBBBFB(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, SimpleBPMN.Process process,
			ChoiceAfterMerge _this, IsApplicableMatch isApplicableMatch) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, process, _this, csp,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_11_1_bindingAndBlackFFFFFFFBFB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ChoiceAfterMerge_11_1_binding = pattern_ChoiceAfterMerge_11_1_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ChoiceAfterMerge_11_1_binding != null) {
			ExclusiveGateway prevNode = (ExclusiveGateway) result_pattern_ChoiceAfterMerge_11_1_binding[0];
			ChoiceStep choiceStep = (ChoiceStep) result_pattern_ChoiceAfterMerge_11_1_binding[1];
			GW2S pn2cs = (GW2S) result_pattern_ChoiceAfterMerge_11_1_binding[2];
			Step prevStep = (Step) result_pattern_ChoiceAfterMerge_11_1_binding[3];
			Flow flow = (Flow) result_pattern_ChoiceAfterMerge_11_1_binding[4];
			NormalStep step = (NormalStep) result_pattern_ChoiceAfterMerge_11_1_binding[5];
			SimpleBPMN.Process process = (SimpleBPMN.Process) result_pattern_ChoiceAfterMerge_11_1_binding[6];

			Object[] result_pattern_ChoiceAfterMerge_11_1_black = pattern_ChoiceAfterMerge_11_1_blackBBBBBBBBFB(
					prevNode, choiceStep, pn2cs, prevStep, flow, step, process, _this, isApplicableMatch);
			if (result_pattern_ChoiceAfterMerge_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ChoiceAfterMerge_11_1_black[8];

				return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, process, _this, csp,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_11_1_greenBBBFFFFFB(ExclusiveGateway prevNode,
			NormalStep step, SimpleBPMN.Process process, CSP csp) {
		SequenceFlow sf1 = SimpleBPMNFactory.eINSTANCE.createSequenceFlow();
		ExclusiveGateway egw = SimpleBPMNFactory.eINSTANCE.createExclusiveGateway();
		GW2S egwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
		ExclusiveGateway ecgw = SimpleBPMNFactory.eINSTANCE.createExclusiveGateway();
		GW2S ecgwToStep = Bpmn2UseCaseFactory.eINSTANCE.createGW2S();
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

	public static final Object[] pattern_ChoiceAfterMerge_11_3_blackBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep, EObject flow, EObject step,
			EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw, EObject ecgwToStep) {
		if (!prevNode.equals(prevStep)) {
			if (!prevNode.equals(step)) {
				if (!prevNode.equals(process)) {
					if (!prevNode.equals(sf1)) {
						if (!choiceStep.equals(prevNode)) {
							if (!choiceStep.equals(pn2cs)) {
								if (!choiceStep.equals(prevStep)) {
									if (!choiceStep.equals(flow)) {
										if (!choiceStep.equals(step)) {
											if (!choiceStep.equals(process)) {
												if (!choiceStep.equals(sf1)) {
													if (!choiceStep.equals(egw)) {
														if (!choiceStep.equals(egwToStep)) {
															if (!choiceStep.equals(ecgw)) {
																if (!choiceStep.equals(ecgwToStep)) {
																	if (!pn2cs.equals(prevNode)) {
																		if (!pn2cs.equals(prevStep)) {
																			if (!pn2cs.equals(step)) {
																				if (!pn2cs.equals(process)) {
																					if (!pn2cs.equals(sf1)) {
																						if (!prevStep.equals(step)) {
																							if (!prevStep
																									.equals(process)) {
																								if (!prevStep
																										.equals(sf1)) {
																									if (!flow.equals(
																											prevNode)) {
																										if (!flow
																												.equals(pn2cs)) {
																											if (!flow
																													.equals(prevStep)) {
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
																																						prevStep)) {
																																					if (!egw.equals(
																																							flow)) {
																																						if (!egw.equals(
																																								step)) {
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

	public static final void pattern_ChoiceAfterMerge_11_5_expressionBBBBBBBBBBBBBB(ChoiceAfterMerge _this,
			PerformRuleResult ruleresult, EObject prevNode, EObject choiceStep, EObject pn2cs, EObject prevStep,
			EObject flow, EObject step, EObject process, EObject sf1, EObject egw, EObject egwToStep, EObject ecgw,
			EObject ecgwToStep) {
		_this.registerObjects_BWD(ruleresult, prevNode, choiceStep, pn2cs, prevStep, flow, step, process, sf1, egw,
				egwToStep, ecgw, ecgwToStep);

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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_12_2_blackFBFBBBB(ChoiceStep choiceStep,
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
							_result.add(new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, match });
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_12_3_blackBBBBBBF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				if (prevStep.equals(choiceStep.get__lastInDef())) {
					if (prevNode.equals(pn2cs.getSource())) {
						if (choiceStep.equals(pn2cs.getTarget())) {
							if (step.equals(prevStep.getNext())) {
								if (flow.getSteps().contains(choiceStep)) {
									if (flow.getSteps().contains(prevStep)) {
										if (flow.getSteps().contains(step)) {
											boolean prevNodeisDiverging = prevNode.isIsDiverging();
											if (Boolean.valueOf(prevNodeisDiverging).equals(false)) {
												for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(prevNode, SimpleBPMN.Process.class,
																"flowElements")) {
													_result.add(new Object[] { prevNode, choiceStep, pn2cs, prevStep,
															flow, step, process });
												}
											}

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

	public static final Object[] pattern_ChoiceAfterMerge_12_3_greenBBBBBBBFFFFFFFFF(ExclusiveGateway prevNode,
			ChoiceStep choiceStep, GW2S pn2cs, Step prevStep, Flow flow, NormalStep step, SimpleBPMN.Process process) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge choiceStep__prevStep______lastInDef = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__prevNode____source = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pn2cs__choiceStep____target = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge prevStep__step____next = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__choiceStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__prevStep____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge flow__step____steps = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge process__prevNode____flowElements = TGGRuntimeFactory.eINSTANCE.createEMoflonEdge();
		String choiceStep__prevStep______lastInDef_name_prime = "__lastInDef";
		String pn2cs__prevNode____source_name_prime = "source";
		String pn2cs__choiceStep____target_name_prime = "target";
		String prevStep__step____next_name_prime = "next";
		String flow__choiceStep____steps_name_prime = "steps";
		String flow__prevStep____steps_name_prime = "steps";
		String flow__step____steps_name_prime = "steps";
		String process__prevNode____flowElements_name_prime = "flowElements";
		isApplicableMatch.getAllContextElements().add(prevNode);
		isApplicableMatch.getAllContextElements().add(choiceStep);
		isApplicableMatch.getAllContextElements().add(pn2cs);
		isApplicableMatch.getAllContextElements().add(prevStep);
		isApplicableMatch.getAllContextElements().add(flow);
		isApplicableMatch.getAllContextElements().add(step);
		isApplicableMatch.getAllContextElements().add(process);
		choiceStep__prevStep______lastInDef.setSrc(choiceStep);
		choiceStep__prevStep______lastInDef.setTrg(prevStep);
		isApplicableMatch.getAllContextElements().add(choiceStep__prevStep______lastInDef);
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
		process__prevNode____flowElements.setSrc(process);
		process__prevNode____flowElements.setTrg(prevNode);
		isApplicableMatch.getAllContextElements().add(process__prevNode____flowElements);
		choiceStep__prevStep______lastInDef.setName(choiceStep__prevStep______lastInDef_name_prime);
		pn2cs__prevNode____source.setName(pn2cs__prevNode____source_name_prime);
		pn2cs__choiceStep____target.setName(pn2cs__choiceStep____target_name_prime);
		prevStep__step____next.setName(prevStep__step____next_name_prime);
		flow__choiceStep____steps.setName(flow__choiceStep____steps_name_prime);
		flow__prevStep____steps.setName(flow__prevStep____steps_name_prime);
		flow__step____steps.setName(flow__step____steps_name_prime);
		process__prevNode____flowElements.setName(process__prevNode____flowElements_name_prime);
		return new Object[] { prevNode, choiceStep, pn2cs, prevStep, flow, step, process, isApplicableMatch,
				choiceStep__prevStep______lastInDef, pn2cs__prevNode____source, pn2cs__choiceStep____target,
				prevStep__step____next, flow__choiceStep____steps, flow__prevStep____steps, flow__step____steps,
				process__prevNode____flowElements };
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_4_bindingFBBBBBBBBB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, NormalStep step, SimpleBPMN.Process process) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep,
				flow, step, process);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step,
					process };
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ChoiceAfterMerge_12_4_bindingAndBlackFBBBBBBBBB(ChoiceAfterMerge _this,
			IsApplicableMatch isApplicableMatch, ExclusiveGateway prevNode, ChoiceStep choiceStep, GW2S pn2cs,
			Step prevStep, Flow flow, NormalStep step, SimpleBPMN.Process process) {
		Object[] result_pattern_ChoiceAfterMerge_12_4_binding = pattern_ChoiceAfterMerge_12_4_bindingFBBBBBBBBB(_this,
				isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step, process);
		if (result_pattern_ChoiceAfterMerge_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ChoiceAfterMerge_12_4_binding[0];

			Object[] result_pattern_ChoiceAfterMerge_12_4_black = pattern_ChoiceAfterMerge_12_4_blackB(csp);
			if (result_pattern_ChoiceAfterMerge_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, prevNode, choiceStep, pn2cs, prevStep, flow, step,
						process };
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
		for (Flow __DEC_step_steps_325999 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_325999)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_20_2_black_nac_1BBB(NormalStep step, ChoiceStep choiceStep,
			Step prevStep) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (Step __DEC_step_next_799035 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(step, Step.class, "next")) {
					if (!step.equals(__DEC_step_next_799035)) {
						if (!choiceStep.equals(__DEC_step_next_799035)) {
							if (!prevStep.equals(__DEC_step_next_799035)) {
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
						for (ChoiceStep choiceStep : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(prevStep, ChoiceStep.class, "__lastInDef")) {
							if (!choiceStep.equals(prevStep)) {
								if (pattern_ChoiceAfterMerge_20_2_black_nac_1BBB(step, choiceStep, prevStep) == null) {
									if (pattern_ChoiceAfterMerge_20_2_black_nac_2BB(choiceStep, step) == null) {
										for (Flow flow : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(prevStep, Flow.class, "steps")) {
											if (flow.getSteps().contains(choiceStep)) {
												if (flow.getSteps().contains(step)) {
													if (pattern_ChoiceAfterMerge_20_2_black_nac_0BB(step,
															flow) == null) {
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
		for (Flow __DEC_step_steps_221640 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(step,
				Flow.class, "steps")) {
			if (!flow.equals(__DEC_step_steps_221640)) {
				return new Object[] { step, flow };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_21_2_black_nac_1BBB(NormalStep step, ChoiceStep choiceStep,
			Step prevStep) {
		if (!choiceStep.equals(prevStep)) {
			if (!prevStep.equals(step)) {
				for (Step __DEC_step_next_63361 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(step, Step.class, "next")) {
					if (!step.equals(__DEC_step_next_63361)) {
						if (!choiceStep.equals(__DEC_step_next_63361)) {
							if (!prevStep.equals(__DEC_step_next_63361)) {
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
								Step prevStep = choiceStep.get__lastInDef();
								if (prevStep != null) {
									if (!choiceStep.equals(prevStep)) {
										if (!prevStep.equals(step)) {
											if (step.equals(prevStep.getNext())) {
												if (flow.getSteps().contains(prevStep)) {
													if (pattern_ChoiceAfterMerge_21_2_black_nac_2BB(choiceStep,
															step) == null) {
														if (pattern_ChoiceAfterMerge_21_2_black_nac_1BBB(step,
																choiceStep, prevStep) == null) {
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

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_320393 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_320393)) {
							if (!egw.equals(__DEC_sf1_default_320393)) {
								if (!ecgw.equals(__DEC_sf1_default_320393)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_818046 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_818046)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_944881 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_944881)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_505203 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_505203)) {
							if (!prevNode.equals(__DEC_egw___conv_505203)) {
								if (!ecgw.equals(__DEC_egw___conv_505203)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_710510 = ecgw.get__conv();
					if (__DEC_ecgw___conv_710510 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_710510)) {
							if (!prevNode.equals(__DEC_ecgw___conv_710510)) {
								if (!egw.equals(__DEC_ecgw___conv_710510)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_91738 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_91738)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_425925 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_425925)) {
							if (!prevNode.equals(__DEC_ecgw___conv_425925)) {
								if (!egw.equals(__DEC_ecgw___conv_425925)) {
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_22_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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
																						if (pattern_ChoiceAfterMerge_22_2_black_nac_0BBBB(
																								sf1, prevNode, egw,
																								ecgw) == null) {
																							if (pattern_ChoiceAfterMerge_22_2_black_nac_3BBB(
																									egw, prevNode,
																									ecgw) == null) {
																								if (pattern_ChoiceAfterMerge_22_2_black_nac_4BBB(
																										ecgw, prevNode,
																										egw) == null) {
																									if (pattern_ChoiceAfterMerge_22_2_black_nac_5BB(
																											ecgw,
																											process) == null) {
																										if (pattern_ChoiceAfterMerge_22_2_black_nac_6BBB(
																												ecgw,
																												prevNode,
																												egw) == null) {
																											if (pattern_ChoiceAfterMerge_22_2_black_nac_9BB(
																													ecgw,
																													sf1) == null) {
																												if (pattern_ChoiceAfterMerge_22_2_black_nac_11BB(
																														ecgw,
																														prevNode) == null) {
																													_result.add(
																															new Object[] {
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_22_3_expressionFBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
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

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_921553 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_921553)) {
							if (!egw.equals(__DEC_sf1_default_921553)) {
								if (!ecgw.equals(__DEC_sf1_default_921553)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_603715 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_603715)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_730645 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_730645)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_663464 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_663464)) {
							if (!prevNode.equals(__DEC_egw___conv_663464)) {
								if (!ecgw.equals(__DEC_egw___conv_663464)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_116911 = ecgw.get__conv();
					if (__DEC_ecgw___conv_116911 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_116911)) {
							if (!prevNode.equals(__DEC_ecgw___conv_116911)) {
								if (!egw.equals(__DEC_ecgw___conv_116911)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_39654 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_39654)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_286958 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_286958)) {
							if (!prevNode.equals(__DEC_ecgw___conv_286958)) {
								if (!egw.equals(__DEC_ecgw___conv_286958)) {
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_23_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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
																	if (pattern_ChoiceAfterMerge_23_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterMerge_23_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterMerge_23_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterMerge_23_2_black_nac_10BB(
																						prevNode, egw) == null) {
																					if (pattern_ChoiceAfterMerge_23_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
																						for (FlowElement tmpSf1 : process
																								.getFlowElements()) {
																							if (tmpSf1 instanceof SequenceFlow) {
																								SequenceFlow sf1 = (SequenceFlow) tmpSf1;
																								if (prevNode.equals(sf1
																										.getSourceRef())) {
																									if (egw.equals(sf1
																											.getTargetRef())) {
																										if (pattern_ChoiceAfterMerge_23_2_black_nac_0BBBB(
																												sf1,
																												prevNode,
																												egw,
																												ecgw) == null) {
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
																															_result.add(
																																	new Object[] {
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_23_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_23_3_expressionFBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
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

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_83787 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_83787)) {
							if (!egw.equals(__DEC_sf1_default_83787)) {
								if (!ecgw.equals(__DEC_sf1_default_83787)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_715914 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_715914)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_225902 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_225902)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_969854 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_969854)) {
							if (!prevNode.equals(__DEC_egw___conv_969854)) {
								if (!ecgw.equals(__DEC_egw___conv_969854)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_78694 = ecgw.get__conv();
					if (__DEC_ecgw___conv_78694 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_78694)) {
							if (!prevNode.equals(__DEC_ecgw___conv_78694)) {
								if (!egw.equals(__DEC_ecgw___conv_78694)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_886106 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_886106)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_411345 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_411345)) {
							if (!prevNode.equals(__DEC_ecgw___conv_411345)) {
								if (!egw.equals(__DEC_ecgw___conv_411345)) {
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_24_2_blackFFFFFB(EMoflonEdge _edge_flowElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpProcess = _edge_flowElements.getSrc();
		if (tmpProcess instanceof SimpleBPMN.Process) {
			SimpleBPMN.Process process = (SimpleBPMN.Process) tmpProcess;
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
																								if (pattern_ChoiceAfterMerge_24_2_black_nac_0BBBB(
																										sf1, prevNode,
																										egw,
																										ecgw) == null) {
																									if (pattern_ChoiceAfterMerge_24_2_black_nac_2BB(
																											egw,
																											process) == null) {
																										if (pattern_ChoiceAfterMerge_24_2_black_nac_3BBB(
																												egw,
																												prevNode,
																												ecgw) == null) {
																											if (pattern_ChoiceAfterMerge_24_2_black_nac_4BBB(
																													ecgw,
																													prevNode,
																													egw) == null) {
																												if (pattern_ChoiceAfterMerge_24_2_black_nac_6BBB(
																														ecgw,
																														prevNode,
																														egw) == null) {
																													if (pattern_ChoiceAfterMerge_24_2_black_nac_8BB(
																															egw,
																															sf1) == null) {
																														if (pattern_ChoiceAfterMerge_24_2_black_nac_10BB(
																																prevNode,
																																egw) == null) {
																															_result.add(
																																	new Object[] {
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_24_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_24_3_expressionFBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
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

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_382369 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_382369)) {
							if (!egw.equals(__DEC_sf1_default_382369)) {
								if (!ecgw.equals(__DEC_sf1_default_382369)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_464466 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_464466)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_684567 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_684567)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_337247 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_337247)) {
							if (!prevNode.equals(__DEC_egw___conv_337247)) {
								if (!ecgw.equals(__DEC_egw___conv_337247)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_804998 = ecgw.get__conv();
					if (__DEC_ecgw___conv_804998 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_804998)) {
							if (!prevNode.equals(__DEC_ecgw___conv_804998)) {
								if (!egw.equals(__DEC_ecgw___conv_804998)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_958607 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_958607)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_761092 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_761092)) {
							if (!prevNode.equals(__DEC_ecgw___conv_761092)) {
								if (!egw.equals(__DEC_ecgw___conv_761092)) {
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_25_2_blackFFFFFB(EMoflonEdge _edge_sourceRef) {
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
																if (pattern_ChoiceAfterMerge_25_2_black_nac_0BBBB(sf1,
																		prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterMerge_25_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterMerge_25_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterMerge_25_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterMerge_25_2_black_nac_9BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterMerge_25_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
																						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										sf1,
																										SimpleBPMN.Process.class,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_25_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_25_3_expressionFBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
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

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_902270 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_902270)) {
							if (!egw.equals(__DEC_sf1_default_902270)) {
								if (!ecgw.equals(__DEC_sf1_default_902270)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_661547 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_661547)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_357979 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_357979)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_276601 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_276601)) {
							if (!prevNode.equals(__DEC_egw___conv_276601)) {
								if (!ecgw.equals(__DEC_egw___conv_276601)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_405246 = ecgw.get__conv();
					if (__DEC_ecgw___conv_405246 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_405246)) {
							if (!prevNode.equals(__DEC_ecgw___conv_405246)) {
								if (!egw.equals(__DEC_ecgw___conv_405246)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_694357 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_694357)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_220119 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_220119)) {
							if (!prevNode.equals(__DEC_ecgw___conv_220119)) {
								if (!egw.equals(__DEC_ecgw___conv_220119)) {
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_26_2_blackFFFFFB(EMoflonEdge _edge_outgoing) {
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
																if (pattern_ChoiceAfterMerge_26_2_black_nac_0BBBB(sf1,
																		prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterMerge_26_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterMerge_26_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterMerge_26_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterMerge_26_2_black_nac_9BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterMerge_26_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
																						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										prevNode,
																										SimpleBPMN.Process.class,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_26_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_26_3_expressionFBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
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

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_802669 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_802669)) {
							if (!egw.equals(__DEC_sf1_default_802669)) {
								if (!ecgw.equals(__DEC_sf1_default_802669)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_488292 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_488292)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_548912 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_548912)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_498945 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_498945)) {
							if (!prevNode.equals(__DEC_egw___conv_498945)) {
								if (!ecgw.equals(__DEC_egw___conv_498945)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_656564 = ecgw.get__conv();
					if (__DEC_ecgw___conv_656564 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_656564)) {
							if (!prevNode.equals(__DEC_ecgw___conv_656564)) {
								if (!egw.equals(__DEC_ecgw___conv_656564)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_692888 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_692888)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_921871 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_921871)) {
							if (!prevNode.equals(__DEC_ecgw___conv_921871)) {
								if (!egw.equals(__DEC_ecgw___conv_921871)) {
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_27_2_blackFFFFFB(EMoflonEdge _edge_targetRef) {
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
																if (pattern_ChoiceAfterMerge_27_2_black_nac_0BBBB(sf1,
																		prevNode, egw, ecgw) == null) {
																	if (pattern_ChoiceAfterMerge_27_2_black_nac_3BBB(
																			egw, prevNode, ecgw) == null) {
																		if (pattern_ChoiceAfterMerge_27_2_black_nac_4BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterMerge_27_2_black_nac_6BBB(
																					ecgw, prevNode, egw) == null) {
																				if (pattern_ChoiceAfterMerge_27_2_black_nac_9BB(
																						ecgw, sf1) == null) {
																					if (pattern_ChoiceAfterMerge_27_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
																						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										sf1,
																										SimpleBPMN.Process.class,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_27_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_27_3_expressionFBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
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

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_766707 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_766707)) {
							if (!egw.equals(__DEC_sf1_default_766707)) {
								if (!ecgw.equals(__DEC_sf1_default_766707)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_595886 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_595886)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_362853 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_362853)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_162000 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_162000)) {
							if (!prevNode.equals(__DEC_egw___conv_162000)) {
								if (!ecgw.equals(__DEC_egw___conv_162000)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_365970 = ecgw.get__conv();
					if (__DEC_ecgw___conv_365970 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_365970)) {
							if (!prevNode.equals(__DEC_ecgw___conv_365970)) {
								if (!egw.equals(__DEC_ecgw___conv_365970)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_47889 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_47889)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_480651 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_480651)) {
							if (!prevNode.equals(__DEC_ecgw___conv_480651)) {
								if (!egw.equals(__DEC_ecgw___conv_480651)) {
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_28_2_blackFFFFFB(EMoflonEdge _edge_incoming) {
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
															if (pattern_ChoiceAfterMerge_28_2_black_nac_0BBBB(sf1,
																	prevNode, egw, ecgw) == null) {
																if (pattern_ChoiceAfterMerge_28_2_black_nac_3BBB(egw,
																		prevNode, ecgw) == null) {
																	if (pattern_ChoiceAfterMerge_28_2_black_nac_4BBB(
																			ecgw, prevNode, egw) == null) {
																		if (pattern_ChoiceAfterMerge_28_2_black_nac_6BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterMerge_28_2_black_nac_7BB(
																					prevNode, sf1) == null) {
																				if (pattern_ChoiceAfterMerge_28_2_black_nac_10BB(
																						prevNode, egw) == null) {
																					if (pattern_ChoiceAfterMerge_28_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
																						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										egw,
																										SimpleBPMN.Process.class,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_28_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_28_3_expressionFBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
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

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_0BBBB(SequenceFlow sf1,
			ExclusiveGateway prevNode, ExclusiveGateway egw, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(prevNode)) {
				if (!ecgw.equals(egw)) {
					for (ExclusiveGateway __DEC_sf1_default_230011 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sf1, ExclusiveGateway.class, "default")) {
						if (!prevNode.equals(__DEC_sf1_default_230011)) {
							if (!egw.equals(__DEC_sf1_default_230011)) {
								if (!ecgw.equals(__DEC_sf1_default_230011)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_1BB(SequenceFlow sf1,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_sf1_flowElements_78585 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sf1, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_sf1_flowElements_78585)) {
				return new Object[] { sf1, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_2BB(ExclusiveGateway egw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_egw_flowElements_80800 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(egw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_egw_flowElements_80800)) {
				return new Object[] { egw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_3BBB(ExclusiveGateway egw,
			ExclusiveGateway prevNode, ExclusiveGateway ecgw) {
		if (!egw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!ecgw.equals(prevNode)) {
					for (Gateway __DEC_egw___conv_907297 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(egw, Gateway.class, "__conv")) {
						if (!egw.equals(__DEC_egw___conv_907297)) {
							if (!prevNode.equals(__DEC_egw___conv_907297)) {
								if (!ecgw.equals(__DEC_egw___conv_907297)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_4BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					Gateway __DEC_ecgw___conv_221214 = ecgw.get__conv();
					if (__DEC_ecgw___conv_221214 != null) {
						if (!ecgw.equals(__DEC_ecgw___conv_221214)) {
							if (!prevNode.equals(__DEC_ecgw___conv_221214)) {
								if (!egw.equals(__DEC_ecgw___conv_221214)) {
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

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_5BB(ExclusiveGateway ecgw,
			SimpleBPMN.Process process) {
		for (SimpleBPMN.Process __DEC_ecgw_flowElements_672975 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(ecgw, SimpleBPMN.Process.class, "flowElements")) {
			if (!process.equals(__DEC_ecgw_flowElements_672975)) {
				return new Object[] { ecgw, process };
			}
		}
		return null;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_black_nac_6BBB(ExclusiveGateway ecgw,
			ExclusiveGateway prevNode, ExclusiveGateway egw) {
		if (!ecgw.equals(prevNode)) {
			if (!ecgw.equals(egw)) {
				if (!egw.equals(prevNode)) {
					for (Gateway __DEC_ecgw___conv_137899 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(ecgw, Gateway.class, "__conv")) {
						if (!ecgw.equals(__DEC_ecgw___conv_137899)) {
							if (!prevNode.equals(__DEC_ecgw___conv_137899)) {
								if (!egw.equals(__DEC_ecgw___conv_137899)) {
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

	public static final Iterable<Object[]> pattern_ChoiceAfterMerge_29_2_blackFFFFFB(EMoflonEdge _edge___conv) {
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
															if (pattern_ChoiceAfterMerge_29_2_black_nac_0BBBB(sf1,
																	prevNode, egw, ecgw) == null) {
																if (pattern_ChoiceAfterMerge_29_2_black_nac_3BBB(egw,
																		prevNode, ecgw) == null) {
																	if (pattern_ChoiceAfterMerge_29_2_black_nac_4BBB(
																			ecgw, prevNode, egw) == null) {
																		if (pattern_ChoiceAfterMerge_29_2_black_nac_6BBB(
																				ecgw, prevNode, egw) == null) {
																			if (pattern_ChoiceAfterMerge_29_2_black_nac_7BB(
																					prevNode, sf1) == null) {
																				if (pattern_ChoiceAfterMerge_29_2_black_nac_10BB(
																						prevNode, egw) == null) {
																					if (pattern_ChoiceAfterMerge_29_2_black_nac_11BB(
																							ecgw, prevNode) == null) {
																						for (SimpleBPMN.Process process : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										egw,
																										SimpleBPMN.Process.class,
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

		return _result;
	}

	public static final Object[] pattern_ChoiceAfterMerge_29_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ChoiceAfterMerge_29_3_expressionFBBBBBBB(ChoiceAfterMerge _this, Match match,
			ExclusiveGateway prevNode, SimpleBPMN.Process process, SequenceFlow sf1, ExclusiveGateway egw,
			ExclusiveGateway ecgw) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, prevNode, process, sf1, egw, ecgw);
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
